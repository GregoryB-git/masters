package l6;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class h1 extends Fragment implements g {

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f9688b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final i1 f9689a = new i1();

    @Override // l6.g
    public final f a(Class cls, String str) {
        return (f) cls.cast(this.f9689a.f9692a.get(str));
    }

    @Override // l6.g
    public final Activity b() {
        return getActivity();
    }

    @Override // l6.g
    public final void c(String str, f fVar) {
        this.f9689a.a(str, fVar);
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f9689a.f9692a.values().iterator();
        while (it.hasNext()) {
            ((f) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator it = this.f9689a.f9692a.values().iterator();
        while (it.hasNext()) {
            ((f) it.next()).onActivityResult(i10, i11, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9689a.b(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f9689a.c();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f9689a.d();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f9689a.e(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f9689a.f();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f9689a.g();
    }
}
