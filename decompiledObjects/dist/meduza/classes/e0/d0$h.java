package e0;

import aa.u;
import aa.v;
import aa.w;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.contentcapture.ContentCaptureSession;
import h0.a;
import java.util.List;

public final class d0$h
{
  public static View.AccessibilityDelegate a(View paramView)
  {
    return v.f(paramView);
  }
  
  public static ContentCaptureSession b(View paramView)
  {
    return w.f(paramView);
  }
  
  public static List<Rect> c(View paramView)
  {
    return u.f(paramView);
  }
  
  public static void d(View paramView, Context paramContext, int[] paramArrayOfInt, AttributeSet paramAttributeSet, TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    w.n(paramView, paramContext, paramArrayOfInt, paramAttributeSet, paramTypedArray, paramInt1, paramInt2);
  }
  
  public static void e(View paramView, a parama)
  {
    v.m(paramView);
  }
  
  public static void f(View paramView, List<Rect> paramList)
  {
    u.m(paramView, paramList);
  }
}

/* Location:
 * Qualified Name:     e0.d0.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */