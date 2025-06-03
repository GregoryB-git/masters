package androidx.media2.session;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import b2.e;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes.dex */
public final class SessionCommand implements e {

    /* renamed from: a, reason: collision with root package name */
    public int f1107a;

    /* renamed from: b, reason: collision with root package name */
    public String f1108b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1109c;

    static {
        SparseArray sparseArray = new SparseArray();
        SparseArray sparseArray2 = new SparseArray();
        sparseArray.put(1, Arrays.asList(10000, 10001, 10002, 10003, 10004, 11000, 11001, 11002));
        sparseArray2.put(1, Arrays.asList(10005, 10006, 10007, 10008, 10009, 10010, 10011, 10012, 10013, 10014, 10015, 10016, 10017, 10018));
        sparseArray2.put(2, Collections.singletonList(10019));
        new SparseArray().put(1, Arrays.asList(30000, 30001));
        SparseArray sparseArray3 = new SparseArray();
        sparseArray3.put(1, Arrays.asList(40000, 40001, 40002, 40003, 40010));
        sparseArray3.put(2, Collections.singletonList(40011));
        new SparseArray().put(1, Arrays.asList(50000, 50001, 50002, 50003, 50004, 50005, 50006));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SessionCommand)) {
            return false;
        }
        SessionCommand sessionCommand = (SessionCommand) obj;
        return this.f1107a == sessionCommand.f1107a && TextUtils.equals(this.f1108b, sessionCommand.f1108b);
    }

    public final int hashCode() {
        return Objects.hash(this.f1108b, Integer.valueOf(this.f1107a));
    }
}
