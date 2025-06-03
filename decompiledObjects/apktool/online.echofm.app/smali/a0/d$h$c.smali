.class public La0/d$h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La0/d$h;->e(Ljava/lang/String;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Landroid/os/Bundle;

.field public final synthetic q:La0/d$h;


# direct methods
.method public constructor <init>(La0/d$h;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iput-object p1, p0, La0/d$h$c;->q:La0/d$h;

    .line 2
    .line 3
    iput-object p2, p0, La0/d$h$c;->o:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, La0/d$h$c;->p:Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, La0/d$h$c;->q:La0/d$h;

    .line 2
    .line 3
    iget-object v0, v0, La0/d$h;->d:La0/d;

    .line 4
    .line 5
    iget-object v0, v0, La0/d;->s:Lt/a;

    .line 6
    .line 7
    invoke-virtual {v0}, Lt/a;->keySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Landroid/os/IBinder;

    .line 26
    .line 27
    iget-object v2, p0, La0/d$h$c;->q:La0/d$h;

    .line 28
    .line 29
    iget-object v2, v2, La0/d$h;->d:La0/d;

    .line 30
    .line 31
    iget-object v2, v2, La0/d;->s:Lt/a;

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Lt/h;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, La0/d$f;

    .line 38
    .line 39
    iget-object v2, p0, La0/d$h$c;->q:La0/d$h;

    .line 40
    .line 41
    iget-object v3, p0, La0/d$h$c;->o:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v4, p0, La0/d$h$c;->p:Landroid/os/Bundle;

    .line 44
    .line 45
    invoke-virtual {v2, v1, v3, v4}, La0/d$h;->f(La0/d$f;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    return-void
.end method
