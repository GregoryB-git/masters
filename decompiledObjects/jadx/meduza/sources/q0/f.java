package q0;

import q0.e;
import s0.a1;
import s0.p0;
import s0.v;
import s0.w0;

/* loaded from: classes.dex */
public final class f extends v<f, a> implements p0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final f DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile w0<f> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    public static final class a extends v.a<f, a> implements p0 {
        public a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        v.o(f.class, fVar);
    }

    public static a G() {
        return (a) ((v.a) DEFAULT_INSTANCE.k(v.f.NEW_BUILDER));
    }

    public static void p(f fVar, long j10) {
        fVar.valueCase_ = 4;
        fVar.value_ = Long.valueOf(j10);
    }

    public static void q(f fVar, String str) {
        fVar.getClass();
        str.getClass();
        fVar.valueCase_ = 5;
        fVar.value_ = str;
    }

    public static void r(f fVar, e.a aVar) {
        fVar.getClass();
        fVar.value_ = aVar.h();
        fVar.valueCase_ = 6;
    }

    public static void s(f fVar, double d10) {
        fVar.valueCase_ = 7;
        fVar.value_ = Double.valueOf(d10);
    }

    public static void u(f fVar, boolean z10) {
        fVar.valueCase_ = 1;
        fVar.value_ = Boolean.valueOf(z10);
    }

    public static void v(f fVar, float f) {
        fVar.valueCase_ = 2;
        fVar.value_ = Float.valueOf(f);
    }

    public static void w(f fVar, int i10) {
        fVar.valueCase_ = 3;
        fVar.value_ = Integer.valueOf(i10);
    }

    public static f y() {
        return DEFAULT_INSTANCE;
    }

    public final float A() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int B() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long C() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String D() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final e E() {
        return this.valueCase_ == 6 ? (e) this.value_ : e.r();
    }

    public final int F() {
        switch (this.valueCase_) {
            case 0:
                return 8;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return 0;
        }
    }

    @Override // s0.v
    public final Object k(v.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new a1(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", e.class});
            case NEW_MUTABLE_INSTANCE:
                return new f();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                w0<f> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (f.class) {
                        try {
                            w0Var = PARSER;
                            if (w0Var == null) {
                                w0Var = new v.b<>(DEFAULT_INSTANCE);
                                PARSER = w0Var;
                            }
                        } finally {
                        }
                    }
                }
                return w0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean x() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final double z() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }
}
