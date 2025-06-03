package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f9073a = c(1, 3);

    /* renamed from: b, reason: collision with root package name */
    public static final int f9074b = c(1, 4);

    /* renamed from: c, reason: collision with root package name */
    public static final int f9075c = c(2, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f9076d = c(3, 2);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 's' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class b {

        /* renamed from: A, reason: collision with root package name */
        public static final b f9077A;

        /* renamed from: B, reason: collision with root package name */
        public static final b f9078B;

        /* renamed from: C, reason: collision with root package name */
        public static final b f9079C;

        /* renamed from: D, reason: collision with root package name */
        public static final b f9080D;

        /* renamed from: E, reason: collision with root package name */
        public static final b f9081E;

        /* renamed from: F, reason: collision with root package name */
        public static final b f9082F;

        /* renamed from: G, reason: collision with root package name */
        public static final b f9083G;

        /* renamed from: H, reason: collision with root package name */
        public static final b f9084H;

        /* renamed from: I, reason: collision with root package name */
        public static final /* synthetic */ b[] f9085I;

        /* renamed from: q, reason: collision with root package name */
        public static final b f9086q;

        /* renamed from: r, reason: collision with root package name */
        public static final b f9087r;

        /* renamed from: s, reason: collision with root package name */
        public static final b f9088s;

        /* renamed from: t, reason: collision with root package name */
        public static final b f9089t;

        /* renamed from: u, reason: collision with root package name */
        public static final b f9090u;

        /* renamed from: v, reason: collision with root package name */
        public static final b f9091v;

        /* renamed from: w, reason: collision with root package name */
        public static final b f9092w;

        /* renamed from: x, reason: collision with root package name */
        public static final b f9093x;

        /* renamed from: y, reason: collision with root package name */
        public static final b f9094y;

        /* renamed from: z, reason: collision with root package name */
        public static final b f9095z;

        /* renamed from: o, reason: collision with root package name */
        public final c f9096o;

        /* renamed from: p, reason: collision with root package name */
        public final int f9097p;

        public enum a extends b {
            public a(String str, int i7, c cVar, int i8) {
                super(str, i7, cVar, i8);
            }
        }

        /* renamed from: androidx.datastore.preferences.protobuf.r0$b$b, reason: collision with other inner class name */
        public enum C0157b extends b {
            public C0157b(String str, int i7, c cVar, int i8) {
                super(str, i7, cVar, i8);
            }
        }

        public enum c extends b {
            public c(String str, int i7, c cVar, int i8) {
                super(str, i7, cVar, i8);
            }
        }

        public enum d extends b {
            public d(String str, int i7, c cVar, int i8) {
                super(str, i7, cVar, i8);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f9086q = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f9087r = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f9088s = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f9089t = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f9090u = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f9091v = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f9092w = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f9093x = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f9094y = aVar;
            c cVar3 = c.MESSAGE;
            C0157b c0157b = new C0157b("GROUP", 9, cVar3, 3);
            f9095z = c0157b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f9077A = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f9078B = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f9079C = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f9080D = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f9081E = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f9082F = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f9083G = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f9084H = bVar14;
            f9085I = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0157b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public b(String str, int i7, c cVar, int i8) {
            this.f9096o = cVar;
            this.f9097p = i8;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f9085I.clone();
        }

        public c c() {
            return this.f9096o;
        }

        public int e() {
            return this.f9097p;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC0760g.f8950p),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: o, reason: collision with root package name */
        public final Object f9108o;

        c(Object obj) {
            this.f9108o = obj;
        }
    }

    public static int a(int i7) {
        return i7 >>> 3;
    }

    public static int b(int i7) {
        return i7 & 7;
    }

    public static int c(int i7, int i8) {
        return (i7 << 3) | i8;
    }
}
