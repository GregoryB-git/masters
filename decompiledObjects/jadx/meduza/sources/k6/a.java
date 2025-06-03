package k6;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.a;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import k6.a.d;
import k6.e;

/* loaded from: classes.dex */
public final class a<O extends d> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0130a f9093a;

    /* renamed from: b, reason: collision with root package name */
    public final g f9094b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9095c;

    /* renamed from: k6.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0130a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T buildClient(Context context, Looper looper, m6.a aVar, O o10, e.a aVar2, e.b bVar) {
            return buildClient(context, looper, aVar, (m6.a) o10, (l6.c) aVar2, (l6.j) bVar);
        }

        public T buildClient(Context context, Looper looper, m6.a aVar, O o10, l6.c cVar, l6.j jVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        /* renamed from: j, reason: collision with root package name */
        public static final c f9096j = new c(0);

        /* renamed from: k6.a$d$a, reason: collision with other inner class name */
        public interface InterfaceC0131a extends d {
            Account u();
        }

        public interface b extends d {
            GoogleSignInAccount r();
        }

        public static final class c implements d {
            public c() {
            }

            public /* synthetic */ c(int i10) {
            }
        }
    }

    public static abstract class e<T extends b, O> {
        public static final int API_PRIORITY_GAMES = 1;
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        public static final int API_PRIORITY_PLUS = 2;

        public List<Scope> getImpliedScopes(O o10) {
            return Collections.emptyList();
        }

        public int getPriority() {
            return Integer.MAX_VALUE;
        }
    }

    public interface f extends b {
        void connect(a.c cVar);

        void disconnect(String str);

        j6.d[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set);

        Set<Scope> getScopesForConnectionlessNonSignIn();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(a.e eVar);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> a(String str, AbstractC0130a<C, O> abstractC0130a, g<C> gVar) {
        this.f9095c = str;
        this.f9093a = abstractC0130a;
        this.f9094b = gVar;
    }
}
