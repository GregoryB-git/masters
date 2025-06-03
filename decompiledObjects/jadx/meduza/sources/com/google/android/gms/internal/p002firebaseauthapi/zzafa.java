package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.RecaptchaActivity;
import u7.f;

/* loaded from: classes.dex */
public final class zzafa {
    private final FirebaseAuth zza;
    private final Activity zzb;

    public zzafa(FirebaseAuth firebaseAuth, Activity activity) {
        this.zza = firebaseAuth;
        this.zzb = activity;
    }

    public final void zza() {
        String str;
        String str2;
        Intent intent = new Intent("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent.setClass(this.zzb, RecaptchaActivity.class);
        intent.setPackage(this.zzb.getPackageName());
        f fVar = this.zza.f3057a;
        fVar.a();
        intent.putExtra("com.google.firebase.auth.KEY_API_KEY", fVar.f15086c.f15096a);
        FirebaseAuth firebaseAuth = this.zza;
        synchronized (firebaseAuth.f3065j) {
            str = firebaseAuth.f3066k;
        }
        if (!TextUtils.isEmpty(str)) {
            FirebaseAuth firebaseAuth2 = this.zza;
            synchronized (firebaseAuth2.f3065j) {
                str2 = firebaseAuth2.f3066k;
            }
            intent.putExtra("com.google.firebase.auth.KEY_TENANT_ID", str2);
        }
        intent.putExtra("com.google.firebase.auth.internal.CLIENT_VERSION", zzaed.zza().zzb());
        f fVar2 = this.zza.f3057a;
        fVar2.a();
        intent.putExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME", fVar2.f15085b);
        intent.putExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", this.zza.B);
        this.zzb.startActivity(intent);
    }
}
