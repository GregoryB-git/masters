package x1;

import O1.P;
import O1.Q;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Base64;
import java.net.MalformedURLException;
import java.net.URL;
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
import kotlin.jvm.internal.x;
import kotlin.text.b;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

public final class k
  implements Parcelable
{
  @NotNull
  public static final Parcelable.Creator<k> CREATOR = new a();
  public static final b I = new b(null);
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
  
  public k(Parcel paramParcel)
  {
    o = Q.k(paramParcel.readString(), "jti");
    p = Q.k(paramParcel.readString(), "iss");
    q = Q.k(paramParcel.readString(), "aud");
    r = Q.k(paramParcel.readString(), "nonce");
    s = paramParcel.readLong();
    t = paramParcel.readLong();
    u = Q.k(paramParcel.readString(), "sub");
    v = paramParcel.readString();
    w = paramParcel.readString();
    x = paramParcel.readString();
    y = paramParcel.readString();
    z = paramParcel.readString();
    A = paramParcel.readString();
    Object localObject = paramParcel.createStringArrayList();
    Map localMap = null;
    if (localObject != null) {
      localObject = Collections.unmodifiableSet(new HashSet((Collection)localObject));
    } else {
      localObject = null;
    }
    B = ((Set)localObject);
    C = paramParcel.readString();
    localObject = paramParcel.readHashMap(kotlin.jvm.internal.k.a.getClass().getClassLoader());
    if (!(localObject instanceof HashMap)) {
      localObject = null;
    }
    if (localObject != null) {
      localObject = Collections.unmodifiableMap((Map)localObject);
    } else {
      localObject = null;
    }
    D = ((Map)localObject);
    x localx = x.a;
    localObject = paramParcel.readHashMap(localx.getClass().getClassLoader());
    if (!(localObject instanceof HashMap)) {
      localObject = null;
    }
    if (localObject != null) {
      localObject = Collections.unmodifiableMap((Map)localObject);
    } else {
      localObject = null;
    }
    E = ((Map)localObject);
    localObject = paramParcel.readHashMap(localx.getClass().getClassLoader());
    if (!(localObject instanceof HashMap)) {
      localObject = null;
    }
    if (localObject != null) {
      localMap = Collections.unmodifiableMap((Map)localObject);
    }
    F = localMap;
    G = paramParcel.readString();
    H = paramParcel.readString();
  }
  
  public k(String paramString1, String paramString2)
  {
    Q.g(paramString1, "encodedClaims");
    paramString1 = Base64.decode(paramString1, 8);
    Intrinsics.checkNotNullExpressionValue(paramString1, "decodedBytes");
    JSONObject localJSONObject = new JSONObject(new String(paramString1, b.b));
    if (a(localJSONObject, paramString2))
    {
      paramString1 = localJSONObject.getString("jti");
      Intrinsics.checkNotNullExpressionValue(paramString1, "jsonObj.getString(JSON_KEY_JIT)");
      o = paramString1;
      paramString1 = localJSONObject.getString("iss");
      Intrinsics.checkNotNullExpressionValue(paramString1, "jsonObj.getString(JSON_KEY_ISS)");
      p = paramString1;
      paramString1 = localJSONObject.getString("aud");
      Intrinsics.checkNotNullExpressionValue(paramString1, "jsonObj.getString(JSON_KEY_AUD)");
      q = paramString1;
      paramString1 = localJSONObject.getString("nonce");
      Intrinsics.checkNotNullExpressionValue(paramString1, "jsonObj.getString(JSON_KEY_NONCE)");
      r = paramString1;
      s = localJSONObject.getLong("exp");
      t = localJSONObject.getLong("iat");
      paramString1 = localJSONObject.getString("sub");
      Intrinsics.checkNotNullExpressionValue(paramString1, "jsonObj.getString(JSON_KEY_SUB)");
      u = paramString1;
      b localb = I;
      v = localb.a(localJSONObject, "name");
      w = localb.a(localJSONObject, "given_name");
      x = localb.a(localJSONObject, "middle_name");
      y = localb.a(localJSONObject, "family_name");
      z = localb.a(localJSONObject, "email");
      A = localb.a(localJSONObject, "picture");
      paramString1 = localJSONObject.optJSONArray("user_friends");
      paramString2 = null;
      if (paramString1 == null) {
        paramString1 = null;
      } else {
        paramString1 = Collections.unmodifiableSet(P.f0(paramString1));
      }
      B = paramString1;
      C = localb.a(localJSONObject, "user_birthday");
      paramString1 = localJSONObject.optJSONObject("user_age_range");
      if (paramString1 == null) {
        paramString1 = null;
      } else {
        paramString1 = Collections.unmodifiableMap(P.n(paramString1));
      }
      D = paramString1;
      paramString1 = localJSONObject.optJSONObject("user_hometown");
      if (paramString1 == null) {
        paramString1 = null;
      } else {
        paramString1 = Collections.unmodifiableMap(P.o(paramString1));
      }
      E = paramString1;
      paramString1 = localJSONObject.optJSONObject("user_location");
      if (paramString1 == null) {
        paramString1 = paramString2;
      } else {
        paramString1 = Collections.unmodifiableMap(P.o(paramString1));
      }
      F = paramString1;
      G = localb.a(localJSONObject, "user_gender");
      H = localb.a(localJSONObject, "user_link");
      return;
    }
    throw new IllegalArgumentException("Invalid claims".toString());
  }
  
  public final boolean a(JSONObject paramJSONObject, String paramString)
  {
    if (paramJSONObject == null) {
      return false;
    }
    Object localObject = paramJSONObject.optString("jti");
    Intrinsics.checkNotNullExpressionValue(localObject, "jti");
    if (((CharSequence)localObject).length() == 0) {
      return false;
    }
    try
    {
      localObject = paramJSONObject.optString("iss");
      Intrinsics.checkNotNullExpressionValue(localObject, "iss");
      if (((CharSequence)localObject).length() != 0)
      {
        URL localURL = new java/net/URL;
        localURL.<init>((String)localObject);
        if (!Intrinsics.a(localURL.getHost(), "facebook.com"))
        {
          localURL = new java/net/URL;
          localURL.<init>((String)localObject);
          boolean bool = Intrinsics.a(localURL.getHost(), "www.facebook.com");
          if (bool) {}
        }
      }
      else
      {
        return false;
      }
      localObject = paramJSONObject.optString("aud");
      Intrinsics.checkNotNullExpressionValue(localObject, "aud");
      if ((((CharSequence)localObject).length() == 0) || (!Intrinsics.a(localObject, B.m()))) {
        return false;
      }
      long l1 = paramJSONObject.optLong("exp");
      long l2 = 'Ϩ';
      localObject = new Date(l1 * l2);
      if (new Date().after((Date)localObject)) {
        return false;
      }
      localObject = new Date(paramJSONObject.optLong("iat") * l2 + 600000L);
      if (new Date().after((Date)localObject)) {
        return false;
      }
      localObject = paramJSONObject.optString("sub");
      Intrinsics.checkNotNullExpressionValue(localObject, "sub");
      if (((CharSequence)localObject).length() == 0) {
        return false;
      }
      paramJSONObject = paramJSONObject.optString("nonce");
      Intrinsics.checkNotNullExpressionValue(paramJSONObject, "nonce");
      return (paramJSONObject.length() != 0) && (Intrinsics.a(paramJSONObject, paramString));
    }
    catch (MalformedURLException paramJSONObject) {}
    return false;
  }
  
  public final JSONObject b()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("jti", o);
    localJSONObject.put("iss", p);
    localJSONObject.put("aud", q);
    localJSONObject.put("nonce", r);
    localJSONObject.put("exp", s);
    localJSONObject.put("iat", t);
    String str = u;
    if (str != null) {
      localJSONObject.put("sub", str);
    }
    str = v;
    if (str != null) {
      localJSONObject.put("name", str);
    }
    str = w;
    if (str != null) {
      localJSONObject.put("given_name", str);
    }
    str = x;
    if (str != null) {
      localJSONObject.put("middle_name", str);
    }
    str = y;
    if (str != null) {
      localJSONObject.put("family_name", str);
    }
    str = z;
    if (str != null) {
      localJSONObject.put("email", str);
    }
    str = A;
    if (str != null) {
      localJSONObject.put("picture", str);
    }
    if (B != null) {
      localJSONObject.put("user_friends", new JSONArray(B));
    }
    str = C;
    if (str != null) {
      localJSONObject.put("user_birthday", str);
    }
    if (D != null) {
      localJSONObject.put("user_age_range", new JSONObject(D));
    }
    if (E != null) {
      localJSONObject.put("user_hometown", new JSONObject(E));
    }
    if (F != null) {
      localJSONObject.put("user_location", new JSONObject(F));
    }
    str = G;
    if (str != null) {
      localJSONObject.put("user_gender", str);
    }
    str = H;
    if (str != null) {
      localJSONObject.put("user_link", str);
    }
    return localJSONObject;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof k)) {
      return false;
    }
    String str = o;
    paramObject = (k)paramObject;
    if ((!Intrinsics.a(str, o)) || (!Intrinsics.a(p, p)) || (!Intrinsics.a(q, q)) || (!Intrinsics.a(r, r)) || (s != s) || (t != t) || (!Intrinsics.a(u, u)) || (!Intrinsics.a(v, v)) || (!Intrinsics.a(w, w)) || (!Intrinsics.a(x, x)) || (!Intrinsics.a(y, y)) || (!Intrinsics.a(z, z)) || (!Intrinsics.a(A, A)) || (!Intrinsics.a(B, B)) || (!Intrinsics.a(C, C)) || (!Intrinsics.a(D, D)) || (!Intrinsics.a(E, E)) || (!Intrinsics.a(F, F)) || (!Intrinsics.a(G, G)) || (!Intrinsics.a(H, H))) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    int i = o.hashCode();
    int j = p.hashCode();
    int k = q.hashCode();
    int m = r.hashCode();
    int n = j.a(s);
    int i1 = j.a(t);
    int i2 = u.hashCode();
    Object localObject = v;
    int i3 = 0;
    int i4;
    if (localObject == null) {
      i4 = 0;
    } else {
      i4 = ((String)localObject).hashCode();
    }
    localObject = w;
    int i5;
    if (localObject == null) {
      i5 = 0;
    } else {
      i5 = ((String)localObject).hashCode();
    }
    localObject = x;
    int i6;
    if (localObject == null) {
      i6 = 0;
    } else {
      i6 = ((String)localObject).hashCode();
    }
    localObject = y;
    int i7;
    if (localObject == null) {
      i7 = 0;
    } else {
      i7 = ((String)localObject).hashCode();
    }
    localObject = z;
    int i8;
    if (localObject == null) {
      i8 = 0;
    } else {
      i8 = ((String)localObject).hashCode();
    }
    localObject = A;
    int i9;
    if (localObject == null) {
      i9 = 0;
    } else {
      i9 = ((String)localObject).hashCode();
    }
    localObject = B;
    int i10;
    if (localObject == null) {
      i10 = 0;
    } else {
      i10 = localObject.hashCode();
    }
    localObject = C;
    int i11;
    if (localObject == null) {
      i11 = 0;
    } else {
      i11 = ((String)localObject).hashCode();
    }
    localObject = D;
    int i12;
    if (localObject == null) {
      i12 = 0;
    } else {
      i12 = localObject.hashCode();
    }
    localObject = E;
    int i13;
    if (localObject == null) {
      i13 = 0;
    } else {
      i13 = localObject.hashCode();
    }
    localObject = F;
    int i14;
    if (localObject == null) {
      i14 = 0;
    } else {
      i14 = localObject.hashCode();
    }
    localObject = G;
    int i15;
    if (localObject == null) {
      i15 = 0;
    } else {
      i15 = ((String)localObject).hashCode();
    }
    localObject = H;
    if (localObject != null) {
      i3 = ((String)localObject).hashCode();
    }
    return (((((((((((((((((((527 + i) * 31 + j) * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i4) * 31 + i5) * 31 + i6) * 31 + i7) * 31 + i8) * 31 + i9) * 31 + i10) * 31 + i11) * 31 + i12) * 31 + i13) * 31 + i14) * 31 + i15) * 31 + i3;
  }
  
  public String toString()
  {
    String str = b().toString();
    Intrinsics.checkNotNullExpressionValue(str, "claimsJsonObject.toString()");
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "dest");
    paramParcel.writeString(o);
    paramParcel.writeString(p);
    paramParcel.writeString(q);
    paramParcel.writeString(r);
    paramParcel.writeLong(s);
    paramParcel.writeLong(t);
    paramParcel.writeString(u);
    paramParcel.writeString(v);
    paramParcel.writeString(w);
    paramParcel.writeString(x);
    paramParcel.writeString(y);
    paramParcel.writeString(z);
    paramParcel.writeString(A);
    if (B == null) {}
    for (Object localObject = null;; localObject = new ArrayList(B))
    {
      paramParcel.writeStringList((List)localObject);
      break;
    }
    paramParcel.writeString(C);
    paramParcel.writeMap(D);
    paramParcel.writeMap(E);
    paramParcel.writeMap(F);
    paramParcel.writeString(G);
    paramParcel.writeString(H);
  }
  
  public static final class a
    implements Parcelable.Creator
  {
    public k a(Parcel paramParcel)
    {
      Intrinsics.checkNotNullParameter(paramParcel, "source");
      return new k(paramParcel);
    }
    
    public k[] b(int paramInt)
    {
      return new k[paramInt];
    }
  }
  
  public static final class b
  {
    public final String a(JSONObject paramJSONObject, String paramString)
    {
      Intrinsics.checkNotNullParameter(paramJSONObject, "<this>");
      Intrinsics.checkNotNullParameter(paramString, "name");
      if (paramJSONObject.has(paramString)) {
        return paramJSONObject.getString(paramString);
      }
      return null;
    }
  }
}

/* Location:
 * Qualified Name:     x1.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */