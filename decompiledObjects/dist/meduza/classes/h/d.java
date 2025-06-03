package h;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

public class d
  extends b
{
  public a v;
  public boolean w;
  
  public d() {}
  
  public d(a parama, Resources paramResources)
  {
    e(new a(parama, this, paramResources));
    onStateChange(getState());
  }
  
  public final void applyTheme(Resources.Theme paramTheme)
  {
    super.applyTheme(paramTheme);
    onStateChange(getState());
  }
  
  public void e(b.c paramc)
  {
    a = paramc;
    int i = o;
    if (i >= 0)
    {
      Drawable localDrawable = paramc.d(i);
      c = localDrawable;
      if (localDrawable != null) {
        c(localDrawable);
      }
    }
    d = null;
    if ((paramc instanceof a)) {
      v = ((a)paramc);
    }
  }
  
  public a f()
  {
    return new a(v, this, null);
  }
  
  public boolean isStateful()
  {
    return true;
  }
  
  public Drawable mutate()
  {
    if (!w)
    {
      super.mutate();
      v.e();
      w = true;
    }
    return this;
  }
  
  public boolean onStateChange(int[] paramArrayOfInt)
  {
    boolean bool = super.onStateChange(paramArrayOfInt);
    int i = v.f(paramArrayOfInt);
    int j = i;
    if (i < 0) {
      j = v.f(StateSet.WILD_CARD);
    }
    if ((!d(j)) && (!bool)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static class a
    extends b.c
  {
    public int[][] H;
    
    public a(a parama, d paramd, Resources paramResources)
    {
      super(paramd, paramResources);
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
}

/* Location:
 * Qualified Name:     h.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */