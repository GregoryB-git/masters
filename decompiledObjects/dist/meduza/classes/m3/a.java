package m3;

public final class a<T>
  implements qb.a<T>
{
  public static final Object c = new Object();
  public volatile qb.a<T> a;
  public volatile Object b = c;
  
  public a(b paramb)
  {
    a = paramb;
  }
  
  public static qb.a a(b paramb)
  {
    if ((paramb instanceof a)) {
      return paramb;
    }
    return new a(paramb);
  }
  
  public static void b(Object paramObject1, Object paramObject2)
  {
    int i;
    if (paramObject1 != c) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i != 0) && (paramObject1 != paramObject2))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Scoped provider was invoked recursively returning different results: ");
      localStringBuilder.append(paramObject1);
      localStringBuilder.append(" & ");
      localStringBuilder.append(paramObject2);
      localStringBuilder.append(". This is likely due to a circular dependency.");
      throw new IllegalStateException(localStringBuilder.toString());
    }
  }
  
  public final T get()
  {
    Object localObject1 = b;
    Object localObject2 = c;
    Object localObject3 = localObject1;
    if (localObject1 == localObject2) {
      try
      {
        localObject1 = b;
        localObject3 = localObject1;
        if (localObject1 == localObject2)
        {
          localObject3 = a.get();
          b(b, localObject3);
          b = localObject3;
          a = null;
        }
      }
      finally {}
    }
    return ?;
  }
}

/* Location:
 * Qualified Name:     m3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */