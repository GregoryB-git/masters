package k2;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import ec.i;
import ec.t;
import f2.b;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import rb.h;
import x0.k;

/* loaded from: classes.dex */
public final class c implements j2.a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f8839a;

    /* renamed from: b, reason: collision with root package name */
    public final f2.b f8840b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f8841c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f8842d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f8843e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();

    public c(WindowLayoutComponent windowLayoutComponent, f2.b bVar) {
        this.f8839a = windowLayoutComponent;
        this.f8840b = bVar;
    }

    @Override // j2.a
    public final void a(Activity activity, m1.b bVar, k kVar) {
        h hVar;
        i.e(activity, "context");
        ReentrantLock reentrantLock = this.f8841c;
        reentrantLock.lock();
        try {
            f fVar = (f) this.f8842d.get(activity);
            if (fVar != null) {
                fVar.b(kVar);
                this.f8843e.put(kVar, activity);
                hVar = h.f13851a;
            } else {
                hVar = null;
            }
            if (hVar == null) {
                f fVar2 = new f(activity);
                this.f8842d.put(activity, fVar2);
                this.f8843e.put(kVar, activity);
                fVar2.b(kVar);
                this.f.put(fVar2, this.f8840b.a(this.f8839a, t.a(WindowLayoutInfo.class), activity, new b(fVar2)));
            }
            h hVar2 = h.f13851a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // j2.a
    public final void b(d0.a<i2.k> aVar) {
        i.e(aVar, "callback");
        ReentrantLock reentrantLock = this.f8841c;
        reentrantLock.lock();
        try {
            Context context = (Context) this.f8843e.get(aVar);
            if (context == null) {
                return;
            }
            f fVar = (f) this.f8842d.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(aVar);
            this.f8843e.remove(aVar);
            if (fVar.c()) {
                this.f8842d.remove(context);
                b.InterfaceC0079b interfaceC0079b = (b.InterfaceC0079b) this.f.remove(fVar);
                if (interfaceC0079b != null) {
                    interfaceC0079b.dispose();
                }
            }
            h hVar = h.f13851a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
