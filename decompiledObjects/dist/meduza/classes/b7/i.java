package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import java.util.Arrays;
import m6.h;

public final class i
  extends j
{
  public static final Parcelable.Creator<i> CREATOR = new t1();
  public final q a;
  public final String b;
  public final int c;
  
  public i(int paramInt1, String paramString, int paramInt2)
  {
    try
    {
      arrayOfq = q.values();
      i = arrayOfq.length;
      j = 0;
    }
    catch (q.a paramString)
    {
      for (;;)
      {
        q[] arrayOfq;
        int i;
        int j;
        q localq;
        break;
        j++;
        continue;
        paramString = new b7/q$a;
        paramString.<init>(paramInt1);
        throw paramString;
      }
      throw new IllegalArgumentException(paramString);
    }
    if (j < i)
    {
      localq = arrayOfq[j];
      if (paramInt1 == a)
      {
        a = localq;
        b = paramString;
        c = paramInt2;
        return;
      }
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof i)) {
      return false;
    }
    paramObject = (i)paramObject;
    return (h.a(a, a)) && (h.a(b, b)) && (h.a(Integer.valueOf(c), Integer.valueOf(c)));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b, Integer.valueOf(c) });
  }
  
  public final String toString()
  {
    zzam localzzam = zzan.zza(this);
    localzzam.zza("errorCode", a.a);
    String str = b;
    if (str != null) {
      localzzam.zzb("errorMessage", str);
    }
    return localzzam.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.z(paramParcel, 2, a.a);
    z.F(paramParcel, 3, b, false);
    z.z(paramParcel, 4, c);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b7.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */