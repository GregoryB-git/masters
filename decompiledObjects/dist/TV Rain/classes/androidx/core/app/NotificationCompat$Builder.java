package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes.Builder;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.R.dimen;
import androidx.core.content.LocusIdCompat;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NotificationCompat$Builder
{
  private static final int MAX_CHARSEQUENCE_LENGTH = 5120;
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public ArrayList<NotificationCompat.Action> mActions = new ArrayList();
  public boolean mAllowSystemGeneratedContextualActions;
  public int mBadgeIcon = 0;
  public RemoteViews mBigContentView;
  public NotificationCompat.BubbleMetadata mBubbleMetadata;
  public String mCategory;
  public String mChannelId;
  public boolean mChronometerCountDown;
  public int mColor = 0;
  public boolean mColorized;
  public boolean mColorizedSet;
  public CharSequence mContentInfo;
  public PendingIntent mContentIntent;
  public CharSequence mContentText;
  public CharSequence mContentTitle;
  public RemoteViews mContentView;
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public Context mContext;
  public Bundle mExtras;
  public int mFgsDeferBehavior = 0;
  public PendingIntent mFullScreenIntent;
  public int mGroupAlertBehavior = 0;
  public String mGroupKey;
  public boolean mGroupSummary;
  public RemoteViews mHeadsUpContentView;
  public ArrayList<NotificationCompat.Action> mInvisibleActions = new ArrayList();
  public Bitmap mLargeIcon;
  public boolean mLocalOnly = false;
  public LocusIdCompat mLocusId;
  public Notification mNotification;
  public int mNumber;
  @Deprecated
  public ArrayList<String> mPeople;
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public ArrayList<Person> mPersonList = new ArrayList();
  public int mPriority;
  public int mProgress;
  public boolean mProgressIndeterminate;
  public int mProgressMax;
  public Notification mPublicVersion;
  public CharSequence[] mRemoteInputHistory;
  public CharSequence mSettingsText;
  public String mShortcutId;
  public boolean mShowWhen = true;
  public boolean mSilent;
  public Icon mSmallIcon;
  public String mSortKey;
  public NotificationCompat.Style mStyle;
  public CharSequence mSubText;
  public RemoteViews mTickerView;
  public long mTimeout;
  public boolean mUseChronometer;
  public int mVisibility = 0;
  
  @Deprecated
  public NotificationCompat$Builder(@NonNull Context paramContext)
  {
    this(paramContext, null);
  }
  
  @RequiresApi(19)
  public NotificationCompat$Builder(@NonNull Context paramContext, @NonNull Notification paramNotification)
  {
    this(paramContext, NotificationCompat.getChannelId(paramNotification));
    paramContext = extras;
    Object localObject = NotificationCompat.Style.extractStyleFromNotification(paramNotification);
    setContentTitle(NotificationCompat.getContentTitle(paramNotification)).setContentText(NotificationCompat.getContentText(paramNotification)).setContentInfo(NotificationCompat.getContentInfo(paramNotification)).setSubText(NotificationCompat.getSubText(paramNotification)).setSettingsText(NotificationCompat.getSettingsText(paramNotification)).setStyle((NotificationCompat.Style)localObject).setContentIntent(contentIntent).setGroup(NotificationCompat.getGroup(paramNotification)).setGroupSummary(NotificationCompat.isGroupSummary(paramNotification)).setLocusId(NotificationCompat.getLocusId(paramNotification)).setWhen(when).setShowWhen(NotificationCompat.getShowWhen(paramNotification)).setUsesChronometer(NotificationCompat.getUsesChronometer(paramNotification)).setAutoCancel(NotificationCompat.getAutoCancel(paramNotification)).setOnlyAlertOnce(NotificationCompat.getOnlyAlertOnce(paramNotification)).setOngoing(NotificationCompat.getOngoing(paramNotification)).setLocalOnly(NotificationCompat.getLocalOnly(paramNotification)).setLargeIcon(largeIcon).setBadgeIconType(NotificationCompat.getBadgeIconType(paramNotification)).setCategory(NotificationCompat.getCategory(paramNotification)).setBubbleMetadata(NotificationCompat.getBubbleMetadata(paramNotification)).setNumber(number).setTicker(tickerText).setContentIntent(contentIntent).setDeleteIntent(deleteIntent).setFullScreenIntent(fullScreenIntent, NotificationCompat.getHighPriority(paramNotification)).setSound(sound, audioStreamType).setVibrate(vibrate).setLights(ledARGB, ledOnMS, ledOffMS).setDefaults(defaults).setPriority(priority).setColor(NotificationCompat.getColor(paramNotification)).setVisibility(NotificationCompat.getVisibility(paramNotification)).setPublicVersion(NotificationCompat.getPublicVersion(paramNotification)).setSortKey(NotificationCompat.getSortKey(paramNotification)).setTimeoutAfter(NotificationCompat.getTimeoutAfter(paramNotification)).setShortcutId(NotificationCompat.getShortcutId(paramNotification)).setProgress(paramContext.getInt("android.progressMax"), paramContext.getInt("android.progress"), paramContext.getBoolean("android.progressIndeterminate")).setAllowSystemGeneratedContextualActions(NotificationCompat.getAllowSystemGeneratedContextualActions(paramNotification)).setSmallIcon(icon, iconLevel).addExtras(getExtrasWithoutDuplicateData(paramNotification, (NotificationCompat.Style)localObject));
    mSmallIcon = paramNotification.getSmallIcon();
    localObject = actions;
    int i = 0;
    int j;
    if ((localObject != null) && (localObject.length != 0))
    {
      j = localObject.length;
      for (k = 0; k < j; k++) {
        addAction(NotificationCompat.Action.Builder.fromAndroidAction(localObject[k]).build());
      }
    }
    localObject = NotificationCompat.getInvisibleActions(paramNotification);
    if (!((List)localObject).isEmpty())
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        addInvisibleAction((NotificationCompat.Action)((Iterator)localObject).next());
      }
    }
    localObject = extras.getStringArray("android.people");
    if ((localObject != null) && (localObject.length != 0))
    {
      j = localObject.length;
      for (k = i; k < j; k++) {
        addPerson(localObject[k]);
      }
    }
    if (Build.VERSION.SDK_INT >= 28)
    {
      paramNotification = extras.getParcelableArrayList("android.people.list");
      if ((paramNotification != null) && (!paramNotification.isEmpty()))
      {
        paramNotification = paramNotification.iterator();
        while (paramNotification.hasNext()) {
          addPerson(Person.fromAndroidPerson((android.app.Person)paramNotification.next()));
        }
      }
    }
    int k = Build.VERSION.SDK_INT;
    if (paramContext.containsKey("android.chronometerCountDown")) {
      setChronometerCountDown(paramContext.getBoolean("android.chronometerCountDown"));
    }
    if ((k >= 26) && (paramContext.containsKey("android.colorized"))) {
      setColorized(paramContext.getBoolean("android.colorized"));
    }
  }
  
  public NotificationCompat$Builder(@NonNull Context paramContext, @NonNull String paramString)
  {
    Notification localNotification = new Notification();
    mNotification = localNotification;
    mContext = paramContext;
    mChannelId = paramString;
    when = System.currentTimeMillis();
    mNotification.audioStreamType = -1;
    mPriority = 0;
    mPeople = new ArrayList();
    mAllowSystemGeneratedContextualActions = true;
  }
  
  @Nullable
  @RequiresApi(19)
  private static Bundle getExtrasWithoutDuplicateData(@NonNull Notification paramNotification, @Nullable NotificationCompat.Style paramStyle)
  {
    if (extras == null) {
      return null;
    }
    paramNotification = new Bundle(extras);
    paramNotification.remove("android.title");
    paramNotification.remove("android.text");
    paramNotification.remove("android.infoText");
    paramNotification.remove("android.subText");
    paramNotification.remove("android.intent.extra.CHANNEL_ID");
    paramNotification.remove("android.intent.extra.CHANNEL_GROUP_ID");
    paramNotification.remove("android.showWhen");
    paramNotification.remove("android.progress");
    paramNotification.remove("android.progressMax");
    paramNotification.remove("android.progressIndeterminate");
    paramNotification.remove("android.chronometerCountDown");
    paramNotification.remove("android.colorized");
    paramNotification.remove("android.people.list");
    paramNotification.remove("android.people");
    paramNotification.remove("android.support.sortKey");
    paramNotification.remove("android.support.groupKey");
    paramNotification.remove("android.support.isGroupSummary");
    paramNotification.remove("android.support.localOnly");
    paramNotification.remove("android.support.actionExtras");
    Bundle localBundle = paramNotification.getBundle("android.car.EXTENSIONS");
    if (localBundle != null)
    {
      localBundle = new Bundle(localBundle);
      localBundle.remove("invisible_actions");
      paramNotification.putBundle("android.car.EXTENSIONS", localBundle);
    }
    if (paramStyle != null) {
      paramStyle.clearCompatExtraKeys(paramNotification);
    }
    return paramNotification;
  }
  
  @Nullable
  public static CharSequence limitCharSequenceLength(@Nullable CharSequence paramCharSequence)
  {
    if (paramCharSequence == null) {
      return paramCharSequence;
    }
    CharSequence localCharSequence = paramCharSequence;
    if (paramCharSequence.length() > 5120) {
      localCharSequence = paramCharSequence.subSequence(0, 5120);
    }
    return localCharSequence;
  }
  
  @Nullable
  private Bitmap reduceLargeIconSize(@Nullable Bitmap paramBitmap)
  {
    Object localObject = paramBitmap;
    if (paramBitmap != null) {
      if (Build.VERSION.SDK_INT >= 27)
      {
        localObject = paramBitmap;
      }
      else
      {
        localObject = mContext.getResources();
        int i = ((Resources)localObject).getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
        int j = ((Resources)localObject).getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
        if ((paramBitmap.getWidth() <= i) && (paramBitmap.getHeight() <= j)) {
          return paramBitmap;
        }
        double d = Math.min(i / Math.max(1, paramBitmap.getWidth()), j / Math.max(1, paramBitmap.getHeight()));
        localObject = Bitmap.createScaledBitmap(paramBitmap, (int)Math.ceil(paramBitmap.getWidth() * d), (int)Math.ceil(paramBitmap.getHeight() * d), true);
      }
    }
    return (Bitmap)localObject;
  }
  
  private void setFlag(int paramInt, boolean paramBoolean)
  {
    Notification localNotification;
    if (paramBoolean)
    {
      localNotification = mNotification;
      flags = (paramInt | flags);
    }
    else
    {
      localNotification = mNotification;
      flags = (paramInt & flags);
    }
  }
  
  private boolean useExistingRemoteView()
  {
    NotificationCompat.Style localStyle = mStyle;
    boolean bool;
    if ((localStyle != null) && (localStyle.displayCustomViewInline())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  @NonNull
  public Builder addAction(int paramInt, @Nullable CharSequence paramCharSequence, @Nullable PendingIntent paramPendingIntent)
  {
    mActions.add(new NotificationCompat.Action(paramInt, paramCharSequence, paramPendingIntent));
    return this;
  }
  
  @NonNull
  public Builder addAction(@Nullable NotificationCompat.Action paramAction)
  {
    if (paramAction != null) {
      mActions.add(paramAction);
    }
    return this;
  }
  
  @NonNull
  public Builder addExtras(@Nullable Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      Bundle localBundle = mExtras;
      if (localBundle == null) {
        mExtras = new Bundle(paramBundle);
      } else {
        localBundle.putAll(paramBundle);
      }
    }
    return this;
  }
  
  @NonNull
  @RequiresApi(21)
  public Builder addInvisibleAction(int paramInt, @Nullable CharSequence paramCharSequence, @Nullable PendingIntent paramPendingIntent)
  {
    mInvisibleActions.add(new NotificationCompat.Action(paramInt, paramCharSequence, paramPendingIntent));
    return this;
  }
  
  @NonNull
  @RequiresApi(21)
  public Builder addInvisibleAction(@Nullable NotificationCompat.Action paramAction)
  {
    if (paramAction != null) {
      mInvisibleActions.add(paramAction);
    }
    return this;
  }
  
  @NonNull
  public Builder addPerson(@Nullable Person paramPerson)
  {
    if (paramPerson != null) {
      mPersonList.add(paramPerson);
    }
    return this;
  }
  
  @Deprecated
  @NonNull
  public Builder addPerson(@Nullable String paramString)
  {
    if ((paramString != null) && (!paramString.isEmpty())) {
      mPeople.add(paramString);
    }
    return this;
  }
  
  @NonNull
  public Notification build()
  {
    return new NotificationCompatBuilder(this).build();
  }
  
  @NonNull
  public Builder clearActions()
  {
    mActions.clear();
    return this;
  }
  
  @NonNull
  public Builder clearInvisibleActions()
  {
    mInvisibleActions.clear();
    Bundle localBundle = mExtras.getBundle("android.car.EXTENSIONS");
    if (localBundle != null)
    {
      localBundle = new Bundle(localBundle);
      localBundle.remove("invisible_actions");
      mExtras.putBundle("android.car.EXTENSIONS", localBundle);
    }
    return this;
  }
  
  @NonNull
  public Builder clearPeople()
  {
    mPersonList.clear();
    mPeople.clear();
    return this;
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @Nullable
  public RemoteViews createBigContentView()
  {
    if ((mBigContentView != null) && (useExistingRemoteView())) {
      return mBigContentView;
    }
    Object localObject1 = new NotificationCompatBuilder(this);
    Object localObject2 = mStyle;
    if (localObject2 != null)
    {
      localObject2 = ((NotificationCompat.Style)localObject2).makeBigContentView((NotificationBuilderWithBuilderAccessor)localObject1);
      if (localObject2 != null) {
        return (RemoteViews)localObject2;
      }
    }
    localObject1 = ((NotificationCompatBuilder)localObject1).build();
    return Notification.Builder.recoverBuilder(mContext, (Notification)localObject1).createBigContentView();
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @Nullable
  public RemoteViews createContentView()
  {
    if ((mContentView != null) && (useExistingRemoteView())) {
      return mContentView;
    }
    Object localObject1 = new NotificationCompatBuilder(this);
    Object localObject2 = mStyle;
    if (localObject2 != null)
    {
      localObject2 = ((NotificationCompat.Style)localObject2).makeContentView((NotificationBuilderWithBuilderAccessor)localObject1);
      if (localObject2 != null) {
        return (RemoteViews)localObject2;
      }
    }
    localObject1 = ((NotificationCompatBuilder)localObject1).build();
    return Notification.Builder.recoverBuilder(mContext, (Notification)localObject1).createContentView();
  }
  
  @SuppressLint({"BuilderSetStyle"})
  @Nullable
  public RemoteViews createHeadsUpContentView()
  {
    if ((mHeadsUpContentView != null) && (useExistingRemoteView())) {
      return mHeadsUpContentView;
    }
    Object localObject1 = new NotificationCompatBuilder(this);
    Object localObject2 = mStyle;
    if (localObject2 != null)
    {
      localObject2 = ((NotificationCompat.Style)localObject2).makeHeadsUpContentView((NotificationBuilderWithBuilderAccessor)localObject1);
      if (localObject2 != null) {
        return (RemoteViews)localObject2;
      }
    }
    localObject1 = ((NotificationCompatBuilder)localObject1).build();
    return Notification.Builder.recoverBuilder(mContext, (Notification)localObject1).createHeadsUpContentView();
  }
  
  @NonNull
  public Builder extend(@NonNull NotificationCompat.Extender paramExtender)
  {
    paramExtender.extend(this);
    return this;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public RemoteViews getBigContentView()
  {
    return mBigContentView;
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public NotificationCompat.BubbleMetadata getBubbleMetadata()
  {
    return mBubbleMetadata;
  }
  
  @ColorInt
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public int getColor()
  {
    return mColor;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public RemoteViews getContentView()
  {
    return mContentView;
  }
  
  @NonNull
  public Bundle getExtras()
  {
    if (mExtras == null) {
      mExtras = new Bundle();
    }
    return mExtras;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public int getForegroundServiceBehavior()
  {
    return mFgsDeferBehavior;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public RemoteViews getHeadsUpContentView()
  {
    return mHeadsUpContentView;
  }
  
  @Deprecated
  @NonNull
  public Notification getNotification()
  {
    return build();
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public int getPriority()
  {
    return mPriority;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public long getWhenIfShowing()
  {
    long l;
    if (mShowWhen) {
      l = mNotification.when;
    } else {
      l = 0L;
    }
    return l;
  }
  
  @NonNull
  public Builder setAllowSystemGeneratedContextualActions(boolean paramBoolean)
  {
    mAllowSystemGeneratedContextualActions = paramBoolean;
    return this;
  }
  
  @NonNull
  public Builder setAutoCancel(boolean paramBoolean)
  {
    setFlag(16, paramBoolean);
    return this;
  }
  
  @NonNull
  public Builder setBadgeIconType(int paramInt)
  {
    mBadgeIcon = paramInt;
    return this;
  }
  
  @NonNull
  public Builder setBubbleMetadata(@Nullable NotificationCompat.BubbleMetadata paramBubbleMetadata)
  {
    mBubbleMetadata = paramBubbleMetadata;
    return this;
  }
  
  @NonNull
  public Builder setCategory(@Nullable String paramString)
  {
    mCategory = paramString;
    return this;
  }
  
  @NonNull
  public Builder setChannelId(@NonNull String paramString)
  {
    mChannelId = paramString;
    return this;
  }
  
  @NonNull
  @RequiresApi(24)
  public Builder setChronometerCountDown(boolean paramBoolean)
  {
    mChronometerCountDown = paramBoolean;
    getExtras().putBoolean("android.chronometerCountDown", paramBoolean);
    return this;
  }
  
  @NonNull
  public Builder setColor(@ColorInt int paramInt)
  {
    mColor = paramInt;
    return this;
  }
  
  @NonNull
  public Builder setColorized(boolean paramBoolean)
  {
    mColorized = paramBoolean;
    mColorizedSet = true;
    return this;
  }
  
  @NonNull
  public Builder setContent(@Nullable RemoteViews paramRemoteViews)
  {
    mNotification.contentView = paramRemoteViews;
    return this;
  }
  
  @NonNull
  public Builder setContentInfo(@Nullable CharSequence paramCharSequence)
  {
    mContentInfo = limitCharSequenceLength(paramCharSequence);
    return this;
  }
  
  @NonNull
  public Builder setContentIntent(@Nullable PendingIntent paramPendingIntent)
  {
    mContentIntent = paramPendingIntent;
    return this;
  }
  
  @NonNull
  public Builder setContentText(@Nullable CharSequence paramCharSequence)
  {
    mContentText = limitCharSequenceLength(paramCharSequence);
    return this;
  }
  
  @NonNull
  public Builder setContentTitle(@Nullable CharSequence paramCharSequence)
  {
    mContentTitle = limitCharSequenceLength(paramCharSequence);
    return this;
  }
  
  @NonNull
  public Builder setCustomBigContentView(@Nullable RemoteViews paramRemoteViews)
  {
    mBigContentView = paramRemoteViews;
    return this;
  }
  
  @NonNull
  public Builder setCustomContentView(@Nullable RemoteViews paramRemoteViews)
  {
    mContentView = paramRemoteViews;
    return this;
  }
  
  @NonNull
  public Builder setCustomHeadsUpContentView(@Nullable RemoteViews paramRemoteViews)
  {
    mHeadsUpContentView = paramRemoteViews;
    return this;
  }
  
  @NonNull
  public Builder setDefaults(int paramInt)
  {
    Notification localNotification = mNotification;
    defaults = paramInt;
    if ((paramInt & 0x4) != 0) {
      flags |= 0x1;
    }
    return this;
  }
  
  @NonNull
  public Builder setDeleteIntent(@Nullable PendingIntent paramPendingIntent)
  {
    mNotification.deleteIntent = paramPendingIntent;
    return this;
  }
  
  @NonNull
  public Builder setExtras(@Nullable Bundle paramBundle)
  {
    mExtras = paramBundle;
    return this;
  }
  
  @NonNull
  public Builder setForegroundServiceBehavior(int paramInt)
  {
    mFgsDeferBehavior = paramInt;
    return this;
  }
  
  @NonNull
  public Builder setFullScreenIntent(@Nullable PendingIntent paramPendingIntent, boolean paramBoolean)
  {
    mFullScreenIntent = paramPendingIntent;
    setFlag(128, paramBoolean);
    return this;
  }
  
  @NonNull
  public Builder setGroup(@Nullable String paramString)
  {
    mGroupKey = paramString;
    return this;
  }
  
  @NonNull
  public Builder setGroupAlertBehavior(int paramInt)
  {
    mGroupAlertBehavior = paramInt;
    return this;
  }
  
  @NonNull
  public Builder setGroupSummary(boolean paramBoolean)
  {
    mGroupSummary = paramBoolean;
    return this;
  }
  
  @NonNull
  public Builder setLargeIcon(@Nullable Bitmap paramBitmap)
  {
    mLargeIcon = reduceLargeIconSize(paramBitmap);
    return this;
  }
  
  @NonNull
  public Builder setLights(@ColorInt int paramInt1, int paramInt2, int paramInt3)
  {
    Notification localNotification = mNotification;
    ledARGB = paramInt1;
    ledOnMS = paramInt2;
    ledOffMS = paramInt3;
    if ((paramInt2 != 0) && (paramInt3 != 0)) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    }
    flags = (paramInt1 | flags & 0xFFFFFFFE);
    return this;
  }
  
  @NonNull
  public Builder setLocalOnly(boolean paramBoolean)
  {
    mLocalOnly = paramBoolean;
    return this;
  }
  
  @NonNull
  public Builder setLocusId(@Nullable LocusIdCompat paramLocusIdCompat)
  {
    mLocusId = paramLocusIdCompat;
    return this;
  }
  
  @Deprecated
  @NonNull
  public Builder setNotificationSilent()
  {
    mSilent = true;
    return this;
  }
  
  @NonNull
  public Builder setNumber(int paramInt)
  {
    mNumber = paramInt;
    return this;
  }
  
  @NonNull
  public Builder setOngoing(boolean paramBoolean)
  {
    setFlag(2, paramBoolean);
    return this;
  }
  
  @NonNull
  public Builder setOnlyAlertOnce(boolean paramBoolean)
  {
    setFlag(8, paramBoolean);
    return this;
  }
  
  @NonNull
  public Builder setPriority(int paramInt)
  {
    mPriority = paramInt;
    return this;
  }
  
  @NonNull
  public Builder setProgress(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    mProgressMax = paramInt1;
    mProgress = paramInt2;
    mProgressIndeterminate = paramBoolean;
    return this;
  }
  
  @NonNull
  public Builder setPublicVersion(@Nullable Notification paramNotification)
  {
    mPublicVersion = paramNotification;
    return this;
  }
  
  @NonNull
  public Builder setRemoteInputHistory(@Nullable CharSequence[] paramArrayOfCharSequence)
  {
    mRemoteInputHistory = paramArrayOfCharSequence;
    return this;
  }
  
  @NonNull
  public Builder setSettingsText(@Nullable CharSequence paramCharSequence)
  {
    mSettingsText = limitCharSequenceLength(paramCharSequence);
    return this;
  }
  
  @NonNull
  public Builder setShortcutId(@Nullable String paramString)
  {
    mShortcutId = paramString;
    return this;
  }
  
  @NonNull
  public Builder setShortcutInfo(@Nullable ShortcutInfoCompat paramShortcutInfoCompat)
  {
    if (paramShortcutInfoCompat == null) {
      return this;
    }
    mShortcutId = paramShortcutInfoCompat.getId();
    if (mLocusId == null) {
      if (paramShortcutInfoCompat.getLocusId() != null) {
        mLocusId = paramShortcutInfoCompat.getLocusId();
      } else if (paramShortcutInfoCompat.getId() != null) {
        mLocusId = new LocusIdCompat(paramShortcutInfoCompat.getId());
      }
    }
    if (mContentTitle == null) {
      setContentTitle(paramShortcutInfoCompat.getShortLabel());
    }
    return this;
  }
  
  @NonNull
  public Builder setShowWhen(boolean paramBoolean)
  {
    mShowWhen = paramBoolean;
    return this;
  }
  
  @NonNull
  public Builder setSilent(boolean paramBoolean)
  {
    mSilent = paramBoolean;
    return this;
  }
  
  @NonNull
  public Builder setSmallIcon(int paramInt)
  {
    mNotification.icon = paramInt;
    return this;
  }
  
  @NonNull
  public Builder setSmallIcon(int paramInt1, int paramInt2)
  {
    Notification localNotification = mNotification;
    icon = paramInt1;
    iconLevel = paramInt2;
    return this;
  }
  
  @NonNull
  @RequiresApi(23)
  public Builder setSmallIcon(@NonNull IconCompat paramIconCompat)
  {
    mSmallIcon = paramIconCompat.toIcon(mContext);
    return this;
  }
  
  @NonNull
  public Builder setSortKey(@Nullable String paramString)
  {
    mSortKey = paramString;
    return this;
  }
  
  @NonNull
  public Builder setSound(@Nullable Uri paramUri)
  {
    Notification localNotification = mNotification;
    sound = paramUri;
    audioStreamType = -1;
    audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
    return this;
  }
  
  @NonNull
  public Builder setSound(@Nullable Uri paramUri, int paramInt)
  {
    Notification localNotification = mNotification;
    sound = paramUri;
    audioStreamType = paramInt;
    audioAttributes = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(paramInt).build();
    return this;
  }
  
  @NonNull
  public Builder setStyle(@Nullable NotificationCompat.Style paramStyle)
  {
    if (mStyle != paramStyle)
    {
      mStyle = paramStyle;
      if (paramStyle != null) {
        paramStyle.setBuilder(this);
      }
    }
    return this;
  }
  
  @NonNull
  public Builder setSubText(@Nullable CharSequence paramCharSequence)
  {
    mSubText = limitCharSequenceLength(paramCharSequence);
    return this;
  }
  
  @NonNull
  public Builder setTicker(@Nullable CharSequence paramCharSequence)
  {
    mNotification.tickerText = limitCharSequenceLength(paramCharSequence);
    return this;
  }
  
  @Deprecated
  @NonNull
  public Builder setTicker(@Nullable CharSequence paramCharSequence, @Nullable RemoteViews paramRemoteViews)
  {
    mNotification.tickerText = limitCharSequenceLength(paramCharSequence);
    mTickerView = paramRemoteViews;
    return this;
  }
  
  @NonNull
  public Builder setTimeoutAfter(long paramLong)
  {
    mTimeout = paramLong;
    return this;
  }
  
  @NonNull
  public Builder setUsesChronometer(boolean paramBoolean)
  {
    mUseChronometer = paramBoolean;
    return this;
  }
  
  @NonNull
  public Builder setVibrate(@Nullable long[] paramArrayOfLong)
  {
    mNotification.vibrate = paramArrayOfLong;
    return this;
  }
  
  @NonNull
  public Builder setVisibility(int paramInt)
  {
    mVisibility = paramInt;
    return this;
  }
  
  @NonNull
  public Builder setWhen(long paramLong)
  {
    mNotification.when = paramLong;
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationCompat.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */