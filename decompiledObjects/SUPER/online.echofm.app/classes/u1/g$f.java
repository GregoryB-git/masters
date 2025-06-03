package u1;

import A.g;
import A.g.b;
import android.graphics.Path;

public abstract class g$f
  extends g.e
{
  public g.b[] a = null;
  public String b;
  public int c = 0;
  public int d;
  
  public g$f()
  {
    super(null);
  }
  
  public g$f(f paramf)
  {
    super(null);
    b = b;
    d = d;
    a = g.f(a);
  }
  
  public boolean c()
  {
    return false;
  }
  
  public void d(Path paramPath)
  {
    paramPath.reset();
    g.b[] arrayOfb = a;
    if (arrayOfb != null) {
      g.b.e(arrayOfb, paramPath);
    }
  }
  
  public g.b[] getPathData()
  {
    return a;
  }
  
  public String getPathName()
  {
    return b;
  }
  
  public void setPathData(g.b[] paramArrayOfb)
  {
    if (!g.b(a, paramArrayOfb)) {
      a = g.f(paramArrayOfb);
    } else {
      g.j(a, paramArrayOfb);
    }
  }
}

/* Location:
 * Qualified Name:     u1.g.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */