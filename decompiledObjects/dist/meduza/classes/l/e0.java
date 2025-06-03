package l;

import aa.u;
import aa.v;
import android.content.Context;
import android.content.res.Resources;
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
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public final class e0
{
  public static final RectF l = new RectF();
  public static ConcurrentHashMap<String, Method> m = new ConcurrentHashMap();
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
  public final d k;
  
  static
  {
    new ConcurrentHashMap();
  }
  
  public e0(TextView paramTextView)
  {
    i = paramTextView;
    j = paramTextView.getContext();
    if (Build.VERSION.SDK_INT >= 29) {
      paramTextView = new e();
    } else {
      paramTextView = new d();
    }
    k = paramTextView;
  }
  
  public static int[] b(int[] paramArrayOfInt)
  {
    int n = paramArrayOfInt.length;
    if (n == 0) {
      return paramArrayOfInt;
    }
    Arrays.sort(paramArrayOfInt);
    ArrayList localArrayList = new ArrayList();
    int i1 = 0;
    for (int i2 = 0; i2 < n; i2++)
    {
      int i3 = paramArrayOfInt[i2];
      if ((i3 > 0) && (Collections.binarySearch(localArrayList, Integer.valueOf(i3)) < 0)) {
        localArrayList.add(Integer.valueOf(i3));
      }
    }
    if (n == localArrayList.size()) {
      return paramArrayOfInt;
    }
    n = localArrayList.size();
    paramArrayOfInt = new int[n];
    for (i2 = i1; i2 < n; i2++) {
      paramArrayOfInt[i2] = ((Integer)localArrayList.get(i2)).intValue();
    }
    return paramArrayOfInt;
  }
  
  public static Method d(String paramString)
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
      return (Method)localObject;
    }
    catch (Exception localException)
    {
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Failed to retrieve TextView#");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append("() method");
      Log.w("ACTVAutoSizeHelper", ((StringBuilder)localObject).toString(), localException);
    }
    return null;
  }
  
  /* Error */
  public static Object e(String paramString, Object paramObject1, Object paramObject2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 180	l/e0:d	(Ljava/lang/String;)Ljava/lang/reflect/Method;
    //   4: aload_1
    //   5: iconst_0
    //   6: anewarray 4	java/lang/Object
    //   9: invokevirtual 184	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   12: astore_1
    //   13: aload_1
    //   14: astore_2
    //   15: goto +47 -> 62
    //   18: astore_0
    //   19: goto +45 -> 64
    //   22: astore_1
    //   23: new 156	java/lang/StringBuilder
    //   26: astore_3
    //   27: aload_3
    //   28: invokespecial 157	java/lang/StringBuilder:<init>	()V
    //   31: aload_3
    //   32: ldc -70
    //   34: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: pop
    //   38: aload_3
    //   39: aload_0
    //   40: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: pop
    //   44: aload_3
    //   45: ldc -91
    //   47: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: pop
    //   51: ldc -89
    //   53: aload_3
    //   54: invokevirtual 171	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   57: aload_1
    //   58: invokestatic 177	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   61: pop
    //   62: aload_2
    //   63: areturn
    //   64: aload_0
    //   65: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	paramString	String
    //   0	66	1	paramObject1	Object
    //   0	66	2	paramObject2	Object
    //   26	28	3	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   0	13	18	finally
    //   23	62	18	finally
    //   0	13	22	java/lang/Exception
  }
  
  public final void a()
  {
    int n;
    if ((i()) && (a != 0)) {
      n = 1;
    } else {
      n = 0;
    }
    if (n == 0) {
      return;
    }
    if (b)
    {
      if ((i.getMeasuredHeight() > 0) && (i.getMeasuredWidth() > 0))
      {
        if (k.b(i)) {
          n = 1048576;
        } else {
          n = i.getMeasuredWidth() - i.getTotalPaddingLeft() - i.getTotalPaddingRight();
        }
        int i1 = i.getHeight() - i.getCompoundPaddingBottom() - i.getCompoundPaddingTop();
        if ((n > 0) && (i1 > 0)) {
          synchronized (l)
          {
            ???.setEmpty();
            right = n;
            bottom = i1;
            float f1 = c(???);
            if (f1 != i.getTextSize()) {
              f(f1, 0);
            }
          }
        }
      }
      return;
    }
    b = true;
  }
  
  public final int c(RectF paramRectF)
  {
    int n = f.length;
    if (n != 0)
    {
      int i1 = n - 1;
      n = 1;
      int i2 = 0;
      while (n <= i1)
      {
        int i3 = (n + i1) / 2;
        i2 = f[i3];
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
        int i4 = a.b(i);
        localObject1 = h;
        if (localObject1 == null) {
          h = new TextPaint();
        } else {
          ((Paint)localObject1).reset();
        }
        h.set(i.getPaint());
        h.setTextSize(i2);
        localObject1 = c.a((CharSequence)localObject3, (Layout.Alignment)e("getLayoutAlignment", i, Layout.Alignment.ALIGN_NORMAL), Math.round(right), i4, i, h, k);
        if (((i4 != -1) && ((((StaticLayout)localObject1).getLineCount() > i4) || (((Layout)localObject1).getLineEnd(((StaticLayout)localObject1).getLineCount() - 1) != ((CharSequence)localObject3).length()))) || (((Layout)localObject1).getHeight() > bottom)) {
          i2 = 0;
        } else {
          i2 = 1;
        }
        if (i2 != 0)
        {
          i2 = n;
          n = i3 + 1;
        }
        else
        {
          i2 = i3 - 1;
          i1 = i2;
        }
      }
      return f[i2];
    }
    throw new IllegalStateException("No available text sizes to choose from.");
  }
  
  public final void f(float paramFloat, int paramInt)
  {
    Object localObject = j;
    if (localObject == null) {
      localObject = Resources.getSystem();
    } else {
      localObject = ((Context)localObject).getResources();
    }
    paramFloat = TypedValue.applyDimension(paramInt, paramFloat, ((Resources)localObject).getDisplayMetrics());
    if (paramFloat != i.getPaint().getTextSize())
    {
      i.getPaint().setTextSize(paramFloat);
      boolean bool = b.a(i);
      if (i.getLayout() != null)
      {
        b = false;
        try
        {
          localObject = d("nullLayouts");
          if (localObject != null) {
            ((Method)localObject).invoke(i, new Object[0]);
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
  
  public final boolean g()
  {
    boolean bool = i();
    int n = 0;
    if ((bool) && (a == 1))
    {
      if ((!g) || (f.length == 0))
      {
        int i1 = (int)Math.floor((e - d) / c) + 1;
        int[] arrayOfInt = new int[i1];
        while (n < i1)
        {
          float f1 = d;
          arrayOfInt[n] = Math.round(n * c + f1);
          n++;
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
  
  public final boolean h()
  {
    int[] arrayOfInt = f;
    int n = arrayOfInt.length;
    boolean bool;
    if (n > 0) {
      bool = true;
    } else {
      bool = false;
    }
    g = bool;
    if (bool)
    {
      a = 1;
      d = arrayOfInt[0];
      e = arrayOfInt[(n - 1)];
      c = -1.0F;
    }
    return bool;
  }
  
  public final boolean i()
  {
    return i instanceof k ^ true;
  }
  
  public final void j(float paramFloat1, float paramFloat2, float paramFloat3)
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
  
  public static final class a
  {
    public static StaticLayout a(CharSequence paramCharSequence, Layout.Alignment paramAlignment, int paramInt, TextView paramTextView, TextPaint paramTextPaint)
    {
      return new StaticLayout(paramCharSequence, paramTextPaint, paramInt, paramAlignment, paramTextView.getLineSpacingMultiplier(), paramTextView.getLineSpacingExtra(), paramTextView.getIncludeFontPadding());
    }
    
    public static int b(TextView paramTextView)
    {
      return paramTextView.getMaxLines();
    }
  }
  
  public static final class b
  {
    public static boolean a(View paramView)
    {
      return paramView.isInLayout();
    }
  }
  
  public static final class c
  {
    public static StaticLayout a(CharSequence paramCharSequence, Layout.Alignment paramAlignment, int paramInt1, int paramInt2, TextView paramTextView, TextPaint paramTextPaint, e0.f paramf)
    {
      paramCharSequence = StaticLayout.Builder.obtain(paramCharSequence, 0, paramCharSequence.length(), paramTextPaint, paramInt1);
      paramAlignment = paramCharSequence.setAlignment(paramAlignment).setLineSpacing(paramTextView.getLineSpacingExtra(), paramTextView.getLineSpacingMultiplier()).setIncludePad(paramTextView.getIncludeFontPadding()).setBreakStrategy(paramTextView.getBreakStrategy()).setHyphenationFrequency(paramTextView.getHyphenationFrequency());
      paramInt1 = paramInt2;
      if (paramInt2 == -1) {
        paramInt1 = Integer.MAX_VALUE;
      }
      paramAlignment.setMaxLines(paramInt1);
      try
      {
        paramf.a(paramCharSequence, paramTextView);
      }
      catch (ClassCastException paramAlignment)
      {
        Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
      }
      return paramCharSequence.build();
    }
  }
  
  public static class d
    extends e0.f
  {
    public void a(StaticLayout.Builder paramBuilder, TextView paramTextView)
    {
      paramBuilder.setTextDirection((TextDirectionHeuristic)e0.e("getTextDirectionHeuristic", paramTextView, TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
  }
  
  public static final class e
    extends e0.d
  {
    public void a(StaticLayout.Builder paramBuilder, TextView paramTextView)
    {
      paramBuilder.setTextDirection(v.e(paramTextView));
    }
    
    public boolean b(TextView paramTextView)
    {
      return u.v(paramTextView);
    }
  }
  
  public static class f
  {
    public void a(StaticLayout.Builder paramBuilder, TextView paramTextView)
    {
      throw null;
    }
    
    public boolean b(TextView paramTextView)
    {
      return ((Boolean)e0.e("getHorizontallyScrolling", paramTextView, Boolean.FALSE)).booleanValue();
    }
  }
}

/* Location:
 * Qualified Name:     l.e0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */