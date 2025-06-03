package H3;

import H3.D;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class C implements D {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f2216g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h, reason: collision with root package name */
    public static final String f2217h = Pattern.quote("/");

    /* renamed from: a, reason: collision with root package name */
    public final E f2218a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2219b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2220c;

    /* renamed from: d, reason: collision with root package name */
    public final s4.i f2221d;

    /* renamed from: e, reason: collision with root package name */
    public final C0402y f2222e;

    /* renamed from: f, reason: collision with root package name */
    public D.a f2223f;

    public C(Context context, String str, s4.i iVar, C0402y c0402y) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f2219b = context;
        this.f2220c = str;
        this.f2221d = iVar;
        this.f2222e = c0402y;
        this.f2218a = new E();
    }

    public static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        return f2216g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    public static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    @Override // H3.D
    public synchronized D.a a() {
        D.a b7;
        if (!n()) {
            return this.f2223f;
        }
        E3.f.f().i("Determining Crashlytics installation ID...");
        SharedPreferences r7 = AbstractC0387i.r(this.f2219b);
        String string = r7.getString("firebase.installation.id", null);
        E3.f.f().i("Cached Firebase Installation ID: " + string);
        if (this.f2222e.d()) {
            String d7 = d();
            E3.f.f().i("Fetched Firebase Installation ID: " + d7);
            if (d7 == null) {
                d7 = string == null ? c() : string;
            }
            b7 = d7.equals(string) ? D.a.a(l(r7), d7) : D.a.a(b(d7, r7), d7);
        } else {
            b7 = k(string) ? D.a.b(l(r7)) : D.a.b(b(c(), r7));
        }
        this.f2223f = b7;
        E3.f.f().i("Install IDs: " + this.f2223f);
        return this.f2223f;
    }

    public final synchronized String b(String str, SharedPreferences sharedPreferences) {
        String e7;
        e7 = e(UUID.randomUUID().toString());
        E3.f.f().i("Created new Crashlytics installation ID: " + e7 + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e7).putString("firebase.installation.id", str).apply();
        return e7;
    }

    public String d() {
        try {
            return (String) c0.f(this.f2221d.a());
        } catch (Exception e7) {
            E3.f.f().l("Failed to retrieve Firebase Installation ID.", e7);
            return null;
        }
    }

    public String f() {
        return this.f2220c;
    }

    public String g() {
        return this.f2218a.a(this.f2219b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }

    public final String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    public final String m(String str) {
        return str.replaceAll(f2217h, "");
    }

    public final boolean n() {
        D.a aVar = this.f2223f;
        return aVar == null || (aVar.d() == null && this.f2222e.d());
    }
}
