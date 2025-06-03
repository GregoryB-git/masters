.class public final Ly2/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Lp2/r;

.field public final b:Lp2/x;

.field public final c:Landroidx/work/WorkerParameters$a;


# direct methods
.method public constructor <init>(Lp2/r;Lp2/x;Landroidx/work/WorkerParameters$a;)V
    .locals 1

    const-string v0, "processor"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly2/s;->a:Lp2/r;

    iput-object p2, p0, Ly2/s;->b:Lp2/x;

    iput-object p3, p0, Ly2/s;->c:Landroidx/work/WorkerParameters$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ly2/s;->a:Lp2/r;

    iget-object v1, p0, Ly2/s;->b:Lp2/x;

    iget-object v2, p0, Ly2/s;->c:Landroidx/work/WorkerParameters$a;

    invoke-virtual {v0, v1, v2}, Lp2/r;->f(Lp2/x;Landroidx/work/WorkerParameters$a;)Z

    return-void
.end method
