package a2;

import x.d;
import x.d.a;

public abstract class f$e
  extends f.d
{
  public d.a[] a = null;
  public String b;
  public int c = 0;
  public int d;
  
  public f$e() {}
  
  public f$e(e parame)
  {
    b = b;
    d = d;
    a = d.e(a);
  }
  
  public d.a[] getPathData()
  {
    return a;
  }
  
  public String getPathName()
  {
    return b;
  }
  
  public void setPathData(d.a[] paramArrayOfa)
  {
    if (!d.a(a, paramArrayOfa))
    {
      a = d.e(paramArrayOfa);
    }
    else
    {
      d.a[] arrayOfa = a;
      for (int i = 0; i < paramArrayOfa.length; i++)
      {
        a = ((char)a);
        for (int j = 0;; j++)
        {
          float[] arrayOfFloat = b;
          if (j >= arrayOfFloat.length) {
            break;
          }
          b[j] = arrayOfFloat[j];
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     a2.f.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */