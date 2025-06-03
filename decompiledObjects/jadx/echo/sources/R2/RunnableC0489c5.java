package R2;

import android.content.ComponentName;

/* renamed from: R2.c5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0489c5 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ComponentName f5237o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC0475a5 f5238p;

    public RunnableC0489c5(ServiceConnectionC0475a5 serviceConnectionC0475a5, ComponentName componentName) {
        this.f5238p = serviceConnectionC0475a5;
        this.f5237o = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D4.I(this.f5238p.f5200c, this.f5237o);
    }
}
