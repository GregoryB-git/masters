package com.google.firebase.messaging;

import B3.C0342c;
import B3.InterfaceC0344e;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import n4.InterfaceC1731d;
import q4.InterfaceC1904a;
import s3.C1947e;

@Keep
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(InterfaceC0344e interfaceC0344e) {
        return new FirebaseMessaging((C1947e) interfaceC0344e.a(C1947e.class), (InterfaceC1904a) interfaceC0344e.a(InterfaceC1904a.class), interfaceC0344e.g(O4.i.class), interfaceC0344e.g(o4.j.class), (s4.i) interfaceC0344e.a(s4.i.class), (c2.g) interfaceC0344e.a(c2.g.class), (InterfaceC1731d) interfaceC0344e.a(InterfaceC1731d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C0342c> getComponents() {
        return Arrays.asList(C0342c.e(FirebaseMessaging.class).h(LIBRARY_NAME).b(B3.r.k(C1947e.class)).b(B3.r.h(InterfaceC1904a.class)).b(B3.r.i(O4.i.class)).b(B3.r.i(o4.j.class)).b(B3.r.h(c2.g.class)).b(B3.r.k(s4.i.class)).b(B3.r.k(InterfaceC1731d.class)).f(new B3.h() { // from class: com.google.firebase.messaging.D
            @Override // B3.h
            public final Object a(InterfaceC0344e interfaceC0344e) {
                FirebaseMessaging lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(interfaceC0344e);
                return lambda$getComponents$0;
            }
        }).c().d(), O4.h.b(LIBRARY_NAME, "23.3.1"));
    }
}
