package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class adz
  implements BaseDisplayContainer
{
  private static int f;
  private ViewGroup a;
  private Collection<CompanionAdSlot> b = Collections.emptyList();
  private Map<String, CompanionAdSlot> c = null;
  private final Set<View> d = new HashSet();
  private aec e = null;
  
  public final Map<String, CompanionAdSlot> a()
  {
    return c;
  }
  
  public final void a(aec paramaec)
  {
    e = paramaec;
  }
  
  public final Set<View> b()
  {
    return new HashSet(d);
  }
  
  public void destroy()
  {
    ViewGroup localViewGroup = a;
    if (localViewGroup != null) {
      localViewGroup.removeAllViews();
    }
  }
  
  public ViewGroup getAdContainer()
  {
    return a;
  }
  
  public Collection<CompanionAdSlot> getCompanionSlots()
  {
    return b;
  }
  
  public void registerVideoControlsOverlay(View paramView)
  {
    if ((paramView != null) && (!d.contains(paramView)))
    {
      d.add(paramView);
      aec localaec = e;
      if (localaec == null) {
        return;
      }
      localaec.a(paramView);
    }
  }
  
  public void setAdContainer(ViewGroup paramViewGroup)
  {
    a = paramViewGroup;
  }
  
  public void setCompanionSlots(Collection<CompanionAdSlot> paramCollection)
  {
    aim localaim = new aim();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      CompanionAdSlot localCompanionAdSlot = (CompanionAdSlot)localIterator.next();
      if (localCompanionAdSlot != null)
      {
        int i = f;
        f = i + 1;
        StringBuilder localStringBuilder = new StringBuilder(20);
        localStringBuilder.append("compSlot_");
        localStringBuilder.append(i);
        localaim.b(localStringBuilder.toString(), localCompanionAdSlot);
      }
    }
    c = localaim.a();
    b = paramCollection;
  }
  
  public void unregisterAllVideoControlsOverlays()
  {
    d.clear();
    aec localaec = e;
    if (localaec == null) {
      return;
    }
    localaec.a();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.adz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */