package k2;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import ec.i;
import i2.k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import rb.h;

/* loaded from: classes.dex */
public final class f implements d0.a<WindowLayoutInfo>, Consumer<WindowLayoutInfo> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8848a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f8849b;

    /* renamed from: c, reason: collision with root package name */
    public k f8850c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f8851d;

    public f(Activity activity) {
        i.e(activity, "context");
        this.f8848a = activity;
        this.f8849b = new ReentrantLock();
        this.f8851d = new LinkedHashSet();
    }

    @Override // d0.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo windowLayoutInfo) {
        i.e(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.f8849b;
        reentrantLock.lock();
        try {
            this.f8850c = e.b(this.f8848a, windowLayoutInfo);
            Iterator it = this.f8851d.iterator();
            while (it.hasNext()) {
                ((d0.a) it.next()).accept(this.f8850c);
            }
            h hVar = h.f13851a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(x0.k kVar) {
        ReentrantLock reentrantLock = this.f8849b;
        reentrantLock.lock();
        try {
            k kVar2 = this.f8850c;
            if (kVar2 != null) {
                kVar.accept(kVar2);
            }
            this.f8851d.add(kVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean c() {
        return this.f8851d.isEmpty();
    }

    public final void d(d0.a<k> aVar) {
        i.e(aVar, "listener");
        ReentrantLock reentrantLock = this.f8849b;
        reentrantLock.lock();
        try {
            this.f8851d.remove(aVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
