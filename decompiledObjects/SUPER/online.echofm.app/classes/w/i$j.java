package w;

import android.app.Notification.Action.Builder;
import android.app.Notification.BubbleMetadata;
import android.app.Notification.Builder;
import android.content.LocusId;

public abstract class i$j
{
  public static Notification.Builder a(Notification.Builder paramBuilder, boolean paramBoolean)
  {
    return paramBuilder.setAllowSystemGeneratedContextualActions(paramBoolean);
  }
  
  public static Notification.Builder b(Notification.Builder paramBuilder, Notification.BubbleMetadata paramBubbleMetadata)
  {
    return paramBuilder.setBubbleMetadata(paramBubbleMetadata);
  }
  
  public static Notification.Action.Builder c(Notification.Action.Builder paramBuilder, boolean paramBoolean)
  {
    return paramBuilder.setContextual(paramBoolean);
  }
  
  public static Notification.Builder d(Notification.Builder paramBuilder, Object paramObject)
  {
    return paramBuilder.setLocusId((LocusId)paramObject);
  }
}

/* Location:
 * Qualified Name:     w.i.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */