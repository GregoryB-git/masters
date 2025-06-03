package g9;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f6076a;

    /* renamed from: b, reason: collision with root package name */
    public final j9.j f6077b;

    /* renamed from: c, reason: collision with root package name */
    public final j9.j f6078c;

    /* renamed from: d, reason: collision with root package name */
    public final List<i> f6079d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6080e;
    public final t8.e<j9.i> f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6081g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6082h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6083i;

    public s0(f0 f0Var, j9.j jVar, j9.j jVar2, ArrayList arrayList, boolean z10, t8.e eVar, boolean z11, boolean z12, boolean z13) {
        this.f6076a = f0Var;
        this.f6077b = jVar;
        this.f6078c = jVar2;
        this.f6079d = arrayList;
        this.f6080e = z10;
        this.f = eVar;
        this.f6081g = z11;
        this.f6082h = z12;
        this.f6083i = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (this.f6080e == s0Var.f6080e && this.f6081g == s0Var.f6081g && this.f6082h == s0Var.f6082h && this.f6076a.equals(s0Var.f6076a) && this.f.equals(s0Var.f) && this.f6077b.equals(s0Var.f6077b) && this.f6078c.equals(s0Var.f6078c) && this.f6083i == s0Var.f6083i) {
            return this.f6079d.equals(s0Var.f6079d);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f.hashCode() + ((this.f6079d.hashCode() + ((this.f6078c.hashCode() + ((this.f6077b.hashCode() + (this.f6076a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + (this.f6080e ? 1 : 0)) * 31) + (this.f6081g ? 1 : 0)) * 31) + (this.f6082h ? 1 : 0)) * 31) + (this.f6083i ? 1 : 0);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("ViewSnapshot(");
        l10.append(this.f6076a);
        l10.append(", ");
        l10.append(this.f6077b);
        l10.append(", ");
        l10.append(this.f6078c);
        l10.append(", ");
        l10.append(this.f6079d);
        l10.append(", isFromCache=");
        l10.append(this.f6080e);
        l10.append(", mutatedKeys=");
        l10.append(this.f.size());
        l10.append(", didSyncStateChange=");
        l10.append(this.f6081g);
        l10.append(", excludesMetadataChanges=");
        l10.append(this.f6082h);
        l10.append(", hasCachedResults=");
        l10.append(this.f6083i);
        l10.append(")");
        return l10.toString();
    }
}
