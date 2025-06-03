package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

final class gr
{
  public int A = 1000;
  public int B = 200;
  public float C = -1.0F;
  public float D = -1.0F;
  public float E = -1.0F;
  public float F = -1.0F;
  public float G = -1.0F;
  public float H = -1.0F;
  public float I = -1.0F;
  public float J = -1.0F;
  public float K = -1.0F;
  public float L = -1.0F;
  public int M = 1;
  public int N = -1;
  public int O = 8000;
  public long P = 0L;
  public long Q = 0L;
  public gq R;
  public boolean S;
  public boolean T = true;
  public gi U;
  public int V;
  private String W = "eng";
  public String a;
  public String b;
  public int c;
  public int d;
  public int e;
  public int f;
  public boolean g;
  public byte[] h;
  public gl i;
  public byte[] j;
  public fe k;
  public int l = -1;
  public int m = -1;
  public int n = -1;
  public int o = -1;
  public int p = 0;
  public int q = -1;
  public float r = 0.0F;
  public float s = 0.0F;
  public float t = 0.0F;
  public byte[] u = null;
  public int v = -1;
  public boolean w = false;
  public int x = -1;
  public int y = -1;
  public int z = -1;
  
  private static Pair<String, List<byte[]>> a(vy paramvy)
    throws ce
  {
    try
    {
      paramvy.d(16);
      long l1 = paramvy.k();
      if (l1 == 1482049860L) {
        return new Pair("video/divx", null);
      }
      if (l1 == 859189832L) {
        return new Pair("video/3gpp", null);
      }
      if (l1 == 826496599L)
      {
        int i1 = paramvy.d() + 20;
        paramvy = a;
        while (i1 < paramvy.length - 4)
        {
          if ((paramvy[i1] == 0) && (paramvy[(i1 + 1)] == 0) && (paramvy[(i1 + 2)] == 1) && (paramvy[(i1 + 3)] == 15)) {
            return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(paramvy, i1, paramvy.length)));
          }
          i1++;
        }
        paramvy = new com/google/ads/interactivemedia/v3/internal/ce;
        paramvy.<init>("Failed to find FourCC VC1 initialization data");
        throw paramvy;
      }
      Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
      return new Pair("video/x-unknown", null);
    }
    catch (ArrayIndexOutOfBoundsException paramvy)
    {
      throw new ce("Error parsing FourCC private data");
    }
  }
  
  private static List<byte[]> a(byte[] paramArrayOfByte)
    throws ce
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
        if (i3 != -1) {
          break;
        }
        i1 += 255;
      }
      i2++;
      i3 = i1 + i3;
      i1 = 0;
      for (;;)
      {
        i4 = paramArrayOfByte[i2];
        if (i4 != -1) {
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
        i1 = i2 + (i1 + i4);
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
        paramArrayOfByte = new com/google/ads/interactivemedia/v3/internal/ce;
        paramArrayOfByte.<init>("Error parsing vorbis codec private");
        throw paramArrayOfByte;
      }
      paramArrayOfByte = new com/google/ads/interactivemedia/v3/internal/ce;
      paramArrayOfByte.<init>("Error parsing vorbis codec private");
      throw paramArrayOfByte;
    }
    catch (ArrayIndexOutOfBoundsException paramArrayOfByte)
    {
      throw new ce("Error parsing vorbis codec private");
    }
    paramArrayOfByte = new com/google/ads/interactivemedia/v3/internal/ce;
    paramArrayOfByte.<init>("Error parsing vorbis codec private");
    throw paramArrayOfByte;
    paramArrayOfByte = new com/google/ads/interactivemedia/v3/internal/ce;
    paramArrayOfByte.<init>("Error parsing vorbis codec private");
    throw paramArrayOfByte;
  }
  
  private static boolean b(vy paramvy)
    throws ce
  {
    try
    {
      int i1 = paramvy.g();
      if (i1 == 1) {
        return true;
      }
      if (i1 == 65534)
      {
        paramvy.c(24);
        if (paramvy.m() == go.b().getMostSignificantBits())
        {
          long l1 = paramvy.m();
          long l2 = go.b().getLeastSignificantBits();
          if (l1 == l2) {
            return true;
          }
        }
      }
      return false;
    }
    catch (ArrayIndexOutOfBoundsException paramvy)
    {
      throw new ce("Error parsing MS/ACM codec private");
    }
  }
  
  public final void a(fy paramfy, int paramInt)
    throws ce
  {
    Object localObject1 = b;
    localObject1.getClass();
    int i1 = ((String)localObject1).hashCode();
    int i2 = 1;
    int i3 = 0;
    switch (i1)
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
                                                                i1 = -1;
                                                                break;
                                                              } while (!((String)localObject1).equals("A_OPUS"));
                                                              i1 = 29;
                                                              break;
                                                            } while (!((String)localObject1).equals("A_FLAC"));
                                                            i1 = 28;
                                                            break;
                                                          } while (!((String)localObject1).equals("A_EAC3"));
                                                          i1 = 27;
                                                          break;
                                                        } while (!((String)localObject1).equals("V_MPEG2"));
                                                        i1 = 26;
                                                        break;
                                                      } while (!((String)localObject1).equals("S_TEXT/UTF8"));
                                                      i1 = 25;
                                                      break;
                                                    } while (!((String)localObject1).equals("V_MPEGH/ISO/HEVC"));
                                                    i1 = 24;
                                                    break;
                                                  } while (!((String)localObject1).equals("S_TEXT/ASS"));
                                                  i1 = 23;
                                                  break;
                                                } while (!((String)localObject1).equals("A_PCM/INT/LIT"));
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
    i1 = 0;
    Object localObject2 = "audio/raw";
    Object localObject3;
    switch (i1)
    {
    default: 
      throw new ce("Unrecognized codec identifier.");
    case 29: 
      localObject2 = new ArrayList(3);
      ((ArrayList)localObject2).add(j);
      ((ArrayList)localObject2).add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(P).array());
      ((ArrayList)localObject2).add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(Q).array());
      localObject1 = "audio/opus";
      i1 = 5760;
      break;
    case 28: 
      localObject1 = Collections.singletonList(j);
      localObject2 = "audio/flac";
      break;
    case 27: 
      localObject1 = "audio/eac3";
      break;
    case 26: 
      localObject1 = "video/mpeg2";
      break;
    case 25: 
      localObject2 = "application/x-subrip";
      break;
    case 24: 
      localObject2 = wt.a(new vy(j));
      localObject1 = a;
      V = b;
      localObject2 = "video/hevc";
      break;
    case 23: 
      localObject2 = "text/x-ssa";
      break;
    case 22: 
      i1 = wl.b(N);
      if (i1 == 0)
      {
        i1 = N;
        localObject1 = new StringBuilder("audio/x-unknown".length() + 60);
        ((StringBuilder)localObject1).append("Unsupported PCM bit depth: ");
        ((StringBuilder)localObject1).append(i1);
        ((StringBuilder)localObject1).append(". Setting mimeType to ");
        ((StringBuilder)localObject1).append("audio/x-unknown");
        Log.w("MatroskaExtractor", ((StringBuilder)localObject1).toString());
        localObject1 = "audio/x-unknown";
      }
      else
      {
        localObject1 = null;
      }
      break;
    case 20: 
      localObject1 = "video/x-unknown";
      break;
    case 19: 
      localObject2 = "application/pgs";
      break;
    case 18: 
      localObject1 = "video/x-vnd.on2.vp9";
      break;
    case 17: 
      localObject1 = "video/x-vnd.on2.vp8";
      localObject3 = null;
      localObject2 = localObject1;
      localObject1 = localObject3;
    }
    int i4;
    int i5;
    for (;;)
    {
      i1 = -1;
      i4 = -1;
      localObject3 = localObject1;
      localObject1 = localObject2;
      i5 = i1;
      break label1772;
      localObject1 = "video/av01";
      break;
      localObject1 = "audio/vnd.dts";
      break;
      localObject1 = "audio/ac3";
      break;
      localObject1 = Collections.singletonList(j);
      localObject2 = "audio/mp4a-latm";
      continue;
      localObject1 = "audio/vnd.dts.hd";
      break;
      localObject1 = Collections.singletonList(j);
      localObject2 = "application/vobsub";
      continue;
      localObject2 = wn.a(new vy(j));
      localObject1 = a;
      V = b;
      localObject2 = "video/avc";
      continue;
      localObject1 = j;
      localObject1 = Collections.singletonList(new byte[] { localObject1[0], localObject1[1], localObject1[2], localObject1[3] });
      localObject2 = "application/dvbsubs";
      continue;
      localObject1 = a(new vy(j));
      localObject2 = (String)first;
      localObject1 = (List)second;
      continue;
      localObject1 = "audio/mpeg";
      break label1530;
      localObject1 = "audio/mpeg-L2";
      label1530:
      i1 = 4096;
      localObject2 = null;
      break label1559;
      localObject2 = a(j);
      localObject1 = "audio/vorbis";
      i1 = 8192;
      label1559:
      i5 = -1;
      localObject3 = localObject2;
      i4 = i1;
      break label1772;
      R = new gq();
      localObject2 = "audio/true-hd";
      label1589:
      localObject1 = null;
      continue;
      if (b(new vy(j)))
      {
        i1 = wl.b(N);
        if (i1 == 0)
        {
          i1 = N;
          localObject1 = new StringBuilder("audio/x-unknown".length() + 60);
          ((StringBuilder)localObject1).append("Unsupported PCM bit depth: ");
          ((StringBuilder)localObject1).append(i1);
          ((StringBuilder)localObject1).append(". Setting mimeType to ");
          ((StringBuilder)localObject1).append("audio/x-unknown");
          Log.w("MatroskaExtractor", ((StringBuilder)localObject1).toString());
        }
      }
      for (;;)
      {
        localObject2 = "audio/x-unknown";
        break label1589;
        localObject1 = null;
        break;
        if ("audio/x-unknown".length() != 0) {
          localObject1 = "Non-PCM MS/ACM is unsupported. Setting mimeType to ".concat("audio/x-unknown");
        } else {
          localObject1 = new String("Non-PCM MS/ACM is unsupported. Setting mimeType to ");
        }
        Log.w("MatroskaExtractor", (String)localObject1);
      }
      localObject1 = j;
      if (localObject1 == null) {
        localObject1 = null;
      } else {
        localObject1 = Collections.singletonList(localObject1);
      }
      localObject2 = "video/mp4v-es";
    }
    label1772:
    boolean bool = T;
    if (S) {
      i1 = 2;
    } else {
      i1 = 0;
    }
    i1 = bool | false | i1;
    if (vs.a((String)localObject1))
    {
      localObject1 = bw.a(Integer.toString(paramInt), (String)localObject1, null, -1, i4, M, O, i5, (List)localObject3, k, i1, W);
      paramInt = i2;
    }
    else if (vs.b((String)localObject1))
    {
      if (p == 0)
      {
        i5 = n;
        i1 = i5;
        if (i5 == -1) {
          i1 = l;
        }
        n = i1;
        i5 = o;
        i1 = i5;
        if (i5 == -1) {
          i1 = m;
        }
        o = i1;
      }
      i1 = n;
      if (i1 != -1)
      {
        i5 = o;
        if (i5 != -1)
        {
          f1 = m * i1 / (l * i5);
          break label1974;
        }
      }
      float f1 = -1.0F;
      label1974:
      if (w)
      {
        if ((C != -1.0F) && (D != -1.0F) && (E != -1.0F) && (F != -1.0F) && (G != -1.0F) && (H != -1.0F) && (I != -1.0F) && (J != -1.0F) && (K != -1.0F) && (L != -1.0F))
        {
          localObject2 = new byte[25];
          ByteBuffer localByteBuffer = ByteBuffer.wrap((byte[])localObject2);
          localByteBuffer.put((byte)0);
          localByteBuffer.putShort((short)(int)(C * 50000.0F + 0.5F));
          localByteBuffer.putShort((short)(int)(D * 50000.0F + 0.5F));
          localByteBuffer.putShort((short)(int)(E * 50000.0F + 0.5F));
          localByteBuffer.putShort((short)(int)(F * 50000.0F + 0.5F));
          localByteBuffer.putShort((short)(int)(G * 50000.0F + 0.5F));
          localByteBuffer.putShort((short)(int)(H * 50000.0F + 0.5F));
          localByteBuffer.putShort((short)(int)(I * 50000.0F + 0.5F));
          localByteBuffer.putShort((short)(int)(J * 50000.0F + 0.5F));
          localByteBuffer.putShort((short)(int)(K + 0.5F));
          localByteBuffer.putShort((short)(int)(L + 0.5F));
          localByteBuffer.putShort((short)A);
          localByteBuffer.putShort((short)B);
        }
        else
        {
          localObject2 = null;
        }
        localObject2 = new wm(x, z, y, (byte[])localObject2);
      }
      else
      {
        localObject2 = null;
      }
      if ("htc_video_rotA-000".equals(a)) {
        i1 = 0;
      } else if ("htc_video_rotA-090".equals(a)) {
        i1 = 90;
      } else if ("htc_video_rotA-180".equals(a)) {
        i1 = 180;
      } else if ("htc_video_rotA-270".equals(a)) {
        i1 = 270;
      } else {
        i1 = -1;
      }
      if ((q == 0) && (Float.compare(r, 0.0F) == 0) && (Float.compare(s, 0.0F) == 0))
      {
        if (Float.compare(t, 0.0F) == 0) {
          i1 = i3;
        }
        for (;;)
        {
          break;
          if (Float.compare(s, 90.0F) == 0)
          {
            i1 = 90;
          }
          else if ((Float.compare(s, -180.0F) != 0) && (Float.compare(s, 180.0F) != 0))
          {
            if (Float.compare(s, -90.0F) != 0) {
              break;
            }
            i1 = 270;
          }
          else
          {
            i1 = 180;
          }
        }
      }
      localObject1 = bw.a(Integer.toString(paramInt), (String)localObject1, null, -1, i4, l, m, -1.0F, (List)localObject3, i1, f1, u, v, (wm)localObject2, k);
      paramInt = 2;
    }
    else
    {
      if ("application/x-subrip".equals(localObject1)) {
        localObject1 = bw.a(Integer.toString(paramInt), (String)localObject1, i1, W, k);
      }
      for (;;)
      {
        paramInt = 3;
        break;
        if ("text/x-ssa".equals(localObject1))
        {
          localObject2 = new ArrayList(2);
          ((ArrayList)localObject2).add(go.a());
          ((ArrayList)localObject2).add(j);
          localObject1 = bw.a(Integer.toString(paramInt), (String)localObject1, null, -1, i1, W, -1, k, Long.MAX_VALUE, (List)localObject2);
        }
        else
        {
          if ((!"application/vobsub".equals(localObject1)) && (!"application/pgs".equals(localObject1)) && (!"application/dvbsubs".equals(localObject1))) {
            throw new ce("Unexpected MIME type.");
          }
          localObject1 = bw.a(Integer.toString(paramInt), (String)localObject1, null, -1, i1, (List)localObject3, W, k);
        }
      }
    }
    paramfy = paramfy.a(c, paramInt);
    U = paramfy;
    paramfy.a((bw)localObject1);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.gr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */