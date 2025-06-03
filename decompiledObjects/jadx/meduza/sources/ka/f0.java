package ka;

import ma.a0;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.l0;
import ma.m0;
import ma.t0;
import ma.v1;
import ma.w;

/* loaded from: classes.dex */
public final class f0 extends ma.w<f0, a> implements t0 {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final f0 DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 5;
    private static volatile b1<f0> PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 2;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 4;
    public static final int WRITES_FIELD_NUMBER = 3;
    private m0<String, String> labels_ = m0.f11055b;
    private String database_ = "";
    private String streamId_ = "";
    private a0.d<e0> writes_ = e1.f10945d;
    private ma.h streamToken_ = ma.h.f10961b;

    public static final class a extends w.a<f0, a> implements t0 {
        public a() {
            super(f0.DEFAULT_INSTANCE);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final l0<String, String> f9185a;

        static {
            v1.a aVar = v1.f11114c;
            f9185a = new l0<>(aVar, aVar, "");
        }
    }

    static {
        f0 f0Var = new f0();
        DEFAULT_INSTANCE = f0Var;
        ma.w.D(f0.class, f0Var);
    }

    public static void G(f0 f0Var, String str) {
        f0Var.getClass();
        str.getClass();
        f0Var.database_ = str;
    }

    public static void H(f0 f0Var, ma.h hVar) {
        f0Var.getClass();
        hVar.getClass();
        f0Var.streamToken_ = hVar;
    }

    public static void I(f0 f0Var, e0 e0Var) {
        f0Var.getClass();
        a0.d<e0> dVar = f0Var.writes_;
        if (!dVar.g()) {
            f0Var.writes_ = ma.w.A(dVar);
        }
        f0Var.writes_.add(e0Var);
    }

    public static f0 J() {
        return DEFAULT_INSTANCE;
    }

    public static a K() {
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
                return new f1(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\n\u00052", new Object[]{"database_", "streamId_", "writes_", e0.class, "streamToken_", "labels_", b.f9185a});
            case NEW_MUTABLE_INSTANCE:
                return new f0();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<f0> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (f0.class) {
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
