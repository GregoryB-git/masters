package e6;

import a6.InterfaceC0753a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: o, reason: collision with root package name */
    public static final f f14052o = new f("TOP_DOWN", 0);

    /* renamed from: p, reason: collision with root package name */
    public static final f f14053p = new f("BOTTOM_UP", 1);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ f[] f14054q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0753a f14055r;

    static {
        f[] c7 = c();
        f14054q = c7;
        f14055r = a6.b.a(c7);
    }

    public f(String str, int i7) {
    }

    public static final /* synthetic */ f[] c() {
        return new f[]{f14052o, f14053p};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f14054q.clone();
    }
}
