/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.google.android.gms.auth.api.signin;

import A2.n;
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

public class GoogleSignInAccount
extends a
implements ReflectedParcelable {
    public static e B;
    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR;
    public Set A = new HashSet();
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
        CREATOR = new t2.a();
        B = h.d();
    }

    public GoogleSignInAccount(int n8, String string2, String string3, String string4, String string5, Uri uri, String string6, long l8, String string7, List list, String string8, String string9) {
        this.o = n8;
        this.p = string2;
        this.q = string3;
        this.r = string4;
        this.s = string5;
        this.t = uri;
        this.u = string6;
        this.v = l8;
        this.w = string7;
        this.x = list;
        this.y = string8;
        this.z = string9;
    }

    public static GoogleSignInAccount U(String string2, String string3, String string4, String string5, String string6, String string7, Uri uri, Long l8, String string8, Set set) {
        return new GoogleSignInAccount(3, string2, string3, string4, string5, uri, null, l8, n.e(string8), (List)new ArrayList((Collection)n.i((Object)set)), string6, string7);
    }

    public static GoogleSignInAccount V(String string2) {
        boolean bl = TextUtils.isEmpty((CharSequence)string2);
        Object var11_2 = null;
        if (bl) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(string2);
        string2 = jSONObject.optString("photoUrl");
        string2 = !TextUtils.isEmpty((CharSequence)string2) ? Uri.parse((String)string2) : null;
        long l8 = Long.parseLong((String)jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        Object object = jSONObject.getJSONArray("grantedScopes");
        int n8 = object.length();
        for (int i8 = 0; i8 < n8; ++i8) {
            hashSet.add((Object)new Scope(object.getString(i8)));
        }
        String string3 = jSONObject.optString("id");
        object = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String string4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String string5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String string6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String string7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        object = GoogleSignInAccount.U(string3, (String)object, string4, string5, string6, string7, (Uri)string2, l8, jSONObject.getString("obfuscatedIdentifier"), (Set)hashSet);
        string2 = var11_2;
        if (jSONObject.has("serverAuthCode")) {
            string2 = jSONObject.optString("serverAuthCode");
        }
        object.u = string2;
        return object;
    }

    public Set S() {
        HashSet hashSet = new HashSet((Collection)this.x);
        hashSet.addAll((Collection)this.A);
        return hashSet;
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

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (!(object instanceof GoogleSignInAccount)) {
            return false;
        }
        object = (GoogleSignInAccount)object;
        if (object.w.equals((Object)this.w) && object.S().equals((Object)this.S())) {
            return true;
        }
        return false;
    }

    public String f() {
        return this.z;
    }

    public String g() {
        return this.y;
    }

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

    public void writeToParcel(Parcel parcel, int n8) {
        int n9 = c.a(parcel);
        c.i(parcel, 1, this.o);
        c.n(parcel, 2, this.i(), false);
        c.n(parcel, 3, this.k(), false);
        c.n(parcel, 4, this.d(), false);
        c.n(parcel, 5, this.a(), false);
        c.m(parcel, 6, (Parcelable)this.q(), n8, false);
        c.n(parcel, 7, this.T(), false);
        c.k(parcel, 8, this.v);
        c.n(parcel, 9, this.w, false);
        c.q(parcel, 10, this.x, false);
        c.n(parcel, 11, this.g(), false);
        c.n(parcel, 12, this.f(), false);
        c.b(parcel, n9);
    }
}

