package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R.styleable;

public class MotionTelltales
  extends MockView
{
  private static final String TAG = "MotionTelltales";
  public Matrix mInvertMatrix = new Matrix();
  public MotionLayout mMotionLayout;
  private Paint mPaintTelltales = new Paint();
  public int mTailColor = -65281;
  public float mTailScale = 0.25F;
  public int mVelocityMode = 0;
  public float[] velocity = new float[2];
  
  public MotionTelltales(Context paramContext)
  {
    super(paramContext);
    init(paramContext, null);
  }
  
  public MotionTelltales(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext, paramAttributeSet);
  }
  
  public MotionTelltales(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext, paramAttributeSet);
  }
  
  private void init(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet != null)
    {
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.MotionTelltales);
      int i = paramContext.getIndexCount();
      for (int j = 0; j < i; j++)
      {
        int k = paramContext.getIndex(j);
        if (k == R.styleable.MotionTelltales_telltales_tailColor) {
          mTailColor = paramContext.getColor(k, mTailColor);
        } else if (k == R.styleable.MotionTelltales_telltales_velocityMode) {
          mVelocityMode = paramContext.getInt(k, mVelocityMode);
        } else if (k == R.styleable.MotionTelltales_telltales_tailScale) {
          mTailScale = paramContext.getFloat(k, mTailScale);
        }
      }
      paramContext.recycle();
    }
    mPaintTelltales.setColor(mTailColor);
    mPaintTelltales.setStrokeWidth(5.0F);
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    getMatrix().invert(mInvertMatrix);
    if (mMotionLayout == null)
    {
      paramCanvas = getParent();
      if ((paramCanvas instanceof MotionLayout)) {
        mMotionLayout = ((MotionLayout)paramCanvas);
      }
      return;
    }
    int i = getWidth();
    int j = getHeight();
    float[] arrayOfFloat1 = new float[5];
    float[] tmp62_60 = arrayOfFloat1;
    tmp62_60[0] = 0.1F;
    float[] tmp67_62 = tmp62_60;
    tmp67_62[1] = 0.25F;
    float[] tmp72_67 = tmp67_62;
    tmp72_67[2] = 0.5F;
    float[] tmp77_72 = tmp72_67;
    tmp77_72[3] = 0.75F;
    float[] tmp82_77 = tmp77_72;
    tmp82_77[4] = 0.9F;
    tmp82_77;
    for (int k = 0; k < 5; k++)
    {
      float f1 = arrayOfFloat1[k];
      for (int m = 0; m < 5; m++)
      {
        float f2 = arrayOfFloat1[m];
        mMotionLayout.getViewVelocity(this, f2, f1, velocity, mVelocityMode);
        mInvertMatrix.mapVectors(velocity);
        float f3 = i * f2;
        float f4 = j * f1;
        float[] arrayOfFloat2 = velocity;
        float f5 = arrayOfFloat2[0];
        f2 = mTailScale;
        float f6 = arrayOfFloat2[1];
        mInvertMatrix.mapVectors(arrayOfFloat2);
        paramCanvas.drawLine(f3, f4, f3 - f5 * f2, f4 - f6 * f2, mPaintTelltales);
      }
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    postInvalidate();
  }
  
  public void setText(CharSequence paramCharSequence)
  {
    mText = paramCharSequence.toString();
    requestLayout();
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.utils.widget.MotionTelltales
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */