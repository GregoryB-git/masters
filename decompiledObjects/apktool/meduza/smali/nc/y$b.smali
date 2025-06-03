.class public final Lnc/y$b;
.super Lec/j;
.source "SourceFile"

# interfaces
.implements Ldc/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnc/y;->a(Lub/h;Lub/h;Z)Lub/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lec/j;",
        "Ldc/p<",
        "Lub/h;",
        "Lub/h$b;",
        "Lub/h;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lec/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec/s<",
            "Lub/h;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic b:Z


# direct methods
.method public constructor <init>(Lec/s;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec/s<",
            "Lub/h;",
            ">;Z)V"
        }
    .end annotation

    iput-object p1, p0, Lnc/y$b;->a:Lec/s;

    iput-boolean p2, p0, Lnc/y$b;->b:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lec/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Lub/h;

    check-cast p2, Lub/h$b;

    instance-of v0, p2, Lnc/x;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lnc/y$b;->a:Lec/s;

    iget-object v0, v0, Lec/s;->a:Ljava/lang/Object;

    check-cast v0, Lub/h;

    invoke-interface {p2}, Lub/h$b;->getKey()Lub/h$c;

    move-result-object v1

    invoke-interface {v0, v1}, Lub/h;->get(Lub/h$c;)Lub/h$b;

    move-result-object v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lnc/y$b;->b:Z

    check-cast p2, Lnc/x;

    if-eqz v0, :cond_2

    invoke-interface {p2}, Lnc/x;->b0()Lnc/x;

    move-result-object p2

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lnc/y$b;->a:Lec/s;

    iget-object v1, v0, Lec/s;->a:Ljava/lang/Object;

    check-cast v1, Lub/h;

    invoke-interface {p2}, Lub/h$b;->getKey()Lub/h$c;

    move-result-object v2

    invoke-interface {v1, v2}, Lub/h;->minusKey(Lub/h$c;)Lub/h;

    move-result-object v1

    iput-object v1, v0, Lec/s;->a:Ljava/lang/Object;

    check-cast p2, Lnc/x;

    invoke-interface {p2}, Lnc/x;->r0()Lub/h;

    move-result-object p2

    :cond_2
    :goto_0
    invoke-interface {p1, p2}, Lub/h;->plus(Lub/h;)Lub/h;

    move-result-object p1

    return-object p1
.end method
