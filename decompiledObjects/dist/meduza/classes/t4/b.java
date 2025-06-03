package t4;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import f;
import java.util.List;
import java.util.Map;
import p4.a.b;
import v3.p0.a;
import v5.e0;
import v5.m;

public final class b
  implements a.b
{
  public static final Parcelable.Creator<b> CREATOR = new a();
  public final int a;
  public final String b;
  public final String c;
  public final String d;
  public final boolean e;
  public final int f;
  
  public b(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    boolean bool;
    if ((paramInt2 != -1) && (paramInt2 <= 0)) {
      bool = false;
    } else {
      bool = true;
    }
    x6.b.q(bool);
    a = paramInt1;
    b = paramString1;
    c = paramString2;
    d = paramString3;
    e = paramBoolean;
    f = paramInt2;
  }
  
  public b(Parcel paramParcel)
  {
    a = paramParcel.readInt();
    b = paramParcel.readString();
    c = paramParcel.readString();
    d = paramParcel.readString();
    int i = e0.a;
    boolean bool;
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    e = bool;
    f = paramParcel.readInt();
  }
  
  public static b a(Map<String, List<String>> paramMap)
  {
    Object localObject1 = (List)paramMap.get("icy-br");
    int i = -1;
    int j = 1;
    if (localObject1 != null)
    {
      localObject1 = (String)((List)localObject1).get(0);
      try
      {
        k = Integer.parseInt((String)localObject1);
        m = k * 1000;
        if (m > 0)
        {
          k = 1;
          break label139;
        }
        StringBuilder localStringBuilder1;
        localObject2 = new StringBuilder();
      }
      catch (NumberFormatException localNumberFormatException1)
      {
        try
        {
          localStringBuilder1 = new java/lang/StringBuilder;
          localStringBuilder1.<init>();
          localStringBuilder1.append("Invalid bitrate: ");
          localStringBuilder1.append((String)localObject1);
          m.f("IcyHeaders", localStringBuilder1.toString());
          m = -1;
        }
        catch (NumberFormatException localNumberFormatException2)
        {
          int k;
          int m;
          Object localObject2;
          int n;
          Object localObject3;
          Object localObject4;
          Object localObject5;
          boolean bool;
          int i1;
          for (;;) {}
        }
        localNumberFormatException1 = localNumberFormatException1;
        m = -1;
      }
      ((StringBuilder)localObject2).append("Invalid bitrate header: ");
      ((StringBuilder)localObject2).append((String)localObject1);
      m.f("IcyHeaders", ((StringBuilder)localObject2).toString());
      k = 0;
      label139:
      n = m;
    }
    else
    {
      n = -1;
      k = 0;
    }
    localObject1 = (List)paramMap.get("icy-genre");
    localObject3 = null;
    if (localObject1 != null)
    {
      localObject1 = (String)((List)localObject1).get(0);
      k = 1;
    }
    else
    {
      localObject1 = null;
    }
    localObject2 = (List)paramMap.get("icy-name");
    if (localObject2 != null)
    {
      localObject2 = (String)((List)localObject2).get(0);
      k = 1;
    }
    else
    {
      localObject2 = null;
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
    i1 = k;
    m = i;
    if (paramMap != null) {
      paramMap = (String)paramMap.get(0);
    }
    try
    {
      m = Integer.parseInt(paramMap);
      if (m > 0)
      {
        i = m;
        k = j;
      }
      try
      {
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        ((StringBuilder)localObject5).append("Invalid metadata interval: ");
        ((StringBuilder)localObject5).append(paramMap);
        m.f("IcyHeaders", ((StringBuilder)localObject5).toString());
        i1 = k;
        m = i;
      }
      catch (NumberFormatException localNumberFormatException3)
      {
        i = m;
      }
    }
    catch (NumberFormatException localNumberFormatException4)
    {
      StringBuilder localStringBuilder2;
      for (;;) {}
    }
    localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append("Invalid metadata interval: ");
    localStringBuilder2.append(paramMap);
    m.f("IcyHeaders", localStringBuilder2.toString());
    m = i;
    i1 = k;
    paramMap = (Map<String, List<String>>)localObject3;
    if (i1 != 0) {
      paramMap = new b(n, m, (String)localObject1, (String)localObject2, (String)localObject4, bool);
    }
    return paramMap;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (b.class == paramObject.getClass()))
    {
      paramObject = (b)paramObject;
      if ((a != a) || (!e0.a(b, b)) || (!e0.a(c, c)) || (!e0.a(d, d)) || (e != e) || (f != f)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a;
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
    if (str != null) {
      j = str.hashCode();
    }
    return (((((527 + i) * 31 + k) * 31 + m) * 31 + j) * 31 + e) * 31 + f;
  }
  
  public final void l(p0.a parama)
  {
    String str = c;
    if (str != null) {
      E = str;
    }
    str = b;
    if (str != null) {
      C = str;
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("IcyHeaders: name=\"");
    localStringBuilder.append(c);
    localStringBuilder.append("\", genre=\"");
    localStringBuilder.append(b);
    localStringBuilder.append("\", bitrate=");
    localStringBuilder.append(a);
    localStringBuilder.append(", metadataInterval=");
    localStringBuilder.append(f);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(a);
    paramParcel.writeString(b);
    paramParcel.writeString(c);
    paramParcel.writeString(d);
    int i = e;
    paramInt = e0.a;
    paramParcel.writeInt(i);
    paramParcel.writeInt(f);
  }
  
  public final class a
    implements Parcelable.Creator<b>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new b(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new b[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     t4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */