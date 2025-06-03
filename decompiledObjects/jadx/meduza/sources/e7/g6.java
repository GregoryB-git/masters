package e7;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzgc;

/* loaded from: classes.dex */
public final class g6 extends z5 {
    public g6(i6 i6Var) {
        super(i6Var);
    }

    public static boolean r(String str) {
        String a10 = h0.t.a(null);
        if (TextUtils.isEmpty(a10)) {
            return false;
        }
        for (String str2 : a10.split(",")) {
            if (str.equalsIgnoreCase(str2.trim())) {
                return true;
            }
        }
        return false;
    }

    public final boolean p(String str, String str2) {
        k1 l02;
        zzgc.zzd C = o().C(str);
        if (C == null || (l02 = n().l0(str)) == null) {
            return false;
        }
        if ((C.zzq() && C.zzh().zza() == 100) || k().p0(str, l02.k())) {
            return true;
        }
        return !TextUtils.isEmpty(str2) && Math.abs(str2.hashCode() % 100) < C.zzh().zza();
    }

    public final String q(String str) {
        String G = o().G(str);
        if (TextUtils.isEmpty(G)) {
            return h0.f4269r.a(null);
        }
        Uri parse = Uri.parse(h0.f4269r.a(null));
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.authority(G + "." + parse.getAuthority());
        return buildUpon.build().toString();
    }
}
