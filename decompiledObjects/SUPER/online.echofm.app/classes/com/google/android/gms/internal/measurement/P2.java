package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import t.a;
import t.h;

public abstract class P2
{
  public static final a a = new a();
  
  public static Uri a(String paramString)
  {
    Object localObject2;
    try
    {
      a locala = a;
      Object localObject1 = (Uri)locala.get(paramString);
      localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject1 = Uri.encode(paramString);
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("content://com.google.android.gms.phenotype/");
        ((StringBuilder)localObject2).append((String)localObject1);
        localObject2 = Uri.parse(((StringBuilder)localObject2).toString());
        locala.put(paramString, localObject2);
      }
    }
    finally
    {
      break label70;
    }
    return (Uri)localObject2;
    label70:
    throw paramString;
  }
  
  public static String b(Context paramContext, String paramString)
  {
    if (!paramString.contains("#"))
    {
      String str = paramContext.getPackageName();
      paramContext = new StringBuilder();
      paramContext.append(paramString);
      paramContext.append("#");
      paramContext.append("");
      paramContext.append(str);
      return paramContext.toString();
    }
    paramContext = new StringBuilder("The passed in package cannot already have a subpackage: ");
    paramContext.append(paramString);
    throw new IllegalArgumentException(paramContext.toString());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.P2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */