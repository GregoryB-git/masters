package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import x.b;

public final class J2
  implements E2
{
  public static J2 c;
  public final Context a;
  public final ContentObserver b;
  
  public J2()
  {
    a = null;
    b = null;
  }
  
  public J2(Context paramContext)
  {
    a = paramContext;
    L2 localL2 = new L2(this, null);
    b = localL2;
    paramContext.getContentResolver().registerContentObserver(t2.a, true, localL2);
  }
  
  public static J2 a(Context paramContext)
  {
    try
    {
      if (c != null) {
        break label48;
      }
      if (b.b(paramContext, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0)
      {
        J2 localJ2 = new com/google/android/gms/internal/measurement/J2;
        localJ2.<init>(paramContext);
        paramContext = localJ2;
      }
    }
    finally
    {
      break label57;
    }
    paramContext = new J2();
    c = paramContext;
    label48:
    paramContext = c;
    return paramContext;
    label57:
    throw paramContext;
  }
  
  public static void b()
  {
    try
    {
      J2 localJ2 = c;
      if (localJ2 != null)
      {
        Context localContext = a;
        if ((localContext != null) && (b != null)) {
          localContext.getContentResolver().unregisterContentObserver(cb);
        }
      }
    }
    finally
    {
      break label55;
    }
    c = null;
    return;
    label55:
    throw ((Throwable)localObject);
  }
  
  public final String d(String paramString)
  {
    Object localObject = a;
    if ((localObject != null) && (!z2.b((Context)localObject)))
    {
      try
      {
        localObject = new com/google/android/gms/internal/measurement/I2;
        ((I2)localObject).<init>(this, paramString);
        localObject = (String)H2.a((G2)localObject);
        return (String)localObject;
      }
      catch (NullPointerException localNullPointerException) {}catch (SecurityException localSecurityException) {}catch (IllegalStateException localIllegalStateException) {}
      StringBuilder localStringBuilder = new StringBuilder("Unable to read GServices for: ");
      localStringBuilder.append(paramString);
      Log.e("GservicesLoader", localStringBuilder.toString(), localIllegalStateException);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.J2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */