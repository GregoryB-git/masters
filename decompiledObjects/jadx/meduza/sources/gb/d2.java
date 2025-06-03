package gb;

import gb.r1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1.m f6293a;

    public d2(r1.m mVar) {
        this.f6293a = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        if (this.f6293a.f6765b.get() == r1.f6708k0) {
            this.f6293a.f6765b.set(null);
        }
        Collection<r1.m.e<?, ?>> collection = r1.this.C;
        if (collection != null) {
            Iterator<r1.m.e<?, ?>> it = collection.iterator();
            while (it.hasNext()) {
                it.next().a("Channel is forcefully shutdown", null);
            }
        }
        r1.p pVar = r1.this.G;
        eb.e1 e1Var = r1.f6704g0;
        pVar.a(e1Var);
        synchronized (pVar.f6794a) {
            arrayList = new ArrayList(pVar.f6795b);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((s) it2.next()).n(e1Var);
        }
        r1.this.F.h(e1Var);
    }
}
