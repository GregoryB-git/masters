package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugins.firebase.auth.a0;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth.b f3092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f3093b;

    public c(FirebaseAuth firebaseAuth, a0 a0Var) {
        this.f3092a = a0Var;
        this.f3093b = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3092a.a(this.f3093b);
    }
}
