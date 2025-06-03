package c7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import b.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import n6.a;

@Deprecated
public final class b
  extends a
{
  public static final Parcelable.Creator<b> CREATOR = new h();
  public final int a;
  public final byte[] b;
  public final c c;
  public final List d;
  
  public b(int paramInt, String paramString, ArrayList paramArrayList, byte[] paramArrayOfByte)
  {
    a = paramInt;
    b = paramArrayOfByte;
    try
    {
      c = c.f(paramString);
      d = paramArrayList;
      return;
    }
    catch (c.a paramString)
    {
      throw new IllegalArgumentException(paramString);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    b localb = (b)paramObject;
    if (!Arrays.equals(b, b)) {
      return false;
    }
    if (!c.equals(c)) {
      return false;
    }
    paramObject = d;
    if ((paramObject == null) && (d == null)) {
      return true;
    }
    if (paramObject != null)
    {
      List localList = d;
      if ((localList != null) && (((List)paramObject).containsAll(localList)) && (d.containsAll(d))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(Arrays.hashCode(b)), c, d });
  }
  
  public final String toString()
  {
    Object localObject1 = d;
    if (localObject1 == null) {
      localObject1 = "null";
    } else {
      localObject1 = localObject1.toString();
    }
    Object localObject2 = b;
    if (localObject2 == null) {
      localObject2 = null;
    } else {
      localObject2 = Base64.encodeToString((byte[])localObject2, 0);
    }
    return String.format("{keyHandle: %s, version: %s, transports: %s}", new Object[] { localObject2, c, localObject1 });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.z(paramParcel, 1, a);
    z.w(paramParcel, 2, b, false);
    z.F(paramParcel, 3, c.a, false);
    z.I(paramParcel, 4, d, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     c7.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */