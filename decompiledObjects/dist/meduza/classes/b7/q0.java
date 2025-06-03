package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import m6.j;
import n6.a;

public final class q0
  extends a
{
  public static final Parcelable.Creator<q0> CREATOR = new r0();
  public final byte[][] a;
  
  public q0(byte[][] paramArrayOfByte)
  {
    boolean bool;
    if (paramArrayOfByte != null) {
      bool = true;
    } else {
      bool = false;
    }
    j.b(bool);
    if (1 != (paramArrayOfByte.length & 0x1 ^ 0x1)) {
      bool = false;
    } else {
      bool = true;
    }
    j.b(bool);
    for (int i = 0; i < paramArrayOfByte.length; i += 2)
    {
      if ((i != 0) && (paramArrayOfByte[i] == null)) {
        bool = false;
      } else {
        bool = true;
      }
      j.b(bool);
      int j = i + 1;
      if (paramArrayOfByte[j] != null) {
        bool = true;
      } else {
        bool = false;
      }
      j.b(bool);
      j = paramArrayOfByte[j].length;
      if ((j != 32) && (j != 64)) {
        bool = false;
      } else {
        bool = true;
      }
      j.b(bool);
    }
    a = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof q0)) {
      return false;
    }
    paramObject = (q0)paramObject;
    return Arrays.deepEquals(a, a);
  }
  
  public final int hashCode()
  {
    byte[][] arrayOfByte = a;
    int i = arrayOfByte.length;
    int j = 0;
    int k = j;
    while (j < i)
    {
      k ^= Arrays.hashCode(new Object[] { arrayOfByte[j] });
      j++;
    }
    return k;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    byte[][] arrayOfByte = a;
    paramInt = 0;
    if (arrayOfByte != null)
    {
      int j = z.J(1, paramParcel);
      int k = arrayOfByte.length;
      paramParcel.writeInt(k);
      while (paramInt < k)
      {
        paramParcel.writeByteArray(arrayOfByte[paramInt]);
        paramInt++;
      }
      z.L(j, paramParcel);
    }
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b7.q0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */