/**
 *  Copyright 2005-2014 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package io.fabric8.gateway.handlers.detecting.protocol.openwire.command;

/**
 * 
 * @openwire:marshaller code="7"
 * @version $Revision: 1.10 $
 */
public class TransactionInfo extends BaseCommand {

    public static final byte DATA_STRUCTURE_TYPE = CommandTypes.TRANSACTION_INFO;

    public static final byte BEGIN = 0;
    public static final byte PREPARE = 1;
    public static final byte COMMIT_ONE_PHASE = 2;
    public static final byte COMMIT_TWO_PHASE = 3;
    public static final byte ROLLBACK = 4;
    public static final byte RECOVER = 5;
    public static final byte FORGET = 6;
    public static final byte END = 7;

    protected byte type;
    protected ConnectionId connectionId;
    protected TransactionId transactionId;

    public TransactionInfo() {
    }

    public TransactionInfo(ConnectionId connectionId, TransactionId transactionId, byte type) {
        this.connectionId = connectionId;
        this.transactionId = transactionId;
        this.type = type;
    }

    public byte getDataStructureType() {
        return DATA_STRUCTURE_TYPE;
    }

    /**
     * @openwire:property version=1 cache=true
     */
    public ConnectionId getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(ConnectionId connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * @openwire:property version=1 cache=true
     */
    public TransactionId getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(TransactionId transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * @openwire:property version=1
     */
    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

}
