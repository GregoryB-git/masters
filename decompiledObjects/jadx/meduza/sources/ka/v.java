package ka;

import ma.b1;
import ma.f1;
import ma.n1;
import ma.t0;
import ma.w;

/* loaded from: classes.dex */
public final class v extends ma.w<v, a> implements t0 {
    private static final v DEFAULT_INSTANCE;
    public static final int EXISTS_FIELD_NUMBER = 1;
    private static volatile b1<v> PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 2;
    private int conditionTypeCase_ = 0;
    private Object conditionType_;

    public static final class a extends w.a<v, a> implements t0 {
        public a() {
            super(v.DEFAULT_INSTANCE);
        }
    }

    static {
        v vVar = new v();
        DEFAULT_INSTANCE = vVar;
        ma.w.D(v.class, vVar);
    }

    public static void G(v vVar, boolean z10) {
        vVar.conditionTypeCase_ = 1;
        vVar.conditionType_ = Boolean.valueOf(z10);
    }

    public static void H(v vVar, n1 n1Var) {
        vVar.getClass();
        vVar.conditionType_ = n1Var;
        vVar.conditionTypeCase_ = 2;
    }

    public static v J() {
        return DEFAULT_INSTANCE;
    }

    public static a M() {
        return DEFAULT_INSTANCE.s();
    }

    public final int I() {
        int i10 = this.conditionTypeCase_;
        if (i10 == 0) {
            return 3;
        }
        if (i10 != 1) {
            return i10 != 2 ? 0 : 2;
        }
        return 1;
    }

    public final boolean K() {
        if (this.conditionTypeCase_ == 1) {
            return ((Boolean) this.conditionType_).booleanValue();
        }
        return false;
    }

    public final n1 L() {
        return this.conditionTypeCase_ == 2 ? (n1) this.conditionType_ : n1.I();
    }

    @Override // ma.w
    public final Object t(w.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new f1(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u0002<\u0000", new Object[]{"conditionType_", "conditionTypeCase_", n1.class});
            case NEW_MUTABLE_INSTANCE:
                return new v();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<v> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (v.class) {
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
