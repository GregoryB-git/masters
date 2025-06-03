package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.CaptioningManager;
import android.view.accessibility.CaptioningManager.CaptionStyle;
import android.webkit.WebView;
import android.widget.FrameLayout;
import h5.a.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l5.b;
import s5.f;
import v3.f1.c;
import v5.e0;

public final class SubtitleView
  extends FrameLayout
  implements f1.c
{
  public List<h5.a> a = Collections.emptyList();
  public s5.a b = s5.a.g;
  public int c = 0;
  public float d = 0.0533F;
  public float e = 0.08F;
  public boolean f = true;
  public boolean o = true;
  public int p;
  public a q;
  public View r;
  
  public SubtitleView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = new a(paramContext);
    q = paramContext;
    r = paramContext;
    addView(paramContext);
    p = 1;
  }
  
  private List<h5.a> getCuesWithStylingPreferencesApplied()
  {
    if ((f) && (o)) {
      return a;
    }
    ArrayList localArrayList = new ArrayList(a.size());
    for (int i = 0; i < a.size(); i++)
    {
      Object localObject1 = (h5.a)a.get(i);
      localObject1.getClass();
      localObject1 = new a.a((h5.a)localObject1);
      if (!f)
      {
        n = false;
        Object localObject2 = a;
        if ((localObject2 instanceof Spanned))
        {
          if (!(localObject2 instanceof Spannable)) {
            a = SpannableString.valueOf((CharSequence)localObject2);
          }
          localObject2 = a;
          localObject2.getClass();
          Spannable localSpannable = (Spannable)localObject2;
          for (Object localObject3 : localSpannable.getSpans(0, localSpannable.length(), Object.class)) {
            if ((localObject3 instanceof b ^ true)) {
              localSpannable.removeSpan(localObject3);
            }
          }
        }
        f.a((a.a)localObject1);
      }
      else if (!o)
      {
        f.a((a.a)localObject1);
      }
      localArrayList.add(((a.a)localObject1).a());
    }
    return localArrayList;
  }
  
  private float getUserCaptionFontScale()
  {
    int i = e0.a;
    float f1 = 1.0F;
    float f2 = f1;
    if (i >= 19) {
      if (isInEditMode())
      {
        f2 = f1;
      }
      else
      {
        CaptioningManager localCaptioningManager = (CaptioningManager)getContext().getSystemService("captioning");
        f2 = f1;
        if (localCaptioningManager != null)
        {
          f2 = f1;
          if (localCaptioningManager.isEnabled()) {
            f2 = localCaptioningManager.getFontScale();
          }
        }
      }
    }
    return f2;
  }
  
  private s5.a getUserCaptionStyle()
  {
    int i = e0.a;
    if ((i >= 19) && (!isInEditMode()))
    {
      Object localObject = (CaptioningManager)getContext().getSystemService("captioning");
      if ((localObject != null) && (((CaptioningManager)localObject).isEnabled()))
      {
        localObject = ((CaptioningManager)localObject).getUserStyle();
        if (i >= 21)
        {
          boolean bool = ((CaptioningManager.CaptionStyle)localObject).hasForegroundColor();
          int j = -1;
          if (bool) {
            i = foregroundColor;
          } else {
            i = -1;
          }
          int k;
          if (((CaptioningManager.CaptionStyle)localObject).hasBackgroundColor()) {
            k = backgroundColor;
          } else {
            k = -16777216;
          }
          bool = ((CaptioningManager.CaptionStyle)localObject).hasWindowColor();
          int m = 0;
          int n;
          if (bool) {
            n = windowColor;
          } else {
            n = 0;
          }
          if (((CaptioningManager.CaptionStyle)localObject).hasEdgeType()) {
            m = edgeType;
          }
          if (((CaptioningManager.CaptionStyle)localObject).hasEdgeColor()) {
            j = edgeColor;
          }
          localObject = new s5.a(i, k, n, m, j, ((CaptioningManager.CaptionStyle)localObject).getTypeface());
        }
        else
        {
          localObject = new s5.a(foregroundColor, backgroundColor, 0, edgeType, edgeColor, ((CaptioningManager.CaptionStyle)localObject).getTypeface());
        }
      }
      else
      {
        localObject = s5.a.g;
      }
      return (s5.a)localObject;
    }
    return s5.a.g;
  }
  
  private <T extends View,  extends a> void setView(T paramT)
  {
    removeView(r);
    View localView = r;
    if ((localView instanceof c)) {
      b.destroy();
    }
    r = paramT;
    q = ((a)paramT);
    addView(paramT);
  }
  
  public final void B()
  {
    q.a(getCuesWithStylingPreferencesApplied(), b, d, c, e);
  }
  
  public final void r(List<h5.a> paramList)
  {
    setCues(paramList);
  }
  
  public void setApplyEmbeddedFontSizes(boolean paramBoolean)
  {
    o = paramBoolean;
    B();
  }
  
  public void setApplyEmbeddedStyles(boolean paramBoolean)
  {
    f = paramBoolean;
    B();
  }
  
  public void setBottomPaddingFraction(float paramFloat)
  {
    e = paramFloat;
    B();
  }
  
  public void setCues(List<h5.a> paramList)
  {
    if (paramList == null) {
      paramList = Collections.emptyList();
    }
    a = paramList;
    B();
  }
  
  public void setFractionalTextSize(float paramFloat)
  {
    c = 0;
    d = paramFloat;
    B();
  }
  
  public void setStyle(s5.a parama)
  {
    b = parama;
    B();
  }
  
  public void setViewType(int paramInt)
  {
    if (p == paramInt) {
      return;
    }
    Object localObject;
    if (paramInt != 1)
    {
      if (paramInt == 2) {
        localObject = new c(getContext());
      } else {
        throw new IllegalArgumentException();
      }
    }
    else {
      localObject = new a(getContext());
    }
    setView((View)localObject);
    p = paramInt;
  }
  
  public static abstract interface a
  {
    public abstract void a(List<h5.a> paramList, s5.a parama, float paramFloat1, int paramInt, float paramFloat2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.ui.SubtitleView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */