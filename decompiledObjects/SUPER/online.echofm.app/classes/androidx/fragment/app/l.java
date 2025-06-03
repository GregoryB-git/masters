package androidx.fragment.app;

import U.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater.Factory2;
import android.view.View;
import android.view.ViewGroup;

public class l
  implements LayoutInflater.Factory2
{
  public final n o;
  
  public l(n paramn)
  {
    o = paramn;
  }
  
  public View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    if (h.class.getName().equals(paramString)) {
      return new h(paramContext, paramAttributeSet, o);
    }
    boolean bool = "fragment".equals(paramString);
    paramString = null;
    if (!bool) {
      return null;
    }
    Object localObject1 = paramAttributeSet.getAttributeValue(null, "class");
    Object localObject2 = paramContext.obtainStyledAttributes(paramAttributeSet, c.d);
    Object localObject3 = localObject1;
    if (localObject1 == null) {
      localObject3 = ((TypedArray)localObject2).getString(c.e);
    }
    int i = ((TypedArray)localObject2).getResourceId(c.f, -1);
    String str = ((TypedArray)localObject2).getString(c.g);
    ((TypedArray)localObject2).recycle();
    if ((localObject3 != null) && (j.b(paramContext.getClassLoader(), (String)localObject3)))
    {
      int j;
      if (paramView != null) {
        j = paramView.getId();
      } else {
        j = 0;
      }
      if ((j == -1) && (i == -1) && (str == null))
      {
        paramView = new StringBuilder();
        paramView.append(paramAttributeSet.getPositionDescription());
        paramView.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
        paramView.append((String)localObject3);
        throw new IllegalArgumentException(paramView.toString());
      }
      if (i != -1) {
        paramString = o.g0(i);
      }
      localObject1 = paramString;
      if (paramString == null)
      {
        localObject1 = paramString;
        if (str != null) {
          localObject1 = o.h0(str);
        }
      }
      paramString = (String)localObject1;
      if (localObject1 == null)
      {
        paramString = (String)localObject1;
        if (j != -1) {
          paramString = o.g0(j);
        }
      }
      if (paramString == null)
      {
        localObject1 = o.p0().a(paramContext.getClassLoader(), (String)localObject3);
        B = true;
        int k;
        if (i != 0) {
          k = i;
        } else {
          k = j;
        }
        K = k;
        L = j;
        M = str;
        C = true;
        paramString = o;
        G = paramString;
        H = paramString.s0();
        ((Fragment)localObject1).y0(o.s0().i(), paramAttributeSet, p);
        paramString = o.v((Fragment)localObject1);
        o.g((Fragment)localObject1);
        paramContext = (Context)localObject1;
        paramAttributeSet = paramString;
        if (n.D0(2))
        {
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("Fragment ");
          ((StringBuilder)localObject2).append(localObject1);
          paramAttributeSet = " has been inflated via the <fragment> tag: id=0x";
          paramContext = (Context)localObject1;
        }
      }
      else
      {
        for (;;)
        {
          ((StringBuilder)localObject2).append(paramAttributeSet);
          ((StringBuilder)localObject2).append(Integer.toHexString(i));
          Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
          paramAttributeSet = paramString;
          break;
          if (C) {
            break label708;
          }
          C = true;
          paramContext = o;
          G = paramContext;
          H = paramContext.s0();
          paramString.y0(o.s0().i(), paramAttributeSet, p);
          localObject1 = o.v(paramString);
          paramContext = paramString;
          paramAttributeSet = (AttributeSet)localObject1;
          if (!n.D0(2)) {
            break;
          }
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("Retained Fragment ");
          ((StringBuilder)localObject2).append(paramString);
          paramAttributeSet = " has been re-attached via the <fragment> tag: id=0x";
          paramContext = paramString;
          paramString = (String)localObject1;
        }
      }
      U = ((ViewGroup)paramView);
      paramAttributeSet.m();
      paramAttributeSet.j();
      paramView = V;
      if (paramView != null)
      {
        if (i != 0) {
          paramView.setId(i);
        }
        if (V.getTag() == null) {
          V.setTag(str);
        }
        return V;
      }
      paramView = new StringBuilder();
      paramView.append("Fragment ");
      paramView.append((String)localObject3);
      paramView.append(" did not create a view.");
      throw new IllegalStateException(paramView.toString());
      label708:
      paramView = new StringBuilder();
      paramView.append(paramAttributeSet.getPositionDescription());
      paramView.append(": Duplicate id 0x");
      paramView.append(Integer.toHexString(i));
      paramView.append(", tag ");
      paramView.append(str);
      paramView.append(", or parent id 0x");
      paramView.append(Integer.toHexString(j));
      paramView.append(" with another fragment for ");
      paramView.append((String)localObject3);
      throw new IllegalArgumentException(paramView.toString());
    }
    return null;
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return onCreateView(null, paramString, paramContext, paramAttributeSet);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */