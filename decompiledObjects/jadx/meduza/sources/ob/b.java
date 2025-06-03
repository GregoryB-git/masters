package ob;

import p2.m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f12136a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f12137b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b[] f12138c;

    static {
        b bVar = new b("OUTLINE", 0);
        f12136a = bVar;
        b bVar2 = new b("SMART", 1);
        f12137b = bVar2;
        b[] bVarArr = {bVar, bVar2};
        f12138c = bVarArr;
        m0.D(bVarArr);
    }

    public b(String str, int i10) {
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f12138c.clone();
    }
}
