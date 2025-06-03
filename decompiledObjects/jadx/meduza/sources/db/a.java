package db;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3741a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f3742b;

    public /* synthetic */ a(int i10, TaskCompletionSource taskCompletionSource) {
        this.f3741a = i10;
        this.f3742b = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3741a) {
            case 0:
                this.f3742b.setResult(null);
                break;
            default:
                FlutterFirebaseMessagingPlugin.lambda$deleteToken$2(this.f3742b);
                break;
        }
    }
}
