package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public final class qr
  implements qz
{
  private final int b = 0;
  private final boolean c = true;
  
  public qr()
  {
    this(0, true);
  }
  
  private qr(int paramInt, boolean paramBoolean) {}
  
  private static hm a(wi paramwi, fe paramfe, List<bw> paramList)
  {
    if (paramList == null) {
      paramList = Collections.emptyList();
    }
    return new hm(0, paramwi, null, paramfe, paramList);
  }
  
  private static je a(int paramInt, boolean paramBoolean, bw parambw, List<bw> paramList, wi paramwi)
  {
    paramInt |= 0x10;
    if (paramList != null) {
      paramInt |= 0x20;
    } else if (paramBoolean) {
      paramList = Collections.singletonList(bw.a(null, "application/cea-608", 0, null));
    } else {
      paramList = Collections.emptyList();
    }
    parambw = f;
    int i = paramInt;
    if (!TextUtils.isEmpty(parambw))
    {
      int j = paramInt;
      if (!"audio/mp4a-latm".equals(vs.e(parambw))) {
        j = paramInt | 0x2;
      }
      i = j;
      if (!"video/avc".equals(vs.d(parambw))) {
        i = j | 0x4;
      }
    }
    return new je(2, paramwi, new jk(i, paramList));
  }
  
  private static qy a(fw paramfw)
  {
    boolean bool;
    if ((!(paramfw instanceof ig)) && (!(paramfw instanceof ic)) && (!(paramfw instanceof ie)) && (!(paramfw instanceof gx))) {
      bool = false;
    } else {
      bool = true;
    }
    return new qy(paramfw, bool, b(paramfw));
  }
  
  /* Error */
  private static boolean a(fw paramfw, fz paramfz)
    throws InterruptedException, IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokeinterface 118 2 0
    //   7: istore_2
    //   8: aload_1
    //   9: invokevirtual 122	com/google/ads/interactivemedia/v3/internal/fz:a	()V
    //   12: goto +17 -> 29
    //   15: astore_0
    //   16: aload_1
    //   17: invokevirtual 122	com/google/ads/interactivemedia/v3/internal/fz:a	()V
    //   20: aload_0
    //   21: athrow
    //   22: astore_0
    //   23: aload_1
    //   24: invokevirtual 122	com/google/ads/interactivemedia/v3/internal/fz:a	()V
    //   27: iconst_0
    //   28: istore_2
    //   29: iload_2
    //   30: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	31	0	paramfw	fw
    //   0	31	1	paramfz	fz
    //   7	23	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   0	8	15	finally
    //   0	8	22	java/io/EOFException
  }
  
  private static boolean b(fw paramfw)
  {
    return ((paramfw instanceof je)) || ((paramfw instanceof hm));
  }
  
  public final qy a(fw paramfw, Uri paramUri, bw parambw, List<bw> paramList, fe paramfe, wi paramwi, fz paramfz)
    throws InterruptedException, IOException
  {
    if (paramfw != null)
    {
      if (b(paramfw)) {
        return a(paramfw);
      }
      qy localqy;
      if ((paramfw instanceof rq)) {
        localqy = a(new rq(y, paramwi));
      } else if ((paramfw instanceof ig)) {
        localqy = a(new ig());
      } else if ((paramfw instanceof ic)) {
        localqy = a(new ic());
      } else if ((paramfw instanceof ie)) {
        localqy = a(new ie());
      } else if ((paramfw instanceof gx)) {
        localqy = a(new gx());
      } else {
        localqy = null;
      }
      if (localqy == null)
      {
        paramfw = paramfw.getClass().getSimpleName();
        if (paramfw.length() != 0) {
          paramfw = "Unexpected previousExtractor type: ".concat(paramfw);
        } else {
          paramfw = new String("Unexpected previousExtractor type: ");
        }
        throw new IllegalArgumentException(paramfw);
      }
    }
    paramUri = paramUri.getLastPathSegment();
    paramfw = paramUri;
    if (paramUri == null) {
      paramfw = "";
    }
    if ((!"text/vtt".equals(i)) && (!paramfw.endsWith(".webvtt")) && (!paramfw.endsWith(".vtt")))
    {
      if (paramfw.endsWith(".aac")) {
        paramfw = new ig();
      } else if ((!paramfw.endsWith(".ac3")) && (!paramfw.endsWith(".ec3")))
      {
        if (paramfw.endsWith(".ac4")) {
          paramfw = new ie();
        } else if (paramfw.endsWith(".mp3")) {
          paramfw = new gx(0, 0L);
        } else if ((!paramfw.endsWith(".mp4")) && (!paramfw.startsWith(".m4", paramfw.length() - 4)) && (!paramfw.startsWith(".mp4", paramfw.length() - 5)) && (!paramfw.startsWith(".cmf", paramfw.length() - 5))) {
          paramfw = a(b, c, parambw, paramList, paramwi);
        } else {
          paramfw = a(paramwi, paramfe, paramList);
        }
      }
      else {
        paramfw = new ic();
      }
    }
    else {
      paramfw = new rq(y, paramwi);
    }
    paramfz.a();
    if (a(paramfw, paramfz)) {
      return a(paramfw);
    }
    if (!(paramfw instanceof rq))
    {
      paramUri = new rq(y, paramwi);
      if (a(paramUri, paramfz)) {
        return a(paramUri);
      }
    }
    if (!(paramfw instanceof ig))
    {
      paramUri = new ig();
      if (a(paramUri, paramfz)) {
        return a(paramUri);
      }
    }
    if (!(paramfw instanceof ic))
    {
      paramUri = new ic();
      if (a(paramUri, paramfz)) {
        return a(paramUri);
      }
    }
    if (!(paramfw instanceof ie))
    {
      paramUri = new ie();
      if (a(paramUri, paramfz)) {
        return a(paramUri);
      }
    }
    if (!(paramfw instanceof gx))
    {
      paramUri = new gx(0, 0L);
      if (a(paramUri, paramfz)) {
        return a(paramUri);
      }
    }
    if (!(paramfw instanceof hm))
    {
      paramUri = a(paramwi, paramfe, paramList);
      if (a(paramUri, paramfz)) {
        return a(paramUri);
      }
    }
    if (!(paramfw instanceof je))
    {
      paramUri = a(b, c, parambw, paramList, paramwi);
      if (a(paramUri, paramfz)) {
        return a(paramUri);
      }
    }
    return a(paramfw);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.qr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */