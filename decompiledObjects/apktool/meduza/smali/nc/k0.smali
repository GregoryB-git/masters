.class public Lnc/k0;
.super Lnc/a;
.source "SourceFile"

# interfaces
.implements Lnc/j0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lnc/a<",
        "TT;>;",
        "Lnc/j0<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lub/h;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lnc/a;-><init>(Lub/h;Z)V

    return-void
.end method


# virtual methods
.method public final await(Lub/e;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/e<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lnc/o1;->q(Lub/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lvb/a;->a:Lvb/a;

    return-object p1
.end method

.method public final getCompleted()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lnc/o1;->z()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
