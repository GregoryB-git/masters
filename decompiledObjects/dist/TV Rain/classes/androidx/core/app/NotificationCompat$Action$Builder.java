package androidx.core.app;

import a3;
import android.app.Notification.Action;
import android.app.PendingIntent;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import e;
import g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public final class NotificationCompat$Action$Builder
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
  
  public NotificationCompat$Action$Builder(int paramInt, @Nullable CharSequence paramCharSequence, @Nullable PendingIntent paramPendingIntent)
  {
    this(localIconCompat, paramCharSequence, paramPendingIntent, new Bundle(), null, true, 0, true, false, false);
  }
  
  public NotificationCompat$Action$Builder(@NonNull NotificationCompat.Action paramAction)
  {
    this(paramAction.getIconCompat(), title, actionIntent, new Bundle(mExtras), paramAction.getRemoteInputs(), paramAction.getAllowGeneratedReplies(), paramAction.getSemanticAction(), mShowsUserInterface, paramAction.isContextual(), paramAction.isAuthenticationRequired());
  }
  
  public NotificationCompat$Action$Builder(@Nullable IconCompat paramIconCompat, @Nullable CharSequence paramCharSequence, @Nullable PendingIntent paramPendingIntent)
  {
    this(paramIconCompat, paramCharSequence, paramPendingIntent, new Bundle(), null, true, 0, true, false, false);
  }
  
  private NotificationCompat$Action$Builder(@Nullable IconCompat paramIconCompat, @Nullable CharSequence paramCharSequence, @Nullable PendingIntent paramPendingIntent, @NonNull Bundle paramBundle, @Nullable RemoteInput[] paramArrayOfRemoteInput, boolean paramBoolean1, int paramInt, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
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

/* Location:
 * Qualified Name:     androidx.core.app.NotificationCompat.Action.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */