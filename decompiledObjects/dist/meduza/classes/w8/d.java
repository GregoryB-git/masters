package w8;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.ArrayList;
import java.util.List;
import n6.a;

public final class d
  extends a
  implements v8.d
{
  public static final Parcelable.Creator<d> CREATOR = new e();
  public final Uri a;
  public final Uri b;
  public final List<a> c;
  
  public d(Uri paramUri1, Uri paramUri2, ArrayList paramArrayList)
  {
    a = paramUri1;
    b = paramUri2;
    paramUri1 = paramArrayList;
    if (paramArrayList == null) {
      paramUri1 = new ArrayList();
    }
    c = paramUri1;
  }
  
  public final Uri p()
  {
    return b;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.E(paramParcel, 1, a, paramInt, false);
    z.E(paramParcel, 2, b, paramInt, false);
    z.I(paramParcel, 3, c, false);
    z.L(i, paramParcel);
  }
  
  public final List<a> x()
  {
    return c;
  }
  
  public final Uri y()
  {
    return a;
  }
  
  public static final class a
    extends a
    implements v8.d.a
  {
    public static final Parcelable.Creator<a> CREATOR = new f();
    public final String a;
    
    public a(String paramString)
    {
      a = paramString;
    }
    
    public final String i()
    {
      return a;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramInt = z.J(20293, paramParcel);
      z.F(paramParcel, 2, a, false);
      z.L(paramInt, paramParcel);
    }
  }
}

/* Location:
 * Qualified Name:     w8.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */