package g1;

import W2.c;
import android.text.TextUtils;

public final class c$a
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
  
  public c$a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11)
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
      paramString = c.e(arrayOfString[n].trim());
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

/* Location:
 * Qualified Name:     g1.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */