package R2;

import A2.AbstractC0328n;
import java.lang.Thread;

/* loaded from: classes.dex */
public final class J2 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final String f4756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G2 f4757b;

    public J2(G2 g22, String str) {
        this.f4757b = g22;
        AbstractC0328n.i(str);
        this.f4756a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f4757b.j().G().b(this.f4756a, th);
    }
}
