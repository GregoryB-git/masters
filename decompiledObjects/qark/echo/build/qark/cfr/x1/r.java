/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.util.Arrays
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package x1;

import O1.P;
import O1.j;
import O1.v;
import android.os.Parcel;
import android.os.Parcelable;
import java.net.HttpURLConnection;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.D;
import x1.o;

public final class r
implements Parcelable {
    public static final c C = new c(null);
    @NotNull
    public static final Parcelable.Creator<r> CREATOR;
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
        D = new d(200, 299);
        CREATOR = new Parcelable.Creator(){

            public r a(Parcel parcel) {
                Intrinsics.checkNotNullParameter((Object)parcel, "parcel");
                return new r(parcel, null);
            }

            public r[] b(int n8) {
                return new r[n8];
            }
        };
    }

    public r(int n8, int n9, int n10, String object, String string2, String string3, String string4, JSONObject jSONObject, JSONObject jSONObject2, Object object2, HttpURLConnection httpURLConnection, o o8, boolean bl) {
        this.o = n8;
        this.p = n9;
        this.q = n10;
        this.r = object;
        this.s = string3;
        this.t = string4;
        this.u = jSONObject;
        this.v = jSONObject2;
        this.w = object2;
        this.x = httpURLConnection;
        this.y = string2;
        if (o8 != null) {
            this.z = o8;
            object = a.p;
        } else {
            this.z = new D(this, this.c());
            object = C.b().c(n9, n10, bl);
        }
        this.A = object;
        this.B = C.b().d((a)((Object)object));
    }

    public /* synthetic */ r(int n8, int n9, int n10, String string2, String string3, String string4, String string5, JSONObject jSONObject, JSONObject jSONObject2, Object object, HttpURLConnection httpURLConnection, o o8, boolean bl, g g8) {
        this(n8, n9, n10, string2, string3, string4, string5, jSONObject, jSONObject2, object, httpURLConnection, o8, bl);
    }

    public r(int n8, String string2, String string3) {
        this(-1, n8, -1, string2, string3, null, null, null, null, null, null, null, false);
    }

    public r(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, null, null, null, false);
    }

    public /* synthetic */ r(Parcel parcel, g g8) {
        this(parcel);
    }

    public r(HttpURLConnection httpURLConnection, Exception object) {
        object = object instanceof o ? (o)((Object)object) : new o((Throwable)object);
        this(-1, -1, -1, null, null, null, null, null, null, null, httpURLConnection, (o)((Object)object), false);
    }

    public final int b() {
        return this.p;
    }

    public final String c() {
        String string2 = this.y;
        Object object = string2;
        if (string2 == null) {
            object = this.z;
            if (object == null) {
                return null;
            }
            object = object.getLocalizedMessage();
        }
        return object;
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

    public String toString() {
        Object object = new StringBuilder("{HttpStatus: ");
        object.append(this.o);
        object.append(", errorCode: ");
        object.append(this.p);
        object.append(", subErrorCode: ");
        object.append(this.q);
        object.append(", errorType: ");
        object.append(this.r);
        object.append(", errorMessage: ");
        object.append(this.c());
        object.append("}");
        object = object.toString();
        Intrinsics.checkNotNullExpressionValue(object, "StringBuilder(\"{HttpStatus: \")\n        .append(requestStatusCode)\n        .append(\", errorCode: \")\n        .append(errorCode)\n        .append(\", subErrorCode: \")\n        .append(subErrorCode)\n        .append(\", errorType: \")\n        .append(errorType)\n        .append(\", errorMessage: \")\n        .append(errorMessage)\n        .append(\"}\")\n        .toString()");
        return object;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        Intrinsics.checkNotNullParameter((Object)parcel, "out");
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeString(this.r);
        parcel.writeString(this.c());
        parcel.writeString(this.s);
        parcel.writeString(this.t);
    }

    public static final class a
    extends Enum {
        public static final /* enum */ a o = new a();
        public static final /* enum */ a p = new a();
        public static final /* enum */ a q = new a();
        public static final /* synthetic */ a[] r;

        static {
            r = a.c();
        }

        public static final /* synthetic */ a[] c() {
            return new a[]{o, p, q};
        }

        public static a valueOf(String string2) {
            Intrinsics.checkNotNullParameter(string2, "value");
            return (a)Enum.valueOf(a.class, (String)string2);
        }

        public static a[] values() {
            a[] arra = r;
            return (a[])Arrays.copyOf((Object[])arra, (int)arra.length);
        }
    }

    public static final class c {
        public c() {
        }

        public /* synthetic */ c(g g8) {
            this();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final r a(JSONObject object, Object object2, HttpURLConnection httpURLConnection) {
            Object object3;
            int n8;
            block6 : {
                Object object4;
                Object object5;
                boolean bl;
                boolean bl2;
                int n9;
                Object object6;
                Object object7;
                int n10;
                block10 : {
                    int n11;
                    block8 : {
                        String string2;
                        block9 : {
                            block7 : {
                                Intrinsics.checkNotNullParameter(object, "singleResult");
                                try {
                                    if (!object.has("code")) return null;
                                    n8 = object.getInt("code");
                                    object6 = P.O((JSONObject)object, "body", "FACEBOOK_NON_JSON_RESULT");
                                    if (object6 == null || !(object6 instanceof JSONObject)) break block6;
                                    boolean bl3 = ((JSONObject)object6).has("error");
                                    bl = false;
                                    bl2 = false;
                                    n11 = -1;
                                    if (bl3) {
                                        object5 = (JSONObject)P.O((JSONObject)object6, "error", null);
                                        object3 = object5 == null ? null : object5.optString("type", null);
                                        break block7;
                                    }
                                    bl = ((JSONObject)object6).has("error_code");
                                    if (!bl && !((JSONObject)object6).has("error_msg") && !((JSONObject)object6).has("error_reason")) break block8;
                                    object3 = ((JSONObject)object6).optString("error_reason", null);
                                    object7 = ((JSONObject)object6).optString("error_msg", null);
                                    n10 = ((JSONObject)object6).optInt("error_code", -1);
                                    n11 = ((JSONObject)object6).optInt("error_subcode", -1);
                                    bl = false;
                                    string2 = null;
                                    object4 = string2;
                                    break block9;
                                }
                                catch (JSONException jSONException) {
                                    return null;
                                }
                            }
                            object4 = object5 == null ? null : object5.optString("message", null);
                            n10 = object5 == null ? -1 : object5.optInt("code", -1);
                            if (object5 != null) {
                                n11 = object5.optInt("error_subcode", -1);
                            }
                            string2 = object5 == null ? null : object5.optString("error_user_msg", null);
                            object7 = object5 == null ? null : object5.optString("error_user_title", null);
                            if (object5 != null) {
                                bl = object5.optBoolean("is_transient", false);
                            }
                            object5 = object4;
                            object4 = object7;
                            object7 = object5;
                        }
                        bl2 = true;
                        object5 = object3;
                        n9 = n11;
                        object3 = string2;
                        break block10;
                    }
                    bl = false;
                    n9 = -1;
                    Object object8 = object3 = (object4 = (object5 = null));
                    object7 = object4;
                    n10 = n11;
                    object4 = object8;
                }
                if (bl2) {
                    return new r(n8, n10, n9, (String)object5, (String)object7, (String)object4, (String)object3, (JSONObject)object6, (JSONObject)object, object2, httpURLConnection, null, bl, null);
                }
            }
            if (this.c().a(n8)) return null;
            object3 = object.has("body") ? (JSONObject)P.O((JSONObject)object, "body", "FACEBOOK_NON_JSON_RESULT") : null;
            return new r(n8, -1, -1, null, null, null, null, (JSONObject)object3, (JSONObject)object, object2, httpURLConnection, null, false, null);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final j b() {
            synchronized (this) {
                try {
                    Object object = v.a;
                    object = v.f(B.m());
                    if (object != null) return object.c();
                    return j.g.b();
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        public final d c() {
            return D;
        }
    }

    public static final class d {
        public final int a;
        public final int b;

        public d(int n8, int n9) {
            this.a = n8;
            this.b = n9;
        }

        public final boolean a(int n8) {
            boolean bl;
            int n9 = this.a;
            int n10 = this.b;
            boolean bl2 = bl = false;
            if (n8 <= n10) {
                bl2 = bl;
                if (n9 <= n8) {
                    bl2 = true;
                }
            }
            return bl2;
        }
    }

}

