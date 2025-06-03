package t1;

import android.os.Trace;

public abstract class d
{
  public static void a(String paramString, int paramInt)
  {
    Trace.beginAsyncSection(paramString, paramInt);
  }
  
  public static void b(String paramString, int paramInt)
  {
    Trace.endAsyncSection(paramString, paramInt);
  }
}

/* Location:
 * Qualified Name:     t1.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */