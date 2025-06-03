package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import d8.b;
import d8.c;
import d8.e;
import d8.k;
import d8.t;
import h3.i;
import java.util.Arrays;
import java.util.List;
import u7.f;
import u9.d;

/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(t tVar, c cVar) {
        return new FirebaseMessaging((f) cVar.get(f.class), (s9.a) cVar.get(s9.a.class), cVar.b(ca.f.class), cVar.b(q9.f.class), (d) cVar.get(d.class), cVar.c(tVar), (c9.d) cVar.get(c9.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b<?>> getComponents() {
        final t tVar = new t(u8.b.class, i.class);
        b.a b10 = b.b(FirebaseMessaging.class);
        b10.f3588a = LIBRARY_NAME;
        b10.a(k.d(f.class));
        b10.a(new k(0, 0, s9.a.class));
        b10.a(k.b(ca.f.class));
        b10.a(k.b(q9.f.class));
        b10.a(k.d(d.class));
        b10.a(new k((t<?>) tVar, 0, 1));
        b10.a(k.d(c9.d.class));
        b10.f = new e() { // from class: aa.n
            @Override // d8.e
            public final Object g(d8.u uVar) {
                FirebaseMessaging lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(d8.t.this, uVar);
                return lambda$getComponents$0;
            }
        };
        b10.c(1);
        return Arrays.asList(b10.b(), ca.e.a(LIBRARY_NAME, "24.1.0"));
    }
}
