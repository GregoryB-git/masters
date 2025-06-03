/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.text.TextUtils
 *  android.util.Log
 *  java.lang.CharSequence
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Locale
 */
package A2;

import E2.i;
import G2.d;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import t.h;
import v2.b;
import x2.m;
import x2.p;

public abstract class y {
    public static final h a = new h();
    public static Locale b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String a(Context object) {
        String string2 = object.getPackageName();
        try {
            return d.a((Context)object).d(string2).toString();
        }
        catch (PackageManager.NameNotFoundException | NullPointerException nullPointerException) {}
        object = object.getApplicationInfo().name;
        if (!TextUtils.isEmpty((CharSequence)object)) return object;
        return string2;
    }

    public static String b(Context context) {
        return context.getResources().getString(b.g);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String c(Context context, int n8) {
        context = context.getResources();
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    n8 = 17039370;
                    do {
                        return context.getString(n8);
                        break;
                    } while (true);
                }
                n8 = b.a;
                return context.getString(n8);
            }
            n8 = b.j;
            return context.getString(n8);
        }
        n8 = b.d;
        return context.getString(n8);
    }

    public static String d(Context context, int n8) {
        Resources resources = context.getResources();
        String string2 = y.a(context);
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 != 5) {
                        if (n8 != 7) {
                            if (n8 != 9) {
                                if (n8 != 20) {
                                    switch (n8) {
                                        default: {
                                            return resources.getString(p.a, new Object[]{string2});
                                        }
                                        case 18: {
                                            return resources.getString(b.m, new Object[]{string2});
                                        }
                                        case 17: {
                                            return y.h(context, "common_google_play_services_sign_in_failed_text", string2);
                                        }
                                        case 16: 
                                    }
                                    return y.h(context, "common_google_play_services_api_unavailable_text", string2);
                                }
                                return y.h(context, "common_google_play_services_restricted_profile_text", string2);
                            }
                            return resources.getString(b.i, new Object[]{string2});
                        }
                        return y.h(context, "common_google_play_services_network_error_text", string2);
                    }
                    return y.h(context, "common_google_play_services_invalid_account_text", string2);
                }
                return resources.getString(b.b, new Object[]{string2});
            }
            if (i.d(context)) {
                return resources.getString(b.n);
            }
            return resources.getString(b.k, new Object[]{string2});
        }
        return resources.getString(b.e, new Object[]{string2});
    }

    public static String e(Context context, int n8) {
        if (n8 != 6 && n8 != 19) {
            return y.d(context, n8);
        }
        return y.h(context, "common_google_play_services_resolution_required_text", y.a(context));
    }

    public static String f(Context context, int n8) {
        String string2 = n8 == 6 ? y.i(context, "common_google_play_services_resolution_required_title") : y.g(context, n8);
        if (string2 == null) {
            return context.getResources().getString(b.h);
        }
        return string2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static String g(Context var0, int var1_1) {
        var2_2 = var0.getResources();
        switch (var1_1) {
            default: {
                var0 = new StringBuilder();
                var0.append("Unexpected error code ");
                var0.append(var1_1);
                var0 = var0.toString();
                ** GOTO lbl29
            }
            case 20: {
                Log.e((String)"GoogleApiAvailability", (String)"The current user profile is restricted and could not use authenticated features.");
                return y.i((Context)var0, "common_google_play_services_restricted_profile_title");
            }
            case 17: {
                Log.e((String)"GoogleApiAvailability", (String)"The specified account could not be signed in.");
                return y.i((Context)var0, "common_google_play_services_sign_in_failed_title");
            }
            case 16: {
                var0 = "One of the API components you attempted to connect to is not available.";
                ** GOTO lbl29
            }
            case 11: {
                var0 = "The application is not licensed to the user.";
                ** GOTO lbl29
            }
            case 10: {
                var0 = "Developer error occurred. Please see logs for detailed information";
                ** GOTO lbl29
            }
            case 9: {
                var0 = "Google Play services is invalid. Cannot recover.";
                ** GOTO lbl29
            }
            case 8: {
                var0 = "Internal error occurred. Please see logs for detailed information";
lbl29: // 6 sources:
                Log.e((String)"GoogleApiAvailability", (String)var0);
                return null;
            }
            case 7: {
                Log.e((String)"GoogleApiAvailability", (String)"Network error occurred. Please retry request later.");
                return y.i((Context)var0, "common_google_play_services_network_error_title");
            }
            case 5: {
                Log.e((String)"GoogleApiAvailability", (String)"An invalid account was specified when connecting. Please provide a valid account.");
                return y.i((Context)var0, "common_google_play_services_invalid_account_title");
            }
            case 4: 
            case 6: 
            case 18: {
                return null;
            }
            case 3: {
                return var2_2.getString(b.c);
            }
            case 2: {
                return var2_2.getString(b.l);
            }
            case 1: 
        }
        return var2_2.getString(b.f);
    }

    public static String h(Context object, String string2, String string3) {
        Resources resources = object.getResources();
        string2 = y.i((Context)object, string2);
        object = string2;
        if (string2 == null) {
            object = resources.getString(p.a);
        }
        return String.format((Locale)resources.getConfiguration().locale, (String)object, (Object[])new Object[]{string3});
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String i(Context object, String string2) {
        h h8 = a;
        synchronized (h8) {
            try {
                Object object2 = E.d.a(object.getResources().getConfiguration()).c(0);
                if (!object2.equals((Object)b)) {
                    h8.clear();
                    b = object2;
                }
                if ((object2 = (String)h8.get(string2)) != null) {
                    return object2;
                }
                if ((object = m.c((Context)object)) == null) {
                    return null;
                }
                int n8 = object.getIdentifier(string2, "string", "com.google.android.gms");
                if (n8 == 0) {
                    object = new StringBuilder();
                    object.append("Missing resource: ");
                    object.append(string2);
                    Log.w((String)"GoogleApiAvailability", (String)object.toString());
                    return null;
                }
                if (TextUtils.isEmpty((CharSequence)(object = object.getString(n8)))) {
                    object = new StringBuilder();
                    object.append("Got empty resource: ");
                    object.append(string2);
                    Log.w((String)"GoogleApiAvailability", (String)object.toString());
                    return null;
                }
                h8.put(string2, object);
                return object;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

