package C1;

import O1.P;
import T1.a;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
{
  public static final f a = new f();
  public static final String b = f.class.getCanonicalName();
  public static WeakReference c = new WeakReference(null);
  public static Method d;
  
  public static final View a(View paramView)
  {
    if (a.d(f.class)) {
      return null;
    }
    for (;;)
    {
      if (paramView != null) {
        try
        {
          if (a.q(paramView)) {
            return paramView;
          }
          paramView = paramView.getParent();
          if ((paramView instanceof View)) {
            paramView = (View)paramView;
          }
        }
        finally
        {
          a.b(paramView, f.class);
        }
      }
    }
    return null;
  }
  
  public static final List b(View paramView)
  {
    if (a.d(f.class)) {
      return null;
    }
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      if ((paramView instanceof ViewGroup))
      {
        int i = ((ViewGroup)paramView).getChildCount();
        if (i > 0)
        {
          int k;
          for (int j = 0;; j = k)
          {
            k = j + 1;
            localArrayList.add(((ViewGroup)paramView).getChildAt(j));
            if (k >= i) {
              break;
            }
          }
        }
      }
      label78:
      return null;
    }
    finally
    {
      break label78;
      return localArrayList;
      a.b(paramView, f.class);
    }
  }
  
  public static final int c(View paramView)
  {
    if (a.d(f.class)) {
      return 0;
    }
    int i;
    try
    {
      Intrinsics.checkNotNullParameter(paramView, "view");
      if ((paramView instanceof ImageView)) {
        i = 2;
      } else {
        i = 0;
      }
      j = i;
      if (paramView.isClickable()) {
        j = i | 0x20;
      }
      i = j;
      if (o(paramView)) {
        i = j | 0x200;
      }
      if (!(paramView instanceof TextView)) {
        break label143;
      }
      j = i | 0x401;
      if ((paramView instanceof Button))
      {
        j = i | 0x405;
        if ((paramView instanceof Switch))
        {
          i |= 0x2405;
          break label125;
        }
        if ((paramView instanceof CheckBox))
        {
          i |= 0x8405;
          break label125;
        }
      }
      i = j;
    }
    finally
    {
      break label239;
    }
    label125:
    int j = i;
    if ((paramView instanceof EditText))
    {
      j = i | 0x800;
      break label237;
      label143:
      if ((!(paramView instanceof Spinner)) && (!(paramView instanceof DatePicker)))
      {
        if ((paramView instanceof RatingBar))
        {
          j = i | 0x10000;
        }
        else if ((paramView instanceof RadioGroup))
        {
          j = i | 0x4000;
        }
        else
        {
          j = i;
          if ((paramView instanceof ViewGroup))
          {
            boolean bool = a.p(paramView, (View)c.get());
            j = i;
            if (bool) {
              j = i | 0x40;
            }
          }
        }
      }
      else {
        j = i | 0x1000;
      }
    }
    label237:
    return j;
    label239:
    a.b(paramView, f.class);
    return 0;
  }
  
  public static final JSONObject d(View paramView)
  {
    if (a.d(f.class)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramView, "view");
      if (Intrinsics.a(paramView.getClass().getName(), "com.facebook.react.ReactRootView"))
      {
        localObject = new java/lang/ref/WeakReference;
        ((WeakReference)localObject).<init>(paramView);
        c = (WeakReference)localObject;
      }
    }
    finally
    {
      break label161;
    }
    Object localObject = new org/json/JSONObject;
    ((JSONObject)localObject).<init>();
    try
    {
      s(paramView, (JSONObject)localObject);
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>();
      paramView = b(paramView);
      int i = paramView.size() - 1;
      if (i >= 0)
      {
        int k;
        for (int j = 0;; j = k)
        {
          k = j + 1;
          localJSONArray.put(d((View)paramView.get(j)));
          if (k > i) {
            break;
          }
        }
      }
      label149:
      label159:
      a.b(paramView, f.class);
    }
    catch (JSONException paramView)
    {
      break label149;
      ((JSONObject)localObject).put("childviews", localJSONArray);
      break label159;
      Log.e(b, "Failed to create JSONObject for view.", paramView);
      return (JSONObject)localObject;
    }
    label161:
    return null;
  }
  
  public static final View.OnClickListener g(View paramView)
  {
    boolean bool = a.d(f.class);
    Object localObject1 = null;
    if (bool) {
      return null;
    }
    try
    {
      try
      {
        localField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
        if (localField != null) {
          localField.setAccessible(true);
        }
      }
      finally
      {
        break label110;
      }
      Object localObject2 = localField.get(paramView);
      if (localObject2 == null) {
        return null;
      }
      Field localField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
      paramView = (View)localObject1;
      if (localField != null)
      {
        localField.setAccessible(true);
        paramView = localField.get(localObject2);
        if (paramView != null)
        {
          paramView = (View.OnClickListener)paramView;
        }
        else
        {
          paramView = new java/lang/NullPointerException;
          paramView.<init>("null cannot be cast to non-null type android.view.View.OnClickListener");
          throw paramView;
        }
      }
      return paramView;
    }
    catch (NoSuchFieldException|ClassNotFoundException|IllegalAccessException paramView)
    {
      label110:
      for (;;) {}
    }
    a.b(paramView, f.class);
    return null;
  }
  
  /* Error */
  public static final android.view.View.OnTouchListener h(View paramView)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 42	T1/a:d	(Ljava/lang/Object;)Z
    //   5: istore_1
    //   6: aconst_null
    //   7: astore_2
    //   8: iload_1
    //   9: ifeq +5 -> 14
    //   12: aconst_null
    //   13: areturn
    //   14: ldc -72
    //   16: invokestatic 188	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   19: ldc -66
    //   21: invokevirtual 194	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   24: astore_3
    //   25: aload_3
    //   26: ifnull +27 -> 53
    //   29: aload_3
    //   30: iconst_1
    //   31: invokevirtual 200	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   34: goto +19 -> 53
    //   37: astore_0
    //   38: goto +125 -> 163
    //   41: astore_2
    //   42: goto +81 -> 123
    //   45: astore_2
    //   46: goto +93 -> 139
    //   49: astore_2
    //   50: goto +100 -> 150
    //   53: aload_3
    //   54: aload_0
    //   55: invokevirtual 205	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   58: astore_3
    //   59: aload_3
    //   60: ifnonnull +5 -> 65
    //   63: aconst_null
    //   64: areturn
    //   65: ldc -49
    //   67: invokestatic 188	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   70: ldc -34
    //   72: invokevirtual 194	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   75: astore 4
    //   77: aload_2
    //   78: astore_0
    //   79: aload 4
    //   81: ifnull +40 -> 121
    //   84: aload 4
    //   86: iconst_1
    //   87: invokevirtual 200	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   90: aload 4
    //   92: aload_3
    //   93: invokevirtual 205	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   96: astore_0
    //   97: aload_0
    //   98: ifnull +11 -> 109
    //   101: aload_0
    //   102: checkcast 224	android/view/View$OnTouchListener
    //   105: astore_0
    //   106: goto +15 -> 121
    //   109: new 213	java/lang/NullPointerException
    //   112: astore_0
    //   113: aload_0
    //   114: ldc -30
    //   116: invokespecial 218	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   119: aload_0
    //   120: athrow
    //   121: aload_0
    //   122: areturn
    //   123: getstatic 231	O1/P:a	LO1/P;
    //   126: astore_0
    //   127: getstatic 27	C1/f:b	Ljava/lang/String;
    //   130: astore_0
    //   131: aload_0
    //   132: aload_2
    //   133: invokestatic 235	O1/P:i0	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   136: goto +25 -> 161
    //   139: getstatic 231	O1/P:a	LO1/P;
    //   142: astore_0
    //   143: getstatic 27	C1/f:b	Ljava/lang/String;
    //   146: astore_0
    //   147: goto -16 -> 131
    //   150: getstatic 231	O1/P:a	LO1/P;
    //   153: astore_0
    //   154: getstatic 27	C1/f:b	Ljava/lang/String;
    //   157: astore_0
    //   158: goto -27 -> 131
    //   161: aconst_null
    //   162: areturn
    //   163: aload_0
    //   164: ldc 2
    //   166: invokestatic 55	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   169: aconst_null
    //   170: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	171	0	paramView	View
    //   5	4	1	bool	boolean
    //   7	1	2	localObject1	Object
    //   41	1	2	localIllegalAccessException	IllegalAccessException
    //   45	1	2	localClassNotFoundException	ClassNotFoundException
    //   49	84	2	localNoSuchFieldException	NoSuchFieldException
    //   24	69	3	localObject2	Object
    //   75	16	4	localField	Field
    // Exception table:
    //   from	to	target	type
    //   14	25	37	finally
    //   29	34	37	finally
    //   53	59	37	finally
    //   65	77	37	finally
    //   84	97	37	finally
    //   101	106	37	finally
    //   109	121	37	finally
    //   123	131	37	finally
    //   131	136	37	finally
    //   139	147	37	finally
    //   150	158	37	finally
    //   14	25	41	java/lang/IllegalAccessException
    //   29	34	41	java/lang/IllegalAccessException
    //   53	59	41	java/lang/IllegalAccessException
    //   65	77	41	java/lang/IllegalAccessException
    //   84	97	41	java/lang/IllegalAccessException
    //   101	106	41	java/lang/IllegalAccessException
    //   109	121	41	java/lang/IllegalAccessException
    //   14	25	45	java/lang/ClassNotFoundException
    //   29	34	45	java/lang/ClassNotFoundException
    //   53	59	45	java/lang/ClassNotFoundException
    //   65	77	45	java/lang/ClassNotFoundException
    //   84	97	45	java/lang/ClassNotFoundException
    //   101	106	45	java/lang/ClassNotFoundException
    //   109	121	45	java/lang/ClassNotFoundException
    //   14	25	49	java/lang/NoSuchFieldException
    //   29	34	49	java/lang/NoSuchFieldException
    //   53	59	49	java/lang/NoSuchFieldException
    //   65	77	49	java/lang/NoSuchFieldException
    //   84	97	49	java/lang/NoSuchFieldException
    //   101	106	49	java/lang/NoSuchFieldException
    //   109	121	49	java/lang/NoSuchFieldException
  }
  
  public static final String i(View paramView)
  {
    if (a.d(f.class)) {
      return null;
    }
    for (;;)
    {
      try
      {
        if ((paramView instanceof EditText))
        {
          paramView = (EditText)paramView;
          paramView = paramView.getHint();
        }
      }
      finally
      {
        break label79;
      }
      if (!(paramView instanceof TextView)) {
        break;
      }
      paramView = (TextView)paramView;
    }
    paramView = null;
    String str = "";
    if (paramView == null)
    {
      paramView = str;
    }
    else
    {
      paramView = paramView.toString();
      if (paramView == null) {
        paramView = str;
      }
    }
    return paramView;
    label79:
    a.b(paramView, f.class);
    return null;
  }
  
  public static final ViewGroup j(View paramView)
  {
    boolean bool = a.d(f.class);
    Object localObject = null;
    if (bool) {
      return null;
    }
    if (paramView == null) {
      return null;
    }
    try
    {
      ViewParent localViewParent = paramView.getParent();
      paramView = (View)localObject;
      if ((localViewParent instanceof ViewGroup)) {
        paramView = (ViewGroup)localViewParent;
      }
    }
    finally
    {
      break label48;
    }
    return paramView;
    label48:
    a.b(paramView, f.class);
    return null;
  }
  
  public static final String k(View paramView)
  {
    if (a.d(f.class)) {
      return null;
    }
    for (;;)
    {
      try
      {
        if (!(paramView instanceof TextView)) {
          break;
        }
        localObject = ((TextView)paramView).getText();
        if (!(paramView instanceof Switch)) {
          break label383;
        }
        if (((Switch)paramView).isChecked())
        {
          paramView = "1";
          localObject = paramView;
        }
      }
      finally
      {
        break label409;
      }
      paramView = "0";
    }
    if ((paramView instanceof Spinner))
    {
      if (((Spinner)paramView).getCount() > 0)
      {
        paramView = ((Spinner)paramView).getSelectedItem();
        if (paramView != null)
        {
          localObject = paramView.toString();
          break label383;
        }
      }
    }
    else
    {
      boolean bool = paramView instanceof DatePicker;
      int i = 0;
      int j;
      int k;
      if (bool)
      {
        i = ((DatePicker)paramView).getYear();
        j = ((DatePicker)paramView).getMonth();
        k = ((DatePicker)paramView).getDayOfMonth();
        paramView = x.a;
      }
      for (localObject = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) }, 3));; localObject = String.format("%02d:%02d", Arrays.copyOf(new Object[] { Integer.valueOf(k), Integer.valueOf(i) }, 2)))
      {
        Intrinsics.checkNotNullExpressionValue(localObject, "java.lang.String.format(format, *args)");
        break label383;
        if (!(paramView instanceof TimePicker)) {
          break;
        }
        localObject = ((TimePicker)paramView).getCurrentHour();
        Intrinsics.checkNotNullExpressionValue(localObject, "view.currentHour");
        k = ((Number)localObject).intValue();
        paramView = ((TimePicker)paramView).getCurrentMinute();
        Intrinsics.checkNotNullExpressionValue(paramView, "view.currentMinute");
        i = paramView.intValue();
        paramView = x.a;
      }
      if ((paramView instanceof RadioGroup))
      {
        j = ((RadioGroup)paramView).getCheckedRadioButtonId();
        int m = ((RadioGroup)paramView).getChildCount();
        if (m > 0) {
          for (;;)
          {
            k = i + 1;
            localObject = ((RadioGroup)paramView).getChildAt(i);
            if ((((View)localObject).getId() == j) && ((localObject instanceof RadioButton)))
            {
              localObject = ((RadioButton)localObject).getText();
              break label383;
            }
            if (k >= m) {
              break;
            }
            i = k;
          }
        }
      }
      else if ((paramView instanceof RatingBar))
      {
        localObject = String.valueOf(((RatingBar)paramView).getRating());
        break label383;
      }
    }
    Object localObject = null;
    label383:
    paramView = "";
    if (localObject != null)
    {
      localObject = localObject.toString();
      if (localObject != null) {
        paramView = (View)localObject;
      }
    }
    return paramView;
    label409:
    a.b(paramView, f.class);
    return null;
  }
  
  public static final boolean o(View paramView)
  {
    boolean bool1 = a.d(f.class);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      paramView = paramView.getParent();
      if ((paramView instanceof AdapterView)) {
        return true;
      }
      localObject = a;
      Class localClass = ((f)localObject).f("android.support.v4.view.NestedScrollingChild");
      if ((localClass != null) && (localClass.isInstance(paramView))) {
        return true;
      }
    }
    finally
    {
      break label93;
      Object localObject = ((f)localObject).f("androidx.core.view.NestedScrollingChild");
      bool1 = bool2;
      if (localObject != null)
      {
        boolean bool3 = ((Class)localObject).isInstance(paramView);
        bool1 = bool2;
        if (bool3) {
          bool1 = true;
        }
      }
      return bool1;
      label93:
      a.b(paramView, f.class);
    }
    return false;
  }
  
  /* Error */
  public static final void r(View paramView, View.OnClickListener paramOnClickListener)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 42	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: aload_0
    //   10: ldc 75
    //   12: invokestatic 81	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aconst_null
    //   16: astore_2
    //   17: ldc -72
    //   19: invokestatic 188	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   22: ldc -66
    //   24: invokevirtual 194	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   27: astore_3
    //   28: ldc -49
    //   30: invokestatic 188	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   33: ldc -47
    //   35: invokevirtual 194	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   38: astore 4
    //   40: goto +13 -> 53
    //   43: astore_0
    //   44: goto +69 -> 113
    //   47: astore_3
    //   48: aconst_null
    //   49: astore_3
    //   50: aconst_null
    //   51: astore 4
    //   53: aload_3
    //   54: ifnull +53 -> 107
    //   57: aload 4
    //   59: ifnonnull +6 -> 65
    //   62: goto +45 -> 107
    //   65: aload_3
    //   66: iconst_1
    //   67: invokevirtual 200	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   70: aload 4
    //   72: iconst_1
    //   73: invokevirtual 200	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   76: aload_3
    //   77: iconst_1
    //   78: invokevirtual 200	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   81: aload_3
    //   82: aload_0
    //   83: invokevirtual 205	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   86: astore_3
    //   87: aload_3
    //   88: ifnonnull +9 -> 97
    //   91: aload_0
    //   92: aload_1
    //   93: invokevirtual 361	android/view/View:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   96: return
    //   97: aload 4
    //   99: aload_3
    //   100: aload_1
    //   101: invokevirtual 365	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   104: goto +8 -> 112
    //   107: aload_0
    //   108: aload_1
    //   109: invokevirtual 361	android/view/View:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   112: return
    //   113: aload_0
    //   114: ldc 2
    //   116: invokestatic 55	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   119: return
    //   120: astore_0
    //   121: goto -9 -> 112
    //   124: astore 4
    //   126: goto -76 -> 50
    //   129: astore_3
    //   130: aload_2
    //   131: astore_3
    //   132: goto -45 -> 87
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	135	0	paramView	View
    //   0	135	1	paramOnClickListener	View.OnClickListener
    //   16	115	2	localObject1	Object
    //   27	1	3	localField1	Field
    //   47	1	3	localClassNotFoundException1	ClassNotFoundException
    //   49	51	3	localObject2	Object
    //   129	1	3	localIllegalAccessException	IllegalAccessException
    //   131	1	3	localObject3	Object
    //   38	60	4	localField2	Field
    //   124	1	4	localClassNotFoundException2	ClassNotFoundException
    // Exception table:
    //   from	to	target	type
    //   9	15	43	finally
    //   17	28	43	finally
    //   28	40	43	finally
    //   65	76	43	finally
    //   76	87	43	finally
    //   91	96	43	finally
    //   97	104	43	finally
    //   107	112	43	finally
    //   17	28	47	java/lang/ClassNotFoundException
    //   17	28	47	java/lang/NoSuchFieldException
    //   17	28	120	java/lang/Exception
    //   28	40	120	java/lang/Exception
    //   65	76	120	java/lang/Exception
    //   76	87	120	java/lang/Exception
    //   91	96	120	java/lang/Exception
    //   97	104	120	java/lang/Exception
    //   107	112	120	java/lang/Exception
    //   28	40	124	java/lang/ClassNotFoundException
    //   28	40	124	java/lang/NoSuchFieldException
    //   76	87	129	java/lang/IllegalAccessException
  }
  
  /* Error */
  public static final void s(View paramView, JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 42	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: aload_0
    //   10: ldc 75
    //   12: invokestatic 81	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: ldc_w 367
    //   19: invokestatic 81	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   22: aload_0
    //   23: invokestatic 369	C1/f:k	(Landroid/view/View;)Ljava/lang/String;
    //   26: astore_2
    //   27: aload_0
    //   28: invokestatic 371	C1/f:i	(Landroid/view/View;)Ljava/lang/String;
    //   31: astore_3
    //   32: aload_0
    //   33: invokevirtual 374	android/view/View:getTag	()Ljava/lang/Object;
    //   36: astore 4
    //   38: aload_0
    //   39: invokevirtual 377	android/view/View:getContentDescription	()Ljava/lang/CharSequence;
    //   42: astore 5
    //   44: aload_1
    //   45: ldc_w 379
    //   48: aload_0
    //   49: invokevirtual 127	java/lang/Object:getClass	()Ljava/lang/Class;
    //   52: invokevirtual 25	java/lang/Class:getCanonicalName	()Ljava/lang/String;
    //   55: invokevirtual 166	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   58: pop
    //   59: aload_1
    //   60: ldc_w 381
    //   63: aload_0
    //   64: invokestatic 383	C1/f:c	(Landroid/view/View;)I
    //   67: invokevirtual 386	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   70: pop
    //   71: aload_1
    //   72: ldc_w 388
    //   75: aload_0
    //   76: invokevirtual 334	android/view/View:getId	()I
    //   79: invokevirtual 386	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   82: pop
    //   83: aload_0
    //   84: invokestatic 392	C1/d:g	(Landroid/view/View;)Z
    //   87: istore 6
    //   89: iload 6
    //   91: ifne +31 -> 122
    //   94: aload_1
    //   95: ldc_w 394
    //   98: aload_2
    //   99: invokestatic 398	O1/P:F0	(Ljava/lang/String;)Ljava/lang/String;
    //   102: ldc -13
    //   104: invokestatic 401	O1/P:k	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   107: invokevirtual 166	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   110: pop
    //   111: goto +30 -> 141
    //   114: astore_0
    //   115: goto +125 -> 240
    //   118: astore_0
    //   119: goto +109 -> 228
    //   122: aload_1
    //   123: ldc_w 394
    //   126: ldc -13
    //   128: invokevirtual 166	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   131: pop
    //   132: aload_1
    //   133: ldc_w 403
    //   136: iconst_1
    //   137: invokevirtual 406	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   140: pop
    //   141: aload_1
    //   142: ldc_w 408
    //   145: aload_3
    //   146: invokestatic 398	O1/P:F0	(Ljava/lang/String;)Ljava/lang/String;
    //   149: ldc -13
    //   151: invokestatic 401	O1/P:k	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   154: invokevirtual 166	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   157: pop
    //   158: aload 4
    //   160: ifnull +24 -> 184
    //   163: aload_1
    //   164: ldc_w 410
    //   167: aload 4
    //   169: invokevirtual 246	java/lang/Object:toString	()Ljava/lang/String;
    //   172: invokestatic 398	O1/P:F0	(Ljava/lang/String;)Ljava/lang/String;
    //   175: ldc -13
    //   177: invokestatic 401	O1/P:k	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   180: invokevirtual 166	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   183: pop
    //   184: aload 5
    //   186: ifnull +24 -> 210
    //   189: aload_1
    //   190: ldc_w 412
    //   193: aload 5
    //   195: invokevirtual 246	java/lang/Object:toString	()Ljava/lang/String;
    //   198: invokestatic 398	O1/P:F0	(Ljava/lang/String;)Ljava/lang/String;
    //   201: ldc -13
    //   203: invokestatic 401	O1/P:k	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   206: invokevirtual 166	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   209: pop
    //   210: aload_1
    //   211: ldc_w 414
    //   214: getstatic 19	C1/f:a	LC1/f;
    //   217: aload_0
    //   218: invokevirtual 416	C1/f:e	(Landroid/view/View;)Lorg/json/JSONObject;
    //   221: invokevirtual 166	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   224: pop
    //   225: goto +14 -> 239
    //   228: getstatic 231	O1/P:a	LO1/P;
    //   231: astore_1
    //   232: getstatic 27	C1/f:b	Ljava/lang/String;
    //   235: aload_0
    //   236: invokestatic 235	O1/P:i0	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   239: return
    //   240: aload_0
    //   241: ldc 2
    //   243: invokestatic 55	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   246: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	247	0	paramView	View
    //   0	247	1	paramJSONObject	JSONObject
    //   26	73	2	str1	String
    //   31	115	3	str2	String
    //   36	132	4	localObject	Object
    //   42	152	5	localCharSequence	CharSequence
    //   87	3	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   9	22	114	finally
    //   22	89	114	finally
    //   94	111	114	finally
    //   122	141	114	finally
    //   141	158	114	finally
    //   163	184	114	finally
    //   189	210	114	finally
    //   210	225	114	finally
    //   228	239	114	finally
    //   22	89	118	org/json/JSONException
    //   94	111	118	org/json/JSONException
    //   122	141	118	org/json/JSONException
    //   141	158	118	org/json/JSONException
    //   163	184	118	org/json/JSONException
    //   189	210	118	org/json/JSONException
    //   210	225	118	org/json/JSONException
  }
  
  /* Error */
  public final JSONObject e(View paramView)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 42	T1/a:d	(Ljava/lang/Object;)Z
    //   4: ifeq +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: new 137	org/json/JSONObject
    //   12: astore_2
    //   13: aload_2
    //   14: invokespecial 138	org/json/JSONObject:<init>	()V
    //   17: aload_2
    //   18: ldc_w 418
    //   21: aload_1
    //   22: invokevirtual 421	android/view/View:getTop	()I
    //   25: invokevirtual 386	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   28: pop
    //   29: aload_2
    //   30: ldc_w 423
    //   33: aload_1
    //   34: invokevirtual 426	android/view/View:getLeft	()I
    //   37: invokevirtual 386	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   40: pop
    //   41: aload_2
    //   42: ldc_w 428
    //   45: aload_1
    //   46: invokevirtual 431	android/view/View:getWidth	()I
    //   49: invokevirtual 386	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   52: pop
    //   53: aload_2
    //   54: ldc_w 433
    //   57: aload_1
    //   58: invokevirtual 436	android/view/View:getHeight	()I
    //   61: invokevirtual 386	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   64: pop
    //   65: aload_2
    //   66: ldc_w 438
    //   69: aload_1
    //   70: invokevirtual 441	android/view/View:getScrollX	()I
    //   73: invokevirtual 386	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   76: pop
    //   77: aload_2
    //   78: ldc_w 443
    //   81: aload_1
    //   82: invokevirtual 446	android/view/View:getScrollY	()I
    //   85: invokevirtual 386	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   88: pop
    //   89: aload_2
    //   90: ldc_w 448
    //   93: aload_1
    //   94: invokevirtual 451	android/view/View:getVisibility	()I
    //   97: invokevirtual 386	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   100: pop
    //   101: goto +19 -> 120
    //   104: astore_1
    //   105: goto +17 -> 122
    //   108: astore_1
    //   109: getstatic 27	C1/f:b	Ljava/lang/String;
    //   112: ldc_w 453
    //   115: aload_1
    //   116: invokestatic 174	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   119: pop
    //   120: aload_2
    //   121: areturn
    //   122: aload_1
    //   123: aload_0
    //   124: invokestatic 55	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   127: aconst_null
    //   128: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	129	0	this	f
    //   0	129	1	paramView	View
    //   12	109	2	localJSONObject	JSONObject
    // Exception table:
    //   from	to	target	type
    //   9	17	104	finally
    //   17	101	104	finally
    //   109	120	104	finally
    //   17	101	108	org/json/JSONException
  }
  
  /* Error */
  public final Class f(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 42	T1/a:d	(Ljava/lang/Object;)Z
    //   4: istore_2
    //   5: aconst_null
    //   6: astore_3
    //   7: iload_2
    //   8: ifeq +5 -> 13
    //   11: aconst_null
    //   12: areturn
    //   13: aload_1
    //   14: invokestatic 188	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   17: astore_1
    //   18: goto +11 -> 29
    //   21: astore_1
    //   22: aload_1
    //   23: aload_0
    //   24: invokestatic 55	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   27: aload_3
    //   28: astore_1
    //   29: aload_1
    //   30: areturn
    //   31: astore_1
    //   32: aload_3
    //   33: astore_1
    //   34: goto -5 -> 29
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	37	0	this	f
    //   0	37	1	paramString	String
    //   4	4	2	bool	boolean
    //   6	27	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   13	18	21	finally
    //   13	18	31	java/lang/ClassNotFoundException
  }
  
  public final View l(float[] paramArrayOfFloat, View paramView)
  {
    if (a.d(this)) {
      return null;
    }
    try
    {
      n();
      Method localMethod = d;
      if ((localMethod == null) || (paramView == null) || (localMethod != null)) {}
      label92:
      label105:
      label134:
      label161:
      label163:
      return null;
    }
    finally
    {
      try
      {
        paramArrayOfFloat = localMethod.invoke(null, new Object[] { paramArrayOfFloat, paramView });
        if (paramArrayOfFloat == null) {
          break label105;
        }
        paramArrayOfFloat = (View)paramArrayOfFloat;
        if (paramArrayOfFloat.getId() <= 0) {
          break label161;
        }
        paramArrayOfFloat = paramArrayOfFloat.getParent();
        if (paramArrayOfFloat == null) {
          break label92;
        }
        return (View)paramArrayOfFloat;
      }
      catch (InvocationTargetException paramArrayOfFloat)
      {
        break label134;
      }
      catch (IllegalAccessException paramArrayOfFloat) {}
      paramArrayOfFloat = finally;
      break label163;
      paramArrayOfFloat = new java/lang/NullPointerException;
      paramArrayOfFloat.<init>("null cannot be cast to non-null type android.view.View");
      throw paramArrayOfFloat;
      paramArrayOfFloat = new java/lang/NullPointerException;
      paramArrayOfFloat.<init>("null cannot be cast to non-null type android.view.View");
      throw paramArrayOfFloat;
      paramArrayOfFloat = new java/lang/IllegalStateException;
      paramArrayOfFloat.<init>("Required value was null.".toString());
      throw paramArrayOfFloat;
      paramView = P.a;
      for (paramView = b;; paramView = b)
      {
        P.i0(paramView, paramArrayOfFloat);
        break;
        paramView = P.a;
      }
      return null;
      a.b(paramArrayOfFloat, this);
    }
  }
  
  public final float[] m(View paramView)
  {
    if (a.d(this)) {
      return null;
    }
    try
    {
      int[] arrayOfInt = new int[2];
      paramView.getLocationOnScreen(arrayOfInt);
      float f1 = arrayOfInt[0];
      float f2 = arrayOfInt[1];
      return new float[] { f1, f2 };
    }
    finally
    {
      a.b(paramView, this);
    }
    return null;
  }
  
  public final void n()
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      Method localMethod = d;
      if (localMethod != null) {
        return;
      }
      localIllegalStateException = new java/lang/IllegalStateException;
    }
    finally
    {
      try
      {
        localMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", new Class[] { float[].class, ViewGroup.class });
        d = localMethod;
        if (localMethod == null) {
          break label73;
        }
        localMethod.setAccessible(true);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        break label89;
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        break label105;
      }
      localObject1 = finally;
      break label117;
    }
    label73:
    IllegalStateException localIllegalStateException;
    localIllegalStateException.<init>("Required value was null.".toString());
    throw localIllegalStateException;
    label89:
    Object localObject2 = P.a;
    for (localObject2 = b;; localObject2 = b)
    {
      P.i0((String)localObject2, localIllegalStateException);
      break;
      label105:
      localObject2 = P.a;
    }
    return;
    label117:
    a.b(localIllegalStateException, this);
  }
  
  public final boolean p(View paramView1, View paramView2)
  {
    boolean bool1 = a.d(this);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramView1, "view");
      bool1 = bool2;
      if (Intrinsics.a(paramView1.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup"))
      {
        paramView2 = l(m(paramView1), paramView2);
        bool1 = bool2;
        if (paramView2 != null)
        {
          int i = paramView2.getId();
          int j = paramView1.getId();
          bool1 = bool2;
          if (i == j) {
            bool1 = true;
          }
        }
      }
    }
    finally
    {
      break label90;
    }
    return bool1;
    label90:
    a.b(paramView1, this);
    return false;
  }
  
  public final boolean q(View paramView)
  {
    if (a.d(this)) {
      return false;
    }
    try
    {
      boolean bool = Intrinsics.a(paramView.getClass().getName(), "com.facebook.react.ReactRootView");
      return bool;
    }
    finally
    {
      a.b(paramView, this);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     C1.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */