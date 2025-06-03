package Y1;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import org.jetbrains.annotations.NotNull;

public final class m$c
  implements Parcelable
{
  @NotNull
  public static final Parcelable.Creator<c> CREATOR = new a();
  public static final b t = new b(null);
  public String o;
  public String p;
  public String q;
  public long r;
  public long s;
  
  public m$c() {}
  
  public m$c(Parcel paramParcel)
  {
    o = paramParcel.readString();
    p = paramParcel.readString();
    q = paramParcel.readString();
    r = paramParcel.readLong();
    s = paramParcel.readLong();
  }
  
  public final String a()
  {
    return o;
  }
  
  public final long b()
  {
    return r;
  }
  
  public final String c()
  {
    return q;
  }
  
  public final String d()
  {
    return p;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final void e(long paramLong)
  {
    r = paramLong;
  }
  
  public final void f(long paramLong)
  {
    s = paramLong;
  }
  
  public final void g(String paramString)
  {
    q = paramString;
  }
  
  public final void h(String paramString)
  {
    p = paramString;
    x localx = x.a;
    paramString = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[] { paramString }, 1));
    Intrinsics.checkNotNullExpressionValue(paramString, "java.lang.String.format(locale, format, *args)");
    o = paramString;
  }
  
  public final boolean i()
  {
    long l = s;
    boolean bool = false;
    if (l == 0L) {
      return false;
    }
    if (new Date().getTime() - s - r * 1000L < 0L) {
      bool = true;
    }
    return bool;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "dest");
    paramParcel.writeString(o);
    paramParcel.writeString(p);
    paramParcel.writeString(q);
    paramParcel.writeLong(r);
    paramParcel.writeLong(s);
  }
  
  public static final class a
    implements Parcelable.Creator
  {
    public m.c a(Parcel paramParcel)
    {
      Intrinsics.checkNotNullParameter(paramParcel, "parcel");
      return new m.c(paramParcel);
    }
    
    public m.c[] b(int paramInt)
    {
      return new m.c[paramInt];
    }
  }
  
  public static final class b {}
}

/* Location:
 * Qualified Name:     Y1.m.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */