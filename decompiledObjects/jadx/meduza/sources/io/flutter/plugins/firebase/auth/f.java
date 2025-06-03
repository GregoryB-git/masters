package io.flutter.plugins.firebase.auth;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8028a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u7.f f8029b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f8030c;

    public /* synthetic */ f(u7.f fVar, TaskCompletionSource taskCompletionSource, int i10) {
        this.f8028a = i10;
        this.f8029b = fVar;
        this.f8030c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8028a) {
            case 0:
                FlutterFirebaseAuthPlugin.lambda$getPluginConstantsForFirebaseApp$16(this.f8029b, this.f8030c);
                break;
            default:
                FlutterFirebasePluginRegistry.lambda$getPluginConstantsForFirebaseApp$0(this.f8029b, this.f8030c);
                break;
        }
    }
}
