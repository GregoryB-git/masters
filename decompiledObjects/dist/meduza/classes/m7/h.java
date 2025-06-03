package m7;

public final class h
  implements k
{
  public static final Object c = new Object();
  public volatile k a;
  public volatile Object b = c;
  
  public h(i parami)
  {
    a = parami;
  }
  
  public static k b(i parami)
  {
    if ((parami instanceof h)) {
      return parami;
    }
    return new h(parami);
  }
  
  public final Object a()
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
          localObject3 = a.a();
          localObject1 = b;
          if ((localObject1 != localObject2) && (localObject1 != localObject3))
          {
            IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((StringBuilder)localObject2).append("Scoped provider was invoked recursively returning different results: ");
            ((StringBuilder)localObject2).append(localObject1);
            ((StringBuilder)localObject2).append(" & ");
            ((StringBuilder)localObject2).append(localObject3);
            ((StringBuilder)localObject2).append(". This is likely due to a circular dependency.");
            localIllegalStateException.<init>(((StringBuilder)localObject2).toString());
            throw localIllegalStateException;
          }
          b = localObject3;
          a = null;
        }
      }
      finally {}
    }
    return localObject4;
  }
}

/* Location:
 * Qualified Name:     m7.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */