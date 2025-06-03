.class public final Lb1/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb1/m0$a;
    }
.end annotation


# instance fields
.field public final a:Lb1/p;

.field public final b:Landroid/os/Handler;

.field public c:Lb1/m0$a;


# direct methods
.method public constructor <init>(Lb1/o;)V
    .locals 1

    const-string v0, "provider"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lb1/p;

    invoke-direct {v0, p1}, Lb1/p;-><init>(Lb1/o;)V

    iput-object v0, p0, Lb1/m0;->a:Lb1/p;

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lb1/m0;->b:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final a(Lb1/k$a;)V
    .locals 2

    iget-object v0, p0, Lb1/m0;->c:Lb1/m0$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lb1/m0$a;->run()V

    :cond_0
    new-instance v0, Lb1/m0$a;

    iget-object v1, p0, Lb1/m0;->a:Lb1/p;

    invoke-direct {v0, v1, p1}, Lb1/m0$a;-><init>(Lb1/p;Lb1/k$a;)V

    iput-object v0, p0, Lb1/m0;->c:Lb1/m0$a;

    iget-object p1, p0, Lb1/m0;->b:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    return-void
.end method
