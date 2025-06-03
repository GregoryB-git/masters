.class public final Lcom/google/android/gms/internal/measurement/P0;
.super Lcom/google/android/gms/internal/measurement/J0$a;
.source "SourceFile"


# instance fields
.field public final synthetic s:Landroid/app/Activity;

.field public final synthetic t:Ljava/lang/String;

.field public final synthetic u:Ljava/lang/String;

.field public final synthetic v:Lcom/google/android/gms/internal/measurement/J0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/J0;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/P0;->v:Lcom/google/android/gms/internal/measurement/J0;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/P0;->s:Landroid/app/Activity;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/P0;->t:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/P0;->u:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/J0$a;-><init>(Lcom/google/android/gms/internal/measurement/J0;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/P0;->v:Lcom/google/android/gms/internal/measurement/J0;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/J0;->d(Lcom/google/android/gms/internal/measurement/J0;)Lcom/google/android/gms/internal/measurement/x0;

    move-result-object v0

    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/internal/measurement/x0;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/P0;->s:Landroid/app/Activity;

    invoke-static {v0}, LH2/b;->Z0(Ljava/lang/Object;)LH2/a;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/P0;->t:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/P0;->u:Ljava/lang/String;

    iget-wide v5, p0, Lcom/google/android/gms/internal/measurement/J0$a;->o:J

    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/measurement/x0;->setCurrentScreen(LH2/a;Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method
