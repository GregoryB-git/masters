.class public final Lc8/i;
.super Lb8/r;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lc8/i;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

.field public b:Lc8/e;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc8/e;",
            ">;"
        }
    .end annotation
.end field

.field public f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public o:Ljava/lang/String;

.field public p:Ljava/lang/Boolean;

.field public q:Lc8/k;

.field public r:Z

.field public s:Lb8/c1;

.field public t:Lc8/e0;

.field public u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lb8/t0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc8/h;

    invoke-direct {v0}, Lc8/h;-><init>()V

    sput-object v0, Lc8/i;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzagw;Lc8/e;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/Boolean;Lc8/k;ZLb8/c1;Lc8/e0;Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0}, Lb8/r;-><init>()V

    iput-object p1, p0, Lc8/i;->a:Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

    iput-object p2, p0, Lc8/i;->b:Lc8/e;

    iput-object p3, p0, Lc8/i;->c:Ljava/lang/String;

    iput-object p4, p0, Lc8/i;->d:Ljava/lang/String;

    iput-object p5, p0, Lc8/i;->e:Ljava/util/List;

    iput-object p6, p0, Lc8/i;->f:Ljava/util/List;

    iput-object p7, p0, Lc8/i;->o:Ljava/lang/String;

    iput-object p8, p0, Lc8/i;->p:Ljava/lang/Boolean;

    iput-object p9, p0, Lc8/i;->q:Lc8/k;

    iput-boolean p10, p0, Lc8/i;->r:Z

    iput-object p11, p0, Lc8/i;->s:Lb8/c1;

    iput-object p12, p0, Lc8/i;->t:Lc8/e0;

    iput-object p13, p0, Lc8/i;->u:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lu7/f;Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0}, Lb8/r;-><init>()V

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 1
    invoke-virtual {p1}, Lu7/f;->a()V

    iget-object p1, p1, Lu7/f;->b:Ljava/lang/String;

    .line 2
    iput-object p1, p0, Lc8/i;->c:Ljava/lang/String;

    const-string p1, "com.google.firebase.auth.internal.DefaultFirebaseUser"

    iput-object p1, p0, Lc8/i;->d:Ljava/lang/String;

    const-string p1, "2"

    iput-object p1, p0, Lc8/i;->o:Ljava/lang/String;

    invoke-virtual {p0, p2}, Lc8/i;->J(Ljava/util/List;)Lc8/i;

    return-void
.end method


# virtual methods
.method public final A()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc8/i;->b:Lc8/e;

    iget-object v0, v0, Lc8/e;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final D()Lc8/k;
    .locals 1

    iget-object v0, p0, Lc8/i;->q:Lc8/k;

    return-object v0
.end method

.method public final synthetic E()Lc8/l;
    .locals 1

    new-instance v0, Lc8/l;

    invoke-direct {v0, p0}, Lc8/l;-><init>(Lc8/i;)V

    return-object v0
.end method

.method public final F()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lb8/o0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lc8/i;->e:Ljava/util/List;

    return-object v0
.end method

.method public final G()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lc8/i;->a:Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzagw;->zzc()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lc8/i;->a:Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzagw;->zzc()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Lc8/d0;->a(Ljava/lang/String;)Lb8/s;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v0, v0, Lb8/s;->b:Ljava/util/Map;

    .line 23
    .line 24
    const-string v2, "firebase"

    .line 25
    .line 26
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/util/Map;

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    const-string v1, "tenant"

    .line 35
    .line 36
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Ljava/lang/String;

    .line 41
    .line 42
    move-object v1, v0

    .line 43
    :cond_0
    return-object v1
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

.method public final H()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lc8/i;->p:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_5

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lc8/i;->a:Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzagw;->zzc()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lc8/d0;->a(Ljava/lang/String;)Lb8/s;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v0, v0, Lb8/s;->b:Ljava/util/Map;

    .line 24
    .line 25
    const-string v1, "firebase"

    .line 26
    .line 27
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/util/Map;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    const-string v1, "sign_in_provider"

    .line 36
    .line 37
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Ljava/lang/String;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v0, 0x0

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const-string v0, ""

    .line 47
    .line 48
    :goto_0
    iget-object v1, p0, Lc8/i;->e:Ljava/util/List;

    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    const/4 v2, 0x1

    .line 55
    if-gt v1, v2, :cond_3

    .line 56
    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    const-string v1, "custom"

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_3

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    const/4 v2, 0x0

    .line 69
    :cond_4
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, Lc8/i;->p:Ljava/lang/Boolean;

    .line 74
    .line 75
    :cond_5
    iget-object v0, p0, Lc8/i;->p:Ljava/lang/Boolean;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    return v0
    .line 82
    .line 83
.end method

.method public final declared-synchronized J(Ljava/util/List;)Lc8/i;
    .locals 5

    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lc8/i;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lc8/i;->f:Ljava/util/List;

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb8/o0;

    invoke-interface {v2}, Lb8/o0;->q()Ljava/lang/String;

    move-result-object v3

    const-string v4, "firebase"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lc8/e;

    iput-object v3, p0, Lc8/i;->b:Lc8/e;

    goto :goto_1

    :cond_0
    iget-object v3, p0, Lc8/i;->f:Ljava/util/List;

    invoke-interface {v2}, Lb8/o0;->q()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    iget-object v3, p0, Lc8/i;->e:Ljava/util/List;

    check-cast v2, Lc8/e;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lc8/i;->b:Lc8/e;

    if-nez p1, :cond_2

    iget-object p1, p0, Lc8/i;->e:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc8/e;

    iput-object p1, p0, Lc8/i;->b:Lc8/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final K()Lu7/f;
    .locals 1

    iget-object v0, p0, Lc8/i;->c:Ljava/lang/String;

    invoke-static {v0}, Lu7/f;->f(Ljava/lang/String;)Lu7/f;

    move-result-object v0

    return-object v0
