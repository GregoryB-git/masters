package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;
import e;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class DrawableUtils
{
  private static final int[] CHECKED_STATE_SET = { 16842912 };
  private static final int[] EMPTY_STATE_SET = new int[0];
  public static final Rect INSETS_NONE = new Rect();
  
  public static boolean canSafelyMutateDrawable(@NonNull Drawable paramDrawable)
  {
    return true;
  }
  
  public static void fixDrawable(@NonNull Drawable paramDrawable)
  {
    String str = paramDrawable.getClass().getName();
    int i = Build.VERSION.SDK_INT;
    if ((i >= 29) && (i < 31) && ("android.graphics.drawable.ColorStateListDrawable".equals(str))) {
      forceDrawableStateChange(paramDrawable);
    }
  }
  
  private static void forceDrawableStateChange(Drawable paramDrawable)
  {
    int[] arrayOfInt = paramDrawable.getState();
    if ((arrayOfInt != null) && (arrayOfInt.length != 0)) {
      paramDrawable.setState(EMPTY_STATE_SET);
    } else {
      paramDrawable.setState(CHECKED_STATE_SET);
    }
    paramDrawable.setState(arrayOfInt);
  }
  
  @NonNull
  public static Rect getOpticalBounds(@NonNull Drawable paramDrawable)
  {
    if (Build.VERSION.SDK_INT >= 29)
    {
      paramDrawable = Api29Impl.getOpticalInsets(paramDrawable);
      return new Rect(left, top, right, bottom);
    }
    return Api18Impl.getOpticalInsets(DrawableCompat.unwrap(paramDrawable));
  }
  
  public static PorterDuff.Mode parseTintMode(int paramInt, PorterDuff.Mode paramMode)
  {
    if (paramInt != 3)
    {
      if (paramInt != 5)
      {
        if (paramInt != 9)
        {
          switch (paramInt)
          {
          default: 
            return paramMode;
          case 16: 
            return PorterDuff.Mode.ADD;
          case 15: 
            return PorterDuff.Mode.SCREEN;
          }
          return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_ATOP;
      }
      return PorterDuff.Mode.SRC_IN;
    }
    return PorterDuff.Mode.SRC_OVER;
  }
  
  @RequiresApi(18)
  public static class Api18Impl
  {
    private static final Field sBottom = null;
    private static final Method sGetOpticalInsets;
    private static final Field sLeft;
    private static final boolean sReflectionSuccessful = false;
    private static final Field sRight;
    private static final Field sTop;
    
    /* Error */
    static
    {
      // Byte code:
      //   0: ldc 29
      //   2: invokestatic 35	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
      //   5: astore_0
      //   6: ldc 37
      //   8: ldc 39
      //   10: iconst_0
      //   11: anewarray 31	java/lang/Class
      //   14: invokevirtual 43	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      //   17: astore_1
      //   18: aload_0
      //   19: ldc 45
      //   21: invokevirtual 49	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
      //   24: astore_2
      //   25: aload_0
      //   26: ldc 51
      //   28: invokevirtual 49	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
      //   31: astore_3
      //   32: aload_0
      //   33: ldc 53
      //   35: invokevirtual 49	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
      //   38: astore 4
      //   40: aload_0
      //   41: ldc 55
      //   43: invokevirtual 49	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
      //   46: astore_0
      //   47: iconst_1
      //   48: istore 5
      //   50: goto +111 -> 161
      //   53: astore_0
      //   54: aconst_null
      //   55: astore 4
      //   57: goto +99 -> 156
      //   60: astore_0
      //   61: aconst_null
      //   62: astore 4
      //   64: aload_1
      //   65: astore_0
      //   66: aload 4
      //   68: astore_1
      //   69: goto +80 -> 149
      //   72: astore_0
      //   73: aconst_null
      //   74: astore 4
      //   76: aload_1
      //   77: astore_0
      //   78: aload 4
      //   80: astore_1
      //   81: goto +68 -> 149
      //   84: astore_0
      //   85: aconst_null
      //   86: astore 4
      //   88: aload_1
      //   89: astore_0
      //   90: aload 4
      //   92: astore_1
      //   93: goto +56 -> 149
      //   96: astore_0
      //   97: goto +16 -> 113
      //   100: astore_0
      //   101: goto +28 -> 129
      //   104: astore_0
      //   105: aload_1
      //   106: astore_0
      //   107: goto +38 -> 145
      //   110: astore_1
      //   111: aconst_null
      //   112: astore_1
      //   113: aconst_null
      //   114: astore_2
      //   115: aconst_null
      //   116: astore 4
      //   118: aload_1
      //   119: astore_0
      //   120: aload 4
      //   122: astore_1
      //   123: goto +26 -> 149
      //   126: astore_1
      //   127: aconst_null
      //   128: astore_1
      //   129: aconst_null
      //   130: astore_2
      //   131: aconst_null
      //   132: astore 4
      //   134: aload_1
      //   135: astore_0
      //   136: aload 4
      //   138: astore_1
      //   139: goto +10 -> 149
      //   142: astore_1
      //   143: aconst_null
      //   144: astore_0
      //   145: aconst_null
      //   146: astore_2
      //   147: aconst_null
      //   148: astore_1
      //   149: aload_1
      //   150: astore 4
      //   152: aload_1
      //   153: astore_3
      //   154: aload_0
      //   155: astore_1
      //   156: iconst_0
      //   157: istore 5
      //   159: aconst_null
      //   160: astore_0
      //   161: iload 5
      //   163: ifeq +31 -> 194
      //   166: aload_1
      //   167: putstatic 57	androidx/appcompat/widget/DrawableUtils$Api18Impl:sGetOpticalInsets	Ljava/lang/reflect/Method;
      //   170: aload_2
      //   171: putstatic 59	androidx/appcompat/widget/DrawableUtils$Api18Impl:sLeft	Ljava/lang/reflect/Field;
      //   174: aload_3
      //   175: putstatic 61	androidx/appcompat/widget/DrawableUtils$Api18Impl:sTop	Ljava/lang/reflect/Field;
      //   178: aload 4
      //   180: putstatic 63	androidx/appcompat/widget/DrawableUtils$Api18Impl:sRight	Ljava/lang/reflect/Field;
      //   183: aload_0
      //   184: putstatic 65	androidx/appcompat/widget/DrawableUtils$Api18Impl:sBottom	Ljava/lang/reflect/Field;
      //   187: iconst_1
      //   188: putstatic 67	androidx/appcompat/widget/DrawableUtils$Api18Impl:sReflectionSuccessful	Z
      //   191: goto +27 -> 218
      //   194: aconst_null
      //   195: putstatic 57	androidx/appcompat/widget/DrawableUtils$Api18Impl:sGetOpticalInsets	Ljava/lang/reflect/Method;
      //   198: aconst_null
      //   199: putstatic 59	androidx/appcompat/widget/DrawableUtils$Api18Impl:sLeft	Ljava/lang/reflect/Field;
      //   202: aconst_null
      //   203: putstatic 61	androidx/appcompat/widget/DrawableUtils$Api18Impl:sTop	Ljava/lang/reflect/Field;
      //   206: aconst_null
      //   207: putstatic 63	androidx/appcompat/widget/DrawableUtils$Api18Impl:sRight	Ljava/lang/reflect/Field;
      //   210: aconst_null
      //   211: putstatic 65	androidx/appcompat/widget/DrawableUtils$Api18Impl:sBottom	Ljava/lang/reflect/Field;
      //   214: iconst_0
      //   215: putstatic 67	androidx/appcompat/widget/DrawableUtils$Api18Impl:sReflectionSuccessful	Z
      //   218: return
      //   219: astore_0
      //   220: goto -64 -> 156
      // Local variable table:
      //   start	length	slot	name	signature
      //   5	42	0	localObject1	Object
      //   53	1	0	localNoSuchMethodException1	NoSuchMethodException
      //   60	1	0	localNoSuchFieldException1	NoSuchFieldException
      //   65	1	0	localObject2	Object
      //   72	1	0	localClassNotFoundException1	ClassNotFoundException
      //   77	1	0	localObject3	Object
      //   84	1	0	localNoSuchMethodException2	NoSuchMethodException
      //   89	1	0	localObject4	Object
      //   96	1	0	localNoSuchFieldException2	NoSuchFieldException
      //   100	1	0	localClassNotFoundException2	ClassNotFoundException
      //   104	1	0	localNoSuchMethodException3	NoSuchMethodException
      //   106	78	0	localObject5	Object
      //   219	1	0	localNoSuchMethodException4	NoSuchMethodException
      //   17	89	1	localObject6	Object
      //   110	1	1	localNoSuchFieldException3	NoSuchFieldException
      //   112	11	1	localObject7	Object
      //   126	1	1	localClassNotFoundException3	ClassNotFoundException
      //   128	11	1	localObject8	Object
      //   142	1	1	localNoSuchMethodException5	NoSuchMethodException
      //   148	19	1	localObject9	Object
      //   24	147	2	localField	Field
      //   31	144	3	localObject10	Object
      //   38	141	4	localObject11	Object
      //   48	114	5	i	int
      // Exception table:
      //   from	to	target	type
      //   32	40	53	java/lang/NoSuchMethodException
      //   32	40	53	java/lang/ClassNotFoundException
      //   32	40	53	java/lang/NoSuchFieldException
      //   25	32	60	java/lang/NoSuchFieldException
      //   25	32	72	java/lang/ClassNotFoundException
      //   25	32	84	java/lang/NoSuchMethodException
      //   18	25	96	java/lang/NoSuchFieldException
      //   18	25	100	java/lang/ClassNotFoundException
      //   18	25	104	java/lang/NoSuchMethodException
      //   0	18	110	java/lang/NoSuchFieldException
      //   0	18	126	java/lang/ClassNotFoundException
      //   0	18	142	java/lang/NoSuchMethodException
      //   40	47	219	java/lang/NoSuchMethodException
      //   40	47	219	java/lang/ClassNotFoundException
      //   40	47	219	java/lang/NoSuchFieldException
    }
    
    @NonNull
    public static Rect getOpticalInsets(@NonNull Drawable paramDrawable)
    {
      if ((Build.VERSION.SDK_INT < 29) && (sReflectionSuccessful)) {}
      try
      {
        paramDrawable = sGetOpticalInsets.invoke(paramDrawable, new Object[0]);
        if (paramDrawable != null)
        {
          paramDrawable = new Rect(sLeft.getInt(paramDrawable), sTop.getInt(paramDrawable), sRight.getInt(paramDrawable), sBottom.getInt(paramDrawable));
          return paramDrawable;
        }
      }
      catch (IllegalAccessException|InvocationTargetException paramDrawable)
      {
        for (;;) {}
      }
      return DrawableUtils.INSETS_NONE;
    }
  }
  
  @RequiresApi(29)
  public static class Api29Impl
  {
    @DoNotInline
    public static Insets getOpticalInsets(Drawable paramDrawable)
    {
      return e.e(paramDrawable);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.DrawableUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */