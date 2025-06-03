package io.flutter.plugins.firebase.auth;

import b8.r;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8039a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f8040b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidFirebaseAuth.Result f8041c;

    public /* synthetic */ k(r rVar, GeneratedAndroidFirebaseAuth.Result result) {
        this.f8040b = rVar;
        this.f8041c = result;
    }

    public /* synthetic */ k(GeneratedAndroidFirebaseAuth.Result result, r rVar) {
        this.f8041c = result;
        this.f8040b = rVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f8039a) {
            case 0:
                FlutterFirebaseAuthUser.lambda$reload$6(this.f8041c, this.f8040b, task);
                break;
            default:
                FlutterFirebaseAuthUser.lambda$updateEmail$11(this.f8040b, this.f8041c, task);
                break;
        }
    }
}
