package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public enum Q7 {
    DEBUG(3),
    ERROR(6),
    INFO(4),
    VERBOSE(2),
    WARN(5);


    /* renamed from: o, reason: collision with root package name */
    public final int f10561o;

    Q7(int i7) {
        this.f10561o = i7;
    }

    public static Q7 c(int i7) {
        return i7 != 2 ? i7 != 3 ? i7 != 5 ? i7 != 6 ? INFO : ERROR : WARN : DEBUG : VERBOSE;
    }
}
