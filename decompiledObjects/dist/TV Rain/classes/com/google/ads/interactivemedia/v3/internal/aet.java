package com.google.ads.interactivemedia.v3.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.media.AudioManager;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.google.ads.interactivemedia.v3.impl.data.a;
import com.google.ads.interactivemedia.v3.impl.data.c;
import com.google.ads.interactivemedia.v3.impl.data.x;
import com.google.ads.interactivemedia.v3.impl.data.y;

public class aet
{
  private final afc a;
  private String b;
  private View c;
  private adg d;
  private add e;
  private Activity f;
  private boolean g;
  
  public aet(String paramString, afc paramafc, View paramView)
  {
    this(paramString, paramafc, paramView, new adg((byte)0));
  }
  
  public aet(String paramString, afc paramafc, View paramView, adg paramadg)
  {
    b = paramString;
    a = paramafc;
    c = paramView;
    d = paramadg;
    f = null;
    e = null;
    g = false;
  }
  
  private static int a(int paramInt, float paramFloat)
  {
    return (int)Math.ceil(paramInt / paramFloat);
  }
  
  private static y a(y paramy, float paramFloat)
  {
    return y.builder().left(a(paramy.left(), paramFloat)).top(a(paramy.top(), paramFloat)).height(a(paramy.height(), paramFloat)).width(a(paramy.width(), paramFloat)).build();
  }
  
  private DisplayMetrics i()
  {
    return c.getContext().getResources().getDisplayMetrics();
  }
  
  private Application j()
  {
    Context localContext = c.getContext().getApplicationContext();
    if ((localContext instanceof Application)) {
      return (Application)localContext;
    }
    return null;
  }
  
  public a a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    y localy1 = g();
    y localy2 = h();
    boolean bool1 = ViewCompat.isAttachedToWindow(c);
    boolean bool2 = f();
    double d1 = e();
    long l = d.a();
    return a.builder().queryId(paramString1).eventId(paramString2).vastEvent(paramString3).appState(paramString4).nativeTime(l).nativeVolume(d1).nativeViewAttached(bool1).nativeViewHidden(bool2).nativeViewBounds(localy1).nativeViewVisibleBounds(localy2).build();
  }
  
  public void a()
  {
    a.a(this, b);
  }
  
  public void a(String paramString1, String paramString2)
  {
    paramString1 = a(paramString1, paramString2, "", "");
    a.b(new aeq(aes.activityMonitor, aer.viewability, b, paramString1));
  }
  
  public void a(String paramString1, String paramString2, String paramString3)
  {
    paramString1 = a(paramString1, paramString2, paramString3, "");
    a.b(new aeq(aes.activityMonitor, aer.viewability, b, paramString1));
  }
  
  public void a(boolean paramBoolean)
  {
    g = paramBoolean;
  }
  
  public void b()
  {
    a.a(b);
  }
  
  @TargetApi(14)
  public void c()
  {
    if (g)
    {
      Application localApplication = j();
      if (localApplication != null)
      {
        add localadd = new add(this);
        e = localadd;
        localApplication.registerActivityLifecycleCallbacks(localadd);
      }
    }
  }
  
  @TargetApi(14)
  public void d()
  {
    Application localApplication = j();
    if (localApplication != null)
    {
      add localadd = e;
      if (localadd != null) {
        localApplication.unregisterActivityLifecycleCallbacks(localadd);
      }
    }
  }
  
  public double e()
  {
    AudioManager localAudioManager = (AudioManager)c.getContext().getSystemService("audio");
    double d1;
    if (localAudioManager != null)
    {
      int i = localAudioManager.getStreamVolume(3);
      int j = localAudioManager.getStreamMaxVolume(3);
      d1 = i / j;
    }
    else
    {
      d1 = 0.0D;
    }
    return d1;
  }
  
  public boolean f()
  {
    Rect localRect = new Rect();
    return (!c.getGlobalVisibleRect(localRect)) || (!c.isShown());
  }
  
  public y g()
  {
    return a(y.builder().locationOnScreenOfView(c).build(), idensity);
  }
  
  public y h()
  {
    Rect localRect = new Rect();
    boolean bool = c.getGlobalVisibleRect(localRect);
    int i;
    if (c.getWindowToken() != null) {
      i = 1;
    } else {
      i = 0;
    }
    if ((!bool) || (i == 0) || (!c.isShown())) {
      localRect.set(0, 0, 0, 0);
    }
    return a(y.builder().left(left).top(top).height(localRect.height()).width(localRect.width()).build(), idensity);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */