package x0;

import a0.j;
import android.app.Activity;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.BadParcelableException;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import b1.t0;
import b1.w;
import e0.d0.c;
import f;
import g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import s1.d;
import y0.b;
import y0.b.a;
import y0.b.c;
import y0.k;
import y0.l;
import y0.m;

public final class e0
{
  public final v a;
  public final f0 b;
  public final i c;
  public boolean d = false;
  public int e = -1;
  
  public e0(v paramv, f0 paramf0, ClassLoader paramClassLoader, s params, Bundle paramBundle)
  {
    a = paramv;
    b = paramf0;
    paramv = (d0)paramBundle.getParcelable("state");
    paramf0 = a;
    paramf0 = i.instantiate(b.w.b, paramf0, null);
    mWho = b;
    mFromLayout = c;
    mRestored = true;
    mFragmentId = d;
    mContainerId = e;
    mTag = f;
    mRetainInstance = o;
    mRemoving = p;
    mDetached = q;
    mHidden = r;
    mMaxState = b1.k.b.values()[s];
    mTargetWho = t;
    mTargetRequestCode = u;
    mUserVisibleHint = v;
    c = paramf0;
    mSavedFragmentState = paramBundle;
    paramv = paramBundle.getBundle("arguments");
    if (paramv != null) {
      paramv.setClassLoader(paramClassLoader);
    }
    paramf0.setArguments(paramv);
    if (y.L(2))
    {
      paramv = new StringBuilder();
      paramv.append("Instantiated fragment ");
      paramv.append(paramf0);
      Log.v("FragmentManager", paramv.toString());
    }
  }
  
  public e0(v paramv, f0 paramf0, i parami)
  {
    a = paramv;
    b = paramf0;
    c = parami;
  }
  
  public e0(v paramv, f0 paramf0, i parami, Bundle paramBundle)
  {
    a = paramv;
    b = paramf0;
    c = parami;
    mSavedViewState = null;
    mSavedViewRegistryState = null;
    mBackStackNesting = 0;
    mInLayout = false;
    mAdded = false;
    paramv = mTarget;
    if (paramv != null) {
      paramv = mWho;
    } else {
      paramv = null;
    }
    mTargetWho = paramv;
    mTarget = null;
    mSavedFragmentState = paramBundle;
    mArguments = paramBundle.getBundle("arguments");
  }
  
  public final void a()
  {
    if (y.L(3))
    {
      localObject = f.l("moveto ACTIVITY_CREATED: ");
      ((StringBuilder)localObject).append(c);
      Log.d("FragmentManager", ((StringBuilder)localObject).toString());
    }
    Object localObject = null;
    Bundle localBundle = c.mSavedFragmentState;
    if (localBundle != null) {
      localObject = localBundle.getBundle("savedInstanceState");
    }
    c.performActivityCreated((Bundle)localObject);
    a.a(c, false);
  }
  
  public final void b()
  {
    Object localObject1 = c.mContainer;
    Object localObject2 = null;
    for (;;)
    {
      localObject3 = localObject2;
      if (localObject1 == null) {
        break;
      }
      localObject3 = ((View)localObject1).getTag(2131361955);
      if ((localObject3 instanceof i)) {
        localObject3 = (i)localObject3;
      } else {
        localObject3 = null;
      }
      if (localObject3 != null) {
        break;
      }
      localObject1 = ((View)localObject1).getParent();
      if ((localObject1 instanceof View)) {
        localObject1 = (View)localObject1;
      } else {
        localObject1 = null;
      }
    }
    localObject1 = c.getParentFragment();
    int i;
    if ((localObject3 != null) && (!((i)localObject3).equals(localObject1)))
    {
      localObject1 = c;
      i = mContainerId;
      localObject2 = b.a;
      localObject3 = new m((i)localObject1, (i)localObject3, i);
      b.c((k)localObject3);
      localObject2 = b.a((i)localObject1);
      if ((a.contains(b.a.e)) && (b.f((b.c)localObject2, localObject1.getClass(), m.class))) {
        b.b((b.c)localObject2, (k)localObject3);
      }
    }
    Object localObject3 = b;
    localObject2 = c;
    localObject3.getClass();
    localObject1 = mContainer;
    if (localObject1 != null)
    {
      int j = ((ArrayList)a).indexOf(localObject2);
      for (int k = j - 1;; k--)
      {
        i = j;
        if (k < 0) {
          break;
        }
        localObject2 = (i)((ArrayList)a).get(k);
        if (mContainer == localObject1)
        {
          localObject2 = mView;
          if (localObject2 != null)
          {
            i = ((ViewGroup)localObject1).indexOfChild((View)localObject2) + 1;
            break label343;
          }
        }
      }
      do
      {
        do
        {
          k = i + 1;
          if (k >= ((ArrayList)a).size()) {
            break;
          }
          localObject2 = (i)((ArrayList)a).get(k);
          i = k;
        } while (mContainer != localObject1);
        localObject2 = mView;
        i = k;
      } while (localObject2 == null);
      i = ((ViewGroup)localObject1).indexOfChild((View)localObject2);
    }
    else
    {
      i = -1;
    }
    label343:
    localObject1 = c;
    mContainer.addView(mView, i);
  }
  
  public final void c()
  {
    if (y.L(3))
    {
      localObject1 = f.l("moveto ATTACHED: ");
      ((StringBuilder)localObject1).append(c);
      Log.d("FragmentManager", ((StringBuilder)localObject1).toString());
    }
    i locali = c;
    Object localObject2 = mTarget;
    Object localObject1 = null;
    if (localObject2 != null)
    {
      localObject1 = b;
      localObject2 = mWho;
      localObject1 = (e0)((HashMap)b).get(localObject2);
      if (localObject1 != null)
      {
        localObject2 = c;
        mTargetWho = mTarget.mWho;
        mTarget = null;
      }
      else
      {
        localObject1 = f.l("Fragment ");
        ((StringBuilder)localObject1).append(c);
        ((StringBuilder)localObject1).append(" declared target fragment ");
        ((StringBuilder)localObject1).append(c.mTarget);
        ((StringBuilder)localObject1).append(" that does not belong to this FragmentManager!");
        throw new IllegalStateException(((StringBuilder)localObject1).toString());
      }
    }
    else
    {
      localObject2 = mTargetWho;
      if (localObject2 != null)
      {
        localObject1 = (e0)((HashMap)b.b).get(localObject2);
        if (localObject1 == null)
        {
          localObject1 = f.l("Fragment ");
          ((StringBuilder)localObject1).append(c);
          ((StringBuilder)localObject1).append(" declared target fragment ");
          throw new IllegalStateException(g.f((StringBuilder)localObject1, c.mTargetWho, " that does not belong to this FragmentManager!"));
        }
      }
    }
    if (localObject1 != null) {
      ((e0)localObject1).k();
    }
    localObject2 = c;
    localObject1 = mFragmentManager;
    mHost = w;
    mParentFragment = y;
    a.g((i)localObject2, false);
    c.performAttach();
    a.b(c, false);
  }
  
  public final int d()
  {
    Object localObject1 = c;
    if (mFragmentManager == null) {
      return mState;
    }
    int i = e;
    int j = mMaxState.ordinal();
    int k = 0;
    int m = 0;
    if (j != 1)
    {
      if (j != 2)
      {
        if (j != 3)
        {
          n = i;
          if (j != 4) {
            n = Math.min(i, -1);
          }
        }
        else
        {
          n = Math.min(i, 5);
        }
      }
      else {
        n = Math.min(i, 1);
      }
    }
    else {
      n = Math.min(i, 0);
    }
    localObject1 = c;
    i = n;
    if (mFromLayout) {
      if (mInLayout)
      {
        n = Math.max(e, 2);
        localObject1 = c.mView;
        i = n;
        if (localObject1 != null)
        {
          i = n;
          if (((View)localObject1).getParent() == null) {
            i = Math.min(n, 2);
          }
        }
      }
      else if (e < 4)
      {
        i = Math.min(n, mState);
      }
      else
      {
        i = Math.min(n, 1);
      }
    }
    int n = i;
    if (!c.mAdded) {
      n = Math.min(i, 1);
    }
    localObject1 = c;
    Object localObject2 = mContainer;
    if (localObject2 != null)
    {
      localObject2 = r0.m((ViewGroup)localObject2, ((i)localObject1).getParentFragmentManager());
      localObject2.getClass();
      i locali = c;
      ec.i.d(locali, "fragmentStateManager.fragment");
      localObject1 = ((r0)localObject2).j(locali);
      if (localObject1 != null) {
        i = b;
      } else {
        i = 0;
      }
      localObject1 = ((r0)localObject2).k(locali);
      if (localObject1 != null) {
        m = b;
      }
      if (i == 0) {
        j = -1;
      } else {
        j = r0.d.a[q0.g.c(i)];
      }
      k = m;
      if (j != -1)
      {
        k = m;
        if (j != 1) {
          k = i;
        }
      }
    }
    if (k == 2)
    {
      i = Math.min(n, 6);
    }
    else if (k == 3)
    {
      i = Math.max(n, 3);
    }
    else
    {
      localObject1 = c;
      i = n;
      if (mRemoving) {
        if (((i)localObject1).isInBackStack()) {
          i = Math.min(n, 1);
        } else {
          i = Math.min(n, -1);
        }
      }
    }
    localObject1 = c;
    n = i;
    if (mDeferStart)
    {
      n = i;
      if (mState < 5) {
        n = Math.min(i, 4);
      }
    }
    localObject1 = c;
    i = n;
    if (mTransitioning)
    {
      i = n;
      if (mContainer != null) {
        i = Math.max(n, 3);
      }
    }
    if (y.L(2))
    {
      localObject1 = j.n("computeExpectedState() of ", i, " for ");
      ((StringBuilder)localObject1).append(c);
      Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
    }
    return i;
  }
  
  public final void e()
  {
    if (y.L(3))
    {
      localObject1 = f.l("moveto CREATED: ");
      ((StringBuilder)localObject1).append(c);
      Log.d("FragmentManager", ((StringBuilder)localObject1).toString());
    }
    Object localObject1 = null;
    Object localObject2 = c.mSavedFragmentState;
    if (localObject2 != null) {
      localObject1 = ((Bundle)localObject2).getBundle("savedInstanceState");
    }
    localObject2 = c;
    if (!mIsCreated)
    {
      a.h((i)localObject2, false);
      c.performCreate((Bundle)localObject1);
      a.c(c, false);
    }
    else
    {
      mState = 1;
      ((i)localObject2).restoreChildFragmentState();
    }
  }
  
  public final void f()
  {
    if (c.mFromLayout) {
      return;
    }
    if (y.L(3))
    {
      localObject1 = f.l("moveto CREATE_VIEW: ");
      ((StringBuilder)localObject1).append(c);
      Log.d("FragmentManager", ((StringBuilder)localObject1).toString());
    }
    Object localObject3 = c.mSavedFragmentState;
    Object localObject1 = null;
    if (localObject3 != null) {
      localObject3 = ((Bundle)localObject3).getBundle("savedInstanceState");
    } else {
      localObject3 = null;
    }
    LayoutInflater localLayoutInflater = c.performGetLayoutInflater((Bundle)localObject3);
    i locali = c;
    Object localObject4 = mContainer;
    int i;
    Object localObject2;
    if (localObject4 != null)
    {
      localObject1 = localObject4;
    }
    else
    {
      i = mContainerId;
      if (i != 0) {
        if (i != -1)
        {
          localObject4 = (ViewGroup)mFragmentManager.x.b(i);
          if (localObject4 == null)
          {
            localObject1 = c;
            if (mRestored)
            {
              localObject1 = localObject4;
            }
            else
            {
              try
              {
                localObject1 = ((i)localObject1).getResources().getResourceName(c.mContainerId);
              }
              catch (Resources.NotFoundException localNotFoundException)
              {
                localObject2 = "unknown";
              }
              localObject3 = f.l("No view found for id 0x");
              ((StringBuilder)localObject3).append(Integer.toHexString(c.mContainerId));
              ((StringBuilder)localObject3).append(" (");
              ((StringBuilder)localObject3).append((String)localObject2);
              ((StringBuilder)localObject3).append(") for fragment ");
              ((StringBuilder)localObject3).append(c);
              throw new IllegalArgumentException(((StringBuilder)localObject3).toString());
            }
          }
          else
          {
            localObject2 = localObject4;
            if (!(localObject4 instanceof q))
            {
              locali = c;
              localObject2 = b.a;
              ec.i.e(locali, "fragment");
              l locall = new l(locali, (ViewGroup)localObject4);
              b.c(locall);
              b.c localc = b.a(locali);
              localObject2 = localObject4;
              if (a.contains(b.a.q))
              {
                localObject2 = localObject4;
                if (b.f(localc, locali.getClass(), l.class))
                {
                  b.b(localc, locall);
                  localObject2 = localObject4;
                }
              }
            }
          }
        }
        else
        {
          localObject2 = f.l("Cannot create fragment ");
          ((StringBuilder)localObject2).append(c);
          ((StringBuilder)localObject2).append(" for a container view with no id");
          throw new IllegalArgumentException(((StringBuilder)localObject2).toString());
        }
      }
    }
    localObject4 = c;
    mContainer = ((ViewGroup)localObject2);
    ((i)localObject4).performCreateView(localLayoutInflater, (ViewGroup)localObject2, (Bundle)localObject3);
    if (c.mView != null)
    {
      if (y.L(3))
      {
        localObject3 = f.l("moveto VIEW_CREATED: ");
        ((StringBuilder)localObject3).append(c);
        Log.d("FragmentManager", ((StringBuilder)localObject3).toString());
      }
      c.mView.setSaveFromParentEnabled(false);
      localObject3 = c;
      mView.setTag(2131361955, localObject3);
      if (localObject2 != null) {
        b();
      }
      localObject2 = c;
      if (mHidden) {
        mView.setVisibility(8);
      }
      if (c.mView.isAttachedToWindow())
      {
        localObject2 = c.mView;
        localObject3 = e0.d0.a;
        d0.c.c((View)localObject2);
      }
      else
      {
        localObject2 = c.mView;
        ((View)localObject2).addOnAttachStateChangeListener(new a((View)localObject2));
      }
      c.performViewCreated();
      localObject2 = a;
      localObject3 = c;
      ((v)localObject2).m((i)localObject3, mView, false);
      i = c.mView.getVisibility();
      float f = c.mView.getAlpha();
      c.setPostOnViewCreatedAlpha(f);
      localObject2 = c;
      if ((mContainer != null) && (i == 0))
      {
        localObject2 = mView.findFocus();
        if (localObject2 != null)
        {
          c.setFocusedView((View)localObject2);
          if (y.L(2))
          {
            localObject3 = new StringBuilder();
            ((StringBuilder)localObject3).append("requestFocus: Saved focused view ");
            ((StringBuilder)localObject3).append(localObject2);
            ((StringBuilder)localObject3).append(" for Fragment ");
            ((StringBuilder)localObject3).append(c);
            Log.v("FragmentManager", ((StringBuilder)localObject3).toString());
          }
        }
        c.mView.setAlpha(0.0F);
      }
    }
    c.mState = 2;
  }
  
  public final void g()
  {
    if (y.L(3))
    {
      localObject1 = f.l("movefrom CREATED: ");
      ((StringBuilder)localObject1).append(c);
      Log.d("FragmentManager", ((StringBuilder)localObject1).toString());
    }
    Object localObject1 = c;
    boolean bool1 = mRemoving;
    boolean bool2 = true;
    int i;
    if ((bool1) && (!((i)localObject1).isInBackStack())) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      localObject1 = c;
      if (!mBeingSaved) {
        b.j(null, mWho);
      }
    }
    Object localObject2;
    if (i == 0)
    {
      localObject2 = (b0)b.d;
      localObject1 = c;
      if ((d.containsKey(mWho)) && (g)) {
        bool1 = h;
      } else {
        bool1 = true;
      }
      if (!bool1)
      {
        j = 0;
        break label170;
      }
    }
    int j = 1;
    label170:
    if (j != 0)
    {
      localObject1 = c.mHost;
      if ((localObject1 instanceof t0))
      {
        bool1 = b.d).h;
      }
      else
      {
        localObject1 = b;
        bool1 = bool2;
        if ((localObject1 instanceof Activity)) {
          bool1 = true ^ ((Activity)localObject1).isChangingConfigurations();
        }
      }
      if (((i != 0) && (!c.mBeingSaved)) || (bool1)) {
        ((b0)b.d).e(c, false);
      }
      c.performDestroy();
      a.d(c, false);
      localObject1 = b.e().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (e0)((Iterator)localObject1).next();
        if (localObject2 != null)
        {
          localObject2 = c;
          if (c.mWho.equals(mTargetWho))
          {
            mTarget = c;
            mTargetWho = null;
          }
        }
      }
      localObject1 = c;
      localObject2 = mTargetWho;
      if (localObject2 != null) {
        mTarget = b.c((String)localObject2);
      }
      b.i(this);
    }
    else
    {
      localObject1 = c.mTargetWho;
      if (localObject1 != null)
      {
        localObject1 = b.c((String)localObject1);
        if ((localObject1 != null) && (mRetainInstance)) {
          c.mTarget = ((i)localObject1);
        }
      }
      c.mState = 0;
    }
  }
  
  public final void h()
  {
    if (y.L(3))
    {
      localObject1 = f.l("movefrom CREATE_VIEW: ");
      ((StringBuilder)localObject1).append(c);
      Log.d("FragmentManager", ((StringBuilder)localObject1).toString());
    }
    Object localObject2 = c;
    Object localObject1 = mContainer;
    if (localObject1 != null)
    {
      localObject2 = mView;
      if (localObject2 != null) {
        ((ViewGroup)localObject1).removeView((View)localObject2);
      }
    }
    c.performDestroyView();
    a.n(c, false);
    localObject1 = c;
    mContainer = null;
    mView = null;
    mViewLifecycleOwner = null;
    mViewLifecycleOwnerLiveData.setValue(null);
    c.mInLayout = false;
  }
  
  public final void i()
  {
    if (y.L(3))
    {
      localObject1 = f.l("movefrom ATTACHED: ");
      ((StringBuilder)localObject1).append(c);
      Log.d("FragmentManager", ((StringBuilder)localObject1).toString());
    }
    c.performDetach();
    Object localObject2 = a;
    Object localObject1 = c;
    int i = 0;
    ((v)localObject2).e((i)localObject1, false);
    localObject1 = c;
    mState = -1;
    mHost = null;
    mParentFragment = null;
    mFragmentManager = null;
    boolean bool1 = mRemoving;
    boolean bool2 = true;
    int j = i;
    if (bool1)
    {
      j = i;
      if (!((i)localObject1).isInBackStack()) {
        j = 1;
      }
    }
    if (j == 0)
    {
      localObject1 = (b0)b.d;
      localObject2 = c;
      if ((d.containsKey(mWho)) && (g)) {
        bool2 = h;
      }
      if (!bool2) {}
    }
    else
    {
      if (y.L(3))
      {
        localObject1 = f.l("initState called for fragment: ");
        ((StringBuilder)localObject1).append(c);
        Log.d("FragmentManager", ((StringBuilder)localObject1).toString());
      }
      c.initState();
    }
  }
  
  public final void j()
  {
    Object localObject = c;
    if ((mFromLayout) && (mInLayout) && (!mPerformedCreateView))
    {
      if (y.L(3))
      {
        localObject = f.l("moveto CREATE_VIEW: ");
        ((StringBuilder)localObject).append(c);
        Log.d("FragmentManager", ((StringBuilder)localObject).toString());
      }
      localObject = c.mSavedFragmentState;
      if (localObject != null) {
        localObject = ((Bundle)localObject).getBundle("savedInstanceState");
      } else {
        localObject = null;
      }
      i locali = c;
      locali.performCreateView(locali.performGetLayoutInflater((Bundle)localObject), null, (Bundle)localObject);
      localObject = c.mView;
      if (localObject != null)
      {
        ((View)localObject).setSaveFromParentEnabled(false);
        localObject = c;
        mView.setTag(2131361955, localObject);
        localObject = c;
        if (mHidden) {
          mView.setVisibility(8);
        }
        c.performViewCreated();
        localObject = a;
        locali = c;
        ((v)localObject).m(locali, mView, false);
        c.mState = 2;
      }
    }
  }
  
  public final void k()
  {
    Object localObject1;
    if (d)
    {
      if (y.L(2))
      {
        localObject1 = f.l("Ignoring re-entrant call to moveToExpectedState() for ");
        ((StringBuilder)localObject1).append(c);
        Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
      }
      return;
    }
    try
    {
      d = true;
      int k;
      for (int i = 0;; i = 1)
      {
        int j = d();
        localObject1 = c;
        k = mState;
        int m = 3;
        if (j == k) {
          break;
        }
        if (j > k) {
          switch (k + 1)
          {
          default: 
            break;
          case 7: 
            n();
            break;
          case 6: 
            mState = 6;
            break;
          case 5: 
            q();
            break;
          case 4: 
            if (mView != null)
            {
              localObject3 = mContainer;
              if (localObject3 != null)
              {
                localObject1 = r0.m((ViewGroup)localObject3, ((i)localObject1).getParentFragmentManager());
                i = c.mView.getVisibility();
                if (i != 0)
                {
                  if (i != 4)
                  {
                    if (i == 8)
                    {
                      i = m;
                    }
                    else
                    {
                      localObject3 = new java/lang/IllegalArgumentException;
                      localObject1 = new java/lang/StringBuilder;
                      ((StringBuilder)localObject1).<init>();
                      ((StringBuilder)localObject1).append("Unknown visibility ");
                      ((StringBuilder)localObject1).append(i);
                      ((IllegalArgumentException)localObject3).<init>(((StringBuilder)localObject1).toString());
                      throw ((Throwable)localObject3);
                    }
                  }
                  else {
                    i = 4;
                  }
                }
                else {
                  i = 2;
                }
                ((r0)localObject1).e(i, this);
              }
            }
            c.mState = 4;
            break;
          case 3: 
            a();
            break;
          case 2: 
            j();
            f();
            break;
          case 1: 
            e();
            break;
          case 0: 
            c();
            break;
          }
        } else {
          switch (k - 1)
          {
          default: 
            break;
          case 6: 
            l();
            break;
          case 5: 
            mState = 5;
            break;
          case 4: 
            r();
            break;
          case 3: 
            if (y.L(3))
            {
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>();
              ((StringBuilder)localObject1).append("movefrom ACTIVITY_CREATED: ");
              ((StringBuilder)localObject1).append(c);
              Log.d("FragmentManager", ((StringBuilder)localObject1).toString());
            }
            localObject3 = c;
            if (mBeingSaved)
            {
              localObject1 = b;
              localObject3 = mWho;
              ((f0)localObject1).j(o(), (String)localObject3);
            }
            else if ((mView != null) && (mSavedViewState == null))
            {
              p();
            }
            localObject1 = c;
            if (mView != null)
            {
              localObject3 = mContainer;
              if (localObject3 != null) {
                r0.m((ViewGroup)localObject3, ((i)localObject1).getParentFragmentManager()).g(this);
              }
            }
            c.mState = 3;
            break;
          case 2: 
            mInLayout = false;
            mState = 2;
            break;
          case 1: 
            h();
            c.mState = 1;
            break;
          case 0: 
            if (mBeingSaved)
            {
              localObject3 = b;
              localObject1 = mWho;
              if ((Bundle)((HashMap)c).get(localObject1) == null)
              {
                localObject1 = b;
                localObject3 = c.mWho;
                ((f0)localObject1).j(o(), (String)localObject3);
              }
            }
            g();
            break;
          case -1: 
            i();
          }
        }
      }
      if ((i == 0) && (k == -1) && (mRemoving) && (!((i)localObject1).isInBackStack()) && (!c.mBeingSaved))
      {
        if (y.L(3))
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append("Cleaning up state of never attached fragment: ");
          ((StringBuilder)localObject1).append(c);
          Log.d("FragmentManager", ((StringBuilder)localObject1).toString());
        }
        ((b0)b.d).e(c, true);
        b.i(this);
        if (y.L(3))
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append("initState called for fragment: ");
          ((StringBuilder)localObject1).append(c);
          Log.d("FragmentManager", ((StringBuilder)localObject1).toString());
        }
        c.initState();
      }
      Object localObject3 = c;
      if (mHiddenChanged)
      {
        if (mView != null)
        {
          localObject1 = mContainer;
          if (localObject1 != null)
          {
            localObject1 = r0.m((ViewGroup)localObject1, ((i)localObject3).getParentFragmentManager());
            if (c.mHidden) {
              ((r0)localObject1).f(this);
            } else {
              ((r0)localObject1).h(this);
            }
          }
        }
        localObject3 = c;
        localObject1 = mFragmentManager;
        if ((localObject1 != null) && (mAdded) && (y.M((i)localObject3))) {
          G = true;
        }
        localObject1 = c;
        mHiddenChanged = false;
        ((i)localObject1).onHiddenChanged(mHidden);
        c.mChildFragmentManager.p();
      }
      return;
    }
    finally
    {
      d = false;
    }
  }
  
  public final void l()
  {
    if (y.L(3))
    {
      StringBuilder localStringBuilder = f.l("movefrom RESUMED: ");
      localStringBuilder.append(c);
      Log.d("FragmentManager", localStringBuilder.toString());
    }
    c.performPause();
    a.f(c, false);
  }
  
  public final void m(ClassLoader paramClassLoader)
  {
    Object localObject = c.mSavedFragmentState;
    if (localObject == null) {
      return;
    }
    ((Bundle)localObject).setClassLoader(paramClassLoader);
    if (c.mSavedFragmentState.getBundle("savedInstanceState") == null) {
      c.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
    }
    try
    {
      paramClassLoader = c;
      mSavedViewState = mSavedFragmentState.getSparseParcelableArray("viewState");
      paramClassLoader = c;
      mSavedViewRegistryState = mSavedFragmentState.getBundle("viewRegistryState");
      paramClassLoader = (d0)c.mSavedFragmentState.getParcelable("state");
      if (paramClassLoader != null)
      {
        i locali = c;
        mTargetWho = t;
        mTargetRequestCode = u;
        localObject = mSavedUserVisibleHint;
        if (localObject != null)
        {
          mUserVisibleHint = ((Boolean)localObject).booleanValue();
          c.mSavedUserVisibleHint = null;
        }
        else
        {
          mUserVisibleHint = v;
        }
      }
      paramClassLoader = c;
      if (!mUserVisibleHint) {
        mDeferStart = true;
      }
      return;
    }
    catch (BadParcelableException paramClassLoader)
    {
      localObject = f.l("Failed to restore view hierarchy state for fragment ");
      ((StringBuilder)localObject).append(c);
      throw new IllegalStateException(((StringBuilder)localObject).toString(), paramClassLoader);
    }
  }
  
  public final void n()
  {
    if (y.L(3))
    {
      localObject = f.l("moveto RESUMED: ");
      ((StringBuilder)localObject).append(c);
      Log.d("FragmentManager", ((StringBuilder)localObject).toString());
    }
    View localView = c.getFocusedView();
    if (localView != null)
    {
      localObject = c.mView;
      int i = 1;
      if (localView != localObject)
      {
        for (localObject = localView.getParent(); localObject != null; localObject = ((ViewParent)localObject).getParent()) {
          if (localObject == c.mView) {
            break label98;
          }
        }
        i = 0;
      }
      label98:
      if (i != 0)
      {
        boolean bool = localView.requestFocus();
        if (y.L(2))
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("requestFocus: Restoring focused view ");
          localStringBuilder.append(localView);
          localStringBuilder.append(" ");
          if (bool) {
            localObject = "succeeded";
          } else {
            localObject = "failed";
          }
          localStringBuilder.append((String)localObject);
          localStringBuilder.append(" on Fragment ");
          localStringBuilder.append(c);
          localStringBuilder.append(" resulting in focused view ");
          localStringBuilder.append(c.mView.findFocus());
          Log.v("FragmentManager", localStringBuilder.toString());
        }
      }
    }
    c.setFocusedView(null);
    c.performResume();
    a.i(c, false);
    b.j(null, c.mWho);
    Object localObject = c;
    mSavedFragmentState = null;
    mSavedViewState = null;
    mSavedViewRegistryState = null;
  }
  
  public final Bundle o()
  {
    Bundle localBundle = new Bundle();
    Object localObject = c;
    if (mState == -1)
    {
      localObject = mSavedFragmentState;
      if (localObject != null) {
        localBundle.putAll((Bundle)localObject);
      }
    }
    localBundle.putParcelable("state", new d0(c));
    if (c.mState > -1)
    {
      localObject = new Bundle();
      c.performSaveInstanceState((Bundle)localObject);
      if (!((BaseBundle)localObject).isEmpty()) {
        localBundle.putBundle("savedInstanceState", (Bundle)localObject);
      }
      a.j(c, (Bundle)localObject, false);
      localObject = new Bundle();
      c.mSavedStateRegistryController.c((Bundle)localObject);
      if (!((BaseBundle)localObject).isEmpty()) {
        localBundle.putBundle("registryState", (Bundle)localObject);
      }
      localObject = c.mChildFragmentManager.W();
      if (!((BaseBundle)localObject).isEmpty()) {
        localBundle.putBundle("childFragmentManager", (Bundle)localObject);
      }
      if (c.mView != null) {
        p();
      }
      localObject = c.mSavedViewState;
      if (localObject != null) {
        localBundle.putSparseParcelableArray("viewState", (SparseArray)localObject);
      }
      localObject = c.mSavedViewRegistryState;
      if (localObject != null) {
        localBundle.putBundle("viewRegistryState", (Bundle)localObject);
      }
    }
    localObject = c.mArguments;
    if (localObject != null) {
      localBundle.putBundle("arguments", (Bundle)localObject);
    }
    return localBundle;
  }
  
  public final void p()
  {
    if (c.mView == null) {
      return;
    }
    if (y.L(2))
    {
      localObject = f.l("Saving view state for fragment ");
      ((StringBuilder)localObject).append(c);
      ((StringBuilder)localObject).append(" with view ");
      ((StringBuilder)localObject).append(c.mView);
      Log.v("FragmentManager", ((StringBuilder)localObject).toString());
    }
    Object localObject = new SparseArray();
    c.mView.saveHierarchyState((SparseArray)localObject);
    if (((SparseArray)localObject).size() > 0) {
      c.mSavedViewState = ((SparseArray)localObject);
    }
    localObject = new Bundle();
    c.mViewLifecycleOwner.e.c((Bundle)localObject);
    if (!((BaseBundle)localObject).isEmpty()) {
      c.mSavedViewRegistryState = ((Bundle)localObject);
    }
  }
  
  public final void q()
  {
    if (y.L(3))
    {
      StringBuilder localStringBuilder = f.l("moveto STARTED: ");
      localStringBuilder.append(c);
      Log.d("FragmentManager", localStringBuilder.toString());
    }
    c.performStart();
    a.k(c, false);
  }
  
  public final void r()
  {
    if (y.L(3))
    {
      StringBuilder localStringBuilder = f.l("movefrom STARTED: ");
      localStringBuilder.append(c);
      Log.d("FragmentManager", localStringBuilder.toString());
    }
    c.performStop();
    a.l(c, false);
  }
  
  public final class a
    implements View.OnAttachStateChangeListener
  {
    public a() {}
    
    public final void onViewAttachedToWindow(View paramView)
    {
      removeOnAttachStateChangeListener(this);
      View localView = e0.this;
      paramView = e0.d0.a;
      d0.c.c(localView);
    }
    
    public final void onViewDetachedFromWindow(View paramView) {}
  }
}

/* Location:
 * Qualified Name:     x0.e0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */