package F2;

import android.os.Process;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final Runnable f1975o;

    public b(Runnable runnable, int i7) {
        this.f1975o = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f1975o.run();
    }
}
