package A0;

import d0.AbstractC1170I;
import d0.C1171J;
import d0.C1194q;
import java.util.List;
import x0.InterfaceC2142x;
import y0.AbstractC2226e;

/* loaded from: classes.dex */
public interface y extends B {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final C1171J f209a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f210b;

        /* renamed from: c, reason: collision with root package name */
        public final int f211c;

        public a(C1171J c1171j, int... iArr) {
            this(c1171j, iArr, 0);
        }

        public a(C1171J c1171j, int[] iArr, int i7) {
            if (iArr.length == 0) {
                g0.o.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f209a = c1171j;
            this.f210b = iArr;
            this.f211c = i7;
        }
    }

    public interface b {
        y[] a(a[] aVarArr, B0.e eVar, InterfaceC2142x.b bVar, AbstractC1170I abstractC1170I);
    }

    void g();

    void h(boolean z7);

    boolean i(int i7, long j7);

    void j();

    int k(long j7, List list);

    int l();

    C1194q m();

    int n();

    int o();

    boolean p(int i7, long j7);

    boolean q(long j7, AbstractC2226e abstractC2226e, List list);

    void r(float f7);

    Object s();

    void t();

    void u();

    void v(long j7, long j8, long j9, List list, y0.n[] nVarArr);
}
