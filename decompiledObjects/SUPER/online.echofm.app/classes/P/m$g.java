package P;

import V5.t;
import Z5.k;
import g6.p;

public final class m$g
  extends k
  implements p
{
  public int o;
  
  public m$g(m paramm, X5.d paramd)
  {
    super(2, paramd);
  }
  
  public final X5.d create(Object paramObject, X5.d paramd)
  {
    paramd = new g(q, paramd);
    p = paramObject;
    return paramd;
  }
  
  public final Object invoke(s6.c paramc, X5.d paramd)
  {
    return ((g)create(paramc, paramd)).invokeSuspend(t.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject1 = Y5.b.c();
    int i = o;
    if (i != 0)
    {
      if (i == 1) {
        V5.o.b(paramObject);
      } else {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      V5.o.b(paramObject);
      paramObject = (s6.c)p;
      Object localObject2 = (n)m.f(q).getValue();
      if (!(localObject2 instanceof c)) {
        m.e(q).e(new m.b.a((n)localObject2));
      }
      localObject2 = new b(s6.d.a(m.f(q), new a((n)localObject2, null)));
      o = 1;
      if (s6.d.b((s6.c)paramObject, (s6.b)localObject2, this) == localObject1) {
        return localObject1;
      }
    }
    return t.a;
  }
  
  public static final class a
    extends k
    implements p
  {
    public int o;
    
    public a(n paramn, X5.d paramd)
    {
      super(paramd);
    }
    
    public final Object a(n paramn, X5.d paramd)
    {
      return ((a)create(paramn, paramd)).invokeSuspend(t.a);
    }
    
    public final X5.d create(Object paramObject, X5.d paramd)
    {
      paramd = new a(q, paramd);
      p = paramObject;
      return paramd;
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      Y5.b.c();
      if (o == 0)
      {
        V5.o.b(paramObject);
        n localn = (n)p;
        paramObject = q;
        boolean bool1 = paramObject instanceof c;
        boolean bool2 = false;
        boolean bool3 = bool2;
        if (!bool1) {
          if ((paramObject instanceof h))
          {
            bool3 = bool2;
          }
          else
          {
            bool3 = bool2;
            if (localn == paramObject) {
              bool3 = true;
            }
          }
        }
        return Z5.b.a(bool3);
      }
      throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
  }
  
  public static final class b
    implements s6.b
  {
    public b(s6.b paramb) {}
    
    public Object a(s6.c paramc, X5.d paramd)
    {
      paramc = o.a(new a(paramc), paramd);
      if (paramc == Y5.b.c()) {
        return paramc;
      }
      return t.a;
    }
    
    public static final class a
      implements s6.c
    {
      public a(s6.c paramc) {}
      
      public Object emit(Object paramObject, X5.d paramd)
      {
        if ((paramd instanceof a))
        {
          localObject1 = (a)paramd;
          i = p;
          if ((i & 0x80000000) != 0)
          {
            p = (i + Integer.MIN_VALUE);
            paramd = (X5.d)localObject1;
            break label50;
          }
        }
        paramd = new a(this, paramd);
        label50:
        Object localObject2 = o;
        Object localObject1 = Y5.b.c();
        int i = p;
        if (i != 0)
        {
          if (i == 1) {
            V5.o.b(localObject2);
          } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
        }
        else
        {
          V5.o.b(localObject2);
          localObject2 = o;
          paramObject = (n)paramObject;
          if ((paramObject instanceof j)) {
            break label200;
          }
          if ((paramObject instanceof h)) {
            break label192;
          }
          if (!(paramObject instanceof c)) {
            break label164;
          }
          paramObject = ((c)paramObject).b();
          p = 1;
          if (((s6.c)localObject2).emit(paramObject, paramd) == localObject1) {
            return localObject1;
          }
        }
        return t.a;
        label164:
        if ((paramObject instanceof o)) {
          throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542".toString());
        }
        throw new V5.l();
        label192:
        throw ((h)paramObject).a();
        label200:
        throw ((j)paramObject).a();
      }
      
      public static final class a
        extends Z5.d
      {
        public int p;
        
        public a(m.g.b.a parama, X5.d paramd)
        {
          super();
        }
        
        public final Object invokeSuspend(Object paramObject)
        {
          o = paramObject;
          p |= 0x80000000;
          return q.emit(null, this);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     P.m.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */