.class public final Landroidx/work/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/work/Worker;


# direct methods
.method public constructor <init>(Landroidx/work/Worker;)V
    .locals 0

    iput-object p1, p0, Landroidx/work/e;->a:Landroidx/work/Worker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Landroidx/work/e;->a:Landroidx/work/Worker;

    invoke-virtual {v0}, Landroidx/work/Worker;->j()Landroidx/work/d$a;

    move-result-object v0

    iget-object v1, p0, Landroidx/work/e;->a:Landroidx/work/Worker;

    iget-object v1, v1, Landroidx/work/Worker;->e:Lz2/c;

    invoke-virtual {v1, v0}, Lz2/c;->i(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Landroidx/work/e;->a:Landroidx/work/Worker;

    iget-object v1, v1, Landroidx/work/Worker;->e:Lz2/c;

    invoke-virtual {v1, v0}, Lz2/c;->j(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method
