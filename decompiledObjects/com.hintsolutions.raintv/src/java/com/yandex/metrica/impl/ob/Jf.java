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
 */
package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;

public final class jf
extends MessageNano {
    private static volatile jf[] f;
    public String a;
    public int b;
    public String c;
    public boolean d;
    public long e;

    public jf() {
        this.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static jf[] b() {
        Object object;
        if (f != null) return f;
        Object object2 = object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object2) {
            if (f != null) return f;
            f = new jf[0];
            return f;
        }
    }

    public jf a() {
        this.a = "";
        this.b = 0;
        this.c = "";
        this.d = false;
        this.e = 0L;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int n2 = super.computeSerializedSize();
        int n3 = CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a) + n2;
        int n5 = this.b;
        n2 = n3;
        if (n5 != 0) {
            n2 = n3 + CodedOutputByteBufferNano.computeSInt32Size((int)2, (int)n5);
        }
        n3 = n2;
        if (!this.c.equals((Object)"")) {
            n3 = n2 + CodedOutputByteBufferNano.computeStringSize((int)3, (String)this.c);
        }
        boolean bl2 = this.d;
        n2 = n3;
        if (bl2) {
            n2 = n3 + CodedOutputByteBufferNano.computeBoolSize((int)4, (boolean)bl2);
        }
        long l4 = this.e;
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
                    if (n2 != 26) {
                        if (n2 != 32) {
                            if (n2 != 40) {
                                if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                break;
                            }
                            this.e = codedInputByteBufferNano.readUInt64();
                            continue;
                        }
                        this.d = codedInputByteBufferNano.readBool();
                        continue;
                    }
                    this.c = codedInputByteBufferNano.readString();
                    continue;
                }
                this.b = codedInputByteBufferNano.readSInt32();
                continue;
            }
            this.a = codedInputByteBufferNano.readString();
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long l4;
        boolean bl2;
        codedOutputByteBufferNano.writeString(1, this.a);
        int n2 = this.b;
        if (n2 != 0) {
            codedOutputByteBufferNano.writeSInt32(2, n2);
        }
        if (!this.c.equals((Object)"")) {
            codedOutputByteBufferNano.writeString(3, this.c);
        }
        if (bl2 = this.d) {
            codedOutputByteBufferNano.writeBool(4, bl2);
        }
        if ((l4 = this.e) != 0L) {
            codedOutputByteBufferNano.writeUInt64(5, l4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

