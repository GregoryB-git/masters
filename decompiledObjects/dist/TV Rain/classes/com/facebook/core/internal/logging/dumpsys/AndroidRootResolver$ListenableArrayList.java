package com.facebook.core.internal.logging.dumpsys;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;

public class AndroidRootResolver$ListenableArrayList
  extends ArrayList<View>
{
  @Nullable
  private AndroidRootResolver.Listener listener;
  
  public boolean add(View paramView)
  {
    boolean bool = super.add(paramView);
    if (bool)
    {
      AndroidRootResolver.Listener localListener = listener;
      if (localListener != null)
      {
        localListener.onRootAdded(paramView);
        listener.onRootsChanged(this);
      }
    }
    return bool;
  }
  
  public View remove(int paramInt)
  {
    View localView = (View)super.remove(paramInt);
    AndroidRootResolver.Listener localListener = listener;
    if (localListener != null)
    {
      localListener.onRootRemoved(localView);
      listener.onRootsChanged(this);
    }
    return localView;
  }
  
  public boolean remove(@Nullable Object paramObject)
  {
    boolean bool = super.remove(paramObject);
    if (bool)
    {
      AndroidRootResolver.Listener localListener = listener;
      if ((localListener != null) && ((paramObject instanceof View)))
      {
        localListener.onRootRemoved((View)paramObject);
        listener.onRootsChanged(this);
      }
    }
    return bool;
  }
  
  public void setListener(AndroidRootResolver.Listener paramListener)
  {
    listener = paramListener;
  }
}

/* Location:
 * Qualified Name:     com.facebook.core.internal.logging.dumpsys.AndroidRootResolver.ListenableArrayList
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */