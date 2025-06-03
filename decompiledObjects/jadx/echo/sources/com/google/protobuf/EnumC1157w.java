package com.google.protobuf;

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
/* renamed from: com.google.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1157w {

    /* renamed from: A, reason: collision with root package name */
    public static final EnumC1157w f12257A;

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ EnumC1157w[] f12258B;

    /* renamed from: r, reason: collision with root package name */
    public static final EnumC1157w f12259r = new EnumC1157w("VOID", 0, Void.class, Void.class, null);

    /* renamed from: s, reason: collision with root package name */
    public static final EnumC1157w f12260s;

    /* renamed from: t, reason: collision with root package name */
    public static final EnumC1157w f12261t;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC1157w f12262u;

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC1157w f12263v;

    /* renamed from: w, reason: collision with root package name */
    public static final EnumC1157w f12264w;

    /* renamed from: x, reason: collision with root package name */
    public static final EnumC1157w f12265x;

    /* renamed from: y, reason: collision with root package name */
    public static final EnumC1157w f12266y;

    /* renamed from: z, reason: collision with root package name */
    public static final EnumC1157w f12267z;

    /* renamed from: o, reason: collision with root package name */
    public final Class f12268o;

    /* renamed from: p, reason: collision with root package name */
    public final Class f12269p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f12270q;

    static {
        Class cls = Integer.TYPE;
        f12260s = new EnumC1157w("INT", 1, cls, Integer.class, 0);
        f12261t = new EnumC1157w("LONG", 2, Long.TYPE, Long.class, 0L);
        f12262u = new EnumC1157w("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f12263v = new EnumC1157w("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f12264w = new EnumC1157w("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f12265x = new EnumC1157w("STRING", 6, String.class, String.class, "");
        f12266y = new EnumC1157w("BYTE_STRING", 7, AbstractC1141f.class, AbstractC1141f.class, AbstractC1141f.f12047p);
        f12267z = new EnumC1157w("ENUM", 8, cls, Integer.class, null);
        f12257A = new EnumC1157w("MESSAGE", 9, Object.class, Object.class, null);
        f12258B = c();
    }

    public EnumC1157w(String str, int i7, Class cls, Class cls2, Object obj) {
        this.f12268o = cls;
        this.f12269p = cls2;
        this.f12270q = obj;
    }

    public static /* synthetic */ EnumC1157w[] c() {
        return new EnumC1157w[]{f12259r, f12260s, f12261t, f12262u, f12263v, f12264w, f12265x, f12266y, f12267z, f12257A};
    }

    public static EnumC1157w valueOf(String str) {
        return (EnumC1157w) Enum.valueOf(EnumC1157w.class, str);
    }

    public static EnumC1157w[] values() {
        return (EnumC1157w[]) f12258B.clone();
    }

    public Class e() {
        return this.f12269p;
    }
}
