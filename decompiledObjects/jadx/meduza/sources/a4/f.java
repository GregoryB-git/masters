package a4;

import a4.g;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g.a f178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f179c;

    public /* synthetic */ f(g.a aVar, g gVar, int i10) {
        this.f177a = i10;
        this.f178b = aVar;
        this.f179c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f177a) {
            case 0:
                g.a aVar = this.f178b;
                this.f179c.H(aVar.f180a, aVar.f181b);
                break;
            default:
                g.a aVar2 = this.f178b;
                this.f179c.j0(aVar2.f180a, aVar2.f181b);
                break;
        }
    }
}
