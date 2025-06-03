package t0;

import W2.c;
import X2.v;
import X2.v.a;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import d0.h;
import d0.q;
import g0.M;
import g0.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class I
{
  public static final Pattern a = Pattern.compile("^\\D?(\\d+)$");
  public static final HashMap b = new HashMap();
  public static int c = -1;
  
  public static Pair A(String paramString, String[] paramArrayOfString)
  {
    if (paramArrayOfString.length < 3) {
      paramArrayOfString = new StringBuilder();
    }
    for (;;)
    {
      paramArrayOfString.append("Ignoring malformed VP9 codec string: ");
      paramArrayOfString.append(paramString);
      for (;;)
      {
        paramString = paramArrayOfString.toString();
        label32:
        o.h("MediaCodecUtil", paramString);
        return null;
        try
        {
          int i = Integer.parseInt(paramArrayOfString[1]);
          int j = Integer.parseInt(paramArrayOfString[2]);
          int k = T(i);
          if (k == -1)
          {
            paramString = new StringBuilder();
            paramString.append("Unknown VP9 profile: ");
            paramString.append(i);
            paramString = paramString.toString();
            break label32;
          }
          i = S(j);
          if (i == -1)
          {
            paramArrayOfString = new StringBuilder();
            paramArrayOfString.append("Unknown VP9 level: ");
            paramArrayOfString.append(j);
          }
          else
          {
            return new Pair(Integer.valueOf(k), Integer.valueOf(i));
          }
        }
        catch (NumberFormatException paramArrayOfString)
        {
          paramArrayOfString = new StringBuilder();
        }
      }
    }
  }
  
  public static Integer B(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 2312995: 
      if (paramString.equals("L186")) {
        j = 25;
      }
      break;
    case 2312992: 
      if (paramString.equals("L183")) {
        j = 24;
      }
      break;
    case 2312989: 
      if (paramString.equals("L180")) {
        j = 23;
      }
      break;
    case 2312902: 
      if (paramString.equals("L156")) {
        j = 22;
      }
      break;
    case 2312899: 
      if (paramString.equals("L153")) {
        j = 21;
      }
      break;
    case 2312896: 
      if (paramString.equals("L150")) {
        j = 20;
      }
      break;
    case 2312806: 
      if (paramString.equals("L123")) {
        j = 19;
      }
      break;
    case 2312803: 
      if (paramString.equals("L120")) {
        j = 18;
      }
      break;
    case 2193831: 
      if (paramString.equals("H186")) {
        j = 17;
      }
      break;
    case 2193828: 
      if (paramString.equals("H183")) {
        j = 16;
      }
      break;
    case 2193825: 
      if (paramString.equals("H180")) {
        j = 15;
      }
      break;
    case 2193738: 
      if (paramString.equals("H156")) {
        j = 14;
      }
      break;
    case 2193735: 
      if (paramString.equals("H153")) {
        j = 13;
      }
      break;
    case 2193732: 
      if (paramString.equals("H150")) {
        j = 12;
      }
      break;
    case 2193642: 
      if (paramString.equals("H123")) {
        j = 11;
      }
      break;
    case 2193639: 
      if (paramString.equals("H120")) {
        j = 10;
      }
      break;
    case 74854: 
      if (paramString.equals("L93")) {
        j = 9;
      }
      break;
    case 74851: 
      if (paramString.equals("L90")) {
        j = 8;
      }
      break;
    case 74761: 
      if (paramString.equals("L63")) {
        j = 7;
      }
      break;
    case 74758: 
      if (paramString.equals("L60")) {
        j = 6;
      }
      break;
    case 74665: 
      if (paramString.equals("L30")) {
        j = 5;
      }
      break;
    case 71010: 
      if (paramString.equals("H93")) {
        j = 4;
      }
      break;
    case 71007: 
      if (paramString.equals("H90")) {
        j = 3;
      }
      break;
    case 70917: 
      if (paramString.equals("H63")) {
        j = 2;
      }
      break;
    case 70914: 
      if (paramString.equals("H60")) {
        j = 1;
      }
      break;
    case 70821: 
      if (paramString.equals("H30")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      return null;
    case 25: 
      j = 16777216;
    case 24: 
    case 23: 
    case 22: 
    case 21: 
    case 20: 
    case 19: 
    case 18: 
    case 17: 
    case 16: 
    case 15: 
    case 14: 
    case 13: 
    case 12: 
    case 11: 
    case 10: 
    case 9: 
    case 8: 
    case 7: 
    case 6: 
    case 5: 
    case 4: 
    case 3: 
    case 2: 
      for (;;)
      {
        return Integer.valueOf(j);
        j = 4194304;
        continue;
        j = 1048576;
        continue;
        j = 262144;
        continue;
        j = 65536;
        continue;
        j = 16384;
        continue;
        j = 4096;
        continue;
        j = 1024;
        continue;
        j = 33554432;
        continue;
        j = 8388608;
        continue;
        j = 2097152;
        continue;
        j = 524288;
        continue;
        j = 131072;
        continue;
        j = 32768;
        continue;
        j = 8192;
        continue;
        j = 2048;
        continue;
        j = 256;
        continue;
        j = 64;
        continue;
        return Integer.valueOf(16);
        return Integer.valueOf(4);
        return Integer.valueOf(1);
        j = 512;
        continue;
        j = 128;
        continue;
        j = 32;
      }
    case 1: 
      return Integer.valueOf(8);
    }
    return Integer.valueOf(2);
  }
  
  public static boolean C(MediaCodecInfo paramMediaCodecInfo)
  {
    boolean bool;
    if ((M.a >= 29) && (D(paramMediaCodecInfo))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean D(MediaCodecInfo paramMediaCodecInfo)
  {
    return D.a(paramMediaCodecInfo);
  }
  
  public static boolean E(MediaCodecInfo paramMediaCodecInfo, String paramString1, boolean paramBoolean, String paramString2)
  {
    if ((!paramMediaCodecInfo.isEncoder()) && ((paramBoolean) || (!paramString1.endsWith(".secure"))))
    {
      int i = M.a;
      if ((i < 21) && (("CIPAACDecoder".equals(paramString1)) || ("CIPMP3Decoder".equals(paramString1)) || ("CIPVorbisDecoder".equals(paramString1)) || ("CIPAMRNBDecoder".equals(paramString1)) || ("AACDecoder".equals(paramString1)) || ("MP3Decoder".equals(paramString1)))) {
        return false;
      }
      if ((i < 24) && (("OMX.SEC.aac.dec".equals(paramString1)) || ("OMX.Exynos.AAC.Decoder".equals(paramString1))) && ("samsung".equals(M.c)))
      {
        paramMediaCodecInfo = M.b;
        if ((paramMediaCodecInfo.startsWith("zeroflte")) || (paramMediaCodecInfo.startsWith("zerolte")) || (paramMediaCodecInfo.startsWith("zenlte")) || ("SC-05G".equals(paramMediaCodecInfo)) || ("marinelteatt".equals(paramMediaCodecInfo)) || ("404SC".equals(paramMediaCodecInfo)) || ("SC-04G".equals(paramMediaCodecInfo)) || ("SCV31".equals(paramMediaCodecInfo))) {
          return false;
        }
      }
      if ((i == 19) && ("OMX.SEC.vp8.dec".equals(paramString1)) && ("samsung".equals(M.c)))
      {
        paramMediaCodecInfo = M.b;
        if ((paramMediaCodecInfo.startsWith("d2")) || (paramMediaCodecInfo.startsWith("serrano")) || (paramMediaCodecInfo.startsWith("jflte")) || (paramMediaCodecInfo.startsWith("santos")) || (paramMediaCodecInfo.startsWith("t0"))) {
          return false;
        }
      }
      if ((i == 19) && (M.b.startsWith("jflte")) && ("OMX.qcom.video.decoder.vp8".equals(paramString1))) {
        return false;
      }
      return (i > 23) || (!"audio/eac3-joc".equals(paramString2)) || (!"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(paramString1));
    }
    return false;
  }
  
  public static boolean F(MediaCodecInfo paramMediaCodecInfo, String paramString)
  {
    if (M.a >= 29) {
      return G(paramMediaCodecInfo);
    }
    return H(paramMediaCodecInfo, paramString) ^ true;
  }
  
  public static boolean G(MediaCodecInfo paramMediaCodecInfo)
  {
    return B.a(paramMediaCodecInfo);
  }
  
  public static boolean H(MediaCodecInfo paramMediaCodecInfo, String paramString)
  {
    if (M.a >= 29) {
      return I(paramMediaCodecInfo);
    }
    boolean bool1 = d0.z.o(paramString);
    boolean bool2 = true;
    if (bool1) {
      return true;
    }
    paramMediaCodecInfo = c.e(paramMediaCodecInfo.getName());
    if (paramMediaCodecInfo.startsWith("arc.")) {
      return false;
    }
    bool1 = bool2;
    if (!paramMediaCodecInfo.startsWith("omx.google."))
    {
      bool1 = bool2;
      if (!paramMediaCodecInfo.startsWith("omx.ffmpeg.")) {
        if (paramMediaCodecInfo.startsWith("omx.sec."))
        {
          bool1 = bool2;
          if (paramMediaCodecInfo.contains(".sw.")) {}
        }
        else
        {
          bool1 = bool2;
          if (!paramMediaCodecInfo.equals("omx.qcom.video.decoder.hevcswvdec"))
          {
            bool1 = bool2;
            if (!paramMediaCodecInfo.startsWith("c2.android."))
            {
              bool1 = bool2;
              if (!paramMediaCodecInfo.startsWith("c2.google.")) {
                if ((!paramMediaCodecInfo.startsWith("omx.")) && (!paramMediaCodecInfo.startsWith("c2."))) {
                  bool1 = bool2;
                } else {
                  bool1 = false;
                }
              }
            }
          }
        }
      }
    }
    return bool1;
  }
  
  public static boolean I(MediaCodecInfo paramMediaCodecInfo)
  {
    return A.a(paramMediaCodecInfo);
  }
  
  public static boolean J(MediaCodecInfo paramMediaCodecInfo)
  {
    if (M.a >= 29) {
      return K(paramMediaCodecInfo);
    }
    paramMediaCodecInfo = c.e(paramMediaCodecInfo.getName());
    boolean bool;
    if ((!paramMediaCodecInfo.startsWith("omx.google.")) && (!paramMediaCodecInfo.startsWith("c2.android.")) && (!paramMediaCodecInfo.startsWith("c2.google."))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean K(MediaCodecInfo paramMediaCodecInfo)
  {
    return C.a(paramMediaCodecInfo);
  }
  
  public static int P()
  {
    if (c == -1)
    {
      int i = 0;
      int j = 0;
      Object localObject = s("video/avc", false, false);
      if (localObject != null)
      {
        localObject = ((p)localObject).g();
        int k = localObject.length;
        i = 0;
        while (j < k)
        {
          i = Math.max(h(level), i);
          j++;
        }
        if (M.a >= 21) {
          j = 345600;
        } else {
          j = 172800;
        }
        i = Math.max(i, j);
      }
      c = i;
    }
    return c;
  }
  
  public static int Q(int paramInt)
  {
    int i = 17;
    if (paramInt != 17)
    {
      i = 20;
      if (paramInt != 20)
      {
        i = 23;
        if (paramInt != 23)
        {
          i = 29;
          if (paramInt != 29)
          {
            i = 39;
            if (paramInt != 39)
            {
              i = 42;
              if (paramInt != 42)
              {
                switch (paramInt)
                {
                default: 
                  return -1;
                case 6: 
                  return 6;
                case 5: 
                  return 5;
                case 4: 
                  return 4;
                case 3: 
                  return 3;
                case 2: 
                  return 2;
                }
                return 1;
              }
            }
          }
        }
      }
    }
    return i;
  }
  
  public static void R(List paramList, g paramg)
  {
    Collections.sort(paramList, new H(paramg));
  }
  
  public static int S(int paramInt)
  {
    if (paramInt != 10)
    {
      if (paramInt != 11)
      {
        if (paramInt != 20)
        {
          if (paramInt != 21)
          {
            if (paramInt != 30)
            {
              if (paramInt != 31)
              {
                if (paramInt != 40)
                {
                  if (paramInt != 41)
                  {
                    if (paramInt != 50)
                    {
                      if (paramInt != 51)
                      {
                        switch (paramInt)
                        {
                        default: 
                          return -1;
                        case 62: 
                          return 8192;
                        case 61: 
                          return 4096;
                        }
                        return 2048;
                      }
                      return 512;
                    }
                    return 256;
                  }
                  return 128;
                }
                return 64;
              }
              return 32;
            }
            return 16;
          }
          return 8;
        }
        return 4;
      }
      return 2;
    }
    return 1;
  }
  
  public static int T(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3) {
            return -1;
          }
          return 8;
        }
        return 4;
      }
      return 2;
    }
    return 1;
  }
  
  public static void e(String paramString, List paramList)
  {
    if ("audio/raw".equals(paramString))
    {
      if ((M.a < 26) && (M.b.equals("R9")) && (paramList.size() == 1) && (get0a.equals("OMX.MTK.AUDIO.DECODER.RAW"))) {
        paramList.add(p.C("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
      }
      R(paramList, new E());
    }
    int i = M.a;
    if ((i < 21) && (paramList.size() > 1))
    {
      paramString = get0a;
      if (("OMX.SEC.mp3.dec".equals(paramString)) || ("OMX.SEC.MP3.Decoder".equals(paramString)) || ("OMX.brcm.audio.mp3.decoder".equals(paramString))) {
        R(paramList, new F());
      }
    }
    if ((i < 32) && (paramList.size() > 1) && ("OMX.qti.audio.decoder.flac".equals(get0a))) {
      paramList.add((p)paramList.remove(0));
    }
  }
  
  public static int f(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return -1;
    case 23: 
      return 8388608;
    case 22: 
      return 4194304;
    case 21: 
      return 2097152;
    case 20: 
      return 1048576;
    case 19: 
      return 524288;
    case 18: 
      return 262144;
    case 17: 
      return 131072;
    case 16: 
      return 65536;
    case 15: 
      return 32768;
    case 14: 
      return 16384;
    case 13: 
      return 8192;
    case 12: 
      return 4096;
    case 11: 
      return 2048;
    case 10: 
      return 1024;
    case 9: 
      return 512;
    case 8: 
      return 256;
    case 7: 
      return 128;
    case 6: 
      return 64;
    case 5: 
      return 32;
    case 4: 
      return 16;
    case 3: 
      return 8;
    case 2: 
      return 4;
    case 1: 
      return 2;
    }
    return 1;
  }
  
  public static int g(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      switch (paramInt)
      {
      default: 
        switch (paramInt)
        {
        default: 
          switch (paramInt)
          {
          default: 
            switch (paramInt)
            {
            default: 
              return -1;
            case 52: 
              return 65536;
            case 51: 
              return 32768;
            }
            return 16384;
          case 42: 
            return 8192;
          case 41: 
            return 4096;
          }
          return 2048;
        case 32: 
          return 1024;
        case 31: 
          return 512;
        }
        return 256;
      case 22: 
        return 128;
      case 21: 
        return 64;
      }
      return 32;
    case 13: 
      return 16;
    case 12: 
      return 8;
    case 11: 
      return 4;
    }
    return 1;
  }
  
  public static int h(int paramInt)
  {
    if ((paramInt != 1) && (paramInt != 2))
    {
      switch (paramInt)
      {
      default: 
        return -1;
      case 131072: 
      case 262144: 
      case 524288: 
        return 35651584;
      case 32768: 
      case 65536: 
        return 9437184;
      case 16384: 
        return 5652480;
      case 8192: 
        return 2228224;
      case 2048: 
      case 4096: 
        return 2097152;
      case 1024: 
        return 1310720;
      case 512: 
        return 921600;
      case 128: 
      case 256: 
        return 414720;
      case 64: 
        return 202752;
      }
      return 101376;
    }
    return 25344;
  }
  
  public static int i(int paramInt)
  {
    if (paramInt != 66)
    {
      if (paramInt != 77)
      {
        if (paramInt != 88)
        {
          if (paramInt != 100)
          {
            if (paramInt != 110)
            {
              if (paramInt != 122)
              {
                if (paramInt != 244) {
                  return -1;
                }
                return 64;
              }
              return 32;
            }
            return 16;
          }
          return 8;
        }
        return 4;
      }
      return 2;
    }
    return 1;
  }
  
  public static Integer j(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1570: 
      if (paramString.equals("13")) {
        j = 12;
      }
      break;
    case 1569: 
      if (paramString.equals("12")) {
        j = 11;
      }
      break;
    case 1568: 
      if (paramString.equals("11")) {
        j = 10;
      }
      break;
    case 1567: 
      if (paramString.equals("10")) {
        j = 9;
      }
      break;
    case 1545: 
      if (paramString.equals("09")) {
        j = 8;
      }
      break;
    case 1544: 
      if (paramString.equals("08")) {
        j = 7;
      }
      break;
    case 1543: 
      if (paramString.equals("07")) {
        j = 6;
      }
      break;
    case 1542: 
      if (paramString.equals("06")) {
        j = 5;
      }
      break;
    case 1541: 
      if (paramString.equals("05")) {
        j = 4;
      }
      break;
    case 1540: 
      if (paramString.equals("04")) {
        j = 3;
      }
      break;
    case 1539: 
      if (paramString.equals("03")) {
        j = 2;
      }
      break;
    case 1538: 
      if (paramString.equals("02")) {
        j = 1;
      }
      break;
    case 1537: 
      if (paramString.equals("01")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      return null;
    case 12: 
      j = 4096;
    case 11: 
    case 10: 
    case 9: 
    case 8: 
    case 7: 
    case 6: 
    case 5: 
    case 4: 
      for (;;)
      {
        return Integer.valueOf(j);
        j = 2048;
        continue;
        j = 1024;
        continue;
        j = 512;
        continue;
        j = 256;
        continue;
        j = 128;
        continue;
        j = 64;
        continue;
        j = 32;
        continue;
        j = 16;
      }
    case 3: 
      return Integer.valueOf(8);
    case 2: 
      return Integer.valueOf(4);
    case 1: 
      return Integer.valueOf(2);
    }
    return Integer.valueOf(1);
  }
  
  public static Integer k(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1567: 
      if (paramString.equals("10")) {
        j = 10;
      }
      break;
    case 1545: 
      if (paramString.equals("09")) {
        j = 9;
      }
      break;
    case 1544: 
      if (paramString.equals("08")) {
        j = 8;
      }
      break;
    case 1543: 
      if (paramString.equals("07")) {
        j = 7;
      }
      break;
    case 1542: 
      if (paramString.equals("06")) {
        j = 6;
      }
      break;
    case 1541: 
      if (paramString.equals("05")) {
        j = 5;
      }
      break;
    case 1540: 
      if (paramString.equals("04")) {
        j = 4;
      }
      break;
    case 1539: 
      if (paramString.equals("03")) {
        j = 3;
      }
      break;
    case 1538: 
      if (paramString.equals("02")) {
        j = 2;
      }
      break;
    case 1537: 
      if (paramString.equals("01")) {
        j = 1;
      }
      break;
    case 1536: 
      if (paramString.equals("00")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      return null;
    case 10: 
      j = 1024;
    case 9: 
    case 8: 
    case 7: 
    case 6: 
    case 5: 
    case 4: 
      for (;;)
      {
        return Integer.valueOf(j);
        j = 512;
        continue;
        j = 256;
        continue;
        j = 128;
        continue;
        j = 64;
        continue;
        j = 32;
        continue;
        j = 16;
      }
    case 3: 
      return Integer.valueOf(8);
    case 2: 
      return Integer.valueOf(4);
    case 1: 
      return Integer.valueOf(2);
    }
    return Integer.valueOf(1);
  }
  
  public static Pair l(String paramString, String[] paramArrayOfString)
  {
    if (paramArrayOfString.length != 3)
    {
      paramArrayOfString = new StringBuilder();
      paramArrayOfString.append("Ignoring malformed MP4A codec string: ");
      paramArrayOfString.append(paramString);
      o.h("MediaCodecUtil", paramArrayOfString.toString());
      return null;
    }
    try
    {
      if ("audio/mp4a-latm".equals(d0.z.h(Integer.parseInt(paramArrayOfString[1], 16))))
      {
        int i = Q(Integer.parseInt(paramArrayOfString[2]));
        if (i != -1)
        {
          paramArrayOfString = new Pair(Integer.valueOf(i), Integer.valueOf(0));
          return paramArrayOfString;
        }
      }
    }
    catch (NumberFormatException paramArrayOfString)
    {
      paramArrayOfString = new StringBuilder();
      paramArrayOfString.append("Ignoring malformed MP4A codec string: ");
      paramArrayOfString.append(paramString);
      o.h("MediaCodecUtil", paramArrayOfString.toString());
    }
    return null;
  }
  
  public static String m(q paramq)
  {
    if ("audio/eac3-joc".equals(n)) {
      return "audio/eac3";
    }
    if ("video/dolby-vision".equals(n))
    {
      paramq = r(paramq);
      if (paramq != null)
      {
        int i = ((Integer)first).intValue();
        if ((i != 16) && (i != 256))
        {
          if (i == 512) {
            return "video/avc";
          }
          if (i == 1024) {
            return "video/av01";
          }
        }
        else
        {
          return "video/hevc";
        }
      }
    }
    return null;
  }
  
  public static List n(z paramz, q paramq, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramq = m(paramq);
    if (paramq == null) {
      return v.Y();
    }
    return paramz.a(paramq, paramBoolean1, paramBoolean2);
  }
  
  public static Pair o(String paramString, String[] paramArrayOfString, h paramh)
  {
    if (paramArrayOfString.length < 4) {
      paramArrayOfString = new StringBuilder();
    }
    for (;;)
    {
      paramArrayOfString.append("Ignoring malformed AV1 codec string: ");
      paramArrayOfString.append(paramString);
      for (;;)
      {
        paramString = paramArrayOfString.toString();
        label33:
        o.h("MediaCodecUtil", paramString);
        return null;
        int i = 1;
        try
        {
          int j = Integer.parseInt(paramArrayOfString[1]);
          int k = Integer.parseInt(paramArrayOfString[2].substring(0, 2));
          int m = Integer.parseInt(paramArrayOfString[3]);
          if (j != 0)
          {
            paramString = new StringBuilder();
            paramString.append("Unknown AV1 profile: ");
            paramString.append(j);
          }
          for (;;)
          {
            paramString = paramString.toString();
            break label33;
            if ((m != 8) && (m != 10))
            {
              paramArrayOfString = new StringBuilder();
              paramArrayOfString.append("Unknown AV1 bit depth: ");
              paramArrayOfString.append(m);
              break;
            }
            if (m != 8)
            {
              if (paramh != null) {
                if (d == null)
                {
                  i = c;
                  if ((i != 7) && (i != 6)) {}
                }
                else
                {
                  i = 4096;
                  break label195;
                }
              }
              i = 2;
            }
            label195:
            m = f(k);
            if (m != -1) {
              break label234;
            }
            paramString = new StringBuilder();
            paramString.append("Unknown AV1 level: ");
            paramString.append(k);
          }
          label234:
          return new Pair(Integer.valueOf(i), Integer.valueOf(m));
        }
        catch (NumberFormatException paramArrayOfString)
        {
          paramArrayOfString = new StringBuilder();
        }
      }
    }
  }
  
  public static Pair p(String paramString, String[] paramArrayOfString)
  {
    if (paramArrayOfString.length < 2) {
      paramArrayOfString = new StringBuilder();
    }
    for (;;)
    {
      paramArrayOfString.append("Ignoring malformed AVC codec string: ");
      paramArrayOfString.append(paramString);
      for (;;)
      {
        paramString = paramArrayOfString.toString();
        label33:
        o.h("MediaCodecUtil", paramString);
        return null;
        try
        {
          int j;
          if (paramArrayOfString[1].length() == 6)
          {
            i = Integer.parseInt(paramArrayOfString[1].substring(0, 2), 16);
            j = Integer.parseInt(paramArrayOfString[1].substring(4), 16);
          }
          else
          {
            if (paramArrayOfString.length < 3) {
              break label196;
            }
            i = Integer.parseInt(paramArrayOfString[1]);
            j = Integer.parseInt(paramArrayOfString[2]);
          }
          int k = i(i);
          if (k == -1)
          {
            paramString = new StringBuilder();
            paramString.append("Unknown AVC profile: ");
            paramString.append(i);
            paramString = paramString.toString();
            break label33;
          }
          int i = g(j);
          if (i == -1)
          {
            paramArrayOfString = new StringBuilder();
            paramArrayOfString.append("Unknown AVC level: ");
            paramArrayOfString.append(j);
          }
          else
          {
            return new Pair(Integer.valueOf(k), Integer.valueOf(i));
            label196:
            paramArrayOfString = new java/lang/StringBuilder;
            paramArrayOfString.<init>();
            paramArrayOfString.append("Ignoring malformed AVC codec string: ");
            paramArrayOfString.append(paramString);
            o.h("MediaCodecUtil", paramArrayOfString.toString());
            return null;
          }
        }
        catch (NumberFormatException paramArrayOfString)
        {
          paramArrayOfString = new StringBuilder();
        }
      }
    }
  }
  
  public static String q(MediaCodecInfo paramMediaCodecInfo, String paramString1, String paramString2)
  {
    for (String str : paramMediaCodecInfo.getSupportedTypes()) {
      if (str.equalsIgnoreCase(paramString2)) {
        return str;
      }
    }
    if (paramString2.equals("video/dolby-vision"))
    {
      if ("OMX.MS.HEVCDV.Decoder".equals(paramString1)) {
        return "video/hevcdv";
      }
      if (("OMX.RTK.video.decoder".equals(paramString1)) || ("OMX.realtek.video.decoder.tunneled".equals(paramString1))) {
        return "video/dv_hevc";
      }
    }
    else
    {
      if ((paramString2.equals("audio/alac")) && ("OMX.lge.alac.decoder".equals(paramString1))) {
        return "audio/x-lg-alac";
      }
      if ((paramString2.equals("audio/flac")) && ("OMX.lge.flac.decoder".equals(paramString1))) {
        return "audio/x-lg-flac";
      }
      if ((paramString2.equals("audio/ac3")) && ("OMX.lge.ac3.decoder".equals(paramString1))) {
        return "audio/lg-ac3";
      }
    }
    return null;
  }
  
  public static Pair r(q paramq)
  {
    Object localObject1 = j;
    if (localObject1 == null) {
      return null;
    }
    localObject1 = ((String)localObject1).split("\\.");
    if ("video/dolby-vision".equals(n)) {
      return y(j, (String[])localObject1);
    }
    int i = 0;
    Object localObject2 = localObject1[0];
    ((String)localObject2).hashCode();
    switch (((String)localObject2).hashCode())
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
                  i = -1;
                  break;
                } while (!((String)localObject2).equals("vp09"));
                i = 6;
                break;
              } while (!((String)localObject2).equals("mp4a"));
              i = 5;
              break;
            } while (!((String)localObject2).equals("hvc1"));
            i = 4;
            break;
          } while (!((String)localObject2).equals("hev1"));
          i = 3;
          break;
        } while (!((String)localObject2).equals("avc2"));
        i = 2;
        break;
      } while (!((String)localObject2).equals("avc1"));
      i = 1;
      break;
    } while (!((String)localObject2).equals("av01"));
    switch (i)
    {
    default: 
      return null;
    case 6: 
      return A(j, (String[])localObject1);
    case 5: 
      return l(j, (String[])localObject1);
    case 3: 
    case 4: 
      return z(j, (String[])localObject1, A);
    case 1: 
    case 2: 
      return p(j, (String[])localObject1);
    }
    return o(j, (String[])localObject1, A);
  }
  
  public static p s(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramString = t(paramString, paramBoolean1, paramBoolean2);
    if (paramString.isEmpty()) {
      paramString = null;
    } else {
      paramString = (p)paramString.get(0);
    }
    return paramString;
  }
  
  public static List t(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    b localb;
    HashMap localHashMap;
    int i;
    try
    {
      localb = new t0/I$b;
      localb.<init>(paramString, paramBoolean1, paramBoolean2);
      localHashMap = b;
      localObject = (List)localHashMap.get(localb);
      if (localObject != null) {
        return (List)localObject;
      }
      i = M.a;
      if (i >= 21)
      {
        localObject = new t0/I$f;
        ((f)localObject).<init>(paramBoolean1, paramBoolean2);
      }
    }
    finally
    {
      break label255;
    }
    Object localObject = new e(null);
    ArrayList localArrayList = u(localb, (d)localObject);
    localObject = localArrayList;
    if (paramBoolean1)
    {
      localObject = localArrayList;
      if (localArrayList.isEmpty())
      {
        localObject = localArrayList;
        if (21 <= i)
        {
          localObject = localArrayList;
          if (i <= 23)
          {
            localObject = new t0/I$e;
            ((e)localObject).<init>(null);
            localArrayList = u(localb, (d)localObject);
            localObject = localArrayList;
            if (!localArrayList.isEmpty())
            {
              localObject = new java/lang/StringBuilder;
              ((StringBuilder)localObject).<init>();
              ((StringBuilder)localObject).append("MediaCodecList API didn't list secure decoder for: ");
              ((StringBuilder)localObject).append(paramString);
              ((StringBuilder)localObject).append(". Assuming: ");
              ((StringBuilder)localObject).append(get0a);
              o.h("MediaCodecUtil", ((StringBuilder)localObject).toString());
              localObject = localArrayList;
            }
          }
        }
      }
    }
    e(paramString, (List)localObject);
    paramString = v.U((Collection)localObject);
    localHashMap.put(localb, paramString);
    return paramString;
    label255:
    throw paramString;
  }
  
  /* Error */
  public static ArrayList u(b paramb, d paramd)
  {
    // Byte code:
    //   0: new 667	java/util/ArrayList
    //   3: astore_2
    //   4: aload_2
    //   5: invokespecial 686	java/util/ArrayList:<init>	()V
    //   8: aload_0
    //   9: getfield 687	t0/I$b:a	Ljava/lang/String;
    //   12: astore_3
    //   13: aload_1
    //   14: invokeinterface 689 1 0
    //   19: istore 4
    //   21: aload_1
    //   22: invokeinterface 691 1 0
    //   27: istore 5
    //   29: iconst_0
    //   30: istore 6
    //   32: aload_0
    //   33: astore 7
    //   35: iload 6
    //   37: iload 4
    //   39: if_icmpge +535 -> 574
    //   42: aload_1
    //   43: iload 6
    //   45: invokeinterface 694 2 0
    //   50: astore 8
    //   52: aload 8
    //   54: invokestatic 696	t0/I:C	(Landroid/media/MediaCodecInfo;)Z
    //   57: ifeq +6 -> 63
    //   60: goto +446 -> 506
    //   63: aload 8
    //   65: invokevirtual 287	android/media/MediaCodecInfo:getName	()Ljava/lang/String;
    //   68: astore 9
    //   70: aload 8
    //   72: aload 9
    //   74: iload 5
    //   76: aload_3
    //   77: invokestatic 698	t0/I:E	(Landroid/media/MediaCodecInfo;Ljava/lang/String;ZLjava/lang/String;)Z
    //   80: ifne +6 -> 86
    //   83: goto -23 -> 60
    //   86: aload 8
    //   88: aload 9
    //   90: aload_3
    //   91: invokestatic 700	t0/I:q	(Landroid/media/MediaCodecInfo;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   94: astore 10
    //   96: aload 10
    //   98: ifnonnull +6 -> 104
    //   101: goto -41 -> 60
    //   104: aload 8
    //   106: aload 10
    //   108: invokevirtual 704	android/media/MediaCodecInfo:getCapabilitiesForType	(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;
    //   111: astore 11
    //   113: aload_1
    //   114: ldc_w 706
    //   117: aload 10
    //   119: aload 11
    //   121: invokeinterface 709 4 0
    //   126: istore 12
    //   128: aload_1
    //   129: ldc_w 706
    //   132: aload 10
    //   134: aload 11
    //   136: invokeinterface 711 4 0
    //   141: istore 13
    //   143: aload 7
    //   145: getfield 714	t0/I$b:c	Z
    //   148: istore 14
    //   150: iload 14
    //   152: ifne +8 -> 160
    //   155: iload 13
    //   157: ifne -97 -> 60
    //   160: iload 14
    //   162: ifeq +11 -> 173
    //   165: iload 12
    //   167: ifne +6 -> 173
    //   170: goto -110 -> 60
    //   173: aload_1
    //   174: ldc_w 716
    //   177: aload 10
    //   179: aload 11
    //   181: invokeinterface 709 4 0
    //   186: istore 14
    //   188: aload_1
    //   189: ldc_w 716
    //   192: aload 10
    //   194: aload 11
    //   196: invokeinterface 711 4 0
    //   201: istore 13
    //   203: aload 7
    //   205: getfield 718	t0/I$b:b	Z
    //   208: istore 12
    //   210: iload 12
    //   212: ifne +8 -> 220
    //   215: iload 13
    //   217: ifne -157 -> 60
    //   220: iload 12
    //   222: ifeq +11 -> 233
    //   225: iload 14
    //   227: ifne +6 -> 233
    //   230: goto -170 -> 60
    //   233: aload 8
    //   235: aload_3
    //   236: invokestatic 720	t0/I:F	(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z
    //   239: istore 12
    //   241: aload 8
    //   243: aload_3
    //   244: invokestatic 274	t0/I:H	(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z
    //   247: istore 15
    //   249: aload 8
    //   251: invokestatic 722	t0/I:J	(Landroid/media/MediaCodecInfo;)Z
    //   254: istore 13
    //   256: iload 5
    //   258: ifeq +37 -> 295
    //   261: aload 7
    //   263: getfield 718	t0/I$b:b	Z
    //   266: istore 16
    //   268: iload 16
    //   270: iload 14
    //   272: if_icmpeq +40 -> 312
    //   275: goto +20 -> 295
    //   278: astore 7
    //   280: aload 9
    //   282: astore 11
    //   284: aload 7
    //   286: astore 9
    //   288: aload 11
    //   290: astore 7
    //   292: goto +149 -> 441
    //   295: iload 5
    //   297: ifne +58 -> 355
    //   300: aload 7
    //   302: getfield 718	t0/I$b:b	Z
    //   305: istore 16
    //   307: iload 16
    //   309: ifne +46 -> 355
    //   312: aload_2
    //   313: aload 9
    //   315: aload_3
    //   316: aload 10
    //   318: aload 11
    //   320: iload 12
    //   322: iload 15
    //   324: iload 13
    //   326: iconst_0
    //   327: iconst_0
    //   328: invokestatic 416	t0/p:C	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZZ)Lt0/p;
    //   331: invokevirtual 723	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   334: pop
    //   335: goto +171 -> 506
    //   338: astore 7
    //   340: aload 9
    //   342: astore 11
    //   344: aload 7
    //   346: astore 9
    //   348: aload 11
    //   350: astore 7
    //   352: goto +89 -> 441
    //   355: aload 9
    //   357: astore 7
    //   359: goto +8 -> 367
    //   362: astore 7
    //   364: goto -24 -> 340
    //   367: iload 5
    //   369: ifne +137 -> 506
    //   372: iload 14
    //   374: ifeq +132 -> 506
    //   377: new 56	java/lang/StringBuilder
    //   380: dup
    //   381: invokespecial 57	java/lang/StringBuilder:<init>	()V
    //   384: astore 8
    //   386: aload 8
    //   388: aload 7
    //   390: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   393: pop
    //   394: aload 8
    //   396: ldc -54
    //   398: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   401: pop
    //   402: aload 8
    //   404: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   407: astore 9
    //   409: aload_2
    //   410: aload 9
    //   412: aload_3
    //   413: aload 10
    //   415: aload 11
    //   417: iload 12
    //   419: iload 15
    //   421: iload 13
    //   423: iconst_0
    //   424: iconst_1
    //   425: invokestatic 416	t0/p:C	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZZ)Lt0/p;
    //   428: invokevirtual 723	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   431: pop
    //   432: aload_2
    //   433: areturn
    //   434: astore 9
    //   436: goto +5 -> 441
    //   439: astore 9
    //   441: getstatic 185	g0/M:a	I
    //   444: istore 17
    //   446: iload 17
    //   448: bipush 23
    //   450: if_icmpgt +66 -> 516
    //   453: aload_2
    //   454: invokevirtual 668	java/util/ArrayList:isEmpty	()Z
    //   457: ifne +59 -> 516
    //   460: new 56	java/lang/StringBuilder
    //   463: astore 9
    //   465: aload 9
    //   467: invokespecial 57	java/lang/StringBuilder:<init>	()V
    //   470: aload 9
    //   472: ldc_w 725
    //   475: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   478: pop
    //   479: aload 9
    //   481: aload 7
    //   483: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   486: pop
    //   487: aload 9
    //   489: ldc_w 727
    //   492: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   495: pop
    //   496: ldc 69
    //   498: aload 9
    //   500: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   503: invokestatic 729	g0/o:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   506: iinc 6 1
    //   509: goto -477 -> 32
    //   512: astore_0
    //   513: goto +63 -> 576
    //   516: new 56	java/lang/StringBuilder
    //   519: astore_0
    //   520: aload_0
    //   521: invokespecial 57	java/lang/StringBuilder:<init>	()V
    //   524: aload_0
    //   525: ldc_w 731
    //   528: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   531: pop
    //   532: aload_0
    //   533: aload 7
    //   535: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   538: pop
    //   539: aload_0
    //   540: ldc_w 733
    //   543: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   546: pop
    //   547: aload_0
    //   548: aload 10
    //   550: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   553: pop
    //   554: aload_0
    //   555: ldc_w 735
    //   558: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   561: pop
    //   562: ldc 69
    //   564: aload_0
    //   565: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   568: invokestatic 729	g0/o:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   571: aload 9
    //   573: athrow
    //   574: aload_2
    //   575: areturn
    //   576: new 11	t0/I$c
    //   579: dup
    //   580: aload_0
    //   581: aconst_null
    //   582: invokespecial 738	t0/I$c:<init>	(Ljava/lang/Throwable;Lt0/I$a;)V
    //   585: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	586	0	paramb	b
    //   0	586	1	paramd	d
    //   3	572	2	localArrayList	ArrayList
    //   12	401	3	str1	String
    //   19	21	4	i	int
    //   27	341	5	bool1	boolean
    //   30	477	6	j	int
    //   33	229	7	localb	b
    //   278	7	7	localException1	Exception
    //   290	11	7	localObject1	Object
    //   338	7	7	localException2	Exception
    //   350	8	7	localObject2	Object
    //   362	172	7	localException3	Exception
    //   50	353	8	localObject3	Object
    //   68	343	9	localObject4	Object
    //   434	1	9	localException4	Exception
    //   439	1	9	localException5	Exception
    //   463	109	9	localStringBuilder	StringBuilder
    //   94	455	10	str2	String
    //   111	305	11	localObject5	Object
    //   126	292	12	bool2	boolean
    //   141	281	13	bool3	boolean
    //   148	225	14	bool4	boolean
    //   247	173	15	bool5	boolean
    //   266	42	16	bool6	boolean
    //   444	7	17	k	int
    // Exception table:
    //   from	to	target	type
    //   104	150	278	java/lang/Exception
    //   173	210	278	java/lang/Exception
    //   233	256	278	java/lang/Exception
    //   261	268	278	java/lang/Exception
    //   312	335	338	java/lang/Exception
    //   377	386	338	java/lang/Exception
    //   300	307	362	java/lang/Exception
    //   409	432	434	java/lang/Exception
    //   386	409	439	java/lang/Exception
    //   0	29	512	java/lang/Exception
    //   42	60	512	java/lang/Exception
    //   63	83	512	java/lang/Exception
    //   86	96	512	java/lang/Exception
    //   441	446	512	java/lang/Exception
    //   453	506	512	java/lang/Exception
    //   516	574	512	java/lang/Exception
  }
  
  public static List v(z paramz, q paramq, boolean paramBoolean1, boolean paramBoolean2)
  {
    List localList = paramz.a(n, paramBoolean1, paramBoolean2);
    paramz = n(paramz, paramq, paramBoolean1, paramBoolean2);
    return v.M().j(localList).j(paramz).k();
  }
  
  public static List w(List paramList, q paramq)
  {
    paramList = new ArrayList(paramList);
    R(paramList, new G(paramq));
    return paramList;
  }
  
  public static p x()
  {
    return s("audio/raw", false, false);
  }
  
  public static Pair y(String paramString, String[] paramArrayOfString)
  {
    if (paramArrayOfString.length < 3) {}
    for (paramArrayOfString = new StringBuilder();; paramArrayOfString = new StringBuilder())
    {
      paramArrayOfString.append("Ignoring malformed Dolby Vision codec string: ");
      localObject = paramString;
      paramArrayOfString.append((String)localObject);
      o.h("MediaCodecUtil", paramArrayOfString.toString());
      return null;
      localObject = a.matcher(paramArrayOfString[1]);
      if (((Matcher)localObject).matches()) {
        break;
      }
    }
    Object localObject = ((Matcher)localObject).group(1);
    paramString = k((String)localObject);
    String str;
    if (paramString == null)
    {
      paramString = new StringBuilder();
      str = "Unknown Dolby Vision profile string: ";
      paramArrayOfString = (String[])localObject;
    }
    for (localObject = str;; localObject = "Unknown Dolby Vision level string: ")
    {
      paramString.append((String)localObject);
      localObject = paramArrayOfString;
      paramArrayOfString = paramString;
      break;
      paramArrayOfString = paramArrayOfString[2];
      localObject = j(paramArrayOfString);
      if (localObject != null) {
        break label141;
      }
      paramString = new StringBuilder();
    }
    label141:
    return new Pair(paramString, localObject);
  }
  
  public static Pair z(String paramString, String[] paramArrayOfString, h paramh)
  {
    if (paramArrayOfString.length < 4) {}
    Object localObject;
    int i;
    for (paramArrayOfString = new StringBuilder();; paramArrayOfString = new StringBuilder())
    {
      paramArrayOfString.append("Ignoring malformed HEVC codec string: ");
      paramh = paramString;
      paramArrayOfString.append(paramh);
      o.h("MediaCodecUtil", paramArrayOfString.toString());
      return null;
      localObject = a;
      i = 1;
      localObject = ((Pattern)localObject).matcher(paramArrayOfString[1]);
      if (((Matcher)localObject).matches()) {
        break;
      }
    }
    paramString = ((Matcher)localObject).group(1);
    if (!"1".equals(paramString))
    {
      if (!"2".equals(paramString)) {
        break label179;
      }
      if ((paramh != null) && (c == 6)) {
        i = 4096;
      } else {
        i = 2;
      }
    }
    paramArrayOfString = paramArrayOfString[3];
    paramString = B(paramArrayOfString);
    if (paramString == null)
    {
      paramString = new StringBuilder();
      paramh = "Unknown HEVC level string: ";
    }
    for (;;)
    {
      paramString.append(paramh);
      paramh = paramArrayOfString;
      paramArrayOfString = paramString;
      break;
      return new Pair(Integer.valueOf(i), paramString);
      label179:
      localObject = new StringBuilder();
      paramh = "Unknown HEVC profile string: ";
      paramArrayOfString = paramString;
      paramString = (String)localObject;
    }
  }
  
  public static final class b
  {
    public final String a;
    public final boolean b;
    public final boolean c;
    
    public b(String paramString, boolean paramBoolean1, boolean paramBoolean2)
    {
      a = paramString;
      b = paramBoolean1;
      c = paramBoolean2;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (paramObject.getClass() == b.class))
      {
        paramObject = (b)paramObject;
        if ((!TextUtils.equals(a, a)) || (b != b) || (c != c)) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public int hashCode()
    {
      int i = a.hashCode();
      boolean bool = b;
      int j = 1237;
      int k;
      if (bool) {
        k = 1231;
      } else {
        k = 1237;
      }
      if (c) {
        j = 1231;
      }
      return ((i + 31) * 31 + k) * 31 + j;
    }
  }
  
  public static class c
    extends Exception
  {
    public c(Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }
  
  public static abstract interface d
  {
    public abstract MediaCodecInfo a(int paramInt);
    
    public abstract boolean b(String paramString1, String paramString2, MediaCodecInfo.CodecCapabilities paramCodecCapabilities);
    
    public abstract int c();
    
    public abstract boolean d(String paramString1, String paramString2, MediaCodecInfo.CodecCapabilities paramCodecCapabilities);
    
    public abstract boolean e();
  }
  
  public static final class e
    implements I.d
  {
    public MediaCodecInfo a(int paramInt)
    {
      return MediaCodecList.getCodecInfoAt(paramInt);
    }
    
    public boolean b(String paramString1, String paramString2, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
    {
      return false;
    }
    
    public int c()
    {
      return MediaCodecList.getCodecCount();
    }
    
    public boolean d(String paramString1, String paramString2, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
    {
      boolean bool;
      if (("secure-playback".equals(paramString1)) && ("video/avc".equals(paramString2))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean e()
    {
      return false;
    }
  }
  
  public static final class f
    implements I.d
  {
    public final int a;
    public MediaCodecInfo[] b;
    
    public f(boolean paramBoolean1, boolean paramBoolean2)
    {
      int i;
      if ((!paramBoolean1) && (!paramBoolean2)) {
        i = 0;
      } else {
        i = 1;
      }
      a = i;
    }
    
    public MediaCodecInfo a(int paramInt)
    {
      f();
      return b[paramInt];
    }
    
    public boolean b(String paramString1, String paramString2, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
    {
      return paramCodecCapabilities.isFeatureRequired(paramString1);
    }
    
    public int c()
    {
      f();
      return b.length;
    }
    
    public boolean d(String paramString1, String paramString2, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
    {
      return paramCodecCapabilities.isFeatureSupported(paramString1);
    }
    
    public boolean e()
    {
      return true;
    }
    
    public final void f()
    {
      if (b == null) {
        b = new MediaCodecList(a).getCodecInfos();
      }
    }
  }
  
  public static abstract interface g
  {
    public abstract int a(Object paramObject);
  }
}

/* Location:
 * Qualified Name:     t0.I
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */