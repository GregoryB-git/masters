package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;
import java.util.ArrayList;

public final class vs
{
  private static final ArrayList<vv> a = new ArrayList();
  
  public static String a(int paramInt)
  {
    if (paramInt != 32)
    {
      if (paramInt != 33)
      {
        if (paramInt != 35)
        {
          if (paramInt != 64)
          {
            if (paramInt != 163) {
              if (paramInt != 177) {
                if (paramInt != 165) {
                  if (paramInt == 166) {}
                }
              }
            }
            switch (paramInt)
            {
            default: 
              switch (paramInt)
              {
              default: 
                return null;
              case 174: 
                return "audio/ac4";
              case 173: 
                return "audio/opus";
              case 170: 
              case 171: 
                return "audio/vnd.dts.hd";
              }
              return "audio/vnd.dts";
            case 106: 
              return "video/mpeg";
            case 105: 
            case 107: 
              return "audio/mpeg";
            case 96: 
            case 97: 
            case 98: 
            case 99: 
            case 100: 
            case 101: 
              return "video/mpeg2";
              return "audio/eac3";
              return "audio/ac3";
              return "video/x-vnd.on2.vp9";
              return "video/wvc1";
            }
          }
          return "audio/mp4a-latm";
        }
        return "video/hevc";
      }
      return "video/avc";
    }
    return "video/mp4v-es";
  }
  
  public static boolean a(String paramString)
  {
    return "audio".equals(j(paramString));
  }
  
  public static boolean b(String paramString)
  {
    return "video".equals(j(paramString));
  }
  
  public static boolean c(String paramString)
  {
    return "text".equals(j(paramString));
  }
  
  public static String d(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    String[] arrayOfString = wl.i(paramString);
    int i = arrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      paramString = f(arrayOfString[j]);
      if ((paramString != null) && (b(paramString))) {
        return paramString;
      }
    }
    return null;
  }
  
  public static String e(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    paramString = wl.i(paramString);
    int i = paramString.length;
    for (int j = 0; j < i; j++)
    {
      String str = f(paramString[j]);
      if ((str != null) && (a(str))) {
        return str;
      }
    }
    return null;
  }
  
  public static String f(String paramString)
  {
    Object localObject = null;
    if (paramString == null) {
      return null;
    }
    String str = wl.d(paramString.trim());
    int i;
    if ((!str.startsWith("avc1")) && (!str.startsWith("avc3"))) {
      if ((!str.startsWith("hev1")) && (!str.startsWith("hvc1"))) {
        if ((!str.startsWith("dvav")) && (!str.startsWith("dva1")) && (!str.startsWith("dvhe")) && (!str.startsWith("dvh1")))
        {
          if (str.startsWith("av01")) {
            return "video/av01";
          }
          if ((!str.startsWith("vp9")) && (!str.startsWith("vp09"))) {
            if ((!str.startsWith("vp8")) && (!str.startsWith("vp08")))
            {
              boolean bool = str.startsWith("mp4a");
              i = 0;
              if (bool)
              {
                paramString = (String)localObject;
                if (str.startsWith("mp4a."))
                {
                  str = str.substring(5);
                  paramString = (String)localObject;
                  if (str.length() < 2) {}
                }
              }
            }
          }
        }
      }
    }
    try
    {
      paramString = a(Integer.parseInt(wl.e(str.substring(0, 2)), 16));
      if (paramString == null) {
        return "audio/mp4a-latm";
      }
      return paramString;
      if ((!str.startsWith("ac-3")) && (!str.startsWith("dac3")))
      {
        if ((!str.startsWith("ec-3")) && (!str.startsWith("dec3")))
        {
          if (str.startsWith("ec+3")) {
            return "audio/eac3-joc";
          }
          if ((!str.startsWith("ac-4")) && (!str.startsWith("dac4")))
          {
            if ((!str.startsWith("dtsc")) && (!str.startsWith("dtse")))
            {
              if ((!str.startsWith("dtsh")) && (!str.startsWith("dtsl")))
              {
                if (str.startsWith("opus")) {
                  return "audio/opus";
                }
                if (str.startsWith("vorbis")) {
                  return "audio/vorbis";
                }
                if (str.startsWith("flac")) {
                  return "audio/flac";
                }
                int j = a.size();
                while (i < j)
                {
                  paramString = (vv)a.get(i);
                  if (str.startsWith(b)) {
                    return a;
                  }
                  i++;
                }
                return null;
              }
              return "audio/vnd.dts.hd";
            }
            return "audio/vnd.dts";
          }
          return "audio/ac4";
        }
        return "audio/eac3";
      }
      return "audio/ac3";
      return "video/x-vnd.on2.vp8";
      return "video/x-vnd.on2.vp9";
      return "video/dolby-vision";
      return "video/hevc";
      return "video/avc";
    }
    catch (NumberFormatException paramString)
    {
      for (;;)
      {
        paramString = (String)localObject;
      }
    }
  }
  
  public static int g(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return -1;
    }
    if (a(paramString)) {
      return 1;
    }
    if (b(paramString)) {
      return 2;
    }
    if ((!c(paramString)) && (!"application/cea-608".equals(paramString)) && (!"application/cea-708".equals(paramString)) && (!"application/x-mp4-cea-608".equals(paramString)) && (!"application/x-subrip".equals(paramString)) && (!"application/ttml+xml".equals(paramString)) && (!"application/x-quicktime-tx3g".equals(paramString)) && (!"application/x-mp4-vtt".equals(paramString)) && (!"application/x-rawcc".equals(paramString)) && (!"application/vobsub".equals(paramString)) && (!"application/pgs".equals(paramString)) && (!"application/dvbsubs".equals(paramString)))
    {
      if ((!"application/id3".equals(paramString)) && (!"application/x-emsg".equals(paramString)) && (!"application/x-scte35".equals(paramString)))
      {
        if ("application/x-camera-motion".equals(paramString)) {
          return 5;
        }
        int i = a.size();
        for (int j = 0; j < i; j++)
        {
          vv localvv = (vv)a.get(j);
          if (paramString.equals(a)) {
            return c;
          }
        }
        return -1;
      }
      return 4;
    }
    return 3;
  }
  
  public static int h(String paramString)
  {
    paramString.getClass();
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1556697186: 
      if (paramString.equals("audio/true-hd")) {
        j = 6;
      }
      break;
    case 1505942594: 
      if (paramString.equals("audio/vnd.dts.hd")) {
        j = 5;
      }
      break;
    case 1504578661: 
      if (paramString.equals("audio/eac3")) {
        j = 4;
      }
      break;
    case 187078297: 
      if (paramString.equals("audio/ac4")) {
        j = 3;
      }
      break;
    case 187078296: 
      if (paramString.equals("audio/ac3")) {
        j = 2;
      }
      break;
    case -1095064472: 
      if (paramString.equals("audio/vnd.dts")) {
        j = 1;
      }
      break;
    case -2123537834: 
      if (paramString.equals("audio/eac3-joc")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      return 0;
    case 6: 
      return 14;
    case 5: 
      return 8;
    case 4: 
      return 6;
    case 3: 
      return 17;
    case 2: 
      return 5;
    case 1: 
      return 7;
    }
    return 18;
  }
  
  public static int i(String paramString)
  {
    return g(f(paramString));
  }
  
  private static String j(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    int i = paramString.indexOf('/');
    if (i == -1) {
      return null;
    }
    return paramString.substring(0, i);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.vs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */