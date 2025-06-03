package X0;

import F0.F;
import F0.L;
import F0.M.b;
import F0.T;
import F0.T.a;
import F0.U;
import F0.a.b;
import F0.r;
import F0.s;
import F0.t;
import F0.x;
import android.util.Pair;
import android.util.SparseArray;
import c1.t.a;
import d0.A;
import d0.h.b;
import d0.m;
import d0.m.b;
import d0.q;
import d0.q.b;
import g0.p;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

public class e
  implements r
{
  public static final x e0 = new d();
  public static final byte[] f0 = { 49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10 };
  public static final byte[] g0 = g0.M.r0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
  public static final byte[] h0 = { 68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44 };
  public static final byte[] i0 = { 87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10 };
  public static final UUID j0 = new UUID(72057594037932032L, -9223371306706625679L);
  public static final Map k0;
  public boolean A;
  public long B = -1L;
  public long C = -1L;
  public long D = -9223372036854775807L;
  public p E;
  public p F;
  public boolean G;
  public boolean H;
  public int I;
  public long J;
  public long K;
  public int L;
  public int M;
  public int[] N;
  public int O;
  public int P;
  public int Q;
  public int R;
  public boolean S;
  public long T;
  public int U;
  public int V;
  public int W;
  public boolean X;
  public boolean Y;
  public boolean Z;
  public final c a;
  public int a0;
  public final g b;
  public byte b0;
  public final SparseArray c;
  public boolean c0;
  public final boolean d;
  public t d0;
  public final boolean e;
  public final t.a f;
  public final g0.z g;
  public final g0.z h;
  public final g0.z i;
  public final g0.z j;
  public final g0.z k;
  public final g0.z l;
  public final g0.z m;
  public final g0.z n;
  public final g0.z o;
  public final g0.z p;
  public ByteBuffer q;
  public long r;
  public long s = -1L;
  public long t = -9223372036854775807L;
  public long u = -9223372036854775807L;
  public long v = -9223372036854775807L;
  public c w;
  public boolean x;
  public int y;
  public long z;
  
  static
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("htc_video_rotA-000", Integer.valueOf(0));
    localHashMap.put("htc_video_rotA-090", Integer.valueOf(90));
    localHashMap.put("htc_video_rotA-180", Integer.valueOf(180));
    localHashMap.put("htc_video_rotA-270", Integer.valueOf(270));
    k0 = Collections.unmodifiableMap(localHashMap);
  }
  
  public e(c paramc, int paramInt, t.a parama)
  {
    a = paramc;
    paramc.d(new b(null));
    f = parama;
    boolean bool1 = false;
    if ((paramInt & 0x1) == 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    d = bool2;
    boolean bool2 = bool1;
    if ((paramInt & 0x2) == 0) {
      bool2 = true;
    }
    e = bool2;
    b = new g();
    c = new SparseArray();
    i = new g0.z(4);
    j = new g0.z(ByteBuffer.allocate(4).putInt(-1).array());
    k = new g0.z(4);
    g = new g0.z(h0.d.a);
    h = new g0.z(4);
    l = new g0.z();
    m = new g0.z();
    n = new g0.z(8);
    o = new g0.z();
    p = new g0.z();
    N = new int[1];
  }
  
  public e(t.a parama, int paramInt)
  {
    this(new a(), paramInt, parama);
  }
  
  public static boolean A(String paramString)
  {
    paramString.hashCode();
    int i1 = paramString.hashCode();
    int i2 = -1;
    switch (i1)
    {
    default: 
      break;
    case 1951062397: 
      if (paramString.equals("A_OPUS")) {
        i2 = 32;
      }
      break;
    case 1950789798: 
      if (paramString.equals("A_FLAC")) {
        i2 = 31;
      }
      break;
    case 1950749482: 
      if (paramString.equals("A_EAC3")) {
        i2 = 30;
      }
      break;
    case 1809237540: 
      if (paramString.equals("V_MPEG2")) {
        i2 = 29;
      }
      break;
    case 1422270023: 
      if (paramString.equals("S_TEXT/UTF8")) {
        i2 = 28;
      }
      break;
    case 1045209816: 
      if (paramString.equals("S_TEXT/WEBVTT")) {
        i2 = 27;
      }
      break;
    case 855502857: 
      if (paramString.equals("V_MPEGH/ISO/HEVC")) {
        i2 = 26;
      }
      break;
    case 738597099: 
      if (paramString.equals("S_TEXT/ASS")) {
        i2 = 25;
      }
      break;
    case 725957860: 
      if (paramString.equals("A_PCM/INT/LIT")) {
        i2 = 24;
      }
      break;
    case 725948237: 
      if (paramString.equals("A_PCM/INT/BIG")) {
        i2 = 23;
      }
      break;
    case 635596514: 
      if (paramString.equals("A_PCM/FLOAT/IEEE")) {
        i2 = 22;
      }
      break;
    case 542569478: 
      if (paramString.equals("A_DTS/EXPRESS")) {
        i2 = 21;
      }
      break;
    case 444813526: 
      if (paramString.equals("V_THEORA")) {
        i2 = 20;
      }
      break;
    case 99146302: 
      if (paramString.equals("S_HDMV/PGS")) {
        i2 = 19;
      }
      break;
    case 82338134: 
      if (paramString.equals("V_VP9")) {
        i2 = 18;
      }
      break;
    case 82338133: 
      if (paramString.equals("V_VP8")) {
        i2 = 17;
      }
      break;
    case 82318131: 
      if (paramString.equals("V_AV1")) {
        i2 = 16;
      }
      break;
    case 62927045: 
      if (paramString.equals("A_DTS")) {
        i2 = 15;
      }
      break;
    case 62923603: 
      if (paramString.equals("A_AC3")) {
        i2 = 14;
      }
      break;
    case 62923557: 
      if (paramString.equals("A_AAC")) {
        i2 = 13;
      }
      break;
    case -356037306: 
      if (paramString.equals("A_DTS/LOSSLESS")) {
        i2 = 12;
      }
      break;
    case -425012669: 
      if (paramString.equals("S_VOBSUB")) {
        i2 = 11;
      }
      break;
    case -538363109: 
      if (paramString.equals("V_MPEG4/ISO/AVC")) {
        i2 = 10;
      }
      break;
    case -538363189: 
      if (paramString.equals("V_MPEG4/ISO/ASP")) {
        i2 = 9;
      }
      break;
    case -933872740: 
      if (paramString.equals("S_DVBSUB")) {
        i2 = 8;
      }
      break;
    case -1373388978: 
      if (paramString.equals("V_MS/VFW/FOURCC")) {
        i2 = 7;
      }
      break;
    case -1482641357: 
      if (paramString.equals("A_MPEG/L3")) {
        i2 = 6;
      }
      break;
    case -1482641358: 
      if (paramString.equals("A_MPEG/L2")) {
        i2 = 5;
      }
      break;
    case -1730367663: 
      if (paramString.equals("A_VORBIS")) {
        i2 = 4;
      }
      break;
    case -1784763192: 
      if (paramString.equals("A_TRUEHD")) {
        i2 = 3;
      }
      break;
    case -1985379776: 
      if (paramString.equals("A_MS/ACM")) {
        i2 = 2;
      }
      break;
    case -2095575984: 
      if (paramString.equals("V_MPEG4/ISO/SP")) {
        i2 = 1;
      }
      break;
    case -2095576542: 
      if (paramString.equals("V_MPEG4/ISO/AP")) {
        i2 = 0;
      }
      break;
    }
    switch (i2)
    {
    default: 
      return false;
    }
    return true;
  }
  
  public static void H(String paramString, long paramLong, byte[] paramArrayOfByte)
  {
    paramString.hashCode();
    int i1 = paramString.hashCode();
    int i2 = -1;
    switch (i1)
    {
    default: 
      break;
    case 1422270023: 
      if (paramString.equals("S_TEXT/UTF8")) {
        i2 = 2;
      }
      break;
    case 1045209816: 
      if (paramString.equals("S_TEXT/WEBVTT")) {
        i2 = 1;
      }
      break;
    case 738597099: 
      if (paramString.equals("S_TEXT/ASS")) {
        i2 = 0;
      }
      break;
    }
    switch (i2)
    {
    default: 
      throw new IllegalArgumentException();
    case 2: 
      paramString = u(paramLong, "%02d:%02d:%02d,%03d", 1000L);
      i2 = 19;
      break;
    case 1: 
      paramString = u(paramLong, "%02d:%02d:%02d.%03d", 1000L);
      i2 = 25;
      break;
    case 0: 
      paramString = u(paramLong, "%01d:%02d:%02d:%02d", 10000L);
      i2 = 21;
    }
    System.arraycopy(paramString, 0, paramArrayOfByte, i2, paramString.length);
  }
  
  private void m()
  {
    g0.a.h(d0);
  }
  
  public static int[] r(int[] paramArrayOfInt, int paramInt)
  {
    if (paramArrayOfInt == null) {
      return new int[paramInt];
    }
    if (paramArrayOfInt.length >= paramInt) {
      return paramArrayOfInt;
    }
    return new int[Math.max(paramArrayOfInt.length * 2, paramInt)];
  }
  
  public static byte[] u(long paramLong1, String paramString, long paramLong2)
  {
    boolean bool;
    if (paramLong1 != -9223372036854775807L) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.a(bool);
    int i1 = (int)(paramLong1 / 3600000000L);
    paramLong1 -= i1 * 3600000000L;
    int i2 = (int)(paramLong1 / 60000000L);
    paramLong1 -= i2 * 60000000L;
    int i3 = (int)(paramLong1 / 1000000L);
    int i4 = (int)((paramLong1 - i3 * 1000000L) / paramLong2);
    return g0.M.r0(String.format(Locale.US, paramString, new Object[] { Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4) }));
  }
  
  public boolean B(int paramInt)
  {
    boolean bool;
    if ((paramInt != 357149030) && (paramInt != 524531317) && (paramInt != 475249515) && (paramInt != 374648427)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final boolean D(L paramL, long paramLong)
  {
    if (A)
    {
      C = paramLong;
      a = B;
      A = false;
      return true;
    }
    if (x)
    {
      paramLong = C;
      if (paramLong != -1L)
      {
        a = paramLong;
        C = -1L;
        return true;
      }
    }
    return false;
  }
  
  public final void E(s params, int paramInt)
  {
    if (i.g() >= paramInt) {
      return;
    }
    if (i.b() < paramInt)
    {
      g0.z localz = i;
      localz.c(Math.max(localz.b() * 2, paramInt));
    }
    params.readFully(i.e(), i.g(), paramInt - i.g());
    i.S(paramInt);
  }
  
  public final void F()
  {
    U = 0;
    V = 0;
    W = 0;
    X = false;
    Y = false;
    Z = false;
    a0 = 0;
    b0 = ((byte)0);
    c0 = false;
    l.P(0);
  }
  
  public final long G(long paramLong)
  {
    long l1 = t;
    if (l1 != -9223372036854775807L) {
      return g0.M.W0(paramLong, l1, 1000L);
    }
    throw A.a("Can't scale timecode prior to timecodeScale being set.", null);
  }
  
  public void I(int paramInt, long paramLong1, long paramLong2)
  {
    m();
    if (paramInt != 160)
    {
      if (paramInt != 174)
      {
        if (paramInt != 187)
        {
          if (paramInt != 19899)
          {
            if (paramInt != 20533)
            {
              if (paramInt != 21968)
              {
                if (paramInt != 408125543)
                {
                  if (paramInt != 475249515)
                  {
                    if ((paramInt == 524531317) && (!x)) {
                      if ((d) && (B != -1L))
                      {
                        A = true;
                      }
                      else
                      {
                        d0.e(new M.b(v));
                        x = true;
                      }
                    }
                  }
                  else
                  {
                    E = new p();
                    F = new p();
                  }
                }
                else
                {
                  long l1 = s;
                  if ((l1 != -1L) && (l1 != paramLong1)) {
                    throw A.a("Multiple Segment elements not supported", null);
                  }
                  s = paramLong1;
                  r = paramLong2;
                }
              }
              else {
                vy = true;
              }
            }
            else {
              vh = true;
            }
          }
          else
          {
            y = -1;
            z = -1L;
          }
        }
        else {
          G = false;
        }
      }
      else {
        w = new c();
      }
    }
    else
    {
      S = false;
      T = 0L;
    }
  }
  
  public void J(int paramInt, String paramString)
  {
    if (paramInt != 134)
    {
      if (paramInt != 17026)
      {
        if (paramInt != 21358)
        {
          if (paramInt == 2274716) {
            c.d(v(paramInt), paramString);
          }
        }
        else {
          va = paramString;
        }
      }
      else if ((!"webm".equals(paramString)) && (!"matroska".equals(paramString)))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("DocType ");
        localStringBuilder.append(paramString);
        localStringBuilder.append(" not supported");
        throw A.a(localStringBuilder.toString(), null);
      }
    }
    else {
      vb = paramString;
    }
  }
  
  public final int K(s params, c paramc, int paramInt, boolean paramBoolean)
  {
    if ("S_TEXT/UTF8".equals(b)) {
      L(params, f0, paramInt);
    }
    for (;;)
    {
      return s();
      if ("S_TEXT/ASS".equals(b))
      {
        L(params, h0, paramInt);
      }
      else
      {
        if (!"S_TEXT/WEBVTT".equals(b)) {
          break;
        }
        L(params, i0, paramInt);
      }
    }
    T localT = Y;
    boolean bool1 = X;
    boolean bool2 = true;
    int i1;
    if (!bool1)
    {
      if (h)
      {
        Q &= 0xBFFFFFFF;
        bool1 = Y;
        i1 = 128;
        if (!bool1)
        {
          params.readFully(i.e(), 0, 1);
          U += 1;
          if ((i.e()[0] & 0x80) != 128)
          {
            b0 = ((byte)i.e()[0]);
            Y = true;
          }
          else
          {
            throw A.a("Extension bit is set in signal byte", null);
          }
        }
        i2 = b0;
        if ((i2 & 0x1) == 1)
        {
          if ((i2 & 0x2) == 2) {
            i2 = 1;
          } else {
            i2 = 0;
          }
          Q |= 0x40000000;
          if (!c0)
          {
            params.readFully(n.e(), 0, 8);
            U += 8;
            c0 = true;
            localObject = i.e();
            if (i2 == 0) {
              i1 = 0;
            }
            localObject[0] = ((byte)(byte)(i1 | 0x8));
            i.T(0);
            localT.a(i, 1, 1);
            V += 1;
            n.T(0);
            localT.a(n, 8, 1);
            V += 8;
          }
          if (i2 != 0)
          {
            if (!Z)
            {
              params.readFully(i.e(), 0, 1);
              U += 1;
              i.T(0);
              a0 = i.G();
              Z = true;
            }
            i2 = a0 * 4;
            i.P(i2);
            params.readFully(i.e(), 0, i2);
            U += i2;
            short s1 = (short)(a0 / 2 + 1);
            int i3 = s1 * 6 + 2;
            localObject = q;
            if ((localObject == null) || (((Buffer)localObject).capacity() < i3)) {
              q = ByteBuffer.allocate(i3);
            }
            q.position(0);
            q.putShort(s1);
            i2 = 0;
            int i4;
            for (i1 = i2;; i1 = i4)
            {
              i4 = a0;
              if (i2 >= i4) {
                break;
              }
              i4 = i.K();
              if (i2 % 2 == 0) {
                q.putShort((short)(i4 - i1));
              } else {
                q.putInt(i4 - i1);
              }
              i2++;
            }
            i2 = paramInt - U - i1;
            localObject = q;
            if (i4 % 2 == 1)
            {
              ((ByteBuffer)localObject).putInt(i2);
            }
            else
            {
              ((ByteBuffer)localObject).putShort((short)i2);
              q.putInt(0);
            }
            o.R(q.array(), i3);
            localT.a(o, i3, 1);
            V += i3;
          }
        }
      }
      else
      {
        localObject = i;
        if (localObject != null) {
          l.R((byte[])localObject, localObject.length);
        }
      }
      if (c.e(paramc, paramBoolean))
      {
        Q |= 0x10000000;
        p.P(0);
        i2 = l.g() + paramInt - U;
        i.P(4);
        i.e()[0] = ((byte)(byte)(i2 >> 24 & 0xFF));
        i.e()[1] = ((byte)(byte)(i2 >> 16 & 0xFF));
        i.e()[2] = ((byte)(byte)(i2 >> 8 & 0xFF));
        i.e()[3] = ((byte)(byte)(i2 & 0xFF));
        localT.a(i, 4, 2);
        V += 4;
      }
      X = true;
    }
    paramInt += l.g();
    if ((!"V_MPEG4/ISO/AVC".equals(b)) && (!"V_MPEGH/ISO/HEVC".equals(b)))
    {
      if (U != null)
      {
        if (l.g() == 0) {
          paramBoolean = bool2;
        } else {
          paramBoolean = false;
        }
        g0.a.f(paramBoolean);
        U.d(params);
      }
      for (;;)
      {
        i2 = U;
        if (i2 >= paramInt) {
          break;
        }
        i2 = M(params, localT, paramInt - i2);
        U += i2;
        V += i2;
      }
    }
    Object localObject = h.e();
    localObject[0] = ((byte)0);
    localObject[1] = ((byte)0);
    localObject[2] = ((byte)0);
    int i2 = Z;
    while (U < paramInt)
    {
      i1 = W;
      if (i1 == 0)
      {
        N(params, (byte[])localObject, 4 - i2, i2);
        U += i2;
        h.T(0);
        W = h.K();
        g.T(0);
        localT.e(g, 4);
        V += 4;
      }
      else
      {
        i1 = M(params, localT, i1);
        U += i1;
        V += i1;
        W -= i1;
      }
    }
    if ("A_VORBIS".equals(b))
    {
      j.T(0);
      localT.e(j, 4);
      V += 4;
    }
    return s();
  }
  
  public final void L(s params, byte[] paramArrayOfByte, int paramInt)
  {
    int i1 = paramArrayOfByte.length + paramInt;
    if (m.b() < i1) {
      m.Q(Arrays.copyOf(paramArrayOfByte, i1 + paramInt));
    } else {
      System.arraycopy(paramArrayOfByte, 0, m.e(), 0, paramArrayOfByte.length);
    }
    params.readFully(m.e(), paramArrayOfByte.length, paramInt);
    m.T(0);
    m.S(i1);
  }
  
  public final int M(s params, T paramT, int paramInt)
  {
    int i1 = l.a();
    if (i1 > 0)
    {
      paramInt = Math.min(paramInt, i1);
      paramT.e(l, paramInt);
    }
    else
    {
      paramInt = paramT.f(params, paramInt, false);
    }
    return paramInt;
  }
  
  public final void N(s params, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i1 = Math.min(paramInt2, l.a());
    params.readFully(paramArrayOfByte, paramInt1 + i1, paramInt2 - i1);
    if (i1 > 0) {
      l.l(paramArrayOfByte, paramInt1, i1);
    }
  }
  
  public void a(long paramLong1, long paramLong2)
  {
    D = -9223372036854775807L;
    int i1 = 0;
    I = 0;
    a.b();
    b.e();
    F();
    while (i1 < c.size())
    {
      ((c)c.valueAt(i1)).n();
      i1++;
    }
  }
  
  public final void b(t paramt)
  {
    d0 = paramt;
    Object localObject = paramt;
    if (e) {
      localObject = new c1.v(paramt, f);
    }
    d0 = ((t)localObject);
  }
  
  public final boolean e(s params)
  {
    return new f().b(params);
  }
  
  public final int i(s params, L paramL)
  {
    int i1 = 0;
    H = false;
    int i2 = 1;
    while ((i2 != 0) && (!H))
    {
      boolean bool = a.c(params);
      i2 = bool;
      if (bool)
      {
        i2 = bool;
        if (D(paramL, params.p())) {
          return 1;
        }
      }
    }
    if (i2 == 0)
    {
      while (i1 < c.size())
      {
        params = (c)c.valueAt(i1);
        c.a(params);
        params.j();
        i1++;
      }
      return -1;
    }
    return 0;
  }
  
  public final void k(int paramInt)
  {
    if ((E != null) && (F != null)) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Element ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(" must be in a Cues");
    throw A.a(localStringBuilder.toString(), null);
  }
  
  public final void l(int paramInt)
  {
    if (w != null) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Element ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(" must be in a TrackEntry");
    throw A.a(localStringBuilder.toString(), null);
  }
  
  public void n(int paramInt1, int paramInt2, s params)
  {
    Object localObject1;
    Object localObject2;
    if ((paramInt1 != 161) && (paramInt1 != 163))
    {
      if (paramInt1 != 165)
      {
        if (paramInt1 != 16877)
        {
          if (paramInt1 != 16981)
          {
            if (paramInt1 != 18402)
            {
              if (paramInt1 != 21419)
              {
                if (paramInt1 != 25506)
                {
                  if (paramInt1 == 30322)
                  {
                    l(paramInt1);
                    localObject1 = w;
                    localObject2 = new byte[paramInt2];
                    w = ((byte[])localObject2);
                    params.readFully((byte[])localObject2, 0, paramInt2);
                  }
                  else
                  {
                    params = new StringBuilder();
                    params.append("Unexpected id: ");
                    params.append(paramInt1);
                    throw A.a(params.toString(), null);
                  }
                }
                else
                {
                  l(paramInt1);
                  localObject2 = w;
                  localObject1 = new byte[paramInt2];
                  k = ((byte[])localObject1);
                  params.readFully((byte[])localObject1, 0, paramInt2);
                }
              }
              else
              {
                Arrays.fill(k.e(), (byte)0);
                params.readFully(k.e(), 4 - paramInt2, paramInt2);
                k.T(0);
                y = ((int)k.I());
              }
            }
            else
            {
              localObject2 = new byte[paramInt2];
              params.readFully((byte[])localObject2, 0, paramInt2);
              vj = new T.a(1, (byte[])localObject2, 0, 0);
            }
          }
          else
          {
            l(paramInt1);
            localObject1 = w;
            localObject2 = new byte[paramInt2];
            i = ((byte[])localObject2);
            params.readFully((byte[])localObject2, 0, paramInt2);
          }
        }
        else {
          x(v(paramInt1), params, paramInt2);
        }
      }
      else
      {
        if (I != 2) {
          return;
        }
        y((c)c.get(O), R, params, paramInt2);
      }
    }
    else
    {
      if (I == 0)
      {
        O = ((int)b.d(params, false, true, 8));
        P = b.b();
        K = -9223372036854775807L;
        I = 1;
        i.P(0);
      }
      localObject2 = (c)c.get(O);
      if (localObject2 == null)
      {
        params.i(paramInt2 - P);
        I = 0;
        return;
      }
      c.a((c)localObject2);
      long l2;
      if (I == 1)
      {
        E(params, 3);
        int i1 = (i.e()[2] & 0x6) >> 1;
        if (i1 == 0)
        {
          M = 1;
          localObject1 = r(N, 1);
          N = ((int[])localObject1);
          localObject1[0] = (paramInt2 - P - 3);
        }
        for (;;)
        {
          break;
          i2 = 4;
          E(params, 4);
          int i3 = (i.e()[3] & 0xFF) + 1;
          M = i3;
          localObject1 = r(N, i3);
          N = ((int[])localObject1);
          if (i1 == 2)
          {
            i1 = P;
            i2 = M;
            Arrays.fill((int[])localObject1, 0, i2, (paramInt2 - i1 - 4) / i2);
          }
          else
          {
            int i4;
            int i5;
            if (i1 == 1)
            {
              i3 = 0;
              i1 = i3;
              i4 = M;
              if (i3 < i4 - 1)
              {
                N[i3] = 0;
                for (i4 = i2;; i4 = i2)
                {
                  i2 = i4 + 1;
                  E(params, i2);
                  i4 = i.e()[i4] & 0xFF;
                  localObject1 = N;
                  i5 = localObject1[i3] + i4;
                  localObject1[i3] = i5;
                  if (i4 != 255)
                  {
                    i1 += i5;
                    i3++;
                    break;
                  }
                }
              }
              N[(i4 - 1)] = (paramInt2 - P - i2 - i1);
            }
            else
            {
              if (i1 != 3) {
                break label1180;
              }
              i3 = 0;
              i1 = i3;
              for (;;)
              {
                i4 = M;
                if (i3 >= i4 - 1) {
                  break label1050;
                }
                N[i3] = 0;
                i5 = i2 + 1;
                E(params, i5);
                if (i.e()[i2] == 0) {
                  break label1042;
                }
                i4 = 0;
                if (i4 < 8)
                {
                  int i6 = 1 << 7 - i4;
                  if ((i.e()[i2] & i6) != 0)
                  {
                    i5 += i4;
                    E(params, i5);
                    long l1 = i6 & i.e()[i2] & 0xFF;
                    i2++;
                    while (i2 < i5)
                    {
                      l1 = l1 << 8 | i.e()[i2] & 0xFF;
                      i2++;
                    }
                    l2 = l1;
                    i2 = i5;
                    if (i3 > 0) {
                      l2 = l1 - ((1L << i4 * 7 + 6) - 1L);
                    }
                  }
                }
                for (i2 = i5;; i2 = i5)
                {
                  break label965;
                  i4++;
                  break;
                  l2 = 0L;
                }
                label965:
                if ((l2 < -2147483648L) || (l2 > 2147483647L)) {
                  break;
                }
                i4 = (int)l2;
                localObject1 = N;
                if (i3 != 0) {
                  i4 += localObject1[(i3 - 1)];
                }
                localObject1[i3] = i4;
                i1 += i4;
                i3++;
              }
              throw A.a("EBML lacing sample size out of range.", null);
              label1042:
              throw A.a("No valid varint length mask found", null);
              label1050:
              N[(i4 - 1)] = (paramInt2 - P - i2 - i1);
            }
          }
        }
        int i2 = i.e()[0];
        paramInt2 = i.e()[1];
        J = (D + G(i2 << 8 | paramInt2 & 0xFF));
        if ((d != 2) && ((paramInt1 != 163) || ((i.e()[2] & 0x80) != 128))) {
          paramInt2 = 0;
        } else {
          paramInt2 = 1;
        }
        Q = paramInt2;
        I = 2;
        L = 0;
        break label1212;
        label1180:
        params = new StringBuilder();
        params.append("Unexpected lacing value: ");
        params.append(i1);
        throw A.a(params.toString(), null);
      }
      label1212:
      if (paramInt1 == 163)
      {
        for (;;)
        {
          paramInt1 = L;
          if (paramInt1 >= M) {
            break;
          }
          paramInt1 = K(params, (c)localObject2, N[paramInt1], false);
          l2 = J;
          p((c)localObject2, L * e / 1000 + l2, Q, paramInt1, 0);
          L += 1;
        }
        I = 0;
      }
      else
      {
        for (;;)
        {
          paramInt1 = L;
          if (paramInt1 >= M) {
            break;
          }
          localObject1 = N;
          localObject1[paramInt1] = K(params, (c)localObject2, localObject1[paramInt1], true);
          L += 1;
        }
      }
    }
  }
  
  public final F0.M o(p paramp1, p paramp2)
  {
    if ((s != -1L) && (v != -9223372036854775807L) && (paramp1 != null) && (paramp1.c() != 0) && (paramp2 != null) && (paramp2.c() == paramp1.c()))
    {
      int i1 = paramp1.c();
      int[] arrayOfInt1 = new int[i1];
      long[] arrayOfLong1 = new long[i1];
      long[] arrayOfLong2 = new long[i1];
      long[] arrayOfLong3 = new long[i1];
      int i2 = 0;
      int i4;
      for (int i3 = 0;; i3++)
      {
        i4 = i2;
        if (i3 >= i1) {
          break;
        }
        arrayOfLong3[i3] = paramp1.b(i3);
        arrayOfLong1[i3] = (s + paramp2.b(i3));
      }
      for (;;)
      {
        i3 = i1 - 1;
        if (i4 >= i3) {
          break;
        }
        i3 = i4 + 1;
        arrayOfInt1[i4] = ((int)(arrayOfLong1[i3] - arrayOfLong1[i4]));
        arrayOfLong3[i3] -= arrayOfLong3[i4];
        i4 = i3;
      }
      arrayOfInt1[i3] = ((int)(s + r - arrayOfLong1[i3]));
      long l1 = v - arrayOfLong3[i3];
      arrayOfLong2[i3] = l1;
      int[] arrayOfInt2 = arrayOfInt1;
      long[] arrayOfLong4 = arrayOfLong1;
      paramp2 = arrayOfLong2;
      paramp1 = arrayOfLong3;
      if (l1 <= 0L)
      {
        paramp1 = new StringBuilder();
        paramp1.append("Discarding last cue point with unexpected duration: ");
        paramp1.append(l1);
        g0.o.h("MatroskaExtractor", paramp1.toString());
        arrayOfInt2 = Arrays.copyOf(arrayOfInt1, i3);
        arrayOfLong4 = Arrays.copyOf(arrayOfLong1, i3);
        paramp2 = Arrays.copyOf(arrayOfLong2, i3);
        paramp1 = Arrays.copyOf(arrayOfLong3, i3);
      }
      return new F0.h(arrayOfInt2, arrayOfLong4, paramp2, paramp1);
    }
    return new M.b(v);
  }
  
  public final void p(c paramc, long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject = U;
    if (localObject != null)
    {
      ((U)localObject).c(Y, paramLong, paramInt1, paramInt2, paramInt3, j);
    }
    else
    {
      int i1;
      if ((!"S_TEXT/UTF8".equals(b)) && (!"S_TEXT/ASS".equals(b)))
      {
        i1 = paramInt2;
        if (!"S_TEXT/WEBVTT".equals(b)) {}
      }
      else
      {
        if (M > 1) {}
        long l1;
        for (localObject = "Skipping subtitle sample in laced block.";; localObject = "Skipping subtitle sample with no duration.")
        {
          g0.o.h("MatroskaExtractor", (String)localObject);
          i1 = paramInt2;
          break label234;
          l1 = K;
          if (l1 != -9223372036854775807L) {
            break;
          }
        }
        H(b, l1, m.e());
        for (i1 = m.f(); i1 < m.g(); i1++) {
          if (m.e()[i1] == 0)
          {
            m.S(i1);
            break;
          }
        }
        localObject = Y;
        g0.z localz = m;
        ((T)localObject).e(localz, localz.g());
        i1 = paramInt2 + m.g();
      }
      label234:
      paramInt2 = i1;
      if ((0x10000000 & paramInt1) != 0) {
        if (M > 1)
        {
          p.P(0);
          paramInt2 = i1;
        }
        else
        {
          paramInt2 = p.g();
          Y.a(p, paramInt2, 2);
          paramInt2 = i1 + paramInt2;
        }
      }
      Y.b(paramLong, paramInt1, paramInt2, paramInt3, j);
    }
    H = true;
  }
  
  public void q(int paramInt)
  {
    m();
    long l1;
    c localc;
    if (paramInt != 160)
    {
      if (paramInt != 174)
      {
        if (paramInt != 19899)
        {
          if (paramInt != 25152)
          {
            if (paramInt != 28032)
            {
              if (paramInt != 357149030)
              {
                if (paramInt != 374648427)
                {
                  if (paramInt == 475249515)
                  {
                    if (!x)
                    {
                      d0.e(o(E, F));
                      x = true;
                    }
                    E = null;
                    F = null;
                  }
                }
                else if (c.size() != 0) {
                  d0.j();
                } else {
                  throw A.a("No valid tracks were found", null);
                }
              }
              else
              {
                if (t == -9223372036854775807L) {
                  t = 1000000L;
                }
                l1 = u;
                if (l1 != -9223372036854775807L) {
                  v = G(l1);
                }
              }
            }
            else
            {
              l(paramInt);
              localc = w;
              if ((h) && (i != null)) {
                throw A.a("Combining encryption and compression is not supported", null);
              }
            }
          }
          else
          {
            l(paramInt);
            localc = w;
            if (h) {
              if (j != null) {
                l = new m(new m.b[] { new m.b(d0.g.a, "video/webm", w.j.b) });
              } else {
                throw A.a("Encrypted Track found but ContentEncKeyID was not found", null);
              }
            }
          }
        }
        else
        {
          paramInt = y;
          if (paramInt != -1)
          {
            l1 = z;
            if (l1 != -1L)
            {
              if (paramInt != 475249515) {
                return;
              }
              B = l1;
              return;
            }
          }
          throw A.a("Mandatory element SeekID or SeekPosition not found", null);
        }
      }
      else
      {
        localc = (c)g0.a.h(w);
        String str = b;
        if (str != null)
        {
          if (A(str))
          {
            localc.i(d0, c);
            c.put(c, localc);
          }
          w = null;
        }
        else
        {
          throw A.a("CodecId is missing in TrackEntry element", null);
        }
      }
    }
    else
    {
      if (I != 2) {
        return;
      }
      localc = (c)c.get(O);
      c.a(localc);
      if ((T > 0L) && ("A_OPUS".equals(b))) {
        p.Q(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(T).array());
      }
      int i1 = 0;
      paramInt = i1;
      while (i1 < M)
      {
        paramInt += N[i1];
        i1++;
      }
      for (i1 = 0; i1 < M; i1++)
      {
        long l2 = J;
        l1 = e * i1 / 1000;
        int i2 = Q;
        int i3 = i2;
        if (i1 == 0)
        {
          i3 = i2;
          if (!S) {
            i3 = i2 | 0x1;
          }
        }
        i2 = N[i1];
        paramInt -= i2;
        p(localc, l2 + l1, i3, i2, paramInt);
      }
      I = 0;
    }
  }
  
  public final void release() {}
  
  public final int s()
  {
    int i1 = V;
    F();
    return i1;
  }
  
  public void t(int paramInt, double paramDouble)
  {
    if (paramInt != 181)
    {
      if (paramInt != 17545) {
        switch (paramInt)
        {
        default: 
          switch (paramInt)
          {
          default: 
            break;
          case 30325: 
            vv = ((float)paramDouble);
            break;
          case 30324: 
            vu = ((float)paramDouble);
            break;
          case 30323: 
            vt = ((float)paramDouble);
          }
          break;
        case 21978: 
          vN = ((float)paramDouble);
          break;
        case 21977: 
          vM = ((float)paramDouble);
          break;
        case 21976: 
          vL = ((float)paramDouble);
          break;
        case 21975: 
          vK = ((float)paramDouble);
          break;
        case 21974: 
          vJ = ((float)paramDouble);
          break;
        case 21973: 
          vI = ((float)paramDouble);
          break;
        case 21972: 
          vH = ((float)paramDouble);
          break;
        case 21971: 
          vG = ((float)paramDouble);
          break;
        case 21970: 
          vF = ((float)paramDouble);
          break;
        case 21969: 
          vE = ((float)paramDouble);
          break;
        }
      } else {
        u = (paramDouble);
      }
    }
    else {
      vR = ((int)paramDouble);
    }
  }
  
  public c v(int paramInt)
  {
    l(paramInt);
    return w;
  }
  
  public int w(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 0;
    case 181: 
    case 17545: 
    case 21969: 
    case 21970: 
    case 21971: 
    case 21972: 
    case 21973: 
    case 21974: 
    case 21975: 
    case 21976: 
    case 21977: 
    case 21978: 
    case 30323: 
    case 30324: 
    case 30325: 
      return 5;
    case 161: 
    case 163: 
    case 165: 
    case 16877: 
    case 16981: 
    case 18402: 
    case 21419: 
    case 25506: 
    case 30322: 
      return 4;
    case 160: 
    case 166: 
    case 174: 
    case 183: 
    case 187: 
    case 224: 
    case 225: 
    case 16868: 
    case 18407: 
    case 19899: 
    case 20532: 
    case 20533: 
    case 21936: 
    case 21968: 
    case 25152: 
    case 28032: 
    case 30113: 
    case 30320: 
    case 290298740: 
    case 357149030: 
    case 374648427: 
    case 408125543: 
    case 440786851: 
    case 475249515: 
    case 524531317: 
      return 1;
    case 134: 
    case 17026: 
    case 21358: 
    case 2274716: 
      return 3;
    }
    return 2;
  }
  
  public void x(c paramc, s params, int paramInt)
  {
    if ((c.b(paramc) != 1685485123) && (c.b(paramc) != 1685480259))
    {
      params.i(paramInt);
    }
    else
    {
      byte[] arrayOfByte = new byte[paramInt];
      O = arrayOfByte;
      params.readFully(arrayOfByte, 0, paramInt);
    }
  }
  
  public void y(c paramc, int paramInt1, s params, int paramInt2)
  {
    if ((paramInt1 == 4) && ("V_VP9".equals(b)))
    {
      p.P(paramInt2);
      params.readFully(p.e(), 0, paramInt2);
    }
    else
    {
      params.i(paramInt2);
    }
  }
  
  public void z(int paramInt, long paramLong)
  {
    if (paramInt != 20529)
    {
      if (paramInt != 20530)
      {
        boolean bool1 = false;
        boolean bool2 = false;
        switch (paramInt)
        {
        default: 
          switch (paramInt)
          {
          default: 
            break;
          case 21949: 
            vD = ((int)paramLong);
            break;
          case 21948: 
            vC = ((int)paramLong);
            break;
          case 21947: 
            l(paramInt);
            w.y = true;
            paramInt = d0.h.j((int)paramLong);
            if (paramInt == -1) {
              break;
            }
            w.z = paramInt;
            break;
          case 21946: 
            l(paramInt);
            paramInt = d0.h.k((int)paramLong);
            if (paramInt == -1) {
              break;
            }
            w.A = paramInt;
            break;
          case 21945: 
            l(paramInt);
            paramInt = (int)paramLong;
            if (paramInt != 1)
            {
              if (paramInt == 2) {
                w.B = 1;
              }
            }
            else {
              w.B = 2;
            }
            break;
          }
          break;
        case 2807729: 
          t = paramLong;
          break;
        case 2352003: 
          ve = ((int)paramLong);
          break;
        case 30321: 
          l(paramInt);
          paramInt = (int)paramLong;
          if (paramInt != 0)
          {
            if (paramInt != 1)
            {
              if (paramInt != 2)
              {
                if (paramInt == 3) {
                  w.s = 3;
                }
              }
              else {
                w.s = 2;
              }
            }
            else {
              w.s = 1;
            }
          }
          else {
            w.s = 0;
          }
          break;
        case 30114: 
          T = paramLong;
          break;
        case 25188: 
          vQ = ((int)paramLong);
          break;
        case 22203: 
          vT = paramLong;
          break;
        case 22186: 
          vS = paramLong;
          break;
        case 21998: 
          vf = ((int)paramLong);
          break;
        case 21938: 
          l(paramInt);
          localObject = w;
          y = true;
          o = ((int)paramLong);
          break;
        case 21930: 
          localObject = v(paramInt);
          if (paramLong == 1L) {
            bool2 = true;
          }
          V = bool2;
          break;
        case 21690: 
          vq = ((int)paramLong);
          break;
        case 21682: 
          vr = ((int)paramLong);
          break;
        case 21680: 
          vp = ((int)paramLong);
          break;
        case 21432: 
          int i1 = (int)paramLong;
          l(paramInt);
          if (i1 != 0)
          {
            if (i1 != 1)
            {
              if (i1 != 3)
              {
                if (i1 == 15) {
                  w.x = 3;
                }
              }
              else {
                w.x = 1;
              }
            }
            else {
              w.x = 2;
            }
          }
          else {
            w.x = 0;
          }
          break;
        case 21420: 
          z = (paramLong + s);
          break;
        case 18408: 
          if (paramLong == 1L) {
            break;
          }
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("AESSettingsCipherMode ");
          ((StringBuilder)localObject).append(paramLong);
          ((StringBuilder)localObject).append(" not supported");
          throw A.a(((StringBuilder)localObject).toString(), null);
        case 18401: 
          if (paramLong == 5L) {
            break;
          }
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("ContentEncAlgo ");
          ((StringBuilder)localObject).append(paramLong);
          ((StringBuilder)localObject).append(" not supported");
          throw A.a(((StringBuilder)localObject).toString(), null);
        case 17143: 
          if (paramLong == 1L) {
            break;
          }
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("EBMLReadVersion ");
          ((StringBuilder)localObject).append(paramLong);
          ((StringBuilder)localObject).append(" not supported");
          throw A.a(((StringBuilder)localObject).toString(), null);
        case 17029: 
          if ((paramLong >= 1L) && (paramLong <= 2L)) {
            break;
          }
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("DocTypeReadVersion ");
          ((StringBuilder)localObject).append(paramLong);
          ((StringBuilder)localObject).append(" not supported");
          throw A.a(((StringBuilder)localObject).toString(), null);
        case 16980: 
          if (paramLong == 3L) {
            break;
          }
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("ContentCompAlgo ");
          ((StringBuilder)localObject).append(paramLong);
          ((StringBuilder)localObject).append(" not supported");
          throw A.a(((StringBuilder)localObject).toString(), null);
        case 16871: 
          c.c(v(paramInt), (int)paramLong);
          break;
        case 251: 
          S = true;
          break;
        case 241: 
          if (G) {
            break;
          }
          k(paramInt);
          F.a(paramLong);
          G = true;
          break;
        case 238: 
          R = ((int)paramLong);
          break;
        case 231: 
          D = G(paramLong);
          break;
        case 215: 
          vc = ((int)paramLong);
          break;
        case 186: 
          vn = ((int)paramLong);
          break;
        case 179: 
          k(paramInt);
          E.a(G(paramLong));
          break;
        case 176: 
          vm = ((int)paramLong);
          break;
        case 159: 
          vP = ((int)paramLong);
          break;
        case 155: 
          K = G(paramLong);
          break;
        case 136: 
          localObject = v(paramInt);
          bool2 = bool1;
          if (paramLong == 1L) {
            bool2 = true;
          }
          W = bool2;
          break;
        case 131: 
          vd = ((int)paramLong);
          break;
        }
      }
      else if (paramLong != 1L)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("ContentEncodingScope ");
        ((StringBuilder)localObject).append(paramLong);
        ((StringBuilder)localObject).append(" not supported");
        throw A.a(((StringBuilder)localObject).toString(), null);
      }
    }
    else {
      if (paramLong != 0L) {
        break label1339;
      }
    }
    return;
    label1339:
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("ContentEncodingOrder ");
    ((StringBuilder)localObject).append(paramLong);
    ((StringBuilder)localObject).append(" not supported");
    throw A.a(((StringBuilder)localObject).toString(), null);
  }
  
  public final class b
    implements b
  {
    public b() {}
    
    public void a(int paramInt)
    {
      q(paramInt);
    }
    
    public int b(int paramInt)
    {
      return w(paramInt);
    }
    
    public void c(int paramInt, double paramDouble)
    {
      t(paramInt, paramDouble);
    }
    
    public boolean d(int paramInt)
    {
      return B(paramInt);
    }
    
    public void e(int paramInt1, int paramInt2, s params)
    {
      n(paramInt1, paramInt2, params);
    }
    
    public void f(int paramInt, String paramString)
    {
      J(paramInt, paramString);
    }
    
    public void g(int paramInt, long paramLong1, long paramLong2)
    {
      I(paramInt, paramLong1, paramLong2);
    }
    
    public void h(int paramInt, long paramLong)
    {
      z(paramInt, paramLong);
    }
  }
  
  public static final class c
  {
    public int A = -1;
    public int B = -1;
    public int C = 1000;
    public int D = 200;
    public float E = -1.0F;
    public float F = -1.0F;
    public float G = -1.0F;
    public float H = -1.0F;
    public float I = -1.0F;
    public float J = -1.0F;
    public float K = -1.0F;
    public float L = -1.0F;
    public float M = -1.0F;
    public float N = -1.0F;
    public byte[] O;
    public int P = 1;
    public int Q = -1;
    public int R = 8000;
    public long S = 0L;
    public long T = 0L;
    public U U;
    public boolean V;
    public boolean W = true;
    public String X = "eng";
    public T Y;
    public int Z;
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public byte[] i;
    public T.a j;
    public byte[] k;
    public m l;
    public int m = -1;
    public int n = -1;
    public int o = -1;
    public int p = -1;
    public int q = -1;
    public int r = 0;
    public int s = -1;
    public float t = 0.0F;
    public float u = 0.0F;
    public float v = 0.0F;
    public byte[] w = null;
    public int x = -1;
    public boolean y = false;
    public int z = -1;
    
    public static Pair k(g0.z paramz)
    {
      try
      {
        paramz.U(16);
        long l1 = paramz.w();
        if (l1 == 1482049860L) {
          return new Pair("video/divx", null);
        }
        if (l1 == 859189832L) {
          return new Pair("video/3gpp", null);
        }
        if (l1 == 826496599L)
        {
          int i1 = paramz.f() + 20;
          paramz = paramz.e();
          while (i1 < paramz.length - 4)
          {
            if ((paramz[i1] == 0) && (paramz[(i1 + 1)] == 0) && (paramz[(i1 + 2)] == 1) && (paramz[(i1 + 3)] == 15)) {
              return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(paramz, i1, paramz.length)));
            }
            i1++;
          }
          throw A.a("Failed to find FourCC VC1 initialization data", null);
        }
        g0.o.h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
        return new Pair("video/x-unknown", null);
      }
      catch (ArrayIndexOutOfBoundsException paramz)
      {
        throw A.a("Error parsing FourCC private data", null);
      }
    }
    
    public static boolean l(g0.z paramz)
    {
      try
      {
        int i1 = paramz.y();
        boolean bool = true;
        if (i1 == 1) {
          return true;
        }
        if (i1 == 65534)
        {
          paramz.T(24);
          if (paramz.z() == e.j().getMostSignificantBits())
          {
            long l1 = paramz.z();
            long l2 = e.j().getLeastSignificantBits();
            if (l1 == l2) {}
          }
          else
          {
            bool = false;
          }
          return bool;
        }
        return false;
      }
      catch (ArrayIndexOutOfBoundsException paramz)
      {
        throw A.a("Error parsing MS/ACM codec private", null);
      }
    }
    
    public static List m(byte[] paramArrayOfByte)
    {
      int i1;
      int i2;
      int i3;
      int i4;
      if (paramArrayOfByte[0] == 2)
      {
        i1 = 0;
        for (i2 = 1;; i2++)
        {
          i3 = paramArrayOfByte[i2];
          if ((i3 & 0xFF) != 255) {
            break;
          }
          i1 += 255;
        }
        i2++;
        i3 = i1 + (i3 & 0xFF);
        i1 = 0;
        for (;;)
        {
          i4 = paramArrayOfByte[i2];
          if ((i4 & 0xFF) != 255) {
            break;
          }
          i1 += 255;
          i2++;
        }
        i2++;
        if (paramArrayOfByte[i2] != 1) {}
      }
      try
      {
        byte[] arrayOfByte1 = new byte[i3];
        System.arraycopy(paramArrayOfByte, i2, arrayOfByte1, 0, i3);
        i2 += i3;
        if (paramArrayOfByte[i2] == 3)
        {
          i1 = i2 + (i1 + (i4 & 0xFF));
          if (paramArrayOfByte[i1] == 5)
          {
            byte[] arrayOfByte2 = new byte[paramArrayOfByte.length - i1];
            System.arraycopy(paramArrayOfByte, i1, arrayOfByte2, 0, paramArrayOfByte.length - i1);
            paramArrayOfByte = new java/util/ArrayList;
            paramArrayOfByte.<init>(2);
            paramArrayOfByte.add(arrayOfByte1);
            paramArrayOfByte.add(arrayOfByte2);
            return paramArrayOfByte;
          }
          throw A.a("Error parsing vorbis codec private", null);
        }
        throw A.a("Error parsing vorbis codec private", null);
      }
      catch (ArrayIndexOutOfBoundsException paramArrayOfByte)
      {
        throw A.a("Error parsing vorbis codec private", null);
      }
      throw A.a("Error parsing vorbis codec private", null);
      throw A.a("Error parsing vorbis codec private", null);
    }
    
    public final void f()
    {
      g0.a.e(Y);
    }
    
    public final byte[] g(String paramString)
    {
      Object localObject = k;
      if (localObject != null) {
        return (byte[])localObject;
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Missing CodecPrivate for codec ");
      ((StringBuilder)localObject).append(paramString);
      throw A.a(((StringBuilder)localObject).toString(), null);
    }
    
    public final byte[] h()
    {
      if ((E != -1.0F) && (F != -1.0F) && (G != -1.0F) && (H != -1.0F) && (I != -1.0F) && (J != -1.0F) && (K != -1.0F) && (L != -1.0F) && (M != -1.0F) && (N != -1.0F))
      {
        byte[] arrayOfByte = new byte[25];
        ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte).order(ByteOrder.LITTLE_ENDIAN);
        localByteBuffer.put((byte)0);
        localByteBuffer.putShort((short)(int)(E * 50000.0F + 0.5F));
        localByteBuffer.putShort((short)(int)(F * 50000.0F + 0.5F));
        localByteBuffer.putShort((short)(int)(G * 50000.0F + 0.5F));
        localByteBuffer.putShort((short)(int)(H * 50000.0F + 0.5F));
        localByteBuffer.putShort((short)(int)(I * 50000.0F + 0.5F));
        localByteBuffer.putShort((short)(int)(J * 50000.0F + 0.5F));
        localByteBuffer.putShort((short)(int)(K * 50000.0F + 0.5F));
        localByteBuffer.putShort((short)(int)(L * 50000.0F + 0.5F));
        localByteBuffer.putShort((short)(int)(M + 0.5F));
        localByteBuffer.putShort((short)(int)(N + 0.5F));
        localByteBuffer.putShort((short)C);
        localByteBuffer.putShort((short)D);
        return arrayOfByte;
      }
      return null;
    }
    
    public void i(t paramt, int paramInt)
    {
      Object localObject1 = b;
      ((String)localObject1).hashCode();
      switch (((String)localObject1).hashCode())
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
                                                                  do
                                                                  {
                                                                    do
                                                                    {
                                                                      do
                                                                      {
                                                                        i1 = -1;
                                                                        break;
                                                                      } while (!((String)localObject1).equals("A_OPUS"));
                                                                      i1 = 32;
                                                                      break;
                                                                    } while (!((String)localObject1).equals("A_FLAC"));
                                                                    i1 = 31;
                                                                    break;
                                                                  } while (!((String)localObject1).equals("A_EAC3"));
                                                                  i1 = 30;
                                                                  break;
                                                                } while (!((String)localObject1).equals("V_MPEG2"));
                                                                i1 = 29;
                                                                break;
                                                              } while (!((String)localObject1).equals("S_TEXT/UTF8"));
                                                              i1 = 28;
                                                              break;
                                                            } while (!((String)localObject1).equals("S_TEXT/WEBVTT"));
                                                            i1 = 27;
                                                            break;
                                                          } while (!((String)localObject1).equals("V_MPEGH/ISO/HEVC"));
                                                          i1 = 26;
                                                          break;
                                                        } while (!((String)localObject1).equals("S_TEXT/ASS"));
                                                        i1 = 25;
                                                        break;
                                                      } while (!((String)localObject1).equals("A_PCM/INT/LIT"));
                                                      i1 = 24;
                                                      break;
                                                    } while (!((String)localObject1).equals("A_PCM/INT/BIG"));
                                                    i1 = 23;
                                                    break;
                                                  } while (!((String)localObject1).equals("A_PCM/FLOAT/IEEE"));
                                                  i1 = 22;
                                                  break;
                                                } while (!((String)localObject1).equals("A_DTS/EXPRESS"));
                                                i1 = 21;
                                                break;
                                              } while (!((String)localObject1).equals("V_THEORA"));
                                              i1 = 20;
                                              break;
                                            } while (!((String)localObject1).equals("S_HDMV/PGS"));
                                            i1 = 19;
                                            break;
                                          } while (!((String)localObject1).equals("V_VP9"));
                                          i1 = 18;
                                          break;
                                        } while (!((String)localObject1).equals("V_VP8"));
                                        i1 = 17;
                                        break;
                                      } while (!((String)localObject1).equals("V_AV1"));
                                      i1 = 16;
                                      break;
                                    } while (!((String)localObject1).equals("A_DTS"));
                                    i1 = 15;
                                    break;
                                  } while (!((String)localObject1).equals("A_AC3"));
                                  i1 = 14;
                                  break;
                                } while (!((String)localObject1).equals("A_AAC"));
                                i1 = 13;
                                break;
                              } while (!((String)localObject1).equals("A_DTS/LOSSLESS"));
                              i1 = 12;
                              break;
                            } while (!((String)localObject1).equals("S_VOBSUB"));
                            i1 = 11;
                            break;
                          } while (!((String)localObject1).equals("V_MPEG4/ISO/AVC"));
                          i1 = 10;
                          break;
                        } while (!((String)localObject1).equals("V_MPEG4/ISO/ASP"));
                        i1 = 9;
                        break;
                      } while (!((String)localObject1).equals("S_DVBSUB"));
                      i1 = 8;
                      break;
                    } while (!((String)localObject1).equals("V_MS/VFW/FOURCC"));
                    i1 = 7;
                    break;
                  } while (!((String)localObject1).equals("A_MPEG/L3"));
                  i1 = 6;
                  break;
                } while (!((String)localObject1).equals("A_MPEG/L2"));
                i1 = 5;
                break;
              } while (!((String)localObject1).equals("A_VORBIS"));
              i1 = 4;
              break;
            } while (!((String)localObject1).equals("A_TRUEHD"));
            i1 = 3;
            break;
          } while (!((String)localObject1).equals("A_MS/ACM"));
          i1 = 2;
          break;
        } while (!((String)localObject1).equals("V_MPEG4/ISO/SP"));
        i1 = 1;
        break;
      } while (!((String)localObject1).equals("V_MPEG4/ISO/AP"));
      int i1 = 0;
      Object localObject2 = "audio/raw";
      Object localObject3 = null;
      Object localObject4;
      int i2;
      switch (i1)
      {
      default: 
        throw A.a("Unrecognized codec identifier.", null);
      case 32: 
        localObject4 = new ArrayList(3);
        ((List)localObject4).add(g(b));
        localObject2 = ByteBuffer.allocate(8);
        localObject1 = ByteOrder.LITTLE_ENDIAN;
        ((List)localObject4).add(((ByteBuffer)localObject2).order((ByteOrder)localObject1).putLong(S).array());
        ((List)localObject4).add(ByteBuffer.allocate(8).order((ByteOrder)localObject1).putLong(T).array());
        localObject1 = "audio/opus";
        i1 = 5760;
      case 31: 
        for (localObject5 = null;; localObject5 = localObject2)
        {
          localObject2 = localObject1;
          localObject1 = localObject5;
          i2 = -1;
          break;
          localObject4 = Collections.singletonList(g(b));
          localObject1 = "audio/flac";
          localObject2 = null;
          i1 = -1;
        }
      case 30: 
        localObject1 = "audio/eac3";
      case 29: 
      case 28: 
      case 27: 
        for (;;)
        {
          localObject4 = null;
          localObject2 = localObject4;
          break;
          localObject1 = "video/mpeg2";
          continue;
          localObject4 = null;
          localObject2 = localObject4;
          localObject1 = "application/x-subrip";
          break;
          localObject1 = "text/vtt";
        }
      case 26: 
        localObject4 = F.a(new g0.z(g(b)));
        localObject1 = a;
        Z = b;
        localObject4 = l;
      case 25: 
      case 24: 
      case 23: 
      case 22: 
      case 20: 
      case 19: 
      case 18: 
      case 17: 
      case 16: 
      case 15: 
      case 21: 
      case 14: 
      case 13: 
      case 12: 
      case 11: 
      case 10: 
        for (localObject2 = "video/hevc";; localObject2 = "video/avc")
        {
          i1 = -1;
          i2 = -1;
          localObject5 = localObject4;
          localObject4 = localObject1;
          localObject1 = localObject5;
          break label2097;
          localObject4 = X2.v.a0(e.f(), g(b));
          localObject2 = null;
          localObject1 = "text/x-ssa";
          break;
          i1 = g0.M.e0(Q);
          if (i1 == 0)
          {
            localObject1 = new StringBuilder();
            localObject4 = "Unsupported little endian PCM bit depth: ";
          }
          for (;;)
          {
            ((StringBuilder)localObject1).append((String)localObject4);
            ((StringBuilder)localObject1).append(Q);
            ((StringBuilder)localObject1).append(". Setting mimeType to ");
            ((StringBuilder)localObject1).append("audio/x-unknown");
            g0.o.h("MatroskaExtractor", ((StringBuilder)localObject1).toString());
            localObject4 = null;
            localObject2 = localObject4;
            localObject1 = "audio/x-unknown";
            break;
            for (;;)
            {
              for (i2 = i1;; i2 = 3)
              {
                localObject1 = null;
                localObject4 = null;
                i1 = -1;
                break label2097;
                i1 = Q;
                if (i1 != 8) {
                  break;
                }
              }
              if (i1 == 16)
              {
                i1 = 268435456;
              }
              else if (i1 == 24)
              {
                i1 = 1342177280;
              }
              else
              {
                if (i1 != 32) {
                  break;
                }
                i1 = 1610612736;
              }
            }
            localObject1 = new StringBuilder();
            localObject4 = "Unsupported big endian PCM bit depth: ";
            continue;
            if (Q == 32)
            {
              localObject4 = null;
              localObject1 = localObject4;
              i1 = -1;
              i2 = 4;
              break label2097;
            }
            localObject1 = new StringBuilder();
            localObject4 = "Unsupported floating point PCM bit depth: ";
          }
          localObject1 = "video/x-unknown";
          break label1254;
          localObject4 = null;
          localObject2 = localObject4;
          localObject1 = "application/pgs";
          break;
          localObject1 = "video/x-vnd.on2.vp9";
          break label1254;
          localObject1 = "video/x-vnd.on2.vp8";
          break label1254;
          localObject1 = "video/av01";
          break label1254;
          localObject1 = "audio/vnd.dts";
          break label1254;
          localObject1 = "audio/ac3";
          break label1254;
          localObject4 = Collections.singletonList(g(b));
          localObject1 = F0.a.e(k);
          R = a;
          P = b;
          localObject2 = c;
          localObject1 = "audio/mp4a-latm";
          break;
          localObject1 = "audio/vnd.dts.hd";
          break label1254;
          localObject4 = X2.v.Z(g(b));
          localObject2 = null;
          localObject1 = "application/vobsub";
          break;
          localObject4 = F0.d.b(new g0.z(g(b)));
          localObject1 = a;
          Z = b;
          localObject4 = l;
        }
      case 8: 
        label1254:
        localObject1 = new byte[4];
        System.arraycopy(g(b), 0, localObject1, 0, 4);
        localObject4 = X2.v.Z(localObject1);
        localObject2 = "application/dvbsubs";
      }
      for (;;)
      {
        localObject1 = null;
        i1 = -1;
        break;
        localObject1 = k(new g0.z(g(b)));
        localObject2 = (String)first;
        localObject4 = (List)second;
        continue;
        for (localObject2 = "audio/mpeg";; localObject2 = "audio/mpeg-L2")
        {
          i1 = 4096;
          localObject4 = null;
          localObject1 = localObject4;
          break;
        }
        localObject4 = m(g(b));
        localObject2 = "audio/vorbis";
        i1 = 8192;
        localObject1 = null;
        break;
        U = new U();
        localObject2 = "audio/true-hd";
        localObject4 = null;
        continue;
        if (l(new g0.z(g(b))))
        {
          i2 = g0.M.e0(Q);
          if (i2 == 0)
          {
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append("Unsupported PCM bit depth: ");
            ((StringBuilder)localObject1).append(Q);
            ((StringBuilder)localObject1).append(". Setting mimeType to ");
          }
        }
        for (;;)
        {
          ((StringBuilder)localObject1).append("audio/x-unknown");
          g0.o.h("MatroskaExtractor", ((StringBuilder)localObject1).toString());
          localObject4 = null;
          localObject2 = "audio/x-unknown";
          break;
          localObject4 = null;
          localObject1 = localObject4;
          i1 = -1;
          break label2097;
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("Non-PCM MS/ACM is unsupported. Setting mimeType to ");
        }
        localObject1 = k;
        if (localObject1 == null) {
          localObject4 = null;
        } else {
          localObject4 = Collections.singletonList(localObject1);
        }
        localObject2 = "video/mp4v-es";
      }
      label2097:
      Object localObject6 = localObject1;
      Object localObject5 = localObject2;
      if (O != null)
      {
        F0.o localo = F0.o.a(new g0.z(O));
        localObject6 = localObject1;
        localObject5 = localObject2;
        if (localo != null)
        {
          localObject6 = c;
          localObject5 = "video/dolby-vision";
        }
      }
      int i3 = W;
      int i4;
      if (V) {
        i4 = 2;
      } else {
        i4 = 0;
      }
      localObject2 = new q.b();
      if (d0.z.o((String)localObject5))
      {
        ((q.b)localObject2).N(P).p0(R).i0(i2);
        i2 = 1;
      }
      else if (d0.z.s((String)localObject5))
      {
        if (r == 0)
        {
          i5 = p;
          i2 = i5;
          if (i5 == -1) {
            i2 = m;
          }
          p = i2;
          i5 = q;
          i2 = i5;
          if (i5 == -1) {
            i2 = n;
          }
          q = i2;
        }
        i2 = -1;
        int i5 = p;
        if (i5 != -1)
        {
          int i6 = q;
          if (i6 != -1)
          {
            f1 = n * i5 / (m * i6);
            break label2345;
          }
        }
        float f1 = -1.0F;
        label2345:
        localObject1 = localObject3;
        if (y)
        {
          localObject1 = h();
          localObject1 = new h.b().d(z).c(B).e(A).f((byte[])localObject1).g(o).b(o).a();
        }
        i5 = i2;
        if (a != null)
        {
          i5 = i2;
          if (e.h().containsKey(a)) {
            i5 = ((Integer)e.h().get(a)).intValue();
          }
        }
        i2 = i5;
        if (s == 0)
        {
          i2 = i5;
          if (Float.compare(t, 0.0F) == 0)
          {
            i2 = i5;
            if (Float.compare(u, 0.0F) == 0) {
              if (Float.compare(v, 0.0F) == 0)
              {
                i2 = 0;
              }
              else if (Float.compare(v, 90.0F) == 0)
              {
                i2 = 90;
              }
              else if ((Float.compare(v, -180.0F) != 0) && (Float.compare(v, 180.0F) != 0))
              {
                i2 = i5;
                if (Float.compare(v, -90.0F) == 0) {
                  i2 = 270;
                }
              }
              else
              {
                i2 = 180;
              }
            }
          }
        }
        ((q.b)localObject2).v0(m).Y(n).k0(f1).n0(i2).l0(w).r0(x).P((d0.h)localObject1);
        i2 = 2;
      }
      else
      {
        if ((!"application/x-subrip".equals(localObject5)) && (!"text/x-ssa".equals(localObject5)) && (!"text/vtt".equals(localObject5)) && (!"application/vobsub".equals(localObject5)) && (!"application/pgs".equals(localObject5)) && (!"application/dvbsubs".equals(localObject5))) {
          throw A.a("Unexpected MIME type.", null);
        }
        i2 = 3;
      }
      if ((a != null) && (!e.h().containsKey(a))) {
        ((q.b)localObject2).c0(a);
      }
      localObject1 = ((q.b)localObject2).Z(paramInt).o0((String)localObject5).f0(i1).e0(X).q0(i4 | i3).b0((List)localObject4).O((String)localObject6).U(l).K();
      paramt = paramt.a(c, i2);
      Y = paramt;
      paramt.d((q)localObject1);
    }
    
    public void j()
    {
      U localU = U;
      if (localU != null) {
        localU.a(Y, j);
      }
    }
    
    public void n()
    {
      U localU = U;
      if (localU != null) {
        localU.b();
      }
    }
    
    public final boolean o(boolean paramBoolean)
    {
      if ("A_OPUS".equals(b)) {
        return paramBoolean;
      }
      if (f > 0) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      }
      return paramBoolean;
    }
  }
}

/* Location:
 * Qualified Name:     X0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */