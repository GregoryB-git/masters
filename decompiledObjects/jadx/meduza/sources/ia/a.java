package ia;

import ma.a0;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.t0;
import ma.w;

/* loaded from: classes.dex */
public final class a extends w<a, C0117a> implements t0 {
    private static final a DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile b1<a> PARSER = null;
    public static final int QUERY_SCOPE_FIELD_NUMBER = 2;
    public static final int STATE_FIELD_NUMBER = 4;
    private int queryScope_;
    private int state_;
    private String name_ = "";
    private a0.d<b> fields_ = e1.f10945d;

    /* renamed from: ia.a$a, reason: collision with other inner class name */
    public static final class C0117a extends w.a<a, C0117a> implements t0 {
        public C0117a() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    public static final class b extends w<b, C0119b> implements t0 {
        public static final int ARRAY_CONFIG_FIELD_NUMBER = 3;
        private static final b DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int ORDER_FIELD_NUMBER = 2;
        private static volatile b1<b> PARSER;
        private Object valueMode_;
        private int valueModeCase_ = 0;
        private String fieldPath_ = "";

        /* renamed from: ia.a$b$a, reason: collision with other inner class name */
        public enum EnumC0118a implements a0.a {
            /* JADX INFO: Fake field, exist only in values array */
            ARRAY_CONFIG_UNSPECIFIED(0),
            CONTAINS(1),
            UNRECOGNIZED(-1);


            /* renamed from: a, reason: collision with root package name */
            public final int f7873a;

            EnumC0118a(int i10) {
                this.f7873a = i10;
            }

            @Override // ma.a0.a
            public final int a() {
                if (this != UNRECOGNIZED) {
                    return this.f7873a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        /* renamed from: ia.a$b$b, reason: collision with other inner class name */
        public static final class C0119b extends w.a<b, C0119b> implements t0 {
            public C0119b() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        public enum c implements a0.a {
            ORDER_UNSPECIFIED(0),
            ASCENDING(1),
            DESCENDING(2),
            UNRECOGNIZED(-1);


            /* renamed from: a, reason: collision with root package name */
            public final int f7878a;

            c(int i10) {
                this.f7878a = i10;
            }

            @Override // ma.a0.a
            public final int a() {
                if (this != UNRECOGNIZED) {
                    return this.f7878a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            w.D(b.class, bVar);
        }

        public static void G(b bVar, String str) {
            bVar.getClass();
            str.getClass();
            bVar.fieldPath_ = str;
        }

        public static void H(b bVar, c cVar) {
            bVar.getClass();
            bVar.valueMode_ = Integer.valueOf(cVar.a());
            bVar.valueModeCase_ = 2;
        }

        public static void I(b bVar) {
            EnumC0118a enumC0118a = EnumC0118a.CONTAINS;
            bVar.getClass();
            bVar.valueMode_ = Integer.valueOf(enumC0118a.a());
            bVar.valueModeCase_ = 3;
        }

        public static C0119b M() {
            return DEFAULT_INSTANCE.s();
        }

        public final String J() {
            return this.fieldPath_;
        }

        public final c K() {
            c cVar = c.ORDER_UNSPECIFIED;
            if (this.valueModeCase_ != 2) {
                return cVar;
            }
            int intValue = ((Integer) this.valueMode_).intValue();
            if (intValue != 0) {
                cVar = intValue != 1 ? intValue != 2 ? null : c.DESCENDING : c.ASCENDING;
            }
            return cVar == null ? c.UNRECOGNIZED : cVar;
        }

        public final int L() {
            int i10 = this.valueModeCase_;
            if (i10 == 0) {
                return 3;
            }
            if (i10 != 2) {
                return i10 != 3 ? 0 : 2;
            }
            return 1;
        }

        @Override // ma.w
        public final Object t(w.f fVar) {
            switch (fVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new f1(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003?\u0000", new Object[]{"valueMode_", "valueModeCase_", "fieldPath_"});
                case NEW_MUTABLE_INSTANCE:
                    return new b();
                case NEW_BUILDER:
                    return new C0119b();
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

    public enum c implements a0.a {
        /* JADX INFO: Fake field, exist only in values array */
        QUERY_SCOPE_UNSPECIFIED(0),
        /* JADX INFO: Fake field, exist only in values array */
        COLLECTION(1),
        COLLECTION_GROUP(2),
        UNRECOGNIZED(-1);


        /* renamed from: a, reason: collision with root package name */
        public final int f7882a;

        c(int i10) {
            this.f7882a = i10;
        }

        @Override // ma.a0.a
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.f7882a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        w.D(a.class, aVar);
    }

    public static void G(a aVar) {
        c cVar = c.COLLECTION_GROUP;
        aVar.getClass();
        aVar.queryScope_ = cVar.a();
    }

    public static void H(a aVar, b bVar) {
        aVar.getClass();
        a0.d<b> dVar = aVar.fields_;
        if (!dVar.g()) {
            aVar.fields_ = w.A(dVar);
        }
        aVar.fields_.add(bVar);
    }

    public static C0117a J() {
        return DEFAULT_INSTANCE.s();
    }

    public static a K(byte[] bArr) {
        return (a) w.B(DEFAULT_INSTANCE, bArr);
    }

    public final a0.d I() {
        return this.fields_;
    }

    @Override // ma.w
    public final Object t(w.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new f1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\u001b\u0004\f", new Object[]{"name_", "queryScope_", "fields_", b.class, "state_"});
            case NEW_MUTABLE_INSTANCE:
                return new a();
            case NEW_BUILDER:
                return new C0117a();
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
