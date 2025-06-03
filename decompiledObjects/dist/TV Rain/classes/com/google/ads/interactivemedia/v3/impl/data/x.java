package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;

public abstract class x
{
  public abstract y build();
  
  public abstract x height(int paramInt);
  
  public abstract x left(int paramInt);
  
  public x locationOnScreenOfView(View paramView)
  {
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    return left(arrayOfInt[0]).top(arrayOfInt[1]).height(paramView.getHeight()).width(paramView.getWidth());
  }
  
  public abstract x top(int paramInt);
  
  public abstract x width(int paramInt);
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */