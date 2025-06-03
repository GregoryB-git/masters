// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import j4.e;
import java.lang.annotation.Annotation;
import j4.c;
import j4.d;
import k4.b;

public final class a implements a
{
    public static final a a;
    
    static {
        a = new a();
    }
    
    @Override
    public void a(final k4.b b) {
        b.a(M.class, c.a);
        b.a(y4.b.class, com.google.firebase.messaging.a.b.a);
        b.a(y4.a.class, com.google.firebase.messaging.a.a.a);
    }
    
    public static final class a implements d
    {
        public static final a a;
        public static final j4.c b;
        public static final j4.c c;
        public static final j4.c d;
        public static final j4.c e;
        public static final j4.c f;
        public static final j4.c g;
        public static final j4.c h;
        public static final j4.c i;
        public static final j4.c j;
        public static final j4.c k;
        public static final j4.c l;
        public static final j4.c m;
        public static final j4.c n;
        public static final j4.c o;
        public static final j4.c p;
        
        static {
            a = new a();
            b = j4.c.a("projectNumber").b(m4.a.b().c(1).a()).a();
            c = j4.c.a("messageId").b(m4.a.b().c(2).a()).a();
            d = j4.c.a("instanceId").b(m4.a.b().c(3).a()).a();
            e = j4.c.a("messageType").b(m4.a.b().c(4).a()).a();
            f = j4.c.a("sdkPlatform").b(m4.a.b().c(5).a()).a();
            g = j4.c.a("packageName").b(m4.a.b().c(6).a()).a();
            h = j4.c.a("collapseKey").b(m4.a.b().c(7).a()).a();
            i = j4.c.a("priority").b(m4.a.b().c(8).a()).a();
            j = j4.c.a("ttl").b(m4.a.b().c(9).a()).a();
            k = j4.c.a("topic").b(m4.a.b().c(10).a()).a();
            l = j4.c.a("bulkId").b(m4.a.b().c(11).a()).a();
            m = j4.c.a("event").b(m4.a.b().c(12).a()).a();
            n = j4.c.a("analyticsLabel").b(m4.a.b().c(13).a()).a();
            o = j4.c.a("campaignId").b(m4.a.b().c(14).a()).a();
            p = j4.c.a("composerLabel").b(m4.a.b().c(15).a()).a();
        }
        
        public void b(final y4.a a, final e e) {
            e.b(a.b, a.l());
            e.g(a.c, a.h());
            e.g(a.d, a.g());
            e.g(a.e, a.i());
            e.g(a.f, a.m());
            e.g(a.g, a.j());
            e.g(a.h, a.d());
            e.c(a.i, a.k());
            e.c(a.j, a.o());
            e.g(a.k, a.n());
            e.b(a.l, a.b());
            e.g(a.m, a.f());
            e.g(a.n, a.a());
            e.b(a.o, a.c());
            e.g(a.p, a.e());
        }
    }
    
    public static final class b implements d
    {
        public static final b a;
        public static final j4.c b;
        
        static {
            a = new b();
            b = j4.c.a("messagingClientEvent").b(m4.a.b().c(1).a()).a();
        }
        
        public void b(final y4.b b, final e e) {
            e.g(com.google.firebase.messaging.a.b.b, b.a());
        }
    }
    
    public static final class c implements d
    {
        public static final c a;
        public static final j4.c b;
        
        static {
            a = new c();
            b = j4.c.d("messagingClientEventExtension");
        }
        
        public void b(final M m, final e e) {
            throw null;
        }
    }
}
