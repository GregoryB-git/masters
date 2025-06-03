package k2;

public abstract class b
{
  public static Object a(int paramInt, Object paramObject, a parama, c paramc)
  {
    int i = paramInt;
    Object localObject = paramObject;
    if (paramInt < 1) {
      return parama.apply(paramObject);
    }
    do
    {
      paramObject = parama.apply(localObject);
      localObject = paramc.a(localObject, paramObject);
      if (localObject == null) {
        break;
      }
      paramInt = i - 1;
      i = paramInt;
    } while (paramInt >= 1);
    return paramObject;
  }
}

/* Location:
 * Qualified Name:     k2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */