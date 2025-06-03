/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.exoplayer2.upstream.DataSource
 *  com.google.android.exoplayer2.upstream.DataSource$Factory
 *  com.google.android.exoplayer2.upstream.DummyDataSource
 *  java.lang.Object
 */
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DummyDataSource;

public final class f1
implements DataSource.Factory {
    public final DataSource createDataSource() {
        return DummyDataSource.b();
    }
}

