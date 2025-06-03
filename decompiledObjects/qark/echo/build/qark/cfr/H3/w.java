/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Thread$UncaughtExceptionHandler
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package H3;

import E3.f;
import O3.i;
import java.util.concurrent.atomic.AtomicBoolean;

public class w
implements Thread.UncaughtExceptionHandler {
    public final a a;
    public final i b;
    public final Thread.UncaughtExceptionHandler c;
    public final E3.a d;
    public final AtomicBoolean e;

    public w(a a8, i i8, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, E3.a a9) {
        this.a = a8;
        this.b = i8;
        this.c = uncaughtExceptionHandler;
        this.e = new AtomicBoolean(false);
        this.d = a9;
    }

    public boolean a() {
        return this.e.get();
    }

    public final boolean b(Thread thread, Throwable throwable) {
        if (thread == null) {
            f.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (throwable == null) {
            f.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (this.d.b()) {
            f.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void uncaughtException(Thread var1_1, Throwable var2_2) {
        block7 : {
            this.e.set(true);
            try {
                if (this.b(var1_1, var2_2)) {
                    this.a.a(this.b, var1_1, var2_2);
                    break block7;
                }
                f.f().b("Uncaught exception will not be recorded by Crashlytics.");
            }
            catch (Exception var3_3) {
                ** continue;
            }
        }
lbl8: // 2 sources:
        do {
            f.f().b("Completed exception processing. Invoking default exception handler.");
            this.c.uncaughtException(var1_1, var2_2);
            this.e.set(false);
            return;
            break;
        } while (true);
lbl13: // 1 sources:
        do {
            try {
                f.f().e("An error occurred in the uncaught exception handler", (Throwable)var3_3);
                ** continue;
            }
            catch (Throwable var3_4) {}
            f.f().b("Completed exception processing. Invoking default exception handler.");
            this.c.uncaughtException(var1_1, var2_2);
            this.e.set(false);
            throw var3_4;
            break;
        } while (true);
    }

    public static interface a {
        public void a(i var1, Thread var2, Throwable var3);
    }

}

