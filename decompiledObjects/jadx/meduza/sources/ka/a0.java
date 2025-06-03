package ka;

import ma.a0;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.n1;
import ma.t0;
import ma.w;

/* loaded from: classes.dex */
public final class a0 extends ma.w<a0, a> implements t0 {
    private static final a0 DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 3;
    public static final int EXPECTED_COUNT_FIELD_NUMBER = 12;
    public static final int ONCE_FIELD_NUMBER = 6;
    private static volatile b1<a0> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int READ_TIME_FIELD_NUMBER = 11;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private ma.x expectedCount_;
    private boolean once_;
    private Object resumeType_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private int resumeTypeCase_ = 0;

    public static final class a extends w.a<a0, a> implements t0 {
        public a() {
            super(a0.DEFAULT_INSTANCE);
        }
    }

    public static final class b extends ma.w<b, a> implements t0 {
        private static final b DEFAULT_INSTANCE;
        public static final int DOCUMENTS_FIELD_NUMBER = 2;
        private static volatile b1<b> PARSER;
        private a0.d<String> documents_ = e1.f10945d;

        public static final class a extends w.a<b, a> implements t0 {
            public a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            ma.w.D(b.class, bVar);
        }

        public static void G(b bVar, String str) {
            bVar.getClass();
            str.getClass();
            a0.d<String> dVar = bVar.documents_;
            if (!dVar.g()) {
                bVar.documents_ = ma.w.A(dVar);
            }
            bVar.documents_.add(str);
        }

        public static b H() {
            return DEFAULT_INSTANCE;
        }

        public static a K() {
            return DEFAULT_INSTANCE.s();
        }

        public final String I() {
            return this.documents_.get(0);
        }

        public final int J() {
            return this.documents_.size();
        }

        @Override // ma.w
        public final Object t(w.f fVar) {
            switch (fVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new f1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002Ț", new Object[]{"documents_"});
                case NEW_MUTABLE_INSTANCE:
                    return new b();
                case NEW_BUILDER:
                    return new a();
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    b1<b> b1Var = PARSER;
                    if (b1Var == null) {
                        synchronized (b.class) {
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

    public static final class c extends ma.w<c, a> implements t0 {
        private static final c DEFAULT_INSTANCE;
        public static final int PARENT_FIELD_NUMBER = 1;
        private static volatile b1<c> PARSER = null;
        public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
        private Object queryType_;
        private int queryTypeCase_ = 0;
        private String parent_ = "";

        public static final class a extends w.a<c, a> implements t0 {
            public a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            ma.w.D(c.class, cVar);
        }

        public static void F(c cVar, z zVar) {
            cVar.getClass();
            cVar.queryType_ = zVar;
            cVar.queryTypeCase_ = 2;
        }

        public static void H(c cVar, String str) {
            cVar.getClass();
            str.getClass();
            cVar.parent_ = str;
        }

        public static c I() {
            return DEFAULT_INSTANCE;
        }

        public static a L() {
            return DEFAULT_INSTANCE.s();
        }

        public final String J() {
            return this.parent_;
        }

        public final z K() {
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
                    return new f1(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"queryType_", "queryTypeCase_", "parent_", z.class});
                case NEW_MUTABLE_INSTANCE:
                    return new c();
                case NEW_BUILDER:
                    return new a();
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    b1<c> b1Var = PARSER;
                    if (b1Var == null) {
                        synchronized (c.class) {
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

    static {
        a0 a0Var = new a0();
        DEFAULT_INSTANCE = a0Var;
        ma.w.D(a0.class, a0Var);
    }

    public static void G(a0 a0Var, c cVar) {
        a0Var.getClass();
        a0Var.targetType_ = cVar;
        a0Var.targetTypeCase_ = 2;
    }

    public static void H(a0 a0Var, b bVar) {
        a0Var.getClass();
        a0Var.targetType_ = bVar;
        a0Var.targetTypeCase_ = 3;
    }

    public static void I(a0 a0Var, ma.h hVar) {
        a0Var.getClass();
        hVar.getClass();
        a0Var.resumeTypeCase_ = 4;
        a0Var.resumeType_ = hVar;
    }

    public static void J(a0 a0Var, n1 n1Var) {
        a0Var.getClass();
        a0Var.resumeType_ = n1Var;
        a0Var.resumeTypeCase_ = 11;
    }

    public static void K(a0 a0Var, int i10) {
        a0Var.targetId_ = i10;
    }

    public static void L(a0 a0Var, ma.x xVar) {
        a0Var.getClass();
        a0Var.expectedCount_ = xVar;
        a0Var.bitField0_ |= 1;
    }

    public static a M() {
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
                return new f1(DEFAULT_INSTANCE, "\u0000\u0007\u0002\u0001\u0002\f\u0007\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001\fဉ\u0000", new Object[]{"targetType_", "targetTypeCase_", "resumeType_", "resumeTypeCase_", "bitField0_", c.class, b.class, "targetId_", "once_", n1.class, "expectedCount_"});
            case NEW_MUTABLE_INSTANCE:
                return new a0();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<a0> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (a0.class) {
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
