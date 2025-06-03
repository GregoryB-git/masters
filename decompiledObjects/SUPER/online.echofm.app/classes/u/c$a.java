package u;

public final class c$a
{
  public Object a;
  public c.d b;
  public d c = d.G();
  public boolean d;
  
  public void a()
  {
    a = null;
    b = null;
    c.z(null);
  }
  
  public boolean b(Object paramObject)
  {
    boolean bool = true;
    d = true;
    c.d locald = b;
    if ((locald == null) || (!locald.b(paramObject))) {
      bool = false;
    }
    if (bool) {
      d();
    }
    return bool;
  }
  
  public boolean c()
  {
    boolean bool = true;
    d = true;
    c.d locald = b;
    if ((locald == null) || (!locald.a(true))) {
      bool = false;
    }
    if (bool) {
      d();
    }
    return bool;
  }
  
  public final void d()
  {
    a = null;
    b = null;
    c = null;
  }
  
  public boolean e(Throwable paramThrowable)
  {
    boolean bool = true;
    d = true;
    c.d locald = b;
    if ((locald == null) || (!locald.d(paramThrowable))) {
      bool = false;
    }
    if (bool) {
      d();
    }
    return bool;
  }
  
  public void finalize()
  {
    Object localObject = b;
    if ((localObject != null) && (!((c.d)localObject).isDone()))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
      localStringBuilder.append(a);
      ((c.d)localObject).d(new c.b(localStringBuilder.toString()));
    }
    if (!d)
    {
      localObject = c;
      if (localObject != null) {
        ((d)localObject).z(null);
      }
    }
  }
}

/* Location:
 * Qualified Name:     u.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */