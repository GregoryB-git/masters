package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;

public final class j$a
  implements q0.f
{
  public final int[] a = { 2131230796, 2131230794, 2131230720 };
  public final int[] b = { 2131230744, 2131230779, 2131230751, 2131230746, 2131230747, 2131230750, 2131230749 };
  public final int[] c = { 2131230793, 2131230795, 2131230737, 2131230789, 2131230790, 2131230791, 2131230792 };
  public final int[] d = { 2131230769, 2131230735, 2131230768 };
  public final int[] e = { 2131230787, 2131230797 };
  public final int[] f = { 2131230723, 2131230729, 2131230724, 2131230730 };
  
  public static boolean a(int[] paramArrayOfInt, int paramInt)
  {
    int i = paramArrayOfInt.length;
    for (int j = 0; j < i; j++) {
      if (paramArrayOfInt[j] == paramInt) {
        return true;
      }
    }
    return false;
  }
  
  public static ColorStateList b(Context paramContext, int paramInt)
  {
    int i = u0.c(paramContext, 2130968675);
    int j = u0.b(paramContext, 2130968673);
    int[] arrayOfInt1 = u0.b;
    int[] arrayOfInt2 = u0.d;
    int k = x.a.b(i, paramInt);
    paramContext = u0.c;
    i = x.a.b(i, paramInt);
    return new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2, paramContext, u0.f }, new int[] { j, k, i, paramInt });
  }
  
  public static void d(Drawable paramDrawable, int paramInt, PorterDuff.Mode paramMode)
  {
    Object localObject = i0.a;
    localObject = paramDrawable.mutate();
    paramDrawable = paramMode;
    if (paramMode == null) {
      paramDrawable = j.b;
    }
    paramMode = j.b;
    try
    {
      paramDrawable = q0.h(paramInt, paramDrawable);
      ((Drawable)localObject).setColorFilter(paramDrawable);
      return;
    }
    finally {}
  }
  
  public final ColorStateList c(Context paramContext, int paramInt)
  {
    if (paramInt == 2131230740) {
      return v.a.getColorStateList(paramContext, 2131099669);
    }
    if (paramInt == 2131230786) {
      return v.a.getColorStateList(paramContext, 2131099672);
    }
    if (paramInt == 2131230785)
    {
      int[][] arrayOfInt = new int[3][];
      int[] arrayOfInt1 = new int[3];
      ColorStateList localColorStateList = u0.d(paramContext, 2130968681);
      if ((localColorStateList != null) && (localColorStateList.isStateful()))
      {
        int[] arrayOfInt2 = u0.b;
        arrayOfInt[0] = arrayOfInt2;
        arrayOfInt1[0] = localColorStateList.getColorForState(arrayOfInt2, 0);
        arrayOfInt[1] = u0.e;
        arrayOfInt1[1] = u0.c(paramContext, 2130968674);
        arrayOfInt[2] = u0.f;
        arrayOfInt1[2] = localColorStateList.getDefaultColor();
      }
      else
      {
        arrayOfInt[0] = u0.b;
        arrayOfInt1[0] = u0.b(paramContext, 2130968681);
        arrayOfInt[1] = u0.e;
        arrayOfInt1[1] = u0.c(paramContext, 2130968674);
        arrayOfInt[2] = u0.f;
        arrayOfInt1[2] = u0.c(paramContext, 2130968681);
      }
      return new ColorStateList(arrayOfInt, arrayOfInt1);
    }
    if (paramInt == 2131230728) {
      return b(paramContext, u0.c(paramContext, 2130968673));
    }
    if (paramInt == 2131230722) {
      return b(paramContext, 0);
    }
    if (paramInt == 2131230727) {
      return b(paramContext, u0.c(paramContext, 2130968671));
    }
    if ((paramInt != 2131230781) && (paramInt != 2131230782))
    {
      if (a(b, paramInt)) {
        return u0.d(paramContext, 2130968676);
      }
      if (a(e, paramInt)) {
        return v.a.getColorStateList(paramContext, 2131099668);
      }
      if (a(f, paramInt)) {
        return v.a.getColorStateList(paramContext, 2131099667);
      }
      if (paramInt == 2131230778) {
        return v.a.getColorStateList(paramContext, 2131099670);
      }
      return null;
    }
    return v.a.getColorStateList(paramContext, 2131099671);
  }
}

/* Location:
 * Qualified Name:     l.j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */