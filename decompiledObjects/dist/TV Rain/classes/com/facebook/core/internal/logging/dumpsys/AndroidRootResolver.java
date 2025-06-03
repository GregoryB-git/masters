package com.facebook.core.internal.logging.dumpsys;

import android.util.Log;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import androidx.annotation.Nullable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public final class AndroidRootResolver
{
  private static final String GET_DEFAULT_IMPL = "getDefault";
  private static final String GET_GLOBAL_INSTANCE = "getInstance";
  private static final String TAG = "AndroidRootResolver";
  private static final String VIEWS_FIELD = "mViews";
  private static final String WINDOW_MANAGER_GLOBAL_CLAZZ = "android.view.WindowManagerGlobal";
  private static final String WINDOW_MANAGER_IMPL_CLAZZ = "android.view.WindowManagerImpl";
  private static final String WINDOW_PARAMS_FIELD = "mParams";
  private boolean initialized;
  private Field paramsField;
  private Field viewsField;
  private Object windowManagerObj;
  
  private void initialize()
  {
    initialized = true;
    try
    {
      Object localObject = Class.forName("android.view.WindowManagerGlobal");
      windowManagerObj = ((Class)localObject).getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
      Field localField = ((Class)localObject).getDeclaredField("mViews");
      viewsField = localField;
      localField.setAccessible(true);
      localObject = ((Class)localObject).getDeclaredField("mParams");
      paramsField = ((Field)localObject);
      ((AccessibleObject)localObject).setAccessible(true);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Log.d(TAG, String.format("reflective setup failed using obj: %s method: %s field: %s", new Object[] { "android.view.WindowManagerGlobal", "getInstance", "mViews" }), localIllegalAccessException);
    }
    catch (RuntimeException localRuntimeException)
    {
      Log.d(TAG, String.format("reflective setup failed using obj: %s method: %s field: %s", new Object[] { "android.view.WindowManagerGlobal", "getInstance", "mViews" }), localRuntimeException);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      Log.d(TAG, String.format("could not find method: %s on %s", new Object[] { "getInstance", "android.view.WindowManagerGlobal" }), localNoSuchMethodException);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      Log.d(TAG, String.format("could not find field: %s or %s on %s", new Object[] { "mParams", "mViews", "android.view.WindowManagerGlobal" }), localNoSuchFieldException);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      Log.d(TAG, String.format("could not find class: %s", new Object[] { "android.view.WindowManagerGlobal" }), localClassNotFoundException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      Log.d(TAG, String.format("could not invoke: %s on %s", new Object[] { "getInstance", "android.view.WindowManagerGlobal" }), localInvocationTargetException.getCause());
    }
  }
  
  /* Error */
  public void attachActiveRootListener(Listener paramListener)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: aload_0
    //   6: getfield 64	com/facebook/core/internal/logging/dumpsys/AndroidRootResolver:initialized	Z
    //   9: ifne +7 -> 16
    //   12: aload_0
    //   13: invokespecial 128	com/facebook/core/internal/logging/dumpsys/AndroidRootResolver:initialize	()V
    //   16: ldc -126
    //   18: ldc -124
    //   20: invokevirtual 86	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   23: astore_2
    //   24: aload_2
    //   25: iconst_1
    //   26: invokevirtual 94	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   29: aload_0
    //   30: getfield 88	com/facebook/core/internal/logging/dumpsys/AndroidRootResolver:viewsField	Ljava/lang/reflect/Field;
    //   33: astore_3
    //   34: aload_2
    //   35: aload_3
    //   36: aload_3
    //   37: invokevirtual 136	java/lang/reflect/Field:getModifiers	()I
    //   40: bipush -17
    //   42: iand
    //   43: invokevirtual 140	java/lang/reflect/Field:setInt	(Ljava/lang/Object;I)V
    //   46: aload_0
    //   47: getfield 88	com/facebook/core/internal/logging/dumpsys/AndroidRootResolver:viewsField	Ljava/lang/reflect/Field;
    //   50: aload_0
    //   51: getfield 82	com/facebook/core/internal/logging/dumpsys/AndroidRootResolver:windowManagerObj	Ljava/lang/Object;
    //   54: invokevirtual 144	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   57: checkcast 146	java/util/ArrayList
    //   60: astore_3
    //   61: new 8	com/facebook/core/internal/logging/dumpsys/AndroidRootResolver$ListenableArrayList
    //   64: astore_2
    //   65: aload_2
    //   66: invokespecial 147	com/facebook/core/internal/logging/dumpsys/AndroidRootResolver$ListenableArrayList:<init>	()V
    //   69: aload_2
    //   70: aload_1
    //   71: invokevirtual 150	com/facebook/core/internal/logging/dumpsys/AndroidRootResolver$ListenableArrayList:setListener	(Lcom/facebook/core/internal/logging/dumpsys/AndroidRootResolver$Listener;)V
    //   74: aload_2
    //   75: aload_3
    //   76: invokevirtual 156	java/util/AbstractCollection:addAll	(Ljava/util/Collection;)Z
    //   79: pop
    //   80: aload_0
    //   81: getfield 88	com/facebook/core/internal/logging/dumpsys/AndroidRootResolver:viewsField	Ljava/lang/reflect/Field;
    //   84: aload_0
    //   85: getfield 82	com/facebook/core/internal/logging/dumpsys/AndroidRootResolver:windowManagerObj	Ljava/lang/Object;
    //   88: aload_2
    //   89: invokevirtual 160	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   92: goto +14 -> 106
    //   95: astore_1
    //   96: getstatic 98	com/facebook/core/internal/logging/dumpsys/AndroidRootResolver:TAG	Ljava/lang/String;
    //   99: ldc -94
    //   101: aload_1
    //   102: invokestatic 112	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   105: pop
    //   106: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	this	AndroidRootResolver
    //   0	107	1	paramListener	Listener
    //   23	66	2	localObject1	Object
    //   33	43	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   16	92	95	finally
  }
  
  @Nullable
  public List<Root> listActiveRoots()
  {
    if (!initialized) {
      initialize();
    }
    Object localObject1 = windowManagerObj;
    if (localObject1 == null)
    {
      Log.d(TAG, "No reflective access to windowmanager object.");
      return null;
    }
    Object localObject2 = viewsField;
    if (localObject2 == null)
    {
      Log.d(TAG, "No reflective access to mViews");
      return null;
    }
    if (paramsField == null)
    {
      Log.d(TAG, "No reflective access to mPArams");
      return null;
    }
    int i = 0;
    try
    {
      localObject1 = (List)((Field)localObject2).get(localObject1);
      localObject2 = (List)paramsField.get(windowManagerObj);
      ArrayList localArrayList = new ArrayList();
      int j = ((List)localObject1).size();
      while (i < j)
      {
        localArrayList.add(new Root((View)((List)localObject1).get(i), (WindowManager.LayoutParams)((List)localObject2).get(i), null));
        i++;
      }
      return localArrayList;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Log.d(TAG, String.format("Reflective access to %s or %s on %s failed.", new Object[] { viewsField, paramsField, windowManagerObj }), localIllegalAccessException);
      return null;
    }
    catch (RuntimeException localRuntimeException)
    {
      Log.d(TAG, String.format("Reflective access to %s or %s on %s failed.", new Object[] { viewsField, paramsField, windowManagerObj }), localRuntimeException);
    }
    return null;
  }
  
  public static class ListenableArrayList
    extends ArrayList<View>
  {
    @Nullable
    private AndroidRootResolver.Listener listener;
    
    public boolean add(View paramView)
    {
      boolean bool = super.add(paramView);
      if (bool)
      {
        AndroidRootResolver.Listener localListener = listener;
        if (localListener != null)
        {
          localListener.onRootAdded(paramView);
          listener.onRootsChanged(this);
        }
      }
      return bool;
    }
    
    public View remove(int paramInt)
    {
      View localView = (View)super.remove(paramInt);
      AndroidRootResolver.Listener localListener = listener;
      if (localListener != null)
      {
        localListener.onRootRemoved(localView);
        listener.onRootsChanged(this);
      }
      return localView;
    }
    
    public boolean remove(@Nullable Object paramObject)
    {
      boolean bool = super.remove(paramObject);
      if (bool)
      {
        AndroidRootResolver.Listener localListener = listener;
        if ((localListener != null) && ((paramObject instanceof View)))
        {
          localListener.onRootRemoved((View)paramObject);
          listener.onRootsChanged(this);
        }
      }
      return bool;
    }
    
    public void setListener(AndroidRootResolver.Listener paramListener)
    {
      listener = paramListener;
    }
  }
  
  public static abstract interface Listener
  {
    public abstract void onRootAdded(View paramView);
    
    public abstract void onRootRemoved(View paramView);
    
    public abstract void onRootsChanged(List<View> paramList);
  }
  
  public static class Root
  {
    public final WindowManager.LayoutParams param;
    public final View view;
    
    private Root(View paramView, WindowManager.LayoutParams paramLayoutParams)
    {
      view = paramView;
      param = paramLayoutParams;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.core.internal.logging.dumpsys.AndroidRootResolver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */