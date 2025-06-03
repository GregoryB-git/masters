package J;

import android.os.BaseBundle;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a
  extends ClickableSpan
{
  public final int a;
  public final u b;
  public final int c;
  
  public a(int paramInt1, u paramu, int paramInt2)
  {
    a = paramInt1;
    b = paramu;
    c = paramInt2;
  }
  
  public void onClick(View paramView)
  {
    paramView = new Bundle();
    paramView.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", a);
    b.F(c, paramView);
  }
}

/* Location:
 * Qualified Name:     J.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */