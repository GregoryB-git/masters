// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Q1;

import java.util.Arrays;
import kotlin.text.i;
import android.os.Build;
import android.os.Build$VERSION;
import org.json.JSONException;
import O1.P;
import org.json.JSONObject;
import kotlin.jvm.internal.Intrinsics;
import java.io.File;
import kotlin.jvm.internal.g;
import org.json.JSONArray;

public final class c
{
    public static final b h;
    public String a;
    public c b;
    public JSONArray c;
    public String d;
    public String e;
    public String f;
    public Long g;
    
    static {
        h = new b(null);
    }
    
    public c(final File file) {
        final String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        this.a = name;
        this.b = Q1.c.h.b(name);
        final k a = k.a;
        final JSONObject r = k.r(this.a, true);
        if (r != null) {
            this.g = r.optLong("timestamp", 0L);
            this.d = r.optString("app_version", (String)null);
            this.e = r.optString("reason", (String)null);
            this.f = r.optString("callstack", (String)null);
            this.c = r.optJSONArray("feature_names");
        }
    }
    
    public c(String string, final String f) {
        this.b = Q1.c.c.q;
        this.d = P.v();
        this.e = string;
        this.f = f;
        this.g = System.currentTimeMillis() / 1000;
        final StringBuffer sb = new StringBuffer();
        sb.append("anr_log_");
        sb.append(String.valueOf(this.g));
        sb.append(".json");
        string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.a = string;
    }
    
    public c(final Throwable t, final c b) {
        this.b = b;
        this.d = P.v();
        this.e = k.e(t);
        this.f = k.h(t);
        this.g = System.currentTimeMillis() / 1000;
        final StringBuffer sb = new StringBuffer();
        sb.append(b.e());
        sb.append(String.valueOf(this.g));
        sb.append(".json");
        final String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()");
        this.a = string;
    }
    
    public c(final JSONArray c) {
        this.b = Q1.c.c.p;
        this.g = System.currentTimeMillis() / 1000;
        this.c = c;
        final StringBuffer sb = new StringBuffer();
        sb.append("analysis_log_");
        sb.append(String.valueOf(this.g));
        sb.append(".json");
        final String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.a = string;
    }
    
    public final void a() {
        final k a = k.a;
        k.d(this.a);
    }
    
    public final int b(final c c) {
        Intrinsics.checkNotNullParameter(c, "data");
        final Long g = this.g;
        if (g == null) {
            return -1;
        }
        final long longValue = g;
        final Long g2 = c.g;
        if (g2 == null) {
            return 1;
        }
        return Intrinsics.e(g2, longValue);
    }
    
    public final JSONObject c() {
        final JSONObject jsonObject = new JSONObject();
        try {
            final JSONArray c = this.c;
            if (c != null) {
                jsonObject.put("feature_names", (Object)c);
            }
            final Long g = this.g;
            if (g != null) {
                jsonObject.put("timestamp", (Object)g);
            }
            return jsonObject;
        }
        catch (JSONException ex) {
            return null;
        }
    }
    
    public final JSONObject d() {
        final JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("device_os_version", (Object)Build$VERSION.RELEASE);
            jsonObject.put("device_model", (Object)Build.MODEL);
            final String d = this.d;
            if (d != null) {
                jsonObject.put("app_version", (Object)d);
            }
            final Long g = this.g;
            if (g != null) {
                jsonObject.put("timestamp", (Object)g);
            }
            final String e = this.e;
            if (e != null) {
                jsonObject.put("reason", (Object)e);
            }
            final String f = this.f;
            if (f != null) {
                jsonObject.put("callstack", (Object)f);
            }
            final c b = this.b;
            if (b != null) {
                jsonObject.put("type", (Object)b);
            }
            return jsonObject;
        }
        catch (JSONException ex) {
            return null;
        }
    }
    
    public final JSONObject e() {
        final c b = this.b;
        int n;
        if (b == null) {
            n = -1;
        }
        else {
            n = Q1.c.d.a[b.ordinal()];
        }
        if (n == 1) {
            return this.c();
        }
        if (n != 2 && n != 3 && n != 4 && n != 5) {
            return null;
        }
        return this.d();
    }
    
    public final boolean f() {
        final c b = this.b;
        int n;
        if (b == null) {
            n = -1;
        }
        else {
            n = Q1.c.d.a[b.ordinal()];
        }
        if (n != 1) {
            if (n != 2) {
                if (n != 3 && n != 4 && n != 5) {
                    return false;
                }
                if (this.f == null || this.g == null) {
                    return false;
                }
            }
            else if (this.f == null || this.e == null || this.g == null) {
                return false;
            }
        }
        else if (this.c == null || this.g == null) {
            return false;
        }
        return true;
    }
    
    public final void g() {
        if (!this.f()) {
            return;
        }
        final k a = k.a;
        k.t(this.a, this.toString());
    }
    
    @Override
    public String toString() {
        final JSONObject e = this.e();
        String s;
        String s2;
        if (e == null) {
            s = new JSONObject().toString();
            s2 = "JSONObject().toString()";
        }
        else {
            s = e.toString();
            s2 = "params.toString()";
        }
        Intrinsics.checkNotNullExpressionValue(s, s2);
        return s;
    }
    
    public static final class a
    {
        public static final a a;
        
        static {
            a = new a();
        }
        
        public static final c a(final String s, final String s2) {
            return new c(s, s2, null);
        }
        
        public static final c b(final Throwable t, final c c) {
            Intrinsics.checkNotNullParameter(c, "t");
            return new c(t, c, null);
        }
        
        public static final c c(final JSONArray jsonArray) {
            Intrinsics.checkNotNullParameter(jsonArray, "features");
            return new c(jsonArray, null);
        }
        
        public static final c d(final File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return new c(file, null);
        }
    }
    
    public static final class b
    {
        public final c b(final String s) {
            if (i.s(s, "crash_log_", false, 2, null)) {
                return Q1.c.c.r;
            }
            if (i.s(s, "shield_log_", false, 2, null)) {
                return Q1.c.c.s;
            }
            if (i.s(s, "thread_check_log_", false, 2, null)) {
                return Q1.c.c.t;
            }
            if (i.s(s, "analysis_log_", false, 2, null)) {
                return Q1.c.c.p;
            }
            if (i.s(s, "anr_log_", false, 2, null)) {
                return Q1.c.c.q;
            }
            return Q1.c.c.o;
        }
    }
    
    public enum c
    {
        o("Unknown", 0), 
        p("Analysis", 1), 
        q("AnrReport", 2), 
        r("CrashReport", 3), 
        s("CrashShield", 4), 
        t("ThreadCheck", 5);
        
        static {
            u = c();
        }
        
        public c(final String name, final int ordinal) {
        }
        
        public static final /* synthetic */ c[] c() {
            return new c[] { c.o, c.p, c.q, c.r, c.s, c.t };
        }
        
        public final String e() {
            final int n = a.a[this.ordinal()];
            if (n == 1) {
                return "analysis_log_";
            }
            if (n == 2) {
                return "anr_log_";
            }
            if (n == 3) {
                return "crash_log_";
            }
            if (n == 4) {
                return "shield_log_";
            }
            if (n != 5) {
                return "Unknown";
            }
            return "thread_check_log_";
        }
        
        @Override
        public String toString() {
            final int n = a.a[this.ordinal()];
            if (n == 1) {
                return "Analysis";
            }
            if (n == 2) {
                return "AnrReport";
            }
            if (n == 3) {
                return "CrashReport";
            }
            if (n == 4) {
                return "CrashShield";
            }
            if (n != 5) {
                return "Unknown";
            }
            return "ThreadCheck";
        }
    }
}
