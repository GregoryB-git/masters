package ka;

import ma.a0;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.t0;
import ma.w;

/* loaded from: classes.dex */
public final class p extends ma.w<p, a> implements t0 {
    private static final p DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int FIELD_TRANSFORMS_FIELD_NUMBER = 2;
    private static volatile b1<p> PARSER;
    private String document_ = "";
    private a0.d<b> fieldTransforms_ = e1.f10945d;

    public static final class a extends w.a<p, a> implements t0 {
        public a() {
            super(p.DEFAULT_INSTANCE);
        }
    }

    public static final class b extends ma.w<b, a> implements t0 {
        public static final int APPEND_MISSING_ELEMENTS_FIELD_NUMBER = 6;
        private static final b DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int INCREMENT_FIELD_NUMBER = 3;
        public static final int MAXIMUM_FIELD_NUMBER = 4;
        public static final int MINIMUM_FIELD_NUMBER = 5;
        private static volatile b1<b> PARSER = null;
        public static final int REMOVE_ALL_FROM_ARRAY_FIELD_NUMBER = 7;
        public static final int SET_TO_SERVER_VALUE_FIELD_NUMBER = 2;
        private Object transformType_;
        private int transformTypeCase_ = 0;
        private String fieldPath_ = "";

        public static final class a extends w.a<b, a> implements t0 {
            public a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: ka.p$b$b, reason: collision with other inner class name */
        public enum EnumC0134b implements a0.a {
            SERVER_VALUE_UNSPECIFIED(0),
            REQUEST_TIME(1),
            UNRECOGNIZED(-1);


            /* renamed from: a, reason: collision with root package name */
            public final int f9191a;

            EnumC0134b(int i10) {
                this.f9191a = i10;
            }

            @Override // ma.a0.a
            public final int a() {
                if (this != UNRECOGNIZED) {
                    return this.f9191a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            ma.w.D(b.class, bVar);
        }

        public static void G(b bVar, ka.b bVar2) {
            bVar.getClass();
            bVar.transformType_ = bVar2;
            bVar.transformTypeCase_ = 6;
        }

        public static void H(b bVar, String str) {
            bVar.getClass();
            str.getClass();
            bVar.fieldPath_ = str;
        }

        public static void I(b bVar, ka.b bVar2) {
            bVar.getClass();
            bVar.transformType_ = bVar2;
            bVar.transformTypeCase_ = 7;
        }

        public static void J(b bVar) {
            EnumC0134b enumC0134b = EnumC0134b.REQUEST_TIME;
            bVar.getClass();
            bVar.transformType_ = Integer.valueOf(enumC0134b.a());
            bVar.transformTypeCase_ = 2;
        }

        public static void K(b bVar, d0 d0Var) {
            bVar.getClass();
            d0Var.getClass();
            bVar.transformType_ = d0Var;
            bVar.transformTypeCase_ = 3;
        }

        public static a R() {
            return DEFAULT_INSTANCE.s();
        }

        public final ka.b L() {
            return this.transformTypeCase_ == 6 ? (ka.b) this.transformType_ : ka.b.J();
        }

        public final String M() {
            return this.fieldPath_;
        }

        public final d0 N() {
            return this.transformTypeCase_ == 3 ? (d0) this.transformType_ : d0.U();
        }

        public final ka.b O() {
            return this.transformTypeCase_ == 7 ? (ka.b) this.transformType_ : ka.b.J();
        }

        public final EnumC0134b P() {
            EnumC0134b enumC0134b = EnumC0134b.SERVER_VALUE_UNSPECIFIED;
            if (this.transformTypeCase_ != 2) {
                return enumC0134b;
            }
            int intValue = ((Integer) this.transformType_).intValue();
            if (intValue != 0) {
                enumC0134b = intValue != 1 ? null : EnumC0134b.REQUEST_TIME;
            }
            return enumC0134b == null ? EnumC0134b.UNRECOGNIZED : enumC0134b;
        }

        public final int Q() {
            int i10 = this.transformTypeCase_;
            if (i10 == 0) {
                return 7;
            }
            switch (i10) {
                case 2:
                    return 1;
                case 3:
                    return 2;
                case 4:
                    return 3;
                case 5:
                    return 4;
                case 6:
                    return 5;
                case 7:
                    return 6;
                default:
                    return 0;
            }
        }

        @Override // ma.w
        public final Object t(w.f fVar) {
            switch (fVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new f1(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"transformType_", "transformTypeCase_", "fieldPath_", d0.class, d0.class, d0.class, ka.b.class, ka.b.class});
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

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        ma.w.D(p.class, pVar);
    }

    public static p G() {
        return DEFAULT_INSTANCE;
    }

    public final a0.d H() {
        return this.fieldTransforms_;
    }

    @Override // ma.w
    public final Object t(w.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new f1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"document_", "fieldTransforms_", b.class});
            case NEW_MUTABLE_INSTANCE:
                return new p();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<p> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (p.class) {
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
