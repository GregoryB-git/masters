package Z4;

import java.util.ArrayList;
import java.util.List;

public final class c
{
  public final a a;
  public final List b;
  
  public c(a parama)
  {
    a = parama;
    ArrayList localArrayList = new ArrayList();
    b = localArrayList;
    localArrayList.add(new b(parama, new int[] { 1 }));
  }
  
  public final b a(int paramInt)
  {
    if (paramInt >= b.size())
    {
      Object localObject = b;
      localObject = (b)((List)localObject).get(((List)localObject).size() - 1);
      for (int i = b.size(); i <= paramInt; i++)
      {
        a locala = a;
        localObject = ((b)localObject).g(new b(locala, new int[] { 1, locala.c(i - 1 + locala.d()) }));
        b.add(localObject);
      }
    }
    return (b)b.get(paramInt);
  }
  
  public void b(int[] paramArrayOfInt, int paramInt)
  {
    if (paramInt != 0)
    {
      int i = paramArrayOfInt.length - paramInt;
      if (i > 0)
      {
        b localb = a(paramInt);
        int[] arrayOfInt = new int[i];
        System.arraycopy(paramArrayOfInt, 0, arrayOfInt, 0, i);
        arrayOfInt = new b(a, arrayOfInt).h(paramInt, 1).b(localb)[1].d();
        int j = paramInt - arrayOfInt.length;
        for (paramInt = 0; paramInt < j; paramInt++) {
          paramArrayOfInt[(i + paramInt)] = 0;
        }
        System.arraycopy(arrayOfInt, 0, paramArrayOfInt, i + j, arrayOfInt.length);
        return;
      }
      throw new IllegalArgumentException("No data bytes provided");
    }
    throw new IllegalArgumentException("No error correction bytes");
  }
}

/* Location:
 * Qualified Name:     Z4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */