package m8;

import java.util.List;
import m8.f0;

/* loaded from: classes.dex */
public final class r extends f0.e.d.a.b.AbstractC0155d {

    /* renamed from: a, reason: collision with root package name */
    public final String f10669a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10670b;

    /* renamed from: c, reason: collision with root package name */
    public final List<f0.e.d.a.b.AbstractC0155d.AbstractC0156a> f10671c;

    public r() {
        throw null;
    }

    public r(String str, int i10, List list) {
        this.f10669a = str;
        this.f10670b = i10;
        this.f10671c = list;
    }

    @Override // m8.f0.e.d.a.b.AbstractC0155d
    public final List<f0.e.d.a.b.AbstractC0155d.AbstractC0156a> a() {
        return this.f10671c;
    }

    @Override // m8.f0.e.d.a.b.AbstractC0155d
    public final int b() {
        return this.f10670b;
    }

    @Override // m8.f0.e.d.a.b.AbstractC0155d
    public final String c() {
        return this.f10669a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b.AbstractC0155d)) {
            return false;
        }
        f0.e.d.a.b.AbstractC0155d abstractC0155d = (f0.e.d.a.b.AbstractC0155d) obj;
        return this.f10669a.equals(abstractC0155d.c()) && this.f10670b == abstractC0155d.b() && this.f10671c.equals(abstractC0155d.a());
    }

    public final int hashCode() {
        return ((((this.f10669a.hashCode() ^ 1000003) * 1000003) ^ this.f10670b) * 1000003) ^ this.f10671c.hashCode();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Thread{name=");
        l10.append(this.f10669a);
        l10.append(", importance=");
        l10.append(this.f10670b);
        l10.append(", frames=");
        l10.append(this.f10671c);
        l10.append("}");
        return l10.toString();
    }
}
