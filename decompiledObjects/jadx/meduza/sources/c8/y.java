package c8;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzadr;
import com.google.android.gms.internal.p002firebaseauthapi.zzafa;
import com.google.android.gms.internal.p002firebaseauthapi.zzafm;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import com.google.android.gms.internal.p002firebaseauthapi.zzagt;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public static final y f2542b = new y();

    /* renamed from: a, reason: collision with root package name */
    public String f2543a;

    public static void b(FirebaseAuth firebaseAuth, Activity activity, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        Task task;
        if (activity == null) {
            taskCompletionSource.setException(new b8.n());
            return;
        }
        u7.f fVar = firebaseAuth.f3057a;
        fVar.a();
        f0.b(fVar.f15084a, firebaseAuth);
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        if (w.f2530c == null) {
            w.f2530c = new w();
        }
        w wVar = w.f2530c;
        if (wVar.f2531a) {
            z10 = false;
        } else {
            wVar.b(activity, new a0(wVar, activity, taskCompletionSource2));
            z10 = true;
            wVar.f2531a = true;
        }
        if (z10) {
            new zzafa(firebaseAuth, activity).zza();
            task = taskCompletionSource2.getTask();
        } else {
            task = Tasks.forException(zzadr.zza(new Status(17057, "reCAPTCHA flow already in progress", null, null)));
        }
        task.addOnSuccessListener(new b1.v(taskCompletionSource, 0)).addOnFailureListener(new g.s(taskCompletionSource));
    }

    public final Task<y0> a(final FirebaseAuth firebaseAuth, final String str, final Activity activity, final boolean z10, boolean z11, boolean z12, final RecaptchaAction recaptchaAction) {
        f fVar = firebaseAuth.f3062g;
        final u0 u0Var = u0.f2524c;
        if (zzafm.zza(firebaseAuth.f3057a) || fVar.f2442c) {
            return Tasks.forResult(new a1(null, null, null));
        }
        Log.i("y", "ForceRecaptchaV2Flow from phoneAuthOptions = " + z11 + ", ForceRecaptchav2Flow from firebaseSettings = " + fVar.f2443d);
        boolean z13 = z11 || fVar.f2443d;
        final TaskCompletionSource<y0> taskCompletionSource = new TaskCompletionSource<>();
        f0 f0Var = u0Var.f2525a;
        f0Var.getClass();
        Task<String> task = System.currentTimeMillis() - f0Var.f2447b < 3600000 ? f0Var.f2446a : null;
        if (task != null) {
            if (task.isSuccessful()) {
                return Tasks.forResult(new a1(task.getResult(), null, null));
            }
            Log.e("y", "Error in previous reCAPTCHAV2 flow: " + task.getException().getMessage());
            Log.e("y", "Continuing with application verification as normal");
        }
        if (z13 || z12) {
            c(firebaseAuth, str, activity, z10, z13, u0Var, taskCompletionSource);
        } else {
            if (firebaseAuth.f3067l == null) {
                firebaseAuth.f3067l = new m0(firebaseAuth.f3057a, firebaseAuth);
            }
            firebaseAuth.f3067l.a(firebaseAuth.f3066k, Boolean.FALSE).continueWithTask(new eb.y(0)).addOnCompleteListener(new OnCompleteListener() { // from class: c8.c
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    boolean z14;
                    String str2;
                    y yVar = y.this;
                    TaskCompletionSource<y0> taskCompletionSource2 = taskCompletionSource;
                    FirebaseAuth firebaseAuth2 = firebaseAuth;
                    RecaptchaAction recaptchaAction2 = recaptchaAction;
                    String str3 = str;
                    Activity activity2 = activity;
                    boolean z15 = z10;
                    u0 u0Var2 = u0Var;
                    if (!task2.isSuccessful()) {
                        Log.e("y", "Failed to initialize reCAPTCHA config: " + task2.getException().getMessage());
                    }
                    if (firebaseAuth2.p() != null) {
                        m0 p10 = firebaseAuth2.p();
                        synchronized (p10.f2485a) {
                            zzagt zzagtVar = p10.f2487c;
                            z14 = zzagtVar != null && zzagtVar.zzc("PHONE_PROVIDER");
                        }
                        if (z14) {
                            m0 p11 = firebaseAuth2.p();
                            synchronized (firebaseAuth2.f3065j) {
                                str2 = firebaseAuth2.f3066k;
                            }
                            p11.b(str2, Boolean.FALSE, recaptchaAction2).addOnSuccessListener(new d2.h0(taskCompletionSource2)).addOnFailureListener(new p0(yVar, firebaseAuth2, str3, activity2, z15, u0Var2, taskCompletionSource2));
                            return;
                        }
                    }
                    yVar.c(firebaseAuth2, str3, activity2, z15, false, u0Var2, taskCompletionSource2);
                }
            });
        }
        return taskCompletionSource.getTask();
    }

    public final void c(final FirebaseAuth firebaseAuth, String str, final Activity activity, boolean z10, boolean z11, final u0 u0Var, final TaskCompletionSource<y0> taskCompletionSource) {
        if (!z10 || z11) {
            b(firebaseAuth, activity, taskCompletionSource);
            return;
        }
        u7.f fVar = firebaseAuth.f3057a;
        fVar.a();
        (!TextUtils.isEmpty(this.f2543a) ? Tasks.forResult(new zzags(this.f2543a)) : firebaseAuth.f3061e.zza()).continueWithTask(firebaseAuth.f3080z, new x0(this, str, IntegrityManagerFactory.create(fVar.f15084a))).addOnCompleteListener(new OnCompleteListener(taskCompletionSource, firebaseAuth, u0Var, activity) { // from class: c8.w0

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ TaskCompletionSource f2534b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ FirebaseAuth f2535c;

            /* renamed from: d, reason: collision with root package name */
            public /* synthetic */ Activity f2536d;

            {
                this.f2536d = activity;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                y yVar = y.this;
                TaskCompletionSource taskCompletionSource2 = this.f2534b;
                FirebaseAuth firebaseAuth2 = this.f2535c;
                Activity activity2 = this.f2536d;
                if ((!task.isSuccessful() || task.getResult() == null || TextUtils.isEmpty(((IntegrityTokenResponse) task.getResult()).token())) ? false : true) {
                    taskCompletionSource2.setResult(new a1(null, ((IntegrityTokenResponse) task.getResult()).token(), null));
                    return;
                }
                Log.e("y", "Play Integrity Token fetch failed, falling back to Recaptcha" + (task.getException() == null ? "" : task.getException().getMessage()));
                yVar.getClass();
                y.b(firebaseAuth2, activity2, taskCompletionSource2);
            }
        });
    }
}
