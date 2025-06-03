.class public final Lcom/google/firebase/dynamiclinks/internal/b$c;
.super Ll6/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/dynamiclinks/internal/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ll6/q<",
        "Lcom/google/firebase/dynamiclinks/internal/a;",
        "Lv8/d;",
        ">;"
    }
.end annotation


# instance fields
.field public final d:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/16 v2, 0x3392

    invoke-direct {p0, v0, v1, v2}, Ll6/q;-><init>([Lj6/d;ZI)V

    iput-object p1, p0, Lcom/google/firebase/dynamiclinks/internal/b$c;->d:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final a(Lk6/a$f;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    .line 1
    check-cast p1, Lcom/google/firebase/dynamiclinks/internal/a;

    .line 2
    .line 3
    new-instance v0, Lcom/google/firebase/dynamiclinks/internal/b$b;

    .line 4
    .line 5
    invoke-direct {v0, p2}, Lcom/google/firebase/dynamiclinks/internal/b$b;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 6
    .line 7
    .line 8
    iget-object p2, p0, Lcom/google/firebase/dynamiclinks/internal/b$c;->d:Landroid/os/Bundle;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->getService()Landroid/os/IInterface;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcom/google/firebase/dynamiclinks/internal/IDynamicLinksService;

    .line 18
    .line 19
    invoke-interface {p1, v0, p2}, Lcom/google/firebase/dynamiclinks/internal/IDynamicLinksService;->L(Lcom/google/firebase/dynamiclinks/internal/IDynamicLinksCallbacks;Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    :catch_0
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method
