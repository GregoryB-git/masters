package com.ryanheise.audioservice;

import android.os.Bundle;
import g1.c.i;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class c
  implements MethodChannel.Result
{
  public c(c.i parami) {}
  
  public final void error(String paramString1, String paramString2, Object paramObject)
  {
    a.e(new Bundle());
  }
  
  public final void notImplemented()
  {
    a.e(new Bundle());
  }
  
  public final void success(Object paramObject)
  {
    Object localObject = (List)((Map)paramObject).get("children");
    paramObject = new ArrayList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      ((ArrayList)paramObject).add(b.a((Map)((Iterator)localObject).next()));
    }
    a.f(paramObject);
  }
}

/* Location:
 * Qualified Name:     com.ryanheise.audioservice.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */