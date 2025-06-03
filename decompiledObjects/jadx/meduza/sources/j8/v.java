package j8;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class v implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final a f8646a;

    /* renamed from: b, reason: collision with root package name */
    public final r8.h f8647b;

    /* renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f8648c;

    /* renamed from: d, reason: collision with root package name */
    public final g8.a f8649d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f8650e = new AtomicBoolean(false);

    public interface a {
    }

    public v(l lVar, r8.f fVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, g8.a aVar) {
        this.f8646a = lVar;
        this.f8647b = fVar;
        this.f8648c = uncaughtExceptionHandler;
        this.f8649d = aVar;
    }

    public final boolean a(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (!this.f8649d.b()) {
            return true;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
        }
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        this.f8650e.set(true);
        try {
            try {
                if (a(thread, th)) {
                    a aVar = this.f8646a;
                    ((l) aVar).f8590a.g(this.f8647b, thread, th, false);
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", null);
                }
            } catch (Exception e10) {
                b.z zVar = b.z.f1660e;
                if (zVar.c(6)) {
                    Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e10);
                }
                if (this.f8648c != null) {
                    zVar.h("Completed exception processing. Invoking default exception handler.");
                } else {
                    zVar.h("Completed exception processing, but no default exception handler.");
                }
            }
        } finally {
            if (this.f8648c != null) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                }
                this.f8648c.uncaughtException(thread, th);
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", null);
                }
                System.exit(1);
            }
            this.f8650e.set(false);
        }
    }
}
