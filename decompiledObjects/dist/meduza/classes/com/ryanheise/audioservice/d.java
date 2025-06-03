package com.ryanheise.audioservice;

import android.os.Bundle;
import g1.c.i;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.Map;

public final class d
  implements MethodChannel.Result
{
  public d(c.i parami) {}
  
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
    paramObject = (Map)((Map)paramObject).get("mediaItem");
    if (paramObject != null)
    {
      paramObject = b.a((Map)paramObject);
      a.f(paramObject);
    }
    else
    {
      a.f(null);
    }
  }
}

/* Location:
 * Qualified Name:     com.ryanheise.audioservice.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */