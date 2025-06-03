package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.constraintlayout.widget.R.styleable;

public class MockView
  extends View
{
  private int mDiagonalsColor = Color.argb(255, 0, 0, 0);
  private boolean mDrawDiagonals = true;
  private boolean mDrawLabel = true;
  private int mMargin = 4;
  private Paint mPaintDiagonals = new Paint();
  private Paint mPaintText = new Paint();
  private Paint mPaintTextBackground = new Paint();
  public String mText = null;
  private int mTextBackgroundColor = Color.argb(255, 50, 50, 50);
  private Rect mTextBounds = new Rect();
  private int mTextColor = Color.argb(255, 200, 200, 200);
  
  public MockView(Context paramContext)
  {
    super(paramContext);
    init(paramContext, null);
  }
  
  public MockView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext, paramAttributeSet);
  }
  
  public MockView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext, paramAttributeSet);
  }
  
  private void init(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet != null)
    {
      paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.MockView);
      int i = paramAttributeSet.getIndexCount();
      for (int j = 0; j < i; j++)
      {
        int k = paramAttributeSet.getIndex(j);
        if (k == R.styleable.MockView_mock_label) {
          mText = paramAttributeSet.getString(k);
        } else if (k == R.styleable.MockView_mock_showDiagonals) {
          mDrawDiagonals = paramAttributeSet.getBoolean(k, mDrawDiagonals);
        } else if (k == R.styleable.MockView_mock_diagonalsColor) {
          mDiagonalsColor = paramAttributeSet.getColor(k, mDiagonalsColor);
        } else if (k == R.styleable.MockView_mock_labelBackgroundColor) {
          mTextBackgroundColor = paramAttributeSet.getColor(k, mTextBackgroundColor);
        } else if (k == R.styleable.MockView_mock_labelColor) {
          mTextColor = paramAttributeSet.getColor(k, mTextColor);
        } else if (k == R.styleable.MockView_mock_showLabel) {
          mDrawLabel = paramAttributeSet.getBoolean(k, mDrawLabel);
        }
      }
      paramAttributeSet.recycle();
    }
    if (mText == null) {}
    try
    {
      mText = paramContext.getResources().getResourceEntryName(getId());
      mPaintDiagonals.setColor(mDiagonalsColor);
      mPaintDiagonals.setAntiAlias(true);
      mPaintText.setColor(mTextColor);
      mPaintText.setAntiAlias(true);
      mPaintTextBackground.setColor(mTextBackgroundColor);
      float f = mMargin;
      mMargin = Math.round(getResourcesgetDisplayMetricsxdpi / 160.0F * f);
      return;
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = getWidth();
    int j = getHeight();
    int k = i;
    int m = j;
    float f1;
    float f2;
    if (mDrawDiagonals)
    {
      k = i - 1;
      m = j - 1;
      f1 = k;
      f2 = m;
      paramCanvas.drawLine(0.0F, 0.0F, f1, f2, mPaintDiagonals);
      paramCanvas.drawLine(0.0F, f2, f1, 0.0F, mPaintDiagonals);
      paramCanvas.drawLine(0.0F, 0.0F, f1, 0.0F, mPaintDiagonals);
      paramCanvas.drawLine(f1, 0.0F, f1, f2, mPaintDiagonals);
      paramCanvas.drawLine(f1, f2, 0.0F, f2, mPaintDiagonals);
      paramCanvas.drawLine(0.0F, f2, 0.0F, 0.0F, mPaintDiagonals);
    }
    Object localObject = mText;
    if ((localObject != null) && (mDrawLabel))
    {
      mPaintText.getTextBounds((String)localObject, 0, ((String)localObject).length(), mTextBounds);
      f1 = (k - mTextBounds.width()) / 2.0F;
      f2 = (m - mTextBounds.height()) / 2.0F + mTextBounds.height();
      mTextBounds.offset((int)f1, (int)f2);
      localObject = mTextBounds;
      k = left;
      m = mMargin;
      ((Rect)localObject).set(k - m, top - m, right + m, bottom + m);
      paramCanvas.drawRect(mTextBounds, mPaintTextBackground);
      paramCanvas.drawText(mText, f1, f2, mPaintText);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.utils.widget.MockView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */