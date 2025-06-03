.class public final synthetic Lp2/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lp2/r;

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lp2/r;Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp2/p;->a:Lp2/r;

    iput-object p2, p0, Lp2/p;->b:Ljava/util/ArrayList;

    iput-object p3, p0, Lp2/p;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lp2/p;->a:Lp2/r;

    iget-object v1, p0, Lp2/p;->b:Ljava/util/ArrayList;

    iget-object v2, p0, Lp2/p;->c:Ljava/lang/String;

    iget-object v3, v0, Lp2/r;->e:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->v()Lx2/x;

    move-result-object v3

    invoke-interface {v3, v2}, Lx2/x;->a(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v0, v0, Lp2/r;->e:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->u()Lx2/t;

    move-result-object v0

    invoke-interface {v0, v2}, Lx2/t;->t(Ljava/lang/String;)Lx2/s;

    move-result-object v0

    return-object v0
.end method
