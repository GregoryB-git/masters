package com.google.android.gms.auth.api.signin;

import A2.AbstractC0328n;
import B2.a;
import B2.c;
import E2.e;
import E2.h;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import t2.C1988a;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {

    /* renamed from: A, reason: collision with root package name */
    public Set f10234A = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    public final int f10235o;

    /* renamed from: p, reason: collision with root package name */
    public String f10236p;

    /* renamed from: q, reason: collision with root package name */
    public String f10237q;

    /* renamed from: r, reason: collision with root package name */
    public String f10238r;

    /* renamed from: s, reason: collision with root package name */
    public String f10239s;

    /* renamed from: t, reason: collision with root package name */
    public Uri f10240t;

    /* renamed from: u, reason: collision with root package name */
    public String f10241u;

    /* renamed from: v, reason: collision with root package name */
    public long f10242v;

    /* renamed from: w, reason: collision with root package name */
    public String f10243w;

    /* renamed from: x, reason: collision with root package name */
    public List f10244x;

    /* renamed from: y, reason: collision with root package name */
    public String f10245y;

    /* renamed from: z, reason: collision with root package name */
    public String f10246z;

    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C1988a();

    /* renamed from: B, reason: collision with root package name */
    public static e f10233B = h.d();

    public GoogleSignInAccount(int i7, String str, String str2, String str3, String str4, Uri uri, String str5, long j7, String str6, List list, String str7, String str8) {
        this.f10235o = i7;
        this.f10236p = str;
        this.f10237q = str2;
        this.f10238r = str3;
        this.f10239s = str4;
        this.f10240t = uri;
        this.f10241u = str5;
        this.f10242v = j7;
        this.f10243w = str6;
        this.f10244x = list;
        this.f10245y = str7;
        this.f10246z = str8;
    }

    public static GoogleSignInAccount U(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l7, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l7.longValue(), AbstractC0328n.e(str7), new ArrayList((Collection) AbstractC0328n.i(set)), str5, str6);
    }

    public static GoogleSignInAccount V(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            hashSet.add(new Scope(jSONArray.getString(i7)));
        }
        GoogleSignInAccount U6 = U(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        U6.f10241u = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return U6;
    }

    public Set S() {
        HashSet hashSet = new HashSet(this.f10244x);
        hashSet.addAll(this.f10234A);
        return hashSet;
    }

    public String T() {
        return this.f10241u;
    }

    public String a() {
        return this.f10239s;
    }

    public String d() {
        return this.f10238r;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f10243w.equals(this.f10243w) && googleSignInAccount.S().equals(S());
    }

    public String f() {
        return this.f10246z;
    }

    public String g() {
        return this.f10245y;
    }

    public int hashCode() {
        return ((this.f10243w.hashCode() + 527) * 31) + S().hashCode();
    }

    public String i() {
        return this.f10236p;
    }

    public String k() {
        return this.f10237q;
    }

    public Uri q() {
        return this.f10240t;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int a7 = c.a(parcel);
        c.i(parcel, 1, this.f10235o);
        c.n(parcel, 2, i(), false);
        c.n(parcel, 3, k(), false);
        c.n(parcel, 4, d(), false);
        c.n(parcel, 5, a(), false);
        c.m(parcel, 6, q(), i7, false);
        c.n(parcel, 7, T(), false);
        c.k(parcel, 8, this.f10242v);
        c.n(parcel, 9, this.f10243w, false);
        c.q(parcel, 10, this.f10244x, false);
        c.n(parcel, 11, g(), false);
        c.n(parcel, 12, f(), false);
        c.b(parcel, a7);
    }
}
