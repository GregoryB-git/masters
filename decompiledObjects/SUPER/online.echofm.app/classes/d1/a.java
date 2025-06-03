package d1;

import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import c1.k;
import c1.p;
import c1.q;
import f0.a.b;
import g0.o;
import g0.z;
import j0.i;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a
  extends e
{
  public static final int[] A = { 0, 4, 8, 12, 16, 20, 24, 28 };
  public static final int[] B = { -1, -16711936, -16776961, -16711681, -65536, 65280, -65281 };
  public static final int[] C = { 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632 };
  public static final int[] D = { 174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251 };
  public static final int[] E = { 193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187 };
  public static final int[] F = { 195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496 };
  public static final boolean[] G = { 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0 };
  public static final int[] z = { 11, 1, 3, 12, 14, 5, 7, 9 };
  public final z h = new z();
  public final int i;
  public final int j;
  public final int k;
  public final long l;
  public final ArrayList m = new ArrayList();
  public a n = new a(0, 4);
  public List o;
  public List p;
  public int q;
  public int r;
  public boolean s;
  public boolean t;
  public byte u;
  public byte v;
  public int w = 0;
  public boolean x;
  public long y;
  
  public a(String paramString, int paramInt, long paramLong)
  {
    if (paramLong != -9223372036854775807L)
    {
      boolean bool;
      if (paramLong >= 16000L) {
        bool = true;
      } else {
        bool = false;
      }
      g0.a.a(bool);
      l = (paramLong * 1000L);
    }
    else
    {
      l = -9223372036854775807L;
    }
    int i1;
    if ("application/x-mp4-cea-608".equals(paramString)) {
      i1 = 2;
    } else {
      i1 = 3;
    }
    i = i1;
    if (paramInt != 1)
    {
      if (paramInt == 2) {
        break label178;
      }
      if (paramInt == 3) {
        break label170;
      }
      if (paramInt == 4) {
        break label157;
      }
      o.h("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
    }
    label157:
    label170:
    label178:
    for (k = 0;; k = 1)
    {
      j = 0;
      break;
      for (k = 1;; k = 0)
      {
        j = 1;
        break;
      }
    }
    O(0);
    N();
    x = true;
    y = -9223372036854775807L;
  }
  
  public static boolean B(byte paramByte)
  {
    boolean bool;
    if ((paramByte & 0xE0) == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean C(byte paramByte1, byte paramByte2)
  {
    boolean bool;
    if (((paramByte1 & 0xF6) == 18) && ((paramByte2 & 0xE0) == 32)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean D(byte paramByte1, byte paramByte2)
  {
    boolean bool;
    if (((paramByte1 & 0xF7) == 17) && ((paramByte2 & 0xF0) == 32)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean E(byte paramByte1, byte paramByte2)
  {
    boolean bool;
    if (((paramByte1 & 0xF6) == 20) && ((paramByte2 & 0xF0) == 32)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean F(byte paramByte1, byte paramByte2)
  {
    boolean bool;
    if (((paramByte1 & 0xF0) == 16) && ((paramByte2 & 0xC0) == 64)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean G(byte paramByte)
  {
    boolean bool;
    if ((paramByte & 0xF0) == 16) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean I(byte paramByte)
  {
    boolean bool;
    if ((paramByte & 0xF6) == 20) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean J(byte paramByte1, byte paramByte2)
  {
    boolean bool;
    if (((paramByte1 & 0xF7) == 17) && ((paramByte2 & 0xF0) == 48)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean K(byte paramByte1, byte paramByte2)
  {
    boolean bool;
    if (((paramByte1 & 0xF7) == 23) && (paramByte2 >= 33) && (paramByte2 <= 35)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean L(byte paramByte)
  {
    boolean bool = true;
    if ((1 > paramByte) || (paramByte > 15)) {
      bool = false;
    }
    return bool;
  }
  
  public static char r(byte paramByte)
  {
    return (char)C[((paramByte & 0x7F) - 32)];
  }
  
  public static int s(byte paramByte)
  {
    return paramByte >> 3 & 0x1;
  }
  
  public static char u(byte paramByte)
  {
    return (char)E[(paramByte & 0x1F)];
  }
  
  public static char v(byte paramByte)
  {
    return (char)F[(paramByte & 0x1F)];
  }
  
  public static char w(byte paramByte1, byte paramByte2)
  {
    if ((paramByte1 & 0x1) == 0) {
      return u(paramByte2);
    }
    return v(paramByte2);
  }
  
  public static char x(byte paramByte)
  {
    return (char)D[(paramByte & 0xF)];
  }
  
  public final void A(byte paramByte1, byte paramByte2)
  {
    byte b = z[(paramByte1 & 0x7)];
    paramByte1 = b;
    if ((paramByte2 & 0x20) != 0) {
      paramByte1 = b + 1;
    }
    if (paramByte1 != a.b(n))
    {
      if ((q != 1) && (!n.i()))
      {
        locala = new a(q, r);
        n = locala;
        m.add(locala);
      }
      a.c(n, paramByte1);
    }
    boolean bool = false;
    if ((paramByte2 & 0x10) == 16) {
      paramByte1 = 1;
    } else {
      paramByte1 = 0;
    }
    if ((paramByte2 & 0x1) == 1) {
      bool = true;
    }
    b = paramByte2 >> 1 & 0x7;
    a locala = n;
    if (paramByte1 != 0) {
      paramByte2 = 8;
    } else {
      paramByte2 = b;
    }
    locala.p(paramByte2, bool);
    if (paramByte1 != 0) {
      a.d(n, A[b]);
    }
  }
  
  public final boolean H(boolean paramBoolean, byte paramByte1, byte paramByte2)
  {
    if ((paramBoolean) && (G(paramByte1)))
    {
      if ((t) && (u == paramByte1) && (v == paramByte2))
      {
        t = false;
        return true;
      }
      t = true;
      u = paramByte1;
      v = ((byte)paramByte2);
    }
    else
    {
      t = false;
    }
    return false;
  }
  
  public final void M(byte paramByte1, byte paramByte2)
  {
    if (L(paramByte1))
    {
      x = false;
    }
    else if (I(paramByte1))
    {
      if ((paramByte2 != 32) && (paramByte2 != 47)) {}
      switch (paramByte2)
      {
      default: 
        switch (paramByte2)
        {
        }
        break;
      case 37: 
      case 38: 
      case 39: 
        x = true;
      }
    }
  }
  
  public final void N()
  {
    n.j(q);
    m.clear();
    m.add(n);
  }
  
  public final void O(int paramInt)
  {
    int i1 = q;
    if (i1 == paramInt) {
      return;
    }
    q = paramInt;
    if (paramInt == 3)
    {
      for (i1 = 0; i1 < m.size(); i1++) {
        ((a)m.get(i1)).l(paramInt);
      }
      return;
    }
    N();
    if ((i1 == 3) || (paramInt == 1) || (paramInt == 0)) {
      o = Collections.emptyList();
    }
  }
  
  public final void P(int paramInt)
  {
    r = paramInt;
    n.m(paramInt);
  }
  
  public final boolean Q()
  {
    long l1 = l;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (l1 != -9223372036854775807L) {
      if (y == -9223372036854775807L)
      {
        bool2 = bool1;
      }
      else
      {
        bool2 = bool1;
        if (l() - y >= l) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public final boolean R(byte paramByte)
  {
    if (B(paramByte)) {
      w = s(paramByte);
    }
    boolean bool;
    if (w == k) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void flush()
  {
    super.flush();
    o = null;
    p = null;
    O(0);
    P(4);
    N();
    s = false;
    t = false;
    u = ((byte)0);
    v = ((byte)0);
    w = 0;
    x = true;
    y = -9223372036854775807L;
  }
  
  public k g()
  {
    List localList = o;
    p = localList;
    return new f((List)g0.a.e(localList));
  }
  
  public void h(p paramp)
  {
    paramp = (ByteBuffer)g0.a.e(r);
    h.R(paramp.array(), paramp.limit());
    int i1 = 0;
    byte b;
    int i5;
    label177:
    do
    {
      for (;;)
      {
        int i2 = h.a();
        int i3 = i;
        if (i2 < i3) {
          break label450;
        }
        if (i3 == 2) {
          i2 = -4;
        } else {
          i2 = h.G();
        }
        int i4 = h.G();
        i3 = h.G();
        if (((i2 & 0x2) == 0) && ((i2 & 0x1) == j))
        {
          b = (byte)(i4 & 0x7F);
          i5 = (byte)(i3 & 0x7F);
          if ((b != 0) || (i5 != 0))
          {
            boolean bool1 = s;
            if ((i2 & 0x4) == 4)
            {
              paramp = G;
              if ((paramp[i4] != 0) && (paramp[i3] != 0))
              {
                bool2 = true;
                break label177;
              }
            }
            boolean bool2 = false;
            s = bool2;
            if (!H(bool2, b, i5))
            {
              if (s) {
                break;
              }
              if (bool1)
              {
                N();
                i1 = 1;
              }
            }
          }
        }
      }
      M(b, i5);
    } while ((!x) || (!R(b)));
    int i6;
    if (B(b)) {
      if (J(b, i5))
      {
        paramp = n;
        i1 = x(i5);
        i6 = i1;
      }
    }
    for (;;)
    {
      paramp.e(i6);
      break;
      if (C(b, i5))
      {
        n.f();
        paramp = n;
        i1 = w(b, i5);
        i6 = i1;
      }
      else
      {
        if (D(b, i5))
        {
          y(i5);
          break;
        }
        if (F(b, i5))
        {
          A(b, i5);
          break;
        }
        if (K(b, i5))
        {
          a.a(n, i5 - 32);
          break;
        }
        if (!E(b, i5)) {
          break;
        }
        z(i5);
        break;
        n.e(r(b));
        if ((i5 & 0xE0) == 0) {
          break;
        }
        paramp = n;
        i1 = r(i5);
        i6 = i1;
      }
    }
    label450:
    if (i1 != 0)
    {
      i1 = q;
      if ((i1 == 1) || (i1 == 3))
      {
        o = t();
        y = l();
      }
    }
  }
  
  public q j()
  {
    Object localObject = super.j();
    if (localObject != null) {
      return (q)localObject;
    }
    if (Q())
    {
      q localq = k();
      if (localq != null)
      {
        o = Collections.emptyList();
        y = -9223372036854775807L;
        localObject = g();
        localq.z(l(), (k)localObject, Long.MAX_VALUE);
        return localq;
      }
    }
    return null;
  }
  
  public boolean m()
  {
    boolean bool;
    if (o != p) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void release() {}
  
  public final List t()
  {
    int i1 = m.size();
    ArrayList localArrayList1 = new ArrayList(i1);
    int i2 = 2;
    int i3 = 0;
    int i4 = 0;
    Object localObject;
    while (i4 < i1)
    {
      localObject = ((a)m.get(i4)).g(Integer.MIN_VALUE);
      localArrayList1.add(localObject);
      int i5 = i2;
      if (localObject != null) {
        i5 = Math.min(i2, i);
      }
      i4++;
      i2 = i5;
    }
    ArrayList localArrayList2 = new ArrayList(i1);
    for (i4 = i3; i4 < i1; i4++)
    {
      f0.a locala = (f0.a)localArrayList1.get(i4);
      if (locala != null)
      {
        localObject = locala;
        if (i != i2) {
          localObject = (f0.a)g0.a.e(((a)m.get(i4)).g(i2));
        }
        localArrayList2.add(localObject);
      }
    }
    return localArrayList2;
  }
  
  public final void y(byte paramByte)
  {
    n.e(' ');
    boolean bool;
    if ((paramByte & 0x1) == 1) {
      bool = true;
    } else {
      bool = false;
    }
    n.p(paramByte >> 1 & 0x7, bool);
  }
  
  public final void z(byte paramByte)
  {
    if (paramByte != 32)
    {
      if (paramByte != 41)
      {
        switch (paramByte)
        {
        default: 
          int i1 = q;
          if (i1 == 0) {
            return;
          }
          if (paramByte != 33) {
            switch (paramByte)
            {
            default: 
              break;
            case 47: 
              o = t();
            case 46: 
            case 45: 
            case 44: 
              for (;;)
              {
                N();
                break;
                if ((i1 != 1) || (n.i())) {
                  break;
                }
                n.k();
                break;
                o = Collections.emptyList();
                paramByte = q;
                if (paramByte != 1) {
                  if (paramByte != 3) {
                    break;
                  }
                }
              }
            }
          } else {
            n.f();
          }
          return;
        case 39: 
          O(1);
          P(4);
          return;
        case 38: 
          O(1);
          P(3);
          return;
        }
        O(1);
        P(2);
        return;
      }
      O(3);
      return;
    }
    O(2);
  }
  
  public static final class a
  {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final StringBuilder c = new StringBuilder();
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    
    public a(int paramInt1, int paramInt2)
    {
      j(paramInt1);
      h = paramInt2;
    }
    
    public static void n(SpannableStringBuilder paramSpannableStringBuilder, int paramInt1, int paramInt2, int paramInt3)
    {
      if (paramInt3 == -1) {
        return;
      }
      paramSpannableStringBuilder.setSpan(new ForegroundColorSpan(paramInt3), paramInt1, paramInt2, 33);
    }
    
    public static void o(SpannableStringBuilder paramSpannableStringBuilder, int paramInt1, int paramInt2)
    {
      paramSpannableStringBuilder.setSpan(new StyleSpan(2), paramInt1, paramInt2, 33);
    }
    
    public static void q(SpannableStringBuilder paramSpannableStringBuilder, int paramInt1, int paramInt2)
    {
      paramSpannableStringBuilder.setSpan(new UnderlineSpan(), paramInt1, paramInt2, 33);
    }
    
    public void e(char paramChar)
    {
      if (c.length() < 32) {
        c.append(paramChar);
      }
    }
    
    public void f()
    {
      int i = c.length();
      if (i > 0)
      {
        c.delete(i - 1, i);
        for (int j = a.size() - 1; j >= 0; j--)
        {
          a locala = (a)a.get(j);
          int k = c;
          if (k != i) {
            break;
          }
          c = (k - 1);
        }
      }
    }
    
    public f0.a g(int paramInt)
    {
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
      for (int i = 0; i < b.size(); i++)
      {
        localSpannableStringBuilder.append((CharSequence)b.get(i));
        localSpannableStringBuilder.append('\n');
      }
      localSpannableStringBuilder.append(h());
      if (localSpannableStringBuilder.length() == 0) {
        return null;
      }
      i = e + f;
      int j = 32 - i - localSpannableStringBuilder.length();
      int k = i - j;
      if (paramInt == Integer.MIN_VALUE) {
        if ((g == 2) && ((Math.abs(k) < 3) || (j < 0))) {
          paramInt = 1;
        } else if ((g == 2) && (k > 0)) {
          paramInt = 2;
        } else {
          paramInt = 0;
        }
      }
      if (paramInt != 1)
      {
        if (paramInt != 2) {}
        for (;;)
        {
          f1 = i / 32.0F * 0.8F + 0.1F;
          break;
          i = 32 - j;
        }
      }
      float f1 = 0.5F;
      j = d;
      if (j > 7)
      {
        i = j - 17;
      }
      else
      {
        i = j;
        if (g == 1) {
          i = j - (h - 1);
        }
      }
      return new a.b().o(localSpannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i, 1).k(f1).l(paramInt).a();
    }
    
    public final SpannableString h()
    {
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(c);
      int i = localSpannableStringBuilder.length();
      int j = -1;
      int k = j;
      int m = k;
      int n = m;
      int i1 = 0;
      int i2 = i1;
      int i3 = i2;
      int i4 = m;
      int i5 = i2;
      int i6 = k;
      while (i1 < a.size())
      {
        a locala = (a)a.get(i1);
        boolean bool = b;
        i2 = a;
        k = n;
        int i7 = i3;
        if (i2 != 8)
        {
          if (i2 == 7) {
            k = 1;
          } else {
            k = 0;
          }
          if (i2 != 7) {
            n = a.q()[i2];
          }
          i7 = k;
          k = n;
        }
        i2 = c;
        int i8 = i1 + 1;
        if (i8 < a.size()) {
          n = a.get(i8)).c;
        } else {
          n = i;
        }
        if (i2 == n)
        {
          i1 = i8;
          n = k;
          i3 = i7;
        }
        else
        {
          if ((j != -1) && (!bool))
          {
            q(localSpannableStringBuilder, j, i2);
            m = -1;
          }
          else
          {
            m = j;
            if (j == -1)
            {
              m = j;
              if (bool) {
                m = i2;
              }
            }
          }
          int i9;
          if ((i6 != -1) && (i7 == 0))
          {
            o(localSpannableStringBuilder, i6, i2);
            i9 = -1;
          }
          else
          {
            i9 = i6;
            if (i6 == -1)
            {
              i9 = i6;
              if (i7 != 0) {
                i9 = i2;
              }
            }
          }
          i1 = i8;
          j = m;
          i6 = i9;
          n = k;
          i3 = i7;
          if (k != i4)
          {
            n(localSpannableStringBuilder, i5, i2, i4);
            i4 = k;
            i1 = i8;
            j = m;
            i6 = i9;
            i5 = i2;
            n = k;
            i3 = i7;
          }
        }
      }
      if ((j != -1) && (j != i)) {
        q(localSpannableStringBuilder, j, i);
      }
      if ((i6 != -1) && (i6 != i)) {
        o(localSpannableStringBuilder, i6, i);
      }
      if (i5 != i) {
        n(localSpannableStringBuilder, i5, i, i4);
      }
      return new SpannableString(localSpannableStringBuilder);
    }
    
    public boolean i()
    {
      boolean bool;
      if ((a.isEmpty()) && (b.isEmpty()) && (c.length() == 0)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void j(int paramInt)
    {
      g = paramInt;
      a.clear();
      b.clear();
      c.setLength(0);
      d = 15;
      e = 0;
      f = 0;
    }
    
    public void k()
    {
      b.add(h());
      c.setLength(0);
      a.clear();
      int i = Math.min(h, d);
      while (b.size() >= i) {
        b.remove(0);
      }
    }
    
    public void l(int paramInt)
    {
      g = paramInt;
    }
    
    public void m(int paramInt)
    {
      h = paramInt;
    }
    
    public void p(int paramInt, boolean paramBoolean)
    {
      a.add(new a(paramInt, paramBoolean, c.length()));
    }
    
    public static class a
    {
      public final int a;
      public final boolean b;
      public int c;
      
      public a(int paramInt1, boolean paramBoolean, int paramInt2)
      {
        a = paramInt1;
        b = paramBoolean;
        c = paramInt2;
      }
    }
  }
}

/* Location:
 * Qualified Name:     d1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */