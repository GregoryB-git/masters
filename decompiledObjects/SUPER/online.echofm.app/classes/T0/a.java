package T0;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import d0.w.b;
import g0.M;
import java.util.Arrays;

public final class a
  extends i
{
  public static final Parcelable.Creator<a> CREATOR = new a();
  public final String p;
  public final String q;
  public final int r;
  public final byte[] s;
  
  public a(Parcel paramParcel)
  {
    super("APIC");
    p = ((String)M.i(paramParcel.readString()));
    q = paramParcel.readString();
    r = paramParcel.readInt();
    s = ((byte[])M.i(paramParcel.createByteArray()));
  }
  
  public a(String paramString1, String paramString2, int paramInt, byte[] paramArrayOfByte)
  {
    super("APIC");
    p = paramString1;
    q = paramString2;
    r = paramInt;
    s = paramArrayOfByte;
  }
  
  public void D(w.b paramb)
  {
    paramb.J(s, r);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (a.class == paramObject.getClass()))
    {
      paramObject = (a)paramObject;
      if ((r != r) || (!M.c(p, p)) || (!M.c(q, q)) || (!Arrays.equals(s, s))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = r;
    String str = p;
    int j = 0;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = q;
    if (str != null) {
      j = str.hashCode();
    }
    return (((527 + i) * 31 + k) * 31 + j) * 31 + Arrays.hashCode(s);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(o);
    localStringBuilder.append(": mimeType=");
    localStringBuilder.append(p);
    localStringBuilder.append(", description=");
    localStringBuilder.append(q);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(p);
    paramParcel.writeString(q);
    paramParcel.writeInt(r);
    paramParcel.writeByteArray(s);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public a a(Parcel paramParcel)
    {
      return new a(paramParcel);
    }
    
    public a[] b(int paramInt)
    {
      return new a[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     T0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */