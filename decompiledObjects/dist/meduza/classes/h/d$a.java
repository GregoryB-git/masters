package h;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

public class d$a
  extends b.c
{
  public int[][] H;
  
  public d$a(a parama, d paramd, Resources paramResources)
  {
    super(parama, paramd, paramResources);
    if (parama != null) {
      H = H;
    } else {
      H = new int[g.length][];
    }
  }
  
  public void e()
  {
    Object localObject = H;
    int[][] arrayOfInt = new int[localObject.length][];
    for (int i = localObject.length - 1; i >= 0; i--)
    {
      localObject = H[i];
      if (localObject != null) {
        localObject = (int[])((int[])localObject).clone();
      } else {
        localObject = null;
      }
      arrayOfInt[i] = localObject;
    }
    H = arrayOfInt;
  }
  
  public final int f(int[] paramArrayOfInt)
  {
    int[][] arrayOfInt = H;
    int i = h;
    for (int j = 0; j < i; j++) {
      if (StateSet.stateSetMatches(arrayOfInt[j], paramArrayOfInt)) {
        return j;
      }
    }
    return -1;
  }
  
  public Drawable newDrawable()
  {
    return new d(this, null);
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    return new d(this, paramResources);
  }
}

/* Location:
 * Qualified Name:     h.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */