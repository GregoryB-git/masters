package io.flutter.plugins.firebase.auth;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.googlesignin.GoogleSignInPlugin;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8052b;

    public /* synthetic */ o(Object obj, int i10) {
        this.f8051a = i10;
        this.f8052b = obj;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f8051a) {
            case 0:
                FlutterFirebaseAuthUser.lambda$verifyBeforeUpdateEmail$19((GeneratedAndroidFirebaseAuth.VoidResult) this.f8052b, task);
                break;
            default:
                ((GoogleSignInPlugin.Delegate) this.f8052b).lambda$disconnect$1(task);
                break;
        }
    }
}
