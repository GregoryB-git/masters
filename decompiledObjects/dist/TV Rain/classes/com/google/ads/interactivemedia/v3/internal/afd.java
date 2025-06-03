package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener;
import com.google.ads.interactivemedia.v3.impl.data.ah;
import com.google.ads.interactivemedia.v3.impl.data.ai;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import z2;

public final class afd
  implements AdErrorEvent.AdErrorListener, AdEvent.AdEventListener, aec, aex
{
  private final afc a;
  private final afg b;
  private final Context c;
  private View d;
  private String e;
  private final Set<View> f;
  private boolean g = false;
  private boolean h = false;
  private e i;
  
  public afd(afc paramafc, Context paramContext)
  {
    this(paramafc, paramContext, new afg());
  }
  
  private afd(afc paramafc, Context paramContext, afg paramafg)
  {
    a = paramafc;
    c = paramContext;
    b = paramafg;
    f = new HashSet();
  }
  
  private final void a(List<View> paramList)
  {
    if (paramList != null) {
      paramList = ai.builder().views(paramList).build();
    } else {
      paramList = null;
    }
    a.b(new aeq(aes.omid, aer.registerFriendlyObstructions, e, paramList));
  }
  
  public final void a()
  {
    f.clear();
    e locale = i;
    if (locale != null)
    {
      locale.c();
      a(null);
    }
  }
  
  public final void a(View paramView)
  {
    c(paramView);
  }
  
  public final void a(String paramString)
  {
    e = paramString;
  }
  
  public final void a(boolean paramBoolean)
  {
    h = true;
  }
  
  public final void b()
  {
    b.a();
    b.a(c);
    g = true;
  }
  
  public final void b(View paramView)
  {
    d = paramView;
  }
  
  public final void c()
  {
    g = false;
  }
  
  public final void c(View paramView)
  {
    if (f.contains(paramView)) {
      return;
    }
    f.add(paramView);
    e locale = i;
    if (locale == null) {
      return;
    }
    locale.b(paramView);
    a(Arrays.asList(new View[] { paramView }));
  }
  
  public final boolean d()
  {
    if (g)
    {
      e locale = i;
      if (locale != null)
      {
        locale.b();
        i = null;
        return true;
      }
    }
    return false;
  }
  
  public final void onAdError(AdErrorEvent paramAdErrorEvent)
  {
    if (g)
    {
      paramAdErrorEvent = i;
      if (paramAdErrorEvent != null)
      {
        paramAdErrorEvent.b();
        i = null;
      }
    }
  }
  
  public final void onAdEvent(AdEvent paramAdEvent)
  {
    if (g)
    {
      int j = paramAdEvent.getType().ordinal();
      if (j != 3) {
        if (j != 19)
        {
          if (j != 14) {
            if (j != 15) {
              return;
            }
          }
        }
        else
        {
          if ((!g) || (i != null) || (d == null)) {
            return;
          }
          paramAdEvent = c.a;
          Object localObject = fc.a(paramAdEvent, paramAdEvent, true);
          f localf = f.a("Google1", "3.14.0");
          WebView localWebView = a.b();
          if (h) {
            paramAdEvent = "true";
          } else {
            paramAdEvent = "false";
          }
          paramAdEvent = e.a((fc)localObject, hu.a(localf, localWebView, z2.l(paramAdEvent.length() + 7, "{ssai:", paramAdEvent, "}")));
          i = paramAdEvent;
          paramAdEvent.a(d);
          localObject = f.iterator();
          while (((Iterator)localObject).hasNext())
          {
            paramAdEvent = (View)((Iterator)localObject).next();
            i.b(paramAdEvent);
          }
          if (!f.isEmpty()) {
            a(new ArrayList(f));
          }
          i.a();
          return;
        }
      }
      d();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.afd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */