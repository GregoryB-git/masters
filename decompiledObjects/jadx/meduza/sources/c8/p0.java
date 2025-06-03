package c8;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
public final class p0 implements OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f2500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2501b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f2502c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f2503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f2504e = false;
    public final /* synthetic */ u0 f;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f2505o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y f2506p;

    public p0(y yVar, FirebaseAuth firebaseAuth, String str, Activity activity, boolean z10, u0 u0Var, TaskCompletionSource taskCompletionSource) {
        this.f2500a = firebaseAuth;
        this.f2501b = str;
        this.f2502c = activity;
        this.f2503d = z10;
        this.f = u0Var;
        this.f2505o = taskCompletionSource;
        this.f2506p = yVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        y yVar = y.f2542b;
        Log.e("y", "Failed to get reCAPTCHA enterprise token: " + exc.getMessage() + "\n\n Using fallback methods.");
        if (this.f2500a.p().c()) {
            this.f2506p.c(this.f2500a, this.f2501b, this.f2502c, this.f2503d, this.f2504e, this.f, this.f2505o);
        } else {
            this.f2505o.setResult(new a1(null, null, null));
        }
    }
}
