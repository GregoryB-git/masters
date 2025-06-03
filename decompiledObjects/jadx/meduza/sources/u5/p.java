package u5;

import android.os.ConditionVariable;

/* loaded from: classes.dex */
public final class p extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConditionVariable f15055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f15056b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f15056b = qVar;
        this.f15055a = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f15056b) {
            this.f15055a.open();
            q.l(this.f15056b);
            this.f15056b.f15059b.c();
        }
    }
}
