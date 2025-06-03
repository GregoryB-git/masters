package g1;

import a3.f;
import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import g0.M;
import g0.a;
import g0.o;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
  
  public static c b(String paramString, a parama)
  {
    a.a(paramString.startsWith("Style:"));
    String[] arrayOfString = TextUtils.split(paramString.substring(6), ",");
    int k = arrayOfString.length;
    int m = k;
    if (k != m)
    {
      o.h("SsaStyle", M.G("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", new Object[] { Integer.valueOf(m), Integer.valueOf(arrayOfString.length), paramString }));
      return null;
    }
    String str;
    try
    {
      str = arrayOfString[a].trim();
      k = b;
      if (k != -1) {
        k = e(arrayOfString[k].trim());
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      break label402;
    }
    k = -1;
    m = c;
    Integer localInteger1;
    if (m != -1) {
      localInteger1 = h(arrayOfString[m].trim());
    } else {
      localInteger1 = null;
    }
    m = d;
    Integer localInteger2;
    if (m != -1) {
      localInteger2 = h(arrayOfString[m].trim());
    } else {
      localInteger2 = null;
    }
    m = e;
    if (m != -1) {}
    for (float f1 = i(arrayOfString[m].trim());; f1 = -3.4028235E38F) {
      break;
    }
    m = f;
    boolean bool1;
    if ((m != -1) && (f(arrayOfString[m].trim()))) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    m = g;
    boolean bool2;
    if ((m != -1) && (f(arrayOfString[m].trim()))) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    m = h;
    boolean bool3;
    if ((m != -1) && (f(arrayOfString[m].trim()))) {
      bool3 = true;
    } else {
      bool3 = false;
    }
    m = i;
    boolean bool4;
    if ((m != -1) && (f(arrayOfString[m].trim()))) {
      bool4 = true;
    } else {
      bool4 = false;
    }
    m = j;
    if (m != -1) {
      m = g(arrayOfString[m].trim());
    } else {
      m = -1;
    }
    parama = new c(str, k, localInteger1, localInteger2, f1, bool1, bool2, bool3, bool4, m);
    return parama;
    label402:
    parama = new StringBuilder();
    parama.append("Skipping malformed 'Style:' line: '");
    parama.append(paramString);
    parama.append("'");
    o.i("SsaStyle", parama.toString(), localInteger1);
    return null;
  }
  
  public static boolean c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    return true;
  }
  
  public static boolean d(int paramInt)
  {
    return (paramInt == 1) || (paramInt == 3);
  }
  
  public static int e(String paramString)
  {
    try
    {
      int k = Integer.parseInt(paramString.trim());
      boolean bool = c(k);
      if (bool) {
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
    o.h("SsaStyle", localStringBuilder.toString());
    return -1;
  }
  
  public static boolean f(String paramString)
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
      o.i("SsaStyle", localStringBuilder.toString(), localNumberFormatException);
    }
    return false;
  }
  
  public static int g(String paramString)
  {
    try
    {
      int k = Integer.parseInt(paramString.trim());
      boolean bool = d(k);
      if (bool) {
        return k;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      StringBuilder localStringBuilder;
      for (;;) {}
    }
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("Ignoring unknown BorderStyle: ");
    localStringBuilder.append(paramString);
    o.h("SsaStyle", localStringBuilder.toString());
    return -1;
  }
  
  public static Integer h(String paramString)
  {
    try
    {
      if (paramString.startsWith("&H")) {
        l = Long.parseLong(paramString.substring(2), 16);
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      break label118;
    }
    long l = Long.parseLong(paramString);
    boolean bool;
    if (l <= 4294967295L) {
      bool = true;
    } else {
      bool = false;
    }
    a.a(bool);
    int k = f.d(l >> 24 & 0xFF ^ 0xFF);
    int m = f.d(l >> 16 & 0xFF);
    int n = f.d(l >> 8 & 0xFF);
    return Integer.valueOf(Color.argb(k, f.d(l & 0xFF), n, m));
    label118:
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Failed to parse color expression: '");
    localStringBuilder.append(paramString);
    localStringBuilder.append("'");
    o.i("SsaStyle", localStringBuilder.toString(), localIllegalArgumentException);
    return null;
  }
  
  public static float i(String paramString)
  {
    try
    {
      float f1 = Float.parseFloat(paramString);
      return f1;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Failed to parse font size: '");
      localStringBuilder.append(paramString);
      localStringBuilder.append("'");
      o.i("SsaStyle", localStringBuilder.toString(), localNumberFormatException);
    }
    return -3.4028235E38F;
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
    
    public static a a(String paramString)
    {
      String[] arrayOfString = TextUtils.split(paramString.substring(7), ",");
      int m = -1;
      int n = m;
      int i1 = n;
      int i2 = i1;
      int i3 = i2;
      int i4 = i3;
      int i5 = i4;
      int i6 = i5;
      int i7 = i6;
      int i8 = i7;
      int i9 = 0;
      int i10 = i1;
      int i11 = n;
      for (n = i9; n < arrayOfString.length; n++)
      {
        paramString = W2.c.e(arrayOfString[n].trim());
        paramString.hashCode();
        switch (paramString.hashCode())
        {
        }
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          do
                          {
                            i1 = -1;
                            break;
                          } while (!paramString.equals("outlinecolour"));
                          i1 = 9;
                          break;
                        } while (!paramString.equals("alignment"));
                        i1 = 8;
                        break;
                      } while (!paramString.equals("borderstyle"));
                      i1 = 7;
                      break;
                    } while (!paramString.equals("fontsize"));
                    i1 = 6;
                    break;
                  } while (!paramString.equals("name"));
                  i1 = 5;
                  break;
                } while (!paramString.equals("bold"));
                i1 = 4;
                break;
              } while (!paramString.equals("primarycolour"));
              i1 = 3;
              break;
            } while (!paramString.equals("strikeout"));
            i1 = 2;
            break;
          } while (!paramString.equals("underline"));
          i1 = 1;
          break;
        } while (!paramString.equals("italic"));
        i1 = 0;
        switch (i1)
        {
        default: 
          break;
        case 9: 
          i2 = n;
          break;
        case 8: 
          i11 = n;
          break;
        case 7: 
          i8 = n;
          break;
        case 6: 
          i3 = n;
          break;
        case 5: 
          m = n;
          break;
        case 4: 
          i4 = n;
          break;
        case 3: 
          i10 = n;
          break;
        case 2: 
          i7 = n;
          break;
        case 1: 
          i6 = n;
          break;
        case 0: 
          i5 = n;
        }
      }
      if (m != -1) {
        paramString = new a(m, i11, i10, i2, i3, i4, i5, i6, i7, i8, arrayOfString.length);
      } else {
        paramString = null;
      }
      return paramString;
    }
  }
  
  public static final class b
  {
    public static final Pattern c = Pattern.compile("\\{([^}]*)\\}");
    public static final Pattern d = Pattern.compile(M.G("\\\\pos\\((%1$s),(%1$s)\\)", new Object[] { "\\s*\\d+(?:\\.\\d+)?\\s*" }));
    public static final Pattern e = Pattern.compile(M.G("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", new Object[] { "\\s*\\d+(?:\\.\\d+)?\\s*" }));
    public static final Pattern f = Pattern.compile("\\\\an(\\d+)");
    public final int a;
    public final PointF b;
    
    public b(int paramInt, PointF paramPointF)
    {
      a = paramInt;
      b = paramPointF;
    }
    
    public static int a(String paramString)
    {
      paramString = f.matcher(paramString);
      int i;
      if (paramString.find()) {
        i = c.a((String)a.e(paramString.group(1)));
      } else {
        i = -1;
      }
      return i;
    }
    
    public static b b(String paramString)
    {
      Matcher localMatcher = c.matcher(paramString);
      paramString = null;
      int i = -1;
      String str2;
      for (;;)
      {
        String str1;
        if (localMatcher.find()) {
          str1 = (String)a.e(localMatcher.group(1));
        }
        try
        {
          PointF localPointF = c(str1);
          localObject = paramString;
          if (localPointF != null) {
            localObject = localPointF;
          }
        }
        catch (RuntimeException localRuntimeException)
        {
          for (;;)
          {
            Object localObject;
            int j;
            str2 = paramString;
          }
        }
        try
        {
          j = a(str1);
          paramString = (String)localObject;
          if (j == -1) {
            continue;
          }
          i = j;
          paramString = (String)localObject;
        }
        catch (RuntimeException paramString)
        {
          paramString = str2;
        }
        return new b(i, paramString);
      }
    }
    
    public static PointF c(String paramString)
    {
      Matcher localMatcher1 = d.matcher(paramString);
      Matcher localMatcher2 = e.matcher(paramString);
      boolean bool1 = localMatcher1.find();
      boolean bool2 = localMatcher2.find();
      Object localObject;
      if (bool1)
      {
        if (bool2)
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
          ((StringBuilder)localObject).append(paramString);
          ((StringBuilder)localObject).append("'");
          o.f("SsaStyle.Overrides", ((StringBuilder)localObject).toString());
        }
        localObject = localMatcher1.group(1);
        paramString = localMatcher1.group(2);
      }
      else
      {
        if (!bool2) {
          break label147;
        }
        localObject = localMatcher2.group(1);
        paramString = localMatcher2.group(2);
      }
      return new PointF(Float.parseFloat(((String)a.e(localObject)).trim()), Float.parseFloat(((String)a.e(paramString)).trim()));
      label147:
      return null;
    }
    
    public static String d(String paramString)
    {
      return c.matcher(paramString).replaceAll("");
    }
  }
}

/* Location:
 * Qualified Name:     g1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */