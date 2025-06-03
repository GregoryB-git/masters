package b;

import b.j;
import d.g;
import e.a;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1596a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.C0064a f1597b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j.a f1598c;

    public h(j.a aVar, int i10, a.C0064a c0064a) {
        this.f1598c = aVar;
        this.f1596a = i10;
        this.f1597b = c0064a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        d.b<O> bVar;
        j.a aVar = this.f1598c;
        int i10 = this.f1596a;
        T t = this.f1597b.f3746a;
        String str = (String) aVar.f3314a.get(Integer.valueOf(i10));
        if (str == null) {
            return;
        }
        g.a aVar2 = (g.a) aVar.f3318e.get(str);
        if (aVar2 == null || (bVar = aVar2.f3320a) == 0) {
            aVar.f3319g.remove(str);
            aVar.f.put(str, t);
        } else if (aVar.f3317d.remove(str)) {
            bVar.a(t);
        }
    }
}
