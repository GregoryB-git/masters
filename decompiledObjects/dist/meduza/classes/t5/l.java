package t5;

import java.io.IOException;

public class l
  extends IOException
{
  public final int a;
  
  public l(int paramInt)
  {
    a = paramInt;
  }
  
  public l(int paramInt, String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
    a = paramInt;
  }
  
  public l(int paramInt, Throwable paramThrowable)
  {
    super(paramThrowable);
    a = paramInt;
  }
  
  public l(String paramString, int paramInt)
  {
    super(paramString);
    a = paramInt;
  }
}

/* Location:
 * Qualified Name:     t5.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */