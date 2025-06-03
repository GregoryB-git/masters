package com.ryanheise.audioservice;

import E5.k.d;
import a0.d.l;
import android.os.Bundle;
import java.util.Map;

public class a$c$b
  implements k.d
{
  public a$c$b(a.c paramc, d.l paraml) {}
  
  public void a(Object paramObject)
  {
    paramObject = (Map)((Map)paramObject).get("mediaItem");
    if (paramObject != null)
    {
      paramObject = a.g((Map)paramObject);
      a.g(paramObject);
    }
    else
    {
      a.g(null);
    }
  }
  
  public void b(String paramString1, String paramString2, Object paramObject)
  {
    a.f(new Bundle());
  }
  
  public void c()
  {
    a.f(new Bundle());
  }
}

/* Location:
 * Qualified Name:     com.ryanheise.audioservice.a.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */