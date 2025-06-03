package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import com.google.android.gms.internal.fido.zzch;
import java.util.Arrays;

public final class h
  extends j
{
  public static final Parcelable.Creator<h> CREATOR = new s1();
  public final byte[] a;
  public final byte[] b;
  public final byte[] c;
  public final String[] d;
  
  public h(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, String[] paramArrayOfString)
  {
    m6.j.i(paramArrayOfByte1);
    a = paramArrayOfByte1;
    m6.j.i(paramArrayOfByte2);
    b = paramArrayOfByte2;
    m6.j.i(paramArrayOfByte3);
    c = paramArrayOfByte3;
    m6.j.i(paramArrayOfString);
    d = paramArrayOfString;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof h)) {
      return false;
    }
    paramObject = (h)paramObject;
    return (Arrays.equals(a, a)) && (Arrays.equals(b, b)) && (Arrays.equals(c, c));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(Arrays.hashCode(a)), Integer.valueOf(Arrays.hashCode(b)), Integer.valueOf(Arrays.hashCode(c)) });
  }
  
  public final String toString()
  {
    zzam localzzam = zzan.zza(this);
    zzch localzzch = zzch.zzf();
    byte[] arrayOfByte = a;
    localzzam.zzb("keyHandle", localzzch.zzg(arrayOfByte, 0, arrayOfByte.length));
    localzzch = zzch.zzf();
    arrayOfByte = b;
    localzzam.zzb("clientDataJSON", localzzch.zzg(arrayOfByte, 0, arrayOfByte.length));
    localzzch = zzch.zzf();
    arrayOfByte = c;
    localzzam.zzb("attestationObject", localzzch.zzg(arrayOfByte, 0, arrayOfByte.length));
    localzzam.zzb("transports", Arrays.toString(d));
    return localzzam.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.w(paramParcel, 2, a, false);
    z.w(paramParcel, 3, b, false);
    z.w(paramParcel, 4, c, false);
    String[] arrayOfString = d;
    if (arrayOfString != null)
    {
      paramInt = z.J(5, paramParcel);
      paramParcel.writeStringArray(arrayOfString);
      z.L(paramInt, paramParcel);
    }
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b7.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */