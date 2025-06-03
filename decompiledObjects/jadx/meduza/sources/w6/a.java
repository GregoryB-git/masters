package w6;

import i6.q;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f16433a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadFactory f16434b = Executors.defaultThreadFactory();

    public a(String str) {
        this.f16433a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f16434b.newThread(new q(runnable));
        newThread.setName(this.f16433a);
        return newThread;
    }
}
