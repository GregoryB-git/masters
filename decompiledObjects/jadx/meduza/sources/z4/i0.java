package z4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class i0 implements v3.g {
    public static final String f = v5.e0.E(0);

    /* renamed from: o, reason: collision with root package name */
    public static final String f17682o = v5.e0.E(1);

    /* renamed from: p, reason: collision with root package name */
    public static final e0.d f17683p = new e0.d(15);

    /* renamed from: a, reason: collision with root package name */
    public final int f17684a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17685b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17686c;

    /* renamed from: d, reason: collision with root package name */
    public final v3.i0[] f17687d;

    /* renamed from: e, reason: collision with root package name */
    public int f17688e;

    public i0() {
        throw null;
    }

    public i0(String str, v3.i0... i0VarArr) {
        int i10 = 1;
        x6.b.q(i0VarArr.length > 0);
        this.f17685b = str;
        this.f17687d = i0VarArr;
        this.f17684a = i0VarArr.length;
        int i11 = v5.p.i(i0VarArr[0].t);
        this.f17686c = i11 == -1 ? v5.p.i(i0VarArr[0].f15456s) : i11;
        String str2 = i0VarArr[0].f15449c;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i12 = i0VarArr[0].f15451e | 16384;
        while (true) {
            v3.i0[] i0VarArr2 = this.f17687d;
            if (i10 >= i0VarArr2.length) {
                return;
            }
            String str3 = i0VarArr2[i10].f15449c;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                v3.i0[] i0VarArr3 = this.f17687d;
                b("languages", i0VarArr3[0].f15449c, i0VarArr3[i10].f15449c, i10);
                return;
            } else {
                v3.i0[] i0VarArr4 = this.f17687d;
                if (i12 != (i0VarArr4[i10].f15451e | 16384)) {
                    b("role flags", Integer.toBinaryString(i0VarArr4[0].f15451e), Integer.toBinaryString(this.f17687d[i10].f15451e), i10);
                    return;
                }
                i10++;
            }
        }
    }

    public static void b(String str, String str2, String str3, int i10) {
        v5.m.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    public final int a(v3.i0 i0Var) {
        int i10 = 0;
        while (true) {
            v3.i0[] i0VarArr = this.f17687d;
            if (i10 >= i0VarArr.length) {
                return -1;
            }
            if (i0Var == i0VarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i0.class != obj.getClass()) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f17685b.equals(i0Var.f17685b) && Arrays.equals(this.f17687d, i0Var.f17687d);
    }

    public final int hashCode() {
        if (this.f17688e == 0) {
            this.f17688e = a0.j.e(this.f17685b, 527, 31) + Arrays.hashCode(this.f17687d);
        }
        return this.f17688e;
    }
}
