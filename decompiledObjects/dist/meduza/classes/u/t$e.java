package u;

import android.app.Notification.Builder;
import android.content.Context;
import c0.b;
import com.google.android.gms.internal.base.a;
import d2.e;

public final class t$e
{
  public static Notification.Builder a(Context paramContext, String paramString)
  {
    return new Notification.Builder(paramContext, paramString);
  }
  
  public static Notification.Builder b(Notification.Builder paramBuilder, int paramInt)
  {
    return a.e(paramBuilder, paramInt);
  }
  
  public static Notification.Builder c(Notification.Builder paramBuilder, boolean paramBoolean)
  {
    return e.d(paramBuilder, paramBoolean);
  }
  
  public static Notification.Builder d(Notification.Builder paramBuilder, int paramInt)
  {
    return e.c(paramBuilder, paramInt);
  }
  
  public static Notification.Builder e(Notification.Builder paramBuilder, CharSequence paramCharSequence)
  {
    return b.d(paramBuilder, paramCharSequence);
  }
  
  public static Notification.Builder f(Notification.Builder paramBuilder, String paramString)
  {
    return a.f(paramBuilder, paramString);
  }
  
  public static Notification.Builder g(Notification.Builder paramBuilder, long paramLong)
  {
    return b.c(paramBuilder, paramLong);
  }
}

/* Location:
 * Qualified Name:     u.t.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */