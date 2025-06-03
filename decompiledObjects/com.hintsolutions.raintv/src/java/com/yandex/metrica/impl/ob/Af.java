/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.nano.ym.CodedInputByteBufferNano
 *  com.google.protobuf.nano.ym.CodedOutputByteBufferNano
 *  com.google.protobuf.nano.ym.MessageNano
 *  com.google.protobuf.nano.ym.WireFormatNano
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;

public final class af
extends MessageNano {
    public int a;
    public String b;

    public af() {
        this.a();
    }

    public af a() {
        this.a = 0;
        this.b = "";
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
        n2 = n5;
        if (!this.b.equals((Object)"")) {
            n2 = n5 + CodedOutputByteBufferNano.computeStringSize((int)2, (String)this.b);
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
                this.b = codedInputByteBufferNano.readString();
                continue;
            }
            n2 = codedInputByteBufferNano.readInt32();
            if (n2 != 0 && n2 != 1 && n2 != 2 && n2 != 3) continue;
            this.a = n2;
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int n2 = this.a;
        if (n2 != 0) {
            codedOutputByteBufferNano.writeInt32(1, n2);
        }
        if (!this.b.equals((Object)"")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

