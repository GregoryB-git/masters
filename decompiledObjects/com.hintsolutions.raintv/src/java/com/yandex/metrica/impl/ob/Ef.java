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

public final class ef
extends MessageNano {
    public int a;
    public q b;
    public o c;
    public p d;
    public b e;
    public h f;

    public ef() {
        this.a();
    }

    public ef a() {
        this.a = 0;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int n2 = super.computeSerializedSize();
        int n3 = this.a;
        int n5 = n2;
        if (n3 != 0) {
            n5 = n2 + CodedOutputByteBufferNano.computeInt32Size((int)1, (int)n3);
        }
        MessageNano messageNano = this.b;
        n3 = n5;
        if (messageNano != null) {
            n3 = n5 + CodedOutputByteBufferNano.computeMessageSize((int)2, (MessageNano)messageNano);
        }
        messageNano = this.c;
        n2 = n3;
        if (messageNano != null) {
            n2 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)3, (MessageNano)messageNano);
        }
        messageNano = this.d;
        n5 = n2;
        if (messageNano != null) {
            n5 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)4, (MessageNano)messageNano);
        }
        messageNano = this.e;
        n2 = n5;
        if (messageNano != null) {
            n2 = n5 + CodedOutputByteBufferNano.computeMessageSize((int)5, (MessageNano)messageNano);
        }
        messageNano = this.f;
        n5 = n2;
        if (messageNano != null) {
            n5 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)6, (MessageNano)messageNano);
        }
        return n5;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n2;
        block3: while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
            if (n2 != 8) {
                if (n2 != 18) {
                    if (n2 != 26) {
                        if (n2 != 34) {
                            if (n2 != 42) {
                                if (n2 != 50) {
                                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                    break;
                                }
                                if (this.f == null) {
                                    this.f = new h();
                                }
                                codedInputByteBufferNano.readMessage((MessageNano)this.f);
                                continue;
                            }
                            if (this.e == null) {
                                this.e = new b();
                            }
                            codedInputByteBufferNano.readMessage((MessageNano)this.e);
                            continue;
                        }
                        if (this.d == null) {
                            this.d = new p();
                        }
                        codedInputByteBufferNano.readMessage((MessageNano)this.d);
                        continue;
                    }
                    if (this.c == null) {
                        this.c = new o();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.c);
                    continue;
                }
                if (this.b == null) {
                    this.b = new q();
                }
                codedInputByteBufferNano.readMessage((MessageNano)this.b);
                continue;
            }
            n2 = codedInputByteBufferNano.readInt32();
            switch (n2) {
                default: {
                    continue block3;
                }
                case 0: 
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
            }
            this.a = n2;
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        MessageNano messageNano;
        int n2 = this.a;
        if (n2 != 0) {
            codedOutputByteBufferNano.writeInt32(1, n2);
        }
        if ((messageNano = this.b) != null) {
            codedOutputByteBufferNano.writeMessage(2, messageNano);
        }
        if ((messageNano = this.c) != null) {
            codedOutputByteBufferNano.writeMessage(3, messageNano);
        }
        if ((messageNano = this.d) != null) {
            codedOutputByteBufferNano.writeMessage(4, messageNano);
        }
        if ((messageNano = this.e) != null) {
            codedOutputByteBufferNano.writeMessage(5, messageNano);
        }
        if ((messageNano = this.f) != null) {
            codedOutputByteBufferNano.writeMessage(6, messageNano);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static final class a
    extends MessageNano {
        private static volatile a[] c;
        public byte[] a;
        public e b;

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
            this.a = WireFormatNano.EMPTY_BYTES;
            this.b = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2;
            int n3 = n2 = super.computeSerializedSize();
            if (!Arrays.equals((byte[])this.a, (byte[])WireFormatNano.EMPTY_BYTES)) {
                n3 = n2 + CodedOutputByteBufferNano.computeBytesSize((int)1, (byte[])this.a);
            }
            e e4 = this.b;
            n2 = n3;
            if (e4 != null) {
                n2 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)2, (MessageNano)e4);
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
                    if (this.b == null) {
                        this.b = new e();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.b);
                    continue;
                }
                this.a = codedInputByteBufferNano.readBytes();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            e e4;
            if (!Arrays.equals((byte[])this.a, (byte[])WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.a);
            }
            if ((e4 = this.b) != null) {
                codedOutputByteBufferNano.writeMessage(2, (MessageNano)e4);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class b
    extends MessageNano {
        public c a;

        public b() {
            this.a();
        }

        public b a() {
            this.a = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            c c5 = this.a;
            int n3 = n2;
            if (c5 != null) {
                n3 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)1, (MessageNano)c5);
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
                if (this.a == null) {
                    this.a = new c();
                }
                codedInputByteBufferNano.readMessage((MessageNano)this.a);
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            c c5 = this.a;
            if (c5 != null) {
                codedOutputByteBufferNano.writeMessage(1, (MessageNano)c5);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class c
    extends MessageNano {
        public k a;
        public m b;
        public e c;
        public j d;

        public c() {
            this.a();
        }

        public c a() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            MessageNano messageNano = this.a;
            int n3 = n2;
            if (messageNano != null) {
                n3 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)1, (MessageNano)messageNano);
            }
            messageNano = this.b;
            n2 = n3;
            if (messageNano != null) {
                n2 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)2, (MessageNano)messageNano);
            }
            messageNano = this.c;
            n3 = n2;
            if (messageNano != null) {
                n3 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)3, (MessageNano)messageNano);
            }
            messageNano = this.d;
            n2 = n3;
            if (messageNano != null) {
                n2 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)4, (MessageNano)messageNano);
            }
            return n2;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 10) {
                    if (n2 != 18) {
                        if (n2 != 26) {
                            if (n2 != 34) {
                                if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                break;
                            }
                            if (this.d == null) {
                                this.d = new j();
                            }
                            codedInputByteBufferNano.readMessage((MessageNano)this.d);
                            continue;
                        }
                        if (this.c == null) {
                            this.c = new e();
                        }
                        codedInputByteBufferNano.readMessage((MessageNano)this.c);
                        continue;
                    }
                    if (this.b == null) {
                        this.b = new m();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.b);
                    continue;
                }
                if (this.a == null) {
                    this.a = new k();
                }
                codedInputByteBufferNano.readMessage((MessageNano)this.a);
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MessageNano messageNano = this.a;
            if (messageNano != null) {
                codedOutputByteBufferNano.writeMessage(1, messageNano);
            }
            if ((messageNano = this.b) != null) {
                codedOutputByteBufferNano.writeMessage(2, messageNano);
            }
            if ((messageNano = this.c) != null) {
                codedOutputByteBufferNano.writeMessage(3, messageNano);
            }
            if ((messageNano = this.d) != null) {
                codedOutputByteBufferNano.writeMessage(4, messageNano);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class d
    extends MessageNano {
        public byte[][] a;

        public d() {
            this.a();
        }

        public d a() {
            this.a = WireFormatNano.EMPTY_BYTES_ARRAY;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            Object object = this.a;
            int n3 = n2;
            if (object != null) {
                n3 = n2;
                if (((byte[][])object).length > 0) {
                    int n5 = 0;
                    int n6 = 0;
                    for (int i2 = 0; i2 < ((byte[][])(object = this.a)).length; ++i2) {
                        object = object[i2];
                        int n9 = n5;
                        n3 = n6;
                        if (object != null) {
                            n3 = n6 + 1;
                            n9 = CodedOutputByteBufferNano.computeBytesSizeNoTag((byte[])object) + n5;
                        }
                        n5 = n9;
                        n6 = n3;
                    }
                    n3 = n2 + n5 + n6 * 1;
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
                byte[][] byArray = this.a;
                n2 = byArray == null ? 0 : byArray.length;
                int n5 = n3 + n2;
                byte[][] byArrayArray = new byte[n5][];
                n3 = n2;
                if (n2 != 0) {
                    System.arraycopy((Object)byArray, (int)0, (Object)byArrayArray, (int)0, (int)n2);
                    n3 = n2;
                }
                while (n3 < n5 - 1) {
                    byArrayArray[n3] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    ++n3;
                }
                byArrayArray[n3] = codedInputByteBufferNano.readBytes();
                this.a = byArrayArray;
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Object object = this.a;
            if (object != null && ((byte[][])object).length > 0) {
                for (int i2 = 0; i2 < ((byte[][])(object = this.a)).length; ++i2) {
                    if ((object = (Object)object[i2]) == null) continue;
                    codedOutputByteBufferNano.writeBytes(1, (byte[])object);
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class e
    extends MessageNano {
        public long a;
        public int b;

        public e() {
            this.a();
        }

        public e a() {
            this.a = 0L;
            this.b = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            long l2 = this.a;
            int n3 = n2;
            if (l2 != 0L) {
                n3 = n2 + CodedOutputByteBufferNano.computeInt64Size((int)1, (long)l2);
            }
            int n5 = this.b;
            n2 = n3;
            if (n5 != 0) {
                n2 = n3 + CodedOutputByteBufferNano.computeInt32Size((int)2, (int)n5);
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
                    this.b = codedInputByteBufferNano.readInt32();
                    continue;
                }
                this.a = codedInputByteBufferNano.readInt64();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int n2;
            long l2 = this.a;
            if (l2 != 0L) {
                codedOutputByteBufferNano.writeInt64(1, l2);
            }
            if ((n2 = this.b) != 0) {
                codedOutputByteBufferNano.writeInt32(2, n2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class f
    extends MessageNano {
        public byte[] a;
        public byte[] b;
        public i c;
        public g[] d;
        public int e;

        public f() {
            this.a();
        }

        public f a() {
            byte[] byArray = WireFormatNano.EMPTY_BYTES;
            this.a = byArray;
            this.b = byArray;
            this.c = null;
            this.d = g.b();
            this.e = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2;
            int n3 = super.computeSerializedSize();
            Object object = this.a;
            byte[] byArray = WireFormatNano.EMPTY_BYTES;
            int n5 = n3;
            if (!Arrays.equals((byte[])object, (byte[])byArray)) {
                n5 = n3 + CodedOutputByteBufferNano.computeBytesSize((int)1, (byte[])this.a);
            }
            n3 = n5;
            if (!Arrays.equals((byte[])this.b, (byte[])byArray)) {
                n3 = n5 + CodedOutputByteBufferNano.computeBytesSize((int)2, (byte[])this.b);
            }
            object = (Object)this.c;
            n5 = n3;
            if (object != null) {
                n5 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)3, (MessageNano)object);
            }
            object = this.d;
            n3 = n5;
            if (object != null) {
                n3 = n5;
                if (((byte[])object).length > 0) {
                    n2 = 0;
                    while (true) {
                        object = this.d;
                        n3 = n5;
                        if (n2 >= ((byte[])object).length) break;
                        object = object[n2];
                        n3 = n5;
                        if (object != null) {
                            n3 = n5 + CodedOutputByteBufferNano.computeMessageSize((int)4, (MessageNano)object);
                        }
                        ++n2;
                        n5 = n3;
                    }
                }
            }
            n2 = this.e;
            n5 = n3;
            if (n2 != 0) {
                n5 = n3 + CodedOutputByteBufferNano.computeUInt32Size((int)5, (int)n2);
            }
            return n5;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 10) {
                    if (n2 != 18) {
                        if (n2 != 26) {
                            if (n2 != 34) {
                                if (n2 != 40) {
                                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                    break;
                                }
                                this.e = codedInputByteBufferNano.readUInt32();
                                continue;
                            }
                            int n3 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)34);
                            Object object = this.d;
                            n2 = object == null ? 0 : ((g[])object).length;
                            int n5 = n3 + n2;
                            g[] gArray = new g[n5];
                            n3 = n2;
                            if (n2 != 0) {
                                System.arraycopy((Object)object, (int)0, (Object)gArray, (int)0, (int)n2);
                                n3 = n2;
                            }
                            while (n3 < n5 - 1) {
                                gArray[n3] = object = new g();
                                codedInputByteBufferNano.readMessage((MessageNano)object);
                                codedInputByteBufferNano.readTag();
                                ++n3;
                            }
                            gArray[n3] = object = new g();
                            codedInputByteBufferNano.readMessage((MessageNano)object);
                            this.d = gArray;
                            continue;
                        }
                        if (this.c == null) {
                            this.c = new i();
                        }
                        codedInputByteBufferNano.readMessage((MessageNano)this.c);
                        continue;
                    }
                    this.b = codedInputByteBufferNano.readBytes();
                    continue;
                }
                this.a = codedInputByteBufferNano.readBytes();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int n2;
            Object object = this.a;
            byte[] byArray = WireFormatNano.EMPTY_BYTES;
            if (!Arrays.equals((byte[])object, (byte[])byArray)) {
                codedOutputByteBufferNano.writeBytes(1, this.a);
            }
            if (!Arrays.equals((byte[])this.b, (byte[])byArray)) {
                codedOutputByteBufferNano.writeBytes(2, this.b);
            }
            if ((object = (Object)((Object)this.c)) != null) {
                codedOutputByteBufferNano.writeMessage(3, (MessageNano)object);
            }
            if ((object = (Object)this.d) != null && ((byte[])object).length > 0) {
                for (n2 = 0; n2 < ((byte[])(object = (Object)this.d)).length; ++n2) {
                    if ((object = (Object)object[n2]) == null) continue;
                    codedOutputByteBufferNano.writeMessage(4, (MessageNano)object);
                }
            }
            if ((n2 = this.e) != 0) {
                codedOutputByteBufferNano.writeUInt32(5, n2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class g
    extends MessageNano {
        private static volatile g[] c;
        public int a;
        public c b;

        public g() {
            this.a();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public static g[] b() {
            Object object;
            if (c != null) return c;
            Object object2 = object = InternalNano.LAZY_INIT_LOCK;
            synchronized (object2) {
                if (c != null) return c;
                c = new g[0];
                return c;
            }
        }

        public g a() {
            this.a = 0;
            this.b = null;
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
            c c5 = this.b;
            n2 = n5;
            if (c5 != null) {
                n2 = n5 + CodedOutputByteBufferNano.computeMessageSize((int)2, (MessageNano)c5);
            }
            return n2;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 8) {
                    if (n2 != 18) {
                        if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                        break;
                    }
                    if (this.b == null) {
                        this.b = new c();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.b);
                    continue;
                }
                this.a = codedInputByteBufferNano.readUInt32();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            c c5;
            int n2 = this.a;
            if (n2 != 0) {
                codedOutputByteBufferNano.writeUInt32(1, n2);
            }
            if ((c5 = this.b) != null) {
                codedOutputByteBufferNano.writeMessage(2, (MessageNano)c5);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class h
    extends MessageNano {
        public f a;

        public h() {
            this.a();
        }

        public h a() {
            this.a = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            f f3 = this.a;
            int n3 = n2;
            if (f3 != null) {
                n3 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)1, (MessageNano)f3);
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
                if (this.a == null) {
                    this.a = new f();
                }
                codedInputByteBufferNano.readMessage((MessageNano)this.a);
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            f f3 = this.a;
            if (f3 != null) {
                codedOutputByteBufferNano.writeMessage(1, (MessageNano)f3);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class i
    extends MessageNano {
        public a[] a;
        public int b;

        public i() {
            this.a();
        }

        public i a() {
            this.a = a.b();
            this.b = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2;
            int n3 = super.computeSerializedSize();
            Object object = this.a;
            int n5 = n3;
            if (object != null) {
                n5 = n3;
                if (((a[])object).length > 0) {
                    n2 = 0;
                    while (true) {
                        object = this.a;
                        n5 = n3;
                        if (n2 >= ((a[])object).length) break;
                        object = object[n2];
                        n5 = n3;
                        if (object != null) {
                            n5 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)1, (MessageNano)object);
                        }
                        ++n2;
                        n3 = n5;
                    }
                }
            }
            n2 = this.b;
            n3 = n5;
            if (n2 != 0) {
                n3 = n5 + CodedOutputByteBufferNano.computeUInt32Size((int)2, (int)n2);
            }
            return n3;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 10) {
                    if (n2 != 16) {
                        if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                        break;
                    }
                    this.b = codedInputByteBufferNano.readUInt32();
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
            int n2;
            Object object = this.a;
            if (object != null && ((a[])object).length > 0) {
                for (n2 = 0; n2 < ((a[])(object = this.a)).length; ++n2) {
                    if ((object = object[n2]) == null) continue;
                    codedOutputByteBufferNano.writeMessage(1, (MessageNano)object);
                }
            }
            if ((n2 = this.b) != 0) {
                codedOutputByteBufferNano.writeUInt32(2, n2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static final class a
        extends MessageNano {
            private static volatile a[] c;
            public byte[] a;
            public byte[] b;

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
    }

    public static final class j
    extends MessageNano {
        public a a;
        public a[] b;

        public j() {
            this.a();
        }

        public j a() {
            this.a = null;
            this.b = com.yandex.metrica.impl.ob.ef$a.b();
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            Object object = this.a;
            int n3 = n2;
            if (object != null) {
                n3 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)1, (MessageNano)object);
            }
            object = this.b;
            int n5 = n3;
            if (object != null) {
                n5 = n3;
                if (((a[])object).length > 0) {
                    n2 = 0;
                    while (true) {
                        object = this.b;
                        n5 = n3;
                        if (n2 >= ((a[])object).length) break;
                        object = object[n2];
                        n5 = n3;
                        if (object != null) {
                            n5 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)2, (MessageNano)object);
                        }
                        ++n2;
                        n3 = n5;
                    }
                }
            }
            return n5;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 10) {
                    if (n2 != 18) {
                        if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                        break;
                    }
                    int n3 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)18);
                    Object object = this.b;
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
    }

    public static final class k
    extends MessageNano {
        public byte[] a;
        public byte[] b;
        public d c;
        public i d;
        public j e;
        public j f;
        public l[] g;

        public k() {
            this.a();
        }

        public k a() {
            byte[] byArray = WireFormatNano.EMPTY_BYTES;
            this.a = byArray;
            this.b = byArray;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = l.b();
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            Object object = this.a;
            byte[] byArray = WireFormatNano.EMPTY_BYTES;
            int n3 = n2;
            if (!Arrays.equals((byte[])object, (byte[])byArray)) {
                n3 = n2 + CodedOutputByteBufferNano.computeBytesSize((int)1, (byte[])this.a);
            }
            n2 = n3;
            if (!Arrays.equals((byte[])this.b, (byte[])byArray)) {
                n2 = n3 + CodedOutputByteBufferNano.computeBytesSize((int)2, (byte[])this.b);
            }
            object = (Object)this.c;
            n3 = n2;
            if (object != null) {
                n3 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)3, (MessageNano)object);
            }
            object = (Object)this.d;
            n2 = n3;
            if (object != null) {
                n2 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)4, (MessageNano)object);
            }
            object = (Object)this.e;
            int n5 = n2;
            if (object != null) {
                n5 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)5, (MessageNano)object);
            }
            object = (Object)this.f;
            n3 = n5;
            if (object != null) {
                n3 = n5 + CodedOutputByteBufferNano.computeMessageSize((int)6, (MessageNano)object);
            }
            object = this.g;
            n5 = n3;
            if (object != null) {
                n5 = n3;
                if (((byte[])object).length > 0) {
                    n2 = 0;
                    while (true) {
                        object = this.g;
                        n5 = n3;
                        if (n2 >= ((byte[])object).length) break;
                        object = object[n2];
                        n5 = n3;
                        if (object != null) {
                            n5 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)7, (MessageNano)object);
                        }
                        ++n2;
                        n3 = n5;
                    }
                }
            }
            return n5;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 10) {
                    if (n2 != 18) {
                        if (n2 != 26) {
                            if (n2 != 34) {
                                if (n2 != 42) {
                                    if (n2 != 50) {
                                        if (n2 != 58) {
                                            if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                            break;
                                        }
                                        int n3 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)58);
                                        Object object = this.g;
                                        n2 = object == null ? 0 : ((l[])object).length;
                                        int n5 = n3 + n2;
                                        l[] lArray = new l[n5];
                                        n3 = n2;
                                        if (n2 != 0) {
                                            System.arraycopy((Object)object, (int)0, (Object)lArray, (int)0, (int)n2);
                                            n3 = n2;
                                        }
                                        while (n3 < n5 - 1) {
                                            lArray[n3] = object = new l();
                                            codedInputByteBufferNano.readMessage((MessageNano)object);
                                            codedInputByteBufferNano.readTag();
                                            ++n3;
                                        }
                                        lArray[n3] = object = new l();
                                        codedInputByteBufferNano.readMessage((MessageNano)object);
                                        this.g = lArray;
                                        continue;
                                    }
                                    if (this.f == null) {
                                        this.f = new j();
                                    }
                                    codedInputByteBufferNano.readMessage((MessageNano)this.f);
                                    continue;
                                }
                                if (this.e == null) {
                                    this.e = new j();
                                }
                                codedInputByteBufferNano.readMessage((MessageNano)this.e);
                                continue;
                            }
                            if (this.d == null) {
                                this.d = new i();
                            }
                            codedInputByteBufferNano.readMessage((MessageNano)this.d);
                            continue;
                        }
                        if (this.c == null) {
                            this.c = new d();
                        }
                        codedInputByteBufferNano.readMessage((MessageNano)this.c);
                        continue;
                    }
                    this.b = codedInputByteBufferNano.readBytes();
                    continue;
                }
                this.a = codedInputByteBufferNano.readBytes();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Object object = this.a;
            byte[] byArray = WireFormatNano.EMPTY_BYTES;
            if (!Arrays.equals((byte[])object, (byte[])byArray)) {
                codedOutputByteBufferNano.writeBytes(1, this.a);
            }
            if (!Arrays.equals((byte[])this.b, (byte[])byArray)) {
                codedOutputByteBufferNano.writeBytes(2, this.b);
            }
            if ((object = (Object)((Object)this.c)) != null) {
                codedOutputByteBufferNano.writeMessage(3, (MessageNano)object);
            }
            if ((object = (Object)((Object)this.d)) != null) {
                codedOutputByteBufferNano.writeMessage(4, (MessageNano)object);
            }
            if ((object = (Object)((Object)this.e)) != null) {
                codedOutputByteBufferNano.writeMessage(5, (MessageNano)object);
            }
            if ((object = (Object)((Object)this.f)) != null) {
                codedOutputByteBufferNano.writeMessage(6, (MessageNano)object);
            }
            if ((object = (Object)this.g) != null && ((byte[])object).length > 0) {
                for (int i2 = 0; i2 < ((byte[])(object = (Object)this.g)).length; ++i2) {
                    if ((object = (Object)object[i2]) == null) continue;
                    codedOutputByteBufferNano.writeMessage(7, (MessageNano)object);
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class l
    extends MessageNano {
        private static volatile l[] b;
        public byte[] a;

        public l() {
            this.a();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public static l[] b() {
            Object object;
            if (b != null) return b;
            Object object2 = object = InternalNano.LAZY_INIT_LOCK;
            synchronized (object2) {
                if (b != null) return b;
                b = new l[0];
                return b;
            }
        }

        public l a() {
            this.a = WireFormatNano.EMPTY_BYTES;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2;
            int n3 = n2 = super.computeSerializedSize();
            if (!Arrays.equals((byte[])this.a, (byte[])WireFormatNano.EMPTY_BYTES)) {
                n3 = n2 + CodedOutputByteBufferNano.computeBytesSize((int)1, (byte[])this.a);
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
                this.a = codedInputByteBufferNano.readBytes();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!Arrays.equals((byte[])this.a, (byte[])WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.a);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class m
    extends MessageNano {
        public byte[] a;
        public byte[] b;
        public n c;

        public m() {
            this.a();
        }

        public m a() {
            byte[] byArray = WireFormatNano.EMPTY_BYTES;
            this.a = byArray;
            this.b = byArray;
            this.c = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            byte[] byArray = this.a;
            Object object = WireFormatNano.EMPTY_BYTES;
            int n3 = n2;
            if (!Arrays.equals((byte[])byArray, (byte[])object)) {
                n3 = n2 + CodedOutputByteBufferNano.computeBytesSize((int)1, (byte[])this.a);
            }
            n2 = n3;
            if (!Arrays.equals((byte[])this.b, (byte[])object)) {
                n2 = n3 + CodedOutputByteBufferNano.computeBytesSize((int)2, (byte[])this.b);
            }
            object = (Object)this.c;
            n3 = n2;
            if (object != null) {
                n3 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)3, (MessageNano)object);
            }
            return n3;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 10) {
                    if (n2 != 18) {
                        if (n2 != 26) {
                            if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                            break;
                        }
                        if (this.c == null) {
                            this.c = new n();
                        }
                        codedInputByteBufferNano.readMessage((MessageNano)this.c);
                        continue;
                    }
                    this.b = codedInputByteBufferNano.readBytes();
                    continue;
                }
                this.a = codedInputByteBufferNano.readBytes();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Object object = this.a;
            byte[] byArray = WireFormatNano.EMPTY_BYTES;
            if (!Arrays.equals((byte[])object, (byte[])byArray)) {
                codedOutputByteBufferNano.writeBytes(1, this.a);
            }
            if (!Arrays.equals((byte[])this.b, (byte[])byArray)) {
                codedOutputByteBufferNano.writeBytes(2, this.b);
            }
            if ((object = (Object)((Object)this.c)) != null) {
                codedOutputByteBufferNano.writeMessage(3, (MessageNano)object);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class n
    extends MessageNano {
        public byte[] a;
        public d b;
        public byte[] c;
        public i d;

        public n() {
            this.a();
        }

        public n a() {
            byte[] byArray = WireFormatNano.EMPTY_BYTES;
            this.a = byArray;
            this.b = null;
            this.c = byArray;
            this.d = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            Object object = this.a;
            Object object2 = WireFormatNano.EMPTY_BYTES;
            int n3 = n2;
            if (!Arrays.equals((byte[])object, (byte[])object2)) {
                n3 = n2 + CodedOutputByteBufferNano.computeBytesSize((int)1, (byte[])this.a);
            }
            object = (Object)this.b;
            n2 = n3;
            if (object != null) {
                n2 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)2, (MessageNano)object);
            }
            n3 = n2;
            if (!Arrays.equals((byte[])this.c, (byte[])object2)) {
                n3 = n2 + CodedOutputByteBufferNano.computeBytesSize((int)3, (byte[])this.c);
            }
            object2 = (Object)this.d;
            n2 = n3;
            if (object2 != null) {
                n2 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)4, (MessageNano)object2);
            }
            return n2;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 10) {
                    if (n2 != 18) {
                        if (n2 != 26) {
                            if (n2 != 34) {
                                if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                break;
                            }
                            if (this.d == null) {
                                this.d = new i();
                            }
                            codedInputByteBufferNano.readMessage((MessageNano)this.d);
                            continue;
                        }
                        this.c = codedInputByteBufferNano.readBytes();
                        continue;
                    }
                    if (this.b == null) {
                        this.b = new d();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.b);
                    continue;
                }
                this.a = codedInputByteBufferNano.readBytes();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Object object = this.a;
            Object object2 = WireFormatNano.EMPTY_BYTES;
            if (!Arrays.equals((byte[])object, (byte[])object2)) {
                codedOutputByteBufferNano.writeBytes(1, this.a);
            }
            if ((object = (Object)((Object)this.b)) != null) {
                codedOutputByteBufferNano.writeMessage(2, (MessageNano)object);
            }
            if (!Arrays.equals((byte[])this.c, (byte[])object2)) {
                codedOutputByteBufferNano.writeBytes(3, this.c);
            }
            if ((object2 = (Object)((Object)this.d)) != null) {
                codedOutputByteBufferNano.writeMessage(4, (MessageNano)object2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class o
    extends MessageNano {
        public k a;
        public n b;

        public o() {
            this.a();
        }

        public o a() {
            this.a = null;
            this.b = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            MessageNano messageNano = this.a;
            int n3 = n2;
            if (messageNano != null) {
                n3 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)1, (MessageNano)messageNano);
            }
            messageNano = this.b;
            n2 = n3;
            if (messageNano != null) {
                n2 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)2, (MessageNano)messageNano);
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
                    if (this.b == null) {
                        this.b = new n();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.b);
                    continue;
                }
                if (this.a == null) {
                    this.a = new k();
                }
                codedInputByteBufferNano.readMessage((MessageNano)this.a);
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MessageNano messageNano = this.a;
            if (messageNano != null) {
                codedOutputByteBufferNano.writeMessage(1, messageNano);
            }
            if ((messageNano = this.b) != null) {
                codedOutputByteBufferNano.writeMessage(2, messageNano);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class p
    extends MessageNano {
        public k a;
        public m b;

        public p() {
            this.a();
        }

        public p a() {
            this.a = null;
            this.b = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            MessageNano messageNano = this.a;
            int n3 = n2;
            if (messageNano != null) {
                n3 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)1, (MessageNano)messageNano);
            }
            messageNano = this.b;
            n2 = n3;
            if (messageNano != null) {
                n2 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)2, (MessageNano)messageNano);
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
                    if (this.b == null) {
                        this.b = new m();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.b);
                    continue;
                }
                if (this.a == null) {
                    this.a = new k();
                }
                codedInputByteBufferNano.readMessage((MessageNano)this.a);
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MessageNano messageNano = this.a;
            if (messageNano != null) {
                codedOutputByteBufferNano.writeMessage(1, messageNano);
            }
            if ((messageNano = this.b) != null) {
                codedOutputByteBufferNano.writeMessage(2, messageNano);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class q
    extends MessageNano {
        public n a;

        public q() {
            this.a();
        }

        public q a() {
            this.a = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            n n3 = this.a;
            int n5 = n2;
            if (n3 != null) {
                n5 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)1, (MessageNano)n3);
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
                if (this.a == null) {
                    this.a = new n();
                }
                codedInputByteBufferNano.readMessage((MessageNano)this.a);
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            n n2 = this.a;
            if (n2 != null) {
                codedOutputByteBufferNano.writeMessage(1, (MessageNano)n2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }
}

