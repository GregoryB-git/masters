package x0;

import android.util.Log;
import android.view.View;
import f;

public final class r0$b
  extends r0.c
{
  public final e0 l;
  
  public r0$b(int paramInt1, int paramInt2, e0 parame0)
  {
    super(paramInt1, paramInt2, locali);
    l = parame0;
  }
  
  public final void b()
  {
    super.b();
    c.mTransitioning = false;
    l.k();
  }
  
  public final void e()
  {
    if (h) {
      return;
    }
    int i = 1;
    h = true;
    int j = b;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (j == 2)
    {
      localObject1 = l.c;
      ec.i.d(localObject1, "fragmentStateManager.fragment");
      localObject2 = mView.findFocus();
      if (localObject2 != null)
      {
        ((i)localObject1).setFocusedView((View)localObject2);
        if (y.L(2))
        {
          localObject3 = new StringBuilder();
          ((StringBuilder)localObject3).append("requestFocus: Saved focused view ");
          ((StringBuilder)localObject3).append(localObject2);
          ((StringBuilder)localObject3).append(" for Fragment ");
          ((StringBuilder)localObject3).append(localObject1);
          Log.v("FragmentManager", ((StringBuilder)localObject3).toString());
        }
      }
      localObject2 = c.requireView();
      ec.i.d(localObject2, "this.fragment.requireView()");
      if (((View)localObject2).getParent() == null)
      {
        l.b();
        ((View)localObject2).setAlpha(0.0F);
      }
      if (((View)localObject2).getAlpha() != 0.0F) {
        i = 0;
      }
      if ((i != 0) && (((View)localObject2).getVisibility() == 0)) {
        ((View)localObject2).setVisibility(4);
      }
      ((View)localObject2).setAlpha(((i)localObject1).getPostOnViewCreatedAlpha());
    }
    else if (j == 3)
    {
      localObject3 = l.c;
      ec.i.d(localObject3, "fragmentStateManager.fragment");
      localObject1 = ((i)localObject3).requireView();
      ec.i.d(localObject1, "fragment.requireView()");
      if (y.L(2))
      {
        localObject2 = f.l("Clearing focus ");
        ((StringBuilder)localObject2).append(((View)localObject1).findFocus());
        ((StringBuilder)localObject2).append(" on view ");
        ((StringBuilder)localObject2).append(localObject1);
        ((StringBuilder)localObject2).append(" for Fragment ");
        ((StringBuilder)localObject2).append(localObject3);
        Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
      }
      ((View)localObject1).clearFocus();
    }
  }
}

/* Location:
 * Qualified Name:     x0.r0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */