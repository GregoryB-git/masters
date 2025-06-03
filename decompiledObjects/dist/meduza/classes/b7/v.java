package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.fido.zzbc;
import com.google.android.gms.internal.fido.zzh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import m6.j;
import n6.a;

public final class v
  extends a
{
  public static final Parcelable.Creator<v> CREATOR = new u0();
  public final z a;
  public final byte[] b;
  public final List c;
  
  static
  {
    zzbc.zzk(zzh.zza, zzh.zzb);
  }
  
  public v(String paramString, byte[] paramArrayOfByte, ArrayList paramArrayList)
  {
    j.i(paramString);
    try
    {
      a = z.f(paramString);
      j.i(paramArrayOfByte);
      b = paramArrayOfByte;
      c = paramArrayList;
      return;
    }
    catch (z.a paramString)
    {
      throw new IllegalArgumentException(paramString);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof v)) {
      return false;
    }
    v localv = (v)paramObject;
    if (!a.equals(a)) {
      return false;
    }
    if (!Arrays.equals(b, b)) {
      return false;
    }
    List localList = c;
    if ((localList == null) && (c == null)) {
      return true;
    }
    if (localList != null)
    {
      paramObject = c;
      if ((paramObject != null) && (localList.containsAll((Collection)paramObject)) && (c.containsAll(c))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, Integer.valueOf(Arrays.hashCode(b)), c });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = b.z.J(20293, paramParcel);
    a.getClass();
    b.z.F(paramParcel, 2, "public-key", false);
    b.z.w(paramParcel, 3, b, false);
    b.z.I(paramParcel, 4, c, false);
    b.z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b7.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */