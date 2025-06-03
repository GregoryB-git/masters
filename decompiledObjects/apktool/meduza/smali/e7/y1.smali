.class public final synthetic Le7/y1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public synthetic a:Le7/w1;

.field public synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Le7/w1;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/y1;->a:Le7/w1;

    iput-object p2, p0, Le7/y1;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Le7/y1;->a:Le7/w1;

    iget-object v1, p0, Le7/y1;->b:Ljava/lang/String;

    new-instance v2, Lcom/google/android/gms/internal/measurement/zzm;

    new-instance v3, Le7/d2;

    invoke-direct {v3, v0, v1}, Le7/d2;-><init>(Le7/w1;Ljava/lang/String;)V

    const-string v0, "internal.remoteConfig"

    invoke-direct {v2, v0, v3}, Lcom/google/android/gms/internal/measurement/zzm;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzo;)V

    return-object v2
.end method
