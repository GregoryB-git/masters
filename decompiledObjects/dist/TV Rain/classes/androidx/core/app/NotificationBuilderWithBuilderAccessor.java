package androidx.core.app;

import android.app.Notification.Builder;
import androidx.annotation.RestrictTo;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract interface NotificationBuilderWithBuilderAccessor
{
  public abstract Notification.Builder getBuilder();
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationBuilderWithBuilderAccessor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */