.class public final LR2/v2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR2/v2$a;
    }
.end annotation


# instance fields
.field public final a:LR2/v2$a;


# direct methods
.method public constructor <init>(LR2/v2$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, LR2/v2;->a:LR2/v2$a;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p1, v0, v0}, LR2/N2;->c(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/H0;Ljava/lang/Long;)LR2/N2;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0}, LR2/N2;->j()LR2/Y1;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, LR2/Y1;->L()LR2/a2;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string p2, "Receiver called with null intent"

    .line 17
    .line 18
    invoke-virtual {p1, p2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "Local receiver got"

    .line 31
    .line 32
    invoke-virtual {v1, v2, p2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const-string v1, "com.google.android.gms.measurement.UPLOAD"

    .line 36
    .line 37
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    new-instance p2, Landroid/content/Intent;

    .line 44
    .line 45
    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v2, "com.google.android.gms.measurement.AppMeasurementService"

    .line 49
    .line 50
    invoke-virtual {p2, p1, v2}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p2, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "Starting wakeful intent."

    .line 62
    .line 63
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, LR2/v2;->a:LR2/v2$a;

    .line 67
    .line 68
    invoke-interface {v0, p1, p2}, LR2/v2$a;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_1
    const-string p1, "com.android.vending.INSTALL_REFERRER"

    .line 73
    .line 74
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_2

    .line 79
    .line 80
    invoke-virtual {v0}, LR2/Y1;->L()LR2/a2;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const-string p2, "Install Referrer Broadcasts are deprecated"

    .line 85
    .line 86
    invoke-virtual {p1, p2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :cond_2
    return-void
.end method
