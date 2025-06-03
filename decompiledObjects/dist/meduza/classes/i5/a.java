package i5;

import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import h5.l;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v5.e0;
import v5.m;
import v5.u;
import z3.g;

public final class a
  extends c
{
  public static final int[] A = { -1, -16711936, -16776961, -16711681, -65536, 65280, -65281 };
  public static final int[] B = { 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632 };
  public static final int[] C = { 174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251 };
  public static final int[] D = { 193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187 };
  public static final int[] E = { 195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496 };
  public static final boolean[] F = { 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0 };
  public static final int[] y = { 11, 1, 3, 12, 14, 5, 7, 9 };
  public static final int[] z = { 0, 4, 8, 12, 16, 20, 24, 28 };
  public final u g = new u();
  public final int h;
  public final int i;
  public final int j;
  public final long k = 16000000L;
  public final ArrayList<a> l = new ArrayList();
  public a m = new a(0, 4);
  public List<h5.a> n;
  public List<h5.a> o;
  public int p;
  public int q;
  public boolean r;
  public boolean s;
  public byte t;
  public byte u;
  public int v = 0;
  public boolean w;
  public long x;
  
  public a(String paramString, int paramInt)
  {
    int i1;
    if ("application/x-mp4-cea-608".equals(paramString)) {
      i1 = 2;
    } else {
      i1 = 3;
    }
    h = i1;
    if (paramInt != 1) {
      if (paramInt != 2)
      {
        if (paramInt != 3)
        {
          if (paramInt != 4)
          {
            m.f("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            break label131;
          }
          j = 1;
        }
        else
        {
          j = 0;
        }
        i = 1;
        break label141;
      }
      else
      {
        j = 1;
        break label136;
      }
    }
    label131:
    j = 0;
    label136:
    i = 0;
    label141:
    k(0);
    j();
    w = true;
    x = -9223372036854775807L;
  }
  
  public final d e()
  {
    List localList = n;
    o = localList;
    localList.getClass();
    return new d(localList);
  }
  
  public final void f(c.a parama)
  {
    parama = c;
    parama.getClass();
    g.E(parama.array(), parama.limit());
    int i1 = 0;
    for (;;)
    {
      parama = g;
      int i2 = c;
      int i3 = b;
      int i4 = h;
      if (i2 - i3 < i4) {
        break;
      }
      if (i4 == 2) {
        i2 = -4;
      } else {
        i2 = parama.v();
      }
      int i5 = g.v();
      int i6 = g.v();
      if (((i2 & 0x2) == 0) && ((i2 & 0x1) == i))
      {
        i3 = (byte)(i5 & 0x7F);
        i4 = (byte)(i6 & 0x7F);
        if ((i3 != 0) || (i4 != 0))
        {
          boolean bool1 = r;
          if ((i2 & 0x4) == 4)
          {
            parama = F;
            if ((parama[i5] != 0) && (parama[i6] != 0))
            {
              bool2 = true;
              break label184;
            }
          }
          boolean bool2 = false;
          label184:
          r = bool2;
          if (bool2)
          {
            if ((i3 & 0xF0) == 16) {
              i2 = 1;
            } else {
              i2 = 0;
            }
            if (i2 != 0)
            {
              if ((s) && (t == i3) && (u == i4))
              {
                s = false;
                i2 = 1;
                break label281;
              }
              s = true;
              t = ((byte)i3);
              u = ((byte)i4);
              break label279;
            }
          }
          s = false;
          label279:
          i2 = 0;
          label281:
          if (i2 == 0)
          {
            if (!bool2)
            {
              if (!bool1) {
                continue;
              }
              j();
            }
            else
            {
              if ((1 <= i3) && (i3 <= 15)) {
                i2 = 1;
              } else {
                i2 = 0;
              }
              if (i2 == 0)
              {
                if ((i3 & 0xF6) == 20) {
                  i2 = 1;
                } else {
                  i2 = 0;
                }
                if (i2 == 0) {
                  break label440;
                }
                if ((i4 == 32) || (i4 == 47)) {
                  break label435;
                }
              }
              switch (i4)
              {
              default: 
                switch (i4)
                {
                default: 
                  break;
                case 42: 
                case 43: 
                  w = false;
                }
                break;
              case 37: 
              case 38: 
              case 39: 
                label435:
                w = true;
              }
              label440:
              if (!w) {
                continue;
              }
              i6 = i3 & 0xE0;
              if (i6 == 0) {
                i2 = 1;
              } else {
                i2 = 0;
              }
              if (i2 != 0) {
                v = (i3 >> 3 & 0x1);
              }
              if (v == j) {
                i2 = 1;
              } else {
                i2 = 0;
              }
              if (i2 == 0) {
                continue;
              }
              if (i6 == 0) {
                i1 = 1;
              } else {
                i1 = 0;
              }
              if (i1 != 0)
              {
                i6 = i3 & 0xF7;
                if ((i6 == 17) && ((i4 & 0xF0) == 48)) {
                  i1 = 1;
                } else {
                  i1 = 0;
                }
                if (i1 != 0)
                {
                  parama = m;
                  i1 = C[(i4 & 0xF)];
                }
                else
                {
                  i2 = i3 & 0xF6;
                  if ((i2 == 18) && ((i4 & 0xE0) == 32)) {
                    i1 = 1;
                  } else {
                    i1 = 0;
                  }
                  if (i1 == 0) {
                    break label664;
                  }
                  m.b();
                  parama = m;
                  if ((i3 & 0x1) == 0) {
                    i1 = D[(i4 & 0x1F)];
                  }
                }
              }
              char c;
              label664:
              int[] arrayOfInt;
              for (i1 = E[(i4 & 0x1F)];; i1 = arrayOfInt[((i4 & 0x7F) - 32)])
              {
                c = (char)i1;
                break;
                if ((i6 == 17) && ((i4 & 0xF0) == 32)) {
                  i1 = 1;
                } else {
                  i1 = 0;
                }
                if (i1 != 0)
                {
                  m.a(' ');
                  if ((i4 & 0x1) == 1) {
                    bool2 = true;
                  } else {
                    bool2 = false;
                  }
                  parama = m;
                  a.add(new a.a.a(i4 >> 1 & 0x7, c.length(), bool2));
                  break label1448;
                }
                if (((i3 & 0xF0) == 16) && ((i4 & 0xC0) == 64)) {
                  i1 = 1;
                } else {
                  i1 = 0;
                }
                if (i1 != 0)
                {
                  i3 = y[(i3 & 0x7)];
                  if ((i4 & 0x20) != 0) {
                    i1 = 1;
                  } else {
                    i1 = 0;
                  }
                  i2 = i3;
                  if (i1 != 0) {
                    i2 = i3 + 1;
                  }
                  parama = m;
                  if (i2 != d)
                  {
                    if ((p != 1) && (!parama.e()))
                    {
                      parama = new a(p, q);
                      m = parama;
                      l.add(parama);
                    }
                    m.d = i2;
                  }
                  if ((i4 & 0x10) == 16) {
                    i1 = 1;
                  } else {
                    i1 = 0;
                  }
                  if ((i4 & 0x1) == 1) {
                    bool2 = true;
                  } else {
                    bool2 = false;
                  }
                  i3 = i4 >> 1 & 0x7;
                  parama = m;
                  if (i1 != 0) {
                    i2 = 8;
                  } else {
                    i2 = i3;
                  }
                  a.add(new a.a.a(i2, c.length(), bool2));
                  if (i1 == 0) {
                    break label1448;
                  }
                  m.e = z[i3];
                  break label1448;
                }
                if ((i6 == 23) && (i4 >= 33) && (i4 <= 35)) {
                  i1 = 1;
                } else {
                  i1 = 0;
                }
                if (i1 != 0)
                {
                  m.f = (i4 - 32);
                  break label1448;
                }
                if ((i2 == 20) && ((i4 & 0xF0) == 32)) {
                  i1 = 1;
                } else {
                  i1 = 0;
                }
                if (i1 == 0) {
                  break label1448;
                }
                if (i4 != 32)
                {
                  if (i4 != 41)
                  {
                    switch (i4)
                    {
                    default: 
                      i1 = p;
                      if (i1 != 0) {
                        break;
                      }
                      break;
                    case 39: 
                      k(1);
                      q = 4;
                      m.h = 4;
                      break;
                    case 38: 
                      k(1);
                      q = 3;
                      m.h = 3;
                      break;
                    case 37: 
                      k(1);
                      q = 2;
                      m.h = 2;
                      break;
                    }
                    if (i4 != 33)
                    {
                      switch (i4)
                      {
                      default: 
                        break;
                      case 47: 
                        n = i();
                        break;
                      case 45: 
                        if ((i1 != 1) || (m.e())) {
                          break label1448;
                        }
                        parama = m;
                        b.add(parama.d());
                        c.setLength(0);
                        a.clear();
                        i1 = Math.min(h, d);
                        while (b.size() >= i1) {
                          b.remove(0);
                        }
                      case 44: 
                        n = Collections.emptyList();
                        i1 = p;
                        if ((i1 != 1) && (i1 != 3)) {
                          break label1448;
                        }
                      }
                      j();
                      break label1448;
                    }
                    m.b();
                    break label1448;
                  }
                  k(3);
                  break label1448;
                }
                k(2);
                break label1448;
                parama = m;
                arrayOfInt = B;
                parama.a((char)arrayOfInt[((i3 & 0x7F) - 32)]);
                if ((i4 & 0xE0) == 0) {
                  break label1448;
                }
                parama = m;
              }
              parama.a(c);
            }
            label1448:
            i1 = 1;
          }
        }
      }
    }
    if (i1 != 0)
    {
      i1 = p;
      if ((i1 == 1) || (i1 == 3))
      {
        n = i();
        x = e;
      }
    }
  }
  
  public final void flush()
  {
    super.flush();
    n = null;
    o = null;
    k(0);
    q = 4;
    m.h = 4;
    j();
    r = false;
    s = false;
    t = ((byte)0);
    u = ((byte)0);
    v = 0;
    w = true;
    x = -9223372036854775807L;
  }
  
  public final l g()
  {
    l locall = super.g();
    if (locall != null) {
      return locall;
    }
    long l1 = k;
    int i1 = 0;
    int i2 = i1;
    if (l1 != -9223372036854775807L)
    {
      long l2 = x;
      if (l2 == -9223372036854775807L)
      {
        i2 = i1;
      }
      else
      {
        i2 = i1;
        if (e - l2 >= l1) {
          i2 = 1;
        }
      }
    }
    if (i2 != 0)
    {
      locall = (l)b.pollFirst();
      if (locall != null)
      {
        n = Collections.emptyList();
        x = -9223372036854775807L;
        d locald = e();
        locall.p(e, locald, Long.MAX_VALUE);
        return locall;
      }
    }
    return null;
  }
  
  public final boolean h()
  {
    boolean bool;
    if (n != o) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final List<h5.a> i()
  {
    int i1 = l.size();
    ArrayList localArrayList1 = new ArrayList(i1);
    int i2 = 0;
    int i3 = 2;
    int i4 = 0;
    Object localObject;
    while (i4 < i1)
    {
      localObject = ((a)l.get(i4)).c(Integer.MIN_VALUE);
      localArrayList1.add(localObject);
      int i5 = i3;
      if (localObject != null) {
        i5 = Math.min(i3, q);
      }
      i4++;
      i3 = i5;
    }
    ArrayList localArrayList2 = new ArrayList(i1);
    for (i4 = i2; i4 < i1; i4++)
    {
      h5.a locala = (h5.a)localArrayList1.get(i4);
      if (locala != null)
      {
        localObject = locala;
        if (q != i3)
        {
          localObject = ((a)l.get(i4)).c(i3);
          localObject.getClass();
        }
        localArrayList2.add(localObject);
      }
    }
    return localArrayList2;
  }
  
  public final void j()
  {
    a locala = m;
    g = p;
    a.clear();
    b.clear();
    c.setLength(0);
    d = 15;
    e = 0;
    f = 0;
    l.clear();
    l.add(m);
  }
  
  public final void k(int paramInt)
  {
    int i1 = p;
    if (i1 == paramInt) {
      return;
    }
    p = paramInt;
    if (paramInt == 3)
    {
      for (i1 = 0; i1 < l.size(); i1++) {
        l.get(i1)).g = paramInt;
      }
      return;
    }
    j();
    if ((i1 == 3) || (paramInt == 1) || (paramInt == 0)) {
      n = Collections.emptyList();
    }
  }
  
  public final void release() {}
  
  public static final class a
  {
    public final ArrayList a;
    public final ArrayList b;
    public final StringBuilder c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    
    public a(int paramInt1, int paramInt2)
    {
      ArrayList localArrayList1 = new ArrayList();
      a = localArrayList1;
      ArrayList localArrayList2 = new ArrayList();
      b = localArrayList2;
      StringBuilder localStringBuilder = new StringBuilder();
      c = localStringBuilder;
      g = paramInt1;
      localArrayList1.clear();
      localArrayList2.clear();
      localStringBuilder.setLength(0);
      d = 15;
      e = 0;
      f = 0;
      h = paramInt2;
    }
    
    public final void a(char paramChar)
    {
      if (c.length() < 32) {
        c.append(paramChar);
      }
    }
    
    public final void b()
    {
      int i = c.length();
      if (i > 0)
      {
        c.delete(i - 1, i);
        int j = a.size();
        for (;;)
        {
          j--;
          if (j < 0) {
            break;
          }
          a locala = (a)a.get(j);
          int k = c;
          if (k != i) {
            break;
          }
          c = (k - 1);
        }
      }
    }
    
    public final h5.a c(int paramInt)
    {
      int i = e + f;
      int j = 32 - i;
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
      for (int k = 0; k < b.size(); k++)
      {
        localObject = (CharSequence)b.get(k);
        int m = e0.a;
        if (((CharSequence)localObject).length() > j) {
          localObject = ((CharSequence)localObject).subSequence(0, j);
        }
        localSpannableStringBuilder.append((CharSequence)localObject);
        localSpannableStringBuilder.append('\n');
      }
      Object localObject = d();
      k = e0.a;
      if (((SpannableString)localObject).length() > j) {
        localObject = ((SpannableString)localObject).subSequence(0, j);
      }
      localSpannableStringBuilder.append((CharSequence)localObject);
      if (localSpannableStringBuilder.length() == 0) {
        return null;
      }
      k = j - localSpannableStringBuilder.length();
      j = i - k;
      if (paramInt == Integer.MIN_VALUE) {
        if ((g == 2) && ((Math.abs(j) < 3) || (k < 0))) {
          paramInt = 1;
        } else if ((g == 2) && (j > 0)) {
          paramInt = 2;
        } else {
          paramInt = 0;
        }
      }
      float f1;
      if (paramInt != 1)
      {
        if (paramInt != 2) {
          k = i;
        } else {
          k = 32 - k;
        }
        f1 = k / 32.0F * 0.8F + 0.1F;
      }
      else
      {
        f1 = 0.5F;
      }
      i = d;
      if (i > 7)
      {
        k = i - 15 - 2;
      }
      else
      {
        k = i;
        if (g == 1) {
          k = i - (h - 1);
        }
      }
      localObject = new h5.a.a();
      a = localSpannableStringBuilder;
      c = Layout.Alignment.ALIGN_NORMAL;
      e = k;
      f = 1;
      h = f1;
      i = paramInt;
      return ((h5.a.a)localObject).a();
    }
    
    public final SpannableString d()
    {
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(c);
      int i = localSpannableStringBuilder.length();
      int j = -1;
      int k = j;
      int m = k;
      int n = m;
      int i1 = 0;
      int i2 = 0;
      int i3 = 0;
      int i4 = m;
      int i5 = k;
      while (i1 < a.size())
      {
        a locala = (a)a.get(i1);
        boolean bool = b;
        m = a;
        int i6 = i3;
        k = n;
        if (m != 8)
        {
          if (m == 7) {
            k = 1;
          } else {
            k = 0;
          }
          if (m != 7) {
            n = a.A[m];
          }
          i6 = k;
          k = n;
        }
        m = c;
        int i7 = i1 + 1;
        if (i7 < a.size()) {
          n = a.get(i7)).c;
        } else {
          n = i;
        }
        if (m == n)
        {
          i1 = i7;
          i3 = i6;
          n = k;
        }
        else
        {
          int i8;
          if ((j != -1) && (!bool))
          {
            localSpannableStringBuilder.setSpan(new UnderlineSpan(), j, m, 33);
            i8 = -1;
          }
          else
          {
            i8 = j;
            if (j == -1)
            {
              i8 = j;
              if (bool) {
                i8 = m;
              }
            }
          }
          int i9;
          if ((i5 != -1) && (i6 == 0))
          {
            localSpannableStringBuilder.setSpan(new StyleSpan(2), i5, m, 33);
            i9 = -1;
          }
          else
          {
            i9 = i5;
            if (i5 == -1)
            {
              i9 = i5;
              if (i6 != 0) {
                i9 = m;
              }
            }
          }
          i1 = i7;
          j = i8;
          i5 = i9;
          i3 = i6;
          n = k;
          if (k != i4)
          {
            if (i4 != -1) {
              localSpannableStringBuilder.setSpan(new ForegroundColorSpan(i4), i2, m, 33);
            }
            i4 = k;
            i1 = i7;
            j = i8;
            i5 = i9;
            i2 = m;
            i3 = i6;
            n = k;
          }
        }
      }
      if ((j != -1) && (j != i)) {
        localSpannableStringBuilder.setSpan(new UnderlineSpan(), j, i, 33);
      }
      if ((i5 != -1) && (i5 != i)) {
        localSpannableStringBuilder.setSpan(new StyleSpan(2), i5, i, 33);
      }
      if ((i2 != i) && (i4 != -1)) {
        localSpannableStringBuilder.setSpan(new ForegroundColorSpan(i4), i2, i, 33);
      }
      return new SpannableString(localSpannableStringBuilder);
    }
    
    public final boolean e()
    {
      boolean bool;
      if ((a.isEmpty()) && (b.isEmpty()) && (c.length() == 0)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public static final class a
    {
      public final int a;
      public final boolean b;
      public int c;
      
      public a(int paramInt1, int paramInt2, boolean paramBoolean)
      {
        a = paramInt1;
        b = paramBoolean;
        c = paramInt2;
      }
    }
  }
}

/* Location:
 * Qualified Name:     i5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */