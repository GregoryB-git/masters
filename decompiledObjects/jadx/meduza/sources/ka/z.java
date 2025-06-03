package ka;

import java.util.ArrayList;
import ma.a0;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.t0;
import ma.w;

/* loaded from: classes.dex */
public final class z extends ma.w<z, a> implements t0 {
    private static final z DEFAULT_INSTANCE;
    public static final int END_AT_FIELD_NUMBER = 8;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 5;
    public static final int OFFSET_FIELD_NUMBER = 6;
    public static final int ORDER_BY_FIELD_NUMBER = 4;
    private static volatile b1<z> PARSER = null;
    public static final int SELECT_FIELD_NUMBER = 1;
    public static final int START_AT_FIELD_NUMBER = 7;
    public static final int WHERE_FIELD_NUMBER = 3;
    private int bitField0_;
    private ka.j endAt_;
    private a0.d<b> from_;
    private ma.x limit_;
    private int offset_;
    private a0.d<h> orderBy_;
    private i select_;
    private ka.j startAt_;
    private g where_;

    public static final class a extends w.a<z, a> implements t0 {
        public a() {
            super(z.DEFAULT_INSTANCE);
        }
    }

    public static final class b extends ma.w<b, a> implements t0 {
        public static final int ALL_DESCENDANTS_FIELD_NUMBER = 3;
        public static final int COLLECTION_ID_FIELD_NUMBER = 2;
        private static final b DEFAULT_INSTANCE;
        private static volatile b1<b> PARSER;
        private boolean allDescendants_;
        private String collectionId_ = "";

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
            bVar.collectionId_ = str;
        }

        public static void H(b bVar) {
            bVar.allDescendants_ = true;
        }

        public static a K() {
            return DEFAULT_INSTANCE.s();
        }

        public final boolean I() {
            return this.allDescendants_;
        }

        public final String J() {
            return this.collectionId_;
        }

