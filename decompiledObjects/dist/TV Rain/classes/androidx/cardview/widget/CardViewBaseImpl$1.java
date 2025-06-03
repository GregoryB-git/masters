package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

class CardViewBaseImpl$1
  implements RoundRectDrawableWithShadow.RoundRectHelper
{
  public CardViewBaseImpl$1(CardViewBaseImpl paramCardViewBaseImpl) {}
  
  public void drawRoundRect(Canvas paramCanvas, RectF paramRectF, float paramFloat, Paint paramPaint)
  {
    float f1 = 2.0F * paramFloat;
    float f2 = paramRectF.width() - f1 - 1.0F;
    float f3 = paramRectF.height();
    if (paramFloat >= 1.0F)
    {
      float f4 = paramFloat + 0.5F;
      RectF localRectF = this$0.mCornerRect;
      float f5 = -f4;
      localRectF.set(f5, f5, f4, f4);
      int i = paramCanvas.save();
      paramCanvas.translate(left + f4, top + f4);
      paramCanvas.drawArc(this$0.mCornerRect, 180.0F, 90.0F, true, paramPaint);
      paramCanvas.translate(f2, 0.0F);
      paramCanvas.rotate(90.0F);
      paramCanvas.drawArc(this$0.mCornerRect, 180.0F, 90.0F, true, paramPaint);
      paramCanvas.translate(f3 - f1 - 1.0F, 0.0F);
      paramCanvas.rotate(90.0F);
      paramCanvas.drawArc(this$0.mCornerRect, 180.0F, 90.0F, true, paramPaint);
      paramCanvas.translate(f2, 0.0F);
      paramCanvas.rotate(90.0F);
      paramCanvas.drawArc(this$0.mCornerRect, 180.0F, 90.0F, true, paramPaint);
      paramCanvas.restoreToCount(i);
      f2 = left;
      f1 = top;
      paramCanvas.drawRect(f2 + f4 - 1.0F, f1, right - f4 + 1.0F, f1 + f4, paramPaint);
      f1 = left;
      f2 = bottom;
      paramCanvas.drawRect(f1 + f4 - 1.0F, f2 - f4, right - f4 + 1.0F, f2, paramPaint);
    }
    paramCanvas.drawRect(left, top + paramFloat, right, bottom - paramFloat, paramPaint);
  }
}

/* Location:
 * Qualified Name:     androidx.cardview.widget.CardViewBaseImpl.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */