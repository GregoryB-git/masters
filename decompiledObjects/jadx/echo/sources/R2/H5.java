package R2;

import A2.AbstractC0328n;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class H5 implements Callable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ W5 f4702o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D5 f4703p;

    public H5(D5 d52, W5 w52) {
        this.f4703p = d52;
        this.f4702o = w52;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        C0472a2 K6;
        String str;
        if (this.f4703p.Q((String) AbstractC0328n.i(this.f4702o.f5115o)).y() && C0585q3.e(this.f4702o.f5106J).y()) {
            I2 g7 = this.f4703p.g(this.f4702o);
            if (g7 != null) {
                return g7.u0();
            }
            K6 = this.f4703p.j().L();
            str = "App info was null when attempting to get app instance id";
        } else {
            K6 = this.f4703p.j().K();
            str = "Analytics storage consent denied. Returning null app instance id";
        }
        K6.a(str);
        return null;
    }
}
