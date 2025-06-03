package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import e.b;
import e.d;

public class e$a
  implements M.e
{
  public final int[] a = { d.S, d.Q, d.a };
  public final int[] b = { d.o, d.B, d.t, d.p, d.q, d.s, d.r };
  public final int[] c = { d.P, d.R, d.k, d.I, d.J, d.L, d.N, d.K, d.M, d.O };
  public final int[] d = { d.w, d.i, d.v };
  public final int[] e = { d.H, d.T };
  public final int[] f = { d.c, d.g, d.d, d.h };
  
  public boolean a(Context paramContext, int paramInt, Drawable paramDrawable)
  {
    Object localObject1 = e.a();
    Object localObject2 = localObject1;
    int i;
    if (f(a, paramInt)) {
      i = e.a.l;
    }
    for (int j = 1;; j = i)
    {
      localObject2 = localObject1;
      paramInt = -1;
      break label130;
      if (f(c, paramInt))
      {
        i = e.a.j;
        break;
      }
      if (f(d, paramInt)) {
        localObject2 = PorterDuff.Mode.MULTIPLY;
      }
      do
      {
        paramInt = -1;
        i = 16842801;
        j = 1;
        break;
        if (paramInt == d.u)
        {
          paramInt = Math.round(40.8F);
          j = 1;
          i = 16842800;
          break;
        }
      } while (paramInt == d.l);
      i = 0;
    }
    label130:
    if (j != 0)
    {
      localObject1 = paramDrawable;
      if (B.a(paramDrawable)) {
        localObject1 = paramDrawable.mutate();
      }
      ((Drawable)localObject1).setColorFilter(e.d(T.c(paramContext, i), (PorterDuff.Mode)localObject2));
      if (paramInt != -1) {
        ((Drawable)localObject1).setAlpha(paramInt);
      }
      return true;
    }
    return false;
  }
  
  public PorterDuff.Mode b(int paramInt)
  {
    PorterDuff.Mode localMode;
    if (paramInt == d.F) {
      localMode = PorterDuff.Mode.MULTIPLY;
    } else {
      localMode = null;
    }
    return localMode;
  }
  
  public ColorStateList c(Context paramContext, int paramInt)
  {
    if (paramInt == d.m) {
      return g.a.a(paramContext, b.c);
    }
    if (paramInt == d.G) {
      return g.a.a(paramContext, b.f);
    }
    if (paramInt == d.F) {
      return k(paramContext);
    }
    if (paramInt == d.f) {
      return j(paramContext);
    }
    if (paramInt == d.b) {
      return g(paramContext);
    }
    if (paramInt == d.e) {
      return i(paramContext);
    }
    if ((paramInt != d.D) && (paramInt != d.E))
    {
      if (f(b, paramInt)) {
        return T.e(paramContext, e.a.l);
      }
      if (f(e, paramInt)) {
        return g.a.a(paramContext, b.b);
      }
      if (f(f, paramInt)) {
        return g.a.a(paramContext, b.a);
      }
      if (paramInt == d.A) {
        return g.a.a(paramContext, b.d);
      }
      return null;
    }
    return g.a.a(paramContext, b.e);
  }
  
  public Drawable d(M paramM, Context paramContext, int paramInt)
  {
    if (paramInt == d.j) {
      return new LayerDrawable(new Drawable[] { paramM.j(paramContext, d.i), paramM.j(paramContext, d.k) });
    }
    return null;
  }
  
  public boolean e(Context paramContext, int paramInt, Drawable paramDrawable)
  {
    LayerDrawable localLayerDrawable;
    if (paramInt == d.C)
    {
      localLayerDrawable = (LayerDrawable)paramDrawable;
      l(localLayerDrawable.findDrawableByLayerId(16908288), T.c(paramContext, e.a.l), e.a());
      paramDrawable = localLayerDrawable.findDrawableByLayerId(16908303);
    }
    for (paramInt = e.a.l;; paramInt = e.a.j)
    {
      l(paramDrawable, T.c(paramContext, paramInt), e.a());
      l(localLayerDrawable.findDrawableByLayerId(16908301), T.c(paramContext, e.a.j), e.a());
      return true;
      if ((paramInt != d.y) && (paramInt != d.x) && (paramInt != d.z)) {
        return false;
      }
      localLayerDrawable = (LayerDrawable)paramDrawable;
      l(localLayerDrawable.findDrawableByLayerId(16908288), T.b(paramContext, e.a.l), e.a());
      paramDrawable = localLayerDrawable.findDrawableByLayerId(16908303);
    }
  }
  
  public final boolean f(int[] paramArrayOfInt, int paramInt)
  {
    int i = paramArrayOfInt.length;
    for (int j = 0; j < i; j++) {
      if (paramArrayOfInt[j] == paramInt) {
        return true;
      }
    }
    return false;
  }
  
  public final ColorStateList g(Context paramContext)
  {
    return h(paramContext, 0);
  }
  
  public final ColorStateList h(Context paramContext, int paramInt)
  {
    int i = T.c(paramContext, e.a.k);
    int j = T.b(paramContext, e.a.i);
    int[] arrayOfInt1 = T.b;
    int[] arrayOfInt2 = T.e;
    int k = A.a.c(i, paramInt);
    paramContext = T.c;
    i = A.a.c(i, paramInt);
    return new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2, paramContext, T.i }, new int[] { j, k, i, paramInt });
  }
  
  public final ColorStateList i(Context paramContext)
  {
    return h(paramContext, T.c(paramContext, e.a.h));
  }
  
  public final ColorStateList j(Context paramContext)
  {
    return h(paramContext, T.c(paramContext, e.a.i));
  }
  
  public final ColorStateList k(Context paramContext)
  {
    int[][] arrayOfInt = new int[3][];
    int[] arrayOfInt1 = new int[3];
    ColorStateList localColorStateList = T.e(paramContext, e.a.m);
    if ((localColorStateList != null) && (localColorStateList.isStateful()))
    {
      int[] arrayOfInt2 = T.b;
      arrayOfInt[0] = arrayOfInt2;
      arrayOfInt1[0] = localColorStateList.getColorForState(arrayOfInt2, 0);
      arrayOfInt[1] = T.f;
      arrayOfInt1[1] = T.c(paramContext, e.a.j);
      arrayOfInt[2] = T.i;
      arrayOfInt1[2] = localColorStateList.getDefaultColor();
    }
    else
    {
      arrayOfInt[0] = T.b;
      arrayOfInt1[0] = T.b(paramContext, e.a.m);
      arrayOfInt[1] = T.f;
      arrayOfInt1[1] = T.c(paramContext, e.a.j);
      arrayOfInt[2] = T.i;
      arrayOfInt1[2] = T.c(paramContext, e.a.m);
    }
    return new ColorStateList(arrayOfInt, arrayOfInt1);
  }
  
  public final void l(Drawable paramDrawable, int paramInt, PorterDuff.Mode paramMode)
  {
    Drawable localDrawable = paramDrawable;
    if (B.a(paramDrawable)) {
      localDrawable = paramDrawable.mutate();
    }
    paramDrawable = paramMode;
    if (paramMode == null) {
      paramDrawable = e.a();
    }
    localDrawable.setColorFilter(e.d(paramInt, paramDrawable));
  }
}

/* Location:
 * Qualified Name:     l.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */