package d0;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import g0.M;
import g0.a;
import java.util.Arrays;
import java.util.UUID;

public final class m$b
  implements Parcelable
{
  public static final Parcelable.Creator<b> CREATOR = new a();
  public int o;
  public final UUID p;
  public final String q;
  public final String r;
  public final byte[] s;
  
  public m$b(Parcel paramParcel)
  {
    p = new UUID(paramParcel.readLong(), paramParcel.readLong());
    q = paramParcel.readString();
    r = ((String)M.i(paramParcel.readString()));
    s = paramParcel.createByteArray();
  }
  
  public m$b(UUID paramUUID, String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    p = ((UUID)a.e(paramUUID));
    q = paramString1;
    r = z.t((String)a.e(paramString2));
    s = paramArrayOfByte;
  }
  
  public m$b(UUID paramUUID, String paramString, byte[] paramArrayOfByte)
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

/* Location:
 * Qualified Name:     d0.m.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */