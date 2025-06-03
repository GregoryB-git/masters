package b7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import b.z;
import com.google.android.gms.internal.fido.zzao;
import java.util.Arrays;
import m6.j;
import n6.a;

public final class d0
  extends a
{
  public static final Parcelable.Creator<d0> CREATOR = new c1();
  public final a a;
  public final String b;
  
  static
  {
    new d0("supported", null);
    new d0("not-supported", null);
  }
  
  public d0(String paramString1, String paramString2)
  {
    j.i(paramString1);
    try
    {
      arrayOfa = a.values();
      i = arrayOfa.length;
      j = 0;
    }
    catch (b paramString1)
    {
      for (;;)
      {
        a[] arrayOfa;
        int i;
        int j;
        a locala;
        break;
        j++;
        continue;
        paramString2 = new b7/d0$b;
        paramString2.<init>(paramString1);
        throw paramString2;
      }
      throw new IllegalArgumentException(paramString1);
    }
    if (j < i)
    {
      locala = arrayOfa[j];
      if (paramString1.equals(a))
      {
        a = locala;
        b = paramString2;
        return;
      }
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof d0)) {
      return false;
    }
    paramObject = (d0)paramObject;
    return (zzao.zza(a, a)) && (zzao.zza(b, b));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.F(paramParcel, 2, a.a, false);
    z.F(paramParcel, 3, b, false);
    z.L(paramInt, paramParcel);
  }
  
  public static enum a
    implements Parcelable
  {
    public static final Parcelable.Creator<a> CREATOR = new b1();
    public final String a;
    
    public a(String paramString1)
    {
      a = paramString1;
    }
    
    public final int describeContents()
    {
      return 0;
    }
    
    public final String toString()
    {
      return a;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeString(a);
    }
  }
  
  public static final class b
    extends Exception
  {
    public b(String paramString)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     b7.d0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */