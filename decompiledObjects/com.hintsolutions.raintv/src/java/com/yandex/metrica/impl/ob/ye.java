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
 *  java.util.Arrays
 */
package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import com.yandex.metrica.impl.ob.Ve;
import com.yandex.metrica.impl.ob.Xe;
import com.yandex.metrica.impl.ob.af;
import com.yandex.metrica.impl.ob.bf;
import com.yandex.metrica.impl.ob.df;
import java.io.IOException;
import java.util.Arrays;

public final class Ye
extends MessageNano {
    private static byte[] k;
    private static volatile boolean l;
    public df a;
    public Ve b;
    public String c;
    public int d;
    public bf[] e;
    public int f;
    public a g;
    public byte[] h;
    public byte[] i;
    public Xe[] j;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Ye() {
        if (!l) {
            Object object;
            Object object2 = object = InternalNano.LAZY_INIT_LOCK;
            synchronized (object2) {
                if (!l) {
                    k = InternalNano.bytesDefaultValue((String)"JVM");
                    l = true;
                }
            }
        }
        this.a();
    }

    public Ye a() {
        this.a = null;
        this.b = null;
        this.c = "";
        this.d = -1;
        this.e = bf.b();
        this.f = 0;
        this.g = null;
        this.h = (byte[])k.clone();
        this.i = WireFormatNano.EMPTY_BYTES;
        this.j = Xe.b();
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
            n5 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)2, (MessageNano)object);
        }
        n2 = n5;
        if (!this.c.equals((Object)"")) {
            n2 = n5 + CodedOutputByteBufferNano.computeStringSize((int)3, (String)this.c);
        }
        n5 = this.d;
        n3 = n2;
        if (n5 != -1) {
            n3 = n2 + CodedOutputByteBufferNano.computeInt32Size((int)4, (int)n5);
        }
        object = this.e;
        int n6 = 0;
        n2 = n3;
        if (object != null) {
            n2 = n3;
            if (((bf[])object).length > 0) {
                n5 = 0;
                while (true) {
                    object = this.e;
                    n2 = n3;
                    if (n5 >= ((bf[])object).length) break;
                    object = object[n5];
                    n2 = n3;
                    if (object != null) {
                        n2 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)5, (MessageNano)object);
                    }
                    ++n5;
                    n3 = n2;
                }
            }
        }
        n5 = this.f;
        n3 = n2;
        if (n5 != 0) {
            n3 = n2 + CodedOutputByteBufferNano.computeInt32Size((int)6, (int)n5);
        }
        object = this.g;
        n5 = n3;
        if (object != null) {
            n5 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)7, (MessageNano)object);
        }
        n2 = n5;
        if (!Arrays.equals((byte[])this.h, (byte[])k)) {
            n2 = n5 + CodedOutputByteBufferNano.computeBytesSize((int)8, (byte[])this.h);
        }
        n3 = n2;
        if (!Arrays.equals((byte[])this.i, (byte[])WireFormatNano.EMPTY_BYTES)) {
            n3 = n2 + CodedOutputByteBufferNano.computeBytesSize((int)9, (byte[])this.i);
        }
        object = this.j;
        n5 = n3;
        if (object != null) {
            n5 = n3;
            if (((bf[])object).length > 0) {
                n2 = n6;
                while (true) {
                    object = this.j;
                    n5 = n3;
                    if (n2 >= ((bf[])object).length) break;
                    object = object[n2];
                    n5 = n3;
                    if (object != null) {
                        n5 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)10, (MessageNano)object);
                    }
                    ++n2;
                    n3 = n5;
                }
            }
        }
        return n5;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        block13: while (true) {
            int n2 = codedInputByteBufferNano.readTag();
            switch (n2) {
                default: {
                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue block13;
                    break block13;
                }
                case 82: {
                    int n3 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)82);
                    Object object = this.j;
                    n2 = object == null ? 0 : ((MessageNano[])object).length;
                    int n5 = n3 + n2;
                    MessageNano[] messageNanoArray = new Xe[n5];
                    n3 = n2;
                    if (n2 != 0) {
                        System.arraycopy((Object)object, (int)0, (Object)messageNanoArray, (int)0, (int)n2);
                        n3 = n2;
                    }
                    while (n3 < n5 - 1) {
                        messageNanoArray[n3] = object = new Xe();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        codedInputByteBufferNano.readTag();
                        ++n3;
                    }
                    messageNanoArray[n3] = object = new Xe();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    this.j = messageNanoArray;
                    continue block13;
                }
                case 74: {
                    this.i = codedInputByteBufferNano.readBytes();
                    continue block13;
                }
                case 66: {
                    this.h = codedInputByteBufferNano.readBytes();
                    continue block13;
                }
                case 58: {
                    if (this.g == null) {
                        this.g = new a();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.g);
                    continue block13;
                }
                case 48: {
                    n2 = codedInputByteBufferNano.readInt32();
                    if (n2 != 0 && n2 != 1) continue block13;
                    this.f = n2;
                    continue block13;
                }
                case 42: {
                    int n3 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)42);
                    Object object = this.e;
                    n2 = object == null ? 0 : ((MessageNano[])object).length;
                    int n5 = n3 + n2;
                    MessageNano[] messageNanoArray = new bf[n5];
                    n3 = n2;
                    if (n2 != 0) {
                        System.arraycopy((Object)object, (int)0, (Object)messageNanoArray, (int)0, (int)n2);
                        n3 = n2;
                    }
                    while (n3 < n5 - 1) {
                        messageNanoArray[n3] = object = new bf();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        codedInputByteBufferNano.readTag();
                        ++n3;
                    }
                    messageNanoArray[n3] = object = new bf();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    this.e = messageNanoArray;
                    continue block13;
                }
                case 32: {
                    n2 = codedInputByteBufferNano.readInt32();
                    if (n2 != -1 && n2 != 0 && n2 != 1) continue block13;
                    this.d = n2;
                    continue block13;
                }
                case 26: {
                    this.c = codedInputByteBufferNano.readString();
                    continue block13;
                }
                case 18: {
                    if (this.b == null) {
                        this.b = new Ve();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.b);
                    continue block13;
                }
                case 10: {
                    if (this.a == null) {
                        this.a = new df();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.a);
                    continue block13;
                }
                case 0: 
            }
            break;
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int n2;
        Object object = this.a;
        if (object != null) {
            codedOutputByteBufferNano.writeMessage(1, (MessageNano)object);
        }
        if ((object = this.b) != null) {
            codedOutputByteBufferNano.writeMessage(2, (MessageNano)object);
        }
        if (!this.c.equals((Object)"")) {
            codedOutputByteBufferNano.writeString(3, this.c);
        }
        if ((n2 = this.d) != -1) {
            codedOutputByteBufferNano.writeInt32(4, n2);
        }
        object = this.e;
        int n3 = 0;
        if (object != null && ((bf[])object).length > 0) {
            for (n2 = 0; n2 < ((bf[])(object = this.e)).length; ++n2) {
                if ((object = object[n2]) == null) continue;
                codedOutputByteBufferNano.writeMessage(5, (MessageNano)object);
            }
        }
        if ((n2 = this.f) != 0) {
            codedOutputByteBufferNano.writeInt32(6, n2);
        }
        if ((object = this.g) != null) {
            codedOutputByteBufferNano.writeMessage(7, (MessageNano)object);
        }
        if (!Arrays.equals((byte[])this.h, (byte[])k)) {
            codedOutputByteBufferNano.writeBytes(8, this.h);
        }
        if (!Arrays.equals((byte[])this.i, (byte[])WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(9, this.i);
        }
        if ((object = this.j) != null && ((bf[])object).length > 0) {
            for (n2 = n3; n2 < ((bf[])(object = this.j)).length; ++n2) {
                if ((object = object[n2]) == null) continue;
                codedOutputByteBufferNano.writeMessage(10, (MessageNano)object);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static final class a
    extends MessageNano {
        public byte[] a;
        public af b;

        public a() {
            this.a();
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
            af af2 = this.b;
            n2 = n3;
            if (af2 != null) {
                n2 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)2, (MessageNano)af2);
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
                        this.b = new af();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.b);
                    continue;
                }
                this.a = codedInputByteBufferNano.readBytes();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            af af2;
            if (!Arrays.equals((byte[])this.a, (byte[])WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.a);
            }
            if ((af2 = this.b) != null) {
                codedOutputByteBufferNano.writeMessage(2, (MessageNano)af2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }
}

