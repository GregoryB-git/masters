package A0;

import d0.C1171J;
import java.util.List;

/* loaded from: classes.dex */
public final class z extends AbstractC0312c {

    /* renamed from: h, reason: collision with root package name */
    public final int f212h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f213i;

    public z(C1171J c1171j, int i7, int i8) {
        this(c1171j, i7, i8, 0, null);
    }

    @Override // A0.y
    public int n() {
        return this.f212h;
    }

    @Override // A0.y
    public int o() {
        return 0;
    }

    @Override // A0.y
    public Object s() {
        return this.f213i;
    }

    public z(C1171J c1171j, int i7, int i8, int i9, Object obj) {
        super(c1171j, new int[]{i7}, i8);
        this.f212h = i9;
        this.f213i = obj;
    }

    @Override // A0.y
    public void v(long j7, long j8, long j9, List list, y0.n[] nVarArr) {
    }
}
