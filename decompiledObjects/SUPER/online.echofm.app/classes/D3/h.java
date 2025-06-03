package D3;

import E3.f;
import H3.s;

public abstract class h
{
  public static void a(Throwable paramThrowable)
  {
    if (paramThrowable == null)
    {
      f.f().k("A null value was passed to recordFatalException. Ignoring.");
      return;
    }
    da.p(paramThrowable);
  }
  
  public static void b(String paramString)
  {
    da.w("com.crashlytics.flutter.build-id.0", paramString);
  }
}

/* Location:
 * Qualified Name:     D3.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */