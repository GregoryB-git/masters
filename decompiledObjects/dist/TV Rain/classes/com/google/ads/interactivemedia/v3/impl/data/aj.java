package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;
import androidx.core.view.ViewCompat;

public abstract class aj
{
  public abstract aj attached(boolean paramBoolean);
  
  public abstract aj bounds(y paramy);
  
  public abstract ak build();
  
  public abstract aj hidden(boolean paramBoolean);
  
  public abstract aj type(String paramString);
  
  public aj view(View paramView)
  {
    y localy = y.builder().locationOnScreenOfView(paramView).build();
    return attached(ViewCompat.isAttachedToWindow(paramView)).bounds(localy).hidden(paramView.isShown() ^ true).type(paramView.getClass().getCanonicalName());
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.aj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */