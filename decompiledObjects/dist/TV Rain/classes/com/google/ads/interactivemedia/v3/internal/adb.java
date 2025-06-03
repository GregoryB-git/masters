package com.google.ads.interactivemedia.v3.internal;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

public class adb
  implements Closeable, Flushable
{
  private static final String[] a = new String[''];
  private static final String[] b;
  private final Writer c;
  private int[] d = new int[32];
  private int e = 0;
  private String f;
  private String g;
  private boolean h;
  private boolean i;
  private String j;
  private boolean k;
  
  static
  {
    for (int m = 0; m <= 31; m++) {
      a[m] = String.format("\\u%04x", new Object[] { Integer.valueOf(m) });
    }
    String[] arrayOfString = a;
    arrayOfString[34] = "\\\"";
    arrayOfString[92] = "\\\\";
    arrayOfString[9] = "\\t";
    arrayOfString[8] = "\\b";
    arrayOfString[10] = "\\n";
    arrayOfString[13] = "\\r";
    arrayOfString[12] = "\\f";
    arrayOfString = (String[])arrayOfString.clone();
    b = arrayOfString;
    arrayOfString[60] = "\\u003c";
    arrayOfString[62] = "\\u003e";
    arrayOfString[38] = "\\u0026";
    arrayOfString[61] = "\\u003d";
    arrayOfString[39] = "\\u0027";
  }
  
  public adb(Writer paramWriter)
  {
    a(6);
    g = ":";
    k = true;
    if (paramWriter != null)
    {
      c = paramWriter;
      return;
    }
    throw new NullPointerException("out == null");
  }
  
  private final int a()
  {
    int m = e;
    if (m != 0) {
      return d[(m - 1)];
    }
    throw new IllegalStateException("JsonWriter is closed.");
  }
  
  private final adb a(int paramInt1, int paramInt2, String paramString)
    throws IOException
  {
    int m = a();
    if ((m != paramInt2) && (m != paramInt1)) {
      throw new IllegalStateException("Nesting problem.");
    }
    if (j == null)
    {
      e -= 1;
      if (m == paramInt2) {
        k();
      }
      c.write(paramString);
      return this;
    }
    paramString = new StringBuilder("Dangling name: ");
    paramString.append(j);
    throw new IllegalStateException(paramString.toString());
  }
  
  private final adb a(int paramInt, String paramString)
    throws IOException
  {
    l();
    a(paramInt);
    c.write(paramString);
    return this;
  }
  
  private final void a(int paramInt)
  {
    int m = e;
    int[] arrayOfInt1 = d;
    if (m == arrayOfInt1.length)
    {
      arrayOfInt2 = new int[m << 1];
      System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, m);
      d = arrayOfInt2;
    }
    int[] arrayOfInt2 = d;
    m = e;
    e = (m + 1);
    arrayOfInt2[m] = paramInt;
  }
  
  private final void b(int paramInt)
  {
    d[(e - 1)] = paramInt;
  }
  
  private final void d(String paramString)
    throws IOException
  {
    String[] arrayOfString;
    if (i) {
      arrayOfString = b;
    } else {
      arrayOfString = a;
    }
    c.write("\"");
    int m = paramString.length();
    int n = 0;
    int i3;
    for (int i1 = 0; n < m; i1 = i3)
    {
      int i2 = paramString.charAt(n);
      String str2;
      if (i2 < 128)
      {
        String str1 = arrayOfString[i2];
        str2 = str1;
        if (str1 == null)
        {
          i3 = i1;
          break label150;
        }
      }
      else if (i2 == 8232)
      {
        str2 = "\\u2028";
      }
      else
      {
        i3 = i1;
        if (i2 != 8233) {
          break label150;
        }
        str2 = "\\u2029";
      }
      if (i1 < n) {
        c.write(paramString, i1, n - i1);
      }
      c.write(str2);
      i3 = n + 1;
      label150:
      n++;
    }
    if (i1 < m) {
      c.write(paramString, i1, m - i1);
    }
    c.write("\"");
  }
  
  private final void j()
    throws IOException
  {
    if (j != null)
    {
      int m = a();
      if (m == 5) {
        c.write(44);
      } else {
        if (m != 3) {
          break label59;
        }
      }
      k();
      b(4);
      d(j);
      j = null;
      return;
      label59:
      throw new IllegalStateException("Nesting problem.");
    }
  }
  
  private final void k()
    throws IOException
  {
    if (f == null) {
      return;
    }
    c.write("\n");
    int m = e;
    for (int n = 1; n < m; n++) {
      c.write(f);
    }
  }
  
  private final void l()
    throws IOException
  {
    int m = a();
    if (m != 1)
    {
      if (m != 2)
      {
        if (m != 4)
        {
          if (m != 6) {
            if (m == 7)
            {
              if (!h) {
                throw new IllegalStateException("JSON must have only one top-level value.");
              }
            }
            else {
              throw new IllegalStateException("Nesting problem.");
            }
          }
          b(7);
          return;
        }
        c.append(g);
        b(5);
        return;
      }
      c.append(',');
      k();
      return;
    }
    b(2);
    k();
  }
  
  public adb a(long paramLong)
    throws IOException
  {
    j();
    l();
    c.write(Long.toString(paramLong));
    return this;
  }
  
  public adb a(Boolean paramBoolean)
    throws IOException
  {
    if (paramBoolean == null) {
      return f();
    }
    j();
    l();
    Writer localWriter = c;
    if (paramBoolean.booleanValue()) {
      paramBoolean = "true";
    } else {
      paramBoolean = "false";
    }
    localWriter.write(paramBoolean);
    return this;
  }
  
  public adb a(Number paramNumber)
    throws IOException
  {
    if (paramNumber == null) {
      return f();
    }
    j();
    Object localObject = paramNumber.toString();
    if ((!h) && ((((String)localObject).equals("-Infinity")) || (((String)localObject).equals("Infinity")) || (((String)localObject).equals("NaN"))))
    {
      localObject = new StringBuilder("Numeric values must be finite, but was ");
      ((StringBuilder)localObject).append(paramNumber);
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    l();
    c.append((CharSequence)localObject);
    return this;
  }
  
  public adb a(String paramString)
    throws IOException
  {
    if (paramString != null)
    {
      if (j == null)
      {
        if (e != 0)
        {
          j = paramString;
          return this;
        }
        throw new IllegalStateException("JsonWriter is closed.");
      }
      throw new IllegalStateException();
    }
    throw new NullPointerException("name == null");
  }
  
  public adb a(boolean paramBoolean)
    throws IOException
  {
    j();
    l();
    Writer localWriter = c;
    String str;
    if (paramBoolean) {
      str = "true";
    } else {
      str = "false";
    }
    localWriter.write(str);
    return this;
  }
  
  public adb b()
    throws IOException
  {
    j();
    return a(1, "[");
  }
  
  public adb b(String paramString)
    throws IOException
  {
    if (paramString == null) {
      return f();
    }
    j();
    l();
    d(paramString);
    return this;
  }
  
  public final void b(boolean paramBoolean)
  {
    h = paramBoolean;
  }
  
  public adb c()
    throws IOException
  {
    return a(1, 2, "]");
  }
  
  public final void c(String paramString)
  {
    if (paramString.length() == 0)
    {
      f = null;
      g = ":";
      return;
    }
    f = paramString;
    g = ": ";
  }
  
  public final void c(boolean paramBoolean)
  {
    i = paramBoolean;
  }
  
  public void close()
    throws IOException
  {
    c.close();
    int m = e;
    if ((m <= 1) && ((m != 1) || (d[(m - 1)] == 7)))
    {
      e = 0;
      return;
    }
    throw new IOException("Incomplete document");
  }
  
  public adb d()
    throws IOException
  {
    j();
    return a(3, "{");
  }
  
  public final void d(boolean paramBoolean)
  {
    k = paramBoolean;
  }
  
  public adb e()
    throws IOException
  {
    return a(3, 5, "}");
  }
  
  public adb f()
    throws IOException
  {
    if (j != null) {
      if (k)
      {
        j();
      }
      else
      {
        j = null;
        return this;
      }
    }
    l();
    c.write("null");
    return this;
  }
  
  public void flush()
    throws IOException
  {
    if (e != 0)
    {
      c.flush();
      return;
    }
    throw new IllegalStateException("JsonWriter is closed.");
  }
  
  public final boolean g()
  {
    return h;
  }
  
  public final boolean h()
  {
    return i;
  }
  
  public final boolean i()
  {
    return k;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.adb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */