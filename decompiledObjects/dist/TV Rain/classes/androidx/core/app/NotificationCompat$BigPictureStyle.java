package androidx.core.app;

import android.app.Notification.BigPictureStyle;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import g;

public class NotificationCompat$BigPictureStyle
  extends NotificationCompat.Style
{
  private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigPictureStyle";
  private IconCompat mBigLargeIcon;
  private boolean mBigLargeIconSet;
  private CharSequence mPictureContentDescription;
  private IconCompat mPictureIcon;
  private boolean mShowBigPictureWhenCollapsed;
  
  public NotificationCompat$BigPictureStyle() {}
  
  public NotificationCompat$BigPictureStyle(@Nullable NotificationCompat.Builder paramBuilder)
  {
    setBuilder(paramBuilder);
  }
  
  @Nullable
  private static IconCompat asIconCompat(@Nullable Parcelable paramParcelable)
  {
    if (paramParcelable != null)
    {
      if ((paramParcelable instanceof Icon)) {
        return IconCompat.createFromIcon((Icon)paramParcelable);
      }
      if ((paramParcelable instanceof Bitmap)) {
        return IconCompat.createWithBitmap((Bitmap)paramParcelable);
      }
    }
    return null;
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static IconCompat getPictureIcon(@Nullable Bundle paramBundle)
  {
    if (paramBundle == null) {
      return null;
    }
    Parcelable localParcelable = paramBundle.getParcelable("android.picture");
    if (localParcelable != null) {
      return asIconCompat(localParcelable);
    }
    return asIconCompat(paramBundle.getParcelable("android.pictureIcon"));
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void apply(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
  {
    int i = Build.VERSION.SDK_INT;
    Notification.BigPictureStyle localBigPictureStyle = new Notification.BigPictureStyle(paramNotificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(mBigContentTitle);
    IconCompat localIconCompat = mPictureIcon;
    Context localContext = null;
    Object localObject = localBigPictureStyle;
    if (localIconCompat != null) {
      if (i >= 31)
      {
        if ((paramNotificationBuilderWithBuilderAccessor instanceof NotificationCompatBuilder)) {
          localObject = ((NotificationCompatBuilder)paramNotificationBuilderWithBuilderAccessor).getContext();
        } else {
          localObject = null;
        }
        Api31Impl.setBigPicture(localBigPictureStyle, mPictureIcon.toIcon((Context)localObject));
        localObject = localBigPictureStyle;
      }
      else
      {
        localObject = localBigPictureStyle;
        if (localIconCompat.getType() == 1) {
          localObject = localBigPictureStyle.bigPicture(mPictureIcon.getBitmap());
        }
      }
    }
    if (mBigLargeIconSet) {
      if (mBigLargeIcon == null)
      {
        Api16Impl.setBigLargeIcon((Notification.BigPictureStyle)localObject, null);
      }
      else
      {
        if ((paramNotificationBuilderWithBuilderAccessor instanceof NotificationCompatBuilder)) {
          localContext = ((NotificationCompatBuilder)paramNotificationBuilderWithBuilderAccessor).getContext();
        }
        Api23Impl.setBigLargeIcon((Notification.BigPictureStyle)localObject, mBigLargeIcon.toIcon(localContext));
      }
    }
    if (mSummaryTextSet) {
      Api16Impl.setSummaryText((Notification.BigPictureStyle)localObject, mSummaryText);
    }
    if (i >= 31)
    {
      Api31Impl.showBigPictureWhenCollapsed((Notification.BigPictureStyle)localObject, mShowBigPictureWhenCollapsed);
      Api31Impl.setContentDescription((Notification.BigPictureStyle)localObject, mPictureContentDescription);
    }
  }
  
  @NonNull
  public BigPictureStyle bigLargeIcon(@Nullable Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      paramBitmap = null;
    } else {
      paramBitmap = IconCompat.createWithBitmap(paramBitmap);
    }
    mBigLargeIcon = paramBitmap;
    mBigLargeIconSet = true;
    return this;
  }
  
  @NonNull
  public BigPictureStyle bigPicture(@Nullable Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      paramBitmap = null;
    } else {
      paramBitmap = IconCompat.createWithBitmap(paramBitmap);
    }
    mPictureIcon = paramBitmap;
    return this;
  }
  
  @NonNull
  @RequiresApi(31)
  public BigPictureStyle bigPicture(@Nullable Icon paramIcon)
  {
    mPictureIcon = IconCompat.createFromIcon(paramIcon);
    return this;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void clearCompatExtraKeys(@NonNull Bundle paramBundle)
  {
    super.clearCompatExtraKeys(paramBundle);
    paramBundle.remove("android.largeIcon.big");
    paramBundle.remove("android.picture");
    paramBundle.remove("android.pictureIcon");
    paramBundle.remove("android.showBigPictureWhenCollapsed");
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public String getClassName()
  {
    return "androidx.core.app.NotificationCompat$BigPictureStyle";
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void restoreFromCompatExtras(@NonNull Bundle paramBundle)
  {
    super.restoreFromCompatExtras(paramBundle);
    if (paramBundle.containsKey("android.largeIcon.big"))
    {
      mBigLargeIcon = asIconCompat(paramBundle.getParcelable("android.largeIcon.big"));
      mBigLargeIconSet = true;
    }
    mPictureIcon = getPictureIcon(paramBundle);
    mShowBigPictureWhenCollapsed = paramBundle.getBoolean("android.showBigPictureWhenCollapsed");
  }
  
  @NonNull
  public BigPictureStyle setBigContentTitle(@Nullable CharSequence paramCharSequence)
  {
    mBigContentTitle = NotificationCompat.Builder.limitCharSequenceLength(paramCharSequence);
    return this;
  }
  
  @NonNull
  @RequiresApi(31)
  public BigPictureStyle setContentDescription(@Nullable CharSequence paramCharSequence)
  {
    mPictureContentDescription = paramCharSequence;
    return this;
  }
  
  @NonNull
  public BigPictureStyle setSummaryText(@Nullable CharSequence paramCharSequence)
  {
    mSummaryText = NotificationCompat.Builder.limitCharSequenceLength(paramCharSequence);
    mSummaryTextSet = true;
    return this;
  }
  
  @NonNull
  @RequiresApi(31)
  public BigPictureStyle showBigPictureWhenCollapsed(boolean paramBoolean)
  {
    mShowBigPictureWhenCollapsed = paramBoolean;
    return this;
  }
  
  @RequiresApi(16)
  public static class Api16Impl
  {
    @RequiresApi(16)
    public static void setBigLargeIcon(Notification.BigPictureStyle paramBigPictureStyle, Bitmap paramBitmap)
    {
      paramBigPictureStyle.bigLargeIcon(paramBitmap);
    }
    
    @RequiresApi(16)
    public static void setSummaryText(Notification.BigPictureStyle paramBigPictureStyle, CharSequence paramCharSequence)
    {
      paramBigPictureStyle.setSummaryText(paramCharSequence);
    }
  }
  
  @RequiresApi(23)
  public static class Api23Impl
  {
    @RequiresApi(23)
    public static void setBigLargeIcon(Notification.BigPictureStyle paramBigPictureStyle, Icon paramIcon)
    {
      paramBigPictureStyle.bigLargeIcon(paramIcon);
    }
  }
  
  @RequiresApi(31)
  public static class Api31Impl
  {
    @RequiresApi(31)
    public static void setBigPicture(Notification.BigPictureStyle paramBigPictureStyle, Icon paramIcon)
    {
      g.h(paramBigPictureStyle, paramIcon);
    }
    
    @RequiresApi(31)
    public static void setContentDescription(Notification.BigPictureStyle paramBigPictureStyle, CharSequence paramCharSequence)
    {
      g.i(paramBigPictureStyle, paramCharSequence);
    }
    
    @RequiresApi(31)
    public static void showBigPictureWhenCollapsed(Notification.BigPictureStyle paramBigPictureStyle, boolean paramBoolean)
    {
      g.j(paramBigPictureStyle, paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationCompat.BigPictureStyle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */