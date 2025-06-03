.class public final enum Lma/v1$d;
.super Lma/v1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lma/v1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public constructor <init>(Lma/w1;)V
    .locals 3

    const-string v0, "BYTES"

    const/16 v1, 0xb

    const/4 v2, 0x2

    invoke-direct {p0, v0, v1, p1, v2}, Lma/v1;-><init>(Ljava/lang/String;ILma/w1;I)V

    return-void
.end method
