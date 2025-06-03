package com.ryanheise.audioservice;

import E5.k.d;
import a0.d.l;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class a$c$a
  implements k.d
{
  public a$c$a(a.c paramc, d.l paraml) {}
  
  public void a(Object paramObject)
  {
    Object localObject = (List)((Map)paramObject).get("children");
    paramObject = new ArrayList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      ((List)paramObject).add(a.g((Map)((Iterator)localObject).next()));
    }
    a.g(paramObject);
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
 * Qualified Name:     com.ryanheise.audioservice.a.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */