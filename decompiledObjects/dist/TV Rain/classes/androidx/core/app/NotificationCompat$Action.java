package androidx.core.app;

import a3;
import android.app.Notification.Action;
import android.app.PendingIntent;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import e;
import g;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class NotificationCompat$Action
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
  
  public NotificationCompat$Action(int paramInt, @Nullable CharSequence paramCharSequence, @Nullable PendingIntent paramPendingIntent)
  {
    this(localIconCompat, paramCharSequence, paramPendingIntent);
  }
  
  public NotificationCompat$Action(int paramInt1, @Nullable CharSequence paramCharSequence, @Nullable PendingIntent paramPendingIntent, @Nullable Bundle paramBundle, @Nullable RemoteInput[] paramArrayOfRemoteInput1, @Nullable RemoteInput[] paramArrayOfRemoteInput2, boolean paramBoolean1, int paramInt2, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    this(localIconCompat, paramCharSequence, paramPendingIntent, paramBundle, paramArrayOfRemoteInput1, paramArrayOfRemoteInput2, paramBoolean1, paramInt2, paramBoolean2, paramBoolean3, paramBoolean4);
  }
  
  public NotificationCompat$Action(@Nullable IconCompat paramIconCompat, @Nullable CharSequence paramCharSequence, @Nullable PendingIntent paramPendingIntent)
  {
    this(paramIconCompat, paramCharSequence, paramPendingIntent, new Bundle(), null, null, true, 0, true, false, false);
  }
  
  public NotificationCompat$Action(@Nullable IconCompat paramIconCompat, @Nullable CharSequence paramCharSequence, @Nullable PendingIntent paramPendingIntent, @Nullable Bundle paramBundle, @Nullable RemoteInput[] paramArrayOfRemoteInput1, @Nullable RemoteInput[] paramArrayOfRemoteInput2, boolean paramBoolean1, int paramInt, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
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

/* Location:
 * Qualified Name:     androidx.core.app.NotificationCompat.Action
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */