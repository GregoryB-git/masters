package androidx.cardview.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

class CardView$1
  implements CardViewDelegate
{
  private Drawable mCardBackground;
  
  public CardView$1(CardView paramCardView) {}
  
  public Drawable getCardBackground()
  {
    return mCardBackground;
  }
  
  public View getCardView()
  {
    return this$0;
  }
  
  public boolean getPreventCornerOverlap()
  {
    return this$0.getPreventCornerOverlap();
  }
  
  public boolean getUseCompatPadding()
  {
    return this$0.getUseCompatPadding();
  }
  
  public void setCardBackground(Drawable paramDrawable)
  {
    mCardBackground = paramDrawable;
    this$0.setBackgroundDrawable(paramDrawable);
  }
  
  public void setMinWidthHeightInternal(int paramInt1, int paramInt2)
  {
    CardView localCardView = this$0;
    if (paramInt1 > mUserSetMinWidth) {
      CardView.access$101(localCardView, paramInt1);
    }
    localCardView = this$0;
    if (paramInt2 > mUserSetMinHeight) {
      CardView.access$201(localCardView, paramInt2);
    }
  }
  
  public void setShadowPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this$0.mShadowBounds.set(paramInt1, paramInt2, paramInt3, paramInt4);
    CardView localCardView = this$0;
    Rect localRect = mContentPadding;
    CardView.access$001(localCardView, paramInt1 + left, paramInt2 + top, paramInt3 + right, paramInt4 + bottom);
  }
}

/* Location:
 * Qualified Name:     androidx.cardview.widget.CardView.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */