package o0;

public final class c<T>
  extends b0<T>
{
  public final T a;
  public final int b;
  
  public c(T paramT, int paramInt)
  {
    a = paramT;
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
}

/* Location:
 * Qualified Name:     o0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */