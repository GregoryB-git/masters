package ja;

import ka.z;
import ma.a0;
import ma.b1;
import ma.f1;
import ma.t0;
import ma.w;

/* loaded from: classes.dex */
public final class a extends w<a, C0125a> implements t0 {
    private static final a DEFAULT_INSTANCE;
    public static final int LIMIT_TYPE_FIELD_NUMBER = 3;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile b1<a> PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    private int limitType_;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private String parent_ = "";

    /* renamed from: ja.a$a, reason: collision with other inner class name */
    public static final class C0125a extends w.a<a, C0125a> implements t0 {
        public C0125a() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    public enum b implements a0.a {
        FIRST(0),
        LAST(1),
        UNRECOGNIZED(-1);


        /* renamed from: a, reason: collision with root package name */
        public final int f8726a;

        b(int i10) {
            this.f8726a = i10;
        }

        @Override // ma.a0.a
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.f8726a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        w.D(a.class, aVar);
    }

    public static void G(a aVar, String str) {
        aVar.getClass();
        str.getClass();
        aVar.parent_ = str;
    }

    public static void H(a aVar, z zVar) {
        aVar.getClass();
        zVar.getClass();
        aVar.queryType_ = zVar;
        aVar.queryTypeCase_ = 2;
    }

    public static void I(a aVar, b bVar) {
        aVar.getClass();
        aVar.limitType_ = bVar.a();
    }

    public static C0125a M() {
        return DEFAULT_INSTANCE.s();
    }

    public static a N(byte[] bArr) {
        return (a) w.B(DEFAULT_INSTANCE, bArr);
    }

    public final b J() {
        int i10 = this.limitType_;
        b bVar = i10 != 0 ? i10 != 1 ? null : b.LAST : b.FIRST;
        return bVar == null ? b.UNRECOGNIZED : bVar;
    }

    public final String K() {
        return this.parent_;
    }

    public final z L() {
        return this.queryTypeCase_ == 2 ? (z) this.queryType_ : z.M();
    }

    @Override // ma.w
    public final Object t(w.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new f1(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003\f", new Object[]{"queryType_", "queryTypeCase_", "parent_", z.class, "limitType_"});
            case NEW_MUTABLE_INSTANCE:
                return new a();
            case NEW_BUILDER:
                return new C0125a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<a> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (a.class) {
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
