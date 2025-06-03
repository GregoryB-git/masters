package x1;

import O1.P;
import O1.P.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

public final class O
  implements Parcelable
{
  @NotNull
  public static final Parcelable.Creator<O> CREATOR = new a();
  public static final b v = new b(null);
  public static final String w = O.class.getSimpleName();
  public final String o;
  public final String p;
  public final String q;
  public final String r;
  public final String s;
  public final Uri t;
  public final Uri u;
  
  public O(Parcel paramParcel)
  {
    o = paramParcel.readString();
    p = paramParcel.readString();
    q = paramParcel.readString();
    r = paramParcel.readString();
    s = paramParcel.readString();
    Object localObject1 = paramParcel.readString();
    Object localObject2 = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = Uri.parse((String)localObject1);
    }
    t = ((Uri)localObject1);
    paramParcel = paramParcel.readString();
    if (paramParcel == null) {
      paramParcel = (Parcel)localObject2;
    } else {
      paramParcel = Uri.parse(paramParcel);
    }
    u = paramParcel;
  }
  
  public O(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, Uri paramUri1, Uri paramUri2)
  {
    O1.Q.k(paramString1, "id");
    o = paramString1;
    p = paramString2;
    q = paramString3;
    r = paramString4;
    s = paramString5;
    t = paramUri1;
    u = paramUri2;
  }
  
  public O(JSONObject paramJSONObject)
  {
    Object localObject1 = null;
    o = paramJSONObject.optString("id", null);
    p = paramJSONObject.optString("first_name", null);
    q = paramJSONObject.optString("middle_name", null);
    r = paramJSONObject.optString("last_name", null);
    s = paramJSONObject.optString("name", null);
    Object localObject2 = paramJSONObject.optString("link_uri", null);
    if (localObject2 == null) {
      localObject2 = null;
    } else {
      localObject2 = Uri.parse((String)localObject2);
    }
    t = ((Uri)localObject2);
    paramJSONObject = paramJSONObject.optString("picture_uri", null);
    if (paramJSONObject == null) {
      paramJSONObject = (JSONObject)localObject1;
    } else {
      paramJSONObject = Uri.parse(paramJSONObject);
    }
    u = paramJSONObject;
  }
  
  public final JSONObject b()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("id", o);
      localJSONObject.put("first_name", p);
      localJSONObject.put("middle_name", q);
      localJSONObject.put("last_name", r);
      localJSONObject.put("name", s);
      Uri localUri = t;
      if (localUri != null) {
        localJSONObject.put("link_uri", localUri.toString());
      }
      localUri = u;
      if (localUri != null) {
        localJSONObject.put("picture_uri", localUri.toString());
      }
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return null;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof O)) {
      return false;
    }
    Object localObject = o;
    if (((localObject == null) && (o == null)) || (Intrinsics.a(localObject, o)))
    {
      localObject = p;
      if (((localObject == null) && (p == null)) || (Intrinsics.a(localObject, p)))
      {
        localObject = q;
        if (((localObject == null) && (q == null)) || (Intrinsics.a(localObject, q)))
        {
          localObject = r;
          if (((localObject == null) && (r == null)) || (Intrinsics.a(localObject, r)))
          {
            localObject = s;
            if (((localObject == null) && (s == null)) || (Intrinsics.a(localObject, s)))
            {
              localObject = t;
              if (((localObject == null) && (t == null)) || (Intrinsics.a(localObject, t)))
              {
                localObject = u;
                if (localObject == null)
                {
                  bool2 = bool1;
                  if (u == null) {
                    break label261;
                  }
                }
                if (Intrinsics.a(localObject, u))
                {
                  bool2 = bool1;
                  break label261;
                }
              }
            }
          }
        }
      }
    }
    boolean bool2 = false;
    label261:
    return bool2;
  }
  
  public int hashCode()
  {
    Object localObject = o;
    if (localObject != null) {
      i = localObject.hashCode();
    } else {
      i = 0;
    }
    int j = 527 + i;
    localObject = p;
    int i = j;
    if (localObject != null) {
      i = j * 31 + ((String)localObject).hashCode();
    }
    localObject = q;
    j = i;
    if (localObject != null) {
      j = i * 31 + ((String)localObject).hashCode();
    }
    localObject = r;
    i = j;
    if (localObject != null) {
      i = j * 31 + ((String)localObject).hashCode();
    }
    localObject = s;
    j = i;
    if (localObject != null) {
      j = i * 31 + ((String)localObject).hashCode();
    }
    localObject = t;
    i = j;
    if (localObject != null) {
      i = j * 31 + ((Uri)localObject).hashCode();
    }
    localObject = u;
    j = i;
    if (localObject != null) {
      j = i * 31 + ((Uri)localObject).hashCode();
    }
    return j;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "dest");
    paramParcel.writeString(o);
    paramParcel.writeString(p);
    paramParcel.writeString(q);
    paramParcel.writeString(r);
    paramParcel.writeString(s);
    Object localObject1 = t;
    Object localObject2 = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = ((Uri)localObject1).toString();
    }
    paramParcel.writeString((String)localObject1);
    localObject1 = u;
    if (localObject1 == null) {
      localObject1 = localObject2;
    } else {
      localObject1 = ((Uri)localObject1).toString();
    }
    paramParcel.writeString((String)localObject1);
  }
  
  public static final class a
    implements Parcelable.Creator
  {
    public O a(Parcel paramParcel)
    {
      Intrinsics.checkNotNullParameter(paramParcel, "source");
      return new O(paramParcel, null);
    }
    
    public O[] b(int paramInt)
    {
      return new O[paramInt];
    }
  }
  
  public static final class b
  {
    public final void a()
    {
      Object localObject = a.z;
      a locala = ((a.c)localObject).e();
      if (locala == null) {
        return;
      }
      if (!((a.c)localObject).g())
      {
        c(null);
        return;
      }
      localObject = P.a;
      P.G(locala.l(), new a());
    }
    
    public final O b()
    {
      return Q.d.a().c();
    }
    
    public final void c(O paramO)
    {
      Q.d.a().f(paramO);
    }
    
    public static final class a
      implements P.a
    {
      public void a(JSONObject paramJSONObject)
      {
        Uri localUri = null;
        String str1;
        if (paramJSONObject == null) {
          str1 = null;
        } else {
          str1 = paramJSONObject.optString("id");
        }
        if (str1 == null)
        {
          Log.w(O.a(), "No user ID returned on Me request");
          return;
        }
        String str2 = paramJSONObject.optString("link");
        String str3 = paramJSONObject.optString("profile_picture", null);
        String str4 = paramJSONObject.optString("first_name");
        String str5 = paramJSONObject.optString("middle_name");
        String str6 = paramJSONObject.optString("last_name");
        String str7 = paramJSONObject.optString("name");
        if (str2 != null) {
          paramJSONObject = Uri.parse(str2);
        } else {
          paramJSONObject = null;
        }
        if (str3 != null) {
          localUri = Uri.parse(str3);
        }
        paramJSONObject = new O(str1, str4, str5, str6, str7, paramJSONObject, localUri);
        O.v.c(paramJSONObject);
      }
      
      public void b(o paramo)
      {
        Log.e(O.a(), Intrinsics.i("Got unexpected exception: ", paramo));
      }
    }
  }
}

/* Location:
 * Qualified Name:     x1.O
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */