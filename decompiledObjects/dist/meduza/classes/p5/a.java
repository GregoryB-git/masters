package p5;

import a0.j;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import h5.a.a;
import h5.f;
import h5.g;
import h5.i;
import java.util.List;
import n7.d;
import v5.e0;
import v5.m;
import v5.u;

public final class a
  extends f
{
  public final u m = new u();
  public final boolean n;
  public final int o;
  public final int p;
  public final String q;
  public final float r;
  public final int s;
  
  public a(List<byte[]> paramList)
  {
    int i = paramList.size();
    String str = "sans-serif";
    boolean bool = true;
    if ((i == 1) && ((((byte[])paramList.get(0)).length == 48) || (((byte[])paramList.get(0)).length == 53)))
    {
      byte[] arrayOfByte = (byte[])paramList.get(0);
      o = arrayOfByte[24];
      p = ((arrayOfByte[26] & 0xFF) << 24 | (arrayOfByte[27] & 0xFF) << 16 | (arrayOfByte[28] & 0xFF) << 8 | arrayOfByte[29] & 0xFF);
      int j = arrayOfByte.length;
      i = e0.a;
      paramList = str;
      if ("Serif".equals(new String(arrayOfByte, 43, j - 43, d.c))) {
        paramList = "serif";
      }
      q = paramList;
      j = arrayOfByte[25] * 20;
      s = j;
      if ((arrayOfByte[0] & 0x20) == 0) {
        bool = false;
      }
      n = bool;
      if (bool)
      {
        i = arrayOfByte[10];
        r = e0.h((arrayOfByte[11] & 0xFF | (i & 0xFF) << 8) / j, 0.0F, 0.95F);
      }
      else
      {
        r = 0.85F;
      }
    }
    else
    {
      o = 0;
      p = -1;
      q = "sans-serif";
      n = false;
      r = 0.85F;
      s = -1;
    }
  }
  
  public static void i(SpannableStringBuilder paramSpannableStringBuilder, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
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
        } else {
          localStyleSpan.<init>(1);
        }
      }
      else
      {
        if (paramInt5 == 0) {
          break label101;
        }
        localStyleSpan = new StyleSpan(2);
      }
      paramSpannableStringBuilder.setSpan(localStyleSpan, paramInt3, paramInt4, i);
      label101:
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
  
  public final g h(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    m.E(paramArrayOfByte, paramInt);
    Object localObject = m;
    int i = c;
    paramInt = b;
    int j = 2;
    if (i - paramInt >= 2) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    if (paramInt != 0)
    {
      int k = ((u)localObject).A();
      if (k == 0)
      {
        paramArrayOfByte = "";
      }
      else
      {
        i = b;
        paramArrayOfByte = ((u)localObject).C();
        paramInt = b;
        if (paramArrayOfByte == null) {
          paramArrayOfByte = d.c;
        }
        paramArrayOfByte = ((u)localObject).t(k - (paramInt - i), paramArrayOfByte);
      }
      if (paramArrayOfByte.isEmpty()) {
        return b.b;
      }
      paramArrayOfByte = new SpannableStringBuilder(paramArrayOfByte);
      i(paramArrayOfByte, o, 0, 0, paramArrayOfByte.length(), 16711680);
      i = p;
      paramInt = paramArrayOfByte.length();
      if (i != -1) {
        paramArrayOfByte.setSpan(new ForegroundColorSpan(i >>> 8 | (i & 0xFF) << 24), 0, paramInt, 16711713);
      }
      localObject = q;
      paramInt = paramArrayOfByte.length();
      if (localObject != "sans-serif") {
        paramArrayOfByte.setSpan(new TypefaceSpan((String)localObject), 0, paramInt, 16711713);
      }
      float f = r;
      paramInt = j;
      for (;;)
      {
        int i1 = 0;
        localObject = m;
        j = c;
        int i2 = b;
        if (j - i2 < 8) {
          break;
        }
        int i3 = ((u)localObject).f();
        j = m.f();
        if (j == 1937013100)
        {
          localObject = m;
          if (c - b >= paramInt) {
            j = 1;
          } else {
            j = 0;
          }
          if (j != 0)
          {
            k = ((u)localObject).A();
            int i4 = 1;
            i = 0;
            j = paramInt;
            paramInt = i4;
            while (i1 < k)
            {
              localObject = m;
              if (c - b >= 12) {
                i = paramInt;
              }
              if (i != 0)
              {
                i4 = ((u)localObject).A();
                i = ((u)localObject).A();
                ((u)localObject).H(j);
                j = ((u)localObject).v();
                ((u)localObject).H(paramInt);
                int i5 = ((u)localObject).f();
                paramInt = i;
                if (i > paramArrayOfByte.length())
                {
                  localObject = j.n("Truncating styl end (", i, ") to cueText.length() (");
                  ((StringBuilder)localObject).append(paramArrayOfByte.length());
                  ((StringBuilder)localObject).append(").");
                  m.f("Tx3gDecoder", ((StringBuilder)localObject).toString());
                  paramInt = paramArrayOfByte.length();
                }
                if (i4 >= paramInt)
                {
                  localObject = new StringBuilder();
                  ((StringBuilder)localObject).append("Ignoring styl with start (");
                  ((StringBuilder)localObject).append(i4);
                  ((StringBuilder)localObject).append(") >= end (");
                  ((StringBuilder)localObject).append(paramInt);
                  ((StringBuilder)localObject).append(").");
                  m.f("Tx3gDecoder", ((StringBuilder)localObject).toString());
                }
                else
                {
                  i(paramArrayOfByte, j, o, i4, paramInt, 0);
                  if (i5 != p) {
                    paramArrayOfByte.setSpan(new ForegroundColorSpan(i5 >>> 8 | (i5 & 0xFF) << 24), i4, paramInt, 33);
                  }
                }
                i1++;
                i = 0;
                paramInt = 1;
                j = 2;
              }
              else
              {
                throw new i("Unexpected subtitle format.");
              }
            }
            paramInt = j;
          }
          else
          {
            throw new i("Unexpected subtitle format.");
          }
        }
        else if ((j == 1952608120) && (n))
        {
          localObject = m;
          if (c - b >= 2) {
            paramInt = 1;
          } else {
            paramInt = 0;
          }
          if (paramInt != 0)
          {
            f = e0.h(((u)localObject).A() / s, 0.0F, 0.95F);
            paramInt = 2;
          }
          else
          {
            throw new i("Unexpected subtitle format.");
          }
        }
        else
        {
          paramInt = 2;
        }
        m.G(i2 + i3);
      }
      localObject = new a.a();
      a = paramArrayOfByte;
      e = f;
      f = 0;
      g = 0;
      return new b(((a.a)localObject).a());
    }
    throw new i("Unexpected subtitle format.");
  }
}

/* Location:
 * Qualified Name:     p5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */