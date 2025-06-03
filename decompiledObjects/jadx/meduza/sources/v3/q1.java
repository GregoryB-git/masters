package v3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class q1 extends i1 {

    /* renamed from: e, reason: collision with root package name */
    public static final String f15713e = v5.e0.E(1);
    public static final String f = v5.e0.E(2);

    /* renamed from: o, reason: collision with root package name */
    public static final e0.d f15714o = new e0.d(8);

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15715c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15716d;

    public q1() {
        this.f15715c = false;
        this.f15716d = false;
    }

    public q1(boolean z10) {
        this.f15715c = true;
        this.f15716d = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return this.f15716d == q1Var.f15716d && this.f15715c == q1Var.f15715c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f15715c), Boolean.valueOf(this.f15716d)});
    }
}
