package f2;

import j2.AbstractC1370a;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class n implements Executor {

    /* renamed from: o, reason: collision with root package name */
    public final Executor f14217o;

    public static class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final Runnable f14218o;

        public a(Runnable runnable) {
            this.f14218o = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f14218o.run();
            } catch (Exception e7) {
                AbstractC1370a.d("Executor", "Background execution failure.", e7);
            }
        }
    }

    public n(Executor executor) {
        this.f14217o = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f14217o.execute(new a(runnable));
    }
}
