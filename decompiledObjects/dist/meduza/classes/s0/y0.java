package s0;

import java.util.concurrent.ConcurrentHashMap;

public final class y0
{
  public static final y0 c = new y0();
  public final g0 a = new g0();
  public final ConcurrentHashMap b = new ConcurrentHashMap();
  
  public final <T> c1<T> a(Class<T> paramClass)
  {
    Object localObject1 = x.a;
    if (paramClass != null)
    {
      Object localObject2 = (c1)b.get(paramClass);
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = a;
        localObject1.getClass();
        localObject2 = d1.a;
        if (!v.class.isAssignableFrom(paramClass))
        {
          localObject2 = d1.a;
          if ((localObject2 != null) && (!((Class)localObject2).isAssignableFrom(paramClass))) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
          }
        }
        m0 localm0 = a.a(paramClass);
        if (localm0.a())
        {
          if (v.class.isAssignableFrom(paramClass))
          {
            localObject1 = new s0(d1.d, q.a, localm0.b());
          }
          else
          {
            localObject2 = d1.b;
            localObject1 = q.b;
            if (localObject1 == null) {
              break label165;
            }
            localObject1 = new s0((h1)localObject2, (o)localObject1, localm0.b());
          }
          break label389;
          label165:
          throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
        }
        else
        {
          boolean bool = v.class.isAssignableFrom(paramClass);
          int i = 0;
          int j = 0;
          Object localObject3;
          Object localObject4;
          Object localObject5;
          Object localObject6;
          Object localObject7;
          if (bool)
          {
            if (localm0.c() == 1) {
              j = 1;
            }
            if (j != 0)
            {
              localObject3 = v0.b;
              localObject4 = e0.b;
              localObject2 = d1.d;
              localObject1 = q.a;
            }
            else
            {
              localObject3 = v0.b;
              localObject4 = e0.b;
              localObject2 = d1.d;
              localObject1 = null;
            }
            localObject5 = l0.b;
            localObject6 = localObject2;
            localObject7 = localObject1;
          }
          else
          {
            j = i;
            if (localm0.c() == 1) {
              j = 1;
            }
            if (j != 0)
            {
              localObject1 = v0.a;
              localObject2 = e0.a;
              localObject4 = d1.b;
              localObject3 = q.b;
              if (localObject3 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
              }
            }
            else
            {
              localObject1 = v0.a;
              localObject2 = e0.a;
              localObject4 = d1.c;
              localObject3 = null;
            }
            localObject5 = l0.a;
            localObject7 = localObject3;
            localObject6 = localObject4;
            localObject4 = localObject2;
            localObject3 = localObject1;
          }
          localObject1 = r0.r;
          if (!(localm0 instanceof a1)) {
            break label411;
          }
          localObject1 = r0.u((a1)localm0, (t0)localObject3, (e0)localObject4, (h1)localObject6, (o)localObject7, (j0)localObject5);
        }
        label389:
        paramClass = (c1)b.putIfAbsent(paramClass, localObject1);
        if (paramClass != null)
        {
          localObject1 = paramClass;
          break label419;
          label411:
          paramClass = (g1)localm0;
          throw null;
        }
      }
      label419:
      return (c1<T>)localObject1;
    }
    throw new NullPointerException("messageType");
  }
}

/* Location:
 * Qualified Name:     s0.y0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */