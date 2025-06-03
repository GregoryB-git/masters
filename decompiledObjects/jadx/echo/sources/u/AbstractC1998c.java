package u;

import b3.InterfaceFutureC0796e;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: u.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1998c {

    /* renamed from: u.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Object f19645a;

        /* renamed from: b, reason: collision with root package name */
        public d f19646b;

        /* renamed from: c, reason: collision with root package name */
        public u.d f19647c = u.d.G();

        /* renamed from: d, reason: collision with root package name */
        public boolean f19648d;

        public void a() {
            this.f19645a = null;
            this.f19646b = null;
            this.f19647c.z(null);
        }

        public boolean b(Object obj) {
            this.f19648d = true;
            d dVar = this.f19646b;
            boolean z7 = dVar != null && dVar.b(obj);
            if (z7) {
                d();
            }
            return z7;
        }

        public boolean c() {
            this.f19648d = true;
            d dVar = this.f19646b;
            boolean z7 = dVar != null && dVar.a(true);
            if (z7) {
                d();
            }
            return z7;
        }

        public final void d() {
            this.f19645a = null;
            this.f19646b = null;
            this.f19647c = null;
        }

        public boolean e(Throwable th) {
            this.f19648d = true;
            d dVar = this.f19646b;
            boolean z7 = dVar != null && dVar.d(th);
            if (z7) {
                d();
            }
            return z7;
        }

        public void finalize() {
            u.d dVar;
            d dVar2 = this.f19646b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.d(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f19645a));
            }
            if (this.f19648d || (dVar = this.f19647c) == null) {
                return;
            }
            dVar.z(null);
        }
    }

    /* renamed from: u.c$b */
    public static final class b extends Throwable {
        public b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: u.c$c, reason: collision with other inner class name */
    public interface InterfaceC0275c {
        Object a(a aVar);
    }

    /* renamed from: u.c$d */
    public static final class d implements InterfaceFutureC0796e {

        /* renamed from: o, reason: collision with root package name */
        public final WeakReference f19649o;

        /* renamed from: p, reason: collision with root package name */
        public final AbstractC1996a f19650p = new a();

        /* renamed from: u.c$d$a */
        public class a extends AbstractC1996a {
            public a() {
            }

            @Override // u.AbstractC1996a
            public String u() {
                a aVar = (a) d.this.f19649o.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f19645a + "]";
            }
        }

        public d(a aVar) {
            this.f19649o = new WeakReference(aVar);
        }

        public boolean a(boolean z7) {
            return this.f19650p.cancel(z7);
        }

        public boolean b(Object obj) {
            return this.f19650p.z(obj);
        }

        @Override // b3.InterfaceFutureC0796e
        public void c(Runnable runnable, Executor executor) {
            this.f19650p.c(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z7) {
            a aVar = (a) this.f19649o.get();
            boolean cancel = this.f19650p.cancel(z7);
            if (cancel && aVar != null) {
                aVar.a();
            }
            return cancel;
        }

        public boolean d(Throwable th) {
            return this.f19650p.C(th);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f19650p.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f19650p.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f19650p.isDone();
        }

        public String toString() {
            return this.f19650p.toString();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j7, TimeUnit timeUnit) {
            return this.f19650p.get(j7, timeUnit);
        }
    }

    public static InterfaceFutureC0796e a(InterfaceC0275c interfaceC0275c) {
        a aVar = new a();
        d dVar = new d(aVar);
        aVar.f19646b = dVar;
        aVar.f19645a = interfaceC0275c.getClass();
        try {
            Object a7 = interfaceC0275c.a(aVar);
            if (a7 != null) {
                aVar.f19645a = a7;
            }
        } catch (Exception e7) {
            dVar.d(e7);
        }
        return dVar;
    }
}
