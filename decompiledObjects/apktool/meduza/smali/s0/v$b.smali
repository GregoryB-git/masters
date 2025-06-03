.class public final Ls0/v$b;
.super Ls0/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls0/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ls0/v<",
        "TT;*>;>",
        "Ls0/b<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ls0/v;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Ls0/b;-><init>()V

    return-void
.end method
