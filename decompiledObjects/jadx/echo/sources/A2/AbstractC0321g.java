package A2;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import x2.C2196j;
import y2.C2270a;
import y2.e;
import z2.InterfaceC2301d;
import z2.InterfaceC2307j;

/* renamed from: A2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0321g extends AbstractC0317c implements C2270a.f {

    /* renamed from: F, reason: collision with root package name */
    public final C0318d f483F;

    /* renamed from: G, reason: collision with root package name */
    public final Set f484G;

    /* renamed from: H, reason: collision with root package name */
    public final Account f485H;

    public AbstractC0321g(Context context, Looper looper, int i7, C0318d c0318d, e.a aVar, e.b bVar) {
        this(context, looper, i7, c0318d, (InterfaceC2301d) aVar, (InterfaceC2307j) bVar);
    }

    @Override // A2.AbstractC0317c
    public final Set C() {
        return this.f484G;
    }

    @Override // y2.C2270a.f
    public Set e() {
        return m() ? this.f484G : Collections.emptySet();
    }

    public final Set k0(Set set) {
        Set j02 = j0(set);
        Iterator it = j02.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return j02;
    }

    @Override // A2.AbstractC0317c
    public final Account u() {
        return this.f485H;
    }

    @Override // A2.AbstractC0317c
    public final Executor w() {
        return null;
    }

    public AbstractC0321g(Context context, Looper looper, int i7, C0318d c0318d, InterfaceC2301d interfaceC2301d, InterfaceC2307j interfaceC2307j) {
        this(context, looper, AbstractC0322h.b(context), C2196j.m(), i7, c0318d, (InterfaceC2301d) AbstractC0328n.i(interfaceC2301d), (InterfaceC2307j) AbstractC0328n.i(interfaceC2307j));
    }

    public AbstractC0321g(Context context, Looper looper, AbstractC0322h abstractC0322h, C2196j c2196j, int i7, C0318d c0318d, InterfaceC2301d interfaceC2301d, InterfaceC2307j interfaceC2307j) {
        super(context, looper, abstractC0322h, c2196j, i7, interfaceC2301d == null ? null : new C(interfaceC2301d), interfaceC2307j == null ? null : new D(interfaceC2307j), c0318d.h());
        this.f483F = c0318d;
        this.f485H = c0318d.a();
        this.f484G = k0(c0318d.c());
    }

    public Set j0(Set set) {
        return set;
    }
}
