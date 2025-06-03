package io.flutter.plugins.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8123a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseMessagingPlugin f8124b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f8125c;

    public /* synthetic */ e(FlutterFirebaseMessagingPlugin flutterFirebaseMessagingPlugin, TaskCompletionSource taskCompletionSource, int i10) {
        this.f8123a = i10;
        this.f8124b = flutterFirebaseMessagingPlugin;
        this.f8125c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8123a) {
            case 0:
                this.f8124b.lambda$requestPermissions$12(this.f8125c);
                break;
            default:
                this.f8124b.lambda$getInitialMessage$9(this.f8125c);
                break;
        }
    }
}
