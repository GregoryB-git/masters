package e7;

import java.lang.Thread;

/* loaded from: classes.dex */
public final class g2 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final String f4212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f4213b;

    public g2(e2 e2Var, String str) {
        this.f4213b = e2Var;
        this.f4212a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f4213b.zzj().f4060o.c(this.f4212a, th);
    }
}
