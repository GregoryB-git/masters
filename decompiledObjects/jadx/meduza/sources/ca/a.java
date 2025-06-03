package ca;

import defpackage.g;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    public final String f2550a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2551b;

    public a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f2550a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f2551b = str2;
    }

    @Override // ca.d
    public final String a() {
        return this.f2550a;
    }

    @Override // ca.d
    public final String b() {
        return this.f2551b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f2550a.equals(dVar.a()) && this.f2551b.equals(dVar.b());
    }

    public final int hashCode() {
        return ((this.f2550a.hashCode() ^ 1000003) * 1000003) ^ this.f2551b.hashCode();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("LibraryVersion{libraryName=");
        l10.append(this.f2550a);
        l10.append(", version=");
        return g.f(l10, this.f2551b, "}");
    }
}
