package x1;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class F$f
  implements Parcelable
{
  @NotNull
  public static final Parcelable.Creator<f> CREATOR = new a();
  public static final b q = new b(null);
  public final String o;
  public final Parcelable p;
  
  public F$f(Parcel paramParcel)
  {
    o = paramParcel.readString();
    p = paramParcel.readParcelable(B.l().getClassLoader());
  }
  
  public F$f(Parcelable paramParcelable, String paramString)
  {
    o = paramString;
    p = paramParcelable;
  }
  
  public final String a()
  {
    return o;
  }
  
  public final Parcelable b()
  {
    return p;
  }
  
  public int describeContents()
  {
    return 1;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "out");
    paramParcel.writeString(o);
    paramParcel.writeParcelable(p, paramInt);
  }
  
  public static final class a
    implements Parcelable.Creator
  {
    public F.f a(Parcel paramParcel)
    {
      Intrinsics.checkNotNullParameter(paramParcel, "source");
      return new F.f(paramParcel, null);
    }
    
    public F.f[] b(int paramInt)
    {
      return new F.f[paramInt];
    }
  }
  
  public static final class b {}
}

/* Location:
 * Qualified Name:     x1.F.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */