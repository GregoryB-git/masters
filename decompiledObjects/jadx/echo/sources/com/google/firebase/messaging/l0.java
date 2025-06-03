package com.google.firebase.messaging;

import V2.AbstractC0659j;
import V2.InterfaceC0654e;
import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.o0;

/* loaded from: classes.dex */
public class l0 extends Binder {

    /* renamed from: b, reason: collision with root package name */
    public final a f11795b;

    public interface a {
        AbstractC0659j a(Intent intent);
    }

    public l0(a aVar) {
        this.f11795b = aVar;
    }

    public void c(final o0.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f11795b.a(aVar.f11808a).c(new r1.m(), new InterfaceC0654e() { // from class: com.google.firebase.messaging.k0
            @Override // V2.InterfaceC0654e
            public final void a(AbstractC0659j abstractC0659j) {
                o0.a.this.d();
            }
        });
    }
}
