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
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.System
 *  java.util.Arrays
 */
package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

public final class nf
extends MessageNano {
    public a[] a;

    public nf() {
        this.a();
    }

    public nf a() {
        this.a = com.yandex.metrica.impl.ob.nf$a.b();
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int n2 = super.computeSerializedSize();
        Object object = this.a;
        int n3 = n2;
        if (object != null) {
            n3 = n2;
            if (((a[])object).length > 0) {
                int n5 = 0;
                while (true) {
                    object = this.a;
                    n3 = n2;
                    if (n5 >= ((a[])object).length) break;
                    object = object[n5];
                    n3 = n2;
                    if (object != null) {
                        n3 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)1, (MessageNano)object);
                    }
                    ++n5;
                    n2 = n3;
                }
            }
        }
        return n3;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n2;
        while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
            if (n2 != 10) {
                if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                break;
            }
            int n3 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)10);
            Object object = this.a;
            n2 = object == null ? 0 : ((a[])object).length;
            int n5 = n3 + n2;
            a[] aArray = new a[n5];
            n3 = n2;
            if (n2 != 0) {
                System.arraycopy((Object)object, (int)0, (Object)aArray, (int)0, (int)n2);
                n3 = n2;
            }
            while (n3 < n5 - 1) {
                aArray[n3] = object = new a();
                codedInputByteBufferNano.readMessage((MessageNano)object);
                codedInputByteBufferNano.readTag();
                ++n3;
            }
            aArray[n3] = object = new a();
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
        private static volatile a[] e;
        public byte[] a;
        public int b;
        public b c;
        public c d;

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
            if (e != null) return e;
            Object object2 = object = InternalNano.LAZY_INIT_LOCK;
            synchronized (object2) {
                if (e != null) return e;
                e = new a[0];
                return e;
            }
        }

        public a a() {
            this.a = WireFormatNano.EMPTY_BYTES;
            this.b = 0;
            this.c = null;
            this.d = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            int n3 = CodedOutputByteBufferNano.computeBytesSize((int)1, (byte[])this.a);
            n3 = CodedOutputByteBufferNano.computeInt32Size((int)2, (int)this.b) + (n3 + n2);
            MessageNano messageNano = this.c;
            n2 = n3;
            if (messageNano != null) {
                n2 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)3, (MessageNano)messageNano);
            }
            messageNano = this.d;
            n3 = n2;
            if (messageNano != null) {
                n3 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)4, (MessageNano)messageNano);
            }
            return n3;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 10) {
                    if (n2 != 16) {
                        if (n2 != 26) {
                            if (n2 != 34) {
                                if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                break;
                            }
                            if (this.d == null) {
                                this.d = new c();
                            }
                            codedInputByteBufferNano.readMessage((MessageNano)this.d);
                            continue;
                        }
                        if (this.c == null) {
                            this.c = new b();
                        }
                        codedInputByteBufferNano.readMessage((MessageNano)this.c);
                        continue;
                    }
                    n2 = codedInputByteBufferNano.readInt32();
                    if (n2 != 0 && n2 != 1 && n2 != 2 && n2 != 3) continue;
                    this.b = n2;
                    continue;
                }
                this.a = codedInputByteBufferNano.readBytes();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeBytes(1, this.a);
            codedOutputByteBufferNano.writeInt32(2, this.b);
            MessageNano messageNano = this.c;
            if (messageNano != null) {
                codedOutputByteBufferNano.writeMessage(3, messageNano);
            }
            if ((messageNano = this.d) != null) {
                codedOutputByteBufferNano.writeMessage(4, messageNano);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class b
    extends MessageNano {
        public boolean a;
        public boolean b;

        public b() {
            this.a();
        }

        public b a() {
            this.a = false;
            this.b = false;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            boolean bl2 = this.a;
            int n3 = n2;
            if (bl2) {
                n3 = n2 + CodedOutputByteBufferNano.computeBoolSize((int)1, (boolean)bl2);
            }
            bl2 = this.b;
            n2 = n3;
            if (bl2) {
                n2 = n3 + CodedOutputByteBufferNano.computeBoolSize((int)2, (boolean)bl2);
            }
            return n2;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 8) {
                    if (n2 != 16) {
                        if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                        break;
                    }
                    this.b = codedInputByteBufferNano.readBool();
                    continue;
                }
                this.a = codedInputByteBufferNano.readBool();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            boolean bl2 = this.a;
            if (bl2) {
                codedOutputByteBufferNano.writeBool(1, bl2);
            }
            if (bl2 = this.b) {
                codedOutputByteBufferNano.writeBool(2, bl2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class c
    extends MessageNano {
        public byte[] a;
        public double b;
        public double c;
        public boolean d;

        public c() {
            this.a();
        }

        public c a() {
            this.a = WireFormatNano.EMPTY_BYTES;
            this.b = 0.0;
            this.c = 0.0;
            this.d = false;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2;
            int n3 = n2 = super.computeSerializedSize();
            if (!Arrays.equals((byte[])this.a, (byte[])WireFormatNano.EMPTY_BYTES)) {
                n3 = n2 + CodedOutputByteBufferNano.computeBytesSize((int)1, (byte[])this.a);
            }
            n2 = n3;
            if (Double.doubleToLongBits((double)this.b) != Double.doubleToLongBits((double)0.0)) {
                n2 = n3 + CodedOutputByteBufferNano.computeDoubleSize((int)2, (double)this.b);
            }
            n3 = n2;
            if (Double.doubleToLongBits((double)this.c) != Double.doubleToLongBits((double)0.0)) {
                n3 = n2 + CodedOutputByteBufferNano.computeDoubleSize((int)3, (double)this.c);
            }
            boolean bl2 = this.d;
            n2 = n3;
            if (bl2) {
                n2 = n3 + CodedOutputByteBufferNano.computeBoolSize((int)4, (boolean)bl2);
            }
            return n2;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 10) {
                    if (n2 != 17) {
                        if (n2 != 25) {
                            if (n2 != 32) {
                                if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                break;
                            }
                            this.d = codedInputByteBufferNano.readBool();
                            continue;
                        }
                        this.c = codedInputByteBufferNano.readDouble();
                        continue;
                    }
                    this.b = codedInputByteBufferNano.readDouble();
                    continue;
                }
                this.a = codedInputByteBufferNano.readBytes();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            boolean bl2;
            if (!Arrays.equals((byte[])this.a, (byte[])WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.a);
            }
            if (Double.doubleToLongBits((double)this.b) != Double.doubleToLongBits((double)0.0)) {
                codedOutputByteBufferNano.writeDouble(2, this.b);
            }
            if (Double.doubleToLongBits((double)this.c) != Double.doubleToLongBits((double)0.0)) {
                codedOutputByteBufferNano.writeDouble(3, this.c);
            }
            if (bl2 = this.d) {
                codedOutputByteBufferNano.writeBool(4, bl2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }
}

