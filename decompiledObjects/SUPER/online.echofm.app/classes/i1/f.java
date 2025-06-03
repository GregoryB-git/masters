package i1;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import f0.d;
import f0.e;
import g0.M;
import g0.o;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Map;

public abstract class f
{
  public static void a(Spannable paramSpannable, int paramInt1, int paramInt2, g paramg, c paramc, Map paramMap, int paramInt3)
  {
    if (paramg.l() != -1) {
      paramSpannable.setSpan(new StyleSpan(paramg.l()), paramInt1, paramInt2, 33);
    }
    if (paramg.s()) {
      paramSpannable.setSpan(new StrikethroughSpan(), paramInt1, paramInt2, 33);
    }
    if (paramg.t()) {
      paramSpannable.setSpan(new UnderlineSpan(), paramInt1, paramInt2, 33);
    }
    if (paramg.q()) {
      f0.f.b(paramSpannable, new ForegroundColorSpan(paramg.c()), paramInt1, paramInt2, 33);
    }
    if (paramg.p()) {
      f0.f.b(paramSpannable, new BackgroundColorSpan(paramg.b()), paramInt1, paramInt2, 33);
    }
    if (paramg.d() != null) {
      f0.f.b(paramSpannable, new TypefaceSpan(paramg.d()), paramInt1, paramInt2, 33);
    }
    Object localObject1;
    int i;
    if (paramg.o() != null)
    {
      localObject1 = (b)g0.a.e(paramg.o());
      i = a;
      if (i == -1)
      {
        if ((paramInt3 != 2) && (paramInt3 != 1)) {
          paramInt3 = 1;
        } else {
          paramInt3 = 3;
        }
        j = 1;
        i = paramInt3;
        paramInt3 = j;
      }
      else
      {
        paramInt3 = b;
      }
      int k = c;
      int j = k;
      if (k == -2) {
        j = 1;
      }
      f0.f.b(paramSpannable, new f0.g(i, paramInt3, j), paramInt1, paramInt2, 33);
    }
    paramInt3 = paramg.j();
    if (paramInt3 != 2)
    {
      if ((paramInt3 != 3) && (paramInt3 != 4)) {}
    }
    else
    {
      for (paramc = new a();; paramc = new e(paramc, i))
      {
        paramSpannable.setSpan(paramc, paramInt1, paramInt2, 33);
        break label498;
        localObject1 = d(paramc, paramMap);
        if (localObject1 == null) {
          break label498;
        }
        Object localObject2 = e((c)localObject1, paramMap);
        if (localObject2 == null) {
          break label498;
        }
        if ((((c)localObject2).g() != 1) || (f0b == null)) {
          break;
        }
        paramc = (String)M.i(f0b);
        localObject2 = f(f, ((c)localObject2).l(), paramMap);
        if (localObject2 != null) {
          paramInt3 = ((g)localObject2).i();
        } else {
          paramInt3 = -1;
        }
        i = paramInt3;
        if (paramInt3 == -1)
        {
          paramMap = f(f, ((c)localObject1).l(), paramMap);
          i = paramInt3;
          if (paramMap != null) {
            i = paramMap.i();
          }
        }
      }
      o.f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
    }
    label498:
    if (paramg.n()) {
      f0.f.b(paramSpannable, new d(), paramInt1, paramInt2, 33);
    }
    paramInt3 = paramg.f();
    if (paramInt3 != 1) {
      if (paramInt3 != 2)
      {
        if (paramInt3 != 3) {
          return;
        }
        f0.f.a(paramSpannable, paramg.e() / 100.0F, paramInt1, paramInt2, 33);
        return;
      }
    }
    for (paramg = new RelativeSizeSpan(paramg.e());; paramg = new AbsoluteSizeSpan((int)paramg.e(), true))
    {
      f0.f.b(paramSpannable, paramg, paramInt1, paramInt2, 33);
      break;
    }
  }
  
  public static String b(String paramString)
  {
    return paramString.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
  }
  
  public static void c(SpannableStringBuilder paramSpannableStringBuilder)
  {
    for (int i = paramSpannableStringBuilder.length() - 1; (i >= 0) && (paramSpannableStringBuilder.charAt(i) == ' '); i--) {}
    if ((i >= 0) && (paramSpannableStringBuilder.charAt(i) != '\n')) {
      paramSpannableStringBuilder.append('\n');
    }
  }
  
  public static c d(c paramc, Map paramMap)
  {
    while (paramc != null)
    {
      g localg = f(f, paramc.l(), paramMap);
      if ((localg != null) && (localg.j() == 1)) {
        return paramc;
      }
      paramc = j;
    }
    return null;
  }
  
  public static c e(c paramc, Map paramMap)
  {
    ArrayDeque localArrayDeque = new ArrayDeque();
    localArrayDeque.push(paramc);
    while (!localArrayDeque.isEmpty())
    {
      c localc = (c)localArrayDeque.pop();
      paramc = f(f, localc.l(), paramMap);
      if ((paramc != null) && (paramc.j() == 3)) {
        return localc;
      }
      for (int i = localc.g() - 1; i >= 0; i--) {
        localArrayDeque.push(localc.f(i));
      }
    }
    return null;
  }
  
  public static g f(g paramg, String[] paramArrayOfString, Map paramMap)
  {
    int i = 0;
    int j = 0;
    if (paramg == null)
    {
      if (paramArrayOfString == null) {
        return null;
      }
      if (paramArrayOfString.length == 1) {
        return (g)paramMap.get(paramArrayOfString[0]);
      }
      if (paramArrayOfString.length > 1)
      {
        paramg = new g();
        i = paramArrayOfString.length;
        while (j < i)
        {
          paramg.a((g)paramMap.get(paramArrayOfString[j]));
          j++;
        }
        return paramg;
      }
    }
    else
    {
      if ((paramArrayOfString != null) && (paramArrayOfString.length == 1)) {
        return paramg.a((g)paramMap.get(paramArrayOfString[0]));
      }
      if ((paramArrayOfString != null) && (paramArrayOfString.length > 1))
      {
        int k = paramArrayOfString.length;
        for (j = i; j < k; j++) {
          paramg.a((g)paramMap.get(paramArrayOfString[j]));
        }
      }
    }
    return paramg;
  }
}

/* Location:
 * Qualified Name:     i1.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */