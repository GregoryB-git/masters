package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import c8.i0;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth.d;

/* loaded from: classes.dex */
public final class e extends i0<b8.g> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3097a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3098b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f3099c;

    public e(FirebaseAuth firebaseAuth, String str, String str2) {
        this.f3097a = str;
        this.f3098b = str2;
        this.f3099c = firebaseAuth;
    }

    @Override // c8.i0
    public final Task<b8.g> b(String str) {
        String str2;
        StringBuilder sb2;
        if (TextUtils.isEmpty(str)) {
            String str3 = this.f3097a;
            sb2 = new StringBuilder("Creating user with ");
            sb2.append(str3);
            str2 = " with empty reCAPTCHA token";
        } else {
            str2 = this.f3097a;
            sb2 = new StringBuilder("Got reCAPTCHA token for sign up with email ");
        }
        sb2.append(str2);
        Log.i("FirebaseAuth", sb2.toString());
        FirebaseAuth firebaseAuth = this.f3099c;
        return firebaseAuth.f3061e.zza(firebaseAuth.f3057a, this.f3097a, this.f3098b, firebaseAuth.f3066k, str, firebaseAuth.new d());
    }
}
