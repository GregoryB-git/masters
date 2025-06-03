package ad;

import p2.m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f387a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f388b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f389c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f390d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f391e;
    public static final a f;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ a[] f392o;

    static {
        a aVar = new a("UNDEFINED", 0);
        a aVar2 = new a("ENQUEUED", 1);
        f387a = aVar2;
        a aVar3 = new a("RUNNING", 2);
        f388b = aVar3;
        a aVar4 = new a("COMPLETE", 3);
        f389c = aVar4;
        a aVar5 = new a("FAILED", 4);
        f390d = aVar5;
        a aVar6 = new a("CANCELED", 5);
        f391e = aVar6;
        a aVar7 = new a("PAUSED", 6);
        f = aVar7;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        f392o = aVarArr;
        m0.D(aVarArr);
    }

    public a(String str, int i10) {
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f392o.clone();
    }
}
