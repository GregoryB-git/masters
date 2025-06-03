package com.google.android.play.core.integrity;

import android.content.Context;
import m7.h;
import m7.j;
import m7.k;

final class s
{
  private final s a = this;
  private final k b;
  private final k c;
  private final k d;
  private final k e;
  private final k f;
  
  public s(Context paramContext, r paramr)
  {
    if (paramContext != null)
    {
      paramContext = new j(paramContext);
      b = paramContext;
      k localk = h.b(ac.a());
      c = localk;
      paramr = new au(paramContext, l.a());
      d = paramr;
      paramContext = h.b(new al(paramContext, localk, paramr, l.a()));
      e = paramContext;
      f = h.b(new ab(paramContext));
      return;
    }
    throw new NullPointerException("instance cannot be null");
  }
  
  public final IntegrityManager a()
  {
    return (IntegrityManager)f.a();
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */