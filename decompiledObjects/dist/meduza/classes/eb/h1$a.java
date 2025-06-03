package eb;

public final class h1$a
  implements Runnable
{
  public h1$a(h1 paramh1, h1.b paramb, Runnable paramRunnable) {}
  
  public final void run()
  {
    c.execute(a);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(b.toString());
    localStringBuilder.append("(scheduled in SynchronizationContext)");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     eb.h1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */