.class public abstract Lwb/c;
.super Lwb/a;
.source "SourceFile"


# instance fields
.field private final _context:Lub/h;

.field private transient intercepted:Lub/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lub/e<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lub/e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/e<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lub/e;->getContext()Lub/h;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, p1, v0}, Lwb/c;-><init>(Lub/e;Lub/h;)V

    return-void
.end method

.method public constructor <init>(Lub/e;Lub/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/e<",
            "Ljava/lang/Object;",
            ">;",
            "Lub/h;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lwb/a;-><init>(Lub/e;)V

    iput-object p2, p0, Lwb/c;->_context:Lub/h;

    return-void
.end method


# virtual methods
.method public getContext()Lub/h;
    .locals 1

    iget-object v0, p0, Lwb/c;->_context:Lub/h;

    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final intercepted()Lub/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lub/e<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lwb/c;->intercepted:Lub/e;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lwb/c;->getContext()Lub/h;

    move-result-object v0

    sget-object v1, Lub/f$a;->a:Lub/f$a;

    invoke-interface {v0, v1}, Lub/h;->get(Lub/h$c;)Lub/h$b;

    move-result-object v0

    check-cast v0, Lub/f;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lub/f;->C(Lub/e;)Lsc/g;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, p0

    :cond_1
    iput-object v0, p0, Lwb/c;->intercepted:Lub/e;

    :cond_2
    return-object v0
.end method

.method public releaseIntercepted()V
    .locals 3

    iget-object v0, p0, Lwb/c;->intercepted:Lub/e;

    if-eqz v0, :cond_0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Lwb/c;->getContext()Lub/h;

    move-result-object v1

    sget v2, Lub/f;->n:I

    sget-object v2, Lub/f$a;->a:Lub/f$a;

    invoke-interface {v1, v2}, Lub/h;->get(Lub/h$c;)Lub/h$b;

    move-result-object v1

    invoke-static {v1}, Lec/i;->b(Ljava/lang/Object;)V

    check-cast v1, Lub/f;

    invoke-interface {v1, v0}, Lub/f;->Q(Lub/e;)V

    :cond_0
    sget-object v0, Lwb/b;->a:Lwb/b;

    iput-object v0, p0, Lwb/c;->intercepted:Lub/e;

    return-void
.end method
