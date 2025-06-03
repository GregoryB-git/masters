package n5;

import E5.k.d;
import android.util.Log;

public class E$b
  implements Runnable
{
  public E$b(E paramE, k paramk, String paramString, k.d paramd) {}
  
  public void run()
  {
    synchronized ()
    {
      k localk = o;
      if (localk != null) {
        E.j(r, localk);
      }
    }
    try
    {
      if (t.c(E.g))
      {
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("delete database ");
        localStringBuilder.append(p);
        Log.d("Sqflite", localStringBuilder.toString());
      }
    }
    catch (Exception localException)
    {
      break label90;
    }
    k.o(p);
    break label136;
    label90:
    localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("error ");
    localStringBuilder.append(localException);
    localStringBuilder.append(" while closing database ");
    localStringBuilder.append(E.k());
    Log.e("Sqflite", localStringBuilder.toString());
    label136:
    q.a(null);
  }
}

/* Location:
 * Qualified Name:     n5.E.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */