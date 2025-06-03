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

public final class df
extends MessageNano {
    private static volatile df[] f;
    public String a;
    public String b;
    public bf[] c;
    public df d;
    public df[] e;

    public df() {
        this.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public df a() {
        this.a = "";
        this.b = "";
        this.c = bf.b();
        this.d = null;
        if (f == null) {
            Object object;
            Object object2 = object = InternalNano.LAZY_INIT_LOCK;
            synchronized (object2) {
                if (f == null) {
                    f = new df[0];
                }
            }
        }
        this.e = f;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int n2;
        int n3;
        int n5 = super.computeSerializedSize();
        n5 = n3 = CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a) + n5;
        if (!this.b.equals((Object)"")) {
            n5 = n3 + CodedOutputByteBufferNano.computeStringSize((int)2, (String)this.b);
        }
        Object object = this.c;
        int n6 = 0;
        n3 = n5;
        if (object != null) {
            n3 = n5;
            if (((bf[])object).length > 0) {
                n2 = 0;
                while (true) {
                    object = this.c;
                    n3 = n5;
                    if (n2 >= ((bf[])object).length) break;
                    object = object[n2];
                    n3 = n5;
                    if (object != null) {
                        n3 = n5 + CodedOutputByteBufferNano.computeMessageSize((int)3, (MessageNano)object);
                    }
                    ++n2;
                    n5 = n3;
                }
            }
        }
        object = this.d;
        n5 = n3;
        if (object != null) {
            n5 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)4, (MessageNano)object);
        }
        object = this.e;
        n2 = n5;
        if (object != null) {
            n2 = n5;
            if (((bf[])object).length > 0) {
                n3 = n6;
                while (true) {
                    object = this.e;
                    n2 = n5;
                    if (n3 >= ((bf[])object).length) break;
                    object = object[n3];
                    n2 = n5;
                    if (object != null) {
                        n2 = n5 + CodedOutputByteBufferNano.computeMessageSize((int)5, (MessageNano)object);
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
                if (n2 != 18) {
                    MessageNano[] messageNanoArray;
                    int n3;
                    Object object;
                    int n5;
                    if (n2 != 26) {
                        if (n2 != 34) {
                            if (n2 != 42) {
                                if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                break;
                            }
                            n5 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)42);
                            object = this.e;
                            n2 = object == null ? 0 : ((MessageNano[])object).length;
                            n3 = n5 + n2;
                            messageNanoArray = new df[n3];
                            n5 = n2;
                            if (n2 != 0) {
                                System.arraycopy((Object)object, (int)0, (Object)messageNanoArray, (int)0, (int)n2);
                                n5 = n2;
                            }
                            while (n5 < n3 - 1) {
                                messageNanoArray[n5] = object = new df();
                                codedInputByteBufferNano.readMessage((MessageNano)object);
                                codedInputByteBufferNano.readTag();
                                ++n5;
                            }
                            messageNanoArray[n5] = object = new df();
                            codedInputByteBufferNano.readMessage((MessageNano)object);
                            this.e = messageNanoArray;
                            continue;
                        }
                        if (this.d == null) {
                            this.d = new df();
                        }
                        codedInputByteBufferNano.readMessage((MessageNano)this.d);
                        continue;
                    }
                    n5 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)26);
                    object = this.c;
                    n2 = object == null ? 0 : ((bf[])object).length;
                    n3 = n5 + n2;
                    messageNanoArray = new bf[n3];
                    n5 = n2;
                    if (n2 != 0) {
                        System.arraycopy((Object)object, (int)0, (Object)messageNanoArray, (int)0, (int)n2);
                        n5 = n2;
                    }
                    while (n5 < n3 - 1) {
                        messageNanoArray[n5] = object = new bf();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        codedInputByteBufferNano.readTag();
                        ++n5;
                    }
                    messageNanoArray[n5] = object = new bf();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    this.c = messageNanoArray;
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
        int n2;
        codedOutputByteBufferNano.writeString(1, this.a);
        if (!this.b.equals((Object)"")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        Object object = this.c;
        int n3 = 0;
        if (object != null && ((bf[])object).length > 0) {
            for (n2 = 0; n2 < ((bf[])(object = this.c)).length; ++n2) {
                if ((object = object[n2]) == null) continue;
                codedOutputByteBufferNano.writeMessage(3, (MessageNano)object);
            }
        }
        if ((object = this.d) != null) {
            codedOutputByteBufferNano.writeMessage(4, (MessageNano)object);
        }
        if ((object = this.e) != null && ((bf[])object).length > 0) {
            for (n2 = n3; n2 < ((bf[])(object = this.e)).length; ++n2) {
                if ((object = object[n2]) == null) continue;
                codedOutputByteBufferNano.writeMessage(5, (MessageNano)object);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

