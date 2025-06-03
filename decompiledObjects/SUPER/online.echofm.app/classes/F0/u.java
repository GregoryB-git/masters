package F0;

import d0.A;
import java.io.EOFException;

public abstract class u
{
  public static void a(boolean paramBoolean, String paramString)
  {
    if (paramBoolean) {
      return;
    }
    throw A.a(paramString, null);
  }
  
  public static boolean b(s params, byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    try
    {
      boolean bool = params.l(paramArrayOfByte, paramInt1, paramInt2, paramBoolean);
      return bool;
    }
    catch (EOFException params)
    {
      if (paramBoolean) {
        return false;
      }
      throw params;
    }
  }
  
  public static int c(s params, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = 0;
    while (i < paramInt2)
    {
      int j = params.f(paramArrayOfByte, paramInt1 + i, paramInt2 - i);
      if (j == -1) {
        break;
      }
      i += j;
    }
    return i;
  }
  
  public static boolean d(s params, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      params.readFully(paramArrayOfByte, paramInt1, paramInt2);
      return true;
    }
    catch (EOFException params) {}
    return false;
  }
  
  public static boolean e(s params, int paramInt)
  {
    try
    {
      params.i(paramInt);
      return true;
    }
    catch (EOFException params) {}
    return false;
  }
}

/* Location:
 * Qualified Name:     F0.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */