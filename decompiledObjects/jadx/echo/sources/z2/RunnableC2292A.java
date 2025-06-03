package z2;

import android.util.Log;
import java.util.Map;
import x2.C2188b;
import y2.C2270a;

/* renamed from: z2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2292A implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2188b f21641o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C2293B f21642p;

    public RunnableC2292A(C2293B c2293b, C2188b c2188b) {
        this.f21642p = c2293b;
        this.f21641o = c2188b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        C2299b c2299b;
        C2270a.f fVar;
        C2270a.f fVar2;
        C2270a.f fVar3;
        C2270a.f fVar4;
        C2293B c2293b = this.f21642p;
        map = c2293b.f21648f.f21734z;
        c2299b = c2293b.f21644b;
        C2320x c2320x = (C2320x) map.get(c2299b);
        if (c2320x == null) {
            return;
        }
        if (!this.f21641o.i()) {
            c2320x.G(this.f21641o, null);
            return;
        }
        this.f21642p.f21647e = true;
        fVar = this.f21642p.f21643a;
        if (fVar.m()) {
            this.f21642p.h();
            return;
        }
        try {
            C2293B c2293b2 = this.f21642p;
            fVar3 = c2293b2.f21643a;
            fVar4 = c2293b2.f21643a;
            fVar3.o(null, fVar4.e());
        } catch (SecurityException e7) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e7);
            fVar2 = this.f21642p.f21643a;
            fVar2.f("Failed to get service from broker.");
            c2320x.G(new C2188b(10), null);
        }
    }
}
