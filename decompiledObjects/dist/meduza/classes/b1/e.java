package b1;

public final class e
  implements m
{
  public final d a;
  public final m b;
  
  public e(d paramd, m paramm)
  {
    a = paramd;
    b = paramm;
  }
  
  public final void a(o paramo, k.a parama)
  {
    switch (a.a[parama.ordinal()])
    {
    default: 
      break;
    case 7: 
      throw new IllegalArgumentException("ON_ANY must not been send by anybody");
    case 6: 
      a.onDestroy(paramo);
      break;
    case 5: 
      a.onStop(paramo);
      break;
    case 4: 
      a.onPause(paramo);
      break;
    case 3: 
      a.onResume(paramo);
      break;
    case 2: 
      a.onStart(paramo);
      break;
    case 1: 
      a.onCreate(paramo);
    }
    m localm = b;
    if (localm != null) {
      localm.a(paramo, parama);
    }
  }
}

/* Location:
 * Qualified Name:     b1.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */