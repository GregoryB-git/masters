.class public final Lrc/i;
.super Lrc/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lrc/h<",
        "TT;TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lqc/e;Lub/h;ILpc/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqc/e<",
            "+TT;>;",
            "Lub/h;",
            "I",
            "Lpc/a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3, p4}, Lrc/h;-><init>(Lqc/e;Lub/h;ILpc/a;)V

    return-void
.end method


# virtual methods
.method public final c(Lub/h;ILpc/a;)Lrc/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/h;",
            "I",
            "Lpc/a;",
            ")",
            "Lrc/f<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lrc/i;

    iget-object v1, p0, Lrc/h;->d:Lqc/e;

    invoke-direct {v0, v1, p1, p2, p3}, Lrc/i;-><init>(Lqc/e;Lub/h;ILpc/a;)V

    return-object v0
.end method
