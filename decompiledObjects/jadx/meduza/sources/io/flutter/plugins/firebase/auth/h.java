package io.flutter.plugins.firebase.auth;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidFirebaseAuth.VoidResult f8034b;

    public /* synthetic */ h(GeneratedAndroidFirebaseAuth.VoidResult voidResult, int i10) {
        this.f8033a = i10;
        this.f8034b = voidResult;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f8033a) {
            case 0:
                FlutterFirebaseAuthPlugin.lambda$sendPasswordResetEmail$12(this.f8034b, task);
                break;
            case 1:
                FlutterFirebaseAuthUser.lambda$sendEmailVerification$8(this.f8034b, task);
                break;
            case 2:
                FlutterFirebaseAuthUser.lambda$delete$0(this.f8034b, task);
                break;
            case 3:
                FlutterFirebaseAuthUser.lambda$verifyBeforeUpdateEmail$18(this.f8034b, task);
                break;
            default:
                FlutterFirebaseMultiFactor.lambda$enrollTotp$1(this.f8034b, task);
                break;
        }
    }
}
