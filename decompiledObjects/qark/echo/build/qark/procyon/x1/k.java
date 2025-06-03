// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x1;

import java.util.List;
import java.net.MalformedURLException;
import java.util.Date;
import java.net.URL;
import org.json.JSONArray;
import O1.P;
import org.json.JSONObject;
import kotlin.text.b;
import android.util.Base64;
import java.util.ArrayList;
import kotlin.jvm.internal.x;
import java.util.HashMap;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import O1.Q;
import kotlin.jvm.internal.Intrinsics;
import android.os.Parcel;
import kotlin.jvm.internal.g;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class k implements Parcelable
{
    @NotNull
    public static final Parcelable$Creator<k> CREATOR;
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
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public k a(final Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "source");
                return new k(parcel);
            }
            
            public k[] b(final int n) {
                return new k[n];
            }
        };
    }
    
    public k(final Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
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
        final ArrayList stringArrayList = parcel.createStringArrayList();
        Map<Object, Object> unmodifiableMap = null;
        Set<Object> unmodifiableSet;
        if (stringArrayList != null) {
            unmodifiableSet = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(stringArrayList));
        }
        else {
            unmodifiableSet = null;
        }
        this.B = unmodifiableSet;
        this.C = parcel.readString();
        HashMap<? extends K, ? extends V> hashMap = (HashMap<? extends K, ? extends V>)parcel.readHashMap(kotlin.jvm.internal.k.a.getClass().getClassLoader());
        if (!(hashMap instanceof HashMap)) {
            hashMap = null;
        }
        Map<Object, Object> unmodifiableMap2;
        if (hashMap != null) {
            unmodifiableMap2 = Collections.unmodifiableMap((Map<?, ?>)hashMap);
        }
        else {
            unmodifiableMap2 = null;
        }
        this.D = unmodifiableMap2;
        final x a = kotlin.jvm.internal.x.a;
        HashMap<? extends K, ? extends V> hashMap2 = (HashMap<? extends K, ? extends V>)parcel.readHashMap(a.getClass().getClassLoader());
        if (!(hashMap2 instanceof HashMap)) {
            hashMap2 = null;
        }
        Map<Object, Object> unmodifiableMap3;
        if (hashMap2 != null) {
            unmodifiableMap3 = Collections.unmodifiableMap((Map<?, ?>)hashMap2);
        }
        else {
            unmodifiableMap3 = null;
        }
        this.E = unmodifiableMap3;
        HashMap<? extends K, ? extends V> hashMap3 = (HashMap<? extends K, ? extends V>)parcel.readHashMap(a.getClass().getClassLoader());
        if (!(hashMap3 instanceof HashMap)) {
            hashMap3 = null;
        }
        if (hashMap3 != null) {
            unmodifiableMap = Collections.unmodifiableMap((Map<?, ?>)hashMap3);
        }
        this.F = unmodifiableMap;
        this.G = parcel.readString();
        this.H = parcel.readString();
    }
    
    public k(String u, final String s) {
        Intrinsics.checkNotNullParameter(u, "encodedClaims");
        Intrinsics.checkNotNullParameter(s, "expectedNonce");
        Q.g(u, "encodedClaims");
        final byte[] decode = Base64.decode(u, 8);
        Intrinsics.checkNotNullExpressionValue(decode, "decodedBytes");
        final JSONObject jsonObject = new JSONObject(new String(decode, kotlin.text.b.b));
        if (this.a(jsonObject, s)) {
            u = jsonObject.getString("jti");
            Intrinsics.checkNotNullExpressionValue(u, "jsonObj.getString(JSON_KEY_JIT)");
            this.o = u;
            u = jsonObject.getString("iss");
            Intrinsics.checkNotNullExpressionValue(u, "jsonObj.getString(JSON_KEY_ISS)");
            this.p = u;
            u = jsonObject.getString("aud");
            Intrinsics.checkNotNullExpressionValue(u, "jsonObj.getString(JSON_KEY_AUD)");
            this.q = u;
            u = jsonObject.getString("nonce");
            Intrinsics.checkNotNullExpressionValue(u, "jsonObj.getString(JSON_KEY_NONCE)");
            this.r = u;
            this.s = jsonObject.getLong("exp");
            this.t = jsonObject.getLong("iat");
            u = jsonObject.getString("sub");
            Intrinsics.checkNotNullExpressionValue(u, "jsonObj.getString(JSON_KEY_SUB)");
            this.u = u;
            final b i = k.I;
            this.v = i.a(jsonObject, "name");
            this.w = i.a(jsonObject, "given_name");
            this.x = i.a(jsonObject, "middle_name");
            this.y = i.a(jsonObject, "family_name");
            this.z = i.a(jsonObject, "email");
            this.A = i.a(jsonObject, "picture");
            final JSONArray optJSONArray = jsonObject.optJSONArray("user_friends");
            final Map map = null;
            Set<Object> unmodifiableSet;
            if (optJSONArray == null) {
                unmodifiableSet = null;
            }
            else {
                unmodifiableSet = Collections.unmodifiableSet((Set<?>)P.f0(optJSONArray));
            }
            this.B = unmodifiableSet;
            this.C = i.a(jsonObject, "user_birthday");
            final JSONObject optJSONObject = jsonObject.optJSONObject("user_age_range");
            Map<Object, Object> unmodifiableMap;
            if (optJSONObject == null) {
                unmodifiableMap = null;
            }
            else {
                unmodifiableMap = Collections.unmodifiableMap((Map<?, ?>)P.n(optJSONObject));
            }
            this.D = unmodifiableMap;
            final JSONObject optJSONObject2 = jsonObject.optJSONObject("user_hometown");
            Map<Object, Object> unmodifiableMap2;
            if (optJSONObject2 == null) {
                unmodifiableMap2 = null;
            }
            else {
                unmodifiableMap2 = Collections.unmodifiableMap((Map<?, ?>)P.o(optJSONObject2));
            }
            this.E = unmodifiableMap2;
            final JSONObject optJSONObject3 = jsonObject.optJSONObject("user_location");
            Map<Object, Object> unmodifiableMap3;
            if (optJSONObject3 == null) {
                unmodifiableMap3 = (Map<Object, Object>)map;
            }
            else {
                unmodifiableMap3 = Collections.unmodifiableMap((Map<?, ?>)P.o(optJSONObject3));
            }
            this.F = unmodifiableMap3;
            this.G = i.a(jsonObject, "user_gender");
            this.H = i.a(jsonObject, "user_link");
            return;
        }
        throw new IllegalArgumentException("Invalid claims".toString());
    }
    
    public final boolean a(final JSONObject jsonObject, final String s) {
        if (jsonObject == null) {
            return false;
        }
        final String optString = jsonObject.optString("jti");
        Intrinsics.checkNotNullExpressionValue(optString, "jti");
        if (optString.length() == 0) {
            return false;
        }
        try {
            final String optString2 = jsonObject.optString("iss");
            Intrinsics.checkNotNullExpressionValue(optString2, "iss");
            if (optString2.length() == 0) {
                return false;
            }
            if (!Intrinsics.a(new URL(optString2).getHost(), "facebook.com") && !Intrinsics.a(new URL(optString2).getHost(), "www.facebook.com")) {
                return false;
            }
            final String optString3 = jsonObject.optString("aud");
            Intrinsics.checkNotNullExpressionValue(optString3, "aud");
            if (optString3.length() == 0) {
                return false;
            }
            if (!Intrinsics.a(optString3, x1.B.m())) {
                return false;
            }
            final long optLong = jsonObject.optLong("exp");
            final long n = 1000;
            if (new Date().after(new Date(optLong * n))) {
                return false;
            }
            if (new Date().after(new Date(jsonObject.optLong("iat") * n + 600000L))) {
                return false;
            }
            final String optString4 = jsonObject.optString("sub");
            Intrinsics.checkNotNullExpressionValue(optString4, "sub");
            if (optString4.length() == 0) {
                return false;
            }
            final String optString5 = jsonObject.optString("nonce");
            Intrinsics.checkNotNullExpressionValue(optString5, "nonce");
            return optString5.length() != 0 && Intrinsics.a(optString5, s);
        }
        catch (MalformedURLException ex) {
            return false;
        }
    }
    
    public final JSONObject b() {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("jti", (Object)this.o);
        jsonObject.put("iss", (Object)this.p);
        jsonObject.put("aud", (Object)this.q);
        jsonObject.put("nonce", (Object)this.r);
        jsonObject.put("exp", this.s);
        jsonObject.put("iat", this.t);
        final String u = this.u;
        if (u != null) {
            jsonObject.put("sub", (Object)u);
        }
        final String v = this.v;
        if (v != null) {
            jsonObject.put("name", (Object)v);
        }
        final String w = this.w;
        if (w != null) {
            jsonObject.put("given_name", (Object)w);
        }
        final String x = this.x;
        if (x != null) {
            jsonObject.put("middle_name", (Object)x);
        }
        final String y = this.y;
        if (y != null) {
            jsonObject.put("family_name", (Object)y);
        }
        final String z = this.z;
        if (z != null) {
            jsonObject.put("email", (Object)z);
        }
        final String a = this.A;
        if (a != null) {
            jsonObject.put("picture", (Object)a);
        }
        if (this.B != null) {
            jsonObject.put("user_friends", (Object)new JSONArray((Collection)this.B));
        }
        final String c = this.C;
        if (c != null) {
            jsonObject.put("user_birthday", (Object)c);
        }
        if (this.D != null) {
            jsonObject.put("user_age_range", (Object)new JSONObject(this.D));
        }
        if (this.E != null) {
            jsonObject.put("user_hometown", (Object)new JSONObject(this.E));
        }
        if (this.F != null) {
            jsonObject.put("user_location", (Object)new JSONObject(this.F));
        }
        final String g = this.G;
        if (g != null) {
            jsonObject.put("user_gender", (Object)g);
        }
        final String h = this.H;
        if (h != null) {
            jsonObject.put("user_link", (Object)h);
        }
        return jsonObject;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof k)) {
            return false;
        }
        final String o2 = this.o;
        final k k = (k)o;
        return Intrinsics.a(o2, k.o) && Intrinsics.a(this.p, k.p) && Intrinsics.a(this.q, k.q) && Intrinsics.a(this.r, k.r) && this.s == k.s && this.t == k.t && Intrinsics.a(this.u, k.u) && Intrinsics.a(this.v, k.v) && Intrinsics.a(this.w, k.w) && Intrinsics.a(this.x, k.x) && Intrinsics.a(this.y, k.y) && Intrinsics.a(this.z, k.z) && Intrinsics.a(this.A, k.A) && Intrinsics.a(this.B, k.B) && Intrinsics.a(this.C, k.C) && Intrinsics.a(this.D, k.D) && Intrinsics.a(this.E, k.E) && Intrinsics.a(this.F, k.F) && Intrinsics.a(this.G, k.G) && Intrinsics.a(this.H, k.H);
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.o.hashCode();
        final int hashCode2 = this.p.hashCode();
        final int hashCode3 = this.q.hashCode();
        final int hashCode4 = this.r.hashCode();
        final int a = j.a(this.s);
        final int a2 = j.a(this.t);
        final int hashCode5 = this.u.hashCode();
        final String v = this.v;
        int hashCode6 = 0;
        int hashCode7;
        if (v == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = v.hashCode();
        }
        final String w = this.w;
        int hashCode8;
        if (w == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = w.hashCode();
        }
        final String x = this.x;
        int hashCode9;
        if (x == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = x.hashCode();
        }
        final String y = this.y;
        int hashCode10;
        if (y == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = y.hashCode();
        }
        final String z = this.z;
        int hashCode11;
        if (z == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = z.hashCode();
        }
        final String a3 = this.A;
        int hashCode12;
        if (a3 == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = a3.hashCode();
        }
        final Set b = this.B;
        int hashCode13;
        if (b == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = b.hashCode();
        }
        final String c = this.C;
        int hashCode14;
        if (c == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = c.hashCode();
        }
        final Map d = this.D;
        int hashCode15;
        if (d == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = d.hashCode();
        }
        final Map e = this.E;
        int hashCode16;
        if (e == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = e.hashCode();
        }
        final Map f = this.F;
        int hashCode17;
        if (f == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = f.hashCode();
        }
        final String g = this.G;
        int hashCode18;
        if (g == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = g.hashCode();
        }
        final String h = this.H;
        if (h != null) {
            hashCode6 = h.hashCode();
        }
        return (((((((((((((((((((527 + hashCode) * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + a) * 31 + a2) * 31 + hashCode5) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode14) * 31 + hashCode15) * 31 + hashCode16) * 31 + hashCode17) * 31 + hashCode18) * 31 + hashCode6;
    }
    
    @Override
    public String toString() {
        final String string = this.b().toString();
        Intrinsics.checkNotNullExpressionValue(string, "claimsJsonObject.toString()");
        return string;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
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
        List list;
        if (this.B == null) {
            list = null;
        }
        else {
            list = new ArrayList(this.B);
        }
        parcel.writeStringList(list);
        parcel.writeString(this.C);
        parcel.writeMap(this.D);
        parcel.writeMap(this.E);
        parcel.writeMap(this.F);
        parcel.writeString(this.G);
        parcel.writeString(this.H);
    }
    
    public static final class b
    {
        public final String a(final JSONObject jsonObject, final String s) {
            Intrinsics.checkNotNullParameter(jsonObject, "<this>");
            Intrinsics.checkNotNullParameter(s, "name");
            if (jsonObject.has(s)) {
                return jsonObject.getString(s);
            }
            return null;
        }
    }
}
