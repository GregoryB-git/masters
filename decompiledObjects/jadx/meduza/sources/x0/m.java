package x0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import b1.k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import u.b;

/* loaded from: classes.dex */
public class m extends b.j implements b.e {
    public static final String LIFECYCLE_TAG = "android:support:lifecycle";
    public boolean mCreated;
    public final b1.p mFragmentLifecycleRegistry;
    public final r mFragments;
    public boolean mResumed;
    public boolean mStopped;

    public class a extends t<m> implements v.c, v.d, u.v, u.w, b1.t0, b.y, d.h, s1.e, c0, e0.j {
        public a() {
            super(m.this);
        }

        @Override // x0.c0
        public final void a(i iVar) {
            m.this.onAttachFragment(iVar);
        }

        @Override // e0.j
        public final void addMenuProvider(e0.o oVar) {
            m.this.addMenuProvider(oVar);
        }

        @Override // v.c
        public final void addOnConfigurationChangedListener(d0.a<Configuration> aVar) {
            m.this.addOnConfigurationChangedListener(aVar);
        }

        @Override // u.v
        public final void addOnMultiWindowModeChangedListener(d0.a<u.l> aVar) {
            m.this.addOnMultiWindowModeChangedListener(aVar);
        }

        @Override // u.w
        public final void addOnPictureInPictureModeChangedListener(d0.a<u.y> aVar) {
            m.this.addOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // v.d
        public final void addOnTrimMemoryListener(d0.a<Integer> aVar) {
            m.this.addOnTrimMemoryListener(aVar);
        }

        @Override // x0.p
        public final View b(int i10) {
            return m.this.findViewById(i10);
        }

        @Override // x0.p
        public final boolean c() {
            Window window = m.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // x0.t
        public final void d(PrintWriter printWriter, String[] strArr) {
            m.this.dump("  ", null, printWriter, strArr);
        }

        @Override // x0.t
        public final m e() {
            return m.this;
        }

        @Override // x0.t
        public final LayoutInflater f() {
            return m.this.getLayoutInflater().cloneInContext(m.this);
        }

        @Override // x0.t
        public final boolean g(String str) {
            return u.b.b(m.this, str);
        }

        @Override // d.h
        public final d.g getActivityResultRegistry() {
            return m.this.getActivityResultRegistry();
        }

        @Override // b1.o
        public final b1.k getLifecycle() {
            return m.this.mFragmentLifecycleRegistry;
        }

        @Override // b.y
        public final b.w getOnBackPressedDispatcher() {
            return m.this.getOnBackPressedDispatcher();
        }

        @Override // s1.e
        public final s1.c getSavedStateRegistry() {
            return m.this.getSavedStateRegistry();
        }

        @Override // b1.t0
        public final b1.s0 getViewModelStore() {
            return m.this.getViewModelStore();
        }

        @Override // x0.t
        public final void i() {
            m.this.invalidateMenu();
        }

        @Override // e0.j
        public final void removeMenuProvider(e0.o oVar) {
            m.this.removeMenuProvider(oVar);
        }

        @Override // v.c
        public final void removeOnConfigurationChangedListener(d0.a<Configuration> aVar) {
            m.this.removeOnConfigurationChangedListener(aVar);
        }

        @Override // u.v
        public final void removeOnMultiWindowModeChangedListener(d0.a<u.l> aVar) {
            m.this.removeOnMultiWindowModeChangedListener(aVar);
        }

        @Override // u.w
        public final void removeOnPictureInPictureModeChangedListener(d0.a<u.y> aVar) {
            m.this.removeOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // v.d
        public final void removeOnTrimMemoryListener(d0.a<Integer> aVar) {
            m.this.removeOnTrimMemoryListener(aVar);
        }
    }

    public m() {
        this.mFragments = new r(new a());
        this.mFragmentLifecycleRegistry = new b1.p(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        int i10 = 0;
        getSavedStateRegistry().c(LIFECYCLE_TAG, new j(this, i10));
        addOnConfigurationChangedListener(new k(this, i10));
        addOnNewIntentListener(new l(this, i10));
        addOnContextAvailableListener(new b.g(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.f(k.a.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$init$3(Context context) {
        t<?> tVar = this.mFragments.f16735a;
        tVar.f16759d.c(tVar, tVar, null);
    }

    private static boolean markState(y yVar, k.b bVar) {
        k.b bVar2 = k.b.STARTED;
        boolean z10 = false;
        for (i iVar : yVar.f16769c.g()) {
            if (iVar != null) {
                if (iVar.getHost() != null) {
                    z10 |= markState(iVar.getChildFragmentManager(), bVar);
                }
                o0 o0Var = iVar.mViewLifecycleOwner;
                if (o0Var != null) {
                    o0Var.b();
                    if (o0Var.f16724d.f1771c.f(bVar2)) {
                        iVar.mViewLifecycleOwner.f16724d.h(bVar);
                        z10 = true;
                    }
                }
                if (iVar.mLifecycleRegistry.f1771c.f(bVar2)) {
                    iVar.mLifecycleRegistry.h(bVar);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f16735a.f16759d.f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                d1.a.a(this).b(str2, printWriter);
            }
            this.mFragments.f16735a.f16759d.w(str, fileDescriptor, printWriter, strArr);
        }
    }

    public y getSupportFragmentManager() {
        return this.mFragments.f16735a.f16759d;
    }

    @Deprecated
    public d1.a getSupportLoaderManager() {
        return d1.a.a(this);
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), k.b.CREATED)) {
        }
    }

    @Override // b.j, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i10, i11, intent);
    }

    @Deprecated
    public void onAttachFragment(i iVar) {
    }

    @Override // b.j, u.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.f(k.a.ON_CREATE);
        z zVar = this.mFragments.f16735a.f16759d;
        zVar.H = false;
        zVar.I = false;
        zVar.O.f16542i = false;
        zVar.v(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f16735a.f16759d.m();
        this.mFragmentLifecycleRegistry.f(k.a.ON_DESTROY);
    }

    @Override // b.j, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.mFragments.f16735a.f16759d.k(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f16735a.f16759d.v(5);
        this.mFragmentLifecycleRegistry.f(k.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // b.j, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f16735a.f16759d.A(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.f(k.a.ON_RESUME);
        z zVar = this.mFragments.f16735a.f16759d;
        zVar.H = false;
        zVar.I = false;
        zVar.O.f16542i = false;
        zVar.v(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            z zVar = this.mFragments.f16735a.f16759d;
            zVar.H = false;
            zVar.I = false;
            zVar.O.f16542i = false;
            zVar.v(4);
        }
        this.mFragments.f16735a.f16759d.A(true);
        this.mFragmentLifecycleRegistry.f(k.a.ON_START);
        z zVar2 = this.mFragments.f16735a.f16759d;
        zVar2.H = false;
        zVar2.I = false;
        zVar2.O.f16542i = false;
        zVar2.v(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        z zVar = this.mFragments.f16735a.f16759d;
        zVar.I = true;
        zVar.O.f16542i = true;
        zVar.v(4);
        this.mFragmentLifecycleRegistry.f(k.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(u.a0 a0Var) {
        int i10 = u.b.f14784a;
        b.a.c(this, a0Var != null ? new b.f(a0Var) : null);
    }

    public void setExitSharedElementCallback(u.a0 a0Var) {
        int i10 = u.b.f14784a;
        b.a.d(this, a0Var != null ? new b.f(a0Var) : null);
    }

    public void startActivityFromFragment(i iVar, Intent intent, int i10) {
        startActivityFromFragment(iVar, intent, i10, (Bundle) null);
    }

    public void startActivityFromFragment(i iVar, Intent intent, int i10, Bundle bundle) {
        if (i10 != -1) {
            iVar.startActivityForResult(intent, i10, bundle);
        } else {
            int i11 = u.b.f14784a;
            startActivityForResult(intent, -1, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(i iVar, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (i10 != -1) {
            iVar.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            int i14 = u.b.f14784a;
            startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        int i10 = u.b.f14784a;
        b.a.a(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        int i10 = u.b.f14784a;
        b.a.b(this);
    }

    public void supportStartPostponedEnterTransition() {
        int i10 = u.b.f14784a;
        b.a.e(this);
    }

    @Override // u.b.e
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }

    public m(int i10) {
        super(i10);
        this.mFragments = new r(new a());
        this.mFragmentLifecycleRegistry = new b1.p(this);
        this.mStopped = true;
        init();
    }
}
