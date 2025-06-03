package ma;

import ma.w;

/* loaded from: classes.dex */
public final class x extends w<x, a> implements t0 {
    private static final x DEFAULT_INSTANCE;
    private static volatile b1<x> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    public static final class a extends w.a<x, a> implements t0 {
        public a() {
            super(x.DEFAULT_INSTANCE);
        }
    }

    static {
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        w.D(x.class, xVar);
    }

    public static void G(x xVar, int i10) {
        xVar.value_ = i10;
    }

    public static x H() {
        return DEFAULT_INSTANCE;
    }

    public static a J() {
        return DEFAULT_INSTANCE.s();
    }

    public final int I() {
        return this.value_;
    }

    @Override // ma.w
    public final Object t(w.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new f1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case NEW_MUTABLE_INSTANCE:
                return new x();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<x> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (x.class) {
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
