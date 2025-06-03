package x0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import b1.k.b;
import b1.q0;
import d.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import v.d;

public abstract class y
{
  public d A = new d();
  public e B = new e();
  public d.f C;
  public d.f D;
  public d.f E;
  public ArrayDeque<k> F = new ArrayDeque();
  public boolean G;
  public boolean H;
  public boolean I;
  public boolean J;
  public boolean K;
  public ArrayList<a> L;
  public ArrayList<Boolean> M;
  public ArrayList<i> N;
  public b0 O;
  public f P = new f();
  public final ArrayList<m> a = new ArrayList();
  public boolean b;
  public final f0 c = new f0();
  public ArrayList<a> d = new ArrayList();
  public ArrayList<i> e;
  public final u f = new u(this);
  public b.w g;
  public a h = null;
  public final b i = new b();
  public final AtomicInteger j = new AtomicInteger();
  public final Map<String, c> k = Collections.synchronizedMap(new HashMap());
  public final Map<String, Bundle> l = Collections.synchronizedMap(new HashMap());
  public final Map<String, Object> m = Collections.synchronizedMap(new HashMap());
  public ArrayList<l> n = new ArrayList();
  public final v o = new v(this);
  public final CopyOnWriteArrayList<c0> p = new CopyOnWriteArrayList();
  public final w q = new w(this);
  public final k r = new k(this, 1);
  public final l s = new l(this, 1);
  public final x t = new x(this);
  public final c u = new c();
  public int v = -1;
  public t<?> w;
  public p x;
  public i y;
  public i z;
  
  public static HashSet G(a parama)
  {
    HashSet localHashSet = new HashSet();
    for (int i1 = 0; i1 < a.size(); i1++)
    {
      i locali = a.get(i1)).b;
      if ((locali != null) && (g)) {
        localHashSet.add(locali);
      }
    }
    return localHashSet;
  }
  
  public static boolean L(int paramInt)
  {
    boolean bool;
    if (Log.isLoggable("FragmentManager", paramInt)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean M(i parami)
  {
    boolean bool1 = mHasMenu;
    boolean bool2 = true;
    if (bool1)
    {
      bool1 = bool2;
      if (mMenuVisible) {}
    }
    else
    {
      Iterator localIterator = mChildFragmentManager.c.f().iterator();
      bool1 = false;
      while (localIterator.hasNext())
      {
        parami = (i)localIterator.next();
        boolean bool3 = bool1;
        if (parami != null) {
          bool3 = M(parami);
        }
        bool1 = bool3;
        if (bool3)
        {
          i1 = 1;
          break label85;
        }
      }
      int i1 = 0;
      label85:
      if (i1 != 0) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
    }
    return bool1;
  }
  
  public static boolean O(i parami)
  {
    boolean bool = true;
    if (parami == null) {
      return true;
    }
    y localy = mFragmentManager;
    if ((!parami.equals(z)) || (!O(y))) {
      bool = false;
    }
    return bool;
  }
  
  public static void c0(i parami)
  {
    if (L(2))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("show: ");
      localStringBuilder.append(parami);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    if (mHidden)
    {
      mHidden = false;
      mHiddenChanged ^= true;
    }
  }
  
  /* Error */
  public final boolean A(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: invokevirtual 327	x0/y:z	(Z)V
    //   5: iconst_0
    //   6: istore_1
    //   7: aload_0
    //   8: getfield 329	x0/y:L	Ljava/util/ArrayList;
    //   11: astore_2
    //   12: aload_0
    //   13: getfield 331	x0/y:M	Ljava/util/ArrayList;
    //   16: astore_3
    //   17: aload_0
    //   18: getfield 123	x0/y:a	Ljava/util/ArrayList;
    //   21: astore 4
    //   23: aload 4
    //   25: monitorenter
    //   26: aload_0
    //   27: getfield 123	x0/y:a	Ljava/util/ArrayList;
    //   30: invokevirtual 334	java/util/ArrayList:isEmpty	()Z
    //   33: ifeq +12 -> 45
    //   36: aload 4
    //   38: monitorexit
    //   39: iconst_0
    //   40: istore 5
    //   42: goto +84 -> 126
    //   45: aload_0
    //   46: getfield 123	x0/y:a	Ljava/util/ArrayList;
    //   49: invokevirtual 227	java/util/ArrayList:size	()I
    //   52: istore 6
    //   54: iconst_0
    //   55: istore 7
    //   57: iload 7
    //   59: istore 5
    //   61: iload 7
    //   63: iload 6
    //   65: if_icmpge +37 -> 102
    //   68: aload_0
    //   69: getfield 123	x0/y:a	Ljava/util/ArrayList;
    //   72: iload 7
    //   74: invokevirtual 231	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   77: checkcast 35	x0/y$m
    //   80: aload_2
    //   81: aload_3
    //   82: invokeinterface 337 3 0
    //   87: istore 8
    //   89: iload 5
    //   91: iload 8
    //   93: ior
    //   94: istore 5
    //   96: iinc 7 1
    //   99: goto -38 -> 61
    //   102: aload_0
    //   103: getfield 123	x0/y:a	Ljava/util/ArrayList;
    //   106: invokevirtual 340	java/util/ArrayList:clear	()V
    //   109: aload_0
    //   110: getfield 342	x0/y:w	Lx0/t;
    //   113: getfield 347	x0/t:c	Landroid/os/Handler;
    //   116: aload_0
    //   117: getfield 215	x0/y:P	Lx0/y$f;
    //   120: invokevirtual 353	android/os/Handler:removeCallbacks	(Ljava/lang/Runnable;)V
    //   123: aload 4
    //   125: monitorexit
    //   126: iload 5
    //   128: ifeq +38 -> 166
    //   131: aload_0
    //   132: iconst_1
    //   133: putfield 355	x0/y:b	Z
    //   136: aload_0
    //   137: aload_0
    //   138: getfield 329	x0/y:L	Ljava/util/ArrayList;
    //   141: aload_0
    //   142: getfield 331	x0/y:M	Ljava/util/ArrayList;
    //   145: invokevirtual 359	x0/y:U	(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    //   148: aload_0
    //   149: invokevirtual 361	x0/y:e	()V
    //   152: iconst_1
    //   153: istore_1
    //   154: goto -147 -> 7
    //   157: astore 4
    //   159: aload_0
    //   160: invokevirtual 361	x0/y:e	()V
    //   163: aload 4
    //   165: athrow
    //   166: aload_0
    //   167: invokevirtual 364	x0/y:f0	()V
    //   170: aload_0
    //   171: getfield 366	x0/y:K	Z
    //   174: ifeq +12 -> 186
    //   177: aload_0
    //   178: iconst_0
    //   179: putfield 366	x0/y:K	Z
    //   182: aload_0
    //   183: invokevirtual 369	x0/y:d0	()V
    //   186: aload_0
    //   187: getfield 128	x0/y:c	Lx0/f0;
    //   190: invokevirtual 371	x0/f0:b	()V
    //   193: iload_1
    //   194: ireturn
    //   195: astore_3
    //   196: aload_0
    //   197: getfield 123	x0/y:a	Ljava/util/ArrayList;
    //   200: invokevirtual 340	java/util/ArrayList:clear	()V
    //   203: aload_0
    //   204: getfield 342	x0/y:w	Lx0/t;
    //   207: getfield 347	x0/t:c	Landroid/os/Handler;
    //   210: aload_0
    //   211: getfield 215	x0/y:P	Lx0/y$f;
    //   214: invokevirtual 353	android/os/Handler:removeCallbacks	(Ljava/lang/Runnable;)V
    //   217: aload_3
    //   218: athrow
    //   219: astore_3
    //   220: aload 4
    //   222: monitorexit
    //   223: aload_3
    //   224: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	225	0	this	y
    //   0	225	1	paramBoolean	boolean
    //   11	70	2	localArrayList1	ArrayList
    //   16	66	3	localArrayList2	ArrayList
    //   195	23	3	localObject1	Object
    //   219	5	3	localObject2	Object
    //   21	103	4	localArrayList3	ArrayList
    //   157	64	4	localObject3	Object
    //   40	87	5	bool1	boolean
    //   52	14	6	i1	int
    //   55	42	7	i2	int
    //   87	7	8	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   136	148	157	finally
    //   45	54	195	finally
    //   68	89	195	finally
    //   26	39	219	finally
    //   102	126	219	finally
    //   196	219	219	finally
    //   220	223	219	finally
  }
  
  public final void B(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2)
  {
    boolean bool = geto;
    Object localObject1 = N;
    if (localObject1 == null) {
      N = new ArrayList();
    } else {
      ((ArrayList)localObject1).clear();
    }
    N.addAll(c.g());
    localObject1 = z;
    int i1 = 0;
    int i2 = paramInt1;
    Object localObject2;
    Object localObject3;
    Object localObject5;
    int i5;
    for (;;)
    {
      i3 = 1;
      if (i2 >= paramInt2) {
        break;
      }
      localObject2 = (a)paramArrayList.get(i2);
      if (!((Boolean)paramArrayList1.get(i2)).booleanValue())
      {
        localObject3 = N;
        for (i4 = 0;; i4 = i6)
        {
          localObject4 = localObject1;
          if (i4 >= a.size()) {
            break;
          }
          localObject5 = (g0.a)a.get(i4);
          i5 = a;
          i6 = i3;
          if (i5 != i3)
          {
            if (i5 != 2)
            {
              if ((i5 != 3) && (i5 != 6))
              {
                if (i5 != 7)
                {
                  if (i5 != 8)
                  {
                    localObject4 = localObject1;
                    i3 = i4;
                  }
                  else
                  {
                    a.add(i4, new g0.a(9, (i)localObject1));
                    c = true;
                    i3 = i4 + 1;
                    localObject4 = b;
                  }
                }
                else
                {
                  i6 = 1;
                  break label585;
                }
              }
              else
              {
                ((ArrayList)localObject3).remove(b);
                localObject5 = b;
                localObject4 = localObject1;
                i3 = i4;
                if (localObject5 == localObject1)
                {
                  a.add(i4, new g0.a((i)localObject5, 9));
                  i3 = i4 + 1;
                  localObject1 = null;
                  i4 = 1;
                  break label604;
                }
              }
            }
            else
            {
              localObject4 = b;
              int i7 = mContainerId;
              i5 = ((ArrayList)localObject3).size() - 1;
              i3 = 0;
              while (i5 >= 0)
              {
                i locali = (i)((ArrayList)localObject3).get(i5);
                i6 = i3;
                if (mContainerId == i7) {
                  if (locali == localObject4)
                  {
                    i6 = 1;
                  }
                  else
                  {
                    if (locali == localObject1)
                    {
                      a.add(i4, new g0.a(9, locali));
                      i4++;
                      localObject1 = null;
                    }
                    g0.a locala = new g0.a(3, locali);
                    d = d;
                    f = f;
                    e = e;
                    g = g;
                    a.add(i4, locala);
                    ((ArrayList)localObject3).remove(locali);
                    i4++;
                    break label516;
                  }
                }
                i3 = i6;
                label516:
                i5--;
              }
              if (i3 == 0) {
                break label558;
              }
              a.remove(i4);
              i3 = i4 - 1;
              localObject4 = localObject1;
            }
            localObject1 = localObject4;
            for (;;)
            {
              i4 = 1;
              break;
              label558:
              a = 1;
              c = true;
              ((ArrayList)localObject3).add(localObject4);
              i3 = i4;
            }
          }
          label585:
          ((ArrayList)localObject3).add(b);
          i3 = i4;
          i4 = i6;
          label604:
          i6 = i3 + i4;
          i3 = i4;
        }
      }
      localObject3 = N;
      for (i4 = a.size() - 1;; i4--)
      {
        localObject4 = localObject1;
        if (i4 < 0) {
          break;
        }
        localObject4 = (g0.a)a.get(i4);
        i3 = a;
        if (i3 != 1)
        {
          if (i3 != 3) {}
          switch (i3)
          {
          default: 
            break;
          case 10: 
            i = h;
            break;
          case 9: 
            localObject1 = b;
            break;
          case 8: 
            localObject1 = null;
            break;
          case 6: 
            ((ArrayList)localObject3).add(b);
            break;
          }
        }
        ((ArrayList)localObject3).remove(b);
      }
      if ((i1 == 0) && (!g)) {
        i4 = 0;
      } else {
        i4 = 1;
      }
      i2++;
      localObject1 = localObject4;
      i1 = i4;
    }
    N.clear();
    if ((!bool) && (v >= 1)) {
      for (i4 = paramInt1; i4 < paramInt2; i4++)
      {
        localObject1 = geta.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject4 = nextb;
          if ((localObject4 != null) && (mFragmentManager != null))
          {
            localObject4 = h((i)localObject4);
            c.h((e0)localObject4);
          }
        }
      }
    }
    for (int i3 = paramInt1; i3 < paramInt2; i3++)
    {
      localObject2 = (a)paramArrayList.get(i3);
      if (((Boolean)paramArrayList1.get(i3)).booleanValue())
      {
        ((a)localObject2).c(-1);
        for (i6 = a.size() - 1; i6 >= 0; i6--)
        {
          localObject4 = (g0.a)a.get(i6);
          localObject1 = b;
          if (localObject1 != null)
          {
            mBeingSaved = false;
            ((i)localObject1).setPopDirection(true);
            i5 = f;
            i2 = 8197;
            i4 = 8194;
            if (i5 != 4097) {
              if (i5 != 8194)
              {
                if (i5 != 8197)
                {
                  i4 = 4099;
                  if (i5 != 4099)
                  {
                    i4 = i2;
                    if (i5 != 4100) {
                      i4 = 0;
                    }
                  }
                }
                else
                {
                  i4 = 4100;
                }
              }
              else {
                i4 = 4097;
              }
            }
            ((i)localObject1).setNextTransition(i4);
            ((i)localObject1).setSharedElementNames(n, m);
          }
          switch (a)
          {
          case 2: 
          default: 
            paramArrayList = f.l("Unknown cmd: ");
            paramArrayList.append(a);
            throw new IllegalArgumentException(paramArrayList.toString());
          case 10: 
            p.Z((i)localObject1, h);
            break;
          case 9: 
            localObject4 = p;
            break;
          case 8: 
            localObject4 = p;
            localObject1 = null;
            ((y)localObject4).a0((i)localObject1);
            break;
          case 7: 
            ((i)localObject1).setAnimations(d, e, f, g);
            p.Y((i)localObject1, true);
            p.i((i)localObject1);
            break;
          case 6: 
            ((i)localObject1).setAnimations(d, e, f, g);
            p.d((i)localObject1);
            break;
          case 5: 
            ((i)localObject1).setAnimations(d, e, f, g);
            p.Y((i)localObject1, true);
            p.K((i)localObject1);
            break;
          case 4: 
            ((i)localObject1).setAnimations(d, e, f, g);
            p.getClass();
            c0((i)localObject1);
            break;
          case 3: 
            ((i)localObject1).setAnimations(d, e, f, g);
            p.a((i)localObject1);
            break;
          }
          ((i)localObject1).setAnimations(d, e, f, g);
          p.Y((i)localObject1, true);
          p.T((i)localObject1);
        }
      }
      ((a)localObject2).c(1);
      i6 = a.size();
      for (i4 = 0; i4 < i6; i4++)
      {
        localObject1 = (g0.a)a.get(i4);
        localObject4 = b;
        if (localObject4 != null)
        {
          mBeingSaved = false;
          ((i)localObject4).setPopDirection(false);
          ((i)localObject4).setNextTransition(f);
          ((i)localObject4).setSharedElementNames(m, n);
        }
        switch (a)
        {
        case 2: 
        default: 
          paramArrayList = f.l("Unknown cmd: ");
          paramArrayList.append(a);
          throw new IllegalArgumentException(paramArrayList.toString());
        case 10: 
          p.Z((i)localObject4, i);
          break;
        case 9: 
          localObject1 = p;
          localObject4 = null;
          break;
        case 8: 
          localObject1 = p;
          ((y)localObject1).a0((i)localObject4);
          break;
        case 7: 
          ((i)localObject4).setAnimations(d, e, f, g);
          p.Y((i)localObject4, false);
          p.d((i)localObject4);
          break;
        case 6: 
          ((i)localObject4).setAnimations(d, e, f, g);
          p.i((i)localObject4);
          break;
        case 5: 
          ((i)localObject4).setAnimations(d, e, f, g);
          p.Y((i)localObject4, false);
          p.getClass();
          c0((i)localObject4);
          break;
        case 4: 
          ((i)localObject4).setAnimations(d, e, f, g);
          p.K((i)localObject4);
          break;
        case 3: 
          ((i)localObject4).setAnimations(d, e, f, g);
          p.T((i)localObject4);
          break;
        }
        ((i)localObject4).setAnimations(d, e, f, g);
        p.Y((i)localObject4, false);
        p.a((i)localObject4);
      }
    }
    int i6 = 0;
    bool = ((Boolean)paramArrayList1.get(paramInt2 - 1)).booleanValue();
    if ((i1 != 0) && (!n.isEmpty()))
    {
      localObject1 = new LinkedHashSet();
      localObject4 = paramArrayList.iterator();
      while (((Iterator)localObject4).hasNext()) {
        ((Set)localObject1).addAll(G((a)((Iterator)localObject4).next()));
      }
      if (h == null)
      {
        localObject2 = n.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (l)((Iterator)localObject2).next();
          localObject4 = ((Set)localObject1).iterator();
          while (((Iterator)localObject4).hasNext())
          {
            localObject5 = (i)((Iterator)localObject4).next();
            ((l)localObject3).b();
          }
        }
        localObject5 = n.iterator();
        while (((Iterator)localObject5).hasNext())
        {
          localObject4 = (l)((Iterator)localObject5).next();
          localObject2 = ((Set)localObject1).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject3 = (i)((Iterator)localObject2).next();
            ((l)localObject4).d();
          }
        }
      }
    }
    for (int i4 = paramInt1; i4 < paramInt2; i4++)
    {
      localObject1 = (a)paramArrayList.get(i4);
      if (bool) {
        for (i3 = a.size() - 1; i3 >= 0; i3--)
        {
          localObject4 = a.get(i3)).b;
          if (localObject4 != null) {
            h((i)localObject4).k();
          }
        }
      }
      localObject4 = a.iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject1 = nextb;
        if (localObject1 != null) {
          h((i)localObject1).k();
        }
      }
    }
    P(v, true);
    Object localObject4 = g(paramArrayList, paramInt1, paramInt2).iterator();
    for (;;)
    {
      i4 = paramInt1;
      if (!((Iterator)localObject4).hasNext()) {
        break;
      }
      localObject1 = (r0)((Iterator)localObject4).next();
      d = bool;
      ((r0)localObject1).n();
      ((r0)localObject1).i();
    }
    while (i4 < paramInt2)
    {
      localObject1 = (a)paramArrayList.get(i4);
      if ((((Boolean)paramArrayList1.get(i4)).booleanValue()) && (r >= 0)) {
        r = -1;
      }
      localObject1.getClass();
      i4++;
    }
    if (i1 != 0) {
      for (paramInt1 = i6; paramInt1 < n.size(); paramInt1++) {
        ((l)n.get(paramInt1)).onBackStackChanged();
      }
    }
  }
  
  public final i C(String paramString)
  {
    return c.c(paramString);
  }
  
  public final i D(int paramInt)
  {
    Object localObject1 = c;
    int i1 = ((ArrayList)a).size();
    do
    {
      int i2;
      do
      {
        i2 = i1 - 1;
        if (i2 < 0) {
          break;
        }
        localObject2 = (i)((ArrayList)a).get(i2);
        i1 = i2;
      } while (localObject2 == null);
      i1 = i2;
    } while (mFragmentId != paramInt);
    break label129;
    localObject1 = ((HashMap)b).values().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (e0)((Iterator)localObject1).next();
      if (localObject2 != null)
      {
        localObject2 = c;
        if (mFragmentId == paramInt) {
          break label129;
        }
      }
    }
    Object localObject2 = null;
    label129:
    return (i)localObject2;
  }
  
  public final i E(String paramString)
  {
    Object localObject1 = c;
    int i1 = ((ArrayList)a).size();
    Object localObject2;
    do
    {
      int i2;
      do
      {
        i2 = i1 - 1;
        if (i2 < 0) {
          break;
        }
        localObject2 = (i)((ArrayList)a).get(i2);
        i1 = i2;
      } while (localObject2 == null);
      i1 = i2;
    } while (!paramString.equals(mTag));
    return (String)localObject2;
    localObject1 = ((HashMap)b).values().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (e0)((Iterator)localObject1).next();
      if (localObject2 != null)
      {
        localObject2 = c;
        if (paramString.equals(mTag)) {
          return (String)localObject2;
        }
      }
    }
    paramString = null;
    return paramString;
  }
  
  public final void F()
  {
    Iterator localIterator = f().iterator();
    while (localIterator.hasNext())
    {
      r0 localr0 = (r0)localIterator.next();
      if (e)
      {
        if (L(2)) {
          Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
        }
        e = false;
        localr0.i();
      }
    }
  }
  
  public final ViewGroup H(i parami)
  {
    ViewGroup localViewGroup = mContainer;
    if (localViewGroup != null) {
      return localViewGroup;
    }
    if (mContainerId <= 0) {
      return null;
    }
    if (x.c())
    {
      parami = x.b(mContainerId);
      if ((parami instanceof ViewGroup)) {
        return (ViewGroup)parami;
      }
    }
    return null;
  }
  
  public final s I()
  {
    i locali = y;
    if (locali != null) {
      return mFragmentManager.I();
    }
    return A;
  }
  
  public final t0 J()
  {
    i locali = y;
    if (locali != null) {
      return mFragmentManager.J();
    }
    return B;
  }
  
  public final void K(i parami)
  {
    if (L(2))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("hide: ");
      localStringBuilder.append(parami);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    if (!mHidden)
    {
      mHidden = true;
      mHiddenChanged = (true ^ mHiddenChanged);
      b0(parami);
    }
  }
  
  public final boolean N()
  {
    i locali = y;
    boolean bool = true;
    if (locali == null) {
      return true;
    }
    if ((!locali.isAdded()) || (!y.getParentFragmentManager().N())) {
      bool = false;
    }
    return bool;
  }
  
  public final void P(int paramInt, boolean paramBoolean)
  {
    if ((w == null) && (paramInt != -1)) {
      throw new IllegalStateException("No activity");
    }
    if ((!paramBoolean) && (paramInt == v)) {
      return;
    }
    v = paramInt;
    Object localObject1 = c;
    Object localObject2 = ((ArrayList)a).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (i)((Iterator)localObject2).next();
      localObject3 = (e0)((HashMap)b).get(mWho);
      if (localObject3 != null) {
        ((e0)localObject3).k();
      }
    }
    Object localObject3 = ((HashMap)b).values().iterator();
    for (;;)
    {
      paramBoolean = ((Iterator)localObject3).hasNext();
      int i1 = 0;
      if (!paramBoolean) {
        break;
      }
      localObject2 = (e0)((Iterator)localObject3).next();
      if (localObject2 != null)
      {
        ((e0)localObject2).k();
        Object localObject4 = c;
        paramInt = i1;
        if (mRemoving)
        {
          paramInt = i1;
          if (!((i)localObject4).isInBackStack()) {
            paramInt = 1;
          }
        }
        if (paramInt != 0)
        {
          if ((mBeingSaved) && (!((HashMap)c).containsKey(mWho)))
          {
            localObject4 = mWho;
            ((f0)localObject1).j(((e0)localObject2).o(), (String)localObject4);
          }
          ((f0)localObject1).i((e0)localObject2);
        }
      }
    }
    d0();
    if (G)
    {
      localObject1 = w;
      if ((localObject1 != null) && (v == 7))
      {
        ((t)localObject1).i();
        G = false;
      }
    }
  }
  
  public final void Q()
  {
    if (w == null) {
      return;
    }
    H = false;
    I = false;
    O.i = false;
    Iterator localIterator = c.g().iterator();
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      if (locali != null) {
        locali.noteStateNotSaved();
      }
    }
  }
  
  /* Error */
  public final boolean R()
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: invokevirtual 658	x0/y:A	(Z)Z
    //   5: pop
    //   6: iconst_1
    //   7: istore_1
    //   8: aload_0
    //   9: iconst_1
    //   10: invokevirtual 327	x0/y:z	(Z)V
    //   13: aload_0
    //   14: getfield 287	x0/y:z	Lx0/i;
    //   17: astore_2
    //   18: aload_2
    //   19: ifnull +16 -> 35
    //   22: aload_2
    //   23: invokevirtual 661	x0/i:getChildFragmentManager	()Lx0/y;
    //   26: invokevirtual 663	x0/y:R	()Z
    //   29: ifeq +6 -> 35
    //   32: goto +80 -> 112
    //   35: aload_0
    //   36: aload_0
    //   37: getfield 329	x0/y:L	Ljava/util/ArrayList;
    //   40: aload_0
    //   41: getfield 331	x0/y:M	Ljava/util/ArrayList;
    //   44: iconst_m1
    //   45: iconst_0
    //   46: invokevirtual 667	x0/y:S	(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z
    //   49: istore_1
    //   50: iload_1
    //   51: ifeq +34 -> 85
    //   54: aload_0
    //   55: iconst_1
    //   56: putfield 355	x0/y:b	Z
    //   59: aload_0
    //   60: aload_0
    //   61: getfield 329	x0/y:L	Ljava/util/ArrayList;
    //   64: aload_0
    //   65: getfield 331	x0/y:M	Ljava/util/ArrayList;
    //   68: invokevirtual 359	x0/y:U	(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    //   71: aload_0
    //   72: invokevirtual 361	x0/y:e	()V
    //   75: goto +10 -> 85
    //   78: astore_2
    //   79: aload_0
    //   80: invokevirtual 361	x0/y:e	()V
    //   83: aload_2
    //   84: athrow
    //   85: aload_0
    //   86: invokevirtual 364	x0/y:f0	()V
    //   89: aload_0
    //   90: getfield 366	x0/y:K	Z
    //   93: ifeq +12 -> 105
    //   96: aload_0
    //   97: iconst_0
    //   98: putfield 366	x0/y:K	Z
    //   101: aload_0
    //   102: invokevirtual 369	x0/y:d0	()V
    //   105: aload_0
    //   106: getfield 128	x0/y:c	Lx0/f0;
    //   109: invokevirtual 371	x0/f0:b	()V
    //   112: iload_1
    //   113: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	this	y
    //   7	106	1	bool	boolean
    //   17	6	2	locali	i
    //   78	6	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   59	71	78	finally
  }
  
  public final boolean S(ArrayList paramArrayList1, ArrayList paramArrayList2, int paramInt1, int paramInt2)
  {
    int i1;
    if ((paramInt2 & 0x1) != 0) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    boolean bool = d.isEmpty();
    int i2 = -1;
    if (bool)
    {
      paramInt1 = i2;
    }
    else if (paramInt1 < 0)
    {
      if (i1 != 0) {
        paramInt1 = 0;
      } else {
        paramInt1 = -1 + d.size();
      }
    }
    else
    {
      Object localObject;
      for (paramInt2 = d.size() - 1; paramInt2 >= 0; paramInt2--)
      {
        localObject = (a)d.get(paramInt2);
        if ((paramInt1 >= 0) && (paramInt1 == r)) {
          break;
        }
      }
      if (paramInt2 < 0) {}
      for (;;)
      {
        paramInt1 = paramInt2;
        break;
        if (i1 != 0) {
          for (i1 = paramInt2;; i1 = i2)
          {
            paramInt2 = i1;
            if (i1 <= 0) {
              break;
            }
            localObject = d;
            i2 = i1 - 1;
            localObject = (a)((ArrayList)localObject).get(i2);
            paramInt2 = i1;
            if (paramInt1 < 0) {
              break;
            }
            paramInt2 = i1;
            if (paramInt1 != r) {
              break;
            }
          }
        }
        if (paramInt2 == d.size() - 1)
        {
          paramInt1 = i2;
          break;
        }
        paramInt2++;
      }
    }
    if (paramInt1 < 0) {
      return false;
    }
    for (paramInt2 = d.size() - 1; paramInt2 >= paramInt1; paramInt2--)
    {
      paramArrayList1.add((a)d.remove(paramInt2));
      paramArrayList2.add(Boolean.TRUE);
    }
    return true;
  }
  
  public final void T(i parami)
  {
    if (L(2))
    {
      ??? = new StringBuilder();
      ((StringBuilder)???).append("remove: ");
      ((StringBuilder)???).append(parami);
      ((StringBuilder)???).append(" nesting=");
      ((StringBuilder)???).append(mBackStackNesting);
      Log.v("FragmentManager", ((StringBuilder)???).toString());
    }
    boolean bool = parami.isInBackStack();
    f0 localf0;
    if ((!mDetached) || ((bool ^ true))) {
      localf0 = c;
    }
    synchronized ((ArrayList)a)
    {
      ((ArrayList)a).remove(parami);
      mAdded = false;
      if (M(parami)) {
        G = true;
      }
      mRemoving = true;
      b0(parami);
      return;
    }
  }
  
  public final void U(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1)
  {
    if (paramArrayList.isEmpty()) {
      return;
    }
    if (paramArrayList.size() == paramArrayList1.size())
    {
      int i1 = paramArrayList.size();
      int i2 = 0;
      int i5;
      for (int i3 = 0; i2 < i1; i3 = i5)
      {
        int i4 = i2;
        i5 = i3;
        if (!geto)
        {
          if (i3 != i2) {
            B(paramArrayList, paramArrayList1, i3, i2);
          }
          i3 = i2 + 1;
          i5 = i3;
          if (((Boolean)paramArrayList1.get(i2)).booleanValue()) {
            for (;;)
            {
              i5 = i3;
              if (i3 >= i1) {
                break;
              }
              i5 = i3;
              if (!((Boolean)paramArrayList1.get(i3)).booleanValue()) {
                break;
              }
              i5 = i3;
              if (geto) {
                break;
              }
              i3++;
            }
          }
          B(paramArrayList, paramArrayList1, i2, i5);
          i4 = i5 - 1;
        }
        i2 = i4 + 1;
      }
      if (i3 != i1) {
        B(paramArrayList, paramArrayList1, i3, i1);
      }
      return;
    }
    throw new IllegalStateException("Internal error with the back stack records");
  }
  
  public final void V(Bundle paramBundle)
  {
    Object localObject1 = paramBundle.keySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      if (((String)localObject2).startsWith("result_"))
      {
        localObject3 = paramBundle.getBundle((String)localObject2);
        if (localObject3 != null)
        {
          ((Bundle)localObject3).setClassLoader(w.b.getClassLoader());
          localObject2 = ((String)localObject2).substring(7);
          l.put(localObject2, localObject3);
        }
      }
    }
    localObject1 = new HashMap();
    Object localObject2 = paramBundle.keySet().iterator();
    Object localObject4;
    while (((Iterator)localObject2).hasNext())
    {
      localObject4 = (String)((Iterator)localObject2).next();
      if (((String)localObject4).startsWith("fragment_"))
      {
        localObject3 = paramBundle.getBundle((String)localObject4);
        if (localObject3 != null)
        {
          ((Bundle)localObject3).setClassLoader(w.b.getClassLoader());
          ((HashMap)localObject1).put(((String)localObject4).substring(9), localObject3);
        }
      }
    }
    Object localObject3 = c;
    ((HashMap)c).clear();
    ((HashMap)c).putAll((Map)localObject1);
    localObject1 = (a0)paramBundle.getParcelable("state");
    if (localObject1 == null) {
      return;
    }
    ((HashMap)c.b).clear();
    localObject3 = a.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      paramBundle = (String)((Iterator)localObject3).next();
      localObject2 = c.j(null, paramBundle);
      if (localObject2 != null)
      {
        localObject4 = (d0)((Bundle)localObject2).getParcelable("state");
        paramBundle = O;
        localObject4 = b;
        localObject4 = (i)d.get(localObject4);
        if (localObject4 != null)
        {
          if (L(2))
          {
            paramBundle = new StringBuilder();
            paramBundle.append("restoreSaveState: re-attaching retained ");
            paramBundle.append(localObject4);
            Log.v("FragmentManager", paramBundle.toString());
          }
          paramBundle = new e0(o, c, (i)localObject4, (Bundle)localObject2);
        }
        else
        {
          paramBundle = new e0(o, c, w.b.getClassLoader(), I(), (Bundle)localObject2);
        }
        localObject4 = c;
        mSavedFragmentState = ((Bundle)localObject2);
        mFragmentManager = this;
        if (L(2))
        {
          localObject2 = f.l("restoreSaveState: active (");
          ((StringBuilder)localObject2).append(mWho);
          ((StringBuilder)localObject2).append("): ");
          ((StringBuilder)localObject2).append(localObject4);
          Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
        }
        paramBundle.m(w.b.getClassLoader());
        c.h(paramBundle);
        e = v;
      }
    }
    paramBundle = O;
    paramBundle.getClass();
    paramBundle = new ArrayList(d.values()).iterator();
    boolean bool;
    int i1;
    int i2;
    for (;;)
    {
      bool = paramBundle.hasNext();
      i1 = 0;
      i2 = 0;
      if (!bool) {
        break;
      }
      localObject3 = (i)paramBundle.next();
      localObject4 = c;
      localObject2 = mWho;
      if (((HashMap)b).get(localObject2) != null) {
        i2 = 1;
      }
      if (i2 == 0)
      {
        if (L(2))
        {
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("Discarding retained Fragment ");
          ((StringBuilder)localObject2).append(localObject3);
          ((StringBuilder)localObject2).append(" that was not found in the set of active Fragments ");
          ((StringBuilder)localObject2).append(a);
          Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
        }
        O.g((i)localObject3);
        mFragmentManager = this;
        localObject2 = new e0(o, c, (i)localObject3);
        e = 1;
        ((e0)localObject2).k();
        mRemoving = true;
        ((e0)localObject2).k();
      }
    }
    paramBundle = c;
    localObject3 = b;
    ((ArrayList)a).clear();
    if (localObject3 != null)
    {
      localObject2 = ((List)localObject3).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject4 = (String)((Iterator)localObject2).next();
        localObject3 = paramBundle.c((String)localObject4);
        if (localObject3 != null)
        {
          if (L(2))
          {
            StringBuilder localStringBuilder = new StringBuilder();
            localStringBuilder.append("restoreSaveState: added (");
            localStringBuilder.append((String)localObject4);
            localStringBuilder.append("): ");
            localStringBuilder.append(localObject3);
            Log.v("FragmentManager", localStringBuilder.toString());
          }
          paramBundle.a((i)localObject3);
        }
        else
        {
          throw new IllegalStateException(g.e("No instantiated fragment for (", (String)localObject4, ")"));
        }
      }
    }
    if (c != null)
    {
      d = new ArrayList(c.length);
      for (i2 = 0;; i2++)
      {
        paramBundle = c;
        if (i2 >= paramBundle.length) {
          break;
        }
        localObject3 = paramBundle[i2];
        localObject3.getClass();
        paramBundle = new a(this);
        int i3 = 0;
        int i4 = i3;
        while (i3 < a.length)
        {
          localObject2 = new g0.a();
          localObject4 = a;
          int i5 = i3 + 1;
          a = localObject4[i3];
          if (L(2))
          {
            localObject4 = new StringBuilder();
            ((StringBuilder)localObject4).append("Instantiate ");
            ((StringBuilder)localObject4).append(paramBundle);
            ((StringBuilder)localObject4).append(" op #");
            ((StringBuilder)localObject4).append(i4);
            ((StringBuilder)localObject4).append(" base fragment #");
            ((StringBuilder)localObject4).append(a[i5]);
            Log.v("FragmentManager", ((StringBuilder)localObject4).toString());
          }
          h = k.b.values()[c[i4]];
          i = k.b.values()[d[i4]];
          localObject4 = a;
          i3 = i5 + 1;
          if (localObject4[i5] != 0) {
            bool = true;
          } else {
            bool = false;
          }
          c = bool;
          i5 = i3 + 1;
          i3 = localObject4[i3];
          d = i3;
          int i6 = i5 + 1;
          int i7 = localObject4[i5];
          e = i7;
          i5 = i6 + 1;
          i6 = localObject4[i6];
          f = i6;
          int i8 = localObject4[i5];
          g = i8;
          b = i3;
          c = i7;
          d = i6;
          e = i8;
          paramBundle.b((g0.a)localObject2);
          i4++;
          i3 = i5 + 1;
        }
        f = e;
        h = f;
        g = true;
        i = p;
        j = q;
        k = r;
        l = s;
        m = t;
        n = u;
        o = v;
        r = o;
        for (i4 = 0; i4 < b.size(); i4++)
        {
          localObject2 = (String)b.get(i4);
          if (localObject2 != null) {
            a.get(i4)).b = C((String)localObject2);
          }
        }
        paramBundle.c(1);
        if (L(2))
        {
          localObject3 = a0.j.n("restoreAllState: back stack #", i2, " (index ");
          ((StringBuilder)localObject3).append(r);
          ((StringBuilder)localObject3).append("): ");
          ((StringBuilder)localObject3).append(paramBundle);
          Log.v("FragmentManager", ((StringBuilder)localObject3).toString());
          localObject3 = new PrintWriter(new p0());
          paramBundle.f("  ", (PrintWriter)localObject3, false);
          ((PrintWriter)localObject3).close();
        }
        d.add(paramBundle);
      }
    }
    d = new ArrayList();
    j.set(d);
    paramBundle = e;
    if (paramBundle != null)
    {
      paramBundle = C(paramBundle);
      z = paramBundle;
      s(paramBundle);
    }
    paramBundle = f;
    if (paramBundle != null) {
      for (i2 = i1; i2 < paramBundle.size(); i2++) {
        k.put((String)paramBundle.get(i2), (c)o.get(i2));
      }
    }
    F = new ArrayDeque(p);
  }
  
  public final Bundle W()
  {
    Bundle localBundle = new Bundle();
    F();
    x();
    A(true);
    H = true;
    O.i = true;
    Object localObject1 = c;
    localObject1.getClass();
    ArrayList localArrayList = new ArrayList(((HashMap)b).size());
    Object localObject3 = ((HashMap)b).values().iterator();
    Object localObject4;
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = (e0)((Iterator)localObject3).next();
      if (localObject4 != null)
      {
        ??? = c;
        localObject6 = mWho;
        ((f0)localObject1).j(((e0)localObject4).o(), (String)localObject6);
        localArrayList.add(mWho);
        if (L(2))
        {
          localObject6 = new StringBuilder();
          ((StringBuilder)localObject6).append("Saved state of ");
          ((StringBuilder)localObject6).append(???);
          ((StringBuilder)localObject6).append(": ");
          ((StringBuilder)localObject6).append(mSavedFragmentState);
          Log.v("FragmentManager", ((StringBuilder)localObject6).toString());
        }
      }
    }
    Object localObject6 = (HashMap)c.c;
    if (((HashMap)localObject6).isEmpty())
    {
      if (L(2)) {
        Log.v("FragmentManager", "saveAllState: no fragments!");
      }
    }
    else {
      localObject4 = c;
    }
    synchronized ((ArrayList)a)
    {
      boolean bool = ((ArrayList)a).isEmpty();
      localObject3 = null;
      if (bool)
      {
        localObject1 = null;
      }
      else
      {
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>(((ArrayList)a).size());
        localObject4 = ((ArrayList)a).iterator();
        while (((Iterator)localObject4).hasNext())
        {
          i locali = (i)((Iterator)localObject4).next();
          ((ArrayList)localObject1).add(mWho);
          if (L(2))
          {
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localStringBuilder.append("saveAllState: adding fragment (");
            localStringBuilder.append(mWho);
            localStringBuilder.append("): ");
            localStringBuilder.append(locali);
            Log.v("FragmentManager", localStringBuilder.toString());
          }
        }
      }
      int i1 = d.size();
      if (i1 > 0)
      {
        ??? = new b[i1];
        for (int i2 = 0;; i2++)
        {
          localObject3 = ???;
          if (i2 >= i1) {
            break;
          }
          ???[i2] = new b((a)d.get(i2));
          if (L(2))
          {
            localObject3 = a0.j.n("saveAllState: adding back stack #", i2, ": ");
            ((StringBuilder)localObject3).append(d.get(i2));
            Log.v("FragmentManager", ((StringBuilder)localObject3).toString());
          }
        }
      }
      ??? = new a0();
      a = localArrayList;
      b = ((ArrayList)localObject1);
      c = ((b[])localObject3);
      d = j.get();
      localObject1 = z;
      if (localObject1 != null) {
        e = mWho;
      }
      f.addAll(k.keySet());
      o.addAll(k.values());
      p = new ArrayList(F);
      localBundle.putParcelable("state", (Parcelable)???);
      localObject1 = l.keySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = (String)((Iterator)localObject1).next();
        localBundle.putBundle(g.d("result_", (String)localObject3), (Bundle)l.get(localObject3));
      }
      localObject1 = ((HashMap)localObject6).keySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = (String)((Iterator)localObject1).next();
        localBundle.putBundle(g.d("fragment_", (String)localObject3), (Bundle)((HashMap)localObject6).get(localObject3));
      }
      return localBundle;
    }
  }
  
  public final void X()
  {
    synchronized (a)
    {
      int i1 = a.size();
      int i2 = 1;
      if (i1 != 1) {
        i2 = 0;
      }
      if (i2 != 0)
      {
        w.c.removeCallbacks(P);
        w.c.post(P);
        f0();
      }
      return;
    }
  }
  
  public final void Y(i parami, boolean paramBoolean)
  {
    parami = H(parami);
    if ((parami != null) && ((parami instanceof q))) {
      ((q)parami).setDrawDisappearingViewsLast(paramBoolean ^ true);
    }
  }
  
  public final void Z(i parami, k.b paramb)
  {
    if ((parami.equals(C(mWho))) && ((mHost == null) || (mFragmentManager == this)))
    {
      mMaxState = paramb;
      return;
    }
    paramb = new StringBuilder();
    paramb.append("Fragment ");
    paramb.append(parami);
    paramb.append(" is not an active fragment of FragmentManager ");
    paramb.append(this);
    throw new IllegalArgumentException(paramb.toString());
  }
  
  public final e0 a(i parami)
  {
    Object localObject = mPreviousWho;
    if (localObject != null) {
      y0.b.d(parami, (String)localObject);
    }
    if (L(2))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("add: ");
      ((StringBuilder)localObject).append(parami);
      Log.v("FragmentManager", ((StringBuilder)localObject).toString());
    }
    localObject = h(parami);
    mFragmentManager = this;
    c.h((e0)localObject);
    if (!mDetached)
    {
      c.a(parami);
      mRemoving = false;
      if (mView == null) {
        mHiddenChanged = false;
      }
      if (M(parami)) {
        G = true;
      }
    }
    return (e0)localObject;
  }
  
  public final void a0(i parami)
  {
    if ((parami != null) && ((!parami.equals(C(mWho))) || ((mHost != null) && (mFragmentManager != this))))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Fragment ");
      ((StringBuilder)localObject).append(parami);
      ((StringBuilder)localObject).append(" is not an active fragment of FragmentManager ");
      ((StringBuilder)localObject).append(this);
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    Object localObject = z;
    z = parami;
    s((i)localObject);
    s(z);
  }
  
  public final void b(c0 paramc0)
  {
    p.add(paramc0);
  }
  
  public final void b0(i parami)
  {
    ViewGroup localViewGroup = H(parami);
    if (localViewGroup != null)
    {
      int i1 = parami.getEnterAnim();
      int i2 = parami.getExitAnim();
      int i3 = parami.getPopEnterAnim();
      if (parami.getPopExitAnim() + (i3 + (i2 + i1)) > 0)
      {
        if (localViewGroup.getTag(2131362066) == null) {
          localViewGroup.setTag(2131362066, parami);
        }
        ((i)localViewGroup.getTag(2131362066)).setPopDirection(parami.getPopDirection());
      }
    }
  }
  
  public final void c(t<?> paramt, p paramp, i parami)
  {
    if (w == null)
    {
      w = paramt;
      x = paramp;
      y = parami;
      if (parami != null)
      {
        paramp = new g(parami);
      }
      else
      {
        if (!(paramt instanceof c0)) {
          break label55;
        }
        paramp = (c0)paramt;
      }
      b(paramp);
      label55:
      if (y != null) {
        f0();
      }
      Object localObject;
      if ((paramt instanceof b.y))
      {
        paramp = (b.y)paramt;
        localObject = paramp.getOnBackPressedDispatcher();
        g = ((b.w)localObject);
        if (parami != null) {
          paramp = parami;
        }
        ((b.w)localObject).a(paramp, i);
      }
      boolean bool = false;
      if (parami != null)
      {
        localObject = mFragmentManager.O;
        paramp = (b0)e.get(mWho);
        paramt = paramp;
        if (paramp == null)
        {
          paramt = new b0(g);
          e.put(mWho, paramt);
        }
        O = paramt;
      }
      else
      {
        if ((paramt instanceof b1.t0)) {
          paramt = (b0)new q0(((b1.t0)paramt).getViewModelStore(), b0.j).a(b0.class);
        } else {
          paramt = new b0(false);
        }
        O = paramt;
      }
      paramt = O;
      if ((H) || (I)) {
        bool = true;
      }
      i = bool;
      c.d = paramt;
      paramt = w;
      if (((paramt instanceof s1.e)) && (parami == null))
      {
        paramt = ((s1.e)paramt).getSavedStateRegistry();
        paramt.c("android:support:fragments", new j(this, 1));
        paramt = paramt.a("android:support:fragments");
        if (paramt != null) {
          V(paramt);
        }
      }
      paramt = w;
      if ((paramt instanceof h))
      {
        paramp = ((h)paramt).getActivityResultRegistry();
        if (parami != null) {
          paramt = g.f(new StringBuilder(), mWho, ":");
        } else {
          paramt = "";
        }
        paramt = g.d("FragmentManager:", paramt);
        C = paramp.d(g.d(paramt, "StartActivityForResult"), new e.c(), new h());
        D = paramp.d(g.d(paramt, "StartIntentSenderForResult"), new j(), new i());
        E = paramp.d(g.d(paramt, "RequestPermissions"), new e.b(), new a());
      }
      paramt = w;
      if ((paramt instanceof v.c)) {
        ((v.c)paramt).addOnConfigurationChangedListener(q);
      }
      paramt = w;
      if ((paramt instanceof d)) {
        ((d)paramt).addOnTrimMemoryListener(r);
      }
      paramt = w;
      if ((paramt instanceof u.v)) {
        ((u.v)paramt).addOnMultiWindowModeChangedListener(s);
      }
      paramt = w;
      if ((paramt instanceof u.w)) {
        ((u.w)paramt).addOnPictureInPictureModeChangedListener(t);
      }
      paramt = w;
      if (((paramt instanceof e0.j)) && (parami == null)) {
        ((e0.j)paramt).addMenuProvider(u);
      }
      return;
    }
    throw new IllegalStateException("Already attached");
  }
  
  public final void d(i parami)
  {
    StringBuilder localStringBuilder;
    if (L(2))
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("attach: ");
      localStringBuilder.append(parami);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    if (mDetached)
    {
      mDetached = false;
      if (!mAdded)
      {
        c.a(parami);
        if (L(2))
        {
          localStringBuilder = new StringBuilder();
          localStringBuilder.append("add from attach: ");
          localStringBuilder.append(parami);
          Log.v("FragmentManager", localStringBuilder.toString());
        }
        if (M(parami)) {
          G = true;
        }
      }
    }
  }
  
  public final void d0()
  {
    Iterator localIterator = c.e().iterator();
    while (localIterator.hasNext())
    {
      e0 locale0 = (e0)localIterator.next();
      i locali = c;
      if (mDeferStart) {
        if (b)
        {
          K = true;
        }
        else
        {
          mDeferStart = false;
          locale0.k();
        }
      }
    }
  }
  
  public final void e()
  {
    b = false;
    M.clear();
    L.clear();
  }
  
  public final void e0(IllegalStateException paramIllegalStateException)
  {
    Log.e("FragmentManager", paramIllegalStateException.getMessage());
    Log.e("FragmentManager", "Activity state:");
    PrintWriter localPrintWriter = new PrintWriter(new p0());
    t localt = w;
    if (localt != null) {}
    try
    {
      localt.d(localPrintWriter, new String[0]);
    }
    catch (Exception localException)
    {
      Log.e("FragmentManager", "Failed dumping state", localException);
    }
    w("  ", null, localPrintWriter, new String[0]);
    throw paramIllegalStateException;
  }
  
  public final HashSet f()
  {
    HashSet localHashSet = new HashSet();
    Iterator localIterator = c.e().iterator();
    while (localIterator.hasNext())
    {
      ViewGroup localViewGroup = nextc.mContainer;
      if (localViewGroup != null)
      {
        ec.i.e(J(), "factory");
        Object localObject = localViewGroup.getTag(2131362020);
        if ((localObject instanceof r0))
        {
          localObject = (r0)localObject;
        }
        else
        {
          localObject = new e(localViewGroup);
          localViewGroup.setTag(2131362020, localObject);
        }
        localHashSet.add(localObject);
      }
    }
    return localHashSet;
  }
  
  public final void f0()
  {
    synchronized (a)
    {
      boolean bool1 = a.isEmpty();
      boolean bool2 = true;
      if (!bool1)
      {
        i.setEnabled(true);
        if (L(3))
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append("FragmentManager ");
          localStringBuilder.append(this);
          localStringBuilder.append(" enabling OnBackPressedCallback, caused by non-empty pending actions");
          Log.d("FragmentManager", localStringBuilder.toString());
        }
        return;
      }
      int i1 = d.size();
      int i2;
      if (h != null) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      if ((i1 + i2 <= 0) || (!O(y))) {
        bool2 = false;
      }
      if (L(3))
      {
        ??? = new StringBuilder();
        ((StringBuilder)???).append("OnBackPressedCallback for FragmentManager ");
        ((StringBuilder)???).append(this);
        ((StringBuilder)???).append(" enabled state is ");
        ((StringBuilder)???).append(bool2);
        Log.d("FragmentManager", ((StringBuilder)???).toString());
      }
      i.setEnabled(bool2);
      return;
    }
  }
  
  public final HashSet g(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    HashSet localHashSet = new HashSet();
    while (paramInt1 < paramInt2)
    {
      Iterator localIterator = geta.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = nextb;
        if (localObject != null)
        {
          localObject = mContainer;
          if (localObject != null) {
            localHashSet.add(r0.m((ViewGroup)localObject, this));
          }
        }
      }
      paramInt1++;
    }
    return localHashSet;
  }
  
  public final e0 h(i parami)
  {
    Object localObject = c;
    String str = mWho;
    localObject = (e0)((HashMap)b).get(str);
    if (localObject != null) {
      return (e0)localObject;
    }
    parami = new e0(o, c, parami);
    parami.m(w.b.getClassLoader());
    e = v;
    return parami;
  }
  
  public final void i(i parami)
  {
    if (L(2))
    {
      ??? = new StringBuilder();
      ((StringBuilder)???).append("detach: ");
      ((StringBuilder)???).append(parami);
      Log.v("FragmentManager", ((StringBuilder)???).toString());
    }
    if (!mDetached)
    {
      mDetached = true;
      if (mAdded)
      {
        if (L(2))
        {
          ??? = new StringBuilder();
          ((StringBuilder)???).append("remove from detach: ");
          ((StringBuilder)???).append(parami);
          Log.v("FragmentManager", ((StringBuilder)???).toString());
        }
        f0 localf0 = c;
        synchronized ((ArrayList)a)
        {
          ((ArrayList)a).remove(parami);
          mAdded = false;
          if (M(parami)) {
            G = true;
          }
          b0(parami);
        }
      }
    }
  }
  
  public final void j(boolean paramBoolean, Configuration paramConfiguration)
  {
    if ((paramBoolean) && ((w instanceof v.c)))
    {
      e0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
      throw null;
    }
    Iterator localIterator = c.g().iterator();
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      if (locali != null)
      {
        locali.performConfigurationChanged(paramConfiguration);
        if (paramBoolean) {
          mChildFragmentManager.j(true, paramConfiguration);
        }
      }
    }
  }
  
  public final boolean k(MenuItem paramMenuItem)
  {
    if (v < 1) {
      return false;
    }
    Iterator localIterator = c.g().iterator();
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      if ((locali != null) && (locali.performContextItemSelected(paramMenuItem))) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean l(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    int i1 = v;
    int i2 = 0;
    if (i1 < 1) {
      return false;
    }
    Object localObject1 = null;
    Iterator localIterator = c.g().iterator();
    boolean bool = false;
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      if ((locali != null) && (locali.isMenuVisible()) && (locali.performCreateOptionsMenu(paramMenu, paramMenuInflater)))
      {
        Object localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new ArrayList();
        }
        ((ArrayList)localObject2).add(locali);
        bool = true;
        localObject1 = localObject2;
      }
    }
    if (e != null) {
      while (i2 < e.size())
      {
        paramMenu = (i)e.get(i2);
        if ((localObject1 == null) || (!((ArrayList)localObject1).contains(paramMenu))) {
          paramMenu.onDestroyOptionsMenu();
        }
        i2++;
      }
    }
    e = ((ArrayList)localObject1);
    return bool;
  }
  
  public final void m()
  {
    boolean bool = true;
    J = true;
    A(true);
    x();
    Object localObject = w;
    if ((localObject instanceof b1.t0))
    {
      bool = c.d).h;
    }
    else
    {
      localObject = b;
      if ((localObject instanceof Activity)) {
        bool = true ^ ((Activity)localObject).isChangingConfigurations();
      }
    }
    if (bool)
    {
      Iterator localIterator = k.values().iterator();
      while (localIterator.hasNext())
      {
        localObject = nexta.iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          ((b0)c.d).d(str, false);
        }
      }
    }
    v(-1);
    localObject = w;
    if ((localObject instanceof d)) {
      ((d)localObject).removeOnTrimMemoryListener(r);
    }
    localObject = w;
    if ((localObject instanceof v.c)) {
      ((v.c)localObject).removeOnConfigurationChangedListener(q);
    }
    localObject = w;
    if ((localObject instanceof u.v)) {
      ((u.v)localObject).removeOnMultiWindowModeChangedListener(s);
    }
    localObject = w;
    if ((localObject instanceof u.w)) {
      ((u.w)localObject).removeOnPictureInPictureModeChangedListener(t);
    }
    localObject = w;
    if (((localObject instanceof e0.j)) && (y == null)) {
      ((e0.j)localObject).removeMenuProvider(u);
    }
    w = null;
    x = null;
    y = null;
    if (g != null)
    {
      i.remove();
      g = null;
    }
    localObject = C;
    if (localObject != null)
    {
      ((d.f)localObject).b();
      D.b();
      E.b();
    }
  }
  
  public final void n(boolean paramBoolean)
  {
    if ((paramBoolean) && ((w instanceof d)))
    {
      e0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
      throw null;
    }
    Iterator localIterator = c.g().iterator();
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      if (locali != null)
      {
        locali.performLowMemory();
        if (paramBoolean) {
          mChildFragmentManager.n(true);
        }
      }
    }
  }
  
  public final void o(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramBoolean2) && ((w instanceof u.v)))
    {
      e0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
      throw null;
    }
    Iterator localIterator = c.g().iterator();
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      if (locali != null)
      {
        locali.performMultiWindowModeChanged(paramBoolean1);
        if (paramBoolean2) {
          mChildFragmentManager.o(paramBoolean1, true);
        }
      }
    }
  }
  
  public final void p()
  {
    Iterator localIterator = c.f().iterator();
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      if (locali != null)
      {
        locali.onHiddenChanged(locali.isHidden());
        mChildFragmentManager.p();
      }
    }
  }
  
  public final boolean q(MenuItem paramMenuItem)
  {
    if (v < 1) {
      return false;
    }
    Iterator localIterator = c.g().iterator();
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      if ((locali != null) && (locali.performOptionsItemSelected(paramMenuItem))) {
        return true;
      }
    }
    return false;
  }
  
  public final void r(Menu paramMenu)
  {
    if (v < 1) {
      return;
    }
    Iterator localIterator = c.g().iterator();
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      if (locali != null) {
        locali.performOptionsMenuClosed(paramMenu);
      }
    }
  }
  
  public final void s(i parami)
  {
    if ((parami != null) && (parami.equals(C(mWho)))) {
      parami.performPrimaryNavigationFragmentChanged();
    }
  }
  
  public final void t(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramBoolean2) && ((w instanceof u.w)))
    {
      e0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
      throw null;
    }
    Iterator localIterator = c.g().iterator();
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      if (locali != null)
      {
        locali.performPictureInPictureModeChanged(paramBoolean1);
        if (paramBoolean2) {
          mChildFragmentManager.t(paramBoolean1, true);
        }
      }
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("FragmentManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    Object localObject = y;
    if (localObject != null)
    {
      localStringBuilder.append(localObject.getClass().getSimpleName());
      localStringBuilder.append("{");
    }
    for (localObject = y;; localObject = w)
    {
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(localObject)));
      localStringBuilder.append("}");
      break label141;
      localObject = w;
      if (localObject == null) {
        break;
      }
      localStringBuilder.append(localObject.getClass().getSimpleName());
      localStringBuilder.append("{");
    }
    localStringBuilder.append("null");
    label141:
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
  
  public final boolean u(Menu paramMenu)
  {
    int i1 = v;
    boolean bool = false;
    if (i1 < 1) {
      return false;
    }
    Iterator localIterator = c.g().iterator();
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      if ((locali != null) && (locali.isMenuVisible()) && (locali.performPrepareOptionsMenu(paramMenu))) {
        bool = true;
      }
    }
    return bool;
  }
  
  public final void v(int paramInt)
  {
    try
    {
      b = true;
      Iterator localIterator = ((HashMap)c.b).values().iterator();
      while (localIterator.hasNext())
      {
        e0 locale0 = (e0)localIterator.next();
        if (locale0 != null) {
          e = paramInt;
        }
      }
      P(paramInt, false);
      localIterator = f().iterator();
      while (localIterator.hasNext()) {
        ((r0)localIterator.next()).l();
      }
      b = false;
      A(true);
      return;
    }
    finally
    {
      b = false;
    }
  }
  
  public final void w(String paramString, FileDescriptor arg2, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    String str = g.d(paramString, "    ");
    f0 localf0 = c;
    localf0.getClass();
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append(paramString);
    ((StringBuilder)localObject1).append("    ");
    localObject1 = ((StringBuilder)localObject1).toString();
    if (!((HashMap)b).isEmpty())
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Active Fragments:");
      Iterator localIterator = ((HashMap)b).values().iterator();
      while (localIterator.hasNext())
      {
        Object localObject2 = (e0)localIterator.next();
        paramPrintWriter.print(paramString);
        if (localObject2 != null)
        {
          localObject2 = c;
          paramPrintWriter.println(localObject2);
          ((i)localObject2).dump((String)localObject1, ???, paramPrintWriter, paramArrayOfString);
        }
        else
        {
          paramPrintWriter.println("null");
        }
      }
    }
    int i1 = ((ArrayList)a).size();
    int i2 = 0;
    int i3;
    if (i1 > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Added Fragments:");
      for (i3 = 0; i3 < i1; i3++)
      {
        ??? = (i)((ArrayList)a).get(i3);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(i3);
        paramPrintWriter.print(": ");
        paramPrintWriter.println(???.toString());
      }
    }
    ??? = e;
    if (??? != null)
    {
      i1 = ???.size();
      if (i1 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Fragments Created Menus:");
        for (i3 = 0; i3 < i1; i3++)
        {
          ??? = (i)e.get(i3);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i3);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(???.toString());
        }
      }
    }
    i1 = d.size();
    if (i1 > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Back Stack:");
      for (i3 = 0; i3 < i1; i3++)
      {
        ??? = (a)d.get(i3);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(i3);
        paramPrintWriter.print(": ");
        paramPrintWriter.println(???.toString());
        ???.f(str, paramPrintWriter, true);
      }
    }
    paramPrintWriter.print(paramString);
    ??? = new StringBuilder();
    ???.append("Back Stack Index: ");
    ???.append(j.get());
    paramPrintWriter.println(???.toString());
    synchronized (a)
    {
      i1 = a.size();
      if (i1 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Pending Actions:");
        for (i3 = i2; i3 < i1; i3++)
        {
          paramArrayOfString = (m)a.get(i3);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i3);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(paramArrayOfString);
        }
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("FragmentManager misc state:");
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mHost=");
      paramPrintWriter.println(w);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mContainer=");
      paramPrintWriter.println(x);
      if (y != null)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  mParent=");
        paramPrintWriter.println(y);
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mCurState=");
      paramPrintWriter.print(v);
      paramPrintWriter.print(" mStateSaved=");
      paramPrintWriter.print(H);
      paramPrintWriter.print(" mStopped=");
      paramPrintWriter.print(I);
      paramPrintWriter.print(" mDestroyed=");
      paramPrintWriter.println(J);
      if (G)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  mNeedMenuInvalidate=");
        paramPrintWriter.println(G);
      }
      return;
    }
  }
  
  public final void x()
  {
    Iterator localIterator = f().iterator();
    while (localIterator.hasNext()) {
      ((r0)localIterator.next()).l();
    }
  }
  
  public final void y(m paramm, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      if (w == null)
      {
        if (J) {
          throw new IllegalStateException("FragmentManager has been destroyed");
        }
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
      }
      int i1;
      if ((!H) && (!I)) {
        i1 = 0;
      } else {
        i1 = 1;
      }
      if (i1 != 0) {
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
      }
    }
    synchronized (a)
    {
      if (w == null)
      {
        if (paramBoolean) {
          return;
        }
        paramm = new java/lang/IllegalStateException;
        paramm.<init>("Activity has been destroyed");
        throw paramm;
      }
      a.add(paramm);
      X();
      return;
    }
  }
  
  public final void z(boolean paramBoolean)
  {
    if (!b)
    {
      if (w == null)
      {
        if (J) {
          throw new IllegalStateException("FragmentManager has been destroyed");
        }
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
      }
      if (Looper.myLooper() == w.c.getLooper())
      {
        if (!paramBoolean)
        {
          int i1;
          if ((!H) && (!I)) {
            i1 = 0;
          } else {
            i1 = 1;
          }
          if (i1 != 0) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
          }
        }
        if (L == null)
        {
          L = new ArrayList();
          M = new ArrayList();
        }
        return;
      }
      throw new IllegalStateException("Must be called from main thread of fragment host");
    }
    throw new IllegalStateException("FragmentManager is already executing transactions");
  }
  
  public final class a
    implements d.b<Map<String, Boolean>>
  {
    public a() {}
    
    public final void a(Object paramObject)
    {
      Object localObject1 = (Map)paramObject;
      paramObject = (String[])((Map)localObject1).keySet().toArray(new String[0]);
      Object localObject2 = new ArrayList(((Map)localObject1).values());
      localObject1 = new int[((ArrayList)localObject2).size()];
      for (int i = 0; i < ((ArrayList)localObject2).size(); i++)
      {
        int j;
        if (((Boolean)((ArrayList)localObject2).get(i)).booleanValue()) {
          j = 0;
        } else {
          j = -1;
        }
        localObject1[i] = j;
      }
      Object localObject3 = (y.k)F.pollFirst();
      if (localObject3 == null)
      {
        paramObject = new StringBuilder();
        ((StringBuilder)paramObject).append("No permissions were requested for ");
        ((StringBuilder)paramObject).append(this);
      }
      else
      {
        localObject2 = a;
        i = b;
        localObject3 = c.d((String)localObject2);
        if (localObject3 != null) {
          break label188;
        }
        paramObject = g.g("Permission request result delivered for unknown Fragment ", (String)localObject2);
      }
      Log.w("FragmentManager", ((StringBuilder)paramObject).toString());
      return;
      label188:
      ((i)localObject3).onRequestPermissionsResult(i, (String[])paramObject, (int[])localObject1);
    }
  }
  
  public final class b
    extends b.p
  {
    public b()
    {
      super();
    }
    
    public final void handleOnBackCancelled()
    {
      if (y.L(3))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("handleOnBackCancelled. PREDICTIVE_BACK = ");
        ((StringBuilder)localObject).append(true);
        ((StringBuilder)localObject).append(" fragment manager ");
        ((StringBuilder)localObject).append(y.this);
        Log.d("FragmentManager", ((StringBuilder)localObject).toString());
      }
      y localy = y.this;
      Object localObject = h;
      if (localObject != null)
      {
        q = false;
        ((a)localObject).d(false);
        localy.A(true);
        localy.F();
        localObject = n.iterator();
        while (((Iterator)localObject).hasNext()) {
          ((y.l)((Iterator)localObject).next()).c();
        }
      }
      h = null;
    }
    
    public final void handleOnBackPressed()
    {
      if (y.L(3))
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("handleOnBackPressed. PREDICTIVE_BACK = ");
        ((StringBuilder)localObject1).append(true);
        ((StringBuilder)localObject1).append(" fragment manager ");
        ((StringBuilder)localObject1).append(y.this);
        Log.d("FragmentManager", ((StringBuilder)localObject1).toString());
      }
      Object localObject1 = y.this;
      ((y)localObject1).A(true);
      if (h != null)
      {
        Object localObject3;
        if (!n.isEmpty())
        {
          localObject2 = new LinkedHashSet(y.G(h));
          Iterator localIterator1 = n.iterator();
          while (localIterator1.hasNext())
          {
            localObject3 = (y.l)localIterator1.next();
            Iterator localIterator2 = ((Set)localObject2).iterator();
            while (localIterator2.hasNext())
            {
              i locali = (i)localIterator2.next();
              ((y.l)localObject3).d();
            }
          }
        }
        Object localObject2 = h.a.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = nextb;
          if (localObject3 != null) {
            mTransitioning = false;
          }
        }
        localObject2 = ((y)localObject1).g(new ArrayList(Collections.singletonList(h)), 0, 1).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (r0)((Iterator)localObject2).next();
          localObject3.getClass();
          if (y.L(3)) {
            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
          }
          ((r0)localObject3).o(c);
          ((r0)localObject3).c(c);
        }
        h = null;
        ((y)localObject1).f0();
        if (y.L(3))
        {
          Log.d("FragmentManager", "Op is being set to null");
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("OnBackPressedCallback enabled=");
          ((StringBuilder)localObject2).append(i.isEnabled());
          ((StringBuilder)localObject2).append(" for  FragmentManager ");
          ((StringBuilder)localObject2).append(localObject1);
          Log.d("FragmentManager", ((StringBuilder)localObject2).toString());
        }
      }
      else
      {
        boolean bool1 = i.isEnabled();
        boolean bool2 = y.L(3);
        if (bool1)
        {
          if (bool2) {
            Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
          }
          ((y)localObject1).R();
        }
        else
        {
          if (bool2) {
            Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
          }
          g.b();
        }
      }
    }
    
    public final void handleOnBackProgressed(b.b paramb)
    {
      if (y.L(2))
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("handleOnBackProgressed. PREDICTIVE_BACK = ");
        ((StringBuilder)localObject1).append(true);
        ((StringBuilder)localObject1).append(" fragment manager ");
        ((StringBuilder)localObject1).append(y.this);
        Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
      }
      Object localObject1 = y.this;
      if (h != null)
      {
        Iterator localIterator = ((y)localObject1).g(new ArrayList(Collections.singletonList(h)), 0, 1).iterator();
        while (localIterator.hasNext())
        {
          localObject1 = (r0)localIterator.next();
          localObject1.getClass();
          ec.i.e(paramb, "backEvent");
          if (y.L(2))
          {
            localObject2 = f.l("SpecialEffectsController: Processing Progress ");
            ((StringBuilder)localObject2).append(c);
            Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
          }
          Object localObject3 = c;
          Object localObject2 = new ArrayList();
          localObject3 = ((ArrayList)localObject3).iterator();
          while (((Iterator)localObject3).hasNext()) {
            sb.o.k(nextk, (ArrayList)localObject2);
          }
          localObject2 = sb.q.u(sb.q.x((Iterable)localObject2));
          int i = ((List)localObject2).size();
          for (int j = 0; j < i; j++) {
            ((r0.a)((List)localObject2).get(j)).d(paramb, a);
          }
        }
        paramb = n.iterator();
        while (paramb.hasNext()) {
          ((y.l)paramb.next()).a();
        }
      }
    }
    
    public final void handleOnBackStarted(b.b paramb)
    {
      if (y.L(3))
      {
        paramb = new StringBuilder();
        paramb.append("handleOnBackStarted. PREDICTIVE_BACK = ");
        paramb.append(true);
        paramb.append(" fragment manager ");
        paramb.append(y.this);
        Log.d("FragmentManager", paramb.toString());
      }
      x();
      paramb = y.this;
      paramb.getClass();
      paramb.y(new y.o(paramb), false);
    }
  }
  
  public final class c
    implements e0.o
  {
    public c() {}
    
    public final boolean a(MenuItem paramMenuItem)
    {
      return q(paramMenuItem);
    }
    
    public final void b(Menu paramMenu)
    {
      r(paramMenu);
    }
    
    public final void c(Menu paramMenu, MenuInflater paramMenuInflater)
    {
      l(paramMenu, paramMenuInflater);
    }
    
    public final void d(Menu paramMenu)
    {
      u(paramMenu);
    }
  }
  
  public final class d
    extends s
  {
    public d() {}
  }
  
  public final class e
    implements t0
  {}
  
  public final class f
    implements Runnable
  {
    public f() {}
    
    public final void run()
    {
      A(true);
    }
  }
  
  public final class g
    implements c0
  {
    public g() {}
    
    public final void a(i parami)
    {
      onAttachFragment(parami);
    }
  }
  
  public final class h
    implements d.b<d.a>
  {
    public h() {}
    
    public final void a(Object paramObject)
    {
      paramObject = (d.a)paramObject;
      Object localObject = (y.k)F.pollLast();
      int i;
      if (localObject == null)
      {
        paramObject = new StringBuilder();
        ((StringBuilder)paramObject).append("No Activities were started for result for ");
        ((StringBuilder)paramObject).append(this);
      }
      else
      {
        String str = a;
        i = b;
        localObject = c.d(str);
        if (localObject != null) {
          break label94;
        }
        paramObject = g.g("Activity result delivered for unknown Fragment ", str);
      }
      Log.w("FragmentManager", ((StringBuilder)paramObject).toString());
      return;
      label94:
      ((i)localObject).onActivityResult(i, a, b);
    }
  }
  
  public final class i
    implements d.b<d.a>
  {
    public i() {}
    
    public final void a(Object paramObject)
    {
      d.a locala = (d.a)paramObject;
      Object localObject = (y.k)F.pollFirst();
      int i;
      if (localObject == null)
      {
        paramObject = new StringBuilder();
        ((StringBuilder)paramObject).append("No IntentSenders were started for ");
        ((StringBuilder)paramObject).append(this);
      }
      else
      {
        paramObject = a;
        i = b;
        localObject = c.d((String)paramObject);
        if (localObject != null) {
          break label94;
        }
        paramObject = g.g("Intent Sender result delivered for unknown Fragment ", (String)paramObject);
      }
      Log.w("FragmentManager", ((StringBuilder)paramObject).toString());
      return;
      label94:
      ((i)localObject).onActivityResult(i, a, b);
    }
  }
  
  public static final class j
    extends e.a<d.i, d.a>
  {
    public final Intent a(b.j paramj, Object paramObject)
    {
      paramObject = (d.i)paramObject;
      Intent localIntent1 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
      Intent localIntent2 = b;
      paramj = (b.j)paramObject;
      if (localIntent2 != null)
      {
        Bundle localBundle = localIntent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        paramj = (b.j)paramObject;
        if (localBundle != null)
        {
          localIntent1.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", localBundle);
          localIntent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
          paramj = (b.j)paramObject;
          if (localIntent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false))
          {
            paramj = a;
            ec.i.e(paramj, "intentSender");
            int i = d;
            paramj = new d.i(paramj, null, c, i);
          }
        }
      }
      localIntent1.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", paramj);
      if (y.L(2))
      {
        paramj = new StringBuilder();
        paramj.append("CreateIntent created the following intent: ");
        paramj.append(localIntent1);
        Log.v("FragmentManager", paramj.toString());
      }
      return localIntent1;
    }
    
    public final Object c(int paramInt, Intent paramIntent)
    {
      return new d.a(paramInt, paramIntent);
    }
  }
  
  public static final class k
    implements Parcelable
  {
    public static final Parcelable.Creator<k> CREATOR = new a();
    public String a;
    public int b;
    
    public k(Parcel paramParcel)
    {
      a = paramParcel.readString();
      b = paramParcel.readInt();
    }
    
    public k(String paramString, int paramInt)
    {
      a = paramString;
      b = paramInt;
    }
    
    public final int describeContents()
    {
      return 0;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeString(a);
      paramParcel.writeInt(b);
    }
    
    public final class a
      implements Parcelable.Creator<y.k>
    {
      public final Object createFromParcel(Parcel paramParcel)
      {
        return new y.k(paramParcel);
      }
      
      public final Object[] newArray(int paramInt)
      {
        return new y.k[paramInt];
      }
    }
  }
  
  public static abstract interface l
  {
    public abstract void a();
    
    public abstract void b();
    
    public abstract void c();
    
    public abstract void d();
    
    public abstract void onBackStackChanged();
  }
  
  public static abstract interface m
  {
    public abstract boolean a(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1);
  }
  
  public final class n
    implements y.m
  {
    public final int a;
    public final int b;
    
    public n(int paramInt)
    {
      a = paramInt;
      b = 1;
    }
    
    public final boolean a(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1)
    {
      i locali = z;
      if ((locali != null) && (a < 0) && (locali.getChildFragmentManager().R())) {
        return false;
      }
      return S(paramArrayList, paramArrayList1, a, b);
    }
  }
  
  public final class o
    implements y.m
  {
    public o() {}
    
    public final boolean a(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1)
    {
      Object localObject1 = y.this;
      Object localObject2 = d;
      localObject2 = (a)((ArrayList)localObject2).get(((ArrayList)localObject2).size() - 1);
      h = ((a)localObject2);
      Object localObject3 = a.iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject2 = nextb;
        if (localObject2 != null) {
          mTransitioning = true;
        }
      }
      boolean bool = ((y)localObject1).S(paramArrayList, paramArrayList1, -1, 0);
      getClass();
      if ((!n.isEmpty()) && (paramArrayList.size() > 0))
      {
        ((Boolean)paramArrayList1.get(paramArrayList.size() - 1)).booleanValue();
        paramArrayList1 = new LinkedHashSet();
        localObject1 = paramArrayList.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          paramArrayList = (a)((Iterator)localObject1).next();
          getClass();
          paramArrayList1.addAll(y.G(paramArrayList));
        }
        paramArrayList = n.iterator();
        while (paramArrayList.hasNext())
        {
          localObject2 = (y.l)paramArrayList.next();
          localObject1 = paramArrayList1.iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject3 = (i)((Iterator)localObject1).next();
            ((y.l)localObject2).b();
          }
        }
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     x0.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */