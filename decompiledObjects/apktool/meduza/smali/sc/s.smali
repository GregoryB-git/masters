.class public Lsc/s;
.super Lnc/a;
.source "SourceFile"

# interfaces
.implements Lwb/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lnc/a<",
        "TT;>;",
        "Lwb/d;"
    }
.end annotation


# instance fields
.field public final d:Lub/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lub/e<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lub/e;Lub/h;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p2, v0}, Lnc/a;-><init>(Lub/h;Z)V

    iput-object p1, p0, Lsc/s;->d:Lub/e;

    return-void
.end method


# virtual methods
.method public final K()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public Z(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lsc/s;->d:Lub/e;

    invoke-static {p1}, Leb/y;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lub/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public final getCallerFrame()Lwb/d;
    .locals 2

    iget-object v0, p0, Lsc/s;->d:Lub/e;

    instance-of v1, v0, Lwb/d;

    if-eqz v1, :cond_0

    check-cast v0, Lwb/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public p(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lsc/s;->d:Lub/e;

    invoke-static {v0}, Lp2/m0;->P(Lub/e;)Lub/e;

    move-result-object v0

    invoke-static {p1}, Leb/y;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lb/a0;->D(Lub/e;Ljava/lang/Object;)V

    return-void
.end method
