package w;

import E.b;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback.OnSharedElementsReadyListener;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public abstract class a
  extends x.a
{
  public static void l(Activity paramActivity, String[] paramArrayOfString, int paramInt)
  {
    HashSet localHashSet = new HashSet();
    int i = 0;
    int j = 0;
    while (j < paramArrayOfString.length) {
      if (!TextUtils.isEmpty(paramArrayOfString[j]))
      {
        if ((!b.c()) && (TextUtils.equals(paramArrayOfString[j], "android.permission.POST_NOTIFICATIONS"))) {
          localHashSet.add(Integer.valueOf(j));
        }
        j++;
      }
      else
      {
        paramActivity = new StringBuilder();
        paramActivity.append("Permission request for permissions ");
        paramActivity.append(Arrays.toString(paramArrayOfString));
        paramActivity.append(" must not contain null or empty values");
        throw new IllegalArgumentException(paramActivity.toString());
      }
    }
    j = localHashSet.size();
    String[] arrayOfString;
    if (j > 0) {
      arrayOfString = new String[paramArrayOfString.length - j];
    } else {
      arrayOfString = paramArrayOfString;
    }
    if (j > 0)
    {
      if (j == paramArrayOfString.length) {
        return;
      }
      int k;
      for (j = 0; i < paramArrayOfString.length; j = k)
      {
        k = j;
        if (!localHashSet.contains(Integer.valueOf(i)))
        {
          arrayOfString[j] = paramArrayOfString[i];
          k = j + 1;
        }
        i++;
      }
    }
    if ((paramActivity instanceof e)) {
      ((e)paramActivity).a(paramInt);
    }
    b.b(paramActivity, paramArrayOfString, paramInt);
  }
  
  public static boolean m(Activity paramActivity, String paramString)
  {
    if ((!b.c()) && (TextUtils.equals("android.permission.POST_NOTIFICATIONS", paramString))) {
      return false;
    }
    int i = Build.VERSION.SDK_INT;
    if (i >= 32) {
      return d.a(paramActivity, paramString);
    }
    if (i == 31) {
      return c.b(paramActivity, paramString);
    }
    return b.c(paramActivity, paramString);
  }
  
  public static void n(Activity paramActivity, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    a.b(paramActivity, paramIntent, paramInt, paramBundle);
  }
  
  public static void o(Activity paramActivity, IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
  {
    a.c(paramActivity, paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
  }
  
  public static abstract class a
  {
    public static void a(Activity paramActivity)
    {
      paramActivity.finishAffinity();
    }
    
    public static void b(Activity paramActivity, Intent paramIntent, int paramInt, Bundle paramBundle)
    {
      paramActivity.startActivityForResult(paramIntent, paramInt, paramBundle);
    }
    
    public static void c(Activity paramActivity, IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
    {
      paramActivity.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
    }
  }
  
  public static abstract class b
  {
    public static void a(Object paramObject)
    {
      ((SharedElementCallback.OnSharedElementsReadyListener)paramObject).onSharedElementsReady();
    }
    
    public static void b(Activity paramActivity, String[] paramArrayOfString, int paramInt)
    {
      paramActivity.requestPermissions(paramArrayOfString, paramInt);
    }
    
    public static boolean c(Activity paramActivity, String paramString)
    {
      return paramActivity.shouldShowRequestPermissionRationale(paramString);
    }
  }
  
  public static abstract class c
  {
    public static boolean a(@NonNull Activity paramActivity)
    {
      return paramActivity.isLaunchedFromBubble();
    }
    
    @SuppressLint({"BanUncheckedReflection"})
    public static boolean b(Activity paramActivity, String paramString)
    {
      try
      {
        PackageManager localPackageManager = paramActivity.getApplication().getPackageManager();
        boolean bool = ((Boolean)PackageManager.class.getMethod("shouldShowRequestPermissionRationale", new Class[] { String.class }).invoke(localPackageManager, new Object[] { paramString })).booleanValue();
        return bool;
      }
      catch (NoSuchMethodException|InvocationTargetException|IllegalAccessException localNoSuchMethodException) {}
      return paramActivity.shouldShowRequestPermissionRationale(paramString);
    }
  }
  
  public static abstract class d
  {
    public static boolean a(Activity paramActivity, String paramString)
    {
      return paramActivity.shouldShowRequestPermissionRationale(paramString);
    }
  }
  
  public static abstract interface e
  {
    public abstract void a(int paramInt);
  }
}

/* Location:
 * Qualified Name:     w.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */