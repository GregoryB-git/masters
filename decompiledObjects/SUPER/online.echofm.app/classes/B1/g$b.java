package B1;

import android.view.View;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public final class g$b
{
  public final WeakReference a;
  public final String b;
  
  public g$b(View paramView, String paramString)
  {
    a = new WeakReference(paramView);
    b = paramString;
  }
  
  public final View a()
  {
    Object localObject = a;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = (View)((Reference)localObject).get();
    }
    return (View)localObject;
  }
  
  public final String b()
  {
    return b;
  }
}

/* Location:
 * Qualified Name:     B1.g.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */