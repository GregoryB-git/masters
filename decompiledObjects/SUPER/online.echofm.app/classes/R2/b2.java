package R2;

public final class b2
  implements Runnable
{
  public b2(Y1 paramY1, int paramInt, String paramString, Object paramObject1, Object paramObject2, Object paramObject3) {}
  
  public final void run()
  {
    l2 locall2 = t.a.F();
    if (!locall2.r())
    {
      t.y(6, "Persisted config not initialized. Not logging error/warn");
      return;
    }
    if (Y1.u(t) == 0)
    {
      char c1;
      if (t.f().T())
      {
        localObject1 = t;
        c1 = 'C';
      }
      for (c2 = c1;; c2 = c1)
      {
        Y1.A((Y1)localObject1, c2);
        break;
        localObject1 = t;
        c1 = 'c';
      }
    }
    if (Y1.D(t) < 0L) {
      Y1.B(t, 82001L);
    }
    char c2 = "01VDIWEA?".charAt(o);
    char c3 = Y1.u(t);
    long l = Y1.D(t);
    Object localObject1 = Y1.x(true, p, q, r, s);
    Object localObject2 = new StringBuilder("2");
    ((StringBuilder)localObject2).append(c2);
    ((StringBuilder)localObject2).append(c3);
    ((StringBuilder)localObject2).append(l);
    ((StringBuilder)localObject2).append(":");
    ((StringBuilder)localObject2).append((String)localObject1);
    localObject2 = ((StringBuilder)localObject2).toString();
    localObject1 = localObject2;
    if (((String)localObject2).length() > 1024) {
      localObject1 = p.substring(0, 1024);
    }
    localObject2 = d;
    if (localObject2 != null) {
      ((p2)localObject2).b((String)localObject1, 1L);
    }
  }
}

/* Location:
 * Qualified Name:     R2.b2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */