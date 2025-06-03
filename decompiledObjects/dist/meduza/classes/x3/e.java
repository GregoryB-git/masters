package x3;

import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import android.media.AudioFormat.Builder;
import android.util.Pair;
import f;
import java.util.Arrays;
import java.util.Iterator;
import o7.m0;
import o7.r;
import o7.t;
import o7.t.a;
import o7.u.a;
import o7.x;
import r7.a;
import v3.i0;
import v5.e0;
import v5.p;

public final class e
{
  public static final e c;
  public static final e d;
  public static final m0 e;
  public final int[] a;
  public final int b;
  
  static
  {
    Integer localInteger1 = Integer.valueOf(8);
    c = new e(new int[] { 2 }, 8);
    d = new e(new int[] { 2, 5, 6 }, 8);
    u.a locala = new u.a(4);
    Integer localInteger2 = Integer.valueOf(6);
    locala.b(Integer.valueOf(5), localInteger2);
    locala.b(Integer.valueOf(17), localInteger2);
    locala.b(Integer.valueOf(7), localInteger2);
    locala.b(Integer.valueOf(18), localInteger2);
    locala.b(localInteger2, localInteger1);
    locala.b(localInteger1, localInteger1);
    locala.b(Integer.valueOf(14), localInteger1);
    e = locala.a();
  }
  
  public e(int[] paramArrayOfInt, int paramInt)
  {
    if (paramArrayOfInt != null)
    {
      paramArrayOfInt = Arrays.copyOf(paramArrayOfInt, paramArrayOfInt.length);
      a = paramArrayOfInt;
      Arrays.sort(paramArrayOfInt);
    }
    else
    {
      a = new int[0];
    }
    b = paramInt;
  }
  
  public final Pair<Integer, Integer> a(i0 parami0)
  {
    Object localObject = t;
    localObject.getClass();
    int i = p.d((String)localObject, q);
    localObject = e;
    if (!((o7.u)localObject).containsKey(Integer.valueOf(i))) {
      return null;
    }
    int j = 6;
    if (i == 18)
    {
      if (Arrays.binarySearch(a, 18) >= 0) {
        k = 1;
      } else {
        k = 0;
      }
      if (k == 0)
      {
        m = 6;
        break label121;
      }
    }
    int m = i;
    if (i == 8)
    {
      if (Arrays.binarySearch(a, 8) >= 0) {
        k = 1;
      } else {
        k = 0;
      }
      m = i;
      if (k == 0) {
        m = 7;
      }
    }
    label121:
    if (Arrays.binarySearch(a, m) >= 0) {
      k = 1;
    } else {
      k = 0;
    }
    if (k == 0) {
      return null;
    }
    int k = G;
    if ((k != -1) && (m != 18))
    {
      i = k;
      if (k > b) {
        return null;
      }
    }
    else
    {
      k = H;
      if (k == -1) {
        k = 48000;
      }
      if (e0.a >= 29)
      {
        k = a.b(m, k);
      }
      else
      {
        parami0 = (Integer)((o7.u)localObject).getOrDefault(Integer.valueOf(m), Integer.valueOf(0));
        parami0.getClass();
        k = parami0.intValue();
      }
      i = k;
    }
    int n = e0.a;
    if (n <= 28)
    {
      if (i == 7)
      {
        k = 8;
        break label313;
      }
      k = j;
      if (i == 3) {
        break label313;
      }
      k = j;
      if (i == 4) {
        break label313;
      }
      if (i == 5)
      {
        k = j;
        break label313;
      }
    }
    k = i;
    label313:
    i = k;
    if (n <= 26)
    {
      i = k;
      if ("fugu".equals(e0.b))
      {
        i = k;
        if (k == 1) {
          i = 2;
        }
      }
    }
    k = e0.o(i);
    if (k == 0) {
      return null;
    }
    return Pair.create(Integer.valueOf(m), Integer.valueOf(k));
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof e)) {
      return false;
    }
    paramObject = (e)paramObject;
    if ((!Arrays.equals(a, a)) || (b != b)) {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    int i = b;
    return Arrays.hashCode(a) * 31 + i;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("AudioCapabilities[maxChannelCount=");
    localStringBuilder.append(b);
    localStringBuilder.append(", supportedEncodings=");
    localStringBuilder.append(Arrays.toString(a));
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public static final AudioAttributes a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();
    
    public static int[] a()
    {
      Object localObject = t.b;
      t.a locala = new t.a();
      m0 localm0 = e.e;
      x localx = b;
      localObject = localx;
      if (localx == null)
      {
        localObject = localm0.d();
        b = ((x)localObject);
      }
      localObject = ((r)localObject).n();
      while (((Iterator)localObject).hasNext())
      {
        int i = ((Integer)((Iterator)localObject).next()).intValue();
        if (aa.u.t(new AudioFormat.Builder().setChannelMask(12).setEncoding(i).setSampleRate(48000).build(), a)) {
          locala.c(Integer.valueOf(i));
        }
      }
      locala.c(Integer.valueOf(2));
      return a.F(locala.e());
    }
    
    public static int b(int paramInt1, int paramInt2)
    {
      for (int i = 8; i > 0; i--) {
        if (aa.u.t(new AudioFormat.Builder().setEncoding(paramInt1).setSampleRate(paramInt2).setChannelMask(e0.o(i)).build(), a)) {
          return i;
        }
      }
      return 0;
    }
  }
}

/* Location:
 * Qualified Name:     x3.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */