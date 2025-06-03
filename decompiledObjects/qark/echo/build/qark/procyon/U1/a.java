// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package U1;

import org.json.JSONException;
import org.json.JSONObject;
import Q1.k;
import kotlin.jvm.internal.Intrinsics;
import java.io.File;
import kotlin.jvm.internal.g;

public final class a
{
    public static final a d;
    public String a;
    public String b;
    public Long c;
    
    static {
        d = new a(null);
    }
    
    public a(final File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        final String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        this.a = name;
        final JSONObject r = k.r(name, true);
        if (r != null) {
            this.c = r.optLong("timestamp", 0L);
            this.b = r.optString("error_message", (String)null);
        }
    }
    
    public a(String string) {
        this.c = System.currentTimeMillis() / 1000;
        this.b = string;
        final StringBuffer sb = new StringBuffer();
        sb.append("error_log_");
        final Long c = this.c;
        if (c != null) {
            sb.append((long)c);
            sb.append(".json");
            string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
            this.a = string;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
    }
    
    public final void a() {
        final k a = k.a;
        k.d(this.a);
    }
    
    public final int b(final a a) {
        Intrinsics.checkNotNullParameter(a, "data");
        final Long c = this.c;
        if (c == null) {
            return -1;
        }
        final long longValue = c;
        final Long c2 = a.c;
        if (c2 == null) {
            return 1;
        }
        return Intrinsics.e(c2, longValue);
    }
    
    public final JSONObject c() {
        final JSONObject jsonObject = new JSONObject();
        try {
            final Long c = this.c;
            if (c != null) {
                jsonObject.put("timestamp", (Object)c);
            }
            jsonObject.put("error_message", (Object)this.b);
            return jsonObject;
        }
        catch (JSONException ex) {
            return null;
        }
    }
    
    public final boolean d() {
        return this.b != null && this.c != null;
    }
    
    public final void e() {
        if (this.d()) {
            final k a = k.a;
            k.t(this.a, this.toString());
        }
    }
    
    @Override
    public String toString() {
        final JSONObject c = this.c();
        if (c == null) {
            return super.toString();
        }
        final String string = c.toString();
        Intrinsics.checkNotNullExpressionValue(string, "params.toString()");
        return string;
    }
    
    public static final class a
    {
    }
}
