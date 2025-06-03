package p2;

import q1.b;
import u1.c;

public final class j
  extends b
{
  public static final j c = new j();
  
  public j()
  {
    super(3, 4);
  }
  
  public final void a(c paramc)
  {
    paramc.m("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
  }
}

/* Location:
 * Qualified Name:     p2.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */