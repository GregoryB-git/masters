package Y5;

import a6.InterfaceC0753a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: o, reason: collision with root package name */
    public static final a f7608o = new a("COROUTINE_SUSPENDED", 0);

    /* renamed from: p, reason: collision with root package name */
    public static final a f7609p = new a("UNDECIDED", 1);

    /* renamed from: q, reason: collision with root package name */
    public static final a f7610q = new a("RESUMED", 2);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ a[] f7611r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0753a f7612s;

    static {
        a[] c7 = c();
        f7611r = c7;
        f7612s = a6.b.a(c7);
    }

    public a(String str, int i7) {
    }

    public static final /* synthetic */ a[] c() {
        return new a[]{f7608o, f7609p, f7610q};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f7611r.clone();
    }
}
