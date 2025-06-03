package a0;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.service.media.MediaBrowserService.Result;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class d$j
  extends d.i
{
  public d$j(d paramd)
  {
    super(paramd);
  }
  
  public void a()
  {
    b localb = new b(f);
    b = localb;
    localb.onCreate();
  }
  
  public void g(String paramString, Bundle paramBundle)
  {
    if (paramBundle != null) {
      e.a(b, paramString, paramBundle);
    } else {
      super.g(paramString, paramBundle);
    }
  }
  
  public void l(String paramString, final d.m paramm, final Bundle paramBundle)
  {
    a locala = new a(paramString, paramm, paramBundle);
    paramm = f;
    t = q;
    paramm.i(paramString, locala, paramBundle);
    f.t = null;
  }
  
  public class a
    extends d.l
  {
    public a(Object paramObject, d.m paramm, Bundle paramBundle)
    {
      super();
    }
    
    public void a()
    {
      paramm.a();
    }
    
    public void h(List paramList)
    {
      Object localObject1;
      if (paramList == null)
      {
        paramList = paramm;
        localObject1 = null;
      }
      for (;;)
      {
        paramList.c(localObject1);
        return;
        localObject1 = paramList;
        if ((b() & 0x1) != 0) {
          localObject1 = f.b(paramList, paramBundle);
        }
        paramList = new ArrayList(((List)localObject1).size());
        Object localObject2 = ((List)localObject1).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = (MediaBrowserCompat.MediaItem)((Iterator)localObject2).next();
          Parcel localParcel = Parcel.obtain();
          ((MediaBrowserCompat.MediaItem)localObject1).writeToParcel(localParcel, 0);
          paramList.add(localParcel);
        }
        localObject2 = paramm;
        localObject1 = paramList;
        paramList = (List)localObject2;
      }
    }
  }
  
  public class b
    extends d.i.b
  {
    public b(Context paramContext)
    {
      super(paramContext);
    }
    
    public void onLoadChildren(String paramString, MediaBrowserService.Result paramResult, Bundle paramBundle)
    {
      MediaSessionCompat.a(paramBundle);
      d.j localj = d.j.this;
      d locald = f;
      t = q;
      localj.l(paramString, new d.m(paramResult), paramBundle);
      f.t = null;
    }
  }
}

/* Location:
 * Qualified Name:     a0.d.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */