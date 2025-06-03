package q5;

import android.text.Layout.Alignment;
import f;
import h5.a.a;

public final class f$d
{
  public long a = 0L;
  public long b = 0L;
  public CharSequence c;
  public int d = 2;
  public float e = -3.4028235E38F;
  public int f = 1;
  public int g = 0;
  public float h = -3.4028235E38F;
  public int i = Integer.MIN_VALUE;
  public float j = 1.0F;
  public int k = Integer.MIN_VALUE;
  
  public final a.a a()
  {
    float f1 = h;
    float f2 = -3.4028235E38F;
    if (f1 == -3.4028235E38F)
    {
      m = d;
      if (m != 4)
      {
        if (m != 5) {
          f1 = 0.5F;
        } else {
          f1 = 1.0F;
        }
      }
      else {
        f1 = 0.0F;
      }
    }
    int m = i;
    if (m == Integer.MIN_VALUE)
    {
      m = d;
      if (m != 1)
      {
        if (m != 3)
        {
          if (m == 4) {
            break label95;
          }
          if (m != 5)
          {
            m = 1;
            break label97;
          }
        }
        m = 2;
        break label97;
      }
      label95:
      m = 0;
    }
    label97:
    a.a locala = new a.a();
    int n = d;
    if (n != 1) {
      if (n != 2)
      {
        if (n != 3)
        {
          if (n == 4) {
            break label173;
          }
          if (n != 5)
          {
            f.p("Unknown textAlignment: ", n, "WebvttCueParser");
            localObject = null;
            break label178;
          }
        }
        localObject = Layout.Alignment.ALIGN_OPPOSITE;
        break label178;
      }
      else
      {
        localObject = Layout.Alignment.ALIGN_CENTER;
        break label178;
      }
    }
    label173:
    Object localObject = Layout.Alignment.ALIGN_NORMAL;
    label178:
    c = ((Layout.Alignment)localObject);
    float f3 = e;
    int i1 = f;
    boolean bool = f3 < -3.4028235E38F;
    if ((!bool) || (i1 != 0) || ((f3 >= 0.0F) && (f3 <= 1.0F)))
    {
      if (bool) {
        f2 = f3;
      } else if (i1 != 0) {}
    }
    else {
      f2 = 1.0F;
    }
    e = f2;
    f = i1;
    g = g;
    h = f1;
    i = m;
    f2 = j;
    if (m != 0)
    {
      if (m != 1)
      {
        if (m != 2) {
          throw new IllegalStateException(String.valueOf(m));
        }
      }
      else if (f1 <= 0.5F) {
        f1 *= 2.0F;
      } else {
        f1 = (1.0F - f1) * 2.0F;
      }
    }
    else {
      f1 = 1.0F - f1;
    }
    l = Math.min(f2, f1);
    p = k;
    localObject = c;
    if (localObject != null) {
      a = ((CharSequence)localObject);
    }
    return locala;
  }
}

/* Location:
 * Qualified Name:     q5.f.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */