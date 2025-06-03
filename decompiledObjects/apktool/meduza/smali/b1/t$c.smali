.class public final Lb1/t$c;
.super Lb1/t$d;
.source "SourceFile"

# interfaces
.implements Lb1/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb1/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb1/t<",
        "TT;>.d;",
        "Lb1/m;"
    }
.end annotation


# instance fields
.field public final e:Lb1/o;

.field public final synthetic f:Lb1/t;


# direct methods
.method public constructor <init>(Lb1/t;Lb1/o;Lb1/x;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb1/o;",
            "Lb1/x<",
            "-TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lb1/t$c;->f:Lb1/t;

    invoke-direct {p0, p1, p3}, Lb1/t$d;-><init>(Lb1/t;Lb1/x;)V

    iput-object p2, p0, Lb1/t$c;->e:Lb1/o;

    return-void
.end method


# virtual methods
.method public final a(Lb1/o;Lb1/k$a;)V
    .locals 1

    iget-object p1, p0, Lb1/t$c;->e:Lb1/o;

    invoke-interface {p1}, Lb1/o;->getLifecycle()Lb1/k;

    move-result-object p1

    invoke-virtual {p1}, Lb1/k;->b()Lb1/k$b;

    move-result-object p1

    sget-object p2, Lb1/k$b;->a:Lb1/k$b;

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Lb1/t$c;->f:Lb1/t;

    iget-object p2, p0, Lb1/t$d;->a:Lb1/x;

    invoke-virtual {p1, p2}, Lb1/t;->removeObserver(Lb1/x;)V

    return-void

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eq p2, p1, :cond_1

    invoke-virtual {p0}, Lb1/t$c;->e()Z

    move-result p2

    invoke-virtual {p0, p2}, Lb1/t$d;->b(Z)V

    iget-object p2, p0, Lb1/t$c;->e:Lb1/o;

    invoke-interface {p2}, Lb1/o;->getLifecycle()Lb1/k;

    move-result-object p2

    invoke-virtual {p2}, Lb1/k;->b()Lb1/k$b;

    move-result-object p2

    move-object v0, p2

    move-object p2, p1

    move-object p1, v0

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Lb1/t$c;->e:Lb1/o;

    invoke-interface {v0}, Lb1/o;->getLifecycle()Lb1/k;

    move-result-object v0

    invoke-virtual {v0, p0}, Lb1/k;->c(Lb1/n;)V

    return-void
.end method

.method public final d(Lb1/o;)Z
    .locals 1

    iget-object v0, p0, Lb1/t$c;->e:Lb1/o;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final e()Z
    .locals 2

    iget-object v0, p0, Lb1/t$c;->e:Lb1/o;

    invoke-interface {v0}, Lb1/o;->getLifecycle()Lb1/k;

    move-result-object v0

    invoke-virtual {v0}, Lb1/k;->b()Lb1/k$b;

    move-result-object v0

    sget-object v1, Lb1/k$b;->d:Lb1/k$b;

    invoke-virtual {v0, v1}, Lb1/k$b;->f(Lb1/k$b;)Z

    move-result v0

    return v0
.end method
