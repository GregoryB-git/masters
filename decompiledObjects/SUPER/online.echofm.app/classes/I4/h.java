package I4;

import M4.l;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ResponseHandler;

public class h
  implements ResponseHandler
{
  public final ResponseHandler a;
  public final l b;
  public final G4.j c;
  
  public h(ResponseHandler paramResponseHandler, l paraml, G4.j paramj)
  {
    a = paramResponseHandler;
    b = paraml;
    c = paramj;
  }
  
  public Object handleResponse(HttpResponse paramHttpResponse)
  {
    c.A(b.c());
    c.r(paramHttpResponse.getStatusLine().getStatusCode());
    Object localObject = j.a(paramHttpResponse);
    if (localObject != null) {
      c.y(((Long)localObject).longValue());
    }
    localObject = j.b(paramHttpResponse);
    if (localObject != null) {
      c.x((String)localObject);
    }
    c.g();
    return a.handleResponse(paramHttpResponse);
  }
}

/* Location:
 * Qualified Name:     I4.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */