package H3;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: H3.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0400w implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final a f2376a;

    /* renamed from: b, reason: collision with root package name */
    public final O3.i f2377b;

    /* renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f2378c;

    /* renamed from: d, reason: collision with root package name */
    public final E3.a f2379d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f2380e = new AtomicBoolean(false);

    /* renamed from: H3.w$a */
    public interface a {
        void a(O3.i iVar, Thread thread, Throwable th);
    }

    public C0400w(a aVar, O3.i iVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, E3.a aVar2) {
        this.f2376a = aVar;
        this.f2377b = iVar;
        this.f2378c = uncaughtExceptionHandler;
        this.f2379d = aVar2;
    }

    public boolean a() {
        return this.f2380e.get();
    }

    public final boolean b(Thread thread, Throwable th) {
        if (thread == null) {
            E3.f.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            E3.f.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f2379d.b()) {
            return true;
        }
        E3.f.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.f2380e.set(true);
        try {
            try {
                if (b(thread, th)) {
                    this.f2376a.a(this.f2377b, thread, th);
                } else {
                    E3.f.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e7) {
                E3.f.f().e("An error occurred in the uncaught exception handler", e7);
            }
            E3.f.f().b("Completed exception processing. Invoking default exception handler.");
            this.f2378c.uncaughtException(thread, th);
            this.f2380e.set(false);
        } catch (Throwable th2) {
            E3.f.f().b("Completed exception processing. Invoking default exception handler.");
            this.f2378c.uncaughtException(thread, th);
            this.f2380e.set(false);
            throw th2;
        }
    }
}
