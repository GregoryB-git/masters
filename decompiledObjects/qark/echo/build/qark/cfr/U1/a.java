/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Long
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.System
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package U1;

import Q1.k;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    public static final a d = new a(null);
    public String a;
    public String b;
    public Long c;

    public a(File object) {
        Intrinsics.checkNotNullParameter(object, "file");
        object = object.getName();
        Intrinsics.checkNotNullExpressionValue(object, "file.name");
        this.a = object;
        object = k.r((String)object, true);
        if (object != null) {
            this.c = object.optLong("timestamp", 0L);
            this.b = object.optString("error_message", null);
        }
    }

    public a(String string2) {
        this.c = System.currentTimeMillis() / (long)1000;
        this.b = string2;
        string2 = new StringBuffer();
        string2.append("error_log_");
        Long l8 = this.c;
        if (l8 != null) {
            string2.append(l8.longValue());
            string2.append(".json");
            string2 = string2.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
            this.a = string2;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
    }

    public final void a() {
        k k8 = k.a;
        k.d(this.a);
    }

    public final int b(a a8) {
        Intrinsics.checkNotNullParameter(a8, "data");
        Long l8 = this.c;
        if (l8 == null) {
            return -1;
        }
        long l9 = l8;
        a8 = a8.c;
        if (a8 == null) {
            return 1;
        }
        return Intrinsics.e(a8.longValue(), l9);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l8 = this.c;
            if (l8 != null) {
                jSONObject.put("timestamp", (Object)l8);
            }
            jSONObject.put("error_message", (Object)this.b);
            return jSONObject;
        }
        catch (JSONException jSONException) {
            return null;
        }
    }

    public final boolean d() {
        if (this.b != null && this.c != null) {
            return true;
        }
        return false;
    }

    public final void e() {
        if (this.d()) {
            k k8 = k.a;
            k.t(this.a, this.toString());
        }
    }

    public String toString() {
        Object object = this.c();
        if (object == null) {
            return super.toString();
        }
        object = object.toString();
        Intrinsics.checkNotNullExpressionValue(object, "params.toString()");
        return object;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

}

