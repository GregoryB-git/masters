package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import b.z;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g6.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import m6.j;
import n6.a;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
public class GoogleSignInAccount
  extends a
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new d();
  public final int a;
  public final String b;
  public final String c;
  public final String d;
  public final String e;
  public final Uri f;
  public String o;
  public final long p;
  public final String q;
  public final List r;
  public final String s;
  public final String t;
  public final HashSet u = new HashSet();
  
  public GoogleSignInAccount(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri, String paramString5, long paramLong, String paramString6, ArrayList paramArrayList, String paramString7, String paramString8)
  {
    a = paramInt;
    b = paramString1;
    c = paramString2;
    d = paramString3;
    e = paramString4;
    f = paramUri;
    o = paramString5;
    p = paramLong;
    q = paramString6;
    r = paramArrayList;
    s = paramString7;
    t = paramString8;
  }
  
  public static GoogleSignInAccount E(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    JSONObject localJSONObject = new JSONObject(paramString);
    paramString = localJSONObject.optString("photoUrl");
    if (!TextUtils.isEmpty(paramString)) {
      paramString = Uri.parse(paramString);
    } else {
      paramString = null;
    }
    long l = Long.parseLong(localJSONObject.getString("expirationTime"));
    HashSet localHashSet = new HashSet();
    Object localObject = localJSONObject.getJSONArray("grantedScopes");
    int i = ((JSONArray)localObject).length();
    for (int j = 0; j < i; j++) {
      localHashSet.add(new Scope(1, ((JSONArray)localObject).getString(j)));
    }
    String str1 = localJSONObject.optString("id");
    if (localJSONObject.has("tokenId")) {
      localObject = localJSONObject.optString("tokenId");
    } else {
      localObject = null;
    }
    String str2;
    if (localJSONObject.has("email")) {
      str2 = localJSONObject.optString("email");
    } else {
      str2 = null;
    }
    String str3;
    if (localJSONObject.has("displayName")) {
      str3 = localJSONObject.optString("displayName");
    } else {
      str3 = null;
    }
    String str4;
    if (localJSONObject.has("givenName")) {
      str4 = localJSONObject.optString("givenName");
    } else {
      str4 = null;
    }
    String str5;
    if (localJSONObject.has("familyName")) {
      str5 = localJSONObject.optString("familyName");
    } else {
      str5 = null;
    }
    String str6 = localJSONObject.getString("obfuscatedIdentifier");
    l = Long.valueOf(l).longValue();
    j.e(str6);
    localObject = new GoogleSignInAccount(3, str1, (String)localObject, str2, str3, paramString, null, l, str6, new ArrayList(localHashSet), str4, str5);
    if (localJSONObject.has("serverAuthCode")) {
      paramString = localJSONObject.optString("serverAuthCode");
    } else {
      paramString = null;
    }
    o = paramString;
    return (GoogleSignInAccount)localObject;
  }
  
  public final HashSet D()
  {
    HashSet localHashSet = new HashSet(r);
    localHashSet.addAll(u);
    return localHashSet;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof GoogleSignInAccount)) {
      return false;
    }
    paramObject = (GoogleSignInAccount)paramObject;
    return (q.equals(q)) && (((GoogleSignInAccount)paramObject).D().equals(D()));
  }
  
  public final int hashCode()
  {
    return (q.hashCode() + 527) * 31 + D().hashCode();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.z(paramParcel, 1, a);
    z.F(paramParcel, 2, b, false);
    z.F(paramParcel, 3, c, false);
    z.F(paramParcel, 4, d, false);
    z.F(paramParcel, 5, e, false);
    z.E(paramParcel, 6, f, paramInt, false);
    z.F(paramParcel, 7, o, false);
    z.C(paramParcel, 8, p);
    z.F(paramParcel, 9, q, false);
    z.I(paramParcel, 10, r, false);
    z.F(paramParcel, 11, s, false);
    z.F(paramParcel, 12, t, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.GoogleSignInAccount
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */