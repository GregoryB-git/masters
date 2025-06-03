package z2;

import A2.n;
import android.app.Activity;
import androidx.fragment.app.e;

public class f
{
  public final Object a;
  
  public f(Activity paramActivity)
  {
    n.j(paramActivity, "Activity must not be null");
    a = paramActivity;
  }
  
  public final Activity a()
  {
    return (Activity)a;
  }
  
  public final e b()
  {
    return (e)a;
  }
  
  public final boolean c()
  {
    return a instanceof Activity;
  }
  
  public final boolean d()
  {
    return a instanceof e;
  }
}

/* Location:
 * Qualified Name:     z2.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */