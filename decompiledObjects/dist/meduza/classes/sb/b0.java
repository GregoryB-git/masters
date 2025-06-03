package sb;

import dc.p;
import ec.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kc.d;
import rb.f;
import vb.a;

@wb.e(c="kotlin.collections.SlidingWindowKt$windowedIterator$1", f="SlidingWindow.kt", l={34, 40, 49, 55, 58}, m="invokeSuspend")
public final class b0
  extends wb.h
  implements p<d<? super List<Object>>, ub.e<? super rb.h>, Object>
{
  public Object b;
  public Iterator c;
  public int d;
  public int e;
  
  public b0(int paramInt1, int paramInt2, Iterator<Object> paramIterator, boolean paramBoolean1, boolean paramBoolean2, ub.e<? super b0> parame)
  {
    super(parame);
  }
  
  public final ub.e<rb.h> create(Object paramObject, ub.e<?> parame)
  {
    parame = new b0(o, p, q, r, s, parame);
    f = paramObject;
    return parame;
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((b0)create((d)paramObject1, (ub.e)paramObject2)).invokeSuspend(rb.h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    int i = e;
    int j = 0;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    int k;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2) {
          if (i != 3)
          {
            if (i != 4)
            {
              if (i != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
              }
            }
            else
            {
              localObject1 = (a0)b;
              localObject2 = (d)f;
              f.b(paramObject);
              localObject3 = this;
              paramObject = localObject1;
              break label924;
            }
          }
          else
          {
            localObject1 = c;
            localObject4 = (a0)b;
            localObject2 = (d)f;
            f.b(paramObject);
            localObject3 = this;
            paramObject = localObject4;
            break label785;
          }
        }
        f.b(paramObject);
        break label986;
      }
      k = d;
      localObject2 = c;
      localObject4 = (ArrayList)b;
      localObject1 = (d)f;
      f.b(paramObject);
      localObject3 = this;
      paramObject = localObject4;
    }
    else
    {
      f.b(paramObject);
      paramObject = (d)f;
      k = o;
      i = 1024;
      if (k <= 1024) {
        i = k;
      }
      k = p - k;
      if (k < 0) {
        break label454;
      }
      localObject4 = new ArrayList(i);
      localObject2 = q;
      localObject1 = paramObject;
      localObject3 = this;
      paramObject = localObject4;
      i = j;
    }
    while (((Iterator)localObject2).hasNext())
    {
      localObject4 = ((Iterator)localObject2).next();
      if (i > 0)
      {
        i--;
      }
      else
      {
        ((ArrayList)paramObject).add(localObject4);
        if (((ArrayList)paramObject).size() == o)
        {
          f = localObject1;
          b = paramObject;
          c = ((Iterator)localObject2);
          d = k;
          e = 1;
          ((d)localObject1).a(paramObject, (ub.e)localObject3);
          if (a.a == locala) {
            return locala;
          }
          if (r) {
            ((ArrayList)paramObject).clear();
          } else {
            paramObject = new ArrayList(o);
          }
          i = k;
        }
      }
    }
    if (((((Collection)paramObject).isEmpty() ^ true)) && ((s) || (((ArrayList)paramObject).size() == o)))
    {
      f = null;
      b = null;
      c = null;
      e = 2;
      ((d)localObject1).a(paramObject, (ub.e)localObject3);
      if (a.a == locala)
      {
        return locala;
        label454:
        localObject4 = new a0(new Object[i], 0);
        localObject1 = q;
        localObject3 = this;
        localObject2 = paramObject;
        paramObject = localObject4;
        while (((Iterator)localObject1).hasNext())
        {
          localObject4 = ((Iterator)localObject1).next();
          i = ((a0)paramObject).a();
          k = b;
          if (i == k) {
            i = 1;
          } else {
            i = 0;
          }
          if (i == 0)
          {
            Object localObject5 = a;
            j = c;
            i = d;
            localObject5[((j + i) % k)] = localObject4;
            d = (i + 1);
            i = ((a0)paramObject).a();
            k = b;
            if (i == k) {
              i = 1;
            } else {
              i = 0;
            }
            Object localObject6 = localObject1;
            localObject4 = paramObject;
            Object localObject7 = localObject2;
            localObject5 = localObject3;
            if (i != 0)
            {
              j = d;
              i = o;
              if (j < i)
              {
                k = k + (k >> 1) + 1;
                if (k <= i) {
                  i = k;
                }
                if (c == 0)
                {
                  localObject4 = Arrays.copyOf(a, i);
                  i.d(localObject4, "copyOf(...)");
                }
                else
                {
                  localObject4 = ((a0)paramObject).toArray(new Object[i]);
                }
                localObject4 = new a0((Object[])localObject4, d);
                localObject6 = localObject1;
                localObject7 = localObject2;
                localObject5 = localObject3;
              }
              else
              {
                if (r) {
                  localObject4 = paramObject;
                } else {
                  localObject4 = new ArrayList((Collection)paramObject);
                }
                f = localObject2;
                b = paramObject;
                c = ((Iterator)localObject1);
                e = 3;
                ((d)localObject2).a(localObject4, (ub.e)localObject3);
                if (a.a == locala) {
                  return locala;
                }
                label785:
                ((a0)paramObject).h(p);
                localObject5 = localObject3;
                localObject7 = localObject2;
                localObject4 = paramObject;
                localObject6 = localObject1;
              }
            }
            localObject1 = localObject6;
            paramObject = localObject4;
            localObject2 = localObject7;
            localObject3 = localObject5;
          }
          else
          {
            throw new IllegalStateException("ring buffer is full");
          }
        }
        if (s)
        {
          while (d > p)
          {
            if (r) {
              localObject1 = paramObject;
            } else {
              localObject1 = new ArrayList((Collection)paramObject);
            }
            f = localObject2;
            b = paramObject;
            c = null;
            e = 4;
            ((d)localObject2).a(localObject1, (ub.e)localObject3);
            if (a.a == locala) {
              return locala;
            }
            label924:
            ((a0)paramObject).h(p);
          }
          if ((((b)paramObject).isEmpty() ^ true))
          {
            f = null;
            b = null;
            c = null;
            e = 5;
            ((d)localObject2).a(paramObject, (ub.e)localObject3);
            if (a.a == locala) {
              return locala;
            }
          }
        }
      }
    }
    label986:
    return rb.h.a;
  }
}

/* Location:
 * Qualified Name:     sb.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */