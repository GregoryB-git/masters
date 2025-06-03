package io.flutter.plugins.firebase.auth;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8035a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidFirebaseAuth.Result f8036b;

    public /* synthetic */ i(GeneratedAndroidFirebaseAuth.Result result, int i10) {
        this.f8035a = i10;
        this.f8036b = result;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f8035a) {
            case 0:
                FlutterFirebaseAuthPlugin.lambda$verifyPasswordResetCode$14(this.f8036b, task);
                break;
            case 1:
                FlutterFirebaseAuthPlugin.lambda$signInAnonymously$4(this.f8036b, task);
                break;
            case 2:
                FlutterFirebaseAuthUser.lambda$reauthenticateWithCredential$4(this.f8036b, task);
                break;
            case 3:
                FlutterFirebaseAuthUser.lambda$linkWithProvider$3(this.f8036b, task);
                break;
            case 4:
                FlutterFirebaseAuthUser.lambda$unlink$9(this.f8036b, task);
                break;
            default:
                FlutterFirebaseMultiFactor.lambda$resolveSignIn$4(this.f8036b, task);
                break;
        }
    }
}
