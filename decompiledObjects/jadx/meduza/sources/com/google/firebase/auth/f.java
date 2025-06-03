package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth.a f3100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f3101b;

    public f(FirebaseAuth firebaseAuth, io.flutter.plugins.firebase.auth.a aVar) {
        this.f3100a = aVar;
        this.f3101b = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3100a.a(this.f3101b);
    }
}
