package m4;

/* renamed from: m4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC1676d {

    /* renamed from: m4.d$a */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
