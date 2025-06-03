package o4;

import a0.j;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import e0.e;
import f;
import g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o7.t;
import v3.i0;
import v5.e0;
import v5.m;

public final class p
{
  public static final Pattern a = Pattern.compile("^\\D?(\\d+)$");
  public static final HashMap<a, List<l>> b = new HashMap();
  public static int c = -1;
  
  public static void a(String paramString, ArrayList paramArrayList)
  {
    if ("audio/raw".equals(paramString))
    {
      if ((e0.a < 26) && (e0.b.equals("R9")) && (paramArrayList.size() == 1) && (get0a.equals("OMX.MTK.AUDIO.DECODER.RAW"))) {
        paramArrayList.add(l.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
      }
      Collections.sort(paramArrayList, new o(new e(13), 0));
    }
    int i = e0.a;
    if ((i < 21) && (paramArrayList.size() > 1))
    {
      paramString = get0a;
      if (("OMX.SEC.mp3.dec".equals(paramString)) || ("OMX.SEC.MP3.Decoder".equals(paramString)) || ("OMX.brcm.audio.mp3.decoder".equals(paramString))) {
        Collections.sort(paramArrayList, new o(new w3.v(8), 0));
      }
    }
    if ((i < 32) && (paramArrayList.size() > 1) && ("OMX.qti.audio.decoder.flac".equals(get0a))) {
      paramArrayList.add((l)paramArrayList.remove(0));
    }
  }
  
  public static String b(i0 parami0)
  {
    if ("audio/eac3-joc".equals(t)) {
      return "audio/eac3";
    }
    if ("video/dolby-vision".equals(t))
    {
      parami0 = d(parami0);
      if (parami0 != null)
      {
        int i = ((Integer)first).intValue();
        if ((i != 16) && (i != 256))
        {
          if (i == 512) {
            return "video/avc";
          }
        }
        else {
          return "video/hevc";
        }
      }
    }
    return null;
  }
  
  public static String c(MediaCodecInfo paramMediaCodecInfo, String paramString1, String paramString2)
  {
    for (paramMediaCodecInfo : paramMediaCodecInfo.getSupportedTypes()) {
      if (paramMediaCodecInfo.equalsIgnoreCase(paramString2)) {
        return paramMediaCodecInfo;
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
  
  public static Pair<Integer, Integer> d(i0 parami0)
  {
    Object localObject1 = q;
    Object localObject2 = null;
    String str = null;
    Object localObject3 = null;
    if (localObject1 == null) {
      return null;
    }
    localObject1 = ((String)localObject1).split("\\.");
    boolean bool = "video/dolby-vision".equals(t);
    int i = 16;
    int j = 6;
    int k = 2;
    if (bool)
    {
      parami0 = q;
      if (localObject1.length < 3)
      {
        localObject2 = new StringBuilder();
      }
      else
      {
        localObject2 = a.matcher(localObject1[1]);
        if (((Matcher)localObject2).matches()) {
          break label105;
        }
        localObject2 = new StringBuilder();
      }
      str = "Ignoring malformed Dolby Vision codec string: ";
      break label1105;
      label105:
      localObject2 = ((Matcher)localObject2).group(1);
      if (localObject2 != null)
      {
        ((String)localObject2).hashCode();
        m = -1;
        switch (((String)localObject2).hashCode())
        {
        default: 
          break;
        case 1545: 
          if (((String)localObject2).equals("09")) {
            m = 9;
          }
          break;
        case 1544: 
          if (((String)localObject2).equals("08")) {
            m = 8;
          }
          break;
        case 1543: 
          if (((String)localObject2).equals("07")) {
            m = 7;
          }
          break;
        case 1542: 
          if (((String)localObject2).equals("06")) {
            m = 6;
          }
          break;
        case 1541: 
          if (((String)localObject2).equals("05")) {
            m = 5;
          }
          break;
        case 1540: 
          if (((String)localObject2).equals("04")) {
            m = 4;
          }
          break;
        case 1539: 
          if (((String)localObject2).equals("03")) {
            m = 3;
          }
          break;
        case 1538: 
          if (((String)localObject2).equals("02")) {
            m = 2;
          }
          break;
        case 1537: 
          if (((String)localObject2).equals("01")) {
            m = 1;
          }
          break;
        case 1536: 
          if (((String)localObject2).equals("00")) {
            m = 0;
          }
          break;
        }
      }
      switch (m)
      {
      default: 
        parami0 = null;
        break;
      case 9: 
        m = 512;
        break;
      case 8: 
        m = 256;
        break;
      case 7: 
        m = 128;
        break;
      case 6: 
        m = 64;
        break;
      case 5: 
        m = 32;
        break;
      case 4: 
        m = 16;
        parami0 = Integer.valueOf(m);
        break;
      case 3: 
        parami0 = Integer.valueOf(8);
        break;
      case 2: 
        parami0 = Integer.valueOf(4);
        break;
      case 1: 
        parami0 = Integer.valueOf(2);
        break;
      }
      parami0 = Integer.valueOf(1);
      if (parami0 == null)
      {
        localObject1 = new StringBuilder();
        str = "Unknown Dolby Vision profile string: ";
        parami0 = (i0)localObject2;
        localObject2 = localObject1;
      }
      else
      {
        localObject1 = localObject1[2];
        if (localObject1 != null)
        {
          ((String)localObject1).hashCode();
          m = -1;
          switch (((String)localObject1).hashCode())
          {
          default: 
            break;
          case 1570: 
            if (((String)localObject1).equals("13")) {
              m = 12;
            }
            break;
          case 1569: 
            if (((String)localObject1).equals("12")) {
              m = 11;
            }
            break;
          case 1568: 
            if (((String)localObject1).equals("11")) {
              m = 10;
            }
            break;
          case 1567: 
            if (((String)localObject1).equals("10")) {
              m = 9;
            }
            break;
          case 1545: 
            if (((String)localObject1).equals("09")) {
              m = 8;
            }
            break;
          case 1544: 
            if (((String)localObject1).equals("08")) {
              m = 7;
            }
            break;
          case 1543: 
            if (((String)localObject1).equals("07")) {
              m = 6;
            }
            break;
          case 1542: 
            if (((String)localObject1).equals("06")) {
              m = 5;
            }
            break;
          case 1541: 
            if (((String)localObject1).equals("05")) {
              m = 4;
            }
            break;
          case 1540: 
            if (((String)localObject1).equals("04")) {
              m = 3;
            }
            break;
          case 1539: 
            if (((String)localObject1).equals("03")) {
              m = 2;
            }
            break;
          case 1538: 
            if (((String)localObject1).equals("02")) {
              m = 1;
            }
            break;
          case 1537: 
            if (((String)localObject1).equals("01")) {
              m = 0;
            }
            break;
          }
          j = i;
        }
        switch (m)
        {
        default: 
          localObject2 = null;
          break;
        case 12: 
          j = 4096;
          break;
        case 11: 
          j = 2048;
          break;
        case 10: 
          j = 1024;
          break;
        case 9: 
          j = 512;
          break;
        case 8: 
          j = 256;
          break;
        case 7: 
          j = 128;
          break;
        case 6: 
          j = 64;
          break;
        case 5: 
          j = 32;
        case 4: 
          localObject2 = Integer.valueOf(j);
          break;
        case 3: 
          localObject2 = Integer.valueOf(8);
          break;
        case 2: 
          localObject2 = Integer.valueOf(4);
          break;
        case 1: 
          localObject2 = Integer.valueOf(2);
          break;
        }
        localObject2 = Integer.valueOf(1);
        if (localObject2 != null) {
          break label1133;
        }
        localObject2 = new StringBuilder();
        str = "Unknown Dolby Vision level string: ";
        parami0 = (i0)localObject1;
      }
      label1105:
      ((StringBuilder)localObject2).append(str);
      ((StringBuilder)localObject2).append(parami0);
      m.f("MediaCodecUtil", ((StringBuilder)localObject2).toString());
      parami0 = (i0)localObject3;
      break label1143;
      label1133:
      parami0 = new Pair(parami0, localObject2);
      label1143:
      return parami0;
    }
    localObject3 = localObject1[0];
    localObject3.getClass();
    ((String)localObject3).hashCode();
    switch (((String)localObject3).hashCode())
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
                  m = -1;
                  break;
                } while (!((String)localObject3).equals("vp09"));
                m = 6;
                break;
              } while (!((String)localObject3).equals("mp4a"));
              m = 5;
              break;
            } while (!((String)localObject3).equals("hvc1"));
            m = 4;
            break;
          } while (!((String)localObject3).equals("hev1"));
          m = 3;
          break;
        } while (!((String)localObject3).equals("avc2"));
        m = 2;
        break;
      } while (!((String)localObject3).equals("avc1"));
      m = 1;
      break;
    } while (!((String)localObject3).equals("av01"));
    int m = 0;
    int n;
    switch (m)
    {
    default: 
      return null;
    case 6: 
      str = q;
      if (localObject1.length < 3) {
        parami0 = new StringBuilder();
      } else {
        try
        {
          m = Integer.parseInt(localObject1[1]);
          n = Integer.parseInt(localObject1[2]);
          if (m != 0)
          {
            if (m != 1)
            {
              if (m != 2)
              {
                if (m != 3) {
                  j = -1;
                } else {
                  j = 8;
                }
              }
              else {
                j = 4;
              }
            }
            else {
              j = 2;
            }
          }
          else {
            j = 1;
          }
          if (j == -1)
          {
            parami0 = f.h("Unknown VP9 profile: ", m);
            break label1803;
          }
          if (n != 10)
          {
            if (n != 11)
            {
              if (n != 20)
              {
                if (n != 21)
                {
                  m = i;
                  if (n != 30) {
                    if (n != 31)
                    {
                      if (n != 40)
                      {
                        if (n != 41)
                        {
                          if (n != 50)
                          {
                            if (n != 51) {
                              switch (n)
                              {
                              default: 
                                m = -1;
                                break;
                              case 62: 
                                m = 8192;
                                break;
                              case 61: 
                                m = 4096;
                                break;
                              case 60: 
                                m = 2048;
                                break;
                              }
                            } else {
                              m = 512;
                            }
                          }
                          else {
                            m = 256;
                          }
                        }
                        else {
                          m = 128;
                        }
                      }
                      else {
                        m = 64;
                      }
                    }
                    else {
                      m = 32;
                    }
                  }
                }
                else
                {
                  m = 8;
                }
              }
              else {
                m = 4;
              }
            }
            else {
              m = 2;
            }
          }
          else {
            m = 1;
          }
          if (m == -1)
          {
            parami0 = new StringBuilder();
            parami0.append("Unknown VP9 level: ");
            parami0.append(n);
            break label1798;
          }
          parami0 = new Pair(Integer.valueOf(j), Integer.valueOf(m));
        }
        catch (NumberFormatException parami0)
        {
          parami0 = new StringBuilder();
        }
      }
      parami0.append("Ignoring malformed VP9 codec string: ");
      parami0.append(str);
      parami0 = parami0.toString();
      m.f("MediaCodecUtil", parami0);
      parami0 = (i0)localObject2;
      return parami0;
    case 5: 
      localObject2 = q;
      if (localObject1.length != 3)
      {
        parami0 = new StringBuilder();
      }
      else
      {
        parami0 = str;
        try
        {
          if (!"audio/mp4a-latm".equals(v5.p.f(Integer.parseInt(localObject1[1], 16)))) {
            break label2075;
          }
          i = Integer.parseInt(localObject1[2]);
          m = 17;
          if (i != 17)
          {
            m = 20;
            if (i != 20)
            {
              m = 23;
              if (i != 23)
              {
                m = 29;
                if (i != 29)
                {
                  m = 39;
                  if (i != 39)
                  {
                    m = 42;
                    if (i != 42)
                    {
                      m = j;
                      switch (i)
                      {
                      default: 
                        m = -1;
                        break;
                      case 5: 
                        m = 5;
                        break;
                      case 4: 
                        m = 4;
                        break;
                      case 3: 
                        m = 3;
                        break;
                      case 2: 
                        m = 2;
                        break;
                      case 1: 
                        m = 1;
                        break;
                      }
                    }
                  }
                }
              }
            }
          }
          parami0 = str;
          if (m == -1) {
            break label2075;
          }
          parami0 = new Pair(Integer.valueOf(m), Integer.valueOf(0));
        }
        catch (NumberFormatException parami0)
        {
          parami0 = new StringBuilder();
        }
      }
      parami0.append("Ignoring malformed MP4A codec string: ");
      parami0.append((String)localObject2);
      m.f("MediaCodecUtil", parami0.toString());
      parami0 = str;
      return parami0;
    case 3: 
    case 4: 
      str = q;
      parami0 = F;
      if (localObject1.length < 4)
      {
        parami0 = new StringBuilder();
      }
      else
      {
        localObject2 = a.matcher(localObject1[1]);
        if (((Matcher)localObject2).matches()) {
          break label2136;
        }
        parami0 = new StringBuilder();
      }
      localObject2 = "Ignoring malformed HEVC codec string: ";
      break label3323;
      str = ((Matcher)localObject2).group(1);
      if ("1".equals(str))
      {
        n = 1;
      }
      else
      {
        if (!"2".equals(str)) {
          break label3311;
        }
        if ((parami0 != null) && (c == 6)) {
          n = 4096;
        } else {
          n = 2;
        }
      }
      localObject2 = localObject1[3];
      if (localObject2 != null)
      {
        ((String)localObject2).hashCode();
        m = -1;
        switch (((String)localObject2).hashCode())
        {
        default: 
          break;
        case 2312995: 
          if (((String)localObject2).equals("L186")) {
            m = 25;
          }
          break;
        case 2312992: 
          if (((String)localObject2).equals("L183")) {
            m = 24;
          }
          break;
        case 2312989: 
          if (((String)localObject2).equals("L180")) {
            m = 23;
          }
          break;
        case 2312902: 
          if (((String)localObject2).equals("L156")) {
            m = 22;
          }
          break;
        case 2312899: 
          if (((String)localObject2).equals("L153")) {
            m = 21;
          }
          break;
        case 2312896: 
          if (((String)localObject2).equals("L150")) {
            m = 20;
          }
          break;
        case 2312806: 
          if (((String)localObject2).equals("L123")) {
            m = 19;
          }
          break;
        case 2312803: 
          if (((String)localObject2).equals("L120")) {
            m = 18;
          }
          break;
        case 2193831: 
          if (((String)localObject2).equals("H186")) {
            m = 17;
          }
          break;
        case 2193828: 
          if (((String)localObject2).equals("H183")) {
            m = 16;
          }
          break;
        case 2193825: 
          if (((String)localObject2).equals("H180")) {
            m = 15;
          }
          break;
        case 2193738: 
          if (((String)localObject2).equals("H156")) {
            m = 14;
          }
          break;
        case 2193735: 
          if (((String)localObject2).equals("H153")) {
            m = 13;
          }
          break;
        case 2193732: 
          if (((String)localObject2).equals("H150")) {
            m = 12;
          }
          break;
        case 2193642: 
          if (((String)localObject2).equals("H123")) {
            m = 11;
          }
          break;
        case 2193639: 
          if (((String)localObject2).equals("H120")) {
            m = 10;
          }
          break;
        case 74854: 
          if (((String)localObject2).equals("L93")) {
            m = 9;
          }
          break;
        case 74851: 
          if (((String)localObject2).equals("L90")) {
            m = 8;
          }
          break;
        case 74761: 
          if (((String)localObject2).equals("L63")) {
            m = 7;
          }
          break;
        case 74758: 
          if (((String)localObject2).equals("L60")) {
            m = 6;
          }
          break;
        case 74665: 
          if (((String)localObject2).equals("L30")) {
            m = 5;
          }
          break;
        case 71010: 
          if (((String)localObject2).equals("H93")) {
            m = 4;
          }
          break;
        case 71007: 
          if (((String)localObject2).equals("H90")) {
            m = 3;
          }
          break;
        case 70917: 
          if (((String)localObject2).equals("H63")) {
            m = 2;
          }
          break;
        case 70914: 
          if (((String)localObject2).equals("H60")) {
            m = 1;
          }
          break;
        case 70821: 
          if (((String)localObject2).equals("H30")) {
            m = 0;
          }
          break;
        }
        j = i;
      }
      switch (m)
      {
      default: 
        parami0 = null;
        break;
      case 25: 
        j = 16777216;
        break;
      case 24: 
        j = 4194304;
        break;
      case 23: 
        j = 1048576;
        break;
      case 22: 
        j = 262144;
        break;
      case 21: 
        j = 65536;
        break;
      case 20: 
        j = 16384;
        break;
      case 19: 
        j = 4096;
        break;
      case 18: 
        j = 1024;
        break;
      case 17: 
        j = 33554432;
        break;
      case 16: 
        j = 8388608;
        break;
      case 15: 
        j = 2097152;
        break;
      case 14: 
        j = 524288;
        break;
      case 13: 
        j = 131072;
        break;
      case 12: 
        j = 32768;
        break;
      case 11: 
        j = 8192;
        break;
      case 10: 
        j = 2048;
        break;
      case 9: 
        j = 256;
        break;
      case 8: 
        j = 64;
        break;
      case 6: 
        parami0 = Integer.valueOf(4);
        break;
      case 5: 
        parami0 = Integer.valueOf(1);
        break;
      case 4: 
        j = 512;
        break;
      case 3: 
        j = 128;
        break;
      case 2: 
        j = 32;
      case 7: 
        parami0 = Integer.valueOf(j);
        break;
      case 1: 
        parami0 = Integer.valueOf(8);
        break;
      }
      parami0 = Integer.valueOf(2);
      if (parami0 == null)
      {
        parami0 = g.g("Unknown HEVC level string: ", (String)localObject2);
      }
      else
      {
        parami0 = new Pair(Integer.valueOf(n), parami0);
        break label3347;
        parami0 = new StringBuilder();
        localObject2 = "Unknown HEVC profile string: ";
        parami0.append((String)localObject2);
        parami0.append(str);
      }
      m.f("MediaCodecUtil", parami0.toString());
      parami0 = null;
      return parami0;
    case 1: 
    case 2: 
      label1798:
      label1803:
      label2075:
      label2136:
      label3311:
      label3323:
      label3347:
      localObject2 = q;
      if (localObject1.length < 2) {
        parami0 = new StringBuilder();
      } else {
        try
        {
          if (localObject1[1].length() == 6)
          {
            m = Integer.parseInt(localObject1[1].substring(0, 2), 16);
            n = Integer.parseInt(localObject1[1].substring(4), 16);
          }
          else
          {
            if (localObject1.length < 3) {
              break label3869;
            }
            m = Integer.parseInt(localObject1[1]);
            n = Integer.parseInt(localObject1[2]);
          }
          if (m != 66)
          {
            j = k;
            if (m != 77) {
              if (m != 88)
              {
                if (m != 100)
                {
                  if (m != 110)
                  {
                    if (m != 122)
                    {
                      if (m != 244) {
                        j = -1;
                      } else {
                        j = 64;
                      }
                    }
                    else {
                      j = 32;
                    }
                  }
                  else {
                    j = 16;
                  }
                }
                else {
                  j = 8;
                }
              }
              else {
                j = 4;
              }
            }
          }
          else
          {
            j = 1;
          }
          if (j == -1)
          {
            parami0 = f.h("Unknown AVC profile: ", m);
            break label3932;
          }
          m = i;
          switch (n)
          {
          default: 
            switch (n)
            {
            default: 
              switch (n)
              {
              default: 
                switch (n)
                {
                default: 
                  switch (n)
                  {
                  default: 
                    m = -1;
                  }
                  break;
                }
                break;
              }
              break;
            }
            break;
          case 12: 
            m = 8;
            break;
          case 11: 
            m = 4;
            break;
          case 10: 
            m = 1;
            break;
            m = 128;
            break;
            m = 64;
            break;
            m = 32;
            break;
            m = 1024;
            break;
            m = 512;
            break;
            m = 256;
            break;
            m = 8192;
            break;
            m = 4096;
            break;
            m = 2048;
            break;
            m = 65536;
            break;
            m = 32768;
            break;
            m = 16384;
          }
          if (m == -1)
          {
            parami0 = new StringBuilder();
            parami0.append("Unknown AVC level: ");
            parami0.append(n);
            break label3927;
          }
          parami0 = new Pair(Integer.valueOf(j), Integer.valueOf(m));
          break label3941;
          label3869:
          parami0 = new java/lang/StringBuilder;
          parami0.<init>();
          parami0.append("Ignoring malformed AVC codec string: ");
          parami0.append((String)localObject2);
          m.f("MediaCodecUtil", parami0.toString());
        }
        catch (NumberFormatException parami0)
        {
          parami0 = new StringBuilder();
        }
      }
      parami0.append("Ignoring malformed AVC codec string: ");
      parami0.append((String)localObject2);
      label3927:
      parami0 = parami0.toString();
      label3932:
      m.f("MediaCodecUtil", parami0);
      parami0 = null;
      label3941:
      return parami0;
    }
    localObject2 = q;
    parami0 = F;
    if (localObject1.length < 4) {
      parami0 = new StringBuilder();
    } else {
      try
      {
        j = Integer.parseInt(localObject1[1]);
        n = Integer.parseInt(localObject1[2].substring(0, 2));
        m = Integer.parseInt(localObject1[3]);
        if (j != 0)
        {
          parami0 = new StringBuilder();
          parami0.append("Unknown AV1 profile: ");
          parami0.append(j);
          break label4494;
        }
        if ((m != 8) && (m != 10))
        {
          parami0 = new StringBuilder();
          parami0.append("Unknown AV1 bit depth: ");
          parami0.append(m);
          break label4494;
        }
        if (m == 8)
        {
          j = 1;
        }
        else
        {
          if (parami0 != null) {
            if (d == null)
            {
              m = c;
              if ((m != 7) && (m != 6)) {}
            }
            else
            {
              j = 4096;
              break label4125;
            }
          }
          j = 2;
        }
        label4125:
        m = i;
        switch (n)
        {
        default: 
          m = -1;
          break;
        case 23: 
          m = 8388608;
          break;
        case 22: 
          m = 4194304;
          break;
        case 21: 
          m = 2097152;
          break;
        case 20: 
          m = 1048576;
          break;
        case 19: 
          m = 524288;
          break;
        case 18: 
          m = 262144;
          break;
        case 17: 
          m = 131072;
          break;
        case 16: 
          m = 65536;
          break;
        case 15: 
          m = 32768;
          break;
        case 14: 
          m = 16384;
          break;
        case 13: 
          m = 8192;
          break;
        case 12: 
          m = 4096;
          break;
        case 11: 
          m = 2048;
          break;
        case 10: 
          m = 1024;
          break;
        case 9: 
          m = 512;
          break;
        case 8: 
          m = 256;
          break;
        case 7: 
          m = 128;
          break;
        case 6: 
          m = 64;
          break;
        case 5: 
          m = 32;
          break;
        case 3: 
          m = 8;
          break;
        case 2: 
          m = 4;
          break;
        case 1: 
          m = 2;
          break;
        case 0: 
          m = 1;
        }
        if (m == -1)
        {
          parami0 = new StringBuilder();
          parami0.append("Unknown AV1 level: ");
          parami0.append(n);
          break label4494;
        }
        parami0 = new Pair(Integer.valueOf(j), Integer.valueOf(m));
      }
      catch (NumberFormatException parami0)
      {
        parami0 = new StringBuilder();
      }
    }
    parami0.append("Ignoring malformed AV1 codec string: ");
    parami0.append((String)localObject2);
    label4494:
    m.f("MediaCodecUtil", parami0.toString());
    parami0 = null;
    return parami0;
  }
  
  public static List<l> e(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      a locala = new o4/p$a;
      locala.<init>(paramString, paramBoolean1, paramBoolean2);
      HashMap localHashMap = b;
      Object localObject = (List)localHashMap.get(locala);
      if (localObject != null) {
        return (List<l>)localObject;
      }
      int i = e0.a;
      if (i >= 21)
      {
        localObject = new o4/p$e;
        ((e)localObject).<init>(paramBoolean1, paramBoolean2);
      }
      else
      {
        localObject = new d();
      }
      ArrayList localArrayList = f(locala, (c)localObject);
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
              localObject = new o4/p$d;
              ((d)localObject).<init>();
              localArrayList = f(locala, (c)localObject);
              localObject = localArrayList;
              if (!localArrayList.isEmpty())
              {
                localObject = new java/lang/StringBuilder;
                ((StringBuilder)localObject).<init>();
                ((StringBuilder)localObject).append("MediaCodecList API didn't list secure decoder for: ");
                ((StringBuilder)localObject).append(paramString);
                ((StringBuilder)localObject).append(". Assuming: ");
                ((StringBuilder)localObject).append(get0a);
                m.f("MediaCodecUtil", ((StringBuilder)localObject).toString());
                localObject = localArrayList;
              }
            }
          }
        }
      }
      a(paramString, (ArrayList)localObject);
      paramString = t.p((Collection)localObject);
      localHashMap.put(locala, paramString);
      return paramString;
    }
    finally {}
  }
  
  /* Error */
  public static ArrayList<l> f(a parama, c paramc)
  {
    // Byte code:
    //   0: new 452	java/util/ArrayList
    //   3: astore_2
    //   4: aload_2
    //   5: invokespecial 476	java/util/ArrayList:<init>	()V
    //   8: aload_0
    //   9: getfield 477	o4/p$a:a	Ljava/lang/String;
    //   12: astore_3
    //   13: aload_1
    //   14: invokeinterface 479 1 0
    //   19: istore 4
    //   21: aload_1
    //   22: invokeinterface 481 1 0
    //   27: istore 5
    //   29: iconst_0
    //   30: istore 6
    //   32: aload_0
    //   33: astore 7
    //   35: iload 6
    //   37: iload 4
    //   39: if_icmpge +625 -> 664
    //   42: aload_1
    //   43: iload 6
    //   45: invokeinterface 484 2 0
    //   50: astore 8
    //   52: getstatic 61	v5/e0:a	I
    //   55: istore 9
    //   57: iload 9
    //   59: bipush 29
    //   61: if_icmplt +17 -> 78
    //   64: aload 8
    //   66: invokestatic 490	aa/u:u	(Landroid/media/MediaCodecInfo;)Z
    //   69: ifeq +9 -> 78
    //   72: iconst_1
    //   73: istore 10
    //   75: goto +6 -> 81
    //   78: iconst_0
    //   79: istore 10
    //   81: iload 10
    //   83: ifeq +6 -> 89
    //   86: goto +166 -> 252
    //   89: aload 8
    //   91: invokevirtual 493	android/media/MediaCodecInfo:getName	()Ljava/lang/String;
    //   94: astore 11
    //   96: aload 8
    //   98: aload 11
    //   100: iload 5
    //   102: aload_3
    //   103: invokestatic 496	o4/p:g	(Landroid/media/MediaCodecInfo;Ljava/lang/String;ZLjava/lang/String;)Z
    //   106: ifne +6 -> 112
    //   109: goto +143 -> 252
    //   112: aload 8
    //   114: aload 11
    //   116: aload_3
    //   117: invokestatic 498	o4/p:c	(Landroid/media/MediaCodecInfo;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   120: astore 12
    //   122: aload 12
    //   124: ifnonnull +6 -> 130
    //   127: goto +125 -> 252
    //   130: aload 8
    //   132: aload 12
    //   134: invokevirtual 502	android/media/MediaCodecInfo:getCapabilitiesForType	(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;
    //   137: astore 13
    //   139: aload_1
    //   140: ldc_w 504
    //   143: aload 12
    //   145: aload 13
    //   147: invokeinterface 507 4 0
    //   152: istore 14
    //   154: aload_1
    //   155: ldc_w 504
    //   158: aload 13
    //   160: invokeinterface 510 3 0
    //   165: istore 15
    //   167: aload 7
    //   169: getfield 513	o4/p$a:c	Z
    //   172: istore 16
    //   174: iload 16
    //   176: ifne +8 -> 184
    //   179: iload 15
    //   181: ifne +71 -> 252
    //   184: iload 16
    //   186: ifeq +11 -> 197
    //   189: iload 14
    //   191: ifne +6 -> 197
    //   194: goto +58 -> 252
    //   197: aload_1
    //   198: ldc_w 515
    //   201: aload 12
    //   203: aload 13
    //   205: invokeinterface 507 4 0
    //   210: istore 16
    //   212: aload_1
    //   213: ldc_w 515
    //   216: aload 13
    //   218: invokeinterface 510 3 0
    //   223: istore 15
    //   225: aload 7
    //   227: getfield 517	o4/p$a:b	Z
    //   230: istore 14
    //   232: iload 14
    //   234: ifne +8 -> 242
    //   237: iload 15
    //   239: ifne +13 -> 252
    //   242: iload 14
    //   244: ifeq +11 -> 255
    //   247: iload 16
    //   249: ifne +6 -> 255
    //   252: goto +347 -> 599
    //   255: iload 9
    //   257: bipush 29
    //   259: if_icmplt +13 -> 272
    //   262: aload 8
    //   264: invokestatic 522	aa/w:r	(Landroid/media/MediaCodecInfo;)Z
    //   267: istore 15
    //   269: goto +13 -> 282
    //   272: aload 8
    //   274: aload_3
    //   275: invokestatic 525	o4/p:h	(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z
    //   278: iconst_1
    //   279: ixor
    //   280: istore 15
    //   282: iconst_1
    //   283: istore 14
    //   285: aload 8
    //   287: aload_3
    //   288: invokestatic 525	o4/p:h	(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z
    //   291: istore 17
    //   293: iload 9
    //   295: bipush 29
    //   297: if_icmplt +13 -> 310
    //   300: aload 8
    //   302: invokestatic 529	aa/v:t	(Landroid/media/MediaCodecInfo;)Z
    //   305: istore 14
    //   307: goto +52 -> 359
    //   310: aload 8
    //   312: invokevirtual 493	android/media/MediaCodecInfo:getName	()Ljava/lang/String;
    //   315: invokestatic 535	x6/b:x0	(Ljava/lang/String;)Ljava/lang/String;
    //   318: astore 8
    //   320: aload 8
    //   322: ldc_w 537
    //   325: invokevirtual 540	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   328: ifne +28 -> 356
    //   331: aload 8
    //   333: ldc_w 542
    //   336: invokevirtual 540	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   339: ifne +17 -> 356
    //   342: aload 8
    //   344: ldc_w 544
    //   347: invokevirtual 540	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   350: ifne +6 -> 356
    //   353: goto +6 -> 359
    //   356: iconst_0
    //   357: istore 14
    //   359: iload 5
    //   361: ifeq +17 -> 378
    //   364: aload 7
    //   366: getfield 517	o4/p$a:b	Z
    //   369: istore 18
    //   371: iload 18
    //   373: iload 16
    //   375: if_icmpeq +20 -> 395
    //   378: iload 5
    //   380: ifne +57 -> 437
    //   383: aload 7
    //   385: getfield 517	o4/p$a:b	Z
    //   388: istore 18
    //   390: iload 18
    //   392: ifne +45 -> 437
    //   395: aload_2
    //   396: aload 11
    //   398: aload_3
    //   399: aload 12
    //   401: aload 13
    //   403: iload 15
    //   405: iload 17
    //   407: iload 14
    //   409: iconst_0
    //   410: invokestatic 88	o4/l:h	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZ)Lo4/l;
    //   413: invokevirtual 545	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   416: pop
    //   417: goto +182 -> 599
    //   420: astore 7
    //   422: aload 11
    //   424: astore 13
    //   426: aload 7
    //   428: astore 11
    //   430: aload 13
    //   432: astore 7
    //   434: goto +99 -> 533
    //   437: aload 11
    //   439: astore 7
    //   441: iload 5
    //   443: ifne +156 -> 599
    //   446: iload 16
    //   448: ifeq +151 -> 599
    //   451: new 203	java/lang/StringBuilder
    //   454: dup
    //   455: invokespecial 204	java/lang/StringBuilder:<init>	()V
    //   458: astore 8
    //   460: aload 8
    //   462: aload 7
    //   464: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   467: pop
    //   468: aload 8
    //   470: ldc_w 547
    //   473: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   476: pop
    //   477: aload 8
    //   479: invokevirtual 269	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   482: astore 11
    //   484: aload_2
    //   485: aload 11
    //   487: aload_3
    //   488: aload 12
    //   490: aload 13
    //   492: iload 15
    //   494: iload 17
    //   496: iload 14
    //   498: iconst_1
    //   499: invokestatic 88	o4/l:h	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZ)Lo4/l;
    //   502: invokevirtual 545	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   505: pop
    //   506: aload_2
    //   507: areturn
    //   508: astore 11
    //   510: goto +23 -> 533
    //   513: astore 11
    //   515: goto +18 -> 533
    //   518: astore 7
    //   520: goto -98 -> 422
    //   523: astore 13
    //   525: aload 11
    //   527: astore 7
    //   529: aload 13
    //   531: astore 11
    //   533: getstatic 61	v5/e0:a	I
    //   536: istore 10
    //   538: iload 10
    //   540: bipush 23
    //   542: if_icmpgt +63 -> 605
    //   545: aload_2
    //   546: invokevirtual 455	java/util/ArrayList:isEmpty	()Z
    //   549: ifne +56 -> 605
    //   552: new 203	java/lang/StringBuilder
    //   555: astore 11
    //   557: aload 11
    //   559: invokespecial 204	java/lang/StringBuilder:<init>	()V
    //   562: aload 11
    //   564: ldc_w 549
    //   567: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   570: pop
    //   571: aload 11
    //   573: aload 7
    //   575: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   578: pop
    //   579: aload 11
    //   581: ldc_w 551
    //   584: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   587: pop
    //   588: ldc_w 265
    //   591: aload 11
    //   593: invokevirtual 269	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   596: invokestatic 553	v5/m:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   599: iinc 6 1
    //   602: goto -570 -> 32
    //   605: new 203	java/lang/StringBuilder
    //   608: astore_0
    //   609: aload_0
    //   610: invokespecial 204	java/lang/StringBuilder:<init>	()V
    //   613: aload_0
    //   614: ldc_w 555
    //   617: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   620: pop
    //   621: aload_0
    //   622: aload 7
    //   624: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   627: pop
    //   628: aload_0
    //   629: ldc_w 557
    //   632: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   635: pop
    //   636: aload_0
    //   637: aload 12
    //   639: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   642: pop
    //   643: aload_0
    //   644: ldc_w 559
    //   647: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   650: pop
    //   651: ldc_w 265
    //   654: aload_0
    //   655: invokevirtual 269	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   658: invokestatic 553	v5/m:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   661: aload 11
    //   663: athrow
    //   664: aload_2
    //   665: areturn
    //   666: astore_0
    //   667: new 9	o4/p$b
    //   670: dup
    //   671: aload_0
    //   672: invokespecial 562	o4/p$b:<init>	(Ljava/lang/Exception;)V
    //   675: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	676	0	parama	a
    //   0	676	1	paramc	c
    //   3	662	2	localArrayList	ArrayList
    //   12	476	3	str1	String
    //   19	21	4	i	int
    //   27	415	5	bool1	boolean
    //   30	570	6	j	int
    //   33	351	7	locala	a
    //   420	7	7	localException1	Exception
    //   432	31	7	localObject1	Object
    //   518	1	7	localException2	Exception
    //   527	96	7	localObject2	Object
    //   50	428	8	localObject3	Object
    //   55	243	9	k	int
    //   73	470	10	m	int
    //   94	392	11	localObject4	Object
    //   508	1	11	localException3	Exception
    //   513	13	11	localException4	Exception
    //   531	131	11	localObject5	Object
    //   120	518	12	str2	String
    //   137	354	13	localObject6	Object
    //   523	7	13	localException5	Exception
    //   152	345	14	bool2	boolean
    //   165	328	15	bool3	boolean
    //   172	275	16	bool4	boolean
    //   291	204	17	bool5	boolean
    //   369	22	18	bool6	boolean
    // Exception table:
    //   from	to	target	type
    //   383	390	420	java/lang/Exception
    //   484	506	508	java/lang/Exception
    //   460	484	513	java/lang/Exception
    //   395	417	518	java/lang/Exception
    //   451	460	518	java/lang/Exception
    //   130	174	523	java/lang/Exception
    //   197	232	523	java/lang/Exception
    //   262	269	523	java/lang/Exception
    //   272	282	523	java/lang/Exception
    //   285	293	523	java/lang/Exception
    //   300	307	523	java/lang/Exception
    //   310	353	523	java/lang/Exception
    //   364	371	523	java/lang/Exception
    //   0	29	666	java/lang/Exception
    //   42	57	666	java/lang/Exception
    //   64	72	666	java/lang/Exception
    //   89	109	666	java/lang/Exception
    //   112	122	666	java/lang/Exception
    //   533	538	666	java/lang/Exception
    //   545	599	666	java/lang/Exception
    //   605	664	666	java/lang/Exception
  }
  
  public static boolean g(MediaCodecInfo paramMediaCodecInfo, String paramString1, boolean paramBoolean, String paramString2)
  {
    if ((!paramMediaCodecInfo.isEncoder()) && ((paramBoolean) || (!paramString1.endsWith(".secure"))))
    {
      int i = e0.a;
      if ((i < 21) && (("CIPAACDecoder".equals(paramString1)) || ("CIPMP3Decoder".equals(paramString1)) || ("CIPVorbisDecoder".equals(paramString1)) || ("CIPAMRNBDecoder".equals(paramString1)) || ("AACDecoder".equals(paramString1)) || ("MP3Decoder".equals(paramString1)))) {
        return false;
      }
      if ((i < 18) && ("OMX.MTK.AUDIO.DECODER.AAC".equals(paramString1)))
      {
        paramMediaCodecInfo = e0.b;
        if (("a70".equals(paramMediaCodecInfo)) || (("Xiaomi".equals(e0.c)) && (paramMediaCodecInfo.startsWith("HM")))) {
          return false;
        }
      }
      if ((i == 16) && ("OMX.qcom.audio.decoder.mp3".equals(paramString1)))
      {
        paramMediaCodecInfo = e0.b;
        if (("dlxu".equals(paramMediaCodecInfo)) || ("protou".equals(paramMediaCodecInfo)) || ("ville".equals(paramMediaCodecInfo)) || ("villeplus".equals(paramMediaCodecInfo)) || ("villec2".equals(paramMediaCodecInfo)) || (paramMediaCodecInfo.startsWith("gee")) || ("C6602".equals(paramMediaCodecInfo)) || ("C6603".equals(paramMediaCodecInfo)) || ("C6606".equals(paramMediaCodecInfo)) || ("C6616".equals(paramMediaCodecInfo)) || ("L36h".equals(paramMediaCodecInfo)) || ("SO-02E".equals(paramMediaCodecInfo))) {
          return false;
        }
      }
      if ((i == 16) && ("OMX.qcom.audio.decoder.aac".equals(paramString1)))
      {
        paramMediaCodecInfo = e0.b;
        if (("C1504".equals(paramMediaCodecInfo)) || ("C1505".equals(paramMediaCodecInfo)) || ("C1604".equals(paramMediaCodecInfo)) || ("C1605".equals(paramMediaCodecInfo))) {
          return false;
        }
      }
      if ((i < 24) && (("OMX.SEC.aac.dec".equals(paramString1)) || ("OMX.Exynos.AAC.Decoder".equals(paramString1))) && ("samsung".equals(e0.c)))
      {
        paramMediaCodecInfo = e0.b;
        if ((paramMediaCodecInfo.startsWith("zeroflte")) || (paramMediaCodecInfo.startsWith("zerolte")) || (paramMediaCodecInfo.startsWith("zenlte")) || ("SC-05G".equals(paramMediaCodecInfo)) || ("marinelteatt".equals(paramMediaCodecInfo)) || ("404SC".equals(paramMediaCodecInfo)) || ("SC-04G".equals(paramMediaCodecInfo)) || ("SCV31".equals(paramMediaCodecInfo))) {
          return false;
        }
      }
      if ((i <= 19) && ("OMX.SEC.vp8.dec".equals(paramString1)) && ("samsung".equals(e0.c)))
      {
        paramMediaCodecInfo = e0.b;
        if ((paramMediaCodecInfo.startsWith("d2")) || (paramMediaCodecInfo.startsWith("serrano")) || (paramMediaCodecInfo.startsWith("jflte")) || (paramMediaCodecInfo.startsWith("santos")) || (paramMediaCodecInfo.startsWith("t0"))) {
          return false;
        }
      }
      if ((i <= 19) && (e0.b.startsWith("jflte")) && ("OMX.qcom.video.decoder.vp8".equals(paramString1))) {
        return false;
      }
      return (i > 23) || (!"audio/eac3-joc".equals(paramString2)) || (!"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(paramString1));
    }
    return false;
  }
  
  public static boolean h(MediaCodecInfo paramMediaCodecInfo, String paramString)
  {
    if (e0.a >= 29) {
      return aa.v.s(paramMediaCodecInfo);
    }
    boolean bool1 = v5.p.k(paramString);
    boolean bool2 = true;
    if (bool1) {
      return true;
    }
    paramMediaCodecInfo = x6.b.x0(paramMediaCodecInfo.getName());
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
  
  public static int i()
  {
    if (c == -1)
    {
      int i = 0;
      int j = 0;
      Object localObject = e("video/avc", false, false);
      if (((List)localObject).isEmpty()) {
        localObject = null;
      } else {
        localObject = (l)((List)localObject).get(0);
      }
      if (localObject != null)
      {
        localObject = d;
        if (localObject != null)
        {
          MediaCodecInfo.CodecProfileLevel[] arrayOfCodecProfileLevel = profileLevels;
          localObject = arrayOfCodecProfileLevel;
          if (arrayOfCodecProfileLevel != null) {}
        }
        else
        {
          localObject = new MediaCodecInfo.CodecProfileLevel[0];
        }
        int k = localObject.length;
        int m = 0;
        while (j < k)
        {
          i = level;
          if ((i != 1) && (i != 2)) {}
          switch (i)
          {
          default: 
            i = -1;
            break;
          case 131072: 
          case 262144: 
          case 524288: 
            i = 35651584;
            break;
          case 32768: 
          case 65536: 
            i = 9437184;
            break;
          case 16384: 
            i = 5652480;
            break;
          case 8192: 
            i = 2228224;
            break;
          case 2048: 
          case 4096: 
            i = 2097152;
            break;
          case 1024: 
            i = 1310720;
            break;
          case 512: 
            i = 921600;
            break;
          case 128: 
          case 256: 
            i = 414720;
            break;
          case 64: 
            i = 202752;
            break;
          case 8: 
          case 16: 
          case 32: 
            i = 101376;
            break;
            i = 25344;
          }
          m = Math.max(i, m);
          j++;
        }
        if (e0.a >= 21) {
          i = 345600;
        } else {
          i = 172800;
        }
        i = Math.max(m, i);
      }
      c = i;
    }
    return c;
  }
  
  public static final class a
  {
    public final String a;
    public final boolean b;
    public final boolean c;
    
    public a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
    {
      a = paramString;
      b = paramBoolean1;
      c = paramBoolean2;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (paramObject.getClass() == a.class))
      {
        paramObject = (a)paramObject;
        if ((!TextUtils.equals(a, a)) || (b != b) || (c != c)) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public final int hashCode()
    {
      int i = j.e(a, 31, 31);
      boolean bool = b;
      int j = 1231;
      int k;
      if (bool) {
        k = 1231;
      } else {
        k = 1237;
      }
      if (!c) {
        j = 1237;
      }
      return (i + k) * 31 + j;
    }
  }
  
  public static final class b
    extends Exception
  {
    public b(Exception paramException)
    {
      super(paramException);
    }
  }
  
  public static abstract interface c
  {
    public abstract MediaCodecInfo a(int paramInt);
    
    public abstract boolean b(String paramString1, String paramString2, MediaCodecInfo.CodecCapabilities paramCodecCapabilities);
    
    public abstract boolean c(String paramString, MediaCodecInfo.CodecCapabilities paramCodecCapabilities);
    
    public abstract int d();
    
    public abstract boolean e();
  }
  
  public static final class d
    implements p.c
  {
    public final MediaCodecInfo a(int paramInt)
    {
      return MediaCodecList.getCodecInfoAt(paramInt);
    }
    
    public final boolean b(String paramString1, String paramString2, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
    {
      boolean bool;
      if (("secure-playback".equals(paramString1)) && ("video/avc".equals(paramString2))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final boolean c(String paramString, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
    {
      return false;
    }
    
    public final int d()
    {
      return MediaCodecList.getCodecCount();
    }
    
    public final boolean e()
    {
      return false;
    }
  }
  
  public static final class e
    implements p.c
  {
    public final int a;
    public MediaCodecInfo[] b;
    
    public e(boolean paramBoolean1, boolean paramBoolean2)
    {
      int i;
      if ((!paramBoolean1) && (!paramBoolean2)) {
        i = 0;
      } else {
        i = 1;
      }
      a = i;
    }
    
    public final MediaCodecInfo a(int paramInt)
    {
      if (b == null) {
        b = new MediaCodecList(a).getCodecInfos();
      }
      return b[paramInt];
    }
    
    public final boolean b(String paramString1, String paramString2, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
    {
      return paramCodecCapabilities.isFeatureSupported(paramString1);
    }
    
    public final boolean c(String paramString, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
    {
      return paramCodecCapabilities.isFeatureRequired(paramString);
    }
    
    public final int d()
    {
      if (b == null) {
        b = new MediaCodecList(a).getCodecInfos();
      }
      return b.length;
    }
    
    public final boolean e()
    {
      return true;
    }
  }
  
  public static abstract interface f<T>
  {
    public abstract int b(T paramT);
  }
}

/* Location:
 * Qualified Name:     o4.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */