package androidx.lifecycle;

class FullLifecycleObserverAdapter
  implements f
{
  public final f o;
  
  public void a(h paramh, d.b paramb)
  {
    switch (a.a[paramb.ordinal()])
    {
    default: 
      f localf = o;
      if (localf != null) {
        localf.a(paramh, paramb);
      }
      return;
    case 7: 
      throw new IllegalArgumentException("ON_ANY must not been send by anybody");
    case 6: 
      throw null;
    case 5: 
      throw null;
    case 4: 
      throw null;
    case 3: 
      throw null;
    case 2: 
      throw null;
    }
    throw null;
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.FullLifecycleObserverAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */