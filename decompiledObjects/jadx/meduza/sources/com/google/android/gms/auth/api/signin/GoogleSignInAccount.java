package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b.z;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g6.d;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import m6.j;
import n6.a;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    public final int f2762a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2763b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2764c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2765d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2766e;
    public final Uri f;

    /* renamed from: o, reason: collision with root package name */
    public String f2767o;

    /* renamed from: p, reason: collision with root package name */
    public final long f2768p;

    /* renamed from: q, reason: collision with root package name */
    public final String f2769q;

    /* renamed from: r, reason: collision with root package name */
    public final List f2770r;

    /* renamed from: s, reason: collision with root package name */
    public final String f2771s;
    public final String t;

    /* renamed from: u, reason: collision with root package name */
    public final HashSet f2772u = new HashSet();

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, ArrayList arrayList, String str7, String str8) {
        this.f2762a = i10;
        this.f2763b = str;
        this.f2764c = str2;
        this.f2765d = str3;
        this.f2766e = str4;
        this.f = uri;
        this.f2767o = str5;
        this.f2768p = j10;
        this.f2769q = str6;
        this.f2770r = arrayList;
        this.f2771s = str7;
        this.t = str8;
    }

    public static GoogleSignInAccount E(String str) {
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
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has(Constants.EMAIL) ? jSONObject.optString(Constants.EMAIL) : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        Long valueOf = Long.valueOf(parseLong);
        String string = jSONObject.getString("obfuscatedIdentifier");
        long longValue = valueOf.longValue();
        j.e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, longValue, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.f2767o = jSONObject.has(Constants.SERVER_AUTH_CODE) ? jSONObject.optString(Constants.SERVER_AUTH_CODE) : null;
        return googleSignInAccount;
    }

    public final HashSet D() {
        HashSet hashSet = new HashSet(this.f2770r);
        hashSet.addAll(this.f2772u);
        return hashSet;
    }

    public final boolean equals(Object obj) {
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
        return googleSignInAccount.f2769q.equals(this.f2769q) && googleSignInAccount.D().equals(D());
    }

    public final int hashCode() {
        return ((this.f2769q.hashCode() + 527) * 31) + D().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.z(parcel, 1, this.f2762a);
        z.F(parcel, 2, this.f2763b, false);
        z.F(parcel, 3, this.f2764c, false);
        z.F(parcel, 4, this.f2765d, false);
        z.F(parcel, 5, this.f2766e, false);
        z.E(parcel, 6, this.f, i10, false);
        z.F(parcel, 7, this.f2767o, false);
        z.C(parcel, 8, this.f2768p);
        z.F(parcel, 9, this.f2769q, false);
        z.I(parcel, 10, this.f2770r, false);
        z.F(parcel, 11, this.f2771s, false);
        z.F(parcel, 12, this.t, false);
        z.L(J, parcel);
    }
}
