.class public final Lp2/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp2/h0;


# instance fields
.field public final a:Lp2/r;

.field public final b:La3/b;


# direct methods
.method public constructor <init>(Lp2/r;La3/b;)V
    .locals 1

    const-string v0, "processor"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workTaskExecutor"

    invoke-static {p2, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp2/i0;->a:Lp2/r;

    iput-object p2, p0, Lp2/i0;->b:La3/b;

    return-void
.end method


# virtual methods
.method public final a(Lp2/x;)V
    .locals 1

    const-string v0, "workSpecId"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, -0x200

    invoke-virtual {p0, p1, v0}, Lp2/i0;->c(Lp2/x;I)V

    return-void
.end method

.method public final b(Lp2/x;)V
    .locals 3

    new-instance v0, Ly2/s;

    iget-object v1, p0, Lp2/i0;->a:Lp2/r;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Ly2/s;-><init>(Lp2/r;Lp2/x;Landroidx/work/WorkerParameters$a;)V

    iget-object p1, p0, Lp2/i0;->b:La3/b;

    invoke-interface {p1, v0}, La3/b;->d(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final c(Lp2/x;I)V
    .locals 4

    const-string v0, "workSpecId"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lp2/i0;->b:La3/b;

    new-instance v1, Ly2/t;

    iget-object v2, p0, Lp2/i0;->a:Lp2/r;

    const/4 v3, 0x0

    invoke-direct {v1, v2, p1, v3, p2}, Ly2/t;-><init>(Lp2/r;Lp2/x;ZI)V

    invoke-interface {v0, v1}, La3/b;->d(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final d(Lp2/x;I)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lp2/i0;->c(Lp2/x;I)V

    return-void
.end method
