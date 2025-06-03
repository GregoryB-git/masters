package g1;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import java.util.ArrayList;
import java.util.List;

public final class c$m
  implements c.l
{
  public final Messenger a;
  
  public c$m(Messenger paramMessenger)
  {
    a = paramMessenger;
  }
  
  public final IBinder a()
  {
    return a.getBinder();
  }
  
  public final void b(String paramString, List<MediaBrowserCompat.MediaItem> paramList, Bundle paramBundle1, Bundle paramBundle2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("data_media_item_id", paramString);
    localBundle.putBundle("data_options", paramBundle1);
    localBundle.putBundle("data_notify_children_changed_options", paramBundle2);
    if (paramList != null)
    {
      if ((paramList instanceof ArrayList)) {
        paramString = (ArrayList)paramList;
      } else {
        paramString = new ArrayList(paramList);
      }
      localBundle.putParcelableArrayList("data_media_item_list", paramString);
    }
    c(3, localBundle);
  }
  
  public final void c(int paramInt, Bundle paramBundle)
  {
    Message localMessage = Message.obtain();
    what = paramInt;
    arg1 = 2;
    localMessage.setData(paramBundle);
    a.send(localMessage);
  }
}

/* Location:
 * Qualified Name:     g1.c.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */