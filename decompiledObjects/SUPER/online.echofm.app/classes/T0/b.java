package T0;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import g0.M;
import java.util.Arrays;

public final class b
  extends i
{
  public static final Parcelable.Creator<b> CREATOR = new a();
  public final byte[] p;
  
  public b(Parcel paramParcel)
  {
    super((String)M.i(paramParcel.readString()));
    p = ((byte[])M.i(paramParcel.createByteArray()));
  }
  
  public b(String paramString, byte[] paramArrayOfByte)
  {
    super(paramString);
    p = paramArrayOfByte;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (b.class == paramObject.getClass()))
    {
      paramObject = (b)paramObject;
      if ((!o.equals(o)) || (!Arrays.equals(p, p))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return (527 + o.hashCode()) * 31 + Arrays.hashCode(p);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(o);
    paramParcel.writeByteArray(p);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public b a(Parcel paramParcel)
    {
      return new b(paramParcel);
    }
    
    public b[] b(int paramInt)
    {
      return new b[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     T0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */