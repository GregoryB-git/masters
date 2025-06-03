package a4;

import a0.j;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.UUID;
import v3.h;
import v5.e0;

public final class d$b
  implements Parcelable
{
  public static final Parcelable.Creator<b> CREATOR = new a();
  public int a;
  public final UUID b;
  public final String c;
  public final String d;
  public final byte[] e;
  
  public d$b() {}
  
  public d$b(Parcel paramParcel)
  {
    b = new UUID(paramParcel.readLong(), paramParcel.readLong());
    c = paramParcel.readString();
    String str = paramParcel.readString();
    int i = e0.a;
    d = str;
    e = paramParcel.createByteArray();
  }
  
  public d$b(UUID paramUUID, String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    paramUUID.getClass();
    b = paramUUID;
    c = paramString1;
    paramString2.getClass();
    d = paramString2;
    e = paramArrayOfByte;
  }
  
  public final boolean a(UUID paramUUID)
  {
    boolean bool;
    if ((!h.a.equals(b)) && (!paramUUID.equals(b))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
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
    if (e0.a(c, c))
    {
      bool1 = bool2;
      if (e0.a(d, d))
      {
        bool1 = bool2;
        if (e0.a(b, b))
        {
          bool1 = bool2;
          if (Arrays.equals(e, e)) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public final int hashCode()
  {
    if (a == 0)
    {
      int i = b.hashCode();
      String str = c;
      if (str == null) {
        j = 0;
      } else {
        j = str.hashCode();
      }
      int j = j.e(d, (i * 31 + j) * 31, 31);
      a = (Arrays.hashCode(e) + j);
    }
    return a;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(b.getMostSignificantBits());
    paramParcel.writeLong(b.getLeastSignificantBits());
    paramParcel.writeString(c);
    paramParcel.writeString(d);
    paramParcel.writeByteArray(e);
  }
  
  public final class a
    implements Parcelable.Creator<d.b>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new d.b(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new d.b[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     a4.d.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */