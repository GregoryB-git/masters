.class public final Lcom/google/firebase/auth/a;
.super Lc8/i0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc8/i0<",
        "Lb8/g;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lb8/r;

.field public final synthetic c:Lb8/h;

.field public final synthetic d:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;ZLb8/r;Lb8/h;)V
    .locals 0

    iput-boolean p2, p0, Lcom/google/firebase/auth/a;->a:Z

    iput-object p3, p0, Lcom/google/firebase/auth/a;->b:Lb8/r;

    iput-object p4, p0, Lcom/google/firebase/auth/a;->c:Lb8/h;

    iput-object p1, p0, Lcom/google/firebase/auth/a;->d:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-direct {p0}, Lc8/i0;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lb8/g;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "Email link login/reauth with empty reCAPTCHA token"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, "Got reCAPTCHA token for login/reauth with email link"

    .line 11
    .line 12
    :goto_0
    const-string v1, "FirebaseAuth"

    .line 13
    .line 14
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    iget-boolean v0, p0, Lcom/google/firebase/auth/a;->a:Z

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/google/firebase/auth/a;->d:Lcom/google/firebase/auth/FirebaseAuth;

    .line 22
    .line 23
    iget-object v1, v0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabq;

    .line 24
    .line 25
    iget-object v2, v0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lu7/f;

    .line 26
    .line 27
    iget-object v3, p0, Lcom/google/firebase/auth/a;->b:Lb8/r;

    .line 28
    .line 29
    invoke-static {v3}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object v4, p0, Lcom/google/firebase/auth/a;->c:Lb8/h;

    .line 33
    .line 34
    new-instance v6, Lcom/google/firebase/auth/FirebaseAuth$c;

    .line 35
    .line 36
    iget-object v0, p0, Lcom/google/firebase/auth/a;->d:Lcom/google/firebase/auth/FirebaseAuth;

    .line 37
    .line 38
    invoke-direct {v6, v0}, Lcom/google/firebase/auth/FirebaseAuth$c;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 39
    .line 40
    .line 41
    move-object v5, p1

    .line 42
    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzabq;->zzb(Lu7/f;Lb8/r;Lb8/h;Ljava/lang/String;Lc8/s0;)Lcom/google/android/gms/tasks/Task;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    :cond_1
    iget-object v0, p0, Lcom/google/firebase/auth/a;->d:Lcom/google/firebase/auth/FirebaseAuth;

    .line 48
    .line 49
    iget-object v1, v0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabq;

    .line 50
    .line 51
    iget-object v2, v0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lu7/f;

    .line 52
    .line 53
    iget-object v3, p0, Lcom/google/firebase/auth/a;->c:Lb8/h;

    .line 54
    .line 55
    new-instance v4, Lcom/google/firebase/auth/FirebaseAuth$d;

    .line 56
    .line 57
    invoke-direct {v4, v0}, Lcom/google/firebase/auth/FirebaseAuth$d;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2, v3, p1, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzabq;->zza(Lu7/f;Lb8/h;Ljava/lang/String;Lc8/z0;)Lcom/google/android/gms/tasks/Task;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1
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
