package com.google.ads.interactivemedia.v3.internal;

import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import java.util.List;
import java.util.Map;

public final class kl
  implements kd.a
{
  public static final Parcelable.Creator<kl> CREATOR = new kk();
  public final int a;
  public final int b;
  private final String c;
  private final String d;
  private final String e;
  private final boolean f;
  
  private kl(int paramInt1, String paramString1, String paramString2, String paramString3, boolean paramBoolean, int paramInt2)
  {
    boolean bool;
    if ((paramInt2 != -1) && (paramInt2 <= 0)) {
      bool = false;
    } else {
      bool = true;
    }
    rp.b(bool);
    a = paramInt1;
    c = paramString1;
    d = paramString2;
    e = paramString3;
    f = paramBoolean;
    b = paramInt2;
  }
  
  public kl(Parcel paramParcel)
  {
    a = paramParcel.readInt();
    c = paramParcel.readString();
    d = paramParcel.readString();
    e = paramParcel.readString();
    f = wl.a(paramParcel);
    b = paramParcel.readInt();
  }
  
  public static kl a(Map<String, List<String>> paramMap)
  {
    Object localObject1 = (List)paramMap.get("icy-br");
    i = -1;
    int j = 1;
    if (localObject1 != null)
    {
      localObject3 = (String)((List)localObject1).get(0);
      for (;;)
      {
        try
        {
          k = Integer.parseInt((String)localObject3);
          m = k * 1000;
          if (m > 0)
          {
            k = 1;
            n = m;
            break;
          }
          localObject2 = String.valueOf(localObject3);
        }
        catch (NumberFormatException localNumberFormatException1)
        {
          try
          {
            localObject1 = String.valueOf(localObject3);
            if (((String)localObject1).length() != 0) {
              localObject1 = "Invalid bitrate: ".concat((String)localObject1);
            } else {
              localObject1 = new String("Invalid bitrate: ");
            }
            Log.w("IcyHeaders", (String)localObject1);
          }
          catch (NumberFormatException localNumberFormatException2)
          {
            int k;
            int n;
            Object localObject2;
            Object localObject4;
            Object localObject5;
            boolean bool;
            for (;;) {}
          }
          localNumberFormatException1 = localNumberFormatException1;
          m = -1;
        }
        if (((String)localObject2).length() != 0) {
          localObject2 = "Invalid bitrate header: ".concat((String)localObject2);
        } else {
          localObject2 = new String("Invalid bitrate header: ");
        }
        Log.w("IcyHeaders", (String)localObject2);
        k = 0;
      }
    }
    n = -1;
    k = 0;
    localObject2 = (List)paramMap.get("icy-genre");
    if (localObject2 != null)
    {
      localObject2 = (String)((List)localObject2).get(0);
      k = 1;
    }
    else
    {
      localObject2 = null;
    }
    Object localObject3 = (List)paramMap.get("icy-name");
    if (localObject3 != null)
    {
      localObject3 = (String)((List)localObject3).get(0);
      k = 1;
    }
    else
    {
      localObject3 = null;
    }
    localObject4 = (List)paramMap.get("icy-url");
    if (localObject4 != null)
    {
      localObject4 = (String)((List)localObject4).get(0);
      k = 1;
    }
    else
    {
      localObject4 = null;
    }
    localObject5 = (List)paramMap.get("icy-pub");
    if (localObject5 != null)
    {
      bool = ((String)((List)localObject5).get(0)).equals("1");
      k = 1;
    }
    else
    {
      bool = false;
    }
    paramMap = (List)paramMap.get("icy-metaint");
    m = i;
    if (paramMap != null) {
      localObject5 = (String)paramMap.get(0);
    }
    try
    {
      m = Integer.parseInt((String)localObject5);
      if (m > 0)
      {
        k = j;
        break label457;
      }
      try
      {
        paramMap = String.valueOf(localObject5);
        if (paramMap.length() != 0) {
          paramMap = "Invalid metadata interval: ".concat(paramMap);
        } else {
          paramMap = new String("Invalid metadata interval: ");
        }
        Log.w("IcyHeaders", paramMap);
        m = i;
      }
      catch (NumberFormatException paramMap) {}
    }
    catch (NumberFormatException paramMap)
    {
      for (;;)
      {
        label457:
        m = i;
      }
    }
    paramMap = String.valueOf(localObject5);
    if (paramMap.length() != 0) {
      paramMap = "Invalid metadata interval: ".concat(paramMap);
    } else {
      paramMap = new String("Invalid metadata interval: ");
    }
    Log.w("IcyHeaders", paramMap);
    if (k != 0) {
      return new kl(n, (String)localObject2, (String)localObject3, (String)localObject4, bool, m);
    }
    return null;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (kl.class == paramObject.getClass()))
    {
      paramObject = (kl)paramObject;
      if ((a == a) && (wl.a(c, c)) && (wl.a(d, d)) && (wl.a(e, e)) && (f == f) && (b == b)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a;
    String str = c;
    int j = 0;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = d;
    int m;
    if (str != null) {
      m = str.hashCode();
    } else {
      m = 0;
    }
    str = e;
    if (str != null) {
      j = str.hashCode();
    }
    return (((((i + 527) * 31 + k) * 31 + m) * 31 + j) * 31 + f) * 31 + b;
  }
  
  public final String toString()
  {
    String str = d;
    Object localObject = c;
    int i = a;
    int j = b;
    localObject = a.q(a.b((String)localObject, a.b(str, 80)), "IcyHeaders: name=\"", str, "\", genre=\"", (String)localObject);
    ((StringBuilder)localObject).append("\", bitrate=");
    ((StringBuilder)localObject).append(i);
    ((StringBuilder)localObject).append(", metadataInterval=");
    ((StringBuilder)localObject).append(j);
    return ((StringBuilder)localObject).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(a);
    paramParcel.writeString(c);
    paramParcel.writeString(d);
    paramParcel.writeString(e);
    wl.a(paramParcel, f);
    paramParcel.writeInt(b);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.kl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */