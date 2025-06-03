package ma;

import ma.w;

/* loaded from: classes.dex */
public final class y extends w<y, a> implements t0 {
    private static final y DEFAULT_INSTANCE;
    private static volatile b1<y> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    public static final class a extends w.a<y, a> implements t0 {
        public a() {
            super(y.DEFAULT_INSTANCE);
        }
    }

    static {
        y yVar = new y();
        DEFAULT_INSTANCE = yVar;
        w.D(y.class, yVar);
    }

    @Override // ma.w
    public final Object t(w.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new f1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"value_"});
            case NEW_MUTABLE_INSTANCE:
                return new y();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<y> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (y.class) {
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
