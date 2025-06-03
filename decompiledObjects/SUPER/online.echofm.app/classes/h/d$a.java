package h;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

public abstract class d$a
  extends b.c
{
  public int[][] J;
  
  public d$a(a parama, d paramd, Resources paramResources)
  {
    super(parama, paramd, paramResources);
    if (parama != null) {
      J = J;
    } else {
      J = new int[f()][];
    }
  }
  
  public int A(int[] paramArrayOfInt)
  {
    int[][] arrayOfInt = J;
    int i = h();
    for (int j = 0; j < i; j++) {
      if (StateSet.stateSetMatches(arrayOfInt[j], paramArrayOfInt)) {
        return j;
      }
    }
    return -1;
  }
  
  public void o(int paramInt1, int paramInt2)
  {
    super.o(paramInt1, paramInt2);
    int[][] arrayOfInt = new int[paramInt2][];
    System.arraycopy(J, 0, arrayOfInt, 0, paramInt1);
    J = arrayOfInt;
  }
  
  public abstract void r();
  
  public int z(int[] paramArrayOfInt, Drawable paramDrawable)
  {
    int i = a(paramDrawable);
    J[i] = paramArrayOfInt;
    return i;
  }
}

/* Location:
 * Qualified Name:     h.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */