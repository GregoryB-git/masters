package androidx.core.app;

import a3;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.util.Preconditions;
import androidx.versionedparcelable.VersionedParcelable;

public final class RemoteActionCompat
  implements VersionedParcelable
{
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public PendingIntent mActionIntent;
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public CharSequence mContentDescription;
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public boolean mEnabled;
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public IconCompat mIcon;
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public boolean mShouldShowIcon;
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public CharSequence mTitle;
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public RemoteActionCompat() {}
  
  public RemoteActionCompat(@NonNull RemoteActionCompat paramRemoteActionCompat)
  {
    Preconditions.checkNotNull(paramRemoteActionCompat);
    mIcon = mIcon;
    mTitle = mTitle;
    mContentDescription = mContentDescription;
    mActionIntent = mActionIntent;
    mEnabled = mEnabled;
    mShouldShowIcon = mShouldShowIcon;
  }
  
  public RemoteActionCompat(@NonNull IconCompat paramIconCompat, @NonNull CharSequence paramCharSequence1, @NonNull CharSequence paramCharSequence2, @NonNull PendingIntent paramPendingIntent)
  {
    mIcon = ((IconCompat)Preconditions.checkNotNull(paramIconCompat));
    mTitle = ((CharSequence)Preconditions.checkNotNull(paramCharSequence1));
    mContentDescription = ((CharSequence)Preconditions.checkNotNull(paramCharSequence2));
    mActionIntent = ((PendingIntent)Preconditions.checkNotNull(paramPendingIntent));
    mEnabled = true;
    mShouldShowIcon = true;
  }
  
  @NonNull
  @RequiresApi(26)
  public static RemoteActionCompat createFromRemoteAction(@NonNull RemoteAction paramRemoteAction)
  {
    Preconditions.checkNotNull(paramRemoteAction);
    RemoteActionCompat localRemoteActionCompat = new RemoteActionCompat(IconCompat.createFromIcon(Api26Impl.getIcon(paramRemoteAction)), Api26Impl.getTitle(paramRemoteAction), Api26Impl.getContentDescription(paramRemoteAction), Api26Impl.getActionIntent(paramRemoteAction));
    localRemoteActionCompat.setEnabled(Api26Impl.isEnabled(paramRemoteAction));
    if (Build.VERSION.SDK_INT >= 28) {
      localRemoteActionCompat.setShouldShowIcon(Api28Impl.shouldShowIcon(paramRemoteAction));
    }
    return localRemoteActionCompat;
  }
  
  @NonNull
  public PendingIntent getActionIntent()
  {
    return mActionIntent;
  }
  
  @NonNull
  public CharSequence getContentDescription()
  {
    return mContentDescription;
  }
  
  @NonNull
  public IconCompat getIcon()
  {
    return mIcon;
  }
  
  @NonNull
  public CharSequence getTitle()
  {
    return mTitle;
  }
  
  public boolean isEnabled()
  {
    return mEnabled;
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    mEnabled = paramBoolean;
  }
  
  public void setShouldShowIcon(boolean paramBoolean)
  {
    mShouldShowIcon = paramBoolean;
  }
  
  @SuppressLint({"KotlinPropertyAccess"})
  public boolean shouldShowIcon()
  {
    return mShouldShowIcon;
  }
  
  @NonNull
  @RequiresApi(26)
  public RemoteAction toRemoteAction()
  {
    RemoteAction localRemoteAction = Api26Impl.createRemoteAction(mIcon.toIcon(), mTitle, mContentDescription, mActionIntent);
    Api26Impl.setEnabled(localRemoteAction, isEnabled());
    if (Build.VERSION.SDK_INT >= 28) {
      Api28Impl.setShouldShowIcon(localRemoteAction, shouldShowIcon());
    }
    return localRemoteAction;
  }
  
  @RequiresApi(26)
  public static class Api26Impl
  {
    @DoNotInline
    public static RemoteAction createRemoteAction(Icon paramIcon, CharSequence paramCharSequence1, CharSequence paramCharSequence2, PendingIntent paramPendingIntent)
    {
      return new RemoteAction(paramIcon, paramCharSequence1, paramCharSequence2, paramPendingIntent);
    }
    
    @DoNotInline
    public static PendingIntent getActionIntent(RemoteAction paramRemoteAction)
    {
      return paramRemoteAction.getActionIntent();
    }
    
    @DoNotInline
    public static CharSequence getContentDescription(RemoteAction paramRemoteAction)
    {
      return paramRemoteAction.getContentDescription();
    }
    
    @DoNotInline
    public static Icon getIcon(RemoteAction paramRemoteAction)
    {
      return paramRemoteAction.getIcon();
    }
    
    @DoNotInline
    public static CharSequence getTitle(RemoteAction paramRemoteAction)
    {
      return paramRemoteAction.getTitle();
    }
    
    @DoNotInline
    public static boolean isEnabled(RemoteAction paramRemoteAction)
    {
      return paramRemoteAction.isEnabled();
    }
    
    @DoNotInline
    public static void setEnabled(RemoteAction paramRemoteAction, boolean paramBoolean)
    {
      paramRemoteAction.setEnabled(paramBoolean);
    }
  }
  
  @RequiresApi(28)
  public static class Api28Impl
  {
    @DoNotInline
    public static void setShouldShowIcon(RemoteAction paramRemoteAction, boolean paramBoolean)
    {
      a3.p(paramRemoteAction, paramBoolean);
    }
    
    @DoNotInline
    public static boolean shouldShowIcon(RemoteAction paramRemoteAction)
    {
      return a3.z(paramRemoteAction);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.RemoteActionCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */