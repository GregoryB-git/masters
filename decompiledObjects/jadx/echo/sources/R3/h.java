package R3;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class h implements V3.j {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f5646a = new Handler(Looper.getMainLooper());

    @Override // V3.j
    public void b(Runnable runnable) {
        this.f5646a.post(runnable);
    }

    @Override // V3.j
    public void a() {
    }
}
