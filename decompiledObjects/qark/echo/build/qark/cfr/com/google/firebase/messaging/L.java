/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.Color
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NullPointerException
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.MissingFormatArgumentException
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONException
 */
package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

public class L {
    public final Bundle a;

    public L(Bundle bundle) {
        if (bundle != null) {
            this.a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    public static int d(String string2) {
        int n8 = Color.parseColor((String)string2);
        if (n8 != -16777216) {
            return n8;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    public static boolean s(String string2) {
        if (!string2.startsWith("google.c.a.") && !string2.equals((Object)"from")) {
            return false;
        }
        return true;
    }

    public static boolean t(Bundle bundle) {
        if (!"1".equals((Object)bundle.getString("gcm.n.e")) && !"1".equals((Object)bundle.getString(L.v("gcm.n.e")))) {
            return false;
        }
        return true;
    }

    public static boolean u(String string2) {
        if (!(string2.startsWith("google.c.") || string2.startsWith("gcm.n.") || string2.startsWith("gcm.notification."))) {
            return false;
        }
        return true;
    }

    public static String v(String string2) {
        if (!string2.startsWith("gcm.n.")) {
            return string2;
        }
        return string2.replace((CharSequence)"gcm.n.", (CharSequence)"gcm.notification.");
    }

    public static String z(String string2) {
        String string3 = string2;
        if (string2.startsWith("gcm.n.")) {
            string3 = string2.substring(6);
        }
        return string3;
    }

    public boolean a(String string2) {
        if (!"1".equals((Object)(string2 = this.p(string2))) && !Boolean.parseBoolean((String)string2)) {
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Integer b(String string2) {
        String string3 = this.p(string2);
        if (!TextUtils.isEmpty((CharSequence)string3)) {
            int n8;
            try {
                n8 = Integer.parseInt((String)string3);
            }
            catch (NumberFormatException numberFormatException) {}
            return n8;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Couldn't parse value of ");
            stringBuilder.append(L.z(string2));
            stringBuilder.append("(");
            stringBuilder.append(string3);
            stringBuilder.append(") into an int");
            Log.w((String)"NotificationParams", (String)stringBuilder.toString());
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JSONArray c(String string2) {
        String string3 = this.p(string2);
        if (TextUtils.isEmpty((CharSequence)string3)) return null;
        try {
            return new JSONArray(string3);
        }
        catch (JSONException jSONException) {}
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Malformed JSON for key ");
        stringBuilder.append(L.z(string2));
        stringBuilder.append(": ");
        stringBuilder.append(string3);
        stringBuilder.append(", falling back to default");
        Log.w((String)"NotificationParams", (String)stringBuilder.toString());
        return null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public int[] e() {
        Object object;
        block4 : {
            object = this.c("gcm.n.light_settings");
            if (object == null) {
                return null;
            }
            try {
                if (object.length() != 3) throw new JSONException("lightSettings don't have all three fields");
                return new int[]{L.d(object.optString(0)), object.optInt(1), object.optInt(2)};
            }
            catch (JSONException jSONException) {}
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("LightSettings is invalid: ");
            stringBuilder.append(object);
            stringBuilder.append(". Skipping setting LightSettings");
            object = stringBuilder.toString();
            break block4;
            catch (IllegalArgumentException illegalArgumentException) {}
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("LightSettings is invalid: ");
            stringBuilder2.append(object);
            stringBuilder2.append(". ");
            stringBuilder2.append(illegalArgumentException.getMessage());
            stringBuilder2.append(". Skipping setting LightSettings");
            object = stringBuilder2.toString();
        }
        Log.w((String)"NotificationParams", (String)object);
        return null;
    }

    public Uri f() {
        String string2;
        String string3 = string2 = this.p("gcm.n.link_android");
        if (TextUtils.isEmpty((CharSequence)string2)) {
            string3 = this.p("gcm.n.link");
        }
        if (!TextUtils.isEmpty((CharSequence)string3)) {
            return Uri.parse((String)string3);
        }
        return null;
    }

    public Object[] g(String string2) {
        Object[] arrobject = new Object[]();
        arrobject.append(string2);
        arrobject.append("_loc_args");
        string2 = this.c(arrobject.toString());
        if (string2 == null) {
            return null;
        }
        int n8 = string2.length();
        arrobject = new String[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            arrobject[i8] = string2.optString(i8);
        }
        return arrobject;
    }

    public String h(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append("_loc_key");
        return this.p(stringBuilder.toString());
    }

    public String i(Resources object, String stringBuilder, String string2) {
        String string3 = this.h(string2);
        if (TextUtils.isEmpty((CharSequence)string3)) {
            return null;
        }
        int n8 = object.getIdentifier(string3, "string", (String)stringBuilder);
        if (n8 == 0) {
            object = new StringBuilder();
            stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append("_loc_key");
            object.append(L.z(stringBuilder.toString()));
            object.append(" resource not found: ");
            object.append(string2);
            object.append(" Default value will be used.");
            Log.w((String)"NotificationParams", (String)object.toString());
            return null;
        }
        stringBuilder = this.g(string2);
        if (stringBuilder == null) {
            return object.getString(n8);
        }
        try {
            object = object.getString(n8, (Object[])stringBuilder);
            return object;
        }
        catch (MissingFormatArgumentException missingFormatArgumentException) {
            string3 = new StringBuilder();
            string3.append("Missing format argument for ");
            string3.append(L.z(string2));
            string3.append(": ");
            string3.append(Arrays.toString((Object[])stringBuilder));
            string3.append(" Default value will be used.");
            Log.w((String)"NotificationParams", (String)string3.toString(), (Throwable)missingFormatArgumentException);
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Long j(String string2) {
        String string3 = this.p(string2);
        if (!TextUtils.isEmpty((CharSequence)string3)) {
            long l8;
            try {
                l8 = Long.parseLong((String)string3);
            }
            catch (NumberFormatException numberFormatException) {}
            return l8;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Couldn't parse value of ");
            stringBuilder.append(L.z(string2));
            stringBuilder.append("(");
            stringBuilder.append(string3);
            stringBuilder.append(") into a long");
            Log.w((String)"NotificationParams", (String)stringBuilder.toString());
        }
        return null;
    }

    public String k() {
        return this.p("gcm.n.android_channel_id");
    }

    public Integer l() {
        Integer n8 = this.b("gcm.n.notification_count");
        if (n8 == null) {
            return null;
        }
        if (n8 < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("notificationCount is invalid: ");
            stringBuilder.append((Object)n8);
            stringBuilder.append(". Skipping setting notificationCount.");
            Log.w((String)"FirebaseMessaging", (String)stringBuilder.toString());
            return null;
        }
        return n8;
    }

    public Integer m() {
        Integer n8 = this.b("gcm.n.notification_priority");
        if (n8 == null) {
            return null;
        }
        if (n8 >= -2 && n8 <= 2) {
            return n8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("notificationPriority is invalid ");
        stringBuilder.append((Object)n8);
        stringBuilder.append(". Skipping setting notificationPriority.");
        Log.w((String)"FirebaseMessaging", (String)stringBuilder.toString());
        return null;
    }

    public String n(Resources resources, String string2, String string3) {
        String string4 = this.p(string3);
        if (!TextUtils.isEmpty((CharSequence)string4)) {
            return string4;
        }
        return this.i(resources, string2, string3);
    }

    public String o() {
        String string2;
        String string3 = string2 = this.p("gcm.n.sound2");
        if (TextUtils.isEmpty((CharSequence)string2)) {
            string3 = this.p("gcm.n.sound");
        }
        return string3;
    }

    public String p(String string2) {
        return this.a.getString(this.w(string2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long[] q() {
        int n8;
        JSONArray jSONArray;
        int n9;
        long[] arrl;
        block6 : {
            block5 : {
                jSONArray = this.c("gcm.n.vibrate_timings");
                if (jSONArray == null) {
                    return null;
                }
                if (jSONArray.length() <= 1) break block5;
                n8 = jSONArray.length();
                arrl = new long[n8];
                n9 = 0;
                break block6;
            }
            try {
                throw new JSONException("vibrateTimings have invalid length");
            }
            catch (NumberFormatException | JSONException numberFormatException) {}
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("User defined vibrateTimings is invalid: ");
            stringBuilder.append((Object)jSONArray);
            stringBuilder.append(". Skipping setting vibrateTimings.");
            Log.w((String)"NotificationParams", (String)stringBuilder.toString());
            return null;
        }
        while (n9 < n8) {
            arrl[n9] = jSONArray.optLong(n9);
            ++n9;
        }
        return arrl;
    }

    public Integer r() {
        Integer n8 = this.b("gcm.n.visibility");
        if (n8 == null) {
            return null;
        }
        if (n8 >= -1 && n8 <= 1) {
            return n8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("visibility is invalid: ");
        stringBuilder.append((Object)n8);
        stringBuilder.append(". Skipping setting visibility.");
        Log.w((String)"NotificationParams", (String)stringBuilder.toString());
        return null;
    }

    public final String w(String string2) {
        String string3;
        if (!this.a.containsKey(string2) && string2.startsWith("gcm.n.") && this.a.containsKey(string3 = L.v(string2))) {
            return string3;
        }
        return string2;
    }

    public Bundle x() {
        Bundle bundle = new Bundle(this.a);
        for (String string2 : this.a.keySet()) {
            if (L.s(string2)) continue;
            bundle.remove(string2);
        }
        return bundle;
    }

    public Bundle y() {
        Bundle bundle = new Bundle(this.a);
        for (String string2 : this.a.keySet()) {
            if (!L.u(string2)) continue;
            bundle.remove(string2);
        }
        return bundle;
    }
}

