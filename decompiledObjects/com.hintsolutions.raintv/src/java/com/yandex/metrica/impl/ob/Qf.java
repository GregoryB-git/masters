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

public final class qf
extends MessageNano {
    public a a;
    public a[] b;

    public qf() {
        this.a();
    }

    public qf a() {
        this.a = null;
        this.b = com.yandex.metrica.impl.ob.qf$a.b();
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int n2 = super.computeSerializedSize();
        Object object = this.a;
        int n5 = n2;
        if (object != null) {
            n5 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)1, (MessageNano)object);
        }
        object = this.b;
        int n6 = n5;
        if (object != null) {
            n6 = n5;
            if (((a[])object).length > 0) {
                n2 = 0;
                while (true) {
                    object = this.b;
                    n6 = n5;
                    if (n2 >= ((a[])object).length) break;
                    object = object[n2];
                    n6 = n5;
                    if (object != null) {
                        n6 = n5 + CodedOutputByteBufferNano.computeMessageSize((int)2, (MessageNano)object);
                    }
                    ++n2;
                    n5 = n6;
                }
            }
        }
        return n6;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n2;
        while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
            if (n2 != 10) {
                if (n2 != 18) {
                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                    break;
                }
                int n5 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)18);
                Object object = this.b;
                n2 = object == null ? 0 : ((a[])object).length;
                int n6 = n5 + n2;
                a[] aArray = new a[n6];
                n5 = n2;
                if (n2 != 0) {
                    System.arraycopy((Object)object, (int)0, (Object)aArray, (int)0, (int)n2);
                    n5 = n2;
                }
                while (n5 < n6 - 1) {
                    aArray[n5] = object = new a();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    codedInputByteBufferNano.readTag();
                    ++n5;
                }
                aArray[n5] = object = new a();
                codedInputByteBufferNano.readMessage((MessageNano)object);
                this.b = aArray;
                continue;
            }
            if (this.a == null) {
                this.a = new a();
            }
            codedInputByteBufferNano.readMessage((MessageNano)this.a);
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Object object = this.a;
        if (object != null) {
            codedOutputByteBufferNano.writeMessage(1, (MessageNano)object);
        }
        if ((object = this.b) != null && ((a[])object).length > 0) {
            for (int i2 = 0; i2 < ((a[])(object = this.b)).length; ++i2) {
                if ((object = object[i2]) == null) continue;
                codedOutputByteBufferNano.writeMessage(2, (MessageNano)object);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static final class a
    extends MessageNano {
        private static volatile a[] c;
        public b a;
        public int b;

        public a() {
            this.a();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public static a[] b() {
            Object object;
            if (c != null) return c;
            Object object2 = object = InternalNano.LAZY_INIT_LOCK;
            synchronized (object2) {
                if (c != null) return c;
                c = new a[0];
                return c;
            }
        }

        public a a() {
            this.a = null;
            this.b = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            b b4 = this.a;
            int n5 = n2;
            if (b4 != null) {
                n5 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)1, (MessageNano)b4);
            }
            int n6 = this.b;
            n2 = n5;
            if (n6 != 0) {
                n2 = n5 + CodedOutputByteBufferNano.computeInt32Size((int)2, (int)n6);
            }
            return n2;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 10) {
                    if (n2 != 16) {
                        if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                        break;
                    }
                    n2 = codedInputByteBufferNano.readInt32();
                    if (n2 != 0 && n2 != 1 && n2 != 2 && n2 != 3) continue;
                    this.b = n2;
                    continue;
                }
                if (this.a == null) {
                    this.a = new b();
                }
                codedInputByteBufferNano.readMessage((MessageNano)this.a);
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int n2;
            b b4 = this.a;
            if (b4 != null) {
                codedOutputByteBufferNano.writeMessage(1, (MessageNano)b4);
            }
            if ((n2 = this.b) != 0) {
                codedOutputByteBufferNano.writeInt32(2, n2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class b
    extends MessageNano {
        public a[] a;

        public b() {
            this.a();
        }

        public b a() {
            this.a = a.b();
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            Object object = this.a;
            int n5 = n2;
            if (object != null) {
                n5 = n2;
                if (((a[])object).length > 0) {
                    int n6 = 0;
                    while (true) {
                        object = this.a;
                        n5 = n2;
                        if (n6 >= ((a[])object).length) break;
                        object = object[n6];
                        n5 = n2;
                        if (object != null) {
                            n5 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)1, (MessageNano)object);
                        }
                        ++n6;
                        n2 = n5;
                    }
                }
            }
            return n5;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 10) {
                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                    break;
                }
                int n5 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)10);
                Object object = this.a;
                n2 = object == null ? 0 : ((a[])object).length;
                int n6 = n5 + n2;
                a[] aArray = new a[n6];
                n5 = n2;
                if (n2 != 0) {
                    System.arraycopy((Object)object, (int)0, (Object)aArray, (int)0, (int)n2);
                    n5 = n2;
                }
                while (n5 < n6 - 1) {
                    aArray[n5] = object = new a();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    codedInputByteBufferNano.readTag();
                    ++n5;
                }
                aArray[n5] = object = new a();
                codedInputByteBufferNano.readMessage((MessageNano)object);
                this.a = aArray;
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Object object = this.a;
            if (object != null && ((a[])object).length > 0) {
                for (int i2 = 0; i2 < ((a[])(object = this.a)).length; ++i2) {
                    if ((object = object[i2]) == null) continue;
                    codedOutputByteBufferNano.writeMessage(1, (MessageNano)object);
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static final class a
        extends MessageNano {
            private static volatile a[] c;
            public String a;
            public String b;

            public a() {
                this.a();
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public static a[] b() {
                Object object;
                if (c != null) return c;
                Object object2 = object = InternalNano.LAZY_INIT_LOCK;
                synchronized (object2) {
                    if (c != null) return c;
                    c = new a[0];
                    return c;
                }
            }

            public a a() {
                this.a = "";
                this.b = "";
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int n2;
                int n5 = n2 = super.computeSerializedSize();
                if (!this.a.equals((Object)"")) {
                    n5 = n2 + CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a);
                }
                n2 = n5;
                if (!this.b.equals((Object)"")) {
                    n2 = n5 + CodedOutputByteBufferNano.computeStringSize((int)2, (String)this.b);
                }
                return n2;
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                int n2;
                while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                    if (n2 != 10) {
                        if (n2 != 18) {
                            if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                            break;
                        }
                        this.b = codedInputByteBufferNano.readString();
                        continue;
                    }
                    this.a = codedInputByteBufferNano.readString();
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                if (!this.a.equals((Object)"")) {
                    codedOutputByteBufferNano.writeString(1, this.a);
                }
                if (!this.b.equals((Object)"")) {
                    codedOutputByteBufferNano.writeString(2, this.b);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }
    }
}

