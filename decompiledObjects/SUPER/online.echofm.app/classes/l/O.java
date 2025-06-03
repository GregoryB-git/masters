package l;

public class O
{
  public int a = 0;
  public int b = 0;
  public int c = Integer.MIN_VALUE;
  public int d = Integer.MIN_VALUE;
  public int e = 0;
  public int f = 0;
  public boolean g = false;
  public boolean h = false;
  
  public int a()
  {
    int i;
    if (g) {
      i = a;
    } else {
      i = b;
    }
    return i;
  }
  
  public int b()
  {
    return a;
  }
  
  public int c()
  {
    return b;
  }
  
  public int d()
  {
    int i;
    if (g) {
      i = b;
    } else {
      i = a;
    }
    return i;
  }
  
  public void e(int paramInt1, int paramInt2)
  {
    h = false;
    if (paramInt1 != Integer.MIN_VALUE)
    {
      e = paramInt1;
      a = paramInt1;
    }
    if (paramInt2 != Integer.MIN_VALUE)
    {
      f = paramInt2;
      b = paramInt2;
    }
  }
  
  public void f(boolean paramBoolean)
  {
    if (paramBoolean == g) {
      return;
    }
    g = paramBoolean;
    int i;
    if (h) {
      if (paramBoolean)
      {
        i = d;
        if (i == Integer.MIN_VALUE) {
          i = e;
        }
        a = i;
        i = c;
        if (i == Integer.MIN_VALUE) {
          break label114;
        }
      }
    }
    for (;;)
    {
      b = i;
      break;
      i = c;
      if (i == Integer.MIN_VALUE) {
        i = e;
      }
      a = i;
      i = d;
      if (i != Integer.MIN_VALUE)
      {
        continue;
        a = e;
      }
      else
      {
        label114:
        i = f;
      }
    }
  }
  
  public void g(int paramInt1, int paramInt2)
  {
    c = paramInt1;
    d = paramInt2;
    h = true;
    if (g)
    {
      if (paramInt2 != Integer.MIN_VALUE) {
        a = paramInt2;
      }
      if (paramInt1 != Integer.MIN_VALUE) {
        b = paramInt1;
      }
    }
    else
    {
      if (paramInt1 != Integer.MIN_VALUE) {
        a = paramInt1;
      }
      if (paramInt2 != Integer.MIN_VALUE) {
        b = paramInt2;
      }
    }
  }
}

/* Location:
 * Qualified Name:     l.O
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */