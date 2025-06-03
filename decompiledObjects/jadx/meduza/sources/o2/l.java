package o2;

import o2.q;

/* loaded from: classes.dex */
public final class l extends q {

    public static final class a extends q.a<a, l> {
        public a(Class<? extends androidx.work.d> cls) {
            super(cls);
        }

        @Override // o2.q.a
        public final l b() {
            if ((this.f11748a && this.f11750c.f16838j.f11705c) ? false : true) {
                return new l(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
        }

        @Override // o2.q.a
        public final a c() {
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(a aVar) {
        super(aVar.f11749b, aVar.f11750c, aVar.f11751d);
        ec.i.e(aVar, "builder");
    }
}
