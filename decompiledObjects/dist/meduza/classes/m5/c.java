package m5;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r7.a;
import v5.e0;
import v5.m;
import x6.b;

public final class c
{
  public final String a;
  public final int b;
  public final Integer c;
  public final Integer d;
  public final float e;
  public final boolean f;
  public final boolean g;
  public final boolean h;
  public final boolean i;
  public final int j;
  
  public c(String paramString, int paramInt1, Integer paramInteger1, Integer paramInteger2, float paramFloat, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, int paramInt2)
  {
    a = paramString;
    b = paramInt1;
    c = paramInteger1;
    d = paramInteger2;
    e = paramFloat;
    f = paramBoolean1;
    g = paramBoolean2;
    h = paramBoolean3;
    i = paramBoolean4;
    j = paramInt2;
  }
  
  public static int a(String paramString)
  {
    try
    {
      int k = Integer.parseInt(paramString.trim());
      int m;
      switch (k)
      {
      default: 
        m = 0;
        break;
      case 1: 
      case 2: 
      case 3: 
      case 4: 
      case 5: 
      case 6: 
      case 7: 
      case 8: 
      case 9: 
        m = 1;
      }
      if (m != 0) {
        return k;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      StringBuilder localStringBuilder;
      for (;;) {}
    }
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("Ignoring unknown alignment: ");
    localStringBuilder.append(paramString);
    m.f("SsaStyle", localStringBuilder.toString());
    return -1;
  }
  
  public static boolean b(String paramString)
  {
    boolean bool = false;
    try
    {
      int k = Integer.parseInt(paramString);
      if ((k == 1) || (k == -1)) {
        bool = true;
      }
      return bool;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Failed to parse boolean value: '");
      localStringBuilder.append(paramString);
      localStringBuilder.append("'");
      m.g("SsaStyle", localStringBuilder.toString(), localNumberFormatException);
    }
    return false;
  }
  
  public static Integer c(String paramString)
  {
    try
    {
      long l;
      if (paramString.startsWith("&H")) {
        l = Long.parseLong(paramString.substring(2), 16);
      } else {
        l = Long.parseLong(paramString);
      }
      boolean bool;
      if (l <= 4294967295L) {
        bool = true;
      } else {
        bool = false;
      }
      b.q(bool);
      int k = a.C(l >> 24 & 0xFF ^ 0xFF);
      int m = a.C(l >> 16 & 0xFF);
      int n = a.C(l >> 8 & 0xFF);
      return Integer.valueOf(Color.argb(k, a.C(l & 0xFF), n, m));
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Failed to parse color expression: '");
      localStringBuilder.append(paramString);
      localStringBuilder.append("'");
      m.g("SsaStyle", localStringBuilder.toString(), localIllegalArgumentException);
    }
    return null;
  }
  
  public static final class a
  {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    
    public a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramInt3;
      d = paramInt4;
      e = paramInt5;
      f = paramInt6;
      g = paramInt7;
      h = paramInt8;
      i = paramInt9;
      j = paramInt10;
      k = paramInt11;
    }
  }
  
  public static final class b
  {
    public static final Pattern a = Pattern.compile("\\{([^}]*)\\}");
    public static final Pattern b = Pattern.compile(e0.m("\\\\pos\\((%1$s),(%1$s)\\)", new Object[] { "\\s*\\d+(?:\\.\\d+)?\\s*" }));
    public static final Pattern c = Pattern.compile(e0.m("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", new Object[] { "\\s*\\d+(?:\\.\\d+)?\\s*" }));
    public static final Pattern d = Pattern.compile("\\\\an(\\d+)");
    
    public static PointF a(String paramString)
    {
      Object localObject1 = b.matcher(paramString);
      Object localObject2 = c.matcher(paramString);
      boolean bool1 = ((Matcher)localObject1).find();
      boolean bool2 = ((Matcher)localObject2).find();
      if (bool1)
      {
        if (bool2)
        {
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
          ((StringBuilder)localObject2).append(paramString);
          ((StringBuilder)localObject2).append("'");
          m.e("SsaStyle.Overrides", ((StringBuilder)localObject2).toString());
        }
        paramString = ((Matcher)localObject1).group(1);
        localObject1 = ((Matcher)localObject1).group(2);
      }
      else
      {
        if (!bool2) {
          break label141;
        }
        paramString = ((Matcher)localObject2).group(1);
        localObject1 = ((Matcher)localObject2).group(2);
      }
      paramString.getClass();
      float f = Float.parseFloat(paramString.trim());
      localObject1.getClass();
      return new PointF(f, Float.parseFloat(((String)localObject1).trim()));
      label141:
      return null;
    }
  }
}

/* Location:
 * Qualified Name:     m5.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */