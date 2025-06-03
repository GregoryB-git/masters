package e0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public final class o0
{
  public final WeakReference<View> a;
  
  public o0(View paramView)
  {
    a = new WeakReference(paramView);
  }
  
  public final void a(float paramFloat)
  {
    View localView = (View)a.get();
    if (localView != null) {
      localView.animate().alpha(paramFloat);
    }
  }
  
  public final void b()
  {
    View localView = (View)a.get();
    if (localView != null) {
      localView.animate().cancel();
    }
  }
  
  public final void c(long paramLong)
  {
    View localView = (View)a.get();
    if (localView != null) {
      localView.animate().setDuration(paramLong);
    }
  }
  
  public final void d(p0 paramp0)
  {
    View localView = (View)a.get();
    if (localView != null) {
      if (paramp0 != null) {
        localView.animate().setListener(new n0(paramp0, localView));
      } else {
        localView.animate().setListener(null);
      }
    }
  }
  
  public final void e(float paramFloat)
  {
    View localView = (View)a.get();
    if (localView != null) {
      localView.animate().translationY(paramFloat);
    }
  }
}

/* Location:
 * Qualified Name:     e0.o0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */