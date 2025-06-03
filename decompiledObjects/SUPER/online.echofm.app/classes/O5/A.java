package O5;

import E5.o;
import android.app.Activity;
import java.util.ArrayList;
import w.a;

public class A
  implements o
{
  public final int a = 240;
  public a b;
  public boolean c = false;
  
  public void a(Activity paramActivity, a parama, b paramb)
  {
    if (c) {}
    for (paramActivity = "A request for permissions is already running, please wait for it to finish before doing another request.";; paramActivity = "Unable to detect current Android Activity.")
    {
      paramb.a(paramActivity);
      return;
      if (paramActivity != null) {
        break;
      }
    }
    b = parama;
    parama = new ArrayList();
    parama.add("android.permission.POST_NOTIFICATIONS");
    parama = (String[])parama.toArray(new String[0]);
    if (!c)
    {
      a.l(paramActivity, parama, 240);
      c = true;
    }
  }
  
  public boolean b(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    boolean bool = c;
    int i = 0;
    if ((bool) && (paramInt == 240))
    {
      paramArrayOfString = b;
      if (paramArrayOfString != null)
      {
        c = false;
        paramInt = i;
        if (paramArrayOfInt.length > 0)
        {
          paramInt = i;
          if (paramArrayOfInt[0] == 0) {
            paramInt = 1;
          }
        }
        paramArrayOfString.a(paramInt);
        return true;
      }
    }
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt);
  }
}

/* Location:
 * Qualified Name:     O5.A
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */