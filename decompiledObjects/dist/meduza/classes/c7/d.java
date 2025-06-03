package c7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import n6.a;

@Deprecated
public final class d
  extends a
{
  public static final Parcelable.Creator<d> CREATOR = new j();
  public final int a;
  public final c b;
  public final byte[] c;
  public final String d;
  
  public d(int paramInt, String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    a = paramInt;
    try
    {
      b = c.f(paramString1);
      c = paramArrayOfByte;
      d = paramString2;
      return;
    }
    catch (c.a paramString1)
    {
      throw new IllegalArgumentException(paramString1);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof d)) {
      return false;
    }
    Object localObject = (d)paramObject;
    if (!Arrays.equals(c, c)) {
      return false;
    }
    if (b != b) {
      return false;
    }
    paramObject = d;
    localObject = d;
    if (paramObject == null)
    {
      if (localObject != null) {
        return false;
      }
    }
    else if (!((String)paramObject).equals(localObject)) {
      return false;
    }
    return true;
  }
  
  public final int hashCode()
  {
    int i = Arrays.hashCode(c);
    int j = b.hashCode();
    String str = d;
    int k;
    if (str == null) {
      k = 0;
    } else {
      k = str.hashCode();
    }
    return ((i + 31) * 31 + j) * 31 + k;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.z(paramParcel, 1, a);
    z.F(paramParcel, 2, b.a, false);
    z.w(paramParcel, 3, c, false);
    z.F(paramParcel, 4, d, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     c7.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */