package f7;

import android.content.Context;
import android.os.AsyncTask;
import j6.g;
import j6.h;
import o9.d;

public final class b
  extends AsyncTask
{
  public b(Context paramContext, d paramd) {}
  
  public final Object doInBackground(Object[] paramArrayOfObject)
  {
    paramArrayOfObject = (Void[])paramArrayOfObject;
    int i;
    try
    {
      a.a(a);
      i = 0;
    }
    catch (g paramArrayOfObject)
    {
      i = a;
    }
    catch (h paramArrayOfObject)
    {
      i = b;
    }
    return Integer.valueOf(i);
  }
}

/* Location:
 * Qualified Name:     f7.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */