package okhttp3.internal;

/* loaded from: classes.dex */
public abstract class NamedRunnable implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final String f12371a;

    public NamedRunnable(String str, Object... objArr) {
        this.f12371a = Util.l(str, objArr);
    }

    public abstract void k();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f12371a);
        try {
            k();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
