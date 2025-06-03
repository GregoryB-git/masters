package u6;

/* loaded from: classes.dex */
public abstract class x {

    public static final class a extends kotlin.jvm.internal.l implements g6.l {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ g6.l f20014o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Object f20015p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ X5.g f20016q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g6.l lVar, Object obj, X5.g gVar) {
            super(1);
            this.f20014o = lVar;
            this.f20015p = obj;
            this.f20016q = gVar;
        }

        public final void a(Throwable th) {
            x.b(this.f20014o, this.f20015p, this.f20016q);
        }

        @Override // g6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return V5.t.f6803a;
        }
    }

    public static final g6.l a(g6.l lVar, Object obj, X5.g gVar) {
        return new a(lVar, obj, gVar);
    }

    public static final void b(g6.l lVar, Object obj, X5.g gVar) {
        O c7 = c(lVar, obj, null);
        if (c7 != null) {
            p6.H.a(gVar, c7);
        }
    }

    public static final O c(g6.l lVar, Object obj, O o7) {
        try {
            lVar.invoke(obj);
        } catch (Throwable th) {
            if (o7 == null || o7.getCause() == th) {
                return new O("Exception in undelivered element handler for " + obj, th);
            }
            V5.b.a(o7, th);
        }
        return o7;
    }

    public static /* synthetic */ O d(g6.l lVar, Object obj, O o7, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            o7 = null;
        }
        return c(lVar, obj, o7);
    }
}
