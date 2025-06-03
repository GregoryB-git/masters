package bb;

import ec.i;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a
  implements MethodChannel.MethodCallHandler
{
  public final d a;
  public final f b;
  
  public a(d paramd, f paramf)
  {
    a = paramd;
    b = paramf;
  }
  
  public final void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    i.e(paramMethodCall, "call");
    i.e(paramResult, "result");
    if ((arguments instanceof Map))
    {
      Object localObject1 = b;
      localObject1.getClass();
      Object localObject2;
      if (!b.compareAndSet(true, false))
      {
        localObject2 = a;
        if (localObject2 != null) {
          ((MethodChannel.Result)localObject2).success("dev.fluttercommunity.plus/share/unavailable");
        }
      }
      dev.fluttercommunity.plus.share.SharePlusPendingIntent.a = "";
      b.set(false);
      a = paramResult;
      try
      {
        localObject2 = method;
        if (localObject2 != null)
        {
          int i = ((String)localObject2).hashCode();
          if (i != -1811378728)
          {
            if (i != -743768819)
            {
              if ((i == 109400031) && (((String)localObject2).equals("share")))
              {
                localObject1 = a;
                localObject2 = paramMethodCall.argument("text");
                i.c(localObject2, "null cannot be cast to non-null type kotlin.String");
                ((d)localObject1).d((String)localObject2, (String)paramMethodCall.argument("subject"));
                break label340;
              }
            }
            else if (((String)localObject2).equals("shareUri"))
            {
              localObject2 = a;
              paramMethodCall = paramMethodCall.argument("uri");
              i.c(paramMethodCall, "null cannot be cast to non-null type kotlin.String");
              ((d)localObject2).d((String)paramMethodCall, null);
              break label340;
            }
          }
          else if (((String)localObject2).equals("shareFiles"))
          {
            localObject1 = a;
            localObject2 = paramMethodCall.argument("paths");
            i.b(localObject2);
            ((d)localObject1).e((List)localObject2, (List)paramMethodCall.argument("mimeTypes"), (String)paramMethodCall.argument("text"), (String)paramMethodCall.argument("subject"));
            break label340;
          }
        }
        paramResult.notImplemented();
      }
      finally
      {
        localObject2 = b;
        b.set(true);
        a = null;
        paramResult.error("Share failed", paramMethodCall.getMessage(), paramMethodCall);
      }
      label340:
      return;
    }
    throw new IllegalArgumentException("Map arguments expected".toString());
  }
}

/* Location:
 * Qualified Name:     bb.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */