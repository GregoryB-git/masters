package o7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g0<V> implements n7.q<List<V>>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f11983a;

    public g0(int i10) {
        p2.m0.o(i10, "expectedValuesPerKey");
        this.f11983a = i10;
    }

    @Override // n7.q
    public final Object get() {
        return new ArrayList(this.f11983a);
    }
}
