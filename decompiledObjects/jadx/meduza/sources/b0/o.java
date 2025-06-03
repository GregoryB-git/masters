package b0;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class o implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public String f1701a = "fonts-androidx";

    /* renamed from: b, reason: collision with root package name */
    public int f1702b = 10;

    public static class a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        public final int f1703a;

        public a(Runnable runnable, String str, int i10) {
            super(runnable, str);
            this.f1703a = i10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(this.f1703a);
            super.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new a(runnable, this.f1701a, this.f1702b);
    }
}
