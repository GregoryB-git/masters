.class public final Lrc/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lub/e;
.implements Lwb/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lub/e<",
        "TT;>;",
        "Lwb/d;"
    }
.end annotation


# instance fields
.field public final a:Lub/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lub/e<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Lub/h;


# direct methods
.method public constructor <init>(Lub/e;Lub/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/e<",
            "-TT;>;",
            "Lub/h;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrc/s;->a:Lub/e;

    iput-object p2, p0, Lrc/s;->b:Lub/h;

    return-void
.end method


# virtual methods
.method public final getCallerFrame()Lwb/d;
    .locals 2

    iget-object v0, p0, Lrc/s;->a:Lub/e;

    instance-of v1, v0, Lwb/d;

    if-eqz v1, :cond_0

    check-cast v0, Lwb/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getContext()Lub/h;
    .locals 1

    iget-object v0, p0, Lrc/s;->b:Lub/h;

    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lrc/s;->a:Lub/e;

    invoke-interface {v0, p1}, Lub/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
