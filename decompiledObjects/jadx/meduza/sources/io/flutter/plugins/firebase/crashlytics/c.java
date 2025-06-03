package io.flutter.plugins.firebase.crashlytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f8079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f8080c;

    public /* synthetic */ c(Map map, TaskCompletionSource taskCompletionSource, int i10) {
        this.f8078a = i10;
        this.f8079b = map;
        this.f8080c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8078a) {
            case 0:
                FlutterFirebaseCrashlyticsPlugin.lambda$log$5(this.f8079b, this.f8080c);
                break;
            default:
                FlutterFirebaseMessagingPlugin.lambda$unsubscribeFromTopic$5(this.f8079b, this.f8080c);
                break;
        }
    }
}
