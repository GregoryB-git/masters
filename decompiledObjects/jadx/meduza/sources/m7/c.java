package m7;

/* loaded from: classes.dex */
public final class c extends w {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10343o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f10344p;

    public /* synthetic */ c(Object obj, int i10) {
        this.f10343o = i10;
        this.f10344p = obj;
    }

    @Override // m7.w
    public final void b() {
        switch (this.f10343o) {
            case 0:
                e eVar = ((d) this.f10344p).f10345a;
                eVar.f10348b.b("unlinkToDeath", new Object[0]);
                eVar.f10359n.asBinder().unlinkToDeath(eVar.f10356k, 0);
                e eVar2 = ((d) this.f10344p).f10345a;
                eVar2.f10359n = null;
                eVar2.f10352g = false;
                return;
            default:
                synchronized (((e) this.f10344p).f) {
                    if (((e) this.f10344p).f10357l.get() <= 0 || ((e) this.f10344p).f10357l.decrementAndGet() <= 0) {
                        e eVar3 = (e) this.f10344p;
                        if (eVar3.f10359n != null) {
                            eVar3.f10348b.b("Unbind from service.", new Object[0]);
                            e eVar4 = (e) this.f10344p;
                            eVar4.f10347a.unbindService(eVar4.f10358m);
                            Object obj = this.f10344p;
                            ((e) obj).f10352g = false;
                            ((e) obj).f10359n = null;
                            ((e) obj).f10358m = null;
                        }
                        ((e) this.f10344p).e();
                    } else {
                        ((e) this.f10344p).f10348b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                    }
                }
                return;
        }
    }
}
