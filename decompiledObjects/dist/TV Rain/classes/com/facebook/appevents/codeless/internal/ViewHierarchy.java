package com.facebook.appevents.codeless.internal;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
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
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class ViewHierarchy
{
  private static final String CLASS_RCTROOTVIEW = "com.facebook.react.ReactRootView";
  private static final String CLASS_RCTTEXTVIEW = "com.facebook.react.views.view.ReactTextView";
  private static final String CLASS_RCTVIEWGROUP = "com.facebook.react.views.view.ReactViewGroup";
  private static final String CLASS_TOUCHTARGETHELPER = "com.facebook.react.uimanager.TouchTargetHelper";
  private static final int ICON_MAX_EDGE_LENGTH = 44;
  private static final String METHOD_FIND_TOUCHTARGET_VIEW = "findTouchTargetView";
  private static WeakReference<View> RCTRootViewReference = new WeakReference(null);
  private static final String TAG = "com.facebook.appevents.codeless.internal.ViewHierarchy";
  @Nullable
  private static Method methodFindTouchTargetView = null;
  
  @Nullable
  public static View findRCTRootView(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(ViewHierarchy.class)) {
      return null;
    }
    for (;;)
    {
      if (paramView != null) {
        try
        {
          if (isRCTRootView(paramView)) {
            return paramView;
          }
          paramView = paramView.getParent();
          if ((paramView instanceof View)) {
            paramView = (View)paramView;
          }
        }
        finally
        {
          CrashShieldHandler.handleThrowable(paramView, ViewHierarchy.class);
        }
      }
    }
    return null;
  }
  
  public static List<View> getChildrenOfView(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(ViewHierarchy.class)) {
      return null;
    }
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        int i = paramView.getChildCount();
        for (int j = 0; j < i; j++) {
          localArrayList.add(paramView.getChildAt(j));
        }
      }
      return localArrayList;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, ViewHierarchy.class);
    }
    return null;
  }
  
  public static int getClassTypeBitmask(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(ViewHierarchy.class)) {
      return 0;
    }
    try
    {
      if ((paramView instanceof ImageView)) {
        i = 2;
      } else {
        i = 0;
      }
      int j = i;
      if (paramView.isClickable()) {
        j = i | 0x20;
      }
      int i = j;
      if (isAdapterViewItem(paramView)) {
        i = j | 0x200;
      }
      if ((paramView instanceof TextView))
      {
        j = i | 0x400 | 0x1;
        i = j;
        if ((paramView instanceof Button))
        {
          j |= 0x4;
          if ((paramView instanceof Switch))
          {
            i = j | 0x2000;
          }
          else
          {
            i = j;
            if ((paramView instanceof CheckBox)) {
              i = j | 0x8000;
            }
          }
        }
        j = i;
        if ((paramView instanceof EditText)) {
          j = i | 0x800;
        }
      }
      else if ((!(paramView instanceof Spinner)) && (!(paramView instanceof DatePicker)))
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
            boolean bool = isRCTButton(paramView, (View)RCTRootViewReference.get());
            j = i;
            if (bool) {
              j = i | 0x40;
            }
          }
        }
      }
      else
      {
        j = i | 0x1000;
      }
      return j;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, ViewHierarchy.class);
    }
    return 0;
  }
  
  public static JSONObject getDictionaryOfView(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(ViewHierarchy.class)) {
      return null;
    }
    try
    {
      if (paramView.getClass().getName().equals("com.facebook.react.ReactRootView"))
      {
        localObject = new java/lang/ref/WeakReference;
        ((WeakReference)localObject).<init>(paramView);
        RCTRootViewReference = (WeakReference)localObject;
      }
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>();
      try
      {
        updateBasicInfoOfView(paramView, (JSONObject)localObject);
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>();
        paramView = getChildrenOfView(paramView);
        for (int i = 0; i < paramView.size(); i++) {
          localJSONArray.put(getDictionaryOfView((View)paramView.get(i)));
        }
        ((JSONObject)localObject).put("childviews", localJSONArray);
      }
      catch (JSONException paramView)
      {
        Log.e(TAG, "Failed to create JSONObject for view.", paramView);
      }
      return (JSONObject)localObject;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, ViewHierarchy.class);
    }
    return null;
  }
  
  private static JSONObject getDimensionOfView(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(ViewHierarchy.class)) {
      return null;
    }
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      try
      {
        localJSONObject.put("top", paramView.getTop());
        localJSONObject.put("left", paramView.getLeft());
        localJSONObject.put("width", paramView.getWidth());
        localJSONObject.put("height", paramView.getHeight());
        localJSONObject.put("scrollx", paramView.getScrollX());
        localJSONObject.put("scrolly", paramView.getScrollY());
        localJSONObject.put("visibility", paramView.getVisibility());
      }
      catch (JSONException paramView)
      {
        Log.e(TAG, "Failed to create JSONObject for dimension.", paramView);
      }
      return localJSONObject;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, ViewHierarchy.class);
    }
    return null;
  }
  
  /* Error */
  private static Class<?> getExistingClass(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 59	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +5 -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: aload_0
    //   11: invokestatic 243	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   14: astore_0
    //   15: aload_0
    //   16: areturn
    //   17: astore_0
    //   18: aload_0
    //   19: ldc 2
    //   21: invokestatic 73	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   24: aconst_null
    //   25: areturn
    //   26: astore_0
    //   27: goto -3 -> 24
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	30	0	paramString	String
    // Exception table:
    //   from	to	target	type
    //   10	15	17	finally
    //   10	15	26	java/lang/ClassNotFoundException
  }
  
  /* Error */
  @Nullable
  public static android.view.View.OnClickListener getExistingOnClickListener(View paramView)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 59	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: istore_1
    //   6: aconst_null
    //   7: astore_2
    //   8: iload_1
    //   9: ifeq +5 -> 14
    //   12: aconst_null
    //   13: areturn
    //   14: ldc -4
    //   16: invokestatic 243	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   19: ldc -2
    //   21: invokevirtual 258	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   24: astore_3
    //   25: aload_3
    //   26: ifnull +8 -> 34
    //   29: aload_3
    //   30: iconst_1
    //   31: invokevirtual 264	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   34: aload_3
    //   35: aload_0
    //   36: invokevirtual 269	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   39: astore 4
    //   41: aload 4
    //   43: ifnonnull +5 -> 48
    //   46: aconst_null
    //   47: areturn
    //   48: ldc_w 271
    //   51: invokestatic 243	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   54: ldc_w 273
    //   57: invokevirtual 258	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   60: astore_3
    //   61: aload_2
    //   62: astore_0
    //   63: aload_3
    //   64: ifnull +18 -> 82
    //   67: aload_3
    //   68: iconst_1
    //   69: invokevirtual 264	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   72: aload_3
    //   73: aload 4
    //   75: invokevirtual 269	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   78: checkcast 275	android/view/View$OnClickListener
    //   81: astore_0
    //   82: aload_0
    //   83: areturn
    //   84: astore_0
    //   85: aload_0
    //   86: ldc 2
    //   88: invokestatic 73	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   91: aconst_null
    //   92: areturn
    //   93: astore_0
    //   94: goto -3 -> 91
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	97	0	paramView	View
    //   5	4	1	bool	boolean
    //   7	55	2	localObject1	Object
    //   24	49	3	localField	java.lang.reflect.Field
    //   39	35	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   14	25	84	finally
    //   29	34	84	finally
    //   34	41	84	finally
    //   48	61	84	finally
    //   67	82	84	finally
    //   14	25	93	java/lang/NoSuchFieldException
    //   14	25	93	java/lang/ClassNotFoundException
    //   14	25	93	java/lang/IllegalAccessException
    //   29	34	93	java/lang/NoSuchFieldException
    //   29	34	93	java/lang/ClassNotFoundException
    //   29	34	93	java/lang/IllegalAccessException
    //   34	41	93	java/lang/NoSuchFieldException
    //   34	41	93	java/lang/ClassNotFoundException
    //   34	41	93	java/lang/IllegalAccessException
    //   48	61	93	java/lang/NoSuchFieldException
    //   48	61	93	java/lang/ClassNotFoundException
    //   48	61	93	java/lang/IllegalAccessException
    //   67	82	93	java/lang/NoSuchFieldException
    //   67	82	93	java/lang/ClassNotFoundException
    //   67	82	93	java/lang/IllegalAccessException
  }
  
  /* Error */
  @Nullable
  public static android.view.View.OnTouchListener getExistingOnTouchListener(View paramView)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 59	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: istore_1
    //   6: aconst_null
    //   7: astore_2
    //   8: iload_1
    //   9: ifeq +5 -> 14
    //   12: aconst_null
    //   13: areturn
    //   14: ldc -4
    //   16: invokestatic 243	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   19: ldc -2
    //   21: invokevirtual 258	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   24: astore_3
    //   25: aload_3
    //   26: ifnull +8 -> 34
    //   29: aload_3
    //   30: iconst_1
    //   31: invokevirtual 264	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   34: aload_3
    //   35: aload_0
    //   36: invokevirtual 269	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   39: astore 4
    //   41: aload 4
    //   43: ifnonnull +5 -> 48
    //   46: aconst_null
    //   47: areturn
    //   48: ldc_w 271
    //   51: invokestatic 243	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   54: ldc_w 279
    //   57: invokevirtual 258	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   60: astore_3
    //   61: aload_2
    //   62: astore_0
    //   63: aload_3
    //   64: ifnull +18 -> 82
    //   67: aload_3
    //   68: iconst_1
    //   69: invokevirtual 264	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   72: aload_3
    //   73: aload 4
    //   75: invokevirtual 269	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   78: checkcast 281	android/view/View$OnTouchListener
    //   81: astore_0
    //   82: aload_0
    //   83: areturn
    //   84: astore_0
    //   85: goto +35 -> 120
    //   88: astore_0
    //   89: getstatic 187	com/facebook/appevents/codeless/internal/ViewHierarchy:TAG	Ljava/lang/String;
    //   92: aload_0
    //   93: invokestatic 287	com/facebook/internal/Utility:logd	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   96: goto +22 -> 118
    //   99: astore_0
    //   100: getstatic 187	com/facebook/appevents/codeless/internal/ViewHierarchy:TAG	Ljava/lang/String;
    //   103: aload_0
    //   104: invokestatic 287	com/facebook/internal/Utility:logd	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   107: goto +11 -> 118
    //   110: astore_0
    //   111: getstatic 187	com/facebook/appevents/codeless/internal/ViewHierarchy:TAG	Ljava/lang/String;
    //   114: aload_0
    //   115: invokestatic 287	com/facebook/internal/Utility:logd	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   118: aconst_null
    //   119: areturn
    //   120: aload_0
    //   121: ldc 2
    //   123: invokestatic 73	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   126: aconst_null
    //   127: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	128	0	paramView	View
    //   5	4	1	bool	boolean
    //   7	55	2	localObject1	Object
    //   24	49	3	localField	java.lang.reflect.Field
    //   39	35	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   14	25	84	finally
    //   29	34	84	finally
    //   34	41	84	finally
    //   48	61	84	finally
    //   67	82	84	finally
    //   89	96	84	finally
    //   100	107	84	finally
    //   111	118	84	finally
    //   14	25	88	java/lang/IllegalAccessException
    //   29	34	88	java/lang/IllegalAccessException
    //   34	41	88	java/lang/IllegalAccessException
    //   48	61	88	java/lang/IllegalAccessException
    //   67	82	88	java/lang/IllegalAccessException
    //   14	25	99	java/lang/ClassNotFoundException
    //   29	34	99	java/lang/ClassNotFoundException
    //   34	41	99	java/lang/ClassNotFoundException
    //   48	61	99	java/lang/ClassNotFoundException
    //   67	82	99	java/lang/ClassNotFoundException
    //   14	25	110	java/lang/NoSuchFieldException
    //   29	34	110	java/lang/NoSuchFieldException
    //   34	41	110	java/lang/NoSuchFieldException
    //   48	61	110	java/lang/NoSuchFieldException
    //   67	82	110	java/lang/NoSuchFieldException
  }
  
  public static String getHintOfView(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(ViewHierarchy.class)) {
      return null;
    }
    try
    {
      if ((paramView instanceof EditText)) {
        paramView = ((EditText)paramView).getHint();
      } else if ((paramView instanceof TextView)) {
        paramView = ((TextView)paramView).getHint();
      } else {
        paramView = null;
      }
      if (paramView == null) {
        paramView = "";
      } else {
        paramView = paramView.toString();
      }
      return paramView;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, ViewHierarchy.class);
    }
    return null;
  }
  
  @Nullable
  public static ViewGroup getParentOfView(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(ViewHierarchy.class)) {
      return null;
    }
    if (paramView == null) {
      return null;
    }
    try
    {
      paramView = paramView.getParent();
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        return paramView;
      }
      return null;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, ViewHierarchy.class);
    }
    return null;
  }
  
  public static String getTextOfView(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(ViewHierarchy.class)) {
      return null;
    }
    try
    {
      Object localObject;
      if ((paramView instanceof TextView))
      {
        localObject = ((TextView)paramView).getText();
        if (!(paramView instanceof Switch)) {
          break label299;
        }
        if (((Switch)paramView).isChecked()) {
          paramView = "1";
        }
      }
      for (paramView = "0";; paramView = paramView.toString())
      {
        localObject = paramView;
        break label299;
        if (!(paramView instanceof Spinner)) {
          break;
        }
        if (((Spinner)paramView).getCount() <= 0) {
          break label297;
        }
        paramView = ((Spinner)paramView).getSelectedItem();
        if (paramView == null) {
          break label297;
        }
      }
      boolean bool = paramView instanceof DatePicker;
      int i = 0;
      if (bool)
      {
        paramView = (DatePicker)paramView;
        localObject = String.format("%04d-%02d-%02d", new Object[] { Integer.valueOf(paramView.getYear()), Integer.valueOf(paramView.getMonth()), Integer.valueOf(paramView.getDayOfMonth()) });
      }
      else if ((paramView instanceof TimePicker))
      {
        paramView = (TimePicker)paramView;
        localObject = String.format("%02d:%02d", new Object[] { Integer.valueOf(paramView.getCurrentHour().intValue()), Integer.valueOf(paramView.getCurrentMinute().intValue()) });
      }
      else
      {
        if ((paramView instanceof RadioGroup))
        {
          localObject = (RadioGroup)paramView;
          int j = ((RadioGroup)localObject).getCheckedRadioButtonId();
          int k = ((ViewGroup)localObject).getChildCount();
          for (;;)
          {
            if (i >= k) {
              break label297;
            }
            paramView = ((ViewGroup)localObject).getChildAt(i);
            if ((paramView.getId() == j) && ((paramView instanceof RadioButton)))
            {
              paramView = ((RadioButton)paramView).getText();
              break;
            }
            i++;
          }
        }
        if ((paramView instanceof RatingBar)) {
          localObject = String.valueOf(((RatingBar)paramView).getRating());
        } else {
          label297:
          localObject = null;
        }
      }
      label299:
      if (localObject == null) {
        paramView = "";
      } else {
        paramView = localObject.toString();
      }
      return paramView;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, ViewHierarchy.class);
    }
    return null;
  }
  
  @Nullable
  public static View getTouchReactView(float[] paramArrayOfFloat, @Nullable View paramView)
  {
    boolean bool = CrashShieldHandler.isObjectCrashing(ViewHierarchy.class);
    Object localObject = null;
    if (bool) {
      return null;
    }
    try
    {
      initTouchTargetHelperMethods();
      Method localMethod = methodFindTouchTargetView;
      if ((localMethod != null) && (paramView != null)) {
        try
        {
          paramArrayOfFloat = (View)localMethod.invoke(null, new Object[] { paramArrayOfFloat, paramView });
          if ((paramArrayOfFloat != null) && (paramArrayOfFloat.getId() > 0))
          {
            paramView = (View)paramArrayOfFloat.getParent();
            paramArrayOfFloat = (float[])localObject;
            if (paramView != null) {
              paramArrayOfFloat = paramView;
            }
            return paramArrayOfFloat;
          }
        }
        catch (InvocationTargetException paramArrayOfFloat)
        {
          Utility.logd(TAG, paramArrayOfFloat);
        }
        catch (IllegalAccessException paramArrayOfFloat)
        {
          Utility.logd(TAG, paramArrayOfFloat);
        }
      }
      return null;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramArrayOfFloat, ViewHierarchy.class);
    }
    return null;
  }
  
  private static float[] getViewLocationOnScreen(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(ViewHierarchy.class)) {
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
      CrashShieldHandler.handleThrowable(paramView, ViewHierarchy.class);
    }
    return null;
  }
  
  private static void initTouchTargetHelperMethods()
  {
    if (CrashShieldHandler.isObjectCrashing(ViewHierarchy.class)) {
      return;
    }
    try
    {
      Method localMethod = methodFindTouchTargetView;
      if (localMethod != null) {
        return;
      }
      try
      {
        localMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", new Class[] { float[].class, ViewGroup.class });
        methodFindTouchTargetView = localMethod;
        localMethod.setAccessible(true);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        Utility.logd(TAG, localNoSuchMethodException);
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        Utility.logd(TAG, localClassNotFoundException);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, ViewHierarchy.class);
    }
  }
  
  private static boolean isAdapterViewItem(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(ViewHierarchy.class)) {
      return false;
    }
    try
    {
      paramView = paramView.getParent();
      if ((paramView instanceof AdapterView)) {
        return true;
      }
      Class localClass = getExistingClass("android.support.v4.view.NestedScrollingChild");
      if ((localClass != null) && (localClass.isInstance(paramView))) {
        return true;
      }
      localClass = getExistingClass("androidx.core.view.NestedScrollingChild");
      if (localClass != null)
      {
        boolean bool = localClass.isInstance(paramView);
        if (bool) {
          return true;
        }
      }
      return false;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, ViewHierarchy.class);
    }
    return false;
  }
  
  public static boolean isRCTButton(View paramView1, @Nullable View paramView2)
  {
    boolean bool1 = CrashShieldHandler.isObjectCrashing(ViewHierarchy.class);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    bool1 = bool2;
    try
    {
      if (paramView1.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup"))
      {
        paramView2 = getTouchReactView(getViewLocationOnScreen(paramView1), paramView2);
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
      return bool1;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView1, ViewHierarchy.class);
    }
    return false;
  }
  
  public static boolean isRCTRootView(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(ViewHierarchy.class)) {
      return false;
    }
    try
    {
      boolean bool = paramView.getClass().getName().equals("com.facebook.react.ReactRootView");
      return bool;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, ViewHierarchy.class);
    }
    return false;
  }
  
  public static boolean isRCTTextView(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(ViewHierarchy.class)) {
      return false;
    }
    try
    {
      boolean bool = paramView.getClass().getName().equals("com.facebook.react.views.view.ReactTextView");
      return bool;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, ViewHierarchy.class);
    }
    return false;
  }
  
  public static boolean isRCTViewGroup(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(ViewHierarchy.class)) {
      return false;
    }
    try
    {
      boolean bool = paramView.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup");
      return bool;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, ViewHierarchy.class);
    }
    return false;
  }
  
  /* Error */
  public static void setOnClickListener(View paramView, android.view.View.OnClickListener paramOnClickListener)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 59	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: aconst_null
    //   10: astore_2
    //   11: ldc -4
    //   13: invokestatic 243	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   16: ldc -2
    //   18: invokevirtual 258	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   21: astore_3
    //   22: ldc_w 271
    //   25: invokestatic 243	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   28: ldc_w 273
    //   31: invokevirtual 258	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   34: astore 4
    //   36: goto +13 -> 49
    //   39: astore_0
    //   40: goto +69 -> 109
    //   43: astore_3
    //   44: aconst_null
    //   45: astore_3
    //   46: aconst_null
    //   47: astore 4
    //   49: aload_3
    //   50: ifnull +53 -> 103
    //   53: aload 4
    //   55: ifnonnull +6 -> 61
    //   58: goto +45 -> 103
    //   61: aload_3
    //   62: iconst_1
    //   63: invokevirtual 264	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   66: aload 4
    //   68: iconst_1
    //   69: invokevirtual 264	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   72: aload_3
    //   73: iconst_1
    //   74: invokevirtual 264	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   77: aload_3
    //   78: aload_0
    //   79: invokevirtual 269	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   82: astore_3
    //   83: aload_3
    //   84: ifnonnull +9 -> 93
    //   87: aload_0
    //   88: aload_1
    //   89: invokevirtual 424	android/view/View:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   92: return
    //   93: aload 4
    //   95: aload_3
    //   96: aload_1
    //   97: invokevirtual 428	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   100: goto +15 -> 115
    //   103: aload_0
    //   104: aload_1
    //   105: invokevirtual 424	android/view/View:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   108: return
    //   109: aload_0
    //   110: ldc 2
    //   112: invokestatic 73	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   115: return
    //   116: astore_0
    //   117: goto -2 -> 115
    //   120: astore 4
    //   122: goto -76 -> 46
    //   125: astore_3
    //   126: aload_2
    //   127: astore_3
    //   128: goto -45 -> 83
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	131	0	paramView	View
    //   0	131	1	paramOnClickListener	android.view.View.OnClickListener
    //   10	117	2	localObject1	Object
    //   21	1	3	localField1	java.lang.reflect.Field
    //   43	1	3	localClassNotFoundException1	ClassNotFoundException
    //   45	51	3	localObject2	Object
    //   125	1	3	localIllegalAccessException	IllegalAccessException
    //   127	1	3	localObject3	Object
    //   34	60	4	localField2	java.lang.reflect.Field
    //   120	1	4	localClassNotFoundException2	ClassNotFoundException
    // Exception table:
    //   from	to	target	type
    //   11	22	39	finally
    //   22	36	39	finally
    //   61	72	39	finally
    //   72	83	39	finally
    //   87	92	39	finally
    //   93	100	39	finally
    //   103	108	39	finally
    //   11	22	43	java/lang/ClassNotFoundException
    //   11	22	43	java/lang/NoSuchFieldException
    //   11	22	116	java/lang/Exception
    //   22	36	116	java/lang/Exception
    //   61	72	116	java/lang/Exception
    //   72	83	116	java/lang/Exception
    //   87	92	116	java/lang/Exception
    //   93	100	116	java/lang/Exception
    //   103	108	116	java/lang/Exception
    //   22	36	120	java/lang/ClassNotFoundException
    //   22	36	120	java/lang/NoSuchFieldException
    //   72	83	125	java/lang/IllegalAccessException
  }
  
  /* Error */
  public static void updateAppearanceOfView(View paramView, JSONObject paramJSONObject, float paramFloat)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 59	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: new 156	org/json/JSONObject
    //   12: astore_3
    //   13: aload_3
    //   14: invokespecial 157	org/json/JSONObject:<init>	()V
    //   17: aload_0
    //   18: instanceof 107
    //   21: ifeq +70 -> 91
    //   24: aload_0
    //   25: checkcast 107	android/widget/TextView
    //   28: astore 4
    //   30: aload 4
    //   32: invokevirtual 434	android/widget/TextView:getTypeface	()Landroid/graphics/Typeface;
    //   35: astore 5
    //   37: aload 5
    //   39: ifnull +52 -> 91
    //   42: aload_3
    //   43: ldc_w 436
    //   46: aload 4
    //   48: invokevirtual 439	android/widget/TextView:getTextSize	()F
    //   51: f2d
    //   52: invokevirtual 442	org/json/JSONObject:put	(Ljava/lang/String;D)Lorg/json/JSONObject;
    //   55: pop
    //   56: aload_3
    //   57: ldc_w 444
    //   60: aload 5
    //   62: invokevirtual 449	android/graphics/Typeface:isBold	()Z
    //   65: invokevirtual 452	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   68: pop
    //   69: aload_3
    //   70: ldc_w 454
    //   73: aload 5
    //   75: invokevirtual 457	android/graphics/Typeface:isItalic	()Z
    //   78: invokevirtual 452	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   81: pop
    //   82: aload_1
    //   83: ldc_w 459
    //   86: aload_3
    //   87: invokevirtual 185	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   90: pop
    //   91: aload_0
    //   92: instanceof 98
    //   95: ifeq +114 -> 209
    //   98: aload_0
    //   99: checkcast 98	android/widget/ImageView
    //   102: invokevirtual 463	android/widget/ImageView:getDrawable	()Landroid/graphics/drawable/Drawable;
    //   105: astore 4
    //   107: aload 4
    //   109: instanceof 465
    //   112: ifeq +97 -> 209
    //   115: aload_0
    //   116: invokevirtual 219	android/view/View:getHeight	()I
    //   119: i2f
    //   120: fload_2
    //   121: fdiv
    //   122: ldc_w 466
    //   125: fcmpg
    //   126: ifgt +83 -> 209
    //   129: aload_0
    //   130: invokevirtual 214	android/view/View:getWidth	()I
    //   133: i2f
    //   134: fload_2
    //   135: fdiv
    //   136: ldc_w 466
    //   139: fcmpg
    //   140: ifgt +69 -> 209
    //   143: aload 4
    //   145: checkcast 465	android/graphics/drawable/BitmapDrawable
    //   148: invokevirtual 470	android/graphics/drawable/BitmapDrawable:getBitmap	()Landroid/graphics/Bitmap;
    //   151: astore 4
    //   153: aload 4
    //   155: ifnull +54 -> 209
    //   158: new 472	java/io/ByteArrayOutputStream
    //   161: astore_0
    //   162: aload_0
    //   163: invokespecial 473	java/io/ByteArrayOutputStream:<init>	()V
    //   166: aload 4
    //   168: getstatic 479	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   171: bipush 100
    //   173: aload_0
    //   174: invokevirtual 485	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   177: pop
    //   178: aload_1
    //   179: ldc_w 487
    //   182: aload_0
    //   183: invokevirtual 491	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   186: iconst_0
    //   187: invokestatic 497	android/util/Base64:encodeToString	([BI)Ljava/lang/String;
    //   190: invokevirtual 185	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   193: pop
    //   194: goto +15 -> 209
    //   197: astore_0
    //   198: goto +12 -> 210
    //   201: astore_0
    //   202: getstatic 187	com/facebook/appevents/codeless/internal/ViewHierarchy:TAG	Ljava/lang/String;
    //   205: aload_0
    //   206: invokestatic 287	com/facebook/internal/Utility:logd	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   209: return
    //   210: aload_0
    //   211: ldc 2
    //   213: invokestatic 73	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   216: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	217	0	paramView	View
    //   0	217	1	paramJSONObject	JSONObject
    //   0	217	2	paramFloat	float
    //   12	75	3	localJSONObject	JSONObject
    //   28	139	4	localObject	Object
    //   35	39	5	localTypeface	android.graphics.Typeface
    // Exception table:
    //   from	to	target	type
    //   9	37	197	finally
    //   42	91	197	finally
    //   91	153	197	finally
    //   158	194	197	finally
    //   202	209	197	finally
    //   9	37	201	org/json/JSONException
    //   42	91	201	org/json/JSONException
    //   91	153	201	org/json/JSONException
    //   158	194	201	org/json/JSONException
  }
  
  /* Error */
  public static void updateBasicInfoOfView(View paramView, JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 59	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: aload_0
    //   10: invokestatic 499	com/facebook/appevents/codeless/internal/ViewHierarchy:getTextOfView	(Landroid/view/View;)Ljava/lang/String;
    //   13: astore_2
    //   14: aload_0
    //   15: invokestatic 501	com/facebook/appevents/codeless/internal/ViewHierarchy:getHintOfView	(Landroid/view/View;)Ljava/lang/String;
    //   18: astore_3
    //   19: aload_0
    //   20: invokevirtual 504	android/view/View:getTag	()Ljava/lang/Object;
    //   23: astore 4
    //   25: aload_0
    //   26: invokevirtual 507	android/view/View:getContentDescription	()Ljava/lang/CharSequence;
    //   29: astore 5
    //   31: aload_1
    //   32: ldc_w 509
    //   35: aload_0
    //   36: invokevirtual 143	java/lang/Object:getClass	()Ljava/lang/Class;
    //   39: invokevirtual 512	java/lang/Class:getCanonicalName	()Ljava/lang/String;
    //   42: invokevirtual 185	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   45: pop
    //   46: aload_1
    //   47: ldc_w 514
    //   50: aload_0
    //   51: invokestatic 516	com/facebook/appevents/codeless/internal/ViewHierarchy:getClassTypeBitmask	(Landroid/view/View;)I
    //   54: invokevirtual 204	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   57: pop
    //   58: aload_1
    //   59: ldc_w 518
    //   62: aload_0
    //   63: invokevirtual 365	android/view/View:getId	()I
    //   66: invokevirtual 204	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   69: pop
    //   70: aload_0
    //   71: invokestatic 523	com/facebook/appevents/codeless/internal/SensitiveUserDataUtils:isSensitiveUserData	(Landroid/view/View;)Z
    //   74: istore 6
    //   76: iload 6
    //   78: ifne +24 -> 102
    //   81: aload_1
    //   82: ldc_w 525
    //   85: aload_2
    //   86: invokestatic 529	com/facebook/internal/Utility:sha256hash	(Ljava/lang/String;)Ljava/lang/String;
    //   89: ldc_w 295
    //   92: invokestatic 533	com/facebook/internal/Utility:coerceValueIfNullOrEmpty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   95: invokevirtual 185	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   98: pop
    //   99: goto +23 -> 122
    //   102: aload_1
    //   103: ldc_w 525
    //   106: ldc_w 295
    //   109: invokevirtual 185	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   112: pop
    //   113: aload_1
    //   114: ldc_w 535
    //   117: iconst_1
    //   118: invokevirtual 452	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   121: pop
    //   122: aload_1
    //   123: ldc_w 537
    //   126: aload_3
    //   127: invokestatic 529	com/facebook/internal/Utility:sha256hash	(Ljava/lang/String;)Ljava/lang/String;
    //   130: ldc_w 295
    //   133: invokestatic 533	com/facebook/internal/Utility:coerceValueIfNullOrEmpty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   136: invokevirtual 185	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   139: pop
    //   140: aload 4
    //   142: ifnull +25 -> 167
    //   145: aload_1
    //   146: ldc_w 539
    //   149: aload 4
    //   151: invokevirtual 324	java/lang/Object:toString	()Ljava/lang/String;
    //   154: invokestatic 529	com/facebook/internal/Utility:sha256hash	(Ljava/lang/String;)Ljava/lang/String;
    //   157: ldc_w 295
    //   160: invokestatic 533	com/facebook/internal/Utility:coerceValueIfNullOrEmpty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   163: invokevirtual 185	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   166: pop
    //   167: aload 5
    //   169: ifnull +27 -> 196
    //   172: aload_1
    //   173: ldc_w 541
    //   176: aload 5
    //   178: invokeinterface 300 1 0
    //   183: invokestatic 529	com/facebook/internal/Utility:sha256hash	(Ljava/lang/String;)Ljava/lang/String;
    //   186: ldc_w 295
    //   189: invokestatic 533	com/facebook/internal/Utility:coerceValueIfNullOrEmpty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   192: invokevirtual 185	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   195: pop
    //   196: aload_1
    //   197: ldc_w 543
    //   200: aload_0
    //   201: invokestatic 545	com/facebook/appevents/codeless/internal/ViewHierarchy:getDimensionOfView	(Landroid/view/View;)Lorg/json/JSONObject;
    //   204: invokevirtual 185	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   207: pop
    //   208: goto +15 -> 223
    //   211: astore_0
    //   212: goto +12 -> 224
    //   215: astore_0
    //   216: getstatic 187	com/facebook/appevents/codeless/internal/ViewHierarchy:TAG	Ljava/lang/String;
    //   219: aload_0
    //   220: invokestatic 287	com/facebook/internal/Utility:logd	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   223: return
    //   224: aload_0
    //   225: ldc 2
    //   227: invokestatic 73	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   230: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	231	0	paramView	View
    //   0	231	1	paramJSONObject	JSONObject
    //   13	73	2	str1	String
    //   18	109	3	str2	String
    //   23	127	4	localObject	Object
    //   29	148	5	localCharSequence	CharSequence
    //   74	3	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   9	76	211	finally
    //   81	99	211	finally
    //   102	122	211	finally
    //   122	140	211	finally
    //   145	167	211	finally
    //   172	196	211	finally
    //   196	208	211	finally
    //   216	223	211	finally
    //   9	76	215	org/json/JSONException
    //   81	99	215	org/json/JSONException
    //   102	122	215	org/json/JSONException
    //   122	140	215	org/json/JSONException
    //   145	167	215	org/json/JSONException
    //   172	196	215	org/json/JSONException
    //   196	208	215	org/json/JSONException
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.codeless.internal.ViewHierarchy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */