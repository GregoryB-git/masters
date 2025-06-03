package a0;

import android.content.Context;
import android.service.media.MediaBrowserService.Result;

public class d$i$b
  extends d.h.d
{
  public d$i$b(d.i parami, Context paramContext)
  {
    super(parami, paramContext);
  }
  
  public void onLoadItem(String paramString, MediaBrowserService.Result paramResult)
  {
    p.k(paramString, new d.m(paramResult));
  }
}

/* Location:
 * Qualified Name:     a0.d.i.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */