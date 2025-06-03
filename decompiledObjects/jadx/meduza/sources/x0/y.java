package x0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import b1.k;
import io.meduza.meduza.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import x0.g0;
import x0.r0;

/* loaded from: classes.dex */
public abstract class y {
    public d.f C;
    public d.f D;
    public d.f E;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList<x0.a> L;
    public ArrayList<Boolean> M;
    public ArrayList<x0.i> N;
    public b0 O;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16768b;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<x0.i> f16771e;

    /* renamed from: g, reason: collision with root package name */
    public b.w f16772g;

    /* renamed from: w, reason: collision with root package name */
    public t<?> f16787w;

    /* renamed from: x, reason: collision with root package name */
    public p f16788x;

    /* renamed from: y, reason: collision with root package name */
    public x0.i f16789y;

    /* renamed from: z, reason: collision with root package name */
    public x0.i f16790z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<m> f16767a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final f0 f16769c = new f0();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<x0.a> f16770d = new ArrayList<>();
    public final u f = new u(this);

    /* renamed from: h, reason: collision with root package name */
    public x0.a f16773h = null;

    /* renamed from: i, reason: collision with root package name */
    public final b f16774i = new b();

    /* renamed from: j, reason: collision with root package name */
    public final AtomicInteger f16775j = new AtomicInteger();

    /* renamed from: k, reason: collision with root package name */
    public final Map<String, x0.c> f16776k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l, reason: collision with root package name */
    public final Map<String, Bundle> f16777l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m, reason: collision with root package name */
    public final Map<String, Object> f16778m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n, reason: collision with root package name */
    public ArrayList<l> f16779n = new ArrayList<>();

    /* renamed from: o, reason: collision with root package name */
    public final v f16780o = new v(this);

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList<c0> f16781p = new CopyOnWriteArrayList<>();

    /* renamed from: q, reason: collision with root package name */
    public final w f16782q = new d0.a() { // from class: x0.w
        @Override // d0.a
        public final void accept(Object obj) {
            y yVar = y.this;
            Configuration configuration = (Configuration) obj;
            if (yVar.N()) {
                yVar.j(false, configuration);
            }
        }
    };

    /* renamed from: r, reason: collision with root package name */
    public final x0.k f16783r = new x0.k(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final x0.l f16784s = new x0.l(this, 1);
    public final x t = new d0.a() { // from class: x0.x
        @Override // d0.a
        public final void accept(Object obj) {
            y yVar = y.this;
            u.y yVar2 = (u.y) obj;
            if (yVar.N()) {
                yVar.t(yVar2.f14881a, false);
            }
        }
    };

    /* renamed from: u, reason: collision with root package name */
    public final c f16785u = new c();

    /* renamed from: v, reason: collision with root package name */
    public int f16786v = -1;
    public d A = new d();
    public e B = new e();
    public ArrayDeque<k> F = new ArrayDeque<>();
    public f P = new f();

    public class a implements d.b<Map<String, Boolean>> {
        public a() {
        }

        @Override // d.b
        public final void a(Map<String, Boolean> map) {
            StringBuilder g10;
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            k pollFirst = y.this.F.pollFirst();
            if (pollFirst == null) {
                g10 = new StringBuilder();
                g10.append("No permissions were requested for ");
                g10.append(this);
            } else {
                String str = pollFirst.f16799a;
                int i11 = pollFirst.f16800b;
                x0.i d10 = y.this.f16769c.d(str);
                if (d10 != null) {
                    d10.onRequestPermissionsResult(i11, strArr, iArr);
                    return;
                }
                g10 = defpackage.g.g("Permission request result delivered for unknown Fragment ", str);
            }
            Log.w("FragmentManager", g10.toString());
        }
    }

    public class b extends b.p {
        public b() {
            super(false);
        }

        @Override // b.p
        public final void handleOnBackCancelled() {
            if (y.L(3)) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + y.this);
            }
            y yVar = y.this;
            x0.a aVar = yVar.f16773h;
            if (aVar != null) {
                aVar.f16516q = false;
                aVar.d(false);
                yVar.A(true);
                yVar.F();
                Iterator<l> it = yVar.f16779n.iterator();
                while (it.hasNext()) {
                    it.next().c();
                }
            }
            y.this.f16773h = null;
        }

        @Override // b.p
        public final void handleOnBackPressed() {
            if (y.L(3)) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + y.this);
            }
            y yVar = y.this;
            yVar.A(true);
            if (yVar.f16773h == null) {
                boolean isEnabled = yVar.f16774i.isEnabled();
                boolean L = y.L(3);
                if (isEnabled) {
                    if (L) {
                        Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                    }
                    yVar.R();
                    return;
                } else {
                    if (L) {
                        Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                    }
                    yVar.f16772g.b();
                    return;
                }
            }
            if (!yVar.f16779n.isEmpty()) {
                LinkedHashSet<x0.i> linkedHashSet = new LinkedHashSet(y.G(yVar.f16773h));
                Iterator<l> it = yVar.f16779n.iterator();
                while (it.hasNext()) {
                    l next = it.next();
                    for (x0.i iVar : linkedHashSet) {
                        next.d();
                    }
                }
            }
            Iterator<g0.a> it2 = yVar.f16773h.f16616a.iterator();
            while (it2.hasNext()) {
                x0.i iVar2 = it2.next().f16631b;
                if (iVar2 != null) {
                    iVar2.mTransitioning = false;
                }
            }
            Iterator it3 = yVar.g(new ArrayList(Collections.singletonList(yVar.f16773h)), 0, 1).iterator();
            while (it3.hasNext()) {
                r0 r0Var = (r0) it3.next();
                r0Var.getClass();
                if (y.L(3)) {
                    Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                }
                r0Var.o(r0Var.f16738c);
                r0Var.c(r0Var.f16738c);
            }
            yVar.f16773h = null;
            yVar.f0();
            if (y.L(3)) {
                Log.d("FragmentManager", "Op is being set to null");
                Log.d("FragmentManager", "OnBackPressedCallback enabled=" + yVar.f16774i.isEnabled() + " for  FragmentManager " + yVar);
            }
        }

        @Override // b.p
        public final void handleOnBackProgressed(b.b bVar) {
            if (y.L(2)) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + y.this);
            }
            y yVar = y.this;
            if (yVar.f16773h != null) {
                Iterator it = yVar.g(new ArrayList(Collections.singletonList(y.this.f16773h)), 0, 1).iterator();
                while (it.hasNext()) {
                    r0 r0Var = (r0) it.next();
                    r0Var.getClass();
                    ec.i.e(bVar, "backEvent");
                    if (y.L(2)) {
                        StringBuilder l10 = defpackage.f.l("SpecialEffectsController: Processing Progress ");
                        l10.append(bVar.f1587c);
                        Log.v("FragmentManager", l10.toString());
                    }
                    ArrayList arrayList = r0Var.f16738c;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        sb.o.k(((r0.c) it2.next()).f16753k, arrayList2);
                    }
                    List u10 = sb.q.u(sb.q.x(arrayList2));
                    int size = u10.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((r0.a) u10.get(i10)).d(bVar, r0Var.f16736a);
                    }
                }
                Iterator<l> it3 = y.this.f16779n.iterator();
                while (it3.hasNext()) {
                    it3.next().a();
                }
            }
        }

        @Override // b.p
        public final void handleOnBackStarted(b.b bVar) {
            if (y.L(3)) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + y.this);
            }
            y.this.x();
            y yVar = y.this;
            yVar.getClass();
            yVar.y(yVar.new o(), false);
        }
    }

    public class c implements e0.o {
        public c() {
        }

        @Override // e0.o
        public final boolean a(MenuItem menuItem) {
            return y.this.q(menuItem);
        }

        @Override // e0.o
        public final void b(Menu menu) {
            y.this.r(menu);
        }

        @Override // e0.o
        public final void c(Menu menu, MenuInflater menuInflater) {
            y.this.l(menu, menuInflater);
        }

        @Override // e0.o
        public final void d(Menu menu) {
            y.this.u(menu);
        }
    }

    public class d extends s {
        public d() {
        }
    }

    public class e implements t0 {
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            y.this.A(true);
        }
    }

    public class g implements c0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x0.i f16796a;

        public g(x0.i iVar) {
            this.f16796a = iVar;
        }

        @Override // x0.c0
        public final void a(x0.i iVar) {
            this.f16796a.onAttachFragment(iVar);
        }
    }

    public class h implements d.b<d.a> {
        public h() {
        }

        @Override // d.b
        public final void a(d.a aVar) {
            StringBuilder g10;
            d.a aVar2 = aVar;
            k pollLast = y.this.F.pollLast();
            if (pollLast == null) {
                g10 = new StringBuilder();
                g10.append("No Activities were started for result for ");
                g10.append(this);
            } else {
                String str = pollLast.f16799a;
                int i10 = pollLast.f16800b;
                x0.i d10 = y.this.f16769c.d(str);
                if (d10 != null) {
                    d10.onActivityResult(i10, aVar2.f3305a, aVar2.f3306b);
                    return;
                }
                g10 = defpackage.g.g("Activity result delivered for unknown Fragment ", str);
            }
            Log.w("FragmentManager", g10.toString());
        }
    }

    public class i implements d.b<d.a> {
        public i() {
        }

        @Override // d.b
        public final void a(d.a aVar) {
            StringBuilder g10;
            d.a aVar2 = aVar;
            k pollFirst = y.this.F.pollFirst();
            if (pollFirst == null) {
                g10 = new StringBuilder();
                g10.append("No IntentSenders were started for ");
                g10.append(this);
            } else {
                String str = pollFirst.f16799a;
                int i10 = pollFirst.f16800b;
                x0.i d10 = y.this.f16769c.d(str);
                if (d10 != null) {
                    d10.onActivityResult(i10, aVar2.f3305a, aVar2.f3306b);
                    return;
                }
                g10 = defpackage.g.g("Intent Sender result delivered for unknown Fragment ", str);
            }
            Log.w("FragmentManager", g10.toString());
        }
    }

    public static class j extends e.a<d.i, d.a> {
        @Override // e.a
        public final Intent a(b.j jVar, Object obj) {
            Bundle bundleExtra;
            d.i iVar = (d.i) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = iVar.f3325b;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    IntentSender intentSender = iVar.f3324a;
                    ec.i.e(intentSender, "intentSender");
                    iVar = new d.i(intentSender, null, iVar.f3326c, iVar.f3327d);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", iVar);
            if (y.L(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // e.a
        public final d.a c(int i10, Intent intent) {
            return new d.a(i10, intent);
        }
    }

    public static class k implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public String f16799a;

        /* renamed from: b, reason: collision with root package name */
        public int f16800b;

        public class a implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            public final k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final k[] newArray(int i10) {
                return new k[i10];
            }
        }

        public k(Parcel parcel) {
            this.f16799a = parcel.readString();
            this.f16800b = parcel.readInt();
        }

        public k(String str, int i10) {
            this.f16799a = str;
            this.f16800b = i10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f16799a);
            parcel.writeInt(this.f16800b);
        }
    }

    public interface l {
        void a();

        void b();

        void c();

        void d();

        void onBackStackChanged();
    }

    public interface m {
        boolean a(ArrayList<x0.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    public class n implements m {

        /* renamed from: a, reason: collision with root package name */
        public final int f16801a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16802b = 1;

        public n(int i10) {
            this.f16801a = i10;
        }

        @Override // x0.y.m
        public final boolean a(ArrayList<x0.a> arrayList, ArrayList<Boolean> arrayList2) {
            x0.i iVar = y.this.f16790z;
            if (iVar == null || this.f16801a >= 0 || !iVar.getChildFragmentManager().R()) {
                return y.this.S(arrayList, arrayList2, this.f16801a, this.f16802b);
            }
            return false;
        }
    }

    public class o implements m {
        public o() {
        }

        @Override // x0.y.m
        public final boolean a(ArrayList<x0.a> arrayList, ArrayList<Boolean> arrayList2) {
            y yVar = y.this;
            ArrayList<x0.a> arrayList3 = yVar.f16770d;
            x0.a aVar = arrayList3.get(arrayList3.size() - 1);
            yVar.f16773h = aVar;
            Iterator<g0.a> it = aVar.f16616a.iterator();
            while (it.hasNext()) {
                x0.i iVar = it.next().f16631b;
                if (iVar != null) {
                    iVar.mTransitioning = true;
                }
            }
            boolean S = yVar.S(arrayList, arrayList2, -1, 0);
            y.this.getClass();
            if (!y.this.f16779n.isEmpty() && arrayList.size() > 0) {
                arrayList2.get(arrayList.size() - 1).booleanValue();
                LinkedHashSet<x0.i> linkedHashSet = new LinkedHashSet();
                Iterator<x0.a> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    x0.a next = it2.next();
                    y.this.getClass();
                    linkedHashSet.addAll(y.G(next));
                }
                Iterator<l> it3 = y.this.f16779n.iterator();
                while (it3.hasNext()) {
                    l next2 = it3.next();
                    for (x0.i iVar2 : linkedHashSet) {
                        next2.b();
                    }
                }
            }
            return S;
        }
    }

    public static HashSet G(x0.a aVar) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < aVar.f16616a.size(); i10++) {
            x0.i iVar = aVar.f16616a.get(i10).f16631b;
            if (iVar != null && aVar.f16621g) {
                hashSet.add(iVar);
            }
        }
        return hashSet;
    }

    public static boolean L(int i10) {
        return Log.isLoggable("FragmentManager", i10);
    }

    public static boolean M(x0.i iVar) {
        boolean z10;
        if (iVar.mHasMenu && iVar.mMenuVisible) {
            return true;
        }
        Iterator it = iVar.mChildFragmentManager.f16769c.f().iterator();
        boolean z11 = false;
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            x0.i iVar2 = (x0.i) it.next();
            if (iVar2 != null) {
                z11 = M(iVar2);
            }
            if (z11) {
                z10 = true;
                break;
            }
        }
        return z10;
    }

    public static boolean O(x0.i iVar) {
        if (iVar == null) {
            return true;
        }
        y yVar = iVar.mFragmentManager;
        return iVar.equals(yVar.f16790z) && O(yVar.f16789y);
    }

    public static void c0(x0.i iVar) {
        if (L(2)) {
            Log.v("FragmentManager", "show: " + iVar);
        }
        if (iVar.mHidden) {
            iVar.mHidden = false;
            iVar.mHiddenChanged = !iVar.mHiddenChanged;
        }
    }

    public final boolean A(boolean z10) {
        boolean z11;
        z(z10);
        boolean z12 = false;
        while (true) {
            ArrayList<x0.a> arrayList = this.L;
            ArrayList<Boolean> arrayList2 = this.M;
            synchronized (this.f16767a) {
                if (this.f16767a.isEmpty()) {
                    z11 = false;
                } else {
                    try {
                        int size = this.f16767a.size();
                        z11 = false;
                        for (int i10 = 0; i10 < size; i10++) {
                            z11 |= this.f16767a.get(i10).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z11) {
                break;
            }
            this.f16768b = true;
            try {
                U(this.L, this.M);
                e();
                z12 = true;
            } catch (Throwable th) {
                e();
                throw th;
            }
        }
        f0();
        if (this.K) {
            this.K = false;
            d0();
        }
        this.f16769c.b();
        return z12;
    }

    public final void B(ArrayList<x0.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        y yVar;
        y yVar2;
        x0.i iVar;
        int i12;
        int i13;
        ArrayList<x0.a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        boolean z10 = arrayList3.get(i10).f16629o;
        ArrayList<x0.i> arrayList5 = this.N;
        if (arrayList5 == null) {
            this.N = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.N.addAll(this.f16769c.g());
        x0.i iVar2 = this.f16790z;
        boolean z11 = false;
        int i14 = i10;
        while (true) {
            int i15 = 1;
            if (i14 >= i11) {
                this.N.clear();
                if (!z10 && this.f16786v >= 1) {
                    for (int i16 = i10; i16 < i11; i16++) {
                        Iterator<g0.a> it = arrayList.get(i16).f16616a.iterator();
                        while (it.hasNext()) {
                            x0.i iVar3 = it.next().f16631b;
                            if (iVar3 != null && iVar3.mFragmentManager != null) {
                                this.f16769c.h(h(iVar3));
                            }
                        }
                    }
                }
                for (int i17 = i10; i17 < i11; i17++) {
                    x0.a aVar = arrayList.get(i17);
                    if (arrayList2.get(i17).booleanValue()) {
                        aVar.c(-1);
                        boolean z12 = true;
                        int size = aVar.f16616a.size() - 1;
                        while (size >= 0) {
                            g0.a aVar2 = aVar.f16616a.get(size);
                            x0.i iVar4 = aVar2.f16631b;
                            if (iVar4 != null) {
                                iVar4.mBeingSaved = false;
                                iVar4.setPopDirection(z12);
                                int i18 = aVar.f;
                                int i19 = 8197;
                                int i20 = 8194;
                                if (i18 != 4097) {
                                    if (i18 == 8194) {
                                        i19 = 4097;
                                    } else if (i18 != 8197) {
                                        i20 = 4099;
                                        if (i18 != 4099) {
                                            if (i18 != 4100) {
                                                i19 = 0;
                                            }
                                        }
                                    } else {
                                        i19 = 4100;
                                    }
                                    iVar4.setNextTransition(i19);
                                    iVar4.setSharedElementNames(aVar.f16628n, aVar.f16627m);
                                }
                                i19 = i20;
                                iVar4.setNextTransition(i19);
                                iVar4.setSharedElementNames(aVar.f16628n, aVar.f16627m);
                            }
                            switch (aVar2.f16630a) {
                                case 1:
                                    iVar4.setAnimations(aVar2.f16633d, aVar2.f16634e, aVar2.f, aVar2.f16635g);
                                    aVar.f16515p.Y(iVar4, true);
                                    aVar.f16515p.T(iVar4);
                                    size--;
                                    z12 = true;
                                case 2:
                                default:
                                    StringBuilder l10 = defpackage.f.l("Unknown cmd: ");
                                    l10.append(aVar2.f16630a);
                                    throw new IllegalArgumentException(l10.toString());
                                case 3:
                                    iVar4.setAnimations(aVar2.f16633d, aVar2.f16634e, aVar2.f, aVar2.f16635g);
                                    aVar.f16515p.a(iVar4);
                                    size--;
                                    z12 = true;
                                case 4:
                                    iVar4.setAnimations(aVar2.f16633d, aVar2.f16634e, aVar2.f, aVar2.f16635g);
                                    aVar.f16515p.getClass();
                                    c0(iVar4);
                                    size--;
                                    z12 = true;
                                case 5:
                                    iVar4.setAnimations(aVar2.f16633d, aVar2.f16634e, aVar2.f, aVar2.f16635g);
                                    aVar.f16515p.Y(iVar4, true);
                                    aVar.f16515p.K(iVar4);
                                    size--;
                                    z12 = true;
                                case 6:
                                    iVar4.setAnimations(aVar2.f16633d, aVar2.f16634e, aVar2.f, aVar2.f16635g);
                                    aVar.f16515p.d(iVar4);
                                    size--;
                                    z12 = true;
                                case 7:
                                    iVar4.setAnimations(aVar2.f16633d, aVar2.f16634e, aVar2.f, aVar2.f16635g);
                                    aVar.f16515p.Y(iVar4, true);
                                    aVar.f16515p.i(iVar4);
                                    size--;
                                    z12 = true;
                                case 8:
                                    yVar2 = aVar.f16515p;
                                    iVar4 = null;
                                    yVar2.a0(iVar4);
                                    size--;
                                    z12 = true;
                                case 9:
                                    yVar2 = aVar.f16515p;
                                    yVar2.a0(iVar4);
                                    size--;
                                    z12 = true;
                                case 10:
                                    aVar.f16515p.Z(iVar4, aVar2.f16636h);
                                    size--;
                                    z12 = true;
                            }
                        }
                    } else {
                        aVar.c(1);
                        int size2 = aVar.f16616a.size();
                        for (int i21 = 0; i21 < size2; i21++) {
                            g0.a aVar3 = aVar.f16616a.get(i21);
                            x0.i iVar5 = aVar3.f16631b;
                            if (iVar5 != null) {
                                iVar5.mBeingSaved = false;
                                iVar5.setPopDirection(false);
                                iVar5.setNextTransition(aVar.f);
                                iVar5.setSharedElementNames(aVar.f16627m, aVar.f16628n);
                            }
                            switch (aVar3.f16630a) {
                                case 1:
                                    iVar5.setAnimations(aVar3.f16633d, aVar3.f16634e, aVar3.f, aVar3.f16635g);
                                    aVar.f16515p.Y(iVar5, false);
                                    aVar.f16515p.a(iVar5);
                                case 2:
                                default:
                                    StringBuilder l11 = defpackage.f.l("Unknown cmd: ");
                                    l11.append(aVar3.f16630a);
                                    throw new IllegalArgumentException(l11.toString());
                                case 3:
                                    iVar5.setAnimations(aVar3.f16633d, aVar3.f16634e, aVar3.f, aVar3.f16635g);
                                    aVar.f16515p.T(iVar5);
                                case 4:
                                    iVar5.setAnimations(aVar3.f16633d, aVar3.f16634e, aVar3.f, aVar3.f16635g);
                                    aVar.f16515p.K(iVar5);
                                case 5:
                                    iVar5.setAnimations(aVar3.f16633d, aVar3.f16634e, aVar3.f, aVar3.f16635g);
                                    aVar.f16515p.Y(iVar5, false);
                                    aVar.f16515p.getClass();
                                    c0(iVar5);
                                case 6:
                                    iVar5.setAnimations(aVar3.f16633d, aVar3.f16634e, aVar3.f, aVar3.f16635g);
                                    aVar.f16515p.i(iVar5);
                                case 7:
                                    iVar5.setAnimations(aVar3.f16633d, aVar3.f16634e, aVar3.f, aVar3.f16635g);
                                    aVar.f16515p.Y(iVar5, false);
                                    aVar.f16515p.d(iVar5);
                                case 8:
                                    yVar = aVar.f16515p;
                                    yVar.a0(iVar5);
                                case 9:
                                    yVar = aVar.f16515p;
                                    iVar5 = null;
                                    yVar.a0(iVar5);
                                case 10:
                                    aVar.f16515p.Z(iVar5, aVar3.f16637i);
                            }
                        }
                    }
                }
                boolean booleanValue = arrayList2.get(i11 - 1).booleanValue();
                if (z11 && !this.f16779n.isEmpty()) {
                    LinkedHashSet<x0.i> linkedHashSet = new LinkedHashSet();
                    Iterator<x0.a> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(G(it2.next()));
                    }
                    if (this.f16773h == null) {
                        Iterator<l> it3 = this.f16779n.iterator();
                        while (it3.hasNext()) {
                            l next = it3.next();
                            for (x0.i iVar6 : linkedHashSet) {
                                next.b();
                            }
                        }
                        Iterator<l> it4 = this.f16779n.iterator();
                        while (it4.hasNext()) {
                            l next2 = it4.next();
                            for (x0.i iVar7 : linkedHashSet) {
                                next2.d();
                            }
                        }
                    }
                }
                for (int i22 = i10; i22 < i11; i22++) {
                    x0.a aVar4 = arrayList.get(i22);
                    if (booleanValue) {
                        for (int size3 = aVar4.f16616a.size() - 1; size3 >= 0; size3--) {
                            x0.i iVar8 = aVar4.f16616a.get(size3).f16631b;
                            if (iVar8 != null) {
                                h(iVar8).k();
                            }
                        }
                    } else {
                        Iterator<g0.a> it5 = aVar4.f16616a.iterator();
                        while (it5.hasNext()) {
                            x0.i iVar9 = it5.next().f16631b;
                            if (iVar9 != null) {
                                h(iVar9).k();
                            }
                        }
                    }
                }
                P(this.f16786v, true);
                int i23 = i10;
                Iterator it6 = g(arrayList, i23, i11).iterator();
                while (it6.hasNext()) {
                    r0 r0Var = (r0) it6.next();
                    r0Var.f16739d = booleanValue;
                    r0Var.n();
                    r0Var.i();
                }
                while (i23 < i11) {
                    x0.a aVar5 = arrayList.get(i23);
                    if (arrayList2.get(i23).booleanValue() && aVar5.f16517r >= 0) {
                        aVar5.f16517r = -1;
                    }
                    aVar5.getClass();
                    i23++;
                }
                if (z11) {
                    for (int i24 = 0; i24 < this.f16779n.size(); i24++) {
                        this.f16779n.get(i24).onBackStackChanged();
                    }
                    return;
                }
                return;
            }
            x0.a aVar6 = arrayList3.get(i14);
            int i25 = 3;
            if (arrayList4.get(i14).booleanValue()) {
                ArrayList<x0.i> arrayList6 = this.N;
                int size4 = aVar6.f16616a.size() - 1;
                while (size4 >= 0) {
                    g0.a aVar7 = aVar6.f16616a.get(size4);
                    int i26 = aVar7.f16630a;
                    if (i26 != i15) {
                        if (i26 != 3) {
                            switch (i26) {
                                case 8:
                                    iVar = null;
                                    iVar2 = iVar;
                                    break;
                                case 9:
                                    iVar = aVar7.f16631b;
                                    iVar2 = iVar;
                                    break;
                                case 10:
                                    aVar7.f16637i = aVar7.f16636h;
                                    break;
                            }
                            size4--;
                            i15 = 1;
                        }
                        arrayList6.add(aVar7.f16631b);
                        size4--;
                        i15 = 1;
                    }
                    arrayList6.remove(aVar7.f16631b);
                    size4--;
                    i15 = 1;
                }
            } else {
                ArrayList<x0.i> arrayList7 = this.N;
                int i27 = 0;
                while (i27 < aVar6.f16616a.size()) {
                    g0.a aVar8 = aVar6.f16616a.get(i27);
                    int i28 = aVar8.f16630a;
                    if (i28 != i15) {
                        if (i28 == 2) {
                            x0.i iVar10 = aVar8.f16631b;
                            int i29 = iVar10.mContainerId;
                            int size5 = arrayList7.size() - 1;
                            boolean z13 = false;
                            while (size5 >= 0) {
                                x0.i iVar11 = arrayList7.get(size5);
                                if (iVar11.mContainerId == i29) {
                                    if (iVar11 == iVar10) {
                                        z13 = true;
                                    } else {
                                        if (iVar11 == iVar2) {
                                            i13 = i29;
                                            aVar6.f16616a.add(i27, new g0.a(9, iVar11));
                                            i27++;
                                            iVar2 = null;
                                        } else {
                                            i13 = i29;
                                        }
                                        g0.a aVar9 = new g0.a(3, iVar11);
                                        aVar9.f16633d = aVar8.f16633d;
                                        aVar9.f = aVar8.f;
                                        aVar9.f16634e = aVar8.f16634e;
                                        aVar9.f16635g = aVar8.f16635g;
                                        aVar6.f16616a.add(i27, aVar9);
                                        arrayList7.remove(iVar11);
                                        i27++;
                                        size5--;
                                        i29 = i13;
                                    }
                                }
                                i13 = i29;
                                size5--;
                                i29 = i13;
                            }
                            if (z13) {
                                aVar6.f16616a.remove(i27);
                                i27--;
                            } else {
                                i12 = 1;
                                aVar8.f16630a = 1;
                                aVar8.f16632c = true;
                                arrayList7.add(iVar10);
                                i15 = i12;
                                i27 += i15;
                                i25 = 3;
                            }
                        } else if (i28 == i25 || i28 == 6) {
                            arrayList7.remove(aVar8.f16631b);
                            x0.i iVar12 = aVar8.f16631b;
                            if (iVar12 == iVar2) {
                                aVar6.f16616a.add(i27, new g0.a(iVar12, 9));
                                i27++;
                                iVar2 = null;
                                i15 = 1;
                                i27 += i15;
                                i25 = 3;
                            }
                        } else if (i28 == 7) {
                            i15 = 1;
                        } else if (i28 == 8) {
                            aVar6.f16616a.add(i27, new g0.a(9, iVar2));
                            aVar8.f16632c = true;
                            i27++;
                            iVar2 = aVar8.f16631b;
                        }
                        i12 = 1;
                        i15 = i12;
                        i27 += i15;
                        i25 = 3;
                    }
                    arrayList7.add(aVar8.f16631b);
                    i27 += i15;
                    i25 = 3;
                }
            }
            z11 = z11 || aVar6.f16621g;
            i14++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
        }
    }

    public final x0.i C(String str) {
        return this.f16769c.c(str);
    }

    public final x0.i D(int i10) {
        f0 f0Var = this.f16769c;
        int size = ((ArrayList) f0Var.f16608a).size();
        while (true) {
            size--;
            if (size < 0) {
                for (e0 e0Var : ((HashMap) f0Var.f16609b).values()) {
                    if (e0Var != null) {
                        x0.i iVar = e0Var.f16601c;
                        if (iVar.mFragmentId == i10) {
                            return iVar;
                        }
                    }
                }
                return null;
            }
            x0.i iVar2 = (x0.i) ((ArrayList) f0Var.f16608a).get(size);
            if (iVar2 != null && iVar2.mFragmentId == i10) {
                return iVar2;
            }
        }
    }

    public final x0.i E(String str) {
        f0 f0Var = this.f16769c;
        int size = ((ArrayList) f0Var.f16608a).size();
        while (true) {
            size--;
            if (size < 0) {
                for (e0 e0Var : ((HashMap) f0Var.f16609b).values()) {
                    if (e0Var != null) {
                        x0.i iVar = e0Var.f16601c;
                        if (str.equals(iVar.mTag)) {
                            return iVar;
                        }
                    }
                }
                return null;
            }
            x0.i iVar2 = (x0.i) ((ArrayList) f0Var.f16608a).get(size);
            if (iVar2 != null && str.equals(iVar2.mTag)) {
                return iVar2;
            }
        }
    }

    public final void F() {
        Iterator it = f().iterator();
        while (it.hasNext()) {
            r0 r0Var = (r0) it.next();
            if (r0Var.f16740e) {
                if (L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                r0Var.f16740e = false;
                r0Var.i();
            }
        }
    }

    public final ViewGroup H(x0.i iVar) {
        ViewGroup viewGroup = iVar.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (iVar.mContainerId > 0 && this.f16788x.c()) {
            View b10 = this.f16788x.b(iVar.mContainerId);
            if (b10 instanceof ViewGroup) {
                return (ViewGroup) b10;
            }
        }
        return null;
    }

    public final s I() {
        x0.i iVar = this.f16789y;
        return iVar != null ? iVar.mFragmentManager.I() : this.A;
    }

    public final t0 J() {
        x0.i iVar = this.f16789y;
        return iVar != null ? iVar.mFragmentManager.J() : this.B;
    }

    public final void K(x0.i iVar) {
        if (L(2)) {
            Log.v("FragmentManager", "hide: " + iVar);
        }
        if (iVar.mHidden) {
            return;
        }
        iVar.mHidden = true;
        iVar.mHiddenChanged = true ^ iVar.mHiddenChanged;
        b0(iVar);
    }

    public final boolean N() {
        x0.i iVar = this.f16789y;
        if (iVar == null) {
            return true;
        }
        return iVar.isAdded() && this.f16789y.getParentFragmentManager().N();
    }

    public final void P(int i10, boolean z10) {
        t<?> tVar;
        if (this.f16787w == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f16786v) {
            this.f16786v = i10;
            f0 f0Var = this.f16769c;
            Iterator it = ((ArrayList) f0Var.f16608a).iterator();
            while (it.hasNext()) {
                e0 e0Var = (e0) ((HashMap) f0Var.f16609b).get(((x0.i) it.next()).mWho);
                if (e0Var != null) {
                    e0Var.k();
                }
            }
            Iterator it2 = ((HashMap) f0Var.f16609b).values().iterator();
            while (true) {
                boolean z11 = false;
                if (!it2.hasNext()) {
                    break;
                }
                e0 e0Var2 = (e0) it2.next();
                if (e0Var2 != null) {
                    e0Var2.k();
                    x0.i iVar = e0Var2.f16601c;
                    if (iVar.mRemoving && !iVar.isInBackStack()) {
                        z11 = true;
                    }
                    if (z11) {
                        if (iVar.mBeingSaved && !((HashMap) f0Var.f16610c).containsKey(iVar.mWho)) {
                            f0Var.j(e0Var2.o(), iVar.mWho);
                        }
                        f0Var.i(e0Var2);
                    }
                }
            }
            d0();
            if (this.G && (tVar = this.f16787w) != null && this.f16786v == 7) {
                tVar.i();
                this.G = false;
            }
        }
    }

    public final void Q() {
        if (this.f16787w == null) {
            return;
        }
        this.H = false;
        this.I = false;
        this.O.f16542i = false;
        for (x0.i iVar : this.f16769c.g()) {
            if (iVar != null) {
                iVar.noteStateNotSaved();
            }
        }
    }

    public final boolean R() {
        A(false);
        z(true);
        x0.i iVar = this.f16790z;
        if (iVar != null && iVar.getChildFragmentManager().R()) {
            return true;
        }
        boolean S = S(this.L, this.M, -1, 0);
        if (S) {
            this.f16768b = true;
            try {
                U(this.L, this.M);
            } finally {
                e();
            }
        }
        f0();
        if (this.K) {
            this.K = false;
            d0();
        }
        this.f16769c.b();
        return S;
    }

    public final boolean S(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        boolean z10 = (i11 & 1) != 0;
        int i12 = -1;
        if (!this.f16770d.isEmpty()) {
            if (i10 < 0) {
                i12 = z10 ? 0 : (-1) + this.f16770d.size();
            } else {
                int size = this.f16770d.size() - 1;
                while (size >= 0) {
                    x0.a aVar = this.f16770d.get(size);
                    if (i10 >= 0 && i10 == aVar.f16517r) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z10) {
                        while (size > 0) {
                            int i13 = size - 1;
                            x0.a aVar2 = this.f16770d.get(i13);
                            if (i10 < 0 || i10 != aVar2.f16517r) {
                                break;
                            }
                            size = i13;
                        }
                    } else if (size != this.f16770d.size() - 1) {
                        size++;
                    }
                }
                i12 = size;
            }
        }
        if (i12 < 0) {
            return false;
        }
        for (int size2 = this.f16770d.size() - 1; size2 >= i12; size2--) {
            arrayList.add(this.f16770d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void T(x0.i iVar) {
        if (L(2)) {
            Log.v("FragmentManager", "remove: " + iVar + " nesting=" + iVar.mBackStackNesting);
        }
        boolean z10 = !iVar.isInBackStack();
        if (!iVar.mDetached || z10) {
            f0 f0Var = this.f16769c;
            synchronized (((ArrayList) f0Var.f16608a)) {
                ((ArrayList) f0Var.f16608a).remove(iVar);
            }
            iVar.mAdded = false;
            if (M(iVar)) {
                this.G = true;
            }
            iVar.mRemoving = true;
            b0(iVar);
        }
    }

    public final void U(ArrayList<x0.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!arrayList.get(i10).f16629o) {
                if (i11 != i10) {
                    B(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (arrayList2.get(i10).booleanValue()) {
                    while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f16629o) {
                        i11++;
                    }
                }
                B(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            B(arrayList, arrayList2, i11, size);
        }
    }

    public final void V(Bundle bundle) {
        int i10;
        e0 e0Var;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f16787w.f16757b.getClassLoader());
                this.f16777l.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f16787w.f16757b.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        f0 f0Var = this.f16769c;
        ((HashMap) f0Var.f16610c).clear();
        ((HashMap) f0Var.f16610c).putAll(hashMap);
        a0 a0Var = (a0) bundle.getParcelable("state");
        if (a0Var == null) {
            return;
        }
        ((HashMap) this.f16769c.f16609b).clear();
        Iterator<String> it = a0Var.f16518a.iterator();
        while (it.hasNext()) {
            Bundle j10 = this.f16769c.j(null, it.next());
            if (j10 != null) {
                x0.i iVar = this.O.f16538d.get(((d0) j10.getParcelable("state")).f16550b);
                if (iVar != null) {
                    if (L(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + iVar);
                    }
                    e0Var = new e0(this.f16780o, this.f16769c, iVar, j10);
                } else {
                    e0Var = new e0(this.f16780o, this.f16769c, this.f16787w.f16757b.getClassLoader(), I(), j10);
                }
                x0.i iVar2 = e0Var.f16601c;
                iVar2.mSavedFragmentState = j10;
                iVar2.mFragmentManager = this;
                if (L(2)) {
                    StringBuilder l10 = defpackage.f.l("restoreSaveState: active (");
                    l10.append(iVar2.mWho);
                    l10.append("): ");
                    l10.append(iVar2);
                    Log.v("FragmentManager", l10.toString());
                }
                e0Var.m(this.f16787w.f16757b.getClassLoader());
                this.f16769c.h(e0Var);
                e0Var.f16603e = this.f16786v;
            }
        }
        b0 b0Var = this.O;
        b0Var.getClass();
        Iterator it2 = new ArrayList(b0Var.f16538d.values()).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            x0.i iVar3 = (x0.i) it2.next();
            if ((((HashMap) this.f16769c.f16609b).get(iVar3.mWho) != null ? 1 : 0) == 0) {
                if (L(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + iVar3 + " that was not found in the set of active Fragments " + a0Var.f16518a);
                }
                this.O.g(iVar3);
                iVar3.mFragmentManager = this;
                e0 e0Var2 = new e0(this.f16780o, this.f16769c, iVar3);
                e0Var2.f16603e = 1;
                e0Var2.k();
                iVar3.mRemoving = true;
                e0Var2.k();
            }
        }
        f0 f0Var2 = this.f16769c;
        ArrayList<String> arrayList = a0Var.f16519b;
        ((ArrayList) f0Var2.f16608a).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                x0.i c10 = f0Var2.c(str3);
                if (c10 == null) {
                    throw new IllegalStateException(defpackage.g.e("No instantiated fragment for (", str3, ")"));
                }
                if (L(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + c10);
                }
                f0Var2.a(c10);
            }
        }
        if (a0Var.f16520c != null) {
            this.f16770d = new ArrayList<>(a0Var.f16520c.length);
            int i11 = 0;
            while (true) {
                x0.b[] bVarArr = a0Var.f16520c;
                if (i11 >= bVarArr.length) {
                    break;
                }
                x0.b bVar = bVarArr[i11];
                bVar.getClass();
                x0.a aVar = new x0.a(this);
                int i12 = 0;
                int i13 = 0;
                while (i12 < bVar.f16525a.length) {
                    g0.a aVar2 = new g0.a();
                    int i14 = i12 + 1;
                    aVar2.f16630a = bVar.f16525a[i12];
                    if (L(2)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i13 + " base fragment #" + bVar.f16525a[i14]);
                    }
                    aVar2.f16636h = k.b.values()[bVar.f16527c[i13]];
                    aVar2.f16637i = k.b.values()[bVar.f16528d[i13]];
                    int[] iArr = bVar.f16525a;
                    int i15 = i14 + 1;
                    aVar2.f16632c = iArr[i14] != 0;
                    int i16 = i15 + 1;
                    int i17 = iArr[i15];
                    aVar2.f16633d = i17;
                    int i18 = i16 + 1;
                    int i19 = iArr[i16];
                    aVar2.f16634e = i19;
                    int i20 = i18 + 1;
                    int i21 = iArr[i18];
                    aVar2.f = i21;
                    int i22 = iArr[i20];
                    aVar2.f16635g = i22;
                    aVar.f16617b = i17;
                    aVar.f16618c = i19;
                    aVar.f16619d = i21;
                    aVar.f16620e = i22;
                    aVar.b(aVar2);
                    i13++;
                    i12 = i20 + 1;
                }
                aVar.f = bVar.f16529e;
                aVar.f16622h = bVar.f;
                aVar.f16621g = true;
                aVar.f16623i = bVar.f16531p;
                aVar.f16624j = bVar.f16532q;
                aVar.f16625k = bVar.f16533r;
                aVar.f16626l = bVar.f16534s;
                aVar.f16627m = bVar.t;
                aVar.f16628n = bVar.f16535u;
                aVar.f16629o = bVar.f16536v;
                aVar.f16517r = bVar.f16530o;
                for (int i23 = 0; i23 < bVar.f16526b.size(); i23++) {
                    String str4 = bVar.f16526b.get(i23);
                    if (str4 != null) {
                        aVar.f16616a.get(i23).f16631b = C(str4);
                    }
                }
                aVar.c(1);
                if (L(2)) {
                    StringBuilder n2 = a0.j.n("restoreAllState: back stack #", i11, " (index ");
                    n2.append(aVar.f16517r);
                    n2.append("): ");
                    n2.append(aVar);
                    Log.v("FragmentManager", n2.toString());
                    PrintWriter printWriter = new PrintWriter(new p0());
                    aVar.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f16770d.add(aVar);
                i11++;
            }
        } else {
            this.f16770d = new ArrayList<>();
        }
        this.f16775j.set(a0Var.f16521d);
        String str5 = a0Var.f16522e;
        if (str5 != null) {
            x0.i C = C(str5);
            this.f16790z = C;
            s(C);
        }
        ArrayList<String> arrayList2 = a0Var.f;
        if (arrayList2 != null) {
            while (i10 < arrayList2.size()) {
                this.f16776k.put(arrayList2.get(i10), a0Var.f16523o.get(i10));
                i10++;
            }
        }
        this.F = new ArrayDeque<>(a0Var.f16524p);
    }

    public final Bundle W() {
        x0.b[] bVarArr;
        ArrayList<String> arrayList;
        Bundle bundle = new Bundle();
        F();
        x();
        A(true);
        this.H = true;
        this.O.f16542i = true;
        f0 f0Var = this.f16769c;
        f0Var.getClass();
        ArrayList<String> arrayList2 = new ArrayList<>(((HashMap) f0Var.f16609b).size());
        for (e0 e0Var : ((HashMap) f0Var.f16609b).values()) {
            if (e0Var != null) {
                x0.i iVar = e0Var.f16601c;
                f0Var.j(e0Var.o(), iVar.mWho);
                arrayList2.add(iVar.mWho);
                if (L(2)) {
                    Log.v("FragmentManager", "Saved state of " + iVar + ": " + iVar.mSavedFragmentState);
                }
            }
        }
        HashMap hashMap = (HashMap) this.f16769c.f16610c;
        if (!hashMap.isEmpty()) {
            f0 f0Var2 = this.f16769c;
            synchronized (((ArrayList) f0Var2.f16608a)) {
                bVarArr = null;
                if (((ArrayList) f0Var2.f16608a).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(((ArrayList) f0Var2.f16608a).size());
                    Iterator it = ((ArrayList) f0Var2.f16608a).iterator();
                    while (it.hasNext()) {
                        x0.i iVar2 = (x0.i) it.next();
                        arrayList.add(iVar2.mWho);
                        if (L(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + iVar2.mWho + "): " + iVar2);
                        }
                    }
                }
            }
            int size = this.f16770d.size();
            if (size > 0) {
                bVarArr = new x0.b[size];
                for (int i10 = 0; i10 < size; i10++) {
                    bVarArr[i10] = new x0.b(this.f16770d.get(i10));
                    if (L(2)) {
                        StringBuilder n2 = a0.j.n("saveAllState: adding back stack #", i10, ": ");
                        n2.append(this.f16770d.get(i10));
                        Log.v("FragmentManager", n2.toString());
                    }
                }
            }
            a0 a0Var = new a0();
            a0Var.f16518a = arrayList2;
            a0Var.f16519b = arrayList;
            a0Var.f16520c = bVarArr;
            a0Var.f16521d = this.f16775j.get();
            x0.i iVar3 = this.f16790z;
            if (iVar3 != null) {
                a0Var.f16522e = iVar3.mWho;
            }
            a0Var.f.addAll(this.f16776k.keySet());
            a0Var.f16523o.addAll(this.f16776k.values());
            a0Var.f16524p = new ArrayList<>(this.F);
            bundle.putParcelable("state", a0Var);
            for (String str : this.f16777l.keySet()) {
                bundle.putBundle(defpackage.g.d("result_", str), this.f16777l.get(str));
            }
            for (String str2 : hashMap.keySet()) {
                bundle.putBundle(defpackage.g.d("fragment_", str2), (Bundle) hashMap.get(str2));
            }
        } else if (L(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void X() {
        synchronized (this.f16767a) {
            boolean z10 = true;
            if (this.f16767a.size() != 1) {
                z10 = false;
            }
            if (z10) {
                this.f16787w.f16758c.removeCallbacks(this.P);
                this.f16787w.f16758c.post(this.P);
                f0();
            }
        }
    }

    public final void Y(x0.i iVar, boolean z10) {
        ViewGroup H = H(iVar);
        if (H == null || !(H instanceof q)) {
            return;
        }
        ((q) H).setDrawDisappearingViewsLast(!z10);
    }

    public final void Z(x0.i iVar, k.b bVar) {
        if (iVar.equals(C(iVar.mWho)) && (iVar.mHost == null || iVar.mFragmentManager == this)) {
            iVar.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + iVar + " is not an active fragment of FragmentManager " + this);
    }

    public final e0 a(x0.i iVar) {
        String str = iVar.mPreviousWho;
        if (str != null) {
            y0.b.d(iVar, str);
        }
        if (L(2)) {
            Log.v("FragmentManager", "add: " + iVar);
        }
        e0 h10 = h(iVar);
        iVar.mFragmentManager = this;
        this.f16769c.h(h10);
        if (!iVar.mDetached) {
            this.f16769c.a(iVar);
            iVar.mRemoving = false;
            if (iVar.mView == null) {
                iVar.mHiddenChanged = false;
            }
            if (M(iVar)) {
                this.G = true;
            }
        }
        return h10;
    }

    public final void a0(x0.i iVar) {
        if (iVar == null || (iVar.equals(C(iVar.mWho)) && (iVar.mHost == null || iVar.mFragmentManager == this))) {
            x0.i iVar2 = this.f16790z;
            this.f16790z = iVar;
            s(iVar2);
            s(this.f16790z);
            return;
        }
        throw new IllegalArgumentException("Fragment " + iVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void b(c0 c0Var) {
        this.f16781p.add(c0Var);
    }

    public final void b0(x0.i iVar) {
        ViewGroup H = H(iVar);
        if (H != null) {
            if (iVar.getPopExitAnim() + iVar.getPopEnterAnim() + iVar.getExitAnim() + iVar.getEnterAnim() > 0) {
                if (H.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    H.setTag(R.id.visible_removing_fragment_view_tag, iVar);
                }
                ((x0.i) H.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(iVar.getPopDirection());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(x0.t<?> r4, x0.p r5, x0.i r6) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.y.c(x0.t, x0.p, x0.i):void");
    }

    public final void d(x0.i iVar) {
        if (L(2)) {
            Log.v("FragmentManager", "attach: " + iVar);
        }
        if (iVar.mDetached) {
            iVar.mDetached = false;
            if (iVar.mAdded) {
                return;
            }
            this.f16769c.a(iVar);
            if (L(2)) {
                Log.v("FragmentManager", "add from attach: " + iVar);
            }
            if (M(iVar)) {
                this.G = true;
            }
        }
    }

    public final void d0() {
        Iterator it = this.f16769c.e().iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            x0.i iVar = e0Var.f16601c;
            if (iVar.mDeferStart) {
                if (this.f16768b) {
                    this.K = true;
                } else {
                    iVar.mDeferStart = false;
                    e0Var.k();
                }
            }
        }
    }

    public final void e() {
        this.f16768b = false;
        this.M.clear();
        this.L.clear();
    }

    public final void e0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new p0());
        t<?> tVar = this.f16787w;
        try {
            if (tVar != null) {
                tVar.d(printWriter, new String[0]);
            } else {
                w("  ", null, printWriter, new String[0]);
            }
            throw illegalStateException;
        } catch (Exception e10) {
            Log.e("FragmentManager", "Failed dumping state", e10);
            throw illegalStateException;
        }
    }

    public final HashSet f() {
        Object eVar;
        HashSet hashSet = new HashSet();
        Iterator it = this.f16769c.e().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((e0) it.next()).f16601c.mContainer;
            if (viewGroup != null) {
                ec.i.e(J(), "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof r0) {
                    eVar = (r0) tag;
                } else {
                    eVar = new x0.e(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, eVar);
                }
                hashSet.add(eVar);
            }
        }
        return hashSet;
    }

    public final void f0() {
        synchronized (this.f16767a) {
            if (!this.f16767a.isEmpty()) {
                this.f16774i.setEnabled(true);
                if (L(3)) {
                    Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                }
                return;
            }
            boolean z10 = this.f16770d.size() + (this.f16773h != null ? 1 : 0) > 0 && O(this.f16789y);
            if (L(3)) {
                Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z10);
            }
            this.f16774i.setEnabled(z10);
        }
    }

    public final HashSet g(ArrayList arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator<g0.a> it = ((x0.a) arrayList.get(i10)).f16616a.iterator();
            while (it.hasNext()) {
                x0.i iVar = it.next().f16631b;
                if (iVar != null && (viewGroup = iVar.mContainer) != null) {
                    hashSet.add(r0.m(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    public final e0 h(x0.i iVar) {
        f0 f0Var = this.f16769c;
        e0 e0Var = (e0) ((HashMap) f0Var.f16609b).get(iVar.mWho);
        if (e0Var != null) {
            return e0Var;
        }
        e0 e0Var2 = new e0(this.f16780o, this.f16769c, iVar);
        e0Var2.m(this.f16787w.f16757b.getClassLoader());
        e0Var2.f16603e = this.f16786v;
        return e0Var2;
    }

    public final void i(x0.i iVar) {
        if (L(2)) {
            Log.v("FragmentManager", "detach: " + iVar);
        }
        if (iVar.mDetached) {
            return;
        }
        iVar.mDetached = true;
        if (iVar.mAdded) {
            if (L(2)) {
                Log.v("FragmentManager", "remove from detach: " + iVar);
            }
            f0 f0Var = this.f16769c;
            synchronized (((ArrayList) f0Var.f16608a)) {
                ((ArrayList) f0Var.f16608a).remove(iVar);
            }
            iVar.mAdded = false;
            if (M(iVar)) {
                this.G = true;
            }
            b0(iVar);
        }
    }

    public final void j(boolean z10, Configuration configuration) {
        if (z10 && (this.f16787w instanceof v.c)) {
            e0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (x0.i iVar : this.f16769c.g()) {
            if (iVar != null) {
                iVar.performConfigurationChanged(configuration);
                if (z10) {
                    iVar.mChildFragmentManager.j(true, configuration);
                }
            }
        }
    }

    public final boolean k(MenuItem menuItem) {
        if (this.f16786v < 1) {
            return false;
        }
        for (x0.i iVar : this.f16769c.g()) {
            if (iVar != null && iVar.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean l(Menu menu, MenuInflater menuInflater) {
        if (this.f16786v < 1) {
            return false;
        }
        ArrayList<x0.i> arrayList = null;
        boolean z10 = false;
        for (x0.i iVar : this.f16769c.g()) {
            if (iVar != null && iVar.isMenuVisible() && iVar.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(iVar);
                z10 = true;
            }
        }
        if (this.f16771e != null) {
            for (int i10 = 0; i10 < this.f16771e.size(); i10++) {
                x0.i iVar2 = this.f16771e.get(i10);
                if (arrayList == null || !arrayList.contains(iVar2)) {
                    iVar2.onDestroyOptionsMenu();
                }
            }
        }
        this.f16771e = arrayList;
        return z10;
    }

    public final void m() {
        boolean z10 = true;
        this.J = true;
        A(true);
        x();
        t<?> tVar = this.f16787w;
        if (tVar instanceof b1.t0) {
            z10 = ((b0) this.f16769c.f16611d).f16541h;
        } else {
            Context context = tVar.f16757b;
            if (context instanceof Activity) {
                z10 = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z10) {
            Iterator<x0.c> it = this.f16776k.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = it.next().f16543a.iterator();
                while (it2.hasNext()) {
                    ((b0) this.f16769c.f16611d).d((String) it2.next(), false);
                }
            }
        }
        v(-1);
        Object obj = this.f16787w;
        if (obj instanceof v.d) {
            ((v.d) obj).removeOnTrimMemoryListener(this.f16783r);
        }
        Object obj2 = this.f16787w;
        if (obj2 instanceof v.c) {
            ((v.c) obj2).removeOnConfigurationChangedListener(this.f16782q);
        }
        Object obj3 = this.f16787w;
        if (obj3 instanceof u.v) {
            ((u.v) obj3).removeOnMultiWindowModeChangedListener(this.f16784s);
        }
        Object obj4 = this.f16787w;
        if (obj4 instanceof u.w) {
            ((u.w) obj4).removeOnPictureInPictureModeChangedListener(this.t);
        }
        Object obj5 = this.f16787w;
        if ((obj5 instanceof e0.j) && this.f16789y == null) {
            ((e0.j) obj5).removeMenuProvider(this.f16785u);
        }
        this.f16787w = null;
        this.f16788x = null;
        this.f16789y = null;
        if (this.f16772g != null) {
            this.f16774i.remove();
            this.f16772g = null;
        }
        d.f fVar = this.C;
        if (fVar != null) {
            fVar.b();
            this.D.b();
            this.E.b();
        }
    }

    public final void n(boolean z10) {
        if (z10 && (this.f16787w instanceof v.d)) {
            e0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (x0.i iVar : this.f16769c.g()) {
            if (iVar != null) {
                iVar.performLowMemory();
                if (z10) {
                    iVar.mChildFragmentManager.n(true);
                }
            }
        }
    }

    public final void o(boolean z10, boolean z11) {
        if (z11 && (this.f16787w instanceof u.v)) {
            e0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (x0.i iVar : this.f16769c.g()) {
            if (iVar != null) {
                iVar.performMultiWindowModeChanged(z10);
                if (z11) {
                    iVar.mChildFragmentManager.o(z10, true);
                }
            }
        }
    }

    public final void p() {
        Iterator it = this.f16769c.f().iterator();
        while (it.hasNext()) {
            x0.i iVar = (x0.i) it.next();
            if (iVar != null) {
                iVar.onHiddenChanged(iVar.isHidden());
                iVar.mChildFragmentManager.p();
            }
        }
    }

    public final boolean q(MenuItem menuItem) {
        if (this.f16786v < 1) {
            return false;
        }
        for (x0.i iVar : this.f16769c.g()) {
            if (iVar != null && iVar.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void r(Menu menu) {
        if (this.f16786v < 1) {
            return;
        }
        for (x0.i iVar : this.f16769c.g()) {
            if (iVar != null) {
                iVar.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void s(x0.i iVar) {
        if (iVar == null || !iVar.equals(C(iVar.mWho))) {
            return;
        }
        iVar.performPrimaryNavigationFragmentChanged();
    }

    public final void t(boolean z10, boolean z11) {
        if (z11 && (this.f16787w instanceof u.w)) {
            e0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (x0.i iVar : this.f16769c.g()) {
            if (iVar != null) {
                iVar.performPictureInPictureModeChanged(z10);
                if (z11) {
                    iVar.mChildFragmentManager.t(z10, true);
                }
            }
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        x0.i iVar = this.f16789y;
        if (iVar != null) {
            sb2.append(iVar.getClass().getSimpleName());
            sb2.append("{");
            obj = this.f16789y;
        } else {
            t<?> tVar = this.f16787w;
            if (tVar == null) {
                sb2.append("null");
                sb2.append("}}");
                return sb2.toString();
            }
            sb2.append(tVar.getClass().getSimpleName());
            sb2.append("{");
            obj = this.f16787w;
        }
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        sb2.append("}");
        sb2.append("}}");
        return sb2.toString();
    }

    public final boolean u(Menu menu) {
        boolean z10 = false;
        if (this.f16786v < 1) {
            return false;
        }
        for (x0.i iVar : this.f16769c.g()) {
            if (iVar != null && iVar.isMenuVisible() && iVar.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public final void v(int i10) {
        try {
            this.f16768b = true;
            for (e0 e0Var : ((HashMap) this.f16769c.f16609b).values()) {
                if (e0Var != null) {
                    e0Var.f16603e = i10;
                }
            }
            P(i10, false);
            Iterator it = f().iterator();
            while (it.hasNext()) {
                ((r0) it.next()).l();
            }
            this.f16768b = false;
            A(true);
        } catch (Throwable th) {
            this.f16768b = false;
            throw th;
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String d10 = defpackage.g.d(str, "    ");
        f0 f0Var = this.f16769c;
        f0Var.getClass();
        String str2 = str + "    ";
        if (!((HashMap) f0Var.f16609b).isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (e0 e0Var : ((HashMap) f0Var.f16609b).values()) {
                printWriter.print(str);
                if (e0Var != null) {
                    x0.i iVar = e0Var.f16601c;
                    printWriter.println(iVar);
                    iVar.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = ((ArrayList) f0Var.f16608a).size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size2; i10++) {
                x0.i iVar2 = (x0.i) ((ArrayList) f0Var.f16608a).get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(iVar2.toString());
            }
        }
        ArrayList<x0.i> arrayList = this.f16771e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size; i11++) {
                x0.i iVar3 = this.f16771e.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(iVar3.toString());
            }
        }
        int size3 = this.f16770d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size3; i12++) {
                x0.a aVar = this.f16770d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.f(d10, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f16775j.get());
        synchronized (this.f16767a) {
            int size4 = this.f16767a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i13 = 0; i13 < size4; i13++) {
                    Object obj = (m) this.f16767a.get(i13);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i13);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f16787w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f16788x);
        if (this.f16789y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f16789y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f16786v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final void x() {
        Iterator it = f().iterator();
        while (it.hasNext()) {
            ((r0) it.next()).l();
        }
    }

    public final void y(m mVar, boolean z10) {
        if (!z10) {
            if (this.f16787w == null) {
                if (!this.J) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.H || this.I) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f16767a) {
            if (this.f16787w == null) {
                if (!z10) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f16767a.add(mVar);
                X();
            }
        }
    }

    public final void z(boolean z10) {
        if (this.f16768b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f16787w == null) {
            if (!this.J) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f16787w.f16758c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10) {
            if (this.H || this.I) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        if (this.L == null) {
            this.L = new ArrayList<>();
            this.M = new ArrayList<>();
        }
    }
}
