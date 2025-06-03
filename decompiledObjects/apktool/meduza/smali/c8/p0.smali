.class public final Lc8/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:Lcom/google/firebase/auth/FirebaseAuth;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroid/app/Activity;

.field public final synthetic d:Z

.field public final synthetic e:Z

.field public final synthetic f:Lc8/u0;

.field public final synthetic o:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic p:Lc8/y;


# direct methods
.method public constructor <init>(Lc8/y;Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Landroid/app/Activity;ZLc8/u0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    iput-object p2, p0, Lc8/p0;->a:Lcom/google/firebase/auth/FirebaseAuth;

    iput-object p3, p0, Lc8/p0;->b:Ljava/lang/String;

    iput-object p4, p0, Lc8/p0;->c:Landroid/app/Activity;

    iput-boolean p5, p0, Lc8/p0;->d:Z

    const/4 p2, 0x0

    iput-boolean p2, p0, Lc8/p0;->e:Z

    iput-object p6, p0, Lc8/p0;->f:Lc8/u0;

    iput-object p7, p0, Lc8/p0;->o:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p1, p0, Lc8/p0;->p:Lc8/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 8

    .line 1
    sget-object v0, Lc8/y;->b:Lc8/y;

    .line 2
    .line 3
    const-string v0, "y"

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v2, "Failed to get reCAPTCHA enterprise token: "

    .line 12
    .line 13
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p1, "\n\n Using fallback methods."

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lc8/p0;->a:Lcom/google/firebase/auth/FirebaseAuth;

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->p()Lc8/m0;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Lc8/m0;->c()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    iget-object v0, p0, Lc8/p0;->p:Lc8/y;

    .line 44
    .line 45
    iget-object v1, p0, Lc8/p0;->a:Lcom/google/firebase/auth/FirebaseAuth;

    .line 46
    .line 47
    iget-object v2, p0, Lc8/p0;->b:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v3, p0, Lc8/p0;->c:Landroid/app/Activity;

    .line 50
    .line 51
    iget-boolean v4, p0, Lc8/p0;->d:Z

    .line 52
    .line 53
    iget-boolean v5, p0, Lc8/p0;->e:Z

    .line 54
    .line 55
    iget-object v6, p0, Lc8/p0;->f:Lc8/u0;

    .line 56
    .line 57
    iget-object v7, p0, Lc8/p0;->o:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 58
    .line 59
    invoke-virtual/range {v0 .. v7}, Lc8/y;->c(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Landroid/app/Activity;ZZLc8/u0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_0
    iget-object p1, p0, Lc8/p0;->o:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 64
    .line 65
    new-instance v0, Lc8/a1;

    .line 66
    .line 67
    const/4 v1, 0x0

    .line 68
    invoke-direct {v0, v1, v1, v1}, Lc8/a1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-void
    .line 75
    .line 76
    .line 77
.end method
