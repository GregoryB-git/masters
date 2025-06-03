/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Locale
 *  java.util.UUID
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package H3;

import E3.f;
import H3.D;
import H3.E;
import H3.c0;
import H3.i;
import H3.y;
import V2.j;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C
implements D {
    public static final Pattern g = Pattern.compile((String)"[^\\p{Alnum}]");
    public static final String h = Pattern.quote((String)"/");
    public final E a;
    public final Context b;
    public final String c;
    public final s4.i d;
    public final y e;
    public D.a f;

    public C(Context context, String string2, s4.i i8, y y8) {
        if (context != null) {
            if (string2 != null) {
                this.b = context;
                this.c = string2;
                this.d = i8;
                this.e = y8;
                this.a = new E();
                return;
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    public static String c() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SYN_");
        stringBuilder.append(UUID.randomUUID().toString());
        return stringBuilder.toString();
    }

    public static String e(String string2) {
        if (string2 == null) {
            return null;
        }
        return g.matcher((CharSequence)string2).replaceAll("").toLowerCase(Locale.US);
    }

    public static boolean k(String string2) {
        if (string2 != null && string2.startsWith("SYN_")) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public D.a a() {
        synchronized (this) {
            Throwable throwable2;
            block7 : {
                try {
                    if (!this.n()) {
                        return this.f;
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                f.f().i("Determining Crashlytics installation ID...");
                SharedPreferences sharedPreferences = i.r(this.b);
                String string2 = sharedPreferences.getString("firebase.installation.id", null);
                Object object = f.f();
                Object object2 = new StringBuilder();
                object2.append("Cached Firebase Installation ID: ");
                object2.append(string2);
                object.i(object2.toString());
                if (this.e.d()) {
                    object2 = this.d();
                    object = f.f();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Fetched Firebase Installation ID: ");
                    stringBuilder.append((String)object2);
                    object.i(stringBuilder.toString());
                    object = object2;
                    if (object2 == null) {
                        object = string2 == null ? C.c() : string2;
                    }
                    object = object.equals((Object)string2) ? D.a.a(this.l(sharedPreferences), (String)object) : D.a.a(this.b((String)object, sharedPreferences), (String)object);
                } else {
                    object = C.k(string2) ? D.a.b(this.l(sharedPreferences)) : D.a.b(this.b(C.c(), sharedPreferences));
                }
                this.f = object;
                object = f.f();
                string2 = new StringBuilder();
                string2.append("Install IDs: ");
                string2.append((Object)this.f);
                object.i(string2.toString());
                return this.f;
            }
            throw throwable2;
        }
    }

    public final String b(String string2, SharedPreferences sharedPreferences) {
        synchronized (this) {
            String string3 = C.e(UUID.randomUUID().toString());
            f f8 = f.f();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Created new Crashlytics installation ID: ");
            stringBuilder.append(string3);
            stringBuilder.append(" for FID: ");
            stringBuilder.append(string2);
            f8.i(stringBuilder.toString());
            sharedPreferences.edit().putString("crashlytics.installation.id", string3).putString("firebase.installation.id", string2).apply();
            return string3;
        }
    }

    public String d() {
        Object object = this.d.a();
        try {
            object = (String)c0.f((j)object);
            return object;
        }
        catch (Exception exception) {
            f.f().l("Failed to retrieve Firebase Installation ID.", (Throwable)exception);
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
        return String.format((Locale)Locale.US, (String)"%s/%s", (Object[])new Object[]{this.m(Build.MANUFACTURER), this.m(Build.MODEL)});
    }

    public String i() {
        return this.m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return this.m(Build.VERSION.RELEASE);
    }

    public final String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    public final String m(String string2) {
        return string2.replaceAll(h, "");
    }

    public final boolean n() {
        D.a a8 = this.f;
        if (!(a8 == null || a8.d() == null && this.e.d())) {
            return false;
        }
        return true;
    }
}

