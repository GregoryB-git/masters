.class public final Lk7/l;
.super Lk7/e;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lk7/m;


# direct methods
.method public constructor <init>(Lk7/m;)V
    .locals 0

    iput-object p1, p0, Lk7/l;->b:Lk7/m;

    invoke-direct {p0}, Lk7/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lk7/l;->b:Lk7/m;

    .line 2
    .line 3
    iget-object v0, v0, Lk7/m;->a:Lk7/n;

    .line 4
    .line 5
    iget-object v1, v0, Lk7/n;->b:Lk7/d;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    new-array v3, v2, [Ljava/lang/Object;

    .line 9
    .line 10
    const-string v4, "unlinkToDeath"

    .line 11
    .line 12
    invoke-virtual {v1, v4, v3}, Lk7/d;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, v0, Lk7/n;->m:Landroid/os/IInterface;

    .line 16
    .line 17
    invoke-interface {v1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v0, v0, Lk7/n;->j:Lk7/f;

    .line 22
    .line 23
    invoke-interface {v1, v0, v2}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lk7/l;->b:Lk7/m;

    .line 27
    .line 28
    iget-object v0, v0, Lk7/m;->a:Lk7/n;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    iput-object v1, v0, Lk7/n;->m:Landroid/os/IInterface;

    .line 32
    .line 33
    iput-boolean v2, v0, Lk7/n;->g:Z

    .line 34
    .line 35
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
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
