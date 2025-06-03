package l;

import A.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.graphics.Color;
import android.util.TypedValue;

public abstract class T
{
  public static final ThreadLocal a = new ThreadLocal();
  public static final int[] b = { -16842910 };
  public static final int[] c = { 16842908 };
  public static final int[] d = { 16843518 };
  public static final int[] e = { 16842919 };
  public static final int[] f = { 16842912 };
  public static final int[] g = { 16842913 };
  public static final int[] h = { -16842919, -16842908 };
  public static final int[] i = new int[0];
  public static final int[] j = new int[1];
  
  /* Error */
  public static void a(android.view.View paramView, Context paramContext)
  {
    // Byte code:
    //   0: aload_1
    //   1: getstatic 58	e/i:l0	[I
    //   4: invokevirtual 64	android/content/Context:obtainStyledAttributes	([I)Landroid/content/res/TypedArray;
    //   7: astore_1
    //   8: aload_1
    //   9: getstatic 68	e/i:m0	I
    //   12: invokevirtual 74	android/content/res/TypedArray:hasValue	(I)Z
    //   15: ifne +51 -> 66
    //   18: new 76	java/lang/StringBuilder
    //   21: astore_2
    //   22: aload_2
    //   23: invokespecial 77	java/lang/StringBuilder:<init>	()V
    //   26: aload_2
    //   27: ldc 79
    //   29: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: pop
    //   33: aload_2
    //   34: aload_0
    //   35: invokevirtual 87	java/lang/Object:getClass	()Ljava/lang/Class;
    //   38: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   41: pop
    //   42: aload_2
    //   43: ldc 92
    //   45: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: pop
    //   49: ldc 94
    //   51: aload_2
    //   52: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   55: invokestatic 103	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   58: pop
    //   59: goto +7 -> 66
    //   62: astore_0
    //   63: goto +8 -> 71
    //   66: aload_1
    //   67: invokevirtual 106	android/content/res/TypedArray:recycle	()V
    //   70: return
    //   71: aload_1
    //   72: invokevirtual 106	android/content/res/TypedArray:recycle	()V
    //   75: aload_0
    //   76: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	paramView	android.view.View
    //   0	77	1	paramContext	Context
    //   21	31	2	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   8	59	62	finally
  }
  
  public static int b(Context paramContext, int paramInt)
  {
    Object localObject = e(paramContext, paramInt);
    if ((localObject != null) && (((ColorStateList)localObject).isStateful())) {
      return ((ColorStateList)localObject).getColorForState(b, ((ColorStateList)localObject).getDefaultColor());
    }
    localObject = f();
    paramContext.getTheme().resolveAttribute(16842803, (TypedValue)localObject, true);
    return d(paramContext, paramInt, ((TypedValue)localObject).getFloat());
  }
  
  public static int c(Context paramContext, int paramInt)
  {
    Object localObject = j;
    localObject[0] = paramInt;
    localObject = X.r(paramContext, null, (int[])localObject);
    try
    {
      paramInt = ((X)localObject).b(0, 0);
      return paramInt;
    }
    finally
    {
      ((X)localObject).t();
    }
  }
  
  public static int d(Context paramContext, int paramInt, float paramFloat)
  {
    paramInt = c(paramContext, paramInt);
    return a.f(paramInt, Math.round(Color.alpha(paramInt) * paramFloat));
  }
  
  public static ColorStateList e(Context paramContext, int paramInt)
  {
    Object localObject1 = j;
    localObject1[0] = paramInt;
    paramContext = X.r(paramContext, null, (int[])localObject1);
    try
    {
      localObject1 = paramContext.c(0);
      return (ColorStateList)localObject1;
    }
    finally
    {
      paramContext.t();
    }
  }
  
  public static TypedValue f()
  {
    ThreadLocal localThreadLocal = a;
    TypedValue localTypedValue1 = (TypedValue)localThreadLocal.get();
    TypedValue localTypedValue2 = localTypedValue1;
    if (localTypedValue1 == null)
    {
      localTypedValue2 = new TypedValue();
      localThreadLocal.set(localTypedValue2);
    }
    return localTypedValue2;
  }
}

/* Location:
 * Qualified Name:     l.T
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */