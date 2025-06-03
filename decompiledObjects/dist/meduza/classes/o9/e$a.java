package o9;

import com.google.android.gms.tasks.TaskCompletionSource;
import ec.i;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.Charset;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import org.json.JSONException;
import org.json.JSONObject;
import xc.h;

public final class e$a
  implements Callback
{
  public e$a(TaskCompletionSource<p> paramTaskCompletionSource, e parame) {}
  
  public final void a(Call paramCall, Response paramResponse)
  {
    i.e(paramCall, "ignored");
    i.e(paramResponse, "response");
    paramCall = f.a.a;
    int i = c;
    if (i != 200)
    {
      if (i != 409)
      {
        if (i != 429)
        {
          if (i != 400)
          {
            if (i != 401)
            {
              if (i != 403)
              {
                if (i != 404)
                {
                  if (i != 503)
                  {
                    if (i != 504) {
                      switch (i)
                      {
                      default: 
                        paramCall = f.a.c;
                        break;
                      case 501: 
                        paramCall = f.a.r;
                        break;
                      case 500: 
                        paramCall = f.a.s;
                        break;
                      case 499: 
                        paramCall = f.a.b;
                        break;
                      }
                    } else {
                      paramCall = f.a.e;
                    }
                  }
                  else {
                    paramCall = f.a.t;
                  }
                }
                else {
                  paramCall = f.a.f;
                }
              }
              else {
                paramCall = f.a.o;
              }
            }
            else {
              paramCall = f.a.u;
            }
          }
          else {
            paramCall = f.a.d;
          }
        }
        else {
          paramCall = f.a.p;
        }
      }
      else {
        paramCall = f.a.q;
      }
    }
    else {
      paramCall = f.a.a;
    }
    paramResponse = o;
    i.b(paramResponse);
    localObject1 = paramResponse.H();
    for (;;)
    {
      try
      {
        paramResponse = paramResponse.g();
        if (paramResponse != null) {
          localObject2 = Util.i;
        }
      }
      finally
      {
        String str;
        JSONObject localJSONObject;
        Util.e((Closeable)localObject1);
      }
      try
      {
        localObject3 = b;
        paramResponse = (Response)localObject2;
        if (localObject3 == null) {
          continue;
        }
        paramResponse = Charset.forName((String)localObject3);
      }
      catch (IllegalArgumentException paramResponse)
      {
        paramResponse = (Response)localObject2;
      }
    }
    paramResponse = Util.i;
    str = ((h)localObject1).S(Util.b((h)localObject1, paramResponse));
    Util.e((Closeable)localObject1);
    i = f.c;
    i.e(b.c, "serializer");
    localObject4 = paramCall.name();
    localObject1 = localObject4;
    paramResponse = paramCall;
    try
    {
      localObject2 = new org/json/JSONObject;
      localObject1 = localObject4;
      paramResponse = paramCall;
      ((JSONObject)localObject2).<init>(str);
      localObject1 = localObject4;
      paramResponse = paramCall;
      localJSONObject = ((JSONObject)localObject2).getJSONObject("error");
      localObject3 = localObject4;
      localObject2 = paramCall;
      localObject1 = localObject4;
      paramResponse = paramCall;
      if ((localJSONObject.opt("status") instanceof String))
      {
        localObject1 = localObject4;
        paramResponse = paramCall;
        localObject2 = localJSONObject.getString("status");
        localObject1 = localObject4;
        paramResponse = paramCall;
        i.d(localObject2, "error.getString(\"status\")");
        localObject1 = localObject4;
        paramResponse = paramCall;
        localObject2 = f.a.valueOf((String)localObject2);
        localObject1 = localObject4;
        paramResponse = (Response)localObject2;
        localObject3 = ((Enum)localObject2).name();
      }
      paramCall = (Call)localObject3;
      localObject1 = localObject3;
      paramResponse = (Response)localObject2;
      if ((localJSONObject.opt("message") instanceof String))
      {
        localObject1 = localObject3;
        paramResponse = (Response)localObject2;
        paramCall = localJSONObject.getString("message");
        localObject1 = localObject3;
        paramResponse = (Response)localObject2;
        i.d(paramCall, "error.getString(\"message\")");
        localObject1 = localObject3;
        paramResponse = (Response)localObject2;
        if (paramCall.length() == 0) {
          i = 1;
        } else {
          i = 0;
        }
        paramCall = (Call)localObject3;
        if (i == 0)
        {
          localObject1 = localObject3;
          paramResponse = (Response)localObject2;
          paramCall = localJSONObject.getString("message");
          localObject1 = localObject3;
          paramResponse = (Response)localObject2;
          i.d(paramCall, "error.getString(\"message\")");
        }
      }
      localObject1 = paramCall;
      paramResponse = (Response)localObject2;
      localObject4 = localJSONObject.opt("details");
      localObject3 = paramCall;
      localObject1 = localObject4;
      paramResponse = (Response)localObject2;
      if (localObject4 == null) {
        break label596;
      }
      paramResponse = f.a.s;
    }
    catch (JSONException paramCall)
    {
      try
      {
        localObject1 = q.a(localObject4);
        localObject3 = paramCall;
        paramResponse = (Response)localObject2;
      }
      catch (IllegalArgumentException paramCall)
      {
        for (;;)
        {
          localObject1 = localObject4;
        }
      }
      catch (JSONException paramResponse)
      {
        for (;;)
        {
          localObject3 = paramCall;
          localObject1 = localObject4;
          paramResponse = (Response)localObject2;
        }
      }
      paramCall = paramCall;
      paramCall = null;
      localObject3 = localObject1;
      localObject1 = paramCall;
    }
    catch (IllegalArgumentException paramCall)
    {
      localObject1 = null;
    }
    localObject3 = "INTERNAL";
    label596:
    if (paramResponse == f.a.a) {
      paramCall = null;
    } else {
      paramCall = new f((String)localObject3, paramResponse, localObject1);
    }
    if (paramCall != null)
    {
      a.setException(paramCall);
      return;
    }
    try
    {
      localObject2 = new JSONObject(str);
      paramResponse = ((JSONObject)localObject2).opt("data");
      paramCall = paramResponse;
      if (paramResponse == null) {
        paramCall = ((JSONObject)localObject2).opt("result");
      }
      if (paramCall == null)
      {
        paramCall = new f("Response is missing data field.", f.a.s, null);
        a.setException(paramCall);
        return;
      }
      b.c.getClass();
      paramCall = new p(q.a(paramCall));
      a.setResult(paramCall);
      return;
    }
    catch (JSONException paramCall)
    {
      paramCall = new f("Response is not valid JSON object.", f.a.s, paramCall);
      a.setException(paramCall);
      return;
    }
  }
  
  public final void b(Call paramCall, IOException paramIOException)
  {
    i.e(paramCall, "ignored");
    i.e(paramIOException, "e");
    if ((paramIOException instanceof InterruptedIOException)) {
      paramCall = new f("DEADLINE_EXCEEDED", f.a.e, paramIOException);
    } else {
      paramCall = new f("INTERNAL", f.a.s, paramIOException);
    }
    a.setException(paramCall);
  }
}

/* Location:
 * Qualified Name:     o9.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */