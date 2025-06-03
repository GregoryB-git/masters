.class public La0/d$n$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La0/d$n;->c(La0/d$o;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:La0/d$o;

.field public final synthetic p:La0/d$n;


# direct methods
.method public constructor <init>(La0/d$n;La0/d$o;)V
    .locals 0

    .line 1
    iput-object p1, p0, La0/d$n$b;->p:La0/d$n;

    .line 2
    .line 3
    iput-object p2, p0, La0/d$n$b;->o:La0/d$o;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, La0/d$n$b;->o:La0/d$o;

    .line 2
    .line 3
    invoke-interface {v0}, La0/d$o;->asBinder()Landroid/os/IBinder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, La0/d$n$b;->p:La0/d$n;

    .line 8
    .line 9
    iget-object v1, v1, La0/d$n;->a:La0/d;

    .line 10
    .line 11
    iget-object v1, v1, La0/d;->s:Lt/a;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lt/h;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, La0/d$f;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v1, v0, La0/d$f;->f:La0/d$o;

    .line 22
    .line 23
    invoke-interface {v1}, La0/d$o;->asBinder()Landroid/os/IBinder;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-interface {v1, v0, v2}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method
