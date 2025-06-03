package ka;

import ma.b1;
import ma.f1;
import ma.l0;
import ma.m0;
import ma.t0;
import ma.v1;
import ma.w;

/* loaded from: classes.dex */
public final class s extends ma.w<s, a> implements t0 {
    public static final int ADD_TARGET_FIELD_NUMBER = 2;
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final s DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 4;
    private static volatile b1<s> PARSER = null;
    public static final int REMOVE_TARGET_FIELD_NUMBER = 3;
    private Object targetChange_;
    private int targetChangeCase_ = 0;
    private m0<String, String> labels_ = m0.f11055b;
    private String database_ = "";

    public static final class a extends w.a<s, a> implements t0 {
        public a() {
            super(s.DEFAULT_INSTANCE);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final l0<String, String> f9197a;

        static {
            v1.a aVar = v1.f11114c;
            f9197a = new l0<>(aVar, aVar, "");
        }
    }

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        ma.w.D(s.class, sVar);
    }

    public static m0 G(s sVar) {
        m0<String, String> m0Var = sVar.labels_;
        if (!m0Var.f11056a) {
            sVar.labels_ = m0Var.d();
        }
        return sVar.labels_;
    }

    public static void H(s sVar, String str) {
        sVar.getClass();
        str.getClass();
        sVar.database_ = str;
    }

    public static void I(s sVar, a0 a0Var) {
        sVar.getClass();
        sVar.targetChange_ = a0Var;
        sVar.targetChangeCase_ = 2;
    }

    public static void J(s sVar, int i10) {
        sVar.targetChangeCase_ = 3;
        sVar.targetChange_ = Integer.valueOf(i10);
    }

    public static s K() {
        return DEFAULT_INSTANCE;
    }

    public static a L() {
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
                return new f1(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002<\u0000\u00037\u0000\u00042", new Object[]{"targetChange_", "targetChangeCase_", "database_", a0.class, "labels_", b.f9197a});
            case NEW_MUTABLE_INSTANCE:
                return new s();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<s> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (s.class) {
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
