package com.google.ads.interactivemedia.v3.internal;

import z2;

public final class gc
{
  private static final String[] h = { "audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg" };
  private static final int[] i = { 44100, 48000, 32000 };
  private static final int[] j = { 32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000 };
  private static final int[] k = { 32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000 };
  private static final int[] l = { 32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000 };
  private static final int[] m = { 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000 };
  private static final int[] n = { 8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000 };
  public int a;
  public String b;
  public int c;
  public int d;
  public int e;
  public int f;
  public int g;
  
  public static int a(int paramInt)
  {
    if ((paramInt & 0xFFE00000) != -2097152) {
      return -1;
    }
    int i1 = paramInt >>> 19 & 0x3;
    if (i1 == 1) {
      return -1;
    }
    int i2 = paramInt >>> 17 & 0x3;
    if (i2 == 0) {
      return -1;
    }
    int i3 = paramInt >>> 12 & 0xF;
    if ((i3 != 0) && (i3 != 15))
    {
      int i4 = paramInt >>> 10 & 0x3;
      if (i4 == 3) {
        return -1;
      }
      int i5 = i[i4];
      if (i1 == 2)
      {
        i4 = i5 / 2;
      }
      else
      {
        i4 = i5;
        if (i1 == 0) {
          i4 = i5 / 4;
        }
      }
      int i6 = paramInt >>> 9 & 0x1;
      if (i2 == 3)
      {
        if (i1 == 3) {
          paramInt = j[(i3 - 1)];
        } else {
          paramInt = k[(i3 - 1)];
        }
        return z2.a(paramInt, 12, i4, i6) << 2;
      }
      if (i1 == 3)
      {
        if (i2 == 2) {
          paramInt = l[(i3 - 1)];
        } else {
          paramInt = m[(i3 - 1)];
        }
      }
      else {
        paramInt = n[(i3 - 1)];
      }
      i5 = 144;
      if (i1 == 3) {
        return z2.a(paramInt, 144, i4, i6);
      }
      if (i2 == 1) {
        i5 = 72;
      }
      return z2.a(i5, paramInt, i4, i6);
    }
    return -1;
  }
  
  public static boolean a(int paramInt, gc paramgc)
  {
    if ((paramInt & 0xFFE00000) != -2097152) {
      return false;
    }
    int i1 = paramInt >>> 19 & 0x3;
    if (i1 == 1) {
      return false;
    }
    int i2 = paramInt >>> 17 & 0x3;
    if (i2 == 0) {
      return false;
    }
    int i3 = paramInt >>> 12 & 0xF;
    if ((i3 != 0) && (i3 != 15))
    {
      int i4 = paramInt >>> 10 & 0x3;
      if (i4 == 3) {
        return false;
      }
      i4 = i[i4];
      int i5 = 2;
      int i6;
      if (i1 == 2)
      {
        i6 = i4 / 2;
      }
      else
      {
        i6 = i4;
        if (i1 == 0) {
          i6 = i4 / 4;
        }
      }
      int i7 = paramInt >>> 9 & 0x1;
      int i8;
      if (i2 == 3)
      {
        if (i1 == 3) {
          i4 = j[(i3 - 1)];
        } else {
          i4 = k[(i3 - 1)];
        }
        i8 = z2.a(i4, 12, i6, i7) << 2;
        i3 = 384;
      }
      else
      {
        i8 = 1152;
        if (i1 == 3)
        {
          if (i2 == 2)
          {
            i4 = l[(i3 - 1)];
            i3 = i8;
          }
          else
          {
            i4 = m[(i3 - 1)];
            i3 = i8;
          }
        }
        else
        {
          i9 = n[(i3 - 1)];
          if (i2 == 1) {
            i8 = 576;
          }
          i4 = i9;
          i3 = i8;
          if (i2 == 1)
          {
            i3 = 72;
            i4 = i9;
            i9 = i3;
            break label287;
          }
        }
        i9 = 144;
        i8 = i3;
        label287:
        i9 = z2.a(i9, i4, i6, i7);
        i3 = i8;
        i8 = i9;
      }
      String str = h[(3 - i2)];
      int i9 = i5;
      if ((paramInt >> 6 & 0x3) == 3) {
        i9 = 1;
      }
      a = i1;
      b = str;
      c = i8;
      d = i6;
      e = i9;
      f = i4;
      g = i3;
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.gc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */