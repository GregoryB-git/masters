package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.annotation.AnimRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.BundleCompat;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;

public final class CustomTabsIntent
{
  public static final String EXTRA_ACTION_BUTTON_BUNDLE = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE";
  public static final String EXTRA_CLOSE_BUTTON_ICON = "android.support.customtabs.extra.CLOSE_BUTTON_ICON";
  public static final String EXTRA_DEFAULT_SHARE_MENU_ITEM = "android.support.customtabs.extra.SHARE_MENU_ITEM";
  public static final String EXTRA_ENABLE_INSTANT_APPS = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS";
  public static final String EXTRA_ENABLE_URLBAR_HIDING = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING";
  public static final String EXTRA_EXIT_ANIMATION_BUNDLE = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE";
  public static final String EXTRA_MENU_ITEMS = "android.support.customtabs.extra.MENU_ITEMS";
  public static final String EXTRA_REMOTEVIEWS = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS";
  public static final String EXTRA_REMOTEVIEWS_CLICKED_ID = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID";
  public static final String EXTRA_REMOTEVIEWS_PENDINGINTENT = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT";
  public static final String EXTRA_REMOTEVIEWS_VIEW_IDS = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS";
  public static final String EXTRA_SECONDARY_TOOLBAR_COLOR = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR";
  public static final String EXTRA_SESSION = "android.support.customtabs.extra.SESSION";
  public static final String EXTRA_TINT_ACTION_BUTTON = "android.support.customtabs.extra.TINT_ACTION_BUTTON";
  public static final String EXTRA_TITLE_VISIBILITY_STATE = "android.support.customtabs.extra.TITLE_VISIBILITY";
  public static final String EXTRA_TOOLBAR_COLOR = "android.support.customtabs.extra.TOOLBAR_COLOR";
  public static final String EXTRA_TOOLBAR_ITEMS = "android.support.customtabs.extra.TOOLBAR_ITEMS";
  private static final String EXTRA_USER_OPT_OUT_FROM_CUSTOM_TABS = "android.support.customtabs.extra.user_opt_out";
  public static final String KEY_DESCRIPTION = "android.support.customtabs.customaction.DESCRIPTION";
  public static final String KEY_ICON = "android.support.customtabs.customaction.ICON";
  public static final String KEY_ID = "android.support.customtabs.customaction.ID";
  public static final String KEY_MENU_ITEM_TITLE = "android.support.customtabs.customaction.MENU_ITEM_TITLE";
  public static final String KEY_PENDING_INTENT = "android.support.customtabs.customaction.PENDING_INTENT";
  private static final int MAX_TOOLBAR_ITEMS = 5;
  public static final int NO_TITLE = 0;
  public static final int SHOW_PAGE_TITLE = 1;
  public static final int TOOLBAR_ACTION_BUTTON_ID = 0;
  @NonNull
  public final Intent intent;
  @Nullable
  public final Bundle startAnimationBundle;
  
  public CustomTabsIntent(Intent paramIntent, Bundle paramBundle)
  {
    intent = paramIntent;
    startAnimationBundle = paramBundle;
  }
  
  public static int getMaxToolbarItems()
  {
    return 5;
  }
  
  public static Intent setAlwaysUseBrowserUI(Intent paramIntent)
  {
    Intent localIntent = paramIntent;
    if (paramIntent == null) {
      localIntent = new Intent("android.intent.action.VIEW");
    }
    localIntent.addFlags(268435456);
    localIntent.putExtra("android.support.customtabs.extra.user_opt_out", true);
    return localIntent;
  }
  
  public static boolean shouldAlwaysUseBrowserUI(Intent paramIntent)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramIntent.getBooleanExtra("android.support.customtabs.extra.user_opt_out", false))
    {
      bool2 = bool1;
      if ((paramIntent.getFlags() & 0x10000000) != 0) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public void launchUrl(Context paramContext, Uri paramUri)
  {
    intent.setData(paramUri);
    ContextCompat.startActivity(paramContext, intent, startAnimationBundle);
  }
  
  public static final class Builder
  {
    private ArrayList<Bundle> mActionButtons;
    private boolean mInstantAppsEnabled;
    private final Intent mIntent;
    private ArrayList<Bundle> mMenuItems;
    private Bundle mStartAnimationBundle;
    
    public Builder()
    {
      this(null);
    }
    
    public Builder(@Nullable CustomTabsSession paramCustomTabsSession)
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
}

/* Location:
 * Qualified Name:     androidx.browser.customtabs.CustomTabsIntent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */