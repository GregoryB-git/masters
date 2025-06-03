package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.View;
import e0.d0;
import e0.d0.d;
import java.util.WeakHashMap;

public final class d
{
  public final View a;
  public final j b;
  public int c = -1;
  public x0 d;
  public x0 e;
  public x0 f;
  
  public d(View paramView)
  {
    a = paramView;
    b = j.a();
  }
  
  public final void a()
  {
    Drawable localDrawable = a.getBackground();
    if (localDrawable != null)
    {
      x0 localx0 = d;
      int i = 1;
      int j;
      if (localx0 != null) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0)
      {
        if (f == null) {
          f = new x0();
        }
        localx0 = f;
        a = null;
        d = false;
        b = null;
        c = false;
        Object localObject = a;
        WeakHashMap localWeakHashMap = d0.a;
        localObject = d0.d.g((View)localObject);
        if (localObject != null)
        {
          d = true;
          a = ((ColorStateList)localObject);
        }
        localObject = d0.d.h(a);
        if (localObject != null)
        {
          c = true;
          b = ((PorterDuff.Mode)localObject);
        }
        if ((!d) && (!c))
        {
          j = 0;
        }
        else
        {
          j.d(localDrawable, localx0, a.getDrawableState());
          j = i;
        }
        if (j != 0) {
          return;
        }
      }
      localx0 = e;
      if (localx0 != null)
      {
        j.d(localDrawable, localx0, a.getDrawableState());
      }
      else
      {
        localx0 = d;
        if (localx0 != null) {
          j.d(localDrawable, localx0, a.getDrawableState());
        }
      }
    }
  }
  
  public final ColorStateList b()
  {
    Object localObject = e;
    if (localObject != null) {
      localObject = a;
    } else {
      localObject = null;
    }
    return (ColorStateList)localObject;
  }
  
  public final PorterDuff.Mode c()
  {
    Object localObject = e;
    if (localObject != null) {
      localObject = b;
    } else {
      localObject = null;
    }
    return (PorterDuff.Mode)localObject;
  }
  
  /* Error */
  public final void d(android.util.AttributeSet paramAttributeSet, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 23	l/d:a	Landroid/view/View;
    //   4: invokevirtual 86	android/view/View:getContext	()Landroid/content/Context;
    //   7: astore_3
    //   8: getstatic 92	b/a0:M	[I
    //   11: astore 4
    //   13: aload_3
    //   14: aload_1
    //   15: aload 4
    //   17: iload_2
    //   18: invokestatic 98	l/z0:m	(Landroid/content/Context;Landroid/util/AttributeSet;[II)Ll/z0;
    //   21: astore_3
    //   22: aload_0
    //   23: getfield 23	l/d:a	Landroid/view/View;
    //   26: astore 5
    //   28: aload 5
    //   30: aload 5
    //   32: invokevirtual 86	android/view/View:getContext	()Landroid/content/Context;
    //   35: aload 4
    //   37: aload_1
    //   38: aload_3
    //   39: getfield 101	l/z0:b	Landroid/content/res/TypedArray;
    //   42: iload_2
    //   43: invokestatic 104	e0/d0:g	(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V
    //   46: aload_3
    //   47: iconst_0
    //   48: invokevirtual 108	l/z0:l	(I)Z
    //   51: ifeq +69 -> 120
    //   54: aload_0
    //   55: aload_3
    //   56: iconst_0
    //   57: iconst_m1
    //   58: invokevirtual 112	l/z0:i	(II)I
    //   61: putfield 21	l/d:c	I
    //   64: aload_0
    //   65: getfield 30	l/d:b	Ll/j;
    //   68: astore_1
    //   69: aload_0
    //   70: getfield 23	l/d:a	Landroid/view/View;
    //   73: invokevirtual 86	android/view/View:getContext	()Landroid/content/Context;
    //   76: astore 4
    //   78: aload_0
    //   79: getfield 21	l/d:c	I
    //   82: istore_2
    //   83: aload_1
    //   84: monitorenter
    //   85: aload_1
    //   86: getfield 115	l/j:a	Ll/q0;
    //   89: aload 4
    //   91: iload_2
    //   92: invokevirtual 120	l/q0:i	(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    //   95: astore 4
    //   97: aload_1
    //   98: monitorexit
    //   99: aload 4
    //   101: ifnull +19 -> 120
    //   104: aload_0
    //   105: aload 4
    //   107: invokevirtual 123	l/d:g	(Landroid/content/res/ColorStateList;)V
    //   110: goto +10 -> 120
    //   113: astore 4
    //   115: aload_1
    //   116: monitorexit
    //   117: aload 4
    //   119: athrow
    //   120: aload_3
    //   121: iconst_1
    //   122: invokevirtual 108	l/z0:l	(I)Z
    //   125: ifeq +15 -> 140
    //   128: aload_0
    //   129: getfield 23	l/d:a	Landroid/view/View;
    //   132: aload_3
    //   133: iconst_1
    //   134: invokevirtual 126	l/z0:b	(I)Landroid/content/res/ColorStateList;
    //   137: invokestatic 130	e0/d0$d:q	(Landroid/view/View;Landroid/content/res/ColorStateList;)V
    //   140: aload_3
    //   141: iconst_2
    //   142: invokevirtual 108	l/z0:l	(I)Z
    //   145: ifeq +20 -> 165
    //   148: aload_0
    //   149: getfield 23	l/d:a	Landroid/view/View;
    //   152: aload_3
    //   153: iconst_2
    //   154: iconst_m1
    //   155: invokevirtual 132	l/z0:h	(II)I
    //   158: aconst_null
    //   159: invokestatic 137	l/i0:b	(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
    //   162: invokestatic 141	e0/d0$d:r	(Landroid/view/View;Landroid/graphics/PorterDuff$Mode;)V
    //   165: aload_3
    //   166: invokevirtual 144	l/z0:n	()V
    //   169: return
    //   170: astore_1
    //   171: aload_3
    //   172: invokevirtual 144	l/z0:n	()V
    //   175: aload_1
    //   176: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	177	0	this	d
    //   0	177	1	paramAttributeSet	android.util.AttributeSet
    //   0	177	2	paramInt	int
    //   7	165	3	localObject1	Object
    //   11	95	4	localObject2	Object
    //   113	5	4	localObject3	Object
    //   26	5	5	localView	View
    // Exception table:
    //   from	to	target	type
    //   85	97	113	finally
    //   46	85	170	finally
    //   97	99	170	finally
    //   104	110	170	finally
    //   115	120	170	finally
    //   120	140	170	finally
    //   140	165	170	finally
  }
  
  public final void e()
  {
    c = -1;
    g(null);
    a();
  }
  
  public final void f(int paramInt)
  {
    c = paramInt;
    j localj = b;
    ColorStateList localColorStateList;
    if (localj != null)
    {
      Object localObject1 = a.getContext();
      try
      {
        localObject1 = a.i((Context)localObject1, paramInt);
        break label46;
      }
      finally
      {
        localObject2 = finally;
        throw ((Throwable)localObject2);
      }
    }
    else
    {
      localColorStateList = null;
    }
    label46:
    g(localColorStateList);
    a();
  }
  
  public final void g(ColorStateList paramColorStateList)
  {
    if (paramColorStateList != null)
    {
      if (d == null) {
        d = new x0();
      }
      x0 localx0 = d;
      a = paramColorStateList;
      d = true;
    }
    else
    {
      d = null;
    }
    a();
  }
  
  public final void h(ColorStateList paramColorStateList)
  {
    if (e == null) {
      e = new x0();
    }
    x0 localx0 = e;
    a = paramColorStateList;
    d = true;
    a();
  }
  
  public final void i(PorterDuff.Mode paramMode)
  {
    if (e == null) {
      e = new x0();
    }
    x0 localx0 = e;
    b = paramMode;
    c = true;
    a();
  }
}

/* Location:
 * Qualified Name:     l.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */