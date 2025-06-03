package A2;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import v2.AbstractC2051b;
import x2.AbstractC2199m;
import x2.AbstractC2202p;

/* renamed from: A2.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0338y {

    /* renamed from: a, reason: collision with root package name */
    public static final t.h f538a = new t.h();

    /* renamed from: b, reason: collision with root package name */
    public static Locale f539b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return G2.d.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context) {
        return context.getResources().getString(AbstractC2051b.f20128g);
    }

    public static String c(Context context, int i7) {
        return context.getResources().getString(i7 != 1 ? i7 != 2 ? i7 != 3 ? R.string.ok : AbstractC2051b.f20122a : AbstractC2051b.f20131j : AbstractC2051b.f20125d);
    }

    public static String d(Context context, int i7) {
        Resources resources = context.getResources();
        String a7 = a(context);
        if (i7 == 1) {
            return resources.getString(AbstractC2051b.f20126e, a7);
        }
        if (i7 == 2) {
            return E2.i.d(context) ? resources.getString(AbstractC2051b.f20135n) : resources.getString(AbstractC2051b.f20132k, a7);
        }
        if (i7 == 3) {
            return resources.getString(AbstractC2051b.f20123b, a7);
        }
        if (i7 == 5) {
            return h(context, "common_google_play_services_invalid_account_text", a7);
        }
        if (i7 == 7) {
            return h(context, "common_google_play_services_network_error_text", a7);
        }
        if (i7 == 9) {
            return resources.getString(AbstractC2051b.f20130i, a7);
        }
        if (i7 == 20) {
            return h(context, "common_google_play_services_restricted_profile_text", a7);
        }
        switch (i7) {
            case 16:
                return h(context, "common_google_play_services_api_unavailable_text", a7);
            case 17:
                return h(context, "common_google_play_services_sign_in_failed_text", a7);
            case 18:
                return resources.getString(AbstractC2051b.f20134m, a7);
            default:
                return resources.getString(AbstractC2202p.f21194a, a7);
        }
    }

    public static String e(Context context, int i7) {
        return (i7 == 6 || i7 == 19) ? h(context, "common_google_play_services_resolution_required_text", a(context)) : d(context, i7);
    }

    public static String f(Context context, int i7) {
        String i8 = i7 == 6 ? i(context, "common_google_play_services_resolution_required_title") : g(context, i7);
        return i8 == null ? context.getResources().getString(AbstractC2051b.f20129h) : i8;
    }

    public static String g(Context context, int i7) {
        String str;
        Resources resources = context.getResources();
        switch (i7) {
            case 1:
                return resources.getString(AbstractC2051b.f20127f);
            case 2:
                return resources.getString(AbstractC2051b.f20133l);
            case 3:
                return resources.getString(AbstractC2051b.f20124c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return i(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case 19:
            default:
                str = "Unexpected error code " + i7;
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return i(context, "common_google_play_services_restricted_profile_title");
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    public static String h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i7 = i(context, str);
        if (i7 == null) {
            i7 = resources.getString(AbstractC2202p.f21194a);
        }
        return String.format(resources.getConfiguration().locale, i7, str2);
    }

    public static String i(Context context, String str) {
        t.h hVar = f538a;
        synchronized (hVar) {
            try {
                Locale c7 = E.d.a(context.getResources().getConfiguration()).c(0);
                if (!c7.equals(f539b)) {
                    hVar.clear();
                    f539b = c7;
                }
                String str2 = (String) hVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources c8 = AbstractC2199m.c(context);
                if (c8 == null) {
                    return null;
                }
                int identifier = c8.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = c8.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    hVar.put(str, string);
                    return string;
                }
                Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
