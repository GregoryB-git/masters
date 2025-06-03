package androidx.swiperefreshlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.Shape;
import android.view.View;

class CircleImageView$OvalShadow
  extends OvalShape
{
  private RadialGradient mRadialGradient;
  private Paint mShadowPaint = new Paint();
  
  public CircleImageView$OvalShadow(CircleImageView paramCircleImageView, int paramInt)
  {
    mShadowRadius = paramInt;
    updateRadialGradient((int)rect().width());
  }
  
  private void updateRadialGradient(int paramInt)
  {
    float f1 = paramInt / 2;
    float f2 = this$0.mShadowRadius;
    Object localObject = Shader.TileMode.CLAMP;
    localObject = new RadialGradient(f1, f1, f2, new int[] { 1023410176, 0 }, null, (Shader.TileMode)localObject);
    mRadialGradient = ((RadialGradient)localObject);
    mShadowPaint.setShader((Shader)localObject);
  }
  
  public void draw(Canvas paramCanvas, Paint paramPaint)
  {
    int i = this$0.getWidth();
    int j = this$0.getHeight();
    i /= 2;
    float f1 = i;
    float f2 = j / 2;
    paramCanvas.drawCircle(f1, f2, f1, mShadowPaint);
    paramCanvas.drawCircle(f1, f2, i - this$0.mShadowRadius, paramPaint);
  }
  
  public void onResize(float paramFloat1, float paramFloat2)
  {
    super.onResize(paramFloat1, paramFloat2);
    updateRadialGradient((int)paramFloat1);
  }
}

/* Location:
 * Qualified Name:     androidx.swiperefreshlayout.widget.CircleImageView.OvalShadow
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */