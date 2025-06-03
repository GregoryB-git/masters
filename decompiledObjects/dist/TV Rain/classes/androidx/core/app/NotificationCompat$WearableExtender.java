package androidx.core.app;

import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.Action.Builder;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.IconCompat;
import g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class NotificationCompat$WearableExtender
  implements NotificationCompat.Extender
{
  private static final int DEFAULT_CONTENT_ICON_GRAVITY = 8388613;
  private static final int DEFAULT_FLAGS = 1;
  private static final int DEFAULT_GRAVITY = 80;
  private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
  private static final int FLAG_BIG_PICTURE_AMBIENT = 32;
  private static final int FLAG_CONTENT_INTENT_AVAILABLE_OFFLINE = 1;
  private static final int FLAG_HINT_AVOID_BACKGROUND_CLIPPING = 16;
  private static final int FLAG_HINT_CONTENT_INTENT_LAUNCHES_ACTIVITY = 64;
  private static final int FLAG_HINT_HIDE_ICON = 2;
  private static final int FLAG_HINT_SHOW_BACKGROUND_ONLY = 4;
  private static final int FLAG_START_SCROLL_BOTTOM = 8;
  private static final String KEY_ACTIONS = "actions";
  private static final String KEY_BACKGROUND = "background";
  private static final String KEY_BRIDGE_TAG = "bridgeTag";
  private static final String KEY_CONTENT_ACTION_INDEX = "contentActionIndex";
  private static final String KEY_CONTENT_ICON = "contentIcon";
  private static final String KEY_CONTENT_ICON_GRAVITY = "contentIconGravity";
  private static final String KEY_CUSTOM_CONTENT_HEIGHT = "customContentHeight";
  private static final String KEY_CUSTOM_SIZE_PRESET = "customSizePreset";
  private static final String KEY_DISMISSAL_ID = "dismissalId";
  private static final String KEY_DISPLAY_INTENT = "displayIntent";
  private static final String KEY_FLAGS = "flags";
  private static final String KEY_GRAVITY = "gravity";
  private static final String KEY_HINT_SCREEN_TIMEOUT = "hintScreenTimeout";
  private static final String KEY_PAGES = "pages";
  @Deprecated
  public static final int SCREEN_TIMEOUT_LONG = -1;
  @Deprecated
  public static final int SCREEN_TIMEOUT_SHORT = 0;
  @Deprecated
  public static final int SIZE_DEFAULT = 0;
  @Deprecated
  public static final int SIZE_FULL_SCREEN = 5;
  @Deprecated
  public static final int SIZE_LARGE = 4;
  @Deprecated
  public static final int SIZE_MEDIUM = 3;
  @Deprecated
  public static final int SIZE_SMALL = 2;
  @Deprecated
  public static final int SIZE_XSMALL = 1;
  public static final int UNSET_ACTION_INDEX = -1;
  private ArrayList<NotificationCompat.Action> mActions = new ArrayList();
  private Bitmap mBackground;
  private String mBridgeTag;
  private int mContentActionIndex = -1;
  private int mContentIcon;
  private int mContentIconGravity = 8388613;
  private int mCustomContentHeight;
  private int mCustomSizePreset = 0;
  private String mDismissalId;
  private PendingIntent mDisplayIntent;
  private int mFlags = 1;
  private int mGravity = 80;
  private int mHintScreenTimeout;
  private ArrayList<Notification> mPages = new ArrayList();
  
  public NotificationCompat$WearableExtender() {}
  
  public NotificationCompat$WearableExtender(@NonNull Notification paramNotification)
  {
    paramNotification = NotificationCompat.getExtras(paramNotification);
    if (paramNotification != null) {
      paramNotification = paramNotification.getBundle("android.wearable.EXTENSIONS");
    } else {
      paramNotification = null;
    }
    if (paramNotification != null)
    {
      ArrayList localArrayList = paramNotification.getParcelableArrayList("actions");
      if (localArrayList != null)
      {
        int i = localArrayList.size();
        localObject = new NotificationCompat.Action[i];
        for (int j = 0; j < i; j++) {
          localObject[j] = NotificationCompat.getActionCompatFromAction((Notification.Action)localArrayList.get(j));
        }
        Collections.addAll(mActions, (Object[])localObject);
      }
      mFlags = paramNotification.getInt("flags", 1);
      mDisplayIntent = ((PendingIntent)paramNotification.getParcelable("displayIntent"));
      Object localObject = NotificationCompat.getNotificationArrayFromBundle(paramNotification, "pages");
      if (localObject != null) {
        Collections.addAll(mPages, (Object[])localObject);
      }
      mBackground = ((Bitmap)paramNotification.getParcelable("background"));
      mContentIcon = paramNotification.getInt("contentIcon");
      mContentIconGravity = paramNotification.getInt("contentIconGravity", 8388613);
      mContentActionIndex = paramNotification.getInt("contentActionIndex", -1);
      mCustomSizePreset = paramNotification.getInt("customSizePreset", 0);
      mCustomContentHeight = paramNotification.getInt("customContentHeight");
      mGravity = paramNotification.getInt("gravity", 80);
      mHintScreenTimeout = paramNotification.getInt("hintScreenTimeout");
      mDismissalId = paramNotification.getString("dismissalId");
      mBridgeTag = paramNotification.getString("bridgeTag");
    }
  }
  
  @RequiresApi(20)
  private static Notification.Action getActionFromActionCompat(NotificationCompat.Action paramAction)
  {
    int i = Build.VERSION.SDK_INT;
    Object localObject = paramAction.getIconCompat();
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((IconCompat)localObject).toIcon();
    }
    Notification.Action.Builder localBuilder = new Notification.Action.Builder((Icon)localObject, paramAction.getTitle(), paramAction.getActionIntent());
    if (paramAction.getExtras() != null) {
      localObject = new Bundle(paramAction.getExtras());
    } else {
      localObject = new Bundle();
    }
    ((BaseBundle)localObject).putBoolean("android.support.allowGeneratedReplies", paramAction.getAllowGeneratedReplies());
    localBuilder.setAllowGeneratedReplies(paramAction.getAllowGeneratedReplies());
    if (i >= 31) {
      g.g(localBuilder, paramAction.isAuthenticationRequired());
    }
    localBuilder.addExtras((Bundle)localObject);
    paramAction = paramAction.getRemoteInputs();
    if (paramAction != null)
    {
      paramAction = RemoteInput.fromCompat(paramAction);
      int j = paramAction.length;
      for (i = 0; i < j; i++) {
        localBuilder.addRemoteInput(paramAction[i]);
      }
    }
    return localBuilder.build();
  }
  
  private void setFlag(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      mFlags = (paramInt | mFlags);
    } else {
      mFlags = (paramInt & mFlags);
    }
  }
  
  @NonNull
  public WearableExtender addAction(@NonNull NotificationCompat.Action paramAction)
  {
    mActions.add(paramAction);
    return this;
  }
  
  @NonNull
  public WearableExtender addActions(@NonNull List<NotificationCompat.Action> paramList)
  {
    mActions.addAll(paramList);
    return this;
  }
  
  @Deprecated
  @NonNull
  public WearableExtender addPage(@NonNull Notification paramNotification)
  {
    mPages.add(paramNotification);
    return this;
  }
  
  @Deprecated
  @NonNull
  public WearableExtender addPages(@NonNull List<Notification> paramList)
  {
    mPages.addAll(paramList);
    return this;
  }
  
  @NonNull
  public WearableExtender clearActions()
  {
    mActions.clear();
    return this;
  }
  
  @Deprecated
  @NonNull
  public WearableExtender clearPages()
  {
    mPages.clear();
    return this;
  }
  
  @NonNull
  public WearableExtender clone()
  {
    WearableExtender localWearableExtender = new WearableExtender();
    mActions = new ArrayList(mActions);
    mFlags = mFlags;
    mDisplayIntent = mDisplayIntent;
    mPages = new ArrayList(mPages);
    mBackground = mBackground;
    mContentIcon = mContentIcon;
    mContentIconGravity = mContentIconGravity;
    mContentActionIndex = mContentActionIndex;
    mCustomSizePreset = mCustomSizePreset;
    mCustomContentHeight = mCustomContentHeight;
    mGravity = mGravity;
    mHintScreenTimeout = mHintScreenTimeout;
    mDismissalId = mDismissalId;
    mBridgeTag = mBridgeTag;
    return localWearableExtender;
  }
  
  @NonNull
  public NotificationCompat.Builder extend(@NonNull NotificationCompat.Builder paramBuilder)
  {
    Bundle localBundle = new Bundle();
    if (!mActions.isEmpty())
    {
      ArrayList localArrayList = new ArrayList(mActions.size());
      localObject = mActions.iterator();
      while (((Iterator)localObject).hasNext()) {
        localArrayList.add(getActionFromActionCompat((NotificationCompat.Action)((Iterator)localObject).next()));
      }
      localBundle.putParcelableArrayList("actions", localArrayList);
    }
    int i = mFlags;
    if (i != 1) {
      localBundle.putInt("flags", i);
    }
    Object localObject = mDisplayIntent;
    if (localObject != null) {
      localBundle.putParcelable("displayIntent", (Parcelable)localObject);
    }
    if (!mPages.isEmpty())
    {
      localObject = mPages;
      localBundle.putParcelableArray("pages", (Parcelable[])((ArrayList)localObject).toArray(new Notification[((ArrayList)localObject).size()]));
    }
    localObject = mBackground;
    if (localObject != null) {
      localBundle.putParcelable("background", (Parcelable)localObject);
    }
    i = mContentIcon;
    if (i != 0) {
      localBundle.putInt("contentIcon", i);
    }
    i = mContentIconGravity;
    if (i != 8388613) {
      localBundle.putInt("contentIconGravity", i);
    }
    i = mContentActionIndex;
    if (i != -1) {
      localBundle.putInt("contentActionIndex", i);
    }
    i = mCustomSizePreset;
    if (i != 0) {
      localBundle.putInt("customSizePreset", i);
    }
    i = mCustomContentHeight;
    if (i != 0) {
      localBundle.putInt("customContentHeight", i);
    }
    i = mGravity;
    if (i != 80) {
      localBundle.putInt("gravity", i);
    }
    i = mHintScreenTimeout;
    if (i != 0) {
      localBundle.putInt("hintScreenTimeout", i);
    }
    localObject = mDismissalId;
    if (localObject != null) {
      localBundle.putString("dismissalId", (String)localObject);
    }
    localObject = mBridgeTag;
    if (localObject != null) {
      localBundle.putString("bridgeTag", (String)localObject);
    }
    paramBuilder.getExtras().putBundle("android.wearable.EXTENSIONS", localBundle);
    return paramBuilder;
  }
  
  @NonNull
  public List<NotificationCompat.Action> getActions()
  {
    return mActions;
  }
  
  @Deprecated
  @Nullable
  public Bitmap getBackground()
  {
    return mBackground;
  }
  
  @Nullable
  public String getBridgeTag()
  {
    return mBridgeTag;
  }
  
  public int getContentAction()
  {
    return mContentActionIndex;
  }
  
  @Deprecated
  public int getContentIcon()
  {
    return mContentIcon;
  }
  
  @Deprecated
  public int getContentIconGravity()
  {
    return mContentIconGravity;
  }
  
  public boolean getContentIntentAvailableOffline()
  {
    int i = mFlags;
    boolean bool = true;
    if ((i & 0x1) == 0) {
      bool = false;
    }
    return bool;
  }
  
  @Deprecated
  public int getCustomContentHeight()
  {
    return mCustomContentHeight;
  }
  
  @Deprecated
  public int getCustomSizePreset()
  {
    return mCustomSizePreset;
  }
  
  @Nullable
  public String getDismissalId()
  {
    return mDismissalId;
  }
  
  @Deprecated
  @Nullable
  public PendingIntent getDisplayIntent()
  {
    return mDisplayIntent;
  }
  
  @Deprecated
  public int getGravity()
  {
    return mGravity;
  }
  
  @Deprecated
  public boolean getHintAmbientBigPicture()
  {
    boolean bool;
    if ((mFlags & 0x20) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Deprecated
  public boolean getHintAvoidBackgroundClipping()
  {
    boolean bool;
    if ((mFlags & 0x10) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean getHintContentIntentLaunchesActivity()
  {
    boolean bool;
    if ((mFlags & 0x40) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Deprecated
  public boolean getHintHideIcon()
  {
    boolean bool;
    if ((mFlags & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Deprecated
  public int getHintScreenTimeout()
  {
    return mHintScreenTimeout;
  }
  
  @Deprecated
  public boolean getHintShowBackgroundOnly()
  {
    boolean bool;
    if ((mFlags & 0x4) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Deprecated
  @NonNull
  public List<Notification> getPages()
  {
    return mPages;
  }
  
  public boolean getStartScrollBottom()
  {
    boolean bool;
    if ((mFlags & 0x8) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Deprecated
  @NonNull
  public WearableExtender setBackground(@Nullable Bitmap paramBitmap)
  {
    mBackground = paramBitmap;
    return this;
  }
  
  @NonNull
  public WearableExtender setBridgeTag(@Nullable String paramString)
  {
    mBridgeTag = paramString;
    return this;
  }
  
  @NonNull
  public WearableExtender setContentAction(int paramInt)
  {
    mContentActionIndex = paramInt;
    return this;
  }
  
  @Deprecated
  @NonNull
  public WearableExtender setContentIcon(int paramInt)
  {
    mContentIcon = paramInt;
    return this;
  }
  
  @Deprecated
  @NonNull
  public WearableExtender setContentIconGravity(int paramInt)
  {
    mContentIconGravity = paramInt;
    return this;
  }
  
  @NonNull
  public WearableExtender setContentIntentAvailableOffline(boolean paramBoolean)
  {
    setFlag(1, paramBoolean);
    return this;
  }
  
  @Deprecated
  @NonNull
  public WearableExtender setCustomContentHeight(int paramInt)
  {
    mCustomContentHeight = paramInt;
    return this;
  }
  
  @Deprecated
  @NonNull
  public WearableExtender setCustomSizePreset(int paramInt)
  {
    mCustomSizePreset = paramInt;
    return this;
  }
  
  @NonNull
  public WearableExtender setDismissalId(@Nullable String paramString)
  {
    mDismissalId = paramString;
    return this;
  }
  
  @Deprecated
  @NonNull
  public WearableExtender setDisplayIntent(@Nullable PendingIntent paramPendingIntent)
  {
    mDisplayIntent = paramPendingIntent;
    return this;
  }
  
  @Deprecated
  @NonNull
  public WearableExtender setGravity(int paramInt)
  {
    mGravity = paramInt;
    return this;
  }
  
  @Deprecated
  @NonNull
  public WearableExtender setHintAmbientBigPicture(boolean paramBoolean)
  {
    setFlag(32, paramBoolean);
    return this;
  }
  
  @Deprecated
  @NonNull
  public WearableExtender setHintAvoidBackgroundClipping(boolean paramBoolean)
  {
    setFlag(16, paramBoolean);
    return this;
  }
  
  @NonNull
  public WearableExtender setHintContentIntentLaunchesActivity(boolean paramBoolean)
  {
    setFlag(64, paramBoolean);
    return this;
  }
  
  @Deprecated
  @NonNull
  public WearableExtender setHintHideIcon(boolean paramBoolean)
  {
    setFlag(2, paramBoolean);
    return this;
  }
  
  @Deprecated
  @NonNull
  public WearableExtender setHintScreenTimeout(int paramInt)
  {
    mHintScreenTimeout = paramInt;
    return this;
  }
  
  @Deprecated
  @NonNull
  public WearableExtender setHintShowBackgroundOnly(boolean paramBoolean)
  {
    setFlag(4, paramBoolean);
    return this;
  }
  
  @NonNull
  public WearableExtender setStartScrollBottom(boolean paramBoolean)
  {
    setFlag(8, paramBoolean);
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationCompat.WearableExtender
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */