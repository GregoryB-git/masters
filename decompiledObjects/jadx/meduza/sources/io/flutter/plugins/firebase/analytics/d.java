package io.flutter.plugins.firebase.analytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8010a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseAnalyticsPlugin f8011b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f8012c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f8013d;

    public /* synthetic */ d(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Map map, TaskCompletionSource taskCompletionSource, int i10) {
        this.f8010a = i10;
        this.f8011b = flutterFirebaseAnalyticsPlugin;
        this.f8012c = map;
        this.f8013d = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8010a) {
            case 0:
                this.f8011b.lambda$handleSetUserProperty$6(this.f8012c, this.f8013d);
                break;
            default:
                this.f8011b.lambda$handleLogEvent$2(this.f8012c, this.f8013d);
                break;
        }
    }
}
