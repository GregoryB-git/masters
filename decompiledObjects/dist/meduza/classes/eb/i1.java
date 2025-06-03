package eb;

import nb.i.d;

public final class i1
  implements Runnable
{
  public i1(h1 paramh1, h1.b paramb, i.d paramd, long paramLong) {}
  
  public final void run()
  {
    d.execute(a);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(b.toString());
    localStringBuilder.append("(scheduled in SynchronizationContext with delay of ");
    localStringBuilder.append(c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     eb.i1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */