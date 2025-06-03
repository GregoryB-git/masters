package A2;

import B2.a;
import B2.c;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

public class r
  extends a
{
  @NonNull
  public static final Parcelable.Creator<r> CREATOR = new v();
  public final int o;
  public List p;
  
  public r(int paramInt, List paramList)
  {
    o = paramInt;
    p = paramList;
  }
  
  public final int a()
  {
    return o;
  }
  
  public final List d()
  {
    return p;
  }
  
  public final void f(l paraml)
  {
    if (p == null) {
      p = new ArrayList();
    }
    p.add(paraml);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.i(paramParcel, 1, o);
    c.q(paramParcel, 2, p, false);
    c.b(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     A2.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */