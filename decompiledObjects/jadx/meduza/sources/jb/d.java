package jb;

import xc.i;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final i f8739d;

    /* renamed from: e, reason: collision with root package name */
    public static final i f8740e;
    public static final i f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f8741g;

    /* renamed from: h, reason: collision with root package name */
    public static final i f8742h;

    /* renamed from: a, reason: collision with root package name */
    public final i f8743a;

    /* renamed from: b, reason: collision with root package name */
    public final i f8744b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8745c;

    static {
        i iVar = i.f17259d;
        f8739d = i.a.a(":status");
        f8740e = i.a.a(":method");
        f = i.a.a(":path");
        f8741g = i.a.a(":scheme");
        f8742h = i.a.a(":authority");
        i.a.a(":host");
        i.a.a(":version");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2) {
        this(i.a.a(str), i.a.a(str2));
        i iVar = i.f17259d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f8743a.equals(dVar.f8743a) && this.f8744b.equals(dVar.f8744b);
    }

    public final int hashCode() {
        return this.f8744b.hashCode() + ((this.f8743a.hashCode() + 527) * 31);
    }

    public final String toString() {
        return String.format("%s: %s", this.f8743a.t(), this.f8744b.t());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(i iVar, String str) {
        this(iVar, i.a.a(str));
        i iVar2 = i.f17259d;
    }

    public d(i iVar, i iVar2) {
        this.f8743a = iVar;
        this.f8744b = iVar2;
        this.f8745c = iVar2.i() + iVar.i() + 32;
    }
}
