/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.nano.ym.CodedInputByteBufferNano
 *  com.google.protobuf.nano.ym.CodedOutputByteBufferNano
 *  com.google.protobuf.nano.ym.InternalNano
 *  com.google.protobuf.nano.ym.MessageNano
 *  com.google.protobuf.nano.ym.WireFormatNano
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;

public final class of
extends MessageNano {
    public b[] a;
    public a b;
    public String[] c;

    public of() {
        this.a();
    }

    public of a() {
        this.a = com.yandex.metrica.impl.ob.of$b.b();
        this.b = null;
        this.c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int n2;
        int n3 = super.computeSerializedSize();
        Object object = this.a;
        int n5 = 0;
        int n6 = n3;
        if (object != null) {
            n6 = n3;
            if (((b[])object).length > 0) {
                n2 = 0;
                while (true) {
                    object = this.a;
                    n6 = n3;
                    if (n2 >= ((b[])object).length) break;
                    object = object[n2];
                    n6 = n3;
                    if (object != null) {
                        n6 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)1, (MessageNano)object);
                    }
                    ++n2;
                    n3 = n6;
                }
            }
        }
        object = this.b;
        n3 = n6;
        if (object != null) {
            n3 = n6 + CodedOutputByteBufferNano.computeMessageSize((int)2, (MessageNano)object);
        }
        object = this.c;
        n6 = n3;
        if (object != null) {
            n6 = n3;
            if (((b[])object).length > 0) {
                n2 = 0;
                int n9 = 0;
                for (n6 = n5; n6 < ((b[])(object = this.c)).length; ++n6) {
                    object = object[n6];
                    int n10 = n2;
                    n5 = n9;
                    if (object != null) {
                        n5 = n9 + 1;
                        n10 = CodedOutputByteBufferNano.computeStringSizeNoTag((String)object) + n2;
                    }
                    n2 = n10;
                    n9 = n5;
                }
                n6 = n3 + n2 + n9 * 1;
            }
        }
        return n6;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n2;
        while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
            Object object;
            int n3;
            Object[] objectArray;
            int n5;
            if (n2 != 10) {
                if (n2 != 18) {
                    if (n2 != 26) {
                        if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                        break;
                    }
                    n5 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)26);
                    objectArray = this.c;
                    n2 = objectArray == null ? 0 : objectArray.length;
                    n3 = n5 + n2;
                    object = new String[n3];
                    n5 = n2;
                    if (n2 != 0) {
                        System.arraycopy((Object)objectArray, (int)0, (Object)object, (int)0, (int)n2);
                        n5 = n2;
                    }
                    while (n5 < n3 - 1) {
                        object[n5] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        ++n5;
                    }
                    object[n5] = codedInputByteBufferNano.readString();
                    this.c = object;
                    continue;
                }
                if (this.b == null) {
                    this.b = new a();
                }
                codedInputByteBufferNano.readMessage((MessageNano)this.b);
                continue;
            }
            n5 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)10);
            object = this.a;
            n2 = object == null ? 0 : ((b[])object).length;
            n3 = n5 + n2;
            objectArray = new b[n3];
            n5 = n2;
            if (n2 != 0) {
                System.arraycopy((Object)object, (int)0, (Object)objectArray, (int)0, (int)n2);
                n5 = n2;
            }
            while (n5 < n3 - 1) {
                objectArray[n5] = object = new b();
                codedInputByteBufferNano.readMessage((MessageNano)object);
                codedInputByteBufferNano.readTag();
                ++n5;
            }
            objectArray[n5] = object = new b();
            codedInputByteBufferNano.readMessage((MessageNano)object);
            this.a = objectArray;
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int n2;
        Object object = this.a;
        int n3 = 0;
        if (object != null && ((b[])object).length > 0) {
            for (n2 = 0; n2 < ((b[])(object = this.a)).length; ++n2) {
                if ((object = object[n2]) == null) continue;
                codedOutputByteBufferNano.writeMessage(1, (MessageNano)object);
            }
        }
        if ((object = this.b) != null) {
            codedOutputByteBufferNano.writeMessage(2, (MessageNano)object);
        }
        if ((object = this.c) != null && ((b[])object).length > 0) {
            for (n2 = n3; n2 < ((b[])(object = this.c)).length; ++n2) {
                if ((object = object[n2]) == null) continue;
                codedOutputByteBufferNano.writeString(3, (String)object);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static final class a
    extends MessageNano {
        public int a;
        public int b;

        public a() {
            this.a();
        }

        public a a() {
            this.a = 0;
            this.b = -1;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            int n3 = CodedOutputByteBufferNano.computeInt32Size((int)2, (int)this.a);
            return CodedOutputByteBufferNano.computeInt32Size((int)3, (int)this.b) + (n3 + n2);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 16) {
                    if (n2 != 24) {
                        if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                        break;
                    }
                    n2 = codedInputByteBufferNano.readInt32();
                    if (n2 != -1 && n2 != 0 && n2 != 1) continue;
                    this.b = n2;
                    continue;
                }
                n2 = codedInputByteBufferNano.readInt32();
                if (n2 != 0 && n2 != 1 && n2 != 2 && n2 != 3 && n2 != 4 && n2 != 5) continue;
                this.a = n2;
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt32(2, this.a);
            codedOutputByteBufferNano.writeInt32(3, this.b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class b
    extends MessageNano {
        private static volatile b[] c;
        public String a;
        public boolean b;

        public b() {
            this.a();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public static b[] b() {
            Object object;
            if (c != null) return c;
            Object object2 = object = InternalNano.LAZY_INIT_LOCK;
            synchronized (object2) {
                if (c != null) return c;
                c = new b[0];
                return c;
            }
        }

        public b a() {
            this.a = "";
            this.b = false;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            int n3 = CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a);
            return CodedOutputByteBufferNano.computeBoolSize((int)2, (boolean)this.b) + (n3 + n2);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 10) {
                    if (n2 != 16) {
                        if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                        break;
                    }
                    this.b = codedInputByteBufferNano.readBool();
                    continue;
                }
                this.a = codedInputByteBufferNano.readString();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeString(1, this.a);
            codedOutputByteBufferNano.writeBool(2, this.b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }
}

