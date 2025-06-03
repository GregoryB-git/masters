package m0;

import android.content.Context;
import android.view.LayoutInflater;

public abstract class c
  extends a
{
  public int p;
  public int q;
  public LayoutInflater r;
  
  @Deprecated
  public c(Context paramContext, int paramInt)
  {
    super(paramContext);
    q = paramInt;
    p = paramInt;
    r = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
  }
}

/* Location:
 * Qualified Name:     m0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */