package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import b8.r;
import c8.i0;
import c8.s0;
import c8.z0;
import com.google.android.gms.internal.p002firebaseauthapi.zzabq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth.c;
import com.google.firebase.auth.FirebaseAuth.d;
import m6.j;

/* loaded from: classes.dex */
public final class a extends i0<b8.g> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f3083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f3084b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b8.h f3085c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f3086d;

    public a(FirebaseAuth firebaseAuth, boolean z10, r rVar, b8.h hVar) {
        this.f3083a = z10;
        this.f3084b = rVar;
        this.f3085c = hVar;
        this.f3086d = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [c8.s0, com.google.firebase.auth.FirebaseAuth$c] */
    @Override // c8.i0
    public final Task<b8.g> b(String str) {
        Log.i("FirebaseAuth", TextUtils.isEmpty(str) ? "Email link login/reauth with empty reCAPTCHA token" : "Got reCAPTCHA token for login/reauth with email link");
        if (!this.f3083a) {
            FirebaseAuth firebaseAuth = this.f3086d;
            return firebaseAuth.f3061e.zza(firebaseAuth.f3057a, this.f3085c, str, (z0) firebaseAuth.new d());
        }
        FirebaseAuth firebaseAuth2 = this.f3086d;
        zzabq zzabqVar = firebaseAuth2.f3061e;
        u7.f fVar = firebaseAuth2.f3057a;
        r rVar = this.f3084b;
        j.i(rVar);
        return zzabqVar.zzb(fVar, rVar, this.f3085c, str, (s0) this.f3086d.new c());
    }
}
