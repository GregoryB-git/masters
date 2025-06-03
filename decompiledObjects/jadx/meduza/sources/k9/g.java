package k9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f9153a;

    /* renamed from: b, reason: collision with root package name */
    public final u7.m f9154b;

    /* renamed from: c, reason: collision with root package name */
    public final List<f> f9155c;

    /* renamed from: d, reason: collision with root package name */
    public final List<f> f9156d;

    public g(int i10, u7.m mVar, ArrayList arrayList, List list) {
        x6.b.Z("Cannot create an empty mutation batch", !list.isEmpty(), new Object[0]);
        this.f9153a = i10;
        this.f9154b = mVar;
        this.f9155c = arrayList;
        this.f9156d = list;
    }

    public final d a(j9.m mVar, d dVar) {
        for (int i10 = 0; i10 < this.f9155c.size(); i10++) {
            f fVar = this.f9155c.get(i10);
            if (fVar.f9150a.equals(mVar.f8693b)) {
                dVar = fVar.a(mVar, dVar, this.f9154b);
            }
        }
        for (int i11 = 0; i11 < this.f9156d.size(); i11++) {
            f fVar2 = this.f9156d.get(i11);
            if (fVar2.f9150a.equals(mVar.f8693b)) {
                dVar = fVar2.a(mVar, dVar, this.f9154b);
            }
        }
        return dVar;
    }

    public final HashSet b() {
        HashSet hashSet = new HashSet();
        Iterator<f> it = this.f9156d.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().f9150a);
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f9153a == gVar.f9153a && this.f9154b.equals(gVar.f9154b) && this.f9155c.equals(gVar.f9155c) && this.f9156d.equals(gVar.f9156d);
    }

    public final int hashCode() {
        return this.f9156d.hashCode() + ((this.f9155c.hashCode() + ((this.f9154b.hashCode() + (this.f9153a * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("MutationBatch(batchId=");
        l10.append(this.f9153a);
        l10.append(", localWriteTime=");
        l10.append(this.f9154b);
        l10.append(", baseMutations=");
        l10.append(this.f9155c);
        l10.append(", mutations=");
        l10.append(this.f9156d);
        l10.append(')');
        return l10.toString();
    }
}
