/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ScheduledExecutorService
 *  org.json.JSONObject
 */
package Y1;

import Y1.u;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.json.JSONObject;
import y1.F;

public final class y {
    public static final a d = new a(null);
    public static final ScheduledExecutorService e = Executors.newSingleThreadScheduledExecutor();
    public final String a;
    public final F b;
    public String c;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public y(Context context, String string2) {
        Intrinsics.checkNotNullParameter((Object)context, "context");
        Intrinsics.checkNotNullParameter(string2, "applicationId");
        this.a = string2;
        this.b = new F(context, string2);
        try {
            context = context.getPackageManager();
            if (context == null) return;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return;
        }
        context = context.getPackageInfo("com.facebook.katana", 0);
        if (context == null) return;
        this.c = context.versionName;
    }

    public final String a() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            String string2 = this.a;
            return string2;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(String string2, String string3, String string4, String string5, String string62, Map map, String string7) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            string2 = d.b(string2);
            if (string4 != null) {
                string2.putString("2_result", string4);
            }
            if (string5 != null) {
                string2.putString("5_error_message", string5);
            }
            if (string62 != null) {
                string2.putString("4_error_code", string62);
            }
            if (map != null && map.isEmpty() ^ true) {
                string4 = new LinkedHashMap();
                for (String string62 : map.entrySet()) {
                    if ((String)string62.getKey() == null) continue;
                    string4.put(string62.getKey(), string62.getValue());
                }
                string2.putString("6_extras", new JSONObject((Map)string4).toString());
            }
            string2.putString("3_method", string3);
            this.b.g(string7, (Bundle)string2);
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
    }

    public final void c(String string2, String string3, String string4) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            string2 = d.b(string2);
            string2.putString("3_method", string3);
            this.b.g(string4, (Bundle)string2);
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return;
        }
    }

    public final void d(String string2, String string3, String string4) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            string2 = d.b(string2);
            string2.putString("3_method", string3);
            this.b.g(string4, (Bundle)string2);
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return;
        }
    }

    public final void e(String string2, String string3, String string4) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Bundle bundle = d.b("");
            bundle.putString("2_result", u.f.a.r.e());
            bundle.putString("5_error_message", string3);
            bundle.putString("3_method", string4);
            this.b.g(string2, bundle);
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return;
        }
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final Bundle b(String string2) {
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", string2);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        }
    }

}

