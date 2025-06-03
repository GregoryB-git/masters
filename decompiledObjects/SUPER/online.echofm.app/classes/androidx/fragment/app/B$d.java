package androidx.fragment.app;

import E.c;
import android.util.Log;
import android.view.View;

public class B$d
  extends B.e
{
  public final t h;
  
  public B$d(B.e.c paramc, B.e.b paramb, t paramt, c paramc1)
  {
    super(paramc, paramb, paramt.k(), paramc1);
    h = paramt;
  }
  
  public void c()
  {
    super.c();
    h.m();
  }
  
  public void l()
  {
    Fragment localFragment = h.k();
    View localView = V.findFocus();
    if (localView != null)
    {
      localFragment.x1(localView);
      if (n.D0(2))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("requestFocus: Saved focused view ");
        localStringBuilder.append(localView);
        localStringBuilder.append(" for Fragment ");
        localStringBuilder.append(localFragment);
        Log.v("FragmentManager", localStringBuilder.toString());
      }
    }
    if (g() == B.e.b.p)
    {
      localView = f().q1();
      if (localView.getParent() == null)
      {
        h.b();
        localView.setAlpha(0.0F);
      }
      if ((localView.getAlpha() == 0.0F) && (localView.getVisibility() == 0)) {
        localView.setVisibility(4);
      }
      localView.setAlpha(localFragment.G());
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.B.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */