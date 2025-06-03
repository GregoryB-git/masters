package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f3103a;

    public h(FirebaseAuth firebaseAuth, y9.b bVar) {
        this.f3103a = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f3103a.f3059c.iterator();
        while (it.hasNext()) {
            ((c8.a) it.next()).a();
        }
        Iterator it2 = this.f3103a.f3058b.iterator();
        while (it2.hasNext()) {
            ((FirebaseAuth.b) it2.next()).a(this.f3103a);
        }
    }
}
