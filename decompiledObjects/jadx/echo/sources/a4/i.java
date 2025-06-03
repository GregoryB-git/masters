package a4;

import java.util.Map;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final V3.k f8120a;

    /* renamed from: b, reason: collision with root package name */
    public final h f8121b;

    public i(V3.k kVar, h hVar) {
        this.f8120a = kVar;
        this.f8121b = hVar;
    }

    public static i a(V3.k kVar) {
        return new i(kVar, h.f8107i);
    }

    public static i b(V3.k kVar, Map map) {
        return new i(kVar, h.c(map));
    }

    public d4.h c() {
        return this.f8121b.d();
    }

    public h d() {
        return this.f8121b;
    }

    public V3.k e() {
        return this.f8120a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f8120a.equals(iVar.f8120a) && this.f8121b.equals(iVar.f8121b);
    }

    public boolean f() {
        return this.f8121b.p();
    }

    public boolean g() {
        return this.f8121b.u();
    }

    public int hashCode() {
        return (this.f8120a.hashCode() * 31) + this.f8121b.hashCode();
    }

    public String toString() {
        return this.f8120a + ":" + this.f8121b;
    }
}
