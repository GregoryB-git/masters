package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;

abstract class KeyPositionBase
  extends Key
{
  public static final float SELECTION_SLOPE = 20.0F;
  public int mCurveFit = Key.UNSET;
  
  public abstract void calcPosition(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4);
  
  public void getAttributeNames(HashSet<String> paramHashSet) {}
  
  public abstract float getPositionX();
  
  public abstract float getPositionY();
  
  public abstract boolean intersects(int paramInt1, int paramInt2, RectF paramRectF1, RectF paramRectF2, float paramFloat1, float paramFloat2);
  
  public abstract void positionAttributes(View paramView, RectF paramRectF1, RectF paramRectF2, float paramFloat1, float paramFloat2, String[] paramArrayOfString, float[] paramArrayOfFloat);
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.KeyPositionBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */