package io.flutter.plugins.firebase.auth;

import b8.r;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import g9.n0;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8042a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8043b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8044c;

    public /* synthetic */ l(int i10, r rVar, GeneratedAndroidFirebaseAuth.Result result) {
        this.f8042a = i10;
        this.f8043b = rVar;
        this.f8044c = result;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f8042a) {
            case 0:
                FlutterFirebaseAuthUser.lambda$updateEmail$10((GeneratedAndroidFirebaseAuth.Result) this.f8044c, (r) this.f8043b, task);
                break;
            case 1:
                FlutterFirebaseAuthUser.lambda$updateProfile$17((r) this.f8043b, (GeneratedAndroidFirebaseAuth.Result) this.f8044c, task);
                break;
            case 2:
                FlutterFirebaseAuthUser.lambda$updatePhoneNumber$15((r) this.f8043b, (GeneratedAndroidFirebaseAuth.Result) this.f8044c, task);
                break;
            default:
                n0 n0Var = (n0) this.f8044c;
                Task task2 = (Task) this.f8043b;
                n0Var.getClass();
                if (!task.isSuccessful()) {
                    n0Var.a(task);
                    break;
                } else {
                    n0Var.f.setResult(task2.getResult());
                    break;
                }
        }
    }

    public /* synthetic */ l(int i10, Object obj, Object obj2) {
        this.f8042a = i10;
        this.f8044c = obj;
        this.f8043b = obj2;
    }
}
