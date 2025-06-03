package ka;

import java.util.ArrayList;
import ka.z;
import ma.a0;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.t0;
import ma.w;

/* loaded from: classes.dex */
public final class y extends ma.w<y, b> implements t0 {
    public static final int AGGREGATIONS_FIELD_NUMBER = 3;
    private static final y DEFAULT_INSTANCE;
    private static volatile b1<y> PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 1;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private a0.d<a> aggregations_ = e1.f10945d;

    public static final class a extends ma.w<a, b> implements t0 {
        public static final int ALIAS_FIELD_NUMBER = 7;
        public static final int AVG_FIELD_NUMBER = 3;
        public static final int COUNT_FIELD_NUMBER = 1;
        private static final a DEFAULT_INSTANCE;
        private static volatile b1<a> PARSER = null;
        public static final int SUM_FIELD_NUMBER = 2;
        private Object operator_;
        private int operatorCase_ = 0;
        private String alias_ = "";

        /* renamed from: ka.y$a$a, reason: collision with other inner class name */
        public static final class C0135a extends ma.w<C0135a, C0136a> implements t0 {
            private static final C0135a DEFAULT_INSTANCE;
            public static final int FIELD_FIELD_NUMBER = 1;
            private static volatile b1<C0135a> PARSER;
            private int bitField0_;
            private z.f field_;

            /* renamed from: ka.y$a$a$a, reason: collision with other inner class name */
            public static final class C0136a extends w.a<C0135a, C0136a> implements t0 {
                public C0136a() {
                    super(C0135a.DEFAULT_INSTANCE);
                }
            }

            static {
                C0135a c0135a = new C0135a();
                DEFAULT_INSTANCE = c0135a;
                ma.w.D(C0135a.class, c0135a);
            }

            public static void G(C0135a c0135a, z.f fVar) {
                c0135a.getClass();
                c0135a.field_ = fVar;
                c0135a.bitField0_ |= 1;
            }

            public static C0136a H() {
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
                        return new f1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "field_"});
                    case NEW_MUTABLE_INSTANCE:
                        return new C0135a();
                    case NEW_BUILDER:
                        return new C0136a();
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        b1<C0135a> b1Var = PARSER;
                        if (b1Var == null) {
                            synchronized (C0135a.class) {
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

        public static final class b extends w.a<a, b> implements t0 {
            public b() {
                super(a.DEFAULT_INSTANCE);
            }
        }

        public static final class c extends ma.w<c, C0137a> implements t0 {
            private static final c DEFAULT_INSTANCE;
            private static volatile b1<c> PARSER = null;
            public static final int UP_TO_FIELD_NUMBER = 1;
            private int bitField0_;
            private ma.y upTo_;

            /* renamed from: ka.y$a$c$a, reason: collision with other inner class name */
            public static final class C0137a extends w.a<c, C0137a> implements t0 {
                public C0137a() {
                    super(c.DEFAULT_INSTANCE);
                }
            }

            static {
                c cVar = new c();
                DEFAULT_INSTANCE = cVar;
                ma.w.D(c.class, cVar);
            }

            public static c G() {
                return DEFAULT_INSTANCE;
            }

            @Override // ma.w
            public final Object t(w.f fVar) {
                switch (fVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return new f1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "upTo_"});
                    case NEW_MUTABLE_INSTANCE:
                        return new c();
                    case NEW_BUILDER:
                        return new C0137a();
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

        public static final class d extends ma.w<d, C0138a> implements t0 {
            private static final d DEFAULT_INSTANCE;
            public static final int FIELD_FIELD_NUMBER = 1;
            private static volatile b1<d> PARSER;
            private int bitField0_;
            private z.f field_;

            /* renamed from: ka.y$a$d$a, reason: collision with other inner class name */
            public static final class C0138a extends w.a<d, C0138a> implements t0 {
                public C0138a() {
                    super(d.DEFAULT_INSTANCE);
                }
            }

            static {
                d dVar = new d();
                DEFAULT_INSTANCE = dVar;
                ma.w.D(d.class, dVar);
            }

            public static void G(d dVar, z.f fVar) {
                dVar.getClass();
                dVar.field_ = fVar;
                dVar.bitField0_ |= 1;
            }

            public static C0138a H() {
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
                        return new f1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "field_"});
                    case NEW_MUTABLE_INSTANCE:
                        return new d();
                    case NEW_BUILDER:
                        return new C0138a();
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        b1<d> b1Var = PARSER;
                        if (b1Var == null) {
                            synchronized (d.class) {
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
            a aVar = new a();
            DEFAULT_INSTANCE = aVar;
            ma.w.D(a.class, aVar);
        }

        public static void G(a aVar, c cVar) {
            aVar.getClass();
            cVar.getClass();
            aVar.operator_ = cVar;
            aVar.operatorCase_ = 1;
        }

        public static void H(a aVar, d dVar) {
            aVar.getClass();
            aVar.operator_ = dVar;
            aVar.operatorCase_ = 2;
        }

        public static void I(a aVar, C0135a c0135a) {
            aVar.getClass();
            aVar.operator_ = c0135a;
            aVar.operatorCase_ = 3;
        }

        public static void J(a aVar, String str) {
            aVar.getClass();
            str.getClass();
            aVar.alias_ = str;
        }

        public static b K() {
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
                    return new f1(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0007\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0007Ȉ", new Object[]{"operator_", "operatorCase_", c.class, d.class, C0135a.class, "alias_"});
                case NEW_MUTABLE_INSTANCE:
                    return new a();
                case NEW_BUILDER:
                    return new b();
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

    public static final class b extends w.a<y, b> implements t0 {
        public b() {
            super(y.DEFAULT_INSTANCE);
        }
    }

    static {
        y yVar = new y();
        DEFAULT_INSTANCE = yVar;
        ma.w.D(y.class, yVar);
    }

    public static void G(y yVar, z zVar) {
        yVar.getClass();
        zVar.getClass();
        yVar.queryType_ = zVar;
        yVar.queryTypeCase_ = 1;
    }

    public static void H(y yVar, ArrayList arrayList) {
        a0.d<a> dVar = yVar.aggregations_;
        if (!dVar.g()) {
            yVar.aggregations_ = ma.w.A(dVar);
        }
        ma.a.k(arrayList, yVar.aggregations_);
    }

    public static b I() {
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
                return new f1(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001<\u0000\u0003\u001b", new Object[]{"queryType_", "queryTypeCase_", z.class, "aggregations_", a.class});
            case NEW_MUTABLE_INSTANCE:
                return new y();
            case NEW_BUILDER:
                return new b();
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
