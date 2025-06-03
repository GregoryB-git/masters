package a0;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.support.v4.media.session.MediaSessionCompat.Token;
import java.util.ArrayList;
import java.util.List;

public class d$p
  implements d.o
{
  public final Messenger a;
  
  public d$p(Messenger paramMessenger)
  {
    a = paramMessenger;
  }
  
  public void a()
  {
    d(2, null);
  }
  
  public IBinder asBinder()
  {
    return a.getBinder();
  }
  
  public void b(String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle)
  {
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    localBundle.putInt("extra_service_version", 2);
    paramBundle = new Bundle();
    paramBundle.putString("data_media_item_id", paramString);
    paramBundle.putParcelable("data_media_session_token", paramToken);
    paramBundle.putBundle("data_root_hints", localBundle);
    d(1, paramBundle);
  }
  
  public void c(String paramString, List paramList, Bundle paramBundle1, Bundle paramBundle2)
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
    d(3, localBundle);
  }
  
  public final void d(int paramInt, Bundle paramBundle)
  {
    Message localMessage = Message.obtain();
    what = paramInt;
    arg1 = 2;
    localMessage.setData(paramBundle);
    a.send(localMessage);
  }
}

/* Location:
 * Qualified Name:     a0.d.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */