package m8;

import java.util.List;
import m8.f0;

/* loaded from: classes.dex */
public final class n extends f0.e.d.a.b {

    /* renamed from: a, reason: collision with root package name */
    public final List<f0.e.d.a.b.AbstractC0155d> f10652a;

    /* renamed from: b, reason: collision with root package name */
    public final f0.e.d.a.b.AbstractC0154b f10653b;

    /* renamed from: c, reason: collision with root package name */
    public final f0.a f10654c;

    /* renamed from: d, reason: collision with root package name */
    public final f0.e.d.a.b.c f10655d;

    /* renamed from: e, reason: collision with root package name */
    public final List<f0.e.d.a.b.AbstractC0153a> f10656e;

    public n() {
        throw null;
    }

    public n(List list, f0.e.d.a.b.AbstractC0154b abstractC0154b, f0.a aVar, f0.e.d.a.b.c cVar, List list2) {
        this.f10652a = list;
        this.f10653b = abstractC0154b;
        this.f10654c = aVar;
        this.f10655d = cVar;
        this.f10656e = list2;
    }

    @Override // m8.f0.e.d.a.b
    public final f0.a a() {
        return this.f10654c;
    }

    @Override // m8.f0.e.d.a.b
    public final List<f0.e.d.a.b.AbstractC0153a> b() {
        return this.f10656e;
    }

    @Override // m8.f0.e.d.a.b
    public final f0.e.d.a.b.AbstractC0154b c() {
        return this.f10653b;
    }

    @Override // m8.f0.e.d.a.b
    public final f0.e.d.a.b.c d() {
        return this.f10655d;
    }

    @Override // m8.f0.e.d.a.b
    public final List<f0.e.d.a.b.AbstractC0155d> e() {
        return this.f10652a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b)) {
            return false;
        }
        f0.e.d.a.b bVar = (f0.e.d.a.b) obj;
        List<f0.e.d.a.b.AbstractC0155d> list = this.f10652a;
        if (list != null ? list.equals(bVar.e()) : bVar.e() == null) {
            f0.e.d.a.b.AbstractC0154b abstractC0154b = this.f10653b;
            if (abstractC0154b != null ? abstractC0154b.equals(bVar.c()) : bVar.c() == null) {
                f0.a aVar = this.f10654c;
                if (aVar != null ? aVar.equals(bVar.a()) : bVar.a() == null) {
                    if (this.f10655d.equals(bVar.d()) && this.f10656e.equals(bVar.b())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        List<f0.e.d.a.b.AbstractC0155d> list = this.f10652a;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        f0.e.d.a.b.AbstractC0154b abstractC0154b = this.f10653b;
        int hashCode2 = (hashCode ^ (abstractC0154b == null ? 0 : abstractC0154b.hashCode())) * 1000003;
        f0.a aVar = this.f10654c;
        return ((((hashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.f10655d.hashCode()) * 1000003) ^ this.f10656e.hashCode();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Execution{threads=");
        l10.append(this.f10652a);
        l10.append(", exception=");
        l10.append(this.f10653b);
        l10.append(", appExitInfo=");
        l10.append(this.f10654c);
        l10.append(", signal=");
        l10.append(this.f10655d);
        l10.append(", binaries=");
        l10.append(this.f10656e);
        l10.append("}");
        return l10.toString();
    }
}
