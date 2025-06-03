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
 *  java.util.Arrays
 */
package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import com.yandex.metrica.impl.ob.gf;
import com.yandex.metrica.impl.ob.jf;
import java.io.IOException;
import java.util.Arrays;

public final class if
extends MessageNano {
    public d[] a;
    public c b;
    public a[] c;
    public e[] d;
    public String[] e;

    public if() {
        this.a();
    }

    public if a() {
        this.a = com.yandex.metrica.impl.ob.if$d.b();
        this.b = null;
        this.c = com.yandex.metrica.impl.ob.if$a.b();
        this.d = com.yandex.metrica.impl.ob.if$e.b();
        this.e = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int n2;
        int n3 = super.computeSerializedSize();
        Object object = this.a;
        int n5 = 0;
        int n6 = n3;
        if (object != null) {
            n6 = n3;
            if (((d[])object).length > 0) {
                n2 = 0;
                while (true) {
                    object = this.a;
                    n6 = n3;
                    if (n2 >= ((d[])object).length) break;
                    object = object[n2];
                    n6 = n3;
                    if (object != null) {
                        n6 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)3, (MessageNano)object);
                    }
                    ++n2;
                    n3 = n6;
                }
            }
        }
        object = this.b;
        n3 = n6;
        if (object != null) {
            n3 = n6 + CodedOutputByteBufferNano.computeMessageSize((int)4, (MessageNano)object);
        }
        object = this.c;
        n6 = n3;
        if (object != null) {
            n6 = n3;
            if (((d[])object).length > 0) {
                n2 = 0;
                while (true) {
                    object = this.c;
                    n6 = n3;
                    if (n2 >= ((d[])object).length) break;
                    object = object[n2];
                    n6 = n3;
                    if (object != null) {
                        n6 = CodedOutputByteBufferNano.computeMessageSize((int)7, (MessageNano)object) + n3;
                    }
                    ++n2;
                    n3 = n6;
                }
            }
        }
        object = this.d;
        n3 = n6;
        if (object != null) {
            n3 = n6;
            if (((d[])object).length > 0) {
                n2 = 0;
                while (true) {
                    object = this.d;
                    n3 = n6;
                    if (n2 >= ((d[])object).length) break;
                    object = object[n2];
                    n3 = n6;
                    if (object != null) {
                        n3 = n6 + CodedOutputByteBufferNano.computeMessageSize((int)10, (MessageNano)object);
                    }
                    ++n2;
                    n6 = n3;
                }
            }
        }
        object = this.e;
        n6 = n3;
        if (object != null) {
            n6 = n3;
            if (((d[])object).length > 0) {
                n2 = 0;
                int n9 = 0;
                n6 = n5;
                n5 = n2;
                while (n6 < ((d[])(object = this.e)).length) {
                    object = object[n6];
                    int n10 = n5;
                    n2 = n9;
                    if (object != null) {
                        n2 = n9 + 1;
                        n10 = CodedOutputByteBufferNano.computeStringSizeNoTag((String)object) + n5;
                    }
                    ++n6;
                    n5 = n10;
                    n9 = n2;
                }
                n6 = n3 + n5 + n9 * 1;
            }
        }
        return n6;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n2;
        while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
            Object[] objectArray;
            int n3;
            Object object;
            int n5;
            if (n2 != 26) {
                if (n2 != 34) {
                    if (n2 != 58) {
                        if (n2 != 82) {
                            if (n2 != 90) {
                                if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                break;
                            }
                            n5 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)90);
                            object = this.e;
                            n2 = object == null ? 0 : ((MessageNano[])object).length;
                            n3 = n5 + n2;
                            objectArray = new String[n3];
                            n5 = n2;
                            if (n2 != 0) {
                                System.arraycopy((Object)object, (int)0, (Object)objectArray, (int)0, (int)n2);
                                n5 = n2;
                            }
                            while (n5 < n3 - 1) {
                                objectArray[n5] = codedInputByteBufferNano.readString();
                                codedInputByteBufferNano.readTag();
                                ++n5;
                            }
                            objectArray[n5] = codedInputByteBufferNano.readString();
                            this.e = objectArray;
                            continue;
                        }
                        n5 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)82);
                        object = this.d;
                        n2 = object == null ? 0 : ((MessageNano[])object).length;
                        n3 = n5 + n2;
                        objectArray = new e[n3];
                        n5 = n2;
                        if (n2 != 0) {
                            System.arraycopy((Object)object, (int)0, (Object)objectArray, (int)0, (int)n2);
                            n5 = n2;
                        }
                        while (n5 < n3 - 1) {
                            objectArray[n5] = object = new e();
                            codedInputByteBufferNano.readMessage((MessageNano)object);
                            codedInputByteBufferNano.readTag();
                            ++n5;
                        }
                        objectArray[n5] = object = new e();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        this.d = objectArray;
                        continue;
                    }
                    n5 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)58);
                    object = this.c;
                    n2 = object == null ? 0 : ((MessageNano[])object).length;
                    n3 = n5 + n2;
                    objectArray = new a[n3];
                    n5 = n2;
                    if (n2 != 0) {
                        System.arraycopy((Object)object, (int)0, (Object)objectArray, (int)0, (int)n2);
                        n5 = n2;
                    }
                    while (n5 < n3 - 1) {
                        objectArray[n5] = object = new a();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        codedInputByteBufferNano.readTag();
                        ++n5;
                    }
                    objectArray[n5] = object = new a();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    this.c = objectArray;
                    continue;
                }
                if (this.b == null) {
                    this.b = new c();
                }
                codedInputByteBufferNano.readMessage((MessageNano)this.b);
                continue;
            }
            n5 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)26);
            object = this.a;
            n2 = object == null ? 0 : ((d[])object).length;
            n3 = n5 + n2;
            objectArray = new d[n3];
            n5 = n2;
            if (n2 != 0) {
                System.arraycopy((Object)object, (int)0, (Object)objectArray, (int)0, (int)n2);
                n5 = n2;
            }
            while (n5 < n3 - 1) {
                objectArray[n5] = object = new d();
                codedInputByteBufferNano.readMessage((MessageNano)object);
                codedInputByteBufferNano.readTag();
                ++n5;
            }
            objectArray[n5] = object = new d();
            codedInputByteBufferNano.readMessage((MessageNano)object);
            this.a = objectArray;
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int n2;
        Object object = this.a;
        int n3 = 0;
        if (object != null && ((d[])object).length > 0) {
            for (n2 = 0; n2 < ((d[])(object = this.a)).length; ++n2) {
                if ((object = object[n2]) == null) continue;
                codedOutputByteBufferNano.writeMessage(3, (MessageNano)object);
            }
        }
        if ((object = this.b) != null) {
            codedOutputByteBufferNano.writeMessage(4, (MessageNano)object);
        }
        if ((object = this.c) != null && ((d[])object).length > 0) {
            for (n2 = 0; n2 < ((d[])(object = this.c)).length; ++n2) {
                if ((object = object[n2]) == null) continue;
                codedOutputByteBufferNano.writeMessage(7, (MessageNano)object);
            }
        }
        if ((object = this.d) != null && ((d[])object).length > 0) {
            for (n2 = 0; n2 < ((d[])(object = this.d)).length; ++n2) {
                if ((object = object[n2]) == null) continue;
                codedOutputByteBufferNano.writeMessage(10, (MessageNano)object);
            }
        }
        if ((object = this.e) != null && ((d[])object).length > 0) {
            for (n2 = n3; n2 < ((d[])(object = this.e)).length; ++n2) {
                if ((object = object[n2]) == null) continue;
                codedOutputByteBufferNano.writeString(11, (String)object);
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
            int n3 = CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a);
            return CodedOutputByteBufferNano.computeStringSize((int)2, (String)this.b) + (n3 + n2);
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

    public static final class b
    extends MessageNano {
        public double a;
        public double b;
        public long c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public String i;

        public b() {
            this.a();
        }

        public b a() {
            this.a = 0.0;
            this.b = 0.0;
            this.c = 0L;
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = "";
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            int n3 = CodedOutputByteBufferNano.computeDoubleSize((int)1, (double)this.a);
            n2 = CodedOutputByteBufferNano.computeDoubleSize((int)2, (double)this.b) + (n3 + n2);
            long l2 = this.c;
            n3 = n2;
            if (l2 != 0L) {
                n3 = n2 + CodedOutputByteBufferNano.computeUInt64Size((int)3, (long)l2);
            }
            int n5 = this.d;
            n2 = n3;
            if (n5 != 0) {
                n2 = n3 + CodedOutputByteBufferNano.computeUInt32Size((int)4, (int)n5);
            }
            n5 = this.e;
            n3 = n2;
            if (n5 != 0) {
                n3 = n2 + CodedOutputByteBufferNano.computeUInt32Size((int)5, (int)n5);
            }
            n5 = this.f;
            n2 = n3;
            if (n5 != 0) {
                n2 = n3 + CodedOutputByteBufferNano.computeUInt32Size((int)6, (int)n5);
            }
            n5 = this.g;
            n3 = n2;
            if (n5 != 0) {
                n3 = n2 + CodedOutputByteBufferNano.computeInt32Size((int)7, (int)n5);
            }
            n5 = this.h;
            n2 = n3;
            if (n5 != 0) {
                n2 = n3 + CodedOutputByteBufferNano.computeInt32Size((int)8, (int)n5);
            }
            n3 = n2;
            if (!this.i.equals((Object)"")) {
                n3 = n2 + CodedOutputByteBufferNano.computeStringSize((int)9, (String)this.i);
            }
            return n3;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 9) {
                    if (n2 != 17) {
                        if (n2 != 24) {
                            if (n2 != 32) {
                                if (n2 != 40) {
                                    if (n2 != 48) {
                                        if (n2 != 56) {
                                            if (n2 != 64) {
                                                if (n2 != 74) {
                                                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                                    break;
                                                }
                                                this.i = codedInputByteBufferNano.readString();
                                                continue;
                                            }
                                            n2 = codedInputByteBufferNano.readInt32();
                                            if (n2 != 0 && n2 != 1 && n2 != 2) continue;
                                            this.h = n2;
                                            continue;
                                        }
                                        this.g = codedInputByteBufferNano.readInt32();
                                        continue;
                                    }
                                    this.f = codedInputByteBufferNano.readUInt32();
                                    continue;
                                }
                                this.e = codedInputByteBufferNano.readUInt32();
                                continue;
                            }
                            this.d = codedInputByteBufferNano.readUInt32();
                            continue;
                        }
                        this.c = codedInputByteBufferNano.readUInt64();
                        continue;
                    }
                    this.b = codedInputByteBufferNano.readDouble();
                    continue;
                }
                this.a = codedInputByteBufferNano.readDouble();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int n2;
            codedOutputByteBufferNano.writeDouble(1, this.a);
            codedOutputByteBufferNano.writeDouble(2, this.b);
            long l2 = this.c;
            if (l2 != 0L) {
                codedOutputByteBufferNano.writeUInt64(3, l2);
            }
            if ((n2 = this.d) != 0) {
                codedOutputByteBufferNano.writeUInt32(4, n2);
            }
            if ((n2 = this.e) != 0) {
                codedOutputByteBufferNano.writeUInt32(5, n2);
            }
            if ((n2 = this.f) != 0) {
                codedOutputByteBufferNano.writeUInt32(6, n2);
            }
            if ((n2 = this.g) != 0) {
                codedOutputByteBufferNano.writeInt32(7, n2);
            }
            if ((n2 = this.h) != 0) {
                codedOutputByteBufferNano.writeInt32(8, n2);
            }
            if (!this.i.equals((Object)"")) {
                codedOutputByteBufferNano.writeString(9, this.i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class c
    extends MessageNano {
        public String a;
        public String b;
        public String c;
        public int d;
        public String e;
        public String f;
        public boolean g;
        public int h;
        public String i;
        public String j;
        public int k;
        public a[] l;
        public String m;

        public c() {
            this.a();
        }

        public c a() {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = 0;
            this.e = "";
            this.f = "";
            this.g = false;
            this.h = 0;
            this.i = "";
            this.j = "";
            this.k = 0;
            this.l = a.b();
            this.m = "";
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
            n3 = n2;
            if (!this.c.equals((Object)"")) {
                n3 = n2 + CodedOutputByteBufferNano.computeStringSize((int)4, (String)this.c);
            }
            int n5 = this.d;
            n2 = n3;
            if (n5 != 0) {
                n2 = n3 + CodedOutputByteBufferNano.computeUInt32Size((int)5, (int)n5);
            }
            n3 = n2;
            if (!this.e.equals((Object)"")) {
                n3 = n2 + CodedOutputByteBufferNano.computeStringSize((int)10, (String)this.e);
            }
            n5 = n3;
            if (!this.f.equals((Object)"")) {
                n5 = n3 + CodedOutputByteBufferNano.computeStringSize((int)15, (String)this.f);
            }
            boolean bl2 = this.g;
            n2 = n5;
            if (bl2) {
                n2 = n5 + CodedOutputByteBufferNano.computeBoolSize((int)17, (boolean)bl2);
            }
            n5 = this.h;
            n3 = n2;
            if (n5 != 0) {
                n3 = n2 + CodedOutputByteBufferNano.computeUInt32Size((int)18, (int)n5);
            }
            n5 = n3;
            if (!this.i.equals((Object)"")) {
                n5 = n3 + CodedOutputByteBufferNano.computeStringSize((int)19, (String)this.i);
            }
            n2 = n5;
            if (!this.j.equals((Object)"")) {
                n2 = n5 + CodedOutputByteBufferNano.computeStringSize((int)21, (String)this.j);
            }
            n5 = this.k;
            n3 = n2;
            if (n5 != 0) {
                n3 = n2 + CodedOutputByteBufferNano.computeUInt32Size((int)22, (int)n5);
            }
            Object object = this.l;
            n2 = n3;
            if (object != null) {
                n2 = n3;
                if (((a[])object).length > 0) {
                    n5 = 0;
                    while (true) {
                        object = this.l;
                        n2 = n3;
                        if (n5 >= ((a[])object).length) break;
                        object = object[n5];
                        n2 = n3;
                        if (object != null) {
                            n2 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)23, (MessageNano)object);
                        }
                        ++n5;
                        n3 = n2;
                    }
                }
            }
            n3 = n2;
            if (!this.m.equals((Object)"")) {
                n3 = n2 + CodedOutputByteBufferNano.computeStringSize((int)24, (String)this.m);
            }
            return n3;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            block16: while (true) {
                int n2 = codedInputByteBufferNano.readTag();
                switch (n2) {
                    default: {
                        if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue block16;
                        break block16;
                    }
                    case 194: {
                        this.m = codedInputByteBufferNano.readString();
                        continue block16;
                    }
                    case 186: {
                        int n3 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)186);
                        Object object = this.l;
                        n2 = object == null ? 0 : ((a[])object).length;
                        int n5 = n3 + n2;
                        a[] aArray = new a[n5];
                        n3 = n2;
                        if (n2 != 0) {
                            System.arraycopy((Object)object, (int)0, (Object)aArray, (int)0, (int)n2);
                            n3 = n2;
                        }
                        while (n3 < n5 - 1) {
                            aArray[n3] = object = new a();
                            codedInputByteBufferNano.readMessage((MessageNano)object);
                            codedInputByteBufferNano.readTag();
                            ++n3;
                        }
                        aArray[n3] = object = new a();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        this.l = aArray;
                        continue block16;
                    }
                    case 176: {
                        this.k = codedInputByteBufferNano.readUInt32();
                        continue block16;
                    }
                    case 170: {
                        this.j = codedInputByteBufferNano.readString();
                        continue block16;
                    }
                    case 154: {
                        this.i = codedInputByteBufferNano.readString();
                        continue block16;
                    }
                    case 144: {
                        this.h = codedInputByteBufferNano.readUInt32();
                        continue block16;
                    }
                    case 136: {
                        this.g = codedInputByteBufferNano.readBool();
                        continue block16;
                    }
                    case 122: {
                        this.f = codedInputByteBufferNano.readString();
                        continue block16;
                    }
                    case 82: {
                        this.e = codedInputByteBufferNano.readString();
                        continue block16;
                    }
                    case 40: {
                        this.d = codedInputByteBufferNano.readUInt32();
                        continue block16;
                    }
                    case 34: {
                        this.c = codedInputByteBufferNano.readString();
                        continue block16;
                    }
                    case 18: {
                        this.b = codedInputByteBufferNano.readString();
                        continue block16;
                    }
                    case 10: {
                        this.a = codedInputByteBufferNano.readString();
                        continue block16;
                    }
                    case 0: 
                }
                break;
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Object object;
            boolean bl2;
            int n2;
            if (!this.a.equals((Object)"")) {
                codedOutputByteBufferNano.writeString(1, this.a);
            }
            if (!this.b.equals((Object)"")) {
                codedOutputByteBufferNano.writeString(2, this.b);
            }
            if (!this.c.equals((Object)"")) {
                codedOutputByteBufferNano.writeString(4, this.c);
            }
            if ((n2 = this.d) != 0) {
                codedOutputByteBufferNano.writeUInt32(5, n2);
            }
            if (!this.e.equals((Object)"")) {
                codedOutputByteBufferNano.writeString(10, this.e);
            }
            if (!this.f.equals((Object)"")) {
                codedOutputByteBufferNano.writeString(15, this.f);
            }
            if (bl2 = this.g) {
                codedOutputByteBufferNano.writeBool(17, bl2);
            }
            if ((n2 = this.h) != 0) {
                codedOutputByteBufferNano.writeUInt32(18, n2);
            }
            if (!this.i.equals((Object)"")) {
                codedOutputByteBufferNano.writeString(19, this.i);
            }
            if (!this.j.equals((Object)"")) {
                codedOutputByteBufferNano.writeString(21, this.j);
            }
            if ((n2 = this.k) != 0) {
                codedOutputByteBufferNano.writeUInt32(22, n2);
            }
            if ((object = this.l) != null && ((a[])object).length > 0) {
                for (n2 = 0; n2 < ((a[])(object = this.l)).length; ++n2) {
                    if ((object = object[n2]) == null) continue;
                    codedOutputByteBufferNano.writeMessage(23, (MessageNano)object);
                }
            }
            if (!this.m.equals((Object)"")) {
                codedOutputByteBufferNano.writeString(24, this.m);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static final class a
        extends MessageNano {
            private static volatile a[] c;
            public String a;
            public long b;

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
                this.b = 0L;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int n2 = super.computeSerializedSize();
                int n3 = CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a);
                return CodedOutputByteBufferNano.computeUInt64Size((int)2, (long)this.b) + (n3 + n2);
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                int n2;
                while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                    if (n2 != 10) {
                        if (n2 != 16) {
                            if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                            break;
                        }
                        this.b = codedInputByteBufferNano.readUInt64();
                        continue;
                    }
                    this.a = codedInputByteBufferNano.readString();
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                codedOutputByteBufferNano.writeString(1, this.a);
                codedOutputByteBufferNano.writeUInt64(2, this.b);
                super.writeTo(codedOutputByteBufferNano);
            }
        }
    }

    public static final class d
    extends MessageNano {
        private static volatile d[] d;
        public long a;
        public b b;
        public a[] c;

        public d() {
            this.a();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public static d[] b() {
            Object object;
            if (d != null) return d;
            Object object2 = object = InternalNano.LAZY_INIT_LOCK;
            synchronized (object2) {
                if (d != null) return d;
                d = new d[0];
                return d;
            }
        }

        public d a() {
            this.a = 0L;
            this.b = null;
            this.c = a.b();
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            int n3 = CodedOutputByteBufferNano.computeUInt64Size((int)1, (long)this.a) + n2;
            Object object = this.b;
            n2 = n3;
            if (object != null) {
                n2 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)2, (MessageNano)object);
            }
            object = this.c;
            int n5 = n2;
            if (object != null) {
                n5 = n2;
                if (((a[])object).length > 0) {
                    n3 = 0;
                    while (true) {
                        object = this.c;
                        n5 = n2;
                        if (n3 >= ((a[])object).length) break;
                        object = object[n3];
                        n5 = n2;
                        if (object != null) {
                            n5 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)3, (MessageNano)object);
                        }
                        ++n3;
                        n2 = n5;
                    }
                }
            }
            return n5;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 8) {
                    if (n2 != 18) {
                        if (n2 != 26) {
                            if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                            break;
                        }
                        int n3 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)26);
                        Object object = this.c;
                        n2 = object == null ? 0 : ((a[])object).length;
                        int n5 = n3 + n2;
                        a[] aArray = new a[n5];
                        n3 = n2;
                        if (n2 != 0) {
                            System.arraycopy((Object)object, (int)0, (Object)aArray, (int)0, (int)n2);
                            n3 = n2;
                        }
                        while (n3 < n5 - 1) {
                            aArray[n3] = object = new a();
                            codedInputByteBufferNano.readMessage((MessageNano)object);
                            codedInputByteBufferNano.readTag();
                            ++n3;
                        }
                        aArray[n3] = object = new a();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        this.c = aArray;
                        continue;
                    }
                    if (this.b == null) {
                        this.b = new b();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.b);
                    continue;
                }
                this.a = codedInputByteBufferNano.readUInt64();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeUInt64(1, this.a);
            Object object = this.b;
            if (object != null) {
                codedOutputByteBufferNano.writeMessage(2, (MessageNano)object);
            }
            if ((object = this.c) != null && ((a[])object).length > 0) {
                for (int i2 = 0; i2 < ((a[])(object = this.c)).length; ++i2) {
                    if ((object = object[i2]) == null) continue;
                    codedOutputByteBufferNano.writeMessage(3, (MessageNano)object);
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static final class com.yandex.metrica.impl.ob.if$d$a
        extends MessageNano {
            private static volatile com.yandex.metrica.impl.ob.if$d$a[] x;
            public long a;
            public long b;
            public int c;
            public String d;
            public byte[] e;
            public com.yandex.metrica.impl.ob.if$b f;
            public b g;
            public String h;
            public a i;
            public int j;
            public int k;
            public int l;
            public byte[] m;
            public int n;
            public long o;
            public long p;
            public int q;
            public int r;
            public int s;
            public int t;
            public int u;
            public boolean v;
            public long w;

            public com.yandex.metrica.impl.ob.if$d$a() {
                this.a();
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public static com.yandex.metrica.impl.ob.if$d$a[] b() {
                Object object;
                if (x != null) return x;
                Object object2 = object = InternalNano.LAZY_INIT_LOCK;
                synchronized (object2) {
                    if (x != null) return x;
                    x = new com.yandex.metrica.impl.ob.if$d$a[0];
                    return x;
                }
            }

            public com.yandex.metrica.impl.ob.if$d$a a() {
                this.a = 0L;
                this.b = 0L;
                this.c = 0;
                this.d = "";
                byte[] byArray = WireFormatNano.EMPTY_BYTES;
                this.e = byArray;
                this.f = null;
                this.g = null;
                this.h = "";
                this.i = null;
                this.j = 0;
                this.k = 0;
                this.l = -1;
                this.m = byArray;
                this.n = -1;
                this.o = 0L;
                this.p = 0L;
                this.q = 0;
                this.r = 0;
                this.s = -1;
                this.t = 0;
                this.u = 0;
                this.v = false;
                this.w = 1L;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int n2 = super.computeSerializedSize();
                int n3 = CodedOutputByteBufferNano.computeUInt64Size((int)1, (long)this.a);
                int n5 = CodedOutputByteBufferNano.computeUInt64Size((int)2, (long)this.b);
                n3 = n2 = CodedOutputByteBufferNano.computeUInt32Size((int)3, (int)this.c) + (n5 + (n3 + n2));
                if (!this.d.equals((Object)"")) {
                    n3 = n2 + CodedOutputByteBufferNano.computeStringSize((int)4, (String)this.d);
                }
                Object object = this.e;
                byte[] byArray = WireFormatNano.EMPTY_BYTES;
                n2 = n3;
                if (!Arrays.equals((byte[])object, (byte[])byArray)) {
                    n2 = n3 + CodedOutputByteBufferNano.computeBytesSize((int)5, (byte[])this.e);
                }
                object = (Object)this.f;
                n3 = n2;
                if (object != null) {
                    n3 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)6, (MessageNano)object);
                }
                object = (Object)this.g;
                n5 = n3;
                if (object != null) {
                    n5 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)7, (MessageNano)object);
                }
                n2 = n5;
                if (!this.h.equals((Object)"")) {
                    n2 = n5 + CodedOutputByteBufferNano.computeStringSize((int)8, (String)this.h);
                }
                object = (Object)this.i;
                n3 = n2;
                if (object != null) {
                    n3 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)9, (MessageNano)object);
                }
                n5 = this.j;
                n2 = n3;
                if (n5 != 0) {
                    n2 = n3 + CodedOutputByteBufferNano.computeUInt32Size((int)10, (int)n5);
                }
                n5 = this.k;
                n3 = n2;
                if (n5 != 0) {
                    n3 = n2 + CodedOutputByteBufferNano.computeInt32Size((int)12, (int)n5);
                }
                n5 = this.l;
                n2 = n3;
                if (n5 != -1) {
                    n2 = n3 + CodedOutputByteBufferNano.computeInt32Size((int)13, (int)n5);
                }
                n3 = n2;
                if (!Arrays.equals((byte[])this.m, (byte[])byArray)) {
                    n3 = n2 + CodedOutputByteBufferNano.computeBytesSize((int)14, (byte[])this.m);
                }
                n5 = this.n;
                n2 = n3;
                if (n5 != -1) {
                    n2 = n3 + CodedOutputByteBufferNano.computeInt32Size((int)15, (int)n5);
                }
                long l2 = this.o;
                n5 = n2;
                if (l2 != 0L) {
                    n5 = n2 + CodedOutputByteBufferNano.computeUInt64Size((int)16, (long)l2);
                }
                l2 = this.p;
                n3 = n5;
                if (l2 != 0L) {
                    n3 = n5 + CodedOutputByteBufferNano.computeUInt64Size((int)17, (long)l2);
                }
                n5 = this.q;
                n2 = n3;
                if (n5 != 0) {
                    n2 = n3 + CodedOutputByteBufferNano.computeInt32Size((int)18, (int)n5);
                }
                n5 = this.r;
                n3 = n2;
                if (n5 != 0) {
                    n3 = n2 + CodedOutputByteBufferNano.computeInt32Size((int)19, (int)n5);
                }
                n5 = this.s;
                n2 = n3;
                if (n5 != -1) {
                    n2 = n3 + CodedOutputByteBufferNano.computeInt32Size((int)20, (int)n5);
                }
                n5 = this.t;
                n3 = n2;
                if (n5 != 0) {
                    n3 = n2 + CodedOutputByteBufferNano.computeInt32Size((int)21, (int)n5);
                }
                n5 = this.u;
                n2 = n3;
                if (n5 != 0) {
                    n2 = n3 + CodedOutputByteBufferNano.computeInt32Size((int)22, (int)n5);
                }
                boolean bl2 = this.v;
                n3 = n2;
                if (bl2) {
                    n3 = n2 + CodedOutputByteBufferNano.computeBoolSize((int)23, (boolean)bl2);
                }
                l2 = this.w;
                n2 = n3;
                if (l2 != 1L) {
                    n2 = n3 + CodedOutputByteBufferNano.computeUInt64Size((int)24, (long)l2);
                }
                return n2;
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                block26: while (true) {
                    int n2 = codedInputByteBufferNano.readTag();
                    switch (n2) {
                        default: {
                            if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue block26;
                            break block26;
                        }
                        case 192: {
                            this.w = codedInputByteBufferNano.readUInt64();
                            continue block26;
                        }
                        case 184: {
                            this.v = codedInputByteBufferNano.readBool();
                            continue block26;
                        }
                        case 176: {
                            n2 = codedInputByteBufferNano.readInt32();
                            if (n2 != 0 && n2 != 1) continue block26;
                            this.u = n2;
                            continue block26;
                        }
                        case 168: {
                            n2 = codedInputByteBufferNano.readInt32();
                            if (n2 != 0 && n2 != 1 && n2 != 2 && n2 != 3) continue block26;
                            this.t = n2;
                            continue block26;
                        }
                        case 160: {
                            n2 = codedInputByteBufferNano.readInt32();
                            if (n2 != -1 && n2 != 0 && n2 != 1) continue block26;
                            this.s = n2;
                            continue block26;
                        }
                        case 152: {
                            n2 = codedInputByteBufferNano.readInt32();
                            if (n2 != 0 && n2 != 1 && n2 != 2 && n2 != 3) continue block26;
                            this.r = n2;
                            continue block26;
                        }
                        case 144: {
                            n2 = codedInputByteBufferNano.readInt32();
                            if (n2 != 0 && n2 != 1 && n2 != 2 && n2 != 3 && n2 != 4) continue block26;
                            this.q = n2;
                            continue block26;
                        }
                        case 136: {
                            this.p = codedInputByteBufferNano.readUInt64();
                            continue block26;
                        }
                        case 128: {
                            this.o = codedInputByteBufferNano.readUInt64();
                            continue block26;
                        }
                        case 120: {
                            n2 = codedInputByteBufferNano.readInt32();
                            if (n2 != -1 && n2 != 0 && n2 != 1) continue block26;
                            this.n = n2;
                            continue block26;
                        }
                        case 114: {
                            this.m = codedInputByteBufferNano.readBytes();
                            continue block26;
                        }
                        case 104: {
                            n2 = codedInputByteBufferNano.readInt32();
                            if (n2 != -1 && n2 != 0 && n2 != 1) continue block26;
                            this.l = n2;
                            continue block26;
                        }
                        case 96: {
                            n2 = codedInputByteBufferNano.readInt32();
                            if (n2 != 0 && n2 != 1 && n2 != 2) continue block26;
                            this.k = n2;
                            continue block26;
                        }
                        case 80: {
                            this.j = codedInputByteBufferNano.readUInt32();
                            continue block26;
                        }
                        case 74: {
                            if (this.i == null) {
                                this.i = new a();
                            }
                            codedInputByteBufferNano.readMessage((MessageNano)this.i);
                            continue block26;
                        }
                        case 66: {
                            this.h = codedInputByteBufferNano.readString();
                            continue block26;
                        }
                        case 58: {
                            if (this.g == null) {
                                this.g = new b();
                            }
                            codedInputByteBufferNano.readMessage((MessageNano)this.g);
                            continue block26;
                        }
                        case 50: {
                            if (this.f == null) {
                                this.f = new com.yandex.metrica.impl.ob.if$b();
                            }
                            codedInputByteBufferNano.readMessage((MessageNano)this.f);
                            continue block26;
                        }
                        case 42: {
                            this.e = codedInputByteBufferNano.readBytes();
                            continue block26;
                        }
                        case 34: {
                            this.d = codedInputByteBufferNano.readString();
                            continue block26;
                        }
                        case 24: {
                            this.c = codedInputByteBufferNano.readUInt32();
                            continue block26;
                        }
                        case 16: {
                            this.b = codedInputByteBufferNano.readUInt64();
                            continue block26;
                        }
                        case 8: {
                            this.a = codedInputByteBufferNano.readUInt64();
                            continue block26;
                        }
                        case 0: 
                    }
                    break;
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                boolean bl2;
                long l2;
                int n2;
                byte[] byArray;
                Object object;
                codedOutputByteBufferNano.writeUInt64(1, this.a);
                codedOutputByteBufferNano.writeUInt64(2, this.b);
                codedOutputByteBufferNano.writeUInt32(3, this.c);
                if (!this.d.equals((Object)"")) {
                    codedOutputByteBufferNano.writeString(4, this.d);
                }
                if (!Arrays.equals((byte[])(object = this.e), (byte[])(byArray = WireFormatNano.EMPTY_BYTES))) {
                    codedOutputByteBufferNano.writeBytes(5, this.e);
                }
                if ((object = (Object)((Object)this.f)) != null) {
                    codedOutputByteBufferNano.writeMessage(6, (MessageNano)object);
                }
                if ((object = (Object)((Object)this.g)) != null) {
                    codedOutputByteBufferNano.writeMessage(7, (MessageNano)object);
                }
                if (!this.h.equals((Object)"")) {
                    codedOutputByteBufferNano.writeString(8, this.h);
                }
                if ((object = (Object)((Object)this.i)) != null) {
                    codedOutputByteBufferNano.writeMessage(9, (MessageNano)object);
                }
                if ((n2 = this.j) != 0) {
                    codedOutputByteBufferNano.writeUInt32(10, n2);
                }
                if ((n2 = this.k) != 0) {
                    codedOutputByteBufferNano.writeInt32(12, n2);
                }
                if ((n2 = this.l) != -1) {
                    codedOutputByteBufferNano.writeInt32(13, n2);
                }
                if (!Arrays.equals((byte[])this.m, (byte[])byArray)) {
                    codedOutputByteBufferNano.writeBytes(14, this.m);
                }
                if ((n2 = this.n) != -1) {
                    codedOutputByteBufferNano.writeInt32(15, n2);
                }
                if ((l2 = this.o) != 0L) {
                    codedOutputByteBufferNano.writeUInt64(16, l2);
                }
                if ((l2 = this.p) != 0L) {
                    codedOutputByteBufferNano.writeUInt64(17, l2);
                }
                if ((n2 = this.q) != 0) {
                    codedOutputByteBufferNano.writeInt32(18, n2);
                }
                if ((n2 = this.r) != 0) {
                    codedOutputByteBufferNano.writeInt32(19, n2);
                }
                if ((n2 = this.s) != -1) {
                    codedOutputByteBufferNano.writeInt32(20, n2);
                }
                if ((n2 = this.t) != 0) {
                    codedOutputByteBufferNano.writeInt32(21, n2);
                }
                if ((n2 = this.u) != 0) {
                    codedOutputByteBufferNano.writeInt32(22, n2);
                }
                if (bl2 = this.v) {
                    codedOutputByteBufferNano.writeBool(23, bl2);
                }
                if ((l2 = this.w) != 1L) {
                    codedOutputByteBufferNano.writeUInt64(24, l2);
                }
                super.writeTo(codedOutputByteBufferNano);
            }

            public static final class a
            extends MessageNano {
                public String a;
                public String b;
                public String c;

                public a() {
                    this.a();
                }

                public a a() {
                    this.a = "";
                    this.b = "";
                    this.c = "";
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    int n2;
                    int n3 = super.computeSerializedSize();
                    n3 = n2 = CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a) + n3;
                    if (!this.b.equals((Object)"")) {
                        n3 = n2 + CodedOutputByteBufferNano.computeStringSize((int)2, (String)this.b);
                    }
                    n2 = n3;
                    if (!this.c.equals((Object)"")) {
                        n2 = n3 + CodedOutputByteBufferNano.computeStringSize((int)3, (String)this.c);
                    }
                    return n2;
                }

                public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                    int n2;
                    while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                        if (n2 != 10) {
                            if (n2 != 18) {
                                if (n2 != 26) {
                                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                    break;
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
                    codedOutputByteBufferNano.writeString(1, this.a);
                    if (!this.b.equals((Object)"")) {
                        codedOutputByteBufferNano.writeString(2, this.b);
                    }
                    if (!this.c.equals((Object)"")) {
                        codedOutputByteBufferNano.writeString(3, this.c);
                    }
                    super.writeTo(codedOutputByteBufferNano);
                }
            }

            public static final class b
            extends MessageNano {
                public gf[] a;
                public jf[] b;
                public int c;
                public String d;

                public b() {
                    this.a();
                }

                public b a() {
                    this.a = gf.b();
                    this.b = jf.b();
                    this.c = 2;
                    this.d = "";
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    int n2;
                    int n3 = super.computeSerializedSize();
                    MessageNano messageNano = this.a;
                    int n5 = 0;
                    int n6 = n3;
                    if (messageNano != null) {
                        n6 = n3;
                        if (((gf[])messageNano).length > 0) {
                            n2 = 0;
                            while (true) {
                                messageNano = this.a;
                                n6 = n3;
                                if (n2 >= ((MessageNano[])messageNano).length) break;
                                messageNano = messageNano[n2];
                                n6 = n3;
                                if (messageNano != null) {
                                    n6 = n3 + CodedOutputByteBufferNano.computeMessageSize((int)1, (MessageNano)messageNano);
                                }
                                ++n2;
                                n3 = n6;
                            }
                        }
                    }
                    messageNano = this.b;
                    n3 = n6;
                    if (messageNano != null) {
                        n3 = n6;
                        if (((MessageNano[])messageNano).length > 0) {
                            n2 = n5;
                            while (true) {
                                messageNano = this.b;
                                n3 = n6;
                                if (n2 >= ((MessageNano)messageNano).length) break;
                                messageNano = messageNano[n2];
                                n3 = n6;
                                if (messageNano != null) {
                                    n3 = n6 + CodedOutputByteBufferNano.computeMessageSize((int)2, (MessageNano)messageNano);
                                }
                                ++n2;
                                n6 = n3;
                            }
                        }
                    }
                    n2 = this.c;
                    n6 = n3;
                    if (n2 != 2) {
                        n6 = n3 + CodedOutputByteBufferNano.computeInt32Size((int)3, (int)n2);
                    }
                    n3 = n6;
                    if (!this.d.equals((Object)"")) {
                        n3 = n6 + CodedOutputByteBufferNano.computeStringSize((int)4, (String)this.d);
                    }
                    return n3;
                }

                public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                    int n2;
                    block3: while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                        MessageNano[] messageNanoArray;
                        int n3;
                        Object object;
                        int n5;
                        if (n2 != 10) {
                            if (n2 != 18) {
                                if (n2 != 24) {
                                    if (n2 != 34) {
                                        if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                        break;
                                    }
                                    this.d = codedInputByteBufferNano.readString();
                                    continue;
                                }
                                n2 = codedInputByteBufferNano.readInt32();
                                switch (n2) {
                                    default: {
                                        continue block3;
                                    }
                                    case 0: 
                                    case 1: 
                                    case 2: 
                                    case 3: 
                                    case 4: 
                                    case 5: 
                                    case 6: 
                                    case 7: 
                                    case 8: 
                                    case 9: 
                                    case 10: 
                                    case 11: 
                                    case 12: 
                                }
                                this.c = n2;
                                continue;
                            }
                            n5 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)18);
                            object = this.b;
                            n2 = object == null ? 0 : ((MessageNano[])object).length;
                            n3 = n5 + n2;
                            messageNanoArray = new jf[n3];
                            n5 = n2;
                            if (n2 != 0) {
                                System.arraycopy((Object)object, (int)0, (Object)messageNanoArray, (int)0, (int)n2);
                                n5 = n2;
                            }
                            while (n5 < n3 - 1) {
                                messageNanoArray[n5] = object = new jf();
                                codedInputByteBufferNano.readMessage((MessageNano)object);
                                codedInputByteBufferNano.readTag();
                                ++n5;
                            }
                            messageNanoArray[n5] = object = new jf();
                            codedInputByteBufferNano.readMessage((MessageNano)object);
                            this.b = messageNanoArray;
                            continue;
                        }
                        n5 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)10);
                        object = this.a;
                        n2 = object == null ? 0 : ((MessageNano[])object).length;
                        n3 = n5 + n2;
                        messageNanoArray = new gf[n3];
                        n5 = n2;
                        if (n2 != 0) {
                            System.arraycopy((Object)object, (int)0, (Object)messageNanoArray, (int)0, (int)n2);
                            n5 = n2;
                        }
                        while (n5 < n3 - 1) {
                            messageNanoArray[n5] = object = new gf();
                            codedInputByteBufferNano.readMessage((MessageNano)object);
                            codedInputByteBufferNano.readTag();
                            ++n5;
                        }
                        messageNanoArray[n5] = object = new gf();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        this.a = messageNanoArray;
                    }
                    return this;
                }

                public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                    int n2;
                    MessageNano messageNano = this.a;
                    int n3 = 0;
                    if (messageNano != null && ((gf[])messageNano).length > 0) {
                        for (n2 = 0; n2 < ((MessageNano[])(messageNano = this.a)).length; ++n2) {
                            if ((messageNano = messageNano[n2]) == null) continue;
                            codedOutputByteBufferNano.writeMessage(1, messageNano);
                        }
                    }
                    if ((messageNano = this.b) != null && ((MessageNano[])messageNano).length > 0) {
                        for (n2 = n3; n2 < ((MessageNano)(messageNano = this.b)).length; ++n2) {
                            if ((messageNano = messageNano[n2]) == null) continue;
                            codedOutputByteBufferNano.writeMessage(2, messageNano);
                        }
                    }
                    if ((n2 = this.c) != 2) {
                        codedOutputByteBufferNano.writeInt32(3, n2);
                    }
                    if (!this.d.equals((Object)"")) {
                        codedOutputByteBufferNano.writeString(4, this.d);
                    }
                    super.writeTo(codedOutputByteBufferNano);
                }
            }
        }

        public static final class b
        extends MessageNano {
            public f a;
            public String b;
            public int c;

            public b() {
                this.a();
            }

            public b a() {
                this.a = null;
                this.b = "";
                this.c = 0;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int n2 = super.computeSerializedSize();
                f f3 = this.a;
                int n3 = n2;
                if (f3 != null) {
                    n3 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)1, (MessageNano)f3);
                }
                n2 = CodedOutputByteBufferNano.computeStringSize((int)2, (String)this.b) + n3;
                int n5 = this.c;
                n3 = n2;
                if (n5 != 0) {
                    n3 = n2 + CodedOutputByteBufferNano.computeInt32Size((int)5, (int)n5);
                }
                return n3;
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                int n2;
                while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                    if (n2 != 10) {
                        if (n2 != 18) {
                            if (n2 != 40) {
                                if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                break;
                            }
                            n2 = codedInputByteBufferNano.readInt32();
                            if (n2 != 0 && n2 != 1 && n2 != 2) continue;
                            this.c = n2;
                            continue;
                        }
                        this.b = codedInputByteBufferNano.readString();
                        continue;
                    }
                    if (this.a == null) {
                        this.a = new f();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.a);
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                f f3 = this.a;
                if (f3 != null) {
                    codedOutputByteBufferNano.writeMessage(1, (MessageNano)f3);
                }
                codedOutputByteBufferNano.writeString(2, this.b);
                int n2 = this.c;
                if (n2 != 0) {
                    codedOutputByteBufferNano.writeInt32(5, n2);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }
    }

    public static final class e
    extends MessageNano {
        private static volatile e[] e;
        public int a;
        public int b;
        public String c;
        public boolean d;

        public e() {
            this.a();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public static e[] b() {
            Object object;
            if (e != null) return e;
            Object object2 = object = InternalNano.LAZY_INIT_LOCK;
            synchronized (object2) {
                if (e != null) return e;
                e = new e[0];
                return e;
            }
        }

        public e a() {
            this.a = 0;
            this.b = 0;
            this.c = "";
            this.d = false;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            int n3 = this.a;
            int n5 = n2;
            if (n3 != 0) {
                n5 = n2 + CodedOutputByteBufferNano.computeUInt32Size((int)1, (int)n3);
            }
            n3 = this.b;
            n2 = n5;
            if (n3 != 0) {
                n2 = n5 + CodedOutputByteBufferNano.computeUInt32Size((int)2, (int)n3);
            }
            n5 = n2;
            if (!this.c.equals((Object)"")) {
                n5 = n2 + CodedOutputByteBufferNano.computeStringSize((int)3, (String)this.c);
            }
            boolean bl2 = this.d;
            n2 = n5;
            if (bl2) {
                n2 = n5 + CodedOutputByteBufferNano.computeBoolSize((int)4, (boolean)bl2);
            }
            return n2;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 8) {
                    if (n2 != 16) {
                        if (n2 != 26) {
                            if (n2 != 32) {
                                if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                break;
                            }
                            this.d = codedInputByteBufferNano.readBool();
                            continue;
                        }
                        this.c = codedInputByteBufferNano.readString();
                        continue;
                    }
                    this.b = codedInputByteBufferNano.readUInt32();
                    continue;
                }
                this.a = codedInputByteBufferNano.readUInt32();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            boolean bl2;
            int n2 = this.a;
            if (n2 != 0) {
                codedOutputByteBufferNano.writeUInt32(1, n2);
            }
            if ((n2 = this.b) != 0) {
                codedOutputByteBufferNano.writeUInt32(2, n2);
            }
            if (!this.c.equals((Object)"")) {
                codedOutputByteBufferNano.writeString(3, this.c);
            }
            if (bl2 = this.d) {
                codedOutputByteBufferNano.writeBool(4, bl2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class f
    extends MessageNano {
        public long a;
        public int b;
        public long c;
        public boolean d;

        public f() {
            this.a();
        }

        public f a() {
            this.a = 0L;
            this.b = 0;
            this.c = 0L;
            this.d = false;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            int n3 = CodedOutputByteBufferNano.computeUInt64Size((int)1, (long)this.a);
            n2 = CodedOutputByteBufferNano.computeSInt32Size((int)2, (int)this.b) + (n3 + n2);
            long l2 = this.c;
            n3 = n2;
            if (l2 != 0L) {
                n3 = n2 + CodedOutputByteBufferNano.computeInt64Size((int)3, (long)l2);
            }
            boolean bl2 = this.d;
            n2 = n3;
            if (bl2) {
                n2 = n3 + CodedOutputByteBufferNano.computeBoolSize((int)4, (boolean)bl2);
            }
            return n2;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 8) {
                    if (n2 != 16) {
                        if (n2 != 24) {
                            if (n2 != 32) {
                                if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                break;
                            }
                            this.d = codedInputByteBufferNano.readBool();
                            continue;
                        }
                        this.c = codedInputByteBufferNano.readInt64();
                        continue;
                    }
                    this.b = codedInputByteBufferNano.readSInt32();
                    continue;
                }
                this.a = codedInputByteBufferNano.readUInt64();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            boolean bl2;
            codedOutputByteBufferNano.writeUInt64(1, this.a);
            codedOutputByteBufferNano.writeSInt32(2, this.b);
            long l2 = this.c;
            if (l2 != 0L) {
                codedOutputByteBufferNano.writeInt64(3, l2);
            }
            if (bl2 = this.d) {
                codedOutputByteBufferNano.writeBool(4, bl2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }
}

