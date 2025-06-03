// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I4;

import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import G4.j;
import M4.l;
import org.apache.http.client.ResponseHandler;

public class h implements ResponseHandler
{
    public final ResponseHandler a;
    public final l b;
    public final j c;
    
    public h(final ResponseHandler a, final l b, final j c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public Object handleResponse(final HttpResponse httpResponse) {
        this.c.A(this.b.c());
        this.c.r(httpResponse.getStatusLine().getStatusCode());
        final Long a = I4.j.a((HttpMessage)httpResponse);
        if (a != null) {
            this.c.y(a);
        }
        final String b = I4.j.b(httpResponse);
        if (b != null) {
            this.c.x(b);
        }
        this.c.g();
        return this.a.handleResponse(httpResponse);
    }
}
