package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import okhttp3.Route;

/* loaded from: classes.dex */
public final class RouteDatabase {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f12425a = new LinkedHashSet();

    public final synchronized void a(Route route) {
        this.f12425a.remove(route);
    }
}
