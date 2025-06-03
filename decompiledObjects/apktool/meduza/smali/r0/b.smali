.class public final Lr0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo0/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo0/i<",
        "Lr0/d;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lo0/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo0/i<",
            "Lr0/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo0/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/b;->a:Lo0/i;

    return-void
.end method


# virtual methods
.method public final a(Ldc/p;Lub/e;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldc/p<",
            "-",
            "Lr0/d;",
            "-",
            "Lub/e<",
            "-",
            "Lr0/d;",
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

    iget-object v0, p0, Lr0/b;->a:Lo0/i;

    new-instance v1, Lr0/b$a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lr0/b$a;-><init>(Ldc/p;Lub/e;)V

    invoke-interface {v0, v1, p2}, Lo0/i;->a(Ldc/p;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getData()Lqc/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lqc/e<",
            "Lr0/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lr0/b;->a:Lo0/i;

    invoke-interface {v0}, Lo0/i;->getData()Lqc/e;

    move-result-object v0

    return-object v0
.end method
