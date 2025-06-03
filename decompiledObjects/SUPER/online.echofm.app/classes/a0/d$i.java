package a0;

import android.content.Context;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.service.media.MediaBrowserService.Result;
import android.support.v4.media.MediaBrowserCompat.MediaItem;

public class d$i
  extends d.h
{
  public d$i(d paramd)
  {
    super(paramd);
  }
  
  public void a()
  {
    b localb = new b(e);
    b = localb;
    localb.onCreate();
  }
  
  public void k(String paramString, final d.m paramm)
  {
    paramm = new a(paramString, paramm);
    d locald = e;
    t = q;
    locald.j(paramString, paramm);
    e.t = null;
  }
  
  public class a
    extends d.l
  {
    public a(Object paramObject, d.m paramm)
    {
      super();
    }
    
    public void a()
    {
      paramm.a();
    }
    
    public void h(MediaBrowserCompat.MediaItem paramMediaItem)
    {
      Object localObject;
      if (paramMediaItem == null)
      {
        localObject = paramm;
        paramMediaItem = null;
      }
      for (;;)
      {
        ((d.m)localObject).c(paramMediaItem);
        break;
        localObject = Parcel.obtain();
        paramMediaItem.writeToParcel((Parcel)localObject, 0);
        d.m localm = paramm;
        paramMediaItem = (MediaBrowserCompat.MediaItem)localObject;
        localObject = localm;
      }
    }
  }
  
  public class b
    extends d.h.d
  {
    public b(Context paramContext)
    {
      super(paramContext);
    }
    
    public void onLoadItem(String paramString, MediaBrowserService.Result paramResult)
    {
      k(paramString, new d.m(paramResult));
    }
  }
}

/* Location:
 * Qualified Name:     a0.d.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */