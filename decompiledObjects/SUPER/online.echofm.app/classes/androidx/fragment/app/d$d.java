package androidx.fragment.app;

import android.app.Dialog;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.h;
import androidx.lifecycle.m;

public class d$d
  implements m
{
  public d$d(d paramd) {}
  
  public void b(h paramh)
  {
    if ((paramh != null) && (d.J1(a)))
    {
      paramh = a.q1();
      if (paramh.getParent() == null)
      {
        if (d.H1(a) != null)
        {
          if (n.D0(3))
          {
            StringBuilder localStringBuilder = new StringBuilder();
            localStringBuilder.append("DialogFragment ");
            localStringBuilder.append(this);
            localStringBuilder.append(" setting the content view on ");
            localStringBuilder.append(d.H1(a));
            Log.d("FragmentManager", localStringBuilder.toString());
          }
          d.H1(a).setContentView(paramh);
        }
      }
      else {
        throw new IllegalStateException("DialogFragment can not be attached to a container view");
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.d.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */