/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.io.File
 *  java.lang.Enum
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.Arrays
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package Q1;

import O1.P;
import Q1.k;
import android.os.Build;
import java.io.File;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import kotlin.text.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {
    public static final b h = new b(null);
    public String a;
    public c b;
    public JSONArray c;
    public String d;
    public String e;
    public String f;
    public Long g;

    public c(File object) {
        object = object.getName();
        Intrinsics.checkNotNullExpressionValue(object, "file.name");
        this.a = object;
        this.b = h.b((String)object);
        object = k.a;
        object = k.r(this.a, true);
        if (object != null) {
            this.g = object.optLong("timestamp", 0L);
            this.d = object.optString("app_version", null);
            this.e = object.optString("reason", null);
            this.f = object.optString("callstack", null);
            this.c = object.optJSONArray("feature_names");
        }
    }

    public /* synthetic */ c(File file, g g8) {
        this(file);
    }

    public c(String string2, String string3) {
        this.b = c.q;
        this.d = P.v();
        this.e = string2;
        this.f = string3;
        this.g = System.currentTimeMillis() / (long)1000;
        string2 = new StringBuffer();
        string2.append("anr_log_");
        string2.append(String.valueOf((Object)this.g));
        string2.append(".json");
        string2 = string2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.a = string2;
    }

    public /* synthetic */ c(String string2, String string3, g g8) {
        this(string2, string3);
    }

    public c(Throwable object, c c8) {
        this.b = c8;
        this.d = P.v();
        this.e = k.e((Throwable)object);
        this.f = k.h((Throwable)object);
        this.g = System.currentTimeMillis() / (long)1000;
        object = new StringBuffer();
        object.append(c8.e());
        object.append(String.valueOf((Object)this.g));
        object.append(".json");
        object = object.toString();
        Intrinsics.checkNotNullExpressionValue(object, "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()");
        this.a = object;
    }

    public /* synthetic */ c(Throwable throwable, c c8, g g8) {
        this(throwable, c8);
    }

    public c(JSONArray object) {
        this.b = c.p;
        this.g = System.currentTimeMillis() / (long)1000;
        this.c = object;
        object = new StringBuffer();
        object.append("analysis_log_");
        object.append(String.valueOf((Object)this.g));
        object.append(".json");
        object = object.toString();
        Intrinsics.checkNotNullExpressionValue(object, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.a = object;
    }

    public /* synthetic */ c(JSONArray jSONArray, g g8) {
        this(jSONArray);
    }

    public final void a() {
        k k8 = k.a;
        k.d(this.a);
    }

    public final int b(c c8) {
        Intrinsics.checkNotNullParameter(c8, "data");
        Long l8 = this.g;
        if (l8 == null) {
            return -1;
        }
        long l9 = l8;
        c8 = c8.g;
        if (c8 == null) {
            return 1;
        }
        return Intrinsics.e(c8.longValue(), l9);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.c;
            if (jSONArray != null) {
                jSONObject.put("feature_names", (Object)jSONArray);
            }
            if ((jSONArray = this.g) == null) return jSONObject;
            jSONObject.put("timestamp", (Object)jSONArray);
            return jSONObject;
        }
        catch (JSONException jSONException) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", (Object)Build.VERSION.RELEASE);
            jSONObject.put("device_model", (Object)Build.MODEL);
            Object object = this.d;
            if (object != null) {
                jSONObject.put("app_version", object);
            }
            if ((object = this.g) != null) {
                jSONObject.put("timestamp", object);
            }
            if ((object = this.e) != null) {
                jSONObject.put("reason", object);
            }
            if ((object = this.f) != null) {
                jSONObject.put("callstack", object);
            }
            if ((object = this.b) == null) return jSONObject;
            jSONObject.put("type", object);
            return jSONObject;
        }
        catch (JSONException jSONException) {
            return null;
        }
    }

    public final JSONObject e() {
        c c8 = this.b;
        int n8 = c8 == null ? -1 : d.a[c8.ordinal()];
        if (n8 != 1) {
            if (n8 != 2 && n8 != 3 && n8 != 4 && n8 != 5) {
                return null;
            }
            return this.d();
        }
        return this.c();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean f() {
        c c8 = this.b;
        if (c8 == null) {
            return false;
        }
        int n8 = d.a[c8.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3 && n8 != 4 && n8 != 5) {
                    return false;
                }
                if (this.f == null || this.g == null) return false;
                do {
                    return true;
                    break;
                } while (true);
            }
            if (this.f == null || this.e == null || this.g == null) return false;
            return true;
        }
        if (this.c == null || this.g == null) return false;
        return true;
    }

    public final void g() {
        if (!this.f()) {
            return;
        }
        k k8 = k.a;
        k.t(this.a, this.toString());
    }

    /*
     * Enabled aggressive block sorting
     */
    public String toString() {
        String string2;
        Object object = this.e();
        if (object == null) {
            object = new JSONObject().toString();
            string2 = "JSONObject().toString()";
        } else {
            object = object.toString();
            string2 = "params.toString()";
        }
        Intrinsics.checkNotNullExpressionValue(object, string2);
        return object;
    }

    public static final class a {
        public static final a a = new a();

        public static final c a(String string2, String string3) {
            return new c(string2, string3, null);
        }

        public static final c b(Throwable throwable, c c8) {
            Intrinsics.checkNotNullParameter((Object)c8, "t");
            return new c(throwable, c8, null);
        }

        public static final c c(JSONArray jSONArray) {
            Intrinsics.checkNotNullParameter((Object)jSONArray, "features");
            return new c(jSONArray, null);
        }

        public static final c d(File file) {
            Intrinsics.checkNotNullParameter((Object)file, "file");
            return new c(file, null);
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(g g8) {
            this();
        }

        public final c b(String string2) {
            if (i.s(string2, "crash_log_", false, 2, null)) {
                return c.r;
            }
            if (i.s(string2, "shield_log_", false, 2, null)) {
                return c.s;
            }
            if (i.s(string2, "thread_check_log_", false, 2, null)) {
                return c.t;
            }
            if (i.s(string2, "analysis_log_", false, 2, null)) {
                return c.p;
            }
            if (i.s(string2, "anr_log_", false, 2, null)) {
                return c.q;
            }
            return c.o;
        }
    }

    public static final class c
    extends Enum {
        public static final /* enum */ c o = new c();
        public static final /* enum */ c p = new c();
        public static final /* enum */ c q = new c();
        public static final /* enum */ c r = new c();
        public static final /* enum */ c s = new c();
        public static final /* enum */ c t = new c();
        public static final /* synthetic */ c[] u;

        static {
            u = c.c();
        }

        public static final /* synthetic */ c[] c() {
            return new c[]{o, p, q, r, s, t};
        }

        public static c valueOf(String string2) {
            Intrinsics.checkNotNullParameter(string2, "value");
            return (c)Enum.valueOf(c.class, (String)string2);
        }

        public static c[] values() {
            c[] arrc = u;
            return (c[])Arrays.copyOf((Object[])arrc, (int)arrc.length);
        }

        public final String e() {
            int n8 = a.a[this.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            if (n8 != 5) {
                                return "Unknown";
                            }
                            return "thread_check_log_";
                        }
                        return "shield_log_";
                    }
                    return "crash_log_";
                }
                return "anr_log_";
            }
            return "analysis_log_";
        }

        public String toString() {
            int n8 = a.a[this.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            if (n8 != 5) {
                                return "Unknown";
                            }
                            return "ThreadCheck";
                        }
                        return "CrashShield";
                    }
                    return "CrashReport";
                }
                return "AnrReport";
            }
            return "Analysis";
        }

        public abstract class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] arrn = new int[c.values().length];
                arrn[c.p.ordinal()] = 1;
                arrn[c.q.ordinal()] = 2;
                arrn[c.r.ordinal()] = 3;
                arrn[c.s.ordinal()] = 4;
                arrn[c.t.ordinal()] = 5;
                a = arrn;
            }
        }

    }

    public abstract class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] arrn = new int[c.values().length];
            arrn[c.p.ordinal()] = 1;
            arrn[c.q.ordinal()] = 2;
            arrn[c.r.ordinal()] = 3;
            arrn[c.s.ordinal()] = 4;
            arrn[c.t.ordinal()] = 5;
            a = arrn;
        }
    }

}

