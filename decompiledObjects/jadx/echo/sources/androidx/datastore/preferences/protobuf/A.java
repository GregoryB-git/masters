package androidx.datastore.preferences.protobuf;

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
public final class A {

    /* renamed from: A, reason: collision with root package name */
    public static final A f8873A;

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ A[] f8874B;

    /* renamed from: r, reason: collision with root package name */
    public static final A f8875r;

    /* renamed from: s, reason: collision with root package name */
    public static final A f8876s;

    /* renamed from: t, reason: collision with root package name */
    public static final A f8877t;

    /* renamed from: u, reason: collision with root package name */
    public static final A f8878u;

    /* renamed from: v, reason: collision with root package name */
    public static final A f8879v;

    /* renamed from: w, reason: collision with root package name */
    public static final A f8880w;

    /* renamed from: x, reason: collision with root package name */
    public static final A f8881x;

    /* renamed from: y, reason: collision with root package name */
    public static final A f8882y;

    /* renamed from: z, reason: collision with root package name */
    public static final A f8883z;

    /* renamed from: o, reason: collision with root package name */
    public final Class f8884o;

    /* renamed from: p, reason: collision with root package name */
    public final Class f8885p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f8886q;

    static {
        A a7 = new A("VOID", 0, Void.class, Void.class, null);
        f8875r = a7;
        Class cls = Integer.TYPE;
        A a8 = new A("INT", 1, cls, Integer.class, 0);
        f8876s = a8;
        A a9 = new A("LONG", 2, Long.TYPE, Long.class, 0L);
        f8877t = a9;
        A a10 = new A("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f8878u = a10;
        A a11 = new A("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f8879v = a11;
        A a12 = new A("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f8880w = a12;
        A a13 = new A("STRING", 6, String.class, String.class, "");
        f8881x = a13;
        A a14 = new A("BYTE_STRING", 7, AbstractC0760g.class, AbstractC0760g.class, AbstractC0760g.f8950p);
        f8882y = a14;
        A a15 = new A("ENUM", 8, cls, Integer.class, null);
        f8883z = a15;
        A a16 = new A("MESSAGE", 9, Object.class, Object.class, null);
        f8873A = a16;
        f8874B = new A[]{a7, a8, a9, a10, a11, a12, a13, a14, a15, a16};
    }

    public A(String str, int i7, Class cls, Class cls2, Object obj) {
        this.f8884o = cls;
        this.f8885p = cls2;
        this.f8886q = obj;
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f8874B.clone();
    }

    public Class c() {
        return this.f8885p;
    }
}
