package com.google.ads.interactivemedia.v3.internal;

import a;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.List;
import org.json.JSONObject;
import z2;

public class h
{
  public static float a(View paramView)
  {
    return paramView.getZ();
  }
  
  public static int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    while ((paramInt1 < paramInt2) && (paramArrayOfByte[paramInt1] != 71)) {
      paramInt1++;
    }
    return paramInt1;
  }
  
  public static long a(vy paramvy, int paramInt1, int paramInt2)
  {
    paramvy.c(paramInt1);
    if (paramvy.b() < 5) {
      return -9223372036854775807L;
    }
    paramInt1 = paramvy.l();
    if ((0x800000 & paramInt1) != 0) {
      return -9223372036854775807L;
    }
    if ((0x1FFF00 & paramInt1) >> 8 != paramInt2) {
      return -9223372036854775807L;
    }
    paramInt2 = 1;
    if ((paramInt1 & 0x20) != 0) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    }
    if (paramInt1 == 0) {
      return -9223372036854775807L;
    }
    if ((paramvy.e() >= 7) && (paramvy.b() >= 7))
    {
      if ((paramvy.e() & 0x10) == 16) {
        paramInt1 = paramInt2;
      } else {
        paramInt1 = 0;
      }
      if (paramInt1 != 0)
      {
        byte[] arrayOfByte = new byte[6];
        paramvy.a(arrayOfByte, 0, 6);
        return a(arrayOfByte);
      }
    }
    return -9223372036854775807L;
  }
  
  private static long a(byte[] paramArrayOfByte)
  {
    return (paramArrayOfByte[0] & 0xFF) << 25 | (paramArrayOfByte[1] & 0xFF) << 17 | (paramArrayOfByte[2] & 0xFF) << 9 | (paramArrayOfByte[3] & 0xFF) << 1 | (0xFF & paramArrayOfByte[4]) >> 7;
  }
  
  public static String a()
  {
    String str1 = Build.MANUFACTURER;
    String str2 = Build.MODEL;
    return z2.l(a.b(str2, a.b(str1, 2)), str1, "; ", str2);
  }
  
  public static void a(MediaFormat paramMediaFormat, wm paramwm)
  {
    if (paramwm != null)
    {
      a(paramMediaFormat, "color-transfer", c);
      a(paramMediaFormat, "color-standard", a);
      a(paramMediaFormat, "color-range", b);
      a(paramMediaFormat, "hdr-static-info", d);
    }
  }
  
  public static void a(MediaFormat paramMediaFormat, String paramString, float paramFloat)
  {
    if (paramFloat != -1.0F) {
      paramMediaFormat.setFloat(paramString, paramFloat);
    }
  }
  
  public static void a(MediaFormat paramMediaFormat, String paramString, int paramInt)
  {
    if (paramInt != -1) {
      paramMediaFormat.setInteger(paramString, paramInt);
    }
  }
  
  public static void a(MediaFormat paramMediaFormat, String paramString, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      paramMediaFormat.setByteBuffer(paramString, ByteBuffer.wrap(paramArrayOfByte));
    }
  }
  
  public static void a(MediaFormat paramMediaFormat, List<byte[]> paramList)
  {
    for (int i = 0; i < paramList.size(); i++) {
      paramMediaFormat.setByteBuffer(z2.k(15, "csd-", i), ByteBuffer.wrap((byte[])paramList.get(i)));
    }
  }
  
  public static void a(c paramc)
  {
    if (!paramc.equals(c.b)) {
      return;
    }
    throw new IllegalArgumentException("Impression owner is none");
  }
  
  public static void a(ci paramci, cr paramcr, int paramInt)
  {
    if (paramcr.b() == 1) {
      paramci = a0cw0Lc;
    }
  }
  
  public static <T extends fk> void a(fh<T> paramfh1, fh<T> paramfh2)
  {
    if (paramfh1 == paramfh2) {
      return;
    }
    if (paramfh2 != null) {
      paramfh2.d();
    }
    if (paramfh1 != null) {
      paramfh1.e();
    }
  }
  
  public static void a(Object paramObject, String paramString)
  {
    if (paramObject != null) {
      return;
    }
    throw new IllegalArgumentException(paramString);
  }
  
  public static void a(String paramString1, int paramInt, String paramString2)
  {
    if (paramString1.length() <= 256) {
      return;
    }
    throw new IllegalArgumentException(paramString2);
  }
  
  public static void a(String paramString, Exception paramException)
  {
    Log.e("OMIDLIB", paramString, paramException);
  }
  
  public static void a(String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString1)) {
      return;
    }
    throw new IllegalArgumentException(paramString2);
  }
  
  public static View b(View paramView)
  {
    paramView = paramView.getParent();
    if ((paramView instanceof View)) {
      return (View)paramView;
    }
    return null;
  }
  
  public static String b()
  {
    return Integer.toString(Build.VERSION.SDK_INT);
  }
  
  public static String c()
  {
    return "Android";
  }
  
  public static boolean c(View paramView)
  {
    if (!paramView.isAttachedToWindow()) {
      return false;
    }
    View localView = paramView;
    if (!paramView.isShown()) {
      return false;
    }
    while (localView != null)
    {
      if (localView.getAlpha() == 0.0F) {
        return false;
      }
      localView = b(localView);
    }
    return true;
  }
  
  public static JSONObject d()
  {
    JSONObject localJSONObject = new JSONObject();
    aa.a(localJSONObject, "deviceType", a());
    aa.a(localJSONObject, "osVersion", b());
    aa.a(localJSONObject, "os", c());
    return localJSONObject;
  }
  
  public static boolean d(View paramView)
  {
    if (!paramView.isAttachedToWindow()) {
      return false;
    }
    if (paramView.getVisibility() != 0) {
      return false;
    }
    return paramView.getAlpha() != 0.0F;
  }
  
  public static void e() {}
  
  public static long f()
  {
    return System.nanoTime();
  }
  
  public static void g()
  {
    if (b.b()) {
      return;
    }
    throw new IllegalStateException("Method called before OM SDK activation");
  }
  
  public static <T extends fk> fj<T> h()
  {
    return fj.a;
  }
  
  public static void i() {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */