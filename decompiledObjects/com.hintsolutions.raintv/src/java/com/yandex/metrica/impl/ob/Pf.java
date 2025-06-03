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

public final class pf
extends MessageNano {
    public a[] a;
    public boolean b;

    public pf() {
        this.a();
    }

    public pf a() {
        this.a = com.yandex.metrica.impl.ob.pf$a.b();
        this.b = false;
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
        return CodedOutputByteBufferNano.computeBoolSize((int)2, (boolean)this.b) + n3;
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
        codedOutputByteBufferNano.writeBool(2, this.b);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static final class a
    extends MessageNano {
        private static volatile a[] f;
        public int a;
        public String b;
        public String c;
        public long d;
        public long e;

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
            if (f != null) return f;
            Object object2 = object = InternalNano.LAZY_INIT_LOCK;
            synchronized (object2) {
                if (f != null) return f;
                f = new a[0];
                return f;
            }
        }

        public a a() {
            this.a = 1;
            this.b = "";
            this.c = "";
            this.d = 0L;
            this.e = 0L;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            int n3 = CodedOutputByteBufferNano.computeInt32Size((int)1, (int)this.a);
            int n5 = CodedOutputByteBufferNano.computeStringSize((int)2, (String)this.b);
            int n6 = CodedOutputByteBufferNano.computeStringSize((int)3, (String)this.c);
            int n9 = CodedOutputByteBufferNano.computeUInt64Size((int)4, (long)this.d);
            return CodedOutputByteBufferNano.computeUInt64Size((int)5, (long)this.e) + (n9 + (n6 + (n5 + (n3 + n2))));
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 8) {
                    if (n2 != 18) {
                        if (n2 != 26) {
                            if (n2 != 32) {
                                if (n2 != 40) {
                                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                    break;
                                }
                                this.e = codedInputByteBufferNano.readUInt64();
                                continue;
                            }
                            this.d = codedInputByteBufferNano.readUInt64();
                            continue;
                        }
                        this.c = codedInputByteBufferNano.readString();
                        continue;
                    }
                    this.b = codedInputByteBufferNano.readString();
                    continue;
                }
                n2 = codedInputByteBufferNano.readInt32();
                if (n2 != 1 && n2 != 2 && n2 != 3) continue;
                this.a = n2;
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt32(1, this.a);
            codedOutputByteBufferNano.writeString(2, this.b);
            codedOutputByteBufferNano.writeString(3, this.c);
            codedOutputByteBufferNano.writeUInt64(4, this.d);
            codedOutputByteBufferNano.writeUInt64(5, this.e);
            super.writeTo(codedOutputByteBufferNano);
        }
    }
}

