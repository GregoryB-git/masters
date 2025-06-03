package o4;

import java.util.Comparator;
import o4.p;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11852b;

    public /* synthetic */ o(Object obj, int i10) {
        this.f11851a = i10;
        this.f11852b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f11851a) {
            case 0:
                p.f fVar = (p.f) this.f11852b;
                return fVar.b(obj2) - fVar.b(obj);
            default:
                j9.g gVar = (j9.g) obj;
                j9.g gVar2 = (j9.g) obj2;
                int compare = ((Comparator) this.f11852b).compare(gVar, gVar2);
                return compare == 0 ? j9.g.f8680a.compare(gVar, gVar2) : compare;
        }
    }
}
