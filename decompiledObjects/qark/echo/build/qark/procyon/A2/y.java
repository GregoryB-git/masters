// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import x2.m;
import android.util.Log;
import E2.i;
import x2.p;
import android.content.res.Resources;
import v2.b;
import android.content.pm.PackageManager$NameNotFoundException;
import android.text.TextUtils;
import G2.d;
import android.content.Context;
import java.util.Locale;
import t.h;

public abstract class y
{
    public static final h a;
    public static Locale b;
    
    static {
        a = new h();
    }
    
    public static String a(Context name) {
        final String packageName = name.getPackageName();
        while (true) {
            try {
                return d.a(name).d(packageName).toString();
                name = (Context)name.getApplicationInfo().name;
                // iftrue(Label_0036:, !TextUtils.isEmpty((CharSequence)name))
                return packageName;
                Label_0036: {
                    return (String)name;
                }
            }
            catch (PackageManager$NameNotFoundException | NullPointerException ex) {
                continue;
            }
            break;
        }
    }
    
    public static String b(final Context context) {
        return context.getResources().getString(v2.b.g);
    }
    
    public static String c(final Context context, int n) {
        final Resources resources = context.getResources();
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    n = 17039370;
                }
                else {
                    n = v2.b.a;
                }
            }
            else {
                n = v2.b.j;
            }
        }
        else {
            n = v2.b.d;
        }
        return resources.getString(n);
    }
    
    public static String d(final Context context, final int n) {
        final Resources resources = context.getResources();
        final String a = a(context);
        if (n == 1) {
            return resources.getString(v2.b.e, new Object[] { a });
        }
        if (n != 2) {
            if (n == 3) {
                return resources.getString(v2.b.b, new Object[] { a });
            }
            if (n == 5) {
                return h(context, "common_google_play_services_invalid_account_text", a);
            }
            if (n == 7) {
                return h(context, "common_google_play_services_network_error_text", a);
            }
            if (n == 9) {
                return resources.getString(v2.b.i, new Object[] { a });
            }
            if (n == 20) {
                return h(context, "common_google_play_services_restricted_profile_text", a);
            }
            switch (n) {
                default: {
                    return resources.getString(p.a, new Object[] { a });
                }
                case 18: {
                    return resources.getString(v2.b.m, new Object[] { a });
                }
                case 17: {
                    return h(context, "common_google_play_services_sign_in_failed_text", a);
                }
                case 16: {
                    return h(context, "common_google_play_services_api_unavailable_text", a);
                }
            }
        }
        else {
            if (i.d(context)) {
                return resources.getString(v2.b.n);
            }
            return resources.getString(v2.b.k, new Object[] { a });
        }
    }
    
    public static String e(final Context context, final int n) {
        if (n != 6 && n != 19) {
            return d(context, n);
        }
        return h(context, "common_google_play_services_resolution_required_text", a(context));
    }
    
    public static String f(final Context context, final int n) {
        String s;
        if (n == 6) {
            s = i(context, "common_google_play_services_resolution_required_title");
        }
        else {
            s = g(context, n);
        }
        if (s == null) {
            return context.getResources().getString(v2.b.h);
        }
        return s;
    }
    
    public static String g(final Context context, final int i) {
        final Resources resources = context.getResources();
        String string = null;
        switch (i) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unexpected error code ");
                sb.append(i);
                string = sb.toString();
                break;
            }
            case 20: {
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return i(context, "common_google_play_services_restricted_profile_title");
            }
            case 17: {
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return i(context, "common_google_play_services_sign_in_failed_title");
            }
            case 16: {
                string = "One of the API components you attempted to connect to is not available.";
                break;
            }
            case 11: {
                string = "The application is not licensed to the user.";
                break;
            }
            case 10: {
                string = "Developer error occurred. Please see logs for detailed information";
                break;
            }
            case 9: {
                string = "Google Play services is invalid. Cannot recover.";
                break;
            }
            case 8: {
                string = "Internal error occurred. Please see logs for detailed information";
                break;
            }
            case 7: {
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return i(context, "common_google_play_services_network_error_title");
            }
            case 5: {
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return i(context, "common_google_play_services_invalid_account_title");
            }
            case 4:
            case 6:
            case 18: {
                return null;
            }
            case 3: {
                return resources.getString(v2.b.c);
            }
            case 2: {
                return resources.getString(v2.b.l);
            }
            case 1: {
                return resources.getString(v2.b.f);
            }
        }
        Log.e("GoogleApiAvailability", string);
        return null;
    }
    
    public static String h(final Context context, String s, final String s2) {
        final Resources resources = context.getResources();
        String format;
        s = (format = i(context, s));
        if (s == null) {
            format = resources.getString(p.a);
        }
        return String.format(resources.getConfiguration().locale, format, s2);
    }
    
    public static String i(final Context context, final String s) {
        final h a = y.a;
        // monitorenter(a)
        while (true) {
            try {
                final Locale c = E.d.a(context.getResources().getConfiguration()).c(0);
                if (!c.equals(y.b)) {
                    a.clear();
                    y.b = c;
                }
                final String s2 = (String)a.get(s);
                if (s2 != null) {
                    // monitorexit(a)
                    return s2;
                }
                final Resources c2 = m.c(context);
                if (c2 == null) {
                    // monitorexit(a)
                    return null;
                }
                final int identifier = c2.getIdentifier(s, "string", "com.google.android.gms");
                if (identifier == 0) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Missing resource: ");
                    sb.append(s);
                    Log.w("GoogleApiAvailability", sb.toString());
                    // monitorexit(a)
                    return null;
                }
                final String string = c2.getString(identifier);
                if (TextUtils.isEmpty((CharSequence)string)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Got empty resource: ");
                    sb2.append(s);
                    Log.w("GoogleApiAvailability", sb2.toString());
                    // monitorexit(a)
                    return null;
                }
                a.put(s, string);
                // monitorexit(a)
                return string;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
