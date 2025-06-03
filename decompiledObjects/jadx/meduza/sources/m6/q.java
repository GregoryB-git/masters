package m6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import io.meduza.meduza.R;
import java.util.Locale;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final r.h f10306a = new r.h();

    /* renamed from: b, reason: collision with root package name */
    public static Locale f10307b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = x6.d.a(context).f17198a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i10) {
        Resources resources = context.getResources();
        String a10 = a(context);
        if (i10 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, a10);
        }
        if (i10 == 2) {
            return x6.b.f0(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, a10);
        }
        if (i10 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, a10);
        }
        if (i10 == 5) {
            return d(context, "common_google_play_services_invalid_account_text", a10);
        }
        if (i10 == 7) {
            return d(context, "common_google_play_services_network_error_text", a10);
        }
        if (i10 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, a10);
        }
        if (i10 == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", a10);
        }
        switch (i10) {
            case 16:
                return d(context, "common_google_play_services_api_unavailable_text", a10);
            case 17:
                return d(context, "common_google_play_services_sign_in_failed_text", a10);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, a10);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, a10);
        }
    }

    public static String c(Context context, int i10) {
        String str;
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
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
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                str = "Unexpected error code " + i10;
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e10 = e(context, str);
        if (e10 == null) {
            e10 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e10, str2);
    }

    public static String e(Context context, String str) {
        Resources resources;
        r.h hVar = f10306a;
        synchronized (hVar) {
            try {
                Configuration configuration = context.getResources().getConfiguration();
                Locale c10 = (Build.VERSION.SDK_INT >= 24 ? new a0.i(new a0.m(a0.f.a(configuration))) : a0.i.a(configuration.locale)).c(0);
                if (!c10.equals(f10307b)) {
                    hVar.clear();
                    f10307b = c10;
                }
                String str2 = (String) hVar.getOrDefault(str, null);
                if (str2 != null) {
                    return str2;
                }
                int i10 = j6.i.f8499e;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources == null) {
                    return null;
                }
                int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = resources.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    f10306a.put(str, string);
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
