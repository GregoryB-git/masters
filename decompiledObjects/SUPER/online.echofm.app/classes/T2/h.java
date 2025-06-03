package T2;

import B2.a;
import B2.c;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

public final class h
  extends a
{
  public static final Parcelable.Creator<h> CREATOR = new i();
  public final List o;
  public final String p;
  
  public h(List paramList, String paramString)
  {
    o = paramList;
    p = paramString;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.o(paramParcel, 1, o, false);
    c.n(paramParcel, 2, p, false);
    c.b(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     T2.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */