/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.Base64
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.net.MalformedURLException
 *  java.net.URL
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package x1;

import O1.P;
import O1.Q;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.x;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import x1.B;
import x1.j;

public final class k
implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<k> CREATOR;
    public static final b I;
    public final String A;
    public final Set B;
    public final String C;
    public final Map D;
    public final Map E;
    public final Map F;
    public final String G;
    public final String H;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final long s;
    public final long t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    static {
        I = new b(null);
        CREATOR = new Parcelable.Creator(){

            public k a(Parcel parcel) {
                Intrinsics.checkNotNullParameter((Object)parcel, "source");
                return new k(parcel);
            }

            public k[] b(int n8) {
                return new k[n8];
            }
        };
    }

    public k(Parcel parcel) {
        Intrinsics.checkNotNullParameter((Object)parcel, "parcel");
        this.o = Q.k(parcel.readString(), "jti");
        this.p = Q.k(parcel.readString(), "iss");
        this.q = Q.k(parcel.readString(), "aud");
        this.r = Q.k(parcel.readString(), "nonce");
        this.s = parcel.readLong();
        this.t = parcel.readLong();
        this.u = Q.k(parcel.readString(), "sub");
        this.v = parcel.readString();
        this.w = parcel.readString();
        this.x = parcel.readString();
        this.y = parcel.readString();
        this.z = parcel.readString();
        this.A = parcel.readString();
        ArrayList arrayList = parcel.createStringArrayList();
        Map map = null;
        arrayList = arrayList != null ? Collections.unmodifiableSet((Set)new HashSet((Collection)arrayList)) : null;
        this.B = arrayList;
        this.C = parcel.readString();
        arrayList = parcel.readHashMap(kotlin.jvm.internal.k.a.getClass().getClassLoader());
        if (!(arrayList instanceof HashMap)) {
            arrayList = null;
        }
        arrayList = arrayList != null ? Collections.unmodifiableMap((Map)arrayList) : null;
        this.D = arrayList;
        x x8 = x.a;
        arrayList = parcel.readHashMap(x8.getClass().getClassLoader());
        if (!(arrayList instanceof HashMap)) {
            arrayList = null;
        }
        arrayList = arrayList != null ? Collections.unmodifiableMap((Map)arrayList) : null;
        this.E = arrayList;
        arrayList = parcel.readHashMap(x8.getClass().getClassLoader());
        if (!(arrayList instanceof HashMap)) {
            arrayList = null;
        }
        if (arrayList != null) {
            map = Collections.unmodifiableMap((Map)arrayList);
        }
        this.F = map;
        this.G = parcel.readString();
        this.H = parcel.readString();
    }

    public k(String object, String string2) {
        Intrinsics.checkNotNullParameter(object, "encodedClaims");
        Intrinsics.checkNotNullParameter(string2, "expectedNonce");
        Q.g((String)object, "encodedClaims");
        object = Base64.decode((String)object, (int)8);
        Intrinsics.checkNotNullExpressionValue(object, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String((byte[])object, kotlin.text.b.b));
        if (this.a(jSONObject, string2)) {
            object = jSONObject.getString("jti");
            Intrinsics.checkNotNullExpressionValue(object, "jsonObj.getString(JSON_KEY_JIT)");
            this.o = object;
            object = jSONObject.getString("iss");
            Intrinsics.checkNotNullExpressionValue(object, "jsonObj.getString(JSON_KEY_ISS)");
            this.p = object;
            object = jSONObject.getString("aud");
            Intrinsics.checkNotNullExpressionValue(object, "jsonObj.getString(JSON_KEY_AUD)");
            this.q = object;
            object = jSONObject.getString("nonce");
            Intrinsics.checkNotNullExpressionValue(object, "jsonObj.getString(JSON_KEY_NONCE)");
            this.r = object;
            this.s = jSONObject.getLong("exp");
            this.t = jSONObject.getLong("iat");
            object = jSONObject.getString("sub");
            Intrinsics.checkNotNullExpressionValue(object, "jsonObj.getString(JSON_KEY_SUB)");
            this.u = object;
            b b8 = I;
            this.v = b8.a(jSONObject, "name");
            this.w = b8.a(jSONObject, "given_name");
            this.x = b8.a(jSONObject, "middle_name");
            this.y = b8.a(jSONObject, "family_name");
            this.z = b8.a(jSONObject, "email");
            this.A = b8.a(jSONObject, "picture");
            object = jSONObject.optJSONArray("user_friends");
            string2 = null;
            object = object == null ? null : Collections.unmodifiableSet((Set)P.f0((JSONArray)object));
            this.B = object;
            this.C = b8.a(jSONObject, "user_birthday");
            object = jSONObject.optJSONObject("user_age_range");
            object = object == null ? null : Collections.unmodifiableMap((Map)P.n((JSONObject)object));
            this.D = object;
            object = jSONObject.optJSONObject("user_hometown");
            object = object == null ? null : Collections.unmodifiableMap((Map)P.o((JSONObject)object));
            this.E = object;
            object = jSONObject.optJSONObject("user_location");
            object = object == null ? string2 : Collections.unmodifiableMap((Map)P.o((JSONObject)object));
            this.F = object;
            this.G = b8.a(jSONObject, "user_gender");
            this.H = b8.a(jSONObject, "user_link");
            return;
        }
        throw new IllegalArgumentException("Invalid claims".toString());
    }

    public final boolean a(JSONObject object, String string2) {
        String string3;
        long l8;
        block13 : {
            boolean bl;
            block12 : {
                if (object == null) {
                    return false;
                }
                string3 = object.optString("jti");
                Intrinsics.checkNotNullExpressionValue(string3, "jti");
                if (string3.length() == 0) {
                    return false;
                }
                try {
                    string3 = object.optString("iss");
                    Intrinsics.checkNotNullExpressionValue(string3, "iss");
                    if (string3.length() != 0) break block12;
                    return false;
                }
                catch (MalformedURLException malformedURLException) {
                    return false;
                }
            }
            if (Intrinsics.a(new URL(string3).getHost(), "facebook.com") || (bl = Intrinsics.a(new URL(string3).getHost(), "www.facebook.com"))) break block13;
            return false;
        }
        string3 = object.optString("aud");
        Intrinsics.checkNotNullExpressionValue(string3, "aud");
        if (string3.length() == 0) {
            return false;
        }
        if (!Intrinsics.a(string3, B.m())) {
            return false;
        }
        long l9 = object.optLong("exp");
        string3 = new Date(l9 * (l8 = (long)1000));
        if (new Date().after((Date)string3)) {
            return false;
        }
        string3 = new Date(object.optLong("iat") * l8 + 600000L);
        if (new Date().after((Date)string3)) {
            return false;
        }
        string3 = object.optString("sub");
        Intrinsics.checkNotNullExpressionValue(string3, "sub");
        if (string3.length() == 0) {
            return false;
        }
        object = object.optString("nonce");
        Intrinsics.checkNotNullExpressionValue(object, "nonce");
        if (object.length() == 0) {
            return false;
        }
        if (!Intrinsics.a(object, string2)) {
            return false;
        }
        return true;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", (Object)this.o);
        jSONObject.put("iss", (Object)this.p);
        jSONObject.put("aud", (Object)this.q);
        jSONObject.put("nonce", (Object)this.r);
        jSONObject.put("exp", this.s);
        jSONObject.put("iat", this.t);
        String string2 = this.u;
        if (string2 != null) {
            jSONObject.put("sub", (Object)string2);
        }
        if ((string2 = this.v) != null) {
            jSONObject.put("name", (Object)string2);
        }
        if ((string2 = this.w) != null) {
            jSONObject.put("given_name", (Object)string2);
        }
        if ((string2 = this.x) != null) {
            jSONObject.put("middle_name", (Object)string2);
        }
        if ((string2 = this.y) != null) {
            jSONObject.put("family_name", (Object)string2);
        }
        if ((string2 = this.z) != null) {
            jSONObject.put("email", (Object)string2);
        }
        if ((string2 = this.A) != null) {
            jSONObject.put("picture", (Object)string2);
        }
        if (this.B != null) {
            jSONObject.put("user_friends", (Object)new JSONArray((Collection)this.B));
        }
        if ((string2 = this.C) != null) {
            jSONObject.put("user_birthday", (Object)string2);
        }
        if (this.D != null) {
            jSONObject.put("user_age_range", (Object)new JSONObject(this.D));
        }
        if (this.E != null) {
            jSONObject.put("user_hometown", (Object)new JSONObject(this.E));
        }
        if (this.F != null) {
            jSONObject.put("user_location", (Object)new JSONObject(this.F));
        }
        if ((string2 = this.G) != null) {
            jSONObject.put("user_gender", (Object)string2);
        }
        if ((string2 = this.H) != null) {
            jSONObject.put("user_link", (Object)string2);
        }
        return jSONObject;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof k)) {
            return false;
        }
        String string2 = this.o;
        object = (k)object;
        if (Intrinsics.a(string2, object.o) && Intrinsics.a(this.p, object.p) && Intrinsics.a(this.q, object.q) && Intrinsics.a(this.r, object.r) && this.s == object.s && this.t == object.t && Intrinsics.a(this.u, object.u) && Intrinsics.a(this.v, object.v) && Intrinsics.a(this.w, object.w) && Intrinsics.a(this.x, object.x) && Intrinsics.a(this.y, object.y) && Intrinsics.a(this.z, object.z) && Intrinsics.a(this.A, object.A) && Intrinsics.a((Object)this.B, (Object)object.B) && Intrinsics.a(this.C, object.C) && Intrinsics.a((Object)this.D, (Object)object.D) && Intrinsics.a((Object)this.E, (Object)object.E) && Intrinsics.a((Object)this.F, (Object)object.F) && Intrinsics.a(this.G, object.G) && Intrinsics.a(this.H, object.H)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.o.hashCode();
        int n9 = this.p.hashCode();
        int n10 = this.q.hashCode();
        int n11 = this.r.hashCode();
        int n12 = j.a(this.s);
        int n13 = j.a(this.t);
        int n14 = this.u.hashCode();
        String string2 = this.v;
        int n15 = 0;
        int n16 = string2 == null ? 0 : string2.hashCode();
        string2 = this.w;
        int n17 = string2 == null ? 0 : string2.hashCode();
        string2 = this.x;
        int n18 = string2 == null ? 0 : string2.hashCode();
        string2 = this.y;
        int n19 = string2 == null ? 0 : string2.hashCode();
        string2 = this.z;
        int n20 = string2 == null ? 0 : string2.hashCode();
        string2 = this.A;
        int n21 = string2 == null ? 0 : string2.hashCode();
        string2 = this.B;
        int n22 = string2 == null ? 0 : string2.hashCode();
        string2 = this.C;
        int n23 = string2 == null ? 0 : string2.hashCode();
        string2 = this.D;
        int n24 = string2 == null ? 0 : string2.hashCode();
        string2 = this.E;
        int n25 = string2 == null ? 0 : string2.hashCode();
        string2 = this.F;
        int n26 = string2 == null ? 0 : string2.hashCode();
        string2 = this.G;
        int n27 = string2 == null ? 0 : string2.hashCode();
        string2 = this.H;
        if (string2 != null) {
            n15 = string2.hashCode();
        }
        return (((((((((((((((((((527 + n8) * 31 + n9) * 31 + n10) * 31 + n11) * 31 + n12) * 31 + n13) * 31 + n14) * 31 + n16) * 31 + n17) * 31 + n18) * 31 + n19) * 31 + n20) * 31 + n21) * 31 + n22) * 31 + n23) * 31 + n24) * 31 + n25) * 31 + n26) * 31 + n27) * 31 + n15;
    }

    public String toString() {
        String string2 = this.b().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "claimsJsonObject.toString()");
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void writeToParcel(Parcel parcel, int n8) {
        Intrinsics.checkNotNullParameter((Object)parcel, "dest");
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeLong(this.s);
        parcel.writeLong(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeString(this.x);
        parcel.writeString(this.y);
        parcel.writeString(this.z);
        parcel.writeString(this.A);
        ArrayList arrayList = this.B == null ? null : new ArrayList((Collection)this.B);
        parcel.writeStringList((List)arrayList);
        parcel.writeString(this.C);
        parcel.writeMap(this.D);
        parcel.writeMap(this.E);
        parcel.writeMap(this.F);
        parcel.writeString(this.G);
        parcel.writeString(this.H);
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(g g8) {
            this();
        }

        public final String a(JSONObject jSONObject, String string2) {
            Intrinsics.checkNotNullParameter((Object)jSONObject, "<this>");
            Intrinsics.checkNotNullParameter(string2, "name");
            if (jSONObject.has(string2)) {
                return jSONObject.getString(string2);
            }
            return null;
        }
    }

}

