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
 */
package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import com.yandex.metrica.impl.ob.bf;
import java.io.IOException;

public final class cf
extends MessageNano {
    private static volatile cf[] g;
    public String a;
    public int b;
    public long c;
    public String d;
    public int e;
    public bf[] f;

    public cf() {
        this.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static cf[] b() {
        Object object;
        if (g != null) return g;
        Object object2 = object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object2) {
            if (g != null) return g;
            g = new cf[0];
            return g;
        }
    }

    public cf a() {
        this.a = "";
        this.b = 0;
        this.c = 0L;
        this.d = "";
        this.e = 0;
        this.f = bf.b();
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int n2 = super.computeSerializedSize();
        int n3 = CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a);
        int n5 = CodedOutputByteBufferNano.computeSInt32Size((int)2, (int)this.b);
        n3 = n5 = CodedOutputByteBufferNano.computeSInt64Size((int)3, (long)this.c) + (n5 + (n3 + n2));
        if (!this.d.equals((Object)"")) {
            n3 = n5 + CodedOutputByteBufferNano.computeStringSize((int)4, (String)this.d);
        }
        n2 = this.e;
        n5 = n3;
        if (n2 != 0) {
            n5 = n3 + CodedOutputByteBufferNano.computeUInt32Size((int)5, (int)n2);
        }
        Object object = this.f;
        n2 = n5;
        if (object != null) {
            n2 = n5;
            if (((bf[])object).length > 0) {
                n3 = 0;
                while (true) {
                    object = this.f;
                    n2 = n5;
                    if (n3 >= ((bf[])object).length) break;
                    object = object[n3];
                    n2 = n5;
                    if (object != null) {
                        n2 = n5 + CodedOutputByteBufferNano.computeMessageSize((int)6, (MessageNano)object);
                    }
                    ++n3;
                    n5 = n2;
                }
            }
        }
        return n2;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n2;
        while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
            if (n2 != 10) {
                if (n2 != 16) {
                    if (n2 != 24) {
                        if (n2 != 34) {
                            if (n2 != 40) {
                                if (n2 != 50) {
                                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                    break;
                                }
                                int n3 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)50);
                                Object object = this.f;
                                n2 = object == null ? 0 : ((bf[])object).length;
                                int n5 = n3 + n2;
                                bf[] bfArray = new bf[n5];
                                n3 = n2;
                                if (n2 != 0) {
                                    System.arraycopy((Object)object, (int)0, (Object)bfArray, (int)0, (int)n2);
                                    n3 = n2;
                                }
                                while (n3 < n5 - 1) {
                                    bfArray[n3] = object = new bf();
                                    codedInputByteBufferNano.readMessage((MessageNano)object);
                                    codedInputByteBufferNano.readTag();
                                    ++n3;
                                }
                                bfArray[n3] = object = new bf();
                                codedInputByteBufferNano.readMessage((MessageNano)object);
                                this.f = bfArray;
                                continue;
                            }
                            this.e = codedInputByteBufferNano.readUInt32();
                            continue;
                        }
                        this.d = codedInputByteBufferNano.readString();
                        continue;
                    }
                    this.c = codedInputByteBufferNano.readSInt64();
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
        Object object;
        int n2;
        codedOutputByteBufferNano.writeString(1, this.a);
        codedOutputByteBufferNano.writeSInt32(2, this.b);
        codedOutputByteBufferNano.writeSInt64(3, this.c);
        if (!this.d.equals((Object)"")) {
            codedOutputByteBufferNano.writeString(4, this.d);
        }
        if ((n2 = this.e) != 0) {
            codedOutputByteBufferNano.writeUInt32(5, n2);
        }
        if ((object = this.f) != null && ((bf[])object).length > 0) {
            for (n2 = 0; n2 < ((bf[])(object = this.f)).length; ++n2) {
                if ((object = object[n2]) == null) continue;
                codedOutputByteBufferNano.writeMessage(6, (MessageNano)object);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

