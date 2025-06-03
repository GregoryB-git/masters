package ma;

import java.util.concurrent.ConcurrentHashMap;
import q0.g;

public final class d1
{
  public static final d1 c = new d1();
  public final k0 a = new k0();
  public final ConcurrentHashMap b = new ConcurrentHashMap();
  
  public final <T> i1<T> a(Class<T> paramClass)
  {
    Object localObject1 = a0.a;
    if (paramClass != null)
    {
      Object localObject2 = (i1)b.get(paramClass);
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = a;
        localObject1.getClass();
        localObject2 = j1.a;
        if (!w.class.isAssignableFrom(paramClass))
        {
          localObject2 = j1.a;
          if ((localObject2 != null) && (!((Class)localObject2).isAssignableFrom(paramClass))) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
          }
        }
        q0 localq0 = a.a(paramClass);
        if (localq0.a())
        {
          if (w.class.isAssignableFrom(paramClass))
          {
            localObject1 = new w0(j1.c, r.a, localq0.b());
          }
          else
          {
            localObject1 = j1.b;
            localObject2 = r.b;
            if (localObject2 == null) {
              break label165;
            }
            localObject1 = new w0((p1)localObject1, (p)localObject2, localq0.b());
          }
          break label399;
          label165:
          throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
        }
        else
        {
          boolean bool = w.class.isAssignableFrom(paramClass);
          int i = 0;
          int j = 0;
          Object localObject3;
          Object localObject4;
          Object localObject5;
          Object localObject6;
          Object localObject7;
          if (bool)
          {
            if (g.c(localq0.c()) != 1) {
              j = 1;
            }
            if (j != 0)
            {
              localObject3 = z0.b;
              localObject4 = i0.b;
              localObject2 = j1.c;
              localObject1 = r.a;
            }
            else
            {
              localObject3 = z0.b;
              localObject4 = i0.b;
              localObject2 = j1.c;
              localObject1 = null;
            }
            localObject5 = p0.b;
            localObject6 = localObject3;
            localObject3 = localObject4;
            localObject4 = localObject2;
            localObject7 = localObject1;
          }
          else
          {
            j = i;
            if (g.c(localq0.c()) != 1) {
              j = 1;
            }
            if (j != 0)
            {
              localObject1 = z0.a;
              localObject2 = i0.a;
              localObject4 = j1.b;
              localObject3 = r.b;
              if (localObject3 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
              }
            }
            else
            {
              localObject1 = z0.a;
              localObject2 = i0.a;
              localObject4 = j1.b;
              localObject3 = null;
            }
            localObject5 = p0.a;
            localObject7 = localObject3;
            localObject3 = localObject2;
            localObject6 = localObject1;
          }
          localObject1 = v0.q;
          if (!(localq0 instanceof f1)) {
            break label421;
          }
          localObject1 = v0.B((f1)localq0, (x0)localObject6, (i0)localObject3, (p1)localObject4, (p)localObject7, (n0)localObject5);
        }
        label399:
        paramClass = (i1)b.putIfAbsent(paramClass, localObject1);
        if (paramClass != null)
        {
          localObject1 = paramClass;
          break label429;
          label421:
          paramClass = (m1)localq0;
          throw null;
        }
      }
      label429:
      return (i1<T>)localObject1;
    }
    throw new NullPointerException("messageType");
  }
}

/* Location:
 * Qualified Name:     ma.d1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */