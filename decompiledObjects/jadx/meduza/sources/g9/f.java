package g9;

import android.content.Context;
import i9.k1;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.firebase.firestore.g f5931a;

    /* renamed from: b, reason: collision with root package name */
    public m9.c0 f5932b = new m9.c0();

    /* renamed from: c, reason: collision with root package name */
    public e9.a f5933c;

    /* renamed from: d, reason: collision with root package name */
    public i9.n f5934d;

    /* renamed from: e, reason: collision with root package name */
    public j0 f5935e;
    public m9.h0 f;

    /* renamed from: g, reason: collision with root package name */
    public k f5936g;

    /* renamed from: h, reason: collision with root package name */
    public i9.e f5937h;

    /* renamed from: i, reason: collision with root package name */
    public k1 f5938i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f5939a;

        /* renamed from: b, reason: collision with root package name */
        public final n9.a f5940b;

        /* renamed from: c, reason: collision with root package name */
        public final h f5941c;

        /* renamed from: d, reason: collision with root package name */
        public final e9.e f5942d;

        public a(Context context, n9.a aVar, h hVar, e9.e eVar, e9.a aVar2, e9.a aVar3, m9.z zVar) {
            this.f5939a = context;
            this.f5940b = aVar;
            this.f5941c = hVar;
            this.f5942d = eVar;
        }
    }

    public f(com.google.firebase.firestore.g gVar) {
        this.f5931a = gVar;
    }

    public abstract k a();

    public abstract k1 b(a aVar);

    public abstract i9.e c(a aVar);

    public abstract i9.n d(a aVar);

    public abstract e9.a e(a aVar);

    public abstract m9.h0 f(a aVar);

    public abstract j0 g(a aVar);

    public final i9.n h() {
        i9.n nVar = this.f5934d;
        x6.b.a0(nVar, "localStore not initialized yet", new Object[0]);
        return nVar;
    }

    public final j0 i() {
        j0 j0Var = this.f5935e;
        x6.b.a0(j0Var, "syncEngine not initialized yet", new Object[0]);
        return j0Var;
    }
}
