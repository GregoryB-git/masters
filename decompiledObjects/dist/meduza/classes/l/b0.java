package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import b.a0;
import d2.e;
import e0.d0;
import e0.g0;
import j0.h;
import j0.h.a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import w.f.e;

public final class b0
{
  public final TextView a;
  public x0 b;
  public x0 c;
  public x0 d;
  public x0 e;
  public x0 f;
  public x0 g;
  public x0 h;
  public final e0 i;
  public int j = 0;
  public int k = -1;
  public Typeface l;
  public boolean m;
  
  public b0(TextView paramTextView)
  {
    a = paramTextView;
    i = new e0(paramTextView);
  }
  
  public static x0 c(Context paramContext, j paramj, int paramInt)
  {
    try
    {
      paramContext = a.i(paramContext, paramInt);
      if (paramContext != null)
      {
        paramj = new x0();
        d = true;
        a = paramContext;
        return paramj;
      }
      return null;
    }
    finally {}
  }
  
  public static void h(TextView paramTextView, InputConnection paramInputConnection, EditorInfo paramEditorInfo)
  {
    int n = Build.VERSION.SDK_INT;
    if ((n < 30) && (paramInputConnection != null))
    {
      paramTextView = paramTextView.getText();
      if (n >= 30)
      {
        g0.h(paramEditorInfo, paramTextView);
      }
      else
      {
        paramTextView.getClass();
        if (n >= 30)
        {
          g0.h(paramEditorInfo, paramTextView);
        }
        else
        {
          int i1 = initialSelStart;
          n = initialSelEnd;
          int i2;
          if (i1 > n) {
            i2 = n + 0;
          } else {
            i2 = i1 + 0;
          }
          if (i1 > n) {
            n = i1 - 0;
          } else {
            n += 0;
          }
          int i3 = paramTextView.length();
          if ((i2 >= 0) && (n <= i3))
          {
            i1 = inputType & 0xFFF;
            if ((i1 != 129) && (i1 != 225) && (i1 != 18)) {
              i1 = 0;
            } else {
              i1 = 1;
            }
            if (i1 == 0)
            {
              if (i3 <= 2048)
              {
                i0.a.c(paramEditorInfo, paramTextView, i2, n);
                return;
              }
              int i4 = n - i2;
              if (i4 > 1024) {
                i1 = 0;
              } else {
                i1 = i4;
              }
              int i5 = paramTextView.length();
              i3 = 2048 - i1;
              int i6 = Math.min(i5 - n, i3 - Math.min(i2, (int)(i3 * 0.8D)));
              i5 = Math.min(i2, i3 - i6);
              int i7 = i2 - i5;
              i3 = i7;
              i2 = i5;
              if (Character.isLowSurrogate(paramTextView.charAt(i7)))
              {
                i3 = i7 + 1;
                i2 = i5 - 1;
              }
              i5 = i6;
              if (Character.isHighSurrogate(paramTextView.charAt(n + i6 - 1))) {
                i5 = i6 - 1;
              }
              if (i1 != i4) {
                paramTextView = TextUtils.concat(new CharSequence[] { paramTextView.subSequence(i3, i3 + i2), paramTextView.subSequence(n, i5 + n) });
              } else {
                paramTextView = paramTextView.subSequence(i3, i2 + i1 + i5 + i3);
              }
              n = i2 + 0;
              i0.a.c(paramEditorInfo, paramTextView, n, i1 + n);
              return;
            }
          }
          i0.a.c(paramEditorInfo, null, 0, 0);
        }
      }
    }
  }
  
  public final void a(Drawable paramDrawable, x0 paramx0)
  {
    if ((paramDrawable != null) && (paramx0 != null)) {
      j.d(paramDrawable, paramx0, a.getDrawableState());
    }
  }
  
  public final void b()
  {
    Drawable[] arrayOfDrawable;
    if ((b != null) || (c != null) || (d != null) || (e != null))
    {
      arrayOfDrawable = a.getCompoundDrawables();
      a(arrayOfDrawable[0], b);
      a(arrayOfDrawable[1], c);
      a(arrayOfDrawable[2], d);
      a(arrayOfDrawable[3], e);
    }
    if ((f != null) || (g != null))
    {
      arrayOfDrawable = b.a(a);
      a(arrayOfDrawable[0], f);
      a(arrayOfDrawable[2], g);
    }
  }
  
  public final ColorStateList d()
  {
    Object localObject = h;
    if (localObject != null) {
      localObject = a;
    } else {
      localObject = null;
    }
    return (ColorStateList)localObject;
  }
  
  public final PorterDuff.Mode e()
  {
    Object localObject = h;
    if (localObject != null) {
      localObject = b;
    } else {
      localObject = null;
    }
    return (PorterDuff.Mode)localObject;
  }
  
  public final void f(AttributeSet paramAttributeSet, int paramInt)
  {
    Object localObject1 = a.getContext();
    j localj = j.a();
    Object localObject2 = a0.u;
    Object localObject3 = z0.m((Context)localObject1, paramAttributeSet, (int[])localObject2, paramInt);
    Object localObject4 = a;
    d0.g((View)localObject4, ((View)localObject4).getContext(), (int[])localObject2, paramAttributeSet, b, paramInt);
    int n = ((z0)localObject3).i(0, -1);
    if (((z0)localObject3).l(3)) {
      b = c((Context)localObject1, localj, ((z0)localObject3).i(3, 0));
    }
    if (((z0)localObject3).l(1)) {
      c = c((Context)localObject1, localj, ((z0)localObject3).i(1, 0));
    }
    if (((z0)localObject3).l(4)) {
      d = c((Context)localObject1, localj, ((z0)localObject3).i(4, 0));
    }
    if (((z0)localObject3).l(2)) {
      e = c((Context)localObject1, localj, ((z0)localObject3).i(2, 0));
    }
    int i1 = Build.VERSION.SDK_INT;
    if (((z0)localObject3).l(5)) {
      f = c((Context)localObject1, localj, ((z0)localObject3).i(5, 0));
    }
    if (((z0)localObject3).l(6)) {
      g = c((Context)localObject1, localj, ((z0)localObject3).i(6, 0));
    }
    ((z0)localObject3).n();
    boolean bool1 = a.getTransformationMethod() instanceof PasswordTransformationMethod;
    boolean bool2;
    int i2;
    if (n != -1)
    {
      localObject3 = new z0((Context)localObject1, ((Context)localObject1).obtainStyledAttributes(n, a0.J));
      if ((!bool1) && (((z0)localObject3).l(14)))
      {
        bool2 = ((z0)localObject3).a(14, false);
        i2 = 1;
      }
      else
      {
        bool2 = false;
        i2 = bool2;
      }
      n((Context)localObject1, (z0)localObject3);
      if (((z0)localObject3).l(15)) {
        localObject4 = ((z0)localObject3).j(15);
      } else {
        localObject4 = null;
      }
      if ((i1 >= 26) && (((z0)localObject3).l(13))) {
        localObject2 = ((z0)localObject3).j(13);
      } else {
        localObject2 = null;
      }
      ((z0)localObject3).n();
      localObject3 = localObject4;
      localObject4 = localObject2;
    }
    else
    {
      bool2 = false;
      i2 = bool2;
      localObject3 = null;
      localObject4 = null;
    }
    Object localObject5 = new z0((Context)localObject1, ((Context)localObject1).obtainStyledAttributes(paramAttributeSet, a0.J, paramInt, 0));
    boolean bool3 = bool2;
    int i3 = i2;
    if (!bool1)
    {
      bool3 = bool2;
      i3 = i2;
      if (((z0)localObject5).l(14))
      {
        bool3 = ((z0)localObject5).a(14, false);
        i3 = 1;
      }
    }
    if (((z0)localObject5).l(15)) {
      localObject3 = ((z0)localObject5).j(15);
    }
    localObject2 = localObject4;
    if (i1 >= 26)
    {
      localObject2 = localObject4;
      if (((z0)localObject5).l(13)) {
        localObject2 = ((z0)localObject5).j(13);
      }
    }
    if ((i1 >= 28) && (((z0)localObject5).l(0)) && (((z0)localObject5).d(0, -1) == 0)) {
      a.setTextSize(0, 0.0F);
    }
    n((Context)localObject1, (z0)localObject5);
    ((z0)localObject5).n();
    if ((!bool1) && (i3 != 0)) {
      a.setAllCaps(bool3);
    }
    localObject4 = l;
    if (localObject4 != null) {
      if (k == -1) {
        a.setTypeface((Typeface)localObject4, j);
      } else {
        a.setTypeface((Typeface)localObject4);
      }
    }
    if (localObject2 != null) {
      e.d(a, (String)localObject2);
    }
    if (localObject3 != null) {
      if (i1 >= 24)
      {
        d.b(a, d.a((String)localObject3));
      }
      else
      {
        localObject4 = localObject3.split(",")[0];
        b.c(a, c.a((String)localObject4));
      }
    }
    localObject4 = i;
    localObject3 = j;
    localObject2 = a0.v;
    localObject3 = ((Context)localObject3).obtainStyledAttributes(paramAttributeSet, (int[])localObject2, paramInt, 0);
    localObject5 = i;
    d0.g((View)localObject5, ((View)localObject5).getContext(), (int[])localObject2, paramAttributeSet, (TypedArray)localObject3, paramInt);
    if (((TypedArray)localObject3).hasValue(5)) {
      a = ((TypedArray)localObject3).getInt(5, 0);
    }
    float f1;
    if (((TypedArray)localObject3).hasValue(4)) {
      f1 = ((TypedArray)localObject3).getDimension(4, -1.0F);
    } else {
      f1 = -1.0F;
    }
    float f2;
    if (((TypedArray)localObject3).hasValue(2)) {
      f2 = ((TypedArray)localObject3).getDimension(2, -1.0F);
    } else {
      f2 = -1.0F;
    }
    float f3;
    if (((TypedArray)localObject3).hasValue(1)) {
      f3 = ((TypedArray)localObject3).getDimension(1, -1.0F);
    } else {
      f3 = -1.0F;
    }
    if (((TypedArray)localObject3).hasValue(3))
    {
      paramInt = ((TypedArray)localObject3).getResourceId(3, 0);
      if (paramInt > 0)
      {
        localObject2 = ((TypedArray)localObject3).getResources().obtainTypedArray(paramInt);
        n = ((TypedArray)localObject2).length();
        localObject5 = new int[n];
        if (n > 0)
        {
          for (paramInt = 0; paramInt < n; paramInt++) {
            localObject5[paramInt] = ((TypedArray)localObject2).getDimensionPixelSize(paramInt, -1);
          }
          f = e0.b((int[])localObject5);
          ((e0)localObject4).h();
        }
        ((TypedArray)localObject2).recycle();
      }
    }
    ((TypedArray)localObject3).recycle();
    if (((e0)localObject4).i())
    {
      if (a == 1)
      {
        if (!g)
        {
          localObject3 = j.getResources().getDisplayMetrics();
          if (f2 == -1.0F) {
            f2 = TypedValue.applyDimension(2, 12.0F, (DisplayMetrics)localObject3);
          }
          float f4 = f3;
          if (f3 == -1.0F) {
            f4 = TypedValue.applyDimension(2, 112.0F, (DisplayMetrics)localObject3);
          }
          f3 = f1;
          if (f1 == -1.0F) {
            f3 = 1.0F;
          }
          ((e0)localObject4).j(f2, f4, f3);
        }
        ((e0)localObject4).g();
      }
    }
    else {
      a = 0;
    }
    if (f1.b)
    {
      localObject4 = i;
      if (a != 0)
      {
        localObject4 = f;
        if (localObject4.length > 0) {
          if (e.a(a) != -1.0F) {
            e.b(a, Math.round(i.d), Math.round(i.e), Math.round(i.c), 0);
          } else {
            e.c(a, (int[])localObject4, 0);
          }
        }
      }
    }
    z0 localz0 = new z0((Context)localObject1, ((Context)localObject1).obtainStyledAttributes(paramAttributeSet, a0.v));
    paramInt = localz0.i(8, -1);
    if (paramInt != -1) {
      localObject3 = localj.b((Context)localObject1, paramInt);
    } else {
      localObject3 = null;
    }
    paramInt = localz0.i(13, -1);
    if (paramInt != -1) {
      localObject4 = localj.b((Context)localObject1, paramInt);
    } else {
      localObject4 = null;
    }
    paramInt = localz0.i(9, -1);
    if (paramInt != -1) {
      localObject2 = localj.b((Context)localObject1, paramInt);
    } else {
      localObject2 = null;
    }
    paramInt = localz0.i(6, -1);
    if (paramInt != -1) {
      paramAttributeSet = localj.b((Context)localObject1, paramInt);
    } else {
      paramAttributeSet = null;
    }
    paramInt = localz0.i(10, -1);
    if (paramInt != -1) {
      localObject5 = localj.b((Context)localObject1, paramInt);
    } else {
      localObject5 = null;
    }
    paramInt = localz0.i(7, -1);
    if (paramInt != -1) {
      localObject1 = localj.b((Context)localObject1, paramInt);
    } else {
      localObject1 = null;
    }
    if ((localObject5 == null) && (localObject1 == null))
    {
      if ((localObject3 != null) || (localObject4 != null) || (localObject2 != null) || (paramAttributeSet != null))
      {
        localObject5 = b.a(a);
        localObject1 = localObject5[0];
        if ((localObject1 == null) && (localObject5[2] == null))
        {
          localObject5 = a.getCompoundDrawables();
          localObject1 = a;
          if (localObject3 == null) {
            localObject3 = localObject5[0];
          }
          if (localObject4 == null) {
            localObject4 = localObject5[1];
          }
          if (localObject2 == null) {
            localObject2 = localObject5[2];
          }
          if (paramAttributeSet == null) {
            paramAttributeSet = localObject5[3];
          }
          ((TextView)localObject1).setCompoundDrawablesWithIntrinsicBounds((Drawable)localObject3, (Drawable)localObject4, (Drawable)localObject2, paramAttributeSet);
        }
        else
        {
          localObject3 = a;
          if (localObject4 == null) {
            localObject4 = localObject5[1];
          }
          localObject2 = localObject5[2];
          if (paramAttributeSet == null) {
            paramAttributeSet = localObject5[3];
          }
          b.b((TextView)localObject3, (Drawable)localObject1, (Drawable)localObject4, (Drawable)localObject2, paramAttributeSet);
        }
      }
    }
    else
    {
      localObject2 = b.a(a);
      localObject3 = a;
      if (localObject5 == null) {
        localObject5 = localObject2[0];
      }
      if (localObject4 == null) {
        localObject4 = localObject2[1];
      }
      if (localObject1 == null) {
        localObject1 = localObject2[2];
      }
      if (paramAttributeSet == null) {
        paramAttributeSet = localObject2[3];
      }
      b.b((TextView)localObject3, (Drawable)localObject5, (Drawable)localObject4, (Drawable)localObject1, paramAttributeSet);
    }
    if (localz0.l(11))
    {
      paramAttributeSet = localz0.b(11);
      localObject4 = a;
      localObject4.getClass();
      if (Build.VERSION.SDK_INT >= 24) {
        h.a.f((TextView)localObject4, paramAttributeSet);
      } else if ((localObject4 instanceof j0.j)) {
        ((j0.j)localObject4).setSupportCompoundDrawablesTintList(paramAttributeSet);
      }
    }
    if (localz0.l(12))
    {
      paramAttributeSet = i0.b(localz0.h(12, -1), null);
      localObject4 = a;
      localObject4.getClass();
      if (Build.VERSION.SDK_INT >= 24) {
        h.a.g((TextView)localObject4, paramAttributeSet);
      } else if ((localObject4 instanceof j0.j)) {
        ((j0.j)localObject4).setSupportCompoundDrawablesTintMode(paramAttributeSet);
      }
    }
    i1 = localz0.d(15, -1);
    n = localz0.d(18, -1);
    paramInt = localz0.d(19, -1);
    localz0.n();
    if (i1 != -1) {
      h.b(a, i1);
    }
    if (n != -1) {
      h.c(a, n);
    }
    if (paramInt != -1)
    {
      paramAttributeSet = a;
      if (paramInt >= 0)
      {
        n = paramAttributeSet.getPaint().getFontMetricsInt(null);
        if (paramInt != n) {
          paramAttributeSet.setLineSpacing(paramInt - n, 1.0F);
        }
      }
      else
      {
        throw new IllegalArgumentException();
      }
    }
  }
  
  public final void g(Context paramContext, int paramInt)
  {
    z0 localz0 = new z0(paramContext, paramContext.obtainStyledAttributes(paramInt, a0.J));
    if (localz0.l(14))
    {
      boolean bool = localz0.a(14, false);
      a.setAllCaps(bool);
    }
    paramInt = Build.VERSION.SDK_INT;
    if ((localz0.l(0)) && (localz0.d(0, -1) == 0)) {
      a.setTextSize(0, 0.0F);
    }
    n(paramContext, localz0);
    if ((paramInt >= 26) && (localz0.l(13)))
    {
      paramContext = localz0.j(13);
      if (paramContext != null) {
        e.d(a, paramContext);
      }
    }
    localz0.n();
    paramContext = l;
    if (paramContext != null) {
      a.setTypeface(paramContext, j);
    }
  }
  
  public final void i(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    e0 locale0 = i;
    if (locale0.i())
    {
      DisplayMetrics localDisplayMetrics = j.getResources().getDisplayMetrics();
      locale0.j(TypedValue.applyDimension(paramInt4, paramInt1, localDisplayMetrics), TypedValue.applyDimension(paramInt4, paramInt2, localDisplayMetrics), TypedValue.applyDimension(paramInt4, paramInt3, localDisplayMetrics));
      if (locale0.g()) {
        locale0.a();
      }
    }
  }
  
  public final void j(int[] paramArrayOfInt, int paramInt)
  {
    e0 locale0 = i;
    if (locale0.i())
    {
      int n = paramArrayOfInt.length;
      int i1 = 0;
      if (n > 0)
      {
        int[] arrayOfInt = new int[n];
        Object localObject;
        if (paramInt == 0)
        {
          localObject = Arrays.copyOf(paramArrayOfInt, n);
        }
        else
        {
          DisplayMetrics localDisplayMetrics = j.getResources().getDisplayMetrics();
          for (;;)
          {
            localObject = arrayOfInt;
            if (i1 >= n) {
              break;
            }
            arrayOfInt[i1] = Math.round(TypedValue.applyDimension(paramInt, paramArrayOfInt[i1], localDisplayMetrics));
            i1++;
          }
        }
        f = e0.b((int[])localObject);
        if (!locale0.h())
        {
          localObject = f.l("None of the preset sizes is valid: ");
          ((StringBuilder)localObject).append(Arrays.toString(paramArrayOfInt));
          throw new IllegalArgumentException(((StringBuilder)localObject).toString());
        }
      }
      else
      {
        g = false;
      }
      if (locale0.g()) {
        locale0.a();
      }
    }
  }
  
  public final void k(int paramInt)
  {
    e0 locale0 = i;
    if (locale0.i()) {
      if (paramInt != 0)
      {
        if (paramInt == 1)
        {
          DisplayMetrics localDisplayMetrics = j.getResources().getDisplayMetrics();
          locale0.j(TypedValue.applyDimension(2, 12.0F, localDisplayMetrics), TypedValue.applyDimension(2, 112.0F, localDisplayMetrics), 1.0F);
          if (locale0.g()) {
            locale0.a();
          }
        }
        else
        {
          throw new IllegalArgumentException(f.h("Unknown auto-size text type: ", paramInt));
        }
      }
      else
      {
        a = 0;
        d = -1.0F;
        e = -1.0F;
        c = -1.0F;
        f = new int[0];
        b = false;
      }
    }
  }
  
  public final void l(ColorStateList paramColorStateList)
  {
    if (h == null) {
      h = new x0();
    }
    x0 localx0 = h;
    a = paramColorStateList;
    boolean bool;
    if (paramColorStateList != null) {
      bool = true;
    } else {
      bool = false;
    }
    d = bool;
    b = localx0;
    c = localx0;
    d = localx0;
    e = localx0;
    f = localx0;
    g = localx0;
  }
  
  public final void m(PorterDuff.Mode paramMode)
  {
    if (h == null) {
      h = new x0();
    }
    x0 localx0 = h;
    b = paramMode;
    boolean bool;
    if (paramMode != null) {
      bool = true;
    } else {
      bool = false;
    }
    c = bool;
    b = localx0;
    c = localx0;
    d = localx0;
    e = localx0;
    f = localx0;
    g = localx0;
  }
  
  public final void n(Context paramContext, z0 paramz0)
  {
    j = paramz0.h(2, j);
    int n = Build.VERSION.SDK_INT;
    boolean bool1 = false;
    if (n >= 28)
    {
      i1 = paramz0.h(11, -1);
      k = i1;
      if (i1 != -1) {
        j = (j & 0x2 | 0x0);
      }
    }
    int i1 = 10;
    if ((!paramz0.l(10)) && (!paramz0.l(12)))
    {
      if (paramz0.l(1))
      {
        m = false;
        i1 = paramz0.h(1, 1);
        if (i1 != 1)
        {
          if (i1 != 2)
          {
            if (i1 != 3) {
              break label149;
            }
            paramContext = Typeface.MONOSPACE;
          }
          else
          {
            paramContext = Typeface.SERIF;
          }
        }
        else {
          paramContext = Typeface.SANS_SERIF;
        }
        l = paramContext;
      }
      label149:
      return;
    }
    l = null;
    if (paramz0.l(12)) {
      i1 = 12;
    }
    final int i2 = k;
    final int i3 = j;
    if (!paramContext.isRestricted()) {
      paramContext = new a(i2, i3, new WeakReference(a));
    }
    try
    {
      Typeface localTypeface = paramz0.g(i1, j, paramContext);
      if (localTypeface != null)
      {
        paramContext = localTypeface;
        if (n >= 28)
        {
          paramContext = localTypeface;
          if (k != -1)
          {
            paramContext = Typeface.create(localTypeface, 0);
            n = k;
            if ((j & 0x2) != 0) {
              bool2 = true;
            } else {
              bool2 = false;
            }
            paramContext = f.a(paramContext, n, bool2);
          }
        }
        l = paramContext;
      }
      if (l == null) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      m = bool2;
    }
    catch (UnsupportedOperationException|Resources.NotFoundException paramContext)
    {
      boolean bool2;
      for (;;) {}
    }
    if (l == null)
    {
      paramContext = paramz0.j(i1);
      if (paramContext != null)
      {
        if ((Build.VERSION.SDK_INT >= 28) && (k != -1))
        {
          paramContext = Typeface.create(paramContext, 0);
          i1 = k;
          bool2 = bool1;
          if ((j & 0x2) != 0) {
            bool2 = true;
          }
          paramContext = f.a(paramContext, i1, bool2);
        }
        else
        {
          paramContext = Typeface.create(paramContext, j);
        }
        l = paramContext;
      }
    }
  }
  
  public final class a
    extends f.e
  {
    public a(int paramInt1, int paramInt2, WeakReference paramWeakReference) {}
    
    public final void c(Typeface paramTypeface)
    {
      Typeface localTypeface = paramTypeface;
      if (Build.VERSION.SDK_INT >= 28)
      {
        int i = i2;
        localTypeface = paramTypeface;
        if (i != -1)
        {
          boolean bool;
          if ((i3 & 0x2) != 0) {
            bool = true;
          } else {
            bool = false;
          }
          localTypeface = b0.f.a(paramTypeface, i, bool);
        }
      }
      paramTypeface = b0.this;
      Object localObject = c;
      if (m)
      {
        l = localTypeface;
        TextView localTextView = (TextView)((Reference)localObject).get();
        if (localTextView != null)
        {
          localObject = d0.a;
          if (localTextView.isAttachedToWindow()) {
            localTextView.post(new c0(localTextView, localTypeface, j));
          } else {
            localTextView.setTypeface(localTypeface, j);
          }
        }
      }
    }
  }
  
  public static final class b
  {
    public static Drawable[] a(TextView paramTextView)
    {
      return paramTextView.getCompoundDrawablesRelative();
    }
    
    public static void b(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
    {
      paramTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    }
    
    public static void c(TextView paramTextView, Locale paramLocale)
    {
      paramTextView.setTextLocale(paramLocale);
    }
  }
  
  public static final class c
  {
    public static Locale a(String paramString)
    {
      return Locale.forLanguageTag(paramString);
    }
  }
  
  public static final class d
  {
    public static LocaleList a(String paramString)
    {
      return LocaleList.forLanguageTags(paramString);
    }
    
    public static void b(TextView paramTextView, LocaleList paramLocaleList)
    {
      b0.f.o(paramTextView, paramLocaleList);
    }
  }
  
  public static final class e
  {
    public static int a(TextView paramTextView)
    {
      return e.b(paramTextView);
    }
    
    public static void b(TextView paramTextView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      c0.b.y(paramTextView, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    
    public static void c(TextView paramTextView, int[] paramArrayOfInt, int paramInt)
    {
      com.google.android.gms.internal.base.a.u(paramTextView, paramArrayOfInt, paramInt);
    }
    
    public static boolean d(TextView paramTextView, String paramString)
    {
      return com.google.android.gms.internal.base.a.y(paramTextView, paramString);
    }
  }
  
  public static final class f
  {
    public static Typeface a(Typeface paramTypeface, int paramInt, boolean paramBoolean)
    {
      return android.support.v4.media.session.b.c(paramTypeface, paramInt, paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     l.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */