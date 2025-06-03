package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s5.d;
import s5.f;
import v5.e0;
import v5.m;

public final class a
  extends View
  implements SubtitleView.a
{
  public final ArrayList a = new ArrayList();
  public List<h5.a> b = Collections.emptyList();
  public int c = 0;
  public float d = 0.0533F;
  public s5.a e = s5.a.g;
  public float f = 0.08F;
  
  public a(Context paramContext)
  {
    super(paramContext, null);
  }
  
  public final void a(List<h5.a> paramList, s5.a parama, float paramFloat1, int paramInt, float paramFloat2)
  {
    b = paramList;
    e = parama;
    d = paramFloat1;
    c = paramInt;
    f = paramFloat2;
    while (a.size() < paramList.size()) {
      a.add(new d(getContext()));
    }
    invalidate();
  }
  
  public final void dispatchDraw(Canvas paramCanvas)
  {
    Object localObject1 = this;
    List localList = b;
    if (localList.isEmpty()) {
      return;
    }
    int i = getHeight();
    int j = getPaddingLeft();
    int k = getPaddingTop();
    int m = getWidth() - getPaddingRight();
    int n = i - getPaddingBottom();
    if ((n > k) && (m > j))
    {
      int i1 = n - k;
      int i2 = c;
      float f1 = f.b(d, i2, i, i1);
      if (f1 <= 0.0F) {
        return;
      }
      int i3 = localList.size();
      localObject1 = paramCanvas;
      int i8;
      for (i2 = 0;; i2 = i8)
      {
        Object localObject2 = this;
        if (i2 >= i3) {
          break;
        }
        Object localObject3 = (h5.a)localList.get(i2);
        int i5;
        float f2;
        float f3;
        boolean bool;
        int i9;
        if (x != Integer.MIN_VALUE)
        {
          localObject4 = a;
          localObject5 = d;
          localObject6 = c;
          i4 = o;
          i5 = v;
          f2 = w;
          f3 = r;
          float f4 = s;
          bool = t;
          i6 = u;
          i7 = x;
          f5 = y;
          if (f == 0)
          {
            f6 = 1.0F - e;
            i8 = 0;
          }
          else
          {
            f6 = -e - 1.0F;
            i8 = 1;
          }
          i9 = o;
          if (i9 != 0)
          {
            if (i9 == 2) {
              i4 = 0;
            }
          }
          else {
            i4 = 2;
          }
          localObject3 = new h5.a((CharSequence)localObject4, null, (Layout.Alignment)localObject6, (Bitmap)localObject5, f6, i8, i4, -3.4028235E38F, Integer.MIN_VALUE, i5, f2, f3, f4, bool, i6, i7, f5);
        }
        int i4 = v;
        float f5 = f.b(w, i4, i, i1);
        Object localObject5 = a;
        localObject5 = (d)((ArrayList)localObject5).get(i2);
        Object localObject4 = e;
        float f6 = f;
        localObject5.getClass();
        if (d == null) {
          bool = true;
        } else {
          bool = false;
        }
        i4 = -16777216;
        if (bool)
        {
          if (TextUtils.isEmpty(a)) {
            break label833;
          }
          if (t) {
            i4 = u;
          } else {
            i4 = c;
          }
        }
        localObject2 = i;
        Object localObject6 = a;
        if ((localObject2 != localObject6) && ((localObject2 == null) || (!localObject2.equals(localObject6)))) {
          i8 = 0;
        } else {
          i8 = 1;
        }
        if ((i8 != 0) && (e0.a(j, b)) && (k == d) && (l == e) && (m == f) && (e0.a(Integer.valueOf(n), Integer.valueOf(o))) && (o == p) && (e0.a(Integer.valueOf(p), Integer.valueOf(q))) && (q == r) && (r == s) && (s == a) && (t == b) && (u == i4) && (w == d) && (v == e) && (e0.a(f.getTypeface(), f)) && (x == f1) && (y == f5) && (z == f6)) {
          if (A == j)
          {
            if (B == k) {
              if (C == m)
              {
                if (D == n)
                {
                  ((d)localObject5).a((Canvas)localObject1, bool);
                  label833:
                  i4 = i2;
                  i2 = k;
                  k = n;
                  n = i2;
                  i2 = j;
                  j = i4;
                  break label2419;
                }
                break label872;
              }
            }
          }
          else {}
        }
        label872:
        i8 = n;
        int i6 = m;
        int i7 = k;
        i = a;
        j = b;
        k = d;
        l = e;
        m = f;
        n = o;
        o = p;
        p = q;
        q = r;
        r = s;
        s = a;
        t = b;
        u = i4;
        w = d;
        v = e;
        f.setTypeface(f);
        x = f1;
        y = f5;
        z = f6;
        A = j;
        B = i7;
        C = i6;
        D = i8;
        if (bool)
        {
          i.getClass();
          localObject3 = i;
          if ((localObject3 instanceof SpannableStringBuilder)) {
            localObject3 = (SpannableStringBuilder)localObject3;
          } else {
            localObject3 = new SpannableStringBuilder(i);
          }
          int i10 = C - A;
          int i11 = D - B;
          f.setTextSize(x);
          i5 = (int)(x * 0.125F + 0.5F);
          int i12 = i5 * 2;
          m = i10 - i12;
          f6 = q;
          n = m;
          if (f6 != -3.4028235E38F) {
            n = (int)(m * f6);
          }
          if (n <= 0)
          {
            m.f("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
            break label2387;
          }
          if (y > 0.0F) {
            ((SpannableStringBuilder)localObject3).setSpan(new AbsoluteSizeSpan((int)y), 0, ((SpannableStringBuilder)localObject3).length(), 16711680);
          }
          localObject4 = new SpannableStringBuilder((CharSequence)localObject3);
          if (w == 1)
          {
            localObject1 = (ForegroundColorSpan[])((SpannableStringBuilder)localObject4).getSpans(0, ((SpannableStringBuilder)localObject4).length(), ForegroundColorSpan.class);
            k = localObject1.length;
            for (m = 0; m < k; m++) {
              ((SpannableStringBuilder)localObject4).removeSpan(localObject1[m]);
            }
          }
          if (Color.alpha(t) > 0)
          {
            m = w;
            if ((m != 0) && (m != 2)) {
              ((SpannableStringBuilder)localObject4).setSpan(new BackgroundColorSpan(t), 0, ((SpannableStringBuilder)localObject4).length(), 16711680);
            } else {
              ((SpannableStringBuilder)localObject3).setSpan(new BackgroundColorSpan(t), 0, ((SpannableStringBuilder)localObject3).length(), 16711680);
            }
          }
          localObject2 = j;
          localObject1 = localObject2;
          if (localObject2 == null) {
            localObject1 = Layout.Alignment.ALIGN_CENTER;
          }
          localObject2 = new StaticLayout((CharSequence)localObject3, f, n, (Layout.Alignment)localObject1, d, e, true);
          E = ((StaticLayout)localObject2);
          i9 = ((Layout)localObject2).getHeight();
          i4 = E.getLineCount();
          m = 0;
          k = 0;
          while (m < i4)
          {
            k = Math.max((int)Math.ceil(E.getLineWidth(m)), k);
            m++;
          }
          m = i2;
          if ((q == -3.4028235E38F) || (k >= n)) {
            n = k;
          }
          n += i12;
          f6 = o;
          if (f6 != -3.4028235E38F)
          {
            i2 = Math.round(i10 * f6);
            k = A;
            i2 += k;
            i4 = p;
            if (i4 != 1)
            {
              if (i4 == 2) {
                i2 -= n;
              }
            }
            else {
              i2 = (i2 * 2 - n) / 2;
            }
            k = Math.max(i2, k);
            i2 = Math.min(n + k, C);
          }
          else
          {
            k = (i10 - n) / 2 + A;
            i2 = n + k;
          }
          i10 = i2 - k;
          if (i10 <= 0)
          {
            m.f("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
            localObject1 = paramCanvas;
            i2 = m;
            break label2387;
          }
          f6 = l;
          if (f6 != -3.4028235E38F)
          {
            if (m == 0)
            {
              n = Math.round(i11 * f6) + B;
              i4 = n;
              if (i4 != 2)
              {
                i2 = n;
                if (i4 == 1) {
                  i2 = (n * 2 - i9) / 2;
                }
                break label1930;
              }
            }
            else
            {
              i2 = E.getLineBottom(0) - E.getLineTop(0);
              f6 = l;
              if (f6 >= 0.0F)
              {
                i2 = Math.round(f6 * i2) + B;
                break label1930;
              }
              n = Math.round((f6 + 1.0F) * i2) + D;
            }
            i2 = n - i9;
            label1930:
            n = D;
            if (i2 + i9 > n)
            {
              n -= i9;
            }
            else
            {
              i4 = B;
              n = i2;
              if (i2 < i4)
              {
                i2 = i4;
                break label2007;
              }
            }
          }
          else
          {
            n = D - i9 - (int)(i11 * z);
          }
          i2 = n;
          label2007:
          E = new StaticLayout((CharSequence)localObject3, f, i10, (Layout.Alignment)localObject1, d, e, true);
          F = new StaticLayout((CharSequence)localObject4, f, i10, (Layout.Alignment)localObject1, d, e, true);
          G = k;
          H = i2;
          I = i5;
          i2 = m;
        }
        else
        {
          k.getClass();
          localObject1 = k;
          i4 = C;
          m = A;
          n = D;
          k = B;
          f6 = m;
          f5 = i4 - m;
          f2 = o * f5 + f6;
          f3 = k;
          f6 = n - k;
          f3 = l * f6 + f3;
          m = Math.round(f5 * q);
          f5 = r;
          if (f5 == -3.4028235E38F)
          {
            f5 = m;
            f6 = ((Bitmap)localObject1).getHeight() / ((Bitmap)localObject1).getWidth();
          }
          n = Math.round(f6 * f5);
          k = p;
          if (k == 2)
          {
            f6 = m;
          }
          else
          {
            f6 = f2;
            if (k != 1) {
              break label2300;
            }
            f6 = m / 2;
          }
          f6 = f2 - f6;
          label2300:
          k = Math.round(f6);
          i4 = n;
          if (i4 == 2)
          {
            f6 = n;
          }
          else
          {
            f6 = f3;
            if (i4 != 1) {
              break label2352;
            }
            f6 = n / 2;
          }
          f6 = f3 - f6;
          label2352:
          i4 = Math.round(f6);
          J = new Rect(k, i4, m + k, n + i4);
        }
        localObject1 = paramCanvas;
        label2387:
        n = j;
        m = i6;
        k = i8;
        ((d)localObject5).a((Canvas)localObject1, bool);
        j = i2;
        i2 = n;
        n = i7;
        label2419:
        i4 = k;
        i8 = j + 1;
        j = i2;
        k = n;
        n = i4;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.ui.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */