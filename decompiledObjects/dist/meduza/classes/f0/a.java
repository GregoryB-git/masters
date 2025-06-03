package f0;

import android.os.BaseBundle;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

public final class a
  extends ClickableSpan
{
  public final int a;
  public final b b;
  public final int c;
  
  public a(int paramInt1, b paramb, int paramInt2)
  {
    a = paramInt1;
    b = paramb;
    c = paramInt2;
  }
  
  public final void onClick(View paramView)
  {
    paramView = new Bundle();
    paramView.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", a);
    b localb = b;
    int i = c;
    a.performAction(i, paramView);
  }
}

/* Location:
 * Qualified Name:     f0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */