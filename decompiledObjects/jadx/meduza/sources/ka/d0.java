package ka;

import ka.b;
import ka.u;
import ma.a1;
import ma.b1;
import ma.f1;
import ma.n1;
import ma.t0;
import ma.w;
import oa.a;

/* loaded from: classes.dex */
public final class d0 extends ma.w<d0, a> implements t0 {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 9;
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
    public static final int BYTES_VALUE_FIELD_NUMBER = 18;
    private static final d0 DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
    public static final int GEO_POINT_VALUE_FIELD_NUMBER = 8;
    public static final int INTEGER_VALUE_FIELD_NUMBER = 2;
    public static final int MAP_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 11;
    private static volatile b1<d0> PARSER = null;
    public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
    public static final int STRING_VALUE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
    private int valueTypeCase_ = 0;
    private Object valueType_;

    public static final class a extends w.a<d0, a> implements t0 {
        public a() {
            super(d0.DEFAULT_INSTANCE);
        }

        public final void p(b.a aVar) {
            m();
            d0.L(aVar.k(), (d0) this.f11120b);
        }

        public final void q(double d10) {
            m();
            d0.Q((d0) this.f11120b, d10);
        }

        public final void r(a.C0190a c0190a) {
            m();
            d0.K((d0) this.f11120b, c0190a.k());
        }

        public final void s(long j10) {
            m();
            d0.P((d0) this.f11120b, j10);
        }

        public final void t(u.a aVar) {
            m();
            d0.M((d0) this.f11120b, aVar.k());
        }

        public final void u(u uVar) {
            m();
            d0.M((d0) this.f11120b, uVar);
        }

        public final void v(String str) {
            m();
            d0.H((d0) this.f11120b, str);
        }

        public final void w(n1.a aVar) {
            m();
            d0.G((d0) this.f11120b, aVar.k());
        }
    }

    static {
        d0 d0Var = new d0();
        DEFAULT_INSTANCE = d0Var;
        ma.w.D(d0.class, d0Var);
    }

    public static void G(d0 d0Var, n1 n1Var) {
        d0Var.getClass();
        d0Var.valueType_ = n1Var;
        d0Var.valueTypeCase_ = 10;
    }

    public static void H(d0 d0Var, String str) {
        d0Var.getClass();
        str.getClass();
        d0Var.valueTypeCase_ = 17;
        d0Var.valueType_ = str;
    }

    public static void I(d0 d0Var, ma.h hVar) {
        d0Var.getClass();
        hVar.getClass();
        d0Var.valueTypeCase_ = 18;
        d0Var.valueType_ = hVar;
    }

    public static void J(d0 d0Var, String str) {
        d0Var.getClass();
        str.getClass();
        d0Var.valueTypeCase_ = 5;
        d0Var.valueType_ = str;
    }

    public static void K(d0 d0Var, oa.a aVar) {
        d0Var.getClass();
        d0Var.valueType_ = aVar;
        d0Var.valueTypeCase_ = 8;
    }

    public static void L(b bVar, d0 d0Var) {
        d0Var.getClass();
        bVar.getClass();
        d0Var.valueType_ = bVar;
        d0Var.valueTypeCase_ = 9;
    }

    public static void M(d0 d0Var, u uVar) {
        d0Var.getClass();
        uVar.getClass();
        d0Var.valueType_ = uVar;
        d0Var.valueTypeCase_ = 6;
    }

    public static void N(d0 d0Var) {
        a1 a1Var = a1.NULL_VALUE;
        d0Var.getClass();
        d0Var.valueType_ = Integer.valueOf(a1Var.a());
        d0Var.valueTypeCase_ = 11;
    }

    public static void O(d0 d0Var, boolean z10) {
        d0Var.valueTypeCase_ = 1;
        d0Var.valueType_ = Boolean.valueOf(z10);
    }

    public static void P(d0 d0Var, long j10) {
        d0Var.valueTypeCase_ = 2;
        d0Var.valueType_ = Long.valueOf(j10);
    }

    public static void Q(d0 d0Var, double d10) {
        d0Var.valueTypeCase_ = 3;
        d0Var.valueType_ = Double.valueOf(d10);
    }

    public static d0 U() {
        return DEFAULT_INSTANCE;
    }

    public static a d0() {
        return DEFAULT_INSTANCE.s();
    }

    public final b R() {
        return this.valueTypeCase_ == 9 ? (b) this.valueType_ : b.J();
    }

    public final boolean S() {
        if (this.valueTypeCase_ == 1) {
            return ((Boolean) this.valueType_).booleanValue();
        }
        return false;
    }

    public final ma.h T() {
        return this.valueTypeCase_ == 18 ? (ma.h) this.valueType_ : ma.h.f10961b;
    }

    public final double V() {
        if (this.valueTypeCase_ == 3) {
            return ((Double) this.valueType_).doubleValue();
        }
        return 0.0d;
    }

    public final oa.a W() {
        return this.valueTypeCase_ == 8 ? (oa.a) this.valueType_ : oa.a.I();
    }

    public final long X() {
        if (this.valueTypeCase_ == 2) {
            return ((Long) this.valueType_).longValue();
        }
        return 0L;
    }

    public final u Y() {
        return this.valueTypeCase_ == 6 ? (u) this.valueType_ : u.H();
    }

    public final String Z() {
        return this.valueTypeCase_ == 5 ? (String) this.valueType_ : "";
    }

    public final String a0() {
        return this.valueTypeCase_ == 17 ? (String) this.valueType_ : "";
    }

    public final n1 b0() {
        return this.valueTypeCase_ == 10 ? (n1) this.valueType_ : n1.I();
    }

    public final int c0() {
        int i10 = this.valueTypeCase_;
        if (i10 == 0) {
            return 12;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 3;
        }
        if (i10 == 3) {
            return 4;
        }
        if (i10 == 5) {
            return 8;
        }
        if (i10 == 6) {
            return 11;
        }
        if (i10 == 17) {
            return 6;
        }
        if (i10 == 18) {
            return 7;
        }
        switch (i10) {
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 5;
            case 11:
                return 1;
            default:
                return 0;
        }
    }

    @Override // ma.w
    public final Object t(w.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new f1(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u0012\u000b\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005Ȼ\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011Ȼ\u0000\u0012=\u0000", new Object[]{"valueType_", "valueTypeCase_", u.class, oa.a.class, b.class, n1.class});
            case NEW_MUTABLE_INSTANCE:
                return new d0();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<d0> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (d0.class) {
                        b1Var = PARSER;
                        if (b1Var == null) {
                            b1Var = new w.b<>(DEFAULT_INSTANCE);
                            PARSER = b1Var;
                        }
                    }
                }
                return b1Var;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
