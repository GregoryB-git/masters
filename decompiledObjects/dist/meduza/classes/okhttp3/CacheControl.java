package okhttp3;

import java.util.concurrent.TimeUnit;
import okhttp3.internal.http.HttpHeaders;

public final class CacheControl
{
  public final boolean a;
  public final boolean b;
  public final int c;
  public final int d;
  public final boolean e;
  public final boolean f;
  public final boolean g;
  public final int h;
  public final int i;
  public final boolean j;
  public final boolean k;
  public final boolean l;
  public String m;
  
  static
  {
    Builder localBuilder = new Builder();
    a = true;
    new CacheControl(localBuilder);
    localBuilder = new Builder();
    e = true;
    TimeUnit localTimeUnit = TimeUnit.SECONDS;
    int n = Integer.MAX_VALUE;
    long l1 = localTimeUnit.toSeconds(Integer.MAX_VALUE);
    if (l1 <= 2147483647L) {
      n = (int)l1;
    }
    c = n;
    new CacheControl(localBuilder);
  }
  
  public CacheControl(Builder paramBuilder)
  {
    a = a;
    b = false;
    c = b;
    d = -1;
    e = false;
    f = false;
    g = false;
    h = c;
    i = d;
    j = e;
    k = false;
    l = false;
  }
  
  public CacheControl(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, int paramInt3, int paramInt4, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8, String paramString)
  {
    a = paramBoolean1;
    b = paramBoolean2;
    c = paramInt1;
    d = paramInt2;
    e = paramBoolean3;
    f = paramBoolean4;
    g = paramBoolean5;
    h = paramInt3;
    i = paramInt4;
    j = paramBoolean6;
    k = paramBoolean7;
    l = paramBoolean8;
    m = paramString;
  }
  
