package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import b.a0;

public final class u0
{
  public static final ThreadLocal<TypedValue> a = new ThreadLocal();
  public static final int[] b = { -16842910 };
  public static final int[] c = { 16842908 };
  public static final int[] d = { 16842919 };
  public static final int[] e = { 16842912 };
  public static final int[] f = new int[0];
  public static final int[] g = new int[1];
  
  public static void a(View paramView, Context paramContext)
  {
    paramContext = paramContext.obtainStyledAttributes(a0.w);
    try
    {
      if (!paramContext.hasValue(117))
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("View ");
        localStringBuilder.append(paramView.getClass());
        localStringBuilder.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
        Log.e("ThemeUtils", localStringBuilder.toString());
      }
      return;
    }
    finally
    {
      paramContext.recycle();
    }
  }
  
  public static int b(Context paramContext, int paramInt)
  {
    Object localObject = d(paramContext, paramInt);
    if ((localObject != null) && (((ColorStateList)localObject).isStateful())) {
      return ((ColorStateList)localObject).getColorForState(b, ((ColorStateList)localObject).getDefaultColor());
    }
    ThreadLocal localThreadLocal = a;
    TypedValue localTypedValue = (TypedValue)localThreadLocal.get();
    localObject = localTypedValue;
    if (localTypedValue == null)
    {
      localObject = new TypedValue();
      localThreadLocal.set(localObject);
    }
    paramContext.getTheme().resolveAttribute(16842803, (TypedValue)localObject, true);
    float f1 = ((TypedValue)localObject).getFloat();
    int i = c(paramContext, paramInt);
    paramInt = Math.round(Color.alpha(i) * f1);
    int j = x.a.a;
    if ((paramInt >= 0) && (paramInt <= 255)) {
      return i & 0xFFFFFF | paramInt << 24;
    }
    throw new IllegalArgumentException("alpha must be between 0 and 255.");
  }
  
  public static int c(Context paramContext, int paramInt)
  {
    Object localObject = g;
    localObject[0] = paramInt;
    localObject = paramContext.obtainStyledAttributes(null, (int[])localObject);
    try
    {
      paramInt = ((TypedArray)localObject).getColor(0, 0);
      return paramInt;
    }
    finally
    {
      ((TypedArray)localObject).recycle();
    }
  }
  
  public static ColorStateList d(Context paramContext, int paramInt)
  {
    Object localObject = g;
    localObject[0] = paramInt;
    localObject = paramContext.obtainStyledAttributes(null, (int[])localObject);
    try
    {
      if (((TypedArray)localObject).hasValue(0))
      {
        paramInt = ((TypedArray)localObject).getResourceId(0, 0);
        if (paramInt != 0)
        {
          paramContext = v.a.getColorStateList(paramContext, paramInt);
          if (paramContext != null) {
            break label57;
          }
        }
      }
      paramContext = ((TypedArray)localObject).getColorStateList(0);
    }
    finally
    {
      break label63;
    }
    label57:
    ((TypedArray)localObject).recycle();
    return paramContext;
    label63:
    ((TypedArray)localObject).recycle();
    throw paramContext;
  }
}

/* Location:
 * Qualified Name:     l.u0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */