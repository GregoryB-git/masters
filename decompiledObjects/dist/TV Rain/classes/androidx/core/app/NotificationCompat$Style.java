package androidx.core.app;

import android.app.Notification;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.Notification.DecoratedCustomViewStyle;
import android.app.Notification.InboxStyle;
import android.app.Notification.MessagingStyle;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.R.dimen;
import androidx.core.R.drawable;
import androidx.core.R.id;
import androidx.core.R.integer;
import androidx.core.R.string;
import androidx.core.graphics.drawable.IconCompat;
import java.text.NumberFormat;

public abstract class NotificationCompat$Style
{
  public CharSequence mBigContentTitle;
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public NotificationCompat.Builder mBuilder;
  public CharSequence mSummaryText;
  public boolean mSummaryTextSet = false;
  
  private int calculateTopPadding()
  {
    Resources localResources = mBuilder.mContext.getResources();
    int i = localResources.getDimensionPixelSize(R.dimen.notification_top_pad);
    int j = localResources.getDimensionPixelSize(R.dimen.notification_top_pad_large_text);
    float f1 = (constrain(getConfigurationfontScale, 1.0F, 1.3F) - 1.0F) / 0.29999995F;
    float f2 = i;
    return Math.round(f1 * j + (1.0F - f1) * f2);
  }
  
  private static float constrain(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 >= paramFloat2)
    {
      paramFloat2 = paramFloat1;
      if (paramFloat1 > paramFloat3) {
        paramFloat2 = paramFloat3;
      }
    }
    return paramFloat2;
  }
  
  @Nullable
  public static Style constructCompatStyleByName(@Nullable String paramString)
  {
    if (paramString != null)
    {
      int i = -1;
      switch (paramString.hashCode())
      {
      default: 
        break;
      case 2090799565: 
        if (paramString.equals("androidx.core.app.NotificationCompat$MessagingStyle")) {
          i = 4;
        }
        break;
      case 919595044: 
        if (paramString.equals("androidx.core.app.NotificationCompat$BigTextStyle")) {
          i = 3;
        }
        break;
      case 912942987: 
        if (paramString.equals("androidx.core.app.NotificationCompat$InboxStyle")) {
          i = 2;
        }
        break;
      case -171946061: 
        if (paramString.equals("androidx.core.app.NotificationCompat$BigPictureStyle")) {
          i = 1;
        }
        break;
      case -716705180: 
        if (paramString.equals("androidx.core.app.NotificationCompat$DecoratedCustomViewStyle")) {
          i = 0;
        }
        break;
      }
      switch (i)
      {
      default: 
        break;
      case 4: 
        return new NotificationCompat.MessagingStyle();
      case 3: 
        return new NotificationCompat.BigTextStyle();
      case 2: 
        return new NotificationCompat.InboxStyle();
      case 1: 
        return new NotificationCompat.BigPictureStyle();
      case 0: 
        return new NotificationCompat.DecoratedCustomViewStyle();
      }
    }
    return null;
  }
  
  @Nullable
  private static Style constructCompatStyleByPlatformName(@Nullable String paramString)
  {
    if (paramString == null) {
      return null;
    }
    if (paramString.equals(Notification.BigPictureStyle.class.getName())) {
      return new NotificationCompat.BigPictureStyle();
    }
    if (paramString.equals(Notification.BigTextStyle.class.getName())) {
      return new NotificationCompat.BigTextStyle();
    }
    if (paramString.equals(Notification.InboxStyle.class.getName())) {
      return new NotificationCompat.InboxStyle();
    }
    if (paramString.equals(Notification.MessagingStyle.class.getName())) {
      return new NotificationCompat.MessagingStyle();
    }
    if (paramString.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
      return new NotificationCompat.DecoratedCustomViewStyle();
    }
    return null;
  }
  
  @Nullable
  public static Style constructCompatStyleForBundle(@NonNull Bundle paramBundle)
  {
    Style localStyle = constructCompatStyleByName(paramBundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
    if (localStyle != null) {
      return localStyle;
    }
    if ((!paramBundle.containsKey("android.selfDisplayName")) && (!paramBundle.containsKey("android.messagingStyleUser")))
    {
      if ((!paramBundle.containsKey("android.picture")) && (!paramBundle.containsKey("android.pictureIcon")))
      {
        if (paramBundle.containsKey("android.bigText")) {
          return new NotificationCompat.BigTextStyle();
        }
        if (paramBundle.containsKey("android.textLines")) {
          return new NotificationCompat.InboxStyle();
        }
        return constructCompatStyleByPlatformName(paramBundle.getString("android.template"));
      }
      return new NotificationCompat.BigPictureStyle();
    }
    return new NotificationCompat.MessagingStyle();
  }
  
  @Nullable
  public static Style constructStyleForExtras(@NonNull Bundle paramBundle)
  {
    Style localStyle = constructCompatStyleForBundle(paramBundle);
    if (localStyle == null) {
      return null;
    }
    try
    {
      localStyle.restoreFromCompatExtras(paramBundle);
      return localStyle;
    }
    catch (ClassCastException paramBundle) {}
    return null;
  }
  
  private Bitmap createColoredBitmap(int paramInt1, int paramInt2, int paramInt3)
  {
    return createColoredBitmap(IconCompat.createWithResource(mBuilder.mContext, paramInt1), paramInt2, paramInt3);
  }
  
  private Bitmap createColoredBitmap(@NonNull IconCompat paramIconCompat, int paramInt1, int paramInt2)
  {
    Drawable localDrawable = paramIconCompat.loadDrawable(mBuilder.mContext);
    int i;
    if (paramInt2 == 0) {
      i = localDrawable.getIntrinsicWidth();
    } else {
      i = paramInt2;
    }
    int j = paramInt2;
    if (paramInt2 == 0) {
      j = localDrawable.getIntrinsicHeight();
    }
    paramIconCompat = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
    localDrawable.setBounds(0, 0, i, j);
    if (paramInt1 != 0) {
      localDrawable.mutate().setColorFilter(new PorterDuffColorFilter(paramInt1, PorterDuff.Mode.SRC_IN));
    }
    localDrawable.draw(new Canvas(paramIconCompat));
    return paramIconCompat;
  }
  
  private Bitmap createIconWithBackground(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = R.drawable.notification_icon_background;
    int j = paramInt4;
    if (paramInt4 == 0) {
      j = 0;
    }
    Bitmap localBitmap = createColoredBitmap(i, j, paramInt2);
    Canvas localCanvas = new Canvas(localBitmap);
    Drawable localDrawable = mBuilder.mContext.getResources().getDrawable(paramInt1).mutate();
    localDrawable.setFilterBitmap(true);
    paramInt1 = (paramInt2 - paramInt3) / 2;
    paramInt2 = paramInt3 + paramInt1;
    localDrawable.setBounds(paramInt1, paramInt1, paramInt2, paramInt2);
    localDrawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
    localDrawable.draw(localCanvas);
    return localBitmap;
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static Style extractStyleFromNotification(@NonNull Notification paramNotification)
  {
    paramNotification = NotificationCompat.getExtras(paramNotification);
    if (paramNotification == null) {
      return null;
    }
    return constructStyleForExtras(paramNotification);
  }
  
  private void hideNormalContent(RemoteViews paramRemoteViews)
  {
    paramRemoteViews.setViewVisibility(R.id.title, 8);
    paramRemoteViews.setViewVisibility(R.id.text2, 8);
    paramRemoteViews.setViewVisibility(R.id.text, 8);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void addCompatExtras(@NonNull Bundle paramBundle)
  {
    if (mSummaryTextSet) {
      paramBundle.putCharSequence("android.summaryText", mSummaryText);
    }
    Object localObject = mBigContentTitle;
    if (localObject != null) {
      paramBundle.putCharSequence("android.title.big", (CharSequence)localObject);
    }
    localObject = getClassName();
    if (localObject != null) {
      paramBundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", (String)localObject);
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void apply(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor) {}
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public RemoteViews applyStandardTemplate(boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    Resources localResources = mBuilder.mContext.getResources();
    RemoteViews localRemoteViews = new RemoteViews(mBuilder.mContext.getPackageName(), paramInt);
    mBuilder.getPriority();
    Object localObject1 = mBuilder;
    Object localObject2 = mLargeIcon;
    int i = 0;
    if (localObject2 != null)
    {
      paramInt = R.id.icon;
      localRemoteViews.setViewVisibility(paramInt, 0);
      localRemoteViews.setImageViewBitmap(paramInt, mBuilder.mLargeIcon);
      if ((paramBoolean1) && (mBuilder.mNotification.icon != 0))
      {
        j = localResources.getDimensionPixelSize(R.dimen.notification_right_icon_size);
        paramInt = localResources.getDimensionPixelSize(R.dimen.notification_small_icon_background_padding);
        localObject1 = mBuilder;
        localObject1 = createIconWithBackground(mNotification.icon, j, j - paramInt * 2, ((NotificationCompat.Builder)localObject1).getColor());
        paramInt = R.id.right_icon;
        localRemoteViews.setImageViewBitmap(paramInt, (Bitmap)localObject1);
        localRemoteViews.setViewVisibility(paramInt, 0);
      }
    }
    else if ((paramBoolean1) && (mNotification.icon != 0))
    {
      k = R.id.icon;
      localRemoteViews.setViewVisibility(k, 0);
      m = localResources.getDimensionPixelSize(R.dimen.notification_large_icon_width);
      j = localResources.getDimensionPixelSize(R.dimen.notification_big_circle_margin);
      paramInt = localResources.getDimensionPixelSize(R.dimen.notification_small_icon_size_as_large);
      localObject1 = mBuilder;
      localRemoteViews.setImageViewBitmap(k, createIconWithBackground(mNotification.icon, m - j, paramInt, ((NotificationCompat.Builder)localObject1).getColor()));
    }
    localObject1 = mBuilder.mContentTitle;
    if (localObject1 != null) {
      localRemoteViews.setTextViewText(R.id.title, (CharSequence)localObject1);
    }
    localObject1 = mBuilder.mContentText;
    int m = 1;
    if (localObject1 != null)
    {
      localRemoteViews.setTextViewText(R.id.text, (CharSequence)localObject1);
      paramInt = 1;
    }
    else
    {
      paramInt = 0;
    }
    localObject1 = mBuilder;
    localObject2 = mContentInfo;
    if (localObject2 != null)
    {
      paramInt = R.id.info;
      localRemoteViews.setTextViewText(paramInt, (CharSequence)localObject2);
      localRemoteViews.setViewVisibility(paramInt, 0);
    }
    for (;;)
    {
      j = 1;
      paramInt = j;
      break label477;
      if (mNumber <= 0) {
        break;
      }
      paramInt = localResources.getInteger(R.integer.status_bar_notification_info_maxnum);
      if (mBuilder.mNumber > paramInt)
      {
        localRemoteViews.setTextViewText(R.id.info, localResources.getString(R.string.status_bar_notification_info_overflow));
      }
      else
      {
        localObject1 = NumberFormat.getIntegerInstance();
        localRemoteViews.setTextViewText(R.id.info, ((NumberFormat)localObject1).format(mBuilder.mNumber));
      }
      localRemoteViews.setViewVisibility(R.id.info, 0);
    }
    localRemoteViews.setViewVisibility(R.id.info, 8);
    int k = 0;
    int j = paramInt;
    paramInt = k;
    label477:
    localObject1 = mBuilder.mSubText;
    if (localObject1 != null)
    {
      localRemoteViews.setTextViewText(R.id.text, (CharSequence)localObject1);
      localObject1 = mBuilder.mContentText;
      if (localObject1 != null)
      {
        k = R.id.text2;
        localRemoteViews.setTextViewText(k, (CharSequence)localObject1);
        localRemoteViews.setViewVisibility(k, 0);
        k = 1;
      }
      else
      {
        localRemoteViews.setViewVisibility(R.id.text2, 8);
      }
    }
    else
    {
      k = 0;
    }
    if (k != 0)
    {
      if (paramBoolean2)
      {
        float f = localResources.getDimensionPixelSize(R.dimen.notification_subtext_size);
        localRemoteViews.setTextViewTextSize(R.id.text, 0, f);
      }
      localRemoteViews.setViewPadding(R.id.line1, 0, 0, 0, 0);
    }
    if (mBuilder.getWhenIfShowing() != 0L) {
      if (mBuilder.mUseChronometer)
      {
        k = R.id.chronometer;
        localRemoteViews.setViewVisibility(k, 0);
        long l = mBuilder.getWhenIfShowing();
        localRemoteViews.setLong(k, "setBase", SystemClock.elapsedRealtime() - System.currentTimeMillis() + l);
        localRemoteViews.setBoolean(k, "setStarted", true);
        paramBoolean1 = mBuilder.mChronometerCountDown;
        paramInt = m;
        if (paramBoolean1)
        {
          localRemoteViews.setChronometerCountDown(k, paramBoolean1);
          paramInt = m;
        }
      }
      else
      {
        paramInt = R.id.time;
        localRemoteViews.setViewVisibility(paramInt, 0);
        localRemoteViews.setLong(paramInt, "setTime", mBuilder.getWhenIfShowing());
        paramInt = m;
      }
    }
    k = R.id.right_side;
    if (paramInt != 0) {
      paramInt = 0;
    } else {
      paramInt = 8;
    }
    localRemoteViews.setViewVisibility(k, paramInt);
    k = R.id.line3;
    if (j != 0) {
      paramInt = i;
    } else {
      paramInt = 8;
    }
    localRemoteViews.setViewVisibility(k, paramInt);
    return localRemoteViews;
  }
  
  @Nullable
  public Notification build()
  {
    Object localObject = mBuilder;
    if (localObject != null) {
      localObject = ((NotificationCompat.Builder)localObject).build();
    } else {
      localObject = null;
    }
    return (Notification)localObject;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void buildIntoRemoteViews(RemoteViews paramRemoteViews1, RemoteViews paramRemoteViews2)
  {
    hideNormalContent(paramRemoteViews1);
    int i = R.id.notification_main_column;
    paramRemoteViews1.removeAllViews(i);
    paramRemoteViews1.addView(i, paramRemoteViews2.clone());
    paramRemoteViews1.setViewVisibility(i, 0);
    paramRemoteViews1.setViewPadding(R.id.notification_main_column_container, 0, calculateTopPadding(), 0, 0);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void clearCompatExtraKeys(@NonNull Bundle paramBundle)
  {
    paramBundle.remove("android.summaryText");
    paramBundle.remove("android.title.big");
    paramBundle.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public Bitmap createColoredBitmap(int paramInt1, int paramInt2)
  {
    return createColoredBitmap(paramInt1, paramInt2, 0);
  }
  
  public Bitmap createColoredBitmap(@NonNull IconCompat paramIconCompat, int paramInt)
  {
    return createColoredBitmap(paramIconCompat, paramInt, 0);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public boolean displayCustomViewInline()
  {
    return false;
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public String getClassName()
  {
    return null;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
  {
    return null;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
  {
    return null;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
  {
    return null;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void restoreFromCompatExtras(@NonNull Bundle paramBundle)
  {
    if (paramBundle.containsKey("android.summaryText"))
    {
      mSummaryText = paramBundle.getCharSequence("android.summaryText");
      mSummaryTextSet = true;
    }
    mBigContentTitle = paramBundle.getCharSequence("android.title.big");
  }
  
  public void setBuilder(@Nullable NotificationCompat.Builder paramBuilder)
  {
    if (mBuilder != paramBuilder)
    {
      mBuilder = paramBuilder;
      if (paramBuilder != null) {
        paramBuilder.setStyle(this);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationCompat.Style
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */