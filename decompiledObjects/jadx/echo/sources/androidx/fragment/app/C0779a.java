package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.fragment.app.v;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0779a extends v implements n.InterfaceC0160n {

    /* renamed from: t, reason: collision with root package name */
    public final n f9324t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9325u;

    /* renamed from: v, reason: collision with root package name */
    public int f9326v;

    public C0779a(n nVar) {
        super(nVar.p0(), nVar.s0() != null ? nVar.s0().i().getClassLoader() : null);
        this.f9326v = -1;
        this.f9324t = nVar;
    }

    public static boolean w(v.a aVar) {
        Fragment fragment = aVar.f9570b;
        return (fragment == null || !fragment.f9286z || fragment.f9257V == null || fragment.f9250O || fragment.f9249N || !fragment.a0()) ? false : true;
    }

    public Fragment A(ArrayList arrayList, Fragment fragment) {
        for (int size = this.f9552c.size() - 1; size >= 0; size--) {
            v.a aVar = (v.a) this.f9552c.get(size);
            int i7 = aVar.f9569a;
            if (i7 != 1) {
                if (i7 != 3) {
                    switch (i7) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f9570b;
                            break;
                        case 10:
                            aVar.f9576h = aVar.f9575g;
                            break;
                    }
                }
                arrayList.add(aVar.f9570b);
            }
            arrayList.remove(aVar.f9570b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.n.InterfaceC0160n
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (n.D0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f9558i) {
            return true;
        }
        this.f9324t.e(this);
        return true;
    }

    @Override // androidx.fragment.app.v
    public int f() {
        return n(false);
    }

    @Override // androidx.fragment.app.v
    public int g() {
        return n(true);
    }

    @Override // androidx.fragment.app.v
    public void h() {
        i();
        this.f9324t.b0(this, true);
    }

    @Override // androidx.fragment.app.v
    public void j(int i7, Fragment fragment, String str, int i8) {
        super.j(i7, fragment, str, i8);
        fragment.f9242G = this.f9324t;
    }

    @Override // androidx.fragment.app.v
    public v k(Fragment fragment) {
        n nVar = fragment.f9242G;
        if (nVar == null || nVar == this.f9324t) {
            return super.k(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public void m(int i7) {
        if (this.f9558i) {
            if (n.D0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i7);
            }
            int size = this.f9552c.size();
            for (int i8 = 0; i8 < size; i8++) {
                v.a aVar = (v.a) this.f9552c.get(i8);
                Fragment fragment = aVar.f9570b;
                if (fragment != null) {
                    fragment.f9241F += i7;
                    if (n.D0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f9570b + " to " + aVar.f9570b.f9241F);
                    }
                }
            }
        }
    }

    public int n(boolean z7) {
        if (this.f9325u) {
            throw new IllegalStateException("commit already called");
        }
        if (n.D0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new A("FragmentManager"));
            o("  ", printWriter);
            printWriter.close();
        }
        this.f9325u = true;
        this.f9326v = this.f9558i ? this.f9324t.j() : -1;
        this.f9324t.Y(this, z7);
        return this.f9326v;
    }

    public void o(String str, PrintWriter printWriter) {
        p(str, printWriter, true);
    }

    public void p(String str, PrintWriter printWriter, boolean z7) {
        String str2;
        if (z7) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f9560k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f9326v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f9325u);
            if (this.f9557h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f9557h));
            }
            if (this.f9553d != 0 || this.f9554e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f9553d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f9554e));
            }
            if (this.f9555f != 0 || this.f9556g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f9555f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f9556g));
            }
            if (this.f9561l != 0 || this.f9562m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f9561l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f9562m);
            }
            if (this.f9563n != 0 || this.f9564o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f9563n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f9564o);
            }
        }
        if (this.f9552c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f9552c.size();
        for (int i7 = 0; i7 < size; i7++) {
            v.a aVar = (v.a) this.f9552c.get(i7);
            switch (aVar.f9569a) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f9569a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i7);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f9570b);
            if (z7) {
                if (aVar.f9571c != 0 || aVar.f9572d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f9571c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f9572d));
                }
                if (aVar.f9573e != 0 || aVar.f9574f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f9573e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f9574f));
                }
            }
        }
    }

    public void q() {
        int size = this.f9552c.size();
        for (int i7 = 0; i7 < size; i7++) {
            v.a aVar = (v.a) this.f9552c.get(i7);
            Fragment fragment = aVar.f9570b;
            if (fragment != null) {
                fragment.A1(this.f9557h);
                fragment.E1(this.f9565p, this.f9566q);
            }
            switch (aVar.f9569a) {
                case 1:
                    fragment.z1(aVar.f9571c);
                    this.f9324t.g1(fragment, false);
                    this.f9324t.g(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f9569a);
                case 3:
                    fragment.z1(aVar.f9572d);
                    this.f9324t.Y0(fragment);
                    break;
                case 4:
                    fragment.z1(aVar.f9572d);
                    this.f9324t.B0(fragment);
                    break;
                case 5:
                    fragment.z1(aVar.f9571c);
                    this.f9324t.g1(fragment, false);
                    this.f9324t.k1(fragment);
                    break;
                case 6:
                    fragment.z1(aVar.f9572d);
                    this.f9324t.x(fragment);
                    break;
                case 7:
                    fragment.z1(aVar.f9571c);
                    this.f9324t.g1(fragment, false);
                    this.f9324t.l(fragment);
                    break;
                case 8:
                    this.f9324t.i1(fragment);
                    break;
                case 9:
                    this.f9324t.i1(null);
                    break;
                case 10:
                    this.f9324t.h1(fragment, aVar.f9576h);
                    break;
            }
            if (!this.f9567r && aVar.f9569a != 1 && fragment != null && !n.f9446P) {
                this.f9324t.L0(fragment);
            }
        }
        if (this.f9567r || n.f9446P) {
            return;
        }
        n nVar = this.f9324t;
        nVar.M0(nVar.f9477q, true);
    }

    public void r(boolean z7) {
        for (int size = this.f9552c.size() - 1; size >= 0; size--) {
            v.a aVar = (v.a) this.f9552c.get(size);
            Fragment fragment = aVar.f9570b;
            if (fragment != null) {
                fragment.A1(n.d1(this.f9557h));
                fragment.E1(this.f9566q, this.f9565p);
            }
            switch (aVar.f9569a) {
                case 1:
                    fragment.z1(aVar.f9574f);
                    this.f9324t.g1(fragment, true);
                    this.f9324t.Y0(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f9569a);
                case 3:
                    fragment.z1(aVar.f9573e);
                    this.f9324t.g(fragment);
                    break;
                case 4:
                    fragment.z1(aVar.f9573e);
                    this.f9324t.k1(fragment);
                    break;
                case 5:
                    fragment.z1(aVar.f9574f);
                    this.f9324t.g1(fragment, true);
                    this.f9324t.B0(fragment);
                    break;
                case 6:
                    fragment.z1(aVar.f9573e);
                    this.f9324t.l(fragment);
                    break;
                case 7:
                    fragment.z1(aVar.f9574f);
                    this.f9324t.g1(fragment, true);
                    this.f9324t.x(fragment);
                    break;
                case 8:
                    this.f9324t.i1(null);
                    break;
                case 9:
                    this.f9324t.i1(fragment);
                    break;
                case 10:
                    this.f9324t.h1(fragment, aVar.f9575g);
                    break;
            }
            if (!this.f9567r && aVar.f9569a != 3 && fragment != null && !n.f9446P) {
                this.f9324t.L0(fragment);
            }
        }
        if (this.f9567r || !z7 || n.f9446P) {
            return;
        }
        n nVar = this.f9324t;
        nVar.M0(nVar.f9477q, true);
    }

    public Fragment s(ArrayList arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i7 = 0;
        while (i7 < this.f9552c.size()) {
            v.a aVar = (v.a) this.f9552c.get(i7);
            int i8 = aVar.f9569a;
            if (i8 != 1) {
                if (i8 == 2) {
                    Fragment fragment3 = aVar.f9570b;
                    int i9 = fragment3.f9247L;
                    boolean z7 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = (Fragment) arrayList.get(size);
                        if (fragment4.f9247L == i9) {
                            if (fragment4 == fragment3) {
                                z7 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f9552c.add(i7, new v.a(9, fragment4));
                                    i7++;
                                    fragment2 = null;
                                }
                                v.a aVar2 = new v.a(3, fragment4);
                                aVar2.f9571c = aVar.f9571c;
                                aVar2.f9573e = aVar.f9573e;
                                aVar2.f9572d = aVar.f9572d;
                                aVar2.f9574f = aVar.f9574f;
                                this.f9552c.add(i7, aVar2);
                                arrayList.remove(fragment4);
                                i7++;
                            }
                        }
                    }
                    if (z7) {
                        this.f9552c.remove(i7);
                        i7--;
                    } else {
                        aVar.f9569a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i8 == 3 || i8 == 6) {
                    arrayList.remove(aVar.f9570b);
                    Fragment fragment5 = aVar.f9570b;
                    if (fragment5 == fragment2) {
                        this.f9552c.add(i7, new v.a(9, fragment5));
                        i7++;
                        fragment2 = null;
                    }
                } else if (i8 != 7) {
                    if (i8 == 8) {
                        this.f9552c.add(i7, new v.a(9, fragment2));
                        i7++;
                        fragment2 = aVar.f9570b;
                    }
                }
                i7++;
            }
            arrayList.add(aVar.f9570b);
            i7++;
        }
        return fragment2;
    }

    public String t() {
        return this.f9560k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f9326v >= 0) {
            sb.append(" #");
            sb.append(this.f9326v);
        }
        if (this.f9560k != null) {
            sb.append(" ");
            sb.append(this.f9560k);
        }
        sb.append("}");
        return sb.toString();
    }

    public boolean u(int i7) {
        int size = this.f9552c.size();
        for (int i8 = 0; i8 < size; i8++) {
            Fragment fragment = ((v.a) this.f9552c.get(i8)).f9570b;
            int i9 = fragment != null ? fragment.f9247L : 0;
            if (i9 != 0 && i9 == i7) {
                return true;
            }
        }
        return false;
    }

    public boolean v(ArrayList arrayList, int i7, int i8) {
        if (i8 == i7) {
            return false;
        }
        int size = this.f9552c.size();
        int i9 = -1;
        for (int i10 = 0; i10 < size; i10++) {
            Fragment fragment = ((v.a) this.f9552c.get(i10)).f9570b;
            int i11 = fragment != null ? fragment.f9247L : 0;
            if (i11 != 0 && i11 != i9) {
                for (int i12 = i7; i12 < i8; i12++) {
                    C0779a c0779a = (C0779a) arrayList.get(i12);
                    int size2 = c0779a.f9552c.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        Fragment fragment2 = ((v.a) c0779a.f9552c.get(i13)).f9570b;
                        if ((fragment2 != null ? fragment2.f9247L : 0) == i11) {
                            return true;
                        }
                    }
                }
                i9 = i11;
            }
        }
        return false;
    }

    public boolean x() {
        for (int i7 = 0; i7 < this.f9552c.size(); i7++) {
            if (w((v.a) this.f9552c.get(i7))) {
                return true;
            }
        }
        return false;
    }

    public void y() {
        if (this.f9568s != null) {
            for (int i7 = 0; i7 < this.f9568s.size(); i7++) {
                ((Runnable) this.f9568s.get(i7)).run();
            }
            this.f9568s = null;
        }
    }

    public void z(Fragment.k kVar) {
        for (int i7 = 0; i7 < this.f9552c.size(); i7++) {
            v.a aVar = (v.a) this.f9552c.get(i7);
            if (w(aVar)) {
                aVar.f9570b.B1(kVar);
            }
        }
    }
}
