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

public final class uf
extends MessageNano {
    public a[] a;
    public String[] b;

    public uf() {
        this.a();
    }

    public uf a() {
        this.a = com.yandex.metrica.impl.ob.uf$a.b();
        this.b = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int n2;
        int n6 = super.computeSerializedSize();
        Object object = this.a;
        int n9 = 0;
        int n10 = n6;
        if (object != null) {
            n10 = n6;
            if (((a[])object).length > 0) {
                n2 = 0;
                while (true) {
                    object = this.a;
                    n10 = n6;
                    if (n2 >= ((a[])object).length) break;
                    object = object[n2];
                    n10 = n6;
                    if (object != null) {
                        n10 = n6 + CodedOutputByteBufferNano.computeMessageSize((int)1, (MessageNano)object);
                    }
                    ++n2;
                    n6 = n10;
                }
            }
        }
        object = this.b;
        n6 = n10;
        if (object != null) {
            n6 = n10;
            if (((a[])object).length > 0) {
                n2 = 0;
                int n11 = 0;
                n6 = n9;
                n9 = n2;
                while (n6 < ((a[])(object = this.b)).length) {
                    object = object[n6];
                    int n12 = n9;
                    n2 = n11;
                    if (object != null) {
                        n2 = n11 + 1;
                        n12 = CodedOutputByteBufferNano.computeStringSizeNoTag((String)object) + n9;
                    }
                    ++n6;
                    n9 = n12;
                    n11 = n2;
                }
                n6 = n10 + n9 + n11 * 1;
            }
        }
        return n6;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n2;
        while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
            Object[] objectArray;
            int n6;
            Object object;
            int n9;
            if (n2 != 10) {
                if (n2 != 18) {
                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                    break;
                }
                n9 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)18);
                object = this.b;
                n2 = object == null ? 0 : ((a[])object).length;
                n6 = n9 + n2;
                objectArray = new String[n6];
                n9 = n2;
                if (n2 != 0) {
                    System.arraycopy((Object)object, (int)0, (Object)objectArray, (int)0, (int)n2);
                    n9 = n2;
                }
                while (n9 < n6 - 1) {
                    objectArray[n9] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    ++n9;
                }
                objectArray[n9] = codedInputByteBufferNano.readString();
                this.b = objectArray;
                continue;
            }
            n9 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)10);
            object = this.a;
            n2 = object == null ? 0 : ((a[])object).length;
            n6 = n9 + n2;
            objectArray = new a[n6];
            n9 = n2;
            if (n2 != 0) {
                System.arraycopy((Object)object, (int)0, (Object)objectArray, (int)0, (int)n2);
                n9 = n2;
            }
            while (n9 < n6 - 1) {
                objectArray[n9] = object = new a();
                codedInputByteBufferNano.readMessage((MessageNano)object);
                codedInputByteBufferNano.readTag();
                ++n9;
            }
            objectArray[n9] = object = new a();
            codedInputByteBufferNano.readMessage((MessageNano)object);
            this.a = objectArray;
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int n2;
        Object object = this.a;
        int n6 = 0;
        if (object != null && ((a[])object).length > 0) {
            for (n2 = 0; n2 < ((a[])(object = this.a)).length; ++n2) {
                if ((object = object[n2]) == null) continue;
                codedOutputByteBufferNano.writeMessage(1, (MessageNano)object);
            }
        }
        if ((object = this.b) != null && ((a[])object).length > 0) {
            for (n2 = n6; n2 < ((a[])(object = this.b)).length; ++n2) {
                if ((object = object[n2]) == null) continue;
                codedOutputByteBufferNano.writeString(2, (String)object);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static final class com.yandex.metrica.impl.ob.uf$a
    extends MessageNano {
        private static volatile com.yandex.metrica.impl.ob.uf$a[] g;
        public String a;
        public String b;
        public String c;
        public a[] d;
        public long e;
        public int[] f;

        public com.yandex.metrica.impl.ob.uf$a() {
            this.a();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public static com.yandex.metrica.impl.ob.uf$a[] b() {
            Object object;
            if (g != null) return g;
            Object object2 = object = InternalNano.LAZY_INIT_LOCK;
            synchronized (object2) {
                if (g != null) return g;
                g = new com.yandex.metrica.impl.ob.uf$a[0];
                return g;
            }
        }

        public com.yandex.metrica.impl.ob.uf$a a() {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = a.b();
            this.e = 0L;
            this.f = WireFormatNano.EMPTY_INT_ARRAY;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            int n6 = CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a);
            int n9 = CodedOutputByteBufferNano.computeStringSize((int)2, (String)this.b);
            n2 = CodedOutputByteBufferNano.computeStringSize((int)3, (String)this.c) + (n9 + (n6 + n2));
            Object object = this.d;
            int n10 = 0;
            n6 = n2;
            if (object != null) {
                n6 = n2;
                if (((a[])object).length > 0) {
                    n9 = 0;
                    while (true) {
                        object = this.d;
                        n6 = n2;
                        if (n9 >= ((a[])object).length) break;
                        object = object[n9];
                        n6 = n2;
                        if (object != null) {
                            n6 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)4, (MessageNano)object);
                        }
                        ++n9;
                        n2 = n6;
                    }
                }
            }
            n6 = CodedOutputByteBufferNano.computeUInt64Size((int)5, (long)this.e) + n6;
            object = this.f;
            n2 = n6;
            if (object != null) {
                n2 = n6;
                if (((a[])object).length > 0) {
                    n9 = 0;
                    for (n2 = n10; n2 < ((a[])(object = (Object)this.f)).length; ++n2) {
                        n9 += CodedOutputByteBufferNano.computeInt32SizeNoTag((int)object[n2]);
                    }
                    n2 = n6 + n9 + ((a[])object).length * 1;
                }
            }
            return n2;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 10) {
                    if (n2 != 18) {
                        if (n2 != 26) {
                            Object object;
                            Object[] objectArray;
                            int n6;
                            int n9;
                            if (n2 != 34) {
                                if (n2 != 40) {
                                    int n10;
                                    if (n2 != 48) {
                                        if (n2 != 50) {
                                            if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                            break;
                                        }
                                        n9 = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                                        n2 = codedInputByteBufferNano.getPosition();
                                        n6 = 0;
                                        while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                                            n10 = codedInputByteBufferNano.readInt32();
                                            if (n10 != 1 && n10 != 2) continue;
                                            ++n6;
                                        }
                                        if (n6 != 0) {
                                            codedInputByteBufferNano.rewindToPosition(n2);
                                            objectArray = this.f;
                                            n2 = objectArray == null ? 0 : objectArray.length;
                                            object = new int[n6 + n2];
                                            n6 = n2;
                                            if (n2 != 0) {
                                                System.arraycopy((Object)objectArray, (int)0, (Object)object, (int)0, (int)n2);
                                                n6 = n2;
                                            }
                                            while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                                                n2 = codedInputByteBufferNano.readInt32();
                                                if (n2 != 1 && n2 != 2) continue;
                                                object[n6] = (a)n2;
                                                ++n6;
                                            }
                                            this.f = (int[])object;
                                        }
                                        codedInputByteBufferNano.popLimit(n9);
                                        continue;
                                    }
                                    n9 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)48);
                                    objectArray = new int[n9];
                                    n2 = 0;
                                    for (n6 = 0; n6 < n9; ++n6) {
                                        if (n6 != 0) {
                                            codedInputByteBufferNano.readTag();
                                        }
                                        if ((n10 = codedInputByteBufferNano.readInt32()) != 1 && n10 != 2) continue;
                                        objectArray[n2] = n10;
                                        ++n2;
                                    }
                                    if (n2 == 0) continue;
                                    object = this.f;
                                    n6 = object == null ? 0 : ((a[])object).length;
                                    if (n6 == 0 && n2 == n9) {
                                        this.f = objectArray;
                                        continue;
                                    }
                                    int[] nArray = new int[n6 + n2];
                                    if (n6 != 0) {
                                        System.arraycopy((Object)object, (int)0, (Object)nArray, (int)0, (int)n6);
                                    }
                                    System.arraycopy((Object)objectArray, (int)0, (Object)nArray, (int)n6, (int)n2);
                                    this.f = nArray;
                                    continue;
                                }
                                this.e = codedInputByteBufferNano.readUInt64();
                                continue;
                            }
                            n6 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)34);
                            object = this.d;
                            n2 = object == null ? 0 : ((a[])object).length;
                            n9 = n6 + n2;
                            objectArray = (Object[])new a[n9];
                            n6 = n2;
                            if (n2 != 0) {
                                System.arraycopy((Object)object, (int)0, (Object)objectArray, (int)0, (int)n2);
                                n6 = n2;
                            }
                            while (n6 < n9 - 1) {
                                object = new a();
                                objectArray[n6] = (int)object;
                                codedInputByteBufferNano.readMessage((MessageNano)object);
                                codedInputByteBufferNano.readTag();
                                ++n6;
                            }
                            object = new a();
                            objectArray[n6] = (int)object;
                            codedInputByteBufferNano.readMessage((MessageNano)object);
                            this.d = (a[])objectArray;
                            continue;
                        }
                        this.c = codedInputByteBufferNano.readString();
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
            codedOutputByteBufferNano.writeString(2, this.b);
            codedOutputByteBufferNano.writeString(3, this.c);
            Object object = this.d;
            int n6 = 0;
            if (object != null && ((a[])object).length > 0) {
                for (n2 = 0; n2 < ((a[])(object = this.d)).length; ++n2) {
                    if ((object = object[n2]) == null) continue;
                    codedOutputByteBufferNano.writeMessage(4, (MessageNano)object);
                }
            }
            codedOutputByteBufferNano.writeUInt64(5, this.e);
            object = this.f;
            if (object != null && ((a[])object).length > 0) {
                for (n2 = n6; n2 < ((a[])(object = (Object)this.f)).length; ++n2) {
                    codedOutputByteBufferNano.writeInt32(6, (int)object[n2]);
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static final class a
        extends MessageNano {
            private static volatile a[] c;
            public String a;
            public String b;

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
                this.b = "";
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int n2 = super.computeSerializedSize();
                int n6 = CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a);
                return CodedOutputByteBufferNano.computeStringSize((int)2, (String)this.b) + (n6 + n2);
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                int n2;
                while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                    if (n2 != 10) {
                        if (n2 != 18) {
                            if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                            break;
                        }
                        this.b = codedInputByteBufferNano.readString();
                        continue;
                    }
                    this.a = codedInputByteBufferNano.readString();
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                codedOutputByteBufferNano.writeString(1, this.a);
                codedOutputByteBufferNano.writeString(2, this.b);
                super.writeTo(codedOutputByteBufferNano);
            }
        }
    }
}

