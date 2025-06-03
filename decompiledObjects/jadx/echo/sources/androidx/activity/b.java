package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8321a;

    /* renamed from: b, reason: collision with root package name */
    public CopyOnWriteArrayList f8322b = new CopyOnWriteArrayList();

    public b(boolean z7) {
        this.f8321a = z7;
    }

    public void a(a aVar) {
        this.f8322b.add(aVar);
    }

    public abstract void b();

    public final boolean c() {
        return this.f8321a;
    }

    public final void d() {
        Iterator it = this.f8322b.iterator();
        while (it.hasNext()) {
            ((a) it.next()).cancel();
        }
    }

    public void e(a aVar) {
        this.f8322b.remove(aVar);
    }

    public final void f(boolean z7) {
        this.f8321a = z7;
    }
}
