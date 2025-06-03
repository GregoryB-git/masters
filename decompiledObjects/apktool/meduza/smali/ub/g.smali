.class public final synthetic Lub/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldc/p;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Lub/h;

    check-cast p2, Lub/h$b;

    const-string v0, "acc"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lub/h$b;->getKey()Lub/h$c;

    move-result-object v0

    invoke-interface {p1, v0}, Lub/h;->minusKey(Lub/h$c;)Lub/h;

    move-result-object p1

    sget-object v0, Lub/i;->a:Lub/i;

    if-ne p1, v0, :cond_0

    goto :goto_1

    :cond_0
    sget v1, Lub/f;->n:I

    sget-object v1, Lub/f$a;->a:Lub/f$a;

    invoke-interface {p1, v1}, Lub/h;->get(Lub/h$c;)Lub/h$b;

    move-result-object v2

    check-cast v2, Lub/f;

    if-nez v2, :cond_1

    new-instance v0, Lub/d;

    invoke-direct {v0, p2, p1}, Lub/d;-><init>(Lub/h$b;Lub/h;)V

    :goto_0
    move-object p2, v0

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1}, Lub/h;->minusKey(Lub/h$c;)Lub/h;

    move-result-object p1

    if-ne p1, v0, :cond_2

    new-instance p1, Lub/d;

    invoke-direct {p1, v2, p2}, Lub/d;-><init>(Lub/h$b;Lub/h;)V

    move-object p2, p1

    goto :goto_1

    :cond_2
    new-instance v0, Lub/d;

    new-instance v1, Lub/d;

    invoke-direct {v1, p2, p1}, Lub/d;-><init>(Lub/h$b;Lub/h;)V

    invoke-direct {v0, v2, v1}, Lub/d;-><init>(Lub/h$b;Lub/h;)V

    goto :goto_0

    :goto_1
    return-object p2
.end method
