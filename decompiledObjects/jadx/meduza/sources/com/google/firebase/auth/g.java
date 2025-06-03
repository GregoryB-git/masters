package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f3102a;

    public g(FirebaseAuth firebaseAuth) {
        this.f3102a = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f3102a.f3060d.iterator();
        while (it.hasNext()) {
            ((FirebaseAuth.a) it.next()).a(this.f3102a);
        }
    }
}
