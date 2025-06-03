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
 */
package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;

public final class kf
extends MessageNano {
    public byte[] a;
    public long b;
    public long c;
    public int d;

    public kf() {
        this.a();
    }

    public kf a() {
        this.a = WireFormatNano.EMPTY_BYTES;
        this.b = 0L;
        this.c = 0L;
        this.d = 0;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int n2 = super.computeSerializedSize();
        n2 = CodedOutputByteBufferNano.computeBytesSize((int)1, (byte[])this.a) + n2;
        long l4 = this.b;
        int n3 = n2;
        if (l4 != 0L) {
            n3 = n2 + CodedOutputByteBufferNano.computeUInt64Size((int)2, (long)l4);
        }
        l4 = this.c;
        n2 = n3;
        if (l4 != 0L) {
            n2 = n3 + CodedOutputByteBufferNano.computeUInt64Size((int)3, (long)l4);
        }
        int n5 = this.d;
        n3 = n2;
        if (n5 != 0) {
            n3 = n2 + CodedOutputByteBufferNano.computeInt32Size((int)4, (int)n5);
        }
        return n3;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n2;
        while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
            if (n2 != 10) {
                if (n2 != 16) {
                    if (n2 != 24) {
                        if (n2 != 32) {
                            if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                            break;
                        }
                        n2 = codedInputByteBufferNano.readInt32();
                        if (n2 != 0 && n2 != 1 && n2 != 2) continue;
                        this.d = n2;
                        continue;
                    }
                    this.c = codedInputByteBufferNano.readUInt64();
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
        codedOutputByteBufferNano.writeBytes(1, this.a);
        long l4 = this.b;
        if (l4 != 0L) {
            codedOutputByteBufferNano.writeUInt64(2, l4);
        }
        if ((l4 = this.c) != 0L) {
            codedOutputByteBufferNano.writeUInt64(3, l4);
        }
        if ((n2 = this.d) != 0) {
            codedOutputByteBufferNano.writeInt32(4, n2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

