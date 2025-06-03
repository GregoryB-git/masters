package s;

import f;

public final class b<T>
{
  public Object a;
  public d<T> b;
  public e<Void> c = new e();
  public boolean d;
  
  public final void finalize()
  {
    Object localObject1 = b;
    if ((localObject1 != null) && (!((d)localObject1).isDone()))
    {
      Object localObject2 = f.l("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
      ((StringBuilder)localObject2).append(a);
      localObject2 = new c(((StringBuilder)localObject2).toString());
      b.q((Throwable)localObject2);
    }
    if (!d)
    {
      localObject1 = c;
      if (localObject1 != null) {
        ((e)localObject1).p(null);
      }
    }
  }
}

/* Location:
 * Qualified Name:     s.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */