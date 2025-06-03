package e7;

public enum f3
{
  public final e3.a[] a;
  
  static
  {
    f3 localf31 = new f3("STORAGE", 0, new e3.a[] { e3.a.b, e3.a.c });
    b = localf31;
    f3 localf32 = new f3("DMA", 1, new e3.a[] { e3.a.d });
    c = localf32;
    d = new f3[] { localf31, localf32 };
  }
  
  public f3(e3.a... paramVarArgs)
  {
    a = paramVarArgs;
  }
}

/* Location:
 * Qualified Name:     e7.f3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */