package e7;

import com.google.android.gms.measurement.internal.zzig;

public final class q2
  implements Runnable
{
  public final void run()
  {
    String str1 = a;
    if (str1 == null)
    {
      localObject1 = e.a;
      localObject2 = b;
      ((i6)localObject1).zzl().l();
      str1 = O;
      if ((str1 == null) || (str1.equals(localObject2)))
      {
        O = ((String)localObject2);
        N = null;
      }
      return;
    }
    Object localObject1 = c;
    Object localObject2 = new q4(d, (String)localObject1, str1);
    localObject1 = e.a;
    String str2 = b;
    ((i6)localObject1).zzl().l();
    str1 = O;
    if (str1 != null) {
      str1.equals(str2);
    }
    O = str2;
    N = ((q4)localObject2);
  }
}

/* Location:
 * Qualified Name:     e7.q2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */