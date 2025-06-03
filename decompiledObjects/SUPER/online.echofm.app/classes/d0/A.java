package d0;

import java.io.IOException;

public class A
  extends IOException
{
  public final boolean o;
  public final int p;
  
  public A(String paramString, Throwable paramThrowable, boolean paramBoolean, int paramInt)
  {
    super(paramString, paramThrowable);
    o = paramBoolean;
    p = paramInt;
  }
  
  public static A a(String paramString, Throwable paramThrowable)
  {
    return new A(paramString, paramThrowable, true, 1);
  }
  
  public static A b(String paramString, Throwable paramThrowable)
  {
    return new A(paramString, paramThrowable, true, 0);
  }
  
  public static A c(String paramString, Throwable paramThrowable)
  {
    return new A(paramString, paramThrowable, true, 4);
  }
  
  public static A d(String paramString)
  {
    return new A(paramString, null, false, 1);
  }
  
  public String getMessage()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.getMessage());
    localStringBuilder.append("{contentIsMalformed=");
    localStringBuilder.append(o);
    localStringBuilder.append(", dataType=");
    localStringBuilder.append(p);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     d0.A
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */