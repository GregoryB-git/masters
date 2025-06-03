package com.google.ads.interactivemedia.v3.api;

import android.view.ViewGroup;

public abstract interface CompanionAdSlot
{
  public abstract void addClickListener(ClickListener paramClickListener);
  
  public abstract ViewGroup getContainer();
  
  public abstract int getHeight();
  
  public abstract int getWidth();
  
  public abstract boolean isFilled();
  
  public abstract void removeClickListener(ClickListener paramClickListener);
  
  public abstract void setContainer(ViewGroup paramViewGroup);
  
  public abstract void setSize(int paramInt1, int paramInt2);
  
  public static abstract interface ClickListener
  {
    public abstract void onCompanionAdClick();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.api.CompanionAdSlot
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */