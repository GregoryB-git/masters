package h7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import com.google.android.gms.common.internal.f;
import j6.b;
import n6.a;

public final class j
  extends a
{
  public static final Parcelable.Creator<j> CREATOR = new k();
  public final int a;
  public final b b;
  public final f c;
  
  public j(int paramInt, b paramb, f paramf)
  {
    a = paramInt;
    b = paramb;
    c = paramf;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.z(paramParcel, 1, a);
    z.E(paramParcel, 2, b, paramInt, false);
    z.E(paramParcel, 3, c, paramInt, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     h7.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */