package H3;

import android.os.Process;

/* renamed from: H3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC0382d implements Runnable {
    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
