package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.internal.ws.WebSocketReader;

/* loaded from: classes.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final List<Protocol> f12681a = Collections.singletonList(Protocol.HTTP_1_1);

    /* renamed from: okhttp3.internal.ws.RealWebSocket$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* renamed from: okhttp3.internal.ws.RealWebSocket$2, reason: invalid class name */
    class AnonymousClass2 implements Callback {
        @Override // okhttp3.Callback
        public final void a(Call call, Response response) {
            throw null;
        }

        @Override // okhttp3.Callback
        public final void b(Call call, IOException iOException) {
            throw null;
        }
    }

    public final class CancelRunnable implements Runnable {
        public CancelRunnable() {
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static final class Close {
    }

    public static final class Message {
    }

    public final class PingRunnable implements Runnable {
        public PingRunnable() {
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static abstract class Streams implements Closeable {
    }
}
