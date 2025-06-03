package Q1;

import kotlin.text.i;

public final class c$b
{
  public final c.c b(String paramString)
  {
    if (i.s(paramString, "crash_log_", false, 2, null)) {
      return c.c.r;
    }
    if (i.s(paramString, "shield_log_", false, 2, null)) {
      return c.c.s;
    }
    if (i.s(paramString, "thread_check_log_", false, 2, null)) {
      return c.c.t;
    }
    if (i.s(paramString, "analysis_log_", false, 2, null)) {
      return c.c.p;
    }
    if (i.s(paramString, "anr_log_", false, 2, null)) {
      return c.c.q;
    }
    return c.c.o;
  }
}

/* Location:
 * Qualified Name:     Q1.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */