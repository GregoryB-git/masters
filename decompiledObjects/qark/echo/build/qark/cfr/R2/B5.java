/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map
 */
package R2;

import E2.e;
import R2.C;
import R2.D5;
import R2.E5;
import R2.G2;
import R2.I2;
import R2.K;
import R2.N5;
import R2.P1;
import R2.S5;
import R2.X1;
import R2.Y1;
import R2.a2;
import R2.b6;
import R2.f;
import R2.g;
import R2.g5;
import R2.l2;
import R2.m3;
import R2.p;
import R2.x2;
import R2.z5;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.E7;
import com.google.android.gms.internal.measurement.L1;
import java.util.HashMap;
import java.util.Map;

public final class B5
extends z5 {
    public B5(D5 d52) {
        super(d52);
    }

    private final String v(String string2) {
        string2 = this.r().Q(string2);
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            Object object = Uri.parse((String)((String)K.s.a(null)));
            Uri.Builder builder = object.buildUpon();
            object = object.getAuthority();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(".");
            stringBuilder.append((String)object);
            builder.authority(stringBuilder.toString());
            return builder.build().toString();
        }
        return (String)K.s.a(null);
    }

    public final E5 u(String string2) {
        if (E7.a() && this.f().s(K.A0)) {
            this.j().K().a("sgtm feature flag enabled.");
            Object object = this.q().D0(string2);
            if (object == null) {
                return new E5(this.v(string2));
            }
            boolean bl = object.t();
            Object object2 = null;
            if (bl) {
                this.j().K().a("sgtm upload enabled in manifest.");
                Object object3 = this.r().L(object.t0());
                if (object3 != null && !TextUtils.isEmpty((CharSequence)(object = object3.S()))) {
                    object3 = object3.R();
                    a2 a22 = this.j().K();
                    object2 = TextUtils.isEmpty((CharSequence)object3) ? "Y" : "N";
                    a22.c("sgtm configured with upload_url, server_info", object, object2);
                    if (TextUtils.isEmpty((CharSequence)object3)) {
                        object2 = new E5((String)object);
                    } else {
                        object2 = new HashMap();
                        object2.put((Object)"x-google-sgtm-server-info", object3);
                        object2 = new E5((String)object, (Map)object2);
                    }
                }
            }
            if (object2 != null) {
                return object2;
            }
        }
        return new E5(this.v(string2));
    }
}