.end method

.method public final L(Lcom/google/android/gms/internal/firebase-auth-api/zzagw;)V
    .locals 0

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    iput-object p1, p0, Lc8/i;->a:Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

    return-void
.end method

.method public final synthetic M()Lc8/i;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lc8/i;->p:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final N(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lb8/t0;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    iput-object p1, p0, Lc8/i;->u:Ljava/util/List;

    return-void
.end method

.method public final O()Lcom/google/android/gms/internal/firebase-auth-api/zzagw;
    .locals 1

    iget-object v0, p0, Lc8/i;->a:Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

    return-object v0
.end method

.method public final P(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lb8/x;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_3

    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lb8/x;

    .line 35
    .line 36
    instance-of v3, v2, Lb8/h0;

    .line 37
    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    check-cast v2, Lb8/h0;

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    instance-of v3, v2, Lb8/l0;

    .line 47
    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    check-cast v2, Lb8/l0;

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    new-instance p1, Lc8/e0;

    .line 57
    .line 58
    invoke-direct {p1, v0, v1}, Lc8/e0;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_4
    :goto_1
    const/4 p1, 0x0

    .line 63
    :goto_2
    iput-object p1, p0, Lc8/i;->t:Lc8/e0;

    .line 64
    .line 65
    return-void
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

.method public final Q()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lb8/t0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lc8/i;->u:Ljava/util/List;

    return-object v0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc8/i;->b:Lc8/e;

    iget-object v0, v0, Lc8/e;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lc8/i;->b:Lc8/e;

    invoke-virtual {v0}, Lc8/e;->h()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final k()Z
    .locals 1

    iget-object v0, p0, Lc8/i;->b:Lc8/e;

    iget-boolean v0, v0, Lc8/e;->p:Z

    return v0
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc8/i;->b:Lc8/e;

    iget-object v0, v0, Lc8/e;->o:Ljava/lang/String;

    return-object v0
.end method

.method public final o()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc8/i;->b:Lc8/e;

    iget-object v0, v0, Lc8/e;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final q()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc8/i;->b:Lc8/e;

    iget-object v0, v0, Lc8/e;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {v0, p1}, Lb/z;->J(ILandroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lc8/i;->a:Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p1, v2, v1, p2, v3}, Lb/z;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lc8/i;->b:Lc8/e;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    invoke-static {p1, v2, v1, p2, v3}, Lb/z;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lc8/i;->c:Ljava/lang/String;

    .line 21
    .line 22
    const/4 v2, 0x3

    .line 23
    invoke-static {p1, v2, v1, v3}, Lb/z;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lc8/i;->d:Ljava/lang/String;

    .line 27
    .line 28
    const/4 v2, 0x4

    .line 29
    invoke-static {p1, v2, v1, v3}, Lb/z;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lc8/i;->e:Ljava/util/List;

    .line 33
    .line 34
    const/4 v2, 0x5

    .line 35
    invoke-static {p1, v2, v1, v3}, Lb/z;->I(Landroid/os/Parcel;ILjava/util/List;Z)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lc8/i;->f:Ljava/util/List;

    .line 39
    .line 40
    const/4 v2, 0x6

    .line 41
    invoke-static {p1, v2, v1}, Lb/z;->G(Landroid/os/Parcel;ILjava/util/List;)V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Lc8/i;->o:Ljava/lang/String;

    .line 45
    .line 46
    const/4 v2, 0x7

    .line 47
    invoke-static {p1, v2, v1, v3}, Lb/z;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lc8/i;->H()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const/16 v2, 0x8

    .line 59
    .line 60
    invoke-static {p1, v2, v1}, Lb/z;->u(Landroid/os/Parcel;ILjava/lang/Boolean;)V

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lc8/i;->q:Lc8/k;

    .line 64
    .line 65
    const/16 v2, 0x9

    .line 66
    .line 67
    invoke-static {p1, v2, v1, p2, v3}, Lb/z;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 68
    .line 69
    .line 70
    iget-boolean v1, p0, Lc8/i;->r:Z

    .line 71
    .line 72
    const/16 v2, 0xa

    .line 73
    .line 74
    invoke-static {p1, v2, v1}, Lb/z;->t(Landroid/os/Parcel;IZ)V

    .line 75
    .line 76
    .line 77
    iget-object v1, p0, Lc8/i;->s:Lb8/c1;

    .line 78
    .line 79
    const/16 v2, 0xb

    .line 80
    .line 81
    invoke-static {p1, v2, v1, p2, v3}, Lb/z;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, Lc8/i;->t:Lc8/e0;

    .line 85
    .line 86
    const/16 v2, 0xc

    .line 87
    .line 88
    invoke-static {p1, v2, v1, p2, v3}, Lb/z;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 89
    .line 90
    .line 91
    iget-object p2, p0, Lc8/i;->u:Ljava/util/List;

    .line 92
    .line 93
    const/16 v1, 0xd

    .line 94
    .line 95
    invoke-static {p1, v1, p2, v3}, Lb/z;->I(Landroid/os/Parcel;ILjava/util/List;Z)V

    .line 96
    .line 97
    .line 98
    invoke-static {v0, p1}, Lb/z;->L(ILandroid/os/Parcel;)V

    .line 99
    .line 100
    .line 101
    return-void
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

.method public final zzd()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lc8/i;->a:Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzagw;->zzc()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
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

.method public final zze()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc8/i;->a:Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzagw;->zzf()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzg()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lc8/i;->f:Ljava/util/List;

    return-object v0
.end method
