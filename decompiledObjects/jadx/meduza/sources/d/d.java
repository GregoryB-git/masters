package d;

import b1.k;
import b1.m;
import b1.o;
import d.g;

/* loaded from: classes.dex */
public final class d implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3307a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f3308b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e.a f3309c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f3310d;

    public d(g gVar, String str, b bVar, e.a aVar) {
        this.f3310d = gVar;
        this.f3307a = str;
        this.f3308b = bVar;
        this.f3309c = aVar;
    }

    @Override // b1.m
    public final void a(o oVar, k.a aVar) {
        if (!k.a.ON_START.equals(aVar)) {
            if (k.a.ON_STOP.equals(aVar)) {
                this.f3310d.f3318e.remove(this.f3307a);
                return;
            } else {
                if (k.a.ON_DESTROY.equals(aVar)) {
                    this.f3310d.f(this.f3307a);
                    return;
                }
                return;
            }
        }
        this.f3310d.f3318e.put(this.f3307a, new g.a(this.f3309c, this.f3308b));
        if (this.f3310d.f.containsKey(this.f3307a)) {
            Object obj = this.f3310d.f.get(this.f3307a);
            this.f3310d.f.remove(this.f3307a);
            this.f3308b.a(obj);
        }
        a aVar2 = (a) this.f3310d.f3319g.getParcelable(this.f3307a);
        if (aVar2 != null) {
            this.f3310d.f3319g.remove(this.f3307a);
            this.f3308b.a(this.f3309c.c(aVar2.f3305a, aVar2.f3306b));
        }
    }
}
