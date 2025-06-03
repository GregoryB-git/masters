// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H3;

import android.os.Build$VERSION;
import android.os.Build;
import V2.j;
import android.content.SharedPreferences;
import E3.f;
import java.util.Locale;
import java.util.UUID;
import s4.i;
import android.content.Context;
import java.util.regex.Pattern;

public class C implements D
{
    public static final Pattern g;
    public static final String h;
    public final E a;
    public final Context b;
    public final String c;
    public final i d;
    public final y e;
    public a f;
    
    static {
        g = Pattern.compile("[^\\p{Alnum}]");
        h = Pattern.quote("/");
    }
    
    public C(final Context b, final String c, final i d, final y e) {
        if (b == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (c != null) {
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.a = new E();
            return;
        }
        throw new IllegalArgumentException("appIdentifier must not be null");
    }
    
    public static String c() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SYN_");
        sb.append(UUID.randomUUID().toString());
        return sb.toString();
    }
    
    public static String e(final String input) {
        if (input == null) {
            return null;
        }
        return C.g.matcher(input).replaceAll("").toLowerCase(Locale.US);
    }
    
    public static boolean k(final String s) {
        return s != null && s.startsWith("SYN_");
    }
    
    @Override
    public a a() {
        // monitorenter(this)
        // monitorexit(this)
        Label_0275: {
            try {
                if (!this.n()) {
                    // monitorexit(this)
                    return this.f;
                }
            }
            finally {
                break Label_0275;
            }
            E3.f.f().i("Determining Crashlytics installation ID...");
            final SharedPreferences r = H3.i.r(this.b);
            final String string = r.getString("firebase.installation.id", (String)null);
            final f f2 = E3.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Cached Firebase Installation ID: ");
            sb.append(string);
            f2.i(sb.toString());
            a f4;
            if (this.e.d()) {
                final String d = this.d();
                final f f3 = E3.f.f();
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Fetched Firebase Installation ID: ");
                sb2.append(d);
                f3.i(sb2.toString());
                String c;
                if ((c = d) == null) {
                    if (string == null) {
                        c = c();
                    }
                    else {
                        c = string;
                    }
                }
                if (c.equals(string)) {
                    f4 = D.a.a(this.l(r), c);
                }
                else {
                    f4 = D.a.a(this.b(c, r), c);
                }
            }
            else if (k(string)) {
                f4 = D.a.b(this.l(r));
            }
            else {
                f4 = D.a.b(this.b(c(), r));
            }
            this.f = f4;
            final f f5 = E3.f.f();
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Install IDs: ");
            sb3.append(this.f);
            f5.i(sb3.toString());
            return this.f;
        }
        // monitorexit(this)
        throw;
    }
    
    public final String b(final String str, final SharedPreferences sharedPreferences) {
        synchronized (this) {
            final String e = e(UUID.randomUUID().toString());
            final f f = E3.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Created new Crashlytics installation ID: ");
            sb.append(e);
            sb.append(" for FID: ");
            sb.append(str);
            f.i(sb.toString());
            sharedPreferences.edit().putString("crashlytics.installation.id", e).putString("firebase.installation.id", str).apply();
            return e;
        }
    }
    
    public String d() {
        final j a = this.d.a();
        try {
            return (String)c0.f(a);
        }
        catch (Exception ex) {
            E3.f.f().l("Failed to retrieve Firebase Installation ID.", ex);
            return null;
        }
    }
    
    public String f() {
        return this.c;
    }
    
    public String g() {
        return this.a.a(this.b);
    }
    
    public String h() {
        return String.format(Locale.US, "%s/%s", this.m(Build.MANUFACTURER), this.m(Build.MODEL));
    }
    
    public String i() {
        return this.m(Build$VERSION.INCREMENTAL);
    }
    
    public String j() {
        return this.m(Build$VERSION.RELEASE);
    }
    
    public final String l(final SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", (String)null);
    }
    
    public final String m(final String s) {
        return s.replaceAll(C.h, "");
    }
    
    public final boolean n() {
        final a f = this.f;
        return f == null || (f.d() == null && this.e.d());
    }
}
