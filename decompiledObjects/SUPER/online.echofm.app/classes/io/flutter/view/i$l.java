package io.flutter.view;

import T5.e;
import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan.Builder;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class i$l
{
  public int A = -1;
  public i.p B;
  public boolean C = false;
  public int D;
  public int E;
  public int F;
  public int G;
  public float H;
  public float I;
  public float J;
  public String K;
  public String L;
  public float M;
  public float N;
  public float O;
  public float P;
  public float[] Q;
  public l R;
  public List S = new ArrayList();
  public List T = new ArrayList();
  public List U;
  public i.h V;
  public i.h W;
  public boolean X = true;
  public float[] Y;
  public boolean Z = true;
  public final i a;
  public float[] a0;
  public int b = -1;
  public Rect b0;
  public int c;
  public int d;
  public int e;
  public int f;
  public int g;
  public int h;
  public int i;
  public int j;
  public int k;
  public float l;
  public float m;
  public float n;
  public String o;
  public String p;
  public List q;
  public String r;
  public List s;
  public String t;
  public List u;
  public String v;
  public List w;
  public String x;
  public List y;
  public String z;
  
  public i$l(i parami)
  {
    a = parami;
  }
  
  public static boolean C0(l paraml, e parame)
  {
    boolean bool;
    if ((paraml != null) && (paraml.l0(parame) != null)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final float A0(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    return Math.max(paramFloat1, Math.max(paramFloat2, Math.max(paramFloat3, paramFloat4)));
  }
  
  public final float B0(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    return Math.min(paramFloat1, Math.min(paramFloat2, Math.min(paramFloat3, paramFloat4)));
  }
  
  public final void D0(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3)
  {
    Matrix.multiplyMV(paramArrayOfFloat1, 0, paramArrayOfFloat2, 0, paramArrayOfFloat3, 0);
    float f1 = paramArrayOfFloat1[3];
    paramArrayOfFloat1[0] /= f1;
    paramArrayOfFloat1[1] /= f1;
    paramArrayOfFloat1[2] /= f1;
    paramArrayOfFloat1[3] = 0.0F;
  }
  
  public final void E0(float[] paramArrayOfFloat, Set paramSet, boolean paramBoolean)
  {
    paramSet.add(this);
    if (Z) {
      paramBoolean = true;
    }
    Object localObject;
    if (paramBoolean)
    {
      if (a0 == null) {
        a0 = new float[16];
      }
      if (Q == null) {
        Q = new float[16];
      }
      Matrix.multiplyMM(a0, 0, paramArrayOfFloat, 0, Q, 0);
      float[] arrayOfFloat1 = new float[4];
      float[] arrayOfFloat2 = new float[4];
      float[] arrayOfFloat3 = new float[4];
      paramArrayOfFloat = new float[4];
      float f1 = M;
      float f2 = N;
      localObject = new float[4];
      localObject[0] = f1;
      localObject[1] = f2;
      localObject[2] = 0.0F;
      localObject[3] = 1.0F;
      D0(arrayOfFloat1, a0, (float[])localObject);
      localObject[0] = O;
      localObject[1] = N;
      D0(arrayOfFloat2, a0, (float[])localObject);
      localObject[0] = O;
      localObject[1] = P;
      D0(arrayOfFloat3, a0, (float[])localObject);
      localObject[0] = M;
      localObject[1] = P;
      D0(paramArrayOfFloat, a0, (float[])localObject);
      if (b0 == null) {
        b0 = new Rect();
      }
      b0.set(Math.round(B0(arrayOfFloat1[0], arrayOfFloat2[0], arrayOfFloat3[0], paramArrayOfFloat[0])), Math.round(B0(arrayOfFloat1[1], arrayOfFloat2[1], arrayOfFloat3[1], paramArrayOfFloat[1])), Math.round(A0(arrayOfFloat1[0], arrayOfFloat2[0], arrayOfFloat3[0], paramArrayOfFloat[0])), Math.round(A0(arrayOfFloat1[1], arrayOfFloat2[1], arrayOfFloat3[1], paramArrayOfFloat[1])));
      Z = false;
    }
    paramArrayOfFloat = S.iterator();
    int i1 = -1;
    while (paramArrayOfFloat.hasNext())
    {
      localObject = (l)paramArrayOfFloat.next();
      A = i1;
      i1 = b;
      ((l)localObject).E0(a0, paramSet, paramBoolean);
    }
  }
  
  public final void F0(ByteBuffer paramByteBuffer, String[] paramArrayOfString, ByteBuffer[] paramArrayOfByteBuffer)
  {
    C = true;
    K = r;
    L = p;
    D = c;
    E = d;
    F = g;
    G = h;
    H = l;
    I = m;
    J = n;
    c = paramByteBuffer.getInt();
    d = paramByteBuffer.getInt();
    e = paramByteBuffer.getInt();
    f = paramByteBuffer.getInt();
    g = paramByteBuffer.getInt();
    h = paramByteBuffer.getInt();
    i = paramByteBuffer.getInt();
    j = paramByteBuffer.getInt();
    k = paramByteBuffer.getInt();
    l = paramByteBuffer.getFloat();
    m = paramByteBuffer.getFloat();
    n = paramByteBuffer.getFloat();
    int i1 = paramByteBuffer.getInt();
    String str;
    if (i1 == -1) {
      str = null;
    } else {
      str = paramArrayOfString[i1];
    }
    o = str;
    i1 = paramByteBuffer.getInt();
    if (i1 == -1) {
      str = null;
    } else {
      str = paramArrayOfString[i1];
    }
    p = str;
    q = q0(paramByteBuffer, paramArrayOfByteBuffer);
    i1 = paramByteBuffer.getInt();
    if (i1 == -1) {
      str = null;
    } else {
      str = paramArrayOfString[i1];
    }
    r = str;
    s = q0(paramByteBuffer, paramArrayOfByteBuffer);
    i1 = paramByteBuffer.getInt();
    if (i1 == -1) {
      str = null;
    } else {
      str = paramArrayOfString[i1];
    }
    t = str;
    u = q0(paramByteBuffer, paramArrayOfByteBuffer);
    i1 = paramByteBuffer.getInt();
    if (i1 == -1) {
      str = null;
    } else {
      str = paramArrayOfString[i1];
    }
    v = str;
    w = q0(paramByteBuffer, paramArrayOfByteBuffer);
    i1 = paramByteBuffer.getInt();
    if (i1 == -1) {
      str = null;
    } else {
      str = paramArrayOfString[i1];
    }
    x = str;
    y = q0(paramByteBuffer, paramArrayOfByteBuffer);
    i1 = paramByteBuffer.getInt();
    if (i1 == -1) {
      paramArrayOfString = null;
    } else {
      paramArrayOfString = paramArrayOfString[i1];
    }
    z = paramArrayOfString;
    B = i.p.e(paramByteBuffer.getInt());
    M = paramByteBuffer.getFloat();
    N = paramByteBuffer.getFloat();
    O = paramByteBuffer.getFloat();
    P = paramByteBuffer.getFloat();
    if (Q == null) {
      Q = new float[16];
    }
    int i2 = 0;
    for (i1 = 0; i1 < 16; i1++) {
      Q[i1] = paramByteBuffer.getFloat();
    }
    X = true;
    Z = true;
    int i3 = paramByteBuffer.getInt();
    S.clear();
    T.clear();
    for (i1 = 0; i1 < i3; i1++)
    {
      paramArrayOfString = i.o(a, paramByteBuffer.getInt());
      R = this;
      S.add(paramArrayOfString);
    }
    for (i1 = 0; i1 < i3; i1++)
    {
      paramArrayOfString = i.o(a, paramByteBuffer.getInt());
      R = this;
      T.add(paramArrayOfString);
    }
    i3 = paramByteBuffer.getInt();
    if (i3 == 0)
    {
      U = null;
    }
    else
    {
      paramArrayOfString = U;
      if (paramArrayOfString == null)
      {
        U = new ArrayList(i3);
        i1 = i2;
      }
      else
      {
        paramArrayOfString.clear();
      }
      for (i1 = i2; i1 < i3; i1++)
      {
        paramArrayOfString = i.p(a, paramByteBuffer.getInt());
        if (i.h.i(paramArrayOfString) == po) {
          V = paramArrayOfString;
        } else if (i.h.i(paramArrayOfString) == qo) {
          W = paramArrayOfString;
        } else {
          U.add(paramArrayOfString);
        }
        U.add(paramArrayOfString);
      }
    }
  }
  
  public final void g0(List paramList)
  {
    if (x0(i.i.A)) {
      paramList.add(this);
    }
    Iterator localIterator = S.iterator();
    while (localIterator.hasNext()) {
      ((l)localIterator.next()).g0(paramList);
    }
  }
  
  public final SpannableString h0(String paramString, List paramList)
  {
    if (paramString == null) {
      return null;
    }
    paramString = new SpannableString(paramString);
    if (paramList != null)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        i.n localn = (i.n)paramList.next();
        int i1 = i.e.a[c.ordinal()];
        if (i1 != 1)
        {
          if (i1 == 2) {
            paramString.setSpan(new LocaleSpan(Locale.forLanguageTag(d)), a, b, 0);
          }
        }
        else {
          paramString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), a, b, 0);
        }
      }
    }
    return paramString;
  }
  
  public final boolean i0()
  {
    String str1 = p;
    boolean bool = false;
    if ((str1 == null) && (L == null)) {
      return false;
    }
    if (str1 != null)
    {
      String str2 = L;
      if ((str2 != null) && (str1.equals(str2))) {}
    }
    else
    {
      bool = true;
    }
    return bool;
  }
  
  public final boolean j0()
  {
    boolean bool;
    if ((!Float.isNaN(l)) && (!Float.isNaN(H)) && (H != l)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void k0()
  {
    if (!X) {
      return;
    }
    X = false;
    if (Y == null) {
      Y = new float[16];
    }
    if (!Matrix.invertM(Y, 0, Q, 0)) {
      Arrays.fill(Y, 0.0F);
    }
  }
  
  public final l l0(e parame)
  {
    for (l locall = R; locall != null; locall = R) {
      if (parame.test(locall)) {
        return locall;
      }
    }
    return null;
  }
  
  public final Rect m0()
  {
    return b0;
  }
  
  public final CharSequence n0()
  {
    return h0(x, y);
  }
  
  public final CharSequence o0()
  {
    return h0(p, q);
  }
  
  public final String p0()
  {
    if (x0(i.i.B))
    {
      localObject = p;
      if ((localObject != null) && (!((String)localObject).isEmpty())) {
        return p;
      }
    }
    Object localObject = S.iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = ((l)((Iterator)localObject).next()).p0();
      if ((str != null) && (!str.isEmpty())) {
        return str;
      }
    }
    return null;
  }
  
  public final List q0(ByteBuffer paramByteBuffer, ByteBuffer[] paramArrayOfByteBuffer)
  {
    int i1 = paramByteBuffer.getInt();
    if (i1 == -1) {
      return null;
    }
    ArrayList localArrayList = new ArrayList(i1);
    for (int i2 = 0; i2 < i1; i2++)
    {
      int i3 = paramByteBuffer.getInt();
      int i4 = paramByteBuffer.getInt();
      i.o localo = i.o.values()[paramByteBuffer.getInt()];
      int i5 = i.e.a[localo.ordinal()];
      Object localObject;
      if (i5 != 1)
      {
        if (i5 == 2)
        {
          localObject = paramArrayOfByteBuffer[paramByteBuffer.getInt()];
          i.j localj = new i.j(null);
          a = i3;
          b = i4;
          c = localo;
          d = Charset.forName("UTF-8").decode((ByteBuffer)localObject).toString();
          localArrayList.add(localj);
        }
      }
      else
      {
        paramByteBuffer.getInt();
        localObject = new i.m(null);
        a = i3;
        b = i4;
        c = localo;
        localArrayList.add(localObject);
      }
    }
    return localArrayList;
  }
  
  public final CharSequence r0()
  {
    CharSequence localCharSequence1 = o0();
    CharSequence localCharSequence2 = n0();
    Object localObject1 = null;
    int i1 = 0;
    while (i1 < 2)
    {
      CharSequence localCharSequence3 = new CharSequence[] { localCharSequence1, localCharSequence2 }[i1];
      Object localObject2 = localObject1;
      if (localCharSequence3 != null)
      {
        localObject2 = localObject1;
        if (localCharSequence3.length() > 0) {
          if ((localObject1 != null) && (((CharSequence)localObject1).length() != 0)) {
            localObject2 = TextUtils.concat(new CharSequence[] { localObject1, ", ", localCharSequence3 });
          } else {
            localObject2 = localCharSequence3;
          }
        }
      }
      i1++;
      localObject1 = localObject2;
    }
    return (CharSequence)localObject1;
  }
  
  public final CharSequence s0()
  {
    return h0(r, s);
  }
  
  public final CharSequence t0()
  {
    CharSequence localCharSequence1 = s0();
    CharSequence localCharSequence2 = o0();
    CharSequence localCharSequence3 = n0();
    Object localObject1 = null;
    int i1 = 0;
    while (i1 < 3)
    {
      CharSequence localCharSequence4 = new CharSequence[] { localCharSequence1, localCharSequence2, localCharSequence3 }[i1];
      Object localObject2 = localObject1;
      if (localCharSequence4 != null)
      {
        localObject2 = localObject1;
        if (localCharSequence4.length() > 0) {
          if ((localObject1 != null) && (((CharSequence)localObject1).length() != 0)) {
            localObject2 = TextUtils.concat(new CharSequence[] { localObject1, ", ", localCharSequence4 });
          } else {
            localObject2 = localCharSequence4;
          }
        }
      }
      i1++;
      localObject1 = localObject2;
    }
    return (CharSequence)localObject1;
  }
  
  public final boolean u0(i.g paramg)
  {
    int i1 = E;
    boolean bool;
    if ((o & i1) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean v0(i.i parami)
  {
    int i1 = D;
    boolean bool;
    if ((o & i1) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean w0(i.g paramg)
  {
    int i1 = d;
    boolean bool;
    if ((o & i1) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean x0(i.i parami)
  {
    int i1 = c;
    boolean bool;
    if ((o & i1) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final l y0(float[] paramArrayOfFloat, boolean paramBoolean)
  {
    float f1 = paramArrayOfFloat[3];
    int i1 = 0;
    float f2 = paramArrayOfFloat[0] / f1;
    float f3 = paramArrayOfFloat[1] / f1;
    f1 = M;
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (f2 >= f1)
    {
      localObject2 = localObject1;
      if (f2 < O)
      {
        localObject2 = localObject1;
        if (f3 >= N) {
          if (f3 >= P)
          {
            localObject2 = localObject1;
          }
          else
          {
            float[] arrayOfFloat = new float[4];
            localObject2 = T.iterator();
            while (((Iterator)localObject2).hasNext())
            {
              l locall = (l)((Iterator)localObject2).next();
              if (!locall.x0(i.i.C))
              {
                locall.k0();
                Matrix.multiplyMV(arrayOfFloat, 0, Y, 0, paramArrayOfFloat, 0);
                locall = locall.y0(arrayOfFloat, paramBoolean);
                if (locall != null) {
                  return locall;
                }
              }
            }
            int i2 = i1;
            if (paramBoolean)
            {
              i2 = i1;
              if (i != -1) {
                i2 = 1;
              }
            }
            if (!z0())
            {
              localObject2 = localObject1;
              if (i2 == 0) {}
            }
            else
            {
              localObject2 = this;
            }
          }
        }
      }
    }
    return (l)localObject2;
  }
  
  public final boolean z0()
  {
    boolean bool1 = x0(i.i.A);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    if (x0(i.i.K)) {
      return true;
    }
    if (((d & i.q()) == 0) && ((c & i.r()) == 0))
    {
      String str = p;
      if ((str == null) || (str.isEmpty()))
      {
        str = r;
        if ((str == null) || (str.isEmpty()))
        {
          str = x;
          bool1 = bool2;
          if (str == null) {
            return bool1;
          }
          bool1 = bool2;
          if (str.isEmpty()) {
            return bool1;
          }
        }
      }
    }
    bool1 = true;
    return bool1;
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.i.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */