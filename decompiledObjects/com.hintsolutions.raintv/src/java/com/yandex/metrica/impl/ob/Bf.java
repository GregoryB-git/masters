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

public final class bf
extends MessageNano {
    private static volatile bf[] g;
    public String a;
    public String b;
    public int c;
    public String d;
    public boolean e;
    public int f;

    public bf() {
        this.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static bf[] b() {
        Object object;
        if (g != null) return g;
        Object object2 = object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object2) {
            if (g != null) return g;
            g = new bf[0];
            return g;
        }
    }

    public bf a() {
        this.a = "";
        this.b = "";
        this.c = -1;
        this.d = "";
        this.e = false;
        this.f = -1;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int n2;
        int n3 = n2 = super.computeSerializedSize();
        if (!this.a.equals((Object)"")) {
            n3 = n2 + CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a);
        }
        n2 = n3;
        if (!this.b.equals((Object)"")) {
            n2 = n3 + CodedOutputByteBufferNano.computeStringSize((int)2, (String)this.b);
        }
        int n5 = this.c;
        n3 = n2;
        if (n5 != -1) {
            n3 = n2 + CodedOutputByteBufferNano.computeSInt32Size((int)3, (int)n5);
        }
        n5 = n3;
        if (!this.d.equals((Object)"")) {
            n5 = n3 + CodedOutputByteBufferNano.computeStringSize((int)4, (String)this.d);
        }
        boolean bl2 = this.e;
        n2 = n5;
        if (bl2) {
            n2 = n5 + CodedOutputByteBufferNano.computeBoolSize((int)5, (boolean)bl2);
        }
        n5 = this.f;
        n3 = n2;
        if (n5 != -1) {
            n3 = n2 + CodedOutputByteBufferNano.computeSInt32Size((int)6, (int)n5);
        }
        return n3;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n2;
        while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
            if (n2 != 10) {
                if (n2 != 18) {
                    if (n2 != 24) {
                        if (n2 != 34) {
                            if (n2 != 40) {
                                if (n2 != 48) {
                                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                    break;
                                }
                                this.f = codedInputByteBufferNano.readSInt32();
                                continue;
                            }
                            this.e = codedInputByteBufferNano.readBool();
                            continue;
                        }
                        this.d = codedInputByteBufferNano.readString();
                        continue;
                    }
                    this.c = codedInputByteBufferNano.readSInt32();
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
        int n2;
        if (!this.a.equals((Object)"")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        if (!this.b.equals((Object)"")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        if ((n2 = this.c) != -1) {
            codedOutputByteBufferNano.writeSInt32(3, n2);
        }
        if (!this.d.equals((Object)"")) {
            codedOutputByteBufferNano.writeString(4, this.d);
        }
        if (bl2 = this.e) {
            codedOutputByteBufferNano.writeBool(5, bl2);
        }
        if ((n2 = this.f) != -1) {
            codedOutputByteBufferNano.writeSInt32(6, n2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

