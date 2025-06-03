package l;

import I.s;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import e.i;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class x
{
  public static final RectF l = new RectF();
  public static ConcurrentHashMap m = new ConcurrentHashMap();
  public static ConcurrentHashMap n = new ConcurrentHashMap();
  public int a = 0;
  public boolean b = false;
  public float c = -1.0F;
  public float d = -1.0F;
  public float e = -1.0F;
  public int[] f = new int[0];
  public boolean g = false;
  public TextPaint h;
  public final TextView i;
  public final Context j;
  public final c k;
  
  public x(TextView paramTextView)
  {
    i = paramTextView;
    j = paramTextView.getContext();
    if (Build.VERSION.SDK_INT >= 29) {}
    for (paramTextView = new b();; paramTextView = new a())
    {
      k = paramTextView;
      break;
    }
  }
  
  public static Method l(String paramString)
  {
    try
    {
      Method localMethod = (Method)m.get(paramString);
      localObject = localMethod;
      if (localMethod == null)
      {
        localMethod = TextView.class.getDeclaredMethod(paramString, new Class[0]);
        localObject = localMethod;
        if (localMethod != null)
        {
          localMethod.setAccessible(true);
          m.put(paramString, localMethod);
          localObject = localMethod;
        }
      }
    }
    catch (Exception localException)
    {
      break label59;
    }
    return (Method)localObject;
    label59:
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Failed to retrieve TextView#");
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("() method");
    Log.w("ACTVAutoSizeHelper", ((StringBuilder)localObject).toString(), localException);
    return null;
  }
  
  /* Error */
  public static Object n(Object paramObject1, String paramString, Object paramObject2)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 140	l/x:l	(Ljava/lang/String;)Ljava/lang/reflect/Method;
    //   4: aload_0
    //   5: iconst_0
    //   6: anewarray 4	java/lang/Object
    //   9: invokevirtual 144	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   12: astore_0
    //   13: aload_0
    //   14: astore_2
    //   15: goto +52 -> 67
    //   18: astore_0
    //   19: goto +7 -> 26
    //   22: astore_0
    //   23: goto +5 -> 28
    //   26: aload_0
    //   27: athrow
    //   28: new 116	java/lang/StringBuilder
    //   31: dup
    //   32: invokespecial 117	java/lang/StringBuilder:<init>	()V
    //   35: astore_3
    //   36: aload_3
    //   37: ldc -110
    //   39: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: pop
    //   43: aload_3
    //   44: aload_1
    //   45: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: pop
    //   49: aload_3
    //   50: ldc 125
    //   52: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: pop
    //   56: ldc 127
    //   58: aload_3
    //   59: invokevirtual 131	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   62: aload_0
    //   63: invokestatic 137	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   66: pop
    //   67: aload_2
    //   68: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	69	0	paramObject1	Object
    //   0	69	1	paramString	String
    //   0	69	2	paramObject2	Object
    //   35	24	3	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   0	13	18	finally
    //   0	13	22	java/lang/Exception
  }
  
  public final void A(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 > 0.0F)
    {
      if (paramFloat2 > paramFloat1)
      {
        if (paramFloat3 > 0.0F)
        {
          a = 1;
          d = paramFloat1;
          e = paramFloat2;
          c = paramFloat3;
          g = false;
          return;
        }
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("The auto-size step granularity (");
        localStringBuilder.append(paramFloat3);
        localStringBuilder.append("px) is less or equal to (0px)");
        throw new IllegalArgumentException(localStringBuilder.toString());
      }
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("Maximum auto-size text size (");
      localStringBuilder.append(paramFloat2);
      localStringBuilder.append("px) is less or equal to minimum auto-size text size (");
      localStringBuilder.append(paramFloat1);
      localStringBuilder.append("px)");
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Minimum auto-size text size (");
    localStringBuilder.append(paramFloat1);
    localStringBuilder.append("px) is less or equal to (0px)");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public void a()
  {
    if (!o()) {
      return;
    }
    if (b)
    {
      if ((i.getMeasuredHeight() > 0) && (i.getMeasuredWidth() > 0))
      {
        int i1;
        if (k.b(i)) {
          i1 = 1048576;
        } else {
          i1 = i.getMeasuredWidth() - i.getTotalPaddingLeft() - i.getTotalPaddingRight();
        }
        int i2 = i.getHeight() - i.getCompoundPaddingBottom() - i.getCompoundPaddingTop();
        if ((i1 > 0) && (i2 > 0))
        {
          synchronized (l)
          {
            ???.setEmpty();
            right = i1;
            bottom = i2;
            float f1 = f(???);
            if (f1 != i.getTextSize()) {
              u(0, f1);
            }
          }
          break label186;
          throw ((Throwable)localObject);
        }
      }
      return;
    }
    label186:
    b = true;
  }
  
  public final int[] b(int[] paramArrayOfInt)
  {
    int i1 = paramArrayOfInt.length;
    if (i1 == 0) {
      return paramArrayOfInt;
    }
    Arrays.sort(paramArrayOfInt);
    ArrayList localArrayList = new ArrayList();
    int i2 = 0;
    for (int i3 = 0; i3 < i1; i3++)
    {
      int i4 = paramArrayOfInt[i3];
      if ((i4 > 0) && (Collections.binarySearch(localArrayList, Integer.valueOf(i4)) < 0)) {
        localArrayList.add(Integer.valueOf(i4));
      }
    }
    if (i1 == localArrayList.size()) {
      return paramArrayOfInt;
    }
    i1 = localArrayList.size();
    paramArrayOfInt = new int[i1];
    for (i3 = i2; i3 < i1; i3++) {
      paramArrayOfInt[i3] = ((Integer)localArrayList.get(i3)).intValue();
    }
    return paramArrayOfInt;
  }
  
  public final void c()
  {
    a = 0;
    d = -1.0F;
    e = -1.0F;
    c = -1.0F;
    f = new int[0];
    b = false;
  }
  
  public StaticLayout d(CharSequence paramCharSequence, Layout.Alignment paramAlignment, int paramInt1, int paramInt2)
  {
    return e(paramCharSequence, paramAlignment, paramInt1, paramInt2);
  }
  
  public final StaticLayout e(CharSequence paramCharSequence, Layout.Alignment paramAlignment, int paramInt1, int paramInt2)
  {
    paramCharSequence = StaticLayout.Builder.obtain(paramCharSequence, 0, paramCharSequence.length(), h, paramInt1);
    paramAlignment = paramCharSequence.setAlignment(paramAlignment).setLineSpacing(i.getLineSpacingExtra(), i.getLineSpacingMultiplier()).setIncludePad(i.getIncludeFontPadding()).setBreakStrategy(i.getBreakStrategy()).setHyphenationFrequency(i.getHyphenationFrequency());
    paramInt1 = paramInt2;
    if (paramInt2 == -1) {
      paramInt1 = Integer.MAX_VALUE;
    }
    paramAlignment.setMaxLines(paramInt1);
    try
    {
      k.a(paramCharSequence, i);
    }
    catch (ClassCastException paramAlignment)
    {
      Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
    }
    return paramCharSequence.build();
  }
  
  public final int f(RectF paramRectF)
  {
    int i1 = f.length;
    if (i1 != 0)
    {
      int i2 = 1;
      int i3 = i1 - 1;
      i1 = 0;
      while (i2 <= i3)
      {
        int i4 = (i2 + i3) / 2;
        if (y(f[i4], paramRectF))
        {
          i1 = i2;
          i2 = i4 + 1;
        }
        else
        {
          i1 = i4 - 1;
          i3 = i1;
        }
      }
      return f[i1];
    }
    throw new IllegalStateException("No available text sizes to choose from.");
  }
  
  public int g()
  {
    return Math.round(e);
  }
  
  public int h()
  {
    return Math.round(d);
  }
  
  public int i()
  {
    return Math.round(c);
  }
  
  public int[] j()
  {
    return f;
  }
  
  public int k()
  {
    return a;
  }
  
  public void m(int paramInt)
  {
    TextPaint localTextPaint = h;
    if (localTextPaint == null) {
      h = new TextPaint();
    } else {
      localTextPaint.reset();
    }
    h.set(i.getPaint());
    h.setTextSize(paramInt);
  }
  
  public boolean o()
  {
    boolean bool;
    if ((z()) && (a != 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void p(AttributeSet paramAttributeSet, int paramInt)
  {
    TypedArray localTypedArray = j.obtainStyledAttributes(paramAttributeSet, i.U, paramInt, 0);
    TextView localTextView = i;
    s.B(localTextView, localTextView.getContext(), i.U, paramAttributeSet, localTypedArray, paramInt, 0);
    if (localTypedArray.hasValue(i.Z)) {
      a = localTypedArray.getInt(i.Z, 0);
    }
    float f1;
    if (localTypedArray.hasValue(i.Y)) {
      f1 = localTypedArray.getDimension(i.Y, -1.0F);
    } else {
      f1 = -1.0F;
    }
    float f2;
    if (localTypedArray.hasValue(i.W)) {
      f2 = localTypedArray.getDimension(i.W, -1.0F);
    } else {
      f2 = -1.0F;
    }
    float f3;
    if (localTypedArray.hasValue(i.V)) {
      f3 = localTypedArray.getDimension(i.V, -1.0F);
    } else {
      f3 = -1.0F;
    }
    if (localTypedArray.hasValue(i.X))
    {
      paramInt = localTypedArray.getResourceId(i.X, 0);
      if (paramInt > 0)
      {
        paramAttributeSet = localTypedArray.getResources().obtainTypedArray(paramInt);
        w(paramAttributeSet);
        paramAttributeSet.recycle();
      }
    }
    localTypedArray.recycle();
    if (z())
    {
      if (a == 1)
      {
        if (!g)
        {
          paramAttributeSet = j.getResources().getDisplayMetrics();
          float f4 = f2;
          if (f2 == -1.0F) {
            f4 = TypedValue.applyDimension(2, 12.0F, paramAttributeSet);
          }
          f2 = f3;
          if (f3 == -1.0F) {
            f2 = TypedValue.applyDimension(2, 112.0F, paramAttributeSet);
          }
          f3 = f1;
          if (f1 == -1.0F) {
            f3 = 1.0F;
          }
          A(f4, f2, f3);
        }
        v();
      }
    }
    else {
      a = 0;
    }
  }
  
  public void q(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (z())
    {
      DisplayMetrics localDisplayMetrics = j.getResources().getDisplayMetrics();
      A(TypedValue.applyDimension(paramInt4, paramInt1, localDisplayMetrics), TypedValue.applyDimension(paramInt4, paramInt2, localDisplayMetrics), TypedValue.applyDimension(paramInt4, paramInt3, localDisplayMetrics));
      if (v()) {
        a();
      }
    }
  }
  
  public void r(int[] paramArrayOfInt, int paramInt)
  {
    if (z())
    {
      int i1 = paramArrayOfInt.length;
      int i2 = 0;
      if (i1 > 0)
      {
        int[] arrayOfInt = new int[i1];
        Object localObject;
        if (paramInt == 0)
        {
          localObject = Arrays.copyOf(paramArrayOfInt, i1);
        }
        else
        {
          DisplayMetrics localDisplayMetrics = j.getResources().getDisplayMetrics();
          for (;;)
          {
            localObject = arrayOfInt;
            if (i2 >= i1) {
              break;
            }
            arrayOfInt[i2] = Math.round(TypedValue.applyDimension(paramInt, paramArrayOfInt[i2], localDisplayMetrics));
            i2++;
          }
        }
        f = b((int[])localObject);
        if (!x())
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("None of the preset sizes is valid: ");
          ((StringBuilder)localObject).append(Arrays.toString(paramArrayOfInt));
          throw new IllegalArgumentException(((StringBuilder)localObject).toString());
        }
      }
      else
      {
        g = false;
      }
      if (v()) {
        a();
      }
    }
  }
  
  public void s(int paramInt)
  {
    if (z()) {
      if (paramInt != 0)
      {
        Object localObject;
        if (paramInt == 1)
        {
          localObject = j.getResources().getDisplayMetrics();
          A(TypedValue.applyDimension(2, 12.0F, (DisplayMetrics)localObject), TypedValue.applyDimension(2, 112.0F, (DisplayMetrics)localObject), 1.0F);
          if (v()) {
            a();
          }
        }
        else
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Unknown auto-size text type: ");
          ((StringBuilder)localObject).append(paramInt);
          throw new IllegalArgumentException(((StringBuilder)localObject).toString());
        }
      }
      else
      {
        c();
      }
    }
  }
  
  public final void t(float paramFloat)
  {
    if (paramFloat != i.getPaint().getTextSize())
    {
      i.getPaint().setTextSize(paramFloat);
      boolean bool = i.isInLayout();
      if (i.getLayout() != null)
      {
        b = false;
        try
        {
          Method localMethod = l("nullLayouts");
          if (localMethod != null) {
            localMethod.invoke(i, new Object[0]);
          }
        }
        catch (Exception localException)
        {
          Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", localException);
        }
        if (!bool) {
          i.requestLayout();
        } else {
          i.forceLayout();
        }
        i.invalidate();
      }
    }
  }
  
  public void u(int paramInt, float paramFloat)
  {
    Object localObject = j;
    if (localObject == null) {
      localObject = Resources.getSystem();
    } else {
      localObject = ((Context)localObject).getResources();
    }
    t(TypedValue.applyDimension(paramInt, paramFloat, ((Resources)localObject).getDisplayMetrics()));
  }
  
  public final boolean v()
  {
    boolean bool = z();
    int i1 = 0;
    if ((bool) && (a == 1))
    {
      if ((!g) || (f.length == 0))
      {
        int i2 = (int)Math.floor((e - d) / c) + 1;
        int[] arrayOfInt = new int[i2];
        while (i1 < i2)
        {
          arrayOfInt[i1] = Math.round(d + i1 * c);
          i1++;
        }
        f = b(arrayOfInt);
      }
      b = true;
    }
    else
    {
      b = false;
    }
    return b;
  }
  
  public final void w(TypedArray paramTypedArray)
  {
    int i1 = paramTypedArray.length();
    int[] arrayOfInt = new int[i1];
    if (i1 > 0)
    {
      for (int i2 = 0; i2 < i1; i2++) {
        arrayOfInt[i2] = paramTypedArray.getDimensionPixelSize(i2, -1);
      }
      f = b(arrayOfInt);
      x();
    }
  }
  
  public final boolean x()
  {
    int[] arrayOfInt = f;
    int i1 = arrayOfInt.length;
    boolean bool;
    if (i1 > 0) {
      bool = true;
    } else {
      bool = false;
    }
    g = bool;
    if (bool)
    {
      a = 1;
      d = arrayOfInt[0];
      e = arrayOfInt[(i1 - 1)];
      c = -1.0F;
    }
    return bool;
  }
  
  public final boolean y(int paramInt, RectF paramRectF)
  {
    Object localObject1 = i.getText();
    Object localObject2 = i.getTransformationMethod();
    Object localObject3 = localObject1;
    if (localObject2 != null)
    {
      localObject2 = ((TransformationMethod)localObject2).getTransformation((CharSequence)localObject1, i);
      localObject3 = localObject1;
      if (localObject2 != null) {
        localObject3 = localObject2;
      }
    }
    int i1 = i.getMaxLines();
    m(paramInt);
    localObject1 = d((CharSequence)localObject3, (Layout.Alignment)n(i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(right), i1);
    if ((i1 != -1) && ((((StaticLayout)localObject1).getLineCount() > i1) || (((Layout)localObject1).getLineEnd(((StaticLayout)localObject1).getLineCount() - 1) != ((CharSequence)localObject3).length()))) {
      return false;
    }
    return ((Layout)localObject1).getHeight() <= bottom;
  }
  
  public final boolean z()
  {
    return true;
  }
  
  public static class a
    extends x.c
  {
    public void a(StaticLayout.Builder paramBuilder, TextView paramTextView)
    {
      paramBuilder.setTextDirection((TextDirectionHeuristic)x.n(paramTextView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
  }
  
  public static class b
    extends x.a
  {
    public void a(StaticLayout.Builder paramBuilder, TextView paramTextView)
    {
      paramBuilder.setTextDirection(y.a(paramTextView));
    }
    
    public boolean b(TextView paramTextView)
    {
      return z.a(paramTextView);
    }
  }
  
  public static abstract class c
  {
    public abstract void a(StaticLayout.Builder paramBuilder, TextView paramTextView);
    
    public boolean b(TextView paramTextView)
    {
      return ((Boolean)x.n(paramTextView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
  }
}

/* Location:
 * Qualified Name:     l.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */