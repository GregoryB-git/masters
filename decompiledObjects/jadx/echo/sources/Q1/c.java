package Q1;

import O1.P;
import android.os.Build;
import java.io.File;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    public static final b f4325h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public String f4326a;

    /* renamed from: b, reason: collision with root package name */
    public EnumC0081c f4327b;

    /* renamed from: c, reason: collision with root package name */
    public JSONArray f4328c;

    /* renamed from: d, reason: collision with root package name */
    public String f4329d;

    /* renamed from: e, reason: collision with root package name */
    public String f4330e;

    /* renamed from: f, reason: collision with root package name */
    public String f4331f;

    /* renamed from: g, reason: collision with root package name */
    public Long f4332g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4333a = new a();

        public static final c a(String str, String str2) {
            return new c(str, str2, (kotlin.jvm.internal.g) null);
        }

        public static final c b(Throwable th, EnumC0081c t7) {
            Intrinsics.checkNotNullParameter(t7, "t");
            return new c(th, t7, (kotlin.jvm.internal.g) null);
        }

        public static final c c(JSONArray features) {
            Intrinsics.checkNotNullParameter(features, "features");
            return new c(features, (kotlin.jvm.internal.g) null);
        }

        public static final c d(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return new c(file, (kotlin.jvm.internal.g) null);
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final EnumC0081c b(String str) {
            boolean s7;
            boolean s8;
            boolean s9;
            boolean s10;
            boolean s11;
            s7 = r.s(str, "crash_log_", false, 2, null);
            if (s7) {
                return EnumC0081c.CrashReport;
            }
            s8 = r.s(str, "shield_log_", false, 2, null);
            if (s8) {
                return EnumC0081c.CrashShield;
            }
            s9 = r.s(str, "thread_check_log_", false, 2, null);
            if (s9) {
                return EnumC0081c.ThreadCheck;
            }
            s10 = r.s(str, "analysis_log_", false, 2, null);
            if (s10) {
                return EnumC0081c.Analysis;
            }
            s11 = r.s(str, "anr_log_", false, 2, null);
            return s11 ? EnumC0081c.AnrReport : EnumC0081c.Unknown;
        }
    }

    /* renamed from: Q1.c$c, reason: collision with other inner class name */
    public enum EnumC0081c {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* renamed from: Q1.c$c$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4341a;

            static {
                int[] iArr = new int[EnumC0081c.valuesCustom().length];
                iArr[EnumC0081c.Analysis.ordinal()] = 1;
                iArr[EnumC0081c.AnrReport.ordinal()] = 2;
                iArr[EnumC0081c.CrashReport.ordinal()] = 3;
                iArr[EnumC0081c.CrashShield.ordinal()] = 4;
                iArr[EnumC0081c.ThreadCheck.ordinal()] = 5;
                f4341a = iArr;
            }
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0081c[] valuesCustom() {
            EnumC0081c[] valuesCustom = values();
            return (EnumC0081c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final String e() {
            int i7 = a.f4341a[ordinal()];
            return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "anr_log_" : "analysis_log_";
        }

        @Override // java.lang.Enum
        public String toString() {
            int i7 = a.f4341a[ordinal()];
            return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? "Unknown" : "ThreadCheck" : "CrashShield" : "CrashReport" : "AnrReport" : "Analysis";
        }
    }

    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4342a;

        static {
            int[] iArr = new int[EnumC0081c.valuesCustom().length];
            iArr[EnumC0081c.Analysis.ordinal()] = 1;
            iArr[EnumC0081c.AnrReport.ordinal()] = 2;
            iArr[EnumC0081c.CrashReport.ordinal()] = 3;
            iArr[EnumC0081c.CrashShield.ordinal()] = 4;
            iArr[EnumC0081c.ThreadCheck.ordinal()] = 5;
            f4342a = iArr;
        }
    }

    public c(File file) {
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        this.f4326a = name;
        this.f4327b = f4325h.b(name);
        k kVar = k.f4344a;
        JSONObject r7 = k.r(this.f4326a, true);
        if (r7 != null) {
            this.f4332g = Long.valueOf(r7.optLong("timestamp", 0L));
            this.f4329d = r7.optString("app_version", null);
            this.f4330e = r7.optString("reason", null);
            this.f4331f = r7.optString("callstack", null);
            this.f4328c = r7.optJSONArray("feature_names");
        }
    }

    public final void a() {
        k kVar = k.f4344a;
        k.d(this.f4326a);
    }

    public final int b(c data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Long l7 = this.f4332g;
        if (l7 == null) {
            return -1;
        }
        long longValue = l7.longValue();
        Long l8 = data.f4332g;
        if (l8 == null) {
            return 1;
        }
        return Intrinsics.e(l8.longValue(), longValue);
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.f4328c;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            Long l7 = this.f4332g;
            if (l7 != null) {
                jSONObject.put("timestamp", l7);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.f4329d;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l7 = this.f4332g;
            if (l7 != null) {
                jSONObject.put("timestamp", l7);
            }
            String str2 = this.f4330e;
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            String str3 = this.f4331f;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            EnumC0081c enumC0081c = this.f4327b;
            if (enumC0081c != null) {
                jSONObject.put("type", enumC0081c);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final JSONObject e() {
        EnumC0081c enumC0081c = this.f4327b;
        int i7 = enumC0081c == null ? -1 : d.f4342a[enumC0081c.ordinal()];
        if (i7 == 1) {
            return c();
        }
        if (i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5) {
            return d();
        }
        return null;
    }

    public final boolean f() {
        EnumC0081c enumC0081c = this.f4327b;
        int i7 = enumC0081c == null ? -1 : d.f4342a[enumC0081c.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if ((i7 != 3 && i7 != 4 && i7 != 5) || this.f4331f == null || this.f4332g == null) {
                    return false;
                }
            } else if (this.f4331f == null || this.f4330e == null || this.f4332g == null) {
                return false;
            }
        } else if (this.f4328c == null || this.f4332g == null) {
            return false;
        }
        return true;
    }

    public final void g() {
        if (f()) {
            k kVar = k.f4344a;
            k.t(this.f4326a, toString());
        }
    }

    public String toString() {
        String jSONObject;
        String str;
        JSONObject e7 = e();
        if (e7 == null) {
            jSONObject = new JSONObject().toString();
            str = "JSONObject().toString()";
        } else {
            jSONObject = e7.toString();
            str = "params.toString()";
        }
        Intrinsics.checkNotNullExpressionValue(jSONObject, str);
        return jSONObject;
    }

    public /* synthetic */ c(File file, kotlin.jvm.internal.g gVar) {
        this(file);
    }

    public c(String str, String str2) {
        this.f4327b = EnumC0081c.AnrReport;
        this.f4329d = P.v();
        this.f4330e = str;
        this.f4331f = str2;
        this.f4332g = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("anr_log_");
        stringBuffer.append(String.valueOf(this.f4332g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.f4326a = stringBuffer2;
    }

    public /* synthetic */ c(String str, String str2, kotlin.jvm.internal.g gVar) {
        this(str, str2);
    }

    public c(Throwable th, EnumC0081c enumC0081c) {
        this.f4327b = enumC0081c;
        this.f4329d = P.v();
        this.f4330e = k.e(th);
        this.f4331f = k.h(th);
        this.f4332g = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(enumC0081c.e());
        stringBuffer.append(String.valueOf(this.f4332g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()");
        this.f4326a = stringBuffer2;
    }

    public /* synthetic */ c(Throwable th, EnumC0081c enumC0081c, kotlin.jvm.internal.g gVar) {
        this(th, enumC0081c);
    }

    public c(JSONArray jSONArray) {
        this.f4327b = EnumC0081c.Analysis;
        this.f4332g = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f4328c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("analysis_log_");
        stringBuffer.append(String.valueOf(this.f4332g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.f4326a = stringBuffer2;
    }

    public /* synthetic */ c(JSONArray jSONArray, kotlin.jvm.internal.g gVar) {
        this(jSONArray);
    }
}
