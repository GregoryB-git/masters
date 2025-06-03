package T0;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import g0.M;
import java.util.Arrays;

public final class f
  extends i
{
  public static final Parcelable.Creator<f> CREATOR = new a();
  public final String p;
  public final String q;
  public final String r;
  public final byte[] s;
  
  public f(Parcel paramParcel)
  {
    super("GEOB");
    p = ((String)M.i(paramParcel.readString()));
    q = ((String)M.i(paramParcel.readString()));
    r = ((String)M.i(paramParcel.readString()));
    s = ((byte[])M.i(paramParcel.createByteArray()));
  }
  
  public f(String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte)
  {
    super("GEOB");
    p = paramString1;
    q = paramString2;
    r = paramString3;
    s = paramArrayOfByte;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (f.class == paramObject.getClass()))
    {
      paramObject = (f)paramObject;
      if ((!M.c(p, p)) || (!M.c(q, q)) || (!M.c(r, r)) || (!Arrays.equals(s, s))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    String str = p;
    int i = 0;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = q;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = r;
    if (str != null) {
      i = str.hashCode();
    }
    return (((527 + j) * 31 + k) * 31 + i) * 31 + Arrays.hashCode(s);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(o);
    localStringBuilder.append(": mimeType=");
    localStringBuilder.append(p);
    localStringBuilder.append(", filename=");
    localStringBuilder.append(q);
    localStringBuilder.append(", description=");
    localStringBuilder.append(r);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(p);
    paramParcel.writeString(q);
    paramParcel.writeString(r);
    paramParcel.writeByteArray(s);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public f a(Parcel paramParcel)
    {
      return new f(paramParcel);
    }
    
    public f[] b(int paramInt)
    {
      return new f[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     T0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */