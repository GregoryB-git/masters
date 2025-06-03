/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.annotation.Annotation
 */
package com.google.firebase.messaging;

import com.google.firebase.messaging.M;
import j4.c;
import j4.e;
import java.lang.annotation.Annotation;
import m4.d;
import y4.a;

public final class a
implements k4.a {
    public static final k4.a a = new a();

    @Override
    public void a(k4.b b8) {
        b8.a(M.class, c.a);
        b8.a(y4.b.class, b.a);
        b8.a(y4.a.class, a.a);
    }

    public static final class a
    implements j4.d {
        public static final a a = new a();
        public static final j4.c b = j4.c.a("projectNumber").b(m4.a.b().c(1).a()).a();
        public static final j4.c c = j4.c.a("messageId").b(m4.a.b().c(2).a()).a();
        public static final j4.c d = j4.c.a("instanceId").b(m4.a.b().c(3).a()).a();
        public static final j4.c e = j4.c.a("messageType").b(m4.a.b().c(4).a()).a();
        public static final j4.c f = j4.c.a("sdkPlatform").b(m4.a.b().c(5).a()).a();
        public static final j4.c g = j4.c.a("packageName").b(m4.a.b().c(6).a()).a();
        public static final j4.c h = j4.c.a("collapseKey").b(m4.a.b().c(7).a()).a();
        public static final j4.c i = j4.c.a("priority").b(m4.a.b().c(8).a()).a();
        public static final j4.c j = j4.c.a("ttl").b(m4.a.b().c(9).a()).a();
        public static final j4.c k = j4.c.a("topic").b(m4.a.b().c(10).a()).a();
        public static final j4.c l = j4.c.a("bulkId").b(m4.a.b().c(11).a()).a();
        public static final j4.c m = j4.c.a("event").b(m4.a.b().c(12).a()).a();
        public static final j4.c n = j4.c.a("analyticsLabel").b(m4.a.b().c(13).a()).a();
        public static final j4.c o = j4.c.a("campaignId").b(m4.a.b().c(14).a()).a();
        public static final j4.c p = j4.c.a("composerLabel").b(m4.a.b().c(15).a()).a();

        public void b(y4.a a8, e e8) {
            e8.b(b, a8.l());
            e8.g(c, a8.h());
            e8.g(d, a8.g());
            e8.g(e, a8.i());
            e8.g(f, a8.m());
            e8.g(g, a8.j());
            e8.g(h, a8.d());
            e8.c(i, a8.k());
            e8.c(j, a8.o());
            e8.g(k, a8.n());
            e8.b(l, a8.b());
            e8.g(m, a8.f());
            e8.g(n, a8.a());
            e8.b(o, a8.c());
            e8.g(p, a8.e());
        }
    }

    public static final class b
    implements j4.d {
        public static final b a = new b();
        public static final j4.c b = j4.c.a("messagingClientEvent").b(m4.a.b().c(1).a()).a();

        public void b(y4.b b8, e e8) {
            e8.g(b, b8.a());
        }
    }

    public static final class c
    implements j4.d {
        public static final c a = new c();
        public static final j4.c b = j4.c.d("messagingClientEventExtension");

        public void b(M m8, e e8) {
            throw null;
        }
    }

}

