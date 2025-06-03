package f2;

import io.flutter.plugins.firebase.crashlytics.Constants;

/* loaded from: classes.dex */
public final class j extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str) {
        super(str);
        ec.i.e(str, Constants.MESSAGE);
    }
}
