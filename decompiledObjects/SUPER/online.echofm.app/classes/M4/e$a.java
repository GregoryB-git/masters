package M4;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;

public class e$a
  implements View.OnAttachStateChangeListener
{
  public e$a(e parame) {}
  
  public void onViewAttachedToWindow(View paramView)
  {
    paramView.getViewTreeObserver().addOnDrawListener(o);
    paramView.removeOnAttachStateChangeListener(this);
  }
  
  public void onViewDetachedFromWindow(View paramView)
  {
    paramView.removeOnAttachStateChangeListener(this);
  }
}

/* Location:
 * Qualified Name:     M4.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */