package k2;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import ec.i;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import rb.h;
import x0.k;

/* loaded from: classes.dex */
public final class d implements j2.a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f8844a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f8845b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f8846c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f8847d = new LinkedHashMap();

    public d(WindowLayoutComponent windowLayoutComponent) {
        this.f8844a = windowLayoutComponent;
    }

    @Override // j2.a
    public final void a(Activity activity, m1.b bVar, k kVar) {
        h hVar;
        i.e(activity, "context");
        ReentrantLock reentrantLock = this.f8845b;
        reentrantLock.lock();
        try {
            f fVar = (f) this.f8846c.get(activity);
            if (fVar != null) {
                fVar.b(kVar);
                this.f8847d.put(kVar, activity);
                hVar = h.f13851a;
            } else {
                hVar = null;
            }
            if (hVar == null) {
                f fVar2 = new f(activity);
                this.f8846c.put(activity, fVar2);
                this.f8847d.put(kVar, activity);
                fVar2.b(kVar);
                this.f8844a.addWindowLayoutInfoListener(activity, fVar2);
            }
            h hVar2 = h.f13851a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // j2.a
    public final void b(d0.a<i2.k> aVar) {
        i.e(aVar, "callback");
        ReentrantLock reentrantLock = this.f8845b;
        reentrantLock.lock();
        try {
            Context context = (Context) this.f8847d.get(aVar);
            if (context == null) {
                return;
            }
            f fVar = (f) this.f8846c.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(aVar);
            this.f8847d.remove(aVar);
            if (fVar.c()) {
                this.f8846c.remove(context);
                this.f8844a.removeWindowLayoutInfoListener(fVar);
            }
            h hVar = h.f13851a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
