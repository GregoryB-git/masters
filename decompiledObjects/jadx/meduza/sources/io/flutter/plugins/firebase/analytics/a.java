package io.flutter.plugins.firebase.analytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7999a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseAnalyticsPlugin f8000b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f8001c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f8002d;

    public /* synthetic */ a(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Map map, TaskCompletionSource taskCompletionSource, int i10) {
        this.f7999a = i10;
        this.f8000b = flutterFirebaseAnalyticsPlugin;
        this.f8001c = map;
        this.f8002d = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7999a) {
            case 0:
                this.f8000b.lambda$handleSetUserId$3(this.f8001c, this.f8002d);
                break;
            default:
                this.f8000b.lambda$setConsent$8(this.f8001c, this.f8002d);
                break;
        }
    }
}
