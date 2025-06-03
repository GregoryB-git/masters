package Y1;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x1.a;
import x1.h;

public class n
  extends A
{
  @NotNull
  public static final Parcelable.Creator<n> CREATOR = new a();
  public static final b s = new b(null);
  public static ScheduledThreadPoolExecutor t;
  public final String r = "device_auth";
  
  public n(u paramu)
  {
    super(paramu);
  }
  
  public n(Parcel paramParcel)
  {
    super(paramParcel);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String f()
  {
    return r;
  }
  
  public int o(u.e parame)
  {
    Intrinsics.checkNotNullParameter(parame, "request");
    w(parame);
    return 1;
  }
  
  public m r()
  {
    return new m();
  }
  
  public void t()
  {
    u.f localf = u.f.w.a(d().o(), "User canceled log in.");
    d().g(localf);
  }
  
  public void u(Exception paramException)
  {
    Intrinsics.checkNotNullParameter(paramException, "ex");
    paramException = u.f.c.d(u.f.w, d().o(), null, paramException.getMessage(), null, 8, null);
    d().g(paramException);
  }
  
  public void v(String paramString1, String paramString2, String paramString3, Collection paramCollection1, Collection paramCollection2, Collection paramCollection3, h paramh, Date paramDate1, Date paramDate2, Date paramDate3)
  {
    Intrinsics.checkNotNullParameter(paramString1, "accessToken");
    Intrinsics.checkNotNullParameter(paramString2, "applicationId");
    Intrinsics.checkNotNullParameter(paramString3, "userId");
    paramString1 = new a(paramString1, paramString2, paramString3, paramCollection1, paramCollection2, paramCollection3, paramh, paramDate1, paramDate2, paramDate3, null, 1024, null);
    paramString1 = u.f.w.e(d().o(), paramString1);
    d().g(paramString1);
  }
  
  public final void w(u.e parame)
  {
    e locale = d().i();
    if ((locale != null) && (!locale.isFinishing()))
    {
      m localm = r();
      localm.T1(locale.n(), "login_with_facebook");
      localm.v2(parame);
    }
  }
  
  public static final class a
    implements Parcelable.Creator
  {
    public n a(Parcel paramParcel)
    {
      Intrinsics.checkNotNullParameter(paramParcel, "source");
      return new n(paramParcel);
    }
    
    public n[] b(int paramInt)
    {
      return new n[paramInt];
    }
  }
  
  public static final class b
  {
    public final ScheduledThreadPoolExecutor a()
    {
      try
      {
        if (n.p() == null)
        {
          ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor1 = new java/util/concurrent/ScheduledThreadPoolExecutor;
          localScheduledThreadPoolExecutor1.<init>(1);
          n.q(localScheduledThreadPoolExecutor1);
        }
      }
      finally
      {
        break label47;
      }
      ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor2 = n.p();
      if (localScheduledThreadPoolExecutor2 != null) {
        return localScheduledThreadPoolExecutor2;
      }
      Intrinsics.n("backgroundExecutor");
      throw null;
      label47:
      throw localScheduledThreadPoolExecutor2;
    }
  }
}

/* Location:
 * Qualified Name:     Y1.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */