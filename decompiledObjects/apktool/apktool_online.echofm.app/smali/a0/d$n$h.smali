.class public La0/d$n$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La0/d$n;->g(Ljava/lang/String;Landroid/os/Bundle;Lb/b;La0/d$o;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:La0/d$o;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Landroid/os/Bundle;

.field public final synthetic r:Lb/b;

.field public final synthetic s:La0/d$n;


# direct methods
.method public constructor <init>(La0/d$n;La0/d$o;Ljava/lang/String;Landroid/os/Bundle;Lb/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, La0/d$n$h;->s:La0/d$n;

    .line 2
    .line 3
    iput-object p2, p0, La0/d$n$h;->o:La0/d$o;

    .line 4
    .line 5
    iput-object p3, p0, La0/d$n$h;->p:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, La0/d$n$h;->q:Landroid/os/Bundle;

    .line 8
    .line 9
    iput-object p5, p0, La0/d$n$h;->r:Lb/b;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, La0/d$n$h;->o:La0/d$o;

    .line 2
    .line 3
    invoke-interface {v0}, La0/d$o;->asBinder()Landroid/os/IBinder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, La0/d$n$h;->s:La0/d$n;

    .line 8
    .line 9
    iget-object v1, v1, La0/d$n;->a:La0/d;

    .line 10
    .line 11
    iget-object v1, v1, La0/d;->s:Lt/a;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lt/h;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, La0/d$f;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v1, "search for callback that isn\'t registered query="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, La0/d$n$h;->p:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "MBServiceCompat"

    .line 41
    .line 42
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    iget-object v1, p0, La0/d$n$h;->s:La0/d$n;

    .line 47
    .line 48
    iget-object v1, v1, La0/d$n;->a:La0/d;

    .line 49
    .line 50
    iget-object v2, p0, La0/d$n$h;->p:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v3, p0, La0/d$n$h;->q:Landroid/os/Bundle;

    .line 53
    .line 54
    iget-object v4, p0, La0/d$n$h;->r:Lb/b;

    .line 55
    .line 56
    invoke-virtual {v1, v2, v3, v0, v4}, La0/d;->q(Ljava/lang/String;Landroid/os/Bundle;La0/d$f;Lb/b;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method
