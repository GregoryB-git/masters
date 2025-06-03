package io.flutter.plugins.firebase.auth;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidFirebaseAuth.Result f8038b;

    public /* synthetic */ j(GeneratedAndroidFirebaseAuth.Result result, int i10) {
        this.f8037a = i10;
        this.f8038b = result;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f8037a) {
            case 0:
                FlutterFirebaseAuthPlugin.lambda$checkActionCode$1(this.f8038b, task);
                break;
            default:
                FlutterFirebaseAuthPlugin.lambda$fetchSignInMethodsForEmail$10(this.f8038b, task);
                break;
        }
    }
}
