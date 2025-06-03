package k7;

/* loaded from: classes.dex */
public final class i extends e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f9113b;

    public i(n nVar) {
        this.f9113b = nVar;
    }

    @Override // k7.e
    public final void a() {
        synchronized (this.f9113b.f) {
            try {
                if (this.f9113b.f9128k.get() > 0 && this.f9113b.f9128k.decrementAndGet() > 0) {
                    this.f9113b.f9120b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                n nVar = this.f9113b;
                if (nVar.f9130m != null) {
                    nVar.f9120b.a("Unbind from service.", new Object[0]);
                    n nVar2 = this.f9113b;
                    nVar2.f9119a.unbindService(nVar2.f9129l);
                    n nVar3 = this.f9113b;
                    nVar3.f9124g = false;
                    nVar3.f9130m = null;
                    nVar3.f9129l = null;
                }
                this.f9113b.c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
