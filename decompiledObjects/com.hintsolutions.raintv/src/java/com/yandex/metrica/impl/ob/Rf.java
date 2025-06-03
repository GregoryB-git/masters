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
 *  java.lang.System
 */
package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;

public final class rf
extends MessageNano {
    public boolean a;
    public int b;
    public int c;
    public int[] d;

    public rf() {
        this.a();
    }

    public rf a() {
        this.a = false;
        this.b = 0;
        this.c = 0;
        this.d = WireFormatNano.EMPTY_INT_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int n2 = super.computeSerializedSize();
        int n6 = CodedOutputByteBufferNano.computeBoolSize((int)1, (boolean)this.a);
        int n9 = CodedOutputByteBufferNano.computeUInt32Size((int)2, (int)this.b);
        n9 = CodedOutputByteBufferNano.computeUInt32Size((int)3, (int)this.c) + (n9 + (n6 + n2));
        int[] nArray = this.d;
        n2 = n9;
        if (nArray != null) {
            n2 = n9;
            if (nArray.length > 0) {
                n6 = 0;
                for (n2 = 0; n2 < (nArray = this.d).length; ++n2) {
                    n6 += CodedOutputByteBufferNano.computeInt32SizeNoTag((int)nArray[n2]);
                }
                n2 = n9 + n6 + nArray.length * 1;
            }
        }
        return n2;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n2;
        while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
            if (n2 != 8) {
                if (n2 != 16) {
                    if (n2 != 24) {
                        int[] nArray;
                        int[] nArray2;
                        int n6;
                        int n9;
                        if (n2 != 32) {
                            if (n2 != 34) {
                                if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                break;
                            }
                            n9 = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                            n2 = codedInputByteBufferNano.getPosition();
                            n6 = 0;
                            while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                                codedInputByteBufferNano.readInt32();
                                ++n6;
                            }
                            codedInputByteBufferNano.rewindToPosition(n2);
                            nArray2 = this.d;
                            n2 = nArray2 == null ? 0 : nArray2.length;
                            int n10 = n6 + n2;
                            nArray = new int[n10];
                            n6 = n2;
                            if (n2 != 0) {
                                System.arraycopy((Object)nArray2, (int)0, (Object)nArray, (int)0, (int)n2);
                                n6 = n2;
                            }
                            while (n6 < n10) {
                                nArray[n6] = codedInputByteBufferNano.readInt32();
                                ++n6;
                            }
                            this.d = nArray;
                            codedInputByteBufferNano.popLimit(n9);
                            continue;
                        }
                        n6 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)32);
                        nArray = this.d;
                        n2 = nArray == null ? 0 : nArray.length;
                        n9 = n6 + n2;
                        nArray2 = new int[n9];
                        n6 = n2;
                        if (n2 != 0) {
                            System.arraycopy((Object)nArray, (int)0, (Object)nArray2, (int)0, (int)n2);
                            n6 = n2;
                        }
                        while (n6 < n9 - 1) {
                            nArray2[n6] = codedInputByteBufferNano.readInt32();
                            codedInputByteBufferNano.readTag();
                            ++n6;
                        }
                        nArray2[n6] = codedInputByteBufferNano.readInt32();
                        this.d = nArray2;
                        continue;
                    }
                    this.c = codedInputByteBufferNano.readUInt32();
                    continue;
                }
                this.b = codedInputByteBufferNano.readUInt32();
                continue;
            }
            this.a = codedInputByteBufferNano.readBool();
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBool(1, this.a);
        codedOutputByteBufferNano.writeUInt32(2, this.b);
        codedOutputByteBufferNano.writeUInt32(3, this.c);
        int[] nArray = this.d;
        if (nArray != null && nArray.length > 0) {
            for (int i2 = 0; i2 < (nArray = this.d).length; ++i2) {
                codedOutputByteBufferNano.writeInt32(4, nArray[i2]);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

