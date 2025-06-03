package androidx.viewpager2.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Px;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

final class CompositeOnPageChangeCallback
  extends ViewPager2.OnPageChangeCallback
{
  @NonNull
  private final List<ViewPager2.OnPageChangeCallback> mCallbacks;
  
  public CompositeOnPageChangeCallback(int paramInt)
  {
    mCallbacks = new ArrayList(paramInt);
  }
  
  private void throwCallbackListModifiedWhileInUse(ConcurrentModificationException paramConcurrentModificationException)
  {
    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", paramConcurrentModificationException);
  }
  
  public void addOnPageChangeCallback(ViewPager2.OnPageChangeCallback paramOnPageChangeCallback)
  {
    mCallbacks.add(paramOnPageChangeCallback);
  }
  
  public void onPageScrollStateChanged(int paramInt)
  {
    try
    {
      Iterator localIterator = mCallbacks.iterator();
      while (localIterator.hasNext()) {
        ((ViewPager2.OnPageChangeCallback)localIterator.next()).onPageScrollStateChanged(paramInt);
      }
      return;
    }
    catch (ConcurrentModificationException localConcurrentModificationException)
    {
      throwCallbackListModifiedWhileInUse(localConcurrentModificationException);
    }
  }
  
  public void onPageScrolled(int paramInt1, float paramFloat, @Px int paramInt2)
  {
    try
    {
      Iterator localIterator = mCallbacks.iterator();
      while (localIterator.hasNext()) {
        ((ViewPager2.OnPageChangeCallback)localIterator.next()).onPageScrolled(paramInt1, paramFloat, paramInt2);
      }
      return;
    }
    catch (ConcurrentModificationException localConcurrentModificationException)
    {
      throwCallbackListModifiedWhileInUse(localConcurrentModificationException);
    }
  }
  
  public void onPageSelected(int paramInt)
  {
    try
    {
      Iterator localIterator = mCallbacks.iterator();
      while (localIterator.hasNext()) {
        ((ViewPager2.OnPageChangeCallback)localIterator.next()).onPageSelected(paramInt);
      }
      return;
    }
    catch (ConcurrentModificationException localConcurrentModificationException)
    {
      throwCallbackListModifiedWhileInUse(localConcurrentModificationException);
    }
  }
  
  public void removeOnPageChangeCallback(ViewPager2.OnPageChangeCallback paramOnPageChangeCallback)
  {
    mCallbacks.remove(paramOnPageChangeCallback);
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager2.widget.CompositeOnPageChangeCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */