.class public final Ld2/z$a;
.super Ld2/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld2/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS"

    const-string v1, "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH"

    invoke-direct {p0, v0, v1}, Ld2/z;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
