package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;

public class Placeholder
  extends View
{
  private View mContent = null;
  private int mContentId = -1;
  private int mEmptyVisibility = 4;
  
  public Placeholder(Context paramContext)
  {
    super(paramContext);
    init(null);
  }
  
  public Placeholder(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramAttributeSet);
  }
  
  public Placeholder(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramAttributeSet);
  }
  
  public Placeholder(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1);
    init(paramAttributeSet);
  }
  
  private void init(AttributeSet paramAttributeSet)
  {
    super.setVisibility(mEmptyVisibility);
    mContentId = -1;
    if (paramAttributeSet != null)
    {
      paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.ConstraintLayout_placeholder);
      int i = paramAttributeSet.getIndexCount();
      for (int j = 0; j < i; j++)
      {
        int k = paramAttributeSet.getIndex(j);
        if (k == R.styleable.ConstraintLayout_placeholder_content) {
          mContentId = paramAttributeSet.getResourceId(k, mContentId);
        } else if (k == R.styleable.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
          mEmptyVisibility = paramAttributeSet.getInt(k, mEmptyVisibility);
        }
      }
      paramAttributeSet.recycle();
    }
  }
  
  public View getContent()
  {
    return mContent;
  }
  
  public int getEmptyVisibility()
  {
    return mEmptyVisibility;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    if (isInEditMode())
    {
      paramCanvas.drawRGB(223, 223, 223);
      Paint localPaint = new Paint();
      localPaint.setARGB(255, 210, 210, 210);
      localPaint.setTextAlign(Paint.Align.CENTER);
      localPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
      Rect localRect = new Rect();
      paramCanvas.getClipBounds(localRect);
      localPaint.setTextSize(localRect.height());
      int i = localRect.height();
      int j = localRect.width();
      localPaint.setTextAlign(Paint.Align.LEFT);
      localPaint.getTextBounds("?", 0, 1, localRect);
      float f1 = j / 2.0F;
      float f2 = localRect.width() / 2.0F;
      float f3 = left;
      float f4 = i / 2.0F;
      paramCanvas.drawText("?", f1 - f2 - f3, localRect.height() / 2.0F + f4 - bottom, localPaint);
    }
  }
  
  public void setContentId(int paramInt)
  {
    if (mContentId == paramInt) {
      return;
    }
    View localView = mContent;
    if (localView != null)
    {
      localView.setVisibility(0);
      mContent.getLayoutParams()).isInPlaceholder = false;
      mContent = null;
    }
    mContentId = paramInt;
    if (paramInt != -1)
    {
      localView = ((View)getParent()).findViewById(paramInt);
      if (localView != null) {
        localView.setVisibility(8);
      }
    }
  }
  
  public void setEmptyVisibility(int paramInt)
  {
    mEmptyVisibility = paramInt;
  }
  
  public void updatePostMeasure(ConstraintLayout paramConstraintLayout)
  {
    if (mContent == null) {
      return;
    }
    ConstraintLayout.LayoutParams localLayoutParams1 = (ConstraintLayout.LayoutParams)getLayoutParams();
    ConstraintLayout.LayoutParams localLayoutParams2 = (ConstraintLayout.LayoutParams)mContent.getLayoutParams();
    widget.setVisibility(0);
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour = widget.getHorizontalDimensionBehaviour();
    paramConstraintLayout = ConstraintWidget.DimensionBehaviour.FIXED;
    if (localDimensionBehaviour != paramConstraintLayout) {
      widget.setWidth(widget.getWidth());
    }
    if (widget.getVerticalDimensionBehaviour() != paramConstraintLayout) {
      widget.setHeight(widget.getHeight());
    }
    widget.setVisibility(8);
  }
  
  public void updatePreLayout(ConstraintLayout paramConstraintLayout)
  {
    if ((mContentId == -1) && (!isInEditMode())) {
      setVisibility(mEmptyVisibility);
    }
    paramConstraintLayout = paramConstraintLayout.findViewById(mContentId);
    mContent = paramConstraintLayout;
    if (paramConstraintLayout != null)
    {
      getLayoutParamsisInPlaceholder = true;
      mContent.setVisibility(0);
      setVisibility(0);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.widget.Placeholder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */