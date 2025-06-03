package l;

import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import t.g;

public class M$c
  extends g
{
  public M$c(int paramInt)
  {
    super(paramInt);
  }
  
  public static int j(int paramInt, PorterDuff.Mode paramMode)
  {
    return (paramInt + 31) * 31 + paramMode.hashCode();
  }
  
  public PorterDuffColorFilter k(int paramInt, PorterDuff.Mode paramMode)
  {
    return (PorterDuffColorFilter)c(Integer.valueOf(j(paramInt, paramMode)));
  }
  
  public PorterDuffColorFilter l(int paramInt, PorterDuff.Mode paramMode, PorterDuffColorFilter paramPorterDuffColorFilter)
  {
    return (PorterDuffColorFilter)d(Integer.valueOf(j(paramInt, paramMode)), paramPorterDuffColorFilter);
  }
}

/* Location:
 * Qualified Name:     l.M.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */