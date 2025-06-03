package android.media;

import android.annotation.NonNull;
import android.util.Pair;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class MicrophoneInfo {
    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public native /* synthetic */ String getAddress();

    public native /* synthetic */ List<Pair<Integer, Integer>> getChannelMapping();

    public native /* synthetic */ String getDescription();

    public native /* synthetic */ int getDirectionality();

    public native /* synthetic */ List<Pair<Float, Float>> getFrequencyResponse();

    public native /* synthetic */ int getGroup();

    public native /* synthetic */ int getId();

    public native /* synthetic */ int getIndexInTheGroup();

    public native /* synthetic */ int getLocation();

    public native /* synthetic */ float getMaxSpl();

    public native /* synthetic */ float getMinSpl();

    public native /* synthetic */ Coordinate3F getOrientation();

    public native /* synthetic */ Coordinate3F getPosition();

    public native /* synthetic */ float getSensitivity();

    public native /* synthetic */ int getType();
}
