.class public final Lma/w$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lma/s$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lma/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lma/s$a<",
        "Lma/w$d;",
        ">;"
    }
.end annotation


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final b()V
    .locals 0

    return-void
.end method

.method public final c()V
    .locals 0

    return-void
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lma/w$d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    return p1
.end method

.method public final d()Lma/w1;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final e()V
    .locals 0

    return-void
.end method

.method public final k(Lma/s0$a;Lma/s0;)Lma/w$a;
    .locals 0

    check-cast p1, Lma/w$a;

    check-cast p2, Lma/w;

    invoke-virtual {p1, p2}, Lma/w$a;->n(Lma/w;)V

    return-object p1
.end method
