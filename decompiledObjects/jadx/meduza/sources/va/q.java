package va;

import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f16066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f16067b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f16068c;

    public q(s sVar, d dVar, MethodChannel.Result result) {
        this.f16068c = sVar;
        this.f16066a = dVar;
        this.f16067b = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (s.f) {
            s.a(this.f16068c, this.f16066a);
        }
        this.f16067b.success(null);
    }
}
