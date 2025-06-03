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

public final class vf
extends MessageNano {
    public a a;
    public boolean b;

    public vf() {
        this.a();
    }

    public vf a() {
        this.a = null;
        this.b = false;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int n2 = super.computeSerializedSize();
        a a2 = this.a;
        int n6 = n2;
        if (a2 != null) {
            n6 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)1, (MessageNano)a2);
        }
        boolean bl2 = this.b;
        n2 = n6;
        if (bl2) {
            n2 = n6 + CodedOutputByteBufferNano.computeBoolSize((int)2, (boolean)bl2);
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
                this.b = codedInputByteBufferNano.readBool();
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
        boolean bl2;
        a a2 = this.a;
        if (a2 != null) {
            codedOutputByteBufferNano.writeMessage(1, (MessageNano)a2);
        }
        if (bl2 = this.b) {
            codedOutputByteBufferNano.writeBool(2, bl2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static final class com.yandex.metrica.impl.ob.vf$a
    extends MessageNano {
        public a[] a;

        public com.yandex.metrica.impl.ob.vf$a() {
            this.a();
        }

        public com.yandex.metrica.impl.ob.vf$a a() {
            this.a = a.b();
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            Object object = this.a;
            int n6 = n2;
            if (object != null) {
                n6 = n2;
                if (((a[])object).length > 0) {
                    int n9 = 0;
                    while (true) {
                        object = this.a;
                        n6 = n2;
                        if (n9 >= ((a[])object).length) break;
                        object = object[n9];
                        n6 = n2;
                        if (object != null) {
                            n6 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)1, (MessageNano)object);
                        }
                        ++n9;
                        n2 = n6;
                    }
                }
            }
            return n6;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 10) {
                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                    break;
                }
                int n6 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)10);
                Object object = this.a;
                n2 = object == null ? 0 : ((a[])object).length;
                int n9 = n6 + n2;
                a[] aArray = new a[n9];
                n6 = n2;
                if (n2 != 0) {
                    System.arraycopy((Object)object, (int)0, (Object)aArray, (int)0, (int)n2);
                    n6 = n2;
                }
                while (n6 < n9 - 1) {
                    aArray[n6] = object = new a();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    codedInputByteBufferNano.readTag();
                    ++n6;
                }
                aArray[n6] = object = new a();
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
                int n6 = super.computeSerializedSize();
                n6 = n2 = CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a) + n6;
                if (!this.b.equals((Object)"")) {
                    n6 = n2 + CodedOutputByteBufferNano.computeStringSize((int)2, (String)this.b);
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
                        this.b = codedInputByteBufferNano.readString();
                        continue;
                    }
                    this.a = codedInputByteBufferNano.readString();
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                codedOutputByteBufferNano.writeString(1, this.a);
                if (!this.b.equals((Object)"")) {
                    codedOutputByteBufferNano.writeString(2, this.b);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }
    }
}

