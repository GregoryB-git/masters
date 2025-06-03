package i9;

import java.util.Iterator;
import t8.e;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f7716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7717b;

    public /* synthetic */ k(n nVar, int i10) {
        this.f7716a = nVar;
        this.f7717b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f7716a;
        int i10 = this.f7717b;
        m1 m1Var = nVar.f7752k.get(i10);
        x6.b.Z("Tried to release nonexistent target: %s", m1Var != null, Integer.valueOf(i10));
        Iterator it = nVar.f7749h.d(i10).iterator();
        while (true) {
            e.a aVar = (e.a) it;
            if (!aVar.hasNext()) {
                nVar.f7743a.p().o(m1Var);
                nVar.f7752k.remove(i10);
                nVar.f7753l.remove(m1Var.f7734a);
                return;
            }
            nVar.f7743a.p().c((j9.i) aVar.next());
        }
    }
}
