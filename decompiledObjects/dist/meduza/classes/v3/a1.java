package v3;

import java.io.IOException;

public class a1
  extends IOException
{
  public final boolean a;
  public final int b;
  
  public a1(String paramString, Exception paramException, boolean paramBoolean, int paramInt)
  {
    super(paramString, paramException);
    a = paramBoolean;
    b = paramInt;
  }
  
  public static a1 a(String paramString, RuntimeException paramRuntimeException)
  {
    return new a1(paramString, paramRuntimeException, true, 1);
  }
  
  public static a1 b(String paramString, Exception paramException)
  {
    return new a1(paramString, paramException, true, 4);
  }
  
  public static a1 c(String paramString)
  {
    return new a1(paramString, null, false, 1);
  }
}

/* Location:
 * Qualified Name:     v3.a1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */