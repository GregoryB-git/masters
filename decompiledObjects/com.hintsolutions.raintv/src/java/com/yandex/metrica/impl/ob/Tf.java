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

public final class tf
extends MessageNano {
    public a a;
    public b[] b;

    public tf() {
        this.a();
    }

    public tf a() {
        this.a = null;
        this.b = com.yandex.metrica.impl.ob.tf$b.b();
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int n2 = super.computeSerializedSize();
        Object object = this.a;
        int n6 = n2;
        if (object != null) {
            n6 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)1, (MessageNano)object);
        }
        object = this.b;
        int n9 = n6;
        if (object != null) {
            n9 = n6;
            if (((b[])object).length > 0) {
                n2 = 0;
                while (true) {
                    object = this.b;
                    n9 = n6;
                    if (n2 >= ((b[])object).length) break;
                    object = object[n2];
                    n9 = n6;
                    if (object != null) {
                        n9 = n6 + CodedOutputByteBufferNano.computeMessageSize((int)2, (MessageNano)object);
                    }
                    ++n2;
                    n6 = n9;
                }
            }
        }
        return n9;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n2;
        while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
            if (n2 != 10) {
                if (n2 != 18) {
                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                    break;
                }
                int n6 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)18);
                Object object = this.b;
                n2 = object == null ? 0 : ((b[])object).length;
                int n9 = n6 + n2;
                b[] bArray = new b[n9];
                n6 = n2;
                if (n2 != 0) {
                    System.arraycopy((Object)object, (int)0, (Object)bArray, (int)0, (int)n2);
                    n6 = n2;
                }
                while (n6 < n9 - 1) {
                    bArray[n6] = object = new b();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    codedInputByteBufferNano.readTag();
                    ++n6;
                }
                bArray[n6] = object = new b();
                codedInputByteBufferNano.readMessage((MessageNano)object);
                this.b = bArray;
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
        if ((object = this.b) != null && ((b[])object).length > 0) {
            for (int i2 = 0; i2 < ((b[])(object = this.b)).length; ++i2) {
                if ((object = object[i2]) == null) continue;
                codedOutputByteBufferNano.writeMessage(2, (MessageNano)object);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static final class a
    extends MessageNano {
        public String a;
        public String b;
        public boolean c;
        public boolean d;
        public int e;

        public a() {
            this.a();
        }

        public a a() {
            this.a = "";
            this.b = "";
            this.c = false;
            this.d = false;
            this.e = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2;
            int n6 = n2 = super.computeSerializedSize();
            if (!this.a.equals((Object)"")) {
                n6 = n2 + CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a);
            }
            n2 = n6;
            if (!this.b.equals((Object)"")) {
                n2 = n6 + CodedOutputByteBufferNano.computeStringSize((int)2, (String)this.b);
            }
            boolean bl2 = this.c;
            n6 = n2;
            if (bl2) {
                n6 = n2 + CodedOutputByteBufferNano.computeBoolSize((int)3, (boolean)bl2);
            }
            bl2 = this.d;
            n2 = n6;
            if (bl2) {
                n2 = n6 + CodedOutputByteBufferNano.computeBoolSize((int)4, (boolean)bl2);
            }
            return CodedOutputByteBufferNano.computeInt32Size((int)5, (int)this.e) + n2;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 10) {
                    if (n2 != 18) {
                        if (n2 != 24) {
                            if (n2 != 32) {
                                if (n2 != 40) {
                                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                    break;
                                }
                                n2 = codedInputByteBufferNano.readInt32();
                                if (n2 != 0 && n2 != 1 && n2 != 2 && n2 != 3) continue;
                                this.e = n2;
                                continue;
                            }
                            this.d = codedInputByteBufferNano.readBool();
                            continue;
                        }
                        this.c = codedInputByteBufferNano.readBool();
                        continue;
                    }
                    this.b = codedInputByteBufferNano.readString();
                    continue;
                }
                this.a = codedInputByteBufferNano.readString();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            boolean bl2;
            if (!this.a.equals((Object)"")) {
                codedOutputByteBufferNano.writeString(1, this.a);
            }
            if (!this.b.equals((Object)"")) {
                codedOutputByteBufferNano.writeString(2, this.b);
            }
            if (bl2 = this.c) {
                codedOutputByteBufferNano.writeBool(3, bl2);
            }
            if (bl2 = this.d) {
                codedOutputByteBufferNano.writeBool(4, bl2);
            }
            codedOutputByteBufferNano.writeInt32(5, this.e);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class b
    extends MessageNano {
        private static volatile b[] d;
        public String a;
        public String b;
        public int c;

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
            if (d != null) return d;
            Object object2 = object = InternalNano.LAZY_INIT_LOCK;
            synchronized (object2) {
                if (d != null) return d;
                d = new b[0];
                return d;
            }
        }

        public b a() {
            this.a = "";
            this.b = "";
            this.c = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2;
            int n6 = n2 = super.computeSerializedSize();
            if (!this.a.equals((Object)"")) {
                n6 = n2 + CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a);
            }
            n2 = n6;
            if (!this.b.equals((Object)"")) {
                n2 = n6 + CodedOutputByteBufferNano.computeStringSize((int)2, (String)this.b);
            }
            return CodedOutputByteBufferNano.computeInt32Size((int)3, (int)this.c) + n2;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 10) {
                    if (n2 != 18) {
                        if (n2 != 24) {
                            if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                            break;
                        }
                        n2 = codedInputByteBufferNano.readInt32();
                        if (n2 != 0 && n2 != 1 && n2 != 2 && n2 != 3) continue;
                        this.c = n2;
                        continue;
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
            codedOutputByteBufferNano.writeInt32(3, this.c);
            super.writeTo(codedOutputByteBufferNano);
        }
    }
}