  public static CacheControl a(Headers paramHeaders)
  {
    int n = a.length / 2;
    int i1 = 0;
    int i2 = 1;
    Object localObject1 = null;
    boolean bool1 = false;
    boolean bool2 = false;
    int i3 = -1;
    int i4 = -1;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    int i5 = -1;
    int i6 = -1;
    boolean bool6 = false;
    boolean bool7 = false;
    boolean bool16;
    for (boolean bool8 = false;; bool8 = bool16)
    {
      Object localObject2 = paramHeaders;
      if (i1 >= n) {
        break;
      }
      String str1 = ((Headers)localObject2).d(i1);
      String str2 = ((Headers)localObject2).f(i1);
      int i7;
      boolean bool9;
      boolean bool10;
      int i8;
      int i9;
      boolean bool11;
      boolean bool12;
      boolean bool13;
      int i10;
      int i11;
      boolean bool14;
      boolean bool15;
      if (str1.equalsIgnoreCase("Cache-Control"))
      {
        if (localObject1 == null)
        {
          localObject1 = str2;
          break label167;
        }
      }
      else
      {
        i7 = i2;
        localObject2 = localObject1;
        bool9 = bool1;
        bool10 = bool2;
        i8 = i3;
        i9 = i4;
        bool11 = bool3;
        bool12 = bool4;
        bool13 = bool5;
        i10 = i5;
        i11 = i6;
        bool14 = bool6;
        bool15 = bool7;
        bool16 = bool8;
        if (!str1.equalsIgnoreCase("Pragma")) {
          break label1233;
        }
      }
      i2 = 0;
      label167:
      int i12 = 0;
      for (;;)
      {
        i7 = i2;
        localObject2 = localObject1;
        bool9 = bool1;
        bool10 = bool2;
        i8 = i3;
        i9 = i4;
        bool11 = bool3;
        bool12 = bool4;
        bool13 = bool5;
        i10 = i5;
        i11 = i6;
        bool14 = bool6;
        bool15 = bool7;
        bool16 = bool8;
        if (i12 >= str2.length()) {
          break;
        }
        i9 = HttpHeaders.e(i12, str2, "=,;");
        str1 = str2.substring(i12, i9).trim();
        if ((i9 != str2.length()) && (str2.charAt(i9) != ','))
        {
          i10 = i9;
          if (str2.charAt(i9) == ';') {
            break label435;
          }
          while (i9 < str2.length())
          {
            i11 = str2.charAt(i9);
            i10 = i9;
            if (i11 != 32)
            {
              i10 = i9;
              if (i11 != 9) {
                break;
              }
            }
            i9 = i10 + 1;
          }
          if ((i9 < str2.length()) && (str2.charAt(i9) == '"'))
          {
            i9++;
            i10 = HttpHeaders.e(i9, str2, "\"");
            localObject2 = str2.substring(i9, i10);
            i10++;
            break label444;
          }
          i10 = HttpHeaders.e(i9, str2, ",;");
          localObject2 = str2.substring(i9, i10).trim();
          break label444;
        }
        label435:
        i10 = i9 + 1;
        localObject2 = null;
        label444:
        if ("no-cache".equalsIgnoreCase(str1))
        {
          bool16 = true;
          bool11 = bool2;
          i9 = i3;
          i11 = i4;
          bool14 = bool3;
          bool13 = bool4;
          bool15 = bool5;
          i8 = i5;
          i7 = i6;
          bool9 = bool6;
          bool10 = bool7;
        }
        else if ("no-store".equalsIgnoreCase(str1))
        {
          bool11 = true;
          bool16 = bool1;
          i9 = i3;
          i11 = i4;
          bool14 = bool3;
          bool13 = bool4;
          bool15 = bool5;
          i8 = i5;
          i7 = i6;
          bool9 = bool6;
          bool10 = bool7;
        }
        else if ("max-age".equalsIgnoreCase(str1))
        {
          i9 = HttpHeaders.c(-1, (String)localObject2);
          bool16 = bool1;
          bool11 = bool2;
          i11 = i4;
          bool14 = bool3;
          bool13 = bool4;
          bool15 = bool5;
          i8 = i5;
          i7 = i6;
          bool9 = bool6;
          bool10 = bool7;
        }
        else if ("s-maxage".equalsIgnoreCase(str1))
        {
          i11 = HttpHeaders.c(-1, (String)localObject2);
          bool16 = bool1;
          bool11 = bool2;
          i9 = i3;
          bool14 = bool3;
          bool13 = bool4;
          bool15 = bool5;
          i8 = i5;
          i7 = i6;
          bool9 = bool6;
          bool10 = bool7;
        }
        else if ("private".equalsIgnoreCase(str1))
        {
          bool14 = true;
          bool16 = bool1;
          bool11 = bool2;
          i9 = i3;
          i11 = i4;
          bool13 = bool4;
          bool15 = bool5;
          i8 = i5;
          i7 = i6;
          bool9 = bool6;
          bool10 = bool7;
        }
        else if ("public".equalsIgnoreCase(str1))
        {
          bool13 = true;
          bool16 = bool1;
          bool11 = bool2;
          i9 = i3;
          i11 = i4;
          bool14 = bool3;
          bool15 = bool5;
          i8 = i5;
          i7 = i6;
          bool9 = bool6;
          bool10 = bool7;
        }
        else if ("must-revalidate".equalsIgnoreCase(str1))
        {
          bool15 = true;
          bool16 = bool1;
          bool11 = bool2;
          i9 = i3;
          i11 = i4;
          bool14 = bool3;
          bool13 = bool4;
          i8 = i5;
          i7 = i6;
          bool9 = bool6;
          bool10 = bool7;
        }
        else if ("max-stale".equalsIgnoreCase(str1))
        {
          i8 = HttpHeaders.c(Integer.MAX_VALUE, (String)localObject2);
          bool16 = bool1;
          bool11 = bool2;
          i9 = i3;
          i11 = i4;
          bool14 = bool3;
          bool13 = bool4;
          bool15 = bool5;
          i7 = i6;
          bool9 = bool6;
          bool10 = bool7;
        }
        else if ("min-fresh".equalsIgnoreCase(str1))
        {
          i7 = HttpHeaders.c(-1, (String)localObject2);
          bool16 = bool1;
          bool11 = bool2;
          i9 = i3;
          i11 = i4;
          bool14 = bool3;
          bool13 = bool4;
          bool15 = bool5;
          i8 = i5;
          bool9 = bool6;
          bool10 = bool7;
        }
        else if ("only-if-cached".equalsIgnoreCase(str1))
        {
          bool9 = true;
          bool16 = bool1;
          bool11 = bool2;
          i9 = i3;
          i11 = i4;
          bool14 = bool3;
          bool13 = bool4;
          bool15 = bool5;
          i8 = i5;
          i7 = i6;
          bool10 = bool7;
        }
        else if ("no-transform".equalsIgnoreCase(str1))
        {
          bool10 = true;
          bool16 = bool1;
          bool11 = bool2;
          i9 = i3;
          i11 = i4;
          bool14 = bool3;
          bool13 = bool4;
          bool15 = bool5;
          i8 = i5;
          i7 = i6;
          bool9 = bool6;
        }
        else
        {
          bool16 = bool1;
          bool11 = bool2;
          i9 = i3;
          i11 = i4;
          bool14 = bool3;
          bool13 = bool4;
          bool15 = bool5;
          i8 = i5;
          i7 = i6;
          bool9 = bool6;
          bool10 = bool7;
          if ("immutable".equalsIgnoreCase(str1))
          {
            bool8 = true;
            bool10 = bool7;
            bool9 = bool6;
            i7 = i6;
            i8 = i5;
            bool15 = bool5;
            bool13 = bool4;
            bool14 = bool3;
            i11 = i4;
            i9 = i3;
            bool11 = bool2;
            bool16 = bool1;
          }
        }
        i12 = i10;
        bool1 = bool16;
        bool2 = bool11;
        i3 = i9;
        i4 = i11;
        bool3 = bool14;
        bool4 = bool13;
        bool5 = bool15;
        i5 = i8;
        i6 = i7;
        bool6 = bool9;
        bool7 = bool10;
      }
      label1233:
      i1++;
      i2 = i7;
      localObject1 = localObject2;
      bool1 = bool9;
      bool2 = bool10;
      i3 = i8;
      i4 = i9;
      bool3 = bool11;
      bool4 = bool12;
      bool5 = bool13;
      i5 = i10;
      i6 = i11;
      bool6 = bool14;
      bool7 = bool15;
    }
    if (i2 == 0) {
      localObject1 = null;
    }
    return new CacheControl(bool1, bool2, i3, i4, bool3, bool4, bool5, i5, i6, bool6, bool7, bool8, (String)localObject1);
  }
  
  public final String toString()
  {
    Object localObject = m;
    if (localObject == null)
    {
      localObject = new StringBuilder();
      if (a) {
        ((StringBuilder)localObject).append("no-cache, ");
      }
      if (b) {
        ((StringBuilder)localObject).append("no-store, ");
      }
      if (c != -1)
      {
        ((StringBuilder)localObject).append("max-age=");
        ((StringBuilder)localObject).append(c);
        ((StringBuilder)localObject).append(", ");
      }
      if (d != -1)
      {
        ((StringBuilder)localObject).append("s-maxage=");
        ((StringBuilder)localObject).append(d);
        ((StringBuilder)localObject).append(", ");
      }
      if (e) {
        ((StringBuilder)localObject).append("private, ");
      }
      if (f) {
        ((StringBuilder)localObject).append("public, ");
      }
      if (g) {
        ((StringBuilder)localObject).append("must-revalidate, ");
      }
      if (h != -1)
      {
        ((StringBuilder)localObject).append("max-stale=");
        ((StringBuilder)localObject).append(h);
        ((StringBuilder)localObject).append(", ");
      }
      if (i != -1)
      {
        ((StringBuilder)localObject).append("min-fresh=");
        ((StringBuilder)localObject).append(i);
        ((StringBuilder)localObject).append(", ");
      }
      if (j) {
        ((StringBuilder)localObject).append("only-if-cached, ");
      }
      if (k) {
        ((StringBuilder)localObject).append("no-transform, ");
      }
      if (l) {
        ((StringBuilder)localObject).append("immutable, ");
      }
      if (((StringBuilder)localObject).length() == 0)
      {
        localObject = "";
      }
      else
      {
        ((StringBuilder)localObject).delete(((StringBuilder)localObject).length() - 2, ((StringBuilder)localObject).length());
        localObject = ((StringBuilder)localObject).toString();
      }
      m = ((String)localObject);
    }
    return (String)localObject;
  }
  
  public static final class Builder
  {
    public boolean a;
    public int b = -1;
    public int c = -1;
    public int d = -1;
    public boolean e;
  }
}

/* Location:
 * Qualified Name:     okhttp3.CacheControl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */