package io.flutter.plugins.firebase.auth;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidFirebaseAuth.Result f8023b;

    public /* synthetic */ c(GeneratedAndroidFirebaseAuth.Result result, int i10) {
        this.f8022a = i10;
        this.f8023b = result;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f8022a) {
            case 0:
                FlutterFirebaseAuthPlugin.lambda$createUserWithEmailAndPassword$3(this.f8023b, task);
                break;
            case 1:
                FlutterFirebaseAuthPlugin.lambda$signInWithEmailAndPassword$7(this.f8023b, task);
                break;
            case 2:
                FlutterFirebaseAuthPlugin.lambda$signInWithCredential$5(this.f8023b, task);
                break;
            case 3:
                FlutterFirebaseAuthPlugin.lambda$signInWithCustomToken$6(this.f8023b, task);
                break;
            default:
                FlutterFirebaseMultiFactor.lambda$getSession$2(this.f8023b, task);
                break;
        }
    }
}
