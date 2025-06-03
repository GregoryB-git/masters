package e8;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final k f4843a;

    /* renamed from: b, reason: collision with root package name */
    public static final Handler f4844b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ k[] f4845c;

    static {
        k kVar = new k();
        f4843a = kVar;
        f4845c = new k[]{kVar};
        f4844b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f4845c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f4844b.post(runnable);
    }
}
