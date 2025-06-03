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
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;

public final class gf
extends MessageNano {
    private static volatile gf[] q;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public String f;
    public boolean g;
    public int h;
    public int i;
    public long j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;

    public gf() {
        this.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static gf[] b() {
        Object object;
        if (q != null) return q;
        Object object2 = object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object2) {
            if (q != null) return q;
            q = new gf[0];
            return q;
        }
    }

    public gf a() {
        this.a = -1;
        this.b = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = "";
        this.g = false;
        this.h = 0;
        this.i = -1;
        this.j = 0L;
        this.k = Integer.MAX_VALUE;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int n2 = super.computeSerializedSize();
        int n3 = this.a;
        int n5 = n2;
        if (n3 != -1) {
            n5 = n2 + CodedOutputByteBufferNano.computeUInt32Size((int)1, (int)n3);
        }
        n3 = this.b;
        n2 = n5;
        if (n3 != 0) {
            n2 = n5 + CodedOutputByteBufferNano.computeSInt32Size((int)2, (int)n3);
        }
        n3 = this.c;
        n5 = n2;
        if (n3 != -1) {
            n5 = n2 + CodedOutputByteBufferNano.computeUInt32Size((int)3, (int)n3);
        }
        n3 = this.d;
        n2 = n5;
        if (n3 != -1) {
            n2 = n5 + CodedOutputByteBufferNano.computeUInt32Size((int)4, (int)n3);
        }
        n3 = this.e;
        n5 = n2;
        if (n3 != -1) {
            n5 = n2 + CodedOutputByteBufferNano.computeUInt32Size((int)5, (int)n3);
        }
        n2 = n5;
        if (!this.f.equals((Object)"")) {
            n2 = n5 + CodedOutputByteBufferNano.computeStringSize((int)6, (String)this.f);
        }
        boolean bl2 = this.g;
        n5 = n2;
        if (bl2) {
            n5 = n2 + CodedOutputByteBufferNano.computeBoolSize((int)7, (boolean)bl2);
        }
        n3 = this.h;
        n2 = n5;
        if (n3 != 0) {
            n2 = n5 + CodedOutputByteBufferNano.computeInt32Size((int)8, (int)n3);
        }
        n3 = this.i;
        n5 = n2;
        if (n3 != -1) {
            n5 = n2 + CodedOutputByteBufferNano.computeUInt32Size((int)9, (int)n3);
        }
        long l2 = this.j;
        n2 = n5;
        if (l2 != 0L) {
            n2 = n5 + CodedOutputByteBufferNano.computeUInt64Size((int)10, (long)l2);
        }
        n3 = this.k;
        n5 = n2;
        if (n3 != Integer.MAX_VALUE) {
            n5 = n2 + CodedOutputByteBufferNano.computeSInt32Size((int)11, (int)n3);
        }
        n3 = this.l;
        n2 = n5;
        if (n3 != Integer.MAX_VALUE) {
            n2 = n5 + CodedOutputByteBufferNano.computeSInt32Size((int)12, (int)n3);
        }
        n5 = this.m;
        n3 = n2;
        if (n5 != Integer.MAX_VALUE) {
            n3 = n2 + CodedOutputByteBufferNano.computeSInt32Size((int)13, (int)n5);
        }
        n2 = this.n;
        n5 = n3;
        if (n2 != -1) {
            n5 = n3 + CodedOutputByteBufferNano.computeUInt32Size((int)14, (int)n2);
        }
        n3 = this.o;
        n2 = n5;
        if (n3 != -1) {
            n2 = n5 + CodedOutputByteBufferNano.computeUInt32Size((int)15, (int)n3);
        }
        n3 = this.p;
        n5 = n2;
        if (n3 != -1) {
            n5 = n2 + CodedOutputByteBufferNano.computeUInt32Size((int)16, (int)n3);
        }
        return n5;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        block19: while (true) {
            int n2 = codedInputByteBufferNano.readTag();
            switch (n2) {
                default: {
                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue block19;
                    break block19;
                }
                case 128: {
                    this.p = codedInputByteBufferNano.readUInt32();
                    continue block19;
                }
                case 120: {
                    this.o = codedInputByteBufferNano.readUInt32();
                    continue block19;
                }
                case 112: {
                    this.n = codedInputByteBufferNano.readUInt32();
                    continue block19;
                }
                case 104: {
                    this.m = codedInputByteBufferNano.readSInt32();
                    continue block19;
                }
                case 96: {
                    this.l = codedInputByteBufferNano.readSInt32();
                    continue block19;
                }
                case 88: {
                    this.k = codedInputByteBufferNano.readSInt32();
                    continue block19;
                }
                case 80: {
                    this.j = codedInputByteBufferNano.readUInt64();
                    continue block19;
                }
                case 72: {
                    this.i = codedInputByteBufferNano.readUInt32();
                    continue block19;
                }
                case 64: {
                    n2 = codedInputByteBufferNano.readInt32();
                    if (n2 != 0 && n2 != 1 && n2 != 2 && n2 != 3 && n2 != 4) continue block19;
                    this.h = n2;
                    continue block19;
                }
                case 56: {
                    this.g = codedInputByteBufferNano.readBool();
                    continue block19;
                }
                case 50: {
                    this.f = codedInputByteBufferNano.readString();
                    continue block19;
                }
                case 40: {
                    this.e = codedInputByteBufferNano.readUInt32();
                    continue block19;
                }
                case 32: {
                    this.d = codedInputByteBufferNano.readUInt32();
                    continue block19;
                }
                case 24: {
                    this.c = codedInputByteBufferNano.readUInt32();
                    continue block19;
                }
                case 16: {
                    this.b = codedInputByteBufferNano.readSInt32();
                    continue block19;
                }
                case 8: {
                    this.a = codedInputByteBufferNano.readUInt32();
                    continue block19;
                }
                case 0: 
            }
            break;
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long l2;
        boolean bl2;
        int n2 = this.a;
        if (n2 != -1) {
            codedOutputByteBufferNano.writeUInt32(1, n2);
        }
        if ((n2 = this.b) != 0) {
            codedOutputByteBufferNano.writeSInt32(2, n2);
        }
        if ((n2 = this.c) != -1) {
            codedOutputByteBufferNano.writeUInt32(3, n2);
        }
        if ((n2 = this.d) != -1) {
            codedOutputByteBufferNano.writeUInt32(4, n2);
        }
        if ((n2 = this.e) != -1) {
            codedOutputByteBufferNano.writeUInt32(5, n2);
        }
        if (!this.f.equals((Object)"")) {
            codedOutputByteBufferNano.writeString(6, this.f);
        }
        if (bl2 = this.g) {
            codedOutputByteBufferNano.writeBool(7, bl2);
        }
        if ((n2 = this.h) != 0) {
            codedOutputByteBufferNano.writeInt32(8, n2);
        }
        if ((n2 = this.i) != -1) {
            codedOutputByteBufferNano.writeUInt32(9, n2);
        }
        if ((l2 = this.j) != 0L) {
            codedOutputByteBufferNano.writeUInt64(10, l2);
        }
        if ((n2 = this.k) != Integer.MAX_VALUE) {
            codedOutputByteBufferNano.writeSInt32(11, n2);
        }
        if ((n2 = this.l) != Integer.MAX_VALUE) {
            codedOutputByteBufferNano.writeSInt32(12, n2);
        }
        if ((n2 = this.m) != Integer.MAX_VALUE) {
            codedOutputByteBufferNano.writeSInt32(13, n2);
        }
        if ((n2 = this.n) != -1) {
            codedOutputByteBufferNano.writeUInt32(14, n2);
        }
        if ((n2 = this.o) != -1) {
            codedOutputByteBufferNano.writeUInt32(15, n2);
        }
        if ((n2 = this.p) != -1) {
            codedOutputByteBufferNano.writeUInt32(16, n2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

