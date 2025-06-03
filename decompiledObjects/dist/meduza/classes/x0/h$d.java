package x0;

import android.app.Dialog;
import android.util.Log;
import android.view.View;
import b1.o;
import b1.x;

public final class h$d
  implements x<o>
{
  public h$d(h paramh) {}
  
  public final void a(Object paramObject)
  {
    if ((o)paramObject != null)
    {
      paramObject = a;
      if (f)
      {
        View localView = ((i)paramObject).requireView();
        if (localView.getParent() == null)
        {
          if (a.r != null)
          {
            if (y.L(3))
            {
              paramObject = new StringBuilder();
              ((StringBuilder)paramObject).append("DialogFragment ");
              ((StringBuilder)paramObject).append(this);
              ((StringBuilder)paramObject).append(" setting the content view on ");
              ((StringBuilder)paramObject).append(a.r);
              Log.d("FragmentManager", ((StringBuilder)paramObject).toString());
            }
            a.r.setContentView(localView);
          }
        }
        else {
          throw new IllegalStateException("DialogFragment can not be attached to a container view");
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     x0.h.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */