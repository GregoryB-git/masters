package R2;

import com.google.android.gms.internal.measurement.Q7;
import com.google.android.gms.internal.measurement.T7;
import java.util.List;

/* loaded from: classes.dex */
public final class C2 implements T7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0632x2 f4567a;

    public C2(C0632x2 c0632x2) {
        this.f4567a = c0632x2;
    }

    @Override // com.google.android.gms.internal.measurement.T7
    public final void a(Q7 q7, String str, List list, boolean z7, boolean z8) {
        C0472a2 F6;
        int i7 = E2.f4655a[q7.ordinal()];
        if (i7 == 1) {
            F6 = this.f4567a.j().F();
        } else if (i7 == 2) {
            Y1 j7 = this.f4567a.j();
            F6 = z7 ? j7.I() : !z8 ? j7.H() : j7.G();
        } else if (i7 != 3) {
            F6 = i7 != 4 ? this.f4567a.j().J() : this.f4567a.j().K();
        } else {
            Y1 j8 = this.f4567a.j();
            F6 = z7 ? j8.N() : !z8 ? j8.M() : j8.L();
        }
        int size = list.size();
        if (size == 1) {
            F6.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            F6.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            F6.a(str);
        } else {
            F6.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
