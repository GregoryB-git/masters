package s6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;

public final class b
  extends n6.a
{
  public static final Parcelable.Creator<b> CREATOR = new c();
  public final int a;
  public final a b;
  
  public b(int paramInt, a parama)
  {
    a = paramInt;
    b = parama;
  }
  
  public b(a parama)
  {
    a = 1;
    b = parama;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = a;
    int j = z.J(20293, paramParcel);
    z.z(paramParcel, 1, i);
    z.E(paramParcel, 2, b, paramInt, false);
    z.L(j, paramParcel);
  }
}

/* Location:
 * Qualified Name:     s6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */