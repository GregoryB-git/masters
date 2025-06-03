package X0;

import F0.F;
import F0.T;
import F0.T.a;
import F0.U;
import F0.a.b;
import F0.d;
import F0.t;
import X2.v;
import android.util.Pair;
import d0.A;
import d0.h;
import d0.h.b;
import d0.m;
import d0.q;
import d0.q.b;
import g0.M;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class e$c
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
        localObject4 = v.a0(e.f(), g(b));
        localObject2 = null;
        localObject1 = "text/x-ssa";
        break;
        i1 = M.e0(Q);
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
        localObject4 = v.Z(g(b));
        localObject2 = null;
        localObject1 = "application/vobsub";
        break;
        localObject4 = d.b(new g0.z(g(b)));
        localObject1 = a;
        Z = b;
        localObject4 = l;
      }
    case 8: 
      label1254:
      localObject1 = new byte[4];
      System.arraycopy(g(b), 0, localObject1, 0, 4);
      localObject4 = v.Z(localObject1);
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
        i2 = M.e0(Q);
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
      ((q.b)localObject2).v0(m).Y(n).k0(f1).n0(i2).l0(w).r0(x).P((h)localObject1);
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

/* Location:
 * Qualified Name:     X0.e.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */