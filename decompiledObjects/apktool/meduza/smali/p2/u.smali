.class public final synthetic Lp2/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp2/d;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/Executor;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Landroidx/work/a;

.field public final synthetic d:Landroidx/work/impl/WorkDatabase;


# direct methods
.method public synthetic constructor <init>(La3/a;Ljava/util/List;Landroidx/work/a;Landroidx/work/impl/WorkDatabase;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp2/u;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lp2/u;->b:Ljava/util/List;

    iput-object p3, p0, Lp2/u;->c:Landroidx/work/a;

    iput-object p4, p0, Lp2/u;->d:Landroidx/work/impl/WorkDatabase;

    return-void
.end method


# virtual methods
.method public final a(Lx2/l;Z)V
    .locals 7

    iget-object p2, p0, Lp2/u;->a:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lp2/u;->b:Ljava/util/List;

    iget-object v3, p0, Lp2/u;->c:Landroidx/work/a;

    iget-object v4, p0, Lp2/u;->d:Landroidx/work/impl/WorkDatabase;

    new-instance v6, Lp2/v;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lp2/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {p2, v6}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
