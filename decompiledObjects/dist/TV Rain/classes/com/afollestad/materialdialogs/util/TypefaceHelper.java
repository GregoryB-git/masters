package com.afollestad.materialdialogs.util;

import android.content.Context;
import android.graphics.Typeface;
import androidx.collection.SimpleArrayMap;

public class TypefaceHelper
{
  private static final SimpleArrayMap<String, Typeface> cache = new SimpleArrayMap();
  
  public static Typeface get(Context paramContext, String paramString)
  {
    synchronized (cache)
    {
      boolean bool = ???.containsKey(paramString);
      if (!bool) {
        try
        {
          paramContext = Typeface.createFromAsset(paramContext.getAssets(), String.format("fonts/%s", new Object[] { paramString }));
          ???.put(paramString, paramContext);
          return paramContext;
        }
        catch (RuntimeException paramContext)
        {
          return null;
        }
      }
      paramContext = (Typeface)???.get(paramString);
      return paramContext;
    }
  }
}

/* Location:
 * Qualified Name:     com.afollestad.materialdialogs.util.TypefaceHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */