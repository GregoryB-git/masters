package io.flutter.plugins.firebase.crashlytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f8074b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f8075c;

    public /* synthetic */ a(Map map, TaskCompletionSource taskCompletionSource, int i10) {
        this.f8073a = i10;
        this.f8074b = map;
        this.f8075c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8073a) {
            case 0:
                FlutterFirebaseCrashlyticsPlugin.lambda$setUserIdentifier$8(this.f8074b, this.f8075c);
                break;
            case 1:
                FlutterFirebaseCrashlyticsPlugin.lambda$setCustomKey$9(this.f8074b, this.f8075c);
                break;
            default:
                FlutterFirebaseMessagingPlugin.lambda$sendMessage$6(this.f8074b, this.f8075c);
                break;
        }
    }
}
