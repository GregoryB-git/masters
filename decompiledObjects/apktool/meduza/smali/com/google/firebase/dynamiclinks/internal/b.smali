.class public final Lcom/google/firebase/dynamiclinks/internal/b;
.super Lv8/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/dynamiclinks/internal/b$e;,
        Lcom/google/firebase/dynamiclinks/internal/b$c;,
        Lcom/google/firebase/dynamiclinks/internal/b$b;,
        Lcom/google/firebase/dynamiclinks/internal/b$d;,
        Lcom/google/firebase/dynamiclinks/internal/b$a;
    }
.end annotation


# instance fields
.field public final a:Lk6/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk6/d<",
            "Lk6/a$d$c;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lt9/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt9/b<",
            "Lw7/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lu7/f;


# direct methods
.method public constructor <init>(Lu7/f;Lt9/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu7/f;",
            "Lt9/b<",
            "Lw7/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lw8/c;

    .line 2
    .line 3
    invoke-virtual {p1}, Lu7/f;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p1, Lu7/f;->a:Landroid/content/Context;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lw8/c;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lv8/b;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/firebase/dynamiclinks/internal/b;->a:Lk6/d;

    .line 15
    .line 16
    iput-object p1, p0, Lcom/google/firebase/dynamiclinks/internal/b;->c:Lu7/f;

    .line 17
    .line 18
    iput-object p2, p0, Lcom/google/firebase/dynamiclinks/internal/b;->b:Lt9/b;

    .line 19
    .line 20
    invoke-interface {p2}, Lt9/b;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    const-string p1, "FDL"

    .line 27
    .line 28
    const-string p2, "FDL logging failed. Add a dependency for Firebase Analytics to your app to enable logging of Dynamic Link events."

    .line 29
    .line 30
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
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

.method public static d(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "dynamicLink"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    const-string v1, "domainUriPrefix"

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "FDL domain is missing. Set with setDomainUriPrefix() or setDynamicLinkDomain()."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final a()Lv8/a;
    .locals 1

    new-instance v0, Lv8/a;

    invoke-direct {v0, p0}, Lv8/a;-><init>(Lcom/google/firebase/dynamiclinks/internal/b;)V

    return-object v0
.end method

.method public final b(Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lv8/c;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v1, v0

    .line 10
    :goto_0
    iget-object v2, p0, Lcom/google/firebase/dynamiclinks/internal/b;->a:Lk6/d;

    .line 11
    .line 12
    new-instance v3, Lcom/google/firebase/dynamiclinks/internal/b$e;

    .line 13
    .line 14
    iget-object v4, p0, Lcom/google/firebase/dynamiclinks/internal/b;->b:Lt9/b;

    .line 15
    .line 16
    invoke-direct {v3, v4, v1}, Lcom/google/firebase/dynamiclinks/internal/b$e;-><init>(Lt9/b;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v3}, Lk6/d;->doWrite(Ll6/q;)Lcom/google/android/gms/tasks/Task;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    sget-object v2, Lw8/a;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 26
    .line 27
    const-string v3, "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA"

    .line 28
    .line 29
    invoke-static {p1, v3, v2}, Ln6/d;->a(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Ln6/c;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lw8/a;

    .line 34
    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    new-instance v0, Lv8/c;

    .line 38
    .line 39
    invoke-direct {v0, p1}, Lv8/c;-><init>(Lw8/a;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    :cond_2
    return-object v1
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
.end method

.method public final c(Landroid/net/Uri;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lv8/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/dynamiclinks/internal/b;->a:Lk6/d;

    new-instance v1, Lcom/google/firebase/dynamiclinks/internal/b$e;

    iget-object v2, p0, Lcom/google/firebase/dynamiclinks/internal/b;->b:Lt9/b;

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lcom/google/firebase/dynamiclinks/internal/b$e;-><init>(Lt9/b;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lk6/d;->doWrite(Ll6/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
