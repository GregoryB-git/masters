// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.auth.api.signin;

import android.os.Parcelable;
import B2.c;
import android.os.Parcel;
import org.json.JSONArray;
import com.google.android.gms.common.api.Scope;
import org.json.JSONObject;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import A2.n;
import java.util.HashSet;
import E2.h;
import java.util.List;
import android.net.Uri;
import java.util.Set;
import androidx.annotation.NonNull;
import android.os.Parcelable$Creator;
import E2.e;
import com.google.android.gms.common.internal.ReflectedParcelable;
import B2.a;

public class GoogleSignInAccount extends a implements ReflectedParcelable
{
    public static e B;
    @NonNull
    public static final Parcelable$Creator<GoogleSignInAccount> CREATOR;
    public Set A;
    public final int o;
    public String p;
    public String q;
    public String r;
    public String s;
    public Uri t;
    public String u;
    public long v;
    public String w;
    public List x;
    public String y;
    public String z;
    
    static {
        CREATOR = (Parcelable$Creator)new t2.a();
        GoogleSignInAccount.B = h.d();
    }
    
    public GoogleSignInAccount(final int o, final String p12, final String q, final String r, final String s, final Uri t, final String u, final long v, final String w, final List x, final String y, final String z) {
        this.A = new HashSet();
        this.o = o;
        this.p = p12;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public static GoogleSignInAccount U(final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final Uri uri, final Long n, final String s7, final Set set) {
        return new GoogleSignInAccount(3, s, s2, s3, s4, uri, null, n, n.e(s7), new ArrayList((Collection)n.i(set)), s5, s6);
    }
    
    public static GoogleSignInAccount V(String u) {
        final boolean empty = TextUtils.isEmpty((CharSequence)u);
        final String s = null;
        if (empty) {
            return null;
        }
        final JSONObject jsonObject = new JSONObject(u);
        u = jsonObject.optString("photoUrl");
        Uri parse;
        if (!TextUtils.isEmpty((CharSequence)u)) {
            parse = Uri.parse(u);
        }
        else {
            parse = null;
        }
        final long long1 = Long.parseLong(jsonObject.getString("expirationTime"));
        final HashSet<Scope> set = new HashSet<Scope>();
        final JSONArray jsonArray = jsonObject.getJSONArray("grantedScopes");
        for (int length = jsonArray.length(), i = 0; i < length; ++i) {
            set.add(new Scope(jsonArray.getString(i)));
        }
        final String optString = jsonObject.optString("id");
        String optString2;
        if (jsonObject.has("tokenId")) {
            optString2 = jsonObject.optString("tokenId");
        }
        else {
            optString2 = null;
        }
        String optString3;
        if (jsonObject.has("email")) {
            optString3 = jsonObject.optString("email");
        }
        else {
            optString3 = null;
        }
        String optString4;
        if (jsonObject.has("displayName")) {
            optString4 = jsonObject.optString("displayName");
        }
        else {
            optString4 = null;
        }
        String optString5;
        if (jsonObject.has("givenName")) {
            optString5 = jsonObject.optString("givenName");
        }
        else {
            optString5 = null;
        }
        String optString6;
        if (jsonObject.has("familyName")) {
            optString6 = jsonObject.optString("familyName");
        }
        else {
            optString6 = null;
        }
        final GoogleSignInAccount u2 = U(optString, optString2, optString3, optString4, optString5, optString6, parse, long1, jsonObject.getString("obfuscatedIdentifier"), set);
        u = s;
        if (jsonObject.has("serverAuthCode")) {
            u = jsonObject.optString("serverAuthCode");
        }
        u2.u = u;
        return u2;
    }
    
    public Set S() {
        final HashSet set = new HashSet(this.x);
        set.addAll(this.A);
        return set;
    }
    
    public String T() {
        return this.u;
    }
    
    public String a() {
        return this.s;
    }
    
    public String d() {
        return this.r;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof GoogleSignInAccount)) {
            return false;
        }
        final GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount)o;
        return googleSignInAccount.w.equals(this.w) && googleSignInAccount.S().equals(this.S());
    }
    
    public String f() {
        return this.z;
    }
    
    public String g() {
        return this.y;
    }
    
    @Override
    public int hashCode() {
        return (this.w.hashCode() + 527) * 31 + this.S().hashCode();
    }
    
    public String i() {
        return this.p;
    }
    
    public String k() {
        return this.q;
    }
    
    public Uri q() {
        return this.t;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.i(parcel, 1, this.o);
        c.n(parcel, 2, this.i(), false);
        c.n(parcel, 3, this.k(), false);
        c.n(parcel, 4, this.d(), false);
        c.n(parcel, 5, this.a(), false);
        c.m(parcel, 6, (Parcelable)this.q(), n, false);
        c.n(parcel, 7, this.T(), false);
        c.k(parcel, 8, this.v);
        c.n(parcel, 9, this.w, false);
        c.q(parcel, 10, this.x, false);
        c.n(parcel, 11, this.g(), false);
        c.n(parcel, 12, this.f(), false);
        c.b(parcel, a);
    }
}
