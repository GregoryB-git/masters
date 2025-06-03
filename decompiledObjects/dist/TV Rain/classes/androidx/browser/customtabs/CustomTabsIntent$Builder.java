package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.BaseBundle;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.annotation.AnimRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.BundleCompat;
import java.util.ArrayList;

public final class CustomTabsIntent$Builder
{
  private ArrayList<Bundle> mActionButtons;
  private boolean mInstantAppsEnabled;
  private final Intent mIntent;
  private ArrayList<Bundle> mMenuItems;
  private Bundle mStartAnimationBundle;
  
  public CustomTabsIntent$Builder()
  {
    this(null);
  }
  
  public CustomTabsIntent$Builder(@Nullable CustomTabsSession paramCustomTabsSession)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    mIntent = localIntent;
    Object localObject = null;
    mMenuItems = null;
    mStartAnimationBundle = null;
    mActionButtons = null;
    mInstantAppsEnabled = true;
    if (paramCustomTabsSession != null) {
      localIntent.setPackage(paramCustomTabsSession.getComponentName().getPackageName());
    }
    Bundle localBundle = new Bundle();
    if (paramCustomTabsSession == null) {
      paramCustomTabsSession = (CustomTabsSession)localObject;
    } else {
      paramCustomTabsSession = paramCustomTabsSession.getBinder();
    }
    BundleCompat.putBinder(localBundle, "android.support.customtabs.extra.SESSION", paramCustomTabsSession);
    localIntent.putExtras(localBundle);
  }
  
  public Builder addDefaultShareMenuItem()
  {
    mIntent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
    return this;
  }
  
  public Builder addMenuItem(@NonNull String paramString, @NonNull PendingIntent paramPendingIntent)
  {
    if (mMenuItems == null) {
      mMenuItems = new ArrayList();
    }
    Bundle localBundle = new Bundle();
    localBundle.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", paramString);
    localBundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", paramPendingIntent);
    mMenuItems.add(localBundle);
    return this;
  }
  
  @Deprecated
  public Builder addToolbarItem(int paramInt, @NonNull Bitmap paramBitmap, @NonNull String paramString, PendingIntent paramPendingIntent)
    throws IllegalStateException
  {
    if (mActionButtons == null) {
      mActionButtons = new ArrayList();
    }
    if (mActionButtons.size() < 5)
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("android.support.customtabs.customaction.ID", paramInt);
      localBundle.putParcelable("android.support.customtabs.customaction.ICON", paramBitmap);
      localBundle.putString("android.support.customtabs.customaction.DESCRIPTION", paramString);
      localBundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", paramPendingIntent);
      mActionButtons.add(localBundle);
      return this;
    }
    throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
  }
  
  public CustomTabsIntent build()
  {
    ArrayList localArrayList = mMenuItems;
    if (localArrayList != null) {
      mIntent.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", localArrayList);
    }
    localArrayList = mActionButtons;
    if (localArrayList != null) {
      mIntent.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", localArrayList);
    }
    mIntent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", mInstantAppsEnabled);
    return new CustomTabsIntent(mIntent, mStartAnimationBundle);
  }
  
  public Builder enableUrlBarHiding()
  {
    mIntent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
    return this;
  }
  
  public Builder setActionButton(@NonNull Bitmap paramBitmap, @NonNull String paramString, @NonNull PendingIntent paramPendingIntent)
  {
    return setActionButton(paramBitmap, paramString, paramPendingIntent, false);
  }
  
  public Builder setActionButton(@NonNull Bitmap paramBitmap, @NonNull String paramString, @NonNull PendingIntent paramPendingIntent, boolean paramBoolean)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("android.support.customtabs.customaction.ID", 0);
    localBundle.putParcelable("android.support.customtabs.customaction.ICON", paramBitmap);
    localBundle.putString("android.support.customtabs.customaction.DESCRIPTION", paramString);
    localBundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", paramPendingIntent);
    mIntent.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", localBundle);
    mIntent.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", paramBoolean);
    return this;
  }
  
  public Builder setCloseButtonIcon(@NonNull Bitmap paramBitmap)
  {
    mIntent.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", paramBitmap);
    return this;
  }
  
  public Builder setExitAnimations(@NonNull Context paramContext, @AnimRes int paramInt1, @AnimRes int paramInt2)
  {
    paramContext = ActivityOptionsCompat.makeCustomAnimation(paramContext, paramInt1, paramInt2).toBundle();
    mIntent.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", paramContext);
    return this;
  }
  
  public Builder setInstantAppsEnabled(boolean paramBoolean)
  {
    mInstantAppsEnabled = paramBoolean;
    return this;
  }
  
  public Builder setSecondaryToolbarColor(@ColorInt int paramInt)
  {
    mIntent.putExtra("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", paramInt);
    return this;
  }
  
  public Builder setSecondaryToolbarViews(@NonNull RemoteViews paramRemoteViews, @Nullable int[] paramArrayOfInt, @Nullable PendingIntent paramPendingIntent)
  {
    mIntent.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", paramRemoteViews);
    mIntent.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", paramArrayOfInt);
    mIntent.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", paramPendingIntent);
    return this;
  }
  
  public Builder setShowTitle(boolean paramBoolean)
  {
    mIntent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", paramBoolean);
    return this;
  }
  
  public Builder setStartAnimations(@NonNull Context paramContext, @AnimRes int paramInt1, @AnimRes int paramInt2)
  {
    mStartAnimationBundle = ActivityOptionsCompat.makeCustomAnimation(paramContext, paramInt1, paramInt2).toBundle();
    return this;
  }
  
  public Builder setToolbarColor(@ColorInt int paramInt)
  {
    mIntent.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", paramInt);
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.browser.customtabs.CustomTabsIntent.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */