package V3;

import d4.C1227b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class E {

    public static class a extends E {

        /* renamed from: a, reason: collision with root package name */
        public final x f6483a;

        /* renamed from: b, reason: collision with root package name */
        public final k f6484b;

        public a(x xVar, k kVar) {
            this.f6483a = xVar;
            this.f6484b = kVar;
        }

        @Override // V3.E
        public E a(C1227b c1227b) {
            return new a(this.f6483a, this.f6484b.U(c1227b));
        }

        @Override // V3.E
        public d4.n b() {
            return this.f6483a.J(this.f6484b, new ArrayList());
        }
    }

    public static class b extends E {

        /* renamed from: a, reason: collision with root package name */
        public final d4.n f6485a;

        public b(d4.n nVar) {
            this.f6485a = nVar;
        }

        @Override // V3.E
        public E a(C1227b c1227b) {
            return new b(this.f6485a.v(c1227b));
        }

        @Override // V3.E
        public d4.n b() {
            return this.f6485a;
        }
    }

    public abstract E a(C1227b c1227b);

    public abstract d4.n b();
}
