package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.constraintlayout.widget.R.styleable;

public class Layer
  extends ConstraintHelper
{
  private static final String TAG = "Layer";
  private boolean mApplyElevationOnAttach;
  private boolean mApplyVisibilityOnAttach;
  public float mComputedCenterX = NaN.0F;
  public float mComputedCenterY = NaN.0F;
  public float mComputedMaxX = NaN.0F;
  public float mComputedMaxY = NaN.0F;
  public float mComputedMinX = NaN.0F;
  public float mComputedMinY = NaN.0F;
  public ConstraintLayout mContainer;
  private float mGroupRotateAngle = NaN.0F;
  public boolean mNeedBounds = true;
  private float mRotationCenterX = NaN.0F;
  private float mRotationCenterY = NaN.0F;
  private float mScaleX = 1.0F;
  private float mScaleY = 1.0F;
  private float mShiftX = 0.0F;
  private float mShiftY = 0.0F;
  public View[] mViews = null;
  
  public Layer(Context paramContext)
  {
    super(paramContext);
  }
  
  public Layer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public Layer(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private void reCacheViews()
  {
    if (mContainer == null) {
      return;
    }
    int i = mCount;
    if (i == 0) {
      return;
    }
    View[] arrayOfView = mViews;
    if ((arrayOfView == null) || (arrayOfView.length != i)) {
      mViews = new View[i];
    }
    for (i = 0; i < mCount; i++)
    {
      int j = mIds[i];
      mViews[i] = mContainer.getViewById(j);
    }
  }
  
  private void transform()
  {
    if (mContainer == null) {
      return;
    }
    if (mViews == null) {
      reCacheViews();
    }
    calcCenters();
    double d;
    if (Float.isNaN(mGroupRotateAngle)) {
      d = 0.0D;
    } else {
      d = Math.toRadians(mGroupRotateAngle);
    }
    float f1 = (float)Math.sin(d);
    float f2 = (float)Math.cos(d);
    float f3 = mScaleX;
    float f4 = mScaleY;
    float f5 = -f4;
    for (int i = 0; i < mCount; i++)
    {
      View localView = mViews[i];
      int j = localView.getLeft();
      j = (localView.getRight() + j) / 2;
      int k = localView.getTop();
      k = (localView.getBottom() + k) / 2;
      float f6 = j - mComputedCenterX;
      float f7 = k - mComputedCenterY;
      float f8 = mShiftX;
      float f9 = mShiftY;
      localView.setTranslationX(f5 * f1 * f7 + f3 * f2 * f6 - f6 + f8);
      localView.setTranslationY(f4 * f2 * f7 + f6 * (f3 * f1) - f7 + f9);
      localView.setScaleY(mScaleY);
      localView.setScaleX(mScaleX);
      if (!Float.isNaN(mGroupRotateAngle)) {
        localView.setRotation(mGroupRotateAngle);
      }
    }
  }
  
  public void applyLayoutFeaturesInConstraintSet(ConstraintLayout paramConstraintLayout)
  {
    applyLayoutFeatures(paramConstraintLayout);
  }
  
  public void calcCenters()
  {
    if (mContainer == null) {
      return;
    }
    if ((!mNeedBounds) && (!Float.isNaN(mComputedCenterX)) && (!Float.isNaN(mComputedCenterY))) {
      return;
    }
    if ((!Float.isNaN(mRotationCenterX)) && (!Float.isNaN(mRotationCenterY)))
    {
      mComputedCenterY = mRotationCenterY;
      mComputedCenterX = mRotationCenterX;
    }
    else
    {
      View[] arrayOfView = getViews(mContainer);
      int i = 0;
      int j = arrayOfView[0].getLeft();
      int k = arrayOfView[0].getTop();
      int m = arrayOfView[0].getRight();
      int n = arrayOfView[0].getBottom();
      while (i < mCount)
      {
        View localView = arrayOfView[i];
        j = Math.min(j, localView.getLeft());
        k = Math.min(k, localView.getTop());
        m = Math.max(m, localView.getRight());
        n = Math.max(n, localView.getBottom());
        i++;
      }
      mComputedMaxX = m;
      mComputedMaxY = n;
      mComputedMinX = j;
      mComputedMinY = k;
      if (Float.isNaN(mRotationCenterX)) {
        mComputedCenterX = ((j + m) / 2);
      } else {
        mComputedCenterX = mRotationCenterX;
      }
      if (Float.isNaN(mRotationCenterY)) {
        mComputedCenterY = ((k + n) / 2);
      } else {
        mComputedCenterY = mRotationCenterY;
      }
    }
  }
  
  public void init(AttributeSet paramAttributeSet)
  {
    super.init(paramAttributeSet);
    int i = 0;
    mUseViewMeasure = false;
    if (paramAttributeSet != null)
    {
      paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.ConstraintLayout_Layout);
      int j = paramAttributeSet.getIndexCount();
      while (i < j)
      {
        int k = paramAttributeSet.getIndex(i);
        if (k == R.styleable.ConstraintLayout_Layout_android_visibility) {
          mApplyVisibilityOnAttach = true;
        } else if (k == R.styleable.ConstraintLayout_Layout_android_elevation) {
          mApplyElevationOnAttach = true;
        }
        i++;
      }
      paramAttributeSet.recycle();
    }
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    mContainer = ((ConstraintLayout)getParent());
    if ((mApplyVisibilityOnAttach) || (mApplyElevationOnAttach))
    {
      int i = getVisibility();
      float f = getElevation();
      for (int j = 0; j < mCount; j++)
      {
        int k = mIds[j];
        View localView = mContainer.getViewById(k);
        if (localView != null)
        {
          if (mApplyVisibilityOnAttach) {
            localView.setVisibility(i);
          }
          if ((mApplyElevationOnAttach) && (f > 0.0F)) {
            localView.setTranslationZ(localView.getTranslationZ() + f);
          }
        }
      }
    }
  }
  
  public void setElevation(float paramFloat)
  {
    super.setElevation(paramFloat);
    applyLayoutFeatures();
  }
  
  public void setPivotX(float paramFloat)
  {
    mRotationCenterX = paramFloat;
    transform();
  }
  
  public void setPivotY(float paramFloat)
  {
    mRotationCenterY = paramFloat;
    transform();
  }
  
  public void setRotation(float paramFloat)
  {
    mGroupRotateAngle = paramFloat;
    transform();
  }
  
  public void setScaleX(float paramFloat)
  {
    mScaleX = paramFloat;
    transform();
  }
  
  public void setScaleY(float paramFloat)
  {
    mScaleY = paramFloat;
    transform();
  }
  
  public void setTranslationX(float paramFloat)
  {
    mShiftX = paramFloat;
    transform();
  }
  
  public void setTranslationY(float paramFloat)
  {
    mShiftY = paramFloat;
    transform();
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    applyLayoutFeatures();
  }
  
  public void updatePostLayout(ConstraintLayout paramConstraintLayout)
  {
    reCacheViews();
    mComputedCenterX = NaN.0F;
    mComputedCenterY = NaN.0F;
    paramConstraintLayout = ((ConstraintLayout.LayoutParams)getLayoutParams()).getConstraintWidget();
    paramConstraintLayout.setWidth(0);
    paramConstraintLayout.setHeight(0);
    calcCenters();
    int i = (int)mComputedMinX;
    int j = getPaddingLeft();
    int k = (int)mComputedMinY;
    int m = getPaddingTop();
    int n = (int)mComputedMaxX;
    int i1 = getPaddingRight();
    int i2 = (int)mComputedMaxY;
    layout(i - j, k - m, i1 + n, getPaddingBottom() + i2);
    transform();
  }
  
  public void updatePreDraw(ConstraintLayout paramConstraintLayout)
  {
    mContainer = paramConstraintLayout;
    float f = getRotation();
    if (f == 0.0F)
    {
      if (!Float.isNaN(mGroupRotateAngle)) {
        mGroupRotateAngle = f;
      }
    }
    else {
      mGroupRotateAngle = f;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.helper.widget.Layer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */