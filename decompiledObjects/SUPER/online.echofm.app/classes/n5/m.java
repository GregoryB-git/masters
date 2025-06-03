package n5;

public final class m
{
  public final l a;
  public final Runnable b;
  
  public m(l paraml, Runnable paramRunnable)
  {
    a = paraml;
    b = paramRunnable;
  }
  
  public Integer a()
  {
    Object localObject = a;
    if (localObject != null) {
      localObject = Integer.valueOf(((l)localObject).a());
    } else {
      localObject = null;
    }
    return (Integer)localObject;
  }
  
  public boolean b()
  {
    l locall = a;
    boolean bool;
    if ((locall != null) && (locall.b())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     n5.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */