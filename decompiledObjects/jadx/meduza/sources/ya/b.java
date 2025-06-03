package ya;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.EventChannel;
import java.util.ArrayList;
import w.g;

/* loaded from: classes.dex */
public final class b extends BroadcastReceiver implements EventChannel.StreamHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17455a;

    /* renamed from: b, reason: collision with root package name */
    public final ya.a f17456b;

    /* renamed from: c, reason: collision with root package name */
    public EventChannel.EventSink f17457c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f17458d = new Handler(Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    public a f17459e;

    public class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            b bVar = b.this;
            bVar.a(ya.a.a(bVar.f17456b.f17454a.getNetworkCapabilities(network)));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            b bVar = b.this;
            bVar.f17456b.getClass();
            bVar.a(ya.a.a(networkCapabilities));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            b bVar = b.this;
            bVar.getClass();
            bVar.f17458d.postDelayed(new u.a(bVar, 18), 500L);
        }
    }

    public b(Context context, ya.a aVar) {
        this.f17455a = context;
        this.f17456b = aVar;
    }

    public final void a(ArrayList arrayList) {
        this.f17458d.post(new g(26, this, arrayList));
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                this.f17455a.unregisterReceiver(this);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        a aVar = this.f17459e;
        if (aVar != null) {
            this.f17456b.f17454a.unregisterNetworkCallback(aVar);
            this.f17459e = null;
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f17457c = eventSink;
        if (Build.VERSION.SDK_INT >= 24) {
            a aVar = new a();
            this.f17459e = aVar;
            this.f17456b.f17454a.registerDefaultNetworkCallback(aVar);
        } else {
            this.f17455a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        ya.a aVar2 = this.f17456b;
        a(ya.a.a(aVar2.f17454a.getNetworkCapabilities(aVar2.f17454a.getActiveNetwork())));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        EventChannel.EventSink eventSink = this.f17457c;
        if (eventSink != null) {
            ya.a aVar = this.f17456b;
            eventSink.success(ya.a.a(aVar.f17454a.getNetworkCapabilities(aVar.f17454a.getActiveNetwork())));
        }
    }
}
