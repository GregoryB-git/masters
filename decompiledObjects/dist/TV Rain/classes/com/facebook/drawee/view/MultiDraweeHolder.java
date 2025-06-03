package com.facebook.drawee.view;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import java.util.ArrayList;

public class MultiDraweeHolder<DH extends DraweeHierarchy>
{
  @VisibleForTesting
  public ArrayList<DraweeHolder<DH>> mHolders = new ArrayList();
  @VisibleForTesting
  public boolean mIsAttached = false;
  
  public void add(int paramInt, DraweeHolder<DH> paramDraweeHolder)
  {
    Preconditions.checkNotNull(paramDraweeHolder);
    Preconditions.checkElementIndex(paramInt, mHolders.size() + 1);
    mHolders.add(paramInt, paramDraweeHolder);
    if (mIsAttached) {
      paramDraweeHolder.onAttach();
    }
  }
  
  public void add(DraweeHolder<DH> paramDraweeHolder)
  {
    add(mHolders.size(), paramDraweeHolder);
  }
  
  public void clear()
  {
    if (mIsAttached) {
      for (int i = 0; i < mHolders.size(); i++) {
        ((DraweeHolder)mHolders.get(i)).onDetach();
      }
    }
    mHolders.clear();
  }
  
  public void draw(Canvas paramCanvas)
  {
    for (int i = 0; i < mHolders.size(); i++)
    {
      Drawable localDrawable = get(i).getTopLevelDrawable();
      if (localDrawable != null) {
        localDrawable.draw(paramCanvas);
      }
    }
  }
  
  public DraweeHolder<DH> get(int paramInt)
  {
    return (DraweeHolder)mHolders.get(paramInt);
  }
  
  public void onAttach()
  {
    if (mIsAttached) {
      return;
    }
    mIsAttached = true;
    for (int i = 0; i < mHolders.size(); i++) {
      ((DraweeHolder)mHolders.get(i)).onAttach();
    }
  }
  
  public void onDetach()
  {
    if (!mIsAttached) {
      return;
    }
    int i = 0;
    mIsAttached = false;
    while (i < mHolders.size())
    {
      ((DraweeHolder)mHolders.get(i)).onDetach();
      i++;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    for (int i = 0; i < mHolders.size(); i++) {
      if (((DraweeHolder)mHolders.get(i)).onTouchEvent(paramMotionEvent)) {
        return true;
      }
    }
    return false;
  }
  
  public void remove(int paramInt)
  {
    DraweeHolder localDraweeHolder = (DraweeHolder)mHolders.get(paramInt);
    if (mIsAttached) {
      localDraweeHolder.onDetach();
    }
    mHolders.remove(paramInt);
  }
  
  public int size()
  {
    return mHolders.size();
  }
  
  public boolean verifyDrawable(Drawable paramDrawable)
  {
    for (int i = 0; i < mHolders.size(); i++) {
      if (paramDrawable == get(i).getTopLevelDrawable()) {
        return true;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.view.MultiDraweeHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */