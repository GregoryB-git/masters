.class public final Lr0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lo0/i;Ldc/p;Lub/e;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo0/i<",
            "Lr0/d;",
            ">;",
            "Ldc/p<",
            "-",
            "Lr0/a;",
            "-",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lub/e<",
            "-",
            "Lr0/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lr0/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lr0/e$a;-><init>(Ldc/p;Lub/e;)V

    invoke-interface {p0, v0, p2}, Lo0/i;->a(Ldc/p;Lub/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
