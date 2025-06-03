package x3;

import aa.v;
import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.AudioTrack.Builder;
import v3.i0;
import v5.e0;

public final class s$f
{
  public final i0 a;
  public final int b;
  public final int c;
  public final int d;
  public final int e;
  public final int f;
  public final int g;
  public final int h;
  public final f[] i;
  
  public s$f(i0 parami0, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, f[] paramArrayOff)
  {
    a = parami0;
    b = paramInt1;
    c = paramInt2;
    d = paramInt3;
    e = paramInt4;
    f = paramInt5;
    g = paramInt6;
    h = paramInt7;
    i = paramArrayOff;
  }
  
  public static AudioAttributes c(d paramd, boolean paramBoolean)
  {
    if (paramBoolean) {
      return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }
    return aa;
  }
  
  /* Error */
  public final AudioTrack a(boolean paramBoolean, d paramd, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: aload_2
    //   3: iload_3
    //   4: invokevirtual 79	x3/s$f:b	(ZLx3/d;I)Landroid/media/AudioTrack;
    //   7: astore_2
    //   8: aload_2
    //   9: invokevirtual 85	android/media/AudioTrack:getState	()I
    //   12: istore_3
    //   13: iload_3
    //   14: iconst_1
    //   15: if_icmpne +5 -> 20
    //   18: aload_2
    //   19: areturn
    //   20: aload_2
    //   21: invokevirtual 88	android/media/AudioTrack:release	()V
    //   24: aload_0
    //   25: getfield 33	x3/s$f:e	I
    //   28: istore 4
    //   30: aload_0
    //   31: getfield 35	x3/s$f:f	I
    //   34: istore 5
    //   36: aload_0
    //   37: getfield 39	x3/s$f:h	I
    //   40: istore 6
    //   42: aload_0
    //   43: getfield 25	x3/s$f:a	Lv3/i0;
    //   46: astore_2
    //   47: aload_0
    //   48: getfield 29	x3/s$f:c	I
    //   51: iconst_1
    //   52: if_icmpne +8 -> 60
    //   55: iconst_1
    //   56: istore_1
    //   57: goto +5 -> 62
    //   60: iconst_0
    //   61: istore_1
    //   62: new 90	x3/m$b
    //   65: dup
    //   66: iload_3
    //   67: iload 4
    //   69: iload 5
    //   71: iload 6
    //   73: aload_2
    //   74: iload_1
    //   75: aconst_null
    //   76: invokespecial 93	x3/m$b:<init>	(IIIILv3/i0;ZLjava/lang/RuntimeException;)V
    //   79: athrow
    //   80: astore_2
    //   81: goto +4 -> 85
    //   84: astore_2
    //   85: aload_0
    //   86: getfield 33	x3/s$f:e	I
    //   89: istore 5
    //   91: aload_0
    //   92: getfield 35	x3/s$f:f	I
    //   95: istore 4
    //   97: aload_0
    //   98: getfield 39	x3/s$f:h	I
    //   101: istore_3
    //   102: aload_0
    //   103: getfield 25	x3/s$f:a	Lv3/i0;
    //   106: astore 7
    //   108: aload_0
    //   109: getfield 29	x3/s$f:c	I
    //   112: iconst_1
    //   113: if_icmpne +8 -> 121
    //   116: iconst_1
    //   117: istore_1
    //   118: goto +5 -> 123
    //   121: iconst_0
    //   122: istore_1
    //   123: new 90	x3/m$b
    //   126: dup
    //   127: iconst_0
    //   128: iload 5
    //   130: iload 4
    //   132: iload_3
    //   133: aload 7
    //   135: iload_1
    //   136: aload_2
    //   137: invokespecial 93	x3/m$b:<init>	(IIIILv3/i0;ZLjava/lang/RuntimeException;)V
    //   140: athrow
    //   141: astore_2
    //   142: goto -118 -> 24
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	145	0	this	f
    //   0	145	1	paramBoolean	boolean
    //   0	145	2	paramd	d
    //   0	145	3	paramInt	int
    //   28	103	4	j	int
    //   34	95	5	k	int
    //   40	32	6	m	int
    //   106	28	7	locali0	i0
    // Exception table:
    //   from	to	target	type
    //   0	8	80	java/lang/IllegalArgumentException
    //   0	8	84	java/lang/UnsupportedOperationException
    //   20	24	141	java/lang/Exception
  }
  
  public final AudioTrack b(boolean paramBoolean, d paramd, int paramInt)
  {
    int j = e0.a;
    if (j >= 29)
    {
      AudioFormat localAudioFormat = s.x(e, f, g);
      paramd = c(paramd, paramBoolean);
      paramd = new AudioTrack.Builder().setAudioAttributes(paramd).setAudioFormat(localAudioFormat);
      paramBoolean = true;
      paramd = paramd.setTransferMode(1).setBufferSizeInBytes(h).setSessionId(paramInt);
      if (c != 1) {
        paramBoolean = false;
      }
      return v.d(paramd, paramBoolean).build();
    }
    if (j >= 21) {
      return new AudioTrack(c(paramd, paramBoolean), s.x(e, f, g), h, 1, paramInt);
    }
    int k = e0.y(c);
    paramd = new android/media/AudioTrack;
    int m = e;
    int n = f;
    j = g;
    int i1 = h;
    if (paramInt == 0) {
      paramd.<init>(k, m, n, j, i1, 1);
    } else {
      paramd.<init>(k, m, n, j, i1, 1, paramInt);
    }
    return paramd;
  }
}

/* Location:
 * Qualified Name:     x3.s.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */