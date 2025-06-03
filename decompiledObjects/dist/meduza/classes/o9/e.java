package o9;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ec.i;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import m6.j;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers.Builder;
import okhttp3.HttpUrl.Builder;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import okhttp3.Request.Builder;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import org.json.JSONException;
import org.json.JSONObject;
import y7.c;
import y7.d;

public final class e
{
  public static final TaskCompletionSource<Void> j = new TaskCompletionSource();
  public static boolean k;
  public final Executor a;
  public final OkHttpClient b;
  public final q c;
  public final a d;
  public final String e;
  public String f;
  public String g;
  public String h;
  public v5.n i;
  
  public e(Context paramContext, String arg2, String paramString2, a parama, @c Executor paramExecutor1, @d Executor paramExecutor2)
  {
    a = paramExecutor1;
    h = "https://%1$s-%2$s.cloudfunctions.net/%3$s";
    b = new OkHttpClient();
    c = new q();
    j.i(parama);
    d = parama;
    j.i(???);
    e = ???;
    int m;
    try
    {
      new URL(paramString2);
      m = 0;
    }
    catch (MalformedURLException ???)
    {
      m = 1;
    }
    if (m != 0)
    {
      f = paramString2;
      paramString2 = null;
    }
    else
    {
      f = "us-central1";
    }
    g = paramString2;
    synchronized (j)
    {
      boolean bool = k;
      if (!bool)
      {
        k = true;
        paramString2 = rb.h.a;
        paramExecutor2.execute(new g.e(paramContext, 1));
      }
      return;
    }
  }
  
  public final Task<p> a(URL paramURL, Object paramObject, n paramn, m paramm)
  {
    Object localObject1 = new HashMap();
    c.getClass();
    ((HashMap)localObject1).put("data", q.b(paramObject));
    localObject1 = new JSONObject((Map)localObject1);
    try
    {
      paramObject = MediaType.a("application/json");
    }
    catch (IllegalArgumentException paramObject)
    {
      paramObject = null;
    }
    String str = ((JSONObject)localObject1).toString();
    Charset localCharset = Util.i;
    localObject1 = paramObject;
    Object localObject2 = localCharset;
    if (paramObject != null) {}
    try
    {
      localObject1 = b;
      if (localObject1 != null) {
        localObject1 = Charset.forName((String)localObject1);
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
    localObject1 = null;
    if (localObject1 == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append(paramObject);
      ((StringBuilder)localObject1).append("; charset=utf-8");
      paramObject = ((StringBuilder)localObject1).toString();
      try
      {
        localObject1 = MediaType.a((String)paramObject);
        localObject2 = localCharset;
      }
      catch (IllegalArgumentException paramObject)
      {
        localObject1 = null;
        localObject2 = localCharset;
      }
    }
    else
    {
      localObject2 = localObject1;
      localObject1 = paramObject;
    }
    localObject1 = RequestBody.c((MediaType)localObject1, str.getBytes((Charset)localObject2));
    paramObject = new Request.Builder();
    localObject2 = paramURL.toString();
    paramURL = new HttpUrl.Builder();
    paramURL.b(null, (String)localObject2);
    a = paramURL.a();
    ((Request.Builder)paramObject).b("POST", (RequestBody)localObject1);
    i.b(paramn);
    if (a != null)
    {
      paramURL = f.l("Bearer ");
      paramURL.append(a);
      paramURL = paramURL.toString();
      c.d("Authorization", paramURL);
    }
    paramURL = b;
    if (paramURL != null) {
      c.d("Firebase-Instance-ID-Token", paramURL);
    }
    paramURL = c;
    if (paramURL != null) {
      c.d("X-Firebase-AppCheck", paramURL);
    }
    paramURL = b;
    i.e(paramURL, "client");
    paramURL = new OkHttpClient.Builder(paramURL);
    x = Util.d(a, b);
    z = Util.d(a, b);
    paramURL = new OkHttpClient(paramURL).a(((Request.Builder)paramObject).a());
    paramObject = new TaskCompletionSource();
    paramURL.C(new a((TaskCompletionSource)paramObject, this));
    paramURL = ((TaskCompletionSource)paramObject).getTask();
    i.d(paramURL, "tcs.task");
    return paramURL;
  }
  
  public static final class a
    implements Callback
  {
    public a(TaskCompletionSource<p> paramTaskCompletionSource, e parame) {}
    
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
      str = ((xc.h)localObject1).S(Util.b((xc.h)localObject1, paramResponse));
      Util.e((Closeable)localObject1);
      i = f.c;
      i.e(jdField_thisc, "serializer");
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
        jdField_thisc.getClass();
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
}

/* Location:
 * Qualified Name:     o9.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */