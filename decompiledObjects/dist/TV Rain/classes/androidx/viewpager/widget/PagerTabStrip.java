package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

public class PagerTabStrip
  extends PagerTitleStrip
{
  private static final int FULL_UNDERLINE_HEIGHT = 1;
  private static final int INDICATOR_HEIGHT = 3;
  private static final int MIN_PADDING_BOTTOM = 6;
  private static final int MIN_STRIP_HEIGHT = 32;
  private static final int MIN_TEXT_SPACING = 64;
  private static final int TAB_PADDING = 16;
  private static final int TAB_SPACING = 32;
  private static final String TAG = "PagerTabStrip";
  private boolean mDrawFullUnderline;
  private boolean mDrawFullUnderlineSet;
  private int mFullUnderlineHeight;
  private boolean mIgnoreTap;
  private int mIndicatorColor;
  private int mIndicatorHeight;
  private float mInitialMotionX;
  private float mInitialMotionY;
  private int mMinPaddingBottom;
  private int mMinStripHeight;
  private int mMinTextSpacing;
  private int mTabAlpha;
  private int mTabPadding;
  private final Paint mTabPaint;
  private final Rect mTempRect;
  private int mTouchSlop;
  
  public PagerTabStrip(@NonNull Context paramContext)
  {
    this(paramContext, null);
  }
  
  public PagerTabStrip(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = new Paint();
    mTabPaint = paramAttributeSet;
    mTempRect = new Rect();
    mTabAlpha = 255;
    mDrawFullUnderline = false;
    mDrawFullUnderlineSet = false;
    int i = mTextColor;
    mIndicatorColor = i;
    paramAttributeSet.setColor(i);
    float f = getResourcesgetDisplayMetricsdensity;
    mIndicatorHeight = ((int)(3.0F * f + 0.5F));
    mMinPaddingBottom = ((int)(6.0F * f + 0.5F));
    mMinTextSpacing = ((int)(64.0F * f));
    mTabPadding = ((int)(16.0F * f + 0.5F));
    mFullUnderlineHeight = ((int)(1.0F * f + 0.5F));
    mMinStripHeight = ((int)(f * 32.0F + 0.5F));
    mTouchSlop = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
    setTextSpacing(getTextSpacing());
    setWillNotDraw(false);
    mPrevText.setFocusable(true);
    mPrevText.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        paramAnonymousView = mPager;
        paramAnonymousView.setCurrentItem(paramAnonymousView.getCurrentItem() - 1);
      }
    });
    mNextText.setFocusable(true);
    mNextText.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        paramAnonymousView = mPager;
        paramAnonymousView.setCurrentItem(paramAnonymousView.getCurrentItem() + 1);
      }
    });
    if (getBackground() == null) {
      mDrawFullUnderline = true;
    }
  }
  
  public boolean getDrawFullUnderline()
  {
    return mDrawFullUnderline;
  }
  
  public int getMinHeight()
  {
    return Math.max(super.getMinHeight(), mMinStripHeight);
  }
  
  @ColorInt
  public int getTabIndicatorColor()
  {
    return mIndicatorColor;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = getHeight();
    int j = mCurrText.getLeft();
    int k = mTabPadding;
    int m = mCurrText.getRight();
    int n = mTabPadding;
    int i1 = mIndicatorHeight;
    mTabPaint.setColor(mTabAlpha << 24 | mIndicatorColor & 0xFFFFFF);
    float f1 = j - k;
    float f2 = i - i1;
    float f3 = m + n;
    float f4 = i;
    paramCanvas.drawRect(f1, f2, f3, f4, mTabPaint);
    if (mDrawFullUnderline)
    {
      mTabPaint.setColor(0xFF000000 | mIndicatorColor & 0xFFFFFF);
      paramCanvas.drawRect(getPaddingLeft(), i - mFullUnderlineHeight, getWidth() - getPaddingRight(), f4, mTabPaint);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    if ((i != 0) && (mIgnoreTap)) {
      return false;
    }
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    if (i != 0)
    {
      if (i != 1)
      {
        if ((i == 2) && ((Math.abs(f1 - mInitialMotionX) > mTouchSlop) || (Math.abs(f2 - mInitialMotionY) > mTouchSlop))) {
          mIgnoreTap = true;
        }
      }
      else if (f1 < mCurrText.getLeft() - mTabPadding)
      {
        paramMotionEvent = mPager;
        paramMotionEvent.setCurrentItem(paramMotionEvent.getCurrentItem() - 1);
      }
      else if (f1 > mCurrText.getRight() + mTabPadding)
      {
        paramMotionEvent = mPager;
        paramMotionEvent.setCurrentItem(paramMotionEvent.getCurrentItem() + 1);
      }
    }
    else
    {
      mInitialMotionX = f1;
      mInitialMotionY = f2;
      mIgnoreTap = false;
    }
    return true;
  }
  
  public void setBackgroundColor(@ColorInt int paramInt)
  {
    super.setBackgroundColor(paramInt);
    if (!mDrawFullUnderlineSet)
    {
      boolean bool;
      if ((paramInt & 0xFF000000) == 0) {
        bool = true;
      } else {
        bool = false;
      }
      mDrawFullUnderline = bool;
    }
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    if (!mDrawFullUnderlineSet)
    {
      boolean bool;
      if (paramDrawable == null) {
        bool = true;
      } else {
        bool = false;
      }
      mDrawFullUnderline = bool;
    }
  }
  
  public void setBackgroundResource(@DrawableRes int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (!mDrawFullUnderlineSet)
    {
      boolean bool;
      if (paramInt == 0) {
        bool = true;
      } else {
        bool = false;
      }
      mDrawFullUnderline = bool;
    }
  }
  
  public void setDrawFullUnderline(boolean paramBoolean)
  {
    mDrawFullUnderline = paramBoolean;
    mDrawFullUnderlineSet = true;
    invalidate();
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = mMinPaddingBottom;
    int j = paramInt4;
    if (paramInt4 < i) {
      j = i;
    }
    super.setPadding(paramInt1, paramInt2, paramInt3, j);
  }
  
  public void setTabIndicatorColor(@ColorInt int paramInt)
  {
    mIndicatorColor = paramInt;
    mTabPaint.setColor(paramInt);
    invalidate();
  }
  
  public void setTabIndicatorColorResource(@ColorRes int paramInt)
  {
    setTabIndicatorColor(ContextCompat.getColor(getContext(), paramInt));
  }
  
  public void setTextSpacing(int paramInt)
  {
    int i = mMinTextSpacing;
    int j = paramInt;
    if (paramInt < i) {
      j = i;
    }
    super.setTextSpacing(j);
  }
  
  public void updateTextPositions(int paramInt, float paramFloat, boolean paramBoolean)
  {
    Rect localRect = mTempRect;
    int i = getHeight();
    int j = mCurrText.getLeft();
    int k = mTabPadding;
    int m = mCurrText.getRight();
    int n = mTabPadding;
    int i1 = i - mIndicatorHeight;
    localRect.set(j - k, i1, m + n, i);
    super.updateTextPositions(paramInt, paramFloat, paramBoolean);
    mTabAlpha = ((int)(Math.abs(paramFloat - 0.5F) * 2.0F * 255.0F));
    localRect.union(mCurrText.getLeft() - mTabPadding, i1, mCurrText.getRight() + mTabPadding, i);
    invalidate(localRect);
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager.widget.PagerTabStrip
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */