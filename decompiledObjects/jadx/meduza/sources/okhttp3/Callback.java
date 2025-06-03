package okhttp3;

import java.io.IOException;

/* loaded from: classes.dex */
public interface Callback {
    void a(Call call, Response response);

    void b(Call call, IOException iOException);
}
