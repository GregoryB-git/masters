package x0;

import a0.c;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import b.k;
import dc.l;
import e0.d0;
import e0.d0.d;
import e0.k0;
import e0.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.WeakHashMap;
import r.g.b;
import sb.m;
import u.a0;

public final class e
  extends r0
{
  public e(ViewGroup paramViewGroup)
  {
    super(paramViewGroup);
  }
  
  public static void q(r.b paramb, View paramView)
  {
    Object localObject = d0.a;
    localObject = d0.d.k(paramView);
    if (localObject != null) {
      paramb.put(localObject, paramView);
    }
    if ((paramView instanceof ViewGroup))
    {
      localObject = (ViewGroup)paramView;
      int i = ((ViewGroup)localObject).getChildCount();
      for (int j = 0; j < i; j++)
      {
        paramView = ((ViewGroup)localObject).getChildAt(j);
        if (paramView.getVisibility() == 0) {
          q(paramb, paramView);
        }
      }
    }
  }
  
  public static void r(r.b paramb, Collection paramCollection)
  {
    Set localSet = paramb.entrySet();
    ec.i.d(localSet, "entries");
    paramb = new i(paramCollection);
    paramCollection = ((g.b)localSet).iterator();
    while (paramCollection.hasNext()) {
      if (!((Boolean)paramb.invoke(paramCollection.next())).booleanValue()) {
        paramCollection.remove();
      }
    }
  }
  
  public final void b(ArrayList paramArrayList, boolean paramBoolean)
  {
    boolean bool1 = paramBoolean;
    Object localObject1 = paramArrayList.iterator();
    int i;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = ((Iterator)localObject1).next();
      localObject3 = (r0.c)localObject2;
      localObject4 = c.mView;
      ec.i.d(localObject4, "operation.fragment.mView");
      if ((s0.a((View)localObject4) == 2) && (a != 2)) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        break label89;
      }
    }
    Object localObject2 = null;
    label89:
    r0.c localc1 = (r0.c)localObject2;
    Object localObject4 = paramArrayList.listIterator(paramArrayList.size());
    while (((ListIterator)localObject4).hasPrevious())
    {
      localObject2 = ((ListIterator)localObject4).previous();
      localObject3 = (r0.c)localObject2;
      localObject1 = c.mView;
      ec.i.d(localObject1, "operation.fragment.mView");
      if ((s0.a((View)localObject1) != 2) && (a == 2)) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        break label187;
      }
    }
    localObject2 = null;
    label187:
    r0.c localc2 = (r0.c)localObject2;
    if (y.L(2))
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Executing operations from ");
      ((StringBuilder)localObject2).append(localc1);
      ((StringBuilder)localObject2).append(" to ");
      ((StringBuilder)localObject2).append(localc2);
      Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
    }
    localObject2 = new ArrayList();
    Object localObject3 = new ArrayList();
    if (!paramArrayList.isEmpty())
    {
      localObject4 = getdc;
      Iterator localIterator = paramArrayList.iterator();
      Object localObject5;
      while (localIterator.hasNext())
      {
        localObject5 = nextc.mAnimationInfo;
        localObject1 = mAnimationInfo;
        b = b;
        c = c;
        d = d;
        e = e;
      }
      localObject1 = paramArrayList.iterator();
      boolean bool2;
      while (((Iterator)localObject1).hasNext())
      {
        localObject4 = (r0.c)((Iterator)localObject1).next();
        ((ArrayList)localObject2).add(new b((r0.c)localObject4, bool1));
        if (bool1 ? localObject4 == localc1 : localObject4 == localc2) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        ((ArrayList)localObject3).add(new h((r0.c)localObject4, bool1, bool2));
        paramArrayList = new g.q(1, this, localObject4);
        d.add(paramArrayList);
      }
      paramArrayList = new ArrayList();
      localObject1 = ((ArrayList)localObject3).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = ((Iterator)localObject1).next();
        if (!((h)localObject3).a()) {
          paramArrayList.add(localObject3);
        }
      }
      localObject4 = new ArrayList();
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
      {
        localObject3 = paramArrayList.next();
        if (((h)localObject3).b() != null) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0) {
          ((ArrayList)localObject4).add(localObject3);
        }
      }
      localObject3 = ((ArrayList)localObject4).iterator();
      localObject1 = null;
      while (((Iterator)localObject3).hasNext())
      {
        localObject5 = (h)((Iterator)localObject3).next();
        paramArrayList = ((h)localObject5).b();
        if ((localObject1 != null) && (paramArrayList != localObject1)) {
          i = 0;
        } else {
          i = 1;
        }
        if (i != 0)
        {
          localObject1 = paramArrayList;
        }
        else
        {
          paramArrayList = f.l("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
          paramArrayList.append(a.c);
          paramArrayList.append(" returned Transition ");
          paramArrayList.append(b);
          paramArrayList.append(" which uses a different Transition type than other Fragments.");
          throw new IllegalArgumentException(paramArrayList.toString().toString());
        }
      }
      if (localObject1 == null)
      {
        paramArrayList = (ArrayList)localObject2;
      }
      else
      {
        paramArrayList = new ArrayList();
        localObject3 = new ArrayList();
        r.b localb1 = new r.b();
        Object localObject6 = new ArrayList();
        ArrayList localArrayList1 = new ArrayList();
        r.b localb2 = new r.b();
        r.b localb3 = new r.b();
        localIterator = ((ArrayList)localObject4).iterator();
        Object localObject7 = null;
        localObject5 = localObject1;
        while (localIterator.hasNext())
        {
          localObject1 = nextd;
          if (localObject1 != null) {
            i = 1;
          } else {
            i = 0;
          }
          if ((i != 0) && (localc1 != null) && (localc2 != null))
          {
            localObject6 = ((n0)localObject5).r(((n0)localObject5).e(localObject1));
            localArrayList1 = c.getSharedElementSourceNames();
            ec.i.d(localArrayList1, "lastIn.fragment.sharedElementSourceNames");
            localObject7 = c.getSharedElementSourceNames();
            ec.i.d(localObject7, "firstOut.fragment.sharedElementSourceNames");
            localObject1 = c.getSharedElementTargetNames();
            ec.i.d(localObject1, "firstOut.fragment.sharedElementTargetNames");
            i = ((ArrayList)localObject1).size();
            for (int j = 0; j < i; j++)
            {
              int k = localArrayList1.indexOf(((ArrayList)localObject1).get(j));
              if (k != -1) {
                localArrayList1.set(k, ((ArrayList)localObject7).get(j));
              }
            }
            ArrayList localArrayList2 = c.getSharedElementTargetNames();
            ec.i.d(localArrayList2, "lastIn.fragment.sharedElementTargetNames");
            if (!paramBoolean) {
              localObject1 = new rb.d(c.getExitTransitionCallback(), c.getEnterTransitionCallback());
            } else {
              localObject1 = new rb.d(c.getEnterTransitionCallback(), c.getExitTransitionCallback());
            }
            Object localObject8 = (a0)a;
            Object localObject9 = (a0)b;
            i = localArrayList1.size();
            for (j = 0; j < i; j++)
            {
              localObject1 = localArrayList1.get(j);
              ec.i.d(localObject1, "exitingNames[i]");
              localObject1 = (String)localObject1;
              localObject7 = localArrayList2.get(j);
              ec.i.d(localObject7, "enteringNames[i]");
              localb1.put(localObject1, (String)localObject7);
            }
            if (y.L(2))
            {
              Log.v("FragmentManager", ">>> entering view names <<<");
              localObject7 = localArrayList2.iterator();
              String str;
              for (;;)
              {
                bool2 = ((Iterator)localObject7).hasNext();
                localObject1 = paramArrayList;
                if (!bool2) {
                  break;
                }
                str = (String)((Iterator)localObject7).next();
                paramArrayList = new StringBuilder();
                paramArrayList.append("Name: ");
                paramArrayList.append(str);
                Log.v("FragmentManager", paramArrayList.toString());
                paramArrayList = (ArrayList)localObject1;
              }
              Log.v("FragmentManager", ">>> exiting view names <<<");
              localObject7 = localArrayList1.iterator();
              for (;;)
              {
                paramArrayList = (ArrayList)localObject1;
                if (!((Iterator)localObject7).hasNext()) {
                  break;
                }
                str = (String)((Iterator)localObject7).next();
                paramArrayList = new StringBuilder();
                paramArrayList.append("Name: ");
                paramArrayList.append(str);
                Log.v("FragmentManager", paramArrayList.toString());
              }
            }
            localObject1 = c.mView;
            ec.i.d(localObject1, "firstOut.fragment.mView");
            q(localb2, (View)localObject1);
            r.g.k(localb2, localArrayList1);
            if (localObject8 != null)
            {
              if (y.L(2))
              {
                localObject1 = new StringBuilder();
                ((StringBuilder)localObject1).append("Executing exit callback for operation ");
                ((StringBuilder)localObject1).append(localc1);
                Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
              }
              i = localArrayList1.size() - 1;
              if (i >= 0) {
                for (;;)
                {
                  j = i - 1;
                  localObject1 = localArrayList1.get(i);
                  ec.i.d(localObject1, "exitingNames[i]");
                  localObject7 = (String)localObject1;
                  localObject1 = (View)localb2.getOrDefault(localObject7, null);
                  if (localObject1 == null)
                  {
                    localb1.remove(localObject7);
                  }
                  else
                  {
                    localObject8 = d0.a;
                    if (!ec.i.a(localObject7, d0.d.k((View)localObject1)))
                    {
                      localObject7 = (String)localb1.remove(localObject7);
                      localb1.put(d0.d.k((View)localObject1), localObject7);
                    }
                  }
                  if (j < 0) {
                    break;
                  }
                  i = j;
                }
              }
            }
            else
            {
              r.g.k(localb1, localb2.keySet());
            }
            localObject1 = c.mView;
            ec.i.d(localObject1, "lastIn.fragment.mView");
            q(localb3, (View)localObject1);
            r.g.k(localb3, localArrayList2);
            r.g.k(localb3, localb1.values());
            if (localObject9 != null)
            {
              if (y.L(2))
              {
                localObject1 = new StringBuilder();
                ((StringBuilder)localObject1).append("Executing enter callback for operation ");
                ((StringBuilder)localObject1).append(localc2);
                Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
              }
              i = localArrayList2.size() - 1;
              if (i >= 0) {
                for (;;)
                {
                  j = i - 1;
                  localObject1 = localArrayList2.get(i);
                  ec.i.d(localObject1, "enteringNames[i]");
                  localObject7 = (String)localObject1;
                  localObject1 = (View)localb3.getOrDefault(localObject7, null);
                  if (localObject1 == null)
                  {
                    localObject1 = h0.b(localb1, (String)localObject7);
                    if (localObject1 != null) {
                      localb1.remove(localObject1);
                    }
                  }
                  else
                  {
                    localObject9 = d0.a;
                    if (!ec.i.a(localObject7, d0.d.k((View)localObject1)))
                    {
                      localObject7 = h0.b(localb1, (String)localObject7);
                      if (localObject7 != null) {
                        localb1.put(localObject7, d0.d.k((View)localObject1));
                      }
                    }
                  }
                  if (j < 0)
                  {
                    localObject1 = null;
                    break;
                  }
                  i = j;
                }
              }
            }
            else
            {
              localObject1 = h0.a;
              for (i = c - 1; -1 < i; i--) {
                if (!localb3.containsKey((String)localb1.k(i))) {
                  localb1.j(i);
                }
              }
            }
            localObject1 = null;
            localObject7 = localb1.keySet();
            ec.i.d(localObject7, "sharedElementNameMapping.keys");
            r(localb2, (Collection)localObject7);
            localObject7 = localb1.values();
            ec.i.d(localObject7, "sharedElementNameMapping.values");
            r(localb3, (Collection)localObject7);
            if (localb1.isEmpty())
            {
              localObject7 = new StringBuilder();
              ((StringBuilder)localObject7).append("Ignoring shared elements transition ");
              ((StringBuilder)localObject7).append(localObject6);
              ((StringBuilder)localObject7).append(" between ");
              ((StringBuilder)localObject7).append(localc1);
              ((StringBuilder)localObject7).append(" and ");
              ((StringBuilder)localObject7).append(localc2);
              ((StringBuilder)localObject7).append(" as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
              Log.i("FragmentManager", ((StringBuilder)localObject7).toString());
              paramArrayList.clear();
              ((ArrayList)localObject3).clear();
            }
            else
            {
              localObject1 = localObject6;
            }
            localObject6 = localArrayList2;
          }
          else
          {
            localObject1 = localObject7;
          }
          localObject7 = localObject1;
        }
        if (localObject7 == null)
        {
          if (!((ArrayList)localObject4).isEmpty())
          {
            localObject1 = ((ArrayList)localObject4).iterator();
            while (((Iterator)localObject1).hasNext())
            {
              if (nextb == null) {
                i = 1;
              } else {
                i = 0;
              }
              if (i == 0)
              {
                i = 0;
                break label2119;
              }
            }
          }
          i = 1;
          label2119:
          if (i != 0)
          {
            paramArrayList = (ArrayList)localObject2;
            break label2206;
          }
        }
        paramArrayList = new g((ArrayList)localObject4, localc1, localc2, (n0)localObject5, localObject7, paramArrayList, (ArrayList)localObject3, localb1, (ArrayList)localObject6, localArrayList1, localb2, localb3, paramBoolean);
        localObject3 = ((ArrayList)localObject4).iterator();
        while (((Iterator)localObject3).hasNext()) {
          nexta.j.add(paramArrayList);
        }
        paramArrayList = (ArrayList)localObject2;
      }
      label2206:
      localObject2 = new ArrayList();
      localObject3 = new ArrayList();
      localObject1 = paramArrayList.iterator();
      while (((Iterator)localObject1).hasNext()) {
        sb.o.k(nexta.k, (ArrayList)localObject3);
      }
      paramBoolean = ((ArrayList)localObject3).isEmpty();
      paramArrayList = paramArrayList.iterator();
      i = 0;
      while (paramArrayList.hasNext())
      {
        localObject1 = (b)paramArrayList.next();
        localObject4 = a.getContext();
        localObject3 = a;
        ec.i.d(localObject4, "context");
        localObject4 = ((b)localObject1).b((Context)localObject4);
        if (localObject4 != null) {
          if (b == null)
          {
            ((ArrayList)localObject2).add(localObject1);
          }
          else
          {
            localObject4 = c;
            if ((k.isEmpty() ^ true))
            {
              if (y.L(2))
              {
                localObject3 = new StringBuilder();
                ((StringBuilder)localObject3).append("Ignoring Animator set on ");
                ((StringBuilder)localObject3).append(localObject4);
                ((StringBuilder)localObject3).append(" as this Fragment was involved in a Transition.");
                Log.v("FragmentManager", ((StringBuilder)localObject3).toString());
              }
            }
            else
            {
              if (a == 3) {
                i = 1;
              } else {
                i = 0;
              }
              if (i != 0) {
                i = false;
              }
              localObject1 = new c((b)localObject1);
              j.add(localObject1);
              i = 1;
            }
          }
        }
      }
      localObject3 = ((ArrayList)localObject2).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject1 = (b)((Iterator)localObject3).next();
        paramArrayList = a;
        localObject2 = c;
        if ((paramBoolean ^ true))
        {
          if (!y.L(2)) {
            continue;
          }
          paramArrayList = new StringBuilder();
          paramArrayList.append("Ignoring Animation set on ");
          paramArrayList.append(localObject2);
          localObject2 = " as Animations cannot run alongside Transitions.";
        }
        else
        {
          if (i == 0) {
            break label2636;
          }
          if (!y.L(2)) {
            continue;
          }
          paramArrayList = new StringBuilder();
          paramArrayList.append("Ignoring Animation set on ");
          paramArrayList.append(localObject2);
          localObject2 = " as Animations cannot run alongside Animators.";
        }
        paramArrayList.append((String)localObject2);
        Log.v("FragmentManager", paramArrayList.toString());
        continue;
        label2636:
        localObject2 = new a((b)localObject1);
        j.add(localObject2);
      }
      return;
    }
    throw new NoSuchElementException("List is empty.");
  }
  
  public static final class a
    extends r0.a
  {
    public final e.b c;
    
    public a(e.b paramb)
    {
      c = paramb;
    }
    
    public final void b(ViewGroup paramViewGroup)
    {
      ec.i.e(paramViewGroup, "container");
      r0.c localc = c.a;
      View localView = c.mView;
      localView.clearAnimation();
      paramViewGroup.endViewTransition(localView);
      c.a.c(this);
      if (y.L(2))
      {
        paramViewGroup = new StringBuilder();
        paramViewGroup.append("Animation from operation ");
        paramViewGroup.append(localc);
        paramViewGroup.append(" has been cancelled.");
        Log.v("FragmentManager", paramViewGroup.toString());
      }
    }
    
    public final void c(final ViewGroup paramViewGroup)
    {
      ec.i.e(paramViewGroup, "container");
      if (c.a())
      {
        c.a.c(this);
        return;
      }
      Context localContext = paramViewGroup.getContext();
      Object localObject = c;
      r0.c localc = a;
      final View localView = c.mView;
      ec.i.d(localContext, "context");
      localObject = ((e.b)localObject).b(localContext);
      if (localObject != null)
      {
        localObject = a;
        if (localObject != null)
        {
          if (a != 1)
          {
            localView.startAnimation((Animation)localObject);
            c.a.c(this);
          }
          else
          {
            paramViewGroup.startViewTransition(localView);
            localObject = new o((Animation)localObject, paramViewGroup, localView);
            ((Animation)localObject).setAnimationListener(new a(localc, paramViewGroup, localView, this));
            localView.startAnimation((Animation)localObject);
            if (y.L(2))
            {
              paramViewGroup = new StringBuilder();
              paramViewGroup.append("Animation from operation ");
              paramViewGroup.append(localc);
              paramViewGroup.append(" has started.");
              Log.v("FragmentManager", paramViewGroup.toString());
            }
          }
          return;
        }
        throw new IllegalStateException("Required value was null.".toString());
      }
      throw new IllegalStateException("Required value was null.".toString());
    }
    
    public static final class a
      implements Animation.AnimationListener
    {
      public a(r0.c paramc, ViewGroup paramViewGroup, View paramView, e.a parama) {}
      
      public final void onAnimationEnd(Animation paramAnimation)
      {
        ec.i.e(paramAnimation, "animation");
        paramAnimation = paramViewGroup;
        paramAnimation.post(new d(paramAnimation, localView, jdField_this, 0));
        if (y.L(2))
        {
          paramAnimation = f.l("Animation from operation ");
          paramAnimation.append(a);
          paramAnimation.append(" has ended.");
          Log.v("FragmentManager", paramAnimation.toString());
        }
      }
      
      public final void onAnimationRepeat(Animation paramAnimation)
      {
        ec.i.e(paramAnimation, "animation");
      }
      
      public final void onAnimationStart(Animation paramAnimation)
      {
        ec.i.e(paramAnimation, "animation");
        if (y.L(2))
        {
          paramAnimation = f.l("Animation from operation ");
          paramAnimation.append(a);
          paramAnimation.append(" has reached onAnimationStart.");
          Log.v("FragmentManager", paramAnimation.toString());
        }
      }
    }
  }
  
  public static final class b
    extends e.f
  {
    public final boolean b;
    public boolean c;
    public n d;
    
    public b(r0.c paramc, boolean paramBoolean)
    {
      super();
      b = paramBoolean;
    }
    
    public final n b(Context paramContext)
    {
      Object localObject1;
      Object localObject2;
      boolean bool1;
      int m;
      if (c)
      {
        paramContext = d;
      }
      else
      {
        localObject1 = a;
        localObject2 = c;
        i = a;
        j = 0;
        if (i == 2) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        boolean bool2 = b;
        int k = ((i)localObject2).getNextTransition();
        if (bool2)
        {
          if (bool1) {
            i = ((i)localObject2).getPopEnterAnim();
          } else {
            i = ((i)localObject2).getPopExitAnim();
          }
        }
        else if (bool1) {
          i = ((i)localObject2).getEnterAnim();
        } else {
          i = ((i)localObject2).getExitAnim();
        }
        ((i)localObject2).setAnimations(0, 0, 0, 0);
        localObject1 = mContainer;
        if ((localObject1 != null) && (((View)localObject1).getTag(2131362066) != null)) {
          mContainer.setTag(2131362066, null);
        }
        localObject1 = mContainer;
        if ((localObject1 == null) || (((ViewGroup)localObject1).getLayoutTransition() == null))
        {
          localObject1 = ((i)localObject2).onCreateAnimation(k, bool1, i);
          if (localObject1 != null)
          {
            paramContext = new n((Animation)localObject1);
            break label532;
          }
          localObject2 = ((i)localObject2).onCreateAnimator(k, bool1, i);
          if (localObject2 != null)
          {
            paramContext = new n((Animator)localObject2);
            break label532;
          }
          m = i;
          if (i == 0)
          {
            m = i;
            if (k != 0)
            {
              m = -1;
              if (k != 4097)
              {
                if (k != 8194)
                {
                  if (k != 8197)
                  {
                    if (k != 4099)
                    {
                      if (k != 4100) {
                        break label405;
                      }
                      if (bool1) {
                        i = 16842936;
                      } else {
                        i = 16842937;
                      }
                    }
                    else
                    {
                      if (bool1)
                      {
                        i = 2130837506;
                        break label401;
                      }
                      i = 2130837507;
                      break label401;
                    }
                  }
                  else if (bool1) {
                    i = 16842938;
                  } else {
                    i = 16842939;
                  }
                  localObject2 = paramContext.obtainStyledAttributes(16973825, new int[] { i });
                  m = ((TypedArray)localObject2).getResourceId(0, -1);
                  ((TypedArray)localObject2).recycle();
                  break label405;
                }
                else if (bool1)
                {
                  i = 2130837504;
                }
                else
                {
                  i = 2130837505;
                }
              }
              else if (bool1) {
                i = 2130837508;
              } else {
                i = 2130837509;
              }
              label401:
              m = i;
            }
          }
          label405:
          if (m != 0)
          {
            bool1 = "anim".equals(paramContext.getResources().getResourceTypeName(m));
            i = j;
            if (!bool1) {}
          }
        }
      }
      try
      {
        try
        {
          localObject1 = AnimationUtils.loadAnimation(paramContext, m);
          if (localObject1 != null)
          {
            localObject2 = new x0/n;
            ((n)localObject2).<init>((Animation)localObject1);
            paramContext = (Context)localObject2;
            break label532;
          }
          i = 1;
        }
        catch (Resources.NotFoundException paramContext)
        {
          throw paramContext;
        }
      }
      catch (RuntimeException localRuntimeException2)
      {
        for (;;)
        {
          label532:
          i = j;
        }
      }
      if (i == 0) {
        try
        {
          localObject1 = AnimatorInflater.loadAnimator(paramContext, m);
          if (localObject1 != null)
          {
            localObject2 = new x0/n;
            ((n)localObject2).<init>((Animator)localObject1);
            paramContext = (Context)localObject2;
          }
        }
        catch (RuntimeException localRuntimeException1)
        {
          if (!bool1)
          {
            paramContext = AnimationUtils.loadAnimation(paramContext, m);
            if (paramContext != null)
            {
              paramContext = new n(paramContext);
              break label532;
            }
          }
          else
          {
            throw localRuntimeException1;
          }
        }
      }
      paramContext = null;
      d = paramContext;
      c = true;
      return paramContext;
    }
  }
  
  public static final class c
    extends r0.a
  {
    public final e.b c;
    public AnimatorSet d;
    
    public c(e.b paramb)
    {
      c = paramb;
    }
    
    public final void b(ViewGroup paramViewGroup)
    {
      ec.i.e(paramViewGroup, "container");
      Object localObject = d;
      if (localObject == null)
      {
        c.a.c(this);
      }
      else
      {
        paramViewGroup = c.a;
        if (g)
        {
          if (Build.VERSION.SDK_INT >= 26) {
            e.e.a.a((AnimatorSet)localObject);
          }
        }
        else {
          ((AnimatorSet)localObject).end();
        }
        if (y.L(2))
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Animator from operation ");
          ((StringBuilder)localObject).append(paramViewGroup);
          ((StringBuilder)localObject).append(" has been canceled");
          if (g) {
            paramViewGroup = " with seeking.";
          } else {
            paramViewGroup = ".";
          }
          ((StringBuilder)localObject).append(paramViewGroup);
          ((StringBuilder)localObject).append(' ');
          Log.v("FragmentManager", ((StringBuilder)localObject).toString());
        }
      }
    }
    
    public final void c(ViewGroup paramViewGroup)
    {
      ec.i.e(paramViewGroup, "container");
      paramViewGroup = c.a;
      Object localObject = d;
      if (localObject == null)
      {
        paramViewGroup.c(this);
        return;
      }
      ((AnimatorSet)localObject).start();
      if (y.L(2))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Animator from operation ");
        ((StringBuilder)localObject).append(paramViewGroup);
        ((StringBuilder)localObject).append(" has started.");
        Log.v("FragmentManager", ((StringBuilder)localObject).toString());
      }
    }
    
    public final void d(b.b paramb, ViewGroup paramViewGroup)
    {
      ec.i.e(paramb, "backEvent");
      ec.i.e(paramViewGroup, "container");
      paramViewGroup = c.a;
      AnimatorSet localAnimatorSet = d;
      if (localAnimatorSet == null)
      {
        paramViewGroup.c(this);
        return;
      }
      if ((Build.VERSION.SDK_INT >= 34) && (c.mTransitioning))
      {
        if (y.L(2))
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Adding BackProgressCallbacks for Animators to operation ");
          localStringBuilder.append(paramViewGroup);
          Log.v("FragmentManager", localStringBuilder.toString());
        }
        long l1 = e.d.a.a(localAnimatorSet);
        long l2 = (c * (float)l1);
        long l3 = l2;
        if (l2 == 0L) {
          l3 = 1L;
        }
        l2 = l3;
        if (l3 == l1) {
          l2 = l1 - 1L;
        }
        if (y.L(2))
        {
          paramb = new StringBuilder();
          paramb.append("Setting currentPlayTime to ");
          paramb.append(l2);
          paramb.append(" for Animator ");
          paramb.append(localAnimatorSet);
          paramb.append(" on operation ");
          paramb.append(paramViewGroup);
          Log.v("FragmentManager", paramb.toString());
        }
        e.e.a.b(localAnimatorSet, l2);
      }
    }
    
    public final void e(ViewGroup paramViewGroup)
    {
      if (c.a()) {
        return;
      }
      final Object localObject1 = paramViewGroup.getContext();
      final Object localObject2 = c;
      ec.i.d(localObject1, "context");
      localObject2 = ((e.b)localObject2).b((Context)localObject1);
      if (localObject2 != null) {
        localObject2 = b;
      } else {
        localObject2 = null;
      }
      d = ((AnimatorSet)localObject2);
      localObject2 = c.a;
      localObject1 = c;
      final boolean bool;
      if (a == 3) {
        bool = true;
      } else {
        bool = false;
      }
      localObject1 = mView;
      paramViewGroup.startViewTransition((View)localObject1);
      AnimatorSet localAnimatorSet = d;
      if (localAnimatorSet != null) {
        localAnimatorSet.addListener(new a(paramViewGroup, (View)localObject1, bool, (r0.c)localObject2, this));
      }
      paramViewGroup = d;
      if (paramViewGroup != null) {
        paramViewGroup.setTarget(localObject1);
      }
    }
    
    public static final class a
      extends AnimatorListenerAdapter
    {
      public a(ViewGroup paramViewGroup, View paramView, boolean paramBoolean, r0.c paramc, e.c paramc1) {}
      
      public final void onAnimationEnd(Animator paramAnimator)
      {
        ec.i.e(paramAnimator, "anim");
        a.endViewTransition(localObject1);
        if (bool)
        {
          int i = localObject2a;
          paramAnimator = localObject1;
          ec.i.d(paramAnimator, "viewToAnimate");
          a0.j.a(i, paramAnimator, a);
        }
        paramAnimator = jdField_this;
        c.a.c(paramAnimator);
        if (y.L(2))
        {
          paramAnimator = f.l("Animator from operation ");
          paramAnimator.append(localObject2);
          paramAnimator.append(" has ended.");
          Log.v("FragmentManager", paramAnimator.toString());
        }
      }
    }
  }
  
  public static final class d
  {
    public static final d a = new d();
    
    public final long a(AnimatorSet paramAnimatorSet)
    {
      ec.i.e(paramAnimatorSet, "animatorSet");
      return a0.d.b(paramAnimatorSet);
    }
  }
  
  public static final class e
  {
    public static final e a = new e();
    
    public final void a(AnimatorSet paramAnimatorSet)
    {
      ec.i.e(paramAnimatorSet, "animatorSet");
      d2.e.m(paramAnimatorSet);
    }
    
    public final void b(AnimatorSet paramAnimatorSet, long paramLong)
    {
      ec.i.e(paramAnimatorSet, "animatorSet");
      c0.b.o(paramAnimatorSet, paramLong);
    }
  }
  
  public static class f
  {
    public final r0.c a;
    
    public f(r0.c paramc)
    {
      a = paramc;
    }
    
    public final boolean a()
    {
      View localView = a.c.mView;
      boolean bool1 = false;
      int i;
      if (localView != null) {
        i = s0.a(localView);
      } else {
        i = 0;
      }
      int j = a.a;
      boolean bool2;
      if (i != j)
      {
        bool2 = bool1;
        if (i != 2)
        {
          bool2 = bool1;
          if (j == 2) {}
        }
      }
      else
      {
        bool2 = true;
      }
      return bool2;
    }
  }
  
  public static final class g
    extends r0.a
  {
    public final List<e.h> c;
    public final r0.c d;
    public final r0.c e;
    public final n0 f;
    public final Object g;
    public final ArrayList<View> h;
    public final ArrayList<View> i;
    public final r.b<String, String> j;
    public final ArrayList<String> k;
    public final ArrayList<String> l;
    public final r.b<String, View> m;
    public final r.b<String, View> n;
    public final boolean o;
    public final c p;
    
    public g(ArrayList paramArrayList1, r0.c paramc1, r0.c paramc2, n0 paramn0, Object paramObject, ArrayList paramArrayList2, ArrayList paramArrayList3, r.b paramb1, ArrayList paramArrayList4, ArrayList paramArrayList5, r.b paramb2, r.b paramb3, boolean paramBoolean)
    {
      c = paramArrayList1;
      d = paramc1;
      e = paramc2;
      f = paramn0;
      g = paramObject;
      h = paramArrayList2;
      i = paramArrayList3;
      j = paramb1;
      k = paramArrayList4;
      l = paramArrayList5;
      m = paramb2;
      n = paramb3;
      o = paramBoolean;
      p = new c();
    }
    
    public static void f(ArrayList paramArrayList, View paramView)
    {
      if ((paramView instanceof ViewGroup))
      {
        ViewGroup localViewGroup = (ViewGroup)paramView;
        if (k0.b(localViewGroup))
        {
          if (paramArrayList.contains(paramView)) {
            return;
          }
        }
        else
        {
          int i1 = localViewGroup.getChildCount();
          for (int i2 = 0; i2 < i1; i2++)
          {
            paramView = localViewGroup.getChildAt(i2);
            if (paramView.getVisibility() == 0) {
              f(paramArrayList, paramView);
            }
          }
        }
      }
      else if (paramArrayList.contains(paramView))
      {
        return;
      }
      paramArrayList.add(paramView);
    }
    
    public final boolean a()
    {
      f.h();
      return false;
    }
    
    public final void b(ViewGroup arg1)
    {
      ec.i.e(???, "container");
      synchronized (p)
      {
        if (!a) {
          a = true;
        }
        try
        {
          ???.notifyAll();
          return;
        }
        finally {}
      }
    }
    
    public final void c(final ViewGroup paramViewGroup)
    {
      ec.i.e(paramViewGroup, "container");
      if (!paramViewGroup.isLaidOut())
      {
        localObject1 = c.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (e.h)((Iterator)localObject1).next();
          localObject3 = a;
          if (y.L(2))
          {
            localObject4 = new StringBuilder();
            ((StringBuilder)localObject4).append("SpecialEffectsController: Container ");
            ((StringBuilder)localObject4).append(paramViewGroup);
            ((StringBuilder)localObject4).append(" has not been laid out. Completing operation ");
            ((StringBuilder)localObject4).append(localObject3);
            Log.v("FragmentManager", ((StringBuilder)localObject4).toString());
          }
          a.c(this);
        }
        return;
      }
      final Object localObject2 = g(paramViewGroup, e, d);
      Object localObject3 = (ArrayList)a;
      localObject2 = b;
      Object localObject1 = c;
      Object localObject4 = new ArrayList(m.j((Iterable)localObject1));
      localObject1 = ((Iterable)localObject1).iterator();
      while (((Iterator)localObject1).hasNext()) {
        ((ArrayList)localObject4).add(nexta);
      }
      Iterator localIterator = ((ArrayList)localObject4).iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (r0.c)localIterator.next();
        localObject4 = f;
        i locali = c;
        ((n0)localObject4).o(localObject2, new f(0, localObject1, this));
      }
      i((ArrayList)localObject3, paramViewGroup, new a(this, paramViewGroup, localObject2));
      if (y.L(2))
      {
        paramViewGroup = new StringBuilder();
        paramViewGroup.append("Completed executing operations from ");
        paramViewGroup.append(d);
        paramViewGroup.append(" to ");
        paramViewGroup.append(e);
        Log.v("FragmentManager", paramViewGroup.toString());
      }
    }
    
    public final void d(b.b paramb, ViewGroup paramViewGroup)
    {
      ec.i.e(paramb, "backEvent");
      ec.i.e(paramViewGroup, "container");
    }
    
    public final void e(ViewGroup paramViewGroup)
    {
      if (!paramViewGroup.isLaidOut())
      {
        Iterator localIterator = c.iterator();
        while (localIterator.hasNext())
        {
          r0.c localc = nexta;
          if (y.L(2))
          {
            StringBuilder localStringBuilder = new StringBuilder();
            localStringBuilder.append("SpecialEffectsController: Container ");
            localStringBuilder.append(paramViewGroup);
            localStringBuilder.append(" has not been laid out. Skipping onStart for operation ");
            localStringBuilder.append(localc);
            Log.v("FragmentManager", localStringBuilder.toString());
          }
        }
        return;
      }
      if ((h()) && (g != null))
      {
        a();
        paramViewGroup = new StringBuilder();
        paramViewGroup.append("Ignoring shared elements transition ");
        paramViewGroup.append(g);
        paramViewGroup.append(" between ");
        paramViewGroup.append(d);
        paramViewGroup.append(" and ");
        paramViewGroup.append(e);
        paramViewGroup.append(" as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
        Log.i("FragmentManager", paramViewGroup.toString());
      }
      a();
    }
    
    public final rb.d<ArrayList<View>, Object> g(ViewGroup paramViewGroup, r0.c paramc1, r0.c paramc2)
    {
      Object localObject1 = paramc1;
      View localView = new View(paramViewGroup.getContext());
      Rect localRect = new Rect();
      Iterator localIterator = c.iterator();
      Object localObject2 = null;
      int i1 = 0;
      Object localObject3 = null;
      int i2;
      Object localObject4;
      while (localIterator.hasNext())
      {
        if (nextd != null) {
          i2 = 1;
        } else {
          i2 = 0;
        }
        if ((i2 != 0) && (paramc2 != null) && (localObject1 != null) && ((j.isEmpty() ^ true)) && (g != null))
        {
          h0.a(c, c, o, m);
          w.a(paramViewGroup, new g(localObject1, paramc2, this, 0));
          h.addAll(m.values());
          if ((l.isEmpty() ^ true))
          {
            localObject3 = l.get(0);
            ec.i.d(localObject3, "exitingNames[0]");
            localObject3 = (String)localObject3;
            localObject3 = (View)m.getOrDefault(localObject3, null);
            f.m((View)localObject3, g);
          }
          i.addAll(n.values());
          i2 = i1;
          if ((k.isEmpty() ^ true))
          {
            localObject4 = k.get(0);
            ec.i.d(localObject4, "enteringNames[0]");
            localObject4 = (String)localObject4;
            localObject4 = (View)n.getOrDefault(localObject4, null);
            i2 = i1;
            if (localObject4 != null)
            {
              w.a(paramViewGroup, new d(f, localObject4, localRect, 1));
              i2 = 1;
            }
          }
          f.p(g, localView, h);
          localObject4 = f;
          localObject5 = g;
          ((n0)localObject4).l(localObject5, null, null, localObject5, i);
          i1 = i2;
        }
      }
      Object localObject5 = new ArrayList();
      localIterator = c.iterator();
      localObject1 = null;
      while (localIterator.hasNext())
      {
        e.h localh = (e.h)localIterator.next();
        Object localObject6 = a;
        Transition localTransition = f.e(b);
        if (localTransition != null)
        {
          Object localObject7 = new ArrayList();
          localObject4 = c.mView;
          ec.i.d(localObject4, "operation.fragment.mView");
          f((ArrayList)localObject7, (View)localObject4);
          if ((g != null) && ((localObject6 == paramc2) || (localObject6 == paramc1))) {
            i2 = 1;
          } else {
            i2 = 0;
          }
          if (i2 != 0)
          {
            if (localObject6 == paramc2) {
              localObject4 = h;
            } else {
              localObject4 = i;
            }
            ((ArrayList)localObject7).removeAll(sb.q.x((Iterable)localObject4));
          }
          if (((ArrayList)localObject7).isEmpty())
          {
            f.a(localView, localTransition);
          }
          else
          {
            f.b(localTransition, (ArrayList)localObject7);
            f.l(localTransition, localTransition, (ArrayList)localObject7, null, null);
            if (a == 3)
            {
              i = false;
              localObject4 = new ArrayList((Collection)localObject7);
              ((ArrayList)localObject4).remove(c.mView);
              f.k(localTransition, c.mView, (ArrayList)localObject4);
              w.a(paramViewGroup, new k(localObject7, 4));
            }
          }
          if (a == 2)
          {
            ((ArrayList)localObject5).addAll((Collection)localObject7);
            if (i1 != 0) {
              f.n(localTransition, localRect);
            }
            if (y.L(2))
            {
              localObject4 = new StringBuilder();
              ((StringBuilder)localObject4).append("Entering Transition: ");
              ((StringBuilder)localObject4).append(localTransition);
              Log.v("FragmentManager", ((StringBuilder)localObject4).toString());
              Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
              localObject4 = ((ArrayList)localObject7).iterator();
              while (((Iterator)localObject4).hasNext())
              {
                localObject7 = ((Iterator)localObject4).next();
                ec.i.d(localObject7, "transitioningViews");
                localObject6 = (View)localObject7;
                localObject7 = new StringBuilder();
                ((StringBuilder)localObject7).append("View: ");
                ((StringBuilder)localObject7).append(localObject6);
                Log.v("FragmentManager", ((StringBuilder)localObject7).toString());
              }
            }
          }
          else
          {
            f.m((View)localObject3, localTransition);
            if (y.L(2))
            {
              localObject4 = new StringBuilder();
              ((StringBuilder)localObject4).append("Exiting Transition: ");
              ((StringBuilder)localObject4).append(localTransition);
              Log.v("FragmentManager", ((StringBuilder)localObject4).toString());
              Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
              localObject4 = ((ArrayList)localObject7).iterator();
              while (((Iterator)localObject4).hasNext())
              {
                localObject7 = ((Iterator)localObject4).next();
                ec.i.d(localObject7, "transitioningViews");
                localObject6 = (View)localObject7;
                localObject7 = new StringBuilder();
                ((StringBuilder)localObject7).append("View: ");
                ((StringBuilder)localObject7).append(localObject6);
                Log.v("FragmentManager", ((StringBuilder)localObject7).toString());
              }
            }
          }
          if (c) {
            localObject2 = f.j(localObject2, localTransition);
          } else {
            localObject1 = f.j(localObject1, localTransition);
          }
        }
      }
      paramViewGroup = f.i(localObject2, localObject1, g);
      if (y.L(2))
      {
        paramc1 = new StringBuilder();
        paramc1.append("Final merged transition: ");
        paramc1.append(paramViewGroup);
        Log.v("FragmentManager", paramc1.toString());
      }
      return new rb.d(localObject5, paramViewGroup);
    }
    
    public final boolean h()
    {
      Object localObject = c;
      boolean bool1 = localObject instanceof Collection;
      boolean bool2 = true;
      if ((bool1) && (((Collection)localObject).isEmpty()))
      {
        bool1 = bool2;
      }
      else
      {
        localObject = ((Iterable)localObject).iterator();
        do
        {
          bool1 = bool2;
          if (!((Iterator)localObject).hasNext()) {
            break;
          }
        } while (nexta.c.mTransitioning);
        bool1 = false;
      }
      return bool1;
    }
    
    public final void i(ArrayList<View> paramArrayList, ViewGroup paramViewGroup, dc.a<rb.h> parama)
    {
      h0.c(4, paramArrayList);
      Object localObject1 = f;
      Object localObject2 = i;
      localObject1.getClass();
      localObject1 = new ArrayList();
      int i1 = ((ArrayList)localObject2).size();
      for (int i2 = 0; i2 < i1; i2++)
      {
        localObject3 = (View)((ArrayList)localObject2).get(i2);
        localObject4 = d0.a;
        ((ArrayList)localObject1).add(d0.d.k((View)localObject3));
        d0.d.v((View)localObject3, null);
      }
      Object localObject5;
      if (y.L(2))
      {
        Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
        Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
        localObject2 = h.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject4 = ((Iterator)localObject2).next();
          ec.i.d(localObject4, "sharedElementFirstOutViews");
          localObject3 = (View)localObject4;
          localObject5 = new StringBuilder();
          ((StringBuilder)localObject5).append("View: ");
          ((StringBuilder)localObject5).append(localObject3);
          ((StringBuilder)localObject5).append(" Name: ");
          localObject4 = d0.a;
          ((StringBuilder)localObject5).append(d0.d.k((View)localObject3));
          Log.v("FragmentManager", ((StringBuilder)localObject5).toString());
        }
        Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
        localObject2 = i.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject4 = ((Iterator)localObject2).next();
          ec.i.d(localObject4, "sharedElementLastInViews");
          localObject5 = (View)localObject4;
          localObject3 = new StringBuilder();
          ((StringBuilder)localObject3).append("View: ");
          ((StringBuilder)localObject3).append(localObject5);
          ((StringBuilder)localObject3).append(" Name: ");
          localObject4 = d0.a;
          ((StringBuilder)localObject3).append(d0.d.k((View)localObject5));
          Log.v("FragmentManager", ((StringBuilder)localObject3).toString());
        }
      }
      parama.invoke();
      Object localObject3 = f;
      Object localObject4 = h;
      parama = i;
      localObject2 = j;
      localObject3.getClass();
      int i3 = parama.size();
      localObject3 = new ArrayList();
      for (i2 = 0; i2 < i3; i2++)
      {
        localObject5 = (View)((ArrayList)localObject4).get(i2);
        Object localObject6 = d0.a;
        localObject6 = d0.d.k((View)localObject5);
        ((ArrayList)localObject3).add(localObject6);
        if (localObject6 != null)
        {
          d0.d.v((View)localObject5, null);
          localObject5 = (String)((r.h)localObject2).getOrDefault(localObject6, null);
          for (i1 = 0; i1 < i3; i1++) {
            if (((String)localObject5).equals(((ArrayList)localObject1).get(i1)))
            {
              d0.d.v((View)parama.get(i1), (String)localObject6);
              break;
            }
          }
        }
      }
      w.a(paramViewGroup, new m0(i3, parama, (ArrayList)localObject1, (ArrayList)localObject4, (ArrayList)localObject3));
      h0.c(0, paramArrayList);
      f.q(g, h, i);
    }
    
    public static final class a
      extends ec.j
      implements dc.a<rb.h>
    {
      public a(e.g paramg, ViewGroup paramViewGroup, Object paramObject)
      {
        super();
      }
      
      public final Object invoke()
      {
        a.f.c(paramViewGroup, localObject2);
        return rb.h.a;
      }
    }
  }
  
  public static final class h
    extends e.f
  {
    public final Object b;
    public final boolean c;
    public final Object d;
    
    public h(r0.c paramc, boolean paramBoolean1, boolean paramBoolean2)
    {
      super();
      Object localObject;
      if (a == 2)
      {
        if (paramBoolean1) {
          localObject = c.getReenterTransition();
        } else {
          localObject = c.getEnterTransition();
        }
      }
      else if (paramBoolean1) {
        localObject = c.getReturnTransition();
      } else {
        localObject = c.getExitTransition();
      }
      b = localObject;
      boolean bool;
      if (a == 2)
      {
        if (paramBoolean1) {
          bool = c.getAllowReturnTransitionOverlap();
        } else {
          bool = c.getAllowEnterTransitionOverlap();
        }
      }
      else {
        bool = true;
      }
      c = bool;
      if (paramBoolean2)
      {
        if (paramBoolean1) {
          paramc = c.getSharedElementReturnTransition();
        } else {
          paramc = c.getSharedElementEnterTransition();
        }
      }
      else {
        paramc = null;
      }
      d = paramc;
    }
    
    public final n0 b()
    {
      n0 localn01 = c(b);
      n0 localn02 = c(d);
      int i;
      if ((localn01 != null) && (localn02 != null) && (localn01 != localn02)) {
        i = 0;
      } else {
        i = 1;
      }
      if (i != 0)
      {
        localObject = localn01;
        if (localn01 == null) {
          localObject = localn02;
        }
        return (n0)localObject;
      }
      Object localObject = f.l("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
      ((StringBuilder)localObject).append(a.c);
      ((StringBuilder)localObject).append(" returned Transition ");
      ((StringBuilder)localObject).append(b);
      ((StringBuilder)localObject).append(" which uses a different Transition  type than its shared element transition ");
      ((StringBuilder)localObject).append(d);
      throw new IllegalArgumentException(((StringBuilder)localObject).toString().toString());
    }
    
    public final n0 c(Object paramObject)
    {
      if (paramObject == null) {
        return null;
      }
      Object localObject = h0.a;
      if ((localObject != null) && ((paramObject instanceof Transition))) {
        return (n0)localObject;
      }
      localObject = h0.b;
      if ((localObject != null) && (((n0)localObject).d(paramObject))) {
        return (n0)localObject;
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Transition ");
      ((StringBuilder)localObject).append(paramObject);
      ((StringBuilder)localObject).append(" for fragment ");
      ((StringBuilder)localObject).append(a.c);
      ((StringBuilder)localObject).append(" is not a valid framework Transition or AndroidX Transition");
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
  }
  
  public static final class i
    extends ec.j
    implements l<Map.Entry<String, View>, Boolean>
  {
    public i(Collection<String> paramCollection)
    {
      super();
    }
    
    public final Object invoke(Object paramObject)
    {
      Object localObject = (Map.Entry)paramObject;
      ec.i.e(localObject, "entry");
      paramObject = a;
      localObject = (View)((Map.Entry)localObject).getValue();
      WeakHashMap localWeakHashMap = d0.a;
      return Boolean.valueOf(sb.q.l((Collection)paramObject, d0.d.k((View)localObject)));
    }
  }
}

/* Location:
 * Qualified Name:     x0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */