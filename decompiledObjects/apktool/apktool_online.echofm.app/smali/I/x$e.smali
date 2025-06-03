.class public LI/x$e;
.super LI/x$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LI/x$d;-><init>()V

    return-void
.end method

.method public constructor <init>(LI/x;)V
    .locals 0
    .param p1    # LI/x;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0, p1}, LI/x$d;-><init>(LI/x;)V

    return-void
.end method
