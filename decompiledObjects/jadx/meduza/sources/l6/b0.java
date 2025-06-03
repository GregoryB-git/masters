package l6;

import k6.a;

/* loaded from: classes.dex */
public final class b0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f9637a;

    public b0(c0 c0Var) {
        this.f9637a = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.f fVar = this.f9637a.f9638a.f9658b;
        fVar.disconnect(fVar.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
