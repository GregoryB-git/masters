/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Bundle
 *  java.io.PrintStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Iterator
 *  java.util.Map
 *  org.json.JSONObject
 */
package l5;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public class h {
    public SharedPreferences a;
    public boolean b;
    public String c;
    public String d;
    public String e;
    public int f;
    public String g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public String n;
    public String o;

    public h(Context context) {
        context = context.getSharedPreferences("audio_service_preferences", 0);
        this.a = context;
        this.b = context.getBoolean("androidResumeOnClick", true);
        this.c = this.a.getString("androidNotificationChannelId", null);
        this.d = this.a.getString("androidNotificationChannelName", null);
        this.e = this.a.getString("androidNotificationChannelDescription", null);
        this.f = this.a.getInt("notificationColor", -1);
        this.g = this.a.getString("androidNotificationIcon", "mipmap/ic_launcher");
        this.h = this.a.getBoolean("androidShowNotificationBadge", false);
        this.i = this.a.getBoolean("androidNotificationClickStartsActivity", true);
        this.j = this.a.getBoolean("androidNotificationOngoing", false);
        this.k = this.a.getBoolean("androidStopForegroundOnPause", true);
        this.l = this.a.getInt("artDownscaleWidth", -1);
        this.m = this.a.getInt("artDownscaleHeight", -1);
        this.n = this.a.getString("activityClassName", null);
        this.o = this.a.getString("androidBrowsableRootExtras", null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Bundle a() {
        Bundle bundle;
        String string2;
        JSONObject jSONObject;
        if (this.o == null) {
            return null;
        }
        try {
            jSONObject = new JSONObject(this.o);
            bundle = new Bundle();
            Iterator iterator = jSONObject.keys();
            do {
                if (!iterator.hasNext()) break block13;
                string2 = (String)iterator.next();
                break;
            } while (true);
        }
        catch (Exception exception) {}
        {
            block13 : {
                try {
                    bundle.putInt(string2, jSONObject.getInt(string2));
                    continue;
                }
                catch (Exception exception) {}
            }
            return bundle;
            try {
                bundle.putBoolean(string2, jSONObject.getBoolean(string2));
                continue;
            }
            catch (Exception exception) {}
            try {
                bundle.putDouble(string2, jSONObject.getDouble(string2));
                continue;
            }
            catch (Exception exception) {}
            try {
                bundle.putString(string2, jSONObject.getString(string2));
                continue;
            }
            catch (Exception exception) {}
            PrintStream printStream = System.out;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported extras value for key ");
            stringBuilder.append(string2);
            printStream.println(stringBuilder.toString());
            continue;
        }
        exception.printStackTrace();
        return null;
    }

    public void b() {
        this.a.edit().putBoolean("androidResumeOnClick", this.b).putString("androidNotificationChannelId", this.c).putString("androidNotificationChannelName", this.d).putString("androidNotificationChannelDescription", this.e).putInt("notificationColor", this.f).putString("androidNotificationIcon", this.g).putBoolean("androidShowNotificationBadge", this.h).putBoolean("androidNotificationClickStartsActivity", this.i).putBoolean("androidNotificationOngoing", this.j).putBoolean("androidStopForegroundOnPause", this.k).putInt("artDownscaleWidth", this.l).putInt("artDownscaleHeight", this.m).putString("activityClassName", this.n).putString("androidBrowsableRootExtras", this.o).apply();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void c(Map object) {
        object = object != null ? new JSONObject((Map)object).toString() : null;
        this.o = object;
    }
}

