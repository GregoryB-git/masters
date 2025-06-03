package g9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public String f6004a;

    /* renamed from: b, reason: collision with root package name */
    public final List<e0> f6005b;

    /* renamed from: c, reason: collision with root package name */
    public final List<m> f6006c;

    /* renamed from: d, reason: collision with root package name */
    public final j9.o f6007d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6008e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final e f6009g;

    /* renamed from: h, reason: collision with root package name */
    public final e f6010h;

    public k0(j9.o oVar, String str, List<m> list, List<e0> list2, long j10, e eVar, e eVar2) {
        this.f6007d = oVar;
        this.f6008e = str;
        this.f6005b = list2;
        this.f6006c = list;
        this.f = j10;
        this.f6009g = eVar;
        this.f6010h = eVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r8 != 8) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0010 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<ka.d0, java.lang.Boolean> a(j9.k.c r11, g9.e r12) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.k0.a(j9.k$c, g9.e):android.util.Pair");
    }

    public final String b() {
        String str = this.f6004a;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f6007d.h());
        if (this.f6008e != null) {
            sb2.append("|cg:");
            sb2.append(this.f6008e);
        }
        sb2.append("|f:");
        Iterator<m> it = this.f6006c.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().a());
        }
        sb2.append("|ob:");
        Iterator<e0> it2 = this.f6005b.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            e0 next = it2.next();
            sb2.append(next.f5930b.h());
            sb2.append(q0.g.b(next.f5929a, 1) ? "asc" : "desc");
        }
        if (this.f != -1) {
            sb2.append("|l:");
            sb2.append(this.f);
        }
        if (this.f6009g != null) {
            sb2.append("|lb:");
            sb2.append(this.f6009g.f5927a ? "b:" : "a:");
            sb2.append(this.f6009g.b());
        }
        if (this.f6010h != null) {
            sb2.append("|ub:");
            sb2.append(this.f6010h.f5927a ? "a:" : "b:");
            sb2.append(this.f6010h.b());
        }
        String sb3 = sb2.toString();
        this.f6004a = sb3;
        return sb3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r8 != 8) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0010 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<ka.d0, java.lang.Boolean> c(j9.k.c r11, g9.e r12) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.k0.c(j9.k$c, g9.e):android.util.Pair");
    }

    public final ArrayList d(j9.l lVar) {
        ArrayList arrayList = new ArrayList();
        for (m mVar : this.f6006c) {
            if (mVar instanceof l) {
                l lVar2 = (l) mVar;
                if (lVar2.f6013c.equals(lVar)) {
                    arrayList.add(lVar2);
                }
            }
        }
        return arrayList;
    }

    public final boolean e() {
        return j9.i.l(this.f6007d) && this.f6008e == null && this.f6006c.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        k0 k0Var = (k0) obj;
        String str = this.f6008e;
        if (str == null ? k0Var.f6008e != null : !str.equals(k0Var.f6008e)) {
            return false;
        }
        if (this.f != k0Var.f || !this.f6005b.equals(k0Var.f6005b) || !this.f6006c.equals(k0Var.f6006c) || !this.f6007d.equals(k0Var.f6007d)) {
            return false;
        }
        e eVar = this.f6009g;
        if (eVar == null ? k0Var.f6009g != null : !eVar.equals(k0Var.f6009g)) {
            return false;
        }
        e eVar2 = this.f6010h;
        e eVar3 = k0Var.f6010h;
        return eVar2 != null ? eVar2.equals(eVar3) : eVar3 == null;
    }

    public final int hashCode() {
        int hashCode = this.f6005b.hashCode() * 31;
        String str = this.f6008e;
        int hashCode2 = (this.f6007d.hashCode() + ((this.f6006c.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j10 = this.f;
        int i10 = (hashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        e eVar = this.f6009g;
        int hashCode3 = (i10 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        e eVar2 = this.f6010h;
        return hashCode3 + (eVar2 != null ? eVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Query(");
        l10.append(this.f6007d.h());
        if (this.f6008e != null) {
            l10.append(" collectionGroup=");
            l10.append(this.f6008e);
        }
        if (!this.f6006c.isEmpty()) {
            l10.append(" where ");
            for (int i10 = 0; i10 < this.f6006c.size(); i10++) {
                if (i10 > 0) {
                    l10.append(" and ");
                }
                l10.append(this.f6006c.get(i10));
            }
        }
        if (!this.f6005b.isEmpty()) {
            l10.append(" order by ");
            for (int i11 = 0; i11 < this.f6005b.size(); i11++) {
                if (i11 > 0) {
                    l10.append(", ");
                }
                l10.append(this.f6005b.get(i11));
            }
        }
        l10.append(")");
        return l10.toString();
    }
}
