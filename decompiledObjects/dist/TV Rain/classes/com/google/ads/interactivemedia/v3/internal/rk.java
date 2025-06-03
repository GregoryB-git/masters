package com.google.ads.interactivemedia.v3.internal;

import a;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class rk
  implements kd.a
{
  public static final Parcelable.Creator<rk> CREATOR = new rm();
  private final String a;
  private final String b;
  private final List<a> c;
  
  public rk(Parcel paramParcel)
  {
    a = paramParcel.readString();
    b = paramParcel.readString();
    int i = paramParcel.readInt();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      localArrayList.add((a)paramParcel.readParcelable(a.class.getClassLoader()));
    }
    c = Collections.unmodifiableList(localArrayList);
  }
  
  public rk(String paramString1, String paramString2, List<a> paramList)
  {
    a = paramString1;
    b = paramString2;
    c = Collections.unmodifiableList(new ArrayList(paramList));
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
    if ((paramObject != null) && (rk.class == paramObject.getClass()))
    {
      paramObject = (rk)paramObject;
      if ((TextUtils.equals(a, a)) && (TextUtils.equals(b, b)) && (c.equals(c))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    String str = a;
    int i = 0;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = b;
    if (str != null) {
      i = str.hashCode();
    }
    return c.hashCode() + (j * 31 + i) * 31;
  }
  
  public final String toString()
  {
    Object localObject = a;
    if (localObject != null)
    {
      String str = b;
      localObject = a.q(a.b(str, a.b((String)localObject, 5)), " [", (String)localObject, ", ", str);
      ((StringBuilder)localObject).append("]");
      localObject = ((StringBuilder)localObject).toString();
    }
    else
    {
      localObject = "";
    }
    localObject = String.valueOf(localObject);
    if (((String)localObject).length() != 0) {
      return "HlsTrackMetadataEntry".concat((String)localObject);
    }
    return new String("HlsTrackMetadataEntry");
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(a);
    paramParcel.writeString(b);
    int i = c.size();
    paramParcel.writeInt(i);
    for (paramInt = 0; paramInt < i; paramInt++) {
      paramParcel.writeParcelable((Parcelable)c.get(paramInt), 0);
    }
  }
  
  public static final class a
    implements Parcelable
  {
    public static final Parcelable.Creator<a> CREATOR = new ro();
    private final long a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    
    public a(long paramLong, String paramString1, String paramString2, String paramString3, String paramString4)
    {
      a = paramLong;
      b = paramString1;
      c = paramString2;
      d = paramString3;
      e = paramString4;
    }
    
    public a(Parcel paramParcel)
    {
      a = paramParcel.readLong();
      b = paramParcel.readString();
      c = paramParcel.readString();
      d = paramParcel.readString();
      e = paramParcel.readString();
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
      if ((paramObject != null) && (a.class == paramObject.getClass()))
      {
        paramObject = (a)paramObject;
        if ((a == a) && (TextUtils.equals(b, b)) && (TextUtils.equals(c, c)) && (TextUtils.equals(d, d)) && (TextUtils.equals(e, e))) {
          return true;
        }
      }
      return false;
    }
    
    public final int hashCode()
    {
      long l = a;
      int i = (int)(l ^ l >>> 32);
      String str = b;
      int j = 0;
      int k;
      if (str != null) {
        k = str.hashCode();
      } else {
        k = 0;
      }
      str = c;
      int m;
      if (str != null) {
        m = str.hashCode();
      } else {
        m = 0;
      }
      str = d;
      int n;
      if (str != null) {
        n = str.hashCode();
      } else {
        n = 0;
      }
      str = e;
      if (str != null) {
        j = str.hashCode();
      }
      return (((i * 31 + k) * 31 + m) * 31 + n) * 31 + j;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeLong(a);
      paramParcel.writeString(b);
      paramParcel.writeString(c);
      paramParcel.writeString(d);
      paramParcel.writeString(e);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.rk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */