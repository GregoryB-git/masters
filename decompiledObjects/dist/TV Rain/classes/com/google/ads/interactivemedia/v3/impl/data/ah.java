package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class ah
{
  public abstract ai build();
  
  public abstract ah obstructions(List<ak> paramList);
  
  public ah views(Collection<View> paramCollection)
  {
    ArrayList localArrayList = new ArrayList();
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      View localView = (View)paramCollection.next();
      localArrayList.add(ak.builder().view(localView).build());
    }
    return obstructions(localArrayList);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.ah
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */