package go;

import a0.j;
import f;
import java.util.Arrays;

final class Seq$RefMap
{
  private int[] keys = new int[16];
  private int live = 0;
  private int next = 0;
  private Seq.Ref[] objs = new Seq.Ref[16];
  
  private void grow()
  {
    int i = roundPow2(live);
    int[] arrayOfInt1 = keys;
    if (i * 2 > arrayOfInt1.length)
    {
      arrayOfInt1 = new int[arrayOfInt1.length * 2];
      localObject = new Seq.Ref[objs.length * 2];
    }
    else
    {
      localObject = objs;
    }
    int j = 0;
    int k;
    for (i = j;; i = k)
    {
      int[] arrayOfInt2 = keys;
      if (j >= arrayOfInt2.length) {
        break;
      }
      Seq.Ref localRef = objs[j];
      k = i;
      if (localRef != null)
      {
        arrayOfInt1[i] = arrayOfInt2[j];
        localObject[i] = localRef;
        k = i + 1;
      }
      j++;
    }
    for (j = i; j < arrayOfInt1.length; j++)
    {
      arrayOfInt1[j] = 0;
      localObject[j] = null;
    }
    keys = arrayOfInt1;
    objs = ((Seq.Ref[])localObject);
    next = i;
    if (live == i) {
      return;
    }
    Object localObject = f.l("bad state: live=");
    ((StringBuilder)localObject).append(live);
    ((StringBuilder)localObject).append(", next=");
    ((StringBuilder)localObject).append(next);
    throw new RuntimeException(((StringBuilder)localObject).toString());
  }
  
  private static int roundPow2(int paramInt)
  {
    int i = 1;
    while (i < paramInt) {
      i *= 2;
    }
    return i;
  }
  
  public Seq.Ref get(int paramInt)
  {
    paramInt = Arrays.binarySearch(keys, 0, next, paramInt);
    if (paramInt >= 0) {
      return objs[paramInt];
    }
    return null;
  }
  
  public void put(int paramInt, Seq.Ref paramRef)
  {
    if (paramRef != null)
    {
      int i = Arrays.binarySearch(keys, 0, next, paramInt);
      Object localObject;
      if (i >= 0)
      {
        localObject = objs;
        if (localObject[i] == null)
        {
          localObject[i] = paramRef;
          live += 1;
        }
        if (localObject[i] == paramRef) {
          return;
        }
        throw new RuntimeException(j.h("replacing an existing ref (with key ", paramInt, ")"));
      }
      if (next >= keys.length)
      {
        grow();
        i = Arrays.binarySearch(keys, 0, next, paramInt);
      }
      i = i;
      int j = next;
      if (i < j)
      {
        localObject = keys;
        int k = i + 1;
        System.arraycopy(localObject, i, localObject, k, j - i);
        localObject = objs;
        System.arraycopy(localObject, i, localObject, k, next - i);
      }
      keys[i] = paramInt;
      objs[i] = paramRef;
      live += 1;
      next += 1;
      return;
    }
    throw new RuntimeException(j.h("put a null ref (with key ", paramInt, ")"));
  }
  
  public void remove(int paramInt)
  {
    paramInt = Arrays.binarySearch(keys, 0, next, paramInt);
    if (paramInt >= 0)
    {
      Seq.Ref[] arrayOfRef = objs;
      if (arrayOfRef[paramInt] != null)
      {
        arrayOfRef[paramInt] = null;
        live -= 1;
      }
    }
  }
}

/* Location:
 * Qualified Name:     go.Seq.RefMap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */