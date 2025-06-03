package T0;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import g0.M;
import java.util.Arrays;

public final class m
  extends i
{
  public static final Parcelable.Creator<m> CREATOR = new a();
  public final String p;
  public final byte[] q;
  
  public m(Parcel paramParcel)
  {
    super("PRIV");
    p = ((String)M.i(paramParcel.readString()));
    q = ((byte[])M.i(paramParcel.createByteArray()));
  }
  
  public m(String paramString, byte[] paramArrayOfByte)
  {
    super("PRIV");
    p = paramString;
    q = paramArrayOfByte;
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
      if ((!M.c(p, p)) || (!Arrays.equals(q, q))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    String str = p;
    int i;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    return (527 + i) * 31 + Arrays.hashCode(q);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(o);
    localStringBuilder.append(": owner=");
    localStringBuilder.append(p);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(p);
    paramParcel.writeByteArray(q);
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
}

/* Location:
 * Qualified Name:     T0.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */