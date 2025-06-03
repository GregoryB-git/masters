package u;

import aa.u;
import aa.v;
import aa.w;
import android.app.Notification.Action.Builder;
import android.app.Notification.BubbleMetadata;
import android.app.Notification.Builder;
import android.content.LocusId;

public final class t$g
{
  public static Notification.Builder a(Notification.Builder paramBuilder, boolean paramBoolean)
  {
    return u.a(paramBuilder, paramBoolean);
  }
  
  public static Notification.Builder b(Notification.Builder paramBuilder, Notification.BubbleMetadata paramBubbleMetadata)
  {
    return v.b(paramBuilder, paramBubbleMetadata);
  }
  
  public static Notification.Action.Builder c(Notification.Action.Builder paramBuilder, boolean paramBoolean)
  {
    return w.c(paramBuilder, paramBoolean);
  }
  
  public static Notification.Builder d(Notification.Builder paramBuilder, Object paramObject)
  {
    return v.c(paramBuilder, (LocusId)paramObject);
  }
}

/* Location:
 * Qualified Name:     u.t.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */