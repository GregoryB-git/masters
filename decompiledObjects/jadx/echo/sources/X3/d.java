package X3;

import V3.C0663b;
import V3.k;
import Y3.m;
import a4.C0745a;
import d4.n;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7233a = false;

    @Override // X3.e
    public void a() {
        q();
    }

    @Override // X3.e
    public void b(long j7) {
        q();
    }

    @Override // X3.e
    public void c(k kVar, C0663b c0663b, long j7) {
        q();
    }

    @Override // X3.e
    public List d() {
        return Collections.emptyList();
    }

    @Override // X3.e
    public void e(k kVar, n nVar, long j7) {
        q();
    }

    @Override // X3.e
    public void f(k kVar, C0663b c0663b) {
        q();
    }

    @Override // X3.e
    public Object g(Callable callable) {
        m.g(!this.f7233a, "runInTransaction called when an existing transaction is already in progress.");
        this.f7233a = true;
        try {
            return callable.call();
        } finally {
        }
    }

    @Override // X3.e
    public void h(k kVar, C0663b c0663b) {
        q();
    }

    @Override // X3.e
    public void i(a4.i iVar) {
        q();
    }

    @Override // X3.e
    public void j(a4.i iVar, n nVar) {
        q();
    }

    @Override // X3.e
    public C0745a k(a4.i iVar) {
        return new C0745a(d4.i.f(d4.g.W(), iVar.c()), false, false);
    }

    @Override // X3.e
    public void l(a4.i iVar, Set set, Set set2) {
        q();
    }

    @Override // X3.e
    public void m(a4.i iVar) {
        q();
    }

    @Override // X3.e
    public void n(k kVar, n nVar) {
        q();
    }

    @Override // X3.e
    public void o(a4.i iVar, Set set) {
        q();
    }

    @Override // X3.e
    public void p(a4.i iVar) {
        q();
    }

    public final void q() {
        m.g(this.f7233a, "Transaction expected to already be in progress.");
    }
}
