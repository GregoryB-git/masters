.class public final Lq0/e$a;
.super Ls0/v$a;
.source "SourceFile"

# interfaces
.implements Ls0/p0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls0/v$a<",
        "Lq0/e;",
        "Lq0/e$a;",
        ">;",
        "Ls0/p0;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lq0/e;->p()Lq0/e;

    move-result-object v0

    invoke-direct {p0, v0}, Ls0/v$a;-><init>(Ls0/v;)V

    return-void
.end method
