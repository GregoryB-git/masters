package com.google.android.exoplayer2.ui;

import android.text.Html;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b
{
  public static final Pattern a = Pattern.compile("(&#13;)?&#10;");
  
  public static String a(CharSequence paramCharSequence)
  {
    paramCharSequence = Html.escapeHtml(paramCharSequence);
    return a.matcher(paramCharSequence).replaceAll("<br>");
  }
  
  public static final class a
  {
    public final String a;
    public final Map<String, String> b;
    
    public a(String paramString, Map paramMap)
    {
      a = paramString;
      b = paramMap;
    }
  }
  
  public static final class b
  {
    public static final v4.d e = new v4.d(6);
    public static final b0.d f = new b0.d(6);
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    
    public b(int paramInt1, int paramInt2, String paramString1, String paramString2)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramString1;
      d = paramString2;
    }
  }
  
  public static final class c
  {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.ui.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */