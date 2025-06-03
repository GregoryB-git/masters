package io.flutter.plugins.firebase.crashlytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8076a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f8077b;

    public /* synthetic */ b(int i10, TaskCompletionSource taskCompletionSource) {
        this.f8076a = i10;
        this.f8077b = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8076a) {
            case 0:
                FlutterFirebaseCrashlyticsPlugin.lambda$deleteUnsentReports$2(this.f8077b);
                break;
            case 1:
                FlutterFirebaseCrashlyticsPlugin.lambda$sendUnsentReports$6(this.f8077b);
                break;
            case 2:
                FlutterFirebaseFirestorePlugin.lambda$getPluginConstantsForFirebaseApp$0(this.f8077b);
                break;
            default:
                this.f8077b.setResult(null);
                break;
        }
    }
}
