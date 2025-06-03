.class public final Lg1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg1/c$l;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroid/support/v4/os/a;

.field public final synthetic d:Lg1/c$k;


# direct methods
.method public constructor <init>(Lg1/c$k;Lg1/c$m;Ljava/lang/String;Landroid/support/v4/os/a;)V
    .locals 0

    iput-object p1, p0, Lg1/o;->d:Lg1/c$k;

    iput-object p2, p0, Lg1/o;->a:Lg1/c$l;

    iput-object p3, p0, Lg1/o;->b:Ljava/lang/String;

    iput-object p4, p0, Lg1/o;->c:Landroid/support/v4/os/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lg1/o;->a:Lg1/c$l;

    .line 2
    .line 3
    check-cast v0, Lg1/c$m;

    .line 4
    .line 5
    invoke-virtual {v0}, Lg1/c$m;->a()Landroid/os/IBinder;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lg1/o;->d:Lg1/c$k;

    .line 10
    .line 11
    iget-object v1, v1, Lg1/c$k;->a:Lg1/c;

    .line 12
    .line 13
    iget-object v1, v1, Lg1/c;->d:Lr/b;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v1, v0, v2}, Lr/h;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lg1/c$c;

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    const-string v0, "getMediaItem for callback that isn\'t registered id="

    .line 25
    .line 26
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Lg1/o;->b:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "MBServiceCompat"

    .line 40
    .line 41
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    iget-object v0, p0, Lg1/o;->d:Lg1/c$k;

    .line 46
    .line 47
    iget-object v0, v0, Lg1/c$k;->a:Lg1/c;

    .line 48
    .line 49
    iget-object v1, p0, Lg1/o;->b:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v2, p0, Lg1/o;->c:Landroid/support/v4/os/a;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    new-instance v3, Lg1/d;

    .line 57
    .line 58
    invoke-direct {v3, v1, v2}, Lg1/d;-><init>(Ljava/lang/String;Landroid/support/v4/os/a;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1, v3}, Lg1/c;->e(Ljava/lang/String;Lg1/c$i;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Lg1/c$i;->b()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    return-void

    .line 71
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    const-string v2, "onLoadItem must call detach() or sendResult() before returning for id="

    .line 74
    .line 75
    invoke-static {v2, v1}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v0
    .line 83
.end method
