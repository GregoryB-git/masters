package android.support.v4.media;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat.Token;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

abstract interface MediaBrowserCompat$MediaBrowserImpl
{
  public abstract void connect();
  
  public abstract void disconnect();
  
  @Nullable
  public abstract Bundle getExtras();
  
  public abstract void getItem(@NonNull String paramString, @NonNull MediaBrowserCompat.ItemCallback paramItemCallback);
  
  @Nullable
  public abstract Bundle getNotifyChildrenChangedOptions();
  
  @NonNull
  public abstract String getRoot();
  
  public abstract ComponentName getServiceComponent();
  
  @NonNull
  public abstract MediaSessionCompat.Token getSessionToken();
  
  public abstract boolean isConnected();
  
  public abstract void search(@NonNull String paramString, Bundle paramBundle, @NonNull MediaBrowserCompat.SearchCallback paramSearchCallback);
  
  public abstract void sendCustomAction(@NonNull String paramString, Bundle paramBundle, @Nullable MediaBrowserCompat.CustomActionCallback paramCustomActionCallback);
  
  public abstract void subscribe(@NonNull String paramString, @Nullable Bundle paramBundle, @NonNull MediaBrowserCompat.SubscriptionCallback paramSubscriptionCallback);
  
  public abstract void unsubscribe(@NonNull String paramString, MediaBrowserCompat.SubscriptionCallback paramSubscriptionCallback);
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */