package t6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import n6.a;

public final class g
  extends a
{
  public static final Parcelable.Creator<g> CREATOR = new e();
  public final int a;
  public final String b;
  public final a.a c;
  
  public g(a.a parama, String paramString)
  {
    a = 1;
    b = paramString;
    c = parama;
  }
  
  public g(a.a parama, String paramString, int paramInt)
  {
    a = paramInt;
    b = paramString;
    c = parama;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = a;
    int j = z.J(20293, paramParcel);
    z.z(paramParcel, 1, i);
    z.F(paramParcel, 2, b, false);
    z.E(paramParcel, 3, c, paramInt, false);
    z.L(j, paramParcel);
  }
}

/* Location:
 * Qualified Name:     t6.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */