package m0;

import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.AudioTrack.Builder;
import d0.b;
import d0.b.d;
import d0.q;
import e0.a;
import g0.M;

public final class N$g
{
  public final q a;
  public final int b;
  public final int c;
  public final int d;
  public final int e;
  public final int f;
  public final int g;
  public final int h;
  public final a i;
  public final boolean j;
  public final boolean k;
  public final boolean l;
  
  public N$g(q paramq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, a parama, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    a = paramq;
    b = paramInt1;
    c = paramInt2;
    d = paramInt3;
    e = paramInt4;
    f = paramInt5;
    g = paramInt6;
    h = paramInt7;
    i = parama;
    j = paramBoolean1;
    k = paramBoolean2;
    l = paramBoolean3;
  }
  
  public static AudioAttributes j(b paramb, boolean paramBoolean)
  {
    if (paramBoolean) {
      return k();
    }
    return aa;
  }
  
  public static AudioAttributes k()
  {
    return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
  }
  
  /* Error */
  public AudioTrack a(b paramb, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iload_2
    //   3: invokevirtual 91	m0/N$g:e	(Ld0/b;I)Landroid/media/AudioTrack;
    //   6: astore_1
    //   7: aload_1
    //   8: invokevirtual 97	android/media/AudioTrack:getState	()I
    //   11: istore_2
    //   12: iload_2
    //   13: iconst_1
    //   14: if_icmpne +5 -> 19
    //   17: aload_1
    //   18: areturn
    //   19: aload_1
    //   20: invokevirtual 100	android/media/AudioTrack:release	()V
    //   23: new 102	m0/z$c
    //   26: dup
    //   27: iload_2
    //   28: aload_0
    //   29: getfield 37	m0/N$g:e	I
    //   32: aload_0
    //   33: getfield 39	m0/N$g:f	I
    //   36: aload_0
    //   37: getfield 43	m0/N$g:h	I
    //   40: aload_0
    //   41: getfield 29	m0/N$g:a	Ld0/q;
    //   44: aload_0
    //   45: invokevirtual 106	m0/N$g:m	()Z
    //   48: aconst_null
    //   49: invokespecial 109	m0/z$c:<init>	(IIIILd0/q;ZLjava/lang/Exception;)V
    //   52: athrow
    //   53: astore_1
    //   54: goto +7 -> 61
    //   57: astore_1
    //   58: goto -4 -> 54
    //   61: new 102	m0/z$c
    //   64: dup
    //   65: iconst_0
    //   66: aload_0
    //   67: getfield 37	m0/N$g:e	I
    //   70: aload_0
    //   71: getfield 39	m0/N$g:f	I
    //   74: aload_0
    //   75: getfield 43	m0/N$g:h	I
    //   78: aload_0
    //   79: getfield 29	m0/N$g:a	Ld0/q;
    //   82: aload_0
    //   83: invokevirtual 106	m0/N$g:m	()Z
    //   86: aload_1
    //   87: invokespecial 109	m0/z$c:<init>	(IIIILd0/q;ZLjava/lang/Exception;)V
    //   90: athrow
    //   91: astore_1
    //   92: goto -69 -> 23
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	95	0	this	g
    //   0	95	1	paramb	b
    //   0	95	2	paramInt	int
    // Exception table:
    //   from	to	target	type
    //   0	7	53	java/lang/IllegalArgumentException
    //   0	7	57	java/lang/UnsupportedOperationException
    //   19	23	91	java/lang/Exception
  }
  
  public z.a b()
  {
    int m = g;
    int n = e;
    int i1 = f;
    boolean bool1 = l;
    int i2 = c;
    boolean bool2 = true;
    if (i2 != 1) {
      bool2 = false;
    }
    return new z.a(m, n, i1, bool1, bool2, h);
  }
  
  public boolean c(g paramg)
  {
    boolean bool;
    if ((c == c) && (g == g) && (e == e) && (f == f) && (d == d) && (j == j) && (k == k)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public g d(int paramInt)
  {
    return new g(a, b, c, d, e, f, g, paramInt, i, j, k, l);
  }
  
  public final AudioTrack e(b paramb, int paramInt)
  {
    int m = M.a;
    if (m >= 29) {
      return g(paramb, paramInt);
    }
    if (m >= 21) {
      return f(paramb, paramInt);
    }
    return h(paramb, paramInt);
  }
  
  public final AudioTrack f(b paramb, int paramInt)
  {
    return new AudioTrack(j(paramb, l), M.L(e, f, g), h, 1, paramInt);
  }
  
  public final AudioTrack g(b paramb, int paramInt)
  {
    AudioFormat localAudioFormat = M.L(e, f, g);
    paramb = j(paramb, l);
    paramb = new AudioTrack.Builder().setAudioAttributes(paramb).setAudioFormat(localAudioFormat);
    boolean bool = true;
    paramb = paramb.setTransferMode(1).setBufferSizeInBytes(h).setSessionId(paramInt);
    if (c != 1) {
      bool = false;
    }
    return Q.a(paramb, bool).build();
  }
  
  public final AudioTrack h(b paramb, int paramInt)
  {
    int m = M.k0(c);
    paramb = new android/media/AudioTrack;
    int n = e;
    int i1 = f;
    int i2 = g;
    int i3 = h;
    if (paramInt == 0)
    {
      paramb.<init>(m, n, i1, i2, i3, 1);
      return paramb;
    }
    paramb.<init>(m, n, i1, i2, i3, 1, paramInt);
    return paramb;
  }
  
  public long i(long paramLong)
  {
    return M.V0(paramLong, e);
  }
  
  public long l(long paramLong)
  {
    return M.V0(paramLong, a.C);
  }
  
  public boolean m()
  {
    int m = c;
    boolean bool = true;
    if (m != 1) {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     m0.N.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */