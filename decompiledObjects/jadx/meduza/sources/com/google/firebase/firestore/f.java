package com.google.firebase.firestore;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class f extends u7.h {

    /* renamed from: a, reason: collision with root package name */
    public final a f3161a;

    public enum a {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        /* JADX INFO: Fake field, exist only in values array */
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        /* JADX INFO: Fake field, exist only in values array */
        PERMISSION_DENIED(7),
        /* JADX INFO: Fake field, exist only in values array */
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        /* JADX INFO: Fake field, exist only in values array */
        OUT_OF_RANGE(11),
        /* JADX INFO: Fake field, exist only in values array */
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        /* JADX INFO: Fake field, exist only in values array */
        DATA_LOSS(15),
        UNAUTHENTICATED(16);


        /* renamed from: u, reason: collision with root package name */
        public static final SparseArray<a> f3171u;

        /* renamed from: a, reason: collision with root package name */
        public final int f3173a;

        static {
            SparseArray<a> sparseArray = new SparseArray<>();
            for (a aVar : values()) {
                a aVar2 = sparseArray.get(aVar.f3173a);
                if (aVar2 != null) {
                    throw new IllegalStateException("Code value duplication between " + aVar2 + "&" + aVar.name());
                }
                sparseArray.put(aVar.f3173a, aVar);
            }
            f3171u = sparseArray;
        }

        a(int i10) {
            this.f3173a = i10;
        }
    }

    public f(String str, a aVar) {
        super(str);
        if (str == null) {
            throw new NullPointerException("Provided message must not be null.");
        }
        x6.b.Z("A FirebaseFirestoreException should never be thrown for OK", aVar != a.OK, new Object[0]);
        this.f3161a = aVar;
    }

    public f(String str, a aVar, Exception exc) {
        super(str, exc);
        if (str == null) {
            throw new NullPointerException("Provided message must not be null.");
        }
        x6.b.Z("A FirebaseFirestoreException should never be thrown for OK", aVar != a.OK, new Object[0]);
        if (aVar == null) {
            throw new NullPointerException("Provided code must not be null.");
        }
        this.f3161a = aVar;
    }
}
