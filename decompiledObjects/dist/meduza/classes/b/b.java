package b;

import android.window.BackEvent;
import f;

public final class b
{
  public final float a;
  public final float b;
  public final float c;
  public final int d;
  
  public b(BackEvent paramBackEvent)
  {
    a = f1;
    b = f2;
    c = f3;
    d = i;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("BackEventCompat{touchX=");
    localStringBuilder.append(a);
    localStringBuilder.append(", touchY=");
    localStringBuilder.append(b);
    localStringBuilder.append(", progress=");
    localStringBuilder.append(c);
    localStringBuilder.append(", swipeEdge=");
    localStringBuilder.append(d);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */