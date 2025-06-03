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
import java.io.IOException;
import java.util.Arrays;

public final class xf
extends MessageNano {
    public String A;
    public String B;
    public long C;
    public long D;
    public boolean E;
    public n F;
    public j G;
    public int H;
    public int I;
    public w J;
    public v K;
    public v L;
    public v M;
    public t N;
    public c O;
    public f P;
    public String[] Q;
    public b R;
    public a S;
    public h T;
    public g U;
    public r V;
    public l[] W;
    public String a;
    public long b;
    public String[] c;
    public String d;
    public String e;
    public String[] f;
    public String[] g;
    public String[] h;
    public String[] i;
    public d[] j;
    public i k;
    public k[] l;
    public q m;
    public o[] n;
    public String o;
    public String p;
    public String q;
    public boolean r;
    public String s;
    public String[] t;
    public s u;
    public boolean v;
    public m[] w;
    public p x;
    public String y;
    public String z;

    public xf() {
        this.a();
    }

    public xf a() {
        this.a = "";
        this.b = 0L;
        String[] stringArray = WireFormatNano.EMPTY_STRING_ARRAY;
        this.c = stringArray;
        this.d = "";
        this.e = "";
        this.f = stringArray;
        this.g = stringArray;
        this.h = stringArray;
        this.i = stringArray;
        this.j = com.yandex.metrica.impl.ob.xf$d.b();
        this.k = null;
        this.l = com.yandex.metrica.impl.ob.xf$k.b();
        this.m = null;
        this.n = com.yandex.metrica.impl.ob.xf$o.b();
        this.o = "";
        this.p = "";
        this.q = "";
        this.r = false;
        this.s = "";
        this.t = stringArray;
        this.u = null;
        this.v = false;
        this.w = com.yandex.metrica.impl.ob.xf$m.b();
        this.x = null;
        this.y = "";
        this.z = "";
        this.A = "";
        this.B = "";
        this.C = 0L;
        this.D = 0L;
        this.E = false;
        this.F = null;
        this.G = null;
        this.H = 600;
        this.I = 1;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = stringArray;
        this.R = null;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = com.yandex.metrica.impl.ob.xf$l.b();
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int n2;
        int n6;
        int n9;
        int n10;
        int n11 = n10 = super.computeSerializedSize();
        if (!this.a.equals((Object)"")) {
            n11 = n10 + CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a);
        }
        int n12 = CodedOutputByteBufferNano.computeInt64Size((int)3, (long)this.b) + n11;
        Object object = this.c;
        int n13 = 0;
        n11 = n12;
        if (object != null) {
            n11 = n12;
            if (((String[])object).length > 0) {
                n11 = n9 = 0;
                for (n10 = 0; n10 < ((String[])(object = this.c)).length; ++n10) {
                    object = object[n10];
                    n6 = n9;
                    n2 = n11;
                    if (object != null) {
                        n2 = n11 + 1;
                        n6 = n9 + CodedOutputByteBufferNano.computeStringSizeNoTag((String)object);
                    }
                    n9 = n6;
                    n11 = n2;
                }
                n11 = n12 + n9 + n11 * 1;
            }
        }
        n10 = n11;
        if (!this.d.equals((Object)"")) {
            n10 = n11 + CodedOutputByteBufferNano.computeStringSize((int)5, (String)this.d);
        }
        n11 = n10;
        if (!this.e.equals((Object)"")) {
            n11 = n10 + CodedOutputByteBufferNano.computeStringSize((int)6, (String)this.e);
        }
        object = this.f;
        n10 = n11;
        if (object != null) {
            n10 = n11;
            if (((String[])object).length > 0) {
                n6 = n2 = 0;
                for (n9 = 0; n9 < ((String[])(object = this.f)).length; ++n9) {
                    object = object[n9];
                    n12 = n2;
                    n10 = n6;
                    if (object != null) {
                        n10 = n6 + 1;
                        n12 = n2 + CodedOutputByteBufferNano.computeStringSizeNoTag((String)object);
                    }
                    n2 = n12;
                    n6 = n10;
                }
                n10 = n11 + n2 + n6 * 1;
            }
        }
        object = this.g;
        n11 = n10;
        if (object != null) {
            n11 = n10;
            if (((String[])object).length > 0) {
                n6 = n11 = 0;
                for (n2 = 0; n2 < ((String[])(object = this.g)).length; ++n2) {
                    object = object[n2];
                    n12 = n11;
                    n9 = n6;
                    if (object != null) {
                        n9 = n6 + 1;
                        n12 = n11 + CodedOutputByteBufferNano.computeStringSizeNoTag((String)object);
                    }
                    n11 = n12;
                    n6 = n9;
                }
                n11 = n10 + n11 + n6 * 1;
            }
        }
        object = this.h;
        n10 = n11;
        if (object != null) {
            n10 = n11;
            if (((String[])object).length > 0) {
                n10 = n6 = 0;
                for (n2 = 0; n2 < ((String[])(object = this.h)).length; ++n2) {
                    object = object[n2];
                    n12 = n6;
                    n9 = n10;
                    if (object != null) {
                        n9 = n10 + 1;
                        n12 = n6 + CodedOutputByteBufferNano.computeStringSizeNoTag((String)object);
                    }
                    n6 = n12;
                    n10 = n9;
                }
                n10 = n11 + n6 + n10 * 1;
            }
        }
        object = this.k;
        n11 = n10;
        if (object != null) {
            n11 = n10 + CodedOutputByteBufferNano.computeMessageSize((int)10, (MessageNano)object);
        }
        object = this.l;
        n10 = n11;
        if (object != null) {
            n10 = n11;
            if (((String[])object).length > 0) {
                n2 = 0;
                while (true) {
                    object = this.l;
                    n10 = n11;
                    if (n2 >= ((String[])object).length) break;
                    object = object[n2];
                    n10 = n11;
                    if (object != null) {
                        n10 = n11 + CodedOutputByteBufferNano.computeMessageSize((int)11, (MessageNano)object);
                    }
                    ++n2;
                    n11 = n10;
                }
            }
        }
        object = this.m;
        n11 = n10;
        if (object != null) {
            n11 = n10 + CodedOutputByteBufferNano.computeMessageSize((int)13, (MessageNano)object);
        }
        object = this.n;
        n10 = n11;
        if (object != null) {
            n10 = n11;
            if (((String[])object).length > 0) {
                n2 = 0;
                while (true) {
                    object = this.n;
                    n10 = n11;
                    if (n2 >= ((String[])object).length) break;
                    object = object[n2];
                    n10 = n11;
                    if (object != null) {
                        n10 = n11 + CodedOutputByteBufferNano.computeMessageSize((int)14, (MessageNano)object);
                    }
                    ++n2;
                    n11 = n10;
                }
            }
        }
        n11 = n10;
        if (!this.o.equals((Object)"")) {
            n11 = n10 + CodedOutputByteBufferNano.computeStringSize((int)15, (String)this.o);
        }
        n10 = n11;
        if (!this.p.equals((Object)"")) {
            n10 = n11 + CodedOutputByteBufferNano.computeStringSize((int)16, (String)this.p);
        }
        n11 = n10 = CodedOutputByteBufferNano.computeBoolSize((int)17, (boolean)this.r) + n10;
        if (!this.s.equals((Object)"")) {
            n11 = n10 + CodedOutputByteBufferNano.computeStringSize((int)19, (String)this.s);
        }
        object = this.t;
        n10 = n11;
        if (object != null) {
            n10 = n11;
            if (((String[])object).length > 0) {
                n2 = n6 = 0;
                for (n9 = 0; n9 < ((String[])(object = this.t)).length; ++n9) {
                    object = object[n9];
                    n12 = n6;
                    n10 = n2;
                    if (object != null) {
                        n10 = n2 + 1;
                        n12 = n6 + CodedOutputByteBufferNano.computeStringSizeNoTag((String)object);
                    }
                    n6 = n12;
                    n2 = n10;
                }
                n10 = n11 + n6 + n2 * 2;
            }
        }
        object = this.u;
        n2 = n10;
        if (object != null) {
            n2 = n10 + CodedOutputByteBufferNano.computeMessageSize((int)21, (MessageNano)object);
        }
        boolean bl2 = this.v;
        n11 = n2;
        if (bl2) {
            n11 = n2 + CodedOutputByteBufferNano.computeBoolSize((int)22, (boolean)bl2);
        }
        object = this.w;
        n10 = n11;
        if (object != null) {
            n10 = n11;
            if (((String[])object).length > 0) {
                n2 = 0;
                while (true) {
                    object = this.w;
                    n10 = n11;
                    if (n2 >= ((String[])object).length) break;
                    object = object[n2];
                    n10 = n11;
                    if (object != null) {
                        n10 = n11 + CodedOutputByteBufferNano.computeMessageSize((int)23, (MessageNano)object);
                    }
                    ++n2;
                    n11 = n10;
                }
            }
        }
        object = this.x;
        n2 = n10;
        if (object != null) {
            n2 = n10 + CodedOutputByteBufferNano.computeMessageSize((int)24, (MessageNano)object);
        }
        n11 = n2;
        if (!this.y.equals((Object)"")) {
            n11 = n2 + CodedOutputByteBufferNano.computeStringSize((int)25, (String)this.y);
        }
        n10 = n11;
        if (!this.z.equals((Object)"")) {
            n10 = n11 + CodedOutputByteBufferNano.computeStringSize((int)26, (String)this.z);
        }
        n11 = n10;
        if (!this.A.equals((Object)"")) {
            n11 = n10 + CodedOutputByteBufferNano.computeStringSize((int)27, (String)this.A);
        }
        n10 = CodedOutputByteBufferNano.computeInt64Size((int)28, (long)this.C);
        n11 = CodedOutputByteBufferNano.computeInt64Size((int)29, (long)this.D) + (n10 + n11);
        bl2 = this.E;
        n10 = n11;
        if (bl2) {
            n10 = n11 + CodedOutputByteBufferNano.computeBoolSize((int)30, (boolean)bl2);
        }
        object = this.F;
        n11 = n10;
        if (object != null) {
            n11 = n10 + CodedOutputByteBufferNano.computeMessageSize((int)32, (MessageNano)object);
        }
        object = this.G;
        n10 = n11;
        if (object != null) {
            n10 = n11 + CodedOutputByteBufferNano.computeMessageSize((int)33, (MessageNano)object);
        }
        n11 = CodedOutputByteBufferNano.computeInt32Size((int)35, (int)this.H);
        n10 = CodedOutputByteBufferNano.computeInt32Size((int)36, (int)this.I) + (n11 + n10);
        object = this.J;
        n11 = n10;
        if (object != null) {
            n11 = n10 + CodedOutputByteBufferNano.computeMessageSize((int)37, (MessageNano)object);
        }
        object = this.K;
        n10 = n11;
        if (object != null) {
            n10 = n11 + CodedOutputByteBufferNano.computeMessageSize((int)38, (MessageNano)object);
        }
        object = this.L;
        n11 = n10;
        if (object != null) {
            n11 = n10 + CodedOutputByteBufferNano.computeMessageSize((int)39, (MessageNano)object);
        }
        object = this.N;
        n10 = n11;
        if (object != null) {
            n10 = n11 + CodedOutputByteBufferNano.computeMessageSize((int)41, (MessageNano)object);
        }
        object = this.O;
        n11 = n10;
        if (object != null) {
            n11 = n10 + CodedOutputByteBufferNano.computeMessageSize((int)42, (MessageNano)object);
        }
        object = this.M;
        n2 = n11;
        if (object != null) {
            n2 = n11 + CodedOutputByteBufferNano.computeMessageSize((int)43, (MessageNano)object);
        }
        n10 = n2;
        if (!this.q.equals((Object)"")) {
            n10 = n2 + CodedOutputByteBufferNano.computeStringSize((int)44, (String)this.q);
        }
        object = this.P;
        n11 = n10;
        if (object != null) {
            n11 = n10 + CodedOutputByteBufferNano.computeMessageSize((int)45, (MessageNano)object);
        }
        object = this.i;
        n10 = n11;
        if (object != null) {
            n10 = n11;
            if (((String[])object).length > 0) {
                n9 = n2 = 0;
                for (n10 = 0; n10 < ((String[])(object = this.i)).length; ++n10) {
                    object = object[n10];
                    n12 = n2;
                    n6 = n9;
                    if (object != null) {
                        n6 = n9 + 1;
                        n12 = n2 + CodedOutputByteBufferNano.computeStringSizeNoTag((String)object);
                    }
                    n2 = n12;
                    n9 = n6;
                }
                n10 = n11 + n2 + n9 * 2;
            }
        }
        object = this.Q;
        n2 = n10;
        if (object != null) {
            n2 = n10;
            if (((String[])object).length > 0) {
                n6 = n9 = 0;
                for (n2 = 0; n2 < ((String[])(object = this.Q)).length; ++n2) {
                    object = object[n2];
                    n12 = n9;
                    n11 = n6;
                    if (object != null) {
                        n11 = n6 + 1;
                        n12 = n9 + CodedOutputByteBufferNano.computeStringSizeNoTag((String)object);
                    }
                    n9 = n12;
                    n6 = n11;
                }
                n2 = n10 + n9 + n6 * 2;
            }
        }
        object = this.R;
        n11 = n2;
        if (object != null) {
            n11 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)48, (MessageNano)object);
        }
        n10 = n11;
        if (!this.B.equals((Object)"")) {
            n10 = n11 + CodedOutputByteBufferNano.computeStringSize((int)49, (String)this.B);
        }
        object = this.S;
        n11 = n10;
        if (object != null) {
            n11 = n10 + CodedOutputByteBufferNano.computeMessageSize((int)51, (MessageNano)object);
        }
        object = this.T;
        n10 = n11;
        if (object != null) {
            n10 = n11 + CodedOutputByteBufferNano.computeMessageSize((int)52, (MessageNano)object);
        }
        object = this.U;
        n11 = n10;
        if (object != null) {
            n11 = n10 + CodedOutputByteBufferNano.computeMessageSize((int)53, (MessageNano)object);
        }
        object = this.j;
        n10 = n11;
        if (object != null) {
            n10 = n11;
            if (((String[])object).length > 0) {
                n2 = 0;
                while (true) {
                    object = this.j;
                    n10 = n11;
                    if (n2 >= ((String[])object).length) break;
                    object = object[n2];
                    n10 = n11;
                    if (object != null) {
                        n10 = n11 + CodedOutputByteBufferNano.computeMessageSize((int)54, (MessageNano)object);
                    }
                    ++n2;
                    n11 = n10;
                }
            }
        }
        object = this.V;
        n11 = n10;
        if (object != null) {
            n11 = n10 + CodedOutputByteBufferNano.computeMessageSize((int)55, (MessageNano)object);
        }
        object = this.W;
        n2 = n11;
        if (object != null) {
            n2 = n11;
            if (((String[])object).length > 0) {
                n10 = n13;
                while (true) {
                    object = this.W;
                    n2 = n11;
                    if (n10 >= ((String[])object).length) break;
                    object = object[n10];
                    n2 = n11;
                    if (object != null) {
                        n2 = n11 + CodedOutputByteBufferNano.computeMessageSize((int)56, (MessageNano)object);
                    }
                    ++n10;
                    n11 = n2;
                }
            }
        }
        return n2;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        block52: while (true) {
            int n2 = codedInputByteBufferNano.readTag();
            switch (n2) {
                default: {
                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue block52;
                    break block52;
                }
                case 450: {
                    int n6 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)450);
                    Object object = this.W;
                    n2 = object == null ? 0 : ((MessageNano[])object).length;
                    int n9 = n6 + n2;
                    Object[] objectArray = new l[n9];
                    n6 = n2;
                    if (n2 != 0) {
                        System.arraycopy((Object)object, (int)0, (Object)objectArray, (int)0, (int)n2);
                        n6 = n2;
                    }
                    while (n6 < n9 - 1) {
                        objectArray[n6] = object = new l();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        codedInputByteBufferNano.readTag();
                        ++n6;
                    }
                    objectArray[n6] = object = new l();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    this.W = objectArray;
                    continue block52;
                }
                case 442: {
                    if (this.V == null) {
                        this.V = new r();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.V);
                    continue block52;
                }
                case 434: {
                    int n6 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)434);
                    Object object = this.j;
                    n2 = object == null ? 0 : ((MessageNano[])object).length;
                    int n9 = n6 + n2;
                    Object[] objectArray = new d[n9];
                    n6 = n2;
                    if (n2 != 0) {
                        System.arraycopy((Object)object, (int)0, (Object)objectArray, (int)0, (int)n2);
                        n6 = n2;
                    }
                    while (n6 < n9 - 1) {
                        objectArray[n6] = object = new d();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        codedInputByteBufferNano.readTag();
                        ++n6;
                    }
                    objectArray[n6] = object = new d();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    this.j = objectArray;
                    continue block52;
                }
                case 426: {
                    if (this.U == null) {
                        this.U = new g();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.U);
                    continue block52;
                }
                case 418: {
                    if (this.T == null) {
                        this.T = new h();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.T);
                    continue block52;
                }
                case 410: {
                    if (this.S == null) {
                        this.S = new a();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.S);
                    continue block52;
                }
                case 394: {
                    this.B = codedInputByteBufferNano.readString();
                    continue block52;
                }
                case 386: {
                    if (this.R == null) {
                        this.R = new b();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.R);
                    continue block52;
                }
                case 378: {
                    int n6 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)378);
                    Object[] objectArray = this.Q;
                    n2 = objectArray == null ? 0 : objectArray.length;
                    int n9 = n6 + n2;
                    Object object = new String[n9];
                    n6 = n2;
                    if (n2 != 0) {
                        System.arraycopy((Object)objectArray, (int)0, (Object)object, (int)0, (int)n2);
                        n6 = n2;
                    }
                    while (n6 < n9 - 1) {
                        object[n6] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        ++n6;
                    }
                    object[n6] = codedInputByteBufferNano.readString();
                    this.Q = object;
                    continue block52;
                }
                case 370: {
                    int n6 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)370);
                    Object[] objectArray = this.i;
                    n2 = objectArray == null ? 0 : objectArray.length;
                    int n9 = n6 + n2;
                    Object object = new String[n9];
                    n6 = n2;
                    if (n2 != 0) {
                        System.arraycopy((Object)objectArray, (int)0, (Object)object, (int)0, (int)n2);
                        n6 = n2;
                    }
                    while (n6 < n9 - 1) {
                        object[n6] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        ++n6;
                    }
                    object[n6] = codedInputByteBufferNano.readString();
                    this.i = object;
                    continue block52;
                }
                case 362: {
                    if (this.P == null) {
                        this.P = new f();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.P);
                    continue block52;
                }
                case 354: {
                    this.q = codedInputByteBufferNano.readString();
                    continue block52;
                }
                case 346: {
                    if (this.M == null) {
                        this.M = new v();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.M);
                    continue block52;
                }
                case 338: {
                    if (this.O == null) {
                        this.O = new c();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.O);
                    continue block52;
                }
                case 330: {
                    if (this.N == null) {
                        this.N = new t();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.N);
                    continue block52;
                }
                case 314: {
                    if (this.L == null) {
                        this.L = new v();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.L);
                    continue block52;
                }
                case 306: {
                    if (this.K == null) {
                        this.K = new v();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.K);
                    continue block52;
                }
                case 298: {
                    if (this.J == null) {
                        this.J = new w();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.J);
                    continue block52;
                }
                case 288: {
                    this.I = codedInputByteBufferNano.readInt32();
                    continue block52;
                }
                case 280: {
                    this.H = codedInputByteBufferNano.readInt32();
                    continue block52;
                }
                case 266: {
                    if (this.G == null) {
                        this.G = new j();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.G);
                    continue block52;
                }
                case 258: {
                    if (this.F == null) {
                        this.F = new n();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.F);
                    continue block52;
                }
                case 240: {
                    this.E = codedInputByteBufferNano.readBool();
                    continue block52;
                }
                case 232: {
                    this.D = codedInputByteBufferNano.readInt64();
                    continue block52;
                }
                case 224: {
                    this.C = codedInputByteBufferNano.readInt64();
                    continue block52;
                }
                case 218: {
                    this.A = codedInputByteBufferNano.readString();
                    continue block52;
                }
                case 210: {
                    this.z = codedInputByteBufferNano.readString();
                    continue block52;
                }
                case 202: {
                    this.y = codedInputByteBufferNano.readString();
                    continue block52;
                }
                case 194: {
                    if (this.x == null) {
                        this.x = new p();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.x);
                    continue block52;
                }
                case 186: {
                    int n6 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)186);
                    Object object = this.w;
                    n2 = object == null ? 0 : ((MessageNano[])object).length;
                    int n9 = n6 + n2;
                    Object[] objectArray = new m[n9];
                    n6 = n2;
                    if (n2 != 0) {
                        System.arraycopy((Object)object, (int)0, (Object)objectArray, (int)0, (int)n2);
                        n6 = n2;
                    }
                    while (n6 < n9 - 1) {
                        objectArray[n6] = object = new m();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        codedInputByteBufferNano.readTag();
                        ++n6;
                    }
                    objectArray[n6] = object = new m();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    this.w = objectArray;
                    continue block52;
                }
                case 176: {
                    this.v = codedInputByteBufferNano.readBool();
                    continue block52;
                }
                case 170: {
                    if (this.u == null) {
                        this.u = new s();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.u);
                    continue block52;
                }
                case 162: {
                    int n6 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)162);
                    Object[] objectArray = this.t;
                    n2 = objectArray == null ? 0 : objectArray.length;
                    int n9 = n6 + n2;
                    Object object = new String[n9];
                    n6 = n2;
                    if (n2 != 0) {
                        System.arraycopy((Object)objectArray, (int)0, (Object)object, (int)0, (int)n2);
                        n6 = n2;
                    }
                    while (n6 < n9 - 1) {
                        object[n6] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        ++n6;
                    }
                    object[n6] = codedInputByteBufferNano.readString();
                    this.t = object;
                    continue block52;
                }
                case 154: {
                    this.s = codedInputByteBufferNano.readString();
                    continue block52;
                }
                case 136: {
                    this.r = codedInputByteBufferNano.readBool();
                    continue block52;
                }
                case 130: {
                    this.p = codedInputByteBufferNano.readString();
                    continue block52;
                }
                case 122: {
                    this.o = codedInputByteBufferNano.readString();
                    continue block52;
                }
                case 114: {
                    int n6 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)114);
                    Object object = this.n;
                    n2 = object == null ? 0 : ((MessageNano[])object).length;
                    int n9 = n6 + n2;
                    Object[] objectArray = new o[n9];
                    n6 = n2;
                    if (n2 != 0) {
                        System.arraycopy((Object)object, (int)0, (Object)objectArray, (int)0, (int)n2);
                        n6 = n2;
                    }
                    while (n6 < n9 - 1) {
                        objectArray[n6] = object = new o();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        codedInputByteBufferNano.readTag();
                        ++n6;
                    }
                    objectArray[n6] = object = new o();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    this.n = objectArray;
                    continue block52;
                }
                case 106: {
                    if (this.m == null) {
                        this.m = new q();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.m);
                    continue block52;
                }
                case 90: {
                    int n6 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)90);
                    Object object = this.l;
                    n2 = object == null ? 0 : ((MessageNano[])object).length;
                    int n9 = n6 + n2;
                    Object[] objectArray = new k[n9];
                    n6 = n2;
                    if (n2 != 0) {
                        System.arraycopy((Object)object, (int)0, (Object)objectArray, (int)0, (int)n2);
                        n6 = n2;
                    }
                    while (n6 < n9 - 1) {
                        objectArray[n6] = object = new k();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        codedInputByteBufferNano.readTag();
                        ++n6;
                    }
                    objectArray[n6] = object = new k();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    this.l = objectArray;
                    continue block52;
                }
                case 82: {
                    if (this.k == null) {
                        this.k = new i();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.k);
                    continue block52;
                }
                case 74: {
                    int n6 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)74);
                    Object object = this.h;
                    n2 = object == null ? 0 : ((MessageNano[])object).length;
                    int n9 = n6 + n2;
                    Object[] objectArray = new String[n9];
                    n6 = n2;
                    if (n2 != 0) {
                        System.arraycopy((Object)object, (int)0, (Object)objectArray, (int)0, (int)n2);
                        n6 = n2;
                    }
                    while (n6 < n9 - 1) {
                        objectArray[n6] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        ++n6;
                    }
                    objectArray[n6] = codedInputByteBufferNano.readString();
                    this.h = objectArray;
                    continue block52;
                }
                case 66: {
                    int n6 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)66);
                    Object object = this.g;
                    n2 = object == null ? 0 : ((MessageNano[])object).length;
                    int n9 = n6 + n2;
                    Object[] objectArray = new String[n9];
                    n6 = n2;
                    if (n2 != 0) {
                        System.arraycopy((Object)object, (int)0, (Object)objectArray, (int)0, (int)n2);
                        n6 = n2;
                    }
                    while (n6 < n9 - 1) {
                        objectArray[n6] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        ++n6;
                    }
                    objectArray[n6] = codedInputByteBufferNano.readString();
                    this.g = objectArray;
                    continue block52;
                }
                case 58: {
                    int n6 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)58);
                    Object[] objectArray = this.f;
                    n2 = objectArray == null ? 0 : objectArray.length;
                    int n9 = n6 + n2;
                    Object object = new String[n9];
                    n6 = n2;
                    if (n2 != 0) {
                        System.arraycopy((Object)objectArray, (int)0, (Object)object, (int)0, (int)n2);
                        n6 = n2;
                    }
                    while (n6 < n9 - 1) {
                        object[n6] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        ++n6;
                    }
                    object[n6] = codedInputByteBufferNano.readString();
                    this.f = object;
                    continue block52;
                }
                case 50: {
                    this.e = codedInputByteBufferNano.readString();
                    continue block52;
                }
                case 42: {
                    this.d = codedInputByteBufferNano.readString();
                    continue block52;
                }
                case 34: {
                    int n6 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)34);
                    Object object = this.c;
                    n2 = object == null ? 0 : ((MessageNano[])object).length;
                    int n9 = n6 + n2;
                    Object[] objectArray = new String[n9];
                    n6 = n2;
                    if (n2 != 0) {
                        System.arraycopy((Object)object, (int)0, (Object)objectArray, (int)0, (int)n2);
                        n6 = n2;
                    }
                    while (n6 < n9 - 1) {
                        objectArray[n6] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        ++n6;
                    }
                    objectArray[n6] = codedInputByteBufferNano.readString();
                    this.c = objectArray;
                    continue block52;
                }
                case 24: {
                    this.b = codedInputByteBufferNano.readInt64();
                    continue block52;
                }
                case 10: {
                    this.a = codedInputByteBufferNano.readString();
                    continue block52;
                }
                case 0: 
            }
            break;
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean bl2;
        int n2;
        if (!this.a.equals((Object)"")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        codedOutputByteBufferNano.writeInt64(3, this.b);
        Object object = this.c;
        int n6 = 0;
        if (object != null && ((String[])object).length > 0) {
            for (n2 = 0; n2 < ((String[])(object = this.c)).length; ++n2) {
                if ((object = object[n2]) == null) continue;
                codedOutputByteBufferNano.writeString(4, (String)object);
            }
        }
        if (!this.d.equals((Object)"")) {
            codedOutputByteBufferNano.writeString(5, this.d);
        }
        if (!this.e.equals((Object)"")) {
            codedOutputByteBufferNano.writeString(6, this.e);
        }
        if ((object = this.f) != null && ((String[])object).length > 0) {
            for (n2 = 0; n2 < ((String[])(object = this.f)).length; ++n2) {
                if ((object = object[n2]) == null) continue;
                codedOutputByteBufferNano.writeString(7, (String)object);
            }
        }
        if ((object = this.g) != null && ((String[])object).length > 0) {
            for (n2 = 0; n2 < ((String[])(object = this.g)).length; ++n2) {
                if ((object = object[n2]) == null) continue;
                codedOutputByteBufferNano.writeString(8, (String)object);
            }
        }
        if ((object = this.h) != null && ((String[])object).length > 0) {
            for (n2 = 0; n2 < ((String[])(object = this.h)).length; ++n2) {
                if ((object = object[n2]) == null) continue;
                codedOutputByteBufferNano.writeString(9, (String)object);
            }
        }
        if ((object = this.k) != null) {
            codedOutputByteBufferNano.writeMessage(10, (MessageNano)object);
        }
        if ((object = this.l) != null && ((String[])object).length > 0) {
            for (n2 = 0; n2 < ((String[])(object = this.l)).length; ++n2) {
                if ((object = object[n2]) == null) continue;
                codedOutputByteBufferNano.writeMessage(11, (MessageNano)object);
            }
        }
        if ((object = this.m) != null) {
            codedOutputByteBufferNano.writeMessage(13, (MessageNano)object);
        }
        if ((object = this.n) != null && ((String[])object).length > 0) {
            for (n2 = 0; n2 < ((String[])(object = this.n)).length; ++n2) {
                if ((object = object[n2]) == null) continue;
                codedOutputByteBufferNano.writeMessage(14, (MessageNano)object);
            }
        }
        if (!this.o.equals((Object)"")) {
            codedOutputByteBufferNano.writeString(15, this.o);
        }
        if (!this.p.equals((Object)"")) {
            codedOutputByteBufferNano.writeString(16, this.p);
        }
        codedOutputByteBufferNano.writeBool(17, this.r);
        if (!this.s.equals((Object)"")) {
            codedOutputByteBufferNano.writeString(19, this.s);
        }
        if ((object = this.t) != null && ((String[])object).length > 0) {
            for (n2 = 0; n2 < ((String[])(object = this.t)).length; ++n2) {
                if ((object = object[n2]) == null) continue;
                codedOutputByteBufferNano.writeString(20, (String)object);
            }
        }
        if ((object = this.u) != null) {
            codedOutputByteBufferNano.writeMessage(21, (MessageNano)object);
        }
        if (bl2 = this.v) {
            codedOutputByteBufferNano.writeBool(22, bl2);
        }
        if ((object = this.w) != null && ((String[])object).length > 0) {
            for (n2 = 0; n2 < ((String[])(object = this.w)).length; ++n2) {
                if ((object = object[n2]) == null) continue;
                codedOutputByteBufferNano.writeMessage(23, (MessageNano)object);
            }
        }
        if ((object = this.x) != null) {
            codedOutputByteBufferNano.writeMessage(24, (MessageNano)object);
        }
        if (!this.y.equals((Object)"")) {
            codedOutputByteBufferNano.writeString(25, this.y);
        }
        if (!this.z.equals((Object)"")) {
            codedOutputByteBufferNano.writeString(26, this.z);
        }
        if (!this.A.equals((Object)"")) {
            codedOutputByteBufferNano.writeString(27, this.A);
        }
        codedOutputByteBufferNano.writeInt64(28, this.C);
        codedOutputByteBufferNano.writeInt64(29, this.D);
        bl2 = this.E;
        if (bl2) {
            codedOutputByteBufferNano.writeBool(30, bl2);
        }
        if ((object = this.F) != null) {
            codedOutputByteBufferNano.writeMessage(32, (MessageNano)object);
        }
        if ((object = this.G) != null) {
            codedOutputByteBufferNano.writeMessage(33, (MessageNano)object);
        }
        codedOutputByteBufferNano.writeInt32(35, this.H);
        codedOutputByteBufferNano.writeInt32(36, this.I);
        object = this.J;
        if (object != null) {
            codedOutputByteBufferNano.writeMessage(37, (MessageNano)object);
        }
        if ((object = this.K) != null) {
            codedOutputByteBufferNano.writeMessage(38, (MessageNano)object);
        }
        if ((object = this.L) != null) {
            codedOutputByteBufferNano.writeMessage(39, (MessageNano)object);
        }
        if ((object = this.N) != null) {
            codedOutputByteBufferNano.writeMessage(41, (MessageNano)object);
        }
        if ((object = this.O) != null) {
            codedOutputByteBufferNano.writeMessage(42, (MessageNano)object);
        }
        if ((object = this.M) != null) {
            codedOutputByteBufferNano.writeMessage(43, (MessageNano)object);
        }
        if (!this.q.equals((Object)"")) {
            codedOutputByteBufferNano.writeString(44, this.q);
        }
        if ((object = this.P) != null) {
            codedOutputByteBufferNano.writeMessage(45, (MessageNano)object);
        }
        if ((object = this.i) != null && ((String[])object).length > 0) {
            for (n2 = 0; n2 < ((String[])(object = this.i)).length; ++n2) {
                if ((object = object[n2]) == null) continue;
                codedOutputByteBufferNano.writeString(46, (String)object);
            }
        }
        if ((object = this.Q) != null && ((String[])object).length > 0) {
            for (n2 = 0; n2 < ((String[])(object = this.Q)).length; ++n2) {
                if ((object = object[n2]) == null) continue;
                codedOutputByteBufferNano.writeString(47, (String)object);
            }
        }
        if ((object = this.R) != null) {
            codedOutputByteBufferNano.writeMessage(48, (MessageNano)object);
        }
        if (!this.B.equals((Object)"")) {
            codedOutputByteBufferNano.writeString(49, this.B);
        }
        if ((object = this.S) != null) {
            codedOutputByteBufferNano.writeMessage(51, (MessageNano)object);
        }
        if ((object = this.T) != null) {
            codedOutputByteBufferNano.writeMessage(52, (MessageNano)object);
        }
        if ((object = this.U) != null) {
            codedOutputByteBufferNano.writeMessage(53, (MessageNano)object);
        }
        if ((object = this.j) != null && ((String[])object).length > 0) {
            for (n2 = 0; n2 < ((String[])(object = this.j)).length; ++n2) {
                if ((object = object[n2]) == null) continue;
                codedOutputByteBufferNano.writeMessage(54, (MessageNano)object);
            }
        }
        if ((object = this.V) != null) {
            codedOutputByteBufferNano.writeMessage(55, (MessageNano)object);
        }
        if ((object = this.W) != null && ((String[])object).length > 0) {
            for (n2 = n6; n2 < ((String[])(object = this.W)).length; ++n2) {
                if ((object = object[n2]) == null) continue;
                codedOutputByteBufferNano.writeMessage(56, (MessageNano)object);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static final class com.yandex.metrica.impl.ob.xf$a
    extends MessageNano {
        public b[] a;

        public com.yandex.metrica.impl.ob.xf$a() {
            this.a();
        }

        public com.yandex.metrica.impl.ob.xf$a a() {
            this.a = b.b();
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            Object object = this.a;
            int n6 = n2;
            if (object != null) {
                n6 = n2;
                if (((b[])object).length > 0) {
                    int n9 = 0;
                    while (true) {
                        object = this.a;
                        n6 = n2;
                        if (n9 >= ((b[])object).length) break;
                        object = object[n9];
                        n6 = n2;
                        if (object != null) {
                            n6 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)1, (MessageNano)object);
                        }
                        ++n9;
                        n2 = n6;
                    }
                }
            }
            return n6;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 10) {
                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                    break;
                }
                int n6 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)10);
                Object object = this.a;
                n2 = object == null ? 0 : ((b[])object).length;
                int n9 = n6 + n2;
                b[] bArray = new b[n9];
                n6 = n2;
                if (n2 != 0) {
                    System.arraycopy((Object)object, (int)0, (Object)bArray, (int)0, (int)n2);
                    n6 = n2;
                }
                while (n6 < n9 - 1) {
                    bArray[n6] = object = new b();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    codedInputByteBufferNano.readTag();
                    ++n6;
                }
                bArray[n6] = object = new b();
                codedInputByteBufferNano.readMessage((MessageNano)object);
                this.a = bArray;
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Object object = this.a;
            if (object != null && ((b[])object).length > 0) {
                for (int i2 = 0; i2 < ((b[])(object = this.a)).length; ++i2) {
                    if ((object = object[i2]) == null) continue;
                    codedOutputByteBufferNano.writeMessage(1, (MessageNano)object);
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static final class a
        extends MessageNano {
            public String a;

            public a() {
                this.a();
            }

            public a a() {
                this.a = "";
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int n2;
                int n6 = n2 = super.computeSerializedSize();
                if (!this.a.equals((Object)"")) {
                    n6 = n2 + CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a);
                }
                return n6;
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                int n2;
                while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                    if (n2 != 10) {
                        if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                        break;
                    }
                    this.a = codedInputByteBufferNano.readString();
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                if (!this.a.equals((Object)"")) {
                    codedOutputByteBufferNano.writeString(1, this.a);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public static final class b
        extends MessageNano {
            private static volatile b[] c;
            public String a;
            public a b;

            public b() {
                this.a();
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public static b[] b() {
                Object object;
                if (c != null) return c;
                Object object2 = object = InternalNano.LAZY_INIT_LOCK;
                synchronized (object2) {
                    if (c != null) return c;
                    c = new b[0];
                    return c;
                }
            }

            public b a() {
                this.a = "";
                this.b = null;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int n2;
                int n6 = n2 = super.computeSerializedSize();
                if (!this.a.equals((Object)"")) {
                    n6 = n2 + CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a);
                }
                a a2 = this.b;
                n2 = n6;
                if (a2 != null) {
                    n2 = n6 + CodedOutputByteBufferNano.computeMessageSize((int)2, (MessageNano)a2);
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
                        if (this.b == null) {
                            this.b = new a();
                        }
                        codedInputByteBufferNano.readMessage((MessageNano)this.b);
                        continue;
                    }
                    this.a = codedInputByteBufferNano.readString();
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                a a2;
                if (!this.a.equals((Object)"")) {
                    codedOutputByteBufferNano.writeString(1, this.a);
                }
                if ((a2 = this.b) != null) {
                    codedOutputByteBufferNano.writeMessage(2, (MessageNano)a2);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }
    }

    public static final class b
    extends MessageNano {
        public int a;
        public int b;

        public b() {
            this.a();
        }

        public b a() {
            this.a = 86400;
            this.b = 86400;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            int n6 = this.a;
            int n9 = n2;
            if (n6 != 86400) {
                n9 = n2 + CodedOutputByteBufferNano.computeInt32Size((int)1, (int)n6);
            }
            n6 = this.b;
            n2 = n9;
            if (n6 != 86400) {
                n2 = n9 + CodedOutputByteBufferNano.computeInt32Size((int)2, (int)n6);
            }
            return n2;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 8) {
                    if (n2 != 16) {
                        if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                        break;
                    }
                    this.b = codedInputByteBufferNano.readInt32();
                    continue;
                }
                this.a = codedInputByteBufferNano.readInt32();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int n2 = this.a;
            if (n2 != 86400) {
                codedOutputByteBufferNano.writeInt32(1, n2);
            }
            if ((n2 = this.b) != 86400) {
                codedOutputByteBufferNano.writeInt32(2, n2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class c
    extends MessageNano {
        public long a;
        public long b;
        public long c;
        public long d;

        public c() {
            this.a();
        }

        public c a() {
            this.a = 10000L;
            this.b = 10000L;
            this.c = 10000L;
            this.d = 10000L;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            long l6 = this.a;
            int n6 = n2;
            if (l6 != 10000L) {
                n6 = n2 + CodedOutputByteBufferNano.computeInt64Size((int)1, (long)l6);
            }
            l6 = this.b;
            n2 = n6;
            if (l6 != 10000L) {
                n2 = n6 + CodedOutputByteBufferNano.computeInt64Size((int)2, (long)l6);
            }
            l6 = this.c;
            n6 = n2;
            if (l6 != 10000L) {
                n6 = n2 + CodedOutputByteBufferNano.computeInt64Size((int)3, (long)l6);
            }
            l6 = this.d;
            n2 = n6;
            if (l6 != 10000L) {
                n2 = n6 + CodedOutputByteBufferNano.computeInt64Size((int)4, (long)l6);
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
                            this.d = codedInputByteBufferNano.readInt64();
                            continue;
                        }
                        this.c = codedInputByteBufferNano.readInt64();
                        continue;
                    }
                    this.b = codedInputByteBufferNano.readInt64();
                    continue;
                }
                this.a = codedInputByteBufferNano.readInt64();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long l6 = this.a;
            if (l6 != 10000L) {
                codedOutputByteBufferNano.writeInt64(1, l6);
            }
            if ((l6 = this.b) != 10000L) {
                codedOutputByteBufferNano.writeInt64(2, l6);
            }
            if ((l6 = this.c) != 10000L) {
                codedOutputByteBufferNano.writeInt64(3, l6);
            }
            if ((l6 = this.d) != 10000L) {
                codedOutputByteBufferNano.writeInt64(4, l6);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class d
    extends MessageNano {
        private static volatile d[] c;
        public String a;
        public String[] b;

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
            if (c != null) return c;
            Object object2 = object = InternalNano.LAZY_INIT_LOCK;
            synchronized (object2) {
                if (c != null) return c;
                c = new d[0];
                return c;
            }
        }

        public d a() {
            this.a = "";
            this.b = WireFormatNano.EMPTY_STRING_ARRAY;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2;
            int n6 = n2 = super.computeSerializedSize();
            if (!this.a.equals((Object)"")) {
                n6 = n2 + CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a);
            }
            Object object = this.b;
            n2 = n6;
            if (object != null) {
                n2 = n6;
                if (((String[])object).length > 0) {
                    int n9 = 0;
                    int n10 = 0;
                    for (n2 = 0; n2 < ((String[])(object = this.b)).length; ++n2) {
                        object = object[n2];
                        int n11 = n9;
                        int n12 = n10;
                        if (object != null) {
                            n12 = n10 + 1;
                            n11 = CodedOutputByteBufferNano.computeStringSizeNoTag((String)object) + n9;
                        }
                        n9 = n11;
                        n10 = n12;
                    }
                    n2 = n6 + n9 + n10 * 1;
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
            Object object;
            if (!this.a.equals((Object)"")) {
                codedOutputByteBufferNano.writeString(1, this.a);
            }
            if ((object = this.b) != null && ((String[])object).length > 0) {
                for (int i2 = 0; i2 < ((String[])(object = this.b)).length; ++i2) {
                    if ((object = object[i2]) == null) continue;
                    codedOutputByteBufferNano.writeString(2, (String)object);
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class e
    extends MessageNano {
        public long a;
        public int b;

        public e() {
            this.a();
        }

        public e a() {
            this.a = 0L;
            this.b = 86400;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            int n6 = CodedOutputByteBufferNano.computeInt64Size((int)1, (long)this.a) + n2;
            int n9 = this.b;
            n2 = n6;
            if (n9 != 86400) {
                n2 = n6 + CodedOutputByteBufferNano.computeInt32Size((int)2, (int)n9);
            }
            return n2;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 8) {
                    if (n2 != 16) {
                        if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                        break;
                    }
                    this.b = codedInputByteBufferNano.readInt32();
                    continue;
                }
                this.a = codedInputByteBufferNano.readInt64();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt64(1, this.a);
            int n2 = this.b;
            if (n2 != 86400) {
                codedOutputByteBufferNano.writeInt32(2, n2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class f
    extends MessageNano {
        public e a;
        public e b;
        public e c;

        public f() {
            this.a();
        }

        public f a() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            e e4 = this.a;
            int n6 = n2;
            if (e4 != null) {
                n6 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)1, (MessageNano)e4);
            }
            e4 = this.b;
            n2 = n6;
            if (e4 != null) {
                n2 = n6 + CodedOutputByteBufferNano.computeMessageSize((int)2, (MessageNano)e4);
            }
            e4 = this.c;
            n6 = n2;
            if (e4 != null) {
                n6 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)3, (MessageNano)e4);
            }
            return n6;
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
                        if (this.c == null) {
                            this.c = new e();
                        }
                        codedInputByteBufferNano.readMessage((MessageNano)this.c);
                        continue;
                    }
                    if (this.b == null) {
                        this.b = new e();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.b);
                    continue;
                }
                if (this.a == null) {
                    this.a = new e();
                }
                codedInputByteBufferNano.readMessage((MessageNano)this.a);
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            e e4 = this.a;
            if (e4 != null) {
                codedOutputByteBufferNano.writeMessage(1, (MessageNano)e4);
            }
            if ((e4 = this.b) != null) {
                codedOutputByteBufferNano.writeMessage(2, (MessageNano)e4);
            }
            if ((e4 = this.c) != null) {
                codedOutputByteBufferNano.writeMessage(3, (MessageNano)e4);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class g
    extends MessageNano {
        public long a;

        public g() {
            this.a();
        }

        public g a() {
            this.a = 1209600L;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            long l6 = this.a;
            int n6 = n2;
            if (l6 != 1209600L) {
                n6 = n2 + CodedOutputByteBufferNano.computeUInt64Size((int)1, (long)l6);
            }
            return n6;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 8) {
                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                    break;
                }
                this.a = codedInputByteBufferNano.readUInt64();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long l6 = this.a;
            if (l6 != 1209600L) {
                codedOutputByteBufferNano.writeUInt64(1, l6);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class h
    extends MessageNano {
        public String a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;

        public h() {
            this.a();
        }

        public h a() {
            this.a = "";
            this.b = 600;
            this.c = 300;
            this.d = false;
            this.e = true;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2;
            int n6 = n2 = super.computeSerializedSize();
            if (!this.a.equals((Object)"")) {
                n6 = n2 + CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a);
            }
            int n9 = this.b;
            n2 = n6;
            if (n9 != 600) {
                n2 = n6 + CodedOutputByteBufferNano.computeUInt32Size((int)2, (int)n9);
            }
            n9 = this.c;
            n6 = n2;
            if (n9 != 300) {
                n6 = n2 + CodedOutputByteBufferNano.computeUInt32Size((int)3, (int)n9);
            }
            boolean bl2 = this.d;
            n2 = n6;
            if (bl2) {
                n2 = n6 + CodedOutputByteBufferNano.computeBoolSize((int)4, (boolean)bl2);
            }
            bl2 = this.e;
            n6 = n2;
            if (!bl2) {
                n6 = n2 + CodedOutputByteBufferNano.computeBoolSize((int)5, (boolean)bl2);
            }
            return n6;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 10) {
                    if (n2 != 16) {
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
                        this.c = codedInputByteBufferNano.readUInt32();
                        continue;
                    }
                    this.b = codedInputByteBufferNano.readUInt32();
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
            if ((n2 = this.b) != 600) {
                codedOutputByteBufferNano.writeUInt32(2, n2);
            }
            if ((n2 = this.c) != 300) {
                codedOutputByteBufferNano.writeUInt32(3, n2);
            }
            if (bl2 = this.d) {
                codedOutputByteBufferNano.writeBool(4, bl2);
            }
            if (!(bl2 = this.e)) {
                codedOutputByteBufferNano.writeBool(5, bl2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class i
    extends MessageNano {
        public boolean a;
        public boolean b;
        public boolean c;
        public boolean d;
        public boolean e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q;
        public boolean r;
        public boolean s;
        public boolean t;
        public boolean u;
        public boolean v;
        public boolean w;
        public int x;

        public i() {
            this.a();
        }

        public i a() {
            this.a = false;
            this.b = false;
            this.c = false;
            this.d = false;
            this.e = false;
            this.f = false;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
            this.k = true;
            this.l = false;
            this.m = false;
            this.n = false;
            this.o = false;
            this.p = false;
            this.q = false;
            this.r = false;
            this.s = false;
            this.t = true;
            this.u = false;
            this.v = false;
            this.w = false;
            this.x = -1;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            int n6 = CodedOutputByteBufferNano.computeBoolSize((int)1, (boolean)this.a);
            int n9 = CodedOutputByteBufferNano.computeBoolSize((int)2, (boolean)this.b);
            int n10 = CodedOutputByteBufferNano.computeBoolSize((int)3, (boolean)this.c);
            int n11 = CodedOutputByteBufferNano.computeBoolSize((int)4, (boolean)this.d);
            int n12 = CodedOutputByteBufferNano.computeBoolSize((int)6, (boolean)this.e);
            int n13 = CodedOutputByteBufferNano.computeBoolSize((int)8, (boolean)this.f);
            int n14 = CodedOutputByteBufferNano.computeBoolSize((int)9, (boolean)this.g);
            int n15 = CodedOutputByteBufferNano.computeBoolSize((int)11, (boolean)this.h);
            int n16 = CodedOutputByteBufferNano.computeBoolSize((int)12, (boolean)this.i);
            int n17 = CodedOutputByteBufferNano.computeBoolSize((int)15, (boolean)this.j);
            int n18 = CodedOutputByteBufferNano.computeBoolSize((int)16, (boolean)this.k);
            int n19 = CodedOutputByteBufferNano.computeBoolSize((int)18, (boolean)this.l);
            int n20 = CodedOutputByteBufferNano.computeBoolSize((int)19, (boolean)this.m);
            int n21 = CodedOutputByteBufferNano.computeBoolSize((int)21, (boolean)this.n);
            int n22 = CodedOutputByteBufferNano.computeBoolSize((int)22, (boolean)this.o);
            int n23 = CodedOutputByteBufferNano.computeBoolSize((int)23, (boolean)this.p);
            int n24 = CodedOutputByteBufferNano.computeBoolSize((int)24, (boolean)this.q);
            int n25 = CodedOutputByteBufferNano.computeBoolSize((int)25, (boolean)this.r);
            int n26 = CodedOutputByteBufferNano.computeBoolSize((int)26, (boolean)this.s);
            int n27 = CodedOutputByteBufferNano.computeBoolSize((int)27, (boolean)this.t);
            n19 = CodedOutputByteBufferNano.computeBoolSize((int)28, (boolean)this.u) + (n27 + (n26 + (n25 + (n24 + (n23 + (n22 + (n21 + (n20 + (n19 + (n18 + (n17 + (n16 + (n15 + (n14 + (n13 + (n12 + (n11 + (n10 + (n9 + (n6 + n2))))))))))))))))))));
            boolean bl2 = this.v;
            n10 = n19;
            if (bl2) {
                n10 = n19 + CodedOutputByteBufferNano.computeBoolSize((int)29, (boolean)bl2);
            }
            bl2 = this.w;
            n19 = n10;
            if (bl2) {
                n19 = n10 + CodedOutputByteBufferNano.computeBoolSize((int)33, (boolean)bl2);
            }
            n20 = this.x;
            n10 = n19;
            if (n20 != -1) {
                n10 = n19 + CodedOutputByteBufferNano.computeInt32Size((int)34, (int)n20);
            }
            return n10;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            block27: while (true) {
                int n2 = codedInputByteBufferNano.readTag();
                switch (n2) {
                    default: {
                        if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue block27;
                        break block27;
                    }
                    case 272: {
                        n2 = codedInputByteBufferNano.readInt32();
                        if (n2 != -1 && n2 != 0 && n2 != 1) continue block27;
                        this.x = n2;
                        continue block27;
                    }
                    case 264: {
                        this.w = codedInputByteBufferNano.readBool();
                        continue block27;
                    }
                    case 232: {
                        this.v = codedInputByteBufferNano.readBool();
                        continue block27;
                    }
                    case 224: {
                        this.u = codedInputByteBufferNano.readBool();
                        continue block27;
                    }
                    case 216: {
                        this.t = codedInputByteBufferNano.readBool();
                        continue block27;
                    }
                    case 208: {
                        this.s = codedInputByteBufferNano.readBool();
                        continue block27;
                    }
                    case 200: {
                        this.r = codedInputByteBufferNano.readBool();
                        continue block27;
                    }
                    case 192: {
                        this.q = codedInputByteBufferNano.readBool();
                        continue block27;
                    }
                    case 184: {
                        this.p = codedInputByteBufferNano.readBool();
                        continue block27;
                    }
                    case 176: {
                        this.o = codedInputByteBufferNano.readBool();
                        continue block27;
                    }
                    case 168: {
                        this.n = codedInputByteBufferNano.readBool();
                        continue block27;
                    }
                    case 152: {
                        this.m = codedInputByteBufferNano.readBool();
                        continue block27;
                    }
                    case 144: {
                        this.l = codedInputByteBufferNano.readBool();
                        continue block27;
                    }
                    case 128: {
                        this.k = codedInputByteBufferNano.readBool();
                        continue block27;
                    }
                    case 120: {
                        this.j = codedInputByteBufferNano.readBool();
                        continue block27;
                    }
                    case 96: {
                        this.i = codedInputByteBufferNano.readBool();
                        continue block27;
                    }
                    case 88: {
                        this.h = codedInputByteBufferNano.readBool();
                        continue block27;
                    }
                    case 72: {
                        this.g = codedInputByteBufferNano.readBool();
                        continue block27;
                    }
                    case 64: {
                        this.f = codedInputByteBufferNano.readBool();
                        continue block27;
                    }
                    case 48: {
                        this.e = codedInputByteBufferNano.readBool();
                        continue block27;
                    }
                    case 32: {
                        this.d = codedInputByteBufferNano.readBool();
                        continue block27;
                    }
                    case 24: {
                        this.c = codedInputByteBufferNano.readBool();
                        continue block27;
                    }
                    case 16: {
                        this.b = codedInputByteBufferNano.readBool();
                        continue block27;
                    }
                    case 8: {
                        this.a = codedInputByteBufferNano.readBool();
                        continue block27;
                    }
                    case 0: 
                }
                break;
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int n2;
            codedOutputByteBufferNano.writeBool(1, this.a);
            codedOutputByteBufferNano.writeBool(2, this.b);
            codedOutputByteBufferNano.writeBool(3, this.c);
            codedOutputByteBufferNano.writeBool(4, this.d);
            codedOutputByteBufferNano.writeBool(6, this.e);
            codedOutputByteBufferNano.writeBool(8, this.f);
            codedOutputByteBufferNano.writeBool(9, this.g);
            codedOutputByteBufferNano.writeBool(11, this.h);
            codedOutputByteBufferNano.writeBool(12, this.i);
            codedOutputByteBufferNano.writeBool(15, this.j);
            codedOutputByteBufferNano.writeBool(16, this.k);
            codedOutputByteBufferNano.writeBool(18, this.l);
            codedOutputByteBufferNano.writeBool(19, this.m);
            codedOutputByteBufferNano.writeBool(21, this.n);
            codedOutputByteBufferNano.writeBool(22, this.o);
            codedOutputByteBufferNano.writeBool(23, this.p);
            codedOutputByteBufferNano.writeBool(24, this.q);
            codedOutputByteBufferNano.writeBool(25, this.r);
            codedOutputByteBufferNano.writeBool(26, this.s);
            codedOutputByteBufferNano.writeBool(27, this.t);
            codedOutputByteBufferNano.writeBool(28, this.u);
            boolean bl2 = this.v;
            if (bl2) {
                codedOutputByteBufferNano.writeBool(29, bl2);
            }
            if (bl2 = this.w) {
                codedOutputByteBufferNano.writeBool(33, bl2);
            }
            if ((n2 = this.x) != -1) {
                codedOutputByteBufferNano.writeInt32(34, n2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class j
    extends MessageNano {
        public long a;

        public j() {
            this.a();
        }

        public j a() {
            this.a = 900L;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            return CodedOutputByteBufferNano.computeInt64Size((int)1, (long)this.a) + n2;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 8) {
                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                    break;
                }
                this.a = codedInputByteBufferNano.readInt64();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt64(1, this.a);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class k
    extends MessageNano {
        private static volatile k[] c;
        public a a;
        public b b;

        public k() {
            this.a();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public static k[] b() {
            Object object;
            if (c != null) return c;
            Object object2 = object = InternalNano.LAZY_INIT_LOCK;
            synchronized (object2) {
                if (c != null) return c;
                c = new k[0];
                return c;
            }
        }

        public k a() {
            this.a = null;
            this.b = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            MessageNano messageNano = this.a;
            int n6 = n2;
            if (messageNano != null) {
                n6 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)1, (MessageNano)messageNano);
            }
            messageNano = this.b;
            n2 = n6;
            if (messageNano != null) {
                n2 = n6 + CodedOutputByteBufferNano.computeMessageSize((int)2, (MessageNano)messageNano);
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
                    if (this.b == null) {
                        this.b = new b();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.b);
                    continue;
                }
                if (this.a == null) {
                    this.a = new a();
                }
                codedInputByteBufferNano.readMessage((MessageNano)this.a);
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MessageNano messageNano = this.a;
            if (messageNano != null) {
                codedOutputByteBufferNano.writeMessage(1, messageNano);
            }
            if ((messageNano = this.b) != null) {
                codedOutputByteBufferNano.writeMessage(2, messageNano);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static final class com.yandex.metrica.impl.ob.xf$k$a
        extends MessageNano {
            public long a;
            public float b;
            public int c;
            public int d;
            public long e;
            public int f;
            public boolean g;
            public boolean h;
            public boolean i;
            public long j;
            public a k;
            public a l;
            public a m;
            public a n;
            public b o;
            public boolean p;
            public boolean q;

            public com.yandex.metrica.impl.ob.xf$k$a() {
                this.a();
            }

            public com.yandex.metrica.impl.ob.xf$k$a a() {
                this.a = 5000L;
                this.b = 10.0f;
                this.c = 20;
                this.d = 200;
                this.e = 60000L;
                this.f = 10000;
                this.g = false;
                this.h = false;
                this.i = true;
                this.j = 60000L;
                this.k = null;
                this.l = null;
                this.m = null;
                this.n = null;
                this.o = null;
                this.p = false;
                this.q = false;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int n2 = super.computeSerializedSize();
                int n6 = CodedOutputByteBufferNano.computeInt64Size((int)1, (long)this.a);
                int n9 = CodedOutputByteBufferNano.computeFloatSize((int)2, (float)this.b);
                int n10 = CodedOutputByteBufferNano.computeInt32Size((int)3, (int)this.c);
                int n11 = CodedOutputByteBufferNano.computeInt32Size((int)4, (int)this.d);
                int n12 = CodedOutputByteBufferNano.computeInt64Size((int)5, (long)this.e);
                int n13 = CodedOutputByteBufferNano.computeInt32Size((int)6, (int)this.f);
                int n14 = CodedOutputByteBufferNano.computeBoolSize((int)7, (boolean)this.g);
                int n15 = CodedOutputByteBufferNano.computeBoolSize((int)8, (boolean)this.h);
                n14 = CodedOutputByteBufferNano.computeInt64Size((int)9, (long)this.j) + (n15 + (n14 + (n13 + (n12 + (n11 + (n10 + (n9 + (n6 + n2))))))));
                MessageNano messageNano = this.k;
                n6 = n14;
                if (messageNano != null) {
                    n6 = n14 + CodedOutputByteBufferNano.computeMessageSize((int)10, (MessageNano)messageNano);
                }
                messageNano = this.l;
                n14 = n6;
                if (messageNano != null) {
                    n14 = n6 + CodedOutputByteBufferNano.computeMessageSize((int)11, (MessageNano)messageNano);
                }
                messageNano = this.m;
                n6 = n14;
                if (messageNano != null) {
                    n6 = n14 + CodedOutputByteBufferNano.computeMessageSize((int)12, (MessageNano)messageNano);
                }
                n14 = CodedOutputByteBufferNano.computeBoolSize((int)13, (boolean)this.i) + n6;
                messageNano = this.n;
                n6 = n14;
                if (messageNano != null) {
                    n6 = n14 + CodedOutputByteBufferNano.computeMessageSize((int)14, (MessageNano)messageNano);
                }
                messageNano = this.o;
                n14 = n6;
                if (messageNano != null) {
                    n14 = n6 + CodedOutputByteBufferNano.computeMessageSize((int)15, (MessageNano)messageNano);
                }
                boolean bl2 = this.p;
                n6 = n14;
                if (bl2) {
                    n6 = n14 + CodedOutputByteBufferNano.computeBoolSize((int)16, (boolean)bl2);
                }
                bl2 = this.q;
                n14 = n6;
                if (bl2) {
                    n14 = n6 + CodedOutputByteBufferNano.computeBoolSize((int)17, (boolean)bl2);
                }
                return n14;
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                block20: while (true) {
                    int n2 = codedInputByteBufferNano.readTag();
                    switch (n2) {
                        default: {
                            if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue block20;
                            break block20;
                        }
                        case 136: {
                            this.q = codedInputByteBufferNano.readBool();
                            continue block20;
                        }
                        case 128: {
                            this.p = codedInputByteBufferNano.readBool();
                            continue block20;
                        }
                        case 122: {
                            if (this.o == null) {
                                this.o = new b();
                            }
                            codedInputByteBufferNano.readMessage((MessageNano)this.o);
                            continue block20;
                        }
                        case 114: {
                            if (this.n == null) {
                                this.n = new a();
                            }
                            codedInputByteBufferNano.readMessage((MessageNano)this.n);
                            continue block20;
                        }
                        case 104: {
                            this.i = codedInputByteBufferNano.readBool();
                            continue block20;
                        }
                        case 98: {
                            if (this.m == null) {
                                this.m = new a();
                            }
                            codedInputByteBufferNano.readMessage((MessageNano)this.m);
                            continue block20;
                        }
                        case 90: {
                            if (this.l == null) {
                                this.l = new a();
                            }
                            codedInputByteBufferNano.readMessage((MessageNano)this.l);
                            continue block20;
                        }
                        case 82: {
                            if (this.k == null) {
                                this.k = new a();
                            }
                            codedInputByteBufferNano.readMessage((MessageNano)this.k);
                            continue block20;
                        }
                        case 72: {
                            this.j = codedInputByteBufferNano.readInt64();
                            continue block20;
                        }
                        case 64: {
                            this.h = codedInputByteBufferNano.readBool();
                            continue block20;
                        }
                        case 56: {
                            this.g = codedInputByteBufferNano.readBool();
                            continue block20;
                        }
                        case 48: {
                            this.f = codedInputByteBufferNano.readInt32();
                            continue block20;
                        }
                        case 40: {
                            this.e = codedInputByteBufferNano.readInt64();
                            continue block20;
                        }
                        case 32: {
                            this.d = codedInputByteBufferNano.readInt32();
                            continue block20;
                        }
                        case 24: {
                            this.c = codedInputByteBufferNano.readInt32();
                            continue block20;
                        }
                        case 21: {
                            this.b = codedInputByteBufferNano.readFloat();
                            continue block20;
                        }
                        case 8: {
                            this.a = codedInputByteBufferNano.readInt64();
                            continue block20;
                        }
                        case 0: 
                    }
                    break;
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                boolean bl2;
                codedOutputByteBufferNano.writeInt64(1, this.a);
                codedOutputByteBufferNano.writeFloat(2, this.b);
                codedOutputByteBufferNano.writeInt32(3, this.c);
                codedOutputByteBufferNano.writeInt32(4, this.d);
                codedOutputByteBufferNano.writeInt64(5, this.e);
                codedOutputByteBufferNano.writeInt32(6, this.f);
                codedOutputByteBufferNano.writeBool(7, this.g);
                codedOutputByteBufferNano.writeBool(8, this.h);
                codedOutputByteBufferNano.writeInt64(9, this.j);
                MessageNano messageNano = this.k;
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(10, messageNano);
                }
                if ((messageNano = this.l) != null) {
                    codedOutputByteBufferNano.writeMessage(11, messageNano);
                }
                if ((messageNano = this.m) != null) {
                    codedOutputByteBufferNano.writeMessage(12, messageNano);
                }
                codedOutputByteBufferNano.writeBool(13, this.i);
                messageNano = this.n;
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(14, messageNano);
                }
                if ((messageNano = this.o) != null) {
                    codedOutputByteBufferNano.writeMessage(15, messageNano);
                }
                if (bl2 = this.p) {
                    codedOutputByteBufferNano.writeBool(16, bl2);
                }
                if (bl2 = this.q) {
                    codedOutputByteBufferNano.writeBool(17, bl2);
                }
                super.writeTo(codedOutputByteBufferNano);
            }

            public static final class com.yandex.metrica.impl.ob.xf$k$a$a
            extends MessageNano {
                public boolean a;
                public boolean b;
                public a c;

                public com.yandex.metrica.impl.ob.xf$k$a$a() {
                    this.a();
                }

                public com.yandex.metrica.impl.ob.xf$k$a$a a() {
                    this.a = true;
                    this.b = false;
                    this.c = null;
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    int n2 = super.computeSerializedSize();
                    int n6 = CodedOutputByteBufferNano.computeBoolSize((int)1, (boolean)this.a);
                    n6 = CodedOutputByteBufferNano.computeBoolSize((int)2, (boolean)this.b) + (n6 + n2);
                    a a2 = this.c;
                    n2 = n6;
                    if (a2 != null) {
                        n2 = n6 + CodedOutputByteBufferNano.computeMessageSize((int)3, (MessageNano)a2);
                    }
                    return n2;
                }

                public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                    int n2;
                    while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                        if (n2 != 8) {
                            if (n2 != 16) {
                                if (n2 != 26) {
                                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                    break;
                                }
                                if (this.c == null) {
                                    this.c = new a();
                                }
                                codedInputByteBufferNano.readMessage((MessageNano)this.c);
                                continue;
                            }
                            this.b = codedInputByteBufferNano.readBool();
                            continue;
                        }
                        this.a = codedInputByteBufferNano.readBool();
                    }
                    return this;
                }

                public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                    codedOutputByteBufferNano.writeBool(1, this.a);
                    codedOutputByteBufferNano.writeBool(2, this.b);
                    a a2 = this.c;
                    if (a2 != null) {
                        codedOutputByteBufferNano.writeMessage(3, (MessageNano)a2);
                    }
                    super.writeTo(codedOutputByteBufferNano);
                }

                public static final class a
                extends MessageNano {
                    public long a;
                    public long b;

                    public a() {
                        this.a();
                    }

                    public a a() {
                        this.a = 0L;
                        this.b = 0L;
                        this.cachedSize = -1;
                        return this;
                    }

                    public int computeSerializedSize() {
                        int n2 = super.computeSerializedSize();
                        int n6 = CodedOutputByteBufferNano.computeInt64Size((int)1, (long)this.a);
                        return CodedOutputByteBufferNano.computeInt64Size((int)2, (long)this.b) + (n6 + n2);
                    }

                    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                        int n2;
                        while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                            if (n2 != 8) {
                                if (n2 != 16) {
                                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                    break;
                                }
                                this.b = codedInputByteBufferNano.readInt64();
                                continue;
                            }
                            this.a = codedInputByteBufferNano.readInt64();
                        }
                        return this;
                    }

                    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                        codedOutputByteBufferNano.writeInt64(1, this.a);
                        codedOutputByteBufferNano.writeInt64(2, this.b);
                        super.writeTo(codedOutputByteBufferNano);
                    }
                }
            }

            public static final class b
            extends MessageNano {
                public boolean a;
                public boolean b;
                public a c;

                public b() {
                    this.a();
                }

                public b a() {
                    this.a = true;
                    this.b = false;
                    this.c = null;
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    int n2 = super.computeSerializedSize();
                    int n6 = CodedOutputByteBufferNano.computeBoolSize((int)1, (boolean)this.a);
                    n2 = CodedOutputByteBufferNano.computeBoolSize((int)2, (boolean)this.b) + (n6 + n2);
                    a a2 = this.c;
                    n6 = n2;
                    if (a2 != null) {
                        n6 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)3, (MessageNano)a2);
                    }
                    return n6;
                }

                public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                    int n2;
                    while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                        if (n2 != 8) {
                            if (n2 != 16) {
                                if (n2 != 26) {
                                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                    break;
                                }
                                if (this.c == null) {
                                    this.c = new a();
                                }
                                codedInputByteBufferNano.readMessage((MessageNano)this.c);
                                continue;
                            }
                            this.b = codedInputByteBufferNano.readBool();
                            continue;
                        }
                        this.a = codedInputByteBufferNano.readBool();
                    }
                    return this;
                }

                public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                    codedOutputByteBufferNano.writeBool(1, this.a);
                    codedOutputByteBufferNano.writeBool(2, this.b);
                    a a2 = this.c;
                    if (a2 != null) {
                        codedOutputByteBufferNano.writeMessage(3, (MessageNano)a2);
                    }
                    super.writeTo(codedOutputByteBufferNano);
                }

                public static final class a
                extends MessageNano {
                    public long a;
                    public long b;
                    public int c;

                    public a() {
                        this.a();
                    }

                    public a a() {
                        this.a = 0L;
                        this.b = 0L;
                        this.c = 0;
                        this.cachedSize = -1;
                        return this;
                    }

                    public int computeSerializedSize() {
                        int n2 = super.computeSerializedSize();
                        int n6 = CodedOutputByteBufferNano.computeInt64Size((int)1, (long)this.a);
                        int n9 = CodedOutputByteBufferNano.computeInt64Size((int)2, (long)this.b);
                        return CodedOutputByteBufferNano.computeInt32Size((int)3, (int)this.c) + (n9 + (n6 + n2));
                    }

                    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                        int n2;
                        while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                            if (n2 != 8) {
                                if (n2 != 16) {
                                    if (n2 != 24) {
                                        if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                        break;
                                    }
                                    n2 = codedInputByteBufferNano.readInt32();
                                    if (n2 != 0 && n2 != 1 && n2 != 2 && n2 != 3) continue;
                                    this.c = n2;
                                    continue;
                                }
                                this.b = codedInputByteBufferNano.readInt64();
                                continue;
                            }
                            this.a = codedInputByteBufferNano.readInt64();
                        }
                        return this;
                    }

                    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                        codedOutputByteBufferNano.writeInt64(1, this.a);
                        codedOutputByteBufferNano.writeInt64(2, this.b);
                        codedOutputByteBufferNano.writeInt32(3, this.c);
                        super.writeTo(codedOutputByteBufferNano);
                    }
                }
            }
        }

        public static final class b
        extends MessageNano {
            public int[] a;
            public int[] b;

            public b() {
                this.a();
            }

            public b a() {
                int[] nArray = WireFormatNano.EMPTY_INT_ARRAY;
                this.a = nArray;
                this.b = nArray;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int n2;
                int n6 = super.computeSerializedSize();
                int[] nArray = this.a;
                int n9 = 0;
                int n10 = n6;
                if (nArray != null) {
                    n10 = n6;
                    if (nArray.length > 0) {
                        n10 = 0;
                        for (n2 = 0; n2 < (nArray = this.a).length; ++n2) {
                            n10 += CodedOutputByteBufferNano.computeInt32SizeNoTag((int)nArray[n2]);
                        }
                        n10 = n6 + n10 + nArray.length * 1;
                    }
                }
                nArray = this.b;
                n2 = n10;
                if (nArray != null) {
                    n2 = n10;
                    if (nArray.length > 0) {
                        n6 = 0;
                        n2 = n9;
                        n9 = n6;
                        while (n2 < (nArray = this.b).length) {
                            n9 += CodedOutputByteBufferNano.computeInt32SizeNoTag((int)nArray[n2]);
                            ++n2;
                        }
                        n2 = n10 + n9 + nArray.length * 1;
                    }
                }
                return n2;
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                int n2;
                while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                    int[] nArray;
                    int[] nArray2;
                    int[] nArray3;
                    int n6;
                    int n9;
                    int n10;
                    if (n2 != 8) {
                        if (n2 != 10) {
                            if (n2 != 16) {
                                if (n2 != 18) {
                                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                    break;
                                }
                                n10 = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                                n2 = codedInputByteBufferNano.getPosition();
                                n9 = 0;
                                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                                    n6 = codedInputByteBufferNano.readInt32();
                                    if (n6 != 0 && n6 != 2 && n6 != 3) continue;
                                    ++n9;
                                }
                                if (n9 != 0) {
                                    codedInputByteBufferNano.rewindToPosition(n2);
                                    nArray3 = this.b;
                                    n2 = nArray3 == null ? 0 : nArray3.length;
                                    nArray2 = new int[n9 + n2];
                                    n9 = n2;
                                    if (n2 != 0) {
                                        System.arraycopy((Object)nArray3, (int)0, (Object)nArray2, (int)0, (int)n2);
                                        n9 = n2;
                                    }
                                    while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                                        n2 = codedInputByteBufferNano.readInt32();
                                        if (n2 != 0 && n2 != 2 && n2 != 3) continue;
                                        nArray2[n9] = n2;
                                        ++n9;
                                    }
                                    this.b = nArray2;
                                }
                                codedInputByteBufferNano.popLimit(n10);
                                continue;
                            }
                            n10 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)16);
                            nArray3 = new int[n10];
                            n2 = 0;
                            for (n9 = 0; n9 < n10; ++n9) {
                                if (n9 != 0) {
                                    codedInputByteBufferNano.readTag();
                                }
                                if ((n6 = codedInputByteBufferNano.readInt32()) != 0 && n6 != 2 && n6 != 3) continue;
                                nArray3[n2] = n6;
                                ++n2;
                            }
                            if (n2 == 0) continue;
                            nArray = this.b;
                            n9 = nArray == null ? 0 : nArray.length;
                            if (n9 == 0 && n2 == n10) {
                                this.b = nArray3;
                                continue;
                            }
                            nArray2 = new int[n9 + n2];
                            if (n9 != 0) {
                                System.arraycopy((Object)nArray, (int)0, (Object)nArray2, (int)0, (int)n9);
                            }
                            System.arraycopy((Object)nArray3, (int)0, (Object)nArray2, (int)n9, (int)n2);
                            this.b = nArray2;
                            continue;
                        }
                        n10 = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                        n2 = codedInputByteBufferNano.getPosition();
                        n9 = 0;
                        while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                            n6 = codedInputByteBufferNano.readInt32();
                            if (n6 != 0 && n6 != 1 && n6 != 2 && n6 != 3 && n6 != 4) continue;
                            ++n9;
                        }
                        if (n9 != 0) {
                            codedInputByteBufferNano.rewindToPosition(n2);
                            nArray3 = this.a;
                            n2 = nArray3 == null ? 0 : nArray3.length;
                            nArray2 = new int[n9 + n2];
                            n9 = n2;
                            if (n2 != 0) {
                                System.arraycopy((Object)nArray3, (int)0, (Object)nArray2, (int)0, (int)n2);
                                n9 = n2;
                            }
                            while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                                n2 = codedInputByteBufferNano.readInt32();
                                if (n2 != 0 && n2 != 1 && n2 != 2 && n2 != 3 && n2 != 4) continue;
                                nArray2[n9] = n2;
                                ++n9;
                            }
                            this.a = nArray2;
                        }
                        codedInputByteBufferNano.popLimit(n10);
                        continue;
                    }
                    n10 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)8);
                    nArray = new int[n10];
                    n2 = 0;
                    for (n9 = 0; n9 < n10; ++n9) {
                        if (n9 != 0) {
                            codedInputByteBufferNano.readTag();
                        }
                        if ((n6 = codedInputByteBufferNano.readInt32()) != 0 && n6 != 1 && n6 != 2 && n6 != 3 && n6 != 4) continue;
                        nArray[n2] = n6;
                        ++n2;
                    }
                    if (n2 == 0) continue;
                    nArray3 = this.a;
                    n9 = nArray3 == null ? 0 : nArray3.length;
                    if (n9 == 0 && n2 == n10) {
                        this.a = nArray;
                        continue;
                    }
                    nArray2 = new int[n9 + n2];
                    if (n9 != 0) {
                        System.arraycopy((Object)nArray3, (int)0, (Object)nArray2, (int)0, (int)n9);
                    }
                    System.arraycopy((Object)nArray, (int)0, (Object)nArray2, (int)n9, (int)n2);
                    this.a = nArray2;
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                int n2;
                int[] nArray = this.a;
                int n6 = 0;
                if (nArray != null && nArray.length > 0) {
                    for (n2 = 0; n2 < (nArray = this.a).length; ++n2) {
                        codedOutputByteBufferNano.writeInt32(1, nArray[n2]);
                    }
                }
                if ((nArray = this.b) != null && nArray.length > 0) {
                    for (n2 = n6; n2 < (nArray = this.b).length; ++n2) {
                        codedOutputByteBufferNano.writeInt32(2, nArray[n2]);
                    }
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }
    }

    public static final class l
    extends MessageNano {
        private static volatile l[] c;
        public String a;
        public byte[] b;

        public l() {
            this.a();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public static l[] b() {
            Object object;
            if (c != null) return c;
            Object object2 = object = InternalNano.LAZY_INIT_LOCK;
            synchronized (object2) {
                if (c != null) return c;
                c = new l[0];
                return c;
            }
        }

        public l a() {
            this.a = "";
            this.b = WireFormatNano.EMPTY_BYTES;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2;
            int n6 = n2 = super.computeSerializedSize();
            if (!this.a.equals((Object)"")) {
                n6 = n2 + CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a);
            }
            n2 = n6;
            if (!Arrays.equals((byte[])this.b, (byte[])WireFormatNano.EMPTY_BYTES)) {
                n2 = n6 + CodedOutputByteBufferNano.computeBytesSize((int)2, (byte[])this.b);
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
                    this.b = codedInputByteBufferNano.readBytes();
                    continue;
                }
                this.a = codedInputByteBufferNano.readString();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.a.equals((Object)"")) {
                codedOutputByteBufferNano.writeString(1, this.a);
            }
            if (!Arrays.equals((byte[])this.b, (byte[])WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(2, this.b);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class m
    extends MessageNano {
        private static volatile m[] c;
        public String a;
        public boolean b;

        public m() {
            this.a();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public static m[] b() {
            Object object;
            if (c != null) return c;
            Object object2 = object = InternalNano.LAZY_INIT_LOCK;
            synchronized (object2) {
                if (c != null) return c;
                c = new m[0];
                return c;
            }
        }

        public m a() {
            this.a = "";
            this.b = false;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            int n6 = CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a);
            return CodedOutputByteBufferNano.computeBoolSize((int)2, (boolean)this.b) + (n6 + n2);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 10) {
                    if (n2 != 16) {
                        if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                        break;
                    }
                    this.b = codedInputByteBufferNano.readBool();
                    continue;
                }
                this.a = codedInputByteBufferNano.readString();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeString(1, this.a);
            codedOutputByteBufferNano.writeBool(2, this.b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class n
    extends MessageNano {
        public long a;
        public long b;

        public n() {
            this.a();
        }

        public n a() {
            this.a = 86400L;
            this.b = 432000L;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            int n6 = CodedOutputByteBufferNano.computeInt64Size((int)1, (long)this.a);
            return CodedOutputByteBufferNano.computeInt64Size((int)2, (long)this.b) + (n6 + n2);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 8) {
                    if (n2 != 16) {
                        if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                        break;
                    }
                    this.b = codedInputByteBufferNano.readInt64();
                    continue;
                }
                this.a = codedInputByteBufferNano.readInt64();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt64(1, this.a);
            codedOutputByteBufferNano.writeInt64(2, this.b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class o
    extends MessageNano {
        private static volatile o[] g;
        public String a;
        public String b;
        public String c;
        public a[] d;
        public long e;
        public int[] f;

        public o() {
            this.a();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public static o[] b() {
            Object object;
            if (g != null) return g;
            Object object2 = object = InternalNano.LAZY_INIT_LOCK;
            synchronized (object2) {
                if (g != null) return g;
                g = new o[0];
                return g;
            }
        }

        public o a() {
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
            n9 = CodedOutputByteBufferNano.computeStringSize((int)3, (String)this.c) + (n9 + (n6 + n2));
            Object object = this.d;
            int n10 = 0;
            n6 = n9;
            if (object != null) {
                n6 = n9;
                if (((a[])object).length > 0) {
                    n2 = 0;
                    while (true) {
                        object = this.d;
                        n6 = n9;
                        if (n2 >= ((a[])object).length) break;
                        object = object[n2];
                        n6 = n9;
                        if (object != null) {
                            n6 = n9 + CodedOutputByteBufferNano.computeMessageSize((int)4, (MessageNano)object);
                        }
                        ++n2;
                        n9 = n6;
                    }
                }
            }
            n6 = CodedOutputByteBufferNano.computeInt64Size((int)5, (long)this.e) + n6;
            object = this.f;
            n9 = n6;
            if (object != null) {
                n9 = n6;
                if (((a[])object).length > 0) {
                    n2 = 0;
                    for (n9 = n10; n9 < ((a[])(object = (Object)this.f)).length; ++n9) {
                        n2 += CodedOutputByteBufferNano.computeInt32SizeNoTag((int)object[n9]);
                    }
                    n9 = n6 + n2 + ((a[])object).length * 1;
                }
            }
            return n9;
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
                                this.e = codedInputByteBufferNano.readInt64();
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
            codedOutputByteBufferNano.writeInt64(5, this.e);
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

    public static final class p
    extends MessageNano {
        public long a;
        public long b;
        public long c;
        public long d;

        public p() {
            this.a();
        }

        public p a() {
            this.a = 432000000L;
            this.b = 86400000L;
            this.c = 10000L;
            this.d = 3600000L;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            long l6 = this.a;
            int n6 = n2;
            if (l6 != 432000000L) {
                n6 = n2 + CodedOutputByteBufferNano.computeInt64Size((int)1, (long)l6);
            }
            l6 = this.b;
            n2 = n6;
            if (l6 != 86400000L) {
                n2 = n6 + CodedOutputByteBufferNano.computeInt64Size((int)2, (long)l6);
            }
            l6 = this.c;
            n6 = n2;
            if (l6 != 10000L) {
                n6 = n2 + CodedOutputByteBufferNano.computeInt64Size((int)3, (long)l6);
            }
            l6 = this.d;
            n2 = n6;
            if (l6 != 3600000L) {
                n2 = n6 + CodedOutputByteBufferNano.computeInt64Size((int)4, (long)l6);
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
                            this.d = codedInputByteBufferNano.readInt64();
                            continue;
                        }
                        this.c = codedInputByteBufferNano.readInt64();
                        continue;
                    }
                    this.b = codedInputByteBufferNano.readInt64();
                    continue;
                }
                this.a = codedInputByteBufferNano.readInt64();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long l6 = this.a;
            if (l6 != 432000000L) {
                codedOutputByteBufferNano.writeInt64(1, l6);
            }
            if ((l6 = this.b) != 86400000L) {
                codedOutputByteBufferNano.writeInt64(2, l6);
            }
            if ((l6 = this.c) != 10000L) {
                codedOutputByteBufferNano.writeInt64(3, l6);
            }
            if ((l6 = this.d) != 3600000L) {
                codedOutputByteBufferNano.writeInt64(4, l6);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class q
    extends MessageNano {
        public long a;
        public String b;
        public int[] c;
        public int[] d;
        public long e;
        public int f;
        public long g;
        public long h;
        public long i;
        public long j;

        public q() {
            this.a();
        }

        public q a() {
            this.a = 0L;
            this.b = "";
            int[] nArray = WireFormatNano.EMPTY_INT_ARRAY;
            this.c = nArray;
            this.d = nArray;
            this.e = 259200L;
            this.f = 10;
            this.g = 43200L;
            this.h = 3600L;
            this.i = 86400L;
            this.j = 30L;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            int n6 = CodedOutputByteBufferNano.computeInt64Size((int)1, (long)this.a);
            int n9 = CodedOutputByteBufferNano.computeStringSize((int)2, (String)this.b) + (n6 + n2);
            int[] nArray = this.c;
            int n10 = 0;
            n6 = n9;
            if (nArray != null) {
                n6 = n9;
                if (nArray.length > 0) {
                    n6 = 0;
                    for (n2 = 0; n2 < (nArray = this.c).length; ++n2) {
                        n6 += CodedOutputByteBufferNano.computeInt32SizeNoTag((int)nArray[n2]);
                    }
                    n6 = n9 + n6 + nArray.length * 1;
                }
            }
            n2 = CodedOutputByteBufferNano.computeInt64Size((int)4, (long)this.e);
            n2 = CodedOutputByteBufferNano.computeInt32Size((int)5, (int)this.f) + (n2 + n6);
            long l6 = this.g;
            n6 = n2;
            if (l6 != 43200L) {
                n6 = n2 + CodedOutputByteBufferNano.computeInt64Size((int)6, (long)l6);
            }
            l6 = this.h;
            n2 = n6;
            if (l6 != 3600L) {
                n2 = n6 + CodedOutputByteBufferNano.computeInt64Size((int)7, (long)l6);
            }
            l6 = this.i;
            n6 = n2;
            if (l6 != 86400L) {
                n6 = n2 + CodedOutputByteBufferNano.computeInt64Size((int)8, (long)l6);
            }
            nArray = this.d;
            n2 = n6;
            if (nArray != null) {
                n2 = n6;
                if (nArray.length > 0) {
                    n9 = 0;
                    n2 = n10;
                    n10 = n9;
                    while (n2 < (nArray = this.d).length) {
                        n10 += CodedOutputByteBufferNano.computeInt32SizeNoTag((int)nArray[n2]);
                        ++n2;
                    }
                    n2 = n6 + n10 + nArray.length * 1;
                }
            }
            l6 = this.j;
            n6 = n2;
            if (l6 != 30L) {
                n6 = n2 + CodedOutputByteBufferNano.computeInt64Size((int)10, (long)l6);
            }
            return n6;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            block15: while (true) {
                int n2 = codedInputByteBufferNano.readTag();
                switch (n2) {
                    default: {
                        if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue block15;
                        break block15;
                    }
                    case 80: {
                        this.j = codedInputByteBufferNano.readInt64();
                        continue block15;
                    }
                    case 74: {
                        int n6 = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                        n2 = codedInputByteBufferNano.getPosition();
                        int n9 = 0;
                        while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                            codedInputByteBufferNano.readInt32();
                            ++n9;
                        }
                        codedInputByteBufferNano.rewindToPosition(n2);
                        int[] nArray = this.d;
                        n2 = nArray == null ? 0 : nArray.length;
                        int n10 = n9 + n2;
                        int[] nArray2 = new int[n10];
                        n9 = n2;
                        if (n2 != 0) {
                            System.arraycopy((Object)nArray, (int)0, (Object)nArray2, (int)0, (int)n2);
                            n9 = n2;
                        }
                        while (n9 < n10) {
                            nArray2[n9] = codedInputByteBufferNano.readInt32();
                            ++n9;
                        }
                        this.d = nArray2;
                        codedInputByteBufferNano.popLimit(n6);
                        continue block15;
                    }
                    case 72: {
                        int n9 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)72);
                        int[] nArray = this.d;
                        n2 = nArray == null ? 0 : nArray.length;
                        int n6 = n9 + n2;
                        int[] nArray2 = new int[n6];
                        n9 = n2;
                        if (n2 != 0) {
                            System.arraycopy((Object)nArray, (int)0, (Object)nArray2, (int)0, (int)n2);
                            n9 = n2;
                        }
                        while (n9 < n6 - 1) {
                            nArray2[n9] = codedInputByteBufferNano.readInt32();
                            codedInputByteBufferNano.readTag();
                            ++n9;
                        }
                        nArray2[n9] = codedInputByteBufferNano.readInt32();
                        this.d = nArray2;
                        continue block15;
                    }
                    case 64: {
                        this.i = codedInputByteBufferNano.readInt64();
                        continue block15;
                    }
                    case 56: {
                        this.h = codedInputByteBufferNano.readInt64();
                        continue block15;
                    }
                    case 48: {
                        this.g = codedInputByteBufferNano.readInt64();
                        continue block15;
                    }
                    case 40: {
                        this.f = codedInputByteBufferNano.readInt32();
                        continue block15;
                    }
                    case 32: {
                        this.e = codedInputByteBufferNano.readInt64();
                        continue block15;
                    }
                    case 26: {
                        int n6 = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                        n2 = codedInputByteBufferNano.getPosition();
                        int n9 = 0;
                        while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                            codedInputByteBufferNano.readInt32();
                            ++n9;
                        }
                        codedInputByteBufferNano.rewindToPosition(n2);
                        int[] nArray2 = this.c;
                        n2 = nArray2 == null ? 0 : nArray2.length;
                        int n10 = n9 + n2;
                        int[] nArray = new int[n10];
                        n9 = n2;
                        if (n2 != 0) {
                            System.arraycopy((Object)nArray2, (int)0, (Object)nArray, (int)0, (int)n2);
                            n9 = n2;
                        }
                        while (n9 < n10) {
                            nArray[n9] = codedInputByteBufferNano.readInt32();
                            ++n9;
                        }
                        this.c = nArray;
                        codedInputByteBufferNano.popLimit(n6);
                        continue block15;
                    }
                    case 24: {
                        int n9 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)24);
                        int[] nArray2 = this.c;
                        n2 = nArray2 == null ? 0 : nArray2.length;
                        int n6 = n9 + n2;
                        int[] nArray = new int[n6];
                        n9 = n2;
                        if (n2 != 0) {
                            System.arraycopy((Object)nArray2, (int)0, (Object)nArray, (int)0, (int)n2);
                            n9 = n2;
                        }
                        while (n9 < n6 - 1) {
                            nArray[n9] = codedInputByteBufferNano.readInt32();
                            codedInputByteBufferNano.readTag();
                            ++n9;
                        }
                        nArray[n9] = codedInputByteBufferNano.readInt32();
                        this.c = nArray;
                        continue block15;
                    }
                    case 18: {
                        this.b = codedInputByteBufferNano.readString();
                        continue block15;
                    }
                    case 8: {
                        this.a = codedInputByteBufferNano.readInt64();
                        continue block15;
                    }
                    case 0: 
                }
                break;
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int n2;
            codedOutputByteBufferNano.writeInt64(1, this.a);
            codedOutputByteBufferNano.writeString(2, this.b);
            int[] nArray = this.c;
            int n6 = 0;
            if (nArray != null && nArray.length > 0) {
                for (n2 = 0; n2 < (nArray = this.c).length; ++n2) {
                    codedOutputByteBufferNano.writeInt32(3, nArray[n2]);
                }
            }
            codedOutputByteBufferNano.writeInt64(4, this.e);
            codedOutputByteBufferNano.writeInt32(5, this.f);
            long l6 = this.g;
            if (l6 != 43200L) {
                codedOutputByteBufferNano.writeInt64(6, l6);
            }
            if ((l6 = this.h) != 3600L) {
                codedOutputByteBufferNano.writeInt64(7, l6);
            }
            if ((l6 = this.i) != 86400L) {
                codedOutputByteBufferNano.writeInt64(8, l6);
            }
            if ((nArray = this.d) != null && nArray.length > 0) {
                for (n2 = n6; n2 < (nArray = this.d).length; ++n2) {
                    codedOutputByteBufferNano.writeInt32(9, nArray[n2]);
                }
            }
            if ((l6 = this.j) != 30L) {
                codedOutputByteBufferNano.writeInt64(10, l6);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class r
    extends MessageNano {
        public int a;

        public r() {
            this.a();
        }

        public r a() {
            this.a = 86400;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            int n6 = this.a;
            int n9 = n2;
            if (n6 != 86400) {
                n9 = n2 + CodedOutputByteBufferNano.computeUInt32Size((int)1, (int)n6);
            }
            return n9;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 8) {
                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                    break;
                }
                this.a = codedInputByteBufferNano.readUInt32();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int n2 = this.a;
            if (n2 != 86400) {
                codedOutputByteBufferNano.writeUInt32(1, n2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class s
    extends MessageNano {
        public long a;

        public s() {
            this.a();
        }

        public s a() {
            this.a = 18000000L;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            return CodedOutputByteBufferNano.computeInt64Size((int)1, (long)this.a) + n2;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 8) {
                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                    break;
                }
                this.a = codedInputByteBufferNano.readInt64();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt64(1, this.a);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class t
    extends MessageNano {
        public u a;
        public u b;

        public t() {
            this.a();
        }

        public t a() {
            this.a = null;
            this.b = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            u u3 = this.a;
            int n6 = n2;
            if (u3 != null) {
                n6 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)1, (MessageNano)u3);
            }
            u3 = this.b;
            n2 = n6;
            if (u3 != null) {
                n2 = n6 + CodedOutputByteBufferNano.computeMessageSize((int)2, (MessageNano)u3);
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
                    if (this.b == null) {
                        this.b = new u();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano)this.b);
                    continue;
                }
                if (this.a == null) {
                    this.a = new u();
                }
                codedInputByteBufferNano.readMessage((MessageNano)this.a);
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            u u3 = this.a;
            if (u3 != null) {
                codedOutputByteBufferNano.writeMessage(1, (MessageNano)u3);
            }
            if ((u3 = this.b) != null) {
                codedOutputByteBufferNano.writeMessage(2, (MessageNano)u3);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class u
    extends MessageNano {
        public int a;
        public long b;

        public u() {
            this.a();
        }

        public u a() {
            this.a = 100;
            this.b = 60L;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            int n6 = this.a;
            int n9 = n2;
            if (n6 != 100) {
                n9 = n2 + CodedOutputByteBufferNano.computeInt32Size((int)1, (int)n6);
            }
            long l6 = this.b;
            n2 = n9;
            if (l6 != 60L) {
                n2 = n9 + CodedOutputByteBufferNano.computeInt64Size((int)2, (long)l6);
            }
            return n2;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 8) {
                    if (n2 != 16) {
                        if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                        break;
                    }
                    this.b = codedInputByteBufferNano.readInt64();
                    continue;
                }
                this.a = codedInputByteBufferNano.readInt32();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long l6;
            int n2 = this.a;
            if (n2 != 100) {
                codedOutputByteBufferNano.writeInt32(1, n2);
            }
            if ((l6 = this.b) != 60L) {
                codedOutputByteBufferNano.writeInt64(2, l6);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class v
    extends MessageNano {
        public boolean a;
        public boolean b;
        public boolean c;
        public boolean d;
        public int e;
        public int f;
        public int g;
        public int h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public y[] m;
        public boolean n;
        public boolean o;
        public int p;

        public v() {
            this.a();
        }

        public v a() {
            this.a = true;
            this.b = true;
            this.c = true;
            this.d = true;
            this.e = 10000;
            this.f = 1000;
            this.g = 1000;
            this.h = 200000;
            this.i = false;
            this.j = false;
            this.k = false;
            this.l = false;
            this.m = com.yandex.metrica.impl.ob.xf$y.b();
            this.n = false;
            this.o = false;
            this.p = 4000;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            boolean bl2 = this.a;
            int n6 = n2;
            if (!bl2) {
                n6 = n2 + CodedOutputByteBufferNano.computeBoolSize((int)1, (boolean)bl2);
            }
            bl2 = this.b;
            n2 = n6;
            if (!bl2) {
                n2 = n6 + CodedOutputByteBufferNano.computeBoolSize((int)2, (boolean)bl2);
            }
            bl2 = this.c;
            int n9 = n2;
            if (!bl2) {
                n9 = n2 + CodedOutputByteBufferNano.computeBoolSize((int)3, (boolean)bl2);
            }
            bl2 = this.d;
            n6 = n9;
            if (!bl2) {
                n6 = n9 + CodedOutputByteBufferNano.computeBoolSize((int)4, (boolean)bl2);
            }
            n9 = this.e;
            n2 = n6;
            if (n9 != 10000) {
                n2 = n6 + CodedOutputByteBufferNano.computeInt32Size((int)5, (int)n9);
            }
            n9 = this.f;
            n6 = n2;
            if (n9 != 1000) {
                n6 = n2 + CodedOutputByteBufferNano.computeInt32Size((int)6, (int)n9);
            }
            n9 = this.g;
            n2 = n6;
            if (n9 != 1000) {
                n2 = n6 + CodedOutputByteBufferNano.computeInt32Size((int)7, (int)n9);
            }
            n9 = this.h;
            n6 = n2;
            if (n9 != 200000) {
                n6 = n2 + CodedOutputByteBufferNano.computeInt32Size((int)8, (int)n9);
            }
            bl2 = this.i;
            n9 = n6;
            if (bl2) {
                n9 = n6 + CodedOutputByteBufferNano.computeBoolSize((int)9, (boolean)bl2);
            }
            bl2 = this.j;
            n2 = n9;
            if (bl2) {
                n2 = n9 + CodedOutputByteBufferNano.computeBoolSize((int)10, (boolean)bl2);
            }
            bl2 = this.k;
            n6 = n2;
            if (bl2) {
                n6 = n2 + CodedOutputByteBufferNano.computeBoolSize((int)11, (boolean)bl2);
            }
            bl2 = this.l;
            n2 = n6;
            if (bl2) {
                n2 = n6 + CodedOutputByteBufferNano.computeBoolSize((int)12, (boolean)bl2);
            }
            Object object = this.m;
            n6 = n2;
            if (object != null) {
                n6 = n2;
                if (((y[])object).length > 0) {
                    n9 = 0;
                    while (true) {
                        object = this.m;
                        n6 = n2;
                        if (n9 >= ((y[])object).length) break;
                        object = object[n9];
                        n6 = n2;
                        if (object != null) {
                            n6 = n2 + CodedOutputByteBufferNano.computeMessageSize((int)13, (MessageNano)object);
                        }
                        ++n9;
                        n2 = n6;
                    }
                }
            }
            bl2 = this.n;
            n9 = n6;
            if (bl2) {
                n9 = n6 + CodedOutputByteBufferNano.computeBoolSize((int)14, (boolean)bl2);
            }
            bl2 = this.o;
            n2 = n9;
            if (bl2) {
                n2 = n9 + CodedOutputByteBufferNano.computeBoolSize((int)15, (boolean)bl2);
            }
            n9 = this.p;
            n6 = n2;
            if (n9 != 4000) {
                n6 = n2 + CodedOutputByteBufferNano.computeInt32Size((int)16, (int)n9);
            }
            return n6;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            block19: while (true) {
                int n2 = codedInputByteBufferNano.readTag();
                switch (n2) {
                    default: {
                        if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue block19;
                        break block19;
                    }
                    case 128: {
                        this.p = codedInputByteBufferNano.readInt32();
                        continue block19;
                    }
                    case 120: {
                        this.o = codedInputByteBufferNano.readBool();
                        continue block19;
                    }
                    case 112: {
                        this.n = codedInputByteBufferNano.readBool();
                        continue block19;
                    }
                    case 106: {
                        int n6 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)106);
                        Object object = this.m;
                        n2 = object == null ? 0 : ((y[])object).length;
                        int n9 = n6 + n2;
                        y[] yArray = new y[n9];
                        n6 = n2;
                        if (n2 != 0) {
                            System.arraycopy((Object)object, (int)0, (Object)yArray, (int)0, (int)n2);
                            n6 = n2;
                        }
                        while (n6 < n9 - 1) {
                            yArray[n6] = object = new y();
                            codedInputByteBufferNano.readMessage((MessageNano)object);
                            codedInputByteBufferNano.readTag();
                            ++n6;
                        }
                        yArray[n6] = object = new y();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        this.m = yArray;
                        continue block19;
                    }
                    case 96: {
                        this.l = codedInputByteBufferNano.readBool();
                        continue block19;
                    }
                    case 88: {
                        this.k = codedInputByteBufferNano.readBool();
                        continue block19;
                    }
                    case 80: {
                        this.j = codedInputByteBufferNano.readBool();
                        continue block19;
                    }
                    case 72: {
                        this.i = codedInputByteBufferNano.readBool();
                        continue block19;
                    }
                    case 64: {
                        this.h = codedInputByteBufferNano.readInt32();
                        continue block19;
                    }
                    case 56: {
                        this.g = codedInputByteBufferNano.readInt32();
                        continue block19;
                    }
                    case 48: {
                        this.f = codedInputByteBufferNano.readInt32();
                        continue block19;
                    }
                    case 40: {
                        this.e = codedInputByteBufferNano.readInt32();
                        continue block19;
                    }
                    case 32: {
                        this.d = codedInputByteBufferNano.readBool();
                        continue block19;
                    }
                    case 24: {
                        this.c = codedInputByteBufferNano.readBool();
                        continue block19;
                    }
                    case 16: {
                        this.b = codedInputByteBufferNano.readBool();
                        continue block19;
                    }
                    case 8: {
                        this.a = codedInputByteBufferNano.readBool();
                        continue block19;
                    }
                    case 0: 
                }
                break;
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Object object;
            int n2;
            boolean bl2 = this.a;
            if (!bl2) {
                codedOutputByteBufferNano.writeBool(1, bl2);
            }
            if (!(bl2 = this.b)) {
                codedOutputByteBufferNano.writeBool(2, bl2);
            }
            if (!(bl2 = this.c)) {
                codedOutputByteBufferNano.writeBool(3, bl2);
            }
            if (!(bl2 = this.d)) {
                codedOutputByteBufferNano.writeBool(4, bl2);
            }
            if ((n2 = this.e) != 10000) {
                codedOutputByteBufferNano.writeInt32(5, n2);
            }
            if ((n2 = this.f) != 1000) {
                codedOutputByteBufferNano.writeInt32(6, n2);
            }
            if ((n2 = this.g) != 1000) {
                codedOutputByteBufferNano.writeInt32(7, n2);
            }
            if ((n2 = this.h) != 200000) {
                codedOutputByteBufferNano.writeInt32(8, n2);
            }
            if (bl2 = this.i) {
                codedOutputByteBufferNano.writeBool(9, bl2);
            }
            if (bl2 = this.j) {
                codedOutputByteBufferNano.writeBool(10, bl2);
            }
            if (bl2 = this.k) {
                codedOutputByteBufferNano.writeBool(11, bl2);
            }
            if (bl2 = this.l) {
                codedOutputByteBufferNano.writeBool(12, bl2);
            }
            if ((object = this.m) != null && ((y[])object).length > 0) {
                for (n2 = 0; n2 < ((y[])(object = this.m)).length; ++n2) {
                    if ((object = object[n2]) == null) continue;
                    codedOutputByteBufferNano.writeMessage(13, (MessageNano)object);
                }
            }
            if (bl2 = this.n) {
                codedOutputByteBufferNano.writeBool(14, bl2);
            }
            if (bl2 = this.o) {
                codedOutputByteBufferNano.writeBool(15, bl2);
            }
            if ((n2 = this.p) != 4000) {
                codedOutputByteBufferNano.writeInt32(16, n2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class w
    extends MessageNano {
        public int a;
        public int b;
        public int c;
        public long d;
        public boolean e;
        public boolean f;
        public boolean g;
        public y[] h;

        public w() {
            this.a();
        }

        public w a() {
            this.a = 10000;
            this.b = 1000;
            this.c = 100;
            this.d = 5000L;
            this.e = true;
            this.f = false;
            this.g = true;
            this.h = com.yandex.metrica.impl.ob.xf$y.b();
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            int n6 = CodedOutputByteBufferNano.computeInt32Size((int)1, (int)this.a);
            int n9 = CodedOutputByteBufferNano.computeInt32Size((int)2, (int)this.b);
            int n10 = CodedOutputByteBufferNano.computeInt32Size((int)3, (int)this.c);
            int n11 = CodedOutputByteBufferNano.computeInt64Size((int)4, (long)this.d);
            int n12 = CodedOutputByteBufferNano.computeBoolSize((int)5, (boolean)this.e);
            int n13 = CodedOutputByteBufferNano.computeBoolSize((int)6, (boolean)this.f);
            n6 = CodedOutputByteBufferNano.computeBoolSize((int)7, (boolean)this.g) + (n13 + (n12 + (n11 + (n10 + (n9 + (n6 + n2))))));
            Object object = this.h;
            n11 = n6;
            if (object != null) {
                n11 = n6;
                if (((y[])object).length > 0) {
                    n9 = 0;
                    while (true) {
                        object = this.h;
                        n11 = n6;
                        if (n9 >= ((y[])object).length) break;
                        object = object[n9];
                        n11 = n6;
                        if (object != null) {
                            n11 = n6 + CodedOutputByteBufferNano.computeMessageSize((int)8, (MessageNano)object);
                        }
                        ++n9;
                        n6 = n11;
                    }
                }
            }
            return n11;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 8) {
                    if (n2 != 16) {
                        if (n2 != 24) {
                            if (n2 != 32) {
                                if (n2 != 40) {
                                    if (n2 != 48) {
                                        if (n2 != 56) {
                                            if (n2 != 66) {
                                                if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                                                break;
                                            }
                                            int n6 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)66);
                                            Object object = this.h;
                                            n2 = object == null ? 0 : ((y[])object).length;
                                            int n9 = n6 + n2;
                                            y[] yArray = new y[n9];
                                            n6 = n2;
                                            if (n2 != 0) {
                                                System.arraycopy((Object)object, (int)0, (Object)yArray, (int)0, (int)n2);
                                                n6 = n2;
                                            }
                                            while (n6 < n9 - 1) {
                                                yArray[n6] = object = new y();
                                                codedInputByteBufferNano.readMessage((MessageNano)object);
                                                codedInputByteBufferNano.readTag();
                                                ++n6;
                                            }
                                            yArray[n6] = object = new y();
                                            codedInputByteBufferNano.readMessage((MessageNano)object);
                                            this.h = yArray;
                                            continue;
                                        }
                                        this.g = codedInputByteBufferNano.readBool();
                                        continue;
                                    }
                                    this.f = codedInputByteBufferNano.readBool();
                                    continue;
                                }
                                this.e = codedInputByteBufferNano.readBool();
                                continue;
                            }
                            this.d = codedInputByteBufferNano.readInt64();
                            continue;
                        }
                        this.c = codedInputByteBufferNano.readInt32();
                        continue;
                    }
                    this.b = codedInputByteBufferNano.readInt32();
                    continue;
                }
                this.a = codedInputByteBufferNano.readInt32();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt32(1, this.a);
            codedOutputByteBufferNano.writeInt32(2, this.b);
            codedOutputByteBufferNano.writeInt32(3, this.c);
            codedOutputByteBufferNano.writeInt64(4, this.d);
            codedOutputByteBufferNano.writeBool(5, this.e);
            codedOutputByteBufferNano.writeBool(6, this.f);
            codedOutputByteBufferNano.writeBool(7, this.g);
            Object object = this.h;
            if (object != null && ((y[])object).length > 0) {
                for (int i2 = 0; i2 < ((y[])(object = this.h)).length; ++i2) {
                    if ((object = object[i2]) == null) continue;
                    codedOutputByteBufferNano.writeMessage(8, (MessageNano)object);
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class x
    extends MessageNano {
        public boolean a;
        public boolean b;

        public x() {
            this.a();
        }

        public x a() {
            this.a = true;
            this.b = false;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            int n6 = CodedOutputByteBufferNano.computeBoolSize((int)1, (boolean)this.a);
            return CodedOutputByteBufferNano.computeBoolSize((int)2, (boolean)this.b) + (n6 + n2);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int n2;
            while ((n2 = codedInputByteBufferNano.readTag()) != 0) {
                if (n2 != 8) {
                    if (n2 != 16) {
                        if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n2)) continue;
                        break;
                    }
                    this.b = codedInputByteBufferNano.readBool();
                    continue;
                }
                this.a = codedInputByteBufferNano.readBool();
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeBool(1, this.a);
            codedOutputByteBufferNano.writeBool(2, this.b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class y
    extends MessageNano {
        private static volatile y[] c;
        public int a;
        public String b;

        public y() {
            this.a();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public static y[] b() {
            Object object;
            if (c != null) return c;
            Object object2 = object = InternalNano.LAZY_INIT_LOCK;
            synchronized (object2) {
                if (c != null) return c;
                c = new y[0];
                return c;
            }
        }

        public y a() {
            this.a = 0;
            this.b = "";
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            int n6 = CodedOutputByteBufferNano.computeInt32Size((int)1, (int)this.a);
            return CodedOutputByteBufferNano.computeStringSize((int)2, (String)this.b) + (n6 + n2);
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
            codedOutputByteBufferNano.writeInt32(1, this.a);
            codedOutputByteBufferNano.writeString(2, this.b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }
}

