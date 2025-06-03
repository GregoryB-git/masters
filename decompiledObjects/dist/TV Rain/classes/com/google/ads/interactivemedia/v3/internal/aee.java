package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot.ClickListener;
import java.util.ArrayList;
import java.util.List;

public final class aee
  implements CompanionAdSlot
{
  private int a;
  private int b;
  private ViewGroup c;
  private String d;
  private final List<CompanionAdSlot.ClickListener> e = new ArrayList(1);
  
  public final List<CompanionAdSlot.ClickListener> a()
  {
    return e;
  }
  
  public final void a(String paramString)
  {
    d = paramString;
  }
  
  public final void addClickListener(CompanionAdSlot.ClickListener paramClickListener)
  {
    e.add(paramClickListener);
  }
  
  public final ViewGroup getContainer()
  {
    return c;
  }
  
  public final int getHeight()
  {
    return b;
  }
  
  public final int getWidth()
  {
    return a;
  }
  
  public final boolean isFilled()
  {
    return c.findViewWithTag(d) != null;
  }
  
  public final void removeClickListener(CompanionAdSlot.ClickListener paramClickListener)
  {
    e.remove(paramClickListener);
  }
  
  public final void setContainer(ViewGroup paramViewGroup)
  {
    c = paramViewGroup;
  }
  
  public final void setSize(int paramInt1, int paramInt2)
  {
    a = paramInt1;
    b = paramInt2;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aee
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */