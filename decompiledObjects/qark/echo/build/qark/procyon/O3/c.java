// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O3;

import android.text.TextUtils;
import java.util.HashMap;
import H3.s;
import L3.a;
import java.util.Map;
import java.io.IOException;
import org.json.JSONObject;
import E3.f;
import L3.b;

public class c implements k
{
    public final String a;
    public final b b;
    public final f c;
    
    public c(final String s, final b b) {
        this(s, b, f.f());
    }
    
    public c(final String a, final b b, final f c) {
        if (a != null) {
            this.c = c;
            this.b = b;
            this.a = a;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
    
    @Override
    public JSONObject a(final j j, final boolean b) {
        if (b) {
            try {
                final Map f = this.f(j);
                final a b2 = this.b(this.d(f), j);
                final f c = this.c;
                final StringBuilder sb = new StringBuilder();
                sb.append("Requesting settings from ");
                sb.append(this.a);
                c.b(sb.toString());
                final f c2 = this.c;
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Settings query params were: ");
                sb2.append(f);
                c2.i(sb2.toString());
                return this.g(b2.c());
            }
            catch (IOException ex) {
                this.c.e("Settings request failed.", ex);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }
    
    public final a b(final a a, final j j) {
        this.c(a, "X-CRASHLYTICS-GOOGLE-APP-ID", j.a);
        this.c(a, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        this.c(a, "X-CRASHLYTICS-API-CLIENT-VERSION", s.l());
        this.c(a, "Accept", "application/json");
        this.c(a, "X-CRASHLYTICS-DEVICE-MODEL", j.b);
        this.c(a, "X-CRASHLYTICS-OS-BUILD-VERSION", j.c);
        this.c(a, "X-CRASHLYTICS-OS-DISPLAY-VERSION", j.d);
        this.c(a, "X-CRASHLYTICS-INSTALLATION-ID", j.e.a().c());
        return a;
    }
    
    public final void c(final a a, final String s, final String s2) {
        if (s2 != null) {
            a.d(s, s2);
        }
    }
    
    public a d(final Map map) {
        final a a = this.b.a(this.a, map);
        final StringBuilder sb = new StringBuilder();
        sb.append("Crashlytics Android SDK/");
        sb.append(s.l());
        return a.d("User-Agent", sb.toString()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }
    
    public final JSONObject e(final String str) {
        try {
            return new JSONObject(str);
        }
        catch (Exception ex) {
            final f c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse settings JSON from ");
            sb.append(this.a);
            c.l(sb.toString(), ex);
            final f c2 = this.c;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Settings response ");
            sb2.append(str);
            c2.k(sb2.toString());
            return null;
        }
    }
    
    public final Map f(final j j) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("build_version", j.h);
        hashMap.put("display_version", j.g);
        hashMap.put("source", Integer.toString(j.i));
        final String f = j.f;
        if (!TextUtils.isEmpty((CharSequence)f)) {
            hashMap.put("instance", f);
        }
        return hashMap;
    }
    
    public JSONObject g(final L3.c c) {
        final int b = c.b();
        final f c2 = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("Settings response code was: ");
        sb.append(b);
        c2.i(sb.toString());
        if (this.h(b)) {
            return this.e(c.a());
        }
        final f c3 = this.c;
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Settings request failed; (status: ");
        sb2.append(b);
        sb2.append(") from ");
        sb2.append(this.a);
        c3.d(sb2.toString());
        return null;
    }
    
    public boolean h(final int n) {
        return n == 200 || n == 201 || n == 202 || n == 203;
    }
}
