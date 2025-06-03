package androidx.core.app;

import android.app.Notification.BigTextStyle;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

public class NotificationCompat$BigTextStyle
  extends NotificationCompat.Style
{
  private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigTextStyle";
  private CharSequence mBigText;
  
  public NotificationCompat$BigTextStyle() {}
  
  public NotificationCompat$BigTextStyle(@Nullable NotificationCompat.Builder paramBuilder)
  {
    setBuilder(paramBuilder);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void addCompatExtras(@NonNull Bundle paramBundle)
  {
    super.addCompatExtras(paramBundle);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void apply(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
  {
    paramNotificationBuilderWithBuilderAccessor = new Notification.BigTextStyle(paramNotificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(mBigContentTitle).bigText(mBigText);
    if (mSummaryTextSet) {
      paramNotificationBuilderWithBuilderAccessor.setSummaryText(mSummaryText);
    }
  }
  
  @NonNull
  public BigTextStyle bigText(@Nullable CharSequence paramCharSequence)
  {
    mBigText = NotificationCompat.Builder.limitCharSequenceLength(paramCharSequence);
    return this;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void clearCompatExtraKeys(@NonNull Bundle paramBundle)
  {
    super.clearCompatExtraKeys(paramBundle);
    paramBundle.remove("android.bigText");
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public String getClassName()
  {
    return "androidx.core.app.NotificationCompat$BigTextStyle";
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void restoreFromCompatExtras(@NonNull Bundle paramBundle)
  {
    super.restoreFromCompatExtras(paramBundle);
    mBigText = paramBundle.getCharSequence("android.bigText");
  }
  
  @NonNull
  public BigTextStyle setBigContentTitle(@Nullable CharSequence paramCharSequence)
  {
    mBigContentTitle = NotificationCompat.Builder.limitCharSequenceLength(paramCharSequence);
    return this;
  }
  
  @NonNull
  public BigTextStyle setSummaryText(@Nullable CharSequence paramCharSequence)
  {
    mSummaryText = NotificationCompat.Builder.limitCharSequenceLength(paramCharSequence);
    mSummaryTextSet = true;
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationCompat.BigTextStyle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */