package K1;

import C1.f;
import T1.a;
import W5.m;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class c
{
  public static final c a = new c();
  public static final List b = m.i(new Class[] { Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class });
  
  public static final List a(View paramView)
  {
    if (a.d(c.class)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramView, "view");
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator = b.iterator();
      while (localIterator.hasNext()) {
        if (((Class)localIterator.next()).isInstance(paramView)) {
          return localArrayList;
        }
      }
    }
    finally
    {
      ArrayList localArrayList;
      break label125;
      if (paramView.isClickable()) {
        localArrayList.add(paramView);
      }
      paramView = f.b(paramView).iterator();
      while (paramView.hasNext()) {
        localArrayList.addAll((Collection)a((View)paramView.next()));
      }
      return localArrayList;
      label125:
      a.b(paramView, c.class);
    }
    return null;
  }
  
  /* Error */
  public static final org.json.JSONObject b(View paramView1, View paramView2)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 50	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +5 -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: aload_0
    //   11: ldc 52
    //   13: invokestatic 58	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   16: aload_1
    //   17: ldc 108
    //   19: invokestatic 58	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   22: new 110	org/json/JSONObject
    //   25: astore_2
    //   26: aload_2
    //   27: invokespecial 111	org/json/JSONObject:<init>	()V
    //   30: aload_0
    //   31: aload_1
    //   32: if_acmpne +18 -> 50
    //   35: aload_2
    //   36: ldc 113
    //   38: iconst_1
    //   39: invokevirtual 117	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   42: pop
    //   43: goto +7 -> 50
    //   46: astore_0
    //   47: goto +66 -> 113
    //   50: aload_0
    //   51: aload_2
    //   52: invokestatic 121	K1/c:e	(Landroid/view/View;Lorg/json/JSONObject;)V
    //   55: new 123	org/json/JSONArray
    //   58: astore_3
    //   59: aload_3
    //   60: invokespecial 124	org/json/JSONArray:<init>	()V
    //   63: aload_0
    //   64: invokestatic 92	C1/f:b	(Landroid/view/View;)Ljava/util/List;
    //   67: invokeinterface 67 1 0
    //   72: astore_0
    //   73: aload_0
    //   74: invokeinterface 73 1 0
    //   79: ifeq +24 -> 103
    //   82: aload_3
    //   83: aload_0
    //   84: invokeinterface 77 1 0
    //   89: checkcast 82	android/view/View
    //   92: aload_1
    //   93: invokestatic 126	K1/c:b	(Landroid/view/View;Landroid/view/View;)Lorg/json/JSONObject;
    //   96: invokevirtual 129	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   99: pop
    //   100: goto -27 -> 73
    //   103: aload_2
    //   104: ldc -125
    //   106: aload_3
    //   107: invokevirtual 134	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   110: pop
    //   111: aload_2
    //   112: areturn
    //   113: aload_0
    //   114: ldc 2
    //   116: invokestatic 103	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   119: aconst_null
    //   120: areturn
    //   121: astore_0
    //   122: goto -11 -> 111
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	125	0	paramView1	View
    //   0	125	1	paramView2	View
    //   25	87	2	localJSONObject	org.json.JSONObject
    //   58	49	3	localJSONArray	org.json.JSONArray
    // Exception table:
    //   from	to	target	type
    //   10	30	46	finally
    //   35	43	46	finally
    //   50	73	46	finally
    //   73	100	46	finally
    //   103	111	46	finally
    //   35	43	121	org/json/JSONException
    //   50	73	121	org/json/JSONException
    //   73	100	121	org/json/JSONException
    //   103	111	121	org/json/JSONException
  }
  
  public static final String d(View paramView)
  {
    if (a.d(c.class)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramView, "hostView");
      String str = f.k(paramView);
      if (str.length() > 0) {
        return str;
      }
      paramView = TextUtils.join(" ", (Iterable)a.c(paramView));
      return paramView;
    }
    finally
    {
      a.b(paramView, c.class);
    }
    return null;
  }
  
  /* Error */
  public static final void e(View paramView, org.json.JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 50	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: aload_0
    //   10: ldc 52
    //   12: invokestatic 58	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: ldc -90
    //   18: invokestatic 58	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   21: aload_0
    //   22: invokestatic 140	C1/f:k	(Landroid/view/View;)Ljava/lang/String;
    //   25: astore_2
    //   26: aload_0
    //   27: invokestatic 168	C1/f:i	(Landroid/view/View;)Ljava/lang/String;
    //   30: astore_3
    //   31: aload_1
    //   32: ldc -86
    //   34: aload_0
    //   35: invokevirtual 174	java/lang/Object:getClass	()Ljava/lang/Class;
    //   38: invokevirtual 178	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   41: invokevirtual 134	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   44: pop
    //   45: aload_1
    //   46: ldc -76
    //   48: aload_0
    //   49: invokestatic 183	C1/f:c	(Landroid/view/View;)I
    //   52: invokevirtual 186	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   55: pop
    //   56: aload_2
    //   57: invokeinterface 146 1 0
    //   62: ifle +18 -> 80
    //   65: aload_1
    //   66: ldc -68
    //   68: aload_2
    //   69: invokevirtual 134	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   72: pop
    //   73: goto +7 -> 80
    //   76: astore_0
    //   77: goto +42 -> 119
    //   80: aload_3
    //   81: invokeinterface 146 1 0
    //   86: ifle +11 -> 97
    //   89: aload_1
    //   90: ldc -66
    //   92: aload_3
    //   93: invokevirtual 134	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   96: pop
    //   97: aload_0
    //   98: instanceof 31
    //   101: ifeq +17 -> 118
    //   104: aload_1
    //   105: ldc -64
    //   107: aload_0
    //   108: checkcast 31	android/widget/EditText
    //   111: invokevirtual 197	android/widget/TextView:getInputType	()I
    //   114: invokevirtual 186	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   117: pop
    //   118: return
    //   119: aload_0
    //   120: ldc 2
    //   122: invokestatic 103	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   125: return
    //   126: astore_0
    //   127: goto -9 -> 118
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	paramView	View
    //   0	130	1	paramJSONObject	org.json.JSONObject
    //   25	44	2	str1	String
    //   30	63	3	str2	String
    // Exception table:
    //   from	to	target	type
    //   9	21	76	finally
    //   21	73	76	finally
    //   80	97	76	finally
    //   97	118	76	finally
    //   21	73	126	org/json/JSONException
    //   80	97	126	org/json/JSONException
    //   97	118	126	org/json/JSONException
  }
  
  public final List c(View paramView)
  {
    if (a.d(this)) {
      return null;
    }
    ArrayList localArrayList;
    for (;;)
    {
      try
      {
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        Iterator localIterator = f.b(paramView).iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        paramView = (View)localIterator.next();
        String str = f.k(paramView);
        if (str.length() > 0) {
          localArrayList.add(str);
        }
      }
      finally
      {
        break label98;
      }
      localArrayList.addAll((Collection)c(paramView));
    }
    return localArrayList;
    label98:
    a.b(paramView, this);
    return null;
  }
}

/* Location:
 * Qualified Name:     K1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */