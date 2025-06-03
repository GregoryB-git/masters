package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

final class ht
{
  private static final String[] a = { "Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop" };
  
  public static bw a(int paramInt, bw parambw, kd paramkd1, kd paramkd2, ga paramga)
  {
    if (paramInt == 1)
    {
      paramkd2 = parambw;
      if (paramga.a()) {
        paramkd2 = parambw.a(a, b);
      }
      paramga = paramkd2;
      if (paramkd1 != null) {
        paramga = paramkd2.a(paramkd1);
      }
    }
    else
    {
      paramga = parambw;
      if (paramInt == 2)
      {
        paramga = parambw;
        if (paramkd2 != null)
        {
          paramInt = 0;
          for (;;)
          {
            paramga = parambw;
            if (paramInt >= paramkd2.a()) {
              break;
            }
            paramga = paramkd2.a(paramInt);
            paramkd1 = parambw;
            if ((paramga instanceof hr))
            {
              paramga = (hr)paramga;
              paramkd1 = parambw;
              if ("com.android.capture.fps".equals(a))
              {
                paramkd1 = parambw;
                if (c == 23)
                {
                  paramkd1 = parambw;
                  try
                  {
                    parambw = parambw.a(ByteBuffer.wrap(b).asFloatBuffer().get());
                    paramkd1 = parambw;
                    kd localkd = new com/google/ads/interactivemedia/v3/internal/kd;
                    paramkd1 = parambw;
                    localkd.<init>(new kd.a[] { paramga });
                    paramkd1 = parambw;
                    parambw = parambw.a(localkd);
                    paramkd1 = parambw;
                  }
                  catch (NumberFormatException parambw)
                  {
                    Log.w("MetadataUtil", "Ignoring invalid framerate");
                  }
                }
              }
            }
            paramInt++;
            parambw = paramkd1;
          }
        }
      }
    }
    return paramga;
  }
  
  public static hr a(vy paramvy, int paramInt, String paramString)
  {
    for (;;)
    {
      int i = paramvy.d();
      if (i >= paramInt) {
        break;
      }
      int j = paramvy.l();
      if (paramvy.l() == 1684108385)
      {
        i = paramvy.l();
        paramInt = paramvy.l();
        j -= 16;
        byte[] arrayOfByte = new byte[j];
        paramvy.a(arrayOfByte, 0, j);
        return new hr(paramString, arrayOfByte, paramInt, i);
      }
      paramvy.c(i + j);
    }
    return null;
  }
  
  public static kd.a a(vy paramvy)
  {
    i = paramvy.d();
    j = paramvy.l() + i;
    i = paramvy.l();
    k = i >>> 24;
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    if ((k == 169) || (k == 253) || (i == 1735291493)) {}
    try
    {
      i = b(paramvy);
      if (i > 0)
      {
        localObject5 = a;
        if (i <= localObject5.length)
        {
          localObject5 = localObject5[(i - 1)];
          break label93;
        }
      }
      localObject5 = null;
      label93:
      if (localObject5 != null)
      {
        localObject5 = new lj("TCON", null, (String)localObject5);
      }
      else
      {
        Log.w("MetadataUtil", "Failed to parse standard genre code");
        localObject5 = localObject4;
      }
      paramvy.c(j);
      return (kd.a)localObject5;
    }
    finally
    {
      Object localObject5;
      break label1294;
      if ((k == 7233901) || (k == 7631467)) {
        break label1276;
      }
      if ((k == 6516589) || (k == 7828084)) {
        break label1258;
      }
      if (k != 6578553) {
        break label1050;
      }
      localObject7 = a(i, "TDRC", paramvy);
      paramvy.c(j);
      return (kd.a)localObject7;
      if (k != 4280916) {
        break label1075;
      }
      localObject7 = a(i, "TPE1", paramvy);
      paramvy.c(j);
      return (kd.a)localObject7;
      if (k != 7630703) {
        break label1100;
      }
      localObject7 = a(i, "TSSE", paramvy);
      paramvy.c(j);
      return (kd.a)localObject7;
      if (k != 6384738) {
        break label1125;
      }
      localObject7 = a(i, "TALB", paramvy);
      paramvy.c(j);
      return (kd.a)localObject7;
      if (k != 7108978) {
        break label1150;
      }
      localObject7 = a(i, "USLT", paramvy);
      paramvy.c(j);
      return (kd.a)localObject7;
      if (k != 6776174) {
        break label1175;
      }
      localObject7 = a(i, "TCON", paramvy);
      paramvy.c(j);
      return (kd.a)localObject7;
      if (k != 6779504) {
        break label1200;
      }
      localObject7 = a(i, "TIT1", paramvy);
      paramvy.c(j);
      return (kd.a)localObject7;
      localObject7 = String.valueOf(ha.b(i));
      if (((String)localObject7).length() == 0) {
        break label1230;
      }
      localObject7 = "Skipped unknown metadata entry: ".concat((String)localObject7);
      break label1242;
      localObject7 = new String("Skipped unknown metadata entry: ");
      Log.d("MetadataUtil", (String)localObject7);
      paramvy.c(j);
      return null;
      localObject7 = a(i, "TCOM", paramvy);
      paramvy.c(j);
      return (kd.a)localObject7;
      localObject7 = a(i, "TIT2", paramvy);
      paramvy.c(j);
      return (kd.a)localObject7;
      paramvy.c(j);
    }
    if (i == 1684632427)
    {
      localObject5 = b(i, "TPOS", paramvy);
      paramvy.c(j);
      return (kd.a)localObject5;
    }
    if (i == 1953655662)
    {
      localObject5 = b(i, "TRCK", paramvy);
      paramvy.c(j);
      return (kd.a)localObject5;
    }
    if (i == 1953329263)
    {
      localObject5 = a(i, "TBPM", paramvy, true, false);
      paramvy.c(j);
      return (kd.a)localObject5;
    }
    if (i == 1668311404)
    {
      localObject5 = a(i, "TCMP", paramvy, true, true);
      paramvy.c(j);
      return (kd.a)localObject5;
    }
    if (i == 1668249202)
    {
      i = paramvy.l();
      if (paramvy.l() == 1684108385)
      {
        k = paramvy.l() & 0xFFFFFF;
        if (k == 13) {
          localObject5 = "image/jpeg";
        } else if (k == 14) {
          localObject5 = "image/png";
        } else {
          localObject5 = null;
        }
        if (localObject5 == null)
        {
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>(41);
          ((StringBuilder)localObject5).append("Unrecognized cover art flags: ");
          ((StringBuilder)localObject5).append(k);
          Log.w("MetadataUtil", ((StringBuilder)localObject5).toString());
          localObject5 = localObject1;
        }
        else
        {
          paramvy.d(4);
          i -= 16;
          localObject1 = new byte[i];
          paramvy.a((byte[])localObject1, 0, i);
          localObject5 = new kn((String)localObject5, null, 3, (byte[])localObject1);
        }
      }
      else
      {
        Log.w("MetadataUtil", "Failed to parse cover art attribute");
        localObject5 = localObject1;
      }
      paramvy.c(j);
      return (kd.a)localObject5;
    }
    if (i == 1631670868)
    {
      localObject5 = a(i, "TPE2", paramvy);
      paramvy.c(j);
      return (kd.a)localObject5;
    }
    if (i == 1936682605)
    {
      localObject5 = a(i, "TSOT", paramvy);
      paramvy.c(j);
      return (kd.a)localObject5;
    }
    if (i == 1936679276)
    {
      localObject5 = a(i, "TSO2", paramvy);
      paramvy.c(j);
      return (kd.a)localObject5;
    }
    if (i == 1936679282)
    {
      localObject5 = a(i, "TSOA", paramvy);
      paramvy.c(j);
      return (kd.a)localObject5;
    }
    if (i == 1936679265)
    {
      localObject5 = a(i, "TSOP", paramvy);
      paramvy.c(j);
      return (kd.a)localObject5;
    }
    if (i == 1936679791)
    {
      localObject5 = a(i, "TSOC", paramvy);
      paramvy.c(j);
      return (kd.a)localObject5;
    }
    if (i == 1920233063)
    {
      localObject5 = a(i, "ITUNESADVISORY", paramvy, false, false);
      paramvy.c(j);
      return (kd.a)localObject5;
    }
    if (i == 1885823344)
    {
      localObject5 = a(i, "ITUNESGAPLESS", paramvy, false, true);
      paramvy.c(j);
      return (kd.a)localObject5;
    }
    if (i == 1936683886)
    {
      localObject5 = a(i, "TVSHOWSORT", paramvy);
      paramvy.c(j);
      return (kd.a)localObject5;
    }
    if (i == 1953919848)
    {
      localObject5 = a(i, "TVSHOW", paramvy);
      paramvy.c(j);
      return (kd.a)localObject5;
    }
    if (i == 757935405)
    {
      k = -1;
      i = k;
      localObject1 = null;
      localObject5 = localObject1;
      while (paramvy.d() < j)
      {
        int m = paramvy.d();
        int n = paramvy.l();
        int i1 = paramvy.l();
        paramvy.d(4);
        if (i1 == 1835360622)
        {
          localObject1 = paramvy.f(n - 12);
        }
        else if (i1 == 1851878757)
        {
          localObject5 = paramvy.f(n - 12);
        }
        else
        {
          if (i1 == 1684108385)
          {
            k = m;
            i = n;
          }
          paramvy.d(n - 12);
        }
      }
      localObject4 = localObject2;
      if (localObject1 != null)
      {
        localObject4 = localObject2;
        if (localObject5 != null) {
          if (k == -1)
          {
            localObject4 = localObject2;
          }
          else
          {
            paramvy.c(k);
            paramvy.d(16);
            localObject4 = new ld((String)localObject1, (String)localObject5, paramvy.f(i - 16));
          }
        }
      }
      paramvy.c(j);
      return (kd.a)localObject4;
      k = i & 0xFFFFFF;
      if (k == 6516084)
      {
        k = paramvy.l();
        if (paramvy.l() == 1684108385)
        {
          paramvy.d(8);
          localObject5 = paramvy.f(k - 16);
          localObject5 = new kv("und", (String)localObject5, (String)localObject5);
        }
        else
        {
          localObject5 = String.valueOf(ha.b(i));
          if (((String)localObject5).length() != 0) {
            localObject5 = "Failed to parse comment attribute: ".concat((String)localObject5);
          } else {
            localObject5 = new String("Failed to parse comment attribute: ");
          }
          Log.w("MetadataUtil", (String)localObject5);
          localObject5 = localObject3;
        }
        paramvy.c(j);
        return (kd.a)localObject5;
      }
    }
  }
  
  private static la a(int paramInt, String paramString, vy paramvy, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = b(paramvy);
    int j = i;
    if (paramBoolean2) {
      j = Math.min(1, i);
    }
    if (j >= 0)
    {
      if (paramBoolean1) {
        return new lj(paramString, null, Integer.toString(j));
      }
      return new kv("und", paramString, Integer.toString(j));
    }
    paramString = String.valueOf(ha.b(paramInt));
    if (paramString.length() != 0) {
      paramString = "Failed to parse uint8 attribute: ".concat(paramString);
    } else {
      paramString = new String("Failed to parse uint8 attribute: ");
    }
    Log.w("MetadataUtil", paramString);
    return null;
  }
  
  private static lj a(int paramInt, String paramString, vy paramvy)
  {
    int i = paramvy.l();
    if (paramvy.l() == 1684108385)
    {
      paramvy.d(8);
      return new lj(paramString, null, paramvy.f(i - 16));
    }
    paramString = String.valueOf(ha.b(paramInt));
    if (paramString.length() != 0) {
      paramString = "Failed to parse text attribute: ".concat(paramString);
    } else {
      paramString = new String("Failed to parse text attribute: ");
    }
    Log.w("MetadataUtil", paramString);
    return null;
  }
  
  private static int b(vy paramvy)
  {
    paramvy.d(4);
    if (paramvy.l() == 1684108385)
    {
      paramvy.d(8);
      return paramvy.e();
    }
    Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
    return -1;
  }
  
  private static lj b(int paramInt, String paramString, vy paramvy)
  {
    int i = paramvy.l();
    if ((paramvy.l() == 1684108385) && (i >= 22))
    {
      paramvy.d(10);
      i = paramvy.f();
      if (i > 0)
      {
        Object localObject = new StringBuilder(11);
        ((StringBuilder)localObject).append(i);
        localObject = ((StringBuilder)localObject).toString();
        paramInt = paramvy.f();
        paramvy = (vy)localObject;
        if (paramInt > 0)
        {
          paramvy = String.valueOf(localObject);
          localObject = new StringBuilder(paramvy.length() + 12);
          ((StringBuilder)localObject).append(paramvy);
          ((StringBuilder)localObject).append("/");
          ((StringBuilder)localObject).append(paramInt);
          paramvy = ((StringBuilder)localObject).toString();
        }
        return new lj(paramString, null, paramvy);
      }
    }
    paramString = String.valueOf(ha.b(paramInt));
    if (paramString.length() != 0) {
      paramString = "Failed to parse index/count attribute: ".concat(paramString);
    } else {
      paramString = new String("Failed to parse index/count attribute: ");
    }
    Log.w("MetadataUtil", paramString);
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ht
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */