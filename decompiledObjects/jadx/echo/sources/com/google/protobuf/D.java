package com.google.protobuf;

import com.google.protobuf.m0;

/* loaded from: classes.dex */
public class D {

    /* renamed from: a, reason: collision with root package name */
    public final a f11966a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11967b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11968c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final m0.b f11969a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f11970b;

        /* renamed from: c, reason: collision with root package name */
        public final m0.b f11971c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f11972d;

        public a(m0.b bVar, Object obj, m0.b bVar2, Object obj2) {
            this.f11969a = bVar;
            this.f11970b = obj;
            this.f11971c = bVar2;
            this.f11972d = obj2;
        }
    }

    public D(m0.b bVar, Object obj, m0.b bVar2, Object obj2) {
        this.f11966a = new a(bVar, obj, bVar2, obj2);
        this.f11967b = obj;
        this.f11968c = obj2;
    }

    public static int b(a aVar, Object obj, Object obj2) {
        return C1150o.b(aVar.f11969a, 1, obj) + C1150o.b(aVar.f11971c, 2, obj2);
    }

    public static D d(m0.b bVar, Object obj, m0.b bVar2, Object obj2) {
        return new D(bVar, obj, bVar2, obj2);
    }

    public static void e(AbstractC1143h abstractC1143h, a aVar, Object obj, Object obj2) {
        C1150o.u(abstractC1143h, aVar.f11969a, 1, obj);
        C1150o.u(abstractC1143h, aVar.f11971c, 2, obj2);
    }

    public int a(int i7, Object obj, Object obj2) {
        return AbstractC1143h.O(i7) + AbstractC1143h.z(b(this.f11966a, obj, obj2));
    }

    public a c() {
        return this.f11966a;
    }
}
