package h;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;

public abstract class d
  extends b
{
  public a A;
  public boolean B;
  
  public d(a parama)
  {
    if (parama != null) {
      h(parama);
    }
  }
  
  public void applyTheme(Resources.Theme paramTheme)
  {
    super.applyTheme(paramTheme);
    onStateChange(getState());
  }
  
  public void h(b.c paramc)
  {
    super.h(paramc);
    if ((paramc instanceof a)) {
      A = ((a)paramc);
    }
  }
  
  public int[] j(AttributeSet paramAttributeSet)
  {
    int i = paramAttributeSet.getAttributeCount();
    int[] arrayOfInt = new int[i];
    int j = 0;
    int n;
    for (int k = j; j < i; k = n)
    {
      int m = paramAttributeSet.getAttributeNameResource(j);
      n = k;
      if (m != 0)
      {
        n = k;
        if (m != 16842960)
        {
          n = k;
          if (m != 16843161)
          {
            if (paramAttributeSet.getAttributeBooleanValue(j, false)) {
              n = m;
            } else {
              n = -m;
            }
            arrayOfInt[k] = n;
            n = k + 1;
          }
        }
      }
      j++;
    }
    return StateSet.trimStateSet(arrayOfInt, k);
  }
  
  public Drawable mutate()
  {
    if ((!B) && (super.mutate() == this))
    {
      A.r();
      B = true;
    }
    return this;
  }
  
  public abstract boolean onStateChange(int[] paramArrayOfInt);
  
  public static abstract class a
    extends b.c
  {
    public int[][] J;
    
    public a(a parama, d paramd, Resources paramResources)
    {
      super(paramd, paramResources);
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
}

/* Location:
 * Qualified Name:     h.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */