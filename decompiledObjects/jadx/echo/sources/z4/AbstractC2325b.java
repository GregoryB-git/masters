package z4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: z4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2325b {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC2324a f21772a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile InterfaceC2324a f21773b;

    /* renamed from: z4.b$b, reason: collision with other inner class name */
    public static class C0309b implements InterfaceC2324a {
        public C0309b() {
        }

        @Override // z4.InterfaceC2324a
        public ExecutorService a(ThreadFactory threadFactory, EnumC2326c enumC2326c) {
            return b(1, threadFactory, enumC2326c);
        }

        public ExecutorService b(int i7, ThreadFactory threadFactory, EnumC2326c enumC2326c) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i7, i7, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0309b c0309b = new C0309b();
        f21772a = c0309b;
        f21773b = c0309b;
    }

    public static InterfaceC2324a a() {
        return f21773b;
    }
}
