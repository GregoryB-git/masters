package p2;

import o2.a;
import p1.j.b;
import u1.c;

public final class b
  extends j.b
{
  public final a a;
  
  public b(m0 paramm0)
  {
    a = paramm0;
  }
  
  public final void a(c paramc)
  {
    paramc.h();
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
      localStringBuilder.append(a.a() - a0.a);
      localStringBuilder.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
      paramc.m(localStringBuilder.toString());
      paramc.G();
      return;
    }
    finally
    {
      paramc.X();
    }
  }
}

/* Location:
 * Qualified Name:     p2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */