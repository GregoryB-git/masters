package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o5;
import z2;

@SuppressLint({"InlinedApi"})
public final class jv
{
  private static final Pattern a = Pattern.compile("^\\D?(\\d+)$");
  private static final HashMap<a, List<jp>> b = new HashMap();
  private static final SparseIntArray c;
  private static final SparseIntArray d;
  private static final SparseIntArray e;
  private static final SparseIntArray f;
  private static final Map<String, Integer> g;
  private static final Map<String, Integer> h;
  private static final Map<String, Integer> i;
  private static final SparseIntArray j;
  private static final SparseIntArray k;
  private static int l = -1;
  
  static
  {
    Object localObject1 = new SparseIntArray();
    c = (SparseIntArray)localObject1;
    Integer localInteger1 = Integer.valueOf(1);
    ((SparseIntArray)localObject1).put(66, 1);
    Object localObject2 = Integer.valueOf(2);
    ((SparseIntArray)localObject1).put(77, 2);
    Integer localInteger2 = Integer.valueOf(4);
    ((SparseIntArray)localObject1).put(88, 4);
    Integer localInteger3 = Integer.valueOf(8);
    ((SparseIntArray)localObject1).put(100, 8);
    Integer localInteger4 = Integer.valueOf(16);
    ((SparseIntArray)localObject1).put(110, 16);
    Integer localInteger5 = Integer.valueOf(32);
    ((SparseIntArray)localObject1).put(122, 32);
    Integer localInteger6 = Integer.valueOf(64);
    ((SparseIntArray)localObject1).put(244, 64);
    Object localObject3 = new SparseIntArray();
    d = (SparseIntArray)localObject3;
    ((SparseIntArray)localObject3).put(10, 1);
    ((SparseIntArray)localObject3).put(11, 4);
    ((SparseIntArray)localObject3).put(12, 8);
    ((SparseIntArray)localObject3).put(13, 16);
    ((SparseIntArray)localObject3).put(20, 32);
    ((SparseIntArray)localObject3).put(21, 64);
    Integer localInteger7 = Integer.valueOf(128);
    ((SparseIntArray)localObject3).put(22, 128);
    localObject1 = Integer.valueOf(256);
    ((SparseIntArray)localObject3).put(30, 256);
    Object localObject4 = Integer.valueOf(512);
    ((SparseIntArray)localObject3).put(31, 512);
    ((SparseIntArray)localObject3).put(32, 1024);
    ((SparseIntArray)localObject3).put(40, 2048);
    ((SparseIntArray)localObject3).put(41, 4096);
    ((SparseIntArray)localObject3).put(42, 8192);
    ((SparseIntArray)localObject3).put(50, 16384);
    ((SparseIntArray)localObject3).put(51, 32768);
    ((SparseIntArray)localObject3).put(52, 65536);
    localObject3 = new SparseIntArray();
    e = (SparseIntArray)localObject3;
    ((SparseIntArray)localObject3).put(0, 1);
    ((SparseIntArray)localObject3).put(1, 2);
    ((SparseIntArray)localObject3).put(2, 4);
    ((SparseIntArray)localObject3).put(3, 8);
    localObject3 = new SparseIntArray();
    f = (SparseIntArray)localObject3;
    ((SparseIntArray)localObject3).put(10, 1);
    ((SparseIntArray)localObject3).put(11, 2);
    ((SparseIntArray)localObject3).put(20, 4);
    ((SparseIntArray)localObject3).put(21, 8);
    ((SparseIntArray)localObject3).put(30, 16);
    ((SparseIntArray)localObject3).put(31, 32);
    ((SparseIntArray)localObject3).put(40, 64);
    ((SparseIntArray)localObject3).put(41, 128);
    ((SparseIntArray)localObject3).put(50, 256);
    ((SparseIntArray)localObject3).put(51, 512);
    ((SparseIntArray)localObject3).put(60, 2048);
    ((SparseIntArray)localObject3).put(61, 4096);
    ((SparseIntArray)localObject3).put(62, 8192);
    localObject3 = new HashMap();
    g = (Map)localObject3;
    ((HashMap)localObject3).put("L30", localInteger1);
    ((Map)localObject3).put("L60", localInteger2);
    ((Map)localObject3).put("L63", localInteger4);
    ((Map)localObject3).put("L90", localInteger6);
    ((Map)localObject3).put("L93", localObject1);
    ((Map)localObject3).put("L120", Integer.valueOf(1024));
    ((Map)localObject3).put("L123", Integer.valueOf(4096));
    z2.z(16384, (HashMap)localObject3, "L150", 65536, "L153", 262144, "L156", 1048576, "L180");
    ((Map)localObject3).put("L183", Integer.valueOf(4194304));
    ((Map)localObject3).put("L186", Integer.valueOf(16777216));
    ((Map)localObject3).put("H30", localObject2);
    ((Map)localObject3).put("H60", localInteger3);
    ((Map)localObject3).put("H63", localInteger5);
    ((Map)localObject3).put("H90", localInteger7);
    ((Map)localObject3).put("H93", localObject4);
    ((Map)localObject3).put("H120", Integer.valueOf(2048));
    ((Map)localObject3).put("H123", Integer.valueOf(8192));
    z2.z(32768, (HashMap)localObject3, "H150", 131072, "H153", 524288, "H156", 2097152, "H180");
    ((Map)localObject3).put("H183", Integer.valueOf(8388608));
    ((Map)localObject3).put("H186", Integer.valueOf(33554432));
    localObject3 = new HashMap();
    h = (Map)localObject3;
    ((HashMap)localObject3).put("00", localInteger1);
    ((Map)localObject3).put("01", localObject2);
    ((Map)localObject3).put("02", localInteger2);
    ((Map)localObject3).put("03", localInteger3);
    ((Map)localObject3).put("04", localInteger4);
    ((Map)localObject3).put("05", localInteger5);
    ((Map)localObject3).put("06", localInteger6);
    ((Map)localObject3).put("07", localInteger7);
    ((Map)localObject3).put("08", localObject1);
    ((Map)localObject3).put("09", localObject4);
    localObject4 = new HashMap();
    i = (Map)localObject4;
    ((HashMap)localObject4).put("01", localInteger1);
    ((Map)localObject4).put("02", localObject2);
    ((Map)localObject4).put("03", localInteger2);
    ((Map)localObject4).put("04", localInteger3);
    ((Map)localObject4).put("05", localInteger4);
    ((Map)localObject4).put("06", localInteger5);
    ((Map)localObject4).put("07", localInteger6);
    ((Map)localObject4).put("08", localInteger7);
    ((Map)localObject4).put("09", localObject1);
    localObject2 = new SparseIntArray();
    j = (SparseIntArray)localObject2;
    ((SparseIntArray)localObject2).put(0, 1);
    ((SparseIntArray)localObject2).put(1, 2);
    ((SparseIntArray)localObject2).put(2, 4);
    ((SparseIntArray)localObject2).put(3, 8);
    ((SparseIntArray)localObject2).put(4, 16);
    ((SparseIntArray)localObject2).put(5, 32);
    ((SparseIntArray)localObject2).put(6, 64);
    ((SparseIntArray)localObject2).put(7, 128);
    ((SparseIntArray)localObject2).put(8, 256);
    ((SparseIntArray)localObject2).put(9, 512);
    ((SparseIntArray)localObject2).put(10, 1024);
    ((SparseIntArray)localObject2).put(11, 2048);
    ((SparseIntArray)localObject2).put(12, 4096);
    ((SparseIntArray)localObject2).put(13, 8192);
    ((SparseIntArray)localObject2).put(14, 16384);
    ((SparseIntArray)localObject2).put(15, 32768);
    ((SparseIntArray)localObject2).put(16, 65536);
    ((SparseIntArray)localObject2).put(17, 131072);
    ((SparseIntArray)localObject2).put(18, 262144);
    ((SparseIntArray)localObject2).put(19, 524288);
    ((SparseIntArray)localObject2).put(20, 1048576);
    ((SparseIntArray)localObject2).put(21, 2097152);
    ((SparseIntArray)localObject2).put(22, 4194304);
    ((SparseIntArray)localObject2).put(23, 8388608);
    localObject2 = new SparseIntArray();
    k = (SparseIntArray)localObject2;
    ((SparseIntArray)localObject2).put(1, 1);
    ((SparseIntArray)localObject2).put(2, 2);
    ((SparseIntArray)localObject2).put(3, 3);
    ((SparseIntArray)localObject2).put(4, 4);
    ((SparseIntArray)localObject2).put(5, 5);
    ((SparseIntArray)localObject2).put(6, 6);
    ((SparseIntArray)localObject2).put(17, 17);
    ((SparseIntArray)localObject2).put(20, 20);
    ((SparseIntArray)localObject2).put(23, 23);
    ((SparseIntArray)localObject2).put(29, 29);
    ((SparseIntArray)localObject2).put(39, 39);
    ((SparseIntArray)localObject2).put(42, 42);
  }
  
  public static Pair<Integer, Integer> a(bw parambw)
  {
    Object localObject = f;
    if (localObject == null) {
      return null;
    }
    localObject = ((String)localObject).split("\\.");
    int m = 0;
    String str = localObject[0];
    str.getClass();
    int n = str.hashCode();
    int i1 = 2;
    switch (n)
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
                      m = -1;
                      break;
                    } while (!str.equals("vp09"));
                    m = 8;
                    break;
                  } while (!str.equals("mp4a"));
                  m = 7;
                  break;
                } while (!str.equals("hvc1"));
                m = 6;
                break;
              } while (!str.equals("hev1"));
              m = 5;
              break;
            } while (!str.equals("dvhe"));
            m = 4;
            break;
          } while (!str.equals("dvh1"));
          m = 3;
          break;
        } while (!str.equals("avc2"));
        m = 2;
        break;
      } while (!str.equals("avc1"));
      m = 1;
      break;
    } while (!str.equals("av01"));
    switch (m)
    {
    default: 
      return null;
    case 8: 
      return b(f, (String[])localObject);
    case 7: 
      return c(f, (String[])localObject);
    case 5: 
    case 6: 
      str = f;
      if (localObject.length < 4)
      {
        parambw = String.valueOf(str);
        if (parambw.length() != 0) {
          parambw = "Ignoring malformed HEVC codec string: ".concat(parambw);
        } else {
          parambw = new String("Ignoring malformed HEVC codec string: ");
        }
        Log.w("MediaCodecUtil", parambw);
        return null;
      }
      parambw = a.matcher(localObject[1]);
      if (!parambw.matches())
      {
        parambw = String.valueOf(str);
        if (parambw.length() != 0) {
          parambw = "Ignoring malformed HEVC codec string: ".concat(parambw);
        } else {
          parambw = new String("Ignoring malformed HEVC codec string: ");
        }
        Log.w("MediaCodecUtil", parambw);
        return null;
      }
      parambw = parambw.group(1);
      if ("1".equals(parambw))
      {
        m = 1;
      }
      else
      {
        if (!"2".equals(parambw)) {
          break label580;
        }
        m = i1;
      }
      parambw = localObject[3];
      localObject = (Integer)g.get(parambw);
      if (localObject == null)
      {
        parambw = String.valueOf(parambw);
        if (parambw.length() != 0) {
          parambw = "Unknown HEVC level string: ".concat(parambw);
        } else {
          parambw = new String("Unknown HEVC level string: ");
        }
        Log.w("MediaCodecUtil", parambw);
        return null;
      }
      return new Pair(Integer.valueOf(m), localObject);
      parambw = String.valueOf(parambw);
      if (parambw.length() != 0) {
        parambw = "Unknown HEVC profile string: ".concat(parambw);
      } else {
        parambw = new String("Unknown HEVC profile string: ");
      }
      Log.w("MediaCodecUtil", parambw);
      return null;
    case 3: 
    case 4: 
      str = f;
      if (localObject.length < 3)
      {
        parambw = String.valueOf(str);
        if (parambw.length() != 0) {
          parambw = "Ignoring malformed Dolby Vision codec string: ".concat(parambw);
        } else {
          parambw = new String("Ignoring malformed Dolby Vision codec string: ");
        }
        Log.w("MediaCodecUtil", parambw);
        return null;
      }
      parambw = a.matcher(localObject[1]);
      if (!parambw.matches())
      {
        parambw = String.valueOf(str);
        if (parambw.length() != 0) {
          parambw = "Ignoring malformed Dolby Vision codec string: ".concat(parambw);
        } else {
          parambw = new String("Ignoring malformed Dolby Vision codec string: ");
        }
        Log.w("MediaCodecUtil", parambw);
        return null;
      }
      str = parambw.group(1);
      parambw = (Integer)h.get(str);
      if (parambw == null)
      {
        parambw = String.valueOf(str);
        if (parambw.length() != 0) {
          parambw = "Unknown Dolby Vision profile string: ".concat(parambw);
        } else {
          parambw = new String("Unknown Dolby Vision profile string: ");
        }
        Log.w("MediaCodecUtil", parambw);
        return null;
      }
      str = localObject[2];
      localObject = (Integer)i.get(str);
      if (localObject == null)
      {
        parambw = String.valueOf(str);
        if (parambw.length() != 0) {
          parambw = "Unknown Dolby Vision level string: ".concat(parambw);
        } else {
          parambw = new String("Unknown Dolby Vision level string: ");
        }
        Log.w("MediaCodecUtil", parambw);
        return null;
      }
      return new Pair(parambw, localObject);
    case 1: 
    case 2: 
      label580:
      return a(f, (String[])localObject);
    }
    return a(f, (String[])localObject, s);
  }
  
  private static Pair<Integer, Integer> a(String paramString, String[] paramArrayOfString)
  {
    if (paramArrayOfString.length < 2)
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "Ignoring malformed AVC codec string: ".concat(paramString);
      } else {
        paramString = new String("Ignoring malformed AVC codec string: ");
      }
      Log.w("MediaCodecUtil", paramString);
      return null;
    }
    try
    {
      int n;
      if (paramArrayOfString[1].length() == 6)
      {
        m = Integer.parseInt(paramArrayOfString[1].substring(0, 2), 16);
        n = Integer.parseInt(paramArrayOfString[1].substring(4), 16);
      }
      else
      {
        if (paramArrayOfString.length < 3) {
          break label232;
        }
        m = Integer.parseInt(paramArrayOfString[1]);
        n = Integer.parseInt(paramArrayOfString[2]);
      }
      int i1 = c.get(m, -1);
      if (i1 == -1)
      {
        paramString = new StringBuilder(32);
        paramString.append("Unknown AVC profile: ");
        paramString.append(m);
        Log.w("MediaCodecUtil", paramString.toString());
        return null;
      }
      int m = d.get(n, -1);
      if (m == -1)
      {
        paramString = new StringBuilder(30);
        paramString.append("Unknown AVC level: ");
        paramString.append(n);
        Log.w("MediaCodecUtil", paramString.toString());
        return null;
      }
      return new Pair(Integer.valueOf(i1), Integer.valueOf(m));
      label232:
      paramArrayOfString = String.valueOf(paramString);
      if (paramArrayOfString.length() != 0) {
        paramArrayOfString = "Ignoring malformed AVC codec string: ".concat(paramArrayOfString);
      } else {
        paramArrayOfString = new String("Ignoring malformed AVC codec string: ");
      }
      Log.w("MediaCodecUtil", paramArrayOfString);
      return null;
    }
    catch (NumberFormatException paramArrayOfString)
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "Ignoring malformed AVC codec string: ".concat(paramString);
      } else {
        paramString = new String("Ignoring malformed AVC codec string: ");
      }
      Log.w("MediaCodecUtil", paramString);
    }
    return null;
  }
  
  private static Pair<Integer, Integer> a(String paramString, String[] paramArrayOfString, wm paramwm)
  {
    if (paramArrayOfString.length < 4)
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "Ignoring malformed AV1 codec string: ".concat(paramString);
      } else {
        paramString = new String("Ignoring malformed AV1 codec string: ");
      }
      Log.w("MediaCodecUtil", paramString);
      return null;
    }
    int m = 1;
    try
    {
      int n = Integer.parseInt(paramArrayOfString[1]);
      int i1 = Integer.parseInt(paramArrayOfString[2].substring(0, 2));
      int i2 = Integer.parseInt(paramArrayOfString[3]);
      if (n != 0)
      {
        paramString = new StringBuilder(32);
        paramString.append("Unknown AV1 profile: ");
        paramString.append(n);
        Log.w("MediaCodecUtil", paramString.toString());
        return null;
      }
      if ((i2 != 8) && (i2 != 10))
      {
        paramString = new StringBuilder(34);
        paramString.append("Unknown AV1 bit depth: ");
        paramString.append(i2);
        Log.w("MediaCodecUtil", paramString.toString());
        return null;
      }
      if (i2 != 8)
      {
        if (paramwm != null) {
          if (d == null)
          {
            m = c;
            if ((m != 7) && (m != 6)) {}
          }
          else
          {
            m = 4096;
            break label223;
          }
        }
        m = 2;
      }
      label223:
      n = j.get(i1, -1);
      if (n == -1)
      {
        paramString = new StringBuilder(30);
        paramString.append("Unknown AV1 level: ");
        paramString.append(i1);
        Log.w("MediaCodecUtil", paramString.toString());
        return null;
      }
      return new Pair(Integer.valueOf(m), Integer.valueOf(n));
    }
    catch (NumberFormatException paramArrayOfString)
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "Ignoring malformed AV1 codec string: ".concat(paramString);
      } else {
        paramString = new String("Ignoring malformed AV1 codec string: ");
      }
      Log.w("MediaCodecUtil", paramString);
    }
    return null;
  }
  
  public static jp a()
    throws ka
  {
    jp localjp = b("audio/raw", false, false);
    if (localjp == null) {
      return null;
    }
    return jp.a(a);
  }
  
  private static ArrayList<jp> a(a parama, jz paramjz)
    throws ka
  {
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      String str1 = a;
      int m = paramjz.a();
      boolean bool1 = paramjz.b();
      for (int n = 0; n < m; n++)
      {
        Object localObject1 = paramjz.a(n);
        String str2 = ((MediaCodecInfo)localObject1).getName();
        boolean bool2 = ((MediaCodecInfo)localObject1).isEncoder();
        if ((!bool2) && ((bool1) || (!str2.endsWith(".secure"))))
        {
          i1 = wl.a;
          if ((i1 >= 21) || ((!"CIPAACDecoder".equals(str2)) && (!"CIPMP3Decoder".equals(str2)) && (!"CIPVorbisDecoder".equals(str2)) && (!"CIPAMRNBDecoder".equals(str2)) && (!"AACDecoder".equals(str2)) && (!"MP3Decoder".equals(str2)))) {
            if ((i1 < 18) && ("OMX.MTK.AUDIO.DECODER.AAC".equals(str2)))
            {
              localObject2 = wl.b;
              if (("a70".equals(localObject2)) || (("Xiaomi".equals(wl.c)) && (((String)localObject2).startsWith("HM")))) {}
            }
            else if ((i1 == 16) && ("OMX.qcom.audio.decoder.mp3".equals(str2)))
            {
              localObject2 = wl.b;
              if (("dlxu".equals(localObject2)) || ("protou".equals(localObject2)) || ("ville".equals(localObject2)) || ("villeplus".equals(localObject2)) || ("villec2".equals(localObject2)) || (((String)localObject2).startsWith("gee")) || ("C6602".equals(localObject2)) || ("C6603".equals(localObject2)) || ("C6606".equals(localObject2)) || ("C6616".equals(localObject2)) || ("L36h".equals(localObject2)) || ("SO-02E".equals(localObject2))) {}
            }
            else if ((i1 == 16) && ("OMX.qcom.audio.decoder.aac".equals(str2)))
            {
              localObject2 = wl.b;
              if ((!"C1504".equals(localObject2)) && (!"C1505".equals(localObject2)) && (!"C1604".equals(localObject2)))
              {
                bool2 = "C1605".equals(localObject2);
                if (bool2) {}
              }
            }
            else if ((i1 < 24) && (("OMX.SEC.aac.dec".equals(str2)) || ("OMX.Exynos.AAC.Decoder".equals(str2))) && ("samsung".equals(wl.c)))
            {
              localObject2 = wl.b;
              if ((!((String)localObject2).startsWith("zeroflte")) && (!((String)localObject2).startsWith("zerolte")) && (!((String)localObject2).startsWith("zenlte")) && (!"SC-05G".equals(localObject2)) && (!"marinelteatt".equals(localObject2)) && (!"404SC".equals(localObject2)) && (!"SC-04G".equals(localObject2)))
              {
                bool2 = "SCV31".equals(localObject2);
                if (bool2) {}
              }
            }
            else if ((i1 <= 19) && ("OMX.SEC.vp8.dec".equals(str2)) && ("samsung".equals(wl.c)))
            {
              localObject2 = wl.b;
              if ((((String)localObject2).startsWith("d2")) || (((String)localObject2).startsWith("serrano")) || (((String)localObject2).startsWith("jflte")) || (((String)localObject2).startsWith("santos")) || (((String)localObject2).startsWith("t0"))) {}
            }
            else if (((i1 > 19) || (!wl.b.startsWith("jflte")) || (!"OMX.qcom.video.decoder.vp8".equals(str2))) && ((!"audio/eac3-joc".equals(str1)) || (!"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str2))))
            {
              i1 = 1;
              break label760;
            }
          }
        }
        int i1 = 0;
        label760:
        if (i1 != 0)
        {
          for (localObject2 : ((MediaCodecInfo)localObject1).getSupportedTypes()) {
            if (((String)localObject2).equalsIgnoreCase(str1)) {
              break label932;
            }
          }
          if (str1.equals("video/dolby-vision"))
          {
            if ("OMX.MS.HEVCDV.Decoder".equals(str2))
            {
              localObject2 = "video/hevcdv";
              break label932;
            }
            if (("OMX.RTK.video.decoder".equals(str2)) || ("OMX.realtek.video.decoder.tunneled".equals(str2)))
            {
              localObject2 = "video/dv_hevc";
              break label932;
            }
          }
          else
          {
            if ((str1.equals("audio/alac")) && ("OMX.lge.alac.decoder".equals(str2)))
            {
              localObject2 = "audio/x-lg-alac";
              break label932;
            }
            if ((str1.equals("audio/flac")) && ("OMX.lge.flac.decoder".equals(str2)))
            {
              localObject2 = "audio/x-lg-flac";
              break label932;
            }
          }
        }
        Object localObject2 = null;
        label932:
        if (localObject2 != null) {
          try
          {
            ??? = ((MediaCodecInfo)localObject1).getCapabilitiesForType((String)localObject2);
            bool2 = paramjz.a("tunneled-playback", (String)localObject2, (MediaCodecInfo.CodecCapabilities)???);
            boolean bool3 = paramjz.a("tunneled-playback", (MediaCodecInfo.CodecCapabilities)???);
            boolean bool4 = c;
            if (((bool4) || (!bool3)) && ((!bool4) || (bool2)))
            {
              boolean bool5 = paramjz.a("secure-playback", (String)localObject2, (MediaCodecInfo.CodecCapabilities)???);
              bool2 = paramjz.a("secure-playback", (MediaCodecInfo.CodecCapabilities)???);
              bool4 = b;
              if (((bool4) || (!bool2)) && ((!bool4) || (bool5)))
              {
                i1 = wl.a;
                if (i1 >= 29) {
                  bool2 = o5.j((MediaCodecInfo)localObject1);
                } else if (!a((MediaCodecInfo)localObject1)) {
                  bool2 = true;
                } else {
                  bool2 = false;
                }
                boolean bool6 = a((MediaCodecInfo)localObject1);
                if (i1 >= 29)
                {
                  bool4 = o5.m((MediaCodecInfo)localObject1);
                }
                else
                {
                  localObject1 = ((MediaCodecInfo)localObject1).getName().toLowerCase();
                  if ((!((String)localObject1).startsWith("omx.google.")) && (!((String)localObject1).startsWith("c2.android.")) && (!((String)localObject1).startsWith("c2.google."))) {
                    bool4 = true;
                  } else {
                    bool4 = false;
                  }
                }
                if (i1 <= 22)
                {
                  localObject1 = wl.d;
                  if ((("ODROID-XU3".equals(localObject1)) || ("Nexus 10".equals(localObject1))) && (("OMX.Exynos.AVC.Decoder".equals(str2)) || ("OMX.Exynos.AVC.Decoder.secure".equals(str2))))
                  {
                    bool3 = true;
                    break label1240;
                  }
                }
                bool3 = false;
                label1240:
                if ((!bool1) || (b != bool5))
                {
                  if (!bool1)
                  {
                    boolean bool7 = b;
                    if (bool7) {}
                  }
                }
                else {
                  try
                  {
                    localArrayList.add(jp.a(str2, str1, (String)localObject2, (MediaCodecInfo.CodecCapabilities)???, bool2, bool6, bool4, bool3, false));
                  }
                  catch (Exception localException1)
                  {
                    break label1349;
                  }
                }
                if ((!bool1) && (bool5))
                {
                  localArrayList.add(jp.a(String.valueOf(str2).concat(".secure"), str1, (String)localObject2, (MediaCodecInfo.CodecCapabilities)???, bool2, bool6, bool4, bool3, true));
                  return localArrayList;
                }
              }
            }
          }
          catch (Exception localException2)
          {
            label1349:
            i1 = wl.a;
            if ((i1 <= 23) && (!localArrayList.isEmpty()))
            {
              i1 = String.valueOf(str2).length();
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>(i1 + 46);
              ((StringBuilder)localObject2).append("Skipping codec ");
              ((StringBuilder)localObject2).append(str2);
              ((StringBuilder)localObject2).append(" (failed to query capabilities)");
              Log.e("MediaCodecUtil", ((StringBuilder)localObject2).toString());
            }
            else
            {
              n = String.valueOf(str2).length();
              m = ((String)localObject2).length();
              parama = new java/lang/StringBuilder;
              parama.<init>(n + 25 + m);
              parama.append("Failed to query codec ");
              parama.append(str2);
              parama.append(" (");
              parama.append((String)localObject2);
              parama.append(")");
              Log.e("MediaCodecUtil", parama.toString());
              throw localException2;
            }
          }
        }
      }
      return localArrayList;
    }
    catch (Exception parama)
    {
      throw new ka(parama, (byte)0);
    }
  }
  
  public static List<jp> a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
    throws ka
  {
    try
    {
      a locala = new com/google/ads/interactivemedia/v3/internal/jv$a;
      locala.<init>(paramString, paramBoolean1, paramBoolean2);
      HashMap localHashMap = b;
      Object localObject = (List)localHashMap.get(locala);
      if (localObject != null) {
        return (List<jp>)localObject;
      }
      int m = wl.a;
      if (m >= 21)
      {
        localObject = new com/google/ads/interactivemedia/v3/internal/kb;
        ((kb)localObject).<init>(paramBoolean1, paramBoolean2);
      }
      else
      {
        localObject = new kc((byte)0);
      }
      ArrayList localArrayList = a(locala, (jz)localObject);
      localObject = localArrayList;
      if (paramBoolean1)
      {
        localObject = localArrayList;
        if (localArrayList.isEmpty())
        {
          localObject = localArrayList;
          if (21 <= m)
          {
            localObject = localArrayList;
            if (m <= 23)
            {
              localObject = new com/google/ads/interactivemedia/v3/internal/kc;
              ((kc)localObject).<init>((byte)0);
              localArrayList = a(locala, (jz)localObject);
              localObject = localArrayList;
              if (!localArrayList.isEmpty())
              {
                String str = get0a;
                int n = String.valueOf(paramString).length();
                int i1 = String.valueOf(str).length();
                localObject = new java/lang/StringBuilder;
                ((StringBuilder)localObject).<init>(n + 63 + i1);
                ((StringBuilder)localObject).append("MediaCodecList API didn't list secure decoder for: ");
                ((StringBuilder)localObject).append(paramString);
                ((StringBuilder)localObject).append(". Assuming: ");
                ((StringBuilder)localObject).append(str);
                Log.w("MediaCodecUtil", ((StringBuilder)localObject).toString());
                localObject = localArrayList;
              }
            }
          }
        }
      }
      if ("audio/raw".equals(paramString))
      {
        if ((m < 26) && (wl.b.equals("R9")) && (((List)localObject).size() == 1) && (get0a.equals("OMX.MTK.AUDIO.DECODER.RAW"))) {
          ((List)localObject).add(jp.a("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
        }
        a((List)localObject, ju.a);
      }
      else if ((m < 21) && (((List)localObject).size() > 1))
      {
        paramString = get0a;
        if (("OMX.SEC.mp3.dec".equals(paramString)) || ("OMX.SEC.MP3.Decoder".equals(paramString)) || ("OMX.brcm.audio.mp3.decoder".equals(paramString))) {
          a((List)localObject, jx.a);
        }
      }
      paramString = Collections.unmodifiableList((List)localObject);
      localHashMap.put(locala, paramString);
      return paramString;
    }
    finally {}
  }
  
  public static List<jp> a(List<jp> paramList, bw parambw)
  {
    paramList = new ArrayList(paramList);
    a(paramList, new jy(parambw));
    return paramList;
  }
  
  private static <T> void a(List<T> paramList, ke<T> paramke)
  {
    Collections.sort(paramList, new jw(paramke));
  }
  
  private static boolean a(MediaCodecInfo paramMediaCodecInfo)
  {
    if (wl.a >= 29) {
      return o5.p(paramMediaCodecInfo);
    }
    paramMediaCodecInfo = paramMediaCodecInfo.getName().toLowerCase();
    if (paramMediaCodecInfo.startsWith("arc.")) {
      return false;
    }
    return (paramMediaCodecInfo.startsWith("omx.google.")) || (paramMediaCodecInfo.startsWith("omx.ffmpeg.")) || ((paramMediaCodecInfo.startsWith("omx.sec.")) && (paramMediaCodecInfo.contains(".sw."))) || (paramMediaCodecInfo.equals("omx.qcom.video.decoder.hevcswvdec")) || (paramMediaCodecInfo.startsWith("c2.android.")) || (paramMediaCodecInfo.startsWith("c2.google.")) || ((!paramMediaCodecInfo.startsWith("omx.")) && (!paramMediaCodecInfo.startsWith("c2.")));
  }
  
  public static int b()
    throws ka
  {
    if (l == -1)
    {
      int m = 0;
      int n = 0;
      Object localObject = b("video/avc", false, false);
      if (localObject != null)
      {
        localObject = ((jp)localObject).a();
        int i1 = localObject.length;
        int i2 = 0;
        while (n < i1)
        {
          m = level;
          if ((m != 1) && (m != 2)) {}
          switch (m)
          {
          default: 
            m = -1;
            break;
          case 32768: 
          case 65536: 
            m = 9437184;
            break;
          case 16384: 
            m = 5652480;
            break;
          case 8192: 
            m = 2228224;
            break;
          case 2048: 
          case 4096: 
            m = 2097152;
            break;
          case 1024: 
            m = 1310720;
            break;
          case 512: 
            m = 921600;
            break;
          case 128: 
          case 256: 
            m = 414720;
            break;
          case 64: 
            m = 202752;
            break;
          case 8: 
          case 16: 
          case 32: 
            m = 101376;
            break;
            m = 25344;
          }
          i2 = Math.max(m, i2);
          n++;
        }
        if (wl.a >= 21) {
          m = 345600;
        } else {
          m = 172800;
        }
        m = Math.max(i2, m);
      }
      l = m;
    }
    return l;
  }
  
  private static Pair<Integer, Integer> b(String paramString, String[] paramArrayOfString)
  {
    if (paramArrayOfString.length < 3)
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "Ignoring malformed VP9 codec string: ".concat(paramString);
      } else {
        paramString = new String("Ignoring malformed VP9 codec string: ");
      }
      Log.w("MediaCodecUtil", paramString);
      return null;
    }
    try
    {
      int m = Integer.parseInt(paramArrayOfString[1]);
      int n = Integer.parseInt(paramArrayOfString[2]);
      int i1 = e.get(m, -1);
      if (i1 == -1)
      {
        paramString = new StringBuilder(32);
        paramString.append("Unknown VP9 profile: ");
        paramString.append(m);
        Log.w("MediaCodecUtil", paramString.toString());
        return null;
      }
      m = f.get(n, -1);
      if (m == -1)
      {
        paramString = new StringBuilder(30);
        paramString.append("Unknown VP9 level: ");
        paramString.append(n);
        Log.w("MediaCodecUtil", paramString.toString());
        return null;
      }
      return new Pair(Integer.valueOf(i1), Integer.valueOf(m));
    }
    catch (NumberFormatException paramArrayOfString)
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "Ignoring malformed VP9 codec string: ".concat(paramString);
      } else {
        paramString = new String("Ignoring malformed VP9 codec string: ");
      }
      Log.w("MediaCodecUtil", paramString);
    }
    return null;
  }
  
  private static jp b(String paramString, boolean paramBoolean1, boolean paramBoolean2)
    throws ka
  {
    paramString = a(paramString, false, false);
    if (paramString.isEmpty()) {
      return null;
    }
    return (jp)paramString.get(0);
  }
  
  private static Pair<Integer, Integer> c(String paramString, String[] paramArrayOfString)
  {
    if (paramArrayOfString.length != 3)
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "Ignoring malformed MP4A codec string: ".concat(paramString);
      } else {
        paramString = new String("Ignoring malformed MP4A codec string: ");
      }
      Log.w("MediaCodecUtil", paramString);
      return null;
    }
    try
    {
      if ("audio/mp4a-latm".equals(vs.a(Integer.parseInt(paramArrayOfString[1], 16))))
      {
        int m = Integer.parseInt(paramArrayOfString[2]);
        m = k.get(m, -1);
        if (m != -1)
        {
          paramArrayOfString = new Pair(Integer.valueOf(m), Integer.valueOf(0));
          return paramArrayOfString;
        }
      }
    }
    catch (NumberFormatException paramArrayOfString)
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "Ignoring malformed MP4A codec string: ".concat(paramString);
      } else {
        paramString = new String("Ignoring malformed MP4A codec string: ");
      }
      Log.w("MediaCodecUtil", paramString);
    }
    return null;
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
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (paramObject.getClass() == a.class))
      {
        paramObject = (a)paramObject;
        if ((TextUtils.equals(a, a)) && (b == b) && (c == c)) {
          return true;
        }
      }
      return false;
    }
    
    public final int hashCode()
    {
      String str = a;
      int i;
      if (str == null) {
        i = 0;
      } else {
        i = str.hashCode();
      }
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
      return ((i + 31) * 31 + k) * 31 + j;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.jv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */