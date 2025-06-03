package com.google.android.play.core.integrity;

import android.content.Context;
import m7.h;
import m7.j;
import m7.k;

final class w
  implements aw
{
  private final w a = this;
  private final k b;
  private final k c;
  private final k d;
  private final k e;
  private final k f;
  private final k g;
  
  public w(Context paramContext, v paramv)
  {
    if (paramContext != null)
    {
      paramContext = new j(paramContext);
      b = paramContext;
      k localk = h.b(bb.a());
      c = localk;
      paramv = new au(paramContext, n.a());
      d = paramv;
      paramv = h.b(new bp(paramContext, localk, paramv, n.a()));
      e = paramv;
      paramContext = h.b(new bu(paramv));
      f = paramContext;
      g = h.b(new ba(paramv, paramContext));
      return;
    }
    throw new NullPointerException("instance cannot be null");
  }
  
  public final StandardIntegrityManager a()
  {
    return (StandardIntegrityManager)g.a();
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */