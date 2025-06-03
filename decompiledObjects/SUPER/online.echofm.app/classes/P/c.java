package P;

public final class c
  extends n
{
  public final Object a;
  public final int b;
  
  public c(Object paramObject, int paramInt)
  {
    super(null);
    a = paramObject;
    b = paramInt;
  }
  
  public final void a()
  {
    Object localObject = a;
    int i = 0;
    int j;
    if (localObject != null) {
      j = localObject.hashCode();
    } else {
      j = 0;
    }
    if (j == b) {
      i = 1;
    }
    if (i != 0) {
      return;
    }
    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
  }
  
  public final Object b()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     P.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */