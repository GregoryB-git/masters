package x1;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: x1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2158k implements Parcelable {

    /* renamed from: A, reason: collision with root package name */
    public final String f21081A;

    /* renamed from: B, reason: collision with root package name */
    public final Set f21082B;

    /* renamed from: C, reason: collision with root package name */
    public final String f21083C;

    /* renamed from: D, reason: collision with root package name */
    public final Map f21084D;

    /* renamed from: E, reason: collision with root package name */
    public final Map f21085E;

    /* renamed from: F, reason: collision with root package name */
    public final Map f21086F;

    /* renamed from: G, reason: collision with root package name */
    public final String f21087G;

    /* renamed from: H, reason: collision with root package name */
    public final String f21088H;

    /* renamed from: o, reason: collision with root package name */
    public final String f21089o;

    /* renamed from: p, reason: collision with root package name */
    public final String f21090p;

    /* renamed from: q, reason: collision with root package name */
    public final String f21091q;

    /* renamed from: r, reason: collision with root package name */
    public final String f21092r;

    /* renamed from: s, reason: collision with root package name */
    public final long f21093s;

    /* renamed from: t, reason: collision with root package name */
    public final long f21094t;

    /* renamed from: u, reason: collision with root package name */
    public final String f21095u;

    /* renamed from: v, reason: collision with root package name */
    public final String f21096v;

    /* renamed from: w, reason: collision with root package name */
    public final String f21097w;

    /* renamed from: x, reason: collision with root package name */
    public final String f21098x;

    /* renamed from: y, reason: collision with root package name */
    public final String f21099y;

    /* renamed from: z, reason: collision with root package name */
    public final String f21100z;

    /* renamed from: I, reason: collision with root package name */
    public static final b f21080I = new b(null);

    @NotNull
    public static final Parcelable.Creator<C2158k> CREATOR = new a();

    /* renamed from: x1.k$a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2158k createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new C2158k(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2158k[] newArray(int i7) {
            return new C2158k[i7];
        }
    }

    /* renamed from: x1.k$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final String a(JSONObject jSONObject, String name) {
            Intrinsics.checkNotNullParameter(jSONObject, "<this>");
            Intrinsics.checkNotNullParameter(name, "name");
            if (jSONObject.has(name)) {
                return jSONObject.getString(name);
            }
            return null;
        }
    }

    public C2158k(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f21089o = O1.Q.k(parcel.readString(), "jti");
        this.f21090p = O1.Q.k(parcel.readString(), "iss");
        this.f21091q = O1.Q.k(parcel.readString(), "aud");
        this.f21092r = O1.Q.k(parcel.readString(), "nonce");
        this.f21093s = parcel.readLong();
        this.f21094t = parcel.readLong();
        this.f21095u = O1.Q.k(parcel.readString(), "sub");
        this.f21096v = parcel.readString();
        this.f21097w = parcel.readString();
        this.f21098x = parcel.readString();
        this.f21099y = parcel.readString();
        this.f21100z = parcel.readString();
        this.f21081A = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        this.f21082B = createStringArrayList != null ? Collections.unmodifiableSet(new HashSet(createStringArrayList)) : null;
        this.f21083C = parcel.readString();
        HashMap readHashMap = parcel.readHashMap(kotlin.jvm.internal.k.f16224a.getClass().getClassLoader());
        readHashMap = readHashMap instanceof HashMap ? readHashMap : null;
        this.f21084D = readHashMap != null ? Collections.unmodifiableMap(readHashMap) : null;
        kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
        HashMap readHashMap2 = parcel.readHashMap(xVar.getClass().getClassLoader());
        readHashMap2 = readHashMap2 instanceof HashMap ? readHashMap2 : null;
        this.f21085E = readHashMap2 != null ? Collections.unmodifiableMap(readHashMap2) : null;
        HashMap readHashMap3 = parcel.readHashMap(xVar.getClass().getClassLoader());
        readHashMap3 = readHashMap3 instanceof HashMap ? readHashMap3 : null;
        this.f21086F = readHashMap3 != null ? Collections.unmodifiableMap(readHashMap3) : null;
        this.f21087G = parcel.readString();
        this.f21088H = parcel.readString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(new java.net.URL(r2).getHost(), "www.facebook.com") == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(org.json.JSONObject r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "iss"
            r1 = 0
            if (r7 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "jti"
            java.lang.String r3 = r7.optString(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            int r2 = r3.length()
            if (r2 != 0) goto L16
            return r1
        L16:
            java.lang.String r2 = r7.optString(r0)     // Catch: java.net.MalformedURLException -> Lc2
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)     // Catch: java.net.MalformedURLException -> Lc2
            int r0 = r2.length()     // Catch: java.net.MalformedURLException -> Lc2
            if (r0 != 0) goto L24
            goto L46
        L24:
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> Lc2
            r0.<init>(r2)     // Catch: java.net.MalformedURLException -> Lc2
            java.lang.String r0 = r0.getHost()     // Catch: java.net.MalformedURLException -> Lc2
            java.lang.String r3 = "facebook.com"
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r0, r3)     // Catch: java.net.MalformedURLException -> Lc2
            if (r0 != 0) goto L47
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> Lc2
            r0.<init>(r2)     // Catch: java.net.MalformedURLException -> Lc2
            java.lang.String r0 = r0.getHost()     // Catch: java.net.MalformedURLException -> Lc2
            java.lang.String r2 = "www.facebook.com"
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r0, r2)     // Catch: java.net.MalformedURLException -> Lc2
            if (r0 != 0) goto L47
        L46:
            return r1
        L47:
            java.lang.String r0 = "aud"
            java.lang.String r2 = r7.optString(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            int r0 = r2.length()
            if (r0 != 0) goto L57
            goto L61
        L57:
            java.lang.String r0 = x1.C2146B.m()
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r2, r0)
            if (r0 != 0) goto L62
        L61:
            return r1
        L62:
            java.util.Date r0 = new java.util.Date
            java.lang.String r2 = "exp"
            long r2 = r7.optLong(r2)
            r4 = 1000(0x3e8, float:1.401E-42)
            long r4 = (long) r4
            long r2 = r2 * r4
            r0.<init>(r2)
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            boolean r0 = r2.after(r0)
            if (r0 == 0) goto L7d
            return r1
        L7d:
            java.lang.String r0 = "iat"
            long r2 = r7.optLong(r0)
            java.util.Date r0 = new java.util.Date
            long r2 = r2 * r4
            r4 = 600000(0x927c0, double:2.964394E-318)
            long r2 = r2 + r4
            r0.<init>(r2)
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            boolean r0 = r2.after(r0)
            if (r0 == 0) goto L99
            return r1
        L99:
            java.lang.String r0 = "sub"
            java.lang.String r2 = r7.optString(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            int r0 = r2.length()
            if (r0 != 0) goto La9
            return r1
        La9:
            java.lang.String r0 = "nonce"
            java.lang.String r7 = r7.optString(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            int r0 = r7.length()
            if (r0 != 0) goto Lb9
            goto Lbf
        Lb9:
            boolean r7 = kotlin.jvm.internal.Intrinsics.a(r7, r8)
            if (r7 != 0) goto Lc0
        Lbf:
            return r1
        Lc0:
            r7 = 1
            return r7
        Lc2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.C2158k.a(org.json.JSONObject, java.lang.String):boolean");
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.f21089o);
        jSONObject.put("iss", this.f21090p);
        jSONObject.put("aud", this.f21091q);
        jSONObject.put("nonce", this.f21092r);
        jSONObject.put("exp", this.f21093s);
        jSONObject.put("iat", this.f21094t);
        String str = this.f21095u;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.f21096v;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.f21097w;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.f21098x;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.f21099y;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.f21100z;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.f21081A;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        if (this.f21082B != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) this.f21082B));
        }
        String str8 = this.f21083C;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        if (this.f21084D != null) {
            jSONObject.put("user_age_range", new JSONObject(this.f21084D));
        }
        if (this.f21085E != null) {
            jSONObject.put("user_hometown", new JSONObject(this.f21085E));
        }
        if (this.f21086F != null) {
            jSONObject.put("user_location", new JSONObject(this.f21086F));
        }
        String str9 = this.f21087G;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.f21088H;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2158k)) {
            return false;
        }
        C2158k c2158k = (C2158k) obj;
        return Intrinsics.a(this.f21089o, c2158k.f21089o) && Intrinsics.a(this.f21090p, c2158k.f21090p) && Intrinsics.a(this.f21091q, c2158k.f21091q) && Intrinsics.a(this.f21092r, c2158k.f21092r) && this.f21093s == c2158k.f21093s && this.f21094t == c2158k.f21094t && Intrinsics.a(this.f21095u, c2158k.f21095u) && Intrinsics.a(this.f21096v, c2158k.f21096v) && Intrinsics.a(this.f21097w, c2158k.f21097w) && Intrinsics.a(this.f21098x, c2158k.f21098x) && Intrinsics.a(this.f21099y, c2158k.f21099y) && Intrinsics.a(this.f21100z, c2158k.f21100z) && Intrinsics.a(this.f21081A, c2158k.f21081A) && Intrinsics.a(this.f21082B, c2158k.f21082B) && Intrinsics.a(this.f21083C, c2158k.f21083C) && Intrinsics.a(this.f21084D, c2158k.f21084D) && Intrinsics.a(this.f21085E, c2158k.f21085E) && Intrinsics.a(this.f21086F, c2158k.f21086F) && Intrinsics.a(this.f21087G, c2158k.f21087G) && Intrinsics.a(this.f21088H, c2158k.f21088H);
    }

    public int hashCode() {
        int hashCode = (((((((((((((527 + this.f21089o.hashCode()) * 31) + this.f21090p.hashCode()) * 31) + this.f21091q.hashCode()) * 31) + this.f21092r.hashCode()) * 31) + AbstractC2157j.a(this.f21093s)) * 31) + AbstractC2157j.a(this.f21094t)) * 31) + this.f21095u.hashCode()) * 31;
        String str = this.f21096v;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21097w;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21098x;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f21099y;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f21100z;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f21081A;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Set set = this.f21082B;
        int hashCode8 = (hashCode7 + (set == null ? 0 : set.hashCode())) * 31;
        String str7 = this.f21083C;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map map = this.f21084D;
        int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.f21085E;
        int hashCode11 = (hashCode10 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.f21086F;
        int hashCode12 = (hashCode11 + (map3 == null ? 0 : map3.hashCode())) * 31;
        String str8 = this.f21087G;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f21088H;
        return hashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        String jSONObject = b().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "claimsJsonObject.toString()");
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f21089o);
        dest.writeString(this.f21090p);
        dest.writeString(this.f21091q);
        dest.writeString(this.f21092r);
        dest.writeLong(this.f21093s);
        dest.writeLong(this.f21094t);
        dest.writeString(this.f21095u);
        dest.writeString(this.f21096v);
        dest.writeString(this.f21097w);
        dest.writeString(this.f21098x);
        dest.writeString(this.f21099y);
        dest.writeString(this.f21100z);
        dest.writeString(this.f21081A);
        dest.writeStringList(this.f21082B == null ? null : new ArrayList(this.f21082B));
        dest.writeString(this.f21083C);
        dest.writeMap(this.f21084D);
        dest.writeMap(this.f21085E);
        dest.writeMap(this.f21086F);
        dest.writeString(this.f21087G);
        dest.writeString(this.f21088H);
    }

    public C2158k(String encodedClaims, String expectedNonce) {
        Intrinsics.checkNotNullParameter(encodedClaims, "encodedClaims");
        Intrinsics.checkNotNullParameter(expectedNonce, "expectedNonce");
        O1.Q.g(encodedClaims, "encodedClaims");
        byte[] decodedBytes = Base64.decode(encodedClaims, 8);
        Intrinsics.checkNotNullExpressionValue(decodedBytes, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decodedBytes, kotlin.text.b.f16240b));
        if (!a(jSONObject, expectedNonce)) {
            throw new IllegalArgumentException("Invalid claims".toString());
        }
        String string = jSONObject.getString("jti");
        Intrinsics.checkNotNullExpressionValue(string, "jsonObj.getString(JSON_KEY_JIT)");
        this.f21089o = string;
        String string2 = jSONObject.getString("iss");
        Intrinsics.checkNotNullExpressionValue(string2, "jsonObj.getString(JSON_KEY_ISS)");
        this.f21090p = string2;
        String string3 = jSONObject.getString("aud");
        Intrinsics.checkNotNullExpressionValue(string3, "jsonObj.getString(JSON_KEY_AUD)");
        this.f21091q = string3;
        String string4 = jSONObject.getString("nonce");
        Intrinsics.checkNotNullExpressionValue(string4, "jsonObj.getString(JSON_KEY_NONCE)");
        this.f21092r = string4;
        this.f21093s = jSONObject.getLong("exp");
        this.f21094t = jSONObject.getLong("iat");
        String string5 = jSONObject.getString("sub");
        Intrinsics.checkNotNullExpressionValue(string5, "jsonObj.getString(JSON_KEY_SUB)");
        this.f21095u = string5;
        b bVar = f21080I;
        this.f21096v = bVar.a(jSONObject, "name");
        this.f21097w = bVar.a(jSONObject, "given_name");
        this.f21098x = bVar.a(jSONObject, "middle_name");
        this.f21099y = bVar.a(jSONObject, "family_name");
        this.f21100z = bVar.a(jSONObject, "email");
        this.f21081A = bVar.a(jSONObject, "picture");
        JSONArray optJSONArray = jSONObject.optJSONArray("user_friends");
        this.f21082B = optJSONArray == null ? null : Collections.unmodifiableSet(O1.P.f0(optJSONArray));
        this.f21083C = bVar.a(jSONObject, "user_birthday");
        JSONObject optJSONObject = jSONObject.optJSONObject("user_age_range");
        this.f21084D = optJSONObject == null ? null : Collections.unmodifiableMap(O1.P.n(optJSONObject));
        JSONObject optJSONObject2 = jSONObject.optJSONObject("user_hometown");
        this.f21085E = optJSONObject2 == null ? null : Collections.unmodifiableMap(O1.P.o(optJSONObject2));
        JSONObject optJSONObject3 = jSONObject.optJSONObject("user_location");
        this.f21086F = optJSONObject3 != null ? Collections.unmodifiableMap(O1.P.o(optJSONObject3)) : null;
        this.f21087G = bVar.a(jSONObject, "user_gender");
        this.f21088H = bVar.a(jSONObject, "user_link");
    }
}
