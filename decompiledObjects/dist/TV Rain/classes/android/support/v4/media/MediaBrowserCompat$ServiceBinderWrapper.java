package android.support.v4.media;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.os.ResultReceiver;
import androidx.core.app.BundleCompat;

class MediaBrowserCompat$ServiceBinderWrapper
{
  private Messenger mMessenger;
  private Bundle mRootHints;
  
  public MediaBrowserCompat$ServiceBinderWrapper(IBinder paramIBinder, Bundle paramBundle)
  {
    mMessenger = new Messenger(paramIBinder);
    mRootHints = paramBundle;
  }
  
  private void sendRequest(int paramInt, Bundle paramBundle, Messenger paramMessenger)
    throws RemoteException
  {
    Message localMessage = Message.obtain();
    what = paramInt;
    arg1 = 1;
    localMessage.setData(paramBundle);
    replyTo = paramMessenger;
    mMessenger.send(localMessage);
  }
  
  public void addSubscription(String paramString, IBinder paramIBinder, Bundle paramBundle, Messenger paramMessenger)
    throws RemoteException
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("data_media_item_id", paramString);
    BundleCompat.putBinder(localBundle, "data_callback_token", paramIBinder);
    localBundle.putBundle("data_options", paramBundle);
    sendRequest(3, localBundle, paramMessenger);
  }
  
  public void connect(Context paramContext, Messenger paramMessenger)
    throws RemoteException
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("data_package_name", paramContext.getPackageName());
    localBundle.putInt("data_calling_pid", Process.myPid());
    localBundle.putBundle("data_root_hints", mRootHints);
    sendRequest(1, localBundle, paramMessenger);
  }
  
  public void disconnect(Messenger paramMessenger)
    throws RemoteException
  {
    sendRequest(2, null, paramMessenger);
  }
  
  public void getMediaItem(String paramString, ResultReceiver paramResultReceiver, Messenger paramMessenger)
    throws RemoteException
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("data_media_item_id", paramString);
    localBundle.putParcelable("data_result_receiver", paramResultReceiver);
    sendRequest(5, localBundle, paramMessenger);
  }
  
  public void registerCallbackMessenger(Context paramContext, Messenger paramMessenger)
    throws RemoteException
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("data_package_name", paramContext.getPackageName());
    localBundle.putInt("data_calling_pid", Process.myPid());
    localBundle.putBundle("data_root_hints", mRootHints);
    sendRequest(6, localBundle, paramMessenger);
  }
  
  public void removeSubscription(String paramString, IBinder paramIBinder, Messenger paramMessenger)
    throws RemoteException
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("data_media_item_id", paramString);
    BundleCompat.putBinder(localBundle, "data_callback_token", paramIBinder);
    sendRequest(4, localBundle, paramMessenger);
  }
  
  public void search(String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver, Messenger paramMessenger)
    throws RemoteException
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("data_search_query", paramString);
    localBundle.putBundle("data_search_extras", paramBundle);
    localBundle.putParcelable("data_result_receiver", paramResultReceiver);
    sendRequest(8, localBundle, paramMessenger);
  }
  
  public void sendCustomAction(String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver, Messenger paramMessenger)
    throws RemoteException
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("data_custom_action", paramString);
    localBundle.putBundle("data_custom_action_extras", paramBundle);
    localBundle.putParcelable("data_result_receiver", paramResultReceiver);
    sendRequest(9, localBundle, paramMessenger);
  }
  
  public void unregisterCallbackMessenger(Messenger paramMessenger)
    throws RemoteException
  {
    sendRequest(7, null, paramMessenger);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.ServiceBinderWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */