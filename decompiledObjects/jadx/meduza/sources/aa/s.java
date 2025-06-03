package aa;

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
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f362a;

    public s(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.f362a = new Bundle(bundle);
    }

    public static boolean l(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String n(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public final boolean a(String str) {
        String j10 = j(str);
        return "1".equals(j10) || Boolean.parseBoolean(j10);
    }

    public final Integer b(String str) {
        String j10 = j(str);
        if (TextUtils.isEmpty(j10)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(j10));
        } catch (NumberFormatException unused) {
            StringBuilder l10 = defpackage.f.l("Couldn't parse value of ");
            l10.append(n(str));
            l10.append("(");
            l10.append(j10);
            l10.append(") into an int");
            Log.w("NotificationParams", l10.toString());
            return null;
        }
    }

    public final JSONArray c(String str) {
        String j10 = j(str);
        if (TextUtils.isEmpty(j10)) {
            return null;
        }
        try {
            return new JSONArray(j10);
        } catch (JSONException unused) {
            StringBuilder l10 = defpackage.f.l("Malformed JSON for key ");
            l10.append(n(str));
            l10.append(": ");
            l10.append(j10);
            l10.append(", falling back to default");
            Log.w("NotificationParams", l10.toString());
            return null;
        }
    }

    public final int[] d() {
        String str;
        JSONArray c10 = c("gcm.n.light_settings");
        if (c10 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c10.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int parseColor = Color.parseColor(c10.optString(0));
            if (parseColor == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = parseColor;
            iArr[1] = c10.optInt(1);
            iArr[2] = c10.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e10) {
            str = "LightSettings is invalid: " + c10 + ". " + e10.getMessage() + ". Skipping setting LightSettings";
            Log.w("NotificationParams", str);
            return null;
        } catch (JSONException unused) {
            str = "LightSettings is invalid: " + c10 + ". Skipping setting LightSettings";
            Log.w("NotificationParams", str);
            return null;
        }
    }

    public final Uri e() {
        String j10 = j("gcm.n.link_android");
        if (TextUtils.isEmpty(j10)) {
            j10 = j("gcm.n.link");
        }
        if (TextUtils.isEmpty(j10)) {
            return null;
        }
        return Uri.parse(j10);
    }

    public final Object[] f(String str) {
        JSONArray c10 = c(str + "_loc_args");
        if (c10 == null) {
            return null;
        }
        int length = c10.length();
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = c10.optString(i10);
        }
        return strArr;
    }

    public final String g(String str) {
        return j(str + "_loc_key");
    }

    public final Long h() {
        String j10 = j("gcm.n.event_time");
        if (TextUtils.isEmpty(j10)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(j10));
        } catch (NumberFormatException unused) {
            StringBuilder l10 = defpackage.f.l("Couldn't parse value of ");
            l10.append(n("gcm.n.event_time"));
            l10.append("(");
            l10.append(j10);
            l10.append(") into a long");
            Log.w("NotificationParams", l10.toString());
            return null;
        }
    }

    public final String i(Resources resources, String str, String str2) {
        String j10 = j(str2);
        if (!TextUtils.isEmpty(j10)) {
            return j10;
        }
        String g10 = g(str2);
        if (TextUtils.isEmpty(g10)) {
            return null;
        }
        int identifier = resources.getIdentifier(g10, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", n(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] f = f(str2);
        if (f == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, f);
        } catch (MissingFormatArgumentException e10) {
            StringBuilder l10 = defpackage.f.l("Missing format argument for ");
            l10.append(n(str2));
            l10.append(": ");
            l10.append(Arrays.toString(f));
            l10.append(" Default value will be used.");
            Log.w("NotificationParams", l10.toString(), e10);
            return null;
        }
    }

    public final String j(String str) {
        Bundle bundle = this.f362a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (this.f362a.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public final long[] k() {
        JSONArray c10 = c("gcm.n.vibrate_timings");
        if (c10 == null) {
            return null;
        }
        try {
            if (c10.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = c10.length();
            long[] jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = c10.optLong(i10);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + c10 + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public final Bundle m() {
        Bundle bundle = new Bundle(this.f362a);
        for (String str : this.f362a.keySet()) {
            if (!(str.startsWith("google.c.a.") || str.equals("from"))) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
