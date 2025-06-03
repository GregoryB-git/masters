package m8;

import m8.g0;

/* loaded from: classes.dex */
public final class b0 extends g0 {

    /* renamed from: a, reason: collision with root package name */
    public final g0.a f10536a;

    /* renamed from: b, reason: collision with root package name */
    public final g0.c f10537b;

    /* renamed from: c, reason: collision with root package name */
    public final g0.b f10538c;

    public b0(c0 c0Var, e0 e0Var, d0 d0Var) {
        this.f10536a = c0Var;
        this.f10537b = e0Var;
        this.f10538c = d0Var;
    }

    @Override // m8.g0
    public final g0.a a() {
        return this.f10536a;
    }

    @Override // m8.g0
    public final g0.b b() {
        return this.f10538c;
    }

    @Override // m8.g0
    public final g0.c c() {
        return this.f10537b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f10536a.equals(g0Var.a()) && this.f10537b.equals(g0Var.c()) && this.f10538c.equals(g0Var.b());
    }

    public final int hashCode() {
        return ((((this.f10536a.hashCode() ^ 1000003) * 1000003) ^ this.f10537b.hashCode()) * 1000003) ^ this.f10538c.hashCode();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("StaticSessionData{appData=");
        l10.append(this.f10536a);
        l10.append(", osData=");
        l10.append(this.f10537b);
        l10.append(", deviceData=");
        l10.append(this.f10538c);
        l10.append("}");
        return l10.toString();
    }
}
