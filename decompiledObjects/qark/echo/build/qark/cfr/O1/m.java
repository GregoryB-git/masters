/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.webkit.WebView
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package O1;

import O1.E;
import O1.P;
import O1.V;
import O1.c;
import O1.l;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.json.JSONException;
import org.json.JSONObject;

public final class m
extends V {
    public static final a E = new a(null);
    public static final String F = m.class.getName();
    public boolean D;

    public m(Context context, String string2, String string3) {
        super(context, string2);
        this.A(string3);
    }

    public /* synthetic */ m(Context context, String string2, String string3, g g8) {
        this(context, string2, string3);
    }

    public static /* synthetic */ void E(m m8) {
        m.F(m8);
    }

    public static final void F(m m8) {
        Intrinsics.checkNotNullParameter((Object)m8, "this$0");
        super.cancel();
    }

    @Override
    public void cancel() {
        WebView webView = this.r();
        if (this.u() && !this.t() && webView != null && webView.isShown()) {
            if (this.D) {
                return;
            }
            this.D = true;
            webView.loadUrl(Intrinsics.i("javascript:", "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();"));
            new Handler(Looper.getMainLooper()).postDelayed((Runnable)new l(this), 1500L);
            return;
        }
        super.cancel();
    }

    @Override
    public Bundle w(String string2) {
        P p8;
        string2 = Uri.parse((String)string2);
        Object object = P.a;
        string2 = P.o0(string2.getQuery());
        object = string2.getString("bridge_args");
        string2.remove("bridge_args");
        if (!P.c0((String)object)) {
            try {
                string2.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", c.a(new JSONObject((String)object)));
            }
            catch (JSONException jSONException) {
                p8 = P.a;
                P.k0(F, "Unable to parse bridge_args JSON", (Throwable)jSONException);
            }
        }
        object = string2.getString("method_results");
        string2.remove("method_results");
        if (!P.c0((String)object)) {
            try {
                string2.putBundle("com.facebook.platform.protocol.RESULT_ARGS", c.a(new JSONObject((String)object)));
            }
            catch (JSONException jSONException) {
                p8 = P.a;
                P.k0(F, "Unable to parse bridge_args JSON", (Throwable)jSONException);
            }
        }
        string2.remove("version");
        string2.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", E.t());
        return string2;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final m a(Context context, String string2, String string3) {
            Intrinsics.checkNotNullParameter((Object)context, "context");
            Intrinsics.checkNotNullParameter(string2, "url");
            Intrinsics.checkNotNullParameter(string3, "expectedRedirectUrl");
            V.s(context);
            return new m(context, string2, string3, null);
        }
    }

}

