package b1;

public final class f0
  implements m
{
  public final i0 a;
  
  public f0(i0 parami0)
  {
    a = parami0;
  }
  
  public final void a(o paramo, k.a parama)
  {
    int i;
    if (parama == k.a.ON_CREATE) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      paramo.getLifecycle().c(this);
      a.b();
      return;
    }
    paramo = new StringBuilder();
    paramo.append("Next event must be ON_CREATE, it was ");
    paramo.append(parama);
    throw new IllegalStateException(paramo.toString().toString());
  }
}

/* Location:
 * Qualified Name:     b1.f0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */