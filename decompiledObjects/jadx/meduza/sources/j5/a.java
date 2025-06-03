package j5;

import h5.f;
import java.util.List;
import v5.u;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: m, reason: collision with root package name */
    public final b f8418m;

    public a(List<byte[]> list) {
        u uVar = new u(list.get(0));
        this.f8418m = new b(uVar.A(), uVar.A());
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    @Override // h5.f
    public final h5.g h(byte[] r29, int r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.a.h(byte[], int, boolean):h5.g");
    }
}
