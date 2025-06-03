.class public final Lcom/google/firebase/auth/d;
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
.field public final synthetic a:Lb8/r;

.field public final synthetic b:Lb8/h;

.field public final synthetic c:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;Lb8/r;Lb8/h;)V
    .locals 0

    iput-object p2, p0, Lcom/google/firebase/auth/d;->a:Lb8/r;

    iput-object p3, p0, Lcom/google/firebase/auth/d;->b:Lb8/h;

    iput-object p1, p0, Lcom/google/firebase/auth/d;->c:Lcom/google/firebase/auth/FirebaseAuth;

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
    const-string v1, "FirebaseAuth"

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string v0, "Linking email account with empty reCAPTCHA token"

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "Got reCAPTCHA token for linking email account"

    .line 13
    .line 14
    :goto_0
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/google/firebase/auth/d;->c:Lcom/google/firebase/auth/FirebaseAuth;

    .line 18
    .line 19
    iget-object v1, v0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabq;

    .line 20
    .line 21
    iget-object v2, v0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lu7/f;

    .line 22
    .line 23
    iget-object v3, p0, Lcom/google/firebase/auth/d;->a:Lb8/r;

    .line 24
    .line 25
    iget-object v4, p0, Lcom/google/firebase/auth/d;->b:Lb8/h;

    .line 26
    .line 27
    new-instance v6, Lcom/google/firebase/auth/FirebaseAuth$c;

    .line 28
    .line 29
    invoke-direct {v6, v0}, Lcom/google/firebase/auth/FirebaseAuth$c;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 30
    .line 31
    .line 32
    move-object v5, p1

    .line 33
    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzabq;->zza(Lu7/f;Lb8/r;Lb8/f;Ljava/lang/String;Lc8/s0;)Lcom/google/android/gms/tasks/Task;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1
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
.end method
