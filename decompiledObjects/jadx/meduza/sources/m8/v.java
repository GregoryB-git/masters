package m8;

import m8.f0;

/* loaded from: classes.dex */
public final class v extends f0.e.d.AbstractC0159d {

    /* renamed from: a, reason: collision with root package name */
    public final String f10702a;

    public v(String str) {
        this.f10702a = str;
    }

    @Override // m8.f0.e.d.AbstractC0159d
    public final String a() {
        return this.f10702a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.d.AbstractC0159d) {
            return this.f10702a.equals(((f0.e.d.AbstractC0159d) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f10702a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return defpackage.g.f(defpackage.f.l("Log{content="), this.f10702a, "}");
    }
}
