.class public final Le7/b2;
.super Lr/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lr/f<",
        "Ljava/lang/String;",
        "Lcom/google/android/gms/internal/measurement/zzb;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Le7/w1;


# direct methods
.method public constructor <init>(Le7/w1;)V
    .locals 0

    iput-object p1, p0, Le7/b2;->a:Le7/w1;

    const/16 p1, 0x14

    invoke-direct {p0, p1}, Lr/f;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Le7/b2;->a:Le7/w1;

    .line 7
    .line 8
    invoke-virtual {v0}, Le7/h6;->p()V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Le7/w1;->H(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    iget-object v1, v0, Le7/w1;->q:Lr/b;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Lr/h;->containsKey(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    iget-object v1, v0, Le7/w1;->q:Lr/b;

    .line 31
    .line 32
    invoke-virtual {v1, p1, v2}, Lr/h;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    iget-object v1, v0, Le7/w1;->q:Lr/b;

    .line 39
    .line 40
    invoke-virtual {v1, p1, v2}, Lr/h;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzgc$zzd;

    .line 45
    .line 46
    invoke-virtual {v0, p1, v1}, Le7/w1;->y(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzgc$zzd;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {v0, p1}, Le7/w1;->L(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :goto_0
    iget-object v0, v0, Le7/w1;->s:Le7/b2;

    .line 54
    .line 55
    invoke-virtual {v0}, Lr/f;->snapshot()Ljava/util/Map;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    move-object v2, p1

    .line 64
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzb;

    .line 65
    .line 66
    :goto_1
    return-object v2
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
