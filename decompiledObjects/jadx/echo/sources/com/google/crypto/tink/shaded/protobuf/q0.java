package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f11432a = c(1, 3);

    /* renamed from: b, reason: collision with root package name */
    public static final int f11433b = c(1, 4);

    /* renamed from: c, reason: collision with root package name */
    public static final int f11434c = c(2, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f11435d = c(3, 2);

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
        public static final b f11436A;

        /* renamed from: B, reason: collision with root package name */
        public static final b f11437B;

        /* renamed from: C, reason: collision with root package name */
        public static final b f11438C;

        /* renamed from: D, reason: collision with root package name */
        public static final b f11439D;

        /* renamed from: E, reason: collision with root package name */
        public static final b f11440E;

        /* renamed from: F, reason: collision with root package name */
        public static final b f11441F;

        /* renamed from: G, reason: collision with root package name */
        public static final b f11442G;

        /* renamed from: H, reason: collision with root package name */
        public static final b f11443H;

        /* renamed from: I, reason: collision with root package name */
        public static final /* synthetic */ b[] f11444I;

        /* renamed from: q, reason: collision with root package name */
        public static final b f11445q;

        /* renamed from: r, reason: collision with root package name */
        public static final b f11446r;

        /* renamed from: s, reason: collision with root package name */
        public static final b f11447s;

        /* renamed from: t, reason: collision with root package name */
        public static final b f11448t;

        /* renamed from: u, reason: collision with root package name */
        public static final b f11449u;

        /* renamed from: v, reason: collision with root package name */
        public static final b f11450v;

        /* renamed from: w, reason: collision with root package name */
        public static final b f11451w;

        /* renamed from: x, reason: collision with root package name */
        public static final b f11452x;

        /* renamed from: y, reason: collision with root package name */
        public static final b f11453y;

        /* renamed from: z, reason: collision with root package name */
        public static final b f11454z;

        /* renamed from: o, reason: collision with root package name */
        public final c f11455o;

        /* renamed from: p, reason: collision with root package name */
        public final int f11456p;

        public enum a extends b {
            public a(String str, int i7, c cVar, int i8) {
                super(str, i7, cVar, i8);
            }
        }

        /* renamed from: com.google.crypto.tink.shaded.protobuf.q0$b$b, reason: collision with other inner class name */
        public enum C0174b extends b {
            public C0174b(String str, int i7, c cVar, int i8) {
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
            f11445q = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f11446r = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f11447s = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f11448t = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f11449u = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f11450v = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f11451w = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f11452x = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f11453y = aVar;
            c cVar3 = c.MESSAGE;
            C0174b c0174b = new C0174b("GROUP", 9, cVar3, 3);
            f11454z = c0174b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f11436A = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f11437B = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f11438C = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f11439D = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f11440E = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f11441F = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f11442G = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f11443H = bVar14;
            f11444I = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0174b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public b(String str, int i7, c cVar, int i8) {
            this.f11455o = cVar;
            this.f11456p = i8;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f11444I.clone();
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC1093h.f11337p),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: o, reason: collision with root package name */
        public final Object f11467o;

        c(Object obj) {
            this.f11467o = obj;
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
