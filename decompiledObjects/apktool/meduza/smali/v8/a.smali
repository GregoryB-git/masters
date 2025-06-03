.class public final Lv8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final a:Lcom/google/firebase/dynamiclinks/internal/b;

.field public final b:Landroid/os/Bundle;

.field public final c:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Lcom/google/firebase/dynamiclinks/internal/b;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv8/a;->a:Lcom/google/firebase/dynamiclinks/internal/b;

    .line 5
    .line 6
    new-instance v0, Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lv8/a;->b:Landroid/os/Bundle;

    .line 12
    .line 13
    iget-object p1, p1, Lcom/google/firebase/dynamiclinks/internal/b;->c:Lu7/f;

    .line 14
    .line 15
    invoke-virtual {p1}, Lu7/f;->a()V

    .line 16
    .line 17
    .line 18
    iget-object p1, p1, Lu7/f;->c:Lu7/j;

    .line 19
    .line 20
    iget-object p1, p1, Lu7/j;->a:Ljava/lang/String;

    .line 21
    .line 22
    const-string v1, "apiKey"

    .line 23
    .line 24
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    new-instance p1, Landroid/os/Bundle;

    .line 28
    .line 29
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lv8/a;->c:Landroid/os/Bundle;

    .line 33
    .line 34
    const-string v1, "parameters"

    .line 35
    .line 36
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 37
    .line 38
    .line 39
    return-void
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
.end method


# virtual methods
.method public final a(I)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/android/gms/tasks/Task<",
            "Lv8/d;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lv8/a;->b:Landroid/os/Bundle;

    .line 2
    .line 3
    const-string v1, "apiKey"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lv8/a;->b:Landroid/os/Bundle;

    .line 12
    .line 13
    const-string v1, "suffix"

    .line 14
    .line 15
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lv8/a;->a:Lcom/google/firebase/dynamiclinks/internal/b;

    .line 19
    .line 20
    iget-object v0, p0, Lv8/a;->b:Landroid/os/Bundle;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lcom/google/firebase/dynamiclinks/internal/b;->d(Landroid/os/Bundle;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p1, Lcom/google/firebase/dynamiclinks/internal/b;->a:Lk6/d;

    .line 29
    .line 30
    new-instance v1, Lcom/google/firebase/dynamiclinks/internal/b$c;

    .line 31
    .line 32
    invoke-direct {v1, v0}, Lcom/google/firebase/dynamiclinks/internal/b$c;-><init>(Landroid/os/Bundle;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v1}, Lk6/d;->doWrite(Ll6/q;)Lcom/google/android/gms/tasks/Task;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 41
    .line 42
    const-string v0, "Missing API key. Set with setApiKey()."

    .line 43
    .line 44
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1
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
.end method
