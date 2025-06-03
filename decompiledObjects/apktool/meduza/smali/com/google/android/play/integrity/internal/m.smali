.class public abstract Lcom/google/android/play/integrity/internal/m;
.super Lcom/google/android/play/integrity/internal/b;
.source "SourceFile"

# interfaces
.implements Lm7/s;


# direct methods
.method public static b(Landroid/os/IBinder;)Lm7/s;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.play.core.integrity.protocol.IIntegrityService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lm7/s;

    if-eqz v1, :cond_1

    check-cast v0, Lm7/s;

    return-object v0

    :cond_1
    new-instance v0, Lm7/r;

    invoke-direct {v0, p0}, Lm7/r;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
