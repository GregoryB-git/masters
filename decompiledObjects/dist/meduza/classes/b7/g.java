package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import com.google.android.gms.internal.fido.zzch;
import java.util.Arrays;

public final class g
  extends j
{
  public static final Parcelable.Creator<g> CREATOR = new r1();
  public final byte[] a;
  public final byte[] b;
  public final byte[] c;
  public final byte[] d;
  public final byte[] e;
  
  public g(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4, byte[] paramArrayOfByte5)
  {
    m6.j.i(paramArrayOfByte1);
    a = paramArrayOfByte1;
    m6.j.i(paramArrayOfByte2);
    b = paramArrayOfByte2;
    m6.j.i(paramArrayOfByte3);
    c = paramArrayOfByte3;
    m6.j.i(paramArrayOfByte4);
    d = paramArrayOfByte4;
    e = paramArrayOfByte5;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof g)) {
      return false;
    }
    paramObject = (g)paramObject;
    return (Arrays.equals(a, a)) && (Arrays.equals(b, b)) && (Arrays.equals(c, c)) && (Arrays.equals(d, d)) && (Arrays.equals(e, e));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(Arrays.hashCode(a)), Integer.valueOf(Arrays.hashCode(b)), Integer.valueOf(Arrays.hashCode(c)), Integer.valueOf(Arrays.hashCode(d)), Integer.valueOf(Arrays.hashCode(e)) });
  }
  
  public final String toString()
  {
    zzam localzzam = zzan.zza(this);
    Object localObject1 = zzch.zzf();
    Object localObject2 = a;
    localzzam.zzb("keyHandle", ((zzch)localObject1).zzg((byte[])localObject2, 0, localObject2.length));
    localObject1 = zzch.zzf();
    localObject2 = b;
    localzzam.zzb("clientDataJSON", ((zzch)localObject1).zzg((byte[])localObject2, 0, localObject2.length));
    localObject2 = zzch.zzf();
    localObject1 = c;
    localzzam.zzb("authenticatorData", ((zzch)localObject2).zzg((byte[])localObject1, 0, localObject1.length));
    localObject2 = zzch.zzf();
    localObject1 = d;
    localzzam.zzb("signature", ((zzch)localObject2).zzg((byte[])localObject1, 0, localObject1.length));
    localObject2 = e;
    if (localObject2 != null)
    {
      int i = localObject2.length;
      localzzam.zzb("userHandle", zzch.zzf().zzg((byte[])localObject2, 0, i));
    }
    return localzzam.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.w(paramParcel, 2, a, false);
    z.w(paramParcel, 3, b, false);
    z.w(paramParcel, 4, c, false);
    z.w(paramParcel, 5, d, false);
    z.w(paramParcel, 6, e, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b7.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */