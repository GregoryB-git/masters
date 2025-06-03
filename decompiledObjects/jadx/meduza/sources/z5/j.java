package z5;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import c8.j0;
import c8.m0;
import com.google.android.gms.internal.auth.zze;
import com.google.android.gms.internal.p002firebaseauthapi.zzadr;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.a;
import g.s;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements k, Continuation, SuccessContinuation {

    /* renamed from: a, reason: collision with root package name */
    public String f17809a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17810b;

    /* renamed from: c, reason: collision with root package name */
    public Object f17811c;

    /* renamed from: d, reason: collision with root package name */
    public Object f17812d;

    public /* synthetic */ j(RecaptchaAction recaptchaAction, FirebaseAuth firebaseAuth, String str, s sVar) {
        this.f17810b = recaptchaAction;
        this.f17811c = firebaseAuth;
        this.f17809a = str;
        this.f17812d = sVar;
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, String str) {
        this.f17810b = obj;
        this.f17809a = str;
        this.f17811c = obj2;
        this.f17812d = obj3;
    }

    public /* synthetic */ j(String str, String str2, StackTraceElement[] stackTraceElementArr, j jVar) {
        this.f17809a = str;
        this.f17810b = str2;
        this.f17811c = stackTraceElementArr;
        this.f17812d = jVar;
    }

    @Override // z5.k
    public final Object a(IBinder iBinder) {
        Account account = (Account) this.f17810b;
        String str = this.f17809a;
        Bundle bundle = (Bundle) this.f17811c;
        Context context = (Context) this.f17812d;
        Bundle zze = zze.zzb(iBinder).zze(account, str, bundle);
        if (zze != null) {
            return l.a(context, zze);
        }
        throw new IOException("Service call returned null");
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        String str;
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) this.f17810b;
        String str2 = this.f17809a;
        String str3 = (String) this.f17811c;
        String str4 = (String) obj;
        com.google.firebase.iid.a aVar = FirebaseInstanceId.f3203j;
        String g10 = firebaseInstanceId.g();
        r9.h hVar = firebaseInstanceId.f3208c;
        synchronized (hVar) {
            if (hVar.f13824b == null) {
                hVar.c();
            }
            str = hVar.f13824b;
        }
        synchronized (aVar) {
            String a10 = a.C0054a.a(System.currentTimeMillis(), str4, str);
            if (a10 != null) {
                SharedPreferences.Editor edit = aVar.f3214a.edit();
                edit.putString(com.google.firebase.iid.a.b(g10, str2, str3), a10);
                edit.commit();
            }
        }
        return Tasks.forResult(new r9.g(str4));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        RecaptchaAction recaptchaAction = (RecaptchaAction) this.f17810b;
        FirebaseAuth firebaseAuth = (FirebaseAuth) this.f17811c;
        String str = this.f17809a;
        Continuation<String, Task<TContinuationResult>> continuation = (Continuation) this.f17812d;
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exception = task.getException();
        m6.j.i(exception);
        if (zzadr.zzd(exception)) {
            if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action " + String.valueOf(recaptchaAction));
            }
            if (firebaseAuth.p() == null) {
                m0 m0Var = new m0(firebaseAuth.f3057a, firebaseAuth);
                synchronized (firebaseAuth) {
                    firebaseAuth.f3067l = m0Var;
                }
            }
            m0 p10 = firebaseAuth.p();
            return p10.b(str, Boolean.FALSE, recaptchaAction).continueWithTask(continuation).continueWithTask(new j0(continuation, recaptchaAction, p10, str));
        }
        Log.e("RecaptchaCallWrapper", "Initial task failed for action " + String.valueOf(recaptchaAction) + "with exception - " + exception.getMessage());
        return Tasks.forException(exception);
    }
}
