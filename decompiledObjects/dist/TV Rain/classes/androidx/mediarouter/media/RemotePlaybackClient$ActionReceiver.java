package androidx.mediarouter.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import z2;

final class RemotePlaybackClient$ActionReceiver
  extends BroadcastReceiver
{
  public static final String ACTION_ITEM_STATUS_CHANGED = "androidx.mediarouter.media.actions.ACTION_ITEM_STATUS_CHANGED";
  public static final String ACTION_MESSAGE_RECEIVED = "androidx.mediarouter.media.actions.ACTION_MESSAGE_RECEIVED";
  public static final String ACTION_SESSION_STATUS_CHANGED = "androidx.mediarouter.media.actions.ACTION_SESSION_STATUS_CHANGED";
  
  public RemotePlaybackClient$ActionReceiver(RemotePlaybackClient paramRemotePlaybackClient) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getStringExtra("android.media.intent.extra.SESSION_ID");
    if ((paramContext != null) && (paramContext.equals(this$0.mSessionId)))
    {
      Object localObject1 = MediaSessionStatus.fromBundle(paramIntent.getBundleExtra("android.media.intent.extra.SESSION_STATUS"));
      Object localObject2 = paramIntent.getAction();
      if (((String)localObject2).equals("androidx.mediarouter.media.actions.ACTION_ITEM_STATUS_CHANGED"))
      {
        String str = paramIntent.getStringExtra("android.media.intent.extra.ITEM_ID");
        if (str == null)
        {
          Log.w("RemotePlaybackClient", "Discarding spurious status callback with missing item id.");
          return;
        }
        localObject2 = MediaItemStatus.fromBundle(paramIntent.getBundleExtra("android.media.intent.extra.ITEM_STATUS"));
        if (localObject2 == null)
        {
          Log.w("RemotePlaybackClient", "Discarding spurious status callback with missing item status.");
          return;
        }
        if (RemotePlaybackClient.DEBUG)
        {
          localObject3 = new StringBuilder();
          ((StringBuilder)localObject3).append("Received item status callback: sessionId=");
          ((StringBuilder)localObject3).append(paramContext);
          ((StringBuilder)localObject3).append(", sessionStatus=");
          ((StringBuilder)localObject3).append(localObject1);
          ((StringBuilder)localObject3).append(", itemId=");
          ((StringBuilder)localObject3).append(str);
          ((StringBuilder)localObject3).append(", itemStatus=");
          ((StringBuilder)localObject3).append(localObject2);
          Log.d("RemotePlaybackClient", ((StringBuilder)localObject3).toString());
        }
        Object localObject3 = this$0.mStatusCallback;
        if (localObject3 != null) {
          ((RemotePlaybackClient.StatusCallback)localObject3).onItemStatusChanged(paramIntent.getExtras(), paramContext, (MediaSessionStatus)localObject1, str, (MediaItemStatus)localObject2);
        }
      }
      else if (((String)localObject2).equals("androidx.mediarouter.media.actions.ACTION_SESSION_STATUS_CHANGED"))
      {
        if (localObject1 == null)
        {
          Log.w("RemotePlaybackClient", "Discarding spurious media status callback with missing session status.");
          return;
        }
        if (RemotePlaybackClient.DEBUG)
        {
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("Received session status callback: sessionId=");
          ((StringBuilder)localObject2).append(paramContext);
          ((StringBuilder)localObject2).append(", sessionStatus=");
          ((StringBuilder)localObject2).append(localObject1);
          Log.d("RemotePlaybackClient", ((StringBuilder)localObject2).toString());
        }
        localObject2 = this$0.mStatusCallback;
        if (localObject2 != null) {
          ((RemotePlaybackClient.StatusCallback)localObject2).onSessionStatusChanged(paramIntent.getExtras(), paramContext, (MediaSessionStatus)localObject1);
        }
      }
      else if (((String)localObject2).equals("androidx.mediarouter.media.actions.ACTION_MESSAGE_RECEIVED"))
      {
        if (RemotePlaybackClient.DEBUG)
        {
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("Received message callback: sessionId=");
          ((StringBuilder)localObject1).append(paramContext);
          Log.d("RemotePlaybackClient", ((StringBuilder)localObject1).toString());
        }
        localObject1 = this$0.mOnMessageReceivedListener;
        if (localObject1 != null) {
          ((RemotePlaybackClient.OnMessageReceivedListener)localObject1).onMessageReceived(paramContext, paramIntent.getBundleExtra("android.media.intent.extra.MESSAGE"));
        }
      }
      return;
    }
    z2.A("Discarding spurious status callback with missing or invalid session id: sessionId=", paramContext, "RemotePlaybackClient");
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.RemotePlaybackClient.ActionReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */