// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import android.os.BaseBundle;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;
import java.util.Arrays;
import android.content.res.Resources;
import android.net.Uri;
import org.json.JSONException;
import org.json.JSONArray;
import android.util.Log;
import android.text.TextUtils;
import android.graphics.Color;
import android.os.Bundle;

public class L
{
    public final Bundle a;
    
    public L(final Bundle bundle) {
        if (bundle != null) {
            this.a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }
    
    public static int d(final String s) {
        final int color = Color.parseColor(s);
        if (color != -16777216) {
            return color;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }
    
    public static boolean s(final String s) {
        return s.startsWith("google.c.a.") || s.equals("from");
    }
    
    public static boolean t(final Bundle bundle) {
        return "1".equals(((BaseBundle)bundle).getString("gcm.n.e")) || "1".equals(((BaseBundle)bundle).getString(v("gcm.n.e")));
    }
    
    public static boolean u(final String s) {
        return s.startsWith("google.c.") || s.startsWith("gcm.n.") || s.startsWith("gcm.notification.");
    }
    
    public static String v(final String s) {
        if (!s.startsWith("gcm.n.")) {
            return s;
        }
        return s.replace("gcm.n.", "gcm.notification.");
    }
    
    public static String z(final String s) {
        String substring = s;
        if (s.startsWith("gcm.n.")) {
            substring = s.substring(6);
        }
        return substring;
    }
    
    public boolean a(String p) {
        p = this.p(p);
        return "1".equals(p) || Boolean.parseBoolean(p);
    }
    
    public Integer b(final String s) {
        final String p = this.p(s);
        Label_0084: {
            if (TextUtils.isEmpty((CharSequence)p)) {
                break Label_0084;
            }
            while (true) {
                while (true) {
                    try {
                        return Integer.parseInt(p);
                        return null;
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Couldn't parse value of ");
                        sb.append(z(s));
                        sb.append("(");
                        sb.append(p);
                        sb.append(") into an int");
                        Log.w("NotificationParams", sb.toString());
                        return null;
                    }
                    catch (NumberFormatException ex) {}
                    continue;
                }
            }
        }
    }
    
    public JSONArray c(final String s) {
        final String p = this.p(s);
        Label_0078: {
            if (TextUtils.isEmpty((CharSequence)p)) {
                break Label_0078;
            }
            while (true) {
                while (true) {
                    try {
                        return new JSONArray(p);
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Malformed JSON for key ");
                        sb.append(z(s));
                        sb.append(": ");
                        sb.append(p);
                        sb.append(", falling back to default");
                        Log.w("NotificationParams", sb.toString());
                        return null;
                    }
                    catch (JSONException ex) {}
                    continue;
                }
            }
        }
    }
    
    public int[] e() {
        Object o = this.c("gcm.n.light_settings");
        if (o == null) {
            return null;
        }
        while (true) {
            while (true) {
                try {
                    if (((JSONArray)o).length() == 3) {
                        return new int[] { d(((JSONArray)o).optString(0)), ((JSONArray)o).optInt(1), ((JSONArray)o).optInt(2) };
                    }
                    throw new JSONException("lightSettings don't have all three fields");
                    while (true) {
                        Log.w("NotificationParams", (String)o);
                        return null;
                        final StringBuilder sb = new StringBuilder();
                        sb.append("LightSettings is invalid: ");
                        sb.append(o);
                        sb.append(". Skipping setting LightSettings");
                        o = sb.toString();
                        continue;
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("LightSettings is invalid: ");
                        sb2.append(o);
                        sb2.append(". ");
                        final IllegalArgumentException ex;
                        sb2.append(ex.getMessage());
                        sb2.append(". Skipping setting LightSettings");
                        o = sb2.toString();
                        continue;
                    }
                }
                catch (JSONException ex3) {
                    continue;
                }
                catch (IllegalArgumentException ex2) {}
                break;
            }
            final IllegalArgumentException ex2;
            final IllegalArgumentException ex = ex2;
            continue;
        }
    }
    
    public Uri f() {
        String s;
        if (TextUtils.isEmpty((CharSequence)(s = this.p("gcm.n.link_android")))) {
            s = this.p("gcm.n.link");
        }
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return Uri.parse(s);
        }
        return null;
    }
    
    public Object[] g(final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_loc_args");
        final JSONArray c = this.c(sb.toString());
        if (c == null) {
            return null;
        }
        final int length = c.length();
        final String[] array = new String[length];
        for (int i = 0; i < length; ++i) {
            array[i] = c.optString(i);
        }
        return array;
    }
    
    public String h(final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_loc_key");
        return this.p(sb.toString());
    }
    
    public String i(final Resources resources, String g, final String s) {
        final String h = this.h(s);
        if (TextUtils.isEmpty((CharSequence)h)) {
            return null;
        }
        final int identifier = resources.getIdentifier(h, "string", g);
        if (identifier == 0) {
            final StringBuilder sb = new StringBuilder();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(s);
            sb2.append("_loc_key");
            sb.append(z(sb2.toString()));
            sb.append(" resource not found: ");
            sb.append(s);
            sb.append(" Default value will be used.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
        g = (String)this.g(s);
        if (g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, (Object[])(Object)g);
        }
        catch (MissingFormatArgumentException ex) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Missing format argument for ");
            sb3.append(z(s));
            sb3.append(": ");
            sb3.append(Arrays.toString((Object[])(Object)g));
            sb3.append(" Default value will be used.");
            Log.w("NotificationParams", sb3.toString(), (Throwable)ex);
            return null;
        }
    }
    
    public Long j(final String s) {
        final String p = this.p(s);
        Label_0088: {
            if (TextUtils.isEmpty((CharSequence)p)) {
                break Label_0088;
            }
            while (true) {
                while (true) {
                    try {
                        return Long.parseLong(p);
                        return null;
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Couldn't parse value of ");
                        sb.append(z(s));
                        sb.append("(");
                        sb.append(p);
                        sb.append(") into a long");
                        Log.w("NotificationParams", sb.toString());
                        return null;
                    }
                    catch (NumberFormatException ex) {}
                    continue;
                }
            }
        }
    }
    
    public String k() {
        return this.p("gcm.n.android_channel_id");
    }
    
    public Integer l() {
        final Integer b = this.b("gcm.n.notification_count");
        if (b == null) {
            return null;
        }
        if (b < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("notificationCount is invalid: ");
            sb.append(b);
            sb.append(". Skipping setting notificationCount.");
            Log.w("FirebaseMessaging", sb.toString());
            return null;
        }
        return b;
    }
    
    public Integer m() {
        final Integer b = this.b("gcm.n.notification_priority");
        if (b == null) {
            return null;
        }
        if (b >= -2 && b <= 2) {
            return b;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("notificationPriority is invalid ");
        sb.append(b);
        sb.append(". Skipping setting notificationPriority.");
        Log.w("FirebaseMessaging", sb.toString());
        return null;
    }
    
    public String n(final Resources resources, final String s, final String s2) {
        final String p3 = this.p(s2);
        if (!TextUtils.isEmpty((CharSequence)p3)) {
            return p3;
        }
        return this.i(resources, s, s2);
    }
    
    public String o() {
        String s;
        if (TextUtils.isEmpty((CharSequence)(s = this.p("gcm.n.sound2")))) {
            s = this.p("gcm.n.sound");
        }
        return s;
    }
    
    public String p(final String s) {
        return ((BaseBundle)this.a).getString(this.w(s));
    }
    
    public long[] q() {
        final JSONArray c = this.c("gcm.n.vibrate_timings");
        if (c == null) {
            return null;
        }
        long[] array;
        while (true) {
            try {
                if (c.length() > 1) {
                    final int length = c.length();
                    array = new long[length];
                    for (int i = 0; i < length; ++i) {
                        array[i] = c.optLong(i);
                    }
                    return array;
                }
                throw new JSONException("vibrateTimings have invalid length");
                final StringBuilder sb = new StringBuilder();
                sb.append("User defined vibrateTimings is invalid: ");
                sb.append(c);
                sb.append(". Skipping setting vibrateTimings.");
                Log.w("NotificationParams", sb.toString());
                return null;
            }
            catch (JSONException | NumberFormatException ex) {
                continue;
            }
            break;
        }
        return array;
    }
    
    public Integer r() {
        final Integer b = this.b("gcm.n.visibility");
        if (b == null) {
            return null;
        }
        if (b >= -1 && b <= 1) {
            return b;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("visibility is invalid: ");
        sb.append(b);
        sb.append(". Skipping setting visibility.");
        Log.w("NotificationParams", sb.toString());
        return null;
    }
    
    public final String w(final String s) {
        if (!((BaseBundle)this.a).containsKey(s) && s.startsWith("gcm.n.")) {
            final String v = v(s);
            if (((BaseBundle)this.a).containsKey(v)) {
                return v;
            }
        }
        return s;
    }
    
    public Bundle x() {
        final Bundle bundle = new Bundle(this.a);
        for (final String s : ((BaseBundle)this.a).keySet()) {
            if (!s(s)) {
                bundle.remove(s);
            }
        }
        return bundle;
    }
    
    public Bundle y() {
        final Bundle bundle = new Bundle(this.a);
        for (final String s : ((BaseBundle)this.a).keySet()) {
            if (u(s)) {
                bundle.remove(s);
            }
        }
        return bundle;
    }
}
