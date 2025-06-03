// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import android.os.BaseBundle;
import android.view.View;
import org.json.JSONException;
import org.json.JSONObject;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import android.content.Context;
import kotlin.jvm.internal.g;

public final class m extends V
{
    public static final a E;
    public static final String F;
    public boolean D;
    
    static {
        E = new a(null);
        F = m.class.getName();
    }
    
    public m(final Context context, final String s, final String s2) {
        super(context, s);
        this.A(s2);
    }
    
    public static final void F(final m m) {
        Intrinsics.checkNotNullParameter(m, "this$0");
        m.cancel();
    }
    
    @Override
    public void cancel() {
        final WebView r = this.r();
        if (!this.u() || this.t() || r == null || !((View)r).isShown()) {
            super.cancel();
            return;
        }
        if (this.D) {
            return;
        }
        this.D = true;
        r.loadUrl(Intrinsics.i("javascript:", "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();"));
        new Handler(Looper.getMainLooper()).postDelayed((Runnable)new l(this), 1500L);
    }
    
    @Override
    public Bundle w(String o0) {
        final Uri parse = Uri.parse(o0);
        final P a = P.a;
        o0 = (String)P.o0(parse.getQuery());
        final String string = ((BaseBundle)o0).getString("bridge_args");
        ((Bundle)o0).remove("bridge_args");
        if (!P.c0(string)) {
            try {
                ((Bundle)o0).putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", O1.c.a(new JSONObject(string)));
            }
            catch (JSONException ex) {
                final P a2 = P.a;
                P.k0(m.F, "Unable to parse bridge_args JSON", (Throwable)ex);
            }
        }
        final String string2 = ((BaseBundle)o0).getString("method_results");
        ((Bundle)o0).remove("method_results");
        if (!P.c0(string2)) {
            try {
                ((Bundle)o0).putBundle("com.facebook.platform.protocol.RESULT_ARGS", O1.c.a(new JSONObject(string2)));
            }
            catch (JSONException ex2) {
                final P a3 = P.a;
                P.k0(m.F, "Unable to parse bridge_args JSON", (Throwable)ex2);
            }
        }
        ((Bundle)o0).remove("version");
        ((BaseBundle)o0).putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", O1.E.t());
        return (Bundle)o0;
    }
    
    public static final class a
    {
        public final m a(final Context context, final String s, final String s2) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(s, "url");
            Intrinsics.checkNotNullParameter(s2, "expectedRedirectUrl");
            V.s(context);
            return new m(context, s, s2, null);
        }
    }
}
