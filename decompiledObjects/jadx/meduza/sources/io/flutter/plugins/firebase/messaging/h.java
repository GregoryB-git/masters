package io.flutter.plugins.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f8132b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f8133c;

    public /* synthetic */ h(Map map, TaskCompletionSource taskCompletionSource, int i10) {
        this.f8131a = i10;
        this.f8132b = map;
        this.f8133c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8131a) {
            case 0:
                FlutterFirebaseMessagingPlugin.lambda$subscribeToTopic$4(this.f8132b, this.f8133c);
                break;
            default:
                FlutterFirebaseMessagingPlugin.lambda$setDeliveryMetricsExportToBigQuery$8(this.f8132b, this.f8133c);
                break;
        }
    }
}
