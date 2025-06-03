package g3;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes.dex */
public final class e implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5812a;

    public e(String str) {
        this.f5812a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.f5812a);
    }
}
