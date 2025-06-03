package U1;

import Q1.k;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final C0106a f6315d = new C0106a(null);

    /* renamed from: a, reason: collision with root package name */
    public String f6316a;

    /* renamed from: b, reason: collision with root package name */
    public String f6317b;

    /* renamed from: c, reason: collision with root package name */
    public Long f6318c;

    /* renamed from: U1.a$a, reason: collision with other inner class name */
    public static final class C0106a {
        public C0106a() {
        }

        public /* synthetic */ C0106a(g gVar) {
            this();
        }
    }

    public a(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        this.f6316a = name;
        JSONObject r7 = k.r(name, true);
        if (r7 != null) {
            this.f6318c = Long.valueOf(r7.optLong("timestamp", 0L));
            this.f6317b = r7.optString("error_message", null);
        }
    }

    public final void a() {
        k kVar = k.f4344a;
        k.d(this.f6316a);
    }

    public final int b(a data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Long l7 = this.f6318c;
        if (l7 == null) {
            return -1;
        }
        long longValue = l7.longValue();
        Long l8 = data.f6318c;
        if (l8 == null) {
            return 1;
        }
        return Intrinsics.e(l8.longValue(), longValue);
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l7 = this.f6318c;
            if (l7 != null) {
                jSONObject.put("timestamp", l7);
            }
            jSONObject.put("error_message", this.f6317b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean d() {
        return (this.f6317b == null || this.f6318c == null) ? false : true;
    }

    public final void e() {
        if (d()) {
            k kVar = k.f4344a;
            k.t(this.f6316a, toString());
        }
    }

    public String toString() {
        JSONObject c7 = c();
        if (c7 == null) {
            return super.toString();
        }
        String jSONObject = c7.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "params.toString()");
        return jSONObject;
    }

    public a(String str) {
        this.f6318c = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f6317b = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        Long l7 = this.f6318c;
        if (l7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }
        stringBuffer.append(l7.longValue());
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
        this.f6316a = stringBuffer2;
    }
}
