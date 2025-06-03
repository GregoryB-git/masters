package b7;

import a0.j;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class o
  implements Parcelable
{
  public static final Parcelable.Creator<o> CREATOR = new x1();
  public final a a;
  
  public o(a parama)
  {
    a = parama;
  }
  
  public static o a(int paramInt)
  {
    b0 localb0;
    Object localObject;
    int i;
    int j;
    if (paramInt == 65274)
    {
      localb0 = b0.b;
    }
    else
    {
      localObject = b0.values();
      i = localObject.length;
      j = 0;
      for (k = 0; k < i; k++)
      {
        localb0 = localObject[k];
        if (a == paramInt) {
          break label85;
        }
      }
      localObject = p.values();
      i = localObject.length;
    }
    for (int k = j; k < i; k++)
    {
      localb0 = localObject[k];
      if (a == paramInt) {
        label85:
        return new o(localb0);
      }
    }
    throw new a(paramInt);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof o)) {
      return false;
    }
    paramObject = (o)paramObject;
    return a.f() == a.f();
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(a.f());
  }
  
  public static final class a
    extends Exception
  {
    public a(int paramInt)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     b7.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */