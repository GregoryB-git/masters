package q5;

public final class a
  implements U5.a
{
  public static final Object c = new Object();
  public volatile U5.a a;
  public volatile Object b = c;
  
  public a(U5.a parama)
  {
    a = parama;
  }
  
  public static U5.a a(U5.a parama)
  {
    b.b(parama);
    if ((parama instanceof a)) {
      return parama;
    }
    return new a(parama);
  }
  
  public static Object b(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 != c) && (paramObject1 != paramObject2))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Scoped provider was invoked recursively returning different results: ");
      localStringBuilder.append(paramObject1);
      localStringBuilder.append(" & ");
      localStringBuilder.append(paramObject2);
      localStringBuilder.append(". This is likely due to a circular dependency.");
      throw new IllegalStateException(localStringBuilder.toString());
    }
    return paramObject2;
  }
  
  public Object get()
  {
    Object localObject1 = b;
    Object localObject2 = c;
    Object localObject3 = localObject1;
    if (localObject1 == localObject2)
    {
      try
      {
        localObject1 = b;
        localObject3 = localObject1;
        if (localObject1 == localObject2)
        {
          localObject3 = a.get();
          b = b(b, localObject3);
          a = null;
        }
      }
      finally
      {
        break label69;
      }
      return localObject4;
      label69:
      throw ((Throwable)localObject4);
    }
    return localObject4;
  }
}

/* Location:
 * Qualified Name:     q5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */