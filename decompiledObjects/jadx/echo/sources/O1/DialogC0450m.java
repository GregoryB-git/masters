package O1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: O1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC0450m extends V {

    /* renamed from: E, reason: collision with root package name */
    public static final a f3859E = new a(null);

    /* renamed from: F, reason: collision with root package name */
    public static final String f3860F = DialogC0450m.class.getName();

    /* renamed from: D, reason: collision with root package name */
    public boolean f3861D;

    /* renamed from: O1.m$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final DialogC0450m a(Context context, String url, String expectedRedirectUrl) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(expectedRedirectUrl, "expectedRedirectUrl");
            V.s(context);
            return new DialogC0450m(context, url, expectedRedirectUrl, null);
        }
    }

    public DialogC0450m(Context context, String str, String str2) {
        super(context, str);
        A(str2);
    }

    public static final void F(DialogC0450m this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.cancel();
    }

    @Override // O1.V, android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        WebView r7 = r();
        if (!u() || t() || r7 == null || !r7.isShown()) {
            super.cancel();
        } else {
            if (this.f3861D) {
                return;
            }
            this.f3861D = true;
            r7.loadUrl(Intrinsics.i("javascript:", "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();"));
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: O1.l
                @Override // java.lang.Runnable
                public final void run() {
                    DialogC0450m.F(DialogC0450m.this);
                }
            }, 1500L);
        }
    }

    @Override // O1.V
    public Bundle w(String str) {
        Uri parse = Uri.parse(str);
        P p7 = P.f3756a;
        Bundle o02 = P.o0(parse.getQuery());
        String string = o02.getString("bridge_args");
        o02.remove("bridge_args");
        if (!P.c0(string)) {
            try {
                o02.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", C0440c.a(new JSONObject(string)));
            } catch (JSONException e7) {
                P p8 = P.f3756a;
                P.k0(f3860F, "Unable to parse bridge_args JSON", e7);
            }
        }
        String string2 = o02.getString("method_results");
        o02.remove("method_results");
        if (!P.c0(string2)) {
            try {
                o02.putBundle("com.facebook.platform.protocol.RESULT_ARGS", C0440c.a(new JSONObject(string2)));
            } catch (JSONException e8) {
                P p9 = P.f3756a;
                P.k0(f3860F, "Unable to parse bridge_args JSON", e8);
            }
        }
        o02.remove("version");
        o02.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", E.t());
        return o02;
    }

    public /* synthetic */ DialogC0450m(Context context, String str, String str2, kotlin.jvm.internal.g gVar) {
        this(context, str, str2);
    }
}
