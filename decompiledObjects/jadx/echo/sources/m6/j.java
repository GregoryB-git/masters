package m6;

import a6.InterfaceC0753a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: o, reason: collision with root package name */
    public static final j f17827o = new j("PUBLIC", 0);

    /* renamed from: p, reason: collision with root package name */
    public static final j f17828p = new j("PROTECTED", 1);

    /* renamed from: q, reason: collision with root package name */
    public static final j f17829q = new j("INTERNAL", 2);

    /* renamed from: r, reason: collision with root package name */
    public static final j f17830r = new j("PRIVATE", 3);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ j[] f17831s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0753a f17832t;

    static {
        j[] c7 = c();
        f17831s = c7;
        f17832t = a6.b.a(c7);
    }

    public j(String str, int i7) {
    }

    public static final /* synthetic */ j[] c() {
        return new j[]{f17827o, f17828p, f17829q, f17830r};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f17831s.clone();
    }
}
