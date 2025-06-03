package b8;

import android.net.Uri;
import com.google.android.gms.internal.p002firebaseauthapi.zzagw;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuth.c;
import java.util.List;

/* loaded from: classes.dex */
public abstract class r extends n6.a implements o0 {
    @Override // b8.o0
    public abstract String A();

    public abstract c8.k D();

    public abstract c8.l E();

    public abstract List<? extends o0> F();

    public abstract String G();

    public abstract boolean H();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [c8.s0, com.google.firebase.auth.FirebaseAuth$c] */
    public final Task<Void> I() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(K());
        firebaseAuth.getClass();
        return firebaseAuth.f3061e.zza(firebaseAuth.f3057a, this, (c8.s0) firebaseAuth.new c());
    }

    public abstract c8.i J(List list);

    public abstract u7.f K();

    public abstract void L(zzagw zzagwVar);

    public abstract c8.i M();

    public abstract void N(List<t0> list);

    public abstract zzagw O();

    public abstract void P(List<x> list);

    public abstract List<t0> Q();

    @Override // b8.o0
    public abstract String a();

    @Override // b8.o0
    public abstract Uri h();

    @Override // b8.o0
    public abstract String m();

    @Override // b8.o0
    public abstract String o();

    public abstract String zzd();

    public abstract String zze();

    public abstract List<String> zzg();
}
