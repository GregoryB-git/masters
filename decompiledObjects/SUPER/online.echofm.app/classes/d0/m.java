package d0;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import g0.M;
import g0.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class m
  implements Comparator, Parcelable
{
  public static final Parcelable.Creator<m> CREATOR = new a();
  public final b[] o;
  public int p;
  public final String q;
  public final int r;
  
  public m(Parcel paramParcel)
  {
    q = paramParcel.readString();
    paramParcel = (b[])M.i((b[])paramParcel.createTypedArray(b.CREATOR));
    o = paramParcel;
    r = paramParcel.length;
  }
  
  public m(String paramString, List paramList)
  {
    this(paramString, false, (b[])paramList.toArray(new b[0]));
  }
  
  public m(String paramString, boolean paramBoolean, b... paramVarArgs)
  {
    q = paramString;
    paramString = paramVarArgs;
    if (paramBoolean) {
      paramString = (b[])paramVarArgs.clone();
    }
    o = paramString;
    r = paramString.length;
    Arrays.sort(paramString, this);
  }
  
  public m(String paramString, b... paramVarArgs)
  {
    this(paramString, true, paramVarArgs);
  }
  
  public m(List paramList)
  {
    this(null, false, (b[])paramList.toArray(new b[0]));
  }
  
  public m(b... paramVarArgs)
  {
    this(null, paramVarArgs);
  }
  
  public static boolean b(ArrayList paramArrayList, int paramInt, UUID paramUUID)
  {
    for (int i = 0; i < paramInt; i++) {
      if (getp.equals(paramUUID)) {
        return true;
      }
    }
    return false;
  }
  
  public static m d(m paramm1, m paramm2)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    Object localObject1 = null;
    Object localObject2;
    int j;
    int k;
    if (paramm1 != null)
    {
      localObject2 = q;
      localObject3 = o;
      j = localObject3.length;
      for (k = 0;; k++)
      {
        paramm1 = (m)localObject2;
        if (k >= j) {
          break;
        }
        paramm1 = localObject3[k];
        if (paramm1.c()) {
          localArrayList.add(paramm1);
        }
      }
    }
    paramm1 = null;
    Object localObject3 = paramm1;
    if (paramm2 != null)
    {
      localObject2 = paramm1;
      if (paramm1 == null) {
        localObject2 = q;
      }
      j = localArrayList.size();
      paramm1 = o;
      int m = paramm1.length;
      for (k = i;; k++)
      {
        localObject3 = localObject2;
        if (k >= m) {
          break;
        }
        paramm2 = paramm1[k];
        if ((paramm2.c()) && (!b(localArrayList, j, p))) {
          localArrayList.add(paramm2);
        }
      }
    }
    if (localArrayList.isEmpty()) {
      paramm1 = (m)localObject1;
    } else {
      paramm1 = new m((String)localObject3, localArrayList);
    }
    return paramm1;
  }
  
  public int a(b paramb1, b paramb2)
  {
    UUID localUUID = g.a;
    int i;
    if (localUUID.equals(p))
    {
      if (localUUID.equals(p)) {
        i = 0;
      } else {
        i = 1;
      }
    }
    else {
      i = p.compareTo(p);
    }
    return i;
  }
  
  public m c(String paramString)
  {
    if (M.c(q, paramString)) {
      return this;
    }
    return new m(paramString, false, o);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public b e(int paramInt)
  {
    return o[paramInt];
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (m.class == paramObject.getClass()))
    {
      paramObject = (m)paramObject;
      if ((!M.c(q, q)) || (!Arrays.equals(o, o))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public m f(m paramm)
  {
    String str1 = q;
    if (str1 != null)
    {
      String str2 = q;
      if ((str2 != null) && (!TextUtils.equals(str1, str2)))
      {
        bool = false;
        break label38;
      }
    }
    boolean bool = true;
    label38:
    a.f(bool);
    str1 = q;
    if (str1 == null) {
      str1 = q;
    }
    return new m(str1, (b[])M.N0(o, o));
  }
  
  public int hashCode()
  {
    if (p == 0)
    {
      String str = q;
      int i;
      if (str == null) {
        i = 0;
      } else {
        i = str.hashCode();
      }
      p = (i * 31 + Arrays.hashCode(o));
    }
    return p;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(q);
    paramParcel.writeTypedArray(o, 0);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public m a(Parcel paramParcel)
    {
      return new m(paramParcel);
    }
    
    public m[] b(int paramInt)
    {
      return new m[paramInt];
    }
  }
  
  public static final class b
    implements Parcelable
  {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public int o;
    public final UUID p;
    public final String q;
    public final String r;
    public final byte[] s;
    
    public b(Parcel paramParcel)
    {
      p = new UUID(paramParcel.readLong(), paramParcel.readLong());
      q = paramParcel.readString();
      r = ((String)M.i(paramParcel.readString()));
      s = paramParcel.createByteArray();
    }
    
    public b(UUID paramUUID, String paramString1, String paramString2, byte[] paramArrayOfByte)
    {
      p = ((UUID)a.e(paramUUID));
      q = paramString1;
      r = z.t((String)a.e(paramString2));
      s = paramArrayOfByte;
    }
    
    public b(UUID paramUUID, String paramString, byte[] paramArrayOfByte)
    {
      this(paramUUID, null, paramString, paramArrayOfByte);
    }
    
    public boolean a(b paramb)
    {
      boolean bool;
      if ((c()) && (!paramb.c()) && (d(p))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public b b(byte[] paramArrayOfByte)
    {
      return new b(p, q, r, paramArrayOfByte);
    }
    
    public boolean c()
    {
      boolean bool;
      if (s != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean d(UUID paramUUID)
    {
      boolean bool;
      if ((!g.a.equals(p)) && (!paramUUID.equals(p))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof b;
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      if (paramObject == this) {
        return true;
      }
      paramObject = (b)paramObject;
      bool1 = bool2;
      if (M.c(q, q))
      {
        bool1 = bool2;
        if (M.c(r, r))
        {
          bool1 = bool2;
          if (M.c(p, p))
          {
            bool1 = bool2;
            if (Arrays.equals(s, s)) {
              bool1 = true;
            }
          }
        }
      }
      return bool1;
    }
    
    public int hashCode()
    {
      if (o == 0)
      {
        int i = p.hashCode();
        String str = q;
        int j;
        if (str == null) {
          j = 0;
        } else {
          j = str.hashCode();
        }
        o = (((i * 31 + j) * 31 + r.hashCode()) * 31 + Arrays.hashCode(s));
      }
      return o;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeLong(p.getMostSignificantBits());
      paramParcel.writeLong(p.getLeastSignificantBits());
      paramParcel.writeString(q);
      paramParcel.writeString(r);
      paramParcel.writeByteArray(s);
    }
    
    public class a
      implements Parcelable.Creator
    {
      public m.b a(Parcel paramParcel)
      {
        return new m.b(paramParcel);
      }
      
      public m.b[] b(int paramInt)
      {
        return new m.b[paramInt];
      }
    }
  }
}

/* Location:
 * Qualified Name:     d0.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */