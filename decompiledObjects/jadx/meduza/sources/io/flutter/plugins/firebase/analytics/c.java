package io.flutter.plugins.firebase.analytics;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseAnalyticsPlugin f8008b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f8009c;

    public /* synthetic */ c(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, TaskCompletionSource taskCompletionSource, int i10) {
        this.f8007a = i10;
        this.f8008b = flutterFirebaseAnalyticsPlugin;
        this.f8009c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8007a) {
            case 0:
                this.f8008b.lambda$handleGetAppInstanceId$10(this.f8009c);
                break;
            default:
                this.f8008b.lambda$getPluginConstantsForFirebaseApp$11(this.f8009c);
                break;
        }
    }
}
