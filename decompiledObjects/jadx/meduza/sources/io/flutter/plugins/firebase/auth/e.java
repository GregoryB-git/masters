package io.flutter.plugins.firebase.auth;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8026a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidFirebaseAuth.Result f8027b;

    public /* synthetic */ e(GeneratedAndroidFirebaseAuth.Result result, int i10) {
        this.f8026a = i10;
        this.f8027b = result;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f8026a) {
            case 0:
                FlutterFirebaseAuthPlugin.lambda$signInWithProvider$9(this.f8027b, task);
                break;
            case 1:
                FlutterFirebaseAuthPlugin.lambda$signInWithEmailLink$8(this.f8027b, task);
                break;
            case 2:
                FlutterFirebaseAuthUser.lambda$reauthenticateWithProvider$5(this.f8027b, task);
                break;
            case 3:
                FlutterFirebaseAuthUser.lambda$linkWithCredential$2(this.f8027b, task);
                break;
            default:
                FlutterFirebaseTotpMultiFactor.lambda$generateSecret$0(this.f8027b, task);
                break;
        }
    }
}
