package androidx.core.app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class NotificationChannelGroupCompat$Builder
{
  public final NotificationChannelGroupCompat mGroup;
  
  public NotificationChannelGroupCompat$Builder(@NonNull String paramString)
  {
    mGroup = new NotificationChannelGroupCompat(paramString);
  }
  
  @NonNull
  public NotificationChannelGroupCompat build()
  {
    return mGroup;
  }
  
  @NonNull
  public Builder setDescription(@Nullable String paramString)
  {
    mGroup.mDescription = paramString;
    return this;
  }
  
  @NonNull
  public Builder setName(@Nullable CharSequence paramCharSequence)
  {
    mGroup.mName = paramCharSequence;
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationChannelGroupCompat.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */