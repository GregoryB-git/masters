package io.flutter.plugins.firebase.auth;

import android.content.Intent;
import b8.r;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8048a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8049b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8050c;

    public /* synthetic */ n(int i10, Object obj, Object obj2) {
        this.f8048a = i10;
        this.f8050c = obj;
        this.f8049b = obj2;
    }

    public /* synthetic */ n(GeneratedAndroidFirebaseAuth.Result result, r rVar) {
        this.f8048a = 1;
        this.f8049b = result;
        this.f8050c = rVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f8048a) {
            case 0:
                FlutterFirebaseAuthUser.lambda$updatePassword$13((r) this.f8050c, (GeneratedAndroidFirebaseAuth.Result) this.f8049b, task);
                break;
            case 1:
                FlutterFirebaseAuthUser.lambda$updateProfile$16((GeneratedAndroidFirebaseAuth.Result) this.f8049b, (r) this.f8050c, task);
                break;
            default:
                ((aa.h) this.f8050c).lambda$onStartCommand$1((Intent) this.f8049b, task);
                break;
        }
    }
}
