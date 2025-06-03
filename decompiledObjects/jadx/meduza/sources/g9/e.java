package g9;

import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5927a;

    /* renamed from: b, reason: collision with root package name */
    public final List<ka.d0> f5928b;

    public e(List<ka.d0> list, boolean z10) {
        this.f5928b = list;
        this.f5927a = z10;
    }

    public final int a(List<e0> list, j9.g gVar) {
        int c10;
        x6.b.Z("Bound has more components than query's orderBy", this.f5928b.size() <= list.size(), new Object[0]);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f5928b.size(); i11++) {
            e0 e0Var = list.get(i11);
            ka.d0 d0Var = this.f5928b.get(i11);
            if (e0Var.f5930b.equals(j9.l.f8691b)) {
                x6.b.Z("Bound has a non-key value where the key path is being used %s", j9.s.k(d0Var), d0Var);
                c10 = j9.i.h(d0Var.Z()).compareTo(gVar.getKey());
            } else {
                ka.d0 g10 = gVar.g(e0Var.f5930b);
                x6.b.Z("Field should exist since document matched the orderBy already.", g10 != null, new Object[0]);
                c10 = j9.s.c(d0Var, g10);
            }
            if (q0.g.b(e0Var.f5929a, 2)) {
                c10 *= -1;
            }
            i10 = c10;
            if (i10 != 0) {
                break;
            }
        }
        return i10;
    }

    public final String b() {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (ka.d0 d0Var : this.f5928b) {
            if (!z10) {
                sb2.append(",");
            }
            z10 = false;
            sb2.append(j9.s.a(d0Var));
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f5927a == eVar.f5927a && this.f5928b.equals(eVar.f5928b);
    }

    public final int hashCode() {
        return this.f5928b.hashCode() + ((this.f5927a ? 1 : 0) * 31);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Bound(inclusive=");
        l10.append(this.f5927a);
        l10.append(", position=");
        for (int i10 = 0; i10 < this.f5928b.size(); i10++) {
            if (i10 > 0) {
                l10.append(" and ");
            }
            l10.append(j9.s.a(this.f5928b.get(i10)));
        }
        l10.append(")");
        return l10.toString();
    }
}
