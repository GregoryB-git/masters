package ka;

import ma.a0;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.t0;
import ma.w;

/* loaded from: classes.dex */
public final class n extends ma.w<n, a> implements t0 {
    private static final n DEFAULT_INSTANCE;
    public static final int FIELD_PATHS_FIELD_NUMBER = 1;
    private static volatile b1<n> PARSER;
    private a0.d<String> fieldPaths_ = e1.f10945d;

    public static final class a extends w.a<n, a> implements t0 {
        public a() {
            super(n.DEFAULT_INSTANCE);
        }
    }

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        ma.w.D(n.class, nVar);
    }

    public static void G(n nVar, String str) {
        nVar.getClass();
        str.getClass();
        a0.d<String> dVar = nVar.fieldPaths_;
        if (!dVar.g()) {
            nVar.fieldPaths_ = ma.w.A(dVar);
        }
        nVar.fieldPaths_.add(str);
    }

    public static n H() {
        return DEFAULT_INSTANCE;
    }

    public static a K() {
        return DEFAULT_INSTANCE.s();
    }

    public final String I(int i10) {
        return this.fieldPaths_.get(i10);
    }

    public final int J() {
        return this.fieldPaths_.size();
    }

    @Override // ma.w
    public final Object t(w.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new f1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"fieldPaths_"});
            case NEW_MUTABLE_INSTANCE:
                return new n();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<n> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (n.class) {
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
