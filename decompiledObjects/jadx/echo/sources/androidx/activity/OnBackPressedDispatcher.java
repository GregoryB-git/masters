package androidx.activity;

import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f8313a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f8314b = new ArrayDeque();

    public class LifecycleOnBackPressedCancellable implements f, androidx.activity.a {

        /* renamed from: o, reason: collision with root package name */
        public final d f8315o;

        /* renamed from: p, reason: collision with root package name */
        public final b f8316p;

        /* renamed from: q, reason: collision with root package name */
        public androidx.activity.a f8317q;

        public LifecycleOnBackPressedCancellable(d dVar, b bVar) {
            this.f8315o = dVar;
            this.f8316p = bVar;
            dVar.a(this);
        }

        @Override // androidx.lifecycle.f
        public void a(h hVar, d.b bVar) {
            if (bVar == d.b.ON_START) {
                this.f8317q = OnBackPressedDispatcher.this.b(this.f8316p);
                return;
            }
            if (bVar != d.b.ON_STOP) {
                if (bVar == d.b.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.a aVar = this.f8317q;
                if (aVar != null) {
                    aVar.cancel();
                }
            }
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f8315o.c(this);
            this.f8316p.e(this);
            androidx.activity.a aVar = this.f8317q;
            if (aVar != null) {
                aVar.cancel();
                this.f8317q = null;
            }
        }
    }

    public class a implements androidx.activity.a {

        /* renamed from: o, reason: collision with root package name */
        public final b f8319o;

        public a(b bVar) {
            this.f8319o = bVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f8314b.remove(this.f8319o);
            this.f8319o.e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f8313a = runnable;
    }

    public void a(h hVar, b bVar) {
        d g7 = hVar.g();
        if (g7.b() == d.c.DESTROYED) {
            return;
        }
        bVar.a(new LifecycleOnBackPressedCancellable(g7, bVar));
    }

    public androidx.activity.a b(b bVar) {
        this.f8314b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void c() {
        Iterator descendingIterator = this.f8314b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b bVar = (b) descendingIterator.next();
            if (bVar.c()) {
                bVar.b();
                return;
            }
        }
        Runnable runnable = this.f8313a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
