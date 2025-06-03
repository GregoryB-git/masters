package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import b.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o7.m0;
import s5.f;
import s5.h;
import v5.e0;

public final class c
  extends FrameLayout
  implements SubtitleView.a
{
  public final a a;
  public final h b;
  public List<h5.a> c = Collections.emptyList();
  public s5.a d = s5.a.g;
  public float e = 0.0533F;
  public int f = 0;
  public float o = 0.08F;
  
  public c(Context paramContext)
  {
    super(paramContext, null);
    a locala = new a(paramContext);
    a = locala;
    paramContext = new h(paramContext);
    b = paramContext;
    paramContext.setBackgroundColor(0);
    addView(locala);
    addView(paramContext);
  }
  
  public final void a(List<h5.a> paramList, s5.a parama, float paramFloat1, int paramInt, float paramFloat2)
  {
    d = parama;
    e = paramFloat1;
    f = paramInt;
    o = paramFloat2;
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    for (int i = 0; i < paramList.size(); i++)
    {
      h5.a locala = (h5.a)paramList.get(i);
      if (d != null) {
        localArrayList1.add(locala);
      } else {
        localArrayList2.add(locala);
      }
    }
    if ((!c.isEmpty()) || (!localArrayList2.isEmpty()))
    {
      c = localArrayList2;
      c();
    }
    a.a(localArrayList1, parama, paramFloat1, paramInt, paramFloat2);
    invalidate();
  }
  
  public final String b(float paramFloat, int paramInt)
  {
    paramFloat = f.b(paramFloat, paramInt, getHeight(), getHeight() - getPaddingTop() - getPaddingBottom());
    if (paramFloat == -3.4028235E38F) {
      return "unset";
    }
    return e0.m("%.2fpx", new Object[] { Float.valueOf(paramFloat / getContextgetResourcesgetDisplayMetricsdensity) });
  }
  
  public final void c()
  {
    Object localObject1 = this;
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject2 = z.p(d.a);
    int i = f;
    Object localObject3 = ((c)localObject1).b(e, i);
    i = 1067030938;
    int j = 2;
    Object localObject4 = d;
    int k = d;
    String str1 = "unset";
    if (k != 1)
    {
      if (k != 2)
      {
        if (k != 3)
        {
          if (k != 4) {
            localObject4 = "unset";
          } else {
            localObject4 = e0.m("-0.05em -0.05em 0.15em %s", new Object[] { z.p(e) });
          }
        }
        else {
          localObject4 = e0.m("0.06em 0.08em 0.15em %s", new Object[] { z.p(e) });
        }
      }
      else {
        localObject4 = e0.m("0.1em 0.12em 0.15em %s", new Object[] { z.p(e) });
      }
    }
    else {
      localObject4 = e0.m("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", new Object[] { z.p(e) });
    }
    localStringBuilder.append(e0.m("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", new Object[] { localObject2, localObject3, Float.valueOf(1.2F), localObject4 }));
    HashMap localHashMap1 = new HashMap();
    String str2 = "default_bg";
    localObject4 = z.e("default_bg");
    localObject1 = z.p(d.b);
    localObject3 = "background-color:%s;";
    localHashMap1.put(localObject4, e0.m("background-color:%s;", new Object[] { localObject1 }));
    int m = 0;
    for (;;)
    {
      Object localObject5 = this;
      if (m >= c.size()) {
        break;
      }
      h5.a locala = (h5.a)c.get(m);
      float f1 = p;
      if (f1 != -3.4028235E38F) {
        f1 *= 100.0F;
      } else {
        f1 = 50.0F;
      }
      k = q;
      int n = -50;
      int i1 = -100;
      if (k != 1)
      {
        if (k != j) {
          k = 0;
        } else {
          k = -100;
        }
      }
      else {
        k = -50;
      }
      float f2 = e;
      if (f2 != -3.4028235E38F)
      {
        if (f != 1)
        {
          localObject2 = e0.m("%.2f%%", new Object[] { Float.valueOf(f2 * 100.0F) });
          if (x == 1)
          {
            i = o;
            if (i != 1)
            {
              if (i != j) {
                i = 0;
              } else {
                i = -100;
              }
            }
            else {
              i = -50;
            }
            i = -i;
          }
          else
          {
            i1 = o;
            i = n;
            if (i1 != 1) {
              if (i1 != j) {
                i = 0;
              } else {
                i = -100;
              }
            }
          }
          i1 = 0;
          j = 1067030938;
        }
        else if (f2 >= 0.0F)
        {
          j = 1067030938;
          localObject2 = e0.m("%.2fem", new Object[] { Float.valueOf(f2 * 1.2F) });
          i1 = 0;
          i = i1;
        }
        else
        {
          j = 1067030938;
          localObject2 = e0.m("%.2fem", new Object[] { Float.valueOf((-f2 - 1.0F) * 1.2F) });
          i = 0;
          i1 = 1;
        }
      }
      else
      {
        localObject2 = e0.m("%.2f%%", new Object[] { Float.valueOf((1.0F - o) * 100.0F) });
        n = 0;
        j = i;
        i = i1;
        i1 = n;
      }
      f2 = r;
      if (f2 != -3.4028235E38F) {
        localObject6 = e0.m("%.2f%%", new Object[] { Float.valueOf(f2 * 100.0F) });
      } else {
        localObject6 = "fit-content";
      }
      localObject4 = b;
      if (localObject4 == null)
      {
        localObject4 = "center";
      }
      else
      {
        n = a.a[localObject4.ordinal()];
        if (n != 1)
        {
          if (n != 2) {
            localObject4 = "center";
          } else {
            localObject4 = "end";
          }
        }
        else {
          localObject4 = "start";
        }
      }
      n = x;
      if (n != 1)
      {
        if (n != 2) {
          localObject1 = "horizontal-tb";
        } else {
          localObject1 = "vertical-lr";
        }
      }
      else {
        localObject1 = "vertical-rl";
      }
      n = v;
      Object localObject7 = ((c)localObject5).b(w, n);
      if (t) {
        n = u;
      } else {
        n = d.c;
      }
      String str3 = z.p(n);
      n = x;
      String str4 = "left";
      localObject5 = "top";
      if (n != 1)
      {
        if (n != 2)
        {
          if (i1 != 0) {
            localObject5 = "bottom";
          }
          localObject8 = localObject5;
          break label941;
        }
        localObject5 = str4;
        if (i1 == 0) {
          break label932;
        }
      }
      else if (i1 != 0)
      {
        localObject5 = str4;
        break label932;
      }
      localObject5 = "right";
      label932:
      str4 = "top";
      Object localObject8 = localObject5;
      label941:
      String str5;
      if ((n != 2) && (n != 1))
      {
        str5 = "width";
        i1 = i;
        i = k;
        k = i1;
      }
      else
      {
        str5 = "height";
      }
      Object localObject9 = a;
      f2 = getContextgetResourcesgetDisplayMetricsdensity;
      localObject5 = b.a;
      if (localObject9 == null)
      {
        localObject5 = new b.a("", m0.o);
      }
      else
      {
        if ((localObject9 instanceof Spanned)) {
          break label1085;
        }
        localObject5 = new b.a(b.a((CharSequence)localObject9), m0.o);
      }
      Object localObject10 = localObject1;
      localObject1 = localObject6;
      localObject9 = localObject7;
      localObject7 = localObject4;
      localObject4 = localObject3;
      Object localObject6 = localObject10;
      localObject3 = localObject7;
      break label2588;
      label1085:
      Spanned localSpanned = (Spanned)localObject9;
      localObject9 = new HashSet();
      localObject5 = (BackgroundColorSpan[])localSpanned.getSpans(0, localSpanned.length(), BackgroundColorSpan.class);
      n = localObject5.length;
      for (i1 = 0; i1 < n; i1++) {
        ((HashSet)localObject9).add(Integer.valueOf(localObject5[i1].getBackgroundColor()));
      }
      HashMap localHashMap2 = new HashMap();
      localObject9 = ((HashSet)localObject9).iterator();
      localObject5 = localObject7;
      localObject7 = localObject9;
      while (((Iterator)localObject7).hasNext())
      {
        i1 = ((Integer)((Iterator)localObject7).next()).intValue();
        localObject9 = new StringBuilder(14);
        ((StringBuilder)localObject9).append("bg_");
        ((StringBuilder)localObject9).append(i1);
        localHashMap2.put(z.e(((StringBuilder)localObject9).toString()), e0.m((String)localObject3, new Object[] { z.p(i1) }));
      }
      localObject9 = localObject5;
      SparseArray localSparseArray = new SparseArray();
      localObject10 = localSpanned.getSpans(0, localSpanned.length(), Object.class);
      i1 = localObject10.length;
      n = 0;
      localObject5 = localObject4;
      localObject7 = localObject1;
      Object localObject12;
      boolean bool2;
      int i2;
      while (n < i1)
      {
        Object localObject11 = localObject10[n];
        boolean bool1 = localObject11 instanceof StrikethroughSpan;
        localObject12 = null;
        if (bool1)
        {
          localObject1 = "<span style='text-decoration:line-through;'>";
        }
        else
        {
          if ((localObject11 instanceof ForegroundColorSpan))
          {
            localObject4 = e0.m("<span style='color:%s;'>", new Object[] { z.p(((ForegroundColorSpan)localObject11).getForegroundColor()) });
          }
          else if ((localObject11 instanceof BackgroundColorSpan))
          {
            localObject4 = e0.m("<span class='bg_%s'>", new Object[] { Integer.valueOf(((BackgroundColorSpan)localObject11).getBackgroundColor()) });
          }
          else if ((localObject11 instanceof l5.a))
          {
            localObject4 = "<span style='text-combine-upright:all;'>";
          }
          else if ((localObject11 instanceof AbsoluteSizeSpan))
          {
            localObject4 = (AbsoluteSizeSpan)localObject11;
            bool2 = ((AbsoluteSizeSpan)localObject4).getDip();
            float f3 = ((AbsoluteSizeSpan)localObject4).getSize();
            if (!bool2) {
              f3 /= f2;
            }
            localObject4 = e0.m("<span style='font-size:%.2fpx;'>", new Object[] { Float.valueOf(f3) });
          }
          else if ((localObject11 instanceof RelativeSizeSpan))
          {
            localObject4 = e0.m("<span style='font-size:%.2f%%;'>", new Object[] { Float.valueOf(((RelativeSizeSpan)localObject11).getSizeChange() * 100.0F) });
          }
          else if ((localObject11 instanceof TypefaceSpan))
          {
            localObject4 = ((TypefaceSpan)localObject11).getFamily();
            if (localObject4 != null)
            {
              localObject4 = e0.m("<span style='font-family:\"%s\";'>", new Object[] { localObject4 });
              break label1739;
            }
          }
          for (;;)
          {
            break;
            if ((localObject11 instanceof StyleSpan))
            {
              i2 = ((StyleSpan)localObject11).getStyle();
              if (i2 != 1)
              {
                if (i2 != 2)
                {
                  if (i2 != 3) {
                    continue;
                  }
                  localObject4 = "<b><i>";
                }
                else
                {
                  localObject4 = "<i>";
                }
              }
              else {
                localObject4 = "<b>";
              }
            }
            else if ((localObject11 instanceof l5.c))
            {
              i2 = b;
              if (i2 != -1)
              {
                if (i2 != 1)
                {
                  if (i2 != 2) {
                    continue;
                  }
                  localObject4 = "<ruby style='ruby-position:under;'>";
                }
                else
                {
                  localObject4 = "<ruby style='ruby-position:over;'>";
                }
              }
              else {
                localObject4 = "<ruby style='ruby-position:unset;'>";
              }
            }
            else
            {
              if (!(localObject11 instanceof UnderlineSpan)) {
                break label1745;
              }
              localObject4 = "<u>";
            }
            label1739:
            localObject1 = localObject4;
            break label1937;
            label1745:
            if ((localObject11 instanceof l5.d))
            {
              localObject1 = (l5.d)localObject11;
              i2 = a;
              i3 = b;
              Object localObject13 = new StringBuilder();
              if (i3 != 1)
              {
                if (i3 != 2) {
                  break label1816;
                }
                localObject4 = "open ";
              }
              else
              {
                localObject4 = "filled ";
              }
              ((StringBuilder)localObject13).append((String)localObject4);
              label1816:
              if (i2 != 0)
              {
                if (i2 != 1)
                {
                  if (i2 != 2)
                  {
                    if (i2 != 3) {
                      localObject4 = str1;
                    } else {
                      localObject4 = "sesame";
                    }
                  }
                  else {
                    localObject4 = "dot";
                  }
                }
                else {
                  localObject4 = "circle";
                }
              }
              else {
                localObject4 = "none";
              }
              ((StringBuilder)localObject13).append((String)localObject4);
              localObject13 = ((StringBuilder)localObject13).toString();
              if (c != 2) {
                localObject4 = "over right";
              } else {
                localObject4 = "under left";
              }
              localObject1 = e0.m("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", new Object[] { localObject13, localObject4 });
              break label1937;
            }
          }
          localObject1 = null;
        }
        label1937:
        if ((!bool1) && (!(localObject11 instanceof ForegroundColorSpan)) && (!(localObject11 instanceof BackgroundColorSpan)) && (!(localObject11 instanceof l5.a)) && (!(localObject11 instanceof AbsoluteSizeSpan)) && (!(localObject11 instanceof RelativeSizeSpan)) && (!(localObject11 instanceof l5.d)))
        {
          if ((localObject11 instanceof TypefaceSpan))
          {
            localObject4 = localObject12;
            if (((TypefaceSpan)localObject11).getFamily() != null) {
              break label2186;
            }
          }
          else
          {
            if ((localObject11 instanceof StyleSpan))
            {
              i2 = ((StyleSpan)localObject11).getStyle();
              if (i2 != 1)
              {
                if (i2 != 2)
                {
                  if (i2 != 3) {
                    localObject4 = localObject12;
                  } else {
                    localObject4 = "</i></b>";
                  }
                }
                else {
                  localObject4 = "</i>";
                }
              }
              else {
                localObject4 = "</b>";
              }
            }
            else
            {
              if (!(localObject11 instanceof l5.c)) {
                break label2163;
              }
              localObject4 = b.a(a);
              localObject12 = new StringBuilder(String.valueOf(localObject4).length() + 16);
              ((StringBuilder)localObject12).append("<rt>");
              ((StringBuilder)localObject12).append((String)localObject4);
              ((StringBuilder)localObject12).append("</rt></ruby>");
            }
            for (localObject4 = ((StringBuilder)localObject12).toString();; localObject4 = "</u>")
            {
              break;
              label2163:
              localObject4 = localObject12;
              if (!(localObject11 instanceof UnderlineSpan)) {
                break;
              }
            }
          }
          break label2191;
        }
        label2186:
        localObject4 = "</span>";
        label2191:
        i2 = localSpanned.getSpanStart(localObject11);
        int i3 = localSpanned.getSpanEnd(localObject11);
        if (localObject1 != null)
        {
          localObject4.getClass();
          localObject12 = new b.b(i2, i3, (String)localObject1, (String)localObject4);
          localObject1 = (b.c)localSparseArray.get(i2);
          localObject4 = localObject1;
          if (localObject1 == null)
          {
            localObject4 = new b.c();
            localSparseArray.put(i2, localObject4);
          }
          a.add(localObject12);
          localObject1 = (b.c)localSparseArray.get(i3);
          localObject4 = localObject1;
          if (localObject1 == null)
          {
            localObject4 = new b.c();
            localSparseArray.put(i3, localObject4);
          }
          b.add(localObject12);
        }
        n++;
      }
      localObject1 = localObject6;
      localObject4 = localObject3;
      localObject3 = new StringBuilder(localSpanned.length());
      n = 0;
      for (i1 = 0; n < localSparseArray.size(); i1 = i2)
      {
        i2 = localSparseArray.keyAt(n);
        ((StringBuilder)localObject3).append(b.a(localSpanned.subSequence(i1, i2)));
        localObject10 = (b.c)localSparseArray.get(i2);
        Collections.sort(b, b.b.f);
        localObject6 = b.iterator();
        while (((Iterator)localObject6).hasNext()) {
          ((StringBuilder)localObject3).append(nextd);
        }
        Collections.sort(a, b.b.e);
        localObject6 = a.iterator();
        while (((Iterator)localObject6).hasNext()) {
          ((StringBuilder)localObject3).append(nextc);
        }
        n++;
      }
      ((StringBuilder)localObject3).append(b.a(localSpanned.subSequence(i1, localSpanned.length())));
      localObject10 = new b.a(((StringBuilder)localObject3).toString(), localHashMap2);
      localObject3 = localObject5;
      localObject6 = localObject7;
      localObject5 = localObject10;
      label2588:
      localObject10 = localHashMap1.keySet().iterator();
      while (((Iterator)localObject10).hasNext())
      {
        localObject7 = (String)((Iterator)localObject10).next();
        localObject12 = (String)localHashMap1.put(localObject7, (String)localHashMap1.get(localObject7));
        if ((localObject12 != null) && (!((String)localObject12).equals(localHashMap1.get(localObject7)))) {
          bool2 = false;
        } else {
          bool2 = true;
        }
        x6.b.H(bool2);
      }
      f2 = y;
      if (f2 != 0.0F)
      {
        i1 = x;
        if ((i1 != 2) && (i1 != 1)) {
          localObject7 = "skewX";
        } else {
          localObject7 = "skewY";
        }
        localObject7 = e0.m("%s(%.2fdeg)", new Object[] { localObject7, Float.valueOf(f2) });
      }
      else
      {
        localObject7 = "";
      }
      localObject1 = e0.m("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", new Object[] { Integer.valueOf(m), str4, Float.valueOf(f1), localObject8, localObject2, str5, localObject1, localObject3, localObject6, localObject9, str3, Integer.valueOf(i), Integer.valueOf(k), localObject7 });
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append(e0.m("<span class='%s'>", new Object[] { str2 }));
      localObject1 = c;
      if (localObject1 != null)
      {
        i = a.a[localObject1.ordinal()];
        if (i != 1)
        {
          if (i != 2) {
            localObject1 = "center";
          } else {
            localObject1 = "end";
          }
        }
        else {
          localObject1 = "start";
        }
        localStringBuilder.append(e0.m("<span style='display:inline-block; text-align:%s;'>", new Object[] { localObject1 }));
        localStringBuilder.append(a);
        localStringBuilder.append("</span>");
      }
      else
      {
        localStringBuilder.append(a);
      }
      localStringBuilder.append("</span>");
      localStringBuilder.append("</div>");
      m++;
      k = 2;
      i = j;
      j = k;
      localObject3 = localObject4;
    }
    localStringBuilder.append("</div></body></html>");
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("<html><head><style>");
    localObject4 = localHashMap1.keySet().iterator();
    while (((Iterator)localObject4).hasNext())
    {
      localObject1 = (String)((Iterator)localObject4).next();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append("{");
      ((StringBuilder)localObject2).append((String)localHashMap1.get(localObject1));
      ((StringBuilder)localObject2).append("}");
    }
    ((StringBuilder)localObject2).append("</style></head>");
    localStringBuilder.insert(0, ((StringBuilder)localObject2).toString());
    b.loadData(Base64.encodeToString(localStringBuilder.toString().getBytes(n7.d.c), 1), "text/html", "base64");
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramBoolean) && (!c.isEmpty())) {
      c();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.ui.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */