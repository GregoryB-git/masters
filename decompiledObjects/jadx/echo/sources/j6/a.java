package j6;

import java.util.Random;

/* loaded from: classes.dex */
public abstract class a extends c {
    @Override // j6.c
    public int b(int i7) {
        return d.a(d().nextInt(), i7);
    }

    @Override // j6.c
    public int c() {
        return d().nextInt();
    }

    public abstract Random d();
}
