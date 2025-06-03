package S0;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import d0.w.b;
import d0.x.b;
import g0.a;
import java.util.Arrays;

public final class c
  implements x.b
{
  public static final Parcelable.Creator<c> CREATOR = new a();
  public final byte[] o;
  public final String p;
  public final String q;
  
  public c(Parcel paramParcel)
  {
    o = ((byte[])a.e(paramParcel.createByteArray()));
    p = paramParcel.readString();
    q = paramParcel.readString();
  }
  
  public c(byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    o = paramArrayOfByte;
    p = paramString1;
    q = paramString2;
  }
  
  public void D(w.b paramb)
  {
    String str = p;
    if (str != null) {
      paramb.n0(str);
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (c.class == paramObject.getClass()))
    {
      paramObject = (c)paramObject;
      return Arrays.equals(o, o);
    }
    return false;
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(o);
  }
  
  public String toString()
  {
    return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", new Object[] { p, q, Integer.valueOf(o.length) });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeByteArray(o);
    paramParcel.writeString(p);
    paramParcel.writeString(q);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public c a(Parcel paramParcel)
    {
      return new c(paramParcel);
    }
    
    public c[] b(int paramInt)
    {
      return new c[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     S0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */