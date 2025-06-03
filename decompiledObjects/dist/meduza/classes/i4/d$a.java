package i4;

import android.util.Pair;
import android.util.SparseArray;
import c4.j;
import c4.t.b;
import c4.v;
import c4.v.a;
import c4.w;
import f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import v3.a1;
import v3.h;
import v3.i0;
import v3.i0.a;
import v5.e0;
import v5.m;
import v5.n;
import v5.p;
import v5.u;
import w5.e;
import x3.a.a;

public final class d$a
  implements b
{
  public d$a(d paramd) {}
  
  public final void a(int paramInt)
  {
    d locald = a;
    x6.b.K(b0);
    Object localObject1;
    Object localObject7;
    Object localObject8;
    long l1;
    label437:
    label1548:
    label1565:
    label1575:
    label1668:
    label1696:
    int k;
    if (paramInt != 160)
    {
      Object localObject2;
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
                  if (paramInt != 475249515) {
                    break label6061;
                  }
                  if (!v)
                  {
                    localObject1 = b0;
                    localObject2 = C;
                    localObject6 = D;
                    if ((q != -1L) && (t != -9223372036854775807L) && (localObject2 != null))
                    {
                      i = a;
                      if ((i != 0) && (localObject6 != null) && (a == i))
                      {
                        localObject7 = new int[i];
                        localObject8 = new long[i];
                        localObject9 = new long[i];
                        localObject10 = new long[i];
                        for (paramInt = 0; paramInt < i; paramInt++)
                        {
                          localObject10[paramInt] = ((n)localObject2).b(paramInt);
                          l1 = q;
                          localObject8[paramInt] = (((n)localObject6).b(paramInt) + l1);
                        }
                        for (paramInt = 0;; paramInt = j)
                        {
                          j = i - 1;
                          if (paramInt >= j) {
                            break;
                          }
                          j = paramInt + 1;
                          localObject7[paramInt] = ((int)(localObject8[j] - localObject8[paramInt]));
                          localObject10[j] -= localObject10[paramInt];
                        }
                        localObject7[j] = ((int)(q + p - localObject8[j]));
                        l1 = t - localObject10[j];
                        localObject9[j] = l1;
                        localObject11 = localObject7;
                        localObject12 = localObject8;
                        localObject6 = localObject9;
                        localObject2 = localObject10;
                        if (l1 <= 0L)
                        {
                          localObject2 = new StringBuilder();
                          ((StringBuilder)localObject2).append("Discarding last cue point with unexpected duration: ");
                          ((StringBuilder)localObject2).append(l1);
                          m.f("MatroskaExtractor", ((StringBuilder)localObject2).toString());
                          localObject11 = Arrays.copyOf((int[])localObject7, j);
                          localObject12 = Arrays.copyOf((long[])localObject8, j);
                          localObject6 = Arrays.copyOf((long[])localObject9, j);
                          localObject2 = Arrays.copyOf((long[])localObject10, j);
                        }
                        localObject2 = new c4.c((int[])localObject11, (long[])localObject12, (long[])localObject6, (long[])localObject2);
                        break label437;
                      }
                    }
                    localObject2 = new t.b(t);
                    ((j)localObject1).t((c4.t)localObject2);
                    v = true;
                  }
                  C = null;
                  D = null;
                  break label6061;
                }
                if (c.size() != 0)
                {
                  b0.m();
                  break label6061;
                }
                throw a1.a("No valid tracks were found", null);
              }
              if (r == -9223372036854775807L) {
                r = 1000000L;
              }
              l1 = s;
              if (l1 == -9223372036854775807L) {
                break label6061;
              }
              t = locald.k(l1);
              break label6061;
            }
            locald.c(paramInt);
            localObject2 = u;
            if ((!h) || (i == null)) {
              break label6061;
            }
            throw a1.a("Combining encryption and compression is not supported", null);
          }
          locald.c(paramInt);
          localObject6 = u;
          if (!h) {
            break label6061;
          }
          localObject2 = j;
          if (localObject2 != null)
          {
            l = new a4.d(new a4.d.b[] { new a4.d.b(h.a, null, "video/webm", b) });
            break label6061;
          }
          throw a1.a("Encrypted Track found but ContentEncKeyID was not found", null);
        }
        paramInt = w;
        if (paramInt != -1)
        {
          l1 = x;
          if (l1 != -1L)
          {
            if (paramInt != 475249515) {
              break label6061;
            }
            z = l1;
            break label6061;
          }
        }
        throw a1.a("Mandatory element SeekID or SeekPosition not found", null);
      }
      localObject6 = u;
      x6.b.K(localObject6);
      localObject11 = b;
      if (localObject11 != null)
      {
        paramInt = ((String)localObject11).hashCode();
        localObject9 = "V_MPEG4/ISO/SP";
        localObject10 = "A_MS/ACM";
        localObject7 = "A_TRUEHD";
        localObject8 = "A_VORBIS";
        localObject1 = "A_MPEG/L2";
        localObject12 = "A_MPEG/L3";
        localObject2 = "V_MS/VFW/FOURCC";
        String str = "S_DVBSUB";
        j = 20;
        switch (paramInt)
        {
        default: 
        case 1951062397: 
        case 1950789798: 
        case 1950749482: 
        case 1809237540: 
        case 1422270023: 
        case 1045209816: 
        case 855502857: 
        case 738597099: 
        case 725957860: 
        case 725948237: 
        case 635596514: 
        case 542569478: 
        case 444813526: 
        case 99146302: 
        case 82338134: 
        case 82338133: 
        case 82318131: 
        case 62927045: 
        case 62923603: 
        case 62923557: 
        case -356037306: 
        case -425012669: 
        case -538363109: 
        case -538363189: 
        case -933872740: 
        case -1373388978: 
        case -1482641357: 
        case -1482641358: 
        case -1730367663: 
        case -1784763192: 
        case -1985379776: 
        case -2095575984: 
          for (;;)
          {
            break;
            if (((String)localObject11).equals("A_OPUS"))
            {
              paramInt = 32;
              for (;;)
              {
                break label1575;
                if (!((String)localObject11).equals("A_FLAC")) {
                  break;
                }
                paramInt = 31;
                continue;
                if (!((String)localObject11).equals("A_EAC3")) {
                  break;
                }
                paramInt = 30;
                continue;
                if (!((String)localObject11).equals("V_MPEG2")) {
                  break;
                }
                paramInt = 29;
                continue;
                if (!((String)localObject11).equals("S_TEXT/UTF8")) {
                  break;
                }
                paramInt = 28;
                continue;
                if (!((String)localObject11).equals("S_TEXT/WEBVTT")) {
                  break;
                }
                paramInt = 27;
                continue;
                if (!((String)localObject11).equals("V_MPEGH/ISO/HEVC")) {
                  break;
                }
                paramInt = 26;
                continue;
                if (!((String)localObject11).equals("S_TEXT/ASS")) {
                  break;
                }
                paramInt = 25;
                break label1668;
                if (!((String)localObject11).equals("A_PCM/INT/LIT")) {
                  break;
                }
                paramInt = 24;
                break label1668;
                if (!((String)localObject11).equals("A_PCM/INT/BIG")) {
                  break;
                }
                paramInt = 23;
                continue;
                if (!((String)localObject11).equals("A_PCM/FLOAT/IEEE")) {
                  break;
                }
                paramInt = 22;
                continue;
                if (!((String)localObject11).equals("A_DTS/EXPRESS")) {
                  break;
                }
                paramInt = 21;
                continue;
                if (!((String)localObject11).equals("V_THEORA")) {
                  break;
                }
                paramInt = 20;
                break label1696;
                if (!((String)localObject11).equals("S_HDMV/PGS")) {
                  break;
                }
                paramInt = 19;
                continue;
                if (!((String)localObject11).equals("V_VP9")) {
                  break;
                }
                paramInt = 18;
                continue;
                if (!((String)localObject11).equals("V_VP8")) {
                  break;
                }
                paramInt = 17;
                continue;
                if (!((String)localObject11).equals("V_AV1")) {
                  break;
                }
                paramInt = 16;
                continue;
                if (!((String)localObject11).equals("A_DTS")) {
                  break;
                }
                paramInt = 15;
                break label1668;
                if (!((String)localObject11).equals("A_AC3")) {
                  break;
                }
                paramInt = 14;
                continue;
                if (!((String)localObject11).equals("A_AAC")) {
                  break;
                }
                paramInt = 13;
                continue;
                if (!((String)localObject11).equals("A_DTS/LOSSLESS")) {
                  break;
                }
                paramInt = 12;
                continue;
                if (!((String)localObject11).equals("S_VOBSUB")) {
                  break;
                }
                paramInt = 11;
                continue;
                if (!((String)localObject11).equals("V_MPEG4/ISO/AVC")) {
                  break;
                }
                paramInt = 10;
                continue;
                if (((String)localObject11).equals("V_MPEG4/ISO/ASP"))
                {
                  paramInt = 9;
                  break label1548;
                  if (!((String)localObject11).equals(str)) {
                    break;
                  }
                  paramInt = 8;
                  break label1668;
                  if (!((String)localObject11).equals(localObject2)) {
                    break label1565;
                  }
                }
                else
                {
                  paramInt = 7;
                }
                localObject2 = "V_MS/VFW/FOURCC";
                continue;
                if (!((String)localObject11).equals(localObject12))
                {
                  localObject12 = "A_MPEG/L3";
                  break;
                }
                paramInt = 6;
              }
              localObject12 = "A_MPEG/L3";
              break label1668;
              if (((String)localObject11).equals(localObject1))
              {
                paramInt = 5;
                break label1668;
                if (((String)localObject11).equals(localObject8))
                {
                  paramInt = 4;
                  break label1668;
                  if (((String)localObject11).equals(localObject7))
                  {
                    paramInt = 3;
                    break label1668;
                    if (((String)localObject11).equals(localObject10))
                    {
                      paramInt = 2;
                      break label1668;
                      if (!((String)localObject11).equals(localObject9)) {
                        break;
                      }
                    }
                  }
                }
              }
            }
          }
          paramInt = 1;
          break;
        case -2095576542: 
          if (((String)localObject11).equals("V_MPEG4/ISO/AP"))
          {
            paramInt = 0;
          }
          else
          {
            localObject2 = "V_MS/VFW/FOURCC";
            paramInt = -1;
          }
          break;
        }
        switch (paramInt)
        {
        default: 
          paramInt = 0;
          break;
        case 0: 
        case 1: 
        case 2: 
        case 3: 
        case 4: 
        case 5: 
        case 6: 
        case 7: 
        case 8: 
        case 9: 
        case 10: 
        case 11: 
        case 12: 
        case 13: 
        case 14: 
        case 15: 
        case 16: 
        case 17: 
        case 18: 
        case 19: 
        case 20: 
        case 21: 
        case 22: 
        case 23: 
        case 24: 
        case 25: 
        case 26: 
        case 27: 
        case 28: 
        case 29: 
        case 30: 
        case 31: 
        case 32: 
          paramInt = 1;
        }
        if (paramInt != 0)
        {
          localObject8 = b0;
          k = c;
          localObject11 = b;
          localObject11.getClass();
          switch (((String)localObject11).hashCode())
          {
          default: 
            break;
          case 1951062397: 
            if (((String)localObject11).equals("A_OPUS")) {
              paramInt = 32;
            }
            break;
          case 1950789798: 
            if (((String)localObject11).equals("A_FLAC")) {
              paramInt = 31;
            }
            break;
          case 1950749482: 
            if (((String)localObject11).equals("A_EAC3")) {
              paramInt = 30;
            }
            break;
          case 1809237540: 
            if (((String)localObject11).equals("V_MPEG2")) {
              paramInt = 29;
            }
            break;
          case 1422270023: 
            if (((String)localObject11).equals("S_TEXT/UTF8")) {
              paramInt = 28;
            }
            break;
          case 1045209816: 
            if (((String)localObject11).equals("S_TEXT/WEBVTT")) {
              paramInt = 27;
            }
            break;
          case 855502857: 
            if (((String)localObject11).equals("V_MPEGH/ISO/HEVC")) {
              paramInt = 26;
            }
            break;
          case 738597099: 
            if (((String)localObject11).equals("S_TEXT/ASS")) {
              paramInt = 25;
            }
            break;
          case 725957860: 
            if (((String)localObject11).equals("A_PCM/INT/LIT")) {
              paramInt = 24;
            }
            break;
          case 725948237: 
            if (((String)localObject11).equals("A_PCM/INT/BIG")) {
              paramInt = 23;
            }
            break;
          case 635596514: 
            if (((String)localObject11).equals("A_PCM/FLOAT/IEEE")) {
              paramInt = 22;
            }
            break;
          case 542569478: 
            if (((String)localObject11).equals("A_DTS/EXPRESS")) {
              paramInt = 21;
            }
            break;
          case 444813526: 
            paramInt = j;
            if (((String)localObject11).equals("V_THEORA")) {
              break label2798;
            }
          case 99146302: 
            if ((goto 2796) && (((String)localObject11).equals("S_HDMV/PGS"))) {
              paramInt = 19;
            }
            break;
          case 82338134: 
            if (((String)localObject11).equals("V_VP9")) {
              paramInt = 18;
            }
            break;
          case 82338133: 
            if (((String)localObject11).equals("V_VP8")) {
              paramInt = 17;
            }
            break;
          case 82318131: 
            if (((String)localObject11).equals("V_AV1")) {
              paramInt = 16;
            }
            break;
          case 62927045: 
            if (((String)localObject11).equals("A_DTS")) {
              paramInt = 15;
            }
            break;
          case 62923603: 
            if (((String)localObject11).equals("A_AC3")) {
              paramInt = 14;
            }
            break;
          case 62923557: 
            if (((String)localObject11).equals("A_AAC")) {
              paramInt = 13;
            }
            break;
          case -356037306: 
            if (((String)localObject11).equals("A_DTS/LOSSLESS")) {
              paramInt = 12;
            }
            break;
          case -425012669: 
            if (((String)localObject11).equals("S_VOBSUB")) {
              paramInt = 11;
            }
            break;
          case -538363109: 
            if (((String)localObject11).equals("V_MPEG4/ISO/AVC")) {
              paramInt = 10;
            }
            break;
          case -538363189: 
            if (((String)localObject11).equals("V_MPEG4/ISO/ASP")) {
              paramInt = 9;
            }
            break;
          case -933872740: 
            if (((String)localObject11).equals("S_DVBSUB")) {
              paramInt = 8;
            }
            break;
          case -1373388978: 
            if (((String)localObject11).equals(localObject2)) {
              paramInt = 7;
            }
            break;
          case -1482641357: 
            if (((String)localObject11).equals(localObject12)) {
              paramInt = 6;
            }
            break;
          case -1482641358: 
            if (((String)localObject11).equals("A_MPEG/L2")) {
              paramInt = 5;
            }
            break;
          case -1730367663: 
            if (((String)localObject11).equals("A_VORBIS")) {
              paramInt = 4;
            }
            break;
          case -1784763192: 
            if (((String)localObject11).equals("A_TRUEHD")) {
              paramInt = 3;
            }
            break;
          case -1985379776: 
            if (((String)localObject11).equals("A_MS/ACM")) {
              paramInt = 2;
            }
            break;
          case -2095575984: 
            if (((String)localObject11).equals("V_MPEG4/ISO/SP")) {
              paramInt = 1;
            }
            break;
          case -2095576542: 
            if (((String)localObject11).equals("V_MPEG4/ISO/AP")) {
              paramInt = 0;
            }
            break;
          }
          paramInt = -1;
          label2798:
          localObject12 = "video/x-unknown";
          localObject2 = "audio/raw";
          localObject11 = "audio/x-unknown";
          label3917:
          Object localObject3;
          switch (paramInt)
          {
          default: 
            throw a1.a("Unrecognized codec identifier.", null);
          case 32: 
            paramInt = 5760;
            localObject2 = new ArrayList(3);
            localObject12 = localObject6;
            ((ArrayList)localObject2).add(((d.b)localObject12).a(b));
            localObject11 = ByteBuffer.allocate(8);
            localObject10 = ByteOrder.LITTLE_ENDIAN;
            ((ArrayList)localObject2).add(((ByteBuffer)localObject11).order((ByteOrder)localObject10).putLong(R).array());
            ((ArrayList)localObject2).add(ByteBuffer.allocate(8).order((ByteOrder)localObject10).putLong(S).array());
            localObject12 = "audio/opus";
            break;
          case 31: 
            localObject2 = localObject6;
            localObject2 = Collections.singletonList(((d.b)localObject2).a(b));
            localObject12 = "audio/flac";
            break;
          case 30: 
            localObject2 = "audio/eac3";
            break;
          case 29: 
            localObject2 = "video/mpeg2";
            break;
          case 28: 
            localObject2 = "application/x-subrip";
            break;
          case 27: 
            localObject2 = "text/vtt";
            break;
          case 26: 
            localObject12 = localObject6;
            localObject11 = e.a(new u(((d.b)localObject12).a(b)));
            localObject2 = a;
            Y = b;
            localObject12 = g;
            localObject11 = "video/hevc";
            break;
          case 25: 
            localObject2 = localObject6;
            localObject2 = o7.t.u(d.d0, ((d.b)localObject2).a(b));
            localObject12 = "text/x-ssa";
            break;
          case 24: 
            j = e0.v(P);
            paramInt = j;
            if (j == 0)
            {
              localObject2 = new StringBuilder();
              localObject12 = "Unsupported little endian PCM bit depth: ";
            }
            break;
          case 23: 
            paramInt = P;
            if (paramInt == 8)
            {
              paramInt = 3;
            }
            else if (paramInt == 16)
            {
              paramInt = 268435456;
            }
            else
            {
              localObject2 = new StringBuilder();
              localObject12 = "Unsupported big endian PCM bit depth: ";
            }
            break;
          case 22: 
            if (P == 32)
            {
              paramInt = 4;
              m = -1;
              j = 1;
              localObject12 = null;
              i = 3;
              n = paramInt;
              paramInt = m;
            }
            else
            {
              localObject2 = new StringBuilder();
              localObject12 = "Unsupported floating point PCM bit depth: ";
              ((StringBuilder)localObject2).append((String)localObject12);
              ((StringBuilder)localObject2).append(P);
              ((StringBuilder)localObject2).append(". Setting mimeType to ");
              ((StringBuilder)localObject2).append("audio/x-unknown");
              m.f("MatroskaExtractor", ((StringBuilder)localObject2).toString());
              localObject12 = localObject11;
            }
            break;
          case 20: 
            localObject2 = localObject12;
            break;
          case 19: 
            localObject2 = "application/pgs";
            break;
          case 18: 
            localObject2 = "video/x-vnd.on2.vp9";
            break;
          case 17: 
            localObject2 = "video/x-vnd.on2.vp8";
            break;
          case 16: 
            localObject2 = "video/av01";
            break;
          case 15: 
          case 21: 
            localObject2 = "audio/vnd.dts";
            break;
          case 14: 
            localObject2 = "audio/ac3";
            break;
          case 13: 
            localObject2 = localObject6;
            localObject10 = Collections.singletonList(((d.b)localObject2).a(b));
            localObject12 = k;
            localObject12 = x3.a.c(new v5.t((byte[])localObject12, localObject12.length), false);
            Q = a;
            O = b;
            localObject12 = c;
            localObject2 = "audio/mp4a-latm";
            break;
          case 12: 
            localObject2 = "audio/vnd.dts.hd";
            localObject12 = localObject2;
            localObject2 = null;
            break;
          case 11: 
            localObject2 = localObject6;
            localObject2 = o7.t.t(((d.b)localObject2).a(b));
            localObject12 = "application/vobsub";
            break;
          case 10: 
            localObject12 = localObject6;
            localObject11 = w5.a.a(new u(((d.b)localObject12).a(b)));
            localObject2 = a;
            Y = b;
            localObject12 = f;
            localObject11 = "video/avc";
            localObject10 = localObject2;
            localObject2 = localObject11;
            paramInt = -1;
            localObject11 = localObject12;
            localObject12 = localObject2;
            break;
          case 8: 
            localObject2 = localObject6;
            localObject12 = new byte[4];
            System.arraycopy(((d.b)localObject2).a(b), 0, localObject12, 0, 4);
            localObject2 = o7.t.t(localObject12);
            localObject12 = "application/dvbsubs";
            break;
          case 7: 
            localObject2 = localObject6;
            localObject2 = new u(((d.b)localObject2).a(b));
            try
            {
              ((u)localObject2).H(16);
              l1 = ((u)localObject2).l();
              if (l1 == 1482049860L)
              {
                localObject2 = new Pair("video/divx", null);
              }
              else if (l1 == 859189832L)
              {
                localObject2 = new Pair("video/3gpp", null);
              }
              else
              {
                if (l1 == 826496599L)
                {
                  paramInt = b + 20;
                  localObject2 = a;
                  while (paramInt < localObject2.length - 4)
                  {
                    if ((localObject2[paramInt] == 0) && (localObject2[(paramInt + 1)] == 0) && (localObject2[(paramInt + 2)] == 1) && (localObject2[(paramInt + 3)] == 15))
                    {
                      localObject2 = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange((byte[])localObject2, paramInt, localObject2.length)));
                      break label3917;
                    }
                    paramInt++;
                  }
                  throw a1.a("Failed to find FourCC VC1 initialization data", null);
                }
                m.f("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                localObject2 = new Pair("video/x-unknown", null);
              }
              localObject12 = (String)first;
              localObject2 = (List)second;
              paramInt = -1;
            }
            catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException1)
            {
              throw a1.a("Error parsing FourCC private data", null);
            }
          case 6: 
            localObject3 = "audio/mpeg";
            break;
          case 5: 
            localObject3 = "audio/mpeg-L2";
            paramInt = 4096;
            localObject11 = null;
            localObject12 = localObject3;
            localObject3 = localObject11;
            j = 1;
            i = 3;
            localObject11 = localObject12;
            localObject12 = localObject3;
            localObject3 = localObject11;
            break;
          case 4: 
            localObject3 = localObject6;
            i = 8192;
            localObject3 = ((d.b)localObject3).a(b);
            if (localObject3[0] == 2)
            {
              paramInt = 0;
              for (j = 1;; j++)
              {
                n = localObject3[j] & 0xFF;
                if (n != 255) {
                  break;
                }
                paramInt += 255;
              }
              j++;
              n = paramInt + n;
              paramInt = 0;
              for (;;)
              {
                m = localObject3[j] & 0xFF;
                if (m != 255) {
                  break;
                }
                paramInt += 255;
                j++;
              }
              j++;
              if (localObject3[j] != 1) {}
            }
            try
            {
              localObject12 = new byte[n];
              System.arraycopy(localObject3, j, localObject12, 0, n);
              j += n;
              if (localObject3[j] == 3)
              {
                paramInt = j + (paramInt + m);
                if (localObject3[paramInt] == 5)
                {
                  localObject11 = new byte[localObject3.length - paramInt];
                  System.arraycopy(localObject3, paramInt, localObject11, 0, localObject3.length - paramInt);
                  localObject3 = new java/util/ArrayList;
                  ((ArrayList)localObject3).<init>(2);
                  ((ArrayList)localObject3).add(localObject12);
                  ((ArrayList)localObject3).add(localObject11);
                  localObject12 = "audio/vorbis";
                  paramInt = i;
                  i = 3;
                  localObject11 = localObject12;
                  j = 1;
                  localObject12 = localObject3;
                  localObject3 = localObject11;
                }
              }
            }
            catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException2) {}
          }
        }
      }
    }
    try
    {
      throw a1.a("Error parsing vorbis codec private", null);
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException4)
    {
      long l2;
      Object localObject5;
      boolean bool;
      float f1;
      float f2;
      for (;;) {}
    }
    throw a1.a("Error parsing vorbis codec private", null);
    throw a1.a("Error parsing vorbis codec private", null);
    throw a1.a("Error parsing vorbis codec private", null);
    throw a1.a("Error parsing vorbis codec private", null);
    T = new w();
    Object localObject12 = "audio/true-hd";
    break label4526;
    localObject12 = localObject6;
    Object localObject9 = new u(((d.b)localObject12).a(b));
    try
    {
      paramInt = ((u)localObject9).n();
      if (paramInt != 1)
      {
        if (paramInt == 65534)
        {
          ((u)localObject9).G(24);
          l1 = ((u)localObject9).o();
          localObject10 = d.g0;
          if (l1 == ((UUID)localObject10).getMostSignificantBits())
          {
            l1 = ((u)localObject9).o();
            l2 = ((UUID)localObject10).getLeastSignificantBits();
            if (l1 != l2) {}
          }
        }
      }
      else
      {
        paramInt = 1;
        break label4414;
      }
      paramInt = 0;
      label4414:
      if (paramInt != 0)
      {
        paramInt = e0.v(P);
        if (paramInt == 0)
        {
          localObject4 = f.l("Unsupported PCM bit depth: ");
          ((StringBuilder)localObject4).append(P);
          ((StringBuilder)localObject4).append(". Setting mimeType to ");
          ((StringBuilder)localObject4).append("audio/x-unknown");
          localObject4 = ((StringBuilder)localObject4).toString();
        }
        else
        {
          localObject11 = null;
          localObject10 = null;
          localObject12 = localObject4;
          i = 3;
          m = 1;
          n = -1;
          localObject4 = localObject11;
          j = paramInt;
          paramInt = m;
          break label4624;
        }
      }
      else
      {
        localObject4 = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown";
      }
      m.f("MatroskaExtractor", (String)localObject4);
      localObject12 = localObject11;
      label4526:
      Object localObject4 = null;
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException3)
    {
      throw a1.a("Error parsing MS/ACM codec private", null);
    }
    localObject5 = k;
    if (localObject5 == null) {
      localObject5 = null;
    } else {
      localObject5 = Collections.singletonList(localObject5);
    }
    localObject12 = "video/mp4v-es";
    int i = 3;
    int j = 1;
    paramInt = -1;
    Object localObject11 = localObject12;
    localObject12 = localObject5;
    localObject5 = localObject11;
    int n = -1;
    int m = n;
    Object localObject10 = localObject12;
    localObject11 = null;
    n = paramInt;
    paramInt = j;
    localObject12 = localObject5;
    j = m;
    localObject5 = localObject11;
    label4624:
    localObject9 = localObject6;
    localObject11 = localObject5;
    Object localObject6 = localObject12;
    if (N != null)
    {
      localObject7 = w5.c.a(new u(N));
      localObject11 = localObject5;
      localObject6 = localObject12;
      if (localObject7 != null)
      {
        localObject11 = a;
        localObject6 = "video/dolby-vision";
      }
    }
    bool = V;
    if (U) {
      m = 2;
    } else {
      m = 0;
    }
    localObject12 = new i0.a();
    if (p.k((String)localObject6))
    {
      x = O;
      y = Q;
      z = j;
    }
    else if (p.m((String)localObject6))
    {
      if (q == 0)
      {
        j = o;
        paramInt = j;
        if (j == -1) {
          paramInt = m;
        }
        o = paramInt;
        j = p;
        paramInt = j;
        if (j == -1) {
          paramInt = n;
        }
        p = paramInt;
      }
      paramInt = -1;
      f1 = -1.0F;
      j = o;
      f2 = f1;
      if (j != -1)
      {
        i = p;
        f2 = f1;
        if (i != -1) {
          f2 = n * j / (m * i);
        }
      }
      if (x)
      {
        if ((D != -1.0F) && (E != -1.0F) && (F != -1.0F) && (G != -1.0F) && (H != -1.0F) && (I != -1.0F) && (J != -1.0F) && (K != -1.0F) && (L != -1.0F) && (M != -1.0F))
        {
          localObject5 = new byte[25];
          localObject7 = ByteBuffer.wrap((byte[])localObject5).order(ByteOrder.LITTLE_ENDIAN);
          ((ByteBuffer)localObject7).put((byte)0);
          ((ByteBuffer)localObject7).putShort((short)(int)(D * 50000.0F + 0.5F));
          ((ByteBuffer)localObject7).putShort((short)(int)(E * 50000.0F + 0.5F));
          ((ByteBuffer)localObject7).putShort((short)(int)(F * 50000.0F + 0.5F));
          ((ByteBuffer)localObject7).putShort((short)(int)(G * 50000.0F + 0.5F));
          ((ByteBuffer)localObject7).putShort((short)(int)(H * 50000.0F + 0.5F));
          ((ByteBuffer)localObject7).putShort((short)(int)(I * 50000.0F + 0.5F));
          ((ByteBuffer)localObject7).putShort((short)(int)(J * 50000.0F + 0.5F));
          ((ByteBuffer)localObject7).putShort((short)(int)(K * 50000.0F + 0.5F));
          ((ByteBuffer)localObject7).putShort((short)(int)(L + 0.5F));
          ((ByteBuffer)localObject7).putShort((short)(int)(M + 0.5F));
          ((ByteBuffer)localObject7).putShort((short)B);
          ((ByteBuffer)localObject7).putShort((short)C);
        }
        else
        {
          localObject5 = null;
        }
        localObject5 = new w5.b(y, (byte[])localObject5, A, z);
      }
      else
      {
        localObject5 = null;
      }
      localObject7 = a;
      j = paramInt;
      if (localObject7 != null)
      {
        localObject1 = d.h0;
        j = paramInt;
        if (((Map)localObject1).containsKey(localObject7)) {
          j = ((Integer)((Map)localObject1).get(a)).intValue();
        }
      }
      paramInt = j;
      if (r == 0)
      {
        paramInt = j;
        if (Float.compare(s, 0.0F) == 0)
        {
          paramInt = j;
          if (Float.compare(t, 0.0F) == 0) {
            if (Float.compare(u, 0.0F) == 0)
            {
              paramInt = 0;
            }
            else if (Float.compare(t, 90.0F) == 0)
            {
              paramInt = 90;
            }
            else if ((Float.compare(t, -180.0F) != 0) && (Float.compare(t, 180.0F) != 0))
            {
              paramInt = j;
              if (Float.compare(t, -90.0F) == 0) {
                paramInt = 270;
              }
            }
            else
            {
              paramInt = 180;
            }
          }
        }
      }
      p = m;
      q = n;
      t = f2;
      s = paramInt;
      u = v;
      v = w;
      w = ((w5.b)localObject5);
      paramInt = 2;
    }
    else
    {
      if ((!"application/x-subrip".equals(localObject6)) && (!"text/x-ssa".equals(localObject6)) && (!"text/vtt".equals(localObject6)) && (!"application/vobsub".equals(localObject6)) && (!"application/pgs".equals(localObject6)) && (!"application/dvbsubs".equals(localObject6))) {
        throw a1.a("Unexpected MIME type.", null);
      }
      paramInt = i;
    }
    localObject5 = a;
    if ((localObject5 != null) && (!d.h0.containsKey(localObject5))) {
      b = a;
    }
    ((i0.a)localObject12).b(k);
    k = ((String)localObject6);
    l = n;
    c = W;
    d = (bool | false | m);
    m = ((List)localObject10);
    h = ((String)localObject11);
    n = l;
    localObject5 = ((i0.a)localObject12).a();
    localObject6 = ((j)localObject8).r(c, paramInt);
    X = ((v)localObject6);
    ((v)localObject6).d((i0)localObject5);
    c.put(c, localObject9);
    u = null;
    break label6061;
    throw a1.a("CodecId is missing in TrackEntry element", null);
    if (G == 2)
    {
      localObject12 = (d.b)c.get(M);
      X.getClass();
      if ((R > 0L) && ("A_OPUS".equals(b)))
      {
        localObject6 = n;
        localObject5 = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(R).array();
        localObject6.getClass();
        ((u)localObject6).E((byte[])localObject5, localObject5.length);
      }
      paramInt = 0;
      for (j = 0; j < K; j++) {
        paramInt += L[j];
      }
      for (j = 0; j < K; j++)
      {
        l2 = H;
        l1 = e * j / 1000;
        n = O;
        i = n;
        if (j == 0)
        {
          i = n;
          if (!Q) {
            i = n | 0x1;
          }
        }
        n = L[j];
        paramInt -= n;
        locald.e((d.b)localObject12, l2 + l1, i, n, paramInt);
      }
      G = 0;
    }
    label6061:
  }
}

/* Location:
 * Qualified Name:     i4.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */