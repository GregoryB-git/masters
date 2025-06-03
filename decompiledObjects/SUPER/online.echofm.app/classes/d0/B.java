package d0;

import android.os.Bundle;
import g0.M;

public abstract class B
  extends Exception
{
  public static final String r = M.w0(0);
  public static final String s = M.w0(1);
  public static final String t = M.w0(2);
  public static final String u = M.w0(3);
  public static final String v = M.w0(4);
  public static final String w = M.w0(5);
  public final int o;
  public final long p;
  public final Bundle q;
  
  public B(String paramString, Throwable paramThrowable, int paramInt, Bundle paramBundle, long paramLong)
  {
    super(paramString, paramThrowable);
    o = paramInt;
    q = paramBundle;
    p = paramLong;
  }
}

/* Location:
 * Qualified Name:     d0.B
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */