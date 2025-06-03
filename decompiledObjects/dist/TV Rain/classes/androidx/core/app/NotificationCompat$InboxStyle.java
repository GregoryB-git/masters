package androidx.core.app;

import android.app.Notification.InboxStyle;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class NotificationCompat$InboxStyle
  extends NotificationCompat.Style
{
  private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$InboxStyle";
  private ArrayList<CharSequence> mTexts = new ArrayList();
  
  public NotificationCompat$InboxStyle() {}
  
  public NotificationCompat$InboxStyle(@Nullable NotificationCompat.Builder paramBuilder)
  {
    setBuilder(paramBuilder);
  }
  
  @NonNull
  public InboxStyle addLine(@Nullable CharSequence paramCharSequence)
  {
    if (paramCharSequence != null) {
      mTexts.add(NotificationCompat.Builder.limitCharSequenceLength(paramCharSequence));
    }
    return this;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void apply(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
  {
    Notification.InboxStyle localInboxStyle = new Notification.InboxStyle(paramNotificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(mBigContentTitle);
    if (mSummaryTextSet) {
      localInboxStyle.setSummaryText(mSummaryText);
    }
    paramNotificationBuilderWithBuilderAccessor = mTexts.iterator();
    while (paramNotificationBuilderWithBuilderAccessor.hasNext()) {
      localInboxStyle.addLine((CharSequence)paramNotificationBuilderWithBuilderAccessor.next());
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void clearCompatExtraKeys(@NonNull Bundle paramBundle)
  {
    super.clearCompatExtraKeys(paramBundle);
    paramBundle.remove("android.textLines");
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public String getClassName()
  {
    return "androidx.core.app.NotificationCompat$InboxStyle";
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void restoreFromCompatExtras(@NonNull Bundle paramBundle)
  {
    super.restoreFromCompatExtras(paramBundle);
    mTexts.clear();
    if (paramBundle.containsKey("android.textLines")) {
      Collections.addAll(mTexts, paramBundle.getCharSequenceArray("android.textLines"));
    }
  }
  
  @NonNull
  public InboxStyle setBigContentTitle(@Nullable CharSequence paramCharSequence)
  {
    mBigContentTitle = NotificationCompat.Builder.limitCharSequenceLength(paramCharSequence);
    return this;
  }
  
  @NonNull
  public InboxStyle setSummaryText(@Nullable CharSequence paramCharSequence)
  {
    mSummaryText = NotificationCompat.Builder.limitCharSequenceLength(paramCharSequence);
    mSummaryTextSet = true;
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationCompat.InboxStyle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */