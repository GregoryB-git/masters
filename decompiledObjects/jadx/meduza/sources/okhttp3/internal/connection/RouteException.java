package okhttp3.internal.connection;

import java.io.IOException;

/* loaded from: classes.dex */
public final class RouteException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public IOException f12426a;

    /* renamed from: b, reason: collision with root package name */
    public IOException f12427b;

    public RouteException(IOException iOException) {
        super(iOException);
        this.f12426a = iOException;
        this.f12427b = iOException;
    }
}
