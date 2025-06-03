package I4;

import M4.l;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* loaded from: classes.dex */
public class h implements ResponseHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ResponseHandler f2578a;

    /* renamed from: b, reason: collision with root package name */
    public final l f2579b;

    /* renamed from: c, reason: collision with root package name */
    public final G4.j f2580c;

    public h(ResponseHandler responseHandler, l lVar, G4.j jVar) {
        this.f2578a = responseHandler;
        this.f2579b = lVar;
        this.f2580c = jVar;
    }

    @Override // org.apache.http.client.ResponseHandler
    public Object handleResponse(HttpResponse httpResponse) {
        this.f2580c.A(this.f2579b.c());
        this.f2580c.r(httpResponse.getStatusLine().getStatusCode());
        Long a7 = j.a(httpResponse);
        if (a7 != null) {
            this.f2580c.y(a7.longValue());
        }
        String b7 = j.b(httpResponse);
        if (b7 != null) {
            this.f2580c.x(b7);
        }
        this.f2580c.g();
        return this.f2578a.handleResponse(httpResponse);
    }
}
