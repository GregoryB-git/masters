package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.R.styleable;

public class MotionButton
  extends AppCompatButton
{
  private Path mPath;
  public RectF mRect;
  private float mRound = NaN.0F;
  private float mRoundPercent = 0.0F;
  public ViewOutlineProvider mViewOutlineProvider;
  
  public MotionButton(Context paramContext)
  {
    super(paramContext);
    init(paramContext, null);
  }
  
  public MotionButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext, paramAttributeSet);
  }
  
  public MotionButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext, paramAttributeSet);
  }
  
  private void init(Context paramContext, AttributeSet paramAttributeSet)
  {
    int i = 0;
    setPadding(0, 0, 0, 0);
    if (paramAttributeSet != null)
    {
      paramContext = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.ImageFilterView);
      int j = paramContext.getIndexCount();
      while (i < j)
      {
        int k = paramContext.getIndex(i);
        if (k == R.styleable.ImageFilterView_round) {
          setRound(paramContext.getDimension(k, 0.0F));
        } else if (k == R.styleable.ImageFilterView_roundPercent) {
          setRoundPercent(paramContext.getFloat(k, 0.0F));
        }
        i++;
      }
      paramContext.recycle();
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
  }
  
  public float getRound()
  {
    return mRound;
  }
  
  public float getRoundPercent()
  {
    return mRoundPercent;
  }
  
  @RequiresApi(21)
  public void setRound(float paramFloat)
  {
    if (Float.isNaN(paramFloat))
    {
      mRound = paramFloat;
      paramFloat = mRoundPercent;
      mRoundPercent = -1.0F;
      setRoundPercent(paramFloat);
      return;
    }
    int i;
    if (mRound != paramFloat) {
      i = 1;
    } else {
      i = 0;
    }
    mRound = paramFloat;
    if (paramFloat != 0.0F)
    {
      if (mPath == null) {
        mPath = new Path();
      }
      if (mRect == null) {
        mRect = new RectF();
      }
      if (mViewOutlineProvider == null)
      {
        localObject = new ViewOutlineProvider()
        {
          public void getOutline(View paramAnonymousView, Outline paramAnonymousOutline)
          {
            paramAnonymousOutline.setRoundRect(0, 0, getWidth(), getHeight(), MotionButton.access$100(MotionButton.this));
          }
        };
        mViewOutlineProvider = ((ViewOutlineProvider)localObject);
        setOutlineProvider((ViewOutlineProvider)localObject);
      }
      setClipToOutline(true);
      int j = getWidth();
      int k = getHeight();
      mRect.set(0.0F, 0.0F, j, k);
      mPath.reset();
      Object localObject = mPath;
      RectF localRectF = mRect;
      paramFloat = mRound;
      ((Path)localObject).addRoundRect(localRectF, paramFloat, paramFloat, Path.Direction.CW);
    }
    else
    {
      setClipToOutline(false);
    }
    if (i != 0) {
      invalidateOutline();
    }
  }
  
  @RequiresApi(21)
  public void setRoundPercent(float paramFloat)
  {
    int i;
    if (mRoundPercent != paramFloat) {
      i = 1;
    } else {
      i = 0;
    }
    mRoundPercent = paramFloat;
    if (paramFloat != 0.0F)
    {
      if (mPath == null) {
        mPath = new Path();
      }
      if (mRect == null) {
        mRect = new RectF();
      }
      if (mViewOutlineProvider == null)
      {
        ViewOutlineProvider local1 = new ViewOutlineProvider()
        {
          public void getOutline(View paramAnonymousView, Outline paramAnonymousOutline)
          {
            int i = getWidth();
            int j = getHeight();
            float f = Math.min(i, j);
            paramAnonymousOutline.setRoundRect(0, 0, i, j, MotionButton.access$000(MotionButton.this) * f / 2.0F);
          }
        };
        mViewOutlineProvider = local1;
        setOutlineProvider(local1);
      }
      setClipToOutline(true);
      int j = getWidth();
      int k = getHeight();
      paramFloat = Math.min(j, k) * mRoundPercent / 2.0F;
      mRect.set(0.0F, 0.0F, j, k);
      mPath.reset();
      mPath.addRoundRect(mRect, paramFloat, paramFloat, Path.Direction.CW);
    }
    else
    {
      setClipToOutline(false);
    }
    if (i != 0) {
      invalidateOutline();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.utils.widget.MotionButton
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */