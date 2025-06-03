package h5;

import g5.a;
import g5.c;

public final class f
{
  public g5.b a;
  public a b;
  public c c;
  public int d = -1;
  public b e;
  
  public static boolean b(int paramInt)
  {
    return (paramInt >= 0) && (paramInt < 8);
  }
  
  public b a()
  {
    return e;
  }
  
  public void c(a parama)
  {
    b = parama;
  }
  
  public void d(int paramInt)
  {
    d = paramInt;
  }
  
  public void e(b paramb)
  {
    e = paramb;
  }
  
  public void f(g5.b paramb)
  {
    a = paramb;
  }
  
  public void g(c paramc)
  {
    c = paramc;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(200);
    localStringBuilder.append("<<\n");
    localStringBuilder.append(" mode: ");
    localStringBuilder.append(a);
    localStringBuilder.append("\n ecLevel: ");
    localStringBuilder.append(b);
    localStringBuilder.append("\n version: ");
    localStringBuilder.append(c);
    localStringBuilder.append("\n maskPattern: ");
    localStringBuilder.append(d);
    if (e == null)
    {
      localStringBuilder.append("\n matrix: null\n");
    }
    else
    {
      localStringBuilder.append("\n matrix:\n");
      localStringBuilder.append(e);
    }
    localStringBuilder.append(">>\n");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     h5.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */