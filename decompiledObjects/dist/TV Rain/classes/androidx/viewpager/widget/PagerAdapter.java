package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.database.Observable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class PagerAdapter
{
  public static final int POSITION_NONE = -2;
  public static final int POSITION_UNCHANGED = -1;
  private final DataSetObservable mObservable = new DataSetObservable();
  private DataSetObserver mViewPagerObserver;
  
  @Deprecated
  public void destroyItem(@NonNull View paramView, int paramInt, @NonNull Object paramObject)
  {
    throw new UnsupportedOperationException("Required method destroyItem was not overridden");
  }
  
  public void destroyItem(@NonNull ViewGroup paramViewGroup, int paramInt, @NonNull Object paramObject)
  {
    destroyItem(paramViewGroup, paramInt, paramObject);
  }
  
  @Deprecated
  public void finishUpdate(@NonNull View paramView) {}
  
  public void finishUpdate(@NonNull ViewGroup paramViewGroup)
  {
    finishUpdate(paramViewGroup);
  }
  
  public abstract int getCount();
  
  public int getItemPosition(@NonNull Object paramObject)
  {
    return -1;
  }
  
  @Nullable
  public CharSequence getPageTitle(int paramInt)
  {
    return null;
  }
  
  public float getPageWidth(int paramInt)
  {
    return 1.0F;
  }
  
  @Deprecated
  @NonNull
  public Object instantiateItem(@NonNull View paramView, int paramInt)
  {
    throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
  }
  
  @NonNull
  public Object instantiateItem(@NonNull ViewGroup paramViewGroup, int paramInt)
  {
    return instantiateItem(paramViewGroup, paramInt);
  }
  
  public abstract boolean isViewFromObject(@NonNull View paramView, @NonNull Object paramObject);
  
  public void notifyDataSetChanged()
  {
    try
    {
      DataSetObserver localDataSetObserver = mViewPagerObserver;
      if (localDataSetObserver != null) {
        localDataSetObserver.onChanged();
      }
      mObservable.notifyChanged();
      return;
    }
    finally {}
  }
  
  public void registerDataSetObserver(@NonNull DataSetObserver paramDataSetObserver)
  {
    mObservable.registerObserver(paramDataSetObserver);
  }
  
  public void restoreState(@Nullable Parcelable paramParcelable, @Nullable ClassLoader paramClassLoader) {}
  
  @Nullable
  public Parcelable saveState()
  {
    return null;
  }
  
  @Deprecated
  public void setPrimaryItem(@NonNull View paramView, int paramInt, @NonNull Object paramObject) {}
  
  public void setPrimaryItem(@NonNull ViewGroup paramViewGroup, int paramInt, @NonNull Object paramObject)
  {
    setPrimaryItem(paramViewGroup, paramInt, paramObject);
  }
  
  public void setViewPagerObserver(DataSetObserver paramDataSetObserver)
  {
    try
    {
      mViewPagerObserver = paramDataSetObserver;
      return;
    }
    finally {}
  }
  
  @Deprecated
  public void startUpdate(@NonNull View paramView) {}
  
  public void startUpdate(@NonNull ViewGroup paramViewGroup)
  {
    startUpdate(paramViewGroup);
  }
  
  public void unregisterDataSetObserver(@NonNull DataSetObserver paramDataSetObserver)
  {
    mObservable.unregisterObserver(paramDataSetObserver);
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager.widget.PagerAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */