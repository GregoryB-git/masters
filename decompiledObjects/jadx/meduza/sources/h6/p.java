package h6;

import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public interface p extends IInterface {
    void I1(Status status);

    void o1(Status status);

    void s1(GoogleSignInAccount googleSignInAccount, Status status);
}
