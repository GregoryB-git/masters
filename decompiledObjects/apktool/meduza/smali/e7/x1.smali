.class public final synthetic Le7/x1;
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

    iput-object p1, p0, Le7/x1;->a:Le7/w1;

    iput-object p2, p0, Le7/x1;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Le7/x1;->a:Le7/w1;

    iget-object v1, p0, Le7/x1;->b:Ljava/lang/String;

    new-instance v2, Lcom/google/android/gms/internal/measurement/zzx;

    new-instance v3, Le7/z1;

    const/4 v4, 0x0

    invoke-direct {v3, v1, v4, v0}, Le7/z1;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    const-string v0, "internal.appMetadata"

    invoke-direct {v2, v0, v3}, Lcom/google/android/gms/internal/measurement/zzx;-><init>(Ljava/lang/String;Ljava/util/concurrent/Callable;)V

    return-object v2
.end method
