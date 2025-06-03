package io.flutter.plugins.googlesignin;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin;
import io.flutter.plugins.googlesignin.BackgroundTaskRunner;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8139b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8140c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f8138a = i10;
        this.f8139b = obj;
        this.f8140c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8138a) {
            case 0:
                ((BackgroundTaskRunner.Callback) this.f8139b).run((s7.e) this.f8140c);
                break;
            default:
                FlutterFirebaseMessagingPlugin.lambda$getPluginConstantsForFirebaseApp$15((u7.f) this.f8139b, (TaskCompletionSource) this.f8140c);
                break;
        }
    }
}
