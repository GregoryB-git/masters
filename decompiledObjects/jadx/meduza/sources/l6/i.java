package l6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.a;
import java.util.Collections;
import java.util.Set;
import k6.a;

/* loaded from: classes.dex */
public final class i implements a.f, ServiceConnection {
    @Override // k6.a.f
    public final void connect(a.c cVar) {
        Thread.currentThread();
        throw null;
    }

    @Override // k6.a.f
    public final void disconnect(String str) {
        Thread.currentThread();
        throw null;
    }

    @Override // k6.a.f
    public final j6.d[] getAvailableFeatures() {
        return new j6.d[0];
    }

    @Override // k6.a.f
    public final String getEndpointPackageName() {
        m6.j.i(null);
        throw null;
    }

    @Override // k6.a.f
    public final String getLastDisconnectMessage() {
        return null;
    }

    @Override // k6.a.f
    public final int getMinApkVersion() {
        return 0;
    }

    @Override // k6.a.f
    public final void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set) {
    }

    @Override // k6.a.f
    public final Set<Scope> getScopesForConnectionlessNonSignIn() {
        return Collections.emptySet();
    }

    @Override // k6.a.f
    public final boolean isConnected() {
        Thread.currentThread();
        throw null;
    }

    @Override // k6.a.f
    public final boolean isConnecting() {
        Thread.currentThread();
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        throw null;
    }

    @Override // k6.a.f
    public final void onUserSignOut(a.e eVar) {
    }

    @Override // k6.a.f
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override // k6.a.f
    public final boolean requiresSignIn() {
        return false;
    }
}
