package pc;

import b.a0;
import d2.h0;
import dc.p;
import dc.q;
import ec.i;
import ec.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n7.w;
import nc.i2;
import p2.m0;
import sc.o;
import sc.t;

public class b<E>
  implements f<E>
{
  public static final AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");
  public static final AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");
  public static final AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");
  public static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");
  public static final AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");
  public static final AtomicReferenceFieldUpdater p = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");
  public static final AtomicReferenceFieldUpdater q = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");
  public static final AtomicReferenceFieldUpdater r = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");
  public static final AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
  private volatile Object _closeCause;
  public final int a;
  public final dc.l<E, rb.h> b;
  private volatile long bufferEnd;
  private volatile Object bufferEndSegment;
  private volatile Object closeHandler;
  private volatile long completedExpandBuffersAndPauseFlag;
  private volatile Object receiveSegment;
  private volatile long receivers;
  private volatile Object sendSegment;
  private volatile long sendersAndCloseStatus;
  
  public b(int paramInt, dc.l<? super E, rb.h> paraml)
  {
    a = paramInt;
    b = paraml;
    int i;
    if (paramInt >= 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      k localk = e.a;
      long l;
      if (paramInt != 0)
      {
        if (paramInt != Integer.MAX_VALUE) {
          l = paramInt;
        } else {
          l = Long.MAX_VALUE;
        }
      }
      else {
        l = 0L;
      }
      bufferEnd = l;
      completedExpandBuffersAndPauseFlag = p();
      localk = new k(0L, null, this, 3);
      sendSegment = localk;
      receiveSegment = localk;
      if (z())
      {
        localk = e.a;
        i.c(localk, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
      }
      bufferEndSegment = localk;
      if (paraml != null) {
        new c(this);
      }
      _closeCause = e.s;
      return;
    }
    throw new IllegalArgumentException(a0.j.h("Invalid channel capacity: ", paramInt, ", should be >=0").toString());
  }
  
  public static <E> Object D(b<E> paramb, ub.e<? super j<? extends E>> parame)
  {
    if ((parame instanceof d))
    {
      locald = (d)parame;
      i = c;
      if ((i & 0x80000000) != 0)
      {
        c = (i + Integer.MIN_VALUE);
        break label45;
      }
    }
    d locald = new d(paramb, parame);
    label45:
    parame = a;
    vb.a locala = vb.a.a;
    int i = c;
    Object localObject;
    if (i != 0)
    {
      if (i == 1)
      {
        rb.f.b(parame);
        paramb = a;
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      rb.f.b(parame);
      parame = (k)p.get(paramb);
      long l1;
      for (;;)
      {
        if (paramb.x())
        {
          paramb = new j.a(paramb.q());
          break label279;
        }
        l1 = d.getAndIncrement(paramb);
        i = e.b;
        long l2 = l1 / i;
        i = (int)(l1 % i);
        if (c != l2)
        {
          localObject = paramb.o(l2, parame);
          if (localObject == null) {
            continue;
          }
          parame = (ub.e<? super j<? extends E>>)localObject;
        }
        localObject = paramb.I(parame, i, l1, null);
        if (localObject == e.m) {
          break label281;
        }
        if (localObject != e.o) {
          break;
        }
        if (l1 < paramb.u()) {
          parame.a();
        }
      }
      if (localObject != e.n) {
        break label272;
      }
      c = 1;
      parame = paramb.E(parame, i, l1, locald);
      paramb = parame;
      if (parame == locala) {
        return locala;
      }
    }
    break label279;
    label272:
    parame.a();
    paramb = (b<E>)localObject;
    label279:
    return paramb;
    label281:
    throw new IllegalStateException("unexpected".toString());
  }
  
  public static final k b(b paramb, long paramLong, k paramk)
  {
    paramb.getClass();
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = o;
    Object localObject1 = e.a;
    Object localObject2 = d.a;
    localObject1 = m0.F(paramk, paramLong, (p)localObject2);
    long l1;
    long l2;
    int j;
    if (!m0.R(localObject1))
    {
      t localt1 = m0.L(localObject1);
      for (;;)
      {
        t localt2 = (t)localAtomicReferenceFieldUpdater.get(paramb);
        l1 = c;
        l2 = c;
        int i = 0;
        j = 0;
        if (l1 < l2)
        {
          if (!localt1.i())
          {
            j = i;
            break label152;
          }
          do
          {
            if (localAtomicReferenceFieldUpdater.compareAndSet(paramb, localt2, localt1))
            {
              j = 1;
              break;
            }
          } while (localAtomicReferenceFieldUpdater.get(paramb) == localt2);
          if (j == 0) {
            break label160;
          }
          if (localt2.e()) {
            localt2.d();
          }
        }
        j = 1;
        label152:
        if (j == 0) {
          break;
        }
        break label176;
        label160:
        if (localt1.e()) {
          localt1.d();
        }
      }
    }
    label176:
    boolean bool = m0.R(localObject1);
    localAtomicReferenceFieldUpdater = null;
    if (bool)
    {
      paramb.m();
      localObject1 = localAtomicReferenceFieldUpdater;
      if (c * e.b >= paramb.s()) {
        break label354;
      }
    }
    else
    {
      paramk = (k)m0.L(localObject1);
      l1 = c;
      if (l1 <= paramLong) {
        break label351;
      }
      paramLong = e.b;
      localObject1 = c;
      long l3;
      long l4;
      do
      {
        l3 = ((AtomicLongFieldUpdater)localObject1).get(paramb);
        l2 = 0xFFFFFFFFFFFFFFF & l3;
        if (l2 >= l1 * paramLong) {
          break;
        }
        j = (int)(l3 >> 60);
        localObject2 = e.a;
        l4 = j;
      } while (!c.compareAndSet(paramb, l3, (l4 << 60) + l2));
      localObject1 = localAtomicReferenceFieldUpdater;
      if (c * e.b >= paramb.s()) {
        break label354;
      }
    }
    paramk.a();
    localObject1 = localAtomicReferenceFieldUpdater;
    break label354;
    label351:
    localObject1 = paramk;
    label354:
    return (k)localObject1;
  }
  
  public static final int e(b paramb, k paramk, int paramInt, Object paramObject1, long paramLong, Object paramObject2, boolean paramBoolean)
  {
    paramb.getClass();
    paramk.n(paramInt, paramObject1);
    int i = 1;
    if (!paramBoolean)
    {
      Object localObject = paramk.k(paramInt);
      if (localObject == null)
      {
        if (paramb.f(paramLong))
        {
          if (paramk.j(paramInt, null, e.d)) {
            return i;
          }
        }
        else
        {
          if (paramObject2 == null) {
            return 3;
          }
          if (paramk.j(paramInt, null, paramObject2)) {
            return 2;
          }
        }
      }
      else if ((localObject instanceof i2))
      {
        paramk.n(paramInt, null);
        if (paramb.G(localObject, paramObject1))
        {
          paramk.o(paramInt, e.i);
          return 0;
        }
        paramb = e.k;
        if (f.getAndSet(paramInt * 2 + 1, paramb) != paramb) {
          paramk.l(paramInt, true);
        }
        return 5;
      }
    }
    paramInt = paramb.J(paramk, paramInt, paramObject1, paramLong, paramObject2, paramBoolean);
    return paramInt;
  }
  
  public final void A(long paramLong, k<E> paramk)
  {
    Object localObject;
    for (;;)
    {
      localObject = paramk;
      if (c >= paramLong) {
        break;
      }
      localObject = (k)paramk.b();
      if (localObject == null)
      {
        localObject = paramk;
        break;
      }
      paramk = (k<E>)localObject;
    }
    while (((t)localObject).c())
    {
      paramk = (k)((sc.c)localObject).b();
      if (paramk == null) {
        break;
      }
      localObject = paramk;
    }
    paramk = q;
    for (;;)
    {
      t localt = (t)paramk.get(this);
      paramLong = c;
      long l = c;
      int i = 0;
      int j = 0;
      if (paramLong < l)
      {
        if (!((t)localObject).i())
        {
          j = i;
          break label175;
        }
        do
        {
          if (paramk.compareAndSet(this, localt, localObject))
          {
            j = 1;
            break;
          }
        } while (paramk.get(this) == localt);
        if (j == 0) {
          break label181;
        }
        if (localt.e()) {
          localt.d();
        }
      }
      j = 1;
      label175:
      if (j == 0) {
        break;
      }
      return;
      label181:
      if (((t)localObject).e()) {
        ((sc.c)localObject).d();
      }
    }
  }
  
  public final Object B(E paramE, ub.e<? super rb.h> parame)
  {
    parame = new nc.l(1, m0.P(parame));
    parame.t();
    dc.l locall = b;
    if (locall != null)
    {
      paramE = m0.k(locall, paramE, null);
      if (paramE != null)
      {
        x6.b.e(paramE, t());
        break label53;
      }
    }
    paramE = t();
    label53:
    parame.resumeWith(rb.f.a(paramE));
    paramE = parame.s();
    if (paramE == vb.a.a) {
      return paramE;
    }
    return rb.h.a;
  }
  
  public final Object C(ub.e<? super E> parame)
  {
    Object localObject1 = (k)p.get(this);
    while (!x())
    {
      long l1 = d.getAndIncrement(this);
      long l2 = e.b;
      long l3 = l1 / l2;
      i = (int)(l1 % l2);
      Object localObject2 = localObject1;
      if (c != l3)
      {
        localObject2 = o(l3, (k)localObject1);
        if (localObject2 == null) {
          break;
        }
      }
      else
      {
        localObject1 = I((k)localObject2, i, l1, null);
        Object localObject3 = e.m;
        if (localObject1 != localObject3)
        {
          Object localObject4 = e.o;
          if (localObject1 == localObject4)
          {
            localObject1 = localObject2;
            if (l1 < u())
            {
              ((sc.c)localObject2).a();
              localObject1 = localObject2;
            }
          }
          else
          {
            if (localObject1 == e.n)
            {
              nc.l locall = a0.u(m0.P(parame));
              try
              {
                localObject1 = I((k)localObject2, i, l1, locall);
                if (localObject1 == localObject3)
                {
                  locall.c((t)localObject2, i);
                }
                else
                {
                  localObject3 = null;
                  if (localObject1 == localObject4)
                  {
                    if (l1 < u()) {
                      ((sc.c)localObject2).a();
                    }
                    localObject2 = (k)p.get(this);
                    for (;;)
                    {
                      if (x())
                      {
                        locall.resumeWith(rb.f.a(r()));
                        break label472;
                      }
                      l2 = d.getAndIncrement(this);
                      l3 = e.b;
                      l1 = l2 / l3;
                      i = (int)(l2 % l3);
                      parame = (ub.e<? super E>)localObject2;
                      if (c != l1)
                      {
                        parame = o(l1, (k)localObject2);
                        if (parame == null) {}
                      }
                      else
                      {
                        localObject2 = I(parame, i, l2, locall);
                        if (localObject2 == e.m)
                        {
                          locall.c(parame, i);
                          break label472;
                        }
                        if (localObject2 != e.o) {
                          break;
                        }
                        localObject2 = parame;
                        if (l2 < u())
                        {
                          parame.a();
                          localObject2 = parame;
                        }
                      }
                    }
                    if (localObject2 != e.n)
                    {
                      parame.a();
                      localObject4 = b;
                      parame = (ub.e<? super E>)localObject2;
                      if (localObject4 == null) {
                        break label464;
                      }
                      parame = e;
                      localObject1 = new sc/o;
                      ((o)localObject1).<init>((dc.l)localObject4, localObject2, parame);
                      parame = (ub.e<? super E>)localObject2;
                      localObject2 = localObject1;
                    }
                    else
                    {
                      parame = new java/lang/IllegalStateException;
                      parame.<init>("unexpected".toString());
                      throw parame;
                    }
                  }
                  else
                  {
                    ((sc.c)localObject2).a();
                    localObject2 = b;
                    parame = (ub.e<? super E>)localObject1;
                    if (localObject2 == null) {
                      break label464;
                    }
                    localObject2 = new o((dc.l)localObject2, localObject1, e);
                    parame = (ub.e<? super E>)localObject1;
                  }
                  localObject3 = localObject2;
                  label464:
                  locall.b(parame, (dc.l)localObject3);
                }
                label472:
                parame = locall.s();
                localObject2 = vb.a.a;
              }
              finally
              {
                locall.A();
              }
            }
            ((sc.c)localObject2).a();
            parame = (ub.e<? super E>)localObject1;
            return parame;
          }
        }
        else
        {
          throw new IllegalStateException("unexpected".toString());
        }
      }
    }
    parame = r();
    int i = sc.u.a;
    throw parame;
  }
  
  public final Object E(k<E> paramk, int paramInt, long paramLong, ub.e<? super j<? extends E>> parame)
  {
    if ((parame instanceof e))
    {
      localObject1 = (e)parame;
      i = c;
      if ((i & 0x80000000) != 0)
      {
        c = (i + Integer.MIN_VALUE);
        parame = (ub.e<? super j<? extends E>>)localObject1;
        break label59;
      }
    }
    parame = new e(this, parame);
    label59:
    Object localObject1 = a;
    vb.a locala = vb.a.a;
    int i = c;
    nc.l locall;
    if (i != 0)
    {
      if (i == 1)
      {
        rb.f.b(localObject1);
        paramk = (k<E>)localObject1;
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      rb.f.b(localObject1);
      parame.getClass();
      parame.getClass();
      c = 1;
      locall = a0.u(m0.P(parame));
    }
    try
    {
      Object localObject2 = new pc/r;
      ((r)localObject2).<init>(locall);
      Object localObject3 = I(paramk, paramInt, paramLong, localObject2);
      if (localObject3 == e.m)
      {
        ((r)localObject2).c(paramk, paramInt);
      }
      else
      {
        parame = e.o;
        localObject1 = null;
        dc.l locall1;
        if (localObject3 == parame)
        {
          if (paramLong < u()) {
            paramk.a();
          }
          parame = (k)p.get(this);
          for (;;)
          {
            if (x())
            {
              parame = q();
              paramk = new pc/j$a;
              paramk.<init>(parame);
              parame = new pc/j;
              parame.<init>(paramk);
              locall.resumeWith(parame);
              break label533;
            }
            long l1 = d.getAndIncrement(this);
            paramLong = e.b;
            long l2 = l1 / paramLong;
            paramInt = (int)(l1 % paramLong);
            paramk = parame;
            if (c != l2)
            {
              paramk = o(l2, parame);
              if (paramk == null) {}
            }
            else
            {
              localObject3 = I(paramk, paramInt, l1, localObject2);
              if (localObject3 == e.m)
              {
                ((r)localObject2).c(paramk, paramInt);
                break label533;
              }
              if (localObject3 != e.o) {
                break;
              }
              parame = paramk;
              if (l1 < u())
              {
                paramk.a();
                parame = paramk;
              }
            }
          }
          if (localObject3 != e.n)
          {
            paramk.a();
            localObject2 = new pc/j;
            ((j)localObject2).<init>(localObject3);
            locall1 = b;
            paramk = (k<E>)localObject1;
            parame = (ub.e<? super j<? extends E>>)localObject2;
            if (locall1 != null)
            {
              parame = e;
              paramk = new sc/o;
              paramk.<init>(locall1, localObject3, parame);
              parame = (ub.e<? super j<? extends E>>)localObject2;
            }
          }
          else
          {
            paramk = new java/lang/IllegalStateException;
            paramk.<init>("unexpected".toString());
            throw paramk;
          }
        }
        else
        {
          paramk.a();
          localObject2 = new pc/j;
          ((j)localObject2).<init>(localObject3);
          locall1 = b;
          paramk = (k<E>)localObject1;
          parame = (ub.e<? super j<? extends E>>)localObject2;
          if (locall1 != null)
          {
            paramk = new o(locall1, localObject3, e);
            parame = (ub.e<? super j<? extends E>>)localObject2;
          }
        }
        locall.b(parame, paramk);
      }
      label533:
      parame = locall.s();
      paramk = vb.a.a;
      paramk = parame;
      if (parame == locala) {
        return locala;
      }
      return a;
    }
    finally
    {
      locall.A();
    }
  }
  
  public final void F(i2 parami2, boolean paramBoolean)
  {
    if (!(parami2 instanceof b))
    {
      if ((parami2 instanceof nc.k))
      {
        localObject = (ub.e)parami2;
        if (paramBoolean) {
          parami2 = r();
        } else {
          parami2 = t();
        }
        parami2 = rb.f.a(parami2);
      }
      else
      {
        if (!(parami2 instanceof r)) {
          break label88;
        }
        localObject = a;
        parami2 = new j(new j.a(q()));
      }
      ((ub.e)localObject).resumeWith(parami2);
      break label174;
      label88:
      if ((parami2 instanceof a))
      {
        parami2 = (a)parami2;
        localObject = b;
        i.b(localObject);
        b = null;
        a = e.l;
        parami2 = c.q();
        if (parami2 == null) {
          parami2 = Boolean.FALSE;
        } else {
          parami2 = rb.f.a(parami2);
        }
        ((nc.l)localObject).resumeWith(parami2);
      }
      else
      {
        if (!(parami2 instanceof uc.f)) {
          break label175;
        }
        ((uc.f)parami2).e(this, e.l);
      }
      label174:
      return;
      label175:
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Unexpected waiter: ");
      ((StringBuilder)localObject).append(parami2);
      throw new IllegalStateException(((StringBuilder)localObject).toString().toString());
    }
    ((b)parami2).getClass();
    throw null;
  }
  
  public final boolean G(Object paramObject, E paramE)
  {
    boolean bool;
    if ((paramObject instanceof uc.f))
    {
      bool = ((uc.f)paramObject).e(this, paramE);
    }
    else
    {
      bool = paramObject instanceof r;
      Object localObject1 = null;
      Object localObject2 = null;
      Object localObject3 = null;
      dc.l locall;
      if (bool)
      {
        i.c(paramObject, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
        localObject1 = a;
        localObject2 = new j(paramE);
        locall = b;
        paramObject = localObject3;
        if (locall != null) {
          paramObject = new o(locall, paramE, e);
        }
        bool = e.a((nc.k)localObject1, localObject2, (dc.l)paramObject);
      }
      else if ((paramObject instanceof a))
      {
        i.c(paramObject, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        paramObject = (a)paramObject;
        localObject3 = b;
        i.b(localObject3);
        b = null;
        a = paramE;
        localObject2 = Boolean.TRUE;
        locall = c.b;
        paramObject = localObject1;
        if (locall != null) {
          paramObject = new o(locall, paramE, e);
        }
        bool = e.a((nc.k)localObject3, localObject2, (dc.l)paramObject);
      }
      else
      {
        if (!(paramObject instanceof nc.k)) {
          break label260;
        }
        i.c(paramObject, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
        localObject1 = (nc.k)paramObject;
        localObject3 = b;
        paramObject = localObject2;
        if (localObject3 != null) {
          paramObject = new o((dc.l)localObject3, paramE, ((ub.e)localObject1).getContext());
        }
        bool = e.a((nc.k)localObject1, paramE, (dc.l)paramObject);
      }
    }
    return bool;
    label260:
    paramE = new StringBuilder();
    paramE.append("Unexpected receiver type: ");
    paramE.append(paramObject);
    throw new IllegalStateException(paramE.toString().toString());
  }
  
  public final boolean H(Object paramObject, k<E> paramk, int paramInt)
  {
    boolean bool1 = paramObject instanceof nc.k;
    boolean bool2 = true;
    if (bool1)
    {
      i.c(paramObject, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
      bool2 = e.a((nc.k)paramObject, rb.h.a, null);
    }
    else
    {
      if (!(paramObject instanceof uc.f)) {
        break label179;
      }
      i.c(paramObject, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
      uc.e locale = (uc.e)paramObject;
      paramObject = rb.h.a;
      int i = locale.i(this);
      paramObject = uc.g.a;
      int j = 3;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2) {
            if (i == 3)
            {
              j = 4;
            }
            else
            {
              paramObject = new StringBuilder();
              ((StringBuilder)paramObject).append("Unexpected internal result: ");
              ((StringBuilder)paramObject).append(i);
              throw new IllegalStateException(((StringBuilder)paramObject).toString().toString());
            }
          }
        }
        else {
          j = 2;
        }
      }
      else {
        j = 1;
      }
      if (j == 2) {
        paramk.n(paramInt, null);
      }
      if (j != 1) {
        bool2 = false;
      }
    }
    return bool2;
    label179:
    if ((paramObject instanceof b))
    {
      ((b)paramObject).getClass();
      e.a(null, Boolean.TRUE, null);
      throw null;
    }
    paramk = new StringBuilder();
    paramk.append("Unexpected waiter: ");
    paramk.append(paramObject);
    throw new IllegalStateException(paramk.toString().toString());
  }
  
  public final Object I(k<E> paramk, int paramInt, long paramLong, Object paramObject)
  {
    Object localObject = paramk.k(paramInt);
    if (localObject == null)
    {
      if (paramLong >= (c.get(this) & 0xFFFFFFFFFFFFFFF))
      {
        if (paramObject == null) {
          return e.n;
        }
        if (paramk.j(paramInt, localObject, paramObject))
        {
          n();
          return e.m;
        }
      }
    }
    else if ((localObject == e.d) && (paramk.j(paramInt, localObject, e.i)))
    {
      n();
      return paramk.m(paramInt);
    }
    label272:
    label301:
    label305:
    label312:
    do
    {
      do
      {
        h0 localh0;
        do
        {
          do
          {
            localObject = paramk.k(paramInt);
            if ((localObject == null) || (localObject == e.e)) {
              break label272;
            }
            if (localObject != e.d) {
              break;
            }
          } while (!paramk.j(paramInt, localObject, e.i));
          break;
          localh0 = e.j;
          if ((localObject == localh0) || (localObject == e.h)) {
            break label305;
          }
          if (localObject == e.l) {
            break label301;
          }
        } while ((localObject == e.g) || (!paramk.j(paramInt, localObject, e.f)));
        boolean bool = localObject instanceof u;
        paramObject = localObject;
        if (bool) {
          paramObject = a;
        }
        if (H(paramObject, paramk, paramInt))
        {
          paramk.o(paramInt, e.i);
          n();
          return paramk.m(paramInt);
        }
        paramk.o(paramInt, localh0);
        paramk.l(paramInt, false);
        if (!bool) {
          break label305;
        }
        break;
        if (paramLong >= (c.get(this) & 0xFFFFFFFFFFFFFFF)) {
          break label312;
        }
      } while (!paramk.j(paramInt, localObject, e.h));
      n();
      paramk = e.o;
      break;
      if (paramObject == null)
      {
        paramk = e.n;
        break;
      }
    } while (!paramk.j(paramInt, localObject, paramObject));
    n();
    paramk = e.m;
    return paramk;
  }
  
  public final int J(k<E> paramk, int paramInt, E paramE, long paramLong, Object paramObject, boolean paramBoolean)
  {
    Object localObject;
    int i;
    label88:
    do
    {
      do
      {
        do
        {
          do
          {
            localObject = paramk.k(paramInt);
            i = 0;
            if (localObject != null) {
              break label88;
            }
            if ((!f(paramLong)) || (paramBoolean)) {
              break;
            }
          } while (!paramk.j(paramInt, null, e.d));
          return 1;
          if (!paramBoolean) {
            break;
          }
        } while (!paramk.j(paramInt, null, e.j));
        paramk.l(paramInt, false);
        return 4;
        if (paramObject == null) {
          return 3;
        }
      } while (!paramk.j(paramInt, null, paramObject));
      return 2;
      if (localObject != e.e) {
        break;
      }
    } while (!paramk.j(paramInt, localObject, e.d));
    return 1;
    h0 localh0 = e.k;
    if (localObject == localh0)
    {
      paramk.n(paramInt, null);
      return 5;
    }
    if (localObject == e.h)
    {
      paramk.n(paramInt, null);
      return 5;
    }
    if (localObject == e.l)
    {
      paramk.n(paramInt, null);
      m();
      return 4;
    }
    paramk.n(paramInt, null);
    paramObject = localObject;
    if ((localObject instanceof u)) {
      paramObject = a;
    }
    if (G(paramObject, paramE))
    {
      paramk.o(paramInt, e.i);
      paramInt = i;
    }
    else
    {
      if (f.getAndSet(paramInt * 2 + 1, localh0) != localh0) {
        paramk.l(paramInt, true);
      }
      paramInt = 5;
    }
    return paramInt;
  }
  
  public final void K(long paramLong)
  {
    if (z()) {
      return;
    }
    while (p() <= paramLong) {}
    int i = e.c;
    for (int j = 0; j < i; j++)
    {
      paramLong = p();
      if ((paramLong == (f.get(this) & 0x3FFFFFFFFFFFFFFF)) && (paramLong == p())) {
        return;
      }
    }
    AtomicLongFieldUpdater localAtomicLongFieldUpdater = f;
    do
    {
      paramLong = localAtomicLongFieldUpdater.get(this);
    } while (!localAtomicLongFieldUpdater.compareAndSet(this, paramLong, 4611686018427387904L + (paramLong & 0x3FFFFFFFFFFFFFFF)));
    for (;;)
    {
      paramLong = p();
      localAtomicLongFieldUpdater = f;
      long l1 = localAtomicLongFieldUpdater.get(this);
      long l2 = l1 & 0x3FFFFFFFFFFFFFFF;
      if ((l1 & 0x4000000000000000) != 0L) {
        j = 1;
      } else {
        j = 0;
      }
      if ((paramLong == l2) && (paramLong == p()))
      {
        do
        {
          paramLong = localAtomicLongFieldUpdater.get(this);
        } while (!localAtomicLongFieldUpdater.compareAndSet(this, paramLong, 0L + (paramLong & 0x3FFFFFFFFFFFFFFF)));
        return;
      }
      if (j == 0) {
        localAtomicLongFieldUpdater.compareAndSet(this, l1, l2 + 4611686018427387904L);
      }
    }
  }
  
  public final void a(o.b paramb)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater1 = s;
    do
    {
      if (localAtomicReferenceFieldUpdater1.compareAndSet(this, null, paramb))
      {
        i = 1;
        break;
      }
    } while (localAtomicReferenceFieldUpdater1.get(this) == null);
    int i = 0;
    if (i != 0) {
      return;
    }
    localAtomicReferenceFieldUpdater1 = s;
    Object localObject;
    do
    {
      localObject = localAtomicReferenceFieldUpdater1.get(this);
      h0 localh0 = e.q;
      if (localObject != localh0) {
        break;
      }
      AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater2 = s;
      localObject = e.r;
      do
      {
        if (localAtomicReferenceFieldUpdater2.compareAndSet(this, localh0, localObject))
        {
          i = 1;
          break;
        }
      } while (localAtomicReferenceFieldUpdater2.get(this) == localh0);
      i = 0;
    } while (i == 0);
    paramb.invoke(q());
    return;
    if (localObject == e.r) {
      throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
    }
    paramb = new StringBuilder();
    paramb.append("Another handler is already registered: ");
    paramb.append(localObject);
    throw new IllegalStateException(paramb.toString().toString());
  }
  
  public final Object c()
  {
    long l1 = d.get(this);
    long l2 = c.get(this);
    if (w(l2, true)) {
      return new j.a(q());
    }
    if (l1 >= (l2 & 0xFFFFFFFFFFFFFFF)) {
      return j.b;
    }
    h0 localh0 = e.k;
    Object localObject1 = (k)p.get(this);
    Object localObject2;
    for (;;)
    {
      if (x())
      {
        localObject1 = new j.a(q());
        break label272;
      }
      long l3 = d.getAndIncrement(this);
      l2 = e.b;
      l1 = l3 / l2;
      int i = (int)(l3 % l2);
      if (c != l1)
      {
        localObject2 = o(l1, (k)localObject1);
        if (localObject2 == null) {
          continue;
        }
        localObject1 = localObject2;
      }
      localObject2 = I((k)localObject1, i, l3, localh0);
      if (localObject2 == e.m)
      {
        if ((localh0 instanceof i2)) {
          localObject2 = (i2)localh0;
        } else {
          localObject2 = null;
        }
        if (localObject2 != null) {
          ((i2)localObject2).c((t)localObject1, i);
        }
        K(l3);
        ((t)localObject1).h();
        localObject1 = j.b;
        break label272;
      }
      if (localObject2 != e.o) {
        break;
      }
      if (l3 < u()) {
        ((sc.c)localObject1).a();
      }
    }
    if (localObject2 != e.n)
    {
      ((sc.c)localObject1).a();
      localObject1 = localObject2;
      label272:
      return localObject1;
    }
    throw new IllegalStateException("unexpected".toString());
  }
  
  public final void cancel(CancellationException paramCancellationException)
  {
    CancellationException localCancellationException = paramCancellationException;
    if (paramCancellationException == null) {
      localCancellationException = new CancellationException("Channel was cancelled");
    }
    g(localCancellationException, true);
  }
  
  public final boolean d(Throwable paramThrowable)
  {
    return g(paramThrowable, false);
  }
  
  public final boolean f(long paramLong)
  {
    boolean bool;
    if ((paramLong >= p()) && (paramLong >= s() + a)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final boolean g(Throwable paramThrowable, boolean paramBoolean)
  {
    long l1;
    if (paramBoolean)
    {
      localObject1 = c;
      do
      {
        l1 = ((AtomicLongFieldUpdater)localObject1).get(this);
        if ((int)(l1 >> 60) != 0) {
          break;
        }
        localObject2 = e.a;
      } while (!((AtomicLongFieldUpdater)localObject1).compareAndSet(this, l1, (1 << 60) + (l1 & 0xFFFFFFFFFFFFFFF)));
    }
    Object localObject1 = r;
    Object localObject2 = e.s;
    do
    {
      if (((AtomicReferenceFieldUpdater)localObject1).compareAndSet(this, localObject2, paramThrowable))
      {
        bool = true;
        break;
      }
    } while (((AtomicReferenceFieldUpdater)localObject1).get(this) == localObject2);
    boolean bool = false;
    int i;
    if (paramBoolean)
    {
      localObject2 = c;
      do
      {
        l1 = ((AtomicLongFieldUpdater)localObject2).get(this);
        paramThrowable = e.a;
      } while (!((AtomicLongFieldUpdater)localObject2).compareAndSet(this, l1, (3 << 60) + (l1 & 0xFFFFFFFFFFFFFFF)));
    }
    else
    {
      paramThrowable = c;
      long l2;
      do
      {
        l2 = paramThrowable.get(this);
        i = (int)(l2 >> 60);
        if (i != 0)
        {
          if (i != 1) {
            break;
          }
          l1 = l2 & 0xFFFFFFFFFFFFFFF;
          localObject2 = e.a;
          i = 3;
        }
        else
        {
          l1 = l2 & 0xFFFFFFFFFFFFFFF;
          i = 2;
          localObject2 = e.a;
        }
      } while (!paramThrowable.compareAndSet(this, l2, (i << 60) + l1));
    }
    m();
    if (bool)
    {
      localObject2 = s;
      do
      {
        localObject1 = ((AtomicReferenceFieldUpdater)localObject2).get(this);
        if (localObject1 == null) {
          paramThrowable = e.q;
        } else {
          paramThrowable = e.r;
        }
        do
        {
          if (((AtomicReferenceFieldUpdater)localObject2).compareAndSet(this, localObject1, paramThrowable))
          {
            i = 1;
            break;
          }
        } while (((AtomicReferenceFieldUpdater)localObject2).get(this) == localObject1);
        i = 0;
      } while (i == 0);
      if (localObject1 != null)
      {
        v.a(1, localObject1);
        ((dc.l)localObject1).invoke(q());
      }
    }
    return bool;
  }
  
  public final k<E> h(long paramLong)
  {
    Object localObject1 = q.get(this);
    Object localObject2 = (k)o.get(this);
    Object localObject3 = localObject1;
    if (c > c) {
      localObject3 = localObject2;
    }
    localObject1 = (k)p.get(this);
    localObject2 = localObject3;
    if (c > c) {
      localObject2 = localObject1;
    }
    localObject3 = (sc.c)localObject2;
    for (;;)
    {
      localObject3.getClass();
      Object localObject4 = sc.c.a;
      localObject2 = ((AtomicReferenceFieldUpdater)localObject4).get(localObject3);
      localObject1 = m0.C;
      Object localObject5 = null;
      int i;
      if (localObject2 != localObject1)
      {
        localObject2 = (sc.c)localObject2;
        if (localObject2 == null)
        {
          do
          {
            if (((AtomicReferenceFieldUpdater)localObject4).compareAndSet(localObject3, null, localObject1))
            {
              i = 1;
              break;
            }
          } while (((AtomicReferenceFieldUpdater)localObject4).get(localObject3) == null);
          i = 0;
          if (i == 0) {
            continue;
          }
        }
      }
      else
      {
        localObject2 = (k)localObject3;
        if (y())
        {
          localObject3 = localObject2;
          do
          {
            for (i = e.b - 1; -1 < i; i--)
            {
              l = c * e.b + i;
              if (l < s()) {
                break label307;
              }
              do
              {
                localObject1 = ((k)localObject3).k(i);
                if ((localObject1 != null) && (localObject1 != e.e))
                {
                  if (localObject1 != e.d) {
                    break;
                  }
                  break label312;
                }
              } while (!((k)localObject3).j(i, localObject1, e.l));
              ((t)localObject3).h();
            }
            localObject1 = (k)sc.c.b.get(localObject3);
            localObject3 = localObject1;
          } while (localObject1 != null);
          label307:
          long l = -1L;
          label312:
          if (l != -1L) {
            j(l);
          }
        }
        localObject1 = localObject2;
        localObject3 = localObject5;
        for (;;)
        {
          localObject5 = localObject3;
          if (localObject1 == null) {
            break;
          }
          i = e.b - 1;
          while (-1 < i)
          {
            localObject5 = localObject3;
            if (c * e.b + i < paramLong) {
              break label534;
            }
            label485:
            do
            {
              do
              {
                do
                {
                  localObject4 = ((k)localObject1).k(i);
                  if ((localObject4 == null) || (localObject4 == e.e)) {
                    break label485;
                  }
                  if (!(localObject4 instanceof u)) {
                    break;
                  }
                } while (!((k)localObject1).j(i, localObject4, e.l));
                localObject5 = a;
                break;
                localObject5 = localObject3;
                if (!(localObject4 instanceof i2)) {
                  break label507;
                }
              } while (!((k)localObject1).j(i, localObject4, e.l));
              localObject5 = localObject4;
              localObject5 = a0.z(localObject3, localObject5);
              ((k)localObject1).l(i, true);
              break;
            } while (!((k)localObject1).j(i, localObject4, e.l));
            ((t)localObject1).h();
            localObject5 = localObject3;
            label507:
            i--;
            localObject3 = localObject5;
          }
          localObject1 = (k)sc.c.b.get(localObject1);
        }
        label534:
        if (localObject5 != null) {
          if (!(localObject5 instanceof ArrayList))
          {
            F((i2)localObject5, true);
          }
          else
          {
            localObject3 = (ArrayList)localObject5;
            for (i = ((ArrayList)localObject3).size() - 1; -1 < i; i--) {
              F((i2)((ArrayList)localObject3).get(i), true);
            }
          }
        }
        return (k<E>)localObject2;
      }
      localObject3 = localObject2;
    }
  }
  
  public final Object i(rc.j paramj)
  {
    return D(this, paramj);
  }
  
  public final h<E> iterator()
  {
    return new a();
  }
  
  public final void j(long paramLong)
  {
    Object localObject1 = (k)p.get(this);
    for (;;)
    {
      Object localObject2 = d;
      long l1 = ((AtomicLongFieldUpdater)localObject2).get(this);
      if (paramLong < Math.max(a + l1, p())) {
        return;
      }
      if (((AtomicLongFieldUpdater)localObject2).compareAndSet(this, l1, l1 + 1L))
      {
        long l2 = e.b;
        long l3 = l1 / l2;
        int i = (int)(l1 % l2);
        localObject2 = localObject1;
        if (c != l3)
        {
          localObject2 = o(l3, (k)localObject1);
          if (localObject2 == null) {}
        }
        else
        {
          Object localObject3 = I((k)localObject2, i, l1, null);
          if (localObject3 == e.o)
          {
            localObject1 = localObject2;
            if (l1 < u())
            {
              ((sc.c)localObject2).a();
              localObject1 = localObject2;
            }
          }
          else
          {
            ((sc.c)localObject2).a();
            dc.l locall = b;
            localObject1 = localObject2;
            if (locall != null)
            {
              localObject1 = m0.k(locall, localObject3, null);
              if (localObject1 != null) {
                break;
              }
              localObject1 = localObject2;
            }
          }
        }
      }
    }
    throw ((Throwable)localObject1);
  }
  
  public Object k(E paramE, ub.e<? super rb.h> parame)
  {
    Object localObject1 = (k)o.get(this);
    long l1;
    long l2;
    boolean bool;
    int i;
    long l3;
    int j;
    Object localObject2;
    int k;
    for (;;)
    {
      l1 = c.getAndIncrement(this);
      l2 = l1 & 0xFFFFFFFFFFFFFFF;
      bool = w(l1, false);
      i = e.b;
      l1 = i;
      l3 = l2 / l1;
      j = (int)(l2 % l1);
      localObject2 = localObject1;
      if (c != l3)
      {
        localObject2 = b(this, l3, (k)localObject1);
        if (localObject2 == null)
        {
          if (!bool) {
            continue;
          }
          paramE = B(paramE, parame);
          if (paramE != vb.a.a) {
            break label673;
          }
          return paramE;
        }
      }
      k = e(this, (k)localObject2, j, paramE, l2, null, bool);
      if (k == 0) {
        break label668;
      }
      if (k == 1) {
        break label673;
      }
      if (k == 2) {
        break label641;
      }
      if (k == 3) {
        break label211;
      }
      if (k == 4) {
        break;
      }
      if (k != 5)
      {
        localObject1 = localObject2;
      }
      else
      {
        ((sc.c)localObject2).a();
        localObject1 = localObject2;
      }
    }
    if (l2 < s()) {
      ((sc.c)localObject2).a();
    }
    paramE = B(paramE, parame);
    if (paramE == vb.a.a)
    {
      return paramE;
      label211:
      nc.l locall = a0.u(m0.P(parame));
      try
      {
        k = e(this, (k)localObject2, j, paramE, l2, locall, false);
        localObject1 = localObject2;
        if (k == 0) {
          break label592;
        }
        if (k == 1) {
          break label589;
        }
        if (k == 2) {
          break label574;
        }
        if (k == 4) {
          break label521;
        }
        if (k == 5)
        {
          ((sc.c)localObject2).a();
          localObject2 = (k)o.get(this);
          for (;;)
          {
            l1 = c.getAndIncrement(this);
            l2 = l1 & 0xFFFFFFFFFFFFFFF;
            bool = w(l1, false);
            k = e.b;
            l1 = k;
            l3 = l2 / l1;
            j = (int)(l2 % l1);
            parame = (ub.e<? super rb.h>)localObject2;
            if (c != l3)
            {
              parame = b(this, l3, (k)localObject2);
              if (parame == null)
              {
                if (!bool) {
                  continue;
                }
                break label481;
              }
            }
            i = e(this, parame, j, paramE, l2, locall, bool);
            localObject1 = parame;
            if (i == 0) {
              break label592;
            }
            if (i == 1) {
              break label589;
            }
            if (i == 2) {
              break label472;
            }
            if (i == 3) {
              break label457;
            }
            if (i == 4) {
              break;
            }
            if (i != 5)
            {
              localObject2 = parame;
            }
            else
            {
              parame.a();
              localObject2 = parame;
            }
          }
          if (l2 < s())
          {
            parame.a();
            break label481;
            label457:
            paramE = new java/lang/IllegalStateException;
            paramE.<init>("unexpected".toString());
            throw paramE;
            label472:
            if (!bool) {
              break label484;
            }
            parame.h();
          }
          label481:
          break label536;
          try
          {
            label484:
            locall.c(parame, j + k);
          }
          finally {}
        }
        paramE = new java/lang/IllegalStateException;
      }
      finally
      {
        break label634;
      }
      paramE.<init>("unexpected".toString());
      throw paramE;
      label521:
      if (l2 < s()) {
        ((sc.c)localObject2).a();
      }
      label536:
      parame = locall;
      localObject2 = b;
      if (localObject2 != null) {
        m0.j((dc.l)localObject2, paramE, e);
      }
      parame.resumeWith(rb.f.a(t()));
      break label604;
      label574:
      locall.c((t)localObject2, j + i);
      break label604;
      label589:
      break label596;
      label592:
      ((sc.c)localObject1).a();
      label596:
      locall.resumeWith(rb.h.a);
      label604:
      paramE = locall.s();
      parame = vb.a.a;
      if (paramE != parame) {
        paramE = rb.h.a;
      }
      if (paramE == parame)
      {
        return paramE;
        label634:
        locall.A();
        throw paramE;
        label641:
        if (bool)
        {
          ((t)localObject2).h();
          paramE = B(paramE, parame);
          if (paramE == vb.a.a)
          {
            return paramE;
            label668:
            ((sc.c)localObject2).a();
          }
        }
      }
    }
    label673:
    paramE = rb.h.a;
    return paramE;
  }
  
  public Object l(E paramE)
  {
    long l1 = c.get(this);
    boolean bool1;
    if (w(l1, false)) {
      bool1 = false;
    } else {
      bool1 = f(l1 & 0xFFFFFFFFFFFFFFF) ^ true;
    }
    if (bool1) {
      return j.b;
    }
    h0 localh0 = e.j;
    Object localObject = (k)o.get(this);
    boolean bool2;
    int i;
    int j;
    for (;;)
    {
      long l2 = c.getAndIncrement(this);
      l1 = l2 & 0xFFFFFFFFFFFFFFF;
      bool2 = w(l2, false);
      i = e.b;
      long l3 = i;
      l2 = l1 / l3;
      j = (int)(l1 % l3);
      if (c != l2)
      {
        k localk = b(this, l2, (k)localObject);
        if (localk == null)
        {
          if (!bool2) {
            continue;
          }
          return new j.a(t());
        }
        localObject = localk;
      }
      int k = e(this, (k)localObject, j, paramE, l1, localh0, bool2);
      if (k == 0) {
        break label343;
      }
      if (k == 1) {
        break label348;
      }
      if (k == 2) {
        break label267;
      }
      if (k == 3) {
        break label254;
      }
      if (k == 4) {
        break;
      }
      if (k == 5) {
        ((sc.c)localObject).a();
      }
    }
    if (l1 < s()) {
      ((sc.c)localObject).a();
    }
    return new j.a(t());
    label254:
    throw new IllegalStateException("unexpected".toString());
    label267:
    if (bool2)
    {
      ((t)localObject).h();
      paramE = new j.a(t());
    }
    else
    {
      if ((localh0 instanceof i2)) {
        paramE = (i2)localh0;
      } else {
        paramE = null;
      }
      if (paramE != null) {
        paramE.c((t)localObject, j + i);
      }
      ((t)localObject).h();
      return j.b;
      label343:
      ((sc.c)localObject).a();
      label348:
      paramE = rb.h.a;
    }
    return paramE;
  }
  
  public final boolean m()
  {
    return w(c.get(this), false);
  }
  
  public final void n()
  {
    if (z()) {
      return;
    }
    Object localObject1 = (k)q.get(this);
    int i;
    label218:
    label229:
    label245:
    label347:
    label569:
    label698:
    label701:
    do
    {
      long l1;
      Object localObject2;
      do
      {
        l1 = e.getAndIncrement(this);
        long l2 = l1 / e.b;
        if (u() <= l1)
        {
          if ((c < l2) && (((sc.c)localObject1).b() != null)) {
            A(l2, (k)localObject1);
          }
          v(1L);
          return;
        }
        localObject2 = localObject1;
        if (c == l2) {
          break;
        }
        AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = q;
        Object localObject3 = d.a;
        Object localObject4 = m0.F((t)localObject1, l2, (p)localObject3);
        if (!m0.R(localObject4))
        {
          localObject2 = m0.L(localObject4);
          for (;;)
          {
            t localt = (t)localAtomicReferenceFieldUpdater.get(this);
            if (c < c)
            {
              if (!((t)localObject2).i())
              {
                i = 0;
                break label218;
              }
              do
              {
                if (localAtomicReferenceFieldUpdater.compareAndSet(this, localt, localObject2))
                {
                  i = 1;
                  break;
                }
              } while (localAtomicReferenceFieldUpdater.get(this) == localt);
              i = 0;
              if (i == 0) {
                break label229;
              }
              if (localt.e()) {
                localt.d();
              }
            }
            i = 1;
            if (i != 0) {
              break label245;
            }
            break;
            if (((t)localObject2).e()) {
              ((sc.c)localObject2).d();
            }
          }
        }
        if (m0.R(localObject4))
        {
          m();
          A(l2, (k)localObject1);
        }
        else
        {
          localObject3 = (k)m0.L(localObject4);
          long l3 = c;
          localObject2 = localObject3;
          if (l3 <= l2) {
            continue;
          }
          localObject2 = e;
          l2 = e.b;
          if (((AtomicLongFieldUpdater)localObject2).compareAndSet(this, l1 + 1L, l2 * l3))
          {
            v(c * l2 - l1);
            break label347;
          }
        }
        v(1L);
        localObject2 = null;
      } while (localObject2 == null);
      i = (int)(l1 % e.b);
      localObject1 = ((k)localObject2).k(i);
      if (((localObject1 instanceof i2)) && (l1 >= d.get(this)) && (((k)localObject2).j(i, localObject1, e.g)))
      {
        if (H(localObject1, (k)localObject2, i))
        {
          ((k)localObject2).o(i, e.d);
        }
        else
        {
          ((k)localObject2).o(i, e.j);
          ((k)localObject2).l(i, false);
          i = 0;
          break label701;
        }
      }
      else
      {
        do
        {
          do
          {
            do
            {
              do
              {
                localObject1 = ((k)localObject2).k(i);
                if (!(localObject1 instanceof i2)) {
                  break label569;
                }
                if (l1 >= d.get(this)) {
                  break;
                }
              } while (!((k)localObject2).j(i, localObject1, new u((i2)localObject1)));
              break label698;
            } while (!((k)localObject2).j(i, localObject1, e.g));
            if (H(localObject1, (k)localObject2, i))
            {
              ((k)localObject2).o(i, e.d);
              break label698;
            }
            ((k)localObject2).o(i, e.j);
            ((k)localObject2).l(i, false);
            if (localObject1 == e.j)
            {
              i = 0;
              break label701;
            }
            if (localObject1 != null) {
              break;
            }
          } while (!((k)localObject2).j(i, localObject1, e.e));
          break;
          if ((localObject1 == e.d) || (localObject1 == e.h) || (localObject1 == e.i) || (localObject1 == e.k) || (localObject1 == e.l)) {
            break;
          }
        } while (localObject1 == e.f);
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("Unexpected cell state: ");
        ((StringBuilder)localObject2).append(localObject1);
        throw new IllegalStateException(((StringBuilder)localObject2).toString().toString());
      }
      i = 1;
      v(1L);
      localObject1 = localObject2;
    } while (i == 0);
  }
  
  public final k<E> o(long paramLong, k<E> paramk)
  {
    Object localObject1 = p;
    Object localObject2 = e.a;
    d locald = d.a;
    Object localObject3 = m0.F(paramk, paramLong, locald);
    int i;
    if (!m0.R(localObject3))
    {
      t localt = m0.L(localObject3);
      for (;;)
      {
        localObject2 = (t)((AtomicReferenceFieldUpdater)localObject1).get(this);
        if (c < c)
        {
          if (!localt.i())
          {
            i = 0;
            break label135;
          }
          do
          {
            if (((AtomicReferenceFieldUpdater)localObject1).compareAndSet(this, localObject2, localt))
            {
              i = 1;
              break;
            }
          } while (((AtomicReferenceFieldUpdater)localObject1).get(this) == localObject2);
          i = 0;
          if (i == 0) {
            break label143;
          }
          if (((t)localObject2).e()) {
            ((sc.c)localObject2).d();
          }
        }
        i = 1;
        label135:
        if (i == 0) {
          break;
        }
        break label159;
        label143:
        if (localt.e()) {
          localt.d();
        }
      }
    }
    label159:
    boolean bool = m0.R(localObject3);
    localObject2 = null;
    if (bool)
    {
      m();
      localObject1 = localObject2;
      if (c * e.b >= u()) {
        break label428;
      }
    }
    else
    {
      paramk = (k)m0.L(localObject3);
      if ((!z()) && (paramLong <= p() / e.b))
      {
        localObject1 = q;
        for (;;)
        {
          localObject3 = (t)((AtomicReferenceFieldUpdater)localObject1).get(this);
          if ((c >= c) || (!paramk.i())) {
            break;
          }
          do
          {
            if (((AtomicReferenceFieldUpdater)localObject1).compareAndSet(this, localObject3, paramk))
            {
              i = 1;
              break;
            }
          } while (((AtomicReferenceFieldUpdater)localObject1).get(this) == localObject3);
          i = 0;
          if (i != 0)
          {
            if (!((t)localObject3).e()) {
              break;
            }
            ((sc.c)localObject3).d();
            break;
          }
          if (paramk.e()) {
            paramk.d();
          }
        }
      }
      long l = c;
      if (l <= paramLong) {
        break label425;
      }
      paramLong = l * e.b;
      localObject1 = d;
      do
      {
        l = ((AtomicLongFieldUpdater)localObject1).get(this);
      } while ((l < paramLong) && (!d.compareAndSet(this, l, paramLong)));
      localObject1 = localObject2;
      if (c * e.b >= u()) {
        break label428;
      }
    }
    paramk.a();
    localObject1 = localObject2;
    break label428;
    label425:
    localObject1 = paramk;
    label428:
    return (k<E>)localObject1;
  }
  
  public final long p()
  {
    return e.get(this);
  }
  
  public final Throwable q()
  {
    return (Throwable)r.get(this);
  }
  
  public final Throwable r()
  {
    Throwable localThrowable = q();
    Object localObject = localThrowable;
    if (localThrowable == null) {
      localObject = new l();
    }
    return (Throwable)localObject;
  }
  
  public final long s()
  {
    return d.get(this);
  }
  
  public final Throwable t()
  {
    Throwable localThrowable = q();
    Object localObject = localThrowable;
    if (localThrowable == null) {
      localObject = new m("Channel was closed");
    }
    return (Throwable)localObject;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = (int)(c.get(this) >> 60);
    if (i != 2)
    {
      if (i != 3) {
        break label50;
      }
      localObject1 = "cancelled,";
    }
    else
    {
      localObject1 = "closed,";
    }
    localStringBuilder.append((String)localObject1);
    label50:
    Object localObject1 = f.l("capacity=");
    ((StringBuilder)localObject1).append(a);
    ((StringBuilder)localObject1).append(',');
    localStringBuilder.append(((StringBuilder)localObject1).toString());
    localStringBuilder.append("data=[");
    Object localObject2 = va.a.g(new k[] { p.get(this), o.get(this), q.get(this) });
    localObject1 = new ArrayList();
    localObject2 = ((Iterable)localObject2).iterator();
    Object localObject3;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = ((Iterator)localObject2).next();
      if ((k)localObject3 != e.a) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        ((ArrayList)localObject1).add(localObject3);
      }
    }
    Object localObject4 = ((ArrayList)localObject1).iterator();
    if (((Iterator)localObject4).hasNext())
    {
      localObject2 = ((Iterator)localObject4).next();
      long l2;
      if (!((Iterator)localObject4).hasNext())
      {
        localObject1 = localObject2;
      }
      else
      {
        l1 = c;
        do
        {
          localObject3 = ((Iterator)localObject4).next();
          l2 = c;
          localObject1 = localObject2;
          l3 = l1;
          if (l1 > l2)
          {
            localObject1 = localObject3;
            l3 = l2;
          }
          localObject2 = localObject1;
          l1 = l3;
        } while (((Iterator)localObject4).hasNext());
      }
      localObject2 = (k)localObject1;
      long l3 = s();
      long l1 = u();
      for (;;)
      {
        i = 0;
        int j = e.b;
        while (i < j)
        {
          l2 = c * e.b + i;
          boolean bool1 = l2 < l1;
          if ((!bool1) && (l2 >= l3)) {
            break label866;
          }
          localObject4 = ((k)localObject2).k(i);
          localObject3 = f.get(i * 2);
          boolean bool2;
          if ((localObject4 instanceof nc.k))
          {
            bool2 = l2 < l3;
            if ((bool2) && (!bool1)) {
              localObject1 = "receive";
            } else if ((bool1) && (!bool2)) {
              localObject1 = "send";
            } else {
              localObject1 = "cont";
            }
          }
          else if ((localObject4 instanceof uc.f))
          {
            bool2 = l2 < l3;
            if ((bool2) && (!bool1)) {
              localObject1 = "onReceive";
            } else if ((bool1) && (!bool2)) {
              localObject1 = "onSend";
            } else {
              localObject1 = "select";
            }
          }
          else if ((localObject4 instanceof r))
          {
            localObject1 = "receiveCatching";
          }
          else if ((localObject4 instanceof b))
          {
            localObject1 = "sendBroadcast";
          }
          else if ((localObject4 instanceof u))
          {
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append("EB(");
            ((StringBuilder)localObject1).append(localObject4);
            ((StringBuilder)localObject1).append(')');
            localObject1 = ((StringBuilder)localObject1).toString();
          }
          else
          {
            boolean bool3;
            if (i.a(localObject4, e.f)) {
              bool3 = true;
            } else {
              bool3 = i.a(localObject4, e.g);
            }
            if (bool3)
            {
              localObject1 = "resuming_sender";
            }
            else
            {
              if (localObject4 == null) {
                bool3 = true;
              } else {
                bool3 = i.a(localObject4, e.e);
              }
              if (bool3) {
                bool3 = true;
              } else {
                bool3 = i.a(localObject4, e.i);
              }
              if (bool3) {
                bool3 = true;
              } else {
                bool3 = i.a(localObject4, e.h);
              }
              if (bool3) {
                bool3 = true;
              } else {
                bool3 = i.a(localObject4, e.k);
              }
              if (bool3) {
                bool3 = true;
              } else {
                bool3 = i.a(localObject4, e.j);
              }
              if (bool3) {
                bool3 = true;
              } else {
                bool3 = i.a(localObject4, e.l);
              }
              if (bool3) {
                break label845;
              }
              localObject1 = localObject4.toString();
            }
          }
          localObject4 = new java/lang/StringBuilder;
          if (localObject3 != null)
          {
            ((StringBuilder)localObject4).<init>();
            ((StringBuilder)localObject4).append('(');
            ((StringBuilder)localObject4).append((String)localObject1);
            ((StringBuilder)localObject4).append(',');
            ((StringBuilder)localObject4).append(localObject3);
            ((StringBuilder)localObject4).append("),");
          }
          else
          {
            ((StringBuilder)localObject4).<init>();
            ((StringBuilder)localObject4).append((String)localObject1);
            ((StringBuilder)localObject4).append(',');
          }
          localStringBuilder.append(((StringBuilder)localObject4).toString());
          label845:
          i++;
        }
        localObject2 = (k)((sc.c)localObject2).b();
        if (localObject2 == null)
        {
          label866:
          if (localStringBuilder.length() == 0) {
            i = 1;
          } else {
            i = 0;
          }
          if (i == 0)
          {
            if (localStringBuilder.charAt(lc.k.p0(localStringBuilder)) == ',') {
              i.d(localStringBuilder.deleteCharAt(localStringBuilder.length() - 1), "this.deleteCharAt(index)");
            }
            localStringBuilder.append("]");
            return localStringBuilder.toString();
          }
          throw new NoSuchElementException("Char sequence is empty.");
        }
      }
    }
    throw new NoSuchElementException();
  }
  
  public final long u()
  {
    return c.get(this) & 0xFFFFFFFFFFFFFFF;
  }
  
  public final void v(long paramLong)
  {
    int i;
    if ((f.addAndGet(this, paramLong) & 0x4000000000000000) != 0L) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      do
      {
        if ((f.get(this) & 0x4000000000000000) != 0L) {
          i = 1;
        } else {
          i = 0;
        }
      } while (i != 0);
    }
  }
  
  public final boolean w(long paramLong, boolean paramBoolean)
  {
    int i = (int)(paramLong >> 60);
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i != 0)
    {
      bool2 = bool1;
      if (i != 1)
      {
        Object localObject3;
        Object localObject4;
        Object localObject5;
        if (i != 2)
        {
          if (i == 3)
          {
            Object localObject1 = h(paramLong & 0xFFFFFFFFFFFFFFF);
            dc.l locall = b;
            Object localObject2 = null;
            localObject3 = localObject2;
            label350:
            label369:
            label389:
            k localk;
            do
            {
              i = e.b - 1;
              localObject4 = localObject3;
              localObject5 = localObject2;
              while (-1 < i)
              {
                paramLong = c * e.b + i;
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        localObject3 = ((k)localObject1).k(i);
                        if (localObject3 == e.i) {
                          break label428;
                        }
                        if (localObject3 != e.d) {
                          break;
                        }
                        if (paramLong < s()) {
                          break label428;
                        }
                      } while (!((k)localObject1).j(i, localObject3, e.l));
                      localObject3 = localObject5;
                      localObject2 = localObject4;
                      if (locall == null) {
                        break label350;
                      }
                      localObject3 = m0.k(locall, f.get(i * 2), (w)localObject5);
                      localObject2 = localObject4;
                      break label350;
                      if ((localObject3 == e.e) || (localObject3 == null)) {
                        break label369;
                      }
                      if (((localObject3 instanceof i2)) || ((localObject3 instanceof u))) {
                        break;
                      }
                      localObject2 = e.g;
                      if ((localObject3 == localObject2) || (localObject3 == e.f)) {
                        break label428;
                      }
                    } while (localObject3 == localObject2);
                    break label389;
                    if (paramLong < s()) {
                      break label428;
                    }
                    if ((localObject3 instanceof u)) {
                      localObject2 = a;
                    } else {
                      localObject2 = (i2)localObject3;
                    }
                  } while (!((k)localObject1).j(i, localObject3, e.l));
                  localObject3 = localObject5;
                  if (locall != null) {
                    localObject3 = m0.k(locall, f.get(i * 2), (w)localObject5);
                  }
                  localObject2 = a0.z(localObject4, localObject2);
                  ((k)localObject1).n(i, null);
                  localObject5 = localObject3;
                  localObject4 = localObject2;
                  break;
                } while (!((k)localObject1).j(i, localObject3, e.l));
                ((t)localObject1).h();
                i--;
              }
              localk = (k)sc.c.b.get(localObject1);
              localObject2 = localObject5;
              localObject3 = localObject4;
              localObject1 = localk;
            } while (localk != null);
            label428:
            if (localObject4 != null) {
              if (!(localObject4 instanceof ArrayList))
              {
                F((i2)localObject4, false);
              }
              else
              {
                localObject4 = (ArrayList)localObject4;
                for (i = ((ArrayList)localObject4).size() - 1; -1 < i; i--) {
                  F((i2)((ArrayList)localObject4).get(i), false);
                }
              }
            }
            if (localObject5 != null) {
              throw ((Throwable)localObject5);
            }
          }
          else
          {
            throw new IllegalStateException(f.h("unexpected close status: ", i).toString());
          }
        }
        else
        {
          h(paramLong & 0xFFFFFFFFFFFFFFF);
          if (paramBoolean) {
            for (;;)
            {
              localObject3 = p;
              localObject4 = (k)((AtomicReferenceFieldUpdater)localObject3).get(this);
              long l1 = s();
              long l2;
              if (u() > l1)
              {
                l2 = e.b;
                paramLong = l1 / l2;
                localObject5 = localObject4;
                if (c != paramLong)
                {
                  localObject4 = o(paramLong, (k)localObject4);
                  localObject5 = localObject4;
                  if (localObject4 == null) {
                    if (getc >= paramLong) {
                      continue;
                    }
                  }
                }
              }
              else
              {
                i = 0;
                break label804;
              }
              ((sc.c)localObject5).a();
              i = (int)(l1 % l2);
              do
              {
                localObject4 = ((k)localObject5).k(i);
                if ((localObject4 != null) && (localObject4 != e.e))
                {
                  if ((localObject4 != e.d) && ((localObject4 == e.j) || (localObject4 == e.l) || (localObject4 == e.i) || (localObject4 == e.h) || ((localObject4 != e.g) && ((localObject4 == e.f) || (l1 != s()))))) {
                    break;
                  }
                  i = 1;
                  break label796;
                }
              } while (!((k)localObject5).j(i, localObject4, e.h));
              n();
              i = 0;
              label796:
              if (i != 0)
              {
                i = 1;
                label804:
                bool2 = bool1;
                if (i != 0) {
                  break label836;
                }
                break;
              }
              d.compareAndSet(this, l1, l1 + 1L);
            }
          }
        }
        bool2 = true;
      }
    }
    label836:
    return bool2;
  }
  
  public final boolean x()
  {
    return w(c.get(this), true);
  }
  
  public boolean y()
  {
    return false;
  }
  
  public final boolean z()
  {
    long l = p();
    boolean bool;
    if ((l != 0L) && (l != Long.MAX_VALUE)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final class a
    implements h<E>, i2
  {
    public Object a = e.p;
    public nc.l<? super Boolean> b;
    
    public final Object a(qc.g paramg)
    {
      Object localObject1 = c;
      Object localObject2 = (k)b.p.get(localObject1);
      int i;
      long l1;
      long l2;
      long l3;
      Object localObject3;
      Object localObject4;
      h0 localh0;
      for (;;)
      {
        if (((b)localObject1).x())
        {
          a = e.l;
          paramg = c.q();
          if (paramg == null)
          {
            paramg = Boolean.FALSE;
            break label627;
          }
          i = sc.u.a;
          throw paramg;
        }
        l1 = b.d.getAndIncrement(localObject1);
        l2 = e.b;
        l3 = l1 / l2;
        i = (int)(l1 % l2);
        if (c != l3)
        {
          localObject3 = ((b)localObject1).o(l3, (k)localObject2);
          if (localObject3 == null) {
            continue;
          }
          localObject2 = localObject3;
        }
        localObject4 = ((b)localObject1).I((k)localObject2, i, l1, null);
        localObject3 = e.m;
        if (localObject4 == localObject3) {
          break label629;
        }
        localh0 = e.o;
        if (localObject4 != localh0) {
          break;
        }
        if (l1 < ((b)localObject1).u()) {
          ((sc.c)localObject2).a();
        }
      }
      if (localObject4 == e.n)
      {
        Object localObject5 = c;
        localObject4 = a0.u(m0.P(paramg));
        try
        {
          b = ((nc.l)localObject4);
          Object localObject6 = ((b)localObject5).I((k)localObject2, i, l1, this);
          if (localObject6 == localObject3)
          {
            c((t)localObject2, i);
          }
          else
          {
            localObject3 = null;
            if (localObject6 == localh0)
            {
              if (l1 < ((b)localObject5).u()) {
                ((sc.c)localObject2).a();
              }
              paramg = (k)b.p.get(localObject5);
              for (;;)
              {
                if (((b)localObject5).x())
                {
                  localObject2 = b;
                  i.b(localObject2);
                  b = null;
                  a = e.l;
                  paramg = c.q();
                  if (paramg == null) {
                    paramg = Boolean.FALSE;
                  } else {
                    paramg = rb.f.a(paramg);
                  }
                  ((nc.l)localObject2).resumeWith(paramg);
                  break label593;
                }
                l3 = b.d.getAndIncrement(localObject5);
                l1 = e.b;
                l2 = l3 / l1;
                i = (int)(l3 % l1);
                if (c != l2)
                {
                  localObject2 = ((b)localObject5).o(l2, paramg);
                  if (localObject2 == null) {
                    continue;
                  }
                  paramg = (qc.g)localObject2;
                }
                localObject6 = ((b)localObject5).I(paramg, i, l3, this);
                if (localObject6 == e.m)
                {
                  c(paramg, i);
                  break label593;
                }
                if (localObject6 != e.o) {
                  break;
                }
                if (l3 < ((b)localObject5).u()) {
                  paramg.a();
                }
              }
              if (localObject6 != e.n)
              {
                paramg.a();
                a = localObject6;
                b = null;
                localObject1 = Boolean.TRUE;
                localObject5 = b;
                localObject2 = localObject1;
                paramg = (qc.g)localObject3;
                if (localObject5 != null)
                {
                  localObject2 = e;
                  paramg = new sc/o;
                  paramg.<init>((dc.l)localObject5, localObject6, (ub.h)localObject2);
                  localObject2 = localObject1;
                }
              }
              else
              {
                paramg = new java/lang/IllegalStateException;
                paramg.<init>("unexpected".toString());
                throw paramg;
              }
            }
            else
            {
              ((sc.c)localObject2).a();
              a = localObject6;
              b = null;
              localObject1 = Boolean.TRUE;
              localObject5 = b;
              localObject2 = localObject1;
              paramg = (qc.g)localObject3;
              if (localObject5 != null)
              {
                paramg = new o((dc.l)localObject5, localObject6, e);
                localObject2 = localObject1;
              }
            }
            ((nc.l)localObject4).b(localObject2, paramg);
          }
          label593:
          paramg = ((nc.l)localObject4).s();
          localObject2 = vb.a.a;
          return paramg;
        }
        finally
        {
          ((nc.l)localObject4).A();
        }
      }
      ((sc.c)localObject2).a();
      a = localObject4;
      paramg = Boolean.TRUE;
      label627:
      return paramg;
      label629:
      throw new IllegalStateException("unreachable".toString());
    }
    
    public final void c(t<?> paramt, int paramInt)
    {
      nc.l locall = b;
      if (locall != null) {
        locall.c(paramt, paramInt);
      }
    }
    
    public final E next()
    {
      Object localObject1 = a;
      Object localObject2 = e.p;
      int i;
      if (localObject1 != localObject2) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        a = localObject2;
        if (localObject1 != e.l) {
          return (E)localObject1;
        }
        localObject2 = c;
        localObject1 = b.c;
        localObject2 = ((b)localObject2).r();
        i = sc.u.a;
        throw ((Throwable)localObject2);
      }
      throw new IllegalStateException("`hasNext()` has not been invoked".toString());
    }
  }
  
  public static final class b
    implements i2
  {
    public final void c(t<?> paramt, int paramInt)
    {
      throw null;
    }
  }
  
  public static final class c
    extends ec.j
    implements q<uc.f<?>, Object, Object, dc.l<? super Throwable, ? extends rb.h>>
  {
    public c(b<E> paramb)
    {
      super();
    }
    
    public final Object f(qc.f paramf, Object paramObject1, Object paramObject2)
    {
      paramf = (uc.f)paramf;
      return new c(paramObject2, a, paramf);
    }
  }
  
  @wb.e(c="kotlinx.coroutines.channels.BufferedChannel", f="BufferedChannel.kt", l={739}, m="receiveCatching-JP2dKIU$suspendImpl")
  public static final class d<E>
    extends wb.c
  {
    public int c;
    
    public d(b<E> paramb, ub.e<? super d> parame)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      a = paramObject;
      c |= 0x80000000;
      paramObject = b.D(b, this);
      if (paramObject == vb.a.a) {
        return paramObject;
      }
      return new j(paramObject);
    }
  }
  
  @wb.e(c="kotlinx.coroutines.channels.BufferedChannel", f="BufferedChannel.kt", l={3056}, m="receiveCatchingOnNoWaiterSuspend-GKJJFZk")
  public static final class e
    extends wb.c
  {
    public int c;
    
    public e(b<E> paramb, ub.e<? super e> parame)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      a = paramObject;
      c |= 0x80000000;
      b localb = b;
      paramObject = b.c;
      paramObject = localb.E(null, 0, 0L, this);
      if (paramObject == vb.a.a) {
        return paramObject;
      }
      return new j(paramObject);
    }
  }
}

/* Location:
 * Qualified Name:     pc.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */