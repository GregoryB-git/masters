package r5;

import java.util.List;
import z4.i0;

/* loaded from: classes.dex */
public interface h extends k {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final i0 f13710a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f13711b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13712c;

        public a() {
            throw null;
        }

        public a(int i10, i0 i0Var, int[] iArr) {
            if (iArr.length == 0) {
                v5.m.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f13710a = i0Var;
            this.f13711b = iArr;
            this.f13712c = i10;
        }
    }

    public interface b {
    }

    void e();

    void g();

    void h();

    int i();

    void j(long j10, long j11, List list, b5.n[] nVarArr);

    boolean k(int i10, long j10);

    boolean l(int i10, long j10);

    void m();

    int n(long j10, List<? extends b5.m> list);

    int o();

    v3.i0 p();

    int q();

    void r(float f);

    Object s();

    void t();

    void u();
}
