.class public Lcom/google/firebase/auth/FirebaseAuth;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc8/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/auth/FirebaseAuth$b;,
        Lcom/google/firebase/auth/FirebaseAuth$a;,
        Lcom/google/firebase/auth/FirebaseAuth$d;,
        Lcom/google/firebase/auth/FirebaseAuth$c;
    }
.end annotation


# instance fields
.field public final A:Ljava/util/concurrent/Executor;

.field public B:Ljava/lang/String;

.field public final a:Lu7/f;

.field public final b:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final c:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final d:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final e:Lcom/google/android/gms/internal/firebase-auth-api/zzabq;

.field public f:Lb8/r;

.field public final g:Lc8/f;

.field public final h:Ljava/lang/Object;

.field public i:Ljava/lang/String;

.field public final j:Ljava/lang/Object;

.field public k:Ljava/lang/String;

.field public l:Lc8/m0;

.field public final m:Lcom/google/android/recaptcha/RecaptchaAction;

.field public final n:Lcom/google/android/recaptcha/RecaptchaAction;

.field public final o:Lcom/google/android/recaptcha/RecaptchaAction;

.field public final p:Lcom/google/android/recaptcha/RecaptchaAction;

.field public final q:Lcom/google/android/recaptcha/RecaptchaAction;

.field public final r:Lcom/google/android/recaptcha/RecaptchaAction;

.field public final s:Lc8/n0;

.field public final t:Lc8/u0;

.field public final u:Lc8/y;

.field public final v:Lt9/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt9/b<",
            "La8/a;",
            ">;"
        }
    .end annotation
.end field

.field public final w:Lt9/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt9/b<",
            "Lq9/e;",
            ">;"
        }
    .end annotation
.end field

.field public x:Lc8/r0;

.field public final y:Ljava/util/concurrent/Executor;

.field public final z:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Lu7/f;Lt9/b;Lt9/b;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;)V
    .locals 7

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzabq;

    invoke-direct {v0, p1, p4, p6}, Lcom/google/android/gms/internal/firebase-auth-api/zzabq;-><init>(Lu7/f;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V

    new-instance p6, Lc8/n0;

    .line 1
    invoke-virtual {p1}, Lu7/f;->a()V

    .line 2
    iget-object v1, p1, Lu7/f;->a:Landroid/content/Context;

    .line 3
    invoke-virtual {p1}, Lu7/f;->g()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p6, v1, v2}, Lc8/n0;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 4
    sget-object v1, Lc8/u0;->c:Lc8/u0;

    .line 5
    sget-object v2, Lc8/y;->b:Lc8/y;

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v3, p0, Lcom/google/firebase/auth/FirebaseAuth;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v3, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v3, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v3, Ljava/lang/Object;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v3, p0, Lcom/google/firebase/auth/FirebaseAuth;->h:Ljava/lang/Object;

    new-instance v3, Ljava/lang/Object;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v3, p0, Lcom/google/firebase/auth/FirebaseAuth;->j:Ljava/lang/Object;

    const-string v3, "getOobCode"

    invoke-static {v3}, Lcom/google/android/recaptcha/RecaptchaAction;->custom(Ljava/lang/String;)Lcom/google/android/recaptcha/RecaptchaAction;

    move-result-object v3

    iput-object v3, p0, Lcom/google/firebase/auth/FirebaseAuth;->m:Lcom/google/android/recaptcha/RecaptchaAction;

    const-string v3, "signInWithPassword"

    invoke-static {v3}, Lcom/google/android/recaptcha/RecaptchaAction;->custom(Ljava/lang/String;)Lcom/google/android/recaptcha/RecaptchaAction;

    move-result-object v3

    iput-object v3, p0, Lcom/google/firebase/auth/FirebaseAuth;->n:Lcom/google/android/recaptcha/RecaptchaAction;

    const-string v3, "signUpPassword"

    invoke-static {v3}, Lcom/google/android/recaptcha/RecaptchaAction;->custom(Ljava/lang/String;)Lcom/google/android/recaptcha/RecaptchaAction;

    move-result-object v3

    iput-object v3, p0, Lcom/google/firebase/auth/FirebaseAuth;->o:Lcom/google/android/recaptcha/RecaptchaAction;

    const-string v3, "sendVerificationCode"

    invoke-static {v3}, Lcom/google/android/recaptcha/RecaptchaAction;->custom(Ljava/lang/String;)Lcom/google/android/recaptcha/RecaptchaAction;

    move-result-object v3

    iput-object v3, p0, Lcom/google/firebase/auth/FirebaseAuth;->p:Lcom/google/android/recaptcha/RecaptchaAction;

    const-string v3, "mfaSmsEnrollment"

    invoke-static {v3}, Lcom/google/android/recaptcha/RecaptchaAction;->custom(Ljava/lang/String;)Lcom/google/android/recaptcha/RecaptchaAction;

    move-result-object v3

    iput-object v3, p0, Lcom/google/firebase/auth/FirebaseAuth;->q:Lcom/google/android/recaptcha/RecaptchaAction;

    const-string v3, "mfaSmsSignIn"

    invoke-static {v3}, Lcom/google/android/recaptcha/RecaptchaAction;->custom(Ljava/lang/String;)Lcom/google/android/recaptcha/RecaptchaAction;

    move-result-object v3

    iput-object v3, p0, Lcom/google/firebase/auth/FirebaseAuth;->r:Lcom/google/android/recaptcha/RecaptchaAction;

    iput-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lu7/f;

    iput-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabq;

    iput-object p6, p0, Lcom/google/firebase/auth/FirebaseAuth;->s:Lc8/n0;

    new-instance p1, Lc8/f;

    invoke-direct {p1}, Lc8/f;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->g:Lc8/f;

    invoke-static {v1}, Lm6/j;->i(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->t:Lc8/u0;

    invoke-static {v2}, Lm6/j;->i(Ljava/lang/Object;)V

    iput-object v2, p0, Lcom/google/firebase/auth/FirebaseAuth;->u:Lc8/y;

    iput-object p2, p0, Lcom/google/firebase/auth/FirebaseAuth;->v:Lt9/b;

    iput-object p3, p0, Lcom/google/firebase/auth/FirebaseAuth;->w:Lt9/b;

    iput-object p4, p0, Lcom/google/firebase/auth/FirebaseAuth;->y:Ljava/util/concurrent/Executor;

    iput-object p5, p0, Lcom/google/firebase/auth/FirebaseAuth;->z:Ljava/util/concurrent/Executor;

    iput-object p7, p0, Lcom/google/firebase/auth/FirebaseAuth;->A:Ljava/util/concurrent/Executor;

    const-string p1, "type"

    .line 7
    iget-object p2, p6, Lc8/n0;->c:Landroid/content/SharedPreferences;

    const-string p3, "com.google.firebase.auth.FIREBASE_USER"

    const/4 p4, 0x0

    .line 8
    invoke-interface {p2, p3, p4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    new-instance p3, Lorg/json/JSONObject;

    invoke-direct {p3, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p3, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "com.google.firebase.auth.internal.DefaultFirebaseUser"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p6, p3}, Lc8/n0;->a(Lorg/json/JSONObject;)Lc8/i;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :cond_1
    :goto_0
    move-object p1, p4

    .line 9
    :goto_1
    iput-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lb8/r;

    const/4 p2, 0x1

    const/4 p3, 0x0

    if-eqz p1, :cond_3

    iget-object p5, p0, Lcom/google/firebase/auth/FirebaseAuth;->s:Lc8/n0;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    iget-object p5, p5, Lc8/n0;->c:Landroid/content/SharedPreferences;

    new-array p6, p2, [Ljava/lang/Object;

    .line 11
    iget-object p1, p1, Lc8/i;->b:Lc8/e;

    .line 12
    iget-object p1, p1, Lc8/e;->a:Ljava/lang/String;

    aput-object p1, p6, p3

    const-string p1, "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"

    .line 13
    invoke-static {p1, p6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p5, p1, p4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagw;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

    move-result-object p1

    goto :goto_2

    :cond_2
    move-object p1, p4

    :goto_2
    if-eqz p1, :cond_3

    .line 14
    iget-object p5, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lb8/r;

    invoke-static {p0, p5, p1, p3, p3}, Lcom/google/firebase/auth/FirebaseAuth;->n(Lcom/google/firebase/auth/FirebaseAuth;Lb8/r;Lcom/google/android/gms/internal/firebase-auth-api/zzagw;ZZ)V

    :cond_3
    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->t:Lc8/u0;

    .line 15
    iget-object p1, p1, Lc8/u0;->a:Lc8/f0;

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    iget-object p5, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lu7/f;

    .line 18
    invoke-virtual {p5}, Lu7/f;->a()V

    .line 19
    iget-object p5, p5, Lu7/f;->a:Landroid/content/Context;

    const-string p6, "com.google.firebase.auth.internal.ProcessDeathHelper"

    .line 20
    invoke-virtual {p5, p6, p3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p5

    const-string p6, ""

    const-string p7, "firebaseAppName"

    invoke-interface {p5, p7, p6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p7

    .line 21
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lu7/f;

    .line 22
    invoke-virtual {v0}, Lu7/f;->a()V

    .line 23
    iget-object v0, v0, Lu7/f;->b:Ljava/lang/String;

    .line 24
    invoke-virtual {v0, p7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p7

    if-nez p7, :cond_4

    goto/16 :goto_8

    :cond_4
    const-string p7, "verifyAssertionRequest"

    invoke-interface {p5, p7}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "operation"

    const-wide/16 v2, 0x0

    const-string v4, "timestamp"

    if-eqz v0, :cond_a

    invoke-interface {p5, p7, p6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p7

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaic;->CREATOR:Landroid/os/Parcelable$Creator;

    if-nez p7, :cond_5

    move-object p7, p4

    goto :goto_3

    :cond_5
    const/16 v5, 0xa

    .line 25
    invoke-static {p7, v5}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p7

    .line 26
    :goto_3
    invoke-static {v0}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v5

    array-length v6, p7

    invoke-virtual {v5, p7, p3, v6}, Landroid/os/Parcel;->unmarshall([BII)V

    invoke-virtual {v5, p3}, Landroid/os/Parcel;->setDataPosition(I)V

    invoke-interface {v0, v5}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p7

    check-cast p7, Ln6/c;

    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    .line 27
    check-cast p7, Lcom/google/android/gms/internal/firebase-auth-api/zzaic;

    invoke-interface {p5, v1, p6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "tenantId"

    invoke-interface {p5, v1, p4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    const-string v1, "firebaseUserUid"

    invoke-interface {p5, v1, p6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p6

    invoke-interface {p5, v4, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v1

    iput-wide v1, p1, Lc8/f0;->b:J

    if-eqz p4, :cond_6

    .line 28
    invoke-static {p4}, Lm6/j;->e(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->j:Ljava/lang/Object;

    monitor-enter p1

    :try_start_1
    iput-object p4, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    invoke-virtual {p7, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzaic;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzaic;

    goto :goto_4

    :catchall_0
    move-exception p2

    .line 30
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p2

    .line 31
    :cond_6
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, -0x1

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result p4

    sparse-switch p4, :sswitch_data_0

    :goto_5
    move p2, p1

    goto :goto_6

    :sswitch_0
    const-string p2, "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    goto :goto_5

    :cond_7
    const/4 p2, 0x2

    goto :goto_6

    :sswitch_1
    const-string p3, "com.google.firebase.auth.internal.NONGMSCORE_LINK"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_9

    goto :goto_5

    :sswitch_2
    const-string p2, "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_8

    goto :goto_5

    :cond_8
    move p2, p3

    :cond_9
    :goto_6
    packed-switch p2, :pswitch_data_0

    goto :goto_7

    :pswitch_0
    invoke-static {p7}, Lb8/c1;->H(Lcom/google/android/gms/internal/firebase-auth-api/zzaic;)Lb8/c1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/auth/FirebaseAuth;->g(Lb8/f;)Lcom/google/android/gms/tasks/Task;

    goto :goto_7

    .line 32
    :pswitch_1
    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lb8/r;

    .line 33
    invoke-virtual {p1}, Lb8/r;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    .line 34
    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lb8/r;

    .line 35
    invoke-static {p7}, Lb8/c1;->H(Lcom/google/android/gms/internal/firebase-auth-api/zzaic;)Lb8/c1;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/auth/FirebaseAuth;->i(Lb8/r;Lb8/f;)Lcom/google/android/gms/tasks/Task;

    goto :goto_7

    .line 36
    :pswitch_2
    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lb8/r;

    .line 37
    invoke-virtual {p1}, Lb8/r;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    .line 38
    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lb8/r;

    .line 39
    invoke-static {p7}, Lb8/c1;->H(Lcom/google/android/gms/internal/firebase-auth-api/zzaic;)Lb8/c1;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/auth/FirebaseAuth;->r(Lb8/r;Lb8/f;)Lcom/google/android/gms/tasks/Task;

    goto :goto_7

    :cond_a
    const-string p2, "recaptchaToken"

    invoke-interface {p5, p2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_d

    invoke-interface {p5, p2, p6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p5, v1, p6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-interface {p5, v4, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide p6

    iput-wide p6, p1, Lc8/f0;->b:J

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p6, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA"

    invoke-virtual {p3, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_b

    iput-object p4, p1, Lc8/f0;->a:Lcom/google/android/gms/tasks/Task;

    goto :goto_7

    :cond_b
    invoke-static {p2}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p2

    iput-object p2, p1, Lc8/f0;->a:Lcom/google/android/gms/tasks/Task;

    :cond_c
    :goto_7
    invoke-static {p5}, Lc8/f0;->d(Landroid/content/SharedPreferences;)V

    goto :goto_8

    :cond_d
    const-string p2, "statusCode"

    invoke-interface {p5, p2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_e

    const/16 p3, 0x42a6

    invoke-interface {p5, p2, p3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p2

    const-string p3, "statusMessage"

    invoke-interface {p5, p3, p6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    new-instance p6, Lcom/google/android/gms/common/api/Status;

    .line 40
    invoke-direct {p6, p2, p3, p4, p4}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lj6/b;)V

    .line 41
    invoke-interface {p5, v4, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide p2

    iput-wide p2, p1, Lc8/f0;->b:J

    invoke-static {p5}, Lc8/f0;->d(Landroid/content/SharedPreferences;)V

    invoke-static {p6}, Lcom/google/android/gms/internal/firebase-auth-api/zzadr;->zza(Lcom/google/android/gms/common/api/Status;)Lu7/h;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    :cond_e
    :goto_8
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x5df2262 -> :sswitch_2
        0xa6e6490 -> :sswitch_1
        0x56745691 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static getInstance()Lcom/google/firebase/auth/FirebaseAuth;
    .locals 2

    invoke-static {}, Lu7/f;->e()Lu7/f;

    move-result-object v0

    const-class v1, Lcom/google/firebase/auth/FirebaseAuth;

    invoke-virtual {v0, v1}, Lu7/f;->c(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/FirebaseAuth;

    return-object v0
.end method

.method public static getInstance(Lu7/f;)Lcom/google/firebase/auth/FirebaseAuth;
    .locals 1

    const-class v0, Lcom/google/firebase/auth/FirebaseAuth;

    invoke-virtual {p0, v0}, Lu7/f;->c(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/auth/FirebaseAuth;

    return-object p0
.end method

.method public static l(Lb8/d0;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lb8/d0;->h:Lb8/z;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v3, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v3, v1

    .line 10
    :goto_0
    if-eqz v3, :cond_7

    .line 11
    .line 12
    iget-object v3, p0, Lb8/d0;->a:Lcom/google/firebase/auth/FirebaseAuth;

    .line 13
    .line 14
    invoke-static {v0}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    check-cast v0, Lc8/n;

    .line 18
    .line 19
    iget-object v4, v0, Lc8/n;->a:Ljava/lang/String;

    .line 20
    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    move v4, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move v4, v1

    .line 26
    :goto_1
    if-eqz v4, :cond_2

    .line 27
    .line 28
    iget-object v4, p0, Lb8/d0;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v4}, Lm6/j;->e(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    move-object v6, v4

    .line 34
    move-object v12, v6

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    iget-object v4, p0, Lb8/d0;->i:Lb8/h0;

    .line 37
    .line 38
    invoke-static {v4}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v5, v4, Lb8/h0;->a:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v5}, Lm6/j;->e(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v4, v4, Lb8/h0;->d:Ljava/lang/String;

    .line 47
    .line 48
    move-object v6, v4

    .line 49
    move-object v12, v5

    .line 50
    :goto_2
    iget-object v4, p0, Lb8/d0;->g:Lb8/e0;

    .line 51
    .line 52
    if-eqz v4, :cond_3

    .line 53
    .line 54
    iget-object v4, p0, Lb8/d0;->c:Lb8/f0;

    .line 55
    .line 56
    iget-object v5, p0, Lb8/d0;->f:Landroid/app/Activity;

    .line 57
    .line 58
    iget-object v7, p0, Lb8/d0;->d:Ljava/util/concurrent/Executor;

    .line 59
    .line 60
    invoke-static {v12, v4, v5, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzafc;->zza(Ljava/lang/String;Lb8/f0;Landroid/app/Activity;Ljava/util/concurrent/Executor;)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-nez v4, :cond_6

    .line 65
    .line 66
    :cond_3
    iget-object v0, v0, Lc8/n;->a:Ljava/lang/String;

    .line 67
    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    move v1, v2

    .line 71
    :cond_4
    if-eqz v1, :cond_5

    .line 72
    .line 73
    iget-object v0, v3, Lcom/google/firebase/auth/FirebaseAuth;->q:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_5
    iget-object v0, v3, Lcom/google/firebase/auth/FirebaseAuth;->r:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 77
    .line 78
    :goto_3
    move-object v11, v0

    .line 79
    iget-object v4, v3, Lcom/google/firebase/auth/FirebaseAuth;->u:Lc8/y;

    .line 80
    .line 81
    iget-object v7, p0, Lb8/d0;->f:Landroid/app/Activity;

    .line 82
    .line 83
    invoke-virtual {v3}, Lcom/google/firebase/auth/FirebaseAuth;->t()Z

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    iget-boolean v9, p0, Lb8/d0;->j:Z

    .line 88
    .line 89
    iget-boolean v10, p0, Lb8/d0;->k:Z

    .line 90
    .line 91
    move-object v5, v3

    .line 92
    invoke-virtual/range {v4 .. v11}, Lc8/y;->a(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Landroid/app/Activity;ZZZLcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    new-instance v1, Lb8/j1;

    .line 97
    .line 98
    invoke-direct {v1, v3, p0, v12}, Lb8/j1;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Lb8/d0;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 102
    .line 103
    .line 104
    :cond_6
    return-void

    .line 105
    :cond_7
    iget-object v0, p0, Lb8/d0;->a:Lcom/google/firebase/auth/FirebaseAuth;

    .line 106
    .line 107
    iget-object v3, p0, Lb8/d0;->e:Ljava/lang/String;

    .line 108
    .line 109
    invoke-static {v3}, Lm6/j;->e(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    iget-object v4, p0, Lb8/d0;->g:Lb8/e0;

    .line 113
    .line 114
    if-eqz v4, :cond_8

    .line 115
    .line 116
    move v1, v2

    .line 117
    :cond_8
    if-nez v1, :cond_9

    .line 118
    .line 119
    iget-object v1, p0, Lb8/d0;->c:Lb8/f0;

    .line 120
    .line 121
    iget-object v2, p0, Lb8/d0;->f:Landroid/app/Activity;

    .line 122
    .line 123
    iget-object v4, p0, Lb8/d0;->d:Ljava/util/concurrent/Executor;

    .line 124
    .line 125
    invoke-static {v3, v1, v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzafc;->zza(Ljava/lang/String;Lb8/f0;Landroid/app/Activity;Ljava/util/concurrent/Executor;)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-nez v1, :cond_a

    .line 130
    .line 131
    :cond_9
    iget-object v4, v0, Lcom/google/firebase/auth/FirebaseAuth;->u:Lc8/y;

    .line 132
    .line 133
    iget-object v7, p0, Lb8/d0;->f:Landroid/app/Activity;

    .line 134
    .line 135
    invoke-virtual {v0}, Lcom/google/firebase/auth/FirebaseAuth;->t()Z

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    iget-boolean v9, p0, Lb8/d0;->j:Z

    .line 140
    .line 141
    iget-boolean v10, p0, Lb8/d0;->k:Z

    .line 142
    .line 143
    iget-object v11, v0, Lcom/google/firebase/auth/FirebaseAuth;->p:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 144
    .line 145
    move-object v5, v0

    .line 146
    move-object v6, v3

    .line 147
    invoke-virtual/range {v4 .. v11}, Lc8/y;->a(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Landroid/app/Activity;ZZZLcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    new-instance v2, Lb8/h1;

    .line 152
    .line 153
    invoke-direct {v2, v0, p0, v3}, Lb8/h1;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Lb8/d0;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 157
    .line 158
    .line 159
    :cond_a
    return-void
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
.end method

.method public static m(Lcom/google/firebase/auth/FirebaseAuth;Lb8/r;)V
    .locals 3

    const-string v0, "FirebaseAuth"

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lb8/r;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Notifying auth state listeners about user ( "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " )."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, "Notifying auth state listeners about a sign-out event."

    :goto_0
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->A:Ljava/util/concurrent/Executor;

    new-instance v0, Lcom/google/firebase/auth/g;

    invoke-direct {v0, p0}, Lcom/google/firebase/auth/g;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static n(Lcom/google/firebase/auth/FirebaseAuth;Lb8/r;Lcom/google/android/gms/internal/firebase-auth-api/zzagw;ZZ)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static/range {p2 .. p2}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v1, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lb8/r;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual/range {p1 .. p1}, Lb8/r;->a()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v4, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lb8/r;

    .line 20
    .line 21
    invoke-virtual {v4}, Lb8/r;->a()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    move v1, v2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v1, v3

    .line 34
    :goto_0
    if-nez v1, :cond_1

    .line 35
    .line 36
    if-eqz p4, :cond_1

    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iget-object v4, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lb8/r;

    .line 40
    .line 41
    if-nez v4, :cond_2

    .line 42
    .line 43
    move v1, v2

    .line 44
    move v4, v1

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    invoke-virtual {v4}, Lb8/r;->O()Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzagw;->zzc()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzagw;->zzc()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    xor-int/2addr v4, v2

    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    if-nez v4, :cond_3

    .line 66
    .line 67
    move v4, v3

    .line 68
    goto :goto_1

    .line 69
    :cond_3
    move v4, v2

    .line 70
    :goto_1
    if-nez v1, :cond_4

    .line 71
    .line 72
    move v1, v2

    .line 73
    goto :goto_2

    .line 74
    :cond_4
    move v1, v3

    .line 75
    :goto_2
    iget-object v5, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lb8/r;

    .line 76
    .line 77
    if-eqz v5, :cond_7

    .line 78
    .line 79
    invoke-virtual/range {p1 .. p1}, Lb8/r;->a()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-virtual/range {p0 .. p0}, Lcom/google/firebase/auth/FirebaseAuth;->a()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-nez v5, :cond_5

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_5
    iget-object v5, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lb8/r;

    .line 95
    .line 96
    invoke-virtual/range {p1 .. p1}, Lb8/r;->F()Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    invoke-virtual {v5, v6}, Lb8/r;->J(Ljava/util/List;)Lc8/i;

    .line 101
    .line 102
    .line 103
    invoke-virtual/range {p1 .. p1}, Lb8/r;->H()Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-nez v5, :cond_6

    .line 108
    .line 109
    iget-object v5, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lb8/r;

    .line 110
    .line 111
    invoke-virtual {v5}, Lb8/r;->M()Lc8/i;

    .line 112
    .line 113
    .line 114
    :cond_6
    invoke-virtual/range {p1 .. p1}, Lb8/r;->E()Lc8/l;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-virtual {v5}, Lc8/l;->b()Ljava/util/ArrayList;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-virtual/range {p1 .. p1}, Lb8/r;->Q()Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    iget-object v7, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lb8/r;

    .line 127
    .line 128
    invoke-virtual {v7, v5}, Lb8/r;->P(Ljava/util/List;)V

    .line 129
    .line 130
    .line 131
    iget-object v5, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lb8/r;

    .line 132
    .line 133
    invoke-virtual {v5, v6}, Lb8/r;->N(Ljava/util/List;)V

    .line 134
    .line 135
    .line 136
    move-object/from16 v5, p1

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_7
    :goto_3
    move-object/from16 v5, p1

    .line 140
    .line 141
    iput-object v5, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lb8/r;

    .line 142
    .line 143
    :goto_4
    if-eqz p3, :cond_18

    .line 144
    .line 145
    iget-object v6, v0, Lcom/google/firebase/auth/FirebaseAuth;->s:Lc8/n0;

    .line 146
    .line 147
    iget-object v7, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lb8/r;

    .line 148
    .line 149
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-static {v7}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    new-instance v8, Lorg/json/JSONObject;

    .line 156
    .line 157
    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 158
    .line 159
    .line 160
    const-class v9, Lc8/i;

    .line 161
    .line 162
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    move-result-object v10

    .line 166
    invoke-virtual {v9, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 167
    .line 168
    .line 169
    move-result v9

    .line 170
    if-eqz v9, :cond_17

    .line 171
    .line 172
    check-cast v7, Lc8/i;

    .line 173
    .line 174
    :try_start_0
    const-string v9, "cachedTokenState"

    .line 175
    .line 176
    invoke-virtual {v7}, Lc8/i;->zze()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 181
    .line 182
    .line 183
    const-string v9, "applicationName"

    .line 184
    .line 185
    invoke-virtual {v7}, Lc8/i;->K()Lu7/f;

    .line 186
    .line 187
    .line 188
    move-result-object v10

    .line 189
    invoke-virtual {v10}, Lu7/f;->a()V

    .line 190
    .line 191
    .line 192
    iget-object v10, v10, Lu7/f;->b:Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 195
    .line 196
    .line 197
    const-string v9, "type"

    .line 198
    .line 199
    const-string v10, "com.google.firebase.auth.internal.DefaultFirebaseUser"

    .line 200
    .line 201
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 202
    .line 203
    .line 204
    iget-object v9, v7, Lc8/i;->e:Ljava/util/List;

    .line 205
    .line 206
    if-eqz v9, :cond_11

    .line 207
    .line 208
    new-instance v9, Lorg/json/JSONArray;

    .line 209
    .line 210
    invoke-direct {v9}, Lorg/json/JSONArray;-><init>()V

    .line 211
    .line 212
    .line 213
    iget-object v10, v7, Lc8/i;->e:Ljava/util/List;

    .line 214
    .line 215
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 216
    .line 217
    .line 218
    move-result v11

    .line 219
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 220
    .line 221
    .line 222
    move-result v12

    .line 223
    const/16 v13, 0x1e

    .line 224
    .line 225
    const/4 v14, 0x2

    .line 226
    if-le v12, v13, :cond_8

    .line 227
    .line 228
    iget-object v11, v6, Lc8/n0;->d:Lp6/a;

    .line 229
    .line 230
    const-string v12, "Provider user info list size larger than max size, truncating list to %d. Actual list size: %d"

    .line 231
    .line 232
    new-array v15, v14, [Ljava/lang/Object;

    .line 233
    .line 234
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 235
    .line 236
    .line 237
    move-result-object v16

    .line 238
    aput-object v16, v15, v3

    .line 239
    .line 240
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 241
    .line 242
    .line 243
    move-result v16

    .line 244
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 245
    .line 246
    .line 247
    move-result-object v16

    .line 248
    aput-object v16, v15, v2

    .line 249
    .line 250
    invoke-virtual {v11, v12, v15}, Lp6/a;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 251
    .line 252
    .line 253
    move v11, v13

    .line 254
    :cond_8
    move v12, v3

    .line 255
    move v13, v12

    .line 256
    :goto_5
    const-string v15, "firebase"

    .line 257
    .line 258
    if-ge v12, v11, :cond_b

    .line 259
    .line 260
    :try_start_1
    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v16

    .line 264
    move-object/from16 v3, v16

    .line 265
    .line 266
    check-cast v3, Lc8/e;

    .line 267
    .line 268
    iget-object v14, v3, Lc8/e;->b:Ljava/lang/String;

    .line 269
    .line 270
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v14

    .line 274
    if-eqz v14, :cond_9

    .line 275
    .line 276
    move v13, v2

    .line 277
    :cond_9
    add-int/lit8 v14, v11, -0x1

    .line 278
    .line 279
    if-ne v12, v14, :cond_a

    .line 280
    .line 281
    if-eqz v13, :cond_b

    .line 282
    .line 283
    :cond_a
    invoke-virtual {v3}, Lc8/e;->E()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    invoke-virtual {v9, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 288
    .line 289
    .line 290
    add-int/lit8 v12, v12, 0x1

    .line 291
    .line 292
    const/4 v3, 0x0

    .line 293
    const/4 v14, 0x2

    .line 294
    goto :goto_5

    .line 295
    :cond_b
    if-nez v13, :cond_10

    .line 296
    .line 297
    add-int/lit8 v3, v11, -0x1

    .line 298
    .line 299
    :goto_6
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 300
    .line 301
    .line 302
    move-result v12

    .line 303
    if-ge v3, v12, :cond_e

    .line 304
    .line 305
    if-ltz v3, :cond_e

    .line 306
    .line 307
    invoke-interface {v10, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v12

    .line 311
    check-cast v12, Lc8/e;

    .line 312
    .line 313
    iget-object v14, v12, Lc8/e;->b:Ljava/lang/String;

    .line 314
    .line 315
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v14

    .line 319
    if-eqz v14, :cond_c

    .line 320
    .line 321
    invoke-virtual {v12}, Lc8/e;->E()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    invoke-virtual {v9, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 326
    .line 327
    .line 328
    move v13, v2

    .line 329
    goto :goto_7

    .line 330
    :cond_c
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 331
    .line 332
    .line 333
    move-result v14

    .line 334
    sub-int/2addr v14, v2

    .line 335
    if-ne v3, v14, :cond_d

    .line 336
    .line 337
    invoke-virtual {v12}, Lc8/e;->E()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v12

    .line 341
    invoke-virtual {v9, v12}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 342
    .line 343
    .line 344
    :cond_d
    add-int/lit8 v3, v3, 0x1

    .line 345
    .line 346
    goto :goto_6

    .line 347
    :cond_e
    :goto_7
    if-nez v13, :cond_10

    .line 348
    .line 349
    iget-object v3, v6, Lc8/n0;->d:Lp6/a;

    .line 350
    .line 351
    const-string v12, "Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d"

    .line 352
    .line 353
    const/4 v13, 0x2

    .line 354
    new-array v13, v13, [Ljava/lang/Object;

    .line 355
    .line 356
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 357
    .line 358
    .line 359
    move-result v14

    .line 360
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 361
    .line 362
    .line 363
    move-result-object v14

    .line 364
    const/4 v15, 0x0

    .line 365
    aput-object v14, v13, v15

    .line 366
    .line 367
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 368
    .line 369
    .line 370
    move-result-object v11

    .line 371
    aput-object v11, v13, v2

    .line 372
    .line 373
    invoke-virtual {v3, v12, v13}, Lp6/a;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 377
    .line 378
    .line 379
    move-result v3

    .line 380
    const/4 v11, 0x5

    .line 381
    if-ge v3, v11, :cond_10

    .line 382
    .line 383
    new-instance v3, Ljava/lang/StringBuilder;

    .line 384
    .line 385
    const-string v11, "Provider user info list:\n"

    .line 386
    .line 387
    invoke-direct {v3, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 391
    .line 392
    .line 393
    move-result-object v10

    .line 394
    :goto_8
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 395
    .line 396
    .line 397
    move-result v11

    .line 398
    if-eqz v11, :cond_f

    .line 399
    .line 400
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v11

    .line 404
    check-cast v11, Lc8/e;

    .line 405
    .line 406
    const-string v12, "Provider - %s\n"

    .line 407
    .line 408
    new-array v13, v2, [Ljava/lang/Object;

    .line 409
    .line 410
    iget-object v11, v11, Lc8/e;->b:Ljava/lang/String;

    .line 411
    .line 412
    const/4 v14, 0x0

    .line 413
    aput-object v11, v13, v14

    .line 414
    .line 415
    invoke-static {v12, v13}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v11

    .line 419
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 420
    .line 421
    .line 422
    goto :goto_8

    .line 423
    :cond_f
    iget-object v10, v6, Lc8/n0;->d:Lp6/a;

    .line 424
    .line 425
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v3

    .line 429
    const/4 v11, 0x0

    .line 430
    new-array v12, v11, [Ljava/lang/Object;

    .line 431
    .line 432
    invoke-virtual {v10, v3, v12}, Lp6/a;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    :cond_10
    const-string v3, "userInfos"

    .line 436
    .line 437
    invoke-virtual {v8, v3, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 438
    .line 439
    .line 440
    :cond_11
    const-string v3, "anonymous"

    .line 441
    .line 442
    invoke-virtual {v7}, Lc8/i;->H()Z

    .line 443
    .line 444
    .line 445
    move-result v9

    .line 446
    invoke-virtual {v8, v3, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 447
    .line 448
    .line 449
    const-string v3, "version"

    .line 450
    .line 451
    const-string v9, "2"

    .line 452
    .line 453
    invoke-virtual {v8, v3, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 454
    .line 455
    .line 456
    iget-object v3, v7, Lc8/i;->q:Lc8/k;

    .line 457
    .line 458
    if-eqz v3, :cond_12

    .line 459
    .line 460
    const-string v9, "userMetadata"

    .line 461
    .line 462
    new-instance v10, Lorg/json/JSONObject;

    .line 463
    .line 464
    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 465
    .line 466
    .line 467
    :try_start_2
    const-string v11, "lastSignInTimestamp"

    .line 468
    .line 469
    iget-wide v12, v3, Lc8/k;->a:J

    .line 470
    .line 471
    invoke-virtual {v10, v11, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 472
    .line 473
    .line 474
    const-string v11, "creationTimestamp"

    .line 475
    .line 476
    iget-wide v12, v3, Lc8/k;->b:J

    .line 477
    .line 478
    invoke-virtual {v10, v11, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 479
    .line 480
    .line 481
    :catch_0
    :try_start_3
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 482
    .line 483
    .line 484
    :cond_12
    new-instance v3, Lc8/l;

    .line 485
    .line 486
    invoke-direct {v3, v7}, Lc8/l;-><init>(Lc8/i;)V

    .line 487
    .line 488
    .line 489
    invoke-virtual {v3}, Lc8/l;->b()Ljava/util/ArrayList;

    .line 490
    .line 491
    .line 492
    move-result-object v3

    .line 493
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 494
    .line 495
    .line 496
    move-result v9

    .line 497
    if-nez v9, :cond_14

    .line 498
    .line 499
    new-instance v9, Lorg/json/JSONArray;

    .line 500
    .line 501
    invoke-direct {v9}, Lorg/json/JSONArray;-><init>()V

    .line 502
    .line 503
    .line 504
    const/4 v10, 0x0

    .line 505
    :goto_9
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 506
    .line 507
    .line 508
    move-result v11

    .line 509
    if-ge v10, v11, :cond_13

    .line 510
    .line 511
    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v11

    .line 515
    check-cast v11, Lb8/x;

    .line 516
    .line 517
    invoke-virtual {v11}, Lb8/x;->F()Lorg/json/JSONObject;

    .line 518
    .line 519
    .line 520
    move-result-object v11

    .line 521
    invoke-virtual {v9, v11}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 522
    .line 523
    .line 524
    add-int/lit8 v10, v10, 0x1

    .line 525
    .line 526
    goto :goto_9

    .line 527
    :cond_13
    const-string v3, "userMultiFactorInfo"

    .line 528
    .line 529
    invoke-virtual {v8, v3, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 530
    .line 531
    .line 532
    :cond_14
    iget-object v3, v7, Lc8/i;->u:Ljava/util/List;

    .line 533
    .line 534
    if-eqz v3, :cond_16

    .line 535
    .line 536
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 537
    .line 538
    .line 539
    move-result v7

    .line 540
    if-nez v7, :cond_16

    .line 541
    .line 542
    new-instance v7, Lorg/json/JSONArray;

    .line 543
    .line 544
    invoke-direct {v7}, Lorg/json/JSONArray;-><init>()V

    .line 545
    .line 546
    .line 547
    const/4 v9, 0x0

    .line 548
    :goto_a
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 549
    .line 550
    .line 551
    move-result v10

    .line 552
    if-ge v9, v10, :cond_15

    .line 553
    .line 554
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v10

    .line 558
    check-cast v10, Lb8/t0;

    .line 559
    .line 560
    new-instance v11, Lorg/json/JSONObject;

    .line 561
    .line 562
    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    .line 563
    .line 564
    .line 565
    iget-object v12, v10, Lb8/t0;->a:Ljava/lang/String;

    .line 566
    .line 567
    const-string v13, "credentialId"

    .line 568
    .line 569
    invoke-virtual {v11, v13, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 570
    .line 571
    .line 572
    iget-object v12, v10, Lb8/t0;->b:Ljava/lang/String;

    .line 573
    .line 574
    const-string v13, "name"

    .line 575
    .line 576
    invoke-virtual {v11, v13, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 577
    .line 578
    .line 579
    iget-object v10, v10, Lb8/t0;->c:Ljava/lang/String;

    .line 580
    .line 581
    const-string v12, "displayName"

    .line 582
    .line 583
    invoke-virtual {v11, v12, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v7, v11}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 587
    .line 588
    .line 589
    add-int/lit8 v9, v9, 0x1

    .line 590
    .line 591
    goto :goto_a

    .line 592
    :cond_15
    const-string v3, "passkeyInfo"

    .line 593
    .line 594
    invoke-virtual {v8, v3, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 595
    .line 596
    .line 597
    :cond_16
    invoke-virtual {v8}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 601
    goto :goto_b

    .line 602
    :catch_1
    move-exception v0

    .line 603
    iget-object v1, v6, Lc8/n0;->d:Lp6/a;

    .line 604
    .line 605
    const/4 v2, 0x0

    .line 606
    new-array v2, v2, [Ljava/lang/Object;

    .line 607
    .line 608
    iget-object v3, v1, Lp6/a;->a:Ljava/lang/String;

    .line 609
    .line 610
    const-string v4, "Failed to turn object into JSON"

    .line 611
    .line 612
    invoke-virtual {v1, v4, v2}, Lp6/a;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    invoke-static {v3, v1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 617
    .line 618
    .line 619
    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzzp;

    .line 620
    .line 621
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzzp;-><init>(Ljava/lang/Throwable;)V

    .line 622
    .line 623
    .line 624
    throw v1

    .line 625
    :cond_17
    const/4 v3, 0x0

    .line 626
    :goto_b
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 627
    .line 628
    .line 629
    move-result v7

    .line 630
    if-nez v7, :cond_18

    .line 631
    .line 632
    iget-object v6, v6, Lc8/n0;->c:Landroid/content/SharedPreferences;

    .line 633
    .line 634
    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 635
    .line 636
    .line 637
    move-result-object v6

    .line 638
    const-string v7, "com.google.firebase.auth.FIREBASE_USER"

    .line 639
    .line 640
    invoke-interface {v6, v7, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 641
    .line 642
    .line 643
    move-result-object v3

    .line 644
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 645
    .line 646
    .line 647
    :cond_18
    if-eqz v4, :cond_1a

    .line 648
    .line 649
    iget-object v3, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lb8/r;

    .line 650
    .line 651
    move-object/from16 v4, p2

    .line 652
    .line 653
    if-eqz v3, :cond_19

    .line 654
    .line 655
    invoke-virtual {v3, v4}, Lb8/r;->L(Lcom/google/android/gms/internal/firebase-auth-api/zzagw;)V

    .line 656
    .line 657
    .line 658
    :cond_19
    iget-object v3, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lb8/r;

    .line 659
    .line 660
    invoke-static {v0, v3}, Lcom/google/firebase/auth/FirebaseAuth;->q(Lcom/google/firebase/auth/FirebaseAuth;Lb8/r;)V

    .line 661
    .line 662
    .line 663
    goto :goto_c

    .line 664
    :cond_1a
    move-object/from16 v4, p2

    .line 665
    .line 666
    :goto_c
    if-eqz v1, :cond_1b

    .line 667
    .line 668
    iget-object v1, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lb8/r;

    .line 669
    .line 670
    invoke-static {v0, v1}, Lcom/google/firebase/auth/FirebaseAuth;->m(Lcom/google/firebase/auth/FirebaseAuth;Lb8/r;)V

    .line 671
    .line 672
    .line 673
    :cond_1b
    if-eqz p3, :cond_1c

    .line 674
    .line 675
    iget-object v1, v0, Lcom/google/firebase/auth/FirebaseAuth;->s:Lc8/n0;

    .line 676
    .line 677
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 678
    .line 679
    .line 680
    iget-object v1, v1, Lc8/n0;->c:Landroid/content/SharedPreferences;

    .line 681
    .line 682
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 683
    .line 684
    .line 685
    move-result-object v1

    .line 686
    new-array v3, v2, [Ljava/lang/Object;

    .line 687
    .line 688
    invoke-virtual/range {p1 .. p1}, Lb8/r;->a()Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v5

    .line 692
    const/4 v6, 0x0

    .line 693
    aput-object v5, v3, v6

    .line 694
    .line 695
    const-string v5, "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"

    .line 696
    .line 697
    invoke-static {v5, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object v3

    .line 701
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzagw;->zzf()Ljava/lang/String;

    .line 702
    .line 703
    .line 704
    move-result-object v4

    .line 705
    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 706
    .line 707
    .line 708
    move-result-object v1

    .line 709
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 710
    .line 711
    .line 712
    goto :goto_d

    .line 713
    :cond_1c
    const/4 v6, 0x0

    .line 714
    :goto_d
    iget-object v1, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lb8/r;

    .line 715
    .line 716
    if-eqz v1, :cond_21

    .line 717
    .line 718
    iget-object v3, v0, Lcom/google/firebase/auth/FirebaseAuth;->x:Lc8/r0;

    .line 719
    .line 720
    if-nez v3, :cond_1d

    .line 721
    .line 722
    iget-object v3, v0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lu7/f;

    .line 723
    .line 724
    invoke-static {v3}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 725
    .line 726
    .line 727
    new-instance v4, Lc8/r0;

    .line 728
    .line 729
    invoke-direct {v4, v3}, Lc8/r0;-><init>(Lu7/f;)V

    .line 730
    .line 731
    .line 732
    iput-object v4, v0, Lcom/google/firebase/auth/FirebaseAuth;->x:Lc8/r0;

    .line 733
    .line 734
    :cond_1d
    iget-object v0, v0, Lcom/google/firebase/auth/FirebaseAuth;->x:Lc8/r0;

    .line 735
    .line 736
    invoke-virtual {v1}, Lb8/r;->O()Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

    .line 737
    .line 738
    .line 739
    move-result-object v1

    .line 740
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 741
    .line 742
    .line 743
    if-nez v1, :cond_1e

    .line 744
    .line 745
    goto :goto_f

    .line 746
    :cond_1e
    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagw;->zza()J

    .line 747
    .line 748
    .line 749
    move-result-wide v3

    .line 750
    const-wide/16 v7, 0x0

    .line 751
    .line 752
    cmp-long v5, v3, v7

    .line 753
    .line 754
    if-gtz v5, :cond_1f

    .line 755
    .line 756
    const-wide/16 v3, 0xe10

    .line 757
    .line 758
    :cond_1f
    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagw;->zzb()J

    .line 759
    .line 760
    .line 761
    move-result-wide v7

    .line 762
    const-wide/16 v9, 0x3e8

    .line 763
    .line 764
    mul-long/2addr v3, v9

    .line 765
    add-long/2addr v3, v7

    .line 766
    iget-object v1, v0, Lc8/r0;->b:Lc8/r;

    .line 767
    .line 768
    iput-wide v3, v1, Lc8/r;->a:J

    .line 769
    .line 770
    const-wide/16 v3, -0x1

    .line 771
    .line 772
    iput-wide v3, v1, Lc8/r;->b:J

    .line 773
    .line 774
    iget v1, v0, Lc8/r0;->a:I

    .line 775
    .line 776
    if-lez v1, :cond_20

    .line 777
    .line 778
    iget-boolean v1, v0, Lc8/r0;->c:Z

    .line 779
    .line 780
    if-nez v1, :cond_20

    .line 781
    .line 782
    goto :goto_e

    .line 783
    :cond_20
    move v2, v6

    .line 784
    :goto_e
    if-eqz v2, :cond_21

    .line 785
    .line 786
    iget-object v0, v0, Lc8/r0;->b:Lc8/r;

    .line 787
    .line 788
    invoke-virtual {v0}, Lc8/r;->a()V

    .line 789
    .line 790
    .line 791
    :cond_21
    :goto_f
    return-void
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
.end method

.method public static o(Lu7/h;Lb8/d0;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Invoking verification failure callback for phone number/uid - "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "FirebaseAuth"

    .line 16
    .line 17
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    iget-object v0, p1, Lb8/d0;->c:Lb8/f0;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-static {p2, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafc;->zza(Ljava/lang/String;Lb8/f0;Lcom/google/android/gms/internal/firebase-auth-api/zzaeg;)Lb8/f0;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    iget-object p1, p1, Lb8/d0;->d:Ljava/util/concurrent/Executor;

    .line 28
    .line 29
    new-instance v0, Ll6/q0;

    .line 30
    .line 31
    const/4 v1, 0x7

    .line 32
    invoke-direct {v0, p2, p0, v1}, Ll6/q0;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    return-void
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
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
.end method

.method public static q(Lcom/google/firebase/auth/FirebaseAuth;Lb8/r;)V
    .locals 4

    const-string v0, "FirebaseAuth"

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lb8/r;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Notifying id token listeners about user ( "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " )."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "Notifying id token listeners about a sign-out event."

    :goto_0
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lb8/r;->zzd()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    new-instance v0, Ly9/b;

    invoke-direct {v0, p1}, Ly9/b;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->A:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/firebase/auth/h;

    invoke-direct {v1, p0, v0}, Lcom/google/firebase/auth/h;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Ly9/b;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lb8/r;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lb8/r;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lc8/a;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    monitor-enter p0

    .line 10
    :try_start_0
    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->x:Lc8/r0;

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lu7/f;

    .line 15
    .line 16
    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Lc8/r0;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Lc8/r0;-><init>(Lu7/f;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->x:Lc8/r0;

    .line 25
    .line 26
    :cond_0
    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->x:Lc8/r0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    monitor-exit p0

    .line 29
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {p1, v0}, Lc8/r0;->a(I)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    monitor-exit p0

    .line 41
    throw p1
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

.method public final c(Le9/c;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    monitor-enter p0

    .line 10
    :try_start_0
    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->x:Lc8/r0;

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lu7/f;

    .line 15
    .line 16
    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Lc8/r0;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Lc8/r0;-><init>(Lu7/f;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->x:Lc8/r0;

    .line 25
    .line 26
    :cond_0
    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->x:Lc8/r0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    monitor-exit p0

    .line 29
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {p1, v0}, Lc8/r0;->a(I)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    monitor-exit p0

    .line 41
    throw p1
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

.method public final d(Z)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/android/gms/tasks/Task<",
            "Lb8/s;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lb8/r;

    invoke-virtual {p0, v0, p1}, Lcom/google/firebase/auth/FirebaseAuth;->j(Lb8/r;Z)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/lang/String;Lb8/c;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lb8/c;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    new-instance p2, Lb8/c;

    .line 7
    .line 8
    new-instance v0, Lb8/c$a;

    .line 9
    .line 10
    invoke-direct {v0}, Lb8/c$a;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p2, v0}, Lb8/c;-><init>(Lb8/c$a;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->i:Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iput-object v0, p2, Lb8/c;->p:Ljava/lang/String;

    .line 21
    .line 22
    :cond_1
    const/4 v0, 0x1

    .line 23
    iput v0, p2, Lb8/c;->q:I

    .line 24
    .line 25
    new-instance v0, Lb8/l1;

    .line 26
    .line 27
    invoke-direct {v0, p0, p1, p2}, Lb8/l1;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Lb8/c;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 31
    .line 32
    iget-object p2, p0, Lcom/google/firebase/auth/FirebaseAuth;->m:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 33
    .line 34
    invoke-virtual {v0, p0, p1, p2}, Lc8/i0;->a(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Lcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
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

.method public final f(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "chrome-extension://"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iput-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->B:Ljava/lang/String;

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string v0, "://"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    move-object v0, p1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const-string v0, "http://"

    .line 26
    .line 27
    invoke-static {v0, p1}, Lf;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :goto_0
    :try_start_0
    new-instance v1, Ljava/net/URI;

    .line 32
    .line 33
    invoke-direct {v1, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->B:Ljava/lang/String;
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    return-void

    .line 46
    :catch_0
    move-exception v0

    .line 47
    const/4 v1, 0x4

    .line 48
    const-string v2, "FirebaseAuth"

    .line 49
    .line 50
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/net/URISyntaxException;->getMessage()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    new-instance v1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v3, "Error parsing URL: \'"

    .line 63
    .line 64
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v3, "\', "

    .line 71
    .line 72
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    :cond_2
    iput-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->B:Ljava/lang/String;

    .line 86
    .line 87
    return-void
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
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
.end method

.method public final g(Lb8/f;)Lcom/google/android/gms/tasks/Task;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb8/f;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lb8/g;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lb8/f;->F()Lb8/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    instance-of v0, p1, Lb8/h;

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    check-cast p1, Lb8/h;

    .line 10
    .line 11
    iget-object v0, p1, Lb8/h;->c:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x1

    .line 18
    xor-int/2addr v0, v1

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-object v3, p1, Lb8/h;->a:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v4, p1, Lb8/h;->b:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v4}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v5, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v7, 0x0

    .line 32
    move-object v2, p0

    .line 33
    invoke-virtual/range {v2 .. v7}, Lcom/google/firebase/auth/FirebaseAuth;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb8/r;Z)Lcom/google/android/gms/tasks/Task;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :cond_0
    iget-object v0, p1, Lb8/h;->c:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v0}, Lm6/j;->e(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    sget-object v2, Lb8/d;->d:Lcom/google/android/gms/internal/firebase-auth-api/zzan;

    .line 44
    .line 45
    invoke-static {v0}, Lm6/j;->e(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    :try_start_0
    new-instance v3, Lb8/d;

    .line 50
    .line 51
    invoke-direct {v3, v0}, Lb8/d;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catch_0
    move-object v3, v2

    .line 56
    :goto_0
    const/4 v0, 0x0

    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    iget-object v4, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 60
    .line 61
    iget-object v3, v3, Lb8/d;->c:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v4, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-nez v3, :cond_1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    move v1, v0

    .line 71
    :goto_1
    if-eqz v1, :cond_2

    .line 72
    .line 73
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 74
    .line 75
    const/16 v0, 0x42b0

    .line 76
    .line 77
    invoke-direct {p1, v0, v2, v2, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lj6/b;)V

    .line 78
    .line 79
    .line 80
    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadr;->zza(Lcom/google/android/gms/common/api/Status;)Lu7/h;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    return-object p1

    .line 89
    :cond_2
    new-instance v1, Lcom/google/firebase/auth/a;

    .line 90
    .line 91
    invoke-direct {v1, p0, v0, v2, p1}, Lcom/google/firebase/auth/a;-><init>(Lcom/google/firebase/auth/FirebaseAuth;ZLb8/r;Lb8/h;)V

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->m:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 95
    .line 96
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {v1, p0, v0, p1}, Lc8/i0;->a(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Lcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    return-object p1

    .line 103
    :cond_3
    instance-of v0, p1, Lb8/c0;

    .line 104
    .line 105
    if-eqz v0, :cond_4

    .line 106
    .line 107
    check-cast p1, Lb8/c0;

    .line 108
    .line 109
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabq;

    .line 110
    .line 111
    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lu7/f;

    .line 112
    .line 113
    iget-object v2, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 114
    .line 115
    new-instance v3, Lcom/google/firebase/auth/FirebaseAuth$d;

    .line 116
    .line 117
    invoke-direct {v3, p0}, Lcom/google/firebase/auth/FirebaseAuth$d;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v1, p1, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzabq;->zza(Lu7/f;Lb8/c0;Ljava/lang/String;Lc8/z0;)Lcom/google/android/gms/tasks/Task;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    return-object p1

    .line 125
    :cond_4
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabq;

    .line 126
    .line 127
    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lu7/f;

    .line 128
    .line 129
    iget-object v2, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 130
    .line 131
    new-instance v3, Lcom/google/firebase/auth/FirebaseAuth$d;

    .line 132
    .line 133
    invoke-direct {v3, p0}, Lcom/google/firebase/auth/FirebaseAuth$d;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v1, p1, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzabq;->zza(Lu7/f;Lb8/f;Ljava/lang/String;Lc8/z0;)Lcom/google/android/gms/tasks/Task;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    return-object p1
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
.end method

.method public final h(Lb8/f0;Ljava/lang/String;)Lb8/f0;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->g:Lc8/f;

    .line 2
    .line 3
    iget-object v1, v0, Lc8/f;->a:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lc8/f;->b:Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    new-instance p2, Lb8/i1;

    .line 25
    .line 26
    invoke-direct {p2, p0, p1}, Lb8/i1;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Lb8/f0;)V

    .line 27
    .line 28
    .line 29
    move-object p1, p2

    .line 30
    :cond_1
    return-object p1
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

.method public final i(Lb8/r;Lb8/f;)Lcom/google/android/gms/tasks/Task;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb8/r;",
            "Lb8/f;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lb8/g;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    instance-of v0, p2, Lb8/h;

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lb8/f;->F()Lb8/f;

    move-result-object p2

    check-cast p2, Lb8/h;

    new-instance v0, Lcom/google/firebase/auth/d;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/firebase/auth/d;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Lb8/r;Lb8/h;)V

    invoke-virtual {p1}, Lb8/r;->G()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/google/firebase/auth/FirebaseAuth;->o:Lcom/google/android/recaptcha/RecaptchaAction;

    invoke-virtual {v0, p0, p1, p2}, Lc8/i0;->a(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Lcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabq;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lu7/f;

    invoke-virtual {p2}, Lb8/f;->F()Lb8/f;

    move-result-object v3

    const/4 v4, 0x0

    new-instance v5, Lcom/google/firebase/auth/FirebaseAuth$c;

    invoke-direct {v5, p0}, Lcom/google/firebase/auth/FirebaseAuth$c;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    move-object v2, p1

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzabq;->zza(Lu7/f;Lb8/r;Lb8/f;Ljava/lang/String;Lc8/s0;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final j(Lb8/r;Z)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb8/r;",
            "Z)",
            "Lcom/google/android/gms/tasks/Task<",
            "Lb8/s;",
            ">;"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 4
    .line 5
    const/16 p2, 0x4457

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-direct {p1, p2, v0, v0, v0}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lj6/b;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadr;->zza(Lcom/google/android/gms/common/api/Status;)Lu7/h;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    invoke-virtual {p1}, Lb8/r;->O()Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzagw;->zzg()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    if-nez p2, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzagw;->zzc()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, Lc8/d0;->a(Ljava/lang/String;)Lb8/s;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_1
    iget-object p2, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabq;

    .line 46
    .line 47
    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lu7/f;

    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzagw;->zzd()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    new-instance v2, Lb8/p1;

    .line 54
    .line 55
    invoke-direct {v2, p0}, Lb8/p1;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, v1, p1, v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzabq;->zza(Lu7/f;Lb8/r;Ljava/lang/String;Lc8/s0;)Lcom/google/android/gms/tasks/Task;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1
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

.method public final k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb8/r;Z)Lcom/google/android/gms/tasks/Task;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lb8/r;",
            "Z)",
            "Lcom/google/android/gms/tasks/Task<",
            "Lb8/g;",
            ">;"
        }
    .end annotation

    new-instance v7, Lcom/google/firebase/auth/b;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move v3, p5

    move-object v4, p4

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Lcom/google/firebase/auth/b;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;ZLb8/r;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->n:Lcom/google/android/recaptcha/RecaptchaAction;

    invoke-virtual {v7, p0, p3, p1}, Lc8/i0;->a(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Lcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized p()Lc8/m0;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->l:Lc8/m0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final r(Lb8/r;Lb8/f;)Lcom/google/android/gms/tasks/Task;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb8/r;",
            "Lb8/f;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lb8/g;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lb8/f;->F()Lb8/f;

    .line 5
    .line 6
    .line 7
    move-result-object v3

    .line 8
    instance-of p2, v3, Lb8/h;

    .line 9
    .line 10
    if-eqz p2, :cond_3

    .line 11
    .line 12
    check-cast v3, Lb8/h;

    .line 13
    .line 14
    invoke-virtual {v3}, Lb8/h;->E()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const-string v0, "password"

    .line 19
    .line 20
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_0

    .line 25
    .line 26
    iget-object v5, v3, Lb8/h;->a:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v6, v3, Lb8/h;->b:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v6}, Lm6/j;->e(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lb8/r;->G()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    const/4 v9, 0x1

    .line 38
    move-object v4, p0

    .line 39
    move-object v8, p1

    .line 40
    invoke-virtual/range {v4 .. v9}, Lcom/google/firebase/auth/FirebaseAuth;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb8/r;Z)Lcom/google/android/gms/tasks/Task;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_0
    iget-object p2, v3, Lb8/h;->c:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {p2}, Lm6/j;->e(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    sget-object v0, Lb8/d;->d:Lcom/google/android/gms/internal/firebase-auth-api/zzan;

    .line 51
    .line 52
    invoke-static {p2}, Lm6/j;->e(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    :try_start_0
    new-instance v1, Lb8/d;

    .line 57
    .line 58
    invoke-direct {v1, p2}, Lb8/d;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catch_0
    move-object v1, v0

    .line 63
    :goto_0
    const/4 p2, 0x1

    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    iget-object v2, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v1, v1, Lb8/d;->c:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v2, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-nez v1, :cond_1

    .line 75
    .line 76
    move v1, p2

    .line 77
    goto :goto_1

    .line 78
    :cond_1
    const/4 v1, 0x0

    .line 79
    :goto_1
    if-eqz v1, :cond_2

    .line 80
    .line 81
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 82
    .line 83
    const/16 p2, 0x42b0

    .line 84
    .line 85
    invoke-direct {p1, p2, v0, v0, v0}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lj6/b;)V

    .line 86
    .line 87
    .line 88
    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadr;->zza(Lcom/google/android/gms/common/api/Status;)Lu7/h;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    return-object p1

    .line 97
    :cond_2
    new-instance v0, Lcom/google/firebase/auth/a;

    .line 98
    .line 99
    invoke-direct {v0, p0, p2, p1, v3}, Lcom/google/firebase/auth/a;-><init>(Lcom/google/firebase/auth/FirebaseAuth;ZLb8/r;Lb8/h;)V

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->m:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 103
    .line 104
    iget-object p2, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {v0, p0, p2, p1}, Lc8/i0;->a(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Lcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    return-object p1

    .line 111
    :cond_3
    instance-of p2, v3, Lb8/c0;

    .line 112
    .line 113
    if-eqz p2, :cond_4

    .line 114
    .line 115
    iget-object v4, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabq;

    .line 116
    .line 117
    iget-object v5, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lu7/f;

    .line 118
    .line 119
    move-object v7, v3

    .line 120
    check-cast v7, Lb8/c0;

    .line 121
    .line 122
    iget-object v8, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 123
    .line 124
    new-instance v9, Lcom/google/firebase/auth/FirebaseAuth$c;

    .line 125
    .line 126
    invoke-direct {v9, p0}, Lcom/google/firebase/auth/FirebaseAuth$c;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 127
    .line 128
    .line 129
    move-object v6, p1

    .line 130
    invoke-virtual/range {v4 .. v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzabq;->zzb(Lu7/f;Lb8/r;Lb8/c0;Ljava/lang/String;Lc8/s0;)Lcom/google/android/gms/tasks/Task;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    return-object p1

    .line 135
    :cond_4
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabq;

    .line 136
    .line 137
    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lu7/f;

    .line 138
    .line 139
    invoke-virtual {p1}, Lb8/r;->G()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    new-instance v5, Lcom/google/firebase/auth/FirebaseAuth$c;

    .line 144
    .line 145
    invoke-direct {v5, p0}, Lcom/google/firebase/auth/FirebaseAuth$c;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 146
    .line 147
    .line 148
    move-object v2, p1

    .line 149
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzabq;->zzc(Lu7/f;Lb8/r;Lb8/f;Ljava/lang/String;Lc8/s0;)Lcom/google/android/gms/tasks/Task;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    return-object p1
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
.end method

.method public final s()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->s:Lc8/n0;

    .line 2
    .line 3
    invoke-static {v0}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lb8/r;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v2, p0, Lcom/google/firebase/auth/FirebaseAuth;->s:Lc8/n0;

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    new-array v3, v3, [Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-virtual {v0}, Lb8/r;->a()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    aput-object v0, v3, v4

    .line 22
    .line 23
    const-string v0, "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"

    .line 24
    .line 25
    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v2, v2, Lc8/n0;->c:Landroid/content/SharedPreferences;

    .line 30
    .line 31
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-interface {v2, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 40
    .line 41
    .line 42
    iput-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lb8/r;

    .line 43
    .line 44
    :cond_0
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->s:Lc8/n0;

    .line 45
    .line 46
    iget-object v0, v0, Lc8/n0;->c:Landroid/content/SharedPreferences;

    .line 47
    .line 48
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v2, "com.google.firebase.auth.FIREBASE_USER"

    .line 53
    .line 54
    invoke-interface {v0, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 59
    .line 60
    .line 61
    invoke-static {p0, v1}, Lcom/google/firebase/auth/FirebaseAuth;->q(Lcom/google/firebase/auth/FirebaseAuth;Lb8/r;)V

    .line 62
    .line 63
    .line 64
    invoke-static {p0, v1}, Lcom/google/firebase/auth/FirebaseAuth;->m(Lcom/google/firebase/auth/FirebaseAuth;Lb8/r;)V

    .line 65
    .line 66
    .line 67
    return-void
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

.method public final t()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lu7/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu7/f;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, Lu7/f;->a:Landroid/content/Context;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadu;->zza(Landroid/content/Context;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
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
.end method
