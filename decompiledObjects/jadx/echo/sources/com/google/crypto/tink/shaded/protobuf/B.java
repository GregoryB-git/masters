package com.google.crypto.tink.shaded.protobuf;

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
/* loaded from: classes.dex */
public final class B {

    /* renamed from: A, reason: collision with root package name */
    public static final B f11258A;

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ B[] f11259B;

    /* renamed from: r, reason: collision with root package name */
    public static final B f11260r;

    /* renamed from: s, reason: collision with root package name */
    public static final B f11261s;

    /* renamed from: t, reason: collision with root package name */
    public static final B f11262t;

    /* renamed from: u, reason: collision with root package name */
    public static final B f11263u;

    /* renamed from: v, reason: collision with root package name */
    public static final B f11264v;

    /* renamed from: w, reason: collision with root package name */
    public static final B f11265w;

    /* renamed from: x, reason: collision with root package name */
    public static final B f11266x;

    /* renamed from: y, reason: collision with root package name */
    public static final B f11267y;

    /* renamed from: z, reason: collision with root package name */
    public static final B f11268z;

    /* renamed from: o, reason: collision with root package name */
    public final Class f11269o;

    /* renamed from: p, reason: collision with root package name */
    public final Class f11270p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f11271q;

    static {
        B b7 = new B("VOID", 0, Void.class, Void.class, null);
        f11260r = b7;
        Class cls = Integer.TYPE;
        B b8 = new B("INT", 1, cls, Integer.class, 0);
        f11261s = b8;
        B b9 = new B("LONG", 2, Long.TYPE, Long.class, 0L);
        f11262t = b9;
        B b10 = new B("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f11263u = b10;
        B b11 = new B("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f11264v = b11;
        B b12 = new B("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f11265w = b12;
        B b13 = new B("STRING", 6, String.class, String.class, "");
        f11266x = b13;
        B b14 = new B("BYTE_STRING", 7, AbstractC1093h.class, AbstractC1093h.class, AbstractC1093h.f11337p);
        f11267y = b14;
        B b15 = new B("ENUM", 8, cls, Integer.class, null);
        f11268z = b15;
        B b16 = new B("MESSAGE", 9, Object.class, Object.class, null);
        f11258A = b16;
        f11259B = new B[]{b7, b8, b9, b10, b11, b12, b13, b14, b15, b16};
    }

    public B(String str, int i7, Class cls, Class cls2, Object obj) {
        this.f11269o = cls;
        this.f11270p = cls2;
        this.f11271q = obj;
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f11259B.clone();
    }

    public Class c() {
        return this.f11270p;
    }
}
