package F4;

import android.util.Log;

public class c
{
  public static c a;
  
  public static c c()
  {
    try
    {
      if (a == null)
      {
        c localc1 = new F4/c;
        localc1.<init>();
        a = localc1;
      }
    }
    finally
    {
      break label37;
    }
    c localc2 = a;
    return localc2;
    label37:
    throw localc2;
  }
  
  public void a(String paramString)
  {
    Log.d("FirebasePerformance", paramString);
  }
  
  public void b(String paramString)
  {
    Log.e("FirebasePerformance", paramString);
  }
  
  public void d(String paramString)
  {
    Log.i("FirebasePerformance", paramString);
  }
  
  public void e(String paramString)
  {
    Log.w("FirebasePerformance", paramString);
  }
}

/* Location:
 * Qualified Name:     F4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */