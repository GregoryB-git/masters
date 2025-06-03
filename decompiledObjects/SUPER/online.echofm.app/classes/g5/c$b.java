package g5;

public final class c$b
{
  public final int a;
  public final c.a[] b;
  
  public c$b(int paramInt, c.a... paramVarArgs)
  {
    a = paramInt;
    b = paramVarArgs;
  }
  
  public c.a[] a()
  {
    return b;
  }
  
  public int b()
  {
    return a;
  }
  
  public int c()
  {
    c.a[] arrayOfa = b;
    int i = arrayOfa.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      k += arrayOfa[j].a();
      j++;
    }
    return k;
  }
  
  public int d()
  {
    return a * c();
  }
}

/* Location:
 * Qualified Name:     g5.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */