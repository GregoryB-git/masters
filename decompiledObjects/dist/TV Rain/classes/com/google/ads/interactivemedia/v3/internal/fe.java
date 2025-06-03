package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import z2;

public final class fe
  implements Parcelable, Comparator<a>
{
  public static final Parcelable.Creator<fe> CREATOR = new fd();
  public final String a;
  public final int b;
  private final a[] c;
  private int d;
  
  public fe(Parcel paramParcel)
  {
    a = paramParcel.readString();
    paramParcel = (a[])wl.a((a[])paramParcel.createTypedArray(a.CREATOR));
    c = paramParcel;
    b = paramParcel.length;
  }
  
  public fe(String paramString, List<a> paramList)
  {
    this(paramString, false, (a[])paramList.toArray(new a[0]));
  }
  
  private fe(String paramString, boolean paramBoolean, a... paramVarArgs)
  {
    a = paramString;
    paramString = paramVarArgs;
    if (paramBoolean) {
      paramString = (a[])paramVarArgs.clone();
    }
    c = paramString;
    b = paramString.length;
    Arrays.sort(paramString, this);
  }
  
  public fe(String paramString, a... paramVarArgs)
  {
    this(paramString, true, paramVarArgs);
  }
  
  public fe(List<a> paramList)
  {
    this(null, false, (a[])paramList.toArray(new a[0]));
  }
  
  public fe(a... paramVarArgs)
  {
    this(null, paramVarArgs);
  }
  
  public static fe a(fe paramfe1, fe paramfe2)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1;
    int i;
    int j;
    if (paramfe1 != null)
    {
      localObject1 = a;
      localObject2 = c;
      i = localObject2.length;
      for (j = 0;; j++)
      {
        paramfe1 = (fe)localObject1;
        if (j >= i) {
          break;
        }
        paramfe1 = localObject2[j];
        if (paramfe1.a()) {
          localArrayList.add(paramfe1);
        }
      }
    }
    paramfe1 = null;
    Object localObject2 = paramfe1;
    if (paramfe2 != null)
    {
      localObject1 = paramfe1;
      if (paramfe1 == null) {
        localObject1 = a;
      }
      int k = localArrayList.size();
      paramfe1 = c;
      int m = paramfe1.length;
      for (j = 0;; j++)
      {
        localObject2 = localObject1;
        if (j >= m) {
          break;
        }
        localObject2 = paramfe1[j];
        if (((a)localObject2).a())
        {
          paramfe2 = a.b((a)localObject2);
          for (i = 0; i < k; i++) {
            if (a.b((a)localArrayList.get(i)).equals(paramfe2))
            {
              i = 1;
              break label177;
            }
          }
          i = 0;
          label177:
          if (i == 0) {
            localArrayList.add(localObject2);
          }
        }
      }
    }
    if (localArrayList.isEmpty()) {
      return null;
    }
    return new fe((String)localObject2, localArrayList);
  }
  
  public final fe a(fe paramfe)
  {
    String str1 = a;
    if (str1 != null)
    {
      String str2 = a;
      if ((str2 != null) && (!TextUtils.equals(str1, str2)))
      {
        bool = false;
        break label38;
      }
    }
    boolean bool = true;
    label38:
    rp.c(bool);
    str1 = a;
    if (str1 == null) {
      str1 = a;
    }
    return new fe(str1, (a[])wl.a(c, c));
  }
  
  public final fe a(String paramString)
  {
    if (wl.a(a, paramString)) {
      return this;
    }
    return new fe(paramString, false, c);
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
    if ((paramObject != null) && (fe.class == paramObject.getClass()))
    {
      paramObject = (fe)paramObject;
      if ((wl.a(a, a)) && (Arrays.equals(c, c))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    if (d == 0)
    {
      String str = a;
      int i;
      if (str == null) {
        i = 0;
      } else {
        i = str.hashCode();
      }
      d = (i * 31 + Arrays.hashCode(c));
    }
    return d;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(a);
    paramParcel.writeTypedArray(c, 0);
  }
  
  public static final class a
    implements Parcelable
  {
    public static final Parcelable.Creator<a> CREATOR = new ff();
    public final byte[] a;
    private int b;
    private final UUID c;
    private final String d;
    private final String e;
    
    public a(Parcel paramParcel)
    {
      c = new UUID(paramParcel.readLong(), paramParcel.readLong());
      d = paramParcel.readString();
      e = ((String)wl.a(paramParcel.readString()));
      a = paramParcel.createByteArray();
    }
    
    public a(UUID paramUUID, String paramString1, String paramString2, byte[] paramArrayOfByte)
    {
      c = ((UUID)rp.a(paramUUID));
      d = paramString1;
      e = ((String)rp.a(paramString2));
      a = paramArrayOfByte;
    }
    
    public a(UUID paramUUID, String paramString, byte[] paramArrayOfByte)
    {
      this(paramUUID, null, paramString, paramArrayOfByte);
    }
    
    public final a a(byte[] paramArrayOfByte)
    {
      return new a(c, d, e, null);
    }
    
    public final boolean a()
    {
      return a != null;
    }
    
    public final boolean a(a parama)
    {
      return (a()) && (!parama.a()) && (a(c));
    }
    
    public final boolean a(UUID paramUUID)
    {
      return (av.a.equals(c)) || (paramUUID.equals(c));
    }
    
    public final int describeContents()
    {
      return 0;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (!(paramObject instanceof a)) {
        return false;
      }
      if (paramObject == this) {
        return true;
      }
      paramObject = (a)paramObject;
      return (wl.a(d, d)) && (wl.a(e, e)) && (wl.a(c, c)) && (Arrays.equals(a, a));
    }
    
    public final int hashCode()
    {
      if (b == 0)
      {
        int i = c.hashCode();
        String str = d;
        if (str == null) {
          j = 0;
        } else {
          j = str.hashCode();
        }
        int j = z2.c(e, (i * 31 + j) * 31, 31);
        b = (Arrays.hashCode(a) + j);
      }
      return b;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeLong(c.getMostSignificantBits());
      paramParcel.writeLong(c.getLeastSignificantBits());
      paramParcel.writeString(d);
      paramParcel.writeString(e);
      paramParcel.writeByteArray(a);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.fe
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */