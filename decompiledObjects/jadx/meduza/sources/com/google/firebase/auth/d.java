package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import b8.r;
import c8.i0;
import c8.s0;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth.c;

/* loaded from: classes.dex */
public final class d extends i0<b8.g> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f3094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b8.h f3095b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f3096c;

    public d(FirebaseAuth firebaseAuth, r rVar, b8.h hVar) {
        this.f3094a = rVar;
        this.f3095b = hVar;
        this.f3096c = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [c8.s0, com.google.firebase.auth.FirebaseAuth$c] */
    @Override // c8.i0
    public final Task<b8.g> b(String str) {
        Log.i("FirebaseAuth", TextUtils.isEmpty(str) ? "Linking email account with empty reCAPTCHA token" : "Got reCAPTCHA token for linking email account");
        FirebaseAuth firebaseAuth = this.f3096c;
        return firebaseAuth.f3061e.zza(firebaseAuth.f3057a, this.f3094a, (b8.f) this.f3095b, str, (s0) firebaseAuth.new c());
    }
}
