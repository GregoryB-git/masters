package j6;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.ObjectWrapper;
import n6.a;

public final class z
  extends a
{
  public static final Parcelable.Creator<z> CREATOR = new a0();
  public final String a;
  public final boolean b;
  public final boolean c;
  public final Context d;
  public final boolean e;
  public final boolean f;
  
  public z(String paramString, boolean paramBoolean1, boolean paramBoolean2, IBinder paramIBinder, boolean paramBoolean3, boolean paramBoolean4)
  {
    a = paramString;
    b = paramBoolean1;
    c = paramBoolean2;
    d = ((Context)ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(paramIBinder)));
    e = paramBoolean3;
    f = paramBoolean4;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = a;
    paramInt = b.z.J(20293, paramParcel);
    b.z.F(paramParcel, 1, str, false);
    b.z.t(paramParcel, 2, b);
    b.z.t(paramParcel, 3, c);
    b.z.y(paramParcel, 4, ObjectWrapper.wrap(d));
    b.z.t(paramParcel, 5, e);
    b.z.t(paramParcel, 6, f);
    b.z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     j6.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */