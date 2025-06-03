package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import g.a;
import z.h;
import z.h.b;

public class X
{
  public final Context a;
  public final TypedArray b;
  public TypedValue c;
  
  public X(Context paramContext, TypedArray paramTypedArray)
  {
    a = paramContext;
    b = paramTypedArray;
  }
  
  public static X q(Context paramContext, int paramInt, int[] paramArrayOfInt)
  {
    return new X(paramContext, paramContext.obtainStyledAttributes(paramInt, paramArrayOfInt));
  }
  
  public static X r(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    return new X(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt));
  }
  
  public static X s(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    return new X(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, paramInt1, paramInt2));
  }
  
  public boolean a(int paramInt, boolean paramBoolean)
  {
    return b.getBoolean(paramInt, paramBoolean);
  }
  
  public int b(int paramInt1, int paramInt2)
  {
    return b.getColor(paramInt1, paramInt2);
  }
  
  public ColorStateList c(int paramInt)
  {
    if (b.hasValue(paramInt))
    {
      int i = b.getResourceId(paramInt, 0);
      if (i != 0)
      {
        ColorStateList localColorStateList = a.a(a, i);
        if (localColorStateList != null) {
          return localColorStateList;
        }
      }
    }
    return b.getColorStateList(paramInt);
  }
  
  public int d(int paramInt1, int paramInt2)
  {
    return b.getDimensionPixelOffset(paramInt1, paramInt2);
  }
  
  public int e(int paramInt1, int paramInt2)
  {
    return b.getDimensionPixelSize(paramInt1, paramInt2);
  }
  
  public Drawable f(int paramInt)
  {
    if (b.hasValue(paramInt))
    {
      int i = b.getResourceId(paramInt, 0);
      if (i != 0) {
        return a.b(a, i);
      }
    }
    return b.getDrawable(paramInt);
  }
  
  public float g(int paramInt, float paramFloat)
  {
    return b.getFloat(paramInt, paramFloat);
  }
  
  public Typeface h(int paramInt1, int paramInt2, h.b paramb)
  {
    paramInt1 = b.getResourceId(paramInt1, 0);
    if (paramInt1 == 0) {
      return null;
    }
    if (c == null) {
      c = new TypedValue();
    }
    return h.b(a, paramInt1, c, paramInt2, paramb);
  }
  
  public int i(int paramInt1, int paramInt2)
  {
    return b.getInt(paramInt1, paramInt2);
  }
  
  public int j(int paramInt1, int paramInt2)
  {
    return b.getInteger(paramInt1, paramInt2);
  }
  
  public int k(int paramInt1, int paramInt2)
  {
    return b.getLayoutDimension(paramInt1, paramInt2);
  }
  
  public int l(int paramInt1, int paramInt2)
  {
    return b.getResourceId(paramInt1, paramInt2);
  }
  
  public String m(int paramInt)
  {
    return b.getString(paramInt);
  }
  
  public CharSequence n(int paramInt)
  {
    return b.getText(paramInt);
  }
  
  public TypedArray o()
  {
    return b;
  }
  
  public boolean p(int paramInt)
  {
    return b.hasValue(paramInt);
  }
  
  public void t()
  {
    b.recycle();
  }
}

/* Location:
 * Qualified Name:     l.X
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */