package a0;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService.Result;
import android.support.v4.media.session.MediaSessionCompat;

public class d$j$b
  extends d.i.b
{
  public d$j$b(d.j paramj, Context paramContext)
  {
    super(paramj, paramContext);
  }
  
  public void onLoadChildren(String paramString, MediaBrowserService.Result paramResult, Bundle paramBundle)
  {
    MediaSessionCompat.a(paramBundle);
    d.j localj = q;
    d locald = f;
    t = q;
    localj.l(paramString, new d.m(paramResult), paramBundle);
    q.f.t = null;
  }
}

/* Location:
 * Qualified Name:     a0.d.j.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */