package F2;

import A2.AbstractC0328n;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f1973a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadFactory f1974b = Executors.defaultThreadFactory();

    public a(String str) {
        AbstractC0328n.j(str, "Name must not be null");
        this.f1973a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f1974b.newThread(new b(runnable, 0));
        newThread.setName(this.f1973a);
        return newThread;
    }
}
