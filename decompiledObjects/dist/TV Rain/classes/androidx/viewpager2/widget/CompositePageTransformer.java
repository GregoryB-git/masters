package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CompositePageTransformer
  implements ViewPager2.PageTransformer
{
  private final List<ViewPager2.PageTransformer> mTransformers = new ArrayList();
  
  public void addTransformer(@NonNull ViewPager2.PageTransformer paramPageTransformer)
  {
    mTransformers.add(paramPageTransformer);
  }
  
  public void removeTransformer(@NonNull ViewPager2.PageTransformer paramPageTransformer)
  {
    mTransformers.remove(paramPageTransformer);
  }
  
  public void transformPage(@NonNull View paramView, float paramFloat)
  {
    Iterator localIterator = mTransformers.iterator();
    while (localIterator.hasNext()) {
      ((ViewPager2.PageTransformer)localIterator.next()).transformPage(paramView, paramFloat);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager2.widget.CompositePageTransformer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */