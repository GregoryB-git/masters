/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.firebase.encoders.ObjectEncoder
 *  com.google.firebase.encoders.ObjectEncoderContext
 *  com.google.firebase.encoders.json.JsonDataEncoderBuilder
 *  java.lang.Object
 */
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;

public final class l2
implements ObjectEncoder {
    public final void encode(Object object, Object object2) {
        JsonDataEncoderBuilder.a((Object)object, (ObjectEncoderContext)((ObjectEncoderContext)object2));
    }
}

