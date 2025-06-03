package io.flutter.plugins.firebase.auth;

import b8.r;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8045a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidFirebaseAuth.Result f8046b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f8047c;

    public /* synthetic */ m(int i10, r rVar, GeneratedAndroidFirebaseAuth.Result result) {
        this.f8045a = i10;
        this.f8046b = result;
        this.f8047c = rVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f8045a) {
            case 0:
                FlutterFirebaseAuthUser.lambda$updatePassword$12(this.f8046b, this.f8047c, task);
                break;
            default:
                FlutterFirebaseAuthUser.lambda$updatePhoneNumber$14(this.f8046b, this.f8047c, task);
                break;
        }
    }
}
