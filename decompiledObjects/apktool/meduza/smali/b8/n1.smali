.class public final Lb8/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc8/u;


# instance fields
.field public final synthetic a:Lb8/r;

.field public final synthetic b:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;Lb8/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lb8/n1;->a:Lb8/r;

    iput-object p1, p0, Lb8/n1;->b:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 2

    iget-object v0, p0, Lb8/n1;->b:Lcom/google/firebase/auth/FirebaseAuth;

    .line 1
    iget-object v0, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lb8/r;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lb8/r;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lb8/n1;->a:Lb8/r;

    invoke-virtual {v1}, Lb8/r;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb8/n1;->b:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-virtual {v0}, Lcom/google/firebase/auth/FirebaseAuth;->s()V

    :cond_0
    return-void
.end method

.method public final zza(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    .line 3
    iget p1, p1, Lcom/google/android/gms/common/api/Status;->a:I

    const/16 v0, 0x4273

    if-eq p1, v0, :cond_0

    const/16 v0, 0x427d

    if-eq p1, v0, :cond_0

    const/16 v0, 0x426d

    if-ne p1, v0, :cond_1

    .line 4
    :cond_0
    iget-object p1, p0, Lb8/n1;->b:Lcom/google/firebase/auth/FirebaseAuth;

    .line 5
    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->s()V

    .line 6
    iget-object p1, p1, Lcom/google/firebase/auth/FirebaseAuth;->x:Lc8/r0;

    if-eqz p1, :cond_1

    .line 7
    iget-object p1, p1, Lc8/r0;->b:Lc8/r;

    .line 8
    iget-object v0, p1, Lc8/r;->e:Lcom/google/android/gms/internal/firebase-auth-api/zze;

    .line 9
    iget-object p1, p1, Lc8/r;->f:Li6/t;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method
