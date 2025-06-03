package z2;

import y2.C2270a;

/* renamed from: z2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2318v implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2319w f21755o;

    public RunnableC2318v(C2319w c2319w) {
        this.f21755o = c2319w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2270a.f fVar;
        C2270a.f fVar2;
        C2320x c2320x = this.f21755o.f21756a;
        fVar = c2320x.f21758c;
        fVar2 = c2320x.f21758c;
        fVar.f(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
