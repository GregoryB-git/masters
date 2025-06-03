package vb;

import p2.m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f16085a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f16086b;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f16085a = aVar;
        a[] aVarArr = {aVar, new a("UNDECIDED", 1), new a("RESUMED", 2)};
        f16086b = aVarArr;
        m0.D(aVarArr);
    }

    public a(String str, int i10) {
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f16086b.clone();
    }
}
