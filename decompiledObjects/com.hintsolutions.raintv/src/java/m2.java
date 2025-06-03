/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.firebase.encoders.ValueEncoder
 *  com.google.firebase.encoders.ValueEncoderContext
 *  com.google.firebase.encoders.json.JsonDataEncoderBuilder
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 */
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;

public final class m2
implements ValueEncoder {
    public final int a;

    public /* synthetic */ m2(int n4) {
        this.a = n4;
    }

    public final void encode(Object object, Object object2) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                JsonDataEncoderBuilder.b((String)((String)object), (ValueEncoderContext)((ValueEncoderContext)object2));
                return;
            }
        }
        JsonDataEncoderBuilder.c((Boolean)((Boolean)object), (ValueEncoderContext)((ValueEncoderContext)object2));
    }
}

