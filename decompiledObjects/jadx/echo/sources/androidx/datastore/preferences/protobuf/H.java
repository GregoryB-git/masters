package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.r0;

/* loaded from: classes.dex */
public class H {

    /* renamed from: a, reason: collision with root package name */
    public final a f8897a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8898b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8899c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final r0.b f8900a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f8901b;

        /* renamed from: c, reason: collision with root package name */
        public final r0.b f8902c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f8903d;

        public a(r0.b bVar, Object obj, r0.b bVar2, Object obj2) {
            this.f8900a = bVar;
            this.f8901b = obj;
            this.f8902c = bVar2;
            this.f8903d = obj2;
        }
    }

    public H(r0.b bVar, Object obj, r0.b bVar2, Object obj2) {
        this.f8897a = new a(bVar, obj, bVar2, obj2);
        this.f8898b = obj;
        this.f8899c = obj2;
    }

    public static int b(a aVar, Object obj, Object obj2) {
        return C0771s.b(aVar.f8900a, 1, obj) + C0771s.b(aVar.f8902c, 2, obj2);
    }

    public static H d(r0.b bVar, Object obj, r0.b bVar2, Object obj2) {
        return new H(bVar, obj, bVar2, obj2);
    }

    public static void e(AbstractC0763j abstractC0763j, a aVar, Object obj, Object obj2) {
        C0771s.u(abstractC0763j, aVar.f8900a, 1, obj);
        C0771s.u(abstractC0763j, aVar.f8902c, 2, obj2);
    }

    public int a(int i7, Object obj, Object obj2) {
        return AbstractC0763j.P(i7) + AbstractC0763j.y(b(this.f8897a, obj, obj2));
    }

    public a c() {
        return this.f8897a;
    }
}
