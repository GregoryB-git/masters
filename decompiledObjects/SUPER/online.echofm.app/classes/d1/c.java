package d1;

import android.graphics.Color;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import c1.k;
import c1.p;
import f0.a.b;
import g0.d;
import g0.o;
import g0.y;
import g0.z;
import j0.i;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class c
  extends e
{
  public final z h = new z();
  public final y i = new y();
  public int j = -1;
  public final boolean k;
  public final int l;
  public final b[] m;
  public b n;
  public List o;
  public List p;
  public c q;
  public int r;
  
  public c(int paramInt, List paramList)
  {
    boolean bool = true;
    int i1 = paramInt;
    if (paramInt == -1) {
      i1 = 1;
    }
    l = i1;
    if ((paramList == null) || (!d.f(paramList))) {
      bool = false;
    }
    k = bool;
    m = new b[8];
    for (paramInt = 0; paramInt < 8; paramInt++) {
      m[paramInt] = new b();
    }
    n = m[0];
  }
  
  private void G()
  {
    for (int i1 = 0; i1 < 8; i1++) {
      m[i1].l();
    }
  }
  
  private List r()
  {
    ArrayList localArrayList = new ArrayList();
    int i1 = 0;
    for (int i2 = 0; i2 < 8; i2++) {
      if ((!m[i2].j()) && (m[i2].k()))
      {
        localObject = m[i2].c();
        if (localObject != null) {
          localArrayList.add(localObject);
        }
      }
    }
    Collections.sort(localArrayList, a.b());
    Object localObject = new ArrayList(localArrayList.size());
    for (i2 = i1; i2 < localArrayList.size(); i2++) {
      ((List)localObject).add(geta);
    }
    return Collections.unmodifiableList((List)localObject);
  }
  
  public final void A(int paramInt)
  {
    Object localObject;
    if (paramInt == 160)
    {
      localObject = n;
      paramInt = 13252;
    }
    int i2;
    for (int i1 = paramInt;; i2 = paramInt)
    {
      ((b)localObject).a(i1);
      break;
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Invalid G3 character: ");
      ((StringBuilder)localObject).append(paramInt);
      o.h("Cea708Decoder", ((StringBuilder)localObject).toString());
      localObject = n;
      paramInt = 95;
    }
  }
  
  public final void B()
  {
    int i1 = i.h(4);
    int i2 = i.h(2);
    int i3 = i.h(2);
    boolean bool1 = i.g();
    boolean bool2 = i.g();
    int i4 = i.h(3);
    int i5 = i.h(3);
    n.m(i1, i2, i3, bool1, bool2, i4, i5);
  }
  
  public final void C()
  {
    int i1 = i.h(2);
    i1 = b.h(i.h(2), i.h(2), i.h(2), i1);
    int i2 = i.h(2);
    int i3 = b.h(i.h(2), i.h(2), i.h(2), i2);
    i.r(2);
    i2 = b.g(i.h(2), i.h(2), i.h(2));
    n.n(i1, i3, i2);
  }
  
  public final void D()
  {
    i.r(4);
    int i1 = i.h(4);
    i.r(2);
    int i2 = i.h(6);
    n.o(i1, i2);
  }
  
  public final void E()
  {
    int i1 = i.h(2);
    int i2 = b.h(i.h(2), i.h(2), i.h(2), i1);
    int i3 = i.h(2);
    int i4 = b.g(i.h(2), i.h(2), i.h(2));
    i1 = i3;
    if (i.g()) {
      i1 = i3 | 0x4;
    }
    boolean bool = i.g();
    i3 = i.h(2);
    int i5 = i.h(2);
    int i6 = i.h(2);
    i.r(8);
    n.q(i2, i4, bool, i1, i3, i5, i6);
  }
  
  public final void F()
  {
    Object localObject1 = q;
    if (d != b * 2 - 1)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("DtvCcPacket ended prematurely; size is ");
      ((StringBuilder)localObject1).append(q.b * 2 - 1);
      ((StringBuilder)localObject1).append(", but current index is ");
      ((StringBuilder)localObject1).append(q.d);
      ((StringBuilder)localObject1).append(" (sequence number ");
      ((StringBuilder)localObject1).append(q.a);
      ((StringBuilder)localObject1).append(");");
      o.b("Cea708Decoder", ((StringBuilder)localObject1).toString());
    }
    localObject1 = i;
    Object localObject2 = q;
    ((y)localObject1).o(c, d);
    int i1 = 0;
    while (i.b() > 0)
    {
      int i2 = i.h(3);
      int i3 = i.h(5);
      int i4 = i2;
      if (i2 == 7)
      {
        i.r(2);
        i2 = i.h(6);
        i4 = i2;
        if (i2 < 7)
        {
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("Invalid extended service number: ");
          ((StringBuilder)localObject1).append(i2);
          o.h("Cea708Decoder", ((StringBuilder)localObject1).toString());
          i4 = i2;
        }
      }
      if (i3 == 0)
      {
        if (i4 != 0)
        {
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("serviceNumber is non-zero (");
          ((StringBuilder)localObject1).append(i4);
          ((StringBuilder)localObject1).append(") when blockSize is 0");
          o.h("Cea708Decoder", ((StringBuilder)localObject1).toString());
        }
      }
      else if (i4 != l)
      {
        i.s(i3);
      }
      else
      {
        i2 = i.e();
        i4 = i1;
        for (;;)
        {
          i1 = i4;
          if (i.e() >= i2 + i3 * 8) {
            break;
          }
          i1 = i.h(8);
          if (i1 == 16) {
            break label452;
          }
          if (i1 > 31) {
            break label370;
          }
          s(i1);
        }
        label370:
        if (i1 <= 127) {
          x(i1);
        }
        for (;;)
        {
          label381:
          i4 = 1;
          break;
          if (i1 <= 159)
          {
            t(i1);
          }
          else
          {
            if (i1 > 255) {
              break label417;
            }
            y(i1);
          }
        }
        label417:
        localObject1 = new StringBuilder();
        for (localObject2 = "Invalid base command: ";; localObject2 = "Invalid extended command: ")
        {
          ((StringBuilder)localObject1).append((String)localObject2);
          ((StringBuilder)localObject1).append(i1);
          o.h("Cea708Decoder", ((StringBuilder)localObject1).toString());
          break;
          label452:
          i1 = i.h(8);
          if (i1 <= 31)
          {
            u(i1);
            break;
          }
          if (i1 <= 127)
          {
            z(i1);
            break label381;
          }
          if (i1 <= 159)
          {
            v(i1);
            break;
          }
          if (i1 <= 255)
          {
            A(i1);
            break label381;
          }
          localObject1 = new StringBuilder();
        }
      }
    }
    if (i1 != 0) {
      o = r();
    }
  }
  
  public void flush()
  {
    super.flush();
    o = null;
    p = null;
    r = 0;
    n = m[0];
    G();
    q = null;
  }
  
  public k g()
  {
    List localList = o;
    p = localList;
    return new f((List)g0.a.e(localList));
  }
  
  public void h(p paramp)
  {
    Object localObject = (ByteBuffer)g0.a.e(r);
    paramp = ((ByteBuffer)localObject).array();
    h.R(paramp, ((Buffer)localObject).limit());
    while (h.a() >= 3)
    {
      int i1 = h.G();
      int i2 = i1 & 0x3;
      boolean bool = false;
      if ((i1 & 0x4) == 4) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      int i3 = (byte)h.G();
      int i4 = (byte)h.G();
      if (((i2 == 2) || (i2 == 3)) && (i1 != 0))
      {
        if (i2 == 3)
        {
          q();
          int i5 = (i3 & 0xC0) >> 6;
          i1 = j;
          if ((i1 != -1) && (i5 != (i1 + 1) % 4))
          {
            G();
            paramp = new StringBuilder();
            paramp.append("Sequence number discontinuity. previous=");
            paramp.append(j);
            paramp.append(" current=");
            paramp.append(i5);
            o.h("Cea708Decoder", paramp.toString());
          }
          j = i5;
          i2 = i3 & 0x3F;
          i1 = i2;
          if (i2 == 0) {
            i1 = 64;
          }
          localObject = new c(i5, i1);
          q = ((c)localObject);
          paramp = c;
          i1 = d;
          d = (i1 + 1);
          paramp[i1] = ((byte)i4);
        }
        else
        {
          if (i2 == 2) {
            bool = true;
          }
          g0.a.a(bool);
          localObject = q;
          if (localObject == null)
          {
            o.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
            continue;
          }
          paramp = c;
          i1 = d;
          paramp[i1] = ((byte)i3);
          d = (i1 + 2);
          paramp[(i1 + 1)] = ((byte)i4);
        }
        paramp = q;
        if (d == b * 2 - 1) {
          q();
        }
      }
    }
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
  
  public final void q()
  {
    if (q == null) {
      return;
    }
    F();
    q = null;
  }
  
  public final void s(int paramInt)
  {
    if (paramInt != 0)
    {
      int i1;
      if (paramInt != 3)
      {
        i1 = 8;
        if (paramInt == 8) {}
      }
      switch (paramInt)
      {
      default: 
        if ((paramInt >= 17) && (paramInt <= 23))
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Currently unsupported COMMAND_EXT1 Command: ");
          ((StringBuilder)localObject).append(paramInt);
          o.h("Cea708Decoder", ((StringBuilder)localObject).toString());
          localObject = i;
        }
        for (paramInt = i1;; paramInt = 16)
        {
          ((y)localObject).r(paramInt);
          return;
          if ((paramInt < 24) || (paramInt > 31)) {
            break;
          }
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Currently unsupported COMMAND_P16 Command: ");
          ((StringBuilder)localObject).append(paramInt);
          o.h("Cea708Decoder", ((StringBuilder)localObject).toString());
          localObject = i;
        }
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Invalid C0 command: ");
        ((StringBuilder)localObject).append(paramInt);
        o.h("Cea708Decoder", ((StringBuilder)localObject).toString());
        break;
      case 13: 
        n.a('\n');
        break;
      case 12: 
        G();
        break;
        n.b();
        break;
        o = r();
      }
    }
  }
  
  public final void t(int paramInt)
  {
    int i1 = 16;
    int i2 = 1;
    int i3 = 1;
    int i4 = 1;
    Object localObject;
    switch (paramInt)
    {
    case 147: 
    case 148: 
    case 149: 
    case 150: 
    default: 
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Invalid C1 command: ");
      ((StringBuilder)localObject).append(paramInt);
      o.h("Cea708Decoder", ((StringBuilder)localObject).toString());
      break;
    case 152: 
    case 153: 
    case 154: 
    case 155: 
    case 156: 
    case 157: 
    case 158: 
    case 159: 
      paramInt -= 152;
      w(paramInt);
      if (r != paramInt) {
        r = paramInt;
      }
      break;
    case 151: 
    case 146: 
    case 145: 
    case 144: 
    case 143: 
    case 141: 
    case 140: 
    case 139: 
    case 138: 
    case 137: 
    case 136: 
    case 128: 
    case 129: 
    case 130: 
    case 131: 
    case 132: 
    case 133: 
    case 134: 
    case 135: 
      for (localObject = m[paramInt];; localObject = m[paramInt])
      {
        n = ((b)localObject);
        break;
        if (!n.i())
        {
          localObject = i;
          paramInt = 32;
          ((y)localObject).r(paramInt);
          break;
        }
        E();
        break;
        if (!n.i()) {}
        do
        {
          localObject = i;
          paramInt = i1;
          break;
          D();
          return;
          if (!n.i())
          {
            localObject = i;
            paramInt = 24;
            break;
          }
          C();
          return;
        } while (!n.i());
        B();
        break;
        G();
        break;
        i.r(8);
        break;
        while (i4 <= 8)
        {
          if (i.g()) {
            m[(8 - i4)].l();
          }
          i4++;
        }
        for (paramInt = 1; paramInt <= 8; paramInt++) {
          if (i.g())
          {
            localObject = m[(8 - paramInt)];
            ((b)localObject).p(((b)localObject).k() ^ true);
          }
        }
        while (i2 <= 8)
        {
          if (i.g()) {
            m[(8 - i2)].p(false);
          }
          i2++;
        }
        for (paramInt = 1; paramInt <= 8; paramInt++) {
          if (i.g()) {
            m[(8 - paramInt)].p(true);
          }
        }
        while (i3 <= 8)
        {
          if (i.g()) {
            m[(8 - i3)].e();
          }
          i3++;
        }
        paramInt -= 128;
        if (r == paramInt) {
          break;
        }
        r = paramInt;
      }
    }
  }
  
  public final void u(int paramInt)
  {
    if (paramInt > 7)
    {
      y localy;
      if (paramInt <= 15)
      {
        localy = i;
        paramInt = 8;
      }
      for (;;)
      {
        localy.r(paramInt);
        break;
        if (paramInt <= 23)
        {
          localy = i;
          paramInt = 16;
        }
        else
        {
          if (paramInt > 31) {
            break;
          }
          localy = i;
          paramInt = 24;
        }
      }
    }
  }
  
  public final void v(int paramInt)
  {
    y localy;
    if (paramInt <= 135) {
      localy = i;
    }
    for (paramInt = 32;; paramInt = 40)
    {
      localy.r(paramInt);
      return;
      if (paramInt > 143) {
        break;
      }
      localy = i;
    }
    if (paramInt <= 159)
    {
      i.r(2);
      paramInt = i.h(6);
      i.r(paramInt * 8);
    }
  }
  
  public final void w(int paramInt)
  {
    b localb = m[paramInt];
    i.r(2);
    boolean bool1 = i.g();
    i.r(2);
    int i1 = i.h(3);
    boolean bool2 = i.g();
    int i2 = i.h(7);
    paramInt = i.h(8);
    int i3 = i.h(4);
    int i4 = i.h(4);
    i.r(2);
    i.r(6);
    i.r(2);
    localb.f(bool1, i1, bool2, i2, paramInt, i4, i3, i.h(3), i.h(3));
  }
  
  public final void x(int paramInt)
  {
    if (paramInt == 127) {
      n.a('♫');
    } else {
      n.a((char)(paramInt & 0xFF));
    }
  }
  
  public final void y(int paramInt)
  {
    n.a((char)(paramInt & 0xFF));
  }
  
  public final void z(int paramInt)
  {
    int i1 = 32;
    Object localObject;
    int i2;
    if (paramInt != 32) {
      if (paramInt != 33) {
        if (paramInt != 37) {
          if (paramInt != 42) {
            if (paramInt != 44) {
              if (paramInt != 63) {
                if (paramInt != 57) {
                  if (paramInt != 58) {
                    if (paramInt != 60) {
                      if (paramInt != 61) {
                        switch (paramInt)
                        {
                        default: 
                          switch (paramInt)
                          {
                          default: 
                            localObject = new StringBuilder();
                            ((StringBuilder)localObject).append("Invalid G2 character: ");
                            ((StringBuilder)localObject).append(paramInt);
                            o.h("Cea708Decoder", ((StringBuilder)localObject).toString());
                            break;
                          case 127: 
                            localObject = n;
                            paramInt = 9484;
                            i2 = paramInt;
                          }
                          break;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      ((b)localObject).a(i2);
      break;
      localObject = n;
      paramInt = 9496;
      int i3 = paramInt;
      continue;
      localObject = n;
      paramInt = 9472;
      i3 = paramInt;
      continue;
      localObject = n;
      paramInt = 9492;
      i3 = paramInt;
      continue;
      localObject = n;
      paramInt = 9488;
      i3 = paramInt;
      continue;
      localObject = n;
      paramInt = 9474;
      i3 = paramInt;
      continue;
      localObject = n;
      paramInt = 8542;
      i3 = paramInt;
      continue;
      localObject = n;
      paramInt = 8541;
      i3 = paramInt;
      continue;
      localObject = n;
      paramInt = 8540;
      i3 = paramInt;
      continue;
      localObject = n;
      paramInt = 8539;
      i3 = paramInt;
      continue;
      localObject = n;
      paramInt = 8226;
      i3 = paramInt;
      continue;
      localObject = n;
      paramInt = 8221;
      i3 = paramInt;
      continue;
      localObject = n;
      paramInt = 8220;
      i3 = paramInt;
      continue;
      localObject = n;
      paramInt = 8217;
      i3 = paramInt;
      continue;
      localObject = n;
      paramInt = 8216;
      i3 = paramInt;
      continue;
      localObject = n;
      paramInt = 9608;
      i3 = paramInt;
      continue;
      localObject = n;
      paramInt = 8480;
      i3 = paramInt;
      continue;
      localObject = n;
      paramInt = 339;
      i3 = paramInt;
      continue;
      localObject = n;
      paramInt = 353;
      i3 = paramInt;
      continue;
      localObject = n;
      paramInt = 8482;
      i3 = paramInt;
      continue;
      localObject = n;
      paramInt = 376;
      i3 = paramInt;
      continue;
      localObject = n;
      paramInt = 338;
      i3 = paramInt;
      continue;
      localObject = n;
      paramInt = 352;
      i3 = paramInt;
      continue;
      localObject = n;
      paramInt = 8230;
      i3 = paramInt;
      continue;
      localObject = n;
      paramInt = 160;
      i3 = paramInt;
      continue;
      localObject = n;
      i3 = i1;
    }
  }
  
  public static final class a
  {
    public static final Comparator c = new b();
    public final f0.a a;
    public final int b;
    
    public a(CharSequence paramCharSequence, Layout.Alignment paramAlignment, float paramFloat1, int paramInt1, int paramInt2, float paramFloat2, int paramInt3, float paramFloat3, boolean paramBoolean, int paramInt4, int paramInt5)
    {
      paramCharSequence = new a.b().o(paramCharSequence).p(paramAlignment).h(paramFloat1, paramInt1).i(paramInt2).k(paramFloat2).l(paramInt3).n(paramFloat3);
      if (paramBoolean) {
        paramCharSequence.s(paramInt4);
      }
      a = paramCharSequence.a();
      b = paramInt5;
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
    public static final int v = h(2, 2, 2, 0);
    public static final int w;
    public static final int x;
    public static final int[] y;
    public static final int[] z;
    public final List a = new ArrayList();
    public final SpannableStringBuilder b = new SpannableStringBuilder();
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
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
    
    static
    {
      int i1 = h(0, 0, 0, 0);
      w = i1;
      int i2 = h(0, 0, 0, 3);
      x = i2;
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
      l();
    }
    
    public static int g(int paramInt1, int paramInt2, int paramInt3)
    {
      return h(paramInt1, paramInt2, paramInt3, 0);
    }
    
    public static int h(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      int i1 = 0;
      g0.a.c(paramInt1, 0, 4);
      g0.a.c(paramInt2, 0, 4);
      g0.a.c(paramInt3, 0, 4);
      g0.a.c(paramInt4, 0, 4);
      if ((paramInt4 != 0) && (paramInt4 != 1))
      {
        if (paramInt4 == 2) {
          break label62;
        }
        if (paramInt4 == 3) {}
      }
      else
      {
        paramInt4 = 255;
        break label65;
      }
      paramInt4 = 0;
      break label65;
      label62:
      paramInt4 = 127;
      label65:
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
    
    public void a(char paramChar)
    {
      if (paramChar == '\n')
      {
        a.add(d());
        b.clear();
        if (o != -1) {
          o = 0;
        }
        if (p != -1) {
          p = 0;
        }
        if (q != -1) {
          q = 0;
        }
        if (s != -1) {
          s = 0;
        }
        for (;;)
        {
          if ((a.size() < j) && (a.size() < 15))
          {
            u = a.size();
            break;
          }
          a.remove(0);
        }
      }
      b.append(paramChar);
    }
    
    public void b()
    {
      int i1 = b.length();
      if (i1 > 0) {
        b.delete(i1 - 1, i1);
      }
    }
    
    public c.a c()
    {
      if (j()) {
        return null;
      }
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
      boolean bool = false;
      for (int i1 = 0; i1 < a.size(); i1++)
      {
        localSpannableStringBuilder.append((CharSequence)a.get(i1));
        localSpannableStringBuilder.append('\n');
      }
      localSpannableStringBuilder.append(d());
      i1 = k;
      Object localObject;
      if (i1 != 0) {
        if (i1 != 1)
        {
          if (i1 != 2)
          {
            if (i1 == 3) {
              break label157;
            }
            localObject = new StringBuilder();
            ((StringBuilder)localObject).append("Unexpected justification value: ");
            ((StringBuilder)localObject).append(k);
            throw new IllegalArgumentException(((StringBuilder)localObject).toString());
          }
          localObject = Layout.Alignment.ALIGN_CENTER;
        }
      }
      for (;;)
      {
        break;
        localObject = Layout.Alignment.ALIGN_OPPOSITE;
        continue;
        label157:
        localObject = Layout.Alignment.ALIGN_NORMAL;
      }
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
      int i2 = i;
      if (i2 / 3 == 0) {
        i1 = 0;
      } else if (i2 / 3 == 1) {
        i1 = 1;
      } else {
        i1 = 2;
      }
      if (i2 % 3 == 0) {
        i2 = 0;
      } else if (i2 % 3 == 1) {
        i2 = 1;
      } else {
        i2 = 2;
      }
      if (n != w) {
        bool = true;
      }
      return new c.a(localSpannableStringBuilder, (Layout.Alignment)localObject, f2 * 0.9F + 0.05F, 0, i1, f1 * 0.9F + 0.05F, i2, -3.4028235E38F, bool, n, e);
    }
    
    public SpannableString d()
    {
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(b);
      int i1 = localSpannableStringBuilder.length();
      if (i1 > 0)
      {
        if (o != -1) {
          localSpannableStringBuilder.setSpan(new StyleSpan(2), o, i1, 33);
        }
        if (p != -1) {
          localSpannableStringBuilder.setSpan(new UnderlineSpan(), p, i1, 33);
        }
        if (q != -1) {
          localSpannableStringBuilder.setSpan(new ForegroundColorSpan(r), q, i1, 33);
        }
        if (s != -1) {
          localSpannableStringBuilder.setSpan(new BackgroundColorSpan(t), s, i1, 33);
        }
      }
      return new SpannableString(localSpannableStringBuilder);
    }
    
    public void e()
    {
      a.clear();
      b.clear();
      o = -1;
      p = -1;
      q = -1;
      s = -1;
      u = 0;
    }
    
    public void f(boolean paramBoolean1, int paramInt1, boolean paramBoolean2, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
    {
      c = true;
      d = paramBoolean1;
      e = paramInt1;
      f = paramBoolean2;
      g = paramInt2;
      h = paramInt3;
      i = paramInt5;
      paramInt1 = j;
      paramInt2 = paramInt4 + 1;
      if (paramInt1 != paramInt2)
      {
        j = paramInt2;
        while ((a.size() >= j) || (a.size() >= 15)) {
          a.remove(0);
        }
      }
      if ((paramInt6 != 0) && (l != paramInt6))
      {
        l = paramInt6;
        paramInt1 = paramInt6 - 1;
        q(C[paramInt1], x, B[paramInt1], 0, z[paramInt1], A[paramInt1], y[paramInt1]);
      }
      if ((paramInt7 != 0) && (m != paramInt7))
      {
        m = paramInt7;
        paramInt1 = paramInt7 - 1;
        m(0, 1, 1, false, false, E[paramInt1], D[paramInt1]);
        n(v, F[paramInt1], w);
      }
    }
    
    public boolean i()
    {
      return c;
    }
    
    public boolean j()
    {
      boolean bool;
      if ((i()) && ((!a.isEmpty()) || (b.length() != 0))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public boolean k()
    {
      return d;
    }
    
    public void l()
    {
      e();
      c = false;
      d = false;
      e = 4;
      f = false;
      g = 0;
      h = 0;
      i = 0;
      j = 15;
      k = 0;
      l = 0;
      m = 0;
      int i1 = w;
      n = i1;
      r = v;
      t = i1;
    }
    
    public void m(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, int paramInt4, int paramInt5)
    {
      if (o != -1)
      {
        if (!paramBoolean1)
        {
          b.setSpan(new StyleSpan(2), o, b.length(), 33);
          o = -1;
        }
      }
      else if (paramBoolean1) {
        o = b.length();
      }
      if (p != -1)
      {
        if (!paramBoolean2)
        {
          b.setSpan(new UnderlineSpan(), p, b.length(), 33);
          p = -1;
        }
      }
      else if (paramBoolean2) {
        p = b.length();
      }
    }
    
    public void n(int paramInt1, int paramInt2, int paramInt3)
    {
      if ((q != -1) && (r != paramInt1)) {
        b.setSpan(new ForegroundColorSpan(r), q, b.length(), 33);
      }
      if (paramInt1 != v)
      {
        q = b.length();
        r = paramInt1;
      }
      if ((s != -1) && (t != paramInt2)) {
        b.setSpan(new BackgroundColorSpan(t), s, b.length(), 33);
      }
      if (paramInt2 != w)
      {
        s = b.length();
        t = paramInt2;
      }
    }
    
    public void o(int paramInt1, int paramInt2)
    {
      if (u != paramInt1) {
        a('\n');
      }
      u = paramInt1;
    }
    
    public void p(boolean paramBoolean)
    {
      d = paramBoolean;
    }
    
    public void q(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
    {
      n = paramInt1;
      k = paramInt6;
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
 * Qualified Name:     d1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */