package d6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import m6.j;
import n6.a;

@Deprecated
public final class b$c
  extends a
{
  public static final Parcelable.Creator<c> CREATOR = new w();
  public final boolean a;
  public final byte[] b;
  public final String c;
  
  public b$c(boolean paramBoolean, byte[] paramArrayOfByte, String paramString)
  {
    if (paramBoolean)
    {
      j.i(paramArrayOfByte);
      j.i(paramString);
    }
    a = paramBoolean;
    b = paramArrayOfByte;
    c = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof c)) {
      return false;
    }
    Object localObject = (c)paramObject;
    if ((a == a) && (Arrays.equals(b, b)))
    {
      paramObject = c;
      localObject = c;
      if ((paramObject == localObject) || ((paramObject != null) && (paramObject.equals(localObject)))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = Arrays.hashCode(new Object[] { Boolean.valueOf(a), c });
    return Arrays.hashCode(b) + i * 31;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.t(paramParcel, 1, a);
    z.w(paramParcel, 2, b, false);
    z.F(paramParcel, 3, c, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     d6.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */