// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import java.io.Writer;
import java.io.PrintWriter;
import android.util.Log;
import java.util.ArrayList;

public final class a extends v implements n
{
    public final androidx.fragment.app.n t;
    public boolean u;
    public int v;
    
    public a(final androidx.fragment.app.n t) {
        final j p = t.p0();
        ClassLoader classLoader;
        if (t.s0() != null) {
            classLoader = t.s0().i().getClassLoader();
        }
        else {
            classLoader = null;
        }
        super(p, classLoader);
        this.v = -1;
        this.t = t;
    }
    
    public static boolean w(final v.a a) {
        final Fragment b = a.b;
        return b != null && b.z && b.V != null && !b.O && !b.N && b.a0();
    }
    
    public Fragment A(final ArrayList list, Fragment b) {
        for (int i = super.c.size() - 1; i >= 0; --i) {
            final v.a a = super.c.get(i);
            final int a2 = a.a;
            Label_0127: {
                if (a2 != 1) {
                    if (a2 != 3) {
                        switch (a2) {
                            default: {
                                continue;
                            }
                            case 10: {
                                a.h = a.g;
                                continue;
                            }
                            case 9: {
                                b = a.b;
                                continue;
                            }
                            case 8: {
                                b = null;
                                continue;
                            }
                            case 6: {
                                break;
                            }
                            case 7: {
                                break Label_0127;
                            }
                        }
                    }
                    list.add(a.b);
                    continue;
                }
            }
            list.remove(a.b);
        }
        return b;
    }
    
    @Override
    public boolean a(final ArrayList list, final ArrayList list2) {
        if (n.D0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
            Log.v("FragmentManager", sb.toString());
        }
        list.add(this);
        list2.add(Boolean.FALSE);
        if (super.i) {
            this.t.e(this);
        }
        return true;
    }
    
    @Override
    public int f() {
        return this.n(false);
    }
    
    @Override
    public int g() {
        return this.n(true);
    }
    
    @Override
    public void h() {
        this.i();
        this.t.b0((n)this, true);
    }
    
    @Override
    public void j(final int n, final Fragment fragment, final String s, final int n2) {
        super.j(n, fragment, s, n2);
        fragment.G = this.t;
    }
    
    @Override
    public v k(final Fragment fragment) {
        final androidx.fragment.app.n g = fragment.G;
        if (g != null && g != this.t) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
            sb.append(fragment.toString());
            sb.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(sb.toString());
        }
        return super.k(fragment);
    }
    
    public void m(final int i) {
        if (!super.i) {
            return;
        }
        if (n.D0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Bump nesting in ");
            sb.append(this);
            sb.append(" by ");
            sb.append(i);
            Log.v("FragmentManager", sb.toString());
        }
        for (int size = super.c.size(), j = 0; j < size; ++j) {
            final v.a a = super.c.get(j);
            final Fragment b = a.b;
            if (b != null) {
                b.F += i;
                if (n.D0(2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Bump nesting of ");
                    sb2.append(a.b);
                    sb2.append(" to ");
                    sb2.append(a.b.F);
                    Log.v("FragmentManager", sb2.toString());
                }
            }
        }
    }
    
    public int n(final boolean b) {
        if (!this.u) {
            if (n.D0(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Commit: ");
                sb.append(this);
                Log.v("FragmentManager", sb.toString());
                final PrintWriter printWriter = new PrintWriter(new A("FragmentManager"));
                this.o("  ", printWriter);
                printWriter.close();
            }
            this.u = true;
            int j;
            if (super.i) {
                j = this.t.j();
            }
            else {
                j = -1;
            }
            this.v = j;
            this.t.Y((n)this, b);
            return this.v;
        }
        throw new IllegalStateException("commit already called");
    }
    
    public void o(final String s, final PrintWriter printWriter) {
        this.p(s, printWriter, true);
    }
    
    public void p(final String s, final PrintWriter printWriter, final boolean b) {
        if (b) {
            printWriter.print(s);
            printWriter.print("mName=");
            printWriter.print(super.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.u);
            if (super.h != 0) {
                printWriter.print(s);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(super.h));
            }
            if (super.d != 0 || super.e != 0) {
                printWriter.print(s);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(super.d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(super.e));
            }
            if (super.f != 0 || super.g != 0) {
                printWriter.print(s);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(super.f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(super.g));
            }
            if (super.l != 0 || super.m != null) {
                printWriter.print(s);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(super.l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(super.m);
            }
            if (super.n != 0 || super.o != null) {
                printWriter.print(s);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(super.n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(super.o);
            }
        }
        if (!super.c.isEmpty()) {
            printWriter.print(s);
            printWriter.println("Operations:");
            for (int size = super.c.size(), i = 0; i < size; ++i) {
                final v.a a = super.c.get(i);
                String string = null;
                switch (a.a) {
                    default: {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("cmd=");
                        sb.append(a.a);
                        string = sb.toString();
                        break;
                    }
                    case 10: {
                        string = "OP_SET_MAX_LIFECYCLE";
                        break;
                    }
                    case 9: {
                        string = "UNSET_PRIMARY_NAV";
                        break;
                    }
                    case 8: {
                        string = "SET_PRIMARY_NAV";
                        break;
                    }
                    case 7: {
                        string = "ATTACH";
                        break;
                    }
                    case 6: {
                        string = "DETACH";
                        break;
                    }
                    case 5: {
                        string = "SHOW";
                        break;
                    }
                    case 4: {
                        string = "HIDE";
                        break;
                    }
                    case 3: {
                        string = "REMOVE";
                        break;
                    }
                    case 2: {
                        string = "REPLACE";
                        break;
                    }
                    case 1: {
                        string = "ADD";
                        break;
                    }
                    case 0: {
                        string = "NULL";
                        break;
                    }
                }
                printWriter.print(s);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(string);
                printWriter.print(" ");
                printWriter.println(a.b);
                if (b) {
                    if (a.c != 0 || a.d != 0) {
                        printWriter.print(s);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(a.c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(a.d));
                    }
                    if (a.e != 0 || a.f != 0) {
                        printWriter.print(s);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(a.e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(a.f));
                    }
                }
            }
        }
    }
    
    public void q() {
        for (int size = super.c.size(), i = 0; i < size; ++i) {
            final v.a a = super.c.get(i);
            final Fragment b = a.b;
            if (b != null) {
                b.A1(super.h);
                b.E1(super.p, super.q);
            }
            switch (a.a) {
                default: {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cmd: ");
                    sb.append(a.a);
                    throw new IllegalArgumentException(sb.toString());
                }
                case 10: {
                    this.t.h1(b, a.h);
                    break;
                }
                case 9: {
                    this.t.i1(null);
                    break;
                }
                case 8: {
                    this.t.i1(b);
                    break;
                }
                case 7: {
                    b.z1(a.c);
                    this.t.g1(b, false);
                    this.t.l(b);
                    break;
                }
                case 6: {
                    b.z1(a.d);
                    this.t.x(b);
                    break;
                }
                case 5: {
                    b.z1(a.c);
                    this.t.g1(b, false);
                    this.t.k1(b);
                    break;
                }
                case 4: {
                    b.z1(a.d);
                    this.t.B0(b);
                    break;
                }
                case 3: {
                    b.z1(a.d);
                    this.t.Y0(b);
                    break;
                }
                case 1: {
                    b.z1(a.c);
                    this.t.g1(b, false);
                    this.t.g(b);
                    break;
                }
            }
            if (!super.r && a.a != 1 && b != null && !n.P) {
                this.t.L0(b);
            }
        }
        if (!super.r && !n.P) {
            final androidx.fragment.app.n t = this.t;
            t.M0(t.q, true);
        }
    }
    
    public void r(final boolean b) {
        for (int i = super.c.size() - 1; i >= 0; --i) {
            final v.a a = super.c.get(i);
            final Fragment b2 = a.b;
            if (b2 != null) {
                b2.A1(n.d1(super.h));
                b2.E1(super.q, super.p);
            }
            switch (a.a) {
                default: {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cmd: ");
                    sb.append(a.a);
                    throw new IllegalArgumentException(sb.toString());
                }
                case 10: {
                    this.t.h1(b2, a.g);
                    break;
                }
                case 9: {
                    this.t.i1(b2);
                    break;
                }
                case 8: {
                    this.t.i1(null);
                    break;
                }
                case 7: {
                    b2.z1(a.f);
                    this.t.g1(b2, true);
                    this.t.x(b2);
                    break;
                }
                case 6: {
                    b2.z1(a.e);
                    this.t.l(b2);
                    break;
                }
                case 5: {
                    b2.z1(a.f);
                    this.t.g1(b2, true);
                    this.t.B0(b2);
                    break;
                }
                case 4: {
                    b2.z1(a.e);
                    this.t.k1(b2);
                    break;
                }
                case 3: {
                    b2.z1(a.e);
                    this.t.g(b2);
                    break;
                }
                case 1: {
                    b2.z1(a.f);
                    this.t.g1(b2, true);
                    this.t.Y0(b2);
                    break;
                }
            }
            if (!super.r && a.a != 3 && b2 != null && !n.P) {
                this.t.L0(b2);
            }
        }
        if (!super.r && b && !n.P) {
            final androidx.fragment.app.n t = this.t;
            t.M0(t.q, true);
        }
    }
    
    public Fragment s(final ArrayList list, Fragment b) {
        int i = 0;
        Fragment fragment = b;
        while (i < super.c.size()) {
            final v.a a = super.c.get(i);
            final int a2 = a.a;
            int n = 0;
            Label_0445: {
                if (a2 != 1) {
                    if (a2 != 2) {
                        if (a2 != 3 && a2 != 6) {
                            if (a2 != 7) {
                                if (a2 != 8) {
                                    b = fragment;
                                    n = i;
                                    break Label_0445;
                                }
                                super.c.add(i, new v.a(9, fragment));
                                n = i + 1;
                                b = a.b;
                                break Label_0445;
                            }
                        }
                        else {
                            list.remove(a.b);
                            final Fragment b2 = a.b;
                            b = fragment;
                            n = i;
                            if (b2 == fragment) {
                                super.c.add(i, new v.a(9, b2));
                                n = i + 1;
                                b = null;
                            }
                            break Label_0445;
                        }
                    }
                    else {
                        final Fragment b3 = a.b;
                        final int l = b3.L;
                        int j = list.size() - 1;
                        int n2 = 0;
                        n = i;
                        b = fragment;
                        while (j >= 0) {
                            final Fragment o = list.get(j);
                            Fragment fragment2 = b;
                            int n3 = n;
                            int n4 = n2;
                            if (o.L == l) {
                                if (o == b3) {
                                    n4 = 1;
                                    fragment2 = b;
                                    n3 = n;
                                }
                                else {
                                    fragment2 = b;
                                    int index = n;
                                    if (o == b) {
                                        super.c.add(n, new v.a(9, o));
                                        index = n + 1;
                                        fragment2 = null;
                                    }
                                    final v.a element = new v.a(3, o);
                                    element.c = a.c;
                                    element.e = a.e;
                                    element.d = a.d;
                                    element.f = a.f;
                                    super.c.add(index, element);
                                    list.remove(o);
                                    n3 = index + 1;
                                    n4 = n2;
                                }
                            }
                            --j;
                            b = fragment2;
                            n = n3;
                            n2 = n4;
                        }
                        if (n2 != 0) {
                            super.c.remove(n);
                            --n;
                            break Label_0445;
                        }
                        a.a = 1;
                        list.add(b3);
                        break Label_0445;
                    }
                }
                list.add(a.b);
                n = i;
                b = fragment;
            }
            i = n + 1;
            fragment = b;
        }
        return fragment;
    }
    
    public String t() {
        return super.k;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.v >= 0) {
            sb.append(" #");
            sb.append(this.v);
        }
        if (super.k != null) {
            sb.append(" ");
            sb.append(super.k);
        }
        sb.append("}");
        return sb.toString();
    }
    
    public boolean u(final int n) {
        for (int size = super.c.size(), i = 0; i < size; ++i) {
            final Fragment b = super.c.get(i).b;
            int l;
            if (b != null) {
                l = b.L;
            }
            else {
                l = 0;
            }
            if (l != 0 && l == n) {
                return true;
            }
        }
        return false;
    }
    
    public boolean v(final ArrayList list, final int n, final int n2) {
        if (n2 == n) {
            return false;
        }
        final int size = super.c.size();
        int n3 = -1;
        int n4;
        for (int i = 0; i < size; ++i, n3 = n4) {
            final Fragment b = super.c.get(i).b;
            int l;
            if (b != null) {
                l = b.L;
            }
            else {
                l = 0;
            }
            n4 = n3;
            if (l != 0 && l != (n4 = n3)) {
                for (int j = n; j < n2; ++j) {
                    final a a = list.get(j);
                    for (int size2 = a.c.size(), k = 0; k < size2; ++k) {
                        final Fragment b2 = a.c.get(k).b;
                        int m;
                        if (b2 != null) {
                            m = b2.L;
                        }
                        else {
                            m = 0;
                        }
                        if (m == l) {
                            return true;
                        }
                    }
                }
                n4 = l;
            }
        }
        return false;
    }
    
    public boolean x() {
        for (int i = 0; i < super.c.size(); ++i) {
            if (w((v.a)super.c.get(i))) {
                return true;
            }
        }
        return false;
    }
    
    public void y() {
        if (super.s != null) {
            for (int i = 0; i < super.s.size(); ++i) {
                ((Runnable)super.s.get(i)).run();
            }
            super.s = null;
        }
    }
    
    public void z(final Fragment.k k) {
        for (int i = 0; i < super.c.size(); ++i) {
            final v.a a = super.c.get(i);
            if (w(a)) {
                a.b.B1(k);
            }
        }
    }
}
