// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x1;

import O1.v;
import O1.j;
import org.json.JSONException;
import O1.P;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import android.os.Parcel;
import kotlin.jvm.internal.g;
import java.net.HttpURLConnection;
import org.json.JSONObject;
import org.jetbrains.annotations.NotNull;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class r implements Parcelable
{
    public static final c C;
    @NotNull
    public static final Parcelable$Creator<r> CREATOR;
    public static final d D;
    public final a A;
    public final String B;
    public final int o;
    public final int p;
    public final int q;
    public final String r;
    public final String s;
    public final String t;
    public final JSONObject u;
    public final JSONObject v;
    public final Object w;
    public final HttpURLConnection x;
    public final String y;
    public o z;
    
    static {
        C = new c(null);
        D = new d(200, 299);
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public r a(final Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new r(parcel, null);
            }
            
            public r[] b(final int n) {
                return new r[n];
            }
        };
    }
    
    public r(final int o, final int p13, final int q, final String r, final String y, final String s, final String t, final JSONObject u, final JSONObject v, final Object w, final HttpURLConnection x, final o z, final boolean b) {
        this.o = o;
        this.p = p13;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        Enum a;
        if (z != null) {
            this.z = z;
            a = x1.r.a.p;
        }
        else {
            this.z = new D(this, this.c());
            a = x1.r.C.b().c(p13, q, b);
        }
        this.A = (a)a;
        this.B = x1.r.C.b().d((a)a);
    }
    
    public r(final int n, final String s, final String s2) {
        this(-1, n, -1, s, s2, null, null, null, null, null, null, null, false);
    }
    
    public r(final Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, null, null, null, false);
    }
    
    public r(final HttpURLConnection httpURLConnection, final Exception ex) {
        o o;
        if (ex instanceof o) {
            o = (o)ex;
        }
        else {
            o = new o(ex);
        }
        this(-1, -1, -1, null, null, null, null, null, null, null, httpURLConnection, o, false);
    }
    
    public static final /* synthetic */ d a() {
        return r.D;
    }
    
    public final int b() {
        return this.p;
    }
    
    public final String c() {
        String s;
        if ((s = this.y) == null) {
            final o z = this.z;
            if (z == null) {
                return null;
            }
            s = z.getLocalizedMessage();
        }
        return s;
    }
    
    public final String d() {
        return this.r;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public final o e() {
        return this.z;
    }
    
    public final int f() {
        return this.o;
    }
    
    public final int g() {
        return this.q;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{HttpStatus: ");
        sb.append(this.o);
        sb.append(", errorCode: ");
        sb.append(this.p);
        sb.append(", subErrorCode: ");
        sb.append(this.q);
        sb.append(", errorType: ");
        sb.append(this.r);
        sb.append(", errorMessage: ");
        sb.append(this.c());
        sb.append("}");
        final String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(\"{HttpStatus: \")\n        .append(requestStatusCode)\n        .append(\", errorCode: \")\n        .append(errorCode)\n        .append(\", subErrorCode: \")\n        .append(subErrorCode)\n        .append(\", errorType: \")\n        .append(errorType)\n        .append(\", errorMessage: \")\n        .append(errorMessage)\n        .append(\"}\")\n        .toString()");
        return string;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeString(this.r);
        parcel.writeString(this.c());
        parcel.writeString(this.s);
        parcel.writeString(this.t);
    }
    
    public enum a
    {
        o("LOGIN_RECOVERABLE", 0), 
        p("OTHER", 1), 
        q("TRANSIENT", 2);
        
        static {
            r = c();
        }
        
        public a(final String name, final int ordinal) {
        }
        
        public static final /* synthetic */ a[] c() {
            return new a[] { a.o, a.p, a.q };
        }
    }
    
    public static final class c
    {
        public final r a(final JSONObject jsonObject, final Object o, final HttpURLConnection httpURLConnection) {
            while (true) {
                Intrinsics.checkNotNullParameter(jsonObject, "singleResult");
                int int1;
                Object o2;
                boolean has;
                boolean optBoolean;
                int n;
                int n2 = 0;
                JSONObject jsonObject2 = null;
                String s = null;
                String optString;
                int n3;
                String s2;
                String optString2 = null;
                JSONObject jsonObject3;
                String optString3 = null;
                String optString4 = null;
                int n4;
                String s3;
                String s4;
                String s5;
                String s6;
                String s7;
                Label_0177_Outer:Label_0301_Outer:
                while (true) {
                    Label_0516: {
                        while (true) {
                            Label_0480: {
                                Label_0462: {
                                Label_0450:
                                    while (true) {
                                        Label_0445: {
                                        Label_0125_Outer:
                                            while (true) {
                                                Label_0437: {
                                                    while (true) {
                                                    Label_0429:
                                                        while (true) {
                                                            Label_0424: {
                                                            Label_0112_Outer:
                                                                while (true) {
                                                                    Label_0416: {
                                                                        while (true) {
                                                                            Label_0408: {
                                                                                try {
                                                                                    if (jsonObject.has("code")) {
                                                                                        int1 = jsonObject.getInt("code");
                                                                                        o2 = P.O(jsonObject, "body", "FACEBOOK_NON_JSON_RESULT");
                                                                                        if (o2 != null && o2 instanceof JSONObject) {
                                                                                            has = ((JSONObject)o2).has("error");
                                                                                            optBoolean = false;
                                                                                            n = 0;
                                                                                            n2 = -1;
                                                                                            if (has) {
                                                                                                jsonObject2 = (JSONObject)P.O((JSONObject)o2, "error", null);
                                                                                                if (jsonObject2 == null) {
                                                                                                    s = null;
                                                                                                    break Label_0408;
                                                                                                }
                                                                                                s = jsonObject2.optString("type", (String)null);
                                                                                                break Label_0408;
                                                                                            }
                                                                                            else {
                                                                                                if (((JSONObject)o2).has("error_code") || ((JSONObject)o2).has("error_msg") || ((JSONObject)o2).has("error_reason")) {
                                                                                                    s = ((JSONObject)o2).optString("error_reason", (String)null);
                                                                                                    optString = ((JSONObject)o2).optString("error_msg", (String)null);
                                                                                                    n3 = ((JSONObject)o2).optInt("error_code", -1);
                                                                                                    n2 = ((JSONObject)o2).optInt("error_subcode", -1);
                                                                                                    optBoolean = false;
                                                                                                    optString2 = (s2 = null);
                                                                                                    break Label_0462;
                                                                                                }
                                                                                                break Label_0480;
                                                                                            }
                                                                                        }
                                                                                        Label_0340: {
                                                                                            if (!this.c().a(int1)) {
                                                                                                if (jsonObject.has("body")) {
                                                                                                    jsonObject3 = (JSONObject)P.O(jsonObject, "body", "FACEBOOK_NON_JSON_RESULT");
                                                                                                    return new r(int1, -1, -1, null, null, null, null, jsonObject3, jsonObject, o, httpURLConnection, null, false, null);
                                                                                                }
                                                                                                break Label_0516;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    return null;
                                                                                    optString3 = jsonObject2.optString("error_user_title", (String)null);
                                                                                    break Label_0445;
                                                                                    n3 = jsonObject2.optInt("code", -1);
                                                                                    break Label_0424;
                                                                                    optString4 = jsonObject2.optString("message", (String)null);
                                                                                    break Label_0416;
                                                                                    optBoolean = jsonObject2.optBoolean("is_transient", false);
                                                                                    break Label_0450;
                                                                                    optString2 = jsonObject2.optString("error_user_msg", (String)null);
                                                                                    break Label_0437;
                                                                                    // iftrue(Label_0340:, n == 0)
                                                                                    return new r(int1, n3, n4, s3, optString, s2, s4, (JSONObject)o2, jsonObject, o, httpURLConnection, null, optBoolean, null);
                                                                                    n2 = jsonObject2.optInt("error_subcode", -1);
                                                                                    break Label_0429;
                                                                                }
                                                                                catch (JSONException ex) {
                                                                                    return null;
                                                                                }
                                                                            }
                                                                            if (jsonObject2 != null) {
                                                                                continue Label_0177_Outer;
                                                                            }
                                                                            break;
                                                                        }
                                                                        optString4 = null;
                                                                    }
                                                                    if (jsonObject2 != null) {
                                                                        continue Label_0112_Outer;
                                                                    }
                                                                    break;
                                                                }
                                                                n3 = -1;
                                                            }
                                                            if (jsonObject2 != null) {
                                                                continue;
                                                            }
                                                            break;
                                                        }
                                                        if (jsonObject2 != null) {
                                                            continue Label_0301_Outer;
                                                        }
                                                        break;
                                                    }
                                                    optString2 = null;
                                                }
                                                if (jsonObject2 != null) {
                                                    continue Label_0125_Outer;
                                                }
                                                break;
                                            }
                                            optString3 = null;
                                        }
                                        if (jsonObject2 != null) {
                                            continue Label_0301_Outer;
                                        }
                                        break;
                                    }
                                    s5 = optString4;
                                    s2 = optString3;
                                    optString = s5;
                                }
                                n = 1;
                                s3 = s;
                                n4 = n2;
                                s4 = optString2;
                                continue;
                            }
                            optBoolean = false;
                            n4 = -1;
                            s3 = (s6 = null);
                            s4 = (s7 = s6);
                            optString = s6;
                            n3 = n2;
                            s2 = s7;
                            continue;
                        }
                    }
                    jsonObject3 = null;
                    continue;
                }
            }
        }
        
        public final j b() {
            // monitorenter(this)
            // monitorexit(this)
            Label_0041: {
                try {
                    final v a = O1.v.a;
                    if (O1.v.f(x1.B.m()) == null) {
                        // monitorexit(this)
                        return j.g.b();
                    }
                }
                finally {
                    break Label_0041;
                }
                final O1.r r;
                return r.c();
            }
        }
        // monitorexit(this)
        
        public final d c() {
            return x1.r.a();
        }
    }
    
    public static final class d
    {
        public final int a;
        public final int b;
        
        public d(final int a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        public final boolean a(final int n) {
            final int a = this.a;
            final int b = this.b;
            boolean b2 = false;
            if (n <= b) {
                b2 = b2;
                if (a <= n) {
                    b2 = true;
                }
            }
            return b2;
        }
    }
}
