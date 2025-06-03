package m8;

import m8.f0;

/* loaded from: classes.dex */
public final class a0 extends f0.e.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f10512a;

    public a0(String str) {
        this.f10512a = str;
    }

    @Override // m8.f0.e.f
    public final String a() {
        return this.f10512a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.f) {
            return this.f10512a.equals(((f0.e.f) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f10512a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return defpackage.g.f(defpackage.f.l("User{identifier="), this.f10512a, "}");
    }
}
