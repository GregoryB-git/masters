package android.support.v4.media.session;

import androidx.annotation.RestrictTo;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract interface MediaSessionCompat$RegistrationCallback
{
  public abstract void onCallbackRegistered(int paramInt1, int paramInt2);
  
  public abstract void onCallbackUnregistered(int paramInt1, int paramInt2);
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.RegistrationCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */