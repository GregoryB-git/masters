package com.google.firebase.messaging;

import j4.C1377c;
import k4.InterfaceC1471a;
import k4.InterfaceC1472b;
import m4.C1673a;
import y4.C2275a;
import y4.C2276b;

/* renamed from: com.google.firebase.messaging.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1111a implements InterfaceC1471a {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC1471a f11700a = new C1111a();

    /* renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    public static final class C0176a implements j4.d {

        /* renamed from: a, reason: collision with root package name */
        public static final C0176a f11701a = new C0176a();

        /* renamed from: b, reason: collision with root package name */
        public static final C1377c f11702b = C1377c.a("projectNumber").b(C1673a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        public static final C1377c f11703c = C1377c.a("messageId").b(C1673a.b().c(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        public static final C1377c f11704d = C1377c.a("instanceId").b(C1673a.b().c(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        public static final C1377c f11705e = C1377c.a("messageType").b(C1673a.b().c(4).a()).a();

        /* renamed from: f, reason: collision with root package name */
        public static final C1377c f11706f = C1377c.a("sdkPlatform").b(C1673a.b().c(5).a()).a();

        /* renamed from: g, reason: collision with root package name */
        public static final C1377c f11707g = C1377c.a("packageName").b(C1673a.b().c(6).a()).a();

        /* renamed from: h, reason: collision with root package name */
        public static final C1377c f11708h = C1377c.a("collapseKey").b(C1673a.b().c(7).a()).a();

        /* renamed from: i, reason: collision with root package name */
        public static final C1377c f11709i = C1377c.a("priority").b(C1673a.b().c(8).a()).a();

        /* renamed from: j, reason: collision with root package name */
        public static final C1377c f11710j = C1377c.a("ttl").b(C1673a.b().c(9).a()).a();

        /* renamed from: k, reason: collision with root package name */
        public static final C1377c f11711k = C1377c.a("topic").b(C1673a.b().c(10).a()).a();

        /* renamed from: l, reason: collision with root package name */
        public static final C1377c f11712l = C1377c.a("bulkId").b(C1673a.b().c(11).a()).a();

        /* renamed from: m, reason: collision with root package name */
        public static final C1377c f11713m = C1377c.a("event").b(C1673a.b().c(12).a()).a();

        /* renamed from: n, reason: collision with root package name */
        public static final C1377c f11714n = C1377c.a("analyticsLabel").b(C1673a.b().c(13).a()).a();

        /* renamed from: o, reason: collision with root package name */
        public static final C1377c f11715o = C1377c.a("campaignId").b(C1673a.b().c(14).a()).a();

        /* renamed from: p, reason: collision with root package name */
        public static final C1377c f11716p = C1377c.a("composerLabel").b(C1673a.b().c(15).a()).a();

        @Override // j4.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C2275a c2275a, j4.e eVar) {
            eVar.b(f11702b, c2275a.l());
            eVar.g(f11703c, c2275a.h());
            eVar.g(f11704d, c2275a.g());
            eVar.g(f11705e, c2275a.i());
            eVar.g(f11706f, c2275a.m());
            eVar.g(f11707g, c2275a.j());
            eVar.g(f11708h, c2275a.d());
            eVar.c(f11709i, c2275a.k());
            eVar.c(f11710j, c2275a.o());
            eVar.g(f11711k, c2275a.n());
            eVar.b(f11712l, c2275a.b());
            eVar.g(f11713m, c2275a.f());
            eVar.g(f11714n, c2275a.a());
            eVar.b(f11715o, c2275a.c());
            eVar.g(f11716p, c2275a.e());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$b */
    public static final class b implements j4.d {

        /* renamed from: a, reason: collision with root package name */
        public static final b f11717a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final C1377c f11718b = C1377c.a("messagingClientEvent").b(C1673a.b().c(1).a()).a();

        @Override // j4.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C2276b c2276b, j4.e eVar) {
            eVar.g(f11718b, c2276b.a());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$c */
    public static final class c implements j4.d {

        /* renamed from: a, reason: collision with root package name */
        public static final c f11719a = new c();

        /* renamed from: b, reason: collision with root package name */
        public static final C1377c f11720b = C1377c.d("messagingClientEventExtension");

        @Override // j4.d
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            android.support.v4.media.a.a(obj);
            b(null, (j4.e) obj2);
        }

        public void b(M m7, j4.e eVar) {
            throw null;
        }
    }

    @Override // k4.InterfaceC1471a
    public void a(InterfaceC1472b interfaceC1472b) {
        interfaceC1472b.a(M.class, c.f11719a);
        interfaceC1472b.a(C2276b.class, b.f11717a);
        interfaceC1472b.a(C2275a.class, C0176a.f11701a);
    }
}
