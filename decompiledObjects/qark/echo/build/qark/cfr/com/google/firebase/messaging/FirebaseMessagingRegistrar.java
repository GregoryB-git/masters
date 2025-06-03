/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.List
 */
package com.google.firebase.messaging;

import B3.c;
import B3.h;
import B3.r;
import androidx.annotation.Keep;
import c2.g;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.D;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Arrays;
import java.util.List;
import n4.d;
import o4.j;
import q4.a;
import r4.b;
import s3.e;
import s4.i;

@Keep
public class FirebaseMessagingRegistrar
implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging a(B3.e e8) {
        return FirebaseMessagingRegistrar.lambda$getComponents$0(e8);
    }

    private static /* synthetic */ FirebaseMessaging lambda$getComponents$0(B3.e e8) {
        return new FirebaseMessaging((e)e8.a(e.class), (a)e8.a(a.class), e8.g(O4.i.class), e8.g(j.class), (i)e8.a(i.class), (g)e8.a(g.class), (d)e8.a(d.class));
    }

    @Keep
    public List<c> getComponents() {
        return Arrays.asList((Object[])new c[]{c.e(FirebaseMessaging.class).h("fire-fcm").b(r.k(e.class)).b(r.h(a.class)).b(r.i(O4.i.class)).b(r.i(j.class)).b(r.h(g.class)).b(r.k(i.class)).b(r.k(d.class)).f(new D()).c().d(), O4.h.b("fire-fcm", "23.3.1")});
    }
}

