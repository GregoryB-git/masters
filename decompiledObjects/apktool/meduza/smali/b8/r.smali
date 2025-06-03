.class public abstract Lb8/r;
.super Ln6/a;
.source "SourceFile"

# interfaces
.implements Lb8/o0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ln6/a;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract A()Ljava/lang/String;
.end method

.method public abstract D()Lc8/k;
.end method

.method public abstract E()Lc8/l;
.end method

.method public abstract F()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lb8/o0;",
            ">;"
        }
    .end annotation
.end method

.method public abstract G()Ljava/lang/String;
.end method

.method public abstract H()Z
.end method

.method public final I()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lb8/r;->K()Lu7/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lu7/f;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v1, Lcom/google/firebase/auth/FirebaseAuth$c;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Lcom/google/firebase/auth/FirebaseAuth$c;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, v0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabq;

    .line 18
    .line 19
    iget-object v0, v0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lu7/f;

    .line 20
    .line 21
    invoke-virtual {v2, v0, p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzabq;->zza(Lu7/f;Lb8/r;Lc8/s0;)Lcom/google/android/gms/tasks/Task;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
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
.end method

.method public abstract J(Ljava/util/List;)Lc8/i;
.end method

.method public abstract K()Lu7/f;
.end method

.method public abstract L(Lcom/google/android/gms/internal/firebase-auth-api/zzagw;)V
.end method

.method public abstract M()Lc8/i;
.end method

.method public abstract N(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lb8/t0;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract O()Lcom/google/android/gms/internal/firebase-auth-api/zzagw;
.end method

.method public abstract P(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lb8/x;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract Q()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lb8/t0;",
            ">;"
        }
    .end annotation
.end method

.method public abstract a()Ljava/lang/String;
.end method

.method public abstract h()Landroid/net/Uri;
.end method

.method public abstract m()Ljava/lang/String;
.end method

.method public abstract o()Ljava/lang/String;
.end method

.method public abstract zzd()Ljava/lang/String;
.end method

.method public abstract zze()Ljava/lang/String;
.end method

.method public abstract zzg()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method
