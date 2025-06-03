package ka;

import ma.a0;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.t0;
import ma.w;

/* loaded from: classes.dex */
public final class h extends ma.w<h, a> implements t0 {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final h DEFAULT_INSTANCE;
    private static volatile b1<h> PARSER = null;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    public static final int WRITES_FIELD_NUMBER = 2;
    private String database_ = "";
    private a0.d<e0> writes_ = e1.f10945d;
    private ma.h transaction_ = ma.h.f10961b;

    public static final class a extends w.a<h, a> implements t0 {
        public a() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        ma.w.D(h.class, hVar);
    }

    public static void G(h hVar, String str) {
        hVar.getClass();
        str.getClass();
        hVar.database_ = str;
    }

    public static void H(h hVar, e0 e0Var) {
        hVar.getClass();
        a0.d<e0> dVar = hVar.writes_;
        if (!dVar.g()) {
            hVar.writes_ = ma.w.A(dVar);
        }
        hVar.writes_.add(e0Var);
    }

    public static h I() {
        return DEFAULT_INSTANCE;
    }

    public static a J() {
        return DEFAULT_INSTANCE.s();
    }

    @Override // ma.w
    public final Object t(w.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new f1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\n", new Object[]{"database_", "writes_", e0.class, "transaction_"});
            case NEW_MUTABLE_INSTANCE:
                return new h();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<h> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (h.class) {
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
