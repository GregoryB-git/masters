package M;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class c
  extends a
{
  public int w;
  public int x;
  public LayoutInflater y;
  
  public c(Context paramContext, int paramInt, Cursor paramCursor, boolean paramBoolean)
  {
    super(paramContext, paramCursor, paramBoolean);
    x = paramInt;
    w = paramInt;
    y = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
  }
  
  public View g(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return y.inflate(x, paramViewGroup, false);
  }
  
  public View h(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return y.inflate(w, paramViewGroup, false);
  }
}

/* Location:
 * Qualified Name:     M.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */