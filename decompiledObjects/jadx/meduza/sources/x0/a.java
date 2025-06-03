package x0;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import x0.g0;
import x0.y;

/* loaded from: classes.dex */
public final class a extends g0 implements y.m {

    /* renamed from: p, reason: collision with root package name */
    public final y f16515p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16516q;

    /* renamed from: r, reason: collision with root package name */
    public int f16517r;

    public a(y yVar) {
        yVar.I();
        t<?> tVar = yVar.f16787w;
        if (tVar != null) {
            tVar.f16757b.getClassLoader();
        }
        this.f16517r = -1;
        this.f16515p = yVar;
    }

    @Override // x0.y.m
    public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (y.L(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f16621g) {
            return true;
        }
        this.f16515p.f16770d.add(this);
        return true;
    }

    public final void c(int i10) {
        if (this.f16621g) {
            if (y.L(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f16616a.size();
            for (int i11 = 0; i11 < size; i11++) {
                g0.a aVar = this.f16616a.get(i11);
                i iVar = aVar.f16631b;
                if (iVar != null) {
                    iVar.mBackStackNesting += i10;
                    if (y.L(2)) {
                        StringBuilder l10 = defpackage.f.l("Bump nesting of ");
                        l10.append(aVar.f16631b);
                        l10.append(" to ");
                        l10.append(aVar.f16631b.mBackStackNesting);
                        Log.v("FragmentManager", l10.toString());
                    }
                }
            }
        }
    }

    public final int d(boolean z10) {
        if (this.f16516q) {
            throw new IllegalStateException("commit already called");
        }
        if (y.L(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new p0());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.f16516q = true;
        this.f16517r = this.f16621g ? this.f16515p.f16775j.getAndIncrement() : -1;
        this.f16515p.y(this, z10);
        return this.f16517r;
    }

    public final void e(int i10, i iVar, String str) {
        String str2 = iVar.mPreviousWho;
        if (str2 != null) {
            y0.b.d(iVar, str2);
        }
        Class<?> cls = iVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder l10 = defpackage.f.l("Fragment ");
            l10.append(cls.getCanonicalName());
            l10.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(l10.toString());
        }
        if (str != null) {
            String str3 = iVar.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + iVar + ": was " + iVar.mTag + " now " + str);
            }
            iVar.mTag = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + iVar + " with tag " + str + " to container view with no id");
            }
            int i11 = iVar.mFragmentId;
            if (i11 != 0 && i11 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + iVar + ": was " + iVar.mFragmentId + " now " + i10);
            }
            iVar.mFragmentId = i10;
            iVar.mContainerId = i10;
        }
        b(new g0.a(iVar, 1));
        iVar.mFragmentManager = this.f16515p;
    }

    public final void f(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f16622h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f16517r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f16516q);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.f16617b != 0 || this.f16618c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f16617b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f16618c));
            }
            if (this.f16619d != 0 || this.f16620e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f16619d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f16620e));
            }
            if (this.f16623i != 0 || this.f16624j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f16623i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f16624j);
            }
            if (this.f16625k != 0 || this.f16626l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f16625k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f16626l);
            }
        }
        if (this.f16616a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f16616a.size();
        for (int i10 = 0; i10 < size; i10++) {
            g0.a aVar = this.f16616a.get(i10);
            switch (aVar.f16630a) {
                case 0:
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
                    StringBuilder l10 = defpackage.f.l("cmd=");
                    l10.append(aVar.f16630a);
                    str2 = l10.toString();
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f16631b);
            if (z10) {
                if (aVar.f16633d != 0 || aVar.f16634e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f16633d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f16634e));
                }
                if (aVar.f != 0 || aVar.f16635g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f16635g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f16517r >= 0) {
            sb2.append(" #");
            sb2.append(this.f16517r);
        }
        if (this.f16622h != null) {
            sb2.append(" ");
            sb2.append(this.f16622h);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
