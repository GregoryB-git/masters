package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class L {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f11653a;

    public L(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.f11653a = new Bundle(bundle);
    }

    public static int d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    public static boolean s(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    public static boolean t(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(v("gcm.n.e")));
    }

    public static boolean u(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    public static String v(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    public static String z(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public boolean a(String str) {
        String p7 = p(str);
        return "1".equals(p7) || Boolean.parseBoolean(p7);
    }

    public Integer b(String str) {
        String p7 = p(str);
        if (TextUtils.isEmpty(p7)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(p7));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + z(str) + "(" + p7 + ") into an int");
            return null;
        }
    }

    public JSONArray c(String str) {
        String p7 = p(str);
        if (TextUtils.isEmpty(p7)) {
            return null;
        }
        try {
            return new JSONArray(p7);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + z(str) + ": " + p7 + ", falling back to default");
            return null;
        }
    }

    public int[] e() {
        String str;
        JSONArray c7 = c("gcm.n.light_settings");
        if (c7 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c7.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            iArr[0] = d(c7.optString(0));
            iArr[1] = c7.optInt(1);
            iArr[2] = c7.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e7) {
            str = "LightSettings is invalid: " + c7 + ". " + e7.getMessage() + ". Skipping setting LightSettings";
            Log.w("NotificationParams", str);
            return null;
        } catch (JSONException unused) {
            str = "LightSettings is invalid: " + c7 + ". Skipping setting LightSettings";
            Log.w("NotificationParams", str);
            return null;
        }
    }

    public Uri f() {
        String p7 = p("gcm.n.link_android");
        if (TextUtils.isEmpty(p7)) {
            p7 = p("gcm.n.link");
        }
        if (TextUtils.isEmpty(p7)) {
            return null;
        }
        return Uri.parse(p7);
    }

    public Object[] g(String str) {
        JSONArray c7 = c(str + "_loc_args");
        if (c7 == null) {
            return null;
        }
        int length = c7.length();
        String[] strArr = new String[length];
        for (int i7 = 0; i7 < length; i7++) {
            strArr[i7] = c7.optString(i7);
        }
        return strArr;
    }

    public String h(String str) {
        return p(str + "_loc_key");
    }

    public String i(Resources resources, String str, String str2) {
        String h7 = h(str2);
        if (TextUtils.isEmpty(h7)) {
            return null;
        }
        int identifier = resources.getIdentifier(h7, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", z(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] g7 = g(str2);
        if (g7 == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, g7);
        } catch (MissingFormatArgumentException e7) {
            Log.w("NotificationParams", "Missing format argument for " + z(str2) + ": " + Arrays.toString(g7) + " Default value will be used.", e7);
            return null;
        }
    }

    public Long j(String str) {
        String p7 = p(str);
        if (TextUtils.isEmpty(p7)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(p7));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + z(str) + "(" + p7 + ") into a long");
            return null;
        }
    }

    public String k() {
        return p("gcm.n.android_channel_id");
    }

    public Integer l() {
        Integer b7 = b("gcm.n.notification_count");
        if (b7 == null) {
            return null;
        }
        if (b7.intValue() >= 0) {
            return b7;
        }
        Log.w("FirebaseMessaging", "notificationCount is invalid: " + b7 + ". Skipping setting notificationCount.");
        return null;
    }

    public Integer m() {
        Integer b7 = b("gcm.n.notification_priority");
        if (b7 == null) {
            return null;
        }
        if (b7.intValue() >= -2 && b7.intValue() <= 2) {
            return b7;
        }
        Log.w("FirebaseMessaging", "notificationPriority is invalid " + b7 + ". Skipping setting notificationPriority.");
        return null;
    }

    public String n(Resources resources, String str, String str2) {
        String p7 = p(str2);
        return !TextUtils.isEmpty(p7) ? p7 : i(resources, str, str2);
    }

    public String o() {
        String p7 = p("gcm.n.sound2");
        return TextUtils.isEmpty(p7) ? p("gcm.n.sound") : p7;
    }

    public String p(String str) {
        return this.f11653a.getString(w(str));
    }

    public long[] q() {
        JSONArray c7 = c("gcm.n.vibrate_timings");
        if (c7 == null) {
            return null;
        }
        try {
            if (c7.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = c7.length();
            long[] jArr = new long[length];
            for (int i7 = 0; i7 < length; i7++) {
                jArr[i7] = c7.optLong(i7);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + c7 + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public Integer r() {
        Integer b7 = b("gcm.n.visibility");
        if (b7 == null) {
            return null;
        }
        if (b7.intValue() >= -1 && b7.intValue() <= 1) {
            return b7;
        }
        Log.w("NotificationParams", "visibility is invalid: " + b7 + ". Skipping setting visibility.");
        return null;
    }

    public final String w(String str) {
        if (!this.f11653a.containsKey(str) && str.startsWith("gcm.n.")) {
            String v7 = v(str);
            if (this.f11653a.containsKey(v7)) {
                return v7;
            }
        }
        return str;
    }

    public Bundle x() {
        Bundle bundle = new Bundle(this.f11653a);
        for (String str : this.f11653a.keySet()) {
            if (!s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public Bundle y() {
        Bundle bundle = new Bundle(this.f11653a);
        for (String str : this.f11653a.keySet()) {
            if (u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
