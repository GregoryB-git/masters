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
import java.io.IOException;

public final class wf
extends MessageNano {
    public a[] a;
    public String b;
    public long c;
    public boolean d;
    public boolean e;

    public wf() {
        this.a();
    }

    public wf a() {
        this.a = com.yandex.metrica.impl.ob.wf$a.b();
        this.b = "";
        this.c = 0L;
        this.d = false;
        this.e = false;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int n2;
        int n6 = super.computeSerializedSize();
        Object object = this.a;
        int n9 = n6;
        if (object != null) {
            n9 = n6;
            if (((a[])object).length > 0) {
                n2 = 0;
                while (true) {
                    object = this.a;
                    n9 = n6;
                    if (n2 >= ((a[])object).length) break;
                    object = object[n2];
                    n9 = n6;
                    if (object != null) {
                        n9 = n6 + CodedOutputByteBufferNano.computeMessageSize((int)1, (MessageNano)object);
                    }
                    ++n2;
                    n6 = n9;
                }
            }
        }
        n6 = CodedOutputByteBufferNano.computeStringSize((int)2, (String)this.b);
        int n10 = CodedOutputByteBufferNano.computeInt64Size((int)3, (long)this.c);
        n2 = CodedOutputByteBufferNano.computeBoolSize((int)4, (boolean)this.d);
        return CodedOutputByteBufferNano.computeBoolSize((int)5, (boolean)this.e) + (n2 + (n10 + (n6 + n9)));
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n2;
        while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
            if (n2 != 10) {
                if (n2 != 18) {
                    if (n2 != 24) {
                        if (n2 != 32) {
                            if (n2 != 40) {
                                if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                break;
                            }
                            this.e = codedInputByteBufferNano.readBool();
                            continue;
                        }
                        this.d = codedInputByteBufferNano.readBool();
                        continue;
                    }
                    this.c = codedInputByteBufferNano.readInt64();
                    continue;
                }
                this.b = codedInputByteBufferNano.readString();
                continue;
            }
            int n6 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)10);
            Object object = this.a;
            n2 = object == null ? 0 : ((a[])object).length;
            int n9 = n6 + n2;
            a[] aArray = new a[n9];
            n6 = n2;
            if (n2 != 0) {
                System.arraycopy((Object)object, (int)0, (Object)aArray, (int)0, (int)n2);
                n6 = n2;
            }
            while (n6 < n9 - 1) {
                aArray[n6] = object = new a();
                codedInputByteBufferNano.readMessage((MessageNano)object);
                codedInputByteBufferNano.readTag();
                ++n6;
            }
            aArray[n6] = object = new a();
            codedInputByteBufferNano.readMessage((MessageNano)object);
            this.a = aArray;
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Object object = this.a;
        if (object != null && ((a[])object).length > 0) {
            for (int i2 = 0; i2 < ((a[])(object = this.a)).length; ++i2) {
                if ((object = object[i2]) == null) continue;
                codedOutputByteBufferNano.writeMessage(1, (MessageNano)object);
            }
        }
        codedOutputByteBufferNano.writeString(2, this.b);
        codedOutputByteBufferNano.writeInt64(3, this.c);
        codedOutputByteBufferNano.writeBool(4, this.d);
        codedOutputByteBufferNano.writeBool(5, this.e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static final class a
    extends MessageNano {
        private static volatile a[] c;
        public String a;
        public String[] b;

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
            this.a = "";
            this.b = WireFormatNano.EMPTY_STRING_ARRAY;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            int n6 = CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a) + n2;
            Object object = this.b;
            n2 = n6;
            if (object != null) {
                n2 = n6;
                if (((String[])object).length > 0) {
                    int n9 = 0;
                    n2 = 0;
                    for (int i2 = 0; i2 < ((String[])(object = this.b)).length; ++i2) {
                        object = object[i2];
                        int n10 = n9;
                        int n11 = n2;
                        if (object != null) {
                            n11 = n2 + 1;
                            n10 = CodedOutputByteBufferNano.computeStringSizeNoTag((String)object) + n9;
                        }
                        n9 = n10;
                        n2 = n11;
                    }
                    n2 = n6 + n9 + n2 * 1;
                }
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
                    int n6 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)18);
                    String[] stringArray = this.b;
                    n2 = stringArray == null ? 0 : stringArray.length;
                    int n9 = n6 + n2;
                    String[] stringArray2 = new String[n9];
                    n6 = n2;
                    if (n2 != 0) {
                        System.arraycopy((Object)stringArray, (int)0, (Object)stringArray2, (int)0, (int)n2);
                        n6 = n2;
                    }
                    while (n6 < n9 - 1) {
                        stringArray2[n6] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        ++n6;
                    }
                    stringArray2[n6] = codedInputByteBufferNano.readString();
                    this.b = stringArray2;
                    continue;
                }
                this.a = codedInputByteBufferNano.readString();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeString(1, this.a);
            Object object = this.b;
            if (object != null && ((String[])object).length > 0) {
                for (int i2 = 0; i2 < ((String[])(object = this.b)).length; ++i2) {
                    if ((object = object[i2]) == null) continue;
                    codedOutputByteBufferNano.writeString(2, (String)object);
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }
}

