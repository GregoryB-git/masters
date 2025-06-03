// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H3;

import E3.f;
import java.util.concurrent.atomic.AtomicBoolean;
import E3.a;
import O3.i;

public class w implements UncaughtExceptionHandler
{
    public final a a;
    public final i b;
    public final UncaughtExceptionHandler c;
    public final E3.a d;
    public final AtomicBoolean e;
    
    public w(final a a, final i b, final UncaughtExceptionHandler c, final E3.a d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = new AtomicBoolean(false);
        this.d = d;
    }
    
    public boolean a() {
        return this.e.get();
    }
    
    public final boolean b(final Thread thread, final Throwable t) {
        if (thread == null) {
            f.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (t == null) {
            f.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (this.d.b()) {
            f.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        }
        return true;
    }
    
    @Override
    public void uncaughtException(final Thread thread, final Throwable t) {
        this.e.set(true);
        while (true) {
            try {
                try {
                    if (this.b(thread, t)) {
                        this.a.a(this.b, thread, t);
                    }
                    else {
                        f.f().b("Uncaught exception will not be recorded by Crashlytics.");
                    }
                    f.f().b("Completed exception processing. Invoking default exception handler.");
                    this.c.uncaughtException(thread, t);
                    this.e.set(false);
                    return;
                    f.f().b("Completed exception processing. Invoking default exception handler.");
                    this.c.uncaughtException(thread, t);
                    this.e.set(false);
                    throw;
                    final Exception ex;
                    f.f().e("An error occurred in the uncaught exception handler", ex);
                }
                finally {}
            }
            catch (Exception ex2) {}
            final Exception ex2;
            final Exception ex = ex2;
            continue;
        }
    }
    
    public interface a
    {
        void a(final i p0, final Thread p1, final Throwable p2);
    }
}
