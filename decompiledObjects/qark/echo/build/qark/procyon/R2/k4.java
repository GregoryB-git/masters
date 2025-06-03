// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.H6;
import com.google.android.gms.internal.measurement.y7;
import android.net.Uri;
import android.app.Application$ActivityLifecycleCallbacks;

public final class k4 implements Application$ActivityLifecycleCallbacks
{
    public final /* synthetic */ C3 o;
    
    public k4(final C3 o) {
        this.o = o;
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        Object intent;
        Uri uri;
        Bundle extras;
        String string;
        boolean b;
        Uri uri2;
        String queryParameter;
        RuntimeException ex;
        final Uri uri3;
        final RuntimeException ex2;
        Label_0241_Outer:Label_0251_Outer:
        while (true) {
            Label_0251:Label_0158_Outer:
            while (true) {
                while (true) {
                Label_0241:
                    while (true) {
                        Label_0244: {
                            while (true) {
                            Label_0207_Outer:
                                while (true) {
                                    Label_0235: {
                                        while (true) {
                                            try {
                                                while (true) {
                                                    try {
                                                        this.o.j().K().a("onActivityCreated");
                                                        intent = activity.getIntent();
                                                        if (intent != null) {
                                                            uri = ((Intent)intent).getData();
                                                            if (uri == null || !uri.isHierarchical()) {
                                                                extras = ((Intent)intent).getExtras();
                                                                if (extras == null) {
                                                                    break Label_0235;
                                                                }
                                                                string = ((BaseBundle)extras).getString("com.android.vending.referral_url");
                                                                if (TextUtils.isEmpty((CharSequence)string)) {
                                                                    break Label_0235;
                                                                }
                                                                uri = Uri.parse(string);
                                                            }
                                                            if (uri != null) {
                                                                if (uri.isHierarchical()) {
                                                                    this.o.k();
                                                                    if (S5.e0((Intent)intent)) {
                                                                        intent = "gs";
                                                                        break Label_0241;
                                                                    }
                                                                    break Label_0244;
                                                                }
                                                            }
                                                        }
                                                        while (true) {
                                                            this.o.s().M(activity, bundle);
                                                            return;
                                                            this.o.s().M(activity, bundle);
                                                            while (true) {
                                                                b = true;
                                                                break Label_0251;
                                                                queryParameter = uri2.getQueryParameter("referrer");
                                                                continue Label_0251_Outer;
                                                            }
                                                            this.o.e().D(new o4(this, b, uri2, (String)intent, queryParameter));
                                                            continue Label_0207_Outer;
                                                            this.o.j().G().b("Throwable caught in onActivityCreated", ex);
                                                            continue Label_0207_Outer;
                                                        }
                                                    }
                                                    // iftrue(Label_0254:, bundle != null)
                                                    finally {}
                                                    uri2 = uri3;
                                                    continue Label_0251_Outer;
                                                }
                                            }
                                            catch (RuntimeException ex2) {}
                                            ex = ex2;
                                            continue;
                                        }
                                    }
                                    uri = null;
                                    continue Label_0241_Outer;
                                }
                                continue Label_0158_Outer;
                            }
                        }
                        intent = "auto";
                        continue Label_0241;
                    }
                    continue;
                }
                Label_0254: {
                    b = false;
                }
                continue Label_0251;
            }
        }
    }
    
    public final void onActivityDestroyed(final Activity activity) {
        this.o.s().K(activity);
    }
    
    public final void onActivityPaused(final Activity activity) {
        this.o.s().Q(activity);
        final l5 u = this.o.u();
        u.e().D(new n5(u, u.b().b()));
    }
    
    public final void onActivityResumed(final Activity activity) {
        final l5 u = this.o.u();
        u.e().D(new o5(u, u.b().b()));
        this.o.s().S(activity);
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        this.o.s().R(activity, bundle);
    }
    
    public final void onActivityStarted(final Activity activity) {
    }
    
    public final void onActivityStopped(final Activity activity) {
    }
}
