package ma;

import ma.w;

/* loaded from: classes.dex */
public final class n1 extends w<n1, a> implements t0 {
    private static final n1 DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile b1<n1> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    public static final class a extends w.a<n1, a> implements t0 {
        public a() {
            super(n1.DEFAULT_INSTANCE);
        }

        public final void p(long j10) {
            m();
            n1.G((n1) this.f11120b, j10);
        }
    }

    static {
        n1 n1Var = new n1();
        DEFAULT_INSTANCE = n1Var;
        w.D(n1.class, n1Var);
    }

    public static void G(n1 n1Var, long j10) {
        n1Var.seconds_ = j10;
    }

    public static void H(n1 n1Var, int i10) {
        n1Var.nanos_ = i10;
    }

    public static n1 I() {
        return DEFAULT_INSTANCE;
    }

    public static a L() {
        return DEFAULT_INSTANCE.s();
    }

    public final int J() {
        return this.nanos_;
    }

    public final long K() {
        return this.seconds_;
    }

    @Override // ma.w
    public final Object t(w.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new f1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case NEW_MUTABLE_INSTANCE:
                return new n1();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<n1> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (n1.class) {
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
