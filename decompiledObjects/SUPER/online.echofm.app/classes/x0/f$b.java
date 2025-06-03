package x0;

import java.io.IOException;

public final class f$b
  extends IOException
{
  public final int o;
  
  public f$b(int paramInt)
  {
    super(localStringBuilder.toString());
    o = paramInt;
  }
  
  public static String a(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2) {
          return "unknown";
        }
        return "start exceeds end";
      }
      return "not seekable to start";
    }
    return "invalid period count";
  }
}

/* Location:
 * Qualified Name:     x0.f.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */