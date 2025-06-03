/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  android.os.Message
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
package O1;

import O1.E;
import O1.P;
import O1.V;
import O1.g;
import O1.h;
import O1.m;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import x1.B;
import x1.o;

@Metadata
public final class i
extends d {
    public static final a F0 = new a(null);
    public Dialog E0;

    public static /* synthetic */ void U1(i i8, Bundle bundle, o o8) {
        i.Y1(i8, bundle, o8);
    }

    public static /* synthetic */ void V1(i i8, Bundle bundle, o o8) {
        i.X1(i8, bundle, o8);
    }

    public static final void X1(i i8, Bundle bundle, o o8) {
        Intrinsics.checkNotNullParameter(i8, "this$0");
        i8.Z1(bundle, o8);
    }

    public static final void Y1(i i8, Bundle bundle, o o8) {
        Intrinsics.checkNotNullParameter(i8, "this$0");
        i8.a2(bundle);
    }

    @Override
    public void H0() {
        Fragment.super.H0();
        Dialog dialog = this.E0;
        if (dialog instanceof V) {
            if (dialog != null) {
                ((V)dialog).x();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
        }
    }

    @Override
    public Dialog N1(Bundle bundle) {
        Dialog dialog = this.E0;
        if (dialog == null) {
            this.Z1(null, null);
            this.R1(false);
            bundle = super.N1(bundle);
            Intrinsics.checkNotNullExpressionValue((Object)bundle, "super.onCreateDialog(savedInstanceState)");
            return bundle;
        }
        if (dialog != null) {
            return dialog;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Dialog");
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void W1() {
        Object object;
        block12 : {
            e e8;
            Object object2;
            Object object3;
            block13 : {
                block11 : {
                    block9 : {
                        block10 : {
                            if (this.E0 != null) {
                                return;
                            }
                            e8 = this.n();
                            if (e8 == null) {
                                return;
                            }
                            object = e8.getIntent();
                            object3 = E.a;
                            Intrinsics.checkNotNullExpressionValue(object, "intent");
                            object2 = E.u((Intent)object);
                            boolean bl = object2 == null ? false : object2.getBoolean("is_fallback", false);
                            object = null;
                            object3 = null;
                            if (bl) break block9;
                            object = object2 == null ? null : object2.getString("action");
                            if (object2 != null) {
                                object3 = object2.getBundle("params");
                            }
                            if (!P.c0((String)object)) break block10;
                            object = "Cannot start a WebDialog with an empty/missing 'actionName'";
                            break block11;
                        }
                        if (object == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        object = new V.a((Context)e8, (String)object, (Bundle)object3).h(new g(this)).a();
                        break block12;
                    }
                    if (object2 != null) {
                        object = object2.getString("url");
                    }
                    if (!P.c0((String)object)) break block13;
                    object = "Cannot start a fallback WebDialog with an empty/missing 'url'";
                }
                P.j0("FacebookDialogFragment", (String)object);
                e8.finish();
                return;
            }
            object3 = x.a;
            object3 = String.format((String)"fb%s://bridge/", (Object[])Arrays.copyOf((Object[])new Object[]{B.m()}, (int)1));
            Intrinsics.checkNotNullExpressionValue(object3, "java.lang.String.format(format, *args)");
            object2 = m.E;
            if (object == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            object = object2.a((Context)e8, (String)object, (String)object3);
            object.B(new h(this));
        }
        this.E0 = object;
    }

    public final void Z1(Bundle bundle, o o8) {
        e e8 = this.n();
        if (e8 == null) {
            return;
        }
        E e9 = E.a;
        e9 = e8.getIntent();
        Intrinsics.checkNotNullExpressionValue(e9, "fragmentActivity.intent");
        bundle = E.m((Intent)e9, bundle, o8);
        int n8 = o8 == null ? -1 : 0;
        e8.setResult(n8, (Intent)bundle);
        e8.finish();
    }

    public final void a2(Bundle bundle) {
        e e8 = this.n();
        if (e8 == null) {
            return;
        }
        Intent intent = new Intent();
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        intent.putExtras(bundle2);
        e8.setResult(-1, intent);
        e8.finish();
    }

    public final void b2(Dialog dialog) {
        this.E0 = dialog;
    }

    @Override
    public void m0(Bundle bundle) {
        super.m0(bundle);
        this.W1();
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        Intrinsics.checkNotNullParameter((Object)configuration, "newConfig");
        Fragment.super.onConfigurationChanged(configuration);
        if (this.E0 instanceof V && this.d0()) {
            configuration = this.E0;
            if (configuration != null) {
                ((V)configuration).x();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
        }
    }

    @Override
    public void t0() {
        Dialog dialog = this.L1();
        if (dialog != null && this.J()) {
            dialog.setDismissMessage(null);
        }
        super.t0();
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g g8) {
            this();
        }
    }

}

