package x0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater.Factory2;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import g;
import java.util.Set;
import y0.b;
import y0.b.a;
import y0.b.c;
import y0.c;
import y0.k;

public final class u
  implements LayoutInflater.Factory2
{
  public final y a;
  
  public u(y paramy)
  {
    a = paramy;
  }
  
  public final View onCreateView(View paramView, String paramString, final Context paramContext, AttributeSet paramAttributeSet)
  {
    if (q.class.getName().equals(paramString)) {
      return new q(paramContext, paramAttributeSet, a);
    }
    if (!"fragment".equals(paramString)) {
      return null;
    }
    paramString = paramAttributeSet.getAttributeValue(null, "class");
    Object localObject = paramContext.obtainStyledAttributes(paramAttributeSet, eb.y.d);
    int i = 0;
    String str1 = paramString;
    if (paramString == null) {
      str1 = ((TypedArray)localObject).getString(0);
    }
    int j = ((TypedArray)localObject).getResourceId(1, -1);
    String str2 = ((TypedArray)localObject).getString(2);
    ((TypedArray)localObject).recycle();
    if (str1 != null)
    {
      paramString = paramContext.getClassLoader();
      boolean bool;
      try
      {
        bool = i.class.isAssignableFrom(s.a(paramString, str1));
      }
      catch (ClassNotFoundException paramString)
      {
        bool = false;
      }
      if (bool)
      {
        if (paramView != null) {
          i = paramView.getId();
        }
        if ((i == -1) && (j == -1) && (str2 == null))
        {
          paramView = new StringBuilder();
          paramView.append(paramAttributeSet.getPositionDescription());
          paramView.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
          paramView.append(str1);
          throw new IllegalArgumentException(paramView.toString());
        }
        if (j != -1) {
          paramString = a.D(j);
        } else {
          paramString = null;
        }
        localObject = paramString;
        if (paramString == null)
        {
          localObject = paramString;
          if (str2 != null) {
            localObject = a.E(str2);
          }
        }
        paramString = (String)localObject;
        if (localObject == null)
        {
          paramString = (String)localObject;
          if (i != -1) {
            paramString = a.D(i);
          }
        }
        String str3;
        if (paramString == null)
        {
          paramString = a.I();
          paramContext.getClassLoader();
          paramString = i.instantiate(b.w.b, str1, null);
          mFromLayout = true;
          int k;
          if (j != 0) {
            k = j;
          } else {
            k = i;
          }
          mFragmentId = k;
          mContainerId = i;
          mTag = str2;
          mInLayout = true;
          paramContext = a;
          mFragmentManager = paramContext;
          paramContext = w;
          mHost = paramContext;
          paramString.onInflate(b, paramAttributeSet, mSavedFragmentState);
          localObject = a.a(paramString);
          paramAttributeSet = paramString;
          paramContext = (Context)localObject;
          if (!y.L(2)) {
            break label593;
          }
          paramAttributeSet = new StringBuilder();
          paramAttributeSet.append("Fragment ");
          paramAttributeSet.append(paramString);
          str3 = " has been inflated via the <fragment> tag: id=0x";
          paramContext = (Context)localObject;
        }
        else
        {
          if (mInLayout) {
            break label757;
          }
          mInLayout = true;
          paramContext = a;
          mFragmentManager = paramContext;
          paramContext = w;
          mHost = paramContext;
          paramString.onInflate(b, paramAttributeSet, mSavedFragmentState);
          localObject = a.h(paramString);
          paramAttributeSet = paramString;
          paramContext = (Context)localObject;
          if (!y.L(2)) {
            break label593;
          }
          paramAttributeSet = new StringBuilder();
          paramAttributeSet.append("Retained Fragment ");
          paramAttributeSet.append(paramString);
          str3 = " has been re-attached via the <fragment> tag: id=0x";
          paramContext = (Context)localObject;
        }
        paramAttributeSet.append(str3);
        paramAttributeSet.append(Integer.toHexString(j));
        Log.v("FragmentManager", paramAttributeSet.toString());
        paramAttributeSet = paramString;
        label593:
        paramView = (ViewGroup)paramView;
        paramString = b.a;
        localObject = new c(paramAttributeSet, paramView);
        b.c((k)localObject);
        paramString = b.a(paramAttributeSet);
        if ((a.contains(b.a.d)) && (b.f(paramString, paramAttributeSet.getClass(), c.class))) {
          b.b(paramString, (k)localObject);
        }
        mContainer = paramView;
        paramContext.k();
        paramContext.j();
        paramView = mView;
        if (paramView != null)
        {
          if (j != 0) {
            paramView.setId(j);
          }
          if (mView.getTag() == null) {
            mView.setTag(str2);
          }
          mView.addOnAttachStateChangeListener(new a(paramContext));
          return mView;
        }
        throw new IllegalStateException(g.e("Fragment ", str1, " did not create a view."));
        label757:
        paramView = new StringBuilder();
        paramView.append(paramAttributeSet.getPositionDescription());
        paramView.append(": Duplicate id 0x");
        paramView.append(Integer.toHexString(j));
        paramView.append(", tag ");
        paramView.append(str2);
        paramView.append(", or parent id 0x");
        paramView.append(Integer.toHexString(i));
        paramView.append(" with another fragment for ");
        paramView.append(str1);
        throw new IllegalArgumentException(paramView.toString());
      }
    }
    return null;
  }
  
  public final View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return onCreateView(null, paramString, paramContext, paramAttributeSet);
  }
  
  public final class a
    implements View.OnAttachStateChangeListener
  {
    public final void onViewAttachedToWindow(View paramView)
    {
      e0 locale0 = paramContext;
      paramView = c;
      locale0.k();
      r0.m((ViewGroup)mView.getParent(), b.a).l();
    }
    
    public final void onViewDetachedFromWindow(View paramView) {}
  }
}

/* Location:
 * Qualified Name:     x0.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */