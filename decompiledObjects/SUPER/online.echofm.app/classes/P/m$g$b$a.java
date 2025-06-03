package P;

import V5.l;
import V5.t;
import Y5.b;

public final class m$g$b$a
  implements s6.c
{
  public m$g$b$a(s6.c paramc) {}
  
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
    Object localObject1 = b.c();
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
    throw new l();
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

/* Location:
 * Qualified Name:     P.m.g.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */