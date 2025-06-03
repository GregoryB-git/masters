package i5;

import android.graphics.Color;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import f;
import h5.a;
import h5.a.a;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v5.m;
import v5.t;
import v5.u;
import z3.g;

public final class b
  extends c
{
  public final u g = new u();
  public final t h = new t();
  public int i = -1;
  public final int j;
  public final b[] k;
  public b l;
  public List<a> m;
  public List<a> n;
  public c o;
  public int p;
  
  public b(int paramInt, List<byte[]> paramList)
  {
    int i1 = paramInt;
    if (paramInt == -1) {
      i1 = 1;
    }
    j = i1;
    if ((paramList != null) && (paramList.size() == 1) && (((byte[])paramList.get(0)).length == 1) && (((byte[])paramList.get(0))[0] != 1)) {}
    k = new b[8];
    for (paramInt = 0; paramInt < 8; paramInt++) {
      k[paramInt] = new b();
    }
    l = k[0];
  }
  
  public final d e()
  {
    List localList = m;
    n = localList;
    localList.getClass();
    return new d(localList);
  }
  
  public final void f(c.a parama)
  {
    parama = c;
    parama.getClass();
    byte[] arrayOfByte = parama.array();
    g.E(arrayOfByte, parama.limit());
    for (;;)
    {
      parama = g;
      if (c - b < 3) {
        break;
      }
      int i1 = parama.v() & 0x7;
      int i2 = i1 & 0x3;
      boolean bool = false;
      if ((i1 & 0x4) == 4) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      int i3 = (byte)g.v();
      int i4 = (byte)g.v();
      if (((i2 == 2) || (i2 == 3)) && (i1 != 0))
      {
        if (i2 == 3)
        {
          i();
          i2 = (i3 & 0xC0) >> 6;
          i1 = i;
          if ((i1 != -1) && (i2 != (i1 + 1) % 4))
          {
            k();
            parama = new StringBuilder();
            parama.append("Sequence number discontinuity. previous=");
            parama.append(i);
            parama.append(" current=");
            parama.append(i2);
            m.f("Cea708Decoder", parama.toString());
          }
          i = i2;
          i3 &= 0x3F;
          i1 = i3;
          if (i3 == 0) {
            i1 = 64;
          }
          parama = new c(i2, i1);
          o = parama;
          arrayOfByte = c;
          i1 = d;
          d = (i1 + 1);
          arrayOfByte[i1] = ((byte)i4);
        }
        else
        {
          if (i2 == 2) {
            bool = true;
          }
          x6.b.q(bool);
          parama = o;
          if (parama == null)
          {
            m.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
            continue;
          }
          arrayOfByte = c;
          i2 = d;
          i1 = i2 + 1;
          arrayOfByte[i2] = ((byte)i3);
          d = (i1 + 1);
          arrayOfByte[i1] = ((byte)i4);
        }
        parama = o;
        if (d == b * 2 - 1) {
          i();
        }
      }
    }
  }
  
  public final void flush()
  {
    super.flush();
    m = null;
    n = null;
    p = 0;
    l = k[0];
    k();
    o = null;
  }
  
  public final boolean h()
  {
    boolean bool;
    if (m != n) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void i()
  {
    Object localObject = o;
    if (localObject == null) {
      return;
    }
    int i1 = d;
    int i2 = b;
    int i3 = 2;
    if (i1 != i2 * 2 - 1)
    {
      localObject = f.l("DtvCcPacket ended prematurely; size is ");
      ((StringBuilder)localObject).append(o.b * 2 - 1);
      ((StringBuilder)localObject).append(", but current index is ");
      ((StringBuilder)localObject).append(o.d);
      ((StringBuilder)localObject).append(" (sequence number ");
      ((StringBuilder)localObject).append(o.a);
      ((StringBuilder)localObject).append(");");
      m.b("Cea708Decoder", ((StringBuilder)localObject).toString());
    }
    t localt = h;
    localObject = o;
    localt.j(c, d);
    int i4 = 0;
    while (h.b() > 0)
    {
      localObject = h;
      i2 = 3;
      int i5 = ((t)localObject).g(3);
      int i6 = h.g(5);
      int i7 = 7;
      i1 = i5;
      if (i5 == 7)
      {
        h.m(i3);
        i5 = h.g(6);
        i1 = i5;
        if (i5 < 7)
        {
          f.p("Invalid extended service number: ", i5, "Cea708Decoder");
          i1 = i5;
        }
      }
      if (i6 == 0)
      {
        if (i1 != 0)
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("serviceNumber is non-zero (");
          ((StringBuilder)localObject).append(i1);
          ((StringBuilder)localObject).append(") when blockSize is 0");
          m.f("Cea708Decoder", ((StringBuilder)localObject).toString());
        }
      }
      else if (i1 != j)
      {
        h.n(i6);
      }
      else
      {
        int i8 = h.e();
        i5 = i3;
        i1 = i4;
        for (;;)
        {
          i4 = i1;
          i3 = i5;
          if (h.e() >= i6 * 8 + i8) {
            break;
          }
          localObject = h;
          i3 = 8;
          int i9 = ((t)localObject).g(8);
          i4 = 24;
          int i10;
          if (i9 != 16)
          {
            if (i9 <= 31)
            {
              if (i9 == 0) {
                continue;
              }
              if (i9 != i2)
              {
                if (i9 != 8) {
                  switch (i9)
                  {
                  case 14: 
                  default: 
                    if ((i9 >= 17) && (i9 <= 23))
                    {
                      f.p("Currently unsupported COMMAND_EXT1 Command: ", i9, "Cea708Decoder");
                      localObject = h;
                    }
                    break;
                  case 13: 
                    l.a('\n');
                    break;
                  case 12: 
                    k();
                    continue;
                    if ((i9 >= 24) && (i9 <= 31))
                    {
                      f.p("Currently unsupported COMMAND_P16 Command: ", i9, "Cea708Decoder");
                      localObject = h;
                      i3 = 16;
                      ((t)localObject).m(i3);
                      continue;
                    }
                    f.p("Invalid C0 command: ", i9, "Cea708Decoder");
                    break;
                  }
                }
                localObject = l;
                i3 = b.length();
                if (i3 <= 0) {
                  continue;
                }
                b.delete(i3 - 1, i3);
                continue;
              }
              m = j();
              continue;
            }
            if (i9 <= 127)
            {
              if (i9 == 127)
              {
                localObject = l;
                i1 = 9835;
                i10 = i1;
              }
              else
              {
                localObject = l;
                i1 = (char)(i9 & 0xFF);
                i10 = i1;
              }
              ((b)localObject).a(i10);
              i1 = 1;
              continue;
            }
            if (i9 <= 159)
            {
              i3 = i2;
              boolean bool4;
              switch (i9)
              {
              case 147: 
              case 148: 
              case 149: 
              case 150: 
              default: 
                i1 = 1;
                f.p("Invalid C1 command: ", i9, "Cea708Decoder");
                i3 = i2;
                break;
              case 152: 
              case 153: 
              case 154: 
              case 155: 
              case 156: 
              case 157: 
              case 158: 
              case 159: 
                i1 = i9 - 152;
                localObject = k[i1];
                h.m(i5);
                boolean bool1 = h.f();
                boolean bool3 = h.f();
                h.f();
                i3 = h.g(i2);
                bool4 = h.f();
                int i12 = h.g(i7);
                i9 = h.g(8);
                i4 = h.g(4);
                i7 = h.g(4);
                h.m(i5);
                h.g(6);
                h.m(i5);
                i5 = h.g(3);
                i2 = h.g(3);
                c = true;
                d = bool1;
                k = bool3;
                e = i3;
                f = bool4;
                g = i12;
                h = i9;
                i = i4;
                i3 = j;
                i7++;
                if (i3 != i7)
                {
                  j = i7;
                  while (((bool3) && (a.size() >= j)) || (a.size() >= 15)) {
                    a.remove(0);
                  }
                }
                if ((i5 != 0) && (m != i5))
                {
                  m = i5;
                  i3 = i5 - 1;
                  i5 = b.C[i3];
                  int i11 = b.B[i3];
                  i7 = b.z[i3];
                  i7 = b.A[i3];
                  i3 = b.y[i3];
                  o = i5;
                  l = i3;
                }
                if ((i2 != 0) && (n != i2))
                {
                  n = i2;
                  i2--;
                  i5 = b.E[i2];
                  i5 = b.D[i2];
                  ((b)localObject).e(false, false);
                  ((b)localObject).f(b.w, b.F[i2]);
                }
                if (p != i1)
                {
                  p = i1;
                  localObject = k[i1];
                  i2 = 3;
                }
                break;
              case 151: 
                if (!l.c)
                {
                  localObject = h;
                  i1 = 32;
                }
                else
                {
                  i1 = h.g(2);
                  i2 = b.c(h.g(2), h.g(2), h.g(2), i1);
                  h.g(2);
                  b.c(h.g(2), h.g(2), h.g(2), 0);
                  h.f();
                  h.f();
                  h.g(2);
                  h.g(2);
                  i1 = h.g(2);
                  h.m(8);
                  localObject = l;
                  o = i2;
                  l = i1;
                }
                break;
              case 146: 
                if (l.c)
                {
                  h.m(4);
                  i1 = h.g(4);
                  h.m(2);
                  h.g(6);
                  localObject = l;
                  if (v != i1) {
                    ((b)localObject).a('\n');
                  }
                  v = i1;
                }
                break;
              case 145: 
                if (!l.c)
                {
                  localObject = h;
                  i1 = i4;
                }
                else
                {
                  i1 = h.g(2);
                  i1 = b.c(h.g(2), h.g(2), h.g(2), i1);
                  i2 = h.g(2);
                  i2 = b.c(h.g(2), h.g(2), h.g(2), i2);
                  h.m(2);
                  b.c(h.g(2), h.g(2), h.g(2), 0);
                  l.f(i1, i2);
                }
                break;
              case 144: 
                if (!l.c)
                {
                  localObject = h;
                  i1 = 16;
                  ((t)localObject).m(i1);
                  i3 = 3;
                }
                else
                {
                  h.g(4);
                  h.g(2);
                  h.g(2);
                  bool4 = h.f();
                  boolean bool2 = h.f();
                  localObject = h;
                  i3 = 3;
                  ((t)localObject).g(3);
                  h.g(3);
                  l.e(bool4, bool2);
                }
                break;
              case 143: 
                k();
                i3 = i2;
                break;
              case 141: 
                h.m(8);
                i3 = i2;
                break;
              case 140: 
                for (i1 = 1;; i1++)
                {
                  i3 = i2;
                  if (i1 > 8) {
                    break;
                  }
                  if (h.f()) {
                    k[(8 - i1)].d();
                  }
                }
              case 139: 
                for (i1 = 1;; i1++)
                {
                  i3 = i2;
                  if (i1 > 8) {
                    break;
                  }
                  if (h.f())
                  {
                    localObject = k[(8 - i1)];
                    d ^= true;
                  }
                }
              case 138: 
                for (i1 = 1;; i1++)
                {
                  i3 = i2;
                  if (i1 > 8) {
                    break;
                  }
                  if (h.f()) {
                    k[(8 - i1)].d = false;
                  }
                }
              case 137: 
                for (i1 = 1;; i1++)
                {
                  i3 = i2;
                  if (i1 > 8) {
                    break;
                  }
                  if (h.f()) {
                    k[(8 - i1)].d = true;
                  }
                }
              case 142: 
                i1 = 1;
                break;
              case 136: 
                i7 = 1;
                for (i5 = 1;; i5++)
                {
                  i1 = i7;
                  i3 = i2;
                  if (i5 > 8) {
                    break;
                  }
                  if (h.f())
                  {
                    localObject = k[(8 - i5)];
                    a.clear();
                    b.clear();
                    p = -1;
                    q = -1;
                    r = -1;
                    t = -1;
                    v = 0;
                  }
                }
              }
              i1 = 1;
              i5 = i9 - 128;
              i3 = i2;
              if (p != i5)
              {
                p = i5;
                localObject = k[i5];
                l = ((b)localObject);
                i1 = 1;
                i3 = i2;
              }
            }
            else if (i9 <= 255)
            {
              l.a((char)(i9 & 0xFF));
              i1 = 1;
              i3 = i2;
            }
            else
            {
              f.p("Invalid base command: ", i9, "Cea708Decoder");
              i3 = i2;
            }
            i5 = i1;
          }
          else
          {
            i4 = h.g(8);
            if (i4 <= 31)
            {
              if (i4 <= 7)
              {
                i5 = i1;
                i3 = i2;
              }
              else
              {
                if (i4 <= 15)
                {
                  localObject = h;
                  i5 = i3;
                }
                else if (i4 <= 23)
                {
                  localObject = h;
                  i5 = 16;
                }
                else
                {
                  i5 = i1;
                  i3 = i2;
                  if (i4 > 31) {
                    break label2906;
                  }
                  localObject = h;
                  i5 = 24;
                }
                ((t)localObject).m(i5);
                i5 = i1;
                i3 = i2;
              }
            }
            else
            {
              i7 = 7;
              i5 = 160;
              if (i4 <= 127)
              {
                if (i4 != 32)
                {
                  if (i4 != 33)
                  {
                    if (i4 != 37)
                    {
                      if (i4 != 42)
                      {
                        if (i4 != 44)
                        {
                          if (i4 != 63)
                          {
                            if (i4 != 57)
                            {
                              if (i4 != 58)
                              {
                                if (i4 != 60)
                                {
                                  if (i4 != 61)
                                  {
                                    switch (i4)
                                    {
                                    default: 
                                      switch (i4)
                                      {
                                      default: 
                                        f.p("Invalid G2 character: ", i4, "Cea708Decoder");
                                      }
                                      break;
                                    case 53: 
                                      localObject = l;
                                      i1 = 8226;
                                      i10 = i1;
                                      break;
                                    case 52: 
                                      localObject = l;
                                      i1 = 8221;
                                      i10 = i1;
                                      break;
                                    case 51: 
                                      localObject = l;
                                      i1 = 8220;
                                      i10 = i1;
                                      break;
                                    case 50: 
                                      localObject = l;
                                      i1 = 8217;
                                      i10 = i1;
                                      break;
                                    case 49: 
                                      localObject = l;
                                      i1 = 8216;
                                      i10 = i1;
                                      break;
                                    case 48: 
                                      localObject = l;
                                      i1 = 9608;
                                      i10 = i1;
                                      break;
                                      localObject = l;
                                      i1 = 9484;
                                      i10 = i1;
                                      break;
                                      localObject = l;
                                      i1 = 9496;
                                      i10 = i1;
                                      break;
                                      localObject = l;
                                      i1 = 9472;
                                      i10 = i1;
                                      break;
                                      localObject = l;
                                      i1 = 9492;
                                      i10 = i1;
                                      break;
                                      localObject = l;
                                      i1 = 9488;
                                      i10 = i1;
                                      break;
                                      localObject = l;
                                      i1 = 9474;
                                      i10 = i1;
                                      break;
                                      localObject = l;
                                      i1 = 8542;
                                      i10 = i1;
                                      break;
                                      localObject = l;
                                      i1 = 8541;
                                      i10 = i1;
                                      break;
                                      localObject = l;
                                      i1 = 8540;
                                      i10 = i1;
                                      break;
                                      localObject = l;
                                      i1 = 8539;
                                      i10 = i1;
                                      break;
                                    }
                                  }
                                  else
                                  {
                                    localObject = l;
                                    i1 = 8480;
                                    i10 = i1;
                                  }
                                }
                                else
                                {
                                  localObject = l;
                                  i1 = 339;
                                  i10 = i1;
                                }
                              }
                              else
                              {
                                localObject = l;
                                i1 = 353;
                                i10 = i1;
                              }
                            }
                            else
                            {
                              localObject = l;
                              i1 = 8482;
                              i10 = i1;
                            }
                          }
                          else
                          {
                            localObject = l;
                            i1 = 376;
                            i10 = i1;
                          }
                        }
                        else
                        {
                          localObject = l;
                          i1 = 338;
                          i10 = i1;
                        }
                      }
                      else
                      {
                        localObject = l;
                        i1 = 352;
                        i10 = i1;
                      }
                    }
                    else
                    {
                      localObject = l;
                      i1 = 8230;
                      i10 = i1;
                    }
                  }
                  else
                  {
                    localObject = l;
                    i10 = i5;
                  }
                }
                else
                {
                  localObject = l;
                  i1 = 32;
                  i10 = i1;
                }
                ((b)localObject).a(i10);
                i5 = 1;
              }
              else
              {
                i5 = 32;
                if (i4 > 159) {
                  break label2924;
                }
                if (i4 <= 135)
                {
                  localObject = h;
                }
                else
                {
                  if (i4 > 143) {
                    break label2853;
                  }
                  localObject = h;
                  i5 = 40;
                }
                ((t)localObject).m(i5);
                i5 = i1;
                break label2903;
                label2853:
                i5 = i1;
                if (i4 <= 159)
                {
                  localObject = h;
                  i5 = 2;
                  ((t)localObject).m(2);
                  i3 = h.g(6);
                  h.m(i3 * 8);
                  continue;
                }
              }
              label2903:
              i3 = i2;
            }
          }
          label2906:
          i2 = 2;
          i7 = 7;
          i1 = i5;
          i5 = i2;
          i2 = i3;
          continue;
          label2924:
          if (i4 <= 255)
          {
            if (i4 == 160)
            {
              localObject = l;
              i1 = 13252;
              i10 = i1;
            }
            else
            {
              f.p("Invalid G3 character: ", i4, "Cea708Decoder");
              localObject = l;
              i1 = 95;
              i10 = i1;
            }
            ((b)localObject).a(i10);
            i1 = 1;
          }
          else
          {
            f.p("Invalid extended command: ", i4, "Cea708Decoder");
          }
          i5 = 2;
        }
      }
    }
    if (i4 != 0) {
      m = j();
    }
    o = null;
  }
  
  public final List<a> j()
  {
    ArrayList localArrayList = new ArrayList();
    int i1 = 0;
    for (int i2 = 0; i2 < 8; i2++)
    {
      localObject = k[i2];
      if ((c) && ((!a.isEmpty()) || (b.length() != 0))) {
        i3 = 0;
      } else {
        i3 = 1;
      }
      if (i3 == 0)
      {
        b localb = k[i2];
        if (d)
        {
          if ((c) && ((!a.isEmpty()) || (b.length() != 0))) {
            i3 = 0;
          } else {
            i3 = 1;
          }
          if (i3 != 0)
          {
            localObject = null;
          }
          else
          {
            SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
            for (i3 = 0; i3 < a.size(); i3++)
            {
              localSpannableStringBuilder.append((CharSequence)a.get(i3));
              localSpannableStringBuilder.append('\n');
            }
            localSpannableStringBuilder.append(localb.b());
            i3 = l;
            if (i3 != 0) {
              if (i3 != 1)
              {
                if (i3 != 2)
                {
                  if (i3 != 3)
                  {
                    localObject = f.l("Unexpected justification value: ");
                    ((StringBuilder)localObject).append(l);
                    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
                  }
                }
                else
                {
                  localObject = Layout.Alignment.ALIGN_CENTER;
                  break label297;
                }
              }
              else
              {
                localObject = Layout.Alignment.ALIGN_OPPOSITE;
                break label297;
              }
            }
            localObject = Layout.Alignment.ALIGN_NORMAL;
            label297:
            float f1;
            float f2;
            if (f)
            {
              f1 = h / 99.0F;
              f2 = g / 99.0F;
            }
            else
            {
              f1 = h / 209.0F;
              f2 = g / 74.0F;
            }
            int i4 = i;
            i3 = i4 / 3;
            if (i3 == 0) {
              i3 = 0;
            } else if (i3 == 1) {
              i3 = 1;
            } else {
              i3 = 2;
            }
            i4 %= 3;
            if (i4 == 0) {
              i4 = 0;
            } else if (i4 == 1) {
              i4 = 1;
            } else {
              i4 = 2;
            }
            int i5 = o;
            boolean bool;
            if (i5 != b.x) {
              bool = true;
            } else {
              bool = false;
            }
            localObject = new a(localSpannableStringBuilder, (Layout.Alignment)localObject, f2 * 0.9F + 0.05F, i3, f1 * 0.9F + 0.05F, i4, bool, i5, e);
          }
          if (localObject != null) {
            localArrayList.add(localObject);
          }
        }
      }
    }
    Collections.sort(localArrayList, a.c);
    Object localObject = new ArrayList(localArrayList.size());
    for (int i3 = i1; i3 < localArrayList.size(); i3++) {
      ((ArrayList)localObject).add(geta);
    }
    return Collections.unmodifiableList((List)localObject);
  }
  
  public final void k()
  {
    for (int i1 = 0; i1 < 8; i1++) {
      k[i1].d();
    }
  }
  
  public static final class a
  {
    public static final b0.d c = new b0.d(1);
    public final a a;
    public final int b;
    
    public a(SpannableStringBuilder paramSpannableStringBuilder, Layout.Alignment paramAlignment, float paramFloat1, int paramInt1, float paramFloat2, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4)
    {
      a.a locala = new a.a();
      a = paramSpannableStringBuilder;
      c = paramAlignment;
      e = paramFloat1;
      f = 0;
      g = paramInt1;
      h = paramFloat2;
      i = paramInt2;
      l = -3.4028235E38F;
      if (paramBoolean)
      {
        o = paramInt3;
        n = true;
      }
      a = locala.a();
      b = paramInt4;
    }
  }
  
  public static final class b
  {
    public static final int[] A;
    public static final boolean[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;
    public static final int w = c(2, 2, 2, 0);
    public static final int x;
    public static final int[] y;
    public static final int[] z;
    public final ArrayList a = new ArrayList();
    public final SpannableStringBuilder b = new SpannableStringBuilder();
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    
    static
    {
      int i1 = c(0, 0, 0, 0);
      x = i1;
      int i2 = c(0, 0, 0, 3);
      y = new int[] { 0, 0, 0, 0, 0, 2, 0 };
      z = new int[] { 0, 0, 0, 0, 0, 0, 2 };
      A = new int[] { 3, 3, 3, 3, 3, 3, 1 };
      B = new boolean[] { 0, 0, 0, 1, 1, 1, 0 };
      C = new int[] { i1, i2, i1, i1, i2, i1, i1 };
      D = new int[] { 0, 1, 2, 3, 4, 3, 4 };
      E = new int[] { 0, 0, 0, 0, 0, 3, 3 };
      F = new int[] { i1, i1, i1, i1, i1, i2, i2 };
    }
    
    public b()
    {
      d();
    }
    
    public static int c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      x6.b.x(paramInt1, 4);
      x6.b.x(paramInt2, 4);
      x6.b.x(paramInt3, 4);
      x6.b.x(paramInt4, 4);
      int i1 = 0;
      if ((paramInt4 != 0) && (paramInt4 != 1)) {
        if (paramInt4 != 2)
        {
          if (paramInt4 == 3)
          {
            paramInt4 = 0;
            break label60;
          }
        }
        else
        {
          paramInt4 = 127;
          break label60;
        }
      }
      paramInt4 = 255;
      label60:
      if (paramInt1 > 1) {
        paramInt1 = 255;
      } else {
        paramInt1 = 0;
      }
      if (paramInt2 > 1) {
        paramInt2 = 255;
      } else {
        paramInt2 = 0;
      }
      if (paramInt3 > 1) {
        i1 = 255;
      }
      return Color.argb(paramInt4, paramInt1, paramInt2, i1);
    }
    
    public final void a(char paramChar)
    {
      if (paramChar == '\n')
      {
        a.add(b());
        b.clear();
        if (p != -1) {
          p = 0;
        }
        if (q != -1) {
          q = 0;
        }
        if (r != -1) {
          r = 0;
        }
        if (t != -1) {
          t = 0;
        }
        while (((k) && (a.size() >= j)) || (a.size() >= 15)) {
          a.remove(0);
        }
      }
      b.append(paramChar);
    }
    
    public final SpannableString b()
    {
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(b);
      int i1 = localSpannableStringBuilder.length();
      if (i1 > 0)
      {
        if (p != -1) {
          localSpannableStringBuilder.setSpan(new StyleSpan(2), p, i1, 33);
        }
        if (q != -1) {
          localSpannableStringBuilder.setSpan(new UnderlineSpan(), q, i1, 33);
        }
        if (r != -1) {
          localSpannableStringBuilder.setSpan(new ForegroundColorSpan(s), r, i1, 33);
        }
        if (t != -1) {
          localSpannableStringBuilder.setSpan(new BackgroundColorSpan(u), t, i1, 33);
        }
      }
      return new SpannableString(localSpannableStringBuilder);
    }
    
    public final void d()
    {
      a.clear();
      b.clear();
      p = -1;
      q = -1;
      r = -1;
      t = -1;
      v = 0;
      c = false;
      d = false;
      e = 4;
      f = false;
      g = 0;
      h = 0;
      i = 0;
      j = 15;
      k = true;
      l = 0;
      m = 0;
      n = 0;
      int i1 = x;
      o = i1;
      s = w;
      u = i1;
    }
    
    public final void e(boolean paramBoolean1, boolean paramBoolean2)
    {
      if (p != -1)
      {
        if (!paramBoolean1)
        {
          b.setSpan(new StyleSpan(2), p, b.length(), 33);
          p = -1;
        }
      }
      else if (paramBoolean1) {
        p = b.length();
      }
      if (q != -1)
      {
        if (!paramBoolean2)
        {
          b.setSpan(new UnderlineSpan(), q, b.length(), 33);
          q = -1;
        }
      }
      else if (paramBoolean2) {
        q = b.length();
      }
    }
    
    public final void f(int paramInt1, int paramInt2)
    {
      if ((r != -1) && (s != paramInt1)) {
        b.setSpan(new ForegroundColorSpan(s), r, b.length(), 33);
      }
      if (paramInt1 != w)
      {
        r = b.length();
        s = paramInt1;
      }
      if ((t != -1) && (u != paramInt2)) {
        b.setSpan(new BackgroundColorSpan(u), t, b.length(), 33);
      }
      if (paramInt2 != x)
      {
        t = b.length();
        u = paramInt2;
      }
    }
  }
  
  public static final class c
  {
    public final int a;
    public final int b;
    public final byte[] c;
    public int d;
    
    public c(int paramInt1, int paramInt2)
    {
      a = paramInt1;
      b = paramInt2;
      c = new byte[paramInt2 * 2 - 1];
      d = 0;
    }
  }
}

/* Location:
 * Qualified Name:     i5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */