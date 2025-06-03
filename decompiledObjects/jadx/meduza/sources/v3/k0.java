package v3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k0 extends i1 {

    /* renamed from: e, reason: collision with root package name */
    public static final String f15507e = v5.e0.E(1);
    public static final String f = v5.e0.E(2);

    /* renamed from: o, reason: collision with root package name */
    public static final r3.j f15508o = new r3.j(7);

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15509c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15510d;

    public k0() {
        this.f15509c = false;
        this.f15510d = false;
    }

    public k0(boolean z10) {
        this.f15509c = true;
        this.f15510d = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f15510d == k0Var.f15510d && this.f15509c == k0Var.f15509c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f15509c), Boolean.valueOf(this.f15510d)});
    }
}
