package w5;

import android.os.Handler;
import android.os.Looper;
import w5.C2107c;

/* renamed from: w5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2111g implements C2107c.d {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f20447a = T5.a.a(Looper.getMainLooper());

    @Override // w5.C2107c.d
    public void a(Runnable runnable) {
        this.f20447a.post(runnable);
    }
}
