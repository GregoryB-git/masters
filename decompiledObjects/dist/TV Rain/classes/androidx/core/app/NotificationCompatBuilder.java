package androidx.core.app;

import a3;
import android.app.Notification;
import android.app.Notification.Action.Builder;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArraySet;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o3;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
class NotificationCompatBuilder
  implements NotificationBuilderWithBuilderAccessor
{
  private final List<Bundle> mActionExtrasList = new ArrayList();
  private RemoteViews mBigContentView;
  private final Notification.Builder mBuilder;
  private final NotificationCompat.Builder mBuilderCompat;
  private RemoteViews mContentView;
  private final Context mContext;
  private final Bundle mExtras = new Bundle();
  private int mGroupAlertBehavior;
  private RemoteViews mHeadsUpContentView;
  
  public NotificationCompatBuilder(NotificationCompat.Builder paramBuilder)
  {
    mBuilderCompat = paramBuilder;
    mContext = mContext;
    if (Build.VERSION.SDK_INT >= 26) {
      mBuilder = new Notification.Builder(mContext, mChannelId);
    } else {
      mBuilder = new Notification.Builder(mContext);
    }
    Notification localNotification = mNotification;
    Object localObject1 = mBuilder.setWhen(when).setSmallIcon(icon, iconLevel).setContent(contentView).setTicker(tickerText, mTickerView).setVibrate(vibrate).setLights(ledARGB, ledOnMS, ledOffMS);
    boolean bool;
    if ((flags & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    localObject1 = ((Notification.Builder)localObject1).setOngoing(bool);
    if ((flags & 0x8) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    localObject1 = ((Notification.Builder)localObject1).setOnlyAlertOnce(bool);
    if ((flags & 0x10) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    Object localObject2 = ((Notification.Builder)localObject1).setAutoCancel(bool).setDefaults(defaults).setContentTitle(mContentTitle).setContentText(mContentText).setContentInfo(mContentInfo).setContentIntent(mContentIntent).setDeleteIntent(deleteIntent);
    localObject1 = mFullScreenIntent;
    if ((flags & 0x80) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    ((Notification.Builder)localObject2).setFullScreenIntent((PendingIntent)localObject1, bool).setLargeIcon(mLargeIcon).setNumber(mNumber).setProgress(mProgressMax, mProgress, mProgressIndeterminate);
    mBuilder.setSubText(mSubText).setUsesChronometer(mUseChronometer).setPriority(mPriority);
    localObject1 = mActions.iterator();
    while (((Iterator)localObject1).hasNext()) {
      addAction((NotificationCompat.Action)((Iterator)localObject1).next());
    }
    localObject1 = mExtras;
    if (localObject1 != null) {
      mExtras.putAll((Bundle)localObject1);
    }
    int i = Build.VERSION.SDK_INT;
    mContentView = mContentView;
    mBigContentView = mBigContentView;
    mBuilder.setShowWhen(mShowWhen);
    mBuilder.setLocalOnly(mLocalOnly).setGroup(mGroupKey).setGroupSummary(mGroupSummary).setSortKey(mSortKey);
    mGroupAlertBehavior = mGroupAlertBehavior;
    mBuilder.setCategory(mCategory).setColor(mColor).setVisibility(mVisibility).setPublicVersion(mPublicVersion).setSound(sound, audioAttributes);
    if (i < 28) {
      localObject1 = combineLists(getPeople(mPersonList), mPeople);
    } else {
      localObject1 = mPeople;
    }
    if ((localObject1 != null) && (!((List)localObject1).isEmpty()))
    {
      localObject2 = ((List)localObject1).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (String)((Iterator)localObject2).next();
        mBuilder.addPerson((String)localObject1);
      }
    }
    mHeadsUpContentView = mHeadsUpContentView;
    if (mInvisibleActions.size() > 0)
    {
      localObject2 = paramBuilder.getExtras().getBundle("android.car.EXTENSIONS");
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = new Bundle();
      }
      localObject2 = new Bundle((Bundle)localObject1);
      Bundle localBundle = new Bundle();
      for (i = 0; i < mInvisibleActions.size(); i++) {
        localBundle.putBundle(Integer.toString(i), NotificationCompatJellybean.getBundleForAction((NotificationCompat.Action)mInvisibleActions.get(i)));
      }
      ((Bundle)localObject1).putBundle("invisible_actions", localBundle);
      ((Bundle)localObject2).putBundle("invisible_actions", localBundle);
      paramBuilder.getExtras().putBundle("android.car.EXTENSIONS", (Bundle)localObject1);
      mExtras.putBundle("android.car.EXTENSIONS", (Bundle)localObject2);
    }
    i = Build.VERSION.SDK_INT;
    localObject1 = mSmallIcon;
    if (localObject1 != null) {
      mBuilder.setSmallIcon((Icon)localObject1);
    }
    mBuilder.setExtras(mExtras).setRemoteInputHistory(mRemoteInputHistory);
    localObject1 = mContentView;
    if (localObject1 != null) {
      mBuilder.setCustomContentView((RemoteViews)localObject1);
    }
    localObject1 = mBigContentView;
    if (localObject1 != null) {
      mBuilder.setCustomBigContentView((RemoteViews)localObject1);
    }
    localObject1 = mHeadsUpContentView;
    if (localObject1 != null) {
      mBuilder.setCustomHeadsUpContentView((RemoteViews)localObject1);
    }
    if (i >= 26)
    {
      mBuilder.setBadgeIconType(mBadgeIcon).setSettingsText(mSettingsText).setShortcutId(mShortcutId).setTimeoutAfter(mTimeout).setGroupAlertBehavior(mGroupAlertBehavior);
      if (mColorizedSet) {
        mBuilder.setColorized(mColorized);
      }
      if (!TextUtils.isEmpty(mChannelId)) {
        mBuilder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
      }
    }
    if (i >= 28)
    {
      localObject1 = mPersonList.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Person)((Iterator)localObject1).next();
        a3.n(mBuilder, ((Person)localObject2).toAndroidPerson());
      }
    }
    i = Build.VERSION.SDK_INT;
    if (i >= 29)
    {
      o3.p(mBuilder, mAllowSystemGeneratedContextualActions);
      o3.n(mBuilder, NotificationCompat.BubbleMetadata.toPlatform(mBubbleMetadata));
      localObject1 = mLocusId;
      if (localObject1 != null) {
        o3.o(mBuilder, ((LocusIdCompat)localObject1).toLocusId());
      }
    }
    int j;
    if (i >= 31)
    {
      j = mFgsDeferBehavior;
      if (j != 0) {
        g.k(mBuilder, j);
      }
    }
    if (mSilent)
    {
      if (mBuilderCompat.mGroupSummary) {
        mGroupAlertBehavior = 2;
      } else {
        mGroupAlertBehavior = 1;
      }
      mBuilder.setVibrate(null);
      mBuilder.setSound(null);
      j = defaults & 0xFFFFFFFE & 0xFFFFFFFD;
      defaults = j;
      mBuilder.setDefaults(j);
      if (i >= 26)
      {
        if (TextUtils.isEmpty(mBuilderCompat.mGroupKey)) {
          mBuilder.setGroup("silent");
        }
        mBuilder.setGroupAlertBehavior(mGroupAlertBehavior);
      }
    }
  }
  
  private void addAction(NotificationCompat.Action paramAction)
  {
    Object localObject = paramAction.getIconCompat();
    if (localObject != null) {
      localObject = ((IconCompat)localObject).toIcon();
    } else {
      localObject = null;
    }
    Notification.Action.Builder localBuilder = new Notification.Action.Builder((Icon)localObject, paramAction.getTitle(), paramAction.getActionIntent());
    if (paramAction.getRemoteInputs() != null)
    {
      localObject = RemoteInput.fromCompat(paramAction.getRemoteInputs());
      int i = localObject.length;
      for (j = 0; j < i; j++) {
        localBuilder.addRemoteInput(localObject[j]);
      }
    }
    if (paramAction.getExtras() != null) {
      localObject = new Bundle(paramAction.getExtras());
    } else {
      localObject = new Bundle();
    }
    ((BaseBundle)localObject).putBoolean("android.support.allowGeneratedReplies", paramAction.getAllowGeneratedReplies());
    int j = Build.VERSION.SDK_INT;
    localBuilder.setAllowGeneratedReplies(paramAction.getAllowGeneratedReplies());
    ((BaseBundle)localObject).putInt("android.support.action.semanticAction", paramAction.getSemanticAction());
    if (j >= 28) {
      a3.m(localBuilder, paramAction.getSemanticAction());
    }
    if (j >= 29) {
      o3.m(localBuilder, paramAction.isContextual());
    }
    if (j >= 31) {
      g.g(localBuilder, paramAction.isAuthenticationRequired());
    }
    ((BaseBundle)localObject).putBoolean("android.support.action.showsUserInterface", paramAction.getShowsUserInterface());
    localBuilder.addExtras((Bundle)localObject);
    mBuilder.addAction(localBuilder.build());
  }
  
  @Nullable
  private static List<String> combineLists(@Nullable List<String> paramList1, @Nullable List<String> paramList2)
  {
    if (paramList1 == null) {
      return paramList2;
    }
    if (paramList2 == null) {
      return paramList1;
    }
    int i = paramList1.size();
    ArraySet localArraySet = new ArraySet(paramList2.size() + i);
    localArraySet.addAll(paramList1);
    localArraySet.addAll(paramList2);
    return new ArrayList(localArraySet);
  }
  
  @Nullable
  private static List<String> getPeople(@Nullable List<Person> paramList)
  {
    if (paramList == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList(paramList.size());
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(((Person)paramList.next()).resolveToLegacyUri());
    }
    return localArrayList;
  }
  
  private void removeSoundAndVibration(Notification paramNotification)
  {
    sound = null;
    vibrate = null;
    defaults = (defaults & 0xFFFFFFFE & 0xFFFFFFFD);
  }
  
  public Notification build()
  {
    NotificationCompat.Style localStyle = mBuilderCompat.mStyle;
    if (localStyle != null) {
      localStyle.apply(this);
    }
    Object localObject;
    if (localStyle != null) {
      localObject = localStyle.makeContentView(this);
    } else {
      localObject = null;
    }
    Notification localNotification = buildInternal();
    if (localObject != null)
    {
      contentView = ((RemoteViews)localObject);
    }
    else
    {
      localObject = mBuilderCompat.mContentView;
      if (localObject != null) {
        contentView = ((RemoteViews)localObject);
      }
    }
    if (localStyle != null)
    {
      localObject = localStyle.makeBigContentView(this);
      if (localObject != null) {
        bigContentView = ((RemoteViews)localObject);
      }
    }
    if (localStyle != null)
    {
      localObject = mBuilderCompat.mStyle.makeHeadsUpContentView(this);
      if (localObject != null) {
        headsUpContentView = ((RemoteViews)localObject);
      }
    }
    if (localStyle != null)
    {
      localObject = NotificationCompat.getExtras(localNotification);
      if (localObject != null) {
        localStyle.addCompatExtras((Bundle)localObject);
      }
    }
    return localNotification;
  }
  
  public Notification buildInternal()
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return mBuilder.build();
    }
    Notification localNotification = mBuilder.build();
    if (mGroupAlertBehavior != 0)
    {
      if ((localNotification.getGroup() != null) && ((flags & 0x200) != 0) && (mGroupAlertBehavior == 2)) {
        removeSoundAndVibration(localNotification);
      }
      if ((localNotification.getGroup() != null) && ((flags & 0x200) == 0) && (mGroupAlertBehavior == 1)) {
        removeSoundAndVibration(localNotification);
      }
    }
    return localNotification;
  }
  
  public Notification.Builder getBuilder()
  {
    return mBuilder;
  }
  
  public Context getContext()
  {
    return mContext;
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationCompatBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */