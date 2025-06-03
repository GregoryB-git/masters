package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8071a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f8072b;

    public /* synthetic */ a(int i10, TaskCompletionSource taskCompletionSource) {
        this.f8071a = i10;
        this.f8072b = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8071a) {
            case 0:
                FlutterFirebasePluginRegistry.lambda$didReinitializeFirebaseCore$1(this.f8072b);
                break;
            case 1:
                this.f8072b.setResult(null);
                break;
            default:
                this.f8072b.setResult(null);
                break;
        }
    }
}
