/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.charset.Charset
 */
package N3;

import H3.H;
import H3.v;
import J3.B;
import K3.h;
import N3.a;
import N3.e;
import O3.d;
import O3.i;
import V2.j;
import V2.k;
import android.content.Context;
import c2.g;
import f2.f;
import f2.u;
import java.nio.charset.Charset;

public class b {
    public static final h c = new h();
    public static final String d = b.e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    public static final String e = b.e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    public static final c2.e f = new a();
    public final e a;
    public final c2.e b;

    public b(e e8, c2.e e9) {
        this.a = e8;
        this.b = e9;
    }

    public static /* synthetic */ byte[] a(B b8) {
        return b.d(b8);
    }

    public static b b(Context object, i i8, H h8) {
        u.f((Context)object);
        object = u.c().g(new d2.a(d, e));
        c2.b b8 = c2.b.b("json");
        c2.e e8 = f;
        return new b(new e(object.a("FIREBASE_CRASHLYTICS_REPORT", B.class, b8, e8), i8.b(), h8), e8);
    }

    public static /* synthetic */ byte[] d(B b8) {
        return c.G(b8).getBytes(Charset.forName((String)"UTF-8"));
    }

    public static String e(String string2, String string3) {
        int n8 = string2.length() - string3.length();
        if (n8 >= 0 && n8 <= 1) {
            StringBuilder stringBuilder = new StringBuilder(string2.length() + string3.length());
            for (n8 = 0; n8 < string2.length(); ++n8) {
                stringBuilder.append(string2.charAt(n8));
                if (string3.length() <= n8) continue;
                stringBuilder.append(string3.charAt(n8));
            }
            return stringBuilder.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    public j c(v v8, boolean bl) {
        return this.a.i(v8, bl).a();
    }
}

