package androidx.core.app;

import a3;
import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.Action.Builder;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.Notification.BubbleMetadata;
import android.app.Notification.BubbleMetadata.Builder;
import android.app.Notification.Builder;
import android.app.Notification.DecoratedCustomViewStyle;
import android.app.Notification.InboxStyle;
import android.app.Notification.MessagingStyle;
import android.app.Notification.MessagingStyle.Message;
import android.app.Notification.Style;
import android.app.PendingIntent;
import android.app.RemoteInput.Builder;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes.Builder;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.R.color;
import androidx.core.R.dimen;
import androidx.core.R.drawable;
import androidx.core.R.id;
import androidx.core.R.integer;
import androidx.core.R.layout;
import androidx.core.R.string;
import androidx.core.content.LocusIdCompat;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.text.BidiFormatter;
import d;
import e;
import g;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import u2;

public class NotificationCompat
{
  public static final int BADGE_ICON_LARGE = 2;
  public static final int BADGE_ICON_NONE = 0;
  public static final int BADGE_ICON_SMALL = 1;
  public static final String CATEGORY_ALARM = "alarm";
  public static final String CATEGORY_CALL = "call";
  public static final String CATEGORY_EMAIL = "email";
  public static final String CATEGORY_ERROR = "err";
  public static final String CATEGORY_EVENT = "event";
  public static final String CATEGORY_LOCATION_SHARING = "location_sharing";
  public static final String CATEGORY_MESSAGE = "msg";
  public static final String CATEGORY_MISSED_CALL = "missed_call";
  public static final String CATEGORY_NAVIGATION = "navigation";
  public static final String CATEGORY_PROGRESS = "progress";
  public static final String CATEGORY_PROMO = "promo";
  public static final String CATEGORY_RECOMMENDATION = "recommendation";
  public static final String CATEGORY_REMINDER = "reminder";
  public static final String CATEGORY_SERVICE = "service";
  public static final String CATEGORY_SOCIAL = "social";
  public static final String CATEGORY_STATUS = "status";
  public static final String CATEGORY_STOPWATCH = "stopwatch";
  public static final String CATEGORY_SYSTEM = "sys";
  public static final String CATEGORY_TRANSPORT = "transport";
  public static final String CATEGORY_WORKOUT = "workout";
  @ColorInt
  public static final int COLOR_DEFAULT = 0;
  public static final int DEFAULT_ALL = -1;
  public static final int DEFAULT_LIGHTS = 4;
  public static final int DEFAULT_SOUND = 1;
  public static final int DEFAULT_VIBRATE = 2;
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_BIG_TEXT = "android.bigText";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_COLORIZED = "android.colorized";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
  public static final String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_INFO_TEXT = "android.infoText";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_LARGE_ICON = "android.largeIcon";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_MESSAGES = "android.messages";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";
  @Deprecated
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_PEOPLE = "android.people";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_PEOPLE_LIST = "android.people.list";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_PICTURE = "android.picture";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_PICTURE_ICON = "android.pictureIcon";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_PROGRESS = "android.progress";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_PROGRESS_MAX = "android.progressMax";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_SHOW_WHEN = "android.showWhen";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_SMALL_ICON = "android.icon";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_SUB_TEXT = "android.subText";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_TEMPLATE = "android.template";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_TEXT = "android.text";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_TEXT_LINES = "android.textLines";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_TITLE = "android.title";
  @SuppressLint({"ActionValue"})
  public static final String EXTRA_TITLE_BIG = "android.title.big";
  public static final int FLAG_AUTO_CANCEL = 16;
  public static final int FLAG_BUBBLE = 4096;
  public static final int FLAG_FOREGROUND_SERVICE = 64;
  public static final int FLAG_GROUP_SUMMARY = 512;
  @Deprecated
  public static final int FLAG_HIGH_PRIORITY = 128;
  public static final int FLAG_INSISTENT = 4;
  public static final int FLAG_LOCAL_ONLY = 256;
  public static final int FLAG_NO_CLEAR = 32;
  public static final int FLAG_ONGOING_EVENT = 2;
  public static final int FLAG_ONLY_ALERT_ONCE = 8;
  public static final int FLAG_SHOW_LIGHTS = 1;
  public static final int FOREGROUND_SERVICE_DEFAULT = 0;
  public static final int FOREGROUND_SERVICE_DEFERRED = 2;
  public static final int FOREGROUND_SERVICE_IMMEDIATE = 1;
  public static final int GROUP_ALERT_ALL = 0;
  public static final int GROUP_ALERT_CHILDREN = 2;
  public static final int GROUP_ALERT_SUMMARY = 1;
  public static final String GROUP_KEY_SILENT = "silent";
  @SuppressLint({"ActionValue"})
  public static final String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
  public static final int PRIORITY_DEFAULT = 0;
  public static final int PRIORITY_HIGH = 1;
  public static final int PRIORITY_LOW = -1;
  public static final int PRIORITY_MAX = 2;
  public static final int PRIORITY_MIN = -2;
  public static final int STREAM_DEFAULT = -1;
  public static final int VISIBILITY_PRIVATE = 0;
  public static final int VISIBILITY_PUBLIC = 1;
  public static final int VISIBILITY_SECRET = -1;
  
  @Nullable
  public static Action getAction(@NonNull Notification paramNotification, int paramInt)
  {
    return getActionCompatFromAction(actions[paramInt]);
  }
  
  @NonNull
  @RequiresApi(20)
  public static Action getActionCompatFromAction(@NonNull Notification.Action paramAction)
  {
    android.app.RemoteInput[] arrayOfRemoteInput = paramAction.getRemoteInputs();
    IconCompat localIconCompat = null;
    boolean bool1 = false;
    RemoteInput[] arrayOfRemoteInput1;
    int i;
    boolean bool2;
    if (arrayOfRemoteInput == null)
    {
      arrayOfRemoteInput1 = null;
    }
    else
    {
      arrayOfRemoteInput1 = new RemoteInput[arrayOfRemoteInput.length];
      for (i = 0; i < arrayOfRemoteInput.length; i++)
      {
        android.app.RemoteInput localRemoteInput = arrayOfRemoteInput[i];
        String str = localRemoteInput.getResultKey();
        CharSequence localCharSequence = localRemoteInput.getLabel();
        CharSequence[] arrayOfCharSequence = localRemoteInput.getChoices();
        bool2 = localRemoteInput.getAllowFreeFormInput();
        if (Build.VERSION.SDK_INT >= 29) {
          j = e.a(localRemoteInput);
        } else {
          j = 0;
        }
        arrayOfRemoteInput1[i] = new RemoteInput(str, localCharSequence, arrayOfCharSequence, bool2, j, localRemoteInput.getExtras(), null);
      }
    }
    int j = Build.VERSION.SDK_INT;
    if ((!paramAction.getExtras().getBoolean("android.support.allowGeneratedReplies")) && (!paramAction.getAllowGeneratedReplies())) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    boolean bool3 = paramAction.getExtras().getBoolean("android.support.action.showsUserInterface", true);
    if (j >= 28) {
      i = a3.a(paramAction);
    } else {
      i = paramAction.getExtras().getInt("android.support.action.semanticAction", 0);
    }
    boolean bool4;
    if (j >= 29) {
      bool4 = e.u(paramAction);
    } else {
      bool4 = false;
    }
    if (j >= 31) {
      bool1 = g.q(paramAction);
    }
    if (paramAction.getIcon() == null)
    {
      j = icon;
      if (j != 0) {
        return new Action(j, title, actionIntent, paramAction.getExtras(), arrayOfRemoteInput1, null, bool2, i, bool3, bool4, bool1);
      }
    }
    if (paramAction.getIcon() != null) {
      localIconCompat = IconCompat.createFromIconOrNullIfZeroResId(paramAction.getIcon());
    }
    return new Action(localIconCompat, title, actionIntent, paramAction.getExtras(), arrayOfRemoteInput1, null, bool2, i, bool3, bool4, bool1);
  }
  
  public static int getActionCount(@NonNull Notification paramNotification)
  {
    paramNotification = actions;
    int i;
    if (paramNotification != null) {
      i = paramNotification.length;
    } else {
      i = 0;
    }
    return i;
  }
  
  public static boolean getAllowSystemGeneratedContextualActions(@NonNull Notification paramNotification)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      return e.v(paramNotification);
    }
    return false;
  }
  
  public static boolean getAutoCancel(@NonNull Notification paramNotification)
  {
    boolean bool;
    if ((flags & 0x10) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static int getBadgeIconType(@NonNull Notification paramNotification)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return u2.b(paramNotification);
    }
    return 0;
  }
  
  @Nullable
  public static BubbleMetadata getBubbleMetadata(@NonNull Notification paramNotification)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      return BubbleMetadata.fromPlatform(e.b(paramNotification));
    }
    return null;
  }
  
  @Nullable
  public static String getCategory(@NonNull Notification paramNotification)
  {
    return category;
  }
  
  @Nullable
  public static String getChannelId(@NonNull Notification paramNotification)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return u2.B(paramNotification);
    }
    return null;
  }
  
  public static int getColor(@NonNull Notification paramNotification)
  {
    return color;
  }
  
  @Nullable
  @RequiresApi(19)
  public static CharSequence getContentInfo(@NonNull Notification paramNotification)
  {
    return extras.getCharSequence("android.infoText");
  }
  
  @Nullable
  @RequiresApi(19)
  public static CharSequence getContentText(@NonNull Notification paramNotification)
  {
    return extras.getCharSequence("android.text");
  }
  
  @Nullable
  @RequiresApi(19)
  public static CharSequence getContentTitle(@NonNull Notification paramNotification)
  {
    return extras.getCharSequence("android.title");
  }
  
  @Nullable
  public static Bundle getExtras(@NonNull Notification paramNotification)
  {
    return extras;
  }
  
  @Nullable
  public static String getGroup(@NonNull Notification paramNotification)
  {
    return paramNotification.getGroup();
  }
  
  public static int getGroupAlertBehavior(@NonNull Notification paramNotification)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return u2.w(paramNotification);
    }
    return 0;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static boolean getHighPriority(@NonNull Notification paramNotification)
  {
    boolean bool;
    if ((flags & 0x80) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @NonNull
  @RequiresApi(21)
  public static List<Action> getInvisibleActions(@NonNull Notification paramNotification)
  {
    ArrayList localArrayList = new ArrayList();
    paramNotification = extras.getBundle("android.car.EXTENSIONS");
    if (paramNotification == null) {
      return localArrayList;
    }
    paramNotification = paramNotification.getBundle("invisible_actions");
    if (paramNotification != null) {
      for (int i = 0; i < paramNotification.size(); i++) {
        localArrayList.add(NotificationCompatJellybean.getActionFromBundle(paramNotification.getBundle(Integer.toString(i))));
      }
    }
    return localArrayList;
  }
  
  public static boolean getLocalOnly(@NonNull Notification paramNotification)
  {
    boolean bool;
    if ((flags & 0x100) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Nullable
  public static LocusIdCompat getLocusId(@NonNull Notification paramNotification)
  {
    int i = Build.VERSION.SDK_INT;
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (i >= 29)
    {
      paramNotification = e.d(paramNotification);
      if (paramNotification == null) {
        localObject2 = localObject1;
      } else {
        localObject2 = LocusIdCompat.toLocusIdCompat(paramNotification);
      }
    }
    return (LocusIdCompat)localObject2;
  }
  
  @NonNull
  public static Notification[] getNotificationArrayFromBundle(@NonNull Bundle paramBundle, @NonNull String paramString)
  {
    Parcelable[] arrayOfParcelable = paramBundle.getParcelableArray(paramString);
    if ((!(arrayOfParcelable instanceof Notification[])) && (arrayOfParcelable != null))
    {
      Notification[] arrayOfNotification = new Notification[arrayOfParcelable.length];
      for (int i = 0; i < arrayOfParcelable.length; i++) {
        arrayOfNotification[i] = ((Notification)arrayOfParcelable[i]);
      }
      paramBundle.putParcelableArray(paramString, arrayOfNotification);
      return arrayOfNotification;
    }
    return (Notification[])arrayOfParcelable;
  }
  
  public static boolean getOngoing(@NonNull Notification paramNotification)
  {
    boolean bool;
    if ((flags & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean getOnlyAlertOnce(@NonNull Notification paramNotification)
  {
    boolean bool;
    if ((flags & 0x8) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @NonNull
  public static List<Person> getPeople(@NonNull Notification paramNotification)
  {
    ArrayList localArrayList = new ArrayList();
    if (Build.VERSION.SDK_INT >= 28)
    {
      paramNotification = extras.getParcelableArrayList("android.people.list");
      if ((paramNotification != null) && (!paramNotification.isEmpty()))
      {
        paramNotification = paramNotification.iterator();
        while (paramNotification.hasNext()) {
          localArrayList.add(Person.fromAndroidPerson((android.app.Person)paramNotification.next()));
        }
      }
    }
    else
    {
      String[] arrayOfString = extras.getStringArray("android.people");
      if ((arrayOfString != null) && (arrayOfString.length != 0))
      {
        int i = arrayOfString.length;
        for (int j = 0; j < i; j++)
        {
          paramNotification = arrayOfString[j];
          localArrayList.add(new Person.Builder().setUri(paramNotification).build());
        }
      }
    }
    return localArrayList;
  }
  
  @Nullable
  public static Notification getPublicVersion(@NonNull Notification paramNotification)
  {
    return publicVersion;
  }
  
  @Nullable
  public static CharSequence getSettingsText(@NonNull Notification paramNotification)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return u2.m(paramNotification);
    }
    return null;
  }
  
  @Nullable
  public static String getShortcutId(@NonNull Notification paramNotification)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return u2.o(paramNotification);
    }
    return null;
  }
  
  @RequiresApi(19)
  public static boolean getShowWhen(@NonNull Notification paramNotification)
  {
    return extras.getBoolean("android.showWhen");
  }
  
  @Nullable
  public static String getSortKey(@NonNull Notification paramNotification)
  {
    return paramNotification.getSortKey();
  }
  
  @Nullable
  @RequiresApi(19)
  public static CharSequence getSubText(@NonNull Notification paramNotification)
  {
    return extras.getCharSequence("android.subText");
  }
  
  public static long getTimeoutAfter(@NonNull Notification paramNotification)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return u2.d(paramNotification);
    }
    return 0L;
  }
  
  @RequiresApi(19)
  public static boolean getUsesChronometer(@NonNull Notification paramNotification)
  {
    return extras.getBoolean("android.showChronometer");
  }
  
  public static int getVisibility(@NonNull Notification paramNotification)
  {
    return visibility;
  }
  
  public static boolean isGroupSummary(@NonNull Notification paramNotification)
  {
    boolean bool;
    if ((flags & 0x200) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static class Action
  {
    public static final String EXTRA_SEMANTIC_ACTION = "android.support.action.semanticAction";
    public static final String EXTRA_SHOWS_USER_INTERFACE = "android.support.action.showsUserInterface";
    public static final int SEMANTIC_ACTION_ARCHIVE = 5;
    public static final int SEMANTIC_ACTION_CALL = 10;
    public static final int SEMANTIC_ACTION_DELETE = 4;
    public static final int SEMANTIC_ACTION_MARK_AS_READ = 2;
    public static final int SEMANTIC_ACTION_MARK_AS_UNREAD = 3;
    public static final int SEMANTIC_ACTION_MUTE = 6;
    public static final int SEMANTIC_ACTION_NONE = 0;
    public static final int SEMANTIC_ACTION_REPLY = 1;
    public static final int SEMANTIC_ACTION_THUMBS_DOWN = 9;
    public static final int SEMANTIC_ACTION_THUMBS_UP = 8;
    public static final int SEMANTIC_ACTION_UNMUTE = 7;
    public PendingIntent actionIntent;
    @Deprecated
    public int icon;
    private boolean mAllowGeneratedReplies;
    private boolean mAuthenticationRequired;
    private final RemoteInput[] mDataOnlyRemoteInputs;
    public final Bundle mExtras;
    @Nullable
    private IconCompat mIcon;
    private final boolean mIsContextual;
    private final RemoteInput[] mRemoteInputs;
    private final int mSemanticAction;
    public boolean mShowsUserInterface = true;
    public CharSequence title;
    
    public Action(int paramInt, @Nullable CharSequence paramCharSequence, @Nullable PendingIntent paramPendingIntent)
    {
      this(localIconCompat, paramCharSequence, paramPendingIntent);
    }
    
    public Action(int paramInt1, @Nullable CharSequence paramCharSequence, @Nullable PendingIntent paramPendingIntent, @Nullable Bundle paramBundle, @Nullable RemoteInput[] paramArrayOfRemoteInput1, @Nullable RemoteInput[] paramArrayOfRemoteInput2, boolean paramBoolean1, int paramInt2, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
    {
      this(localIconCompat, paramCharSequence, paramPendingIntent, paramBundle, paramArrayOfRemoteInput1, paramArrayOfRemoteInput2, paramBoolean1, paramInt2, paramBoolean2, paramBoolean3, paramBoolean4);
    }
    
    public Action(@Nullable IconCompat paramIconCompat, @Nullable CharSequence paramCharSequence, @Nullable PendingIntent paramPendingIntent)
    {
      this(paramIconCompat, paramCharSequence, paramPendingIntent, new Bundle(), null, null, true, 0, true, false, false);
    }
    
    public Action(@Nullable IconCompat paramIconCompat, @Nullable CharSequence paramCharSequence, @Nullable PendingIntent paramPendingIntent, @Nullable Bundle paramBundle, @Nullable RemoteInput[] paramArrayOfRemoteInput1, @Nullable RemoteInput[] paramArrayOfRemoteInput2, boolean paramBoolean1, int paramInt, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
    {
      mIcon = paramIconCompat;
      if ((paramIconCompat != null) && (paramIconCompat.getType() == 2)) {
        icon = paramIconCompat.getResId();
      }
      title = NotificationCompat.Builder.limitCharSequenceLength(paramCharSequence);
      actionIntent = paramPendingIntent;
      if (paramBundle == null) {
        paramBundle = new Bundle();
      }
      mExtras = paramBundle;
      mRemoteInputs = paramArrayOfRemoteInput1;
      mDataOnlyRemoteInputs = paramArrayOfRemoteInput2;
      mAllowGeneratedReplies = paramBoolean1;
      mSemanticAction = paramInt;
      mShowsUserInterface = paramBoolean2;
      mIsContextual = paramBoolean3;
      mAuthenticationRequired = paramBoolean4;
    }
    
    @Nullable
    public PendingIntent getActionIntent()
    {
      return actionIntent;
    }
    
    public boolean getAllowGeneratedReplies()
    {
      return mAllowGeneratedReplies;
    }
    
    @Nullable
    public RemoteInput[] getDataOnlyRemoteInputs()
    {
      return mDataOnlyRemoteInputs;
    }
    
    @NonNull
    public Bundle getExtras()
    {
      return mExtras;
    }
    
    @Deprecated
    public int getIcon()
    {
      return icon;
    }
    
    @Nullable
    public IconCompat getIconCompat()
    {
      if (mIcon == null)
      {
        int i = icon;
        if (i != 0) {
          mIcon = IconCompat.createWithResource(null, "", i);
        }
      }
      return mIcon;
    }
    
    @Nullable
    public RemoteInput[] getRemoteInputs()
    {
      return mRemoteInputs;
    }
    
    public int getSemanticAction()
    {
      return mSemanticAction;
    }
    
    public boolean getShowsUserInterface()
    {
      return mShowsUserInterface;
    }
    
    @Nullable
    public CharSequence getTitle()
    {
      return title;
    }
    
    public boolean isAuthenticationRequired()
    {
      return mAuthenticationRequired;
    }
    
    public boolean isContextual()
    {
      return mIsContextual;
    }
    
    public static final class Builder
    {
      private boolean mAllowGeneratedReplies = true;
      private boolean mAuthenticationRequired;
      private final Bundle mExtras;
      private final IconCompat mIcon;
      private final PendingIntent mIntent;
      private boolean mIsContextual;
      private ArrayList<RemoteInput> mRemoteInputs;
      private int mSemanticAction;
      private boolean mShowsUserInterface = true;
      private final CharSequence mTitle;
      
      public Builder(int paramInt, @Nullable CharSequence paramCharSequence, @Nullable PendingIntent paramPendingIntent)
      {
        this(localIconCompat, paramCharSequence, paramPendingIntent, new Bundle(), null, true, 0, true, false, false);
      }
      
      public Builder(@NonNull NotificationCompat.Action paramAction)
      {
        this(paramAction.getIconCompat(), title, actionIntent, new Bundle(mExtras), paramAction.getRemoteInputs(), paramAction.getAllowGeneratedReplies(), paramAction.getSemanticAction(), mShowsUserInterface, paramAction.isContextual(), paramAction.isAuthenticationRequired());
      }
      
      public Builder(@Nullable IconCompat paramIconCompat, @Nullable CharSequence paramCharSequence, @Nullable PendingIntent paramPendingIntent)
      {
        this(paramIconCompat, paramCharSequence, paramPendingIntent, new Bundle(), null, true, 0, true, false, false);
      }
      
      private Builder(@Nullable IconCompat paramIconCompat, @Nullable CharSequence paramCharSequence, @Nullable PendingIntent paramPendingIntent, @NonNull Bundle paramBundle, @Nullable RemoteInput[] paramArrayOfRemoteInput, boolean paramBoolean1, int paramInt, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
      {
        mIcon = paramIconCompat;
        mTitle = NotificationCompat.Builder.limitCharSequenceLength(paramCharSequence);
        mIntent = paramPendingIntent;
        mExtras = paramBundle;
        if (paramArrayOfRemoteInput == null) {
          paramIconCompat = null;
        } else {
          paramIconCompat = new ArrayList(Arrays.asList(paramArrayOfRemoteInput));
        }
        mRemoteInputs = paramIconCompat;
        mAllowGeneratedReplies = paramBoolean1;
        mSemanticAction = paramInt;
        mShowsUserInterface = paramBoolean2;
        mIsContextual = paramBoolean3;
        mAuthenticationRequired = paramBoolean4;
      }
      
      private void checkContextualActionNullFields()
      {
        if (!mIsContextual) {
          return;
        }
        if (mIntent != null) {
          return;
        }
        throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
      }
      
      @NonNull
      @RequiresApi(19)
      @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
      public static Builder fromAndroidAction(@NonNull Notification.Action paramAction)
      {
        Builder localBuilder;
        if (paramAction.getIcon() != null) {
          localBuilder = new Builder(IconCompat.createFromIcon(paramAction.getIcon()), title, actionIntent);
        } else {
          localBuilder = new Builder(icon, title, actionIntent);
        }
        android.app.RemoteInput[] arrayOfRemoteInput = paramAction.getRemoteInputs();
        if ((arrayOfRemoteInput != null) && (arrayOfRemoteInput.length != 0))
        {
          int i = arrayOfRemoteInput.length;
          for (j = 0; j < i; j++) {
            localBuilder.addRemoteInput(RemoteInput.fromPlatform(arrayOfRemoteInput[j]));
          }
        }
        int j = Build.VERSION.SDK_INT;
        mAllowGeneratedReplies = paramAction.getAllowGeneratedReplies();
        if (j >= 28) {
          localBuilder.setSemanticAction(a3.a(paramAction));
        }
        if (j >= 29) {
          localBuilder.setContextual(e.u(paramAction));
        }
        if (j >= 31) {
          localBuilder.setAuthenticationRequired(g.q(paramAction));
        }
        return localBuilder;
      }
      
      @NonNull
      public Builder addExtras(@Nullable Bundle paramBundle)
      {
        if (paramBundle != null) {
          mExtras.putAll(paramBundle);
        }
        return this;
      }
      
      @NonNull
      public Builder addRemoteInput(@Nullable RemoteInput paramRemoteInput)
      {
        if (mRemoteInputs == null) {
          mRemoteInputs = new ArrayList();
        }
        if (paramRemoteInput != null) {
          mRemoteInputs.add(paramRemoteInput);
        }
        return this;
      }
      
      @NonNull
      public NotificationCompat.Action build()
      {
        checkContextualActionNullFields();
        Object localObject1 = new ArrayList();
        ArrayList localArrayList = new ArrayList();
        Object localObject2 = mRemoteInputs;
        if (localObject2 != null)
        {
          Iterator localIterator = ((ArrayList)localObject2).iterator();
          while (localIterator.hasNext())
          {
            localObject2 = (RemoteInput)localIterator.next();
            if (((RemoteInput)localObject2).isDataOnly()) {
              ((ArrayList)localObject1).add(localObject2);
            } else {
              localArrayList.add(localObject2);
            }
          }
        }
        boolean bool = ((ArrayList)localObject1).isEmpty();
        localObject2 = null;
        if (bool) {
          localObject1 = null;
        } else {
          localObject1 = (RemoteInput[])((ArrayList)localObject1).toArray(new RemoteInput[((ArrayList)localObject1).size()]);
        }
        if (!localArrayList.isEmpty()) {
          localObject2 = (RemoteInput[])localArrayList.toArray(new RemoteInput[localArrayList.size()]);
        }
        return new NotificationCompat.Action(mIcon, mTitle, mIntent, mExtras, (RemoteInput[])localObject2, (RemoteInput[])localObject1, mAllowGeneratedReplies, mSemanticAction, mShowsUserInterface, mIsContextual, mAuthenticationRequired);
      }
      
      @NonNull
      public Builder extend(@NonNull NotificationCompat.Action.Extender paramExtender)
      {
        paramExtender.extend(this);
        return this;
      }
      
      @NonNull
      public Bundle getExtras()
      {
        return mExtras;
      }
      
      @NonNull
      public Builder setAllowGeneratedReplies(boolean paramBoolean)
      {
        mAllowGeneratedReplies = paramBoolean;
        return this;
      }
      
      @NonNull
      public Builder setAuthenticationRequired(boolean paramBoolean)
      {
        mAuthenticationRequired = paramBoolean;
        return this;
      }
      
      @NonNull
      public Builder setContextual(boolean paramBoolean)
      {
        mIsContextual = paramBoolean;
        return this;
      }
      
      @NonNull
      public Builder setSemanticAction(int paramInt)
      {
        mSemanticAction = paramInt;
        return this;
      }
      
      @NonNull
      public Builder setShowsUserInterface(boolean paramBoolean)
      {
        mShowsUserInterface = paramBoolean;
        return this;
      }
    }
    
    public static abstract interface Extender
    {
      @NonNull
      public abstract NotificationCompat.Action.Builder extend(@NonNull NotificationCompat.Action.Builder paramBuilder);
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public static @interface SemanticAction {}
    
    public static final class WearableExtender
      implements NotificationCompat.Action.Extender
    {
      private static final int DEFAULT_FLAGS = 1;
      private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
      private static final int FLAG_AVAILABLE_OFFLINE = 1;
      private static final int FLAG_HINT_DISPLAY_INLINE = 4;
      private static final int FLAG_HINT_LAUNCHES_ACTIVITY = 2;
      private static final String KEY_CANCEL_LABEL = "cancelLabel";
      private static final String KEY_CONFIRM_LABEL = "confirmLabel";
      private static final String KEY_FLAGS = "flags";
      private static final String KEY_IN_PROGRESS_LABEL = "inProgressLabel";
      private CharSequence mCancelLabel;
      private CharSequence mConfirmLabel;
      private int mFlags = 1;
      private CharSequence mInProgressLabel;
      
      public WearableExtender() {}
      
      public WearableExtender(@NonNull NotificationCompat.Action paramAction)
      {
        paramAction = paramAction.getExtras().getBundle("android.wearable.EXTENSIONS");
        if (paramAction != null)
        {
          mFlags = paramAction.getInt("flags", 1);
          mInProgressLabel = paramAction.getCharSequence("inProgressLabel");
          mConfirmLabel = paramAction.getCharSequence("confirmLabel");
          mCancelLabel = paramAction.getCharSequence("cancelLabel");
        }
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
      public WearableExtender clone()
      {
        WearableExtender localWearableExtender = new WearableExtender();
        mFlags = mFlags;
        mInProgressLabel = mInProgressLabel;
        mConfirmLabel = mConfirmLabel;
        mCancelLabel = mCancelLabel;
        return localWearableExtender;
      }
      
      @NonNull
      public NotificationCompat.Action.Builder extend(@NonNull NotificationCompat.Action.Builder paramBuilder)
      {
        Bundle localBundle = new Bundle();
        int i = mFlags;
        if (i != 1) {
          localBundle.putInt("flags", i);
        }
        CharSequence localCharSequence = mInProgressLabel;
        if (localCharSequence != null) {
          localBundle.putCharSequence("inProgressLabel", localCharSequence);
        }
        localCharSequence = mConfirmLabel;
        if (localCharSequence != null) {
          localBundle.putCharSequence("confirmLabel", localCharSequence);
        }
        localCharSequence = mCancelLabel;
        if (localCharSequence != null) {
          localBundle.putCharSequence("cancelLabel", localCharSequence);
        }
        paramBuilder.getExtras().putBundle("android.wearable.EXTENSIONS", localBundle);
        return paramBuilder;
      }
      
      @Deprecated
      @Nullable
      public CharSequence getCancelLabel()
      {
        return mCancelLabel;
      }
      
      @Deprecated
      @Nullable
      public CharSequence getConfirmLabel()
      {
        return mConfirmLabel;
      }
      
      public boolean getHintDisplayActionInline()
      {
        boolean bool;
        if ((mFlags & 0x4) != 0) {
          bool = true;
        } else {
          bool = false;
        }
        return bool;
      }
      
      public boolean getHintLaunchesActivity()
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
      @Nullable
      public CharSequence getInProgressLabel()
      {
        return mInProgressLabel;
      }
      
      public boolean isAvailableOffline()
      {
        int i = mFlags;
        boolean bool = true;
        if ((i & 0x1) == 0) {
          bool = false;
        }
        return bool;
      }
      
      @NonNull
      public WearableExtender setAvailableOffline(boolean paramBoolean)
      {
        setFlag(1, paramBoolean);
        return this;
      }
      
      @Deprecated
      @NonNull
      public WearableExtender setCancelLabel(@Nullable CharSequence paramCharSequence)
      {
        mCancelLabel = paramCharSequence;
        return this;
      }
      
      @Deprecated
      @NonNull
      public WearableExtender setConfirmLabel(@Nullable CharSequence paramCharSequence)
      {
        mConfirmLabel = paramCharSequence;
        return this;
      }
      
      @NonNull
      public WearableExtender setHintDisplayActionInline(boolean paramBoolean)
      {
        setFlag(4, paramBoolean);
        return this;
      }
      
      @NonNull
      public WearableExtender setHintLaunchesActivity(boolean paramBoolean)
      {
        setFlag(2, paramBoolean);
        return this;
      }
      
      @Deprecated
      @NonNull
      public WearableExtender setInProgressLabel(@Nullable CharSequence paramCharSequence)
      {
        mInProgressLabel = paramCharSequence;
        return this;
      }
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface BadgeIconType {}
  
  public static class BigPictureStyle
    extends NotificationCompat.Style
  {
    private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigPictureStyle";
    private IconCompat mBigLargeIcon;
    private boolean mBigLargeIconSet;
    private CharSequence mPictureContentDescription;
    private IconCompat mPictureIcon;
    private boolean mShowBigPictureWhenCollapsed;
    
    public BigPictureStyle() {}
    
    public BigPictureStyle(@Nullable NotificationCompat.Builder paramBuilder)
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
  
  public static class BigTextStyle
    extends NotificationCompat.Style
  {
    private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigTextStyle";
    private CharSequence mBigText;
    
    public BigTextStyle() {}
    
    public BigTextStyle(@Nullable NotificationCompat.Builder paramBuilder)
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
  
  public static final class BubbleMetadata
  {
    private static final int FLAG_AUTO_EXPAND_BUBBLE = 1;
    private static final int FLAG_SUPPRESS_NOTIFICATION = 2;
    private PendingIntent mDeleteIntent;
    private int mDesiredHeight;
    @DimenRes
    private int mDesiredHeightResId;
    private int mFlags;
    private IconCompat mIcon;
    private PendingIntent mPendingIntent;
    private String mShortcutId;
    
    private BubbleMetadata(@Nullable PendingIntent paramPendingIntent1, @Nullable PendingIntent paramPendingIntent2, @Nullable IconCompat paramIconCompat, int paramInt1, @DimenRes int paramInt2, int paramInt3, @Nullable String paramString)
    {
      mPendingIntent = paramPendingIntent1;
      mIcon = paramIconCompat;
      mDesiredHeight = paramInt1;
      mDesiredHeightResId = paramInt2;
      mDeleteIntent = paramPendingIntent2;
      mFlags = paramInt3;
      mShortcutId = paramString;
    }
    
    @Nullable
    public static BubbleMetadata fromPlatform(@Nullable Notification.BubbleMetadata paramBubbleMetadata)
    {
      if (paramBubbleMetadata == null) {
        return null;
      }
      int i = Build.VERSION.SDK_INT;
      if (i >= 30) {
        return Api30Impl.fromPlatform(paramBubbleMetadata);
      }
      if (i == 29) {
        return Api29Impl.fromPlatform(paramBubbleMetadata);
      }
      return null;
    }
    
    @Nullable
    public static Notification.BubbleMetadata toPlatform(@Nullable BubbleMetadata paramBubbleMetadata)
    {
      if (paramBubbleMetadata == null) {
        return null;
      }
      int i = Build.VERSION.SDK_INT;
      if (i >= 30) {
        return Api30Impl.toPlatform(paramBubbleMetadata);
      }
      if (i == 29) {
        return Api29Impl.toPlatform(paramBubbleMetadata);
      }
      return null;
    }
    
    public boolean getAutoExpandBubble()
    {
      int i = mFlags;
      boolean bool = true;
      if ((i & 0x1) == 0) {
        bool = false;
      }
      return bool;
    }
    
    @Nullable
    public PendingIntent getDeleteIntent()
    {
      return mDeleteIntent;
    }
    
    @Dimension(unit=0)
    public int getDesiredHeight()
    {
      return mDesiredHeight;
    }
    
    @DimenRes
    public int getDesiredHeightResId()
    {
      return mDesiredHeightResId;
    }
    
    @SuppressLint({"InvalidNullConversion"})
    @Nullable
    public IconCompat getIcon()
    {
      return mIcon;
    }
    
    @SuppressLint({"InvalidNullConversion"})
    @Nullable
    public PendingIntent getIntent()
    {
      return mPendingIntent;
    }
    
    @Nullable
    public String getShortcutId()
    {
      return mShortcutId;
    }
    
    public boolean isNotificationSuppressed()
    {
      boolean bool;
      if ((mFlags & 0x2) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setFlags(int paramInt)
    {
      mFlags = paramInt;
    }
    
    @RequiresApi(29)
    public static class Api29Impl
    {
      @Nullable
      @RequiresApi(29)
      public static NotificationCompat.BubbleMetadata fromPlatform(@Nullable Notification.BubbleMetadata paramBubbleMetadata)
      {
        if (paramBubbleMetadata == null) {
          return null;
        }
        if (paramBubbleMetadata.getIntent() == null) {
          return null;
        }
        NotificationCompat.BubbleMetadata.Builder localBuilder = new NotificationCompat.BubbleMetadata.Builder(paramBubbleMetadata.getIntent(), IconCompat.createFromIcon(paramBubbleMetadata.getIcon())).setAutoExpandBubble(paramBubbleMetadata.getAutoExpandBubble()).setDeleteIntent(paramBubbleMetadata.getDeleteIntent()).setSuppressNotification(paramBubbleMetadata.isNotificationSuppressed());
        if (paramBubbleMetadata.getDesiredHeight() != 0) {
          localBuilder.setDesiredHeight(paramBubbleMetadata.getDesiredHeight());
        }
        if (paramBubbleMetadata.getDesiredHeightResId() != 0) {
          localBuilder.setDesiredHeightResId(paramBubbleMetadata.getDesiredHeightResId());
        }
        return localBuilder.build();
      }
      
      @Nullable
      @RequiresApi(29)
      public static Notification.BubbleMetadata toPlatform(@Nullable NotificationCompat.BubbleMetadata paramBubbleMetadata)
      {
        if (paramBubbleMetadata == null) {
          return null;
        }
        if (paramBubbleMetadata.getIntent() == null) {
          return null;
        }
        Notification.BubbleMetadata.Builder localBuilder = new Notification.BubbleMetadata.Builder().setIcon(paramBubbleMetadata.getIcon().toIcon()).setIntent(paramBubbleMetadata.getIntent()).setDeleteIntent(paramBubbleMetadata.getDeleteIntent()).setAutoExpandBubble(paramBubbleMetadata.getAutoExpandBubble()).setSuppressNotification(paramBubbleMetadata.isNotificationSuppressed());
        if (paramBubbleMetadata.getDesiredHeight() != 0) {
          localBuilder.setDesiredHeight(paramBubbleMetadata.getDesiredHeight());
        }
        if (paramBubbleMetadata.getDesiredHeightResId() != 0) {
          localBuilder.setDesiredHeightResId(paramBubbleMetadata.getDesiredHeightResId());
        }
        return localBuilder.build();
      }
    }
    
    @RequiresApi(30)
    public static class Api30Impl
    {
      @Nullable
      @RequiresApi(30)
      public static NotificationCompat.BubbleMetadata fromPlatform(@Nullable Notification.BubbleMetadata paramBubbleMetadata)
      {
        if (paramBubbleMetadata == null) {
          return null;
        }
        NotificationCompat.BubbleMetadata.Builder localBuilder;
        if (d.l(paramBubbleMetadata) != null) {
          localBuilder = new NotificationCompat.BubbleMetadata.Builder(d.l(paramBubbleMetadata));
        } else {
          localBuilder = new NotificationCompat.BubbleMetadata.Builder(paramBubbleMetadata.getIntent(), IconCompat.createFromIcon(paramBubbleMetadata.getIcon()));
        }
        localBuilder.setAutoExpandBubble(paramBubbleMetadata.getAutoExpandBubble()).setDeleteIntent(paramBubbleMetadata.getDeleteIntent()).setSuppressNotification(paramBubbleMetadata.isNotificationSuppressed());
        if (paramBubbleMetadata.getDesiredHeight() != 0) {
          localBuilder.setDesiredHeight(paramBubbleMetadata.getDesiredHeight());
        }
        if (paramBubbleMetadata.getDesiredHeightResId() != 0) {
          localBuilder.setDesiredHeightResId(paramBubbleMetadata.getDesiredHeightResId());
        }
        return localBuilder.build();
      }
      
      @Nullable
      @RequiresApi(30)
      public static Notification.BubbleMetadata toPlatform(@Nullable NotificationCompat.BubbleMetadata paramBubbleMetadata)
      {
        if (paramBubbleMetadata == null) {
          return null;
        }
        Notification.BubbleMetadata.Builder localBuilder;
        if (paramBubbleMetadata.getShortcutId() != null) {
          localBuilder = new Notification.BubbleMetadata.Builder(paramBubbleMetadata.getShortcutId());
        } else {
          localBuilder = new Notification.BubbleMetadata.Builder(paramBubbleMetadata.getIntent(), paramBubbleMetadata.getIcon().toIcon());
        }
        localBuilder.setDeleteIntent(paramBubbleMetadata.getDeleteIntent()).setAutoExpandBubble(paramBubbleMetadata.getAutoExpandBubble()).setSuppressNotification(paramBubbleMetadata.isNotificationSuppressed());
        if (paramBubbleMetadata.getDesiredHeight() != 0) {
          localBuilder.setDesiredHeight(paramBubbleMetadata.getDesiredHeight());
        }
        if (paramBubbleMetadata.getDesiredHeightResId() != 0) {
          localBuilder.setDesiredHeightResId(paramBubbleMetadata.getDesiredHeightResId());
        }
        return localBuilder.build();
      }
    }
    
    public static final class Builder
    {
      private PendingIntent mDeleteIntent;
      private int mDesiredHeight;
      @DimenRes
      private int mDesiredHeightResId;
      private int mFlags;
      private IconCompat mIcon;
      private PendingIntent mPendingIntent;
      private String mShortcutId;
      
      @Deprecated
      public Builder() {}
      
      public Builder(@NonNull PendingIntent paramPendingIntent, @NonNull IconCompat paramIconCompat)
      {
        if (paramPendingIntent != null)
        {
          if (paramIconCompat != null)
          {
            mPendingIntent = paramPendingIntent;
            mIcon = paramIconCompat;
            return;
          }
          throw new NullPointerException("Bubbles require non-null icon");
        }
        throw new NullPointerException("Bubble requires non-null pending intent");
      }
      
      @RequiresApi(30)
      public Builder(@NonNull String paramString)
      {
        if (!TextUtils.isEmpty(paramString))
        {
          mShortcutId = paramString;
          return;
        }
        throw new NullPointerException("Bubble requires a non-null shortcut id");
      }
      
      @NonNull
      private Builder setFlag(int paramInt, boolean paramBoolean)
      {
        if (paramBoolean) {
          mFlags = (paramInt | mFlags);
        } else {
          mFlags = (paramInt & mFlags);
        }
        return this;
      }
      
      @SuppressLint({"SyntheticAccessor"})
      @NonNull
      public NotificationCompat.BubbleMetadata build()
      {
        Object localObject = mShortcutId;
        if ((localObject == null) && (mPendingIntent == null)) {
          throw new NullPointerException("Must supply pending intent or shortcut to bubble");
        }
        if ((localObject == null) && (mIcon == null)) {
          throw new NullPointerException("Must supply an icon or shortcut for the bubble");
        }
        localObject = new NotificationCompat.BubbleMetadata(mPendingIntent, mDeleteIntent, mIcon, mDesiredHeight, mDesiredHeightResId, mFlags, (String)localObject, null);
        ((NotificationCompat.BubbleMetadata)localObject).setFlags(mFlags);
        return (NotificationCompat.BubbleMetadata)localObject;
      }
      
      @NonNull
      public Builder setAutoExpandBubble(boolean paramBoolean)
      {
        setFlag(1, paramBoolean);
        return this;
      }
      
      @NonNull
      public Builder setDeleteIntent(@Nullable PendingIntent paramPendingIntent)
      {
        mDeleteIntent = paramPendingIntent;
        return this;
      }
      
      @NonNull
      public Builder setDesiredHeight(@Dimension(unit=0) int paramInt)
      {
        mDesiredHeight = Math.max(paramInt, 0);
        mDesiredHeightResId = 0;
        return this;
      }
      
      @NonNull
      public Builder setDesiredHeightResId(@DimenRes int paramInt)
      {
        mDesiredHeightResId = paramInt;
        mDesiredHeight = 0;
        return this;
      }
      
      @NonNull
      public Builder setIcon(@NonNull IconCompat paramIconCompat)
      {
        if (mShortcutId == null)
        {
          if (paramIconCompat != null)
          {
            mIcon = paramIconCompat;
            return this;
          }
          throw new NullPointerException("Bubbles require non-null icon");
        }
        throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
      }
      
      @NonNull
      public Builder setIntent(@NonNull PendingIntent paramPendingIntent)
      {
        if (mShortcutId == null)
        {
          if (paramPendingIntent != null)
          {
            mPendingIntent = paramPendingIntent;
            return this;
          }
          throw new NullPointerException("Bubble requires non-null pending intent");
        }
        throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
      }
      
      @NonNull
      public Builder setSuppressNotification(boolean paramBoolean)
      {
        setFlag(2, paramBoolean);
        return this;
      }
    }
  }
  
  public static class Builder
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
    public Builder(@NonNull Context paramContext)
    {
      this(paramContext, null);
    }
    
    @RequiresApi(19)
    public Builder(@NonNull Context paramContext, @NonNull Notification paramNotification)
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
    
    public Builder(@NonNull Context paramContext, @NonNull String paramString)
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
  
  public static final class CarExtender
    implements NotificationCompat.Extender
  {
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final String EXTRA_CAR_EXTENDER = "android.car.EXTENSIONS";
    private static final String EXTRA_COLOR = "app_color";
    private static final String EXTRA_CONVERSATION = "car_conversation";
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final String EXTRA_INVISIBLE_ACTIONS = "invisible_actions";
    private static final String EXTRA_LARGE_ICON = "large_icon";
    private static final String KEY_AUTHOR = "author";
    private static final String KEY_MESSAGES = "messages";
    private static final String KEY_ON_READ = "on_read";
    private static final String KEY_ON_REPLY = "on_reply";
    private static final String KEY_PARTICIPANTS = "participants";
    private static final String KEY_REMOTE_INPUT = "remote_input";
    private static final String KEY_TEXT = "text";
    private static final String KEY_TIMESTAMP = "timestamp";
    private int mColor = 0;
    private Bitmap mLargeIcon;
    private UnreadConversation mUnreadConversation;
    
    public CarExtender() {}
    
    public CarExtender(@NonNull Notification paramNotification)
    {
      if (NotificationCompat.getExtras(paramNotification) == null) {
        paramNotification = null;
      } else {
        paramNotification = NotificationCompat.getExtras(paramNotification).getBundle("android.car.EXTENSIONS");
      }
      if (paramNotification != null)
      {
        mLargeIcon = ((Bitmap)paramNotification.getParcelable("large_icon"));
        mColor = paramNotification.getInt("app_color", 0);
        mUnreadConversation = getUnreadConversationFromBundle(paramNotification.getBundle("car_conversation"));
      }
    }
    
    @RequiresApi(21)
    private static Bundle getBundleForUnreadConversation(@NonNull UnreadConversation paramUnreadConversation)
    {
      Bundle localBundle1 = new Bundle();
      Object localObject = paramUnreadConversation.getParticipants();
      int i = 0;
      if ((localObject != null) && (paramUnreadConversation.getParticipants().length > 1)) {
        localObject = paramUnreadConversation.getParticipants()[0];
      } else {
        localObject = null;
      }
      int j = paramUnreadConversation.getMessages().length;
      Parcelable[] arrayOfParcelable = new Parcelable[j];
      while (i < j)
      {
        Bundle localBundle2 = new Bundle();
        localBundle2.putString("text", paramUnreadConversation.getMessages()[i]);
        localBundle2.putString("author", (String)localObject);
        arrayOfParcelable[i] = localBundle2;
        i++;
      }
      localBundle1.putParcelableArray("messages", arrayOfParcelable);
      localObject = paramUnreadConversation.getRemoteInput();
      if (localObject != null) {
        localBundle1.putParcelable("remote_input", new RemoteInput.Builder(((RemoteInput)localObject).getResultKey()).setLabel(((RemoteInput)localObject).getLabel()).setChoices(((RemoteInput)localObject).getChoices()).setAllowFreeFormInput(((RemoteInput)localObject).getAllowFreeFormInput()).addExtras(((RemoteInput)localObject).getExtras()).build());
      }
      localBundle1.putParcelable("on_reply", paramUnreadConversation.getReplyPendingIntent());
      localBundle1.putParcelable("on_read", paramUnreadConversation.getReadPendingIntent());
      localBundle1.putStringArray("participants", paramUnreadConversation.getParticipants());
      localBundle1.putLong("timestamp", paramUnreadConversation.getLatestTimestamp());
      return localBundle1;
    }
    
    @RequiresApi(21)
    private static UnreadConversation getUnreadConversationFromBundle(@Nullable Bundle paramBundle)
    {
      String str = null;
      CharSequence[] arrayOfCharSequence = null;
      if (paramBundle == null) {
        return null;
      }
      Object localObject1 = paramBundle.getParcelableArray("messages");
      int i = 0;
      String[] arrayOfString;
      int k;
      if (localObject1 != null)
      {
        int j = localObject1.length;
        arrayOfString = new String[j];
        for (k = 0; k < j; k++)
        {
          localObject2 = localObject1[k];
          if (!(localObject2 instanceof Bundle)) {}
          do
          {
            k = 0;
            break;
            localObject2 = ((Bundle)localObject2).getString("text");
            arrayOfString[k] = localObject2;
          } while (localObject2 == null);
        }
        k = 1;
        if (k == 0) {
          return null;
        }
      }
      else
      {
        arrayOfString = null;
      }
      PendingIntent localPendingIntent1 = (PendingIntent)paramBundle.getParcelable("on_read");
      PendingIntent localPendingIntent2 = (PendingIntent)paramBundle.getParcelable("on_reply");
      android.app.RemoteInput localRemoteInput = (android.app.RemoteInput)paramBundle.getParcelable("remote_input");
      Object localObject2 = paramBundle.getStringArray("participants");
      localObject1 = str;
      if (localObject2 != null) {
        if (localObject2.length != 1)
        {
          localObject1 = str;
        }
        else
        {
          localObject1 = arrayOfCharSequence;
          if (localRemoteInput != null)
          {
            str = localRemoteInput.getResultKey();
            localObject1 = localRemoteInput.getLabel();
            arrayOfCharSequence = localRemoteInput.getChoices();
            boolean bool = localRemoteInput.getAllowFreeFormInput();
            k = i;
            if (Build.VERSION.SDK_INT >= 29) {
              k = e.a(localRemoteInput);
            }
            localObject1 = new RemoteInput(str, (CharSequence)localObject1, arrayOfCharSequence, bool, k, localRemoteInput.getExtras(), null);
          }
          localObject1 = new UnreadConversation(arrayOfString, (RemoteInput)localObject1, localPendingIntent2, localPendingIntent1, (String[])localObject2, paramBundle.getLong("timestamp"));
        }
      }
      return (UnreadConversation)localObject1;
    }
    
    @NonNull
    public NotificationCompat.Builder extend(@NonNull NotificationCompat.Builder paramBuilder)
    {
      Bundle localBundle = new Bundle();
      Object localObject = mLargeIcon;
      if (localObject != null) {
        localBundle.putParcelable("large_icon", (Parcelable)localObject);
      }
      int i = mColor;
      if (i != 0) {
        localBundle.putInt("app_color", i);
      }
      localObject = mUnreadConversation;
      if (localObject != null) {
        localBundle.putBundle("car_conversation", getBundleForUnreadConversation((UnreadConversation)localObject));
      }
      paramBuilder.getExtras().putBundle("android.car.EXTENSIONS", localBundle);
      return paramBuilder;
    }
    
    @ColorInt
    public int getColor()
    {
      return mColor;
    }
    
    @Nullable
    public Bitmap getLargeIcon()
    {
      return mLargeIcon;
    }
    
    @Deprecated
    @Nullable
    public UnreadConversation getUnreadConversation()
    {
      return mUnreadConversation;
    }
    
    @NonNull
    public CarExtender setColor(@ColorInt int paramInt)
    {
      mColor = paramInt;
      return this;
    }
    
    @NonNull
    public CarExtender setLargeIcon(@Nullable Bitmap paramBitmap)
    {
      mLargeIcon = paramBitmap;
      return this;
    }
    
    @Deprecated
    @NonNull
    public CarExtender setUnreadConversation(@Nullable UnreadConversation paramUnreadConversation)
    {
      mUnreadConversation = paramUnreadConversation;
      return this;
    }
    
    @Deprecated
    public static class UnreadConversation
    {
      private final long mLatestTimestamp;
      private final String[] mMessages;
      private final String[] mParticipants;
      private final PendingIntent mReadPendingIntent;
      private final RemoteInput mRemoteInput;
      private final PendingIntent mReplyPendingIntent;
      
      public UnreadConversation(@Nullable String[] paramArrayOfString1, @Nullable RemoteInput paramRemoteInput, @Nullable PendingIntent paramPendingIntent1, @Nullable PendingIntent paramPendingIntent2, @Nullable String[] paramArrayOfString2, long paramLong)
      {
        mMessages = paramArrayOfString1;
        mRemoteInput = paramRemoteInput;
        mReadPendingIntent = paramPendingIntent2;
        mReplyPendingIntent = paramPendingIntent1;
        mParticipants = paramArrayOfString2;
        mLatestTimestamp = paramLong;
      }
      
      public long getLatestTimestamp()
      {
        return mLatestTimestamp;
      }
      
      @Nullable
      public String[] getMessages()
      {
        return mMessages;
      }
      
      @Nullable
      public String getParticipant()
      {
        Object localObject = mParticipants;
        if (localObject.length > 0) {
          localObject = localObject[0];
        } else {
          localObject = null;
        }
        return (String)localObject;
      }
      
      @Nullable
      public String[] getParticipants()
      {
        return mParticipants;
      }
      
      @Nullable
      public PendingIntent getReadPendingIntent()
      {
        return mReadPendingIntent;
      }
      
      @Nullable
      public RemoteInput getRemoteInput()
      {
        return mRemoteInput;
      }
      
      @Nullable
      public PendingIntent getReplyPendingIntent()
      {
        return mReplyPendingIntent;
      }
      
      public static class Builder
      {
        private long mLatestTimestamp;
        private final List<String> mMessages = new ArrayList();
        private final String mParticipant;
        private PendingIntent mReadPendingIntent;
        private RemoteInput mRemoteInput;
        private PendingIntent mReplyPendingIntent;
        
        public Builder(@NonNull String paramString)
        {
          mParticipant = paramString;
        }
        
        @NonNull
        public Builder addMessage(@Nullable String paramString)
        {
          if (paramString != null) {
            mMessages.add(paramString);
          }
          return this;
        }
        
        @NonNull
        public NotificationCompat.CarExtender.UnreadConversation build()
        {
          Object localObject = mMessages;
          localObject = (String[])((List)localObject).toArray(new String[((List)localObject).size()]);
          String str = mParticipant;
          RemoteInput localRemoteInput = mRemoteInput;
          PendingIntent localPendingIntent1 = mReplyPendingIntent;
          PendingIntent localPendingIntent2 = mReadPendingIntent;
          long l = mLatestTimestamp;
          return new NotificationCompat.CarExtender.UnreadConversation((String[])localObject, localRemoteInput, localPendingIntent1, localPendingIntent2, new String[] { str }, l);
        }
        
        @NonNull
        public Builder setLatestTimestamp(long paramLong)
        {
          mLatestTimestamp = paramLong;
          return this;
        }
        
        @NonNull
        public Builder setReadPendingIntent(@Nullable PendingIntent paramPendingIntent)
        {
          mReadPendingIntent = paramPendingIntent;
          return this;
        }
        
        @NonNull
        public Builder setReplyAction(@Nullable PendingIntent paramPendingIntent, @Nullable RemoteInput paramRemoteInput)
        {
          mRemoteInput = paramRemoteInput;
          mReplyPendingIntent = paramPendingIntent;
          return this;
        }
      }
    }
  }
  
  public static class DecoratedCustomViewStyle
    extends NotificationCompat.Style
  {
    private static final int MAX_ACTION_BUTTONS = 3;
    private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    
    private RemoteViews createRemoteViews(RemoteViews paramRemoteViews, boolean paramBoolean)
    {
      int i = R.layout.notification_template_custom_big;
      int j = 1;
      int k = 0;
      RemoteViews localRemoteViews1 = applyStandardTemplate(true, i, false);
      localRemoteViews1.removeAllViews(R.id.actions);
      List localList = getNonContextualActions(mBuilder.mActions);
      if ((paramBoolean) && (localList != null))
      {
        int m = Math.min(localList.size(), 3);
        if (m > 0) {
          for (i = 0;; i++)
          {
            n = j;
            if (i >= m) {
              break;
            }
            RemoteViews localRemoteViews2 = generateActionButton((NotificationCompat.Action)localList.get(i));
            localRemoteViews1.addView(R.id.actions, localRemoteViews2);
          }
        }
      }
      int n = 0;
      if (n != 0) {
        i = k;
      } else {
        i = 8;
      }
      localRemoteViews1.setViewVisibility(R.id.actions, i);
      localRemoteViews1.setViewVisibility(R.id.action_divider, i);
      buildIntoRemoteViews(localRemoteViews1, paramRemoteViews);
      return localRemoteViews1;
    }
    
    private RemoteViews generateActionButton(NotificationCompat.Action paramAction)
    {
      int i;
      if (actionIntent == null) {
        i = 1;
      } else {
        i = 0;
      }
      Object localObject = mBuilder.mContext.getPackageName();
      int j;
      if (i != 0) {
        j = R.layout.notification_action_tombstone;
      } else {
        j = R.layout.notification_action;
      }
      localObject = new RemoteViews((String)localObject, j);
      IconCompat localIconCompat = paramAction.getIconCompat();
      if (localIconCompat != null) {
        ((RemoteViews)localObject).setImageViewBitmap(R.id.action_image, createColoredBitmap(localIconCompat, mBuilder.mContext.getResources().getColor(R.color.notification_action_color_filter)));
      }
      ((RemoteViews)localObject).setTextViewText(R.id.action_text, title);
      if (i == 0) {
        ((RemoteViews)localObject).setOnClickPendingIntent(R.id.action_container, actionIntent);
      }
      ((RemoteViews)localObject).setContentDescription(R.id.action_container, title);
      return (RemoteViews)localObject;
    }
    
    private static List<NotificationCompat.Action> getNonContextualActions(List<NotificationCompat.Action> paramList)
    {
      if (paramList == null) {
        return null;
      }
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        paramList = (NotificationCompat.Action)localIterator.next();
        if (!paramList.isContextual()) {
          localArrayList.add(paramList);
        }
      }
      return localArrayList;
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void apply(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
    {
      paramNotificationBuilderWithBuilderAccessor.getBuilder().setStyle(new Notification.DecoratedCustomViewStyle());
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean displayCustomViewInline()
    {
      return true;
    }
    
    @NonNull
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public String getClassName()
    {
      return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
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
  }
  
  public static abstract interface Extender
  {
    @NonNull
    public abstract NotificationCompat.Builder extend(@NonNull NotificationCompat.Builder paramBuilder);
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface GroupAlertBehavior {}
  
  public static class InboxStyle
    extends NotificationCompat.Style
  {
    private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$InboxStyle";
    private ArrayList<CharSequence> mTexts = new ArrayList();
    
    public InboxStyle() {}
    
    public InboxStyle(@Nullable NotificationCompat.Builder paramBuilder)
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
  
  public static class MessagingStyle
    extends NotificationCompat.Style
  {
    public static final int MAXIMUM_RETAINED_MESSAGES = 25;
    private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$MessagingStyle";
    @Nullable
    private CharSequence mConversationTitle;
    private final List<Message> mHistoricMessages = new ArrayList();
    @Nullable
    private Boolean mIsGroupConversation;
    private final List<Message> mMessages = new ArrayList();
    private Person mUser;
    
    public MessagingStyle() {}
    
    public MessagingStyle(@NonNull Person paramPerson)
    {
      if (!TextUtils.isEmpty(paramPerson.getName()))
      {
        mUser = paramPerson;
        return;
      }
      throw new IllegalArgumentException("User's name must not be empty.");
    }
    
    @Deprecated
    public MessagingStyle(@NonNull CharSequence paramCharSequence)
    {
      mUser = new Person.Builder().setName(paramCharSequence).build();
    }
    
    @Nullable
    public static MessagingStyle extractMessagingStyleFromNotification(@NonNull Notification paramNotification)
    {
      paramNotification = NotificationCompat.Style.extractStyleFromNotification(paramNotification);
      if ((paramNotification instanceof MessagingStyle)) {
        return (MessagingStyle)paramNotification;
      }
      return null;
    }
    
    @Nullable
    private Message findLatestIncomingMessage()
    {
      int i = mMessages.size();
      Object localObject;
      do
      {
        int j;
        do
        {
          j = i - 1;
          if (j < 0) {
            break;
          }
          localObject = (Message)mMessages.get(j);
          i = j;
        } while (((Message)localObject).getPerson() == null);
        i = j;
      } while (TextUtils.isEmpty(((Message)localObject).getPerson().getName()));
      return (Message)localObject;
      if (!mMessages.isEmpty())
      {
        localObject = mMessages;
        return (Message)((List)localObject).get(((List)localObject).size() - 1);
      }
      return null;
    }
    
    private boolean hasMessagesWithoutSender()
    {
      for (int i = mMessages.size() - 1; i >= 0; i--)
      {
        Message localMessage = (Message)mMessages.get(i);
        if ((localMessage.getPerson() != null) && (localMessage.getPerson().getName() == null)) {
          return true;
        }
      }
      return false;
    }
    
    @NonNull
    private TextAppearanceSpan makeFontColorSpan(int paramInt)
    {
      return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(paramInt), null);
    }
    
    private CharSequence makeMessageLine(@NonNull Message paramMessage)
    {
      BidiFormatter localBidiFormatter = BidiFormatter.getInstance();
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
      int i = -16777216;
      Object localObject1 = paramMessage.getPerson();
      String str = "";
      if (localObject1 == null) {
        localObject1 = "";
      } else {
        localObject1 = paramMessage.getPerson().getName();
      }
      int j = i;
      Object localObject2 = localObject1;
      if (TextUtils.isEmpty((CharSequence)localObject1))
      {
        localObject1 = mUser.getName();
        j = i;
        localObject2 = localObject1;
        if (mBuilder.getColor() != 0)
        {
          j = mBuilder.getColor();
          localObject2 = localObject1;
        }
      }
      localObject1 = localBidiFormatter.unicodeWrap((CharSequence)localObject2);
      localSpannableStringBuilder.append((CharSequence)localObject1);
      localSpannableStringBuilder.setSpan(makeFontColorSpan(j), localSpannableStringBuilder.length() - ((CharSequence)localObject1).length(), localSpannableStringBuilder.length(), 33);
      if (paramMessage.getText() == null) {
        paramMessage = str;
      } else {
        paramMessage = paramMessage.getText();
      }
      localSpannableStringBuilder.append("  ").append(localBidiFormatter.unicodeWrap(paramMessage));
      return localSpannableStringBuilder;
    }
    
    public void addCompatExtras(@NonNull Bundle paramBundle)
    {
      super.addCompatExtras(paramBundle);
      paramBundle.putCharSequence("android.selfDisplayName", mUser.getName());
      paramBundle.putBundle("android.messagingStyleUser", mUser.toBundle());
      paramBundle.putCharSequence("android.hiddenConversationTitle", mConversationTitle);
      if ((mConversationTitle != null) && (mIsGroupConversation.booleanValue())) {
        paramBundle.putCharSequence("android.conversationTitle", mConversationTitle);
      }
      if (!mMessages.isEmpty()) {
        paramBundle.putParcelableArray("android.messages", Message.getBundleArrayForMessages(mMessages));
      }
      if (!mHistoricMessages.isEmpty()) {
        paramBundle.putParcelableArray("android.messages.historic", Message.getBundleArrayForMessages(mHistoricMessages));
      }
      Boolean localBoolean = mIsGroupConversation;
      if (localBoolean != null) {
        paramBundle.putBoolean("android.isGroupConversation", localBoolean.booleanValue());
      }
    }
    
    @NonNull
    public MessagingStyle addHistoricMessage(@Nullable Message paramMessage)
    {
      if (paramMessage != null)
      {
        mHistoricMessages.add(paramMessage);
        if (mHistoricMessages.size() > 25) {
          mHistoricMessages.remove(0);
        }
      }
      return this;
    }
    
    @NonNull
    public MessagingStyle addMessage(@Nullable Message paramMessage)
    {
      if (paramMessage != null)
      {
        mMessages.add(paramMessage);
        if (mMessages.size() > 25) {
          mMessages.remove(0);
        }
      }
      return this;
    }
    
    @NonNull
    public MessagingStyle addMessage(@Nullable CharSequence paramCharSequence, long paramLong, @Nullable Person paramPerson)
    {
      addMessage(new Message(paramCharSequence, paramLong, paramPerson));
      return this;
    }
    
    @Deprecated
    @NonNull
    public MessagingStyle addMessage(@Nullable CharSequence paramCharSequence1, long paramLong, @Nullable CharSequence paramCharSequence2)
    {
      mMessages.add(new Message(paramCharSequence1, paramLong, new Person.Builder().setName(paramCharSequence2).build()));
      if (mMessages.size() > 25) {
        mMessages.remove(0);
      }
      return this;
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void apply(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
    {
      setGroupConversation(isGroupConversation());
      Notification.MessagingStyle localMessagingStyle;
      if (Build.VERSION.SDK_INT >= 28) {
        localMessagingStyle = new Notification.MessagingStyle(mUser.toAndroidPerson());
      } else {
        localMessagingStyle = new Notification.MessagingStyle(mUser.getName());
      }
      Iterator localIterator = mMessages.iterator();
      while (localIterator.hasNext()) {
        localMessagingStyle.addMessage(((Message)localIterator.next()).toAndroidMessage());
      }
      if (Build.VERSION.SDK_INT >= 26)
      {
        localIterator = mHistoricMessages.iterator();
        while (localIterator.hasNext()) {
          localMessagingStyle.addHistoricMessage(((Message)localIterator.next()).toAndroidMessage());
        }
      }
      if ((mIsGroupConversation.booleanValue()) || (Build.VERSION.SDK_INT >= 28)) {
        localMessagingStyle.setConversationTitle(mConversationTitle);
      }
      if (Build.VERSION.SDK_INT >= 28) {
        localMessagingStyle.setGroupConversation(mIsGroupConversation.booleanValue());
      }
      localMessagingStyle.setBuilder(paramNotificationBuilderWithBuilderAccessor.getBuilder());
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void clearCompatExtraKeys(@NonNull Bundle paramBundle)
    {
      super.clearCompatExtraKeys(paramBundle);
      paramBundle.remove("android.messagingStyleUser");
      paramBundle.remove("android.selfDisplayName");
      paramBundle.remove("android.conversationTitle");
      paramBundle.remove("android.hiddenConversationTitle");
      paramBundle.remove("android.messages");
      paramBundle.remove("android.messages.historic");
      paramBundle.remove("android.isGroupConversation");
    }
    
    @NonNull
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public String getClassName()
    {
      return "androidx.core.app.NotificationCompat$MessagingStyle";
    }
    
    @Nullable
    public CharSequence getConversationTitle()
    {
      return mConversationTitle;
    }
    
    @NonNull
    public List<Message> getHistoricMessages()
    {
      return mHistoricMessages;
    }
    
    @NonNull
    public List<Message> getMessages()
    {
      return mMessages;
    }
    
    @NonNull
    public Person getUser()
    {
      return mUser;
    }
    
    @Deprecated
    @Nullable
    public CharSequence getUserDisplayName()
    {
      return mUser.getName();
    }
    
    public boolean isGroupConversation()
    {
      Object localObject = mBuilder;
      boolean bool1 = false;
      boolean bool2 = false;
      if ((localObject != null) && (mContext.getApplicationInfo().targetSdkVersion < 28) && (mIsGroupConversation == null))
      {
        if (mConversationTitle != null) {
          bool2 = true;
        }
        return bool2;
      }
      localObject = mIsGroupConversation;
      bool2 = bool1;
      if (localObject != null) {
        bool2 = ((Boolean)localObject).booleanValue();
      }
      return bool2;
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void restoreFromCompatExtras(@NonNull Bundle paramBundle)
    {
      super.restoreFromCompatExtras(paramBundle);
      mMessages.clear();
      if (paramBundle.containsKey("android.messagingStyleUser")) {
        mUser = Person.fromBundle(paramBundle.getBundle("android.messagingStyleUser"));
      } else {
        mUser = new Person.Builder().setName(paramBundle.getString("android.selfDisplayName")).build();
      }
      Object localObject = paramBundle.getCharSequence("android.conversationTitle");
      mConversationTitle = ((CharSequence)localObject);
      if (localObject == null) {
        mConversationTitle = paramBundle.getCharSequence("android.hiddenConversationTitle");
      }
      localObject = paramBundle.getParcelableArray("android.messages");
      if (localObject != null) {
        mMessages.addAll(Message.getMessagesFromBundleArray((Parcelable[])localObject));
      }
      localObject = paramBundle.getParcelableArray("android.messages.historic");
      if (localObject != null) {
        mHistoricMessages.addAll(Message.getMessagesFromBundleArray((Parcelable[])localObject));
      }
      if (paramBundle.containsKey("android.isGroupConversation")) {
        mIsGroupConversation = Boolean.valueOf(paramBundle.getBoolean("android.isGroupConversation"));
      }
    }
    
    @NonNull
    public MessagingStyle setConversationTitle(@Nullable CharSequence paramCharSequence)
    {
      mConversationTitle = paramCharSequence;
      return this;
    }
    
    @NonNull
    public MessagingStyle setGroupConversation(boolean paramBoolean)
    {
      mIsGroupConversation = Boolean.valueOf(paramBoolean);
      return this;
    }
    
    public static final class Message
    {
      public static final String KEY_DATA_MIME_TYPE = "type";
      public static final String KEY_DATA_URI = "uri";
      public static final String KEY_EXTRAS_BUNDLE = "extras";
      public static final String KEY_NOTIFICATION_PERSON = "sender_person";
      public static final String KEY_PERSON = "person";
      public static final String KEY_SENDER = "sender";
      public static final String KEY_TEXT = "text";
      public static final String KEY_TIMESTAMP = "time";
      @Nullable
      private String mDataMimeType;
      @Nullable
      private Uri mDataUri;
      private Bundle mExtras = new Bundle();
      @Nullable
      private final Person mPerson;
      private final CharSequence mText;
      private final long mTimestamp;
      
      public Message(@Nullable CharSequence paramCharSequence, long paramLong, @Nullable Person paramPerson)
      {
        mText = paramCharSequence;
        mTimestamp = paramLong;
        mPerson = paramPerson;
      }
      
      @Deprecated
      public Message(@Nullable CharSequence paramCharSequence1, long paramLong, @Nullable CharSequence paramCharSequence2)
      {
        this(paramCharSequence1, paramLong, new Person.Builder().setName(paramCharSequence2).build());
      }
      
      @NonNull
      public static Bundle[] getBundleArrayForMessages(@NonNull List<Message> paramList)
      {
        Bundle[] arrayOfBundle = new Bundle[paramList.size()];
        int i = paramList.size();
        for (int j = 0; j < i; j++) {
          arrayOfBundle[j] = ((Message)paramList.get(j)).toBundle();
        }
        return arrayOfBundle;
      }
      
      @Nullable
      public static Message getMessageFromBundle(@NonNull Bundle paramBundle)
      {
        try
        {
          if ((paramBundle.containsKey("text")) && (paramBundle.containsKey("time")))
          {
            Object localObject;
            if (paramBundle.containsKey("person"))
            {
              localObject = Person.fromBundle(paramBundle.getBundle("person"));
            }
            else if ((paramBundle.containsKey("sender_person")) && (Build.VERSION.SDK_INT >= 28))
            {
              localObject = Person.fromAndroidPerson((android.app.Person)paramBundle.getParcelable("sender_person"));
            }
            else if (paramBundle.containsKey("sender"))
            {
              localObject = new androidx/core/app/Person$Builder;
              ((Person.Builder)localObject).<init>();
              localObject = ((Person.Builder)localObject).setName(paramBundle.getCharSequence("sender")).build();
            }
            else
            {
              localObject = null;
            }
            Message localMessage = new androidx/core/app/NotificationCompat$MessagingStyle$Message;
            localMessage.<init>(paramBundle.getCharSequence("text"), paramBundle.getLong("time"), (Person)localObject);
            if ((paramBundle.containsKey("type")) && (paramBundle.containsKey("uri"))) {
              localMessage.setData(paramBundle.getString("type"), (Uri)paramBundle.getParcelable("uri"));
            }
            if (paramBundle.containsKey("extras")) {
              localMessage.getExtras().putAll(paramBundle.getBundle("extras"));
            }
            return localMessage;
          }
        }
        catch (ClassCastException paramBundle)
        {
          for (;;) {}
        }
        return null;
      }
      
      @NonNull
      public static List<Message> getMessagesFromBundleArray(@NonNull Parcelable[] paramArrayOfParcelable)
      {
        ArrayList localArrayList = new ArrayList(paramArrayOfParcelable.length);
        for (int i = 0; i < paramArrayOfParcelable.length; i++)
        {
          Object localObject = paramArrayOfParcelable[i];
          if ((localObject instanceof Bundle))
          {
            localObject = getMessageFromBundle((Bundle)localObject);
            if (localObject != null) {
              localArrayList.add(localObject);
            }
          }
        }
        return localArrayList;
      }
      
      @NonNull
      private Bundle toBundle()
      {
        Bundle localBundle = new Bundle();
        Object localObject = mText;
        if (localObject != null) {
          localBundle.putCharSequence("text", (CharSequence)localObject);
        }
        localBundle.putLong("time", mTimestamp);
        localObject = mPerson;
        if (localObject != null)
        {
          localBundle.putCharSequence("sender", ((Person)localObject).getName());
          if (Build.VERSION.SDK_INT >= 28) {
            localBundle.putParcelable("sender_person", mPerson.toAndroidPerson());
          } else {
            localBundle.putBundle("person", mPerson.toBundle());
          }
        }
        localObject = mDataMimeType;
        if (localObject != null) {
          localBundle.putString("type", (String)localObject);
        }
        localObject = mDataUri;
        if (localObject != null) {
          localBundle.putParcelable("uri", (Parcelable)localObject);
        }
        localObject = mExtras;
        if (localObject != null) {
          localBundle.putBundle("extras", (Bundle)localObject);
        }
        return localBundle;
      }
      
      @Nullable
      public String getDataMimeType()
      {
        return mDataMimeType;
      }
      
      @Nullable
      public Uri getDataUri()
      {
        return mDataUri;
      }
      
      @NonNull
      public Bundle getExtras()
      {
        return mExtras;
      }
      
      @Nullable
      public Person getPerson()
      {
        return mPerson;
      }
      
      @Deprecated
      @Nullable
      public CharSequence getSender()
      {
        Object localObject = mPerson;
        if (localObject == null) {
          localObject = null;
        } else {
          localObject = ((Person)localObject).getName();
        }
        return (CharSequence)localObject;
      }
      
      @Nullable
      public CharSequence getText()
      {
        return mText;
      }
      
      public long getTimestamp()
      {
        return mTimestamp;
      }
      
      @NonNull
      public Message setData(@Nullable String paramString, @Nullable Uri paramUri)
      {
        mDataMimeType = paramString;
        mDataUri = paramUri;
        return this;
      }
      
      @NonNull
      @RequiresApi(24)
      @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
      public Notification.MessagingStyle.Message toAndroidMessage()
      {
        Person localPerson = getPerson();
        int i = Build.VERSION.SDK_INT;
        CharSequence localCharSequence1 = null;
        Object localObject = null;
        long l;
        if (i >= 28)
        {
          localCharSequence1 = getText();
          l = getTimestamp();
          if (localPerson != null) {
            localObject = localPerson.toAndroidPerson();
          }
          localObject = new Notification.MessagingStyle.Message(localCharSequence1, l, (android.app.Person)localObject);
        }
        else
        {
          CharSequence localCharSequence2 = getText();
          l = getTimestamp();
          if (localPerson == null) {
            localObject = localCharSequence1;
          } else {
            localObject = localPerson.getName();
          }
          localObject = new Notification.MessagingStyle.Message(localCharSequence2, l, (CharSequence)localObject);
        }
        if (getDataMimeType() != null) {
          ((Notification.MessagingStyle.Message)localObject).setData(getDataMimeType(), getDataUri());
        }
        return (Notification.MessagingStyle.Message)localObject;
      }
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface NotificationVisibility {}
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface ServiceNotificationBehavior {}
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface StreamType {}
  
  public static abstract class Style
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
  
  public static final class WearableExtender
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
    
    public WearableExtender() {}
    
    public WearableExtender(@NonNull Notification paramNotification)
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
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */