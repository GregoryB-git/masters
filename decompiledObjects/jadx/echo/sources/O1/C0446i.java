package O1;

import O1.DialogC0450m;
import O1.V;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0782d;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import x1.C2146B;
import x1.C2162o;

@Metadata
/* renamed from: O1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0446i extends DialogInterfaceOnCancelListenerC0782d {

    /* renamed from: F0, reason: collision with root package name */
    public static final a f3845F0 = new a(null);

    /* renamed from: E0, reason: collision with root package name */
    public Dialog f3846E0;

    /* renamed from: O1.i$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public static final void X1(C0446i this$0, Bundle bundle, C2162o c2162o) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Z1(bundle, c2162o);
    }

    public static final void Y1(C0446i this$0, Bundle bundle, C2162o c2162o) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a2(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void H0() {
        super.H0();
        Dialog dialog = this.f3846E0;
        if (dialog instanceof V) {
            if (dialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((V) dialog).x();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0782d
    public Dialog N1(Bundle bundle) {
        Dialog dialog = this.f3846E0;
        if (dialog != null) {
            if (dialog != null) {
                return dialog;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Dialog");
        }
        Z1(null, null);
        R1(false);
        Dialog N12 = super.N1(bundle);
        Intrinsics.checkNotNullExpressionValue(N12, "super.onCreateDialog(savedInstanceState)");
        return N12;
    }

    public final void W1() {
        androidx.fragment.app.e n7;
        V a7;
        String str;
        if (this.f3846E0 == null && (n7 = n()) != null) {
            Intent intent = n7.getIntent();
            E e7 = E.f3721a;
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            Bundle u7 = E.u(intent);
            if (!(u7 == null ? false : u7.getBoolean("is_fallback", false))) {
                String string = u7 == null ? null : u7.getString("action");
                Bundle bundle = u7 != null ? u7.getBundle("params") : null;
                if (P.c0(string)) {
                    str = "Cannot start a WebDialog with an empty/missing 'actionName'";
                    P.j0("FacebookDialogFragment", str);
                    n7.finish();
                    return;
                } else {
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    a7 = new V.a(n7, string, bundle).h(new V.d() { // from class: O1.g
                        @Override // O1.V.d
                        public final void a(Bundle bundle2, C2162o c2162o) {
                            C0446i.X1(C0446i.this, bundle2, c2162o);
                        }
                    }).a();
                    this.f3846E0 = a7;
                }
            }
            String string2 = u7 != null ? u7.getString("url") : null;
            if (P.c0(string2)) {
                str = "Cannot start a fallback WebDialog with an empty/missing 'url'";
                P.j0("FacebookDialogFragment", str);
                n7.finish();
                return;
            }
            kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
            String format = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{C2146B.m()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            DialogC0450m.a aVar = DialogC0450m.f3859E;
            if (string2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            a7 = aVar.a(n7, string2, format);
            a7.B(new V.d() { // from class: O1.h
                @Override // O1.V.d
                public final void a(Bundle bundle2, C2162o c2162o) {
                    C0446i.Y1(C0446i.this, bundle2, c2162o);
                }
            });
            this.f3846E0 = a7;
        }
    }

    public final void Z1(Bundle bundle, C2162o c2162o) {
        androidx.fragment.app.e n7 = n();
        if (n7 == null) {
            return;
        }
        E e7 = E.f3721a;
        Intent intent = n7.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "fragmentActivity.intent");
        n7.setResult(c2162o == null ? -1 : 0, E.m(intent, bundle, c2162o));
        n7.finish();
    }

    public final void a2(Bundle bundle) {
        androidx.fragment.app.e n7 = n();
        if (n7 == null) {
            return;
        }
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        n7.setResult(-1, intent);
        n7.finish();
    }

    public final void b2(Dialog dialog) {
        this.f3846E0 = dialog;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0782d, androidx.fragment.app.Fragment
    public void m0(Bundle bundle) {
        super.m0(bundle);
        W1();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if ((this.f3846E0 instanceof V) && d0()) {
            Dialog dialog = this.f3846E0;
            if (dialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((V) dialog).x();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0782d, androidx.fragment.app.Fragment
    public void t0() {
        Dialog L12 = L1();
        if (L12 != null && J()) {
            L12.setDismissMessage(null);
        }
        super.t0();
    }
}
