package com.github.vipulasri.timelineview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public class TimelineView
  extends View
{
  private Rect mBounds;
  private Context mContext;
  private Drawable mEndLine;
  private int mLineOrientation;
  private int mLinePadding;
  private int mLineSize;
  private Drawable mMarker;
  private boolean mMarkerInCenter;
  private int mMarkerSize;
  private Drawable mStartLine;
  
  public TimelineView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    mContext = paramContext;
    init(paramAttributeSet);
  }
  
  public static int getTimeLineViewType(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 1) {
      return 3;
    }
    if (paramInt1 == 0) {
      return 1;
    }
    if (paramInt1 == paramInt2 - 1) {
      return 2;
    }
    return 0;
  }
  
  private void init(AttributeSet paramAttributeSet)
  {
    paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.timeline_style);
    mMarker = paramAttributeSet.getDrawable(R.styleable.timeline_style_marker);
    int i = R.styleable.timeline_style_line;
    mStartLine = paramAttributeSet.getDrawable(i);
    mEndLine = paramAttributeSet.getDrawable(i);
    mMarkerSize = paramAttributeSet.getDimensionPixelSize(R.styleable.timeline_style_markerSize, Utils.dpToPx(20.0F, mContext));
    mLineSize = paramAttributeSet.getDimensionPixelSize(R.styleable.timeline_style_lineSize, Utils.dpToPx(2.0F, mContext));
    mLineOrientation = paramAttributeSet.getInt(R.styleable.timeline_style_lineOrientation, 1);
    mLinePadding = paramAttributeSet.getDimensionPixelSize(R.styleable.timeline_style_linePadding, 0);
    mMarkerInCenter = paramAttributeSet.getBoolean(R.styleable.timeline_style_markerInCenter, true);
    paramAttributeSet.recycle();
    if (mMarker == null) {
      mMarker = mContext.getResources().getDrawable(R.drawable.marker);
    }
    if ((mStartLine == null) && (mEndLine == null))
    {
      mStartLine = new ColorDrawable(mContext.getResources().getColor(17170432));
      mEndLine = new ColorDrawable(mContext.getResources().getColor(17170432));
    }
  }
  
  private void initDrawable()
  {
    int i = getPaddingLeft();
    int j = getPaddingRight();
    int k = getPaddingTop();
    int m = getPaddingBottom();
    int n = getWidth();
    int i1 = getHeight();
    m = Math.min(mMarkerSize, Math.min(n - i - j, i1 - k - m));
    Drawable localDrawable;
    if (mMarkerInCenter)
    {
      localDrawable = mMarker;
      if (localDrawable != null)
      {
        i = n / 2;
        j = m / 2;
        m = i1 / 2;
        localDrawable.setBounds(i - j, m - j, i + j, m + j);
        mBounds = mMarker.getBounds();
      }
    }
    else
    {
      localDrawable = mMarker;
      if (localDrawable != null)
      {
        localDrawable.setBounds(i, k, i + m, m + k);
        mBounds = mMarker.getBounds();
      }
    }
    m = mBounds.centerX();
    i = mLineSize;
    m -= (i >> 1);
    if (mLineOrientation == 0)
    {
      localDrawable = mStartLine;
      Rect localRect;
      if (localDrawable != null)
      {
        i1 = mBounds.height() / 2;
        localRect = mBounds;
        localDrawable.setBounds(0, i1 + k, left - mLinePadding, localRect.height() / 2 + k + mLineSize);
      }
      localDrawable = mEndLine;
      if (localDrawable != null)
      {
        localRect = mBounds;
        localDrawable.setBounds(right + mLinePadding, localRect.height() / 2 + k, n, mBounds.height() / 2 + k + mLineSize);
      }
    }
    else
    {
      localDrawable = mStartLine;
      if (localDrawable != null) {
        localDrawable.setBounds(m, 0, i + m, mBounds.top - mLinePadding);
      }
      localDrawable = mEndLine;
      if (localDrawable != null) {
        localDrawable.setBounds(m, mBounds.bottom + mLinePadding, mLineSize + m, i1);
      }
    }
  }
  
  private void setEndLine(Drawable paramDrawable)
  {
    mEndLine = paramDrawable;
    initDrawable();
  }
  
  private void setStartLine(Drawable paramDrawable)
  {
    mStartLine = paramDrawable;
    initDrawable();
  }
  
  public void initLine(int paramInt)
  {
    if (paramInt == 1)
    {
      setStartLine(null);
    }
    else if (paramInt == 2)
    {
      setEndLine(null);
    }
    else if (paramInt == 3)
    {
      setStartLine(null);
      setEndLine(null);
    }
    initDrawable();
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    Drawable localDrawable = mMarker;
    if (localDrawable != null) {
      localDrawable.draw(paramCanvas);
    }
    localDrawable = mStartLine;
    if (localDrawable != null) {
      localDrawable.draw(paramCanvas);
    }
    localDrawable = mEndLine;
    if (localDrawable != null) {
      localDrawable.draw(paramCanvas);
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i = mMarkerSize;
    int j = getPaddingLeft();
    int k = getPaddingRight();
    int m = mMarkerSize;
    int n = getPaddingTop();
    int i1 = getPaddingBottom();
    setMeasuredDimension(View.resolveSizeAndState(k + (j + i), paramInt1, 0), View.resolveSizeAndState(i1 + (n + m), paramInt2, 0));
    initDrawable();
  }
  
  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    initDrawable();
  }
  
  public void setEndLine(int paramInt1, int paramInt2)
  {
    mEndLine = new ColorDrawable(paramInt1);
    initLine(paramInt2);
  }
  
  public void setLinePadding(int paramInt)
  {
    mLinePadding = paramInt;
    initDrawable();
  }
  
  public void setLineSize(int paramInt)
  {
    mLineSize = paramInt;
    initDrawable();
  }
  
  public void setMarker(Drawable paramDrawable)
  {
    mMarker = paramDrawable;
    initDrawable();
  }
  
  public void setMarker(Drawable paramDrawable, int paramInt)
  {
    mMarker = paramDrawable;
    paramDrawable.setColorFilter(paramInt, PorterDuff.Mode.SRC_ATOP);
    initDrawable();
  }
  
  public void setMarkerColor(int paramInt)
  {
    mMarker.setColorFilter(paramInt, PorterDuff.Mode.SRC_ATOP);
    initDrawable();
  }
  
  public void setMarkerSize(int paramInt)
  {
    mMarkerSize = paramInt;
    initDrawable();
  }
  
  public void setStartLine(int paramInt1, int paramInt2)
  {
    mStartLine = new ColorDrawable(paramInt1);
    initLine(paramInt2);
  }
}

/* Location:
 * Qualified Name:     com.github.vipulasri.timelineview.TimelineView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */