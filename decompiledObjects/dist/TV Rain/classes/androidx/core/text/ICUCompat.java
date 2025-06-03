package androidx.core.text;

import android.annotation.SuppressLint;
import android.icu.util.ULocale;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public final class ICUCompat
{
  private static final String TAG = "ICUCompat";
  private static Method sAddLikelySubtagsMethod;
  private static Method sGetScriptMethod;
  
  @SuppressLint({"BanUncheckedReflection"})
  private static String addLikelySubtagsBelowApi21(Locale paramLocale)
  {
    paramLocale = paramLocale.toString();
    try
    {
      Object localObject = sAddLikelySubtagsMethod;
      if (localObject != null)
      {
        localObject = (String)((Method)localObject).invoke(null, new Object[] { paramLocale });
        return (String)localObject;
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      Log.w("ICUCompat", localInvocationTargetException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Log.w("ICUCompat", localIllegalAccessException);
    }
    return paramLocale;
  }
  
  @SuppressLint({"BanUncheckedReflection"})
  private static String getScriptBelowApi21(String paramString)
  {
    try
    {
      Method localMethod = sGetScriptMethod;
      if (localMethod != null)
      {
        paramString = (String)localMethod.invoke(null, new Object[] { paramString });
        return paramString;
      }
    }
    catch (InvocationTargetException paramString)
    {
      Log.w("ICUCompat", paramString);
    }
    catch (IllegalAccessException paramString)
    {
      Log.w("ICUCompat", paramString);
    }
    return null;
  }
  
  @Nullable
  public static String maximizeAndGetScript(@NonNull Locale paramLocale)
  {
    return Api24Impl.getScript(Api24Impl.addLikelySubtags(Api24Impl.forLocale(paramLocale)));
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static String getScript(Locale paramLocale)
    {
      return paramLocale.getScript();
    }
  }
  
  @RequiresApi(24)
  public static class Api24Impl
  {
    @DoNotInline
    public static ULocale addLikelySubtags(Object paramObject)
    {
      return ULocale.addLikelySubtags((ULocale)paramObject);
    }
    
    @DoNotInline
    public static ULocale forLocale(Locale paramLocale)
    {
      return ULocale.forLocale(paramLocale);
    }
    
    @DoNotInline
    public static String getScript(Object paramObject)
    {
      return ((ULocale)paramObject).getScript();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.text.ICUCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */