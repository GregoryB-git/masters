/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Map
 *  org.json.JSONObject
 */
package O3;

import E3.f;
import H3.D;
import H3.s;
import L3.a;
import L3.b;
import O3.j;
import O3.k;
import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class c
implements k {
    public final String a;
    public final b b;
    public final f c;

    public c(String string2, b b8) {
        this(string2, b8, f.f());
    }

    public c(String string2, b b8, f f8) {
        if (string2 != null) {
            this.c = f8;
            this.b = b8;
            this.a = string2;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    @Override
    public JSONObject a(j object, boolean bl) {
        if (bl) {
            try {
                Map map = this.f((j)object);
                object = this.b(this.d(map), (j)object);
                f f8 = this.c;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Requesting settings from ");
                stringBuilder.append(this.a);
                f8.b(stringBuilder.toString());
                f8 = this.c;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Settings query params were: ");
                stringBuilder.append((Object)map);
                f8.i(stringBuilder.toString());
                object = this.g(object.c());
                return object;
            }
            catch (IOException iOException) {
                this.c.e("Settings request failed.", (Throwable)iOException);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }

    public final a b(a a8, j j8) {
        this.c(a8, "X-CRASHLYTICS-GOOGLE-APP-ID", j8.a);
        this.c(a8, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        this.c(a8, "X-CRASHLYTICS-API-CLIENT-VERSION", s.l());
        this.c(a8, "Accept", "application/json");
        this.c(a8, "X-CRASHLYTICS-DEVICE-MODEL", j8.b);
        this.c(a8, "X-CRASHLYTICS-OS-BUILD-VERSION", j8.c);
        this.c(a8, "X-CRASHLYTICS-OS-DISPLAY-VERSION", j8.d);
        this.c(a8, "X-CRASHLYTICS-INSTALLATION-ID", j8.e.a().c());
        return a8;
    }

    public final void c(a a8, String string2, String string3) {
        if (string3 != null) {
            a8.d(string2, string3);
        }
    }

    public a d(Map object) {
        object = this.b.a(this.a, (Map)object);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Crashlytics Android SDK/");
        stringBuilder.append(s.l());
        return object.d("User-Agent", stringBuilder.toString()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    public final JSONObject e(String string2) {
        try {
            JSONObject jSONObject = new JSONObject(string2);
            return jSONObject;
        }
        catch (Exception exception) {
            f f8 = this.c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse settings JSON from ");
            stringBuilder.append(this.a);
            f8.l(stringBuilder.toString(), (Throwable)exception);
            f f9 = this.c;
            f8 = new StringBuilder();
            f8.append("Settings response ");
            f8.append(string2);
            f9.k(f8.toString());
            return null;
        }
    }

    public final Map f(j object) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"build_version", (Object)object.h);
        hashMap.put((Object)"display_version", (Object)object.g);
        hashMap.put((Object)"source", (Object)Integer.toString((int)object.i));
        object = object.f;
        if (!TextUtils.isEmpty((CharSequence)object)) {
            hashMap.put((Object)"instance", object);
        }
        return hashMap;
    }

    public JSONObject g(L3.c object) {
        int n8 = object.b();
        f f8 = this.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Settings response code was: ");
        stringBuilder.append(n8);
        f8.i(stringBuilder.toString());
        if (this.h(n8)) {
            return this.e(object.a());
        }
        object = this.c;
        f8 = new StringBuilder();
        f8.append("Settings request failed; (status: ");
        f8.append(n8);
        f8.append(") from ");
        f8.append(this.a);
        object.d(f8.toString());
        return null;
    }

    public boolean h(int n8) {
        if (n8 != 200 && n8 != 201 && n8 != 202 && n8 != 203) {
            return false;
        }
        return true;
    }
}

