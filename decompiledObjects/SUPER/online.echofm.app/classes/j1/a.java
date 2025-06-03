package j1;

import X2.v;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import c1.t;
import c1.t.b;
import f0.a.b;
import g0.M;
import g0.g;
import g0.o;
import g0.z;
import java.nio.charset.Charset;
import java.util.List;

public final class a
  implements t
{
  public final z a = new z();
  public final boolean b;
  public final int c;
  public final int d;
  public final String e;
  public final float f;
  public final int g;
  
  public a(List paramList)
  {
    int i = paramList.size();
    String str = "sans-serif";
    boolean bool = false;
    if ((i == 1) && ((((byte[])paramList.get(0)).length == 48) || (((byte[])paramList.get(0)).length == 53)))
    {
      byte[] arrayOfByte = (byte[])paramList.get(0);
      c = arrayOfByte[24];
      d = ((arrayOfByte[26] & 0xFF) << 24 | (arrayOfByte[27] & 0xFF) << 16 | (arrayOfByte[28] & 0xFF) << 8 | arrayOfByte[29] & 0xFF);
      paramList = str;
      if ("Serif".equals(M.I(arrayOfByte, 43, arrayOfByte.length - 43))) {
        paramList = "serif";
      }
      e = paramList;
      int j = arrayOfByte[25] * 20;
      g = j;
      if ((arrayOfByte[0] & 0x20) != 0) {
        bool = true;
      }
      b = bool;
      if (bool)
      {
        i = arrayOfByte[10];
        f = M.o((arrayOfByte[11] & 0xFF | (i & 0xFF) << 8) / j, 0.0F, 0.95F);
      }
      else
      {
        f = 0.85F;
      }
    }
    else
    {
      c = 0;
      d = -1;
      e = "sans-serif";
      b = false;
      f = 0.85F;
      g = -1;
    }
  }
  
  public static void f(SpannableStringBuilder paramSpannableStringBuilder, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt1 != paramInt2) {
      paramSpannableStringBuilder.setSpan(new ForegroundColorSpan(paramInt1 >>> 8 | (paramInt1 & 0xFF) << 24), paramInt3, paramInt4, paramInt5 | 0x21);
    }
  }
  
  public static void g(SpannableStringBuilder paramSpannableStringBuilder, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt1 != paramInt2)
    {
      int i = paramInt5 | 0x21;
      int j = 1;
      if ((paramInt1 & 0x1) != 0) {
        paramInt2 = 1;
      } else {
        paramInt2 = 0;
      }
      if ((paramInt1 & 0x2) != 0) {
        paramInt5 = 1;
      } else {
        paramInt5 = 0;
      }
      StyleSpan localStyleSpan;
      if (paramInt2 != 0)
      {
        localStyleSpan = new android/text/style/StyleSpan;
        if (paramInt5 != 0) {
          localStyleSpan.<init>(3);
        }
      }
      for (;;)
      {
        paramSpannableStringBuilder.setSpan(localStyleSpan, paramInt3, paramInt4, i);
        break;
        localStyleSpan.<init>(1);
        continue;
        if (paramInt5 == 0) {
          break;
        }
        localStyleSpan = new StyleSpan(2);
      }
      if ((paramInt1 & 0x4) != 0) {
        paramInt1 = j;
      } else {
        paramInt1 = 0;
      }
      if (paramInt1 != 0) {
        paramSpannableStringBuilder.setSpan(new UnderlineSpan(), paramInt3, paramInt4, i);
      }
      if ((paramInt1 == 0) && (paramInt2 == 0) && (paramInt5 == 0)) {
        paramSpannableStringBuilder.setSpan(new StyleSpan(0), paramInt3, paramInt4, i);
      }
    }
  }
  
  public static void h(SpannableStringBuilder paramSpannableStringBuilder, String paramString, int paramInt1, int paramInt2)
  {
    if (paramString != "sans-serif") {
      paramSpannableStringBuilder.setSpan(new TypefaceSpan(paramString), paramInt1, paramInt2, 16711713);
    }
  }
  
  public static String i(z paramz)
  {
    boolean bool;
    if (paramz.a() >= 2) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.a(bool);
    int i = paramz.M();
    if (i == 0) {
      return "";
    }
    int j = paramz.f();
    Charset localCharset = paramz.O();
    int k = paramz.f();
    if (localCharset == null) {
      localCharset = W2.e.c;
    }
    return paramz.E(i - (k - j), localCharset);
  }
  
  public void c(byte[] paramArrayOfByte, int paramInt1, int paramInt2, t.b paramb, g paramg)
  {
    a.R(paramArrayOfByte, paramInt1 + paramInt2);
    a.T(paramInt1);
    paramArrayOfByte = i(a);
    if (paramArrayOfByte.isEmpty())
    {
      paramg.accept(new c1.e(v.Y(), -9223372036854775807L, -9223372036854775807L));
      return;
    }
    paramArrayOfByte = new SpannableStringBuilder(paramArrayOfByte);
    g(paramArrayOfByte, c, 0, 0, paramArrayOfByte.length(), 16711680);
    f(paramArrayOfByte, d, -1, 0, paramArrayOfByte.length(), 16711680);
    h(paramArrayOfByte, e, 0, paramArrayOfByte.length());
    float f2;
    for (float f1 = f; a.a() >= 8; f1 = f2)
    {
      int i = a.f();
      paramInt2 = a.p();
      paramInt1 = a.p();
      boolean bool1 = true;
      boolean bool2 = true;
      if (paramInt1 == 1937013100)
      {
        if (a.a() < 2) {
          bool2 = false;
        }
        g0.a.a(bool2);
        int j = a.M();
        for (paramInt1 = 0;; paramInt1++)
        {
          f2 = f1;
          if (paramInt1 >= j) {
            break;
          }
          e(a, paramArrayOfByte);
        }
      }
      f2 = f1;
      if (paramInt1 == 1952608120)
      {
        f2 = f1;
        if (b)
        {
          if (a.a() >= 2) {
            bool2 = bool1;
          } else {
            bool2 = false;
          }
          g0.a.a(bool2);
          f2 = M.o(a.M() / g, 0.0F, 0.95F);
        }
      }
      a.T(i + paramInt2);
    }
    paramg.accept(new c1.e(v.Z(new a.b().o(paramArrayOfByte).h(f1, 0).i(0).a()), -9223372036854775807L, -9223372036854775807L));
  }
  
  public int d()
  {
    return 2;
  }
  
  public final void e(z paramz, SpannableStringBuilder paramSpannableStringBuilder)
  {
    boolean bool;
    if (paramz.a() >= 12) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.a(bool);
    int i = paramz.M();
    int j = paramz.M();
    paramz.U(2);
    int k = paramz.G();
    paramz.U(1);
    int m = paramz.p();
    int n = j;
    if (j > paramSpannableStringBuilder.length())
    {
      paramz = new StringBuilder();
      paramz.append("Truncating styl end (");
      paramz.append(j);
      paramz.append(") to cueText.length() (");
      paramz.append(paramSpannableStringBuilder.length());
      paramz.append(").");
      o.h("Tx3gParser", paramz.toString());
      n = paramSpannableStringBuilder.length();
    }
    if (i >= n)
    {
      paramz = new StringBuilder();
      paramz.append("Ignoring styl with start (");
      paramz.append(i);
      paramz.append(") >= end (");
      paramz.append(n);
      paramz.append(").");
      o.h("Tx3gParser", paramz.toString());
      return;
    }
    g(paramSpannableStringBuilder, k, c, i, n, 0);
    f(paramSpannableStringBuilder, m, d, i, n, 0);
  }
}

/* Location:
 * Qualified Name:     j1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */