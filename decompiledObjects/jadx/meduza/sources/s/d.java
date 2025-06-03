package s;

import defpackage.f;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import s.a;

/* loaded from: classes.dex */
public final class d<T> implements s7.e<T> {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference<b<T>> f13937a;

    /* renamed from: b, reason: collision with root package name */
    public final a f13938b = new a();

    public class a extends s.a<T> {
        public a() {
        }

        @Override // s.a
        public final String n() {
            b<T> bVar = d.this.f13937a.get();
            if (bVar == null) {
                return "Completer object has been garbage collected, future will fail soon";
            }
            StringBuilder l10 = f.l("tag=[");
            l10.append(bVar.f13933a);
            l10.append("]");
            return l10.toString();
        }
    }

    public d(b<T> bVar) {
        this.f13937a = new WeakReference<>(bVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        b<T> bVar = this.f13937a.get();
        boolean cancel = this.f13938b.cancel(z10);
        if (cancel && bVar != null) {
            bVar.f13933a = null;
            bVar.f13934b = null;
            bVar.f13935c.p(null);
        }
        return cancel;
    }

    @Override // s7.e
    public final void f(Runnable runnable, Executor executor) {
        this.f13938b.f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final T get() {
        return this.f13938b.get();
    }

    @Override // java.util.concurrent.Future
    public final T get(long j10, TimeUnit timeUnit) {
        return this.f13938b.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f13938b.f13913a instanceof a.b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f13938b.isDone();
    }

    public final String toString() {
        return this.f13938b.toString();
    }
}
