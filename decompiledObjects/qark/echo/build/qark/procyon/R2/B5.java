// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import com.google.android.gms.internal.measurement.L1;
import java.util.Map;
import java.util.HashMap;
import com.google.android.gms.internal.measurement.E7;
import E2.e;
import android.content.Context;
import android.net.Uri$Builder;
import android.net.Uri;
import android.text.TextUtils;

public final class B5 extends z5
{
    public B5(final D5 d5) {
        super(d5);
    }
    
    private final String v(String q) {
        q = this.r().Q(q);
        if (!TextUtils.isEmpty((CharSequence)q)) {
            final Uri parse = Uri.parse((String)K.s.a(null));
            final Uri$Builder buildUpon = parse.buildUpon();
            final String authority = parse.getAuthority();
            final StringBuilder sb = new StringBuilder();
            sb.append(q);
            sb.append(".");
            sb.append(authority);
            buildUpon.authority(sb.toString());
            return buildUpon.build().toString();
        }
        return (String)K.s.a(null);
    }
    
    public final E5 u(final String s) {
        if (E7.a() && this.f().s(K.A0)) {
            this.j().K().a("sgtm feature flag enabled.");
            final I2 d0 = this.q().D0(s);
            if (d0 == null) {
                return new E5(this.v(s));
            }
            final boolean t = d0.t();
            E5 e5 = null;
            if (t) {
                this.j().K().a("sgtm upload enabled in manifest.");
                final L1 l = this.r().L(d0.t0());
                if (l != null) {
                    final String s2 = l.S();
                    if (!TextUtils.isEmpty((CharSequence)s2)) {
                        final String r = l.R();
                        final a2 k = this.j().K();
                        String s3;
                        if (TextUtils.isEmpty((CharSequence)r)) {
                            s3 = "Y";
                        }
                        else {
                            s3 = "N";
                        }
                        k.c("sgtm configured with upload_url, server_info", s2, s3);
                        if (TextUtils.isEmpty((CharSequence)r)) {
                            e5 = new E5(s2);
                        }
                        else {
                            final HashMap<String, String> hashMap = new HashMap<String, String>();
                            hashMap.put("x-google-sgtm-server-info", r);
                            e5 = new E5(s2, hashMap);
                        }
                    }
                }
            }
            if (e5 != null) {
                return e5;
            }
        }
        return new E5(this.v(s));
    }
}
