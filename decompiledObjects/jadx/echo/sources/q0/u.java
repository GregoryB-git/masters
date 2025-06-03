package q0;

import java.io.IOException;

/* loaded from: classes.dex */
public final class u extends IOException {
    public u(String str) {
        super("Unable to bind a sample queue to TrackGroup with MIME type " + str + ".");
    }
}
