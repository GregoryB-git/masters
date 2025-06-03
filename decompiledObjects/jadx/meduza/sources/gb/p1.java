package gb;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class p1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f6626b = Logger.getLogger(p1.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f6627a;

    public p1(Runnable runnable) {
        this.f6627a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f6627a.run();
        } catch (Throwable th) {
            Logger logger = f6626b;
            Level level = Level.SEVERE;
            StringBuilder l10 = defpackage.f.l("Exception while executing runnable ");
            l10.append(this.f6627a);
            logger.log(level, l10.toString(), th);
            Object obj = n7.u.f11319a;
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new AssertionError(th);
            }
            throw ((Error) th);
        }
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("LogExceptionRunnable(");
        l10.append(this.f6627a);
        l10.append(")");
        return l10.toString();
    }
}
