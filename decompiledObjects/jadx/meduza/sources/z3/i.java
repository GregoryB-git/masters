package z3;

import android.text.TextUtils;
import v3.i0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f17538a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f17539b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f17540c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17541d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17542e;

    public i(String str, i0 i0Var, i0 i0Var2, int i10, int i11) {
        x6.b.q(i10 == 0 || i11 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f17538a = str;
        i0Var.getClass();
        this.f17539b = i0Var;
        i0Var2.getClass();
        this.f17540c = i0Var2;
        this.f17541d = i10;
        this.f17542e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f17541d == iVar.f17541d && this.f17542e == iVar.f17542e && this.f17538a.equals(iVar.f17538a) && this.f17539b.equals(iVar.f17539b) && this.f17540c.equals(iVar.f17540c);
    }

    public final int hashCode() {
        return this.f17540c.hashCode() + ((this.f17539b.hashCode() + a0.j.e(this.f17538a, (((this.f17541d + 527) * 31) + this.f17542e) * 31, 31)) * 31);
    }
}
