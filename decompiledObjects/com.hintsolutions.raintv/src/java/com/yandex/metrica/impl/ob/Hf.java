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
 *  java.lang.System
 */
package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import com.yandex.metrica.impl.ob.gf;
import com.yandex.metrica.impl.ob.jf;
import java.io.IOException;

public final class hf
extends MessageNano {
    public b[] a;
    public a[] b;

    public hf() {
        this.a();
    }

    public hf a() {
        this.a = com.yandex.metrica.impl.ob.hf$b.b();
        this.b = com.yandex.metrica.impl.ob.hf$a.b();
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int n2;
        int n3 = super.computeSerializedSize();
        MessageNano messageNano = this.a;
        int n5 = 0;
        int n6 = n3;
        if (messageNano != null) {
            n6 = n3;
            if (((b[])messageNano).length > 0) {
                n2 = 0;
                while (true) {
                    messageNano = this.a;
                    n6 = n3;
                    if (n2 >= ((MessageNano[])messageNano).length) break;
                    messageNano = messageNano[n2];
                    n6 = n3;
                    if (messageNano != null) {
                        n6 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)1, (MessageNano)messageNano);
                    }
                    ++n2;
                    n3 = n6;
                }
            }
        }
        messageNano = this.b;
        n2 = n6;
        if (messageNano != null) {
            n2 = n6;
            if (((MessageNano[])messageNano).length > 0) {
                n3 = n5;
                while (true) {
                    messageNano = this.b;
                    n2 = n6;
                    if (n3 >= ((MessageNano)messageNano).length) break;
                    messageNano = messageNano[n3];
                    n2 = n6;
                    if (messageNano != null) {
                        n2 = n6 + CodedOutputByteBufferNano.computeMessageSize((int)2, (MessageNano)messageNano);
                    }
                    ++n3;
                    n6 = n2;
                }
            }
        }
        return n2;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n2;
        while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
            MessageNano[] messageNanoArray;
            int n3;
            Object object;
            int n5;
            if (n2 != 10) {
                if (n2 != 18) {
                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                    break;
                }
                n5 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)18);
                object = this.b;
                n2 = object == null ? 0 : ((MessageNano[])object).length;
                n3 = n5 + n2;
                messageNanoArray = new a[n3];
                n5 = n2;
                if (n2 != 0) {
                    System.arraycopy((Object)object, (int)0, (Object)messageNanoArray, (int)0, (int)n2);
                    n5 = n2;
                }
                while (n5 < n3 - 1) {
                    messageNanoArray[n5] = object = new a();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    codedInputByteBufferNano.readTag();
                    ++n5;
                }
                messageNanoArray[n5] = object = new a();
                codedInputByteBufferNano.readMessage((MessageNano)object);
                this.b = messageNanoArray;
                continue;
            }
            n5 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)10);
            object = this.a;
            n2 = object == null ? 0 : ((MessageNano[])object).length;
            n3 = n5 + n2;
            messageNanoArray = new b[n3];
            n5 = n2;
            if (n2 != 0) {
                System.arraycopy((Object)object, (int)0, (Object)messageNanoArray, (int)0, (int)n2);
                n5 = n2;
            }
            while (n5 < n3 - 1) {
                messageNanoArray[n5] = object = new b();
                codedInputByteBufferNano.readMessage((MessageNano)object);
                codedInputByteBufferNano.readTag();
                ++n5;
            }
            messageNanoArray[n5] = object = new b();
            codedInputByteBufferNano.readMessage((MessageNano)object);
            this.a = messageNanoArray;
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int n2;
        MessageNano messageNano = this.a;
        int n3 = 0;
        if (messageNano != null && ((b[])messageNano).length > 0) {
            for (n2 = 0; n2 < ((MessageNano[])(messageNano = this.a)).length; ++n2) {
                if ((messageNano = messageNano[n2]) == null) continue;
                codedOutputByteBufferNano.writeMessage(1, messageNano);
            }
        }
        if ((messageNano = this.b) != null && ((MessageNano[])messageNano).length > 0) {
            for (n2 = n3; n2 < ((MessageNano)(messageNano = this.b)).length; ++n2) {
                if ((messageNano = messageNano[n2]) == null) continue;
                codedOutputByteBufferNano.writeMessage(2, messageNano);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static final class a
    extends MessageNano {
        private static volatile a[] h;
        public long a;
        public long b;
        public gf[] c;
        public jf[] d;
        public long e;
        public int f;
        public int g;

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
            if (h != null) return h;
            Object object2 = object = InternalNano.LAZY_INIT_LOCK;
            synchronized (object2) {
                if (h != null) return h;
                h = new a[0];
                return h;
            }
        }

        public a a() {
            this.a = 0L;
            this.b = 0L;
            this.c = gf.b();
            this.d = jf.b();
            this.e = 0L;
            this.f = 0;
            this.g = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2;
            int n3 = super.computeSerializedSize();
            int n5 = CodedOutputByteBufferNano.computeUInt64Size((int)1, (long)this.a);
            n3 = CodedOutputByteBufferNano.computeUInt64Size((int)2, (long)this.b) + (n5 + n3);
            MessageNano messageNano = this.c;
            int n6 = 0;
            n5 = n3;
            if (messageNano != null) {
                n5 = n3;
                if (((gf[])messageNano).length > 0) {
                    n2 = 0;
                    while (true) {
                        messageNano = this.c;
                        n5 = n3;
                        if (n2 >= ((MessageNano[])messageNano).length) break;
                        messageNano = messageNano[n2];
                        n5 = n3;
                        if (messageNano != null) {
                            n5 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)3, (MessageNano)messageNano);
                        }
                        ++n2;
                        n3 = n5;
                    }
                }
            }
            messageNano = this.d;
            n3 = n5;
            if (messageNano != null) {
                n3 = n5;
                if (((MessageNano[])messageNano).length > 0) {
                    n2 = n6;
                    while (true) {
                        messageNano = this.d;
                        n3 = n5;
                        if (n2 >= ((MessageNano)messageNano).length) break;
                        messageNano = messageNano[n2];
                        n3 = n5;
                        if (messageNano != null) {
                            n3 = n5 + CodedOutputByteBufferNano.computeMessageSize((int)4, (MessageNano)messageNano);
                        }
                        ++n2;
                        n5 = n3;
                    }
                }
            }
            long l2 = this.e;
            n2 = n3;
            if (l2 != 0L) {
                n2 = n3 + CodedOutputByteBufferNano.computeUInt64Size((int)5, (long)l2);
            }
            n3 = this.f;
            n5 = n2;
            if (n3 != 0) {
                n5 = n2 + CodedOutputByteBufferNano.computeInt32Size((int)6, (int)n3);
            }
            n2 = this.g;
            n3 = n5;
            if (n2 != 0) {
                n3 = n5 + CodedOutputByteBufferNano.computeInt32Size((int)7, (int)n2);
            }
            return n3;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 8) {
                    if (n2 != 16) {
                        MessageNano[] messageNanoArray;
                        int n3;
                        Object object;
                        int n5;
                        if (n2 != 26) {
                            if (n2 != 34) {
                                if (n2 != 40) {
                                    if (n2 != 48) {
                                        if (n2 != 56) {
                                            if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                            break;
                                        }
                                        n2 = codedInputByteBufferNano.readInt32();
                                        if (n2 != 0 && n2 != 1 && n2 != 2 && n2 != 3) continue;
                                        this.g = n2;
                                        continue;
                                    }
                                    n2 = codedInputByteBufferNano.readInt32();
                                    if (n2 != 0 && n2 != 1 && n2 != 2 && n2 != 3 && n2 != 4) continue;
                                    this.f = n2;
                                    continue;
                                }
                                this.e = codedInputByteBufferNano.readUInt64();
                                continue;
                            }
                            n5 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)34);
                            object = this.d;
                            n2 = object == null ? 0 : ((MessageNano[])object).length;
                            n3 = n5 + n2;
                            messageNanoArray = new jf[n3];
                            n5 = n2;
                            if (n2 != 0) {
                                System.arraycopy((Object)object, (int)0, (Object)messageNanoArray, (int)0, (int)n2);
                                n5 = n2;
                            }
                            while (n5 < n3 - 1) {
                                messageNanoArray[n5] = object = new jf();
                                codedInputByteBufferNano.readMessage((MessageNano)object);
                                codedInputByteBufferNano.readTag();
                                ++n5;
                            }
                            messageNanoArray[n5] = object = new jf();
                            codedInputByteBufferNano.readMessage((MessageNano)object);
                            this.d = messageNanoArray;
                            continue;
                        }
                        n5 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)26);
                        object = this.c;
                        n2 = object == null ? 0 : ((MessageNano[])object).length;
                        n3 = n5 + n2;
                        messageNanoArray = new gf[n3];
                        n5 = n2;
                        if (n2 != 0) {
                            System.arraycopy((Object)object, (int)0, (Object)messageNanoArray, (int)0, (int)n2);
                            n5 = n2;
                        }
                        while (n5 < n3 - 1) {
                            messageNanoArray[n5] = object = new gf();
                            codedInputByteBufferNano.readMessage((MessageNano)object);
                            codedInputByteBufferNano.readTag();
                            ++n5;
                        }
                        messageNanoArray[n5] = object = new gf();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        this.c = messageNanoArray;
                        continue;
                    }
                    this.b = codedInputByteBufferNano.readUInt64();
                    continue;
                }
                this.a = codedInputByteBufferNano.readUInt64();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long l2;
            int n2;
            codedOutputByteBufferNano.writeUInt64(1, this.a);
            codedOutputByteBufferNano.writeUInt64(2, this.b);
            MessageNano messageNano = this.c;
            int n3 = 0;
            if (messageNano != null && ((gf[])messageNano).length > 0) {
                for (n2 = 0; n2 < ((MessageNano[])(messageNano = this.c)).length; ++n2) {
                    if ((messageNano = messageNano[n2]) == null) continue;
                    codedOutputByteBufferNano.writeMessage(3, messageNano);
                }
            }
            if ((messageNano = this.d) != null && ((MessageNano[])messageNano).length > 0) {
                for (n2 = n3; n2 < ((MessageNano)(messageNano = this.d)).length; ++n2) {
                    if ((messageNano = messageNano[n2]) == null) continue;
                    codedOutputByteBufferNano.writeMessage(4, messageNano);
                }
            }
            if ((l2 = this.e) != 0L) {
                codedOutputByteBufferNano.writeUInt64(5, l2);
            }
            if ((n2 = this.f) != 0) {
                codedOutputByteBufferNano.writeInt32(6, n2);
            }
            if ((n2 = this.g) != 0) {
                codedOutputByteBufferNano.writeInt32(7, n2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class b
    extends MessageNano {
        private static volatile b[] n;
        public long a;
        public long b;
        public long c;
        public double d;
        public double e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public long l;
        public int m;

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
            if (n != null) return n;
            Object object2 = object = InternalNano.LAZY_INIT_LOCK;
            synchronized (object2) {
                if (n != null) return n;
                n = new b[0];
                return n;
            }
        }

        public b a() {
            this.a = 0L;
            this.b = 0L;
            this.c = 0L;
            this.d = 0.0;
            this.e = 0.0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.l = 0L;
            this.m = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            int n3 = CodedOutputByteBufferNano.computeUInt64Size((int)1, (long)this.a);
            n2 = CodedOutputByteBufferNano.computeUInt64Size((int)2, (long)this.b) + (n3 + n2);
            long l2 = this.c;
            n3 = n2;
            if (l2 != 0L) {
                n3 = n2 + CodedOutputByteBufferNano.computeUInt64Size((int)3, (long)l2);
            }
            n2 = CodedOutputByteBufferNano.computeDoubleSize((int)4, (double)this.d);
            n2 = CodedOutputByteBufferNano.computeDoubleSize((int)5, (double)this.e) + (n2 + n3);
            int n5 = this.f;
            n3 = n2;
            if (n5 != 0) {
                n3 = n2 + CodedOutputByteBufferNano.computeUInt32Size((int)6, (int)n5);
            }
            n5 = this.g;
            n2 = n3;
            if (n5 != 0) {
                n2 = n3 + CodedOutputByteBufferNano.computeUInt32Size((int)7, (int)n5);
            }
            n5 = this.h;
            n3 = n2;
            if (n5 != 0) {
                n3 = n2 + CodedOutputByteBufferNano.computeUInt32Size((int)8, (int)n5);
            }
            n5 = this.i;
            n2 = n3;
            if (n5 != 0) {
                n2 = n3 + CodedOutputByteBufferNano.computeInt32Size((int)9, (int)n5);
            }
            n5 = this.j;
            n3 = n2;
            if (n5 != 0) {
                n3 = n2 + CodedOutputByteBufferNano.computeInt32Size((int)10, (int)n5);
            }
            n5 = this.k;
            n2 = n3;
            if (n5 != 0) {
                n2 = n3 + CodedOutputByteBufferNano.computeInt32Size((int)11, (int)n5);
            }
            l2 = this.l;
            n3 = n2;
            if (l2 != 0L) {
                n3 = n2 + CodedOutputByteBufferNano.computeUInt64Size((int)12, (long)l2);
            }
            n5 = this.m;
            n2 = n3;
            if (n5 != 0) {
                n2 = n3 + CodedOutputByteBufferNano.computeInt32Size((int)13, (int)n5);
            }
            return n2;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            block16: while (true) {
                int n2 = codedInputByteBufferNano.readTag();
                switch (n2) {
                    default: {
                        if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue block16;
                        break block16;
                    }
                    case 104: {
                        n2 = codedInputByteBufferNano.readInt32();
                        if (n2 != 0 && n2 != 1 && n2 != 2 && n2 != 3 && n2 != 4) continue block16;
                        this.m = n2;
                        continue block16;
                    }
                    case 96: {
                        this.l = codedInputByteBufferNano.readUInt64();
                        continue block16;
                    }
                    case 88: {
                        n2 = codedInputByteBufferNano.readInt32();
                        if (n2 != 0 && n2 != 1 && n2 != 2 && n2 != 3) continue block16;
                        this.k = n2;
                        continue block16;
                    }
                    case 80: {
                        n2 = codedInputByteBufferNano.readInt32();
                        if (n2 != 0 && n2 != 1 && n2 != 2 && n2 != 3) continue block16;
                        this.j = n2;
                        continue block16;
                    }
                    case 72: {
                        this.i = codedInputByteBufferNano.readInt32();
                        continue block16;
                    }
                    case 64: {
                        this.h = codedInputByteBufferNano.readUInt32();
                        continue block16;
                    }
                    case 56: {
                        this.g = codedInputByteBufferNano.readUInt32();
                        continue block16;
                    }
                    case 48: {
                        this.f = codedInputByteBufferNano.readUInt32();
                        continue block16;
                    }
                    case 41: {
                        this.e = codedInputByteBufferNano.readDouble();
                        continue block16;
                    }
                    case 33: {
                        this.d = codedInputByteBufferNano.readDouble();
                        continue block16;
                    }
                    case 24: {
                        this.c = codedInputByteBufferNano.readUInt64();
                        continue block16;
                    }
                    case 16: {
                        this.b = codedInputByteBufferNano.readUInt64();
                        continue block16;
                    }
                    case 8: {
                        this.a = codedInputByteBufferNano.readUInt64();
                        continue block16;
                    }
                    case 0: 
                }
                break;
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeUInt64(1, this.a);
            codedOutputByteBufferNano.writeUInt64(2, this.b);
            long l2 = this.c;
            if (l2 != 0L) {
                codedOutputByteBufferNano.writeUInt64(3, l2);
            }
            codedOutputByteBufferNano.writeDouble(4, this.d);
            codedOutputByteBufferNano.writeDouble(5, this.e);
            int n2 = this.f;
            if (n2 != 0) {
                codedOutputByteBufferNano.writeUInt32(6, n2);
            }
            if ((n2 = this.g) != 0) {
                codedOutputByteBufferNano.writeUInt32(7, n2);
            }
            if ((n2 = this.h) != 0) {
                codedOutputByteBufferNano.writeUInt32(8, n2);
            }
            if ((n2 = this.i) != 0) {
                codedOutputByteBufferNano.writeInt32(9, n2);
            }
            if ((n2 = this.j) != 0) {
                codedOutputByteBufferNano.writeInt32(10, n2);
            }
            if ((n2 = this.k) != 0) {
                codedOutputByteBufferNano.writeInt32(11, n2);
            }
            if ((l2 = this.l) != 0L) {
                codedOutputByteBufferNano.writeUInt64(12, l2);
            }
            if ((n2 = this.m) != 0) {
                codedOutputByteBufferNano.writeInt32(13, n2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }
}

