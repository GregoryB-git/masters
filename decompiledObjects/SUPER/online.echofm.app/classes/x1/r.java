package x1;

import O1.P;
import O1.j;
import O1.j.a;
import O1.v;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.net.HttpURLConnection;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

public final class r
  implements Parcelable
{
  public static final c C = new c(null);
  @NotNull
  public static final Parcelable.Creator<r> CREATOR = new b();
  public static final d D = new d(200, 299);
  public final a A;
  public final String B;
  public final int o;
  public final int p;
  public final int q;
  public final String r;
  public final String s;
  public final String t;
  public final JSONObject u;
  public final JSONObject v;
  public final Object w;
  public final HttpURLConnection x;
  public final String y;
  public o z;
  
  public r(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, String paramString3, String paramString4, JSONObject paramJSONObject1, JSONObject paramJSONObject2, Object paramObject, HttpURLConnection paramHttpURLConnection, o paramo, boolean paramBoolean)
  {
    o = paramInt1;
    p = paramInt2;
    q = paramInt3;
    r = paramString1;
    s = paramString3;
    t = paramString4;
    u = paramJSONObject1;
    v = paramJSONObject2;
    w = paramObject;
    x = paramHttpURLConnection;
    y = paramString2;
    if (paramo != null)
    {
      z = paramo;
      paramString1 = a.p;
    }
    else
    {
      z = new D(this, c());
      paramString1 = C.b().c(paramInt2, paramInt3, paramBoolean);
    }
    A = paramString1;
    B = C.b().d(paramString1);
  }
  
  public r(int paramInt, String paramString1, String paramString2)
  {
    this(-1, paramInt, -1, paramString1, paramString2, null, null, null, null, null, null, null, false);
  }
  
  public r(Parcel paramParcel)
  {
    this(paramParcel.readInt(), paramParcel.readInt(), paramParcel.readInt(), paramParcel.readString(), paramParcel.readString(), paramParcel.readString(), paramParcel.readString(), null, null, null, null, null, false);
  }
  
  public r(HttpURLConnection paramHttpURLConnection, Exception paramException)
  {
    this(-1, -1, -1, null, null, null, null, null, null, null, paramHttpURLConnection, paramException, false);
  }
  
  public final int b()
  {
    return p;
  }
  
  public final String c()
  {
    String str = y;
    Object localObject = str;
    if (str == null)
    {
      localObject = z;
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = ((Throwable)localObject).getLocalizedMessage();
      }
    }
    return (String)localObject;
  }
  
  public final String d()
  {
    return r;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final o e()
  {
    return z;
  }
  
  public final int f()
  {
    return o;
  }
  
  public final int g()
  {
    return q;
  }
  
  public String toString()
  {
    Object localObject = new StringBuilder("{HttpStatus: ");
    ((StringBuilder)localObject).append(o);
    ((StringBuilder)localObject).append(", errorCode: ");
    ((StringBuilder)localObject).append(p);
    ((StringBuilder)localObject).append(", subErrorCode: ");
    ((StringBuilder)localObject).append(q);
    ((StringBuilder)localObject).append(", errorType: ");
    ((StringBuilder)localObject).append(r);
    ((StringBuilder)localObject).append(", errorMessage: ");
    ((StringBuilder)localObject).append(c());
    ((StringBuilder)localObject).append("}");
    localObject = ((StringBuilder)localObject).toString();
    Intrinsics.checkNotNullExpressionValue(localObject, "StringBuilder(\"{HttpStatus: \")\n        .append(requestStatusCode)\n        .append(\", errorCode: \")\n        .append(errorCode)\n        .append(\", subErrorCode: \")\n        .append(subErrorCode)\n        .append(\", errorType: \")\n        .append(errorType)\n        .append(\", errorMessage: \")\n        .append(errorMessage)\n        .append(\"}\")\n        .toString()");
    return (String)localObject;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "out");
    paramParcel.writeInt(o);
    paramParcel.writeInt(p);
    paramParcel.writeInt(q);
    paramParcel.writeString(r);
    paramParcel.writeString(c());
    paramParcel.writeString(s);
    paramParcel.writeString(t);
  }
  
  public static enum a {}
  
  public static final class b
    implements Parcelable.Creator
  {
    public r a(Parcel paramParcel)
    {
      Intrinsics.checkNotNullParameter(paramParcel, "parcel");
      return new r(paramParcel, null);
    }
    
    public r[] b(int paramInt)
    {
      return new r[paramInt];
    }
  }
  
  public static final class c
  {
    public final r a(JSONObject paramJSONObject, Object paramObject, HttpURLConnection paramHttpURLConnection)
    {
      Intrinsics.checkNotNullParameter(paramJSONObject, "singleResult");
      try
      {
        if (paramJSONObject.has("code"))
        {
          int i = paramJSONObject.getInt("code");
          Object localObject1 = P.O(paramJSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
          Object localObject3;
          if ((localObject1 != null) && ((localObject1 instanceof JSONObject)))
          {
            boolean bool1 = ((JSONObject)localObject1).has("error");
            int j = 0;
            boolean bool2 = false;
            int k = -1;
            Object localObject2;
            Object localObject4;
            int m;
            Object localObject5;
            Object localObject6;
            if (bool1)
            {
              localObject2 = (JSONObject)P.O((JSONObject)localObject1, "error", null);
              if (localObject2 == null) {
                localObject3 = null;
              } else {
                localObject3 = ((JSONObject)localObject2).optString("type", null);
              }
              if (localObject2 == null) {
                localObject4 = null;
              } else {
                localObject4 = ((JSONObject)localObject2).optString("message", null);
              }
              if (localObject2 == null) {
                m = -1;
              } else {
                m = ((JSONObject)localObject2).optInt("code", -1);
              }
              if (localObject2 != null) {
                k = ((JSONObject)localObject2).optInt("error_subcode", -1);
              }
              if (localObject2 == null) {
                localObject5 = null;
              } else {
                localObject5 = ((JSONObject)localObject2).optString("error_user_msg", null);
              }
              if (localObject2 == null) {
                localObject6 = null;
              } else {
                localObject6 = ((JSONObject)localObject2).optString("error_user_title", null);
              }
              if (localObject2 != null) {
                bool2 = ((JSONObject)localObject2).optBoolean("is_transient", false);
              }
              localObject2 = localObject4;
              localObject4 = localObject6;
              localObject6 = localObject2;
            }
            int n;
            for (;;)
            {
              j = 1;
              localObject2 = localObject3;
              n = k;
              localObject3 = localObject5;
              break;
              bool2 = ((JSONObject)localObject1).has("error_code");
              if ((!bool2) && (!((JSONObject)localObject1).has("error_msg")) && (!((JSONObject)localObject1).has("error_reason")))
              {
                bool2 = false;
                n = -1;
                localObject2 = null;
                localObject4 = localObject2;
                localObject3 = localObject4;
                localObject5 = localObject3;
                localObject6 = localObject4;
                m = k;
                localObject4 = localObject5;
                break;
              }
              localObject3 = ((JSONObject)localObject1).optString("error_reason", null);
              localObject6 = ((JSONObject)localObject1).optString("error_msg", null);
              m = ((JSONObject)localObject1).optInt("error_code", -1);
              k = ((JSONObject)localObject1).optInt("error_subcode", -1);
              bool2 = false;
              localObject5 = null;
              localObject4 = localObject5;
            }
            if (j != 0) {
              return new r(i, m, n, (String)localObject2, (String)localObject6, (String)localObject4, (String)localObject3, (JSONObject)localObject1, paramJSONObject, paramObject, paramHttpURLConnection, null, bool2, null);
            }
          }
          if (!c().a(i))
          {
            if (paramJSONObject.has("body")) {
              localObject3 = (JSONObject)P.O(paramJSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
            } else {
              localObject3 = null;
            }
            paramJSONObject = new r(i, -1, -1, null, null, null, null, (JSONObject)localObject3, paramJSONObject, paramObject, paramHttpURLConnection, null, false, null);
            return paramJSONObject;
          }
        }
      }
      catch (JSONException paramJSONObject)
      {
        for (;;) {}
      }
      return null;
    }
    
    public final j b()
    {
      j localj;
      label41:
      try
      {
        Object localObject1 = v.a;
        localObject1 = v.f(B.m());
        if (localObject1 == null)
        {
          localObject1 = j.g.b();
          return (j)localObject1;
        }
      }
      finally
      {
        break label41;
        localj = ((O1.r)localObject2).c();
        return localj;
      }
    }
    
    public final r.d c()
    {
      return r.a();
    }
  }
  
  public static final class d
  {
    public final int a;
    public final int b;
    
    public d(int paramInt1, int paramInt2)
    {
      a = paramInt1;
      b = paramInt2;
    }
    
    public final boolean a(int paramInt)
    {
      int i = a;
      int j = b;
      boolean bool1 = false;
      boolean bool2 = bool1;
      if (paramInt <= j)
      {
        bool2 = bool1;
        if (i <= paramInt) {
          bool2 = true;
        }
      }
      return bool2;
    }
  }
}

/* Location:
 * Qualified Name:     x1.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */