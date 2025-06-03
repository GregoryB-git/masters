package z4;

import z4.w;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w.a f17731b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f17732c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f17733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f17734e;

    public /* synthetic */ u(w.a aVar, w wVar, n nVar, q qVar, int i10) {
        this.f17730a = i10;
        this.f17731b = aVar;
        this.f17732c = wVar;
        this.f17733d = nVar;
        this.f17734e = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17730a) {
            case 0:
                w.a aVar = this.f17731b;
                this.f17732c.h0(aVar.f17740a, aVar.f17741b, this.f17733d, this.f17734e);
                break;
            default:
                w.a aVar2 = this.f17731b;
                this.f17732c.M(aVar2.f17740a, aVar2.f17741b, this.f17733d, this.f17734e);
                break;
        }
    }
}
