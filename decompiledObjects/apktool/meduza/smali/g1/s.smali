.class public final Lg1/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg1/c$l;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroid/os/Bundle;

.field public final synthetic d:Landroid/support/v4/os/a;

.field public final synthetic e:Lg1/c$k;


# direct methods
.method public constructor <init>(Lg1/c$k;Lg1/c$m;Ljava/lang/String;Landroid/os/Bundle;Landroid/support/v4/os/a;)V
    .locals 0

    iput-object p1, p0, Lg1/s;->e:Lg1/c$k;

    iput-object p2, p0, Lg1/s;->a:Lg1/c$l;

    iput-object p3, p0, Lg1/s;->b:Ljava/lang/String;

    iput-object p4, p0, Lg1/s;->c:Landroid/os/Bundle;

    iput-object p5, p0, Lg1/s;->d:Landroid/support/v4/os/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lg1/s;->a:Lg1/c$l;

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
    iget-object v1, p0, Lg1/s;->e:Lg1/c$k;

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
    const-string v0, "sendCustomAction for callback that isn\'t registered action="

    .line 25
    .line 26
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Lg1/s;->b:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, ", extras="

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lg1/s;->c:Landroid/os/Bundle;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-string v1, "MBServiceCompat"

    .line 50
    .line 51
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_0
    iget-object v0, p0, Lg1/s;->e:Lg1/c$k;

    .line 56
    .line 57
    iget-object v0, v0, Lg1/c$k;->a:Lg1/c;

    .line 58
    .line 59
    iget-object v1, p0, Lg1/s;->d:Landroid/support/v4/os/a;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    const/4 v0, -0x1

    .line 65
    invoke-virtual {v1, v0, v2}, Landroid/support/v4/os/a;->b(ILandroid/os/Bundle;)V

    .line 66
    .line 67
    .line 68
    return-void
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
