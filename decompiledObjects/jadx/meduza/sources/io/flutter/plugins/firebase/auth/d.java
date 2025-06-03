package io.flutter.plugins.firebase.auth;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidFirebaseAuth.VoidResult f8025b;

    public /* synthetic */ d(GeneratedAndroidFirebaseAuth.VoidResult voidResult, int i10) {
        this.f8024a = i10;
        this.f8025b = voidResult;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f8024a) {
            case 0:
                FlutterFirebaseAuthPlugin.lambda$sendSignInLinkToEmail$13(this.f8025b, task);
                break;
            case 1:
                FlutterFirebaseAuthPlugin.lambda$applyActionCode$0(this.f8025b, task);
                break;
            default:
                FlutterFirebaseMultiFactor.lambda$enrollPhone$0(this.f8025b, task);
                break;
        }
    }
}
