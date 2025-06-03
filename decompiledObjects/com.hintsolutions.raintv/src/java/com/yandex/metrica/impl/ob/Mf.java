/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.nano.ym.CodedInputByteBufferNano
 *  com.google.protobuf.nano.ym.CodedOutputByteBufferNano
 *  com.google.protobuf.nano.ym.MessageNano
 *  com.google.protobuf.nano.ym.WireFormatNano
 *  java.io.IOException
 *  java.lang.Double
 *  java.lang.Object
 *  java.util.Arrays
 */
package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

public final class mf
extends MessageNano {
    public int a;
    public double b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    public a f;
    public long g;
    public boolean h;
    public int i;
    public int j;
    public c k;
    public b l;

    public mf() {
        this.a();
    }

    public mf a() {
        this.a = 1;
        this.b = 0.0;
        byte[] byArray = WireFormatNano.EMPTY_BYTES;
        this.c = byArray;
        this.d = byArray;
        this.e = byArray;
        this.f = null;
        this.g = 0L;
        this.h = false;
        this.i = 0;
        this.j = 1;
        this.k = null;
        this.l = null;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int n2 = super.computeSerializedSize();
        int n3 = this.a;
        int n5 = n2;
        if (n3 != 1) {
            n5 = n2 + CodedOutputByteBufferNano.computeUInt32Size((int)1, (int)n3);
        }
        n2 = n5;
        if (Double.doubleToLongBits((double)this.b) != Double.doubleToLongBits((double)0.0)) {
            n2 = n5 + CodedOutputByteBufferNano.computeDoubleSize((int)2, (double)this.b);
        }
        n2 = CodedOutputByteBufferNano.computeBytesSize((int)3, (byte[])this.c) + n2;
        Object object = this.d;
        byte[] byArray = WireFormatNano.EMPTY_BYTES;
        n5 = n2;
        if (!Arrays.equals((byte[])object, (byte[])byArray)) {
            n5 = n2 + CodedOutputByteBufferNano.computeBytesSize((int)4, (byte[])this.d);
        }
        n2 = n5;
        if (!Arrays.equals((byte[])this.e, (byte[])byArray)) {
            n2 = n5 + CodedOutputByteBufferNano.computeBytesSize((int)5, (byte[])this.e);
        }
        object = (Object)this.f;
        n3 = n2;
        if (object != null) {
            n3 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)6, (MessageNano)object);
        }
        long l4 = this.g;
        n5 = n3;
        if (l4 != 0L) {
            n5 = n3 + CodedOutputByteBufferNano.computeInt64Size((int)7, (long)l4);
        }
        boolean bl2 = this.h;
        n2 = n5;
        if (bl2) {
            n2 = n5 + CodedOutputByteBufferNano.computeBoolSize((int)8, (boolean)bl2);
        }
        n3 = this.i;
        n5 = n2;
        if (n3 != 0) {
            n5 = n2 + CodedOutputByteBufferNano.computeInt32Size((int)9, (int)n3);
        }
        n3 = this.j;
        n2 = n5;
        if (n3 != 1) {
            n2 = n5 + CodedOutputByteBufferNano.computeInt32Size((int)10, (int)n3);
        }
        object = (Object)this.k;
        n5 = n2;
        if (object != null) {
            n5 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)11, (MessageNano)object);
        }
        object = (Object)this.l;
        n2 = n5;
        if (object != null) {
            n2 = n5 + CodedOutputByteBufferNano.computeMessageSize((int)12, (MessageNano)object);
        }
        return n2;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        block15: while (true) {
            int n2 = codedInputByteBufferNano.readTag();
            switch (n2) {
                default: {
                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue block15;
                    break block15;
                }
                case 98: {
                    if (this.l == null) {
                        this.l = new b();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.l);
                    continue block15;
                }
                case 90: {
                    if (this.k == null) {
                        this.k = new c();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.k);
                    continue block15;
                }
                case 80: {
                    n2 = codedInputByteBufferNano.readInt32();
                    if (n2 != 1 && n2 != 2) continue block15;
                    this.j = n2;
                    continue block15;
                }
                case 72: {
                    n2 = codedInputByteBufferNano.readInt32();
                    if (n2 != 0 && n2 != 1 && n2 != 2) continue block15;
                    this.i = n2;
                    continue block15;
                }
                case 64: {
                    this.h = codedInputByteBufferNano.readBool();
                    continue block15;
                }
                case 56: {
                    this.g = codedInputByteBufferNano.readInt64();
                    continue block15;
                }
                case 50: {
                    if (this.f == null) {
                        this.f = new a();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.f);
                    continue block15;
                }
                case 42: {
                    this.e = codedInputByteBufferNano.readBytes();
                    continue block15;
                }
                case 34: {
                    this.d = codedInputByteBufferNano.readBytes();
                    continue block15;
                }
                case 26: {
                    this.c = codedInputByteBufferNano.readBytes();
                    continue block15;
                }
                case 17: {
                    this.b = codedInputByteBufferNano.readDouble();
                    continue block15;
                }
                case 8: {
                    this.a = codedInputByteBufferNano.readUInt32();
                    continue block15;
                }
                case 0: 
            }
            break;
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean bl2;
        long l4;
        int n2 = this.a;
        if (n2 != 1) {
            codedOutputByteBufferNano.writeUInt32(1, n2);
        }
        if (Double.doubleToLongBits((double)this.b) != Double.doubleToLongBits((double)0.0)) {
            codedOutputByteBufferNano.writeDouble(2, this.b);
        }
        codedOutputByteBufferNano.writeBytes(3, this.c);
        Object object = this.d;
        byte[] byArray = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals((byte[])object, (byte[])byArray)) {
            codedOutputByteBufferNano.writeBytes(4, this.d);
        }
        if (!Arrays.equals((byte[])this.e, (byte[])byArray)) {
            codedOutputByteBufferNano.writeBytes(5, this.e);
        }
        if ((object = (Object)((Object)this.f)) != null) {
            codedOutputByteBufferNano.writeMessage(6, (MessageNano)object);
        }
        if ((l4 = this.g) != 0L) {
            codedOutputByteBufferNano.writeInt64(7, l4);
        }
        if (bl2 = this.h) {
            codedOutputByteBufferNano.writeBool(8, bl2);
        }
        if ((n2 = this.i) != 0) {
            codedOutputByteBufferNano.writeInt32(9, n2);
        }
        if ((n2 = this.j) != 1) {
            codedOutputByteBufferNano.writeInt32(10, n2);
        }
        if ((object = (Object)((Object)this.k)) != null) {
            codedOutputByteBufferNano.writeMessage(11, (MessageNano)object);
        }
        if ((object = (Object)((Object)this.l)) != null) {
            codedOutputByteBufferNano.writeMessage(12, (MessageNano)object);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static final class a
    extends MessageNano {
        public byte[] a;
        public byte[] b;

        public a() {
            this.a();
        }

        public a a() {
            byte[] byArray = WireFormatNano.EMPTY_BYTES;
            this.a = byArray;
            this.b = byArray;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            byte[] byArray = this.a;
            byte[] byArray2 = WireFormatNano.EMPTY_BYTES;
            int n3 = n2;
            if (!Arrays.equals((byte[])byArray, (byte[])byArray2)) {
                n3 = n2 + CodedOutputByteBufferNano.computeBytesSize((int)1, (byte[])this.a);
            }
            n2 = n3;
            if (!Arrays.equals((byte[])this.b, (byte[])byArray2)) {
                n2 = n3 + CodedOutputByteBufferNano.computeBytesSize((int)2, (byte[])this.b);
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
                    this.b = codedInputByteBufferNano.readBytes();
                    continue;
                }
                this.a = codedInputByteBufferNano.readBytes();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            byte[] byArray = this.a;
            byte[] byArray2 = WireFormatNano.EMPTY_BYTES;
            if (!Arrays.equals((byte[])byArray, (byte[])byArray2)) {
                codedOutputByteBufferNano.writeBytes(1, this.a);
            }
            if (!Arrays.equals((byte[])this.b, (byte[])byArray2)) {
                codedOutputByteBufferNano.writeBytes(2, this.b);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class com.yandex.metrica.impl.ob.mf$b
    extends MessageNano {
        public boolean a;
        public b b;
        public a c;

        public com.yandex.metrica.impl.ob.mf$b() {
            this.a();
        }

        public com.yandex.metrica.impl.ob.mf$b a() {
            this.a = false;
            this.b = null;
            this.c = null;
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
            MessageNano messageNano = this.b;
            n2 = n3;
            if (messageNano != null) {
                n2 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)2, (MessageNano)messageNano);
            }
            messageNano = this.c;
            n3 = n2;
            if (messageNano != null) {
                n3 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)3, (MessageNano)messageNano);
            }
            return n3;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 8) {
                    if (n2 != 18) {
                        if (n2 != 26) {
                            if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                            break;
                        }
                        if (this.c == null) {
                            this.c = new a();
                        }
                        codedInputByteBufferNano.readMessage((MessageNano)this.c);
                        continue;
                    }
                    if (this.b == null) {
                        this.b = new b();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.b);
                    continue;
                }
                this.a = codedInputByteBufferNano.readBool();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MessageNano messageNano;
            boolean bl2 = this.a;
            if (bl2) {
                codedOutputByteBufferNano.writeBool(1, bl2);
            }
            if ((messageNano = this.b) != null) {
                codedOutputByteBufferNano.writeMessage(2, messageNano);
            }
            if ((messageNano = this.c) != null) {
                codedOutputByteBufferNano.writeMessage(3, messageNano);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static final class a
        extends MessageNano {
            public long a;
            public b b;
            public int c;
            public byte[] d;

            public a() {
                this.a();
            }

            public a a() {
                this.a = 0L;
                this.b = null;
                this.c = 0;
                this.d = WireFormatNano.EMPTY_BYTES;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int n2 = super.computeSerializedSize();
                long l4 = this.a;
                int n3 = n2;
                if (l4 != 0L) {
                    n3 = n2 + CodedOutputByteBufferNano.computeInt64Size((int)1, (long)l4);
                }
                b b4 = this.b;
                n2 = n3;
                if (b4 != null) {
                    n2 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)2, (MessageNano)b4);
                }
                int n5 = this.c;
                n3 = n2;
                if (n5 != 0) {
                    n3 = n2 + CodedOutputByteBufferNano.computeUInt32Size((int)3, (int)n5);
                }
                n2 = n3;
                if (!Arrays.equals((byte[])this.d, (byte[])WireFormatNano.EMPTY_BYTES)) {
                    n2 = n3 + CodedOutputByteBufferNano.computeBytesSize((int)4, (byte[])this.d);
                }
                return n2;
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                int n2;
                while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                    if (n2 != 8) {
                        if (n2 != 18) {
                            if (n2 != 24) {
                                if (n2 != 34) {
                                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                    break;
                                }
                                this.d = codedInputByteBufferNano.readBytes();
                                continue;
                            }
                            this.c = codedInputByteBufferNano.readUInt32();
                            continue;
                        }
                        if (this.b == null) {
                            this.b = new b();
                        }
                        codedInputByteBufferNano.readMessage((MessageNano)this.b);
                        continue;
                    }
                    this.a = codedInputByteBufferNano.readInt64();
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                int n2;
                b b4;
                long l4 = this.a;
                if (l4 != 0L) {
                    codedOutputByteBufferNano.writeInt64(1, l4);
                }
                if ((b4 = this.b) != null) {
                    codedOutputByteBufferNano.writeMessage(2, (MessageNano)b4);
                }
                if ((n2 = this.c) != 0) {
                    codedOutputByteBufferNano.writeUInt32(3, n2);
                }
                if (!Arrays.equals((byte[])this.d, (byte[])WireFormatNano.EMPTY_BYTES)) {
                    codedOutputByteBufferNano.writeBytes(4, this.d);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public static final class b
        extends MessageNano {
            public int a;
            public int b;

            public b() {
                this.a();
            }

            public b a() {
                this.a = 0;
                this.b = 0;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int n2 = super.computeSerializedSize();
                int n3 = this.a;
                int n5 = n2;
                if (n3 != 0) {
                    n5 = n2 + CodedOutputByteBufferNano.computeUInt32Size((int)1, (int)n3);
                }
                n3 = this.b;
                n2 = n5;
                if (n3 != 0) {
                    n2 = n5 + CodedOutputByteBufferNano.computeInt32Size((int)2, (int)n3);
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
                        n2 = codedInputByteBufferNano.readInt32();
                        if (n2 != 0 && n2 != 1 && n2 != 2 && n2 != 3 && n2 != 4) continue;
                        this.b = n2;
                        continue;
                    }
                    this.a = codedInputByteBufferNano.readUInt32();
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                int n2 = this.a;
                if (n2 != 0) {
                    codedOutputByteBufferNano.writeUInt32(1, n2);
                }
                if ((n2 = this.b) != 0) {
                    codedOutputByteBufferNano.writeInt32(2, n2);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }
    }

    public static final class c
    extends MessageNano {
        public byte[] a;
        public long b;
        public int c;
        public byte[] d;
        public long e;

        public c() {
            this.a();
        }

        public c a() {
            byte[] byArray = WireFormatNano.EMPTY_BYTES;
            this.a = byArray;
            this.b = 0L;
            this.c = 0;
            this.d = byArray;
            this.e = 0L;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            byte[] byArray = this.a;
            byte[] byArray2 = WireFormatNano.EMPTY_BYTES;
            int n3 = n2;
            if (!Arrays.equals((byte[])byArray, (byte[])byArray2)) {
                n3 = n2 + CodedOutputByteBufferNano.computeBytesSize((int)1, (byte[])this.a);
            }
            long l4 = this.b;
            n2 = n3;
            if (l4 != 0L) {
                n2 = n3 + CodedOutputByteBufferNano.computeUInt64Size((int)2, (long)l4);
            }
            int n5 = this.c;
            n3 = n2;
            if (n5 != 0) {
                n3 = n2 + CodedOutputByteBufferNano.computeInt32Size((int)3, (int)n5);
            }
            n2 = n3;
            if (!Arrays.equals((byte[])this.d, (byte[])byArray2)) {
                n2 = n3 + CodedOutputByteBufferNano.computeBytesSize((int)4, (byte[])this.d);
            }
            l4 = this.e;
            n3 = n2;
            if (l4 != 0L) {
                n3 = n2 + CodedOutputByteBufferNano.computeUInt64Size((int)5, (long)l4);
            }
            return n3;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 10) {
                    if (n2 != 16) {
                        if (n2 != 24) {
                            if (n2 != 34) {
                                if (n2 != 40) {
                                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                    break;
                                }
                                this.e = codedInputByteBufferNano.readUInt64();
                                continue;
                            }
                            this.d = codedInputByteBufferNano.readBytes();
                            continue;
                        }
                        n2 = codedInputByteBufferNano.readInt32();
                        if (n2 != 0 && n2 != 1 && n2 != 2) continue;
                        this.c = n2;
                        continue;
                    }
                    this.b = codedInputByteBufferNano.readUInt64();
                    continue;
                }
                this.a = codedInputByteBufferNano.readBytes();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int n2;
            long l4;
            byte[] byArray = this.a;
            byte[] byArray2 = WireFormatNano.EMPTY_BYTES;
            if (!Arrays.equals((byte[])byArray, (byte[])byArray2)) {
                codedOutputByteBufferNano.writeBytes(1, this.a);
            }
            if ((l4 = this.b) != 0L) {
                codedOutputByteBufferNano.writeUInt64(2, l4);
            }
            if ((n2 = this.c) != 0) {
                codedOutputByteBufferNano.writeInt32(3, n2);
            }
            if (!Arrays.equals((byte[])this.d, (byte[])byArray2)) {
                codedOutputByteBufferNano.writeBytes(4, this.d);
            }
            if ((l4 = this.e) != 0L) {
                codedOutputByteBufferNano.writeUInt64(5, l4);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }
}

