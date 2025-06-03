package A2;

import B2.a;
import B2.c;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import x2.b;

public final class I
  extends a
{
  public static final Parcelable.Creator<I> CREATOR = new J();
  public final int o;
  public final IBinder p;
  public final b q;
  public final boolean r;
  public final boolean s;
  
  public I(int paramInt, IBinder paramIBinder, b paramb, boolean paramBoolean1, boolean paramBoolean2)
  {
    o = paramInt;
    p = paramIBinder;
    q = paramb;
    r = paramBoolean1;
    s = paramBoolean2;
  }
  
  public final b a()
  {
    return q;
  }
  
  public final i d()
  {
    IBinder localIBinder = p;
    if (localIBinder == null) {
      return null;
    }
    return i.a.o(localIBinder);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof I)) {
      return false;
    }
    paramObject = (I)paramObject;
    return (q.equals(q)) && (m.a(d(), ((I)paramObject).d()));
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.i(paramParcel, 1, o);
    c.h(paramParcel, 2, p, false);
    c.m(paramParcel, 3, q, paramInt, false);
    c.c(paramParcel, 4, r);
    c.c(paramParcel, 5, s);
    c.b(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     A2.I
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */