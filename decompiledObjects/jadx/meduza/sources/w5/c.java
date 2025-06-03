package w5;

import v5.u;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f16332a;

    public c(String str) {
        this.f16332a = str;
    }

    public static c a(u uVar) {
        String str;
        uVar.H(2);
        int v10 = uVar.v();
        int i10 = v10 >> 1;
        int v11 = ((uVar.v() >> 3) & 31) | ((v10 & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        sb2.append(v11 >= 10 ? "." : ".0");
        sb2.append(v11);
        return new c(sb2.toString());
    }
}
