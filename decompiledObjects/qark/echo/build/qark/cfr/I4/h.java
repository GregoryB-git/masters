/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  org.apache.http.HttpMessage
 *  org.apache.http.HttpResponse
 *  org.apache.http.StatusLine
 *  org.apache.http.client.ResponseHandler
 */
package I4;

import I4.j;
import M4.l;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ResponseHandler;

public class h
implements ResponseHandler {
    public final ResponseHandler a;
    public final l b;
    public final G4.j c;

    public h(ResponseHandler responseHandler, l l8, G4.j j8) {
        this.a = responseHandler;
        this.b = l8;
        this.c = j8;
    }

    public Object handleResponse(HttpResponse httpResponse) {
        this.c.A(this.b.c());
        this.c.r(httpResponse.getStatusLine().getStatusCode());
        Object object = j.a((HttpMessage)httpResponse);
        if (object != null) {
            this.c.y(object.longValue());
        }
        if ((object = j.b(httpResponse)) != null) {
            this.c.x((String)object);
        }
        this.c.g();
        return this.a.handleResponse(httpResponse);
    }
}

