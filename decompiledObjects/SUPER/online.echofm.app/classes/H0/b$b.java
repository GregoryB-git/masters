package H0;

import F0.M;
import F0.M.a;
import F0.N;

public class b$b
  implements M
{
  public final long a;
  
  public b$b(b paramb, long paramLong)
  {
    a = paramLong;
  }
  
  public boolean h()
  {
    return true;
  }
  
  public M.a j(long paramLong)
  {
    Object localObject1 = b.c(b)[0].i(paramLong);
    int i = 1;
    while (i < b.c(b).length)
    {
      M.a locala = b.c(b)[i].i(paramLong);
      Object localObject2 = localObject1;
      if (a.b < a.b) {
        localObject2 = locala;
      }
      i++;
      localObject1 = localObject2;
    }
    return (M.a)localObject1;
  }
  
  public long l()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     H0.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */