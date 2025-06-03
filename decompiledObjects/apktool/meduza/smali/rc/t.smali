.class public final Lrc/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lqc/f<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lub/h;

.field public final b:Ljava/lang/Object;

.field public final c:Lrc/t$a;


# direct methods
.method public constructor <init>(Lqc/f;Lub/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqc/f<",
            "-TT;>;",
            "Lub/h;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lrc/t;->a:Lub/h;

    invoke-static {p2}, Lsc/w;->b(Lub/h;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, p0, Lrc/t;->b:Ljava/lang/Object;

    new-instance p2, Lrc/t$a;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lrc/t$a;-><init>(Lqc/f;Lub/e;)V

    iput-object p2, p0, Lrc/t;->c:Lrc/t$a;

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lrc/t;->a:Lub/h;

    iget-object v1, p0, Lrc/t;->b:Ljava/lang/Object;

    iget-object v2, p0, Lrc/t;->c:Lrc/t$a;

    invoke-static {v0, p1, v1, v2, p2}, Lx6/b;->A0(Lub/h;Ljava/lang/Object;Ljava/lang/Object;Ldc/p;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lvb/a;->a:Lvb/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method
