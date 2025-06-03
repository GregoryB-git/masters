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
/* loaded from: classes.dex */
public class K5 {

    /* renamed from: A, reason: collision with root package name */
    public static final K5 f10455A;

    /* renamed from: B, reason: collision with root package name */
    public static final K5 f10456B;

    /* renamed from: C, reason: collision with root package name */
    public static final K5 f10457C;

    /* renamed from: D, reason: collision with root package name */
    public static final K5 f10458D;

    /* renamed from: E, reason: collision with root package name */
    public static final K5 f10459E;

    /* renamed from: F, reason: collision with root package name */
    public static final K5 f10460F;

    /* renamed from: G, reason: collision with root package name */
    public static final K5 f10461G;

    /* renamed from: H, reason: collision with root package name */
    public static final K5 f10462H;

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ K5[] f10463I;

    /* renamed from: q, reason: collision with root package name */
    public static final K5 f10464q;

    /* renamed from: r, reason: collision with root package name */
    public static final K5 f10465r;

    /* renamed from: s, reason: collision with root package name */
    public static final K5 f10466s;

    /* renamed from: t, reason: collision with root package name */
    public static final K5 f10467t;

    /* renamed from: u, reason: collision with root package name */
    public static final K5 f10468u;

    /* renamed from: v, reason: collision with root package name */
    public static final K5 f10469v;

    /* renamed from: w, reason: collision with root package name */
    public static final K5 f10470w;

    /* renamed from: x, reason: collision with root package name */
    public static final K5 f10471x;

    /* renamed from: y, reason: collision with root package name */
    public static final K5 f10472y;

    /* renamed from: z, reason: collision with root package name */
    public static final K5 f10473z;

    /* renamed from: o, reason: collision with root package name */
    public final U5 f10474o;

    /* renamed from: p, reason: collision with root package name */
    public final int f10475p;

    static {
        K5 k52 = new K5("DOUBLE", 0, U5.DOUBLE, 1);
        f10464q = k52;
        K5 k53 = new K5("FLOAT", 1, U5.FLOAT, 5);
        f10465r = k53;
        U5 u52 = U5.LONG;
        K5 k54 = new K5("INT64", 2, u52, 0);
        f10466s = k54;
        K5 k55 = new K5("UINT64", 3, u52, 0);
        f10467t = k55;
        U5 u53 = U5.INT;
        K5 k56 = new K5("INT32", 4, u53, 0);
        f10468u = k56;
        K5 k57 = new K5("FIXED64", 5, u52, 1);
        f10469v = k57;
        K5 k58 = new K5("FIXED32", 6, u53, 5);
        f10470w = k58;
        K5 k59 = new K5("BOOL", 7, U5.BOOLEAN, 0);
        f10471x = k59;
        int i7 = 2;
        J5 j52 = new J5("STRING", U5.STRING);
        f10472y = j52;
        U5 u54 = U5.MESSAGE;
        L5 l52 = new L5("GROUP", u54);
        f10473z = l52;
        N5 n52 = new N5("MESSAGE", u54);
        f10455A = n52;
        P5 p52 = new P5("BYTES", U5.BYTE_STRING);
        f10456B = p52;
        K5 k510 = new K5("UINT32", 12, u53, 0);
        f10457C = k510;
        K5 k511 = new K5("ENUM", 13, U5.ENUM, 0);
        f10458D = k511;
        K5 k512 = new K5("SFIXED32", 14, u53, 5);
        f10459E = k512;
        K5 k513 = new K5("SFIXED64", 15, u52, 1);
        f10460F = k513;
        K5 k514 = new K5("SINT32", 16, u53, 0);
        f10461G = k514;
        K5 k515 = new K5("SINT64", 17, u52, 0);
        f10462H = k515;
        f10463I = new K5[]{k52, k53, k54, k55, k56, k57, k58, k59, j52, l52, n52, p52, k510, k511, k512, k513, k514, k515};
    }

    public K5(String str, int i7, U5 u52, int i8) {
        this.f10474o = u52;
        this.f10475p = i8;
    }

    public static K5[] values() {
        return (K5[]) f10463I.clone();
    }

    public final U5 c() {
        return this.f10474o;
    }
}
