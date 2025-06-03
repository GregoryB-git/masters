package com.google.android.gms.auth.api.signin;

import A2.n;
import B2.c;
import E2.e;
import E2.h;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
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
  extends B2.a
  implements ReflectedParcelable
{
  public static e B = h.d();
  @NonNull
  public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new t2.a();
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
  
  public GoogleSignInAccount(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri, String paramString5, long paramLong, String paramString6, List paramList, String paramString7, String paramString8)
  {
    o = paramInt;
    p = paramString1;
    q = paramString2;
    r = paramString3;
    s = paramString4;
    t = paramUri;
    u = paramString5;
    v = paramLong;
    w = paramString6;
    x = paramList;
    y = paramString7;
    z = paramString8;
  }
  
  public static GoogleSignInAccount U(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, Uri paramUri, Long paramLong, String paramString7, Set paramSet)
  {
    return new GoogleSignInAccount(3, paramString1, paramString2, paramString3, paramString4, paramUri, null, paramLong.longValue(), n.e(paramString7), new ArrayList((Collection)n.i(paramSet)), paramString5, paramString6);
  }
  
  public static GoogleSignInAccount V(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    Object localObject1 = null;
    if (bool) {
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
    Object localObject2 = localJSONObject.getJSONArray("grantedScopes");
    int i = ((JSONArray)localObject2).length();
    for (int j = 0; j < i; j++) {
      localHashSet.add(new Scope(((JSONArray)localObject2).getString(j)));
    }
    String str1 = localJSONObject.optString("id");
    if (localJSONObject.has("tokenId")) {
      localObject2 = localJSONObject.optString("tokenId");
    } else {
      localObject2 = null;
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
    localObject2 = U(str1, (String)localObject2, str2, str3, str4, str5, paramString, Long.valueOf(l), localJSONObject.getString("obfuscatedIdentifier"), localHashSet);
    paramString = (String)localObject1;
    if (localJSONObject.has("serverAuthCode")) {
      paramString = localJSONObject.optString("serverAuthCode");
    }
    u = paramString;
    return (GoogleSignInAccount)localObject2;
  }
  
  public Set S()
  {
    HashSet localHashSet = new HashSet(x);
    localHashSet.addAll(A);
    return localHashSet;
  }
  
  public String T()
  {
    return u;
  }
  
  public String a()
  {
    return s;
  }
  
  public String d()
  {
    return r;
  }
  
  public boolean equals(Object paramObject)
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
    return (w.equals(w)) && (((GoogleSignInAccount)paramObject).S().equals(S()));
  }
  
  public String f()
  {
    return z;
  }
  
  public String g()
  {
    return y;
  }
  
  public int hashCode()
  {
    return (w.hashCode() + 527) * 31 + S().hashCode();
  }
  
  public String i()
  {
    return p;
  }
  
  public String k()
  {
    return q;
  }
  
  public Uri q()
  {
    return t;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.i(paramParcel, 1, o);
    c.n(paramParcel, 2, i(), false);
    c.n(paramParcel, 3, k(), false);
    c.n(paramParcel, 4, d(), false);
    c.n(paramParcel, 5, a(), false);
    c.m(paramParcel, 6, q(), paramInt, false);
    c.n(paramParcel, 7, T(), false);
    c.k(paramParcel, 8, v);
    c.n(paramParcel, 9, w, false);
    c.q(paramParcel, 10, x, false);
    c.n(paramParcel, 11, g(), false);
    c.n(paramParcel, 12, f(), false);
    c.b(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.GoogleSignInAccount
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */