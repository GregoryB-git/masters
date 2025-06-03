package com.google.protobuf;

/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12121a = c(1, 3);

    /* renamed from: b, reason: collision with root package name */
    public static final int f12122b = c(1, 4);

    /* renamed from: c, reason: collision with root package name */
    public static final int f12123c = c(2, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f12124d = c(3, 2);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 's' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class b {

        /* renamed from: A, reason: collision with root package name */
        public static final b f12125A;

        /* renamed from: B, reason: collision with root package name */
        public static final b f12126B;

        /* renamed from: C, reason: collision with root package name */
        public static final b f12127C;

        /* renamed from: D, reason: collision with root package name */
        public static final b f12128D;

        /* renamed from: E, reason: collision with root package name */
        public static final b f12129E;

        /* renamed from: F, reason: collision with root package name */
        public static final b f12130F;

        /* renamed from: G, reason: collision with root package name */
        public static final b f12131G;

        /* renamed from: H, reason: collision with root package name */
        public static final b f12132H;

        /* renamed from: I, reason: collision with root package name */
        public static final /* synthetic */ b[] f12133I;

        /* renamed from: q, reason: collision with root package name */
        public static final b f12134q = new b("DOUBLE", 0, c.DOUBLE, 1);

        /* renamed from: r, reason: collision with root package name */
        public static final b f12135r = new b("FLOAT", 1, c.FLOAT, 5);

        /* renamed from: s, reason: collision with root package name */
        public static final b f12136s;

        /* renamed from: t, reason: collision with root package name */
        public static final b f12137t;

        /* renamed from: u, reason: collision with root package name */
        public static final b f12138u;

        /* renamed from: v, reason: collision with root package name */
        public static final b f12139v;

        /* renamed from: w, reason: collision with root package name */
        public static final b f12140w;

        /* renamed from: x, reason: collision with root package name */
        public static final b f12141x;

        /* renamed from: y, reason: collision with root package name */
        public static final b f12142y;

        /* renamed from: z, reason: collision with root package name */
        public static final b f12143z;

        /* renamed from: o, reason: collision with root package name */
        public final c f12144o;

        /* renamed from: p, reason: collision with root package name */
        public final int f12145p;

        public enum a extends b {
            public a(String str, int i7, c cVar, int i8) {
                super(str, i7, cVar, i8);
            }
        }

        /* renamed from: com.google.protobuf.m0$b$b, reason: collision with other inner class name */
        public enum C0181b extends b {
            public C0181b(String str, int i7, c cVar, int i8) {
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
            c cVar = c.LONG;
            f12136s = new b("INT64", 2, cVar, 0);
            f12137t = new b("UINT64", 3, cVar, 0);
            c cVar2 = c.INT;
            f12138u = new b("INT32", 4, cVar2, 0);
            f12139v = new b("FIXED64", 5, cVar, 1);
            f12140w = new b("FIXED32", 6, cVar2, 5);
            f12141x = new b("BOOL", 7, c.BOOLEAN, 0);
            f12142y = new a("STRING", 8, c.STRING, 2);
            c cVar3 = c.MESSAGE;
            f12143z = new C0181b("GROUP", 9, cVar3, 3);
            f12125A = new c("MESSAGE", 10, cVar3, 2);
            f12126B = new d("BYTES", 11, c.BYTE_STRING, 2);
            f12127C = new b("UINT32", 12, cVar2, 0);
            f12128D = new b("ENUM", 13, c.ENUM, 0);
            f12129E = new b("SFIXED32", 14, cVar2, 5);
            f12130F = new b("SFIXED64", 15, cVar, 1);
            f12131G = new b("SINT32", 16, cVar2, 0);
            f12132H = new b("SINT64", 17, cVar, 0);
            f12133I = c();
        }

        public b(String str, int i7, c cVar, int i8) {
            this.f12144o = cVar;
            this.f12145p = i8;
        }

        public static /* synthetic */ b[] c() {
            return new b[]{f12134q, f12135r, f12136s, f12137t, f12138u, f12139v, f12140w, f12141x, f12142y, f12143z, f12125A, f12126B, f12127C, f12128D, f12129E, f12130F, f12131G, f12132H};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f12133I.clone();
        }

        public c e() {
            return this.f12144o;
        }

        public int h() {
            return this.f12145p;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC1141f.f12047p),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: o, reason: collision with root package name */
        public final Object f12156o;

        c(Object obj) {
            this.f12156o = obj;
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
