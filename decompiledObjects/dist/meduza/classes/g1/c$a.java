package g1;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.util.Log;
import f;
import java.util.List;
import r.h;

public final class c$a
  extends c.i<List<MediaBrowserCompat.MediaItem>>
{
  public c$a(c paramc, Object paramObject, c.c paramc1, String paramString, Bundle paramBundle1, Bundle paramBundle2)
  {
    super(paramObject);
  }
  
  public final void d(Object paramObject)
  {
    Object localObject1 = (List)paramObject;
    if (j.d.getOrDefault(((c.m)f.d).a(), null) != f)
    {
      if (c.o)
      {
        paramObject = f.l("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
        ((StringBuilder)paramObject).append(f.a);
        ((StringBuilder)paramObject).append(" id=");
        ((StringBuilder)paramObject).append(g);
        Log.d("MBServiceCompat", ((StringBuilder)paramObject).toString());
      }
    }
    else
    {
      paramObject = localObject1;
      Object localObject2;
      if ((e & 0x1) != 0)
      {
        localObject2 = j;
        paramObject = h;
        localObject2.getClass();
        paramObject = c.a((List)localObject1, (Bundle)paramObject);
      }
      try
      {
        localObject2 = f.d;
        String str = g;
        localObject1 = h;
        Bundle localBundle = i;
        ((c.m)localObject2).b(str, (List)paramObject, (Bundle)localObject1, localBundle);
      }
      catch (RemoteException paramObject)
      {
        paramObject = f.l("Calling onLoadChildren() failed for id=");
        ((StringBuilder)paramObject).append(g);
        ((StringBuilder)paramObject).append(" package=");
        ((StringBuilder)paramObject).append(f.a);
        Log.w("MBServiceCompat", ((StringBuilder)paramObject).toString());
      }
    }
  }
}

/* Location:
 * Qualified Name:     g1.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */