package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import b8.r;
import c8.i0;
import com.google.android.gms.internal.p002firebaseauthapi.zzabq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth.c;
import com.google.firebase.auth.FirebaseAuth.d;
import m6.j;

/* loaded from: classes.dex */
public final class b extends i0<b8.g> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3087a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3088b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f3089c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f3090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f3091e;
    public final /* synthetic */ FirebaseAuth f;

    public b(FirebaseAuth firebaseAuth, String str, boolean z10, r rVar, String str2, String str3) {
        this.f3087a = str;
        this.f3088b = z10;
        this.f3089c = rVar;
        this.f3090d = str2;
        this.f3091e = str3;
        this.f = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [c8.s0, com.google.firebase.auth.FirebaseAuth$c] */
    @Override // c8.i0
    public final Task<b8.g> b(String str) {
        String str2;
        StringBuilder sb2;
        if (TextUtils.isEmpty(str)) {
            String str3 = this.f3087a;
            sb2 = new StringBuilder("Logging in as ");
            sb2.append(str3);
            str2 = " with empty reCAPTCHA token";
        } else {
            str2 = this.f3087a;
            sb2 = new StringBuilder("Got reCAPTCHA token for login with email ");
        }
        sb2.append(str2);
        Log.i("FirebaseAuth", sb2.toString());
        if (!this.f3088b) {
            FirebaseAuth firebaseAuth = this.f;
            return firebaseAuth.f3061e.zzb(firebaseAuth.f3057a, this.f3087a, this.f3090d, this.f3091e, str, firebaseAuth.new d());
        }
        FirebaseAuth firebaseAuth2 = this.f;
        zzabq zzabqVar = firebaseAuth2.f3061e;
        u7.f fVar = firebaseAuth2.f3057a;
        r rVar = this.f3089c;
        j.i(rVar);
        return zzabqVar.zzb(fVar, rVar, this.f3087a, this.f3090d, this.f3091e, str, this.f.new c());
    }
}
