.class public final synthetic Le7/m2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic a:Lcom/google/android/gms/measurement/internal/zzig;

.field public synthetic b:Le7/k6;

.field public synthetic c:Landroid/os/Bundle;

.field public synthetic d:Le7/p0;

.field public synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/zzig;Le7/k6;Landroid/os/Bundle;Le7/p0;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/m2;->a:Lcom/google/android/gms/measurement/internal/zzig;

    iput-object p2, p0, Le7/m2;->b:Le7/k6;

    iput-object p3, p0, Le7/m2;->c:Landroid/os/Bundle;

    iput-object p4, p0, Le7/m2;->d:Le7/p0;

    iput-object p5, p0, Le7/m2;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Le7/m2;->a:Lcom/google/android/gms/measurement/internal/zzig;

    iget-object v1, p0, Le7/m2;->b:Le7/k6;

    iget-object v2, p0, Le7/m2;->c:Landroid/os/Bundle;

    iget-object v3, p0, Le7/m2;->d:Le7/p0;

    iget-object v4, p0, Le7/m2;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/google/android/gms/measurement/internal/zzig;->zza(Lcom/google/android/gms/measurement/internal/zzig;Le7/k6;Landroid/os/Bundle;Le7/p0;Ljava/lang/String;)V

    return-void
.end method
