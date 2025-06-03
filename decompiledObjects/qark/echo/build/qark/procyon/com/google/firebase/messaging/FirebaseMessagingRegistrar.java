// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import java.util.Arrays;
import B3.h;
import B3.r;
import B3.c;
import java.util.List;
import n4.d;
import c2.g;
import o4.j;
import O4.i;
import q4.a;
import B3.e;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;

@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar
{
    private static final String LIBRARY_NAME = "fire-fcm";
    
    @Keep
    @Override
    public List<c> getComponents() {
        return Arrays.asList(c.e(FirebaseMessaging.class).h("fire-fcm").b(r.k(s3.e.class)).b(r.h(a.class)).b(r.i(i.class)).b(r.i(j.class)).b(r.h(g.class)).b(r.k(s4.i.class)).b(r.k(d.class)).f(new D()).c().d(), O4.h.b("fire-fcm", "23.3.1"));
    }
}
