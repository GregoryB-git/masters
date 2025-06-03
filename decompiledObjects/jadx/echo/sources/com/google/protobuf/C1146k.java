package com.google.protobuf;

import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1146k {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f12092b = true;

    /* renamed from: c, reason: collision with root package name */
    public static volatile C1146k f12093c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1146k f12094d = new C1146k(true);

    /* renamed from: a, reason: collision with root package name */
    public final Map f12095a = Collections.emptyMap();

    public C1146k(boolean z7) {
    }

    public static C1146k a() {
        C1146k c1146k = f12093c;
        if (c1146k == null) {
            synchronized (C1146k.class) {
                try {
                    c1146k = f12093c;
                    if (c1146k == null) {
                        c1146k = f12092b ? AbstractC1145j.a() : f12094d;
                        f12093c = c1146k;
                    }
                } finally {
                }
            }
        }
        return c1146k;
    }
}
