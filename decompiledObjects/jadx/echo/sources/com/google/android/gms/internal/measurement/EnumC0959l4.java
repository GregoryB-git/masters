package com.google.android.gms.internal.measurement;

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
/* renamed from: com.google.android.gms.internal.measurement.l4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0959l4 {

    /* renamed from: A, reason: collision with root package name */
    public static final EnumC0959l4 f11025A;

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ EnumC0959l4[] f11026B;

    /* renamed from: r, reason: collision with root package name */
    public static final EnumC0959l4 f11027r;

    /* renamed from: s, reason: collision with root package name */
    public static final EnumC0959l4 f11028s;

    /* renamed from: t, reason: collision with root package name */
    public static final EnumC0959l4 f11029t;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC0959l4 f11030u;

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC0959l4 f11031v;

    /* renamed from: w, reason: collision with root package name */
    public static final EnumC0959l4 f11032w;

    /* renamed from: x, reason: collision with root package name */
    public static final EnumC0959l4 f11033x;

    /* renamed from: y, reason: collision with root package name */
    public static final EnumC0959l4 f11034y;

    /* renamed from: z, reason: collision with root package name */
    public static final EnumC0959l4 f11035z;

    /* renamed from: o, reason: collision with root package name */
    public final Class f11036o;

    /* renamed from: p, reason: collision with root package name */
    public final Class f11037p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f11038q;

    static {
        EnumC0959l4 enumC0959l4 = new EnumC0959l4("VOID", 0, Void.class, Void.class, null);
        f11027r = enumC0959l4;
        Class cls = Integer.TYPE;
        EnumC0959l4 enumC0959l42 = new EnumC0959l4("INT", 1, cls, Integer.class, 0);
        f11028s = enumC0959l42;
        EnumC0959l4 enumC0959l43 = new EnumC0959l4("LONG", 2, Long.TYPE, Long.class, 0L);
        f11029t = enumC0959l43;
        EnumC0959l4 enumC0959l44 = new EnumC0959l4("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f11030u = enumC0959l44;
        EnumC0959l4 enumC0959l45 = new EnumC0959l4("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f11031v = enumC0959l45;
        EnumC0959l4 enumC0959l46 = new EnumC0959l4("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f11032w = enumC0959l46;
        EnumC0959l4 enumC0959l47 = new EnumC0959l4("STRING", 6, String.class, String.class, "");
        f11033x = enumC0959l47;
        EnumC0959l4 enumC0959l48 = new EnumC0959l4("BYTE_STRING", 7, AbstractC1003q3.class, AbstractC1003q3.class, AbstractC1003q3.f11110p);
        f11034y = enumC0959l48;
        EnumC0959l4 enumC0959l49 = new EnumC0959l4("ENUM", 8, cls, Integer.class, null);
        f11035z = enumC0959l49;
        EnumC0959l4 enumC0959l410 = new EnumC0959l4("MESSAGE", 9, Object.class, Object.class, null);
        f11025A = enumC0959l410;
        f11026B = new EnumC0959l4[]{enumC0959l4, enumC0959l42, enumC0959l43, enumC0959l44, enumC0959l45, enumC0959l46, enumC0959l47, enumC0959l48, enumC0959l49, enumC0959l410};
    }

    public EnumC0959l4(String str, int i7, Class cls, Class cls2, Object obj) {
        this.f11036o = cls;
        this.f11037p = cls2;
        this.f11038q = obj;
    }

    public static EnumC0959l4[] values() {
        return (EnumC0959l4[]) f11026B.clone();
    }

    public final Class c() {
        return this.f11037p;
    }
}