        @Override // ma.w
        public final Object t(w.f fVar) {
            switch (fVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new f1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\u0007", new Object[]{"collectionId_", "allDescendants_"});
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
        public static final int FILTERS_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile b1<c> PARSER;
        private a0.d<g> filters_ = e1.f10945d;
        private int op_;

        public static final class a extends w.a<c, a> implements t0 {
            public a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        public enum b implements a0.a {
            OPERATOR_UNSPECIFIED(0),
            AND(1),
            OR(2),
            UNRECOGNIZED(-1);


            /* renamed from: a, reason: collision with root package name */
            public final int f9203a;

            b(int i10) {
                this.f9203a = i10;
            }

            @Override // ma.a0.a
            public final int a() {
                if (this != UNRECOGNIZED) {
                    return this.f9203a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            ma.w.D(c.class, cVar);
        }

        public static void G(c cVar, b bVar) {
            cVar.getClass();
            cVar.op_ = bVar.a();
        }

        public static void H(c cVar, ArrayList arrayList) {
            a0.d<g> dVar = cVar.filters_;
            if (!dVar.g()) {
                cVar.filters_ = ma.w.A(dVar);
            }
            ma.a.k(arrayList, cVar.filters_);
        }

        public static c I() {
            return DEFAULT_INSTANCE;
        }

        public static a L() {
            return DEFAULT_INSTANCE.s();
        }

        public final a0.d J() {
            return this.filters_;
        }

        public final b K() {
            int i10 = this.op_;
            b bVar = i10 != 0 ? i10 != 1 ? i10 != 2 ? null : b.OR : b.AND : b.OPERATOR_UNSPECIFIED;
            return bVar == null ? b.UNRECOGNIZED : bVar;
        }

        @Override // ma.w
        public final Object t(w.f fVar) {
            switch (fVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new f1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"op_", "filters_", g.class});
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

    public enum d implements a0.a {
        DIRECTION_UNSPECIFIED(0),
        ASCENDING(1),
        DESCENDING(2),
        UNRECOGNIZED(-1);


        /* renamed from: a, reason: collision with root package name */
        public final int f9208a;

        d(int i10) {
            this.f9208a = i10;
        }

        @Override // ma.a0.a
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.f9208a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static final class e extends ma.w<e, a> implements t0 {
        private static final e DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 1;
        public static final int OP_FIELD_NUMBER = 2;
        private static volatile b1<e> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 3;
        private int bitField0_;
        private f field_;
        private int op_;
        private d0 value_;

        public static final class a extends w.a<e, a> implements t0 {
            public a() {
                super(e.DEFAULT_INSTANCE);
            }
        }

        public enum b implements a0.a {
            OPERATOR_UNSPECIFIED(0),
            LESS_THAN(1),
            LESS_THAN_OR_EQUAL(2),
            GREATER_THAN(3),
            GREATER_THAN_OR_EQUAL(4),
            EQUAL(5),
            NOT_EQUAL(6),
            ARRAY_CONTAINS(7),
            IN(8),
            ARRAY_CONTAINS_ANY(9),
            NOT_IN(10),
            UNRECOGNIZED(-1);


            /* renamed from: a, reason: collision with root package name */
            public final int f9220a;

            b(int i10) {
                this.f9220a = i10;
            }

            public static b f(int i10) {
                switch (i10) {
                    case 0:
                        return OPERATOR_UNSPECIFIED;
                    case 1:
                        return LESS_THAN;
                    case 2:
                        return LESS_THAN_OR_EQUAL;
                    case 3:
                        return GREATER_THAN;
                    case 4:
                        return GREATER_THAN_OR_EQUAL;
                    case 5:
                        return EQUAL;
                    case 6:
                        return NOT_EQUAL;
                    case 7:
                        return ARRAY_CONTAINS;
                    case 8:
                        return IN;
                    case 9:
                        return ARRAY_CONTAINS_ANY;
                    case 10:
                        return NOT_IN;
                    default:
                        return null;
                }
            }

            @Override // ma.a0.a
            public final int a() {
                if (this != UNRECOGNIZED) {
                    return this.f9220a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            e eVar = new e();
            DEFAULT_INSTANCE = eVar;
            ma.w.D(e.class, eVar);
        }

        public static void G(e eVar, f fVar) {
            eVar.getClass();
            eVar.field_ = fVar;
            eVar.bitField0_ |= 1;
        }

        public static void H(e eVar, b bVar) {
            eVar.getClass();
            eVar.op_ = bVar.a();
        }

        public static void I(e eVar, d0 d0Var) {
            eVar.getClass();
            d0Var.getClass();
            eVar.value_ = d0Var;
            eVar.bitField0_ |= 2;
        }

        public static e J() {
            return DEFAULT_INSTANCE;
        }

        public static a N() {
            return DEFAULT_INSTANCE.s();
        }

        public final f K() {
            f fVar = this.field_;
            return fVar == null ? f.H() : fVar;
        }

        public final b L() {
            b f = b.f(this.op_);
            return f == null ? b.UNRECOGNIZED : f;
        }

        public final d0 M() {
            d0 d0Var = this.value_;
            return d0Var == null ? d0.U() : d0Var;
        }

        @Override // ma.w
        public final Object t(w.f fVar) {
            switch (fVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new f1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001", new Object[]{"bitField0_", "field_", "op_", "value_"});
                case NEW_MUTABLE_INSTANCE:
                    return new e();
                case NEW_BUILDER:
                    return new a();
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    b1<e> b1Var = PARSER;
                    if (b1Var == null) {
                        synchronized (e.class) {
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

    public static final class f extends ma.w<f, a> implements t0 {
        private static final f DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 2;
        private static volatile b1<f> PARSER;
        private String fieldPath_ = "";

        public static final class a extends w.a<f, a> implements t0 {
            public a() {
                super(f.DEFAULT_INSTANCE);
            }
        }

        static {
            f fVar = new f();
            DEFAULT_INSTANCE = fVar;
            ma.w.D(f.class, fVar);
        }

        public static void G(f fVar, String str) {
            fVar.getClass();
            str.getClass();
            fVar.fieldPath_ = str;
        }

        public static f H() {
            return DEFAULT_INSTANCE;
        }

        public static a J() {
            return DEFAULT_INSTANCE.s();
        }

        public final String I() {
            return this.fieldPath_;
        }

        @Override // ma.w
        public final Object t(w.f fVar) {
            switch (fVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new f1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"fieldPath_"});
                case NEW_MUTABLE_INSTANCE:
                    return new f();
                case NEW_BUILDER:
                    return new a();
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    b1<f> b1Var = PARSER;
                    if (b1Var == null) {
                        synchronized (f.class) {
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

    public static final class g extends ma.w<g, a> implements t0 {
        public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
        private static final g DEFAULT_INSTANCE;
        public static final int FIELD_FILTER_FIELD_NUMBER = 2;
        private static volatile b1<g> PARSER = null;
        public static final int UNARY_FILTER_FIELD_NUMBER = 3;
        private int filterTypeCase_ = 0;
        private Object filterType_;

        public static final class a extends w.a<g, a> implements t0 {
            public a() {
                super(g.DEFAULT_INSTANCE);
            }
        }

        public enum b {
            COMPOSITE_FILTER,
            FIELD_FILTER,
            UNARY_FILTER,
            FILTERTYPE_NOT_SET
        }

        static {
            g gVar = new g();
            DEFAULT_INSTANCE = gVar;
            ma.w.D(g.class, gVar);
        }

        public static void F(g gVar, e eVar) {
            gVar.getClass();
            gVar.filterType_ = eVar;
            gVar.filterTypeCase_ = 2;
        }

        public static void G(g gVar, j jVar) {
            gVar.getClass();
            gVar.filterType_ = jVar;
            gVar.filterTypeCase_ = 3;
        }

        public static void I(g gVar, c cVar) {
            gVar.getClass();
            gVar.filterType_ = cVar;
            gVar.filterTypeCase_ = 1;
        }

        public static g K() {
            return DEFAULT_INSTANCE;
        }

        public static a O() {
            return DEFAULT_INSTANCE.s();
        }

        public final c J() {
            return this.filterTypeCase_ == 1 ? (c) this.filterType_ : c.I();
        }

        public final e L() {
            return this.filterTypeCase_ == 2 ? (e) this.filterType_ : e.J();
        }

        public final b M() {
            int i10 = this.filterTypeCase_;
            if (i10 == 0) {
                return b.FILTERTYPE_NOT_SET;
            }
            if (i10 == 1) {
                return b.COMPOSITE_FILTER;
            }
            if (i10 == 2) {
                return b.FIELD_FILTER;
            }
            if (i10 != 3) {
                return null;
            }
            return b.UNARY_FILTER;
        }

        public final j N() {
            return this.filterTypeCase_ == 3 ? (j) this.filterType_ : j.I();
        }

        @Override // ma.w
        public final Object t(w.f fVar) {
            switch (fVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new f1(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"filterType_", "filterTypeCase_", c.class, e.class, j.class});
                case NEW_MUTABLE_INSTANCE:
                    return new g();
                case NEW_BUILDER:
                    return new a();
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    b1<g> b1Var = PARSER;
                    if (b1Var == null) {
                        synchronized (g.class) {
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

    public static final class h extends ma.w<h, a> implements t0 {
        private static final h DEFAULT_INSTANCE;
        public static final int DIRECTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile b1<h> PARSER;
        private int bitField0_;
        private int direction_;
        private f field_;

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

        public static void G(h hVar, f fVar) {
            hVar.getClass();
            hVar.field_ = fVar;
            hVar.bitField0_ |= 1;
        }

        public static void H(h hVar, d dVar) {
            hVar.getClass();
            hVar.direction_ = dVar.a();
        }

        public static a K() {
            return DEFAULT_INSTANCE.s();
        }

        public final d I() {
            int i10 = this.direction_;
            d dVar = i10 != 0 ? i10 != 1 ? i10 != 2 ? null : d.DESCENDING : d.ASCENDING : d.DIRECTION_UNSPECIFIED;
            return dVar == null ? d.UNRECOGNIZED : dVar;
        }

        public final f J() {
            f fVar = this.field_;
            return fVar == null ? f.H() : fVar;
        }

        @Override // ma.w
        public final Object t(w.f fVar) {
            switch (fVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new f1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "field_", "direction_"});
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

    public static final class i extends ma.w<i, a> implements t0 {
        private static final i DEFAULT_INSTANCE;
        public static final int FIELDS_FIELD_NUMBER = 2;
        private static volatile b1<i> PARSER;
        private a0.d<f> fields_ = e1.f10945d;

        public static final class a extends w.a<i, a> implements t0 {
            public a() {
                super(i.DEFAULT_INSTANCE);
            }
        }

        static {
            i iVar = new i();
            DEFAULT_INSTANCE = iVar;
            ma.w.D(i.class, iVar);
        }

        @Override // ma.w
        public final Object t(w.f fVar) {
            switch (fVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new f1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"fields_", f.class});
                case NEW_MUTABLE_INSTANCE:
                    return new i();
                case NEW_BUILDER:
                    return new a();
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    b1<i> b1Var = PARSER;
                    if (b1Var == null) {
                        synchronized (i.class) {
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

    public static final class j extends ma.w<j, a> implements t0 {
        private static final j DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile b1<j> PARSER;
        private int op_;
        private int operandTypeCase_ = 0;
        private Object operandType_;

        public static final class a extends w.a<j, a> implements t0 {
            public a() {
                super(j.DEFAULT_INSTANCE);
            }
        }

        public enum b implements a0.a {
            OPERATOR_UNSPECIFIED(0),
            IS_NAN(2),
            IS_NULL(3),
            IS_NOT_NAN(4),
            IS_NOT_NULL(5),
            UNRECOGNIZED(-1);


            /* renamed from: a, reason: collision with root package name */
            public final int f9232a;

            b(int i10) {
                this.f9232a = i10;
            }

            public static b f(int i10) {
                if (i10 == 0) {
                    return OPERATOR_UNSPECIFIED;
                }
                if (i10 == 2) {
                    return IS_NAN;
                }
                if (i10 == 3) {
                    return IS_NULL;
                }
                if (i10 == 4) {
                    return IS_NOT_NAN;
                }
                if (i10 != 5) {
                    return null;
                }
                return IS_NOT_NULL;
            }

            @Override // ma.a0.a
            public final int a() {
                if (this != UNRECOGNIZED) {
                    return this.f9232a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            j jVar = new j();
            DEFAULT_INSTANCE = jVar;
            ma.w.D(j.class, jVar);
        }

        public static void G(j jVar, b bVar) {
            jVar.getClass();
            jVar.op_ = bVar.a();
        }

        public static void H(j jVar, f fVar) {
            jVar.getClass();
            jVar.operandType_ = fVar;
            jVar.operandTypeCase_ = 2;
        }

        public static j I() {
            return DEFAULT_INSTANCE;
        }

        public static a L() {
            return DEFAULT_INSTANCE.s();
        }

        public final f J() {
            return this.operandTypeCase_ == 2 ? (f) this.operandType_ : f.H();
        }

        public final b K() {
            b f = b.f(this.op_);
            return f == null ? b.UNRECOGNIZED : f;
        }

        @Override // ma.w
        public final Object t(w.f fVar) {
            switch (fVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new f1(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002<\u0000", new Object[]{"operandType_", "operandTypeCase_", "op_", f.class});
                case NEW_MUTABLE_INSTANCE:
                    return new j();
                case NEW_BUILDER:
                    return new a();
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    b1<j> b1Var = PARSER;
                    if (b1Var == null) {
                        synchronized (j.class) {
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
        z zVar = new z();
        DEFAULT_INSTANCE = zVar;
        ma.w.D(z.class, zVar);
    }

    public z() {
        e1<Object> e1Var = e1.f10945d;
        this.from_ = e1Var;
        this.orderBy_ = e1Var;
    }

    public static void G(z zVar, b bVar) {
        zVar.getClass();
        a0.d<b> dVar = zVar.from_;
        if (!dVar.g()) {
            zVar.from_ = ma.w.A(dVar);
        }
        zVar.from_.add(bVar);
    }

    public static void H(z zVar, g gVar) {
        zVar.getClass();
        gVar.getClass();
        zVar.where_ = gVar;
        zVar.bitField0_ |= 2;
    }

    public static void I(z zVar, h hVar) {
        zVar.getClass();
        a0.d<h> dVar = zVar.orderBy_;
        if (!dVar.g()) {
            zVar.orderBy_ = ma.w.A(dVar);
        }
        zVar.orderBy_.add(hVar);
    }

    public static void J(z zVar, ka.j jVar) {
        zVar.getClass();
        zVar.startAt_ = jVar;
        zVar.bitField0_ |= 4;
    }

    public static void K(z zVar, ka.j jVar) {
        zVar.getClass();
        zVar.endAt_ = jVar;
        zVar.bitField0_ |= 8;
    }

    public static void L(z zVar, ma.x xVar) {
        zVar.getClass();
        zVar.limit_ = xVar;
        zVar.bitField0_ |= 16;
    }

    public static z M() {
        return DEFAULT_INSTANCE;
    }

    public static a Z() {
        return DEFAULT_INSTANCE.s();
    }

    public final ka.j N() {
        ka.j jVar = this.endAt_;
        return jVar == null ? ka.j.J() : jVar;
    }

    public final b O() {
        return this.from_.get(0);
    }

    public final int P() {
        return this.from_.size();
    }

    public final ma.x Q() {
        ma.x xVar = this.limit_;
        return xVar == null ? ma.x.H() : xVar;
    }

    public final h R(int i10) {
        return this.orderBy_.get(i10);
    }

    public final int S() {
        return this.orderBy_.size();
    }

    public final ka.j T() {
        ka.j jVar = this.startAt_;
        return jVar == null ? ka.j.J() : jVar;
    }

    public final g U() {
        g gVar = this.where_;
        return gVar == null ? g.K() : gVar;
    }

    public final boolean V() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean W() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean X() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean Y() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // ma.w
    public final Object t(w.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new f1(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b\u0005ဉ\u0004\u0006\u0004\u0007ဉ\u0002\bဉ\u0003", new Object[]{"bitField0_", "select_", "from_", b.class, "where_", "orderBy_", h.class, "limit_", "offset_", "startAt_", "endAt_"});
            case NEW_MUTABLE_INSTANCE:
                return new z();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<z> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (z.class) {
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
