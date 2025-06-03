.class public final Lb8/n;
.super Lb8/l;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "ERROR_MISSING_ACTIVITY"

    const-string v1, "App verification failed - a valid Activity is required to complete the Recaptcha flow"

    invoke-direct {p0, v0, v1}, Lb8/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
