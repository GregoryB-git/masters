package x1;

import O1.P;
import O1.Q;
import W5.m;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  implements Parcelable
{
  public static final Date A;
  public static final Date B;
  public static final Date C;
  @NotNull
  public static final Parcelable.Creator<a> CREATOR = new b();
  public static final h D;
  public static final c z = new c(null);
  public final Date o;
  public final Set p;
  public final Set q;
  public final Set r;
  public final String s;
  public final h t;
  public final Date u;
  public final String v;
  public final String w;
  public final Date x;
  public final String y;
  
  static
  {
    Date localDate = new Date(Long.MAX_VALUE);
    A = localDate;
    B = localDate;
    C = new Date();
    D = h.q;
  }
  
  public a(Parcel paramParcel)
  {
    o = new Date(paramParcel.readLong());
    Object localObject = new ArrayList();
    paramParcel.readStringList((List)localObject);
    Set localSet = Collections.unmodifiableSet(new HashSet((Collection)localObject));
    Intrinsics.checkNotNullExpressionValue(localSet, "unmodifiableSet(HashSet(permissionsList))");
    p = localSet;
    ((ArrayList)localObject).clear();
    paramParcel.readStringList((List)localObject);
    localSet = Collections.unmodifiableSet(new HashSet((Collection)localObject));
    Intrinsics.checkNotNullExpressionValue(localSet, "unmodifiableSet(HashSet(permissionsList))");
    q = localSet;
    ((ArrayList)localObject).clear();
    paramParcel.readStringList((List)localObject);
    localObject = Collections.unmodifiableSet(new HashSet((Collection)localObject));
    Intrinsics.checkNotNullExpressionValue(localObject, "unmodifiableSet(HashSet(permissionsList))");
    r = ((Set)localObject);
    s = Q.k(paramParcel.readString(), "token");
    localObject = paramParcel.readString();
    if (localObject != null) {
      localObject = h.valueOf((String)localObject);
    } else {
      localObject = D;
    }
    t = ((h)localObject);
    u = new Date(paramParcel.readLong());
    v = Q.k(paramParcel.readString(), "applicationId");
    w = Q.k(paramParcel.readString(), "userId");
    x = new Date(paramParcel.readLong());
    y = paramParcel.readString();
  }
  
  public a(String paramString1, String paramString2, String paramString3, Collection paramCollection1, Collection paramCollection2, Collection paramCollection3, h paramh, Date paramDate1, Date paramDate2, Date paramDate3, String paramString4)
  {
    Q.g(paramString1, "accessToken");
    Q.g(paramString2, "applicationId");
    Q.g(paramString3, "userId");
    Date localDate = paramDate1;
    if (paramDate1 == null) {
      localDate = B;
    }
    o = localDate;
    paramDate1 = new java/util/HashSet;
    if (paramCollection1 != null) {
      paramDate1.<init>(paramCollection1);
    } else {
      paramDate1.<init>();
    }
    paramCollection1 = Collections.unmodifiableSet(paramDate1);
    Intrinsics.checkNotNullExpressionValue(paramCollection1, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
    p = paramCollection1;
    paramCollection1 = new java/util/HashSet;
    if (paramCollection2 != null) {
      paramCollection1.<init>(paramCollection2);
    } else {
      paramCollection1.<init>();
    }
    paramCollection1 = Collections.unmodifiableSet(paramCollection1);
    Intrinsics.checkNotNullExpressionValue(paramCollection1, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
    q = paramCollection1;
    paramCollection1 = new java/util/HashSet;
    if (paramCollection3 != null) {
      paramCollection1.<init>(paramCollection3);
    } else {
      paramCollection1.<init>();
    }
    paramCollection1 = Collections.unmodifiableSet(paramCollection1);
    Intrinsics.checkNotNullExpressionValue(paramCollection1, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
    r = paramCollection1;
    s = paramString1;
    paramString1 = paramh;
    if (paramh == null) {
      paramString1 = D;
    }
    t = b(paramString1, paramString4);
    paramString1 = paramDate2;
    if (paramDate2 == null) {
      paramString1 = C;
    }
    u = paramString1;
    v = paramString2;
    w = paramString3;
    if ((paramDate3 == null) || (paramDate3.getTime() == 0L)) {
      paramDate3 = B;
    }
    x = paramDate3;
    paramString1 = paramString4;
    if (paramString4 == null) {
      paramString1 = "facebook";
    }
    y = paramString1;
  }
  
  public final void a(StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append(" permissions:");
    paramStringBuilder.append("[");
    paramStringBuilder.append(TextUtils.join(", ", p));
    paramStringBuilder.append("]");
  }
  
  public final h b(h paramh, String paramString)
  {
    h localh = paramh;
    if (paramString != null)
    {
      localh = paramh;
      if (paramString.equals("instagram"))
      {
        int i = d.a[paramh.ordinal()];
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3) {
              localh = paramh;
            } else {
              localh = h.A;
            }
          }
          else {
            localh = h.z;
          }
        }
        else {
          localh = h.y;
        }
      }
    }
    return localh;
  }
  
  public final String c()
  {
    return v;
  }
  
  public final Date d()
  {
    return x;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final Set e()
  {
    return q;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof a)) {
      return false;
    }
    Object localObject = o;
    a locala = (a)paramObject;
    if ((Intrinsics.a(localObject, o)) && (Intrinsics.a(p, p)) && (Intrinsics.a(q, q)) && (Intrinsics.a(r, r)) && (Intrinsics.a(s, s)) && (t == t) && (Intrinsics.a(u, u)) && (Intrinsics.a(v, v)) && (Intrinsics.a(w, w)) && (Intrinsics.a(x, x)))
    {
      paramObject = y;
      localObject = y;
      if (paramObject == null ? localObject == null : Intrinsics.a(paramObject, localObject)) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public final Set f()
  {
    return r;
  }
  
  public final Date g()
  {
    return o;
  }
  
  public final String h()
  {
    return y;
  }
  
  public int hashCode()
  {
    int i = o.hashCode();
    int j = p.hashCode();
    int k = q.hashCode();
    int m = r.hashCode();
    int n = s.hashCode();
    int i1 = t.hashCode();
    int i2 = u.hashCode();
    int i3 = v.hashCode();
    int i4 = w.hashCode();
    int i5 = x.hashCode();
    String str = y;
    int i6;
    if (str == null) {
      i6 = 0;
    } else {
      i6 = str.hashCode();
    }
    return ((((((((((527 + i) * 31 + j) * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i3) * 31 + i4) * 31 + i5) * 31 + i6;
  }
  
  public final Date i()
  {
    return u;
  }
  
  public final Set j()
  {
    return p;
  }
  
  public final h k()
  {
    return t;
  }
  
  public final String l()
  {
    return s;
  }
  
  public final String m()
  {
    return w;
  }
  
  public final boolean n()
  {
    return new Date().after(o);
  }
  
  public final JSONObject o()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("version", 1);
    localJSONObject.put("token", s);
    localJSONObject.put("expires_at", o.getTime());
    localJSONObject.put("permissions", new JSONArray(p));
    localJSONObject.put("declined_permissions", new JSONArray(q));
    localJSONObject.put("expired_permissions", new JSONArray(r));
    localJSONObject.put("last_refresh", u.getTime());
    localJSONObject.put("source", t.name());
    localJSONObject.put("application_id", v);
    localJSONObject.put("user_id", w);
    localJSONObject.put("data_access_expiration_time", x.getTime());
    String str = y;
    if (str != null) {
      localJSONObject.put("graph_domain", str);
    }
    return localJSONObject;
  }
  
  public final String p()
  {
    Object localObject = B.a;
    if (B.H(N.p)) {
      localObject = s;
    } else {
      localObject = "ACCESS_TOKEN_REMOVED";
    }
    return (String)localObject;
  }
  
  public String toString()
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("{AccessToken");
    ((StringBuilder)localObject).append(" token:");
    ((StringBuilder)localObject).append(p());
    a((StringBuilder)localObject);
    ((StringBuilder)localObject).append("}");
    localObject = ((StringBuilder)localObject).toString();
    Intrinsics.checkNotNullExpressionValue(localObject, "builder.toString()");
    return (String)localObject;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "dest");
    paramParcel.writeLong(o.getTime());
    paramParcel.writeStringList(new ArrayList(p));
    paramParcel.writeStringList(new ArrayList(q));
    paramParcel.writeStringList(new ArrayList(r));
    paramParcel.writeString(s);
    paramParcel.writeString(t.name());
    paramParcel.writeLong(u.getTime());
    paramParcel.writeString(v);
    paramParcel.writeString(w);
    paramParcel.writeLong(x.getTime());
    paramParcel.writeString(y);
  }
  
  public static abstract interface a
  {
    public abstract void a(a parama);
    
    public abstract void b(o paramo);
  }
  
  public static final class b
    implements Parcelable.Creator
  {
    public a a(Parcel paramParcel)
    {
      Intrinsics.checkNotNullParameter(paramParcel, "source");
      return new a(paramParcel);
    }
    
    public a[] b(int paramInt)
    {
      return new a[paramInt];
    }
  }
  
  public static final class c
  {
    public final a a(a parama)
    {
      Intrinsics.checkNotNullParameter(parama, "current");
      return new a(parama.l(), parama.c(), parama.m(), parama.j(), parama.e(), parama.f(), parama.k(), new Date(), new Date(), parama.d(), null, 1024, null);
    }
    
    public final a b(JSONObject paramJSONObject)
    {
      Intrinsics.checkNotNullParameter(paramJSONObject, "jsonObject");
      if (paramJSONObject.getInt("version") <= 1)
      {
        String str1 = paramJSONObject.getString("token");
        Date localDate1 = new Date(paramJSONObject.getLong("expires_at"));
        Object localObject1 = paramJSONObject.getJSONArray("permissions");
        Object localObject2 = paramJSONObject.getJSONArray("declined_permissions");
        JSONArray localJSONArray = paramJSONObject.optJSONArray("expired_permissions");
        Date localDate2 = new Date(paramJSONObject.getLong("last_refresh"));
        Object localObject3 = paramJSONObject.getString("source");
        Intrinsics.checkNotNullExpressionValue(localObject3, "jsonObject.getString(SOURCE_KEY)");
        localObject3 = h.valueOf((String)localObject3);
        String str2 = paramJSONObject.getString("application_id");
        String str3 = paramJSONObject.getString("user_id");
        Date localDate3 = new Date(paramJSONObject.optLong("data_access_expiration_time", 0L));
        String str4 = paramJSONObject.optString("graph_domain", null);
        Intrinsics.checkNotNullExpressionValue(str1, "token");
        Intrinsics.checkNotNullExpressionValue(str2, "applicationId");
        Intrinsics.checkNotNullExpressionValue(str3, "userId");
        paramJSONObject = P.a;
        Intrinsics.checkNotNullExpressionValue(localObject1, "permissionsArray");
        localObject1 = (Collection)P.g0((JSONArray)localObject1);
        Intrinsics.checkNotNullExpressionValue(localObject2, "declinedPermissionsArray");
        localObject2 = (Collection)P.g0((JSONArray)localObject2);
        if (localJSONArray == null) {
          paramJSONObject = new ArrayList();
        } else {
          paramJSONObject = P.g0(localJSONArray);
        }
        return new a(str1, str2, str3, (Collection)localObject1, (Collection)localObject2, (Collection)paramJSONObject, (h)localObject3, localDate1, localDate2, localDate3, str4);
      }
      throw new o("Unknown AccessToken serialization format.");
    }
    
    public final a c(Bundle paramBundle)
    {
      Intrinsics.checkNotNullParameter(paramBundle, "bundle");
      List localList1 = f(paramBundle, "com.facebook.TokenCachingStrategy.Permissions");
      List localList2 = f(paramBundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
      List localList3 = f(paramBundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
      M.a locala = M.c;
      Object localObject1 = locala.a(paramBundle);
      Object localObject2 = localObject1;
      if (P.c0((String)localObject1)) {
        localObject2 = B.m();
      }
      String str = locala.f(paramBundle);
      if (str == null) {
        return null;
      }
      localObject1 = P.f(str);
      if (localObject1 == null) {
        localObject1 = null;
      }
      try
      {
        localObject1 = ((JSONObject)localObject1).getString("id");
        if (localObject2 == null) {
          return null;
        }
        if (localObject1 == null) {
          return null;
        }
        return new a(str, (String)localObject2, (String)localObject1, (Collection)localList1, (Collection)localList2, (Collection)localList3, locala.e(paramBundle), locala.c(paramBundle), locala.d(paramBundle), null, null, 1024, null);
      }
      catch (JSONException paramBundle) {}
      return null;
    }
    
    public final void d()
    {
      a locala = g.f.e().i();
      if (locala != null) {
        h(a(locala));
      }
    }
    
    public final a e()
    {
      return g.f.e().i();
    }
    
    public final List f(Bundle paramBundle, String paramString)
    {
      Intrinsics.checkNotNullParameter(paramBundle, "bundle");
      paramBundle = paramBundle.getStringArrayList(paramString);
      if (paramBundle == null)
      {
        paramBundle = m.f();
      }
      else
      {
        paramBundle = Collections.unmodifiableList(new ArrayList(paramBundle));
        Intrinsics.checkNotNullExpressionValue(paramBundle, "{\n            Collections.unmodifiableList(ArrayList(originalPermissions))\n          }");
      }
      return paramBundle;
    }
    
    public final boolean g()
    {
      a locala = g.f.e().i();
      boolean bool;
      if ((locala != null) && (!locala.n())) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final void h(a parama)
    {
      g.f.e().r(parama);
    }
  }
}

/* Location:
 * Qualified Name:     x1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */